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

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IProgressCallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.httpcore.middlewareoption.IShouldRedirect;
import com.microsoft.graph.httpcore.middlewareoption.IShouldRetry;
import com.microsoft.graph.httpcore.middlewareoption.RedirectOptions;
import com.microsoft.graph.httpcore.middlewareoption.RetryOptions;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.options.Option;

import okhttp3.Request;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

/**
 * A request for a binary stream
 *
 * @param <T> the class of the response type
 */
public abstract class BaseStreamRequest<T> implements IHttpStreamRequest {

    /**
     * The base request for this collection request
     */
    private final BaseRequest<T> baseRequest;

    /**
     * Creates the stream request.
     *
     * @param requestUrl    the URL to make the request against
     * @param client        the client which can issue the request
     * @param options       the options for this request
     * @param responseClass the class for the response
     */
    public BaseStreamRequest(@Nonnull final String requestUrl,
                             @Nonnull final IBaseClient client,
                             @Nullable final List<? extends Option> options,
                             @Nonnull final Class<T> responseClass) {
        baseRequest = new BaseRequest<T>(requestUrl, client, options, responseClass) {
        };
    }

    /**
     * Sends this request
     *
     * @param callback the callback when this request complements. The caller needs to close the stream
     */
    protected void send(@Nonnull final ICallback<InputStream> callback) {
        baseRequest.setHttpMethod(HttpMethod.GET);
        baseRequest.getClient().getHttpProvider().send(this, callback, InputStream.class, null);
    }

    /**
     * Sends this request
     *
     * @return the stream that the caller needs to close
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    protected InputStream send() throws ClientException {
        baseRequest.setHttpMethod(HttpMethod.GET);
        return baseRequest.getClient().getHttpProvider().send(this, InputStream.class, null);
    }

    /**
     * Sends this request
     *
     * @param fileContents the file to upload
     * @param callback     the callback when this request complements. The caller needs to close the stream
     */
    @SuppressWarnings("unchecked")
    protected void send(@Nonnull final byte[] fileContents, @Nonnull final ICallback<? super T> callback) {
        baseRequest.setHttpMethod(HttpMethod.PUT);
        baseRequest.getClient().getHttpProvider().send(this, callback, (Class<T>) baseRequest.getResponseType(), fileContents);
    }

    /**
     * Sends this request
     *
     * @param fileContents the file to upload
     * @return             the stream that the caller needs to close
     */
    @Nullable
    protected T send(@Nonnull final byte[] fileContents) {
        baseRequest.setHttpMethod(HttpMethod.PUT);
        return (T) baseRequest.getClient().getHttpProvider().send(this, baseRequest.getResponseType(), fileContents);
    }

    /**
     * Gets the request URL
     *
     * @return the request URL
     */
    @Override
    @Nullable
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
     * Gets the query options for this request
     *
     * @return the query options for this request
     */
    @Override
    @Nullable
    public List<Option> getOptions() {
        return baseRequest.getOptions();
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
    public void setShouldRedirect(@Nonnull final IShouldRedirect shouldRedirect) {
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
    public void setShouldRetry(@Nonnull final IShouldRetry shouldretry) {
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
    	baseRequest.setMaxRetries(maxRetries);
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
    @Override
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
