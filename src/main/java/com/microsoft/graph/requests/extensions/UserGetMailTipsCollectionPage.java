// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseUserGetMailTipsCollectionPage;
import com.microsoft.graph.requests.generated.BaseUserGetMailTipsCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the User Get Mail Tips Collection Page.
 */
public class UserGetMailTipsCollectionPage extends BaseUserGetMailTipsCollectionPage implements IUserGetMailTipsCollectionPage {

    /**
     * A collection page for User.
     *
     * @param response the serialized BaseUserGetMailTipsCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserGetMailTipsCollectionPage(final BaseUserGetMailTipsCollectionResponse response, final IUserGetMailTipsCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
