// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDriveItemVersionCollectionPage;
import com.microsoft.graph.requests.generated.BaseDriveItemVersionCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Drive Item Version Collection Page.
 */
public class DriveItemVersionCollectionPage extends BaseDriveItemVersionCollectionPage implements IDriveItemVersionCollectionPage {

    /**
     * A collection page for DriveItem.
     *
     * @param response the serialized BaseDriveItemVersionCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DriveItemVersionCollectionPage(final BaseDriveItemVersionCollectionResponse response, final IDriveItemVersionCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
