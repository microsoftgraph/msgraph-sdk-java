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

import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

import java.net.URL;
import java.util.List;

/**
 * A request against a collection.
 *
 * @param <T1> The raw response class returned by the service.
 * @param <T2> The class of the collection page.
 */
public abstract class BaseCollectionRequest<T1, T2> implements IHttpRequest {

    /**
     * The base request for this collection request.
     */
    private final BaseRequest mBaseRequest;

    /**
     * The class for the response.
     */
    private final Class<T1> mResponseClass;

    /**
     * The class for the collection page.
     */
    private final Class<T2> mCollectionPageClass;


    /**
     * Create the collection request.
     *
     * @param requestUrl          The url to make the request against.
     * @param client              The client which can issue the request.
     * @param options             The options for this request.
     * @param responseClass       The class for the response.
     * @param collectionPageClass The class for the collection page.
     */
    public BaseCollectionRequest(final String requestUrl,
                                 final IBaseClient client,
                                 final List<Option> options,
                                 final Class<T1> responseClass,
                                 final Class<T2> collectionPageClass) {
        mResponseClass = responseClass;
        mCollectionPageClass = collectionPageClass;
        mBaseRequest = new BaseRequest(requestUrl, client, options, mResponseClass) {
        };
    }

    /**
     * Send this request.
     *
     * @return The response object.
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    @SuppressWarnings("unchecked")
    protected T1 send() throws ClientException {
        mBaseRequest.setHttpMethod(HttpMethod.GET);
        return mBaseRequest.getClient().getHttpProvider().send(this, mResponseClass, /* serialization object */ null);
    }

    /**
     * Posts this request.
     *
     * @param serializedObject The object to serialize as the body.
     * @param <T1>             The type of the callback result.
     * @param <T2>             The type of the serialized body.
     * @return The response object.
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    @SuppressWarnings("unchecked")
    protected <T1, T2> T1 post(final T2 serializedObject) throws ClientException {
        mBaseRequest.setHttpMethod(HttpMethod.POST);
        return (T1) mBaseRequest.getClient().getHttpProvider().send(this, mResponseClass, serializedObject);
    }

    /**
     * Gets the request url.
     *
     * @return The request url.
     */
    @Override
    public URL getRequestUrl() {
        return mBaseRequest.getRequestUrl();
    }

    /**
     * Gets the http method.
     *
     * @return The http method.
     */
    @Override
    public HttpMethod getHttpMethod() {
        return mBaseRequest.getHttpMethod();
    }

    /**
     * Gets the headers.
     *
     * @return The headers.
     */
    @Override
    public List<HeaderOption> getHeaders() {
        return mBaseRequest.getHeaders();
    }

    /**
     * Adds a header to this request.
     *
     * @param header The name of the header.
     * @param value  The value of the header.
     */
    @Override
    public void addHeader(final String header, final String value) {
        mBaseRequest.addHeader(header, value);
    }

    /**
     * Sets useCaches parameter to cache the response.
     *
     * @param useCaches The value of useCaches.
     */
    @Override
    public void setUseCaches(boolean useCaches) {
        mBaseRequest.setUseCaches(useCaches);
    }

    /**
     * Gets useCaches parameter.
     *
     * @return The value of useCaches.
     */
    @Override
    public boolean getUseCaches() {
        return mBaseRequest.getUseCaches();
    }

    /**
     * Gets the full list of options for this request.
     *
     * @return The full list of options for this request.
     */
    public List<Option> getOptions() {
        return mBaseRequest.getOptions();
    }

    /**
     * Adds a query option.
     *
     * @param option The query option to add.
     */
    public void addQueryOption(final QueryOption option) {
        mBaseRequest.getQueryOptions().add(option);
    }

    /**
     * Adds a query option.
     *
     * @param option The query option to add.
     */
    public void addFunctionOption(final FunctionOption option) {
        mBaseRequest.getFunctionOptions().add(option);
    }

    /**
     * Gets the base request for this collection request.
     *
     * @return The base request for this collection request.
     */
    protected BaseRequest getBaseRequest() {
        return mBaseRequest;
    }

    /**
     * Gets the class for the collection page.
     *
     * @return The class for the collection page.
     */
    public Class<T2> getCollectionPageClass() {
        return mCollectionPageClass;
    }
}
