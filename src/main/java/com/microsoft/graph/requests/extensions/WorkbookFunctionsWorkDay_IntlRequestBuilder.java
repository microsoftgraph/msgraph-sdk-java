// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsWorkDay_IntlRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Work Day_Intl Request Builder.
 */
public class WorkbookFunctionsWorkDay_IntlRequestBuilder extends BaseWorkbookFunctionsWorkDay_IntlRequestBuilder implements IWorkbookFunctionsWorkDay_IntlRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsWorkDay_Intl
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param startDate the startDate
     * @param days the days
     * @param weekend the weekend
     * @param holidays the holidays
     */
    public WorkbookFunctionsWorkDay_IntlRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement startDate, final com.google.gson.JsonElement days, final com.google.gson.JsonElement weekend, final com.google.gson.JsonElement holidays) {
        super(requestUrl, client, requestOptions, startDate, days, weekend, holidays);
    }
}
