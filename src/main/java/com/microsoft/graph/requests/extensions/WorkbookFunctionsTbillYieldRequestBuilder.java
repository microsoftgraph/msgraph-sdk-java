// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsTbillYieldRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Tbill Yield Request Builder.
 */
public class WorkbookFunctionsTbillYieldRequestBuilder extends BaseWorkbookFunctionsTbillYieldRequestBuilder implements IWorkbookFunctionsTbillYieldRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsTbillYield
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param settlement the settlement
     * @param maturity the maturity
     * @param pr the pr
     */
    public WorkbookFunctionsTbillYieldRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement pr) {
        super(requestUrl, client, requestOptions, settlement, maturity, pr);
    }
}
