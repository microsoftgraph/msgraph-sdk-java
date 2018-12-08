// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Localized Notification Message Collection Page.
 */
public class LocalizedNotificationMessageCollectionPage extends BaseLocalizedNotificationMessageCollectionPage implements ILocalizedNotificationMessageCollectionPage {

    /**
     * A collection page for NotificationMessageTemplate.
     *
     * @param response the serialized BaseLocalizedNotificationMessageCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public LocalizedNotificationMessageCollectionPage(final BaseLocalizedNotificationMessageCollectionResponse response, final ILocalizedNotificationMessageCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
