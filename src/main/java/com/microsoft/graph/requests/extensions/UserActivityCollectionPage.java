// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseUserActivityCollectionPage;
import com.microsoft.graph.requests.generated.BaseUserActivityCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the User Activity Collection Page.
 */
public class UserActivityCollectionPage extends BaseUserActivityCollectionPage implements IUserActivityCollectionPage {

    /**
     * A collection page for User.
     *
     * @param response the serialized BaseUserActivityCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public UserActivityCollectionPage(final BaseUserActivityCollectionResponse response, final IUserActivityCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
