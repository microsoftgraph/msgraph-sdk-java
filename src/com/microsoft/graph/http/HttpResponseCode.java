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

/**
 * The http code for http request.
 */
public final class  HttpResponseCode {

    /**
     * Deprecate the constructor.
     */
    private HttpResponseCode() { }

    /**
     * Http response code OK.
     */
    public static final int HTTP_OK = 200;

    /**
     * Http response code for created.
     */
    public static final int HTTP_CREATED = 201;

    /**
     * Http response code for accepted.
     */
    public static final int HTTP_ACCEPTED = 202;

    /**
     * Http response code for nobody.
     */
    public static final int HTTP_NOBODY = 204;

    /**
     * Http response code for see other.
     */
    public static final int HTTP_SEE_OTHER = 303;

    /**
     * Http response code for not modified.
     */
    public static final int HTTP_NOT_MODIFIED = 304;

    /**
     * Http response code for error response.
     */
    public static final int HTTP_CLIENT_ERROR = 400;
}
