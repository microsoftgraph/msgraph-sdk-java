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

/**
 * The HTTP code for the HTTP request
 */
public final class  HttpResponseCode {

    /**
     * HTTP response code OK
     */
    public static final int HTTP_OK = 200;

    /**
     * HTTP response code for created
     */
    public static final int HTTP_CREATED = 201;

    /**
     * HTTP response code for accepted
     */
    public static final int HTTP_ACCEPTED = 202;

    /**
     * HTTP response code for no body
     */
    public static final int HTTP_NOBODY = 204;

    /**
     * HTTP response code for see other
     */
    public static final int HTTP_SEE_OTHER = 303;

    /**
     * HTTP response code for not modified
     */
    public static final int HTTP_NOT_MODIFIED = 304;

    /**
     * HTTP response code for error response
     */
    public static final int HTTP_CLIENT_ERROR = 400;
}
