// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsIsrefRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsIsrefRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Isref Request Builder.
 */
public class WorkbookFunctionsIsrefRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsIsrefRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsIsref
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param value the value
     */
    public WorkbookFunctionsIsrefRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement value) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("value", value);
    }

    /**
     * Creates the IWorkbookFunctionsIsrefRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIsrefRequest instance
     */
    public IWorkbookFunctionsIsrefRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsIsrefRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIsrefRequest instance
     */
    public IWorkbookFunctionsIsrefRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsIsrefRequest request = new WorkbookFunctionsIsrefRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("value")) {
            request.body.value = getParameter("value");
        }

        return request;
    }
}