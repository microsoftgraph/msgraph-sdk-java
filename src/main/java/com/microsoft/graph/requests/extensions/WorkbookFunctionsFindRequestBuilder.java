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
 * The class for the Workbook Functions Find Request Builder.
 */
public class WorkbookFunctionsFindRequestBuilder extends BaseWorkbookFunctionsFindRequestBuilder implements IWorkbookFunctionsFindRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFind
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param findText The findText
     * @param withinText The withinText
     * @param startNum The startNum
     */
    public WorkbookFunctionsFindRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement findText, final com.google.gson.JsonElement withinText, final com.google.gson.JsonElement startNum) {
        super(requestUrl, client, requestOptions, findText, withinText, startNum);
    }
}
