// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseTeamCollectionPage;
import com.microsoft.graph.requests.generated.BaseTeamCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Team Collection Page.
 */
public class TeamCollectionPage extends BaseTeamCollectionPage implements ITeamCollectionPage {

    /**
     * A collection page for Team.
     *
     * @param response the serialized BaseTeamCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public TeamCollectionPage(final BaseTeamCollectionResponse response, final ITeamCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
