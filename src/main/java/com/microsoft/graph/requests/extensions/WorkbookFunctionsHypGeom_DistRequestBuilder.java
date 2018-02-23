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
 * The class for the Workbook Functions Hyp Geom_Dist Request Builder.
 */
public class WorkbookFunctionsHypGeom_DistRequestBuilder extends BaseWorkbookFunctionsHypGeom_DistRequestBuilder implements IWorkbookFunctionsHypGeom_DistRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsHypGeom_Dist
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param sampleS the sampleS
     * @param numberSample the numberSample
     * @param populationS the populationS
     * @param numberPop the numberPop
     * @param cumulative the cumulative
     */
    public WorkbookFunctionsHypGeom_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement sampleS, final com.google.gson.JsonElement numberSample, final com.google.gson.JsonElement populationS, final com.google.gson.JsonElement numberPop, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions, sampleS, numberSample, populationS, numberPop, cumulative);
    }
}
