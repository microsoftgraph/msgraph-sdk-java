// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseReportRootGetOffice365ActiveUserCountsRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Report Root Get Office365Active User Counts Request Builder.
 */
public class ReportRootGetOffice365ActiveUserCountsRequestBuilder extends BaseReportRootGetOffice365ActiveUserCountsRequestBuilder implements IReportRootGetOffice365ActiveUserCountsRequestBuilder {

    /**
     * The request builder for this ReportRootGetOffice365ActiveUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetOffice365ActiveUserCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions, period);
    }
}
