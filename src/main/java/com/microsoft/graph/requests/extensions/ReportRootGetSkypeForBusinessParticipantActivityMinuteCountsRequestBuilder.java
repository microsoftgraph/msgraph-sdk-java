// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Report Root Get Skype For Business Participant Activity Minute Counts Request Builder.
 */
public class ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequestBuilder extends BaseReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequestBuilder implements IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequestBuilder {

    /**
     * The request builder for this ReportRootGetSkypeForBusinessParticipantActivityMinuteCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions, period);
    }
}
