// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseUserDeltaCollectionPage;
import com.microsoft.graph.requests.generated.BaseUserDeltaCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the User Delta Collection Page.
 */
public class UserDeltaCollectionPage extends BaseUserDeltaCollectionPage implements IUserDeltaCollectionPage {

    /**
     * A collection page for User.
     *
     * @param response the serialized BaseUserDeltaCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserDeltaCollectionPage(final BaseUserDeltaCollectionResponse response, final IUserDeltaCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
