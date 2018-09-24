// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseMessageDeltaCollectionPage;
import com.microsoft.graph.requests.generated.BaseMessageDeltaCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Message Delta Collection Page.
 */
public class MessageDeltaCollectionPage extends BaseMessageDeltaCollectionPage implements IMessageDeltaCollectionPage {

    /**
     * A collection page for Message.
     *
     * @param response the serialized BaseMessageDeltaCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MessageDeltaCollectionPage(final BaseMessageDeltaCollectionResponse response, final IMessageDeltaCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
