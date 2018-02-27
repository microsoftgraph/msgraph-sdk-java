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

import java.util.List;

/**
 * An unexpected exception from the Graph service
 */
public class GraphFatalServiceException extends GraphServiceException {

    private static final long serialVersionUID = -4974392424026672738L;

    /**
     * Create a fatal Graph service exception
     * 
     * @param method          the method that caused the exception
     * @param url             the URL
     * @param requestHeaders  the request headers
     * @param requestBody     the request body
     * @param responseCode    the response code
     * @param responseMessage the response message
     * @param responseHeaders the response headers
     * @param error           the error response if available
     * @param verbose         whether or not to log verbosely
     */
    protected GraphFatalServiceException(final String method,
                                         final String url,
                                         final List<String> requestHeaders,
                                         final String requestBody,
                                         final int responseCode,
                                         final String responseMessage,
                                         final List<String> responseHeaders,
                                         final GraphErrorResponse error,
                                         final boolean verbose) {
        super(method, url, requestHeaders, requestBody, responseCode, responseMessage, responseHeaders, error, verbose);
    }

    @Override
    public String getMessage(final boolean verbose) {
        //no inspection StringBufferReplaceableByString
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected exception returned from the service.")
                .append(super.getMessage(verbose));
        return sb.toString();
    }
}
