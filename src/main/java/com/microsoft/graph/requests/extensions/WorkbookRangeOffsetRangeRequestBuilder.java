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
 * The class for the Workbook Range Offset Range Request Builder.
 */
public class WorkbookRangeOffsetRangeRequestBuilder extends BaseWorkbookRangeOffsetRangeRequestBuilder implements IWorkbookRangeOffsetRangeRequestBuilder {

    /**
     * The request builder for this WorkbookRangeOffsetRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param rowOffset the rowOffset
     * @param columnOffset the columnOffset
     */
    public WorkbookRangeOffsetRangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer rowOffset, final Integer columnOffset) {
        super(requestUrl, client, requestOptions, rowOffset, columnOffset);
    }
}
