// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseCalendarGroupCollectionPage;
import com.microsoft.graph.requests.generated.BaseCalendarGroupCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Calendar Group Collection Page.
 */
public class CalendarGroupCollectionPage extends BaseCalendarGroupCollectionPage implements ICalendarGroupCollectionPage {

    /**
     * A collection page for User.
     *
     * @param response the serialized BaseCalendarGroupCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public CalendarGroupCollectionPage(final BaseCalendarGroupCollectionResponse response, final ICalendarGroupCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
