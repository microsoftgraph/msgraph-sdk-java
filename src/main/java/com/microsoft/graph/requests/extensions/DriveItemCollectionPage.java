// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDriveItemCollectionPage;
import com.microsoft.graph.requests.generated.BaseDriveItemCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Drive Item Collection Page.
 */
public class DriveItemCollectionPage extends BaseDriveItemCollectionPage implements IDriveItemCollectionPage {

    /**
     * A collection page for DriveItem.
     *
     * @param response the serialized BaseDriveItemCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DriveItemCollectionPage(final BaseDriveItemCollectionResponse response, final IDriveItemCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
