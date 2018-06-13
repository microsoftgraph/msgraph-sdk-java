// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceConfigurationAssignCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceConfigurationAssignCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Configuration Assign Collection Page.
 */
public class DeviceConfigurationAssignCollectionPage extends BaseDeviceConfigurationAssignCollectionPage implements IDeviceConfigurationAssignCollectionPage {

    /**
     * A collection page for DeviceConfiguration.
     *
     * @param response the serialized BaseDeviceConfigurationAssignCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceConfigurationAssignCollectionPage(final BaseDeviceConfigurationAssignCollectionResponse response, final IDeviceConfigurationAssignCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
