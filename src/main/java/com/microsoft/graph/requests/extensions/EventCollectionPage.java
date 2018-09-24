// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseEventCollectionPage;
import com.microsoft.graph.requests.generated.BaseEventCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Event Collection Page.
 */
public class EventCollectionPage extends BaseEventCollectionPage implements IEventCollectionPage {

    /**
     * A collection page for User.
     *
     * @param response the serialized BaseEventCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public EventCollectionPage(final BaseEventCollectionResponse response, final IEventCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
