// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsYieldRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Yield Request Builder.
 */
public class WorkbookFunctionsYieldRequestBuilder extends BaseWorkbookFunctionsYieldRequestBuilder implements IWorkbookFunctionsYieldRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsYield
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param settlement the settlement
     * @param maturity the maturity
     * @param rate the rate
     * @param pr the pr
     * @param redemption the redemption
     * @param frequency the frequency
     * @param basis the basis
     */
    public WorkbookFunctionsYieldRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement pr, final com.google.gson.JsonElement redemption, final com.google.gson.JsonElement frequency, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions, settlement, maturity, rate, pr, redemption, frequency, basis);
    }
}
