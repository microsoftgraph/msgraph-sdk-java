// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceManagementGetEffectivePermissionsCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceManagementGetEffectivePermissionsCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Management Get Effective Permissions Collection Page.
 */
public class DeviceManagementGetEffectivePermissionsCollectionPage extends BaseDeviceManagementGetEffectivePermissionsCollectionPage implements IDeviceManagementGetEffectivePermissionsCollectionPage {

    /**
     * A collection page for DeviceManagement.
     *
     * @param response the serialized BaseDeviceManagementGetEffectivePermissionsCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementGetEffectivePermissionsCollectionPage(final BaseDeviceManagementGetEffectivePermissionsCollectionResponse response, final IDeviceManagementGetEffectivePermissionsCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
