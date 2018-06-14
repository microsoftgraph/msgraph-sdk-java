// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsExpon_DistRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Expon_Dist Request Builder.
 */
public class WorkbookFunctionsExpon_DistRequestBuilder extends BaseWorkbookFunctionsExpon_DistRequestBuilder implements IWorkbookFunctionsExpon_DistRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsExpon_Dist
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     * @param lambda the lambda
     * @param cumulative the cumulative
     */
    public WorkbookFunctionsExpon_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement lambda, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions, x, lambda, cumulative);
    }
}
