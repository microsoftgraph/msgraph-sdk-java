// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookRangeMergeRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Range Merge Request Builder.
 */
public class WorkbookRangeMergeRequestBuilder extends BaseWorkbookRangeMergeRequestBuilder implements IWorkbookRangeMergeRequestBuilder {

    /**
     * The request builder for this WorkbookRangeMerge
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param across the across
     */
    public WorkbookRangeMergeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Boolean across) {
        super(requestUrl, client, requestOptions, across);
    }
}
