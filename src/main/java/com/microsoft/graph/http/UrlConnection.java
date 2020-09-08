// ------------------------------------------------------------------------------
// Copyright (c) 2017 Microsoft Corporation
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.http;

import com.microsoft.graph.options.HeaderOption;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Wrapper around HttpUrlConnection for testability
 */
public class UrlConnection implements IConnection {

    /**
     * The backing HTTP URL connection instance
     */
    private final HttpURLConnection connection;

    /**
     * The response header cache
     */
    private HashMap<String, String> headers;

    /**
     * Creates a new UrlConnection
     *
     * @param request      the IHttpRequest to create the connection from
     * @throws IOException an exception occurs if there was a problem creating the connection
     */
    public UrlConnection(final IHttpRequest request) throws IOException {
        connection = (HttpURLConnection) request.getRequestUrl().openConnection();

        for (final HeaderOption header : request.getHeaders()) {
            connection.addRequestProperty(header.getName(), header.getValue().toString());
        }

        connection.setUseCaches(request.getUseCaches());

        try {
            connection.setRequestMethod(request.getHttpMethod().toString());
        } catch (final ProtocolException ignored) {
            // Some HTTP verbs are not supported by older HTTP implementations, use method override as an alternative
            connection.setRequestMethod(HttpMethod.POST.toString());
            connection.addRequestProperty("X-HTTP-Method-Override", request.getHttpMethod().toString());
            connection.addRequestProperty("X-HTTP-Method", request.getHttpMethod().toString());
        }
    }

    @Override
    public void setFollowRedirects(final boolean followRedirects) {
        connection.setInstanceFollowRedirects(followRedirects);
    }

    @Override
    public void addRequestHeader(final String headerName, final String headerValue) {
        connection.addRequestProperty(headerName, headerValue);
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        connection.setDoOutput(true);
        return connection.getOutputStream();
    }

    @Override
    public InputStream getInputStream() throws IOException {
        final int httpClientErrorResponseCode = 400;
        if (connection.getResponseCode() >= httpClientErrorResponseCode) {
            return connection.getErrorStream();
        } else {
            return connection.getInputStream();
        }
    }

    @Override
    public int getContentLength() {
        return connection.getContentLength();
    }

    @Override
    public int getResponseCode() throws IOException {
        return connection.getResponseCode();
    }
    
    public Map<String, List<String>> getResponseHeaders() {
    	// Copy unmodifiable map to hashmap
    	HashMap<String, List<String>> headerFields = new HashMap<>();
    	headerFields.putAll(connection.getHeaderFields());
    	
    	// Add the response code
    	List<String> list = new ArrayList<>();
    	try {
			list.add(String.format("%d", connection.getResponseCode()));
		} catch (IOException e) {
			throw new IllegalArgumentException("Invalid connection response code: could not connect to server", e);
		}
    
    	headerFields.put("responseCode", list);
    	return headerFields;
    }

    @Override
    public String getResponseMessage() throws IOException {
        return connection.getResponseMessage();
    }

    @Override
    public void close() {
        connection.disconnect();
    }

    @Override
    public Map<String, String> getHeaders() {
        if (headers == null) {
            headers = getResponseHeaders(connection);
        }
        return headers;
    }

    @Override
    public String getRequestMethod() {
        return connection.getRequestMethod();
    }

    @Override
    public void setContentLength(final int length) {
        connection.setFixedLengthStreamingMode(length);
    }
    
    @Override
    public void setReadTimeout(final int readTimeoutMilliseconds) {
        connection.setReadTimeout(readTimeoutMilliseconds);
    }

    @Override
    public void setConnectTimeout(final int connectTimeoutMilliseconds) {
        connection.setConnectTimeout(connectTimeoutMilliseconds);
    }

    /**
     * Gets the response headers from an HTTP URL connection
     *
     * @param connection the HTTP connection
     * @return           the set of headers names and value
     */
    private static HashMap<String, String> getResponseHeaders(final HttpURLConnection connection) {
        final HashMap<String, String> headers = new HashMap<>();
        int index = 0;
        while (true) {
            final String headerName = connection.getHeaderFieldKey(index);
            final String headerValue = connection.getHeaderField(index);
            if (headerName == null && headerValue == null) {
                break;
            }
            headers.put(headerName, headerValue);
            index++;
        }

        return headers;
    }
}
