// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BasePlannerBucketCollectionPage;
import com.microsoft.graph.requests.generated.BasePlannerBucketCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Planner Bucket Collection Page.
 */
public class PlannerBucketCollectionPage extends BasePlannerBucketCollectionPage implements IPlannerBucketCollectionPage {

    /**
     * A collection page for Planner.
     *
     * @param response the serialized BasePlannerBucketCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public PlannerBucketCollectionPage(final BasePlannerBucketCollectionResponse response, final IPlannerBucketCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
