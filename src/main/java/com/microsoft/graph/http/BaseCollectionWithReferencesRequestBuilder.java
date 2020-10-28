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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.lang.reflect.InvocationTargetException;

/**
 * A request builder
 */
public abstract class BaseCollectionWithReferencesRequestBuilder<T, T2 extends BaseWithReferenceRequest<T>, 
                            T3 extends BaseReferenceRequestBuilder<T, ? extends BaseReferenceRequest<T>>,
                            T4 extends BaseWithReferenceRequestBuilder<T, T2, T3>,
                            T5 extends ICollectionResponse<T>,
                            T6 extends BaseCollectionPage<T, ? extends BaseRequestBuilder<T>>,
                            T7 extends BaseCollectionWithReferencesRequest<T, T2, T3, T4, T5, T6, ? extends BaseCollectionRequest<T, T5, T6>>,
                            T8 extends BaseCollectionReferenceRequestBuilder<T, T3, T5, T6, T7>> extends BaseCollectionRequestBuilder<T, T3, T5, T6, T7> {
    private final Class<T3> refRequestBuilderClass;
    private final Class<T7> collRequestClass;
    private final Class<T8> collWithRefRequestBuilderClass;
    /**
     * The request builder for this collection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param referenceRequestBuilderClass the class for the request builder
     * @param collectionWithReferencesRequestClass the class for the collection request
     */
    public BaseCollectionWithReferencesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
                                                    final Class<T3> referenceRequestBuilderClass,
                                                    final Class<T7> collectionWithReferencesRequestClass,
                                                    final Class<T8> collectionWithReferenceRequestBuilderClass) {
        super(requestUrl, client, requestOptions, referenceRequestBuilderClass, collectionWithReferencesRequestClass);
        this.refRequestBuilderClass = referenceRequestBuilderClass;
        this.collRequestClass = collectionWithReferencesRequestClass;
        this.collWithRefRequestBuilderClass = collectionWithReferenceRequestBuilderClass;
    }

    /**
     * Gets a request builder to get the references to this collection
     * 
     * @return a request builder to get the references to this collection
     */
    public T8 references() {
        try {
            return this.collWithRefRequestBuilderClass
                    .getConstructor(String.class, IBaseClient.class, java.util.List.class, Class.class, Class.class)
                    .newInstance(getRequestUrl() + "/$ref", getClient(), getOptions(), refRequestBuilderClass, collRequestClass);
        } catch(IllegalArgumentException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
            return null;
        }
    }
}
