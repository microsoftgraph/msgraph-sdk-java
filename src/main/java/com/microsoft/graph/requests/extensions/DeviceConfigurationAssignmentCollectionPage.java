// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceConfigurationAssignmentCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceConfigurationAssignmentCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Configuration Assignment Collection Page.
 */
public class DeviceConfigurationAssignmentCollectionPage extends BaseDeviceConfigurationAssignmentCollectionPage implements IDeviceConfigurationAssignmentCollectionPage {

    /**
     * A collection page for DeviceConfiguration.
     *
     * @param response the serialized BaseDeviceConfigurationAssignmentCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DeviceConfigurationAssignmentCollectionPage(final BaseDeviceConfigurationAssignmentCollectionResponse response, final IDeviceConfigurationAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
