// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.DriveRecipient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseDriveItemInviteCollectionRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Drive Item Invite Collection Request Builder.
 */
public class DriveItemInviteCollectionRequestBuilder extends BaseDriveItemInviteCollectionRequestBuilder implements IDriveItemInviteCollectionRequestBuilder {

    /**
     * The request builder for this collection of DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param requireSignIn the requireSignIn
     * @param roles the roles
     * @param sendInvitation the sendInvitation
     * @param message the message
     * @param recipients the recipients
     */
    public DriveItemInviteCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Boolean requireSignIn, final java.util.List<String> roles, final Boolean sendInvitation, final String message, final java.util.List<DriveRecipient> recipients) {
        super(requestUrl, client, requestOptions, requireSignIn, roles, sendInvitation, message, recipients);
    }
}
