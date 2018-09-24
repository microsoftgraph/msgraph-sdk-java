// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsXnpvRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Xnpv Request Builder.
 */
public class WorkbookFunctionsXnpvRequestBuilder extends BaseWorkbookFunctionsXnpvRequestBuilder implements IWorkbookFunctionsXnpvRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsXnpv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param rate the rate
     * @param values the values
     * @param dates the dates
     */
    public WorkbookFunctionsXnpvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement values, final com.google.gson.JsonElement dates) {
        super(requestUrl, client, requestOptions, rate, values, dates);
    }
}
