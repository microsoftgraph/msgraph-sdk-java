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
import com.microsoft.graph.concurrency.DefaultExecutors;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.http.DefaultHttpProvider;
import com.microsoft.graph.http.IHttpProvider;
import com.microsoft.graph.logger.DefaultLogger;
import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.serializer.DefaultSerializer;
import com.microsoft.graph.serializer.ISerializer;

/**
 * The default configuration for a service client.
 */
public abstract class DefaultClientConfig implements IClientConfig {

    /**
     * The authentication provider instance.
     */
    private IAuthenticationProvider mAuthenticationProvider;

    /**
     * The executors instance.
     */
    private IExecutors mExecutors;

    /**
     * The http provider instance.
     */
    private DefaultHttpProvider mHttpProvider;

    /**
     * The logger.
     */
    private ILogger mLogger;

    /**
     * The serializer instance.
     */
    private DefaultSerializer mSerializer;

    /**
     * Creates an instance of this config with an auth provider.
     *
     * @param authenticationProvider The authentication provider.
     * @return The IClientConfig.
     */
    public static IClientConfig createWithAuthenticationProvider(
            final IAuthenticationProvider authenticationProvider
    ) {
        DefaultClientConfig config = new DefaultClientConfig() {
        };
        config.mAuthenticationProvider = authenticationProvider;
        config
                .getLogger()
                .logDebug(
                        "Using provided auth provider "
                                + authenticationProvider
                                .getClass()
                                .getSimpleName()
                );
        return config;
    }

    /**
     * Gets the authentication provider.
     *
     * @return The authentication provider.
     */
    @Override
    public IAuthenticationProvider getAuthenticationProvider() {
        return mAuthenticationProvider;
    }

    /**
     * Gets the http provider.
     *
     * @return The http provider.
     */
    @Override
    public IHttpProvider getHttpProvider() {
        if (mHttpProvider == null) {
            mHttpProvider = new DefaultHttpProvider(getSerializer(),
                    getAuthenticationProvider(),
                    getExecutors(),
                    getLogger());
            mLogger.logDebug("Created DefaultHttpProvider");
        }
        return mHttpProvider;
    }

    /**
     * Gets the serializer.
     *
     * @return The serializer.
     */
    @Override
    public ISerializer getSerializer() {
        if (mSerializer == null) {
            mSerializer = new DefaultSerializer(getLogger());
            mLogger.logDebug("Created DefaultSerializer");
        }
        return mSerializer;
    }

    /**
     * Gets the executors.
     *
     * @return The executors.
     */
    @Override
    public IExecutors getExecutors() {
        if (mExecutors == null) {
            mExecutors = new DefaultExecutors(getLogger());
            mLogger.logDebug("Created DefaultExecutors");
        }
        return mExecutors;
    }

    /**
     * Gets the logger.
     *
     * @return The logger.
     */
    public ILogger getLogger() {
        if (mLogger == null) {
            mLogger = new DefaultLogger();
            mLogger.logDebug("Created DefaultLogger");
        }
        return mLogger;
    }
}
