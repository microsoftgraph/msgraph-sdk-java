// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseSharedDriveItemCollectionPage;
import com.microsoft.graph.requests.generated.BaseSharedDriveItemCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Shared Drive Item Collection Page.
 */
public class SharedDriveItemCollectionPage extends BaseSharedDriveItemCollectionPage implements ISharedDriveItemCollectionPage {

    /**
     * A collection page for SharedDriveItem.
     *
     * @param response the serialized BaseSharedDriveItemCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public SharedDriveItemCollectionPage(final BaseSharedDriveItemCollectionResponse response, final ISharedDriveItemCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
