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
 * The class for the Workbook Functions Binom_Dist_Range Request Builder.
 */
public class WorkbookFunctionsBinom_Dist_RangeRequestBuilder extends BaseWorkbookFunctionsBinom_Dist_RangeRequestBuilder implements IWorkbookFunctionsBinom_Dist_RangeRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBinom_Dist_Range
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookFunctionsBinom_Dist_RangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement trials, final com.google.gson.JsonElement probabilityS, final com.google.gson.JsonElement numberS, final com.google.gson.JsonElement numberS2) {
        super(requestUrl, client, requestOptions, trials, probabilityS, numberS, numberS2);
    }
}
