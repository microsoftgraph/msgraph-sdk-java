// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Odd LYield Request Builder.
 */
public class WorkbookFunctionsOddLYieldRequestBuilder extends BaseWorkbookFunctionsOddLYieldRequestBuilder implements IWorkbookFunctionsOddLYieldRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsOddLYield
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param settlement The settlement
     * @param maturity The maturity
     * @param lastInterest The lastInterest
     * @param rate The rate
     * @param pr The pr
     * @param redemption The redemption
     * @param frequency The frequency
     * @param basis The basis
     */
    public WorkbookFunctionsOddLYieldRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement lastInterest, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement pr, final com.google.gson.JsonElement redemption, final com.google.gson.JsonElement frequency, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions, settlement, maturity, lastInterest, rate, pr, redemption, frequency, basis);
    }
}
