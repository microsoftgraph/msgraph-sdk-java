// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceConfigurationUserStatusCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceConfigurationUserStatusCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Configuration User Status Collection Page.
 */
public class DeviceConfigurationUserStatusCollectionPage extends BaseDeviceConfigurationUserStatusCollectionPage implements IDeviceConfigurationUserStatusCollectionPage {

    /**
     * A collection page for DeviceConfiguration.
     *
     * @param response the serialized BaseDeviceConfigurationUserStatusCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DeviceConfigurationUserStatusCollectionPage(final BaseDeviceConfigurationUserStatusCollectionResponse response, final IDeviceConfigurationUserStatusCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
