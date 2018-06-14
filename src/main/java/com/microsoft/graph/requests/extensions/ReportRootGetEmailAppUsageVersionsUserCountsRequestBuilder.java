// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseReportRootGetEmailAppUsageVersionsUserCountsRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Report Root Get Email App Usage Versions User Counts Request Builder.
 */
public class ReportRootGetEmailAppUsageVersionsUserCountsRequestBuilder extends BaseReportRootGetEmailAppUsageVersionsUserCountsRequestBuilder implements IReportRootGetEmailAppUsageVersionsUserCountsRequestBuilder {

    /**
     * The request builder for this ReportRootGetEmailAppUsageVersionsUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetEmailAppUsageVersionsUserCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions, period);
    }
}
