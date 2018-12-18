// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseTeamsTabCollectionPage;
import com.microsoft.graph.requests.generated.BaseTeamsTabCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Teams Tab Collection Page.
 */
public class TeamsTabCollectionPage extends BaseTeamsTabCollectionPage implements ITeamsTabCollectionPage {

    /**
     * A collection page for Channel.
     *
     * @param response the serialized BaseTeamsTabCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public TeamsTabCollectionPage(final BaseTeamsTabCollectionResponse response, final ITeamsTabCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
