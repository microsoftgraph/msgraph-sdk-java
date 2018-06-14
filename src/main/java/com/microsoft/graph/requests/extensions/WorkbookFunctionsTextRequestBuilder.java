// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsTextRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Text Request Builder.
 */
public class WorkbookFunctionsTextRequestBuilder extends BaseWorkbookFunctionsTextRequestBuilder implements IWorkbookFunctionsTextRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsText
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param value the value
     * @param formatText the formatText
     */
    public WorkbookFunctionsTextRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement value, final com.google.gson.JsonElement formatText) {
        super(requestUrl, client, requestOptions, value, formatText);
    }
}
