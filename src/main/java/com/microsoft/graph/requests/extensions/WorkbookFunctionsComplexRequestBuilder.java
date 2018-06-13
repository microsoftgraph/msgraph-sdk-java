// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsComplexRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Complex Request Builder.
 */
public class WorkbookFunctionsComplexRequestBuilder extends BaseWorkbookFunctionsComplexRequestBuilder implements IWorkbookFunctionsComplexRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsComplex
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param realNum the realNum
     * @param iNum the iNum
     * @param suffix the suffix
     */
    public WorkbookFunctionsComplexRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement realNum, final com.google.gson.JsonElement iNum, final com.google.gson.JsonElement suffix) {
        super(requestUrl, client, requestOptions, realNum, iNum, suffix);
    }
}
