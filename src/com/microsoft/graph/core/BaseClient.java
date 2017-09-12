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

package com.microsoft.graph.core;

import com.microsoft.graph.authentication.IAuthenticationProvider;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.http.IHttpProvider;
import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.serializer.ISerializer;

/**
 * A client that communications with an OData service.
 */
public abstract class BaseClient implements IBaseClient {

    /**
     * The auth provider instance.
     */
    private IAuthenticationProvider mAuthenticationProvider;

    /**
     * The executors instance.
     */
    private IExecutors mExecutors;

    /**
     * The http provider instance.
     */
    private IHttpProvider mHttpProvider;

    /**
     * The logger.
     */
    private ILogger mLogger;

    /**
     * The serializer instance.
     */
    private ISerializer mSerializer;

    /**
     * Gets the authentication provider.
     * @return The authentication provider.
     */
    @Override
    public IAuthenticationProvider getAuthenticationProvider() {
        return mAuthenticationProvider;
    }

    /**
     * Gets the service root.
     * @return The service root.
     */
    @Override
    public abstract String getServiceRoot();

    /**
     * Sets the service root.
     * @param value The service root
     */
    @Override
    public abstract void setServiceRoot(final String value);

    /**
     * Gets the executors.
     * @return The executors.
     */
    @Override
    public IExecutors getExecutors() {
        return mExecutors;
    }

    /**
     * Gets the http provider.
     * @return The http provider.
     */
    @Override
    public IHttpProvider getHttpProvider() {
        return mHttpProvider;
    }

    /**
     * Gets the logger.
     * @return The logger.
     */
    public ILogger getLogger() {
        return mLogger;
    }

    /**
     * Gets the serializer.
     * @return The serializer.
     */
    @Override
    public ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Validates this client.
     */
    @Override
    public void validate() {
        if (mAuthenticationProvider == null) {
            throw new NullPointerException("AuthenticationProvider");
        }

        if (mExecutors == null) {
            throw new NullPointerException("Executors");
        }

        if (mHttpProvider == null) {
            throw new NullPointerException("HttpProvider");
        }

        if (mSerializer == null) {
            throw new NullPointerException("Serializer");
        }
    }

    /**
     * Sets the logger.
     * @param logger The logger.
     */
    protected void setLogger(final ILogger logger) {
        mLogger = logger;
    }

    /**
     * Sets the executors.
     * @param executors The executors.
     */
    protected void setExecutors(final IExecutors executors) {
        mExecutors = executors;
    }

    /**
     * Sets the authentication provider.
     * @param authenticationProvider The authentication provider.
     */
    protected void setAuthenticationProvider(final IAuthenticationProvider authenticationProvider) {
        mAuthenticationProvider = authenticationProvider;
    }

    /**
     * Sets the http provider.
     * @param httpProvider The http provider.
     */
    protected void setHttpProvider(final IHttpProvider httpProvider) {
        mHttpProvider = httpProvider;
    }

    /**
     * Sets the serializer.
     * @param serializer The serializer.
     */
    public void setSerializer(final ISerializer serializer) {
        mSerializer = serializer;
    }
}
