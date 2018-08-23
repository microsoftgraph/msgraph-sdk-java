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

import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

import java.net.URL;
import java.util.List;

/**
 * A request against a collection
 *
 * @param <T> the type of the object in the collection 
 */
public abstract class BaseCollectionRequest<T> implements IHttpRequest {

    /**
     * The base request for this collection request
     */
    private final BaseRequest baseRequest;

    /**
     * The class for the response
     */
    private final Class<? extends ICollectionResponse<T>> responseClass;

    /**
     * The class for the collection page
     */
    private final Class<T2> collectionPageClass;


    /**
     * Create the collection request
     *
     * @param requestUrl          the URL to make the request against
     * @param client              the client which can issue the request
     * @param options             the options for this request
     * @param responseClass       the class for the response
     * @param collectionPageClass the class for the collection page
     */
    public BaseCollectionRequest(final String requestUrl,
                                 final IBaseClient client,
                                 final List<? extends Option> options,
                                 final Class<? extends ICollectionResponse<T>> responseClass,
                                 final Class<T2> collectionPageClass) {
        this.responseClass = responseClass;
        this.collectionPageClass = collectionPageClass;
        baseRequest = new BaseRequest(requestUrl, client, options, responseClass) {
        };
    }

    /**
     * Send this request
     *
     * @return the response object
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    protected ICollectionResponse<T> send() throws ClientException {
        baseRequest.setHttpMethod(HttpMethod.GET);
        return baseRequest.getClient().getHttpProvider().send(this, responseClass, /* serialization object */ null);
    }

    /**
     * Posts this request
     *
     * @param serializedObject the object to serialize as the body
     * @param <T1>             the type of the callback result
     * @param <T2>             the type of the serialized body
     * @return the response object
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    protected T1 post(final T serializedObject) throws ClientException {
        baseRequest.setHttpMethod(HttpMethod.POST);
        return (T1) baseRequest.getClient().getHttpProvider().send(this, responseClass, serializedObject);
    }

    /**
     * Gets the request URL
     *
     * @return the request URL
     */
    @Override
    public URL getRequestUrl() {
        return baseRequest.getRequestUrl();
    }

    /**
     * Gets the HTTP method
     *
     * @return the HTTP method
     */
    @Override
    public HttpMethod getHttpMethod() {
        return baseRequest.getHttpMethod();
    }

    /**
     * Gets the headers
     *
     * @return the headers
     */
    @Override
    public List<HeaderOption> getHeaders() {
        return baseRequest.getHeaders();
    }

    /**
     * Adds a header to this request
     *
     * @param header the name of the header
     * @param value  the value of the header
     */
    @Override
    public void addHeader(final String header, final String value) {
        baseRequest.addHeader(header, value);
    }

    /**
     * Sets useCaches parameter to cache the response
     *
     * @param useCaches the value of useCaches
     */
    @Override
    public void setUseCaches(boolean useCaches) {
        baseRequest.setUseCaches(useCaches);
    }

    /**
     * Gets useCaches parameter
     *
     * @return the value of useCaches
     */
    @Override
    public boolean getUseCaches() {
        return baseRequest.getUseCaches();
    }

    /**
     * Gets the full list of options for this request
     *
     * @return the full list of options for this request
     */
    public List<Option> getOptions() {
        return baseRequest.getOptions();
    }

    /**
     * Adds a query option
     *
     * @param option the query option to add
     */
    public void addQueryOption(final QueryOption option) {
        baseRequest.getQueryOptions().add(option);
    }

    /**
     * Adds a query option
     *
     * @param option the query option to add
     */
    public void addFunctionOption(final FunctionOption option) {
        baseRequest.getFunctionOptions().add(option);
    }

    /**
     * Gets the base request for this collection request
     *
     * @return the base request for this collection request
     */
    protected BaseRequest getBaseRequest() {
        return baseRequest;
    }

    /**
     * Gets the class for the collection page
     *
     * @return the class for the collection page
     */
    public Class<T2> getCollectionPageClass() {
        return collectionPageClass;
    }
}
