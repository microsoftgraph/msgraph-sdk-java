// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseEventDeltaCollectionPage;
import com.microsoft.graph.requests.generated.BaseEventDeltaCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Event Delta Collection Page.
 */
public class EventDeltaCollectionPage extends BaseEventDeltaCollectionPage implements IEventDeltaCollectionPage {

    /**
     * A collection page for Event.
     *
     * @param response the serialized BaseEventDeltaCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EventDeltaCollectionPage(final BaseEventDeltaCollectionResponse response, final IEventDeltaCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
