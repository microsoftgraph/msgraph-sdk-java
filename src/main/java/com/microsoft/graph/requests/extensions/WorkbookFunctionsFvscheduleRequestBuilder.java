// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsFvscheduleRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Fvschedule Request Builder.
 */
public class WorkbookFunctionsFvscheduleRequestBuilder extends BaseWorkbookFunctionsFvscheduleRequestBuilder implements IWorkbookFunctionsFvscheduleRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFvschedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param principal the principal
     * @param schedule the schedule
     */
    public WorkbookFunctionsFvscheduleRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement principal, final com.google.gson.JsonElement schedule) {
        super(requestUrl, client, requestOptions, principal, schedule);
    }
}
