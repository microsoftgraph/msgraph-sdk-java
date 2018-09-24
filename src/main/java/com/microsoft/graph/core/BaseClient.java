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

import com.microsoft.graph.authentication.IAuthenticationProvider;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.http.IHttpProvider;
import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.serializer.ISerializer;

/**
 * A client that communications with an OData service
 */
public abstract class BaseClient implements IBaseClient {

    /**
     * The authentication provider instance
     */
    private IAuthenticationProvider authenticationProvider;

    /**
     * The executors instance
     */
    private IExecutors executors;

    /**
     * The HTTP provider instance
     */
    private IHttpProvider httpProvider;

    /**
     * The logger
     */
    private ILogger logger;

    /**
     * The serializer instance
     */
    private ISerializer serializer;

    /**
     * Gets the authentication provider
     * 
     * @return The authentication provider
     */
    @Override
    public IAuthenticationProvider getAuthenticationProvider() {
        return authenticationProvider;
    }

    /**
     * Gets the executors
     * 
     * @return The executors
     */
    @Override
    public IExecutors getExecutors() {
        return executors;
    }

    /**
     * Gets the HTTP provider
     * 
     * @return The HTTP provider
     */
    @Override
    public IHttpProvider getHttpProvider() {
        return httpProvider;
    }

    /**
     * Gets the logger
     * 
     * @return The logger
     */
    public ILogger getLogger() {
        return logger;
    }

    /**
     * Gets the serializer
     * 
     * @return The serializer
     */
    @Override
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Validates this client
     */
    @Override
    public void validate() {
        if (authenticationProvider == null) {
            throw new NullPointerException("AuthenticationProvider");
        }

        if (executors == null) {
            throw new NullPointerException("Executors");
        }

        if (httpProvider == null) {
            throw new NullPointerException("HttpProvider");
        }

        if (serializer == null) {
            throw new NullPointerException("Serializer");
        }
    }

    /**
     * Sets the logger
     * 
     * @param logger The logger
     */
    protected void setLogger(final ILogger logger) {
        this.logger = logger;
    }

    /**
     * Sets the executors
     * 
     * @param executors The executors
     */
    protected void setExecutors(final IExecutors executors) {
        this.executors = executors;
    }

    /**
     * Sets the authentication provider
     * 
     * @param authenticationProvider The authentication provider
     */
    protected void setAuthenticationProvider(final IAuthenticationProvider authenticationProvider) {
        this.authenticationProvider = authenticationProvider;
    }

    /**
     * Sets the HTTP provider
     * 
     * @param httpProvider The HTTP provider
     */
    protected void setHttpProvider(final IHttpProvider httpProvider) {
        this.httpProvider = httpProvider;
    }

    /**
     * Sets the serializer
     * 
     * @param serializer The serializer
     */
    public void setSerializer(final ISerializer serializer) {
        this.serializer = serializer;
    }
    
    public void shutdown() {
    	this.executors.shutdownBackgroundExecutors();
    }
}
