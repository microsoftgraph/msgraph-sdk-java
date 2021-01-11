// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.http;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * The base method request builder class used for POST actions
 */
public class BaseActionCollectionRequestBuilder<T, T2 extends BaseRequestBuilder<T>,
                                                T3 extends ICollectionResponse<T>,
                                                T4 extends BaseCollectionPage<T, ? extends BaseRequestBuilder<T>>,
                                                T5 extends BaseCollectionRequest<T, T3, T4>> extends BaseCollectionRequestBuilder<T, T2, T3, T4, T5> {

    /**
     * Constructs a new {@link BaseActionCollectionRequestBuilder}
     *
     * @param requestUrl the URL for the request
     * @param client     the {@link IBaseClient} for handling requests
     * @param options    {@link List} of {@link Option}s to add to this request
     * @param requestBuilderClass the class for the request builder
     * @param collectionRequestClass the class for the collection request
     */
    public BaseActionCollectionRequestBuilder(
            @Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final List<? extends Option> options,
            @Nonnull final Class<T2> requestBuilderClass,
            @Nonnull final Class<T5> collectionRequestClass
    ) {
        super(requestUrl, client, options, requestBuilderClass, collectionRequestClass);
    }
}
