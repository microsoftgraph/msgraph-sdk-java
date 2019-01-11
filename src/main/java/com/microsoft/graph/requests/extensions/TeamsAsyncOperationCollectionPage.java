// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseTeamsAsyncOperationCollectionPage;
import com.microsoft.graph.requests.generated.BaseTeamsAsyncOperationCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Teams Async Operation Collection Page.
 */
public class TeamsAsyncOperationCollectionPage extends BaseTeamsAsyncOperationCollectionPage implements ITeamsAsyncOperationCollectionPage {

    /**
     * A collection page for Team.
     *
     * @param response the serialized BaseTeamsAsyncOperationCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public TeamsAsyncOperationCollectionPage(final BaseTeamsAsyncOperationCollectionResponse response, final ITeamsAsyncOperationCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
