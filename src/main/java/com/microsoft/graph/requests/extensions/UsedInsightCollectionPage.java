// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseUsedInsightCollectionPage;
import com.microsoft.graph.requests.generated.BaseUsedInsightCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Used Insight Collection Page.
 */
public class UsedInsightCollectionPage extends BaseUsedInsightCollectionPage implements IUsedInsightCollectionPage {

    /**
     * A collection page for OfficeGraphInsights.
     *
     * @param response the serialized BaseUsedInsightCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public UsedInsightCollectionPage(final BaseUsedInsightCollectionResponse response, final IUsedInsightCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
