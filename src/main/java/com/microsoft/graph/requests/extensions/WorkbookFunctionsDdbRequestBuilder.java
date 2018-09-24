// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsDdbRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Ddb Request Builder.
 */
public class WorkbookFunctionsDdbRequestBuilder extends BaseWorkbookFunctionsDdbRequestBuilder implements IWorkbookFunctionsDdbRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDdb
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param cost the cost
     * @param salvage the salvage
     * @param life the life
     * @param period the period
     * @param factor the factor
     */
    public WorkbookFunctionsDdbRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement cost, final com.google.gson.JsonElement salvage, final com.google.gson.JsonElement life, final com.google.gson.JsonElement period, final com.google.gson.JsonElement factor) {
        super(requestUrl, client, requestOptions, cost, salvage, life, period, factor);
    }
}
