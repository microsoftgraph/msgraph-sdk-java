// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceManagementTroubleshootingEventCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceManagementTroubleshootingEventCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Management Troubleshooting Event Collection Page.
 */
public class DeviceManagementTroubleshootingEventCollectionPage extends BaseDeviceManagementTroubleshootingEventCollectionPage implements IDeviceManagementTroubleshootingEventCollectionPage {

    /**
     * A collection page for DeviceManagement.
     *
     * @param response the serialized BaseDeviceManagementTroubleshootingEventCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DeviceManagementTroubleshootingEventCollectionPage(final BaseDeviceManagementTroubleshootingEventCollectionResponse response, final IDeviceManagementTroubleshootingEventCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
