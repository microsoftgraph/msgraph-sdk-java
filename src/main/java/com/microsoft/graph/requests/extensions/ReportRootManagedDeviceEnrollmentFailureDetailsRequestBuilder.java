// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Report Root Managed Device Enrollment Failure Details Request Builder.
 */
public class ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder extends BaseReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder implements IReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder {

    /**
     * The request builder for this ReportRootManagedDeviceEnrollmentFailureDetails
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * The request builder for this ReportRootManagedDeviceEnrollmentFailureDetails
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param skip the skip
     * @param top the top
     * @param filter the filter
     * @param skipToken the skipToken
     */
    public ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer skip, final Integer top, final String filter, final String skipToken) {
        super(requestUrl, client, requestOptions, skip, top, filter, skipToken);
    }
}
