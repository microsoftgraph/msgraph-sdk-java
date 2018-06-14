// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsChooseRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Choose Request Builder.
 */
public class WorkbookFunctionsChooseRequestBuilder extends BaseWorkbookFunctionsChooseRequestBuilder implements IWorkbookFunctionsChooseRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsChoose
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param indexNum the indexNum
     * @param values the values
     */
    public WorkbookFunctionsChooseRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement indexNum, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions, indexNum, values);
    }
}
