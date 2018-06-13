// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceConfigurationDeviceStatusCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceConfigurationDeviceStatusCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Configuration Device Status Collection Page.
 */
public class DeviceConfigurationDeviceStatusCollectionPage extends BaseDeviceConfigurationDeviceStatusCollectionPage implements IDeviceConfigurationDeviceStatusCollectionPage {

    /**
     * A collection page for DeviceConfiguration.
     *
     * @param response the serialized BaseDeviceConfigurationDeviceStatusCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DeviceConfigurationDeviceStatusCollectionPage(final BaseDeviceConfigurationDeviceStatusCollectionResponse response, final IDeviceConfigurationDeviceStatusCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
