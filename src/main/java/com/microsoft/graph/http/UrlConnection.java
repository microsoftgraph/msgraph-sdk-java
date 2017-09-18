// ------------------------------------------------------------------------------
// Copyright (c) 2015 Microsoft Corporation
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
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
import java.util.HashMap;
import java.util.Map;

/**
 * Wrapper around HttpUrlConnection for testability
 */
public class UrlConnection implements IConnection {

    /**
     * The backing http url connection instance.
     */
    private final HttpURLConnection mConnection;

    /**
     * The response header cache.
     */
    private HashMap<String, String> mHeaders;

    /**
     * Creates a new UrlConnection.
     *
     * @param request The IHttpRequest to create the connection from.
     * @throws IOException An exception occurs if there was a problem creating the connection.
     */
    public UrlConnection(final IHttpRequest request) throws IOException {
        mConnection = (HttpURLConnection) request.getRequestUrl().openConnection();

        for (final HeaderOption header : request.getHeaders()) {
            mConnection.addRequestProperty(header.getName(), header.getValue().toString());
        }

        mConnection.setUseCaches(request.getUseCaches());

        try {
            mConnection.setRequestMethod(request.getHttpMethod().toString());
        } catch (final ProtocolException ignored) {
            // Some HTTP verbs are not supported by older http implementations, use method override as an alternative
            mConnection.setRequestMethod(HttpMethod.POST.toString());
            mConnection.addRequestProperty("X-HTTP-Method-Override", request.getHttpMethod().toString());
            mConnection.addRequestProperty("X-HTTP-Method", request.getHttpMethod().toString());
        }
    }

    @Override
    public void setFollowRedirects(final boolean followRedirects) {
        mConnection.setInstanceFollowRedirects(followRedirects);
    }

    @Override
    public void addRequestHeader(final String headerName, final String headerValue) {
        mConnection.addRequestProperty(headerName, headerValue);
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        mConnection.setDoOutput(true);
        return mConnection.getOutputStream();
    }

    @Override
    public InputStream getInputStream() throws IOException {
        final int httpClientErrorResponseCode = 400;
        if (mConnection.getResponseCode() >= httpClientErrorResponseCode) {
            return mConnection.getErrorStream();
        } else {
            return mConnection.getInputStream();
        }
    }

    @Override
    public int getContentLength() {
        return mConnection.getContentLength();
    }

    @Override
    public int getResponseCode() throws IOException {
        return mConnection.getResponseCode();
    }

    @Override
    public String getResponseMessage() throws IOException {
        return mConnection.getResponseMessage();
    }

    @Override
    public void close() {
        mConnection.disconnect();
    }

    @Override
    public Map<String, String> getHeaders() {
        if (mHeaders == null) {
            mHeaders = getResponseHeaders(mConnection);
        }
        return mHeaders;
    }

    @Override
    public String getRequestMethod() {
        return mConnection.getRequestMethod();
    }

    @Override
    public void setContentLength(final int length) {
        mConnection.setFixedLengthStreamingMode(length);
    }

    /**
     * Gets the response headers from a http url connection.
     *
     * @param connection The http connection.
     * @return The set of headers names and value.
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
