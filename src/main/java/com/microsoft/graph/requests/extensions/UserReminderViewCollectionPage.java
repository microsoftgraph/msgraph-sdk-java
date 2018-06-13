// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseUserReminderViewCollectionPage;
import com.microsoft.graph.requests.generated.BaseUserReminderViewCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the User Reminder View Collection Page.
 */
public class UserReminderViewCollectionPage extends BaseUserReminderViewCollectionPage implements IUserReminderViewCollectionPage {

    /**
     * A collection page for User.
     *
     * @param response the serialized BaseUserReminderViewCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserReminderViewCollectionPage(final BaseUserReminderViewCollectionResponse response, final IUserReminderViewCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
