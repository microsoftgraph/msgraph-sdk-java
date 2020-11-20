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

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

/**
 * A request builder
 */
public abstract class BaseWithReferenceRequestBuilder<T, T2 extends BaseWithReferenceRequest<T>,
                    T3 extends BaseReferenceRequestBuilder<T, ? extends BaseReferenceRequest<T>>> extends BaseRequestBuilder<T> {

    private Class<T2> wReferenceRequestClass;
    private Class<T3> refRequestBuilderClass;

    /**
     * The request builder for the User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param withReferenceRequestClass the class for the request
     * @param referenceRequestBuilderClass the class for the request builder
     */
    public BaseWithReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
                                            @Nonnull final Class<T2> withReferenceRequestClass,
                                            @Nonnull final Class<T3> referenceRequestBuilderClass) {
        super(requestUrl, client, requestOptions);
        this.wReferenceRequestClass = withReferenceRequestClass;
        this.refRequestBuilderClass = referenceRequestBuilderClass;
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ReferenceRequest instance
     */
    @Nullable
    public T2 buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the ReferenceRequest instance
     */
    @Nullable
    public T2 buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        try {
            return wReferenceRequestClass.getConstructor(String.class, IBaseClient.class, java.util.List.class)
                                .newInstance(getRequestUrl(), getClient(), requestOptions);
        } catch (IllegalArgumentException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
            return null;
		}
    }

    /**
     * Creates a request builder to get the reference to the entity
     * 
     * @return the request builder
     */
    @Nullable
    public T3 reference(){
        try {
            return refRequestBuilderClass.getConstructor(String.class, IBaseClient.class, java.util.List.class)
                                .newInstance(getRequestUrl() + "/$ref", getClient(), getOptions());
        } catch (IllegalArgumentException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
            return null;
		}
    }
}
