// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFilterApplyTopPercentFilterRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Filter Apply Top Percent Filter Request Builder.
 */
public class WorkbookFilterApplyTopPercentFilterRequestBuilder extends BaseWorkbookFilterApplyTopPercentFilterRequestBuilder implements IWorkbookFilterApplyTopPercentFilterRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApplyTopPercentFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param percent the percent
     */
    public WorkbookFilterApplyTopPercentFilterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer percent) {
        super(requestUrl, client, requestOptions, percent);
    }
}
