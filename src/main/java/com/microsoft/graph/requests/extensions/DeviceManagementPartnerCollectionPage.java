// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceManagementPartnerCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceManagementPartnerCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Management Partner Collection Page.
 */
public class DeviceManagementPartnerCollectionPage extends BaseDeviceManagementPartnerCollectionPage implements IDeviceManagementPartnerCollectionPage {

    /**
     * A collection page for DeviceManagement.
     *
     * @param response the serialized BaseDeviceManagementPartnerCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DeviceManagementPartnerCollectionPage(final BaseDeviceManagementPartnerCollectionResponse response, final IDeviceManagementPartnerCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
