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

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.http.IHttpProvider;
import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.serializer.ISerializer;

/**
 * A client that communications with an OData service
 */
public interface IBaseClient {
    /**
     * Gets the service root
     * 
     * @return the service root
     */
    @Nonnull
    String getServiceRoot();

    /**
     * Sets the service root
     * 
     * @param value the service root
     */
    void setServiceRoot(@Nonnull final String value);

    /**
     * Gets the executors
     * 
     * @return the executors
     */
    @Nullable
    IExecutors getExecutors();

    /**
     * Gets the HTTP provider
     * 
     * @return the HTTP provider
     */
    @Nullable
    IHttpProvider getHttpProvider();

    /**
     * Gets the logger
     * 
     * @return the logger
     */
    @Nullable
    ILogger getLogger();

    /**
     * Gets the serializer
     * 
     * @return the serializer
     */
    @Nullable
    ISerializer getSerializer();

    /**
     * Validates this client
     */
    void validate();
    
    /**
     * Shuts down the executors.
     */
    void shutdown();
}
