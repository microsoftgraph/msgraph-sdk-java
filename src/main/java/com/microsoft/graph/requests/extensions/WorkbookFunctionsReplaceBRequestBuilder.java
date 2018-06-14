// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsReplaceBRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Replace BRequest Builder.
 */
public class WorkbookFunctionsReplaceBRequestBuilder extends BaseWorkbookFunctionsReplaceBRequestBuilder implements IWorkbookFunctionsReplaceBRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsReplaceB
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param oldText the oldText
     * @param startNum the startNum
     * @param numBytes the numBytes
     * @param newText the newText
     */
    public WorkbookFunctionsReplaceBRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement oldText, final com.google.gson.JsonElement startNum, final com.google.gson.JsonElement numBytes, final com.google.gson.JsonElement newText) {
        super(requestUrl, client, requestOptions, oldText, startNum, numBytes, newText);
    }
}
