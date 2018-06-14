// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsTbillEqRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Tbill Eq Request Builder.
 */
public class WorkbookFunctionsTbillEqRequestBuilder extends BaseWorkbookFunctionsTbillEqRequestBuilder implements IWorkbookFunctionsTbillEqRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsTbillEq
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param settlement the settlement
     * @param maturity the maturity
     * @param discount the discount
     */
    public WorkbookFunctionsTbillEqRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement discount) {
        super(requestUrl, client, requestOptions, settlement, maturity, discount);
    }
}
