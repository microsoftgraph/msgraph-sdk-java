// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFilterApplyBottomPercentFilterRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Filter Apply Bottom Percent Filter Request Builder.
 */
public class WorkbookFilterApplyBottomPercentFilterRequestBuilder extends BaseWorkbookFilterApplyBottomPercentFilterRequestBuilder implements IWorkbookFilterApplyBottomPercentFilterRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApplyBottomPercentFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param percent the percent
     */
    public WorkbookFilterApplyBottomPercentFilterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer percent) {
        super(requestUrl, client, requestOptions, percent);
    }
}
