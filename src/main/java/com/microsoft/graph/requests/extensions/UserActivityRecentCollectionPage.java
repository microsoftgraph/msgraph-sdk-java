// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseUserActivityRecentCollectionPage;
import com.microsoft.graph.requests.generated.BaseUserActivityRecentCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the User Activity Recent Collection Page.
 */
public class UserActivityRecentCollectionPage extends BaseUserActivityRecentCollectionPage implements IUserActivityRecentCollectionPage {

    /**
     * A collection page for UserActivity.
     *
     * @param response the serialized BaseUserActivityRecentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserActivityRecentCollectionPage(final BaseUserActivityRecentCollectionResponse response, final IUserActivityRecentCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
