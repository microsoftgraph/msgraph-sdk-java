// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.http;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;

import java.util.ArrayList;
import java.util.List;

/**
 * The base method request builder class
 */
public class BaseFunctionCollectionRequestBuilder<T, T2 extends BaseRequestBuilder<T>,
                                                    T3 extends ICollectionResponse<T>,
                                                    T4 extends BaseCollectionPage<T>,
                                                    T5 extends BaseCollectionRequest<T, T3, T4>> extends BaseCollectionRequestBuilder<T, T2, T3, T4, T5> {

    /**
     * The {@link FunctionOption}s to add to this request
     */
    protected List<FunctionOption> functionOptions = new ArrayList<>();

    /**
     * Constructs a new {@link BaseFunctionCollectionRequestBuilder}
     *
     * @param requestUrl the URL for the request
     * @param client     the {@link IBaseClient} for handling requests
     * @param options    {@link List} of {@link Option}s to add to this request
     * @param requestBuilderClass the class for the request builder
     * @param responseCollectionClass the class for the collection response
     * @param collectionPageClass the class for the collection page
     * @param collectionRequestClass the class for the collection request
     */
    public BaseFunctionCollectionRequestBuilder(
            final String requestUrl,
            final IBaseClient client,
            final List<? extends Option> options,
            final Class<T2> requestBuilderClass,
            final Class<T3> responseCollectionClass,
            final Class<T4> collectionPageClass,
            final Class<T5> collectionRequestClass
    ) {
        super(requestUrl, client, options, requestBuilderClass, responseCollectionClass, collectionPageClass, collectionRequestClass);
    }

}
