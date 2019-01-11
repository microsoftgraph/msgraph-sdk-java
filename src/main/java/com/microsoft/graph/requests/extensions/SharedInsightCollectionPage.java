// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseSharedInsightCollectionPage;
import com.microsoft.graph.requests.generated.BaseSharedInsightCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Shared Insight Collection Page.
 */
public class SharedInsightCollectionPage extends BaseSharedInsightCollectionPage implements ISharedInsightCollectionPage {

    /**
     * A collection page for OfficeGraphInsights.
     *
     * @param response the serialized BaseSharedInsightCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public SharedInsightCollectionPage(final BaseSharedInsightCollectionResponse response, final ISharedInsightCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
