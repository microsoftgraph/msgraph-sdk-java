// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsT_Dist_2TRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions T_Dist_2TRequest Builder.
 */
public class WorkbookFunctionsT_Dist_2TRequestBuilder extends BaseWorkbookFunctionsT_Dist_2TRequestBuilder implements IWorkbookFunctionsT_Dist_2TRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsT_Dist_2T
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     * @param degFreedom the degFreedom
     */
    public WorkbookFunctionsT_Dist_2TRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement degFreedom) {
        super(requestUrl, client, requestOptions, x, degFreedom);
    }
}
