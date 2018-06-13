// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsChiSq_Dist_RTRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Chi Sq_Dist_RTRequest Builder.
 */
public class WorkbookFunctionsChiSq_Dist_RTRequestBuilder extends BaseWorkbookFunctionsChiSq_Dist_RTRequestBuilder implements IWorkbookFunctionsChiSq_Dist_RTRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsChiSq_Dist_RT
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     * @param degFreedom the degFreedom
     */
    public WorkbookFunctionsChiSq_Dist_RTRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement degFreedom) {
        super(requestUrl, client, requestOptions, x, degFreedom);
    }
}
