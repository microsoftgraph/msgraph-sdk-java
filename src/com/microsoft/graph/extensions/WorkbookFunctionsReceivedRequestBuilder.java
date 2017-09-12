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
 * The class for the Workbook Functions Received Request Builder.
 */
public class WorkbookFunctionsReceivedRequestBuilder extends BaseWorkbookFunctionsReceivedRequestBuilder implements IWorkbookFunctionsReceivedRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsReceived
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookFunctionsReceivedRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement investment, final com.google.gson.JsonElement discount, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions, settlement, maturity, investment, discount, basis);
    }
}
