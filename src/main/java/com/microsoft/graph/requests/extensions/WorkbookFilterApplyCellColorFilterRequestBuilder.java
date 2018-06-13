// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFilterApplyCellColorFilterRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Filter Apply Cell Color Filter Request Builder.
 */
public class WorkbookFilterApplyCellColorFilterRequestBuilder extends BaseWorkbookFilterApplyCellColorFilterRequestBuilder implements IWorkbookFilterApplyCellColorFilterRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApplyCellColorFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param color the color
     */
    public WorkbookFilterApplyCellColorFilterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String color) {
        super(requestUrl, client, requestOptions, color);
    }
}
