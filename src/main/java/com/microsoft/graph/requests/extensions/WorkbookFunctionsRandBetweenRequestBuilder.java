// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsRandBetweenRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Rand Between Request Builder.
 */
public class WorkbookFunctionsRandBetweenRequestBuilder extends BaseWorkbookFunctionsRandBetweenRequestBuilder implements IWorkbookFunctionsRandBetweenRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRandBetween
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param bottom the bottom
     * @param top the top
     */
    public WorkbookFunctionsRandBetweenRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement bottom, final com.google.gson.JsonElement top) {
        super(requestUrl, client, requestOptions, bottom, top);
    }
}
