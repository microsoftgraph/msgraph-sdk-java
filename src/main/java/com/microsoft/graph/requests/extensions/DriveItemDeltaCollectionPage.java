// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDriveItemDeltaCollectionPage;
import com.microsoft.graph.requests.generated.BaseDriveItemDeltaCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Drive Item Delta Collection Page.
 */
public class DriveItemDeltaCollectionPage extends BaseDriveItemDeltaCollectionPage implements IDriveItemDeltaCollectionPage {

    /**
     * A collection page for DriveItem.
     *
     * @param response the serialized BaseDriveItemDeltaCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DriveItemDeltaCollectionPage(final BaseDriveItemDeltaCollectionResponse response, final IDriveItemDeltaCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
