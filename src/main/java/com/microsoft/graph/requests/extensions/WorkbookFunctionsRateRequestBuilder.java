// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsRateRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Rate Request Builder.
 */
public class WorkbookFunctionsRateRequestBuilder extends BaseWorkbookFunctionsRateRequestBuilder implements IWorkbookFunctionsRateRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param nper the nper
     * @param pmt the pmt
     * @param pv the pv
     * @param fv the fv
     * @param type the type
     * @param guess the guess
     */
    public WorkbookFunctionsRateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pmt, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement fv, final com.google.gson.JsonElement type, final com.google.gson.JsonElement guess) {
        super(requestUrl, client, requestOptions, nper, pmt, pv, fv, type, guess);
    }
}
