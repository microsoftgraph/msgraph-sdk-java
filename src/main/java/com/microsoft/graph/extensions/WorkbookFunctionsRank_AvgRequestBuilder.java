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
 * The class for the Workbook Functions Rank_Avg Request Builder.
 */
public class WorkbookFunctionsRank_AvgRequestBuilder extends BaseWorkbookFunctionsRank_AvgRequestBuilder implements IWorkbookFunctionsRank_AvgRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRank_Avg
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookFunctionsRank_AvgRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement ref, final com.google.gson.JsonElement order) {
        super(requestUrl, client, requestOptions, number, ref, order);
    }
}
