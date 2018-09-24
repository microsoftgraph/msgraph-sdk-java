// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsConvertRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Convert Request Builder.
 */
public class WorkbookFunctionsConvertRequestBuilder extends BaseWorkbookFunctionsConvertRequestBuilder implements IWorkbookFunctionsConvertRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsConvert
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param fromUnit the fromUnit
     * @param toUnit the toUnit
     */
    public WorkbookFunctionsConvertRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement fromUnit, final com.google.gson.JsonElement toUnit) {
        super(requestUrl, client, requestOptions, number, fromUnit, toUnit);
    }
}
