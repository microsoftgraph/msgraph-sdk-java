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
import com.microsoft.graph.options.Option;

import java.net.URL;
import java.util.List;

/**
 * An http request.
 */
public interface IHttpRequest {

    /**
     * Gets the request url.
     * @return The request url.
     */
    URL getRequestUrl();

    /**
     * Gets the http method.
     * @return The http method.
     */
    HttpMethod getHttpMethod();

    /**
     * Gets the headers.
     * @return The headers.
     */
    List<HeaderOption> getHeaders();

    /**
     * Gets the options.
     * @return The options.
     */
    List<Option> getOptions();

    /**
     * Adds a header to this request.
     * @param header The name of the header.
     * @param value The value of the header.
     */
    void addHeader(String header, String value);

    /**
     * Sets useCaches parameter to cache the response.
     * @param useCaches The value of useCaches.
     */
    void setUseCaches(boolean useCaches);

    /**
     * Gets useCaches parameter.
     * @return The value of useCaches.
     */
    boolean getUseCaches();
}

