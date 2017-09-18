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

import java.util.List;

/**
 * An unexpected exception from the Graph service.
 */
public class GraphFatalServiceException extends GraphServiceException {

    /**
     * The website to report issues on this sdk.
     */
    public static final String SDK_BUG_URL = "https://github.com/microsoftgraph/msgraph-sdk-android/issues";

    /**
     * Create a fatal Graph service exception.
     * @param method The method that caused the exception.
     * @param url The url.
     * @param requestHeaders The request headers.
     * @param requestBody The request body.
     * @param responseCode The response code.
     * @param responseMessage The response message.
     * @param responseHeaders The response headers.
     * @param error The error response if available.
     */
    protected GraphFatalServiceException(final String method,
                                         final String url,
                                         final List<String> requestHeaders,
                                         final String requestBody,
                                         final int responseCode,
                                         final String responseMessage,
                                         final List<String> responseHeaders,
                                         final GraphErrorResponse error) {
        super(method, url, requestHeaders, requestBody, responseCode, responseMessage, responseHeaders, error);
    }

    @Override
    public String getMessage(final boolean verbose) {
        //noinspection StringBufferReplaceableByString
        final StringBuilder sb = new StringBuilder();
        sb.append("[This is an unexpected error from Graph, please report this at ")
                .append(SDK_BUG_URL)
                .append(']')
                .append(NEW_LINE)
                .append(super.getMessage(true));
        return sb.toString();
    }
}
