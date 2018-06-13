// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsExactRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Exact Request Builder.
 */
public class WorkbookFunctionsExactRequestBuilder extends BaseWorkbookFunctionsExactRequestBuilder implements IWorkbookFunctionsExactRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsExact
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param text1 the text1
     * @param text2 the text2
     */
    public WorkbookFunctionsExactRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement text1, final com.google.gson.JsonElement text2) {
        super(requestUrl, client, requestOptions, text1, text2);
    }
}
