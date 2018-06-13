// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BasePlannerTaskCollectionPage;
import com.microsoft.graph.requests.generated.BasePlannerTaskCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Planner Task Collection Page.
 */
public class PlannerTaskCollectionPage extends BasePlannerTaskCollectionPage implements IPlannerTaskCollectionPage {

    /**
     * A collection page for PlannerBucket.
     *
     * @param response the serialized BasePlannerTaskCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public PlannerTaskCollectionPage(final BasePlannerTaskCollectionResponse response, final IPlannerTaskCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
