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
 * The class for the Workbook Functions Eo Month Request Builder.
 */
public class WorkbookFunctionsEoMonthRequestBuilder extends BaseWorkbookFunctionsEoMonthRequestBuilder implements IWorkbookFunctionsEoMonthRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsEoMonth
     *
     * @param requestUrl     the request url
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param startDate the startDate
     * @param months the months
     */
    public WorkbookFunctionsEoMonthRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement startDate, final com.google.gson.JsonElement months) {
        super(requestUrl, client, requestOptions, startDate, months);
    }
}
