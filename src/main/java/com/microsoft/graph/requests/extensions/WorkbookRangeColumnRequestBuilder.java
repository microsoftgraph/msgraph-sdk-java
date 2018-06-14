// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookRangeColumnRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Range Column Request Builder.
 */
public class WorkbookRangeColumnRequestBuilder extends BaseWorkbookRangeColumnRequestBuilder implements IWorkbookRangeColumnRequestBuilder {

    /**
     * The request builder for this WorkbookRangeColumn
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param column the column
     */
    public WorkbookRangeColumnRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer column) {
        super(requestUrl, client, requestOptions, column);
    }
}
