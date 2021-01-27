// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.WorkbookTableRowCountRequest;
import com.microsoft.graph.models.WorkbookTableRow;

import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Row Count Request Builder.
 */
public class WorkbookTableRowCountRequestBuilder extends BaseFunctionRequestBuilder<Integer> {

    /**
     * The request builder for this WorkbookTableRowCount
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableRowCountRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the WorkbookTableRowCountRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookTableRowCountRequest instance
     */
    @Nonnull
    public WorkbookTableRowCountRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookTableRowCountRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookTableRowCountRequest instance
     */
    @Nonnull
    public WorkbookTableRowCountRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookTableRowCountRequest request = new WorkbookTableRowCountRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}