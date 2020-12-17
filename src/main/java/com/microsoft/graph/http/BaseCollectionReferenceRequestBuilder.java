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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * A request builder
 */
public class BaseCollectionReferenceRequestBuilder<T, T2 extends BaseRequestBuilder<T>,
                                                    T3 extends ICollectionResponse<T>,
                                                    T4 extends BaseCollectionPage<T, ? extends BaseRequestBuilder<T>>,
                                                    T5 extends BaseEntityCollectionRequest<T, T3, T4>> extends BaseCollectionRequestBuilder<T, T2, T3, T4, T5> {
    /**
     * The request builder for this collection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param requestBuilderClass the class for the request builder
     * @param collectionRequestClass the class for the collection request
     */
    public BaseCollectionReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
										@Nonnull final Class<T2> requestBuilderClass,
										@Nonnull final Class<T5> collectionRequestClass) {
        super(requestUrl, client, requestOptions, requestBuilderClass, collectionRequestClass);
    }
}
