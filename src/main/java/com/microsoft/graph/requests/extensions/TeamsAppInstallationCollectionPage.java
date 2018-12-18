// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseTeamsAppInstallationCollectionPage;
import com.microsoft.graph.requests.generated.BaseTeamsAppInstallationCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Teams App Installation Collection Page.
 */
public class TeamsAppInstallationCollectionPage extends BaseTeamsAppInstallationCollectionPage implements ITeamsAppInstallationCollectionPage {

    /**
     * A collection page for Team.
     *
     * @param response the serialized BaseTeamsAppInstallationCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public TeamsAppInstallationCollectionPage(final BaseTeamsAppInstallationCollectionResponse response, final ITeamsAppInstallationCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
