// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsBinom_InvRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Binom_Inv Request Builder.
 */
public class WorkbookFunctionsBinom_InvRequestBuilder extends BaseWorkbookFunctionsBinom_InvRequestBuilder implements IWorkbookFunctionsBinom_InvRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBinom_Inv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param trials the trials
     * @param probabilityS the probabilityS
     * @param alpha the alpha
     */
    public WorkbookFunctionsBinom_InvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement trials, final com.google.gson.JsonElement probabilityS, final com.google.gson.JsonElement alpha) {
        super(requestUrl, client, requestOptions, trials, probabilityS, alpha);
    }
}
