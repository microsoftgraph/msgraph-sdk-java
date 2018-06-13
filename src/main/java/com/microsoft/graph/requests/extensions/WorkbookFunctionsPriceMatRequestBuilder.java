// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsPriceMatRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Price Mat Request Builder.
 */
public class WorkbookFunctionsPriceMatRequestBuilder extends BaseWorkbookFunctionsPriceMatRequestBuilder implements IWorkbookFunctionsPriceMatRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPriceMat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param settlement the settlement
     * @param maturity the maturity
     * @param issue the issue
     * @param rate the rate
     * @param yld the yld
     * @param basis the basis
     */
    public WorkbookFunctionsPriceMatRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement issue, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement yld, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions, settlement, maturity, issue, rate, yld, basis);
    }
}
