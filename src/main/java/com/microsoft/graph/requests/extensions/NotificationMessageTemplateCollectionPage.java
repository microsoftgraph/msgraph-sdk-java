// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseNotificationMessageTemplateCollectionPage;
import com.microsoft.graph.requests.generated.BaseNotificationMessageTemplateCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Notification Message Template Collection Page.
 */
public class NotificationMessageTemplateCollectionPage extends BaseNotificationMessageTemplateCollectionPage implements INotificationMessageTemplateCollectionPage {

    /**
     * A collection page for DeviceManagement.
     *
     * @param response the serialized BaseNotificationMessageTemplateCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public NotificationMessageTemplateCollectionPage(final BaseNotificationMessageTemplateCollectionResponse response, final INotificationMessageTemplateCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
