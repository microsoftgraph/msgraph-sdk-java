// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsIspmtRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Ispmt Request Builder.
 */
public class WorkbookFunctionsIspmtRequestBuilder extends BaseWorkbookFunctionsIspmtRequestBuilder implements IWorkbookFunctionsIspmtRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsIspmt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param rate the rate
     * @param per the per
     * @param nper the nper
     * @param pv the pv
     */
    public WorkbookFunctionsIspmtRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement per, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pv) {
        super(requestUrl, client, requestOptions, rate, per, nper, pv);
    }
}
