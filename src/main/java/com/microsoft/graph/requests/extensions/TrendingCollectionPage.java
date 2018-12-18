// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseTrendingCollectionPage;
import com.microsoft.graph.requests.generated.BaseTrendingCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Trending Collection Page.
 */
public class TrendingCollectionPage extends BaseTrendingCollectionPage implements ITrendingCollectionPage {

    /**
     * A collection page for OfficeGraphInsights.
     *
     * @param response the serialized BaseTrendingCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public TrendingCollectionPage(final BaseTrendingCollectionResponse response, final ITrendingCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
