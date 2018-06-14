// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsDateRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Date Request Builder.
 */
public class WorkbookFunctionsDateRequestBuilder extends BaseWorkbookFunctionsDateRequestBuilder implements IWorkbookFunctionsDateRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param year the year
     * @param month the month
     * @param day the day
     */
    public WorkbookFunctionsDateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement year, final com.google.gson.JsonElement month, final com.google.gson.JsonElement day) {
        super(requestUrl, client, requestOptions, year, month, day);
    }
}
