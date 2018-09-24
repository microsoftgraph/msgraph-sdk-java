// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsAmorDegrcRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Amor Degrc Request Builder.
 */
public class WorkbookFunctionsAmorDegrcRequestBuilder extends BaseWorkbookFunctionsAmorDegrcRequestBuilder implements IWorkbookFunctionsAmorDegrcRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAmorDegrc
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param cost the cost
     * @param datePurchased the datePurchased
     * @param firstPeriod the firstPeriod
     * @param salvage the salvage
     * @param period the period
     * @param rate the rate
     * @param basis the basis
     */
    public WorkbookFunctionsAmorDegrcRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement cost, final com.google.gson.JsonElement datePurchased, final com.google.gson.JsonElement firstPeriod, final com.google.gson.JsonElement salvage, final com.google.gson.JsonElement period, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions, cost, datePurchased, firstPeriod, salvage, period, rate, basis);
    }
}
