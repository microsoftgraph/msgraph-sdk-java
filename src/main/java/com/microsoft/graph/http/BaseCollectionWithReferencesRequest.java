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

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.options.Option;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

/**
 * An HTTP request.
 *
 * @param <T> the response class
 */
public abstract class BaseCollectionWithReferencesRequest<T,T2 extends BaseWithReferenceRequest<T>,
                                        T3 extends BaseReferenceRequestBuilder<T, ? extends BaseReferenceRequest<T>>,
                                        T4 extends BaseWithReferenceRequestBuilder<T, T2, T3>,
                                        T5 extends ICollectionResponse<T>,
                                        T6 extends BaseCollectionPage<T, ? extends BaseRequestBuilder<T>>,
                                        T7 extends BaseEntityCollectionRequest<T, T5, T6>> extends BaseEntityCollectionRequest<T, T5, T6> {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param collectionResponseClass the class for the collection response
     * @param collectionPageClass the class for the collection page
     * @param collectionWithReferencesRequestBuilderClass the class for the request builder
     */
    public BaseCollectionWithReferencesRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
                                                @Nonnull final Class<T5> collectionResponseClass,
                                                @Nonnull final Class<T6> collectionPageClass,
                                                @Nonnull final Class<? extends BaseCollectionWithReferencesRequestBuilder<T, T2, T3, T4, T5, T6, ? extends BaseCollectionWithReferencesRequest<T, T2, T3, T4, T5, T6, T7>, ? extends BaseCollectionReferenceRequestBuilder<T, T3, T5, T6, ? extends BaseCollectionWithReferencesRequest<T, T2, T3, T4, T5, T6, T7>>>> collectionWithReferencesRequestBuilderClass) {
        super(requestUrl, client, requestOptions, collectionResponseClass, collectionPageClass, collectionWithReferencesRequestBuilderClass);
    }
}
