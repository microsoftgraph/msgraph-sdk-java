// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDriveRecentCollectionPage;
import com.microsoft.graph.requests.generated.BaseDriveRecentCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Drive Recent Collection Page.
 */
public class DriveRecentCollectionPage extends BaseDriveRecentCollectionPage implements IDriveRecentCollectionPage {

    /**
     * A collection page for Drive.
     *
     * @param response the serialized BaseDriveRecentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DriveRecentCollectionPage(final BaseDriveRecentCollectionResponse response, final IDriveRecentCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
