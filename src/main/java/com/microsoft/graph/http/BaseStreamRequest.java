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

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.options.Option;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

/**
 * A request for a binary stream.
 *
 * @param <T> The class of the response type.
 */
public abstract class BaseStreamRequest<T> implements IHttpStreamRequest {

    /**
     * The base request for this collection request.
     */
    private final BaseRequest mBaseRequest;

    /**
     * Creates the stream request.
     *
     * @param requestUrl    The url to make the request against.
     * @param client        The client which can issue the request.
     * @param options       The options for this request.
     * @param responseClass The class for the response.
     */
    public BaseStreamRequest(final String requestUrl,
                             final IBaseClient client,
                             final List<Option> options,
                             final Class<T> responseClass) {
        mBaseRequest = new BaseRequest(requestUrl, client, options, responseClass) {
        };
    }

    /**
     * Sends this request.
     *
     * @param callback The callback when this request complements. The caller needs to close the stream.
     */
    protected void send(final ICallback<InputStream> callback) {
        mBaseRequest.setHttpMethod(HttpMethod.GET);
        mBaseRequest.getClient().getHttpProvider().send(this, callback, InputStream.class, null);
    }

    /**
     * Sends this request.
     *
     * @return The stream that the caller needs to close.
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    protected InputStream send() throws ClientException {
        mBaseRequest.setHttpMethod(HttpMethod.GET);
        return mBaseRequest.getClient().getHttpProvider().send(this, InputStream.class, null);
    }

    /**
     * Sends this request.
     *
     * @param fileContents The file to upload.
     * @param callback     The callback when this request complements. The caller needs to close the stream.
     */
    @SuppressWarnings("unchecked")
    protected void send(final byte[] fileContents, final ICallback<T> callback) {
        mBaseRequest.setHttpMethod(HttpMethod.PUT);
        mBaseRequest.getClient().getHttpProvider().send(this, callback, mBaseRequest.getResponseType(), fileContents);
    }

    /**
     * Sends this request.
     *
     * @param fileContents The file to upload.
     * @return The stream that the caller needs to close.
     */
    @SuppressWarnings("unchecked")
    protected T send(final byte[] fileContents) {
        mBaseRequest.setHttpMethod(HttpMethod.PUT);
        return (T) mBaseRequest.getClient().getHttpProvider().send(this, mBaseRequest.getResponseType(), fileContents);
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
     * Gets the headers.
     *
     * @return The headers.
     */
    @Override
    public List<HeaderOption> getHeaders() {
        return mBaseRequest.getHeaders();
    }

    /**
     * Gets the query options for this request.
     *
     * @return The query options for this request.
     */
    @Override
    public List<Option> getOptions() {
        return mBaseRequest.getOptions();
    }
}
