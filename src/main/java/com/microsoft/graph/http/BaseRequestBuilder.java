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

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.serializer.IJsonBackedObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A request builder.
 */
public abstract class BaseRequestBuilder implements IRequestBuilder {

    /**
     * The backing client for this request.
     */
    private final IBaseClient mClient;

    /**
     * The url for this request.
     */
    private final String mRequestUrl;

    /**
     * The options for this request.
     */
    private final List<Option> mOptions = new ArrayList<>();

    private final IJsonBackedObject mBody;

    /**
     * Creates the request builder.
     *
     * @param requestUrl The url to make the request against.
     * @param client     The client which can issue the request.
     * @param options    The options for this request.
     */
    public BaseRequestBuilder(
            final String requestUrl,
            final IBaseClient client,
            final List<Option> options
    ) {
        mRequestUrl = requestUrl;
        mClient = client;
        mBody = null;

        if (options != null) {
            mOptions.addAll(options);
        }
    }

    public BaseRequestBuilder(
            final String requestUrl,
            final IJsonBackedObject body,
            final IBaseClient client,
            final List<Option> options
    ) {
        mRequestUrl = requestUrl;
        mClient = client;
        mBody = body;

        if (options != null) {
            mOptions.addAll(options);
        }
    }

    /**
     * Gets the client.
     *
     * @return The client.
     */
    public IBaseClient getClient() {
        return mClient;
    }

    /**
     * Gets the request url.
     *
     * @return The request url.
     */
    public String getRequestUrl() {
        return mRequestUrl;
    }

    /**
     * Get the full list of options for this request.
     *
     * @return The full list of options for this request.
     */
    public List<Option> getOptions() {
        return Collections.unmodifiableList(mOptions);
    }

    /**
     * Gets the request url with an extra segment added to it.
     *
     * @param urlSegment The section to add.
     * @return The base url for this request.
     */
    public String getRequestUrlWithAdditionalSegment(final String urlSegment) {
        return mRequestUrl + "/" + urlSegment;
    }

    public String getRequestUrlWithAdditionalParameter(final String parameter) {
        return mRequestUrl + "('" + parameter + "')";
    }


}
