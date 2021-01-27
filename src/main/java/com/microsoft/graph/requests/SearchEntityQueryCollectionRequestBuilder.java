// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SearchRequest;
import com.microsoft.graph.models.SearchResponse;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.SearchEntityQueryCollectionRequestBuilder;
import com.microsoft.graph.requests.SearchEntityQueryCollectionRequest;
import com.microsoft.graph.requests.SearchEntityQueryCollectionResponse;
import com.microsoft.graph.models.SearchEntityQueryParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Search Entity Query Collection Request Builder.
 */
public class SearchEntityQueryCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<SearchResponse, SearchEntityQueryCollectionRequestBuilder, SearchEntityQueryCollectionResponse, SearchEntityQueryCollectionPage, SearchEntityQueryCollectionRequest> {

    private SearchEntityQueryParameterSet body;
    /**
     * The request builder for this collection of SearchEntity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public SearchEntityQueryCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final SearchEntityQueryParameterSet parameters) {
        super(requestUrl, client, requestOptions, SearchEntityQueryCollectionRequestBuilder.class, SearchEntityQueryCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SearchEntityQueryCollectionRequest instance
     */
    @Override
    @Nonnull
    public SearchEntityQueryCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final SearchEntityQueryCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}