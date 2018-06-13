// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseConversationCollectionPage;
import com.microsoft.graph.requests.generated.BaseConversationCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Conversation Collection Page.
 */
public class ConversationCollectionPage extends BaseConversationCollectionPage implements IConversationCollectionPage {

    /**
     * A collection page for Group.
     *
     * @param response the serialized BaseConversationCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ConversationCollectionPage(final BaseConversationCollectionResponse response, final IConversationCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
