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
 * The class for the Workbook Functions T_Dist Request Builder.
 */
public class WorkbookFunctionsT_DistRequestBuilder extends BaseWorkbookFunctionsT_DistRequestBuilder implements IWorkbookFunctionsT_DistRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsT_Dist
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookFunctionsT_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement degFreedom, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions, x, degFreedom, cumulative);
    }
}
