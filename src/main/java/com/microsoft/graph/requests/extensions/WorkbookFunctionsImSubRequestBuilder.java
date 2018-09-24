// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsImSubRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Im Sub Request Builder.
 */
public class WorkbookFunctionsImSubRequestBuilder extends BaseWorkbookFunctionsImSubRequestBuilder implements IWorkbookFunctionsImSubRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsImSub
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param inumber1 the inumber1
     * @param inumber2 the inumber2
     */
    public WorkbookFunctionsImSubRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement inumber1, final com.google.gson.JsonElement inumber2) {
        super(requestUrl, client, requestOptions, inumber1, inumber2);
    }
}
