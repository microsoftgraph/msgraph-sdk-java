// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsF_DistRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions F_Dist Request Builder.
 */
public class WorkbookFunctionsF_DistRequestBuilder extends BaseWorkbookFunctionsF_DistRequestBuilder implements IWorkbookFunctionsF_DistRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsF_Dist
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     * @param degFreedom1 the degFreedom1
     * @param degFreedom2 the degFreedom2
     * @param cumulative the cumulative
     */
    public WorkbookFunctionsF_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement degFreedom1, final com.google.gson.JsonElement degFreedom2, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions, x, degFreedom1, degFreedom2, cumulative);
    }
}
