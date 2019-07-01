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

public interface IConnectionConfig {

	/**
     * Gets the connect timeout
     *
     * @return the timeout in milliseconds
     */
    int getConnectTimeout();
    
    /**
     * Sets the connect timeout
     * 
     * @param connectTimeoutValue Connect timeout in milliseconds to be set to.
     */
    void setConnectTimeout(int connectTimeoutValue);
    
    /**
     * Gets the read timeout
     *
     * @return the timeout in milliseconds
     */
    int getReadTimeout();
    
    /**
     * Sets the connect timeout
     * 
     * @param readTimeoutValue Read timeout in milliseconds to be set to.
     */
    void setReadTimeout(int readTimeoutValue);
    
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
    
}
