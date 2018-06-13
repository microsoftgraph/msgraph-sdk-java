// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsMatchRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Match Request Builder.
 */
public class WorkbookFunctionsMatchRequestBuilder extends BaseWorkbookFunctionsMatchRequestBuilder implements IWorkbookFunctionsMatchRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsMatch
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param lookupValue the lookupValue
     * @param lookupArray the lookupArray
     * @param matchType the matchType
     */
    public WorkbookFunctionsMatchRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement lookupValue, final com.google.gson.JsonElement lookupArray, final com.google.gson.JsonElement matchType) {
        super(requestUrl, client, requestOptions, lookupValue, lookupArray, matchType);
    }
}
