// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsYearFracRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Year Frac Request Builder.
 */
public class WorkbookFunctionsYearFracRequestBuilder extends BaseWorkbookFunctionsYearFracRequestBuilder implements IWorkbookFunctionsYearFracRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsYearFrac
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param startDate the startDate
     * @param endDate the endDate
     * @param basis the basis
     */
    public WorkbookFunctionsYearFracRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement startDate, final com.google.gson.JsonElement endDate, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions, startDate, endDate, basis);
    }
}
