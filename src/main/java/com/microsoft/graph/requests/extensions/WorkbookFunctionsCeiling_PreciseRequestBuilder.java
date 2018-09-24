// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsCeiling_PreciseRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Ceiling_Precise Request Builder.
 */
public class WorkbookFunctionsCeiling_PreciseRequestBuilder extends BaseWorkbookFunctionsCeiling_PreciseRequestBuilder implements IWorkbookFunctionsCeiling_PreciseRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCeiling_Precise
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param significance the significance
     */
    public WorkbookFunctionsCeiling_PreciseRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement significance) {
        super(requestUrl, client, requestOptions, number, significance);
    }
}
