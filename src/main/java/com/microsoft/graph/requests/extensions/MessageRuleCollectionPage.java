// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseMessageRuleCollectionPage;
import com.microsoft.graph.requests.generated.BaseMessageRuleCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Message Rule Collection Page.
 */
public class MessageRuleCollectionPage extends BaseMessageRuleCollectionPage implements IMessageRuleCollectionPage {

    /**
     * A collection page for MailFolder.
     *
     * @param response the serialized BaseMessageRuleCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public MessageRuleCollectionPage(final BaseMessageRuleCollectionResponse response, final IMessageRuleCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
