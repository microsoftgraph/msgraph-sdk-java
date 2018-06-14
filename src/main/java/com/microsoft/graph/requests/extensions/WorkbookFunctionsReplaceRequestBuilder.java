// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsReplaceRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Replace Request Builder.
 */
public class WorkbookFunctionsReplaceRequestBuilder extends BaseWorkbookFunctionsReplaceRequestBuilder implements IWorkbookFunctionsReplaceRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsReplace
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param oldText the oldText
     * @param startNum the startNum
     * @param numChars the numChars
     * @param newText the newText
     */
    public WorkbookFunctionsReplaceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement oldText, final com.google.gson.JsonElement startNum, final com.google.gson.JsonElement numChars, final com.google.gson.JsonElement newText) {
        super(requestUrl, client, requestOptions, oldText, startNum, numChars, newText);
    }
}
