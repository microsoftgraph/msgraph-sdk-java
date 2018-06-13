// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDriveItemInviteCollectionPage;
import com.microsoft.graph.requests.generated.BaseDriveItemInviteCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Drive Item Invite Collection Page.
 */
public class DriveItemInviteCollectionPage extends BaseDriveItemInviteCollectionPage implements IDriveItemInviteCollectionPage {

    /**
     * A collection page for DriveItem.
     *
     * @param response the serialized BaseDriveItemInviteCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DriveItemInviteCollectionPage(final BaseDriveItemInviteCollectionResponse response, final IDriveItemInviteCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
