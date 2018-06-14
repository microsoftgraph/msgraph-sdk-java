// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsHlookupRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Hlookup Request Builder.
 */
public class WorkbookFunctionsHlookupRequestBuilder extends BaseWorkbookFunctionsHlookupRequestBuilder implements IWorkbookFunctionsHlookupRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsHlookup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param lookupValue the lookupValue
     * @param tableArray the tableArray
     * @param rowIndexNum the rowIndexNum
     * @param rangeLookup the rangeLookup
     */
    public WorkbookFunctionsHlookupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement lookupValue, final com.google.gson.JsonElement tableArray, final com.google.gson.JsonElement rowIndexNum, final com.google.gson.JsonElement rangeLookup) {
        super(requestUrl, client, requestOptions, lookupValue, tableArray, rowIndexNum, rangeLookup);
    }
}
