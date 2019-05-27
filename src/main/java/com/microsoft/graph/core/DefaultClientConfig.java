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
import com.microsoft.graph.concurrency.DefaultExecutors;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.http.CoreHttpProvider;
import com.microsoft.graph.http.IHttpProvider;
import com.microsoft.graph.logger.DefaultLogger;
import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.serializer.DefaultSerializer;
import com.microsoft.graph.serializer.ISerializer;

/**
 * The default configuration for a service client
 */
public abstract class DefaultClientConfig implements IClientConfig {

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
    private DefaultSerializer serializer;

    /**
     * Creates an instance of this configuration with an authentication provider
     *
     * @param authenticationProvider the authentication provider
     * @return the IClientConfig
     */
    public static IClientConfig createWithAuthenticationProvider(
            final IAuthenticationProvider authenticationProvider
    ) {
        DefaultClientConfig config = new DefaultClientConfig() {

            @Override
            public IAuthenticationProvider getAuthenticationProvider() {
                return authenticationProvider;
            }
        };
        config.getLogger()
              .logDebug(
                        "Using provided auth provider "
                                + authenticationProvider
                                .getClass()
                                .getSimpleName()
                );
        return config;
    }

    /**
     * Gets the authentication provider
     *
     * @return the authentication provider
     */
    @Override
    public abstract IAuthenticationProvider getAuthenticationProvider();
    /**
     * Gets the HTTP provider
     *
     * @return the HTTP provider
     */
    @Override
    public IHttpProvider getHttpProvider() {
        if (httpProvider == null) {
            httpProvider = new CoreHttpProvider(getSerializer(),
                    getAuthenticationProvider(),
                    getExecutors(),
                    getLogger());
            getLogger().logDebug("Created CoreHttpProvider");
        }
        return httpProvider;
    }

    /**
     * Gets the serializer
     *
     * @return the serializer
     */
    @Override
    public ISerializer getSerializer() {
        if (serializer == null) {
            serializer = new DefaultSerializer(getLogger());
            getLogger().logDebug("Created DefaultSerializer");
        }
        return serializer;
    }

    /**
     * Gets the executors
     *
     * @return the executors
     */
    @Override
    public IExecutors getExecutors() {
        if (executors == null) {
            executors = new DefaultExecutors(getLogger());
            getLogger().logDebug("Created DefaultExecutors");
        }
        return executors;
    }

    /**
     * Gets the logger
     *
     * @return the logger
     */
    public ILogger getLogger() {
        if (logger == null) {
            logger = new DefaultLogger();
            logger.logDebug("Created DefaultLogger");
        }
        return logger;
    }
}
