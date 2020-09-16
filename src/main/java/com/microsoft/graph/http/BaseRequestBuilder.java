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

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

/**
 * A request builder
 */
public abstract class BaseRequestBuilder implements IRequestBuilder {

    /**
     * The backing client for this request.
     */
    private final IBaseClient client;

    /**
     * The URL for this request
     */
    private final String requestUrl;

    /**
     * The options for this request
     */
    private final List<Option> options = new ArrayList<>();

    /**
     * Creates the request builder
     *
     * @param requestUrl the URL to make the request against
     * @param client     the client which can issue the request
     * @param options    the options for this request
     */
    public BaseRequestBuilder(
            final String requestUrl,
            final IBaseClient client,
            final List<? extends Option> options
    ) {
        this.requestUrl = requestUrl;
        this.client = client;
        if (options != null) {
            this.options.addAll(options);
        }
    }

    /**
     * Gets the client
     *
     * @return the client
     */
    public IBaseClient getClient() {
        return client;
    }

    /**
     * Gets the request URL
     *
     * @return the request URL
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    /**
     * Get the full list of options for this request
     *
     * @param requestOptions the options for this request
     * @return the full list of options for this request
     */
    public List<? extends Option> getOptions(final Option... requestOptions) {
        return Collections.unmodifiableList(requestOptions != null && requestOptions.length > 0 ? 
                Arrays.asList(requestOptions) 
                : options);
    }

    /**
     * Gets the request URL with an extra segment added to it
     *
     * @param  urlSegment the section to add
     * @return the base URL for this request
     */
    public String getRequestUrlWithAdditionalSegment(final String urlSegment) {
        return requestUrl + "/" + urlSegment;
    }

    public String getRequestUrlWithAdditionalParameter(final String parameter) {
        return requestUrl + "('" + parameter + "')";
    }


}
