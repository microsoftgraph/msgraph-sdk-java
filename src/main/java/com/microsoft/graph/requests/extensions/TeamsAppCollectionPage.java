// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseTeamsAppCollectionPage;
import com.microsoft.graph.requests.generated.BaseTeamsAppCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Teams App Collection Page.
 */
public class TeamsAppCollectionPage extends BaseTeamsAppCollectionPage implements ITeamsAppCollectionPage {

    /**
     * A collection page for AppCatalogs.
     *
     * @param response the serialized BaseTeamsAppCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public TeamsAppCollectionPage(final BaseTeamsAppCollectionResponse response, final ITeamsAppCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
