// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceConfigurationCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceConfigurationCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Configuration Collection Page.
 */
public class DeviceConfigurationCollectionPage extends BaseDeviceConfigurationCollectionPage implements IDeviceConfigurationCollectionPage {

    /**
     * A collection page for DeviceManagement.
     *
     * @param response the serialized BaseDeviceConfigurationCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DeviceConfigurationCollectionPage(final BaseDeviceConfigurationCollectionResponse response, final IDeviceConfigurationCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
