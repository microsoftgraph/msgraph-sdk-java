// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsVdbRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Vdb Request Builder.
 */
public class WorkbookFunctionsVdbRequestBuilder extends BaseWorkbookFunctionsVdbRequestBuilder implements IWorkbookFunctionsVdbRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsVdb
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param cost the cost
     * @param salvage the salvage
     * @param life the life
     * @param startPeriod the startPeriod
     * @param endPeriod the endPeriod
     * @param factor the factor
     * @param noSwitch the noSwitch
     */
    public WorkbookFunctionsVdbRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement cost, final com.google.gson.JsonElement salvage, final com.google.gson.JsonElement life, final com.google.gson.JsonElement startPeriod, final com.google.gson.JsonElement endPeriod, final com.google.gson.JsonElement factor, final com.google.gson.JsonElement noSwitch) {
        super(requestUrl, client, requestOptions, cost, salvage, life, startPeriod, endPeriod, factor, noSwitch);
    }
}
