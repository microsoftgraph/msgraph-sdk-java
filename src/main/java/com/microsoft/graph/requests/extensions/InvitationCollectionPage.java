// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseInvitationCollectionPage;
import com.microsoft.graph.requests.generated.BaseInvitationCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Invitation Collection Page.
 */
public class InvitationCollectionPage extends BaseInvitationCollectionPage implements IInvitationCollectionPage {

    /**
     * A collection page for Invitation.
     *
     * @param response the serialized BaseInvitationCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public InvitationCollectionPage(final BaseInvitationCollectionResponse response, final IInvitationCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
