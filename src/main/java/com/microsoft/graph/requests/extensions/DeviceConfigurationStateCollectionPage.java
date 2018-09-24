// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceConfigurationStateCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceConfigurationStateCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Configuration State Collection Page.
 */
public class DeviceConfigurationStateCollectionPage extends BaseDeviceConfigurationStateCollectionPage implements IDeviceConfigurationStateCollectionPage {

    /**
     * A collection page for ManagedDevice.
     *
     * @param response the serialized BaseDeviceConfigurationStateCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DeviceConfigurationStateCollectionPage(final BaseDeviceConfigurationStateCollectionResponse response, final IDeviceConfigurationStateCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
