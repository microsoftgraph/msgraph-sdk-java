// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseUserCollectionPage;
import com.microsoft.graph.requests.generated.BaseUserCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the User Collection Page.
 */
public class UserCollectionPage extends BaseUserCollectionPage implements IUserCollectionPage {

    /**
     * A collection page for User.
     *
     * @param response the serialized BaseUserCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public UserCollectionPage(final BaseUserCollectionResponse response, final IUserCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
