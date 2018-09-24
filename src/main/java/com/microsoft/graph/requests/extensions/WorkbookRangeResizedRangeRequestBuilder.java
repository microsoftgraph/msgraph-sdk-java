// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookRangeResizedRangeRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Range Resized Range Request Builder.
 */
public class WorkbookRangeResizedRangeRequestBuilder extends BaseWorkbookRangeResizedRangeRequestBuilder implements IWorkbookRangeResizedRangeRequestBuilder {

    /**
     * The request builder for this WorkbookRangeResizedRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param deltaRows the deltaRows
     * @param deltaColumns the deltaColumns
     */
    public WorkbookRangeResizedRangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer deltaRows, final Integer deltaColumns) {
        super(requestUrl, client, requestOptions, deltaRows, deltaColumns);
    }
}
