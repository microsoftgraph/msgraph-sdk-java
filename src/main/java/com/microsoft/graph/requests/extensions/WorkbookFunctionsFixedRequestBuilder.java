// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsFixedRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Fixed Request Builder.
 */
public class WorkbookFunctionsFixedRequestBuilder extends BaseWorkbookFunctionsFixedRequestBuilder implements IWorkbookFunctionsFixedRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFixed
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param decimals the decimals
     * @param noCommas the noCommas
     */
    public WorkbookFunctionsFixedRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement decimals, final com.google.gson.JsonElement noCommas) {
        super(requestUrl, client, requestOptions, number, decimals, noCommas);
    }
}
