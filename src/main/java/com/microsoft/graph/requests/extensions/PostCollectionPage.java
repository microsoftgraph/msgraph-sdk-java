// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BasePostCollectionPage;
import com.microsoft.graph.requests.generated.BasePostCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Post Collection Page.
 */
public class PostCollectionPage extends BasePostCollectionPage implements IPostCollectionPage {

    /**
     * A collection page for ConversationThread.
     *
     * @param response the serialized BasePostCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public PostCollectionPage(final BasePostCollectionResponse response, final IPostCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
