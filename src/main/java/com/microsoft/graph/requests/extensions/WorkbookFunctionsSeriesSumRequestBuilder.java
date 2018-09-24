// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsSeriesSumRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Series Sum Request Builder.
 */
public class WorkbookFunctionsSeriesSumRequestBuilder extends BaseWorkbookFunctionsSeriesSumRequestBuilder implements IWorkbookFunctionsSeriesSumRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsSeriesSum
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     * @param n the n
     * @param m the m
     * @param coefficients the coefficients
     */
    public WorkbookFunctionsSeriesSumRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement n, final com.google.gson.JsonElement m, final com.google.gson.JsonElement coefficients) {
        super(requestUrl, client, requestOptions, x, n, m, coefficients);
    }
}
