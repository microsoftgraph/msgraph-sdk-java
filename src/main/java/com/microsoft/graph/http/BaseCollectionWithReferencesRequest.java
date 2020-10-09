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

/**
 * An HTTP request.
 * 
 * @param <T> the response class
 */
public abstract class BaseCollectionWithReferencesRequest<T,T2 extends BaseWithReferenceRequest<T>, 
                                        T3 extends BaseReferenceRequestBuilder<T, ? extends BaseReferenceRequest<T>>,
                                        T4 extends BaseWithReferenceRequestBuilder<T, T2, T3>,
                                        T5 extends ICollectionResponse<T>,
                                        T6 extends BaseCollectionRequest<T, T5>> extends BaseCollectionRequest<T, T5> {
    
    private Class<? extends BaseCollectionWithReferencesRequestBuilder<T, T2, T3, T4, T5, T6, BaseCollectionWithReferencesRequest<T, T2, T3, T4, T5, T6>>> collWithReferencesRequestBuilderClass;
    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseCollectionWithReferencesRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
                                                final Class<? extends T> responseClass,
                                                final Class<T5> collectionResponseClass,
                                                final Class<BaseCollectionPage<T>> collectionPageClass,
                                                final Class<? extends BaseCollectionWithReferencesRequestBuilder<T, T2, T3, T4, T5, T6, BaseCollectionWithReferencesRequest<T, T2, T3, T4, T5, T6>>> collectionWithReferencesRequestBuilderClass) {
        super(requestUrl, client, requestOptions, responseClass, collectionResponseClass, collectionPageClass);
        this.collWithReferencesRequestBuilderClass = collectionWithReferencesRequestBuilderClass;
    }

    public void get(final ICallback<? super BaseCollectionPage<T>> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public BaseCollectionPage<T> get() throws ClientException {
        final ICollectionResponse<T> response = send();
        return buildFromResponse(response);
    }

    @SuppressWarnings("unchecked")
    public BaseCollectionPage<T> buildFromResponse(final ICollectionResponse<T> response) {
        if (response.nextLink() != null) {
            final List<com.microsoft.graph.options.Option> options = new java.util.ArrayList<com.microsoft.graph.options.Option>();
            try {
                final Object builder = this.collWithReferencesRequestBuilderClass.getConstructor(response.nextLink().getClass(), getBaseRequest().getClient().getClass(), options.getClass())
                        .newInstance(response.nextLink(), getBaseRequest().getClient(), options);
                final BaseCollectionPage<T> page = new BaseCollectionPage<T>(response, (BaseCollectionWithReferencesRequestBuilder<T, T2, T3, T4, T5, T6, BaseCollectionWithReferencesRequest<T, T2, T3, T4, T5, T6>>)builder);
                page.setRawObject(response.getSerializer(), response.getRawObject());
                return page;
            } catch(IllegalArgumentException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
                return null;
            }
        } else {
            return null;
        }
    }
}
