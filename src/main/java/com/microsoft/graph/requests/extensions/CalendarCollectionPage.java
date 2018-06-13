// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseCalendarCollectionPage;
import com.microsoft.graph.requests.generated.BaseCalendarCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Calendar Collection Page.
 */
public class CalendarCollectionPage extends BaseCalendarCollectionPage implements ICalendarCollectionPage {

    /**
     * A collection page for CalendarGroup.
     *
     * @param response the serialized BaseCalendarCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public CalendarCollectionPage(final BaseCalendarCollectionResponse response, final ICalendarCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
