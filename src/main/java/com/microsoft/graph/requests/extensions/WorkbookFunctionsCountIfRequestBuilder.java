// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsCountIfRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Count If Request Builder.
 */
public class WorkbookFunctionsCountIfRequestBuilder extends BaseWorkbookFunctionsCountIfRequestBuilder implements IWorkbookFunctionsCountIfRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCountIf
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param range the range
     * @param criteria the criteria
     */
    public WorkbookFunctionsCountIfRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement range, final com.google.gson.JsonElement criteria) {
        super(requestUrl, client, requestOptions, range, criteria);
    }
}
