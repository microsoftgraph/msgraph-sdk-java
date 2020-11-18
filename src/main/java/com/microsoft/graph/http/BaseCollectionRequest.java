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

import java.net.URL;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.concurrency.IProgressCallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.httpcore.middlewareoption.IShouldRedirect;
import com.microsoft.graph.httpcore.middlewareoption.IShouldRetry;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

import okhttp3.Request;

/**
 * A request against a collection
 *
 * @param <T1> the raw response class returned by the service
 * @param <T2> the class of the collection page
 */
public abstract class BaseCollectionRequest<T1, T2> implements IHttpRequest {

    /**
     * The base request for this collection request
     */
    private final BaseRequest baseRequest;

    /**
     * The class for the response
     */
    private final Class<T1> responseClass;

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
    public BaseCollectionRequest(@Nonnull final String requestUrl,
                                 @Nonnull final IBaseClient client,
                                 @Nullable final List<? extends Option> options,
                                 @Nonnull final Class<T1> responseClass,
                                 @Nonnull final Class<T2> collectionPageClass) {
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
    @Nullable
    protected T1 send() throws ClientException {
        baseRequest.setHttpMethod(HttpMethod.GET);
        return baseRequest.getClient().getHttpProvider().send(this, responseClass, /* serialization object */ null);
    }

    /**
     * Posts this request
     *
     * @param serializedObject the object to serialize as the body
     * @param <BodyType>       the type of the serialized body, some times Action use different body than collection item
     * @return the response object
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    protected <BodyType> T1 post(@Nonnull final BodyType serializedObject) throws ClientException {
        baseRequest.setHttpMethod(HttpMethod.POST);
        return (T1) baseRequest.getClient().getHttpProvider().send(this, responseClass, serializedObject);
    }

    /**
     * Gets the request URL
     *
     * @return the request URL
     */
    @Override
    @Nonnull
    public URL getRequestUrl() {
        return baseRequest.getRequestUrl();
    }

    /**
     * Gets the HTTP method
     *
     * @return the HTTP method
     */
    @Override
    @Nullable
    public HttpMethod getHttpMethod() {
        return baseRequest.getHttpMethod();
    }

    /**
     * Gets the headers
     *
     * @return the headers
     */
    @Override
    @Nullable
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
    public void addHeader(@Nonnull final String header, @Nonnull final String value) {
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
    @Nullable
    public List<Option> getOptions() {
        return baseRequest.getOptions();
    }

    /**
     * Adds a query option
     *
     * @param option the query option to add
     */
    public void addQueryOption(@Nonnull final QueryOption option) {
        baseRequest.getQueryOptions().add(option);
    }

    /**
     * Adds a query option
     *
     * @param option the query option to add
     */
    public void addFunctionOption(@Nonnull final FunctionOption option) {
        baseRequest.getFunctionOptions().add(option);
    }

    /**
     * Gets the base request for this collection request
     *
     * @return the base request for this collection request
     */
    @Nonnull
    protected BaseRequest getBaseRequest() {
        return baseRequest;
    }

    /**
     * Gets the class for the collection page
     *
     * @return the class for the collection page
     */
    @Nonnull
    public Class<T2> getCollectionPageClass() {
        return collectionPageClass;
    }
    
    /**
     * Sets the max redirects
     * 
     * @param maxRedirects Max redirects that a request can take
     */
    public void setMaxRedirects(int maxRedirects) {
    	baseRequest.setMaxRedirects(maxRedirects);
    }
    
    /**
     * Gets the max redirects
     * 
     * @return Max redirects that a request can take
     */
    public int getMaxRedirects() {
    	return baseRequest.getMaxRedirects();
    }
    
    /**
     * Sets the should redirect callback
     * 
     * @param shouldRedirect Callback called before doing a redirect
     */
    public void setShouldRedirect(@Nonnull IShouldRedirect shouldRedirect) {
    	baseRequest.setShouldRedirect(shouldRedirect);
    }
    
    /**
     * Gets the should redirect callback
     * 
     * @return Callback which is called before redirect
     */
    @Nullable
    public IShouldRedirect getShouldRedirect() {
    	return baseRequest.getShouldRedirect();
    }
    
    /**
     * Sets the should retry callback
     * 
     * @param shouldretry The callback called before retry
     */
    public void setShouldRetry(@Nonnull IShouldRetry shouldretry) {
    	baseRequest.setShouldRetry(shouldretry);
    }
    
    /**
     * Gets the should retry callback
     * 
     * @return Callback called before retry
     */
    @Nullable
    public IShouldRetry getShouldRetry() {
    	return baseRequest.getShouldRetry();
    }
    
    /**
     * Sets the max retries
     * 
     * @param maxRetries Max retries for a request
     */
    public void setMaxRetries(int maxRetries) {
    	baseRequest.setMaxRedirects(maxRetries);
    }
    
    /**
     * Gets max retries 
     * 
     * @return Max retries for a request
     */
    public int getMaxRetries() {
    	return baseRequest.getMaxRetries();
    }
    
    /**
     * Sets the delay in seconds between retires
     * 
     * @param delay Delay in seconds between retries
     */
    public void setDelay(long delay) {
    	baseRequest.setDelay(delay);
    }
    
    /**
     * Gets delay between retries
     * 
     * @return Delay between retries in seconds
     */
    public long getDelay() {
    	return baseRequest.getDelay();
    }

    /**
     * Sets the HTTP method and returns the current request
     *
     * @param httpMethod the HTTP method
     * @return the current request
     */
    @Nullable
    public IHttpRequest withHttpMethod(@Nonnull final HttpMethod httpMethod) {
        baseRequest.setHttpMethod(httpMethod);
        return this;
    }
    /**
     * Returns the Request object to be executed
     * @return the Request object to be executed
     */
    @Override
    @Nullable
    public Request getHttpRequest() throws ClientException {
        return baseRequest.getHttpRequest();
    }

    /**
     * Returns the Request object to be executed
     * @param serializedObject the object to serialize at the body of the request
     * @param <requestBodyType> the type of the serialized object
     * @return the Request object to be executed
     */
    @Override
    @Nullable
    public <requestBodyType> Request getHttpRequest(@Nonnull final requestBodyType serializedObject) throws ClientException {
        return baseRequest.getHttpRequest(serializedObject);
    }

    /**
     * Returns the Request object to be executed
     * @param serializedObject the object to serialize at the body of the request
     * @param progress the progress callback
     * @param <requestBodyType> the type of the serialized object
     * @param <responseType> the type of the response object
     * @return the Request object to be executed
     */
    @Override
    @Nullable
    public <requestBodyType, responseType> Request getHttpRequest(@Nonnull final requestBodyType serializedObject, @Nonnull final IProgressCallback<responseType> progress) throws ClientException {
        return baseRequest.getHttpRequest(serializedObject, progress);
    }
}
