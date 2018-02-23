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
 * The class for the Workbook Functions Average Ifs Request Builder.
 */
public class WorkbookFunctionsAverageIfsRequestBuilder extends BaseWorkbookFunctionsAverageIfsRequestBuilder implements IWorkbookFunctionsAverageIfsRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAverageIfs
     *
     * @param requestUrl     the request url
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param averageRange the averageRange
     * @param values the values
     */
    public WorkbookFunctionsAverageIfsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement averageRange, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions, averageRange, values);
    }
}
