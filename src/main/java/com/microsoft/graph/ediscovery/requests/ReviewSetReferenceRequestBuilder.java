
// Template Source: BaseEntityReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.ediscovery.models.ReviewSet;
import com.microsoft.graph.ediscovery.models.SourceCollection;
import com.microsoft.graph.ediscovery.models.AdditionalDataOptions;
import java.util.EnumSet;
import com.microsoft.graph.ediscovery.models.ExportOptions;
import com.microsoft.graph.ediscovery.models.ExportFileStructure;
import com.microsoft.graph.ediscovery.requests.ReviewSetQueryCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.ReviewSetQueryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Review Set Reference Request Builder.
 */
public class ReviewSetReferenceRequestBuilder extends BaseReferenceRequestBuilder<ReviewSet, ReviewSetReferenceRequest> {

    /**
     * The request builder for the ReviewSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReviewSetReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReviewSetReferenceRequest.class);
    }
}