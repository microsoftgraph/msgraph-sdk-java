// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsEffectRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsEffectRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Effect Request Builder.
 */
public class WorkbookFunctionsEffectRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsEffectRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsEffect
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param nominalRate the nominalRate
     * @param npery the npery
     */
    public WorkbookFunctionsEffectRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement nominalRate, final com.google.gson.JsonElement npery) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("nominalRate", nominalRate);
        bodyParams.put("npery", npery);
    }

    /**
     * Creates the IWorkbookFunctionsEffectRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsEffectRequest instance
     */
    public IWorkbookFunctionsEffectRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsEffectRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsEffectRequest instance
     */
    public IWorkbookFunctionsEffectRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsEffectRequest request = new WorkbookFunctionsEffectRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("nominalRate")) {
            request.body.nominalRate = getParameter("nominalRate");
        }

        if (hasParameter("npery")) {
            request.body.npery = getParameter("npery");
        }

        return request;
    }
}