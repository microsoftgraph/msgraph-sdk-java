// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseThumbnailSetCollectionPage;
import com.microsoft.graph.requests.generated.BaseThumbnailSetCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Thumbnail Set Collection Page.
 */
public class ThumbnailSetCollectionPage extends BaseThumbnailSetCollectionPage implements IThumbnailSetCollectionPage {

    /**
     * A collection page for DriveItem.
     *
     * @param response the serialized BaseThumbnailSetCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ThumbnailSetCollectionPage(final BaseThumbnailSetCollectionResponse response, final IThumbnailSetCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
