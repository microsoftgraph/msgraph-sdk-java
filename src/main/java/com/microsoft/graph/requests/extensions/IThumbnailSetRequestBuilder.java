// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.IBaseThumbnailSetRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The interface for the Thumbnail Set Request Builder.
 */
public interface IThumbnailSetRequestBuilder extends IBaseThumbnailSetRequestBuilder {


    /**
     * Gets a request for a thumbnail of a specific size
     * @param size The size to request (typically: small, medium, large)
     * @return The request builder for that thumbnail size
     */
    IThumbnailRequestBuilder getThumbnailSize(final String size);
}
