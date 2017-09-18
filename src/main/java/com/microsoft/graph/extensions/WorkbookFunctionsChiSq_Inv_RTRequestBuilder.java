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
 * The class for the Workbook Functions Chi Sq_Inv_RTRequest Builder.
 */
public class WorkbookFunctionsChiSq_Inv_RTRequestBuilder extends BaseWorkbookFunctionsChiSq_Inv_RTRequestBuilder implements IWorkbookFunctionsChiSq_Inv_RTRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsChiSq_Inv_RT
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookFunctionsChiSq_Inv_RTRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement probability, final com.google.gson.JsonElement degFreedom) {
        super(requestUrl, client, requestOptions, probability, degFreedom);
    }
}
