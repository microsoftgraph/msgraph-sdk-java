// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.EnrollmentConfigurationAssignment;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseDeviceEnrollmentConfigurationAssignRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Enrollment Configuration Assign Request Builder.
 */
public class DeviceEnrollmentConfigurationAssignRequestBuilder extends BaseDeviceEnrollmentConfigurationAssignRequestBuilder implements IDeviceEnrollmentConfigurationAssignRequestBuilder {

    /**
     * The request builder for this DeviceEnrollmentConfigurationAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param enrollmentConfigurationAssignments the enrollmentConfigurationAssignments
     */
    public DeviceEnrollmentConfigurationAssignRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<EnrollmentConfigurationAssignment> enrollmentConfigurationAssignments) {
        super(requestUrl, client, requestOptions, enrollmentConfigurationAssignments);
    }
}
