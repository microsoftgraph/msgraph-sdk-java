// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Report Root Get Skype For Business Organizer Activity Minute Counts Request Builder.
 */
public class ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequestBuilder extends BaseReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequestBuilder implements IReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequestBuilder {

    /**
     * The request builder for this ReportRootGetSkypeForBusinessOrganizerActivityMinuteCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions, period);
    }
}
