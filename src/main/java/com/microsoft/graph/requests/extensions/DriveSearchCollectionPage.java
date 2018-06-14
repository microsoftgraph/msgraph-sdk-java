// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDriveSearchCollectionPage;
import com.microsoft.graph.requests.generated.BaseDriveSearchCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Drive Search Collection Page.
 */
public class DriveSearchCollectionPage extends BaseDriveSearchCollectionPage implements IDriveSearchCollectionPage {

    /**
     * A collection page for Drive.
     *
     * @param response the serialized BaseDriveSearchCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DriveSearchCollectionPage(final BaseDriveSearchCollectionResponse response, final IDriveSearchCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
