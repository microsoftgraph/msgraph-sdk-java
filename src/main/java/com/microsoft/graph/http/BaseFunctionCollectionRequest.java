// ------------------------------------------------------------------------------
// Copyright (c) 2020 Microsoft Corporation
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

import java.net.URL;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.concurrency.IProgressCallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.ICollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.options.Option;

/**
 * A request against a collection bound function
 *
 * @param <T> the type of the object in the collection
 * @param <T2> the response collection type
 * @param <T3> the collection page type
 */
public abstract class BaseFunctionCollectionRequest<T, T2 extends ICollectionResponse<T>,
                                            T3 extends BaseCollectionPage<T, ? extends BaseRequestBuilder<T>>> extends BaseCollectionRequest<T, T2, T3> {


    /**
     * Create the collection request
     *
     * @param requestUrl          the URL to make the request against
     * @param client              the client which can issue the request
     * @param options             the options for this request
     * @param responseCollectionClass       the class for the response collection
     * @param collectionPageClass the class for the collection page
     * @param collectionRequestBuilderClass the class for the collection request builder
     */
    public BaseFunctionCollectionRequest(@Nonnull final String requestUrl,
                                 @Nonnull final IBaseClient client,
                                 @Nullable final List<? extends Option> options,
                                 @Nonnull final Class<T2> responseCollectionClass,
                                 @Nonnull final Class<T3> collectionPageClass,
                                 @Nonnull final Class<? extends BaseCollectionRequestBuilder<T, ? extends BaseRequestBuilder<T>, T2, T3, ? extends BaseCollectionRequest<T, T2, T3>>> collectionRequestBuilderClass) {
        super(requestUrl, client, options, responseCollectionClass, collectionPageClass, collectionRequestBuilderClass);
    }

    /**
     * Gets the collection of items
     * @param callback the callback to call once the response is received
     */
    public void get(@Nonnull final ICallback<? super T3> callback) {
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

    /**
     * Gets the collection of items
     *
     * @return the collection page
     */
    @Nullable
    public T3 get() throws ClientException {
        return buildFromResponse(send());
    }
}
