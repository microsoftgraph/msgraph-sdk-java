// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceAndAppManagementRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceAndAppManagementRoleAssignmentCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device And App Management Role Assignment Collection Page.
 */
public class DeviceAndAppManagementRoleAssignmentCollectionPage extends BaseDeviceAndAppManagementRoleAssignmentCollectionPage implements IDeviceAndAppManagementRoleAssignmentCollectionPage {

    /**
     * A collection page for DeviceManagement.
     *
     * @param response the serialized BaseDeviceAndAppManagementRoleAssignmentCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DeviceAndAppManagementRoleAssignmentCollectionPage(final BaseDeviceAndAppManagementRoleAssignmentCollectionResponse response, final IDeviceAndAppManagementRoleAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
