// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsFvRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Fv Request Builder.
 */
public class WorkbookFunctionsFvRequestBuilder extends BaseWorkbookFunctionsFvRequestBuilder implements IWorkbookFunctionsFvRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param rate the rate
     * @param nper the nper
     * @param pmt the pmt
     * @param pv the pv
     * @param type the type
     */
    public WorkbookFunctionsFvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pmt, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement type) {
        super(requestUrl, client, requestOptions, rate, nper, pmt, pv, type);
    }
}
