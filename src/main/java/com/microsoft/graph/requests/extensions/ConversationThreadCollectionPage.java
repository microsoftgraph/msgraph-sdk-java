// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseConversationThreadCollectionPage;
import com.microsoft.graph.requests.generated.BaseConversationThreadCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Conversation Thread Collection Page.
 */
public class ConversationThreadCollectionPage extends BaseConversationThreadCollectionPage implements IConversationThreadCollectionPage {

    /**
     * A collection page for Conversation.
     *
     * @param response the serialized BaseConversationThreadCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ConversationThreadCollectionPage(final BaseConversationThreadCollectionResponse response, final IConversationThreadCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
