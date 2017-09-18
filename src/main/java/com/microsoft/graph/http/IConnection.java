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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

/**
 * An http connection with a remote server.
 */
public interface IConnection {

    /**
     * Follow 3XX series redirects.
     *
     * @param followRedirects true to follow redirects, false otherwise.
     */
    void setFollowRedirects(final boolean followRedirects);

    /**
     * Adds a header to the connection (Must be done before reading/writing).
     *
     * @param headerName  The header name.
     * @param headerValue The header value.
     */
    void addRequestHeader(String headerName, String headerValue);

    /**
     * Gets the stream to write to the request.
     *
     * @return The output stream to write onto.
     * @throws IOException if something goes wrong while getting the stream.
     */
    OutputStream getOutputStream() throws IOException;

    /**
     * Gets the stream to read to the response.
     *
     * @return The input stream to read from.
     * @throws IOException if something goes wrong while getting the stream.
     */
    InputStream getInputStream() throws IOException;

    /**
     * Gets the response code for the request.
     *
     * @return The http status code.
     * @throws IOException if something goes wrong while getting the response code.
     */
    int getResponseCode() throws IOException;

    /**
     * Get the response message.
     *
     * @return The response message.
     * @throws IOException if something goes wrong while getting the response message.
     */
    String getResponseMessage() throws IOException;

    /**
     * Closes this connection, and all streams become inaccessible.
     */
    void close();

    /**
     * Gets the response headers for this connection.
     *
     * @return The map of headers.
     */
    Map<String, String> getHeaders();

    /**
     * Gets the http request method.
     *
     * @return The request method.
     */
    String getRequestMethod();

    /**
     * Returns the Content-Length.
     *
     * @return The content length.
     */
    int getContentLength();

    /**
     * Set the Content-Length header
     *
     * @param length the length of content
     */
    void setContentLength(final int length);
}
