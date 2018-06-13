// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsQuartile_ExcRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Quartile_Exc Request Builder.
 */
public class WorkbookFunctionsQuartile_ExcRequestBuilder extends BaseWorkbookFunctionsQuartile_ExcRequestBuilder implements IWorkbookFunctionsQuartile_ExcRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsQuartile_Exc
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param array the array
     * @param quart the quart
     */
    public WorkbookFunctionsQuartile_ExcRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement array, final com.google.gson.JsonElement quart) {
        super(requestUrl, client, requestOptions, array, quart);
    }
}
