// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsGamma_InvRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Gamma_Inv Request Builder.
 */
public class WorkbookFunctionsGamma_InvRequestBuilder extends BaseWorkbookFunctionsGamma_InvRequestBuilder implements IWorkbookFunctionsGamma_InvRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsGamma_Inv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param probability the probability
     * @param alpha the alpha
     * @param beta the beta
     */
    public WorkbookFunctionsGamma_InvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement probability, final com.google.gson.JsonElement alpha, final com.google.gson.JsonElement beta) {
        super(requestUrl, client, requestOptions, probability, alpha, beta);
    }
}
