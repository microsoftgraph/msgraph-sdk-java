// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsIso_CeilingRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Iso_Ceiling Request Builder.
 */
public class WorkbookFunctionsIso_CeilingRequestBuilder extends BaseWorkbookFunctionsIso_CeilingRequestBuilder implements IWorkbookFunctionsIso_CeilingRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsIso_Ceiling
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param significance the significance
     */
    public WorkbookFunctionsIso_CeilingRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement significance) {
        super(requestUrl, client, requestOptions, number, significance);
    }
}
