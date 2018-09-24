// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsPercentile_IncRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Percentile_Inc Request Builder.
 */
public class WorkbookFunctionsPercentile_IncRequestBuilder extends BaseWorkbookFunctionsPercentile_IncRequestBuilder implements IWorkbookFunctionsPercentile_IncRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPercentile_Inc
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param array the array
     * @param k the k
     */
    public WorkbookFunctionsPercentile_IncRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement array, final com.google.gson.JsonElement k) {
        super(requestUrl, client, requestOptions, array, k);
    }
}
