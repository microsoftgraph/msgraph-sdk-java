// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsBitxorRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Bitxor Request Builder.
 */
public class WorkbookFunctionsBitxorRequestBuilder extends BaseWorkbookFunctionsBitxorRequestBuilder implements IWorkbookFunctionsBitxorRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBitxor
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number1 the number1
     * @param number2 the number2
     */
    public WorkbookFunctionsBitxorRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number1, final com.google.gson.JsonElement number2) {
        super(requestUrl, client, requestOptions, number1, number2);
    }
}
