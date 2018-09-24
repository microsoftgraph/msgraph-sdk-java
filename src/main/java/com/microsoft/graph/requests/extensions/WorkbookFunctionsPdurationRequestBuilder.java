// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsPdurationRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Pduration Request Builder.
 */
public class WorkbookFunctionsPdurationRequestBuilder extends BaseWorkbookFunctionsPdurationRequestBuilder implements IWorkbookFunctionsPdurationRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPduration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param rate the rate
     * @param pv the pv
     * @param fv the fv
     */
    public WorkbookFunctionsPdurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement fv) {
        super(requestUrl, client, requestOptions, rate, pv, fv);
    }
}
