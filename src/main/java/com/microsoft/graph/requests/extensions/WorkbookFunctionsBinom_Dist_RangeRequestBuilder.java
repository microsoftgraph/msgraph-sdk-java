// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsBinom_Dist_RangeRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Binom_Dist_Range Request Builder.
 */
public class WorkbookFunctionsBinom_Dist_RangeRequestBuilder extends BaseWorkbookFunctionsBinom_Dist_RangeRequestBuilder implements IWorkbookFunctionsBinom_Dist_RangeRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBinom_Dist_Range
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param trials the trials
     * @param probabilityS the probabilityS
     * @param numberS the numberS
     * @param numberS2 the numberS2
     */
    public WorkbookFunctionsBinom_Dist_RangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement trials, final com.google.gson.JsonElement probabilityS, final com.google.gson.JsonElement numberS, final com.google.gson.JsonElement numberS2) {
        super(requestUrl, client, requestOptions, trials, probabilityS, numberS, numberS2);
    }
}
