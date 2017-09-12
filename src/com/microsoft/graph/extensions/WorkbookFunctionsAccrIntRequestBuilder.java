// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Accr Int Request Builder.
 */
public class WorkbookFunctionsAccrIntRequestBuilder extends BaseWorkbookFunctionsAccrIntRequestBuilder implements IWorkbookFunctionsAccrIntRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAccrInt
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookFunctionsAccrIntRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement issue, final com.google.gson.JsonElement firstInterest, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement par, final com.google.gson.JsonElement frequency, final com.google.gson.JsonElement basis, final com.google.gson.JsonElement calcMethod) {
        super(requestUrl, client, requestOptions, issue, firstInterest, settlement, rate, par, frequency, basis, calcMethod);
    }
}
