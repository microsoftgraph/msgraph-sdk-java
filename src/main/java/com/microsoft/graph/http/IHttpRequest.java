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

import com.microsoft.graph.concurrency.IProgressCallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.httpcore.middlewareoption.IShouldRedirect;
import com.microsoft.graph.httpcore.middlewareoption.IShouldRetry;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.options.Option;

import okhttp3.Request;

import java.net.URL;
import java.util.List;

/**
 * An HTTP request
 */
public interface IHttpRequest {

    /**
     * Gets the request URL
     * 
     * @return the request URL
     */
    URL getRequestUrl();

    /**
     * Gets the HTTP method
     * 
     * @return the HTTP method
     */
    HttpMethod getHttpMethod();

    /**
     * Gets the headers
     * 
     * @return the headers
     */
    List<HeaderOption> getHeaders();

    /**
     * Gets the options
     * 
     * @return the options
     */
    List<Option> getOptions();

    /**
     * Adds a header to this request
     * 
     * @param header the name of the header
     * @param value  the value of the header
     */
    void addHeader(String header, String value);

    /**
     * Sets useCaches parameter to cache the response
     * 
     * @param useCaches the value of useCaches
     */
    void setUseCaches(boolean useCaches);

    /**
     * Gets useCaches parameter
     * 
     * @return the value of useCaches
     */
    boolean getUseCaches();
    
    /**
     * Sets the max redirects
     * 
     * @param maxRedirects Max redirects that a request can take
     */
    void setMaxRedirects(int maxRedirects);
    
    /**
     * Gets the max redirects
     * 
     * @return Max redirects that a request can take
     */
    int getMaxRedirects();
    
    /**
     * Sets the should redirect callback
     * 
     * @param shouldRedirect Callback called before doing a redirect
     */
    void setShouldRedirect(IShouldRedirect shouldRedirect);
    
    /**
     * Gets the should redirect callback
     * 
     * @return Callback which is called before redirect
     */
    IShouldRedirect getShouldRedirect();
    
    /**
     * Sets the should retry callback
     * 
     * @param shouldretry The callback called before retry
     */
    void setShouldRetry(IShouldRetry shouldretry);
    
    /**
     * Gets the should retry callback
     * 
     * @return Callback called before retry
     */
    IShouldRetry getShouldRetry();
    
    /**
     * Sets the max retries
     * 
     * @param maxRetries Max retries for a request
     */
    void setMaxRetries(int maxRetries);
    
    /**
     * Gets max retries 
     * 
     * @return Max retries for a request
     */
    int getMaxRetries();
    
    /**
     * Sets the delay in seconds between retires
     * 
     * @param delay Delay in seconds between retries
     */
    void setDelay(long delay);
    
    /**
     * Gets delay between retries
     * 
     * @return Delay between retries in seconds
     */
    long getDelay();

    /**
     * Sets the HTTP method and returns the current request
     *
     * @param httpMethod the HTTP method
     * @return the current request
     */
    IHttpRequest withHttpMethod(final HttpMethod httpMethod);
    
    /**
     * Returns the Request object to be executed
     * @return the Request object to be executed
     */
    Request getHttpRequest() throws ClientException;

    /**
     * Returns the Request object to be executed
     * @param serializedObject the object to serialize at the body of the request
     * @param <requestBodyType> the type of the serialized object
     * @return the Request object to be executed
     */
    <requestBodyType> Request getHttpRequest(final requestBodyType serializedObject) throws ClientException;

    /**
     * Returns the Request object to be executed
     * @param serializedObject the object to serialize at the body of the request
     * @param progress the progress callback
     * @param <requestBodyType> the type of the serialized object
     * @param <responseType> the type of the response object
     * @return the Request object to be executed
     */
    <requestBodyType, responseType> Request getHttpRequest(final requestBodyType serializedObject, final IProgressCallback<responseType> progress) throws ClientException;
}

