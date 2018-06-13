// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseMessageCollectionPage;
import com.microsoft.graph.requests.generated.BaseMessageCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Message Collection Page.
 */
public class MessageCollectionPage extends BaseMessageCollectionPage implements IMessageCollectionPage {

    /**
     * A collection page for MailFolder.
     *
     * @param response the serialized BaseMessageCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public MessageCollectionPage(final BaseMessageCollectionResponse response, final IMessageCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
