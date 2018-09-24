// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsNetworkDays_IntlRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Network Days_Intl Request Builder.
 */
public class WorkbookFunctionsNetworkDays_IntlRequestBuilder extends BaseWorkbookFunctionsNetworkDays_IntlRequestBuilder implements IWorkbookFunctionsNetworkDays_IntlRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNetworkDays_Intl
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param startDate the startDate
     * @param endDate the endDate
     * @param weekend the weekend
     * @param holidays the holidays
     */
    public WorkbookFunctionsNetworkDays_IntlRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement startDate, final com.google.gson.JsonElement endDate, final com.google.gson.JsonElement weekend, final com.google.gson.JsonElement holidays) {
        super(requestUrl, client, requestOptions, startDate, endDate, weekend, holidays);
    }
}
