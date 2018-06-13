// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsFindBRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Find BRequest Builder.
 */
public class WorkbookFunctionsFindBRequestBuilder extends BaseWorkbookFunctionsFindBRequestBuilder implements IWorkbookFunctionsFindBRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFindB
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param findText the findText
     * @param withinText the withinText
     * @param startNum the startNum
     */
    public WorkbookFunctionsFindBRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement findText, final com.google.gson.JsonElement withinText, final com.google.gson.JsonElement startNum) {
        super(requestUrl, client, requestOptions, findText, withinText, startNum);
    }
}
