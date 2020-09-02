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

package com.microsoft.graph.core;

import com.microsoft.graph.httpcore.middlewareoption.IShouldRedirect;
import com.microsoft.graph.httpcore.middlewareoption.IShouldRetry;
import com.microsoft.graph.httpcore.middlewareoption.RedirectOptions;
import com.microsoft.graph.httpcore.middlewareoption.RetryOptions;

public class DefaultConnectionConfig implements IConnectionConfig{
	
    /**
     * Default connect timeout
     */
    private static int DEFAULT_CONNECT_TIMEOUT_MS = 30_000;
    
    /**
     * Default connection read timeout
     */
    private static int DEFAULT_READ_TIMEOUT_MS = 30_000;
    
    /**
     * MaxRedirects of every request
     */
    private static int maxRedirects = RedirectOptions.DEFAULT_MAX_REDIRECTS;
    
    /**
     * ShouldRedirect callback for every request
     */
    private static IShouldRedirect shouldRedirect = RedirectOptions.DEFAULT_SHOULD_REDIRECT;
    
    /**
     * Max redirects for every request
     */
    private static int maxRetries = RetryOptions.DEFAULT_MAX_RETRIES;
    
    /**
     * Delay in seconds for every request
     */
    private static long delay = RetryOptions.DEFAULT_DELAY;
    
    /**
     * Callback called when doing a retry
     */
    private static IShouldRetry shouldRetry = RetryOptions.DEFAULT_SHOULD_RETRY;
    
    /**
     * Gets the connect timeout
     *
     * @return the timeout in milliseconds
     */
    @Override
    public int getConnectTimeout() {
        return DEFAULT_CONNECT_TIMEOUT_MS;
    }
    
    /**
     * Sets the connect timeout
     * 
     * @param connectTimeoutValue Connect timeout in milliseconds to be set to.
     */
    @Override
    public void setConnectTimeout(int connectTimeoutValue) {
        DEFAULT_CONNECT_TIMEOUT_MS = connectTimeoutValue;
    }
    
    /**
     * Gets the read timeout
     *
     * @return the timeout in milliseconds
     */
    @Override
    public int getReadTimeout() {
        return DEFAULT_READ_TIMEOUT_MS;
    }
    
    /**
     * Sets the connect timeout
     * 
     * @param readTimeoutValue Read timeout in milliseconds to be set to.
     */
    @Override
    public void setReadTimeout(int readTimeoutValue) {
    	DEFAULT_READ_TIMEOUT_MS = readTimeoutValue;
    }
    
    /**
     * Sets the max redirects
     * 
     * @param maxRedirects Max redirects that a request can take
     */
    public void setMaxRedirects(int maxRedirects) {
    	this.maxRedirects = maxRedirects;
    }
    
    /**
     * Gets the max redirects
     * 
     * @return Max redirects that a request can take
     */
    public int getMaxRedirects() {
    	return maxRedirects;
    }
    
    /**
     * Sets the should redirect callback
     * 
     * @param shouldRedirect Callback called before doing a redirect
     */
    public void setShouldRedirect(IShouldRedirect shouldRedirect) {
    	this.shouldRedirect = shouldRedirect;
    }
    
    /**
     * Gets the should redirect callback
     * 
     * @return Callback which is called before redirect
     */
    public IShouldRedirect getShouldRedirect() {
    	return shouldRedirect;
    }
    
    /**
     * Sets the should retry callback
     * 
     * @param shouldretry The callback called before retry
     */
    public void setShouldRetry(IShouldRetry shouldretry) {
    	this.shouldRetry = shouldretry;
    }
    
    /**
     * Gets the should retry callback
     * 
     * @return Callback called before retry
     */
    public IShouldRetry getShouldRetry() {
    	return shouldRetry;
    }
    
    /**
     * Sets the max retries
     * 
     * @param maxRetries Max retries for a request
     */
    public void setMaxRetries(int maxRetries) {
    	this.maxRetries = maxRetries;
    }
    
    /**
     * Gets max retries 
     * 
     * @return Max retries for a request
     */
    public int getMaxRetries() {
    	return maxRetries;
    }
    
    /**
     * Sets the delay in seconds between retires
     * 
     * @param delay Delay in seconds between retries
     */
    public void setDelay(long delay) {
    	this.delay = delay;
    }
    
    /**
     * Gets delay between retries
     * 
     * @return Delay between retries in seconds
     */
    public long getDelay() {
    	return delay;
    }

}
