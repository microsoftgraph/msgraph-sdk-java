// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceEnrollmentConfigurationCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceEnrollmentConfigurationCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Enrollment Configuration Collection Page.
 */
public class DeviceEnrollmentConfigurationCollectionPage extends BaseDeviceEnrollmentConfigurationCollectionPage implements IDeviceEnrollmentConfigurationCollectionPage {

    /**
     * A collection page for DeviceManagement.
     *
     * @param response the serialized BaseDeviceEnrollmentConfigurationCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DeviceEnrollmentConfigurationCollectionPage(final BaseDeviceEnrollmentConfigurationCollectionResponse response, final IDeviceEnrollmentConfigurationCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
