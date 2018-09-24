// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BasePlannerPlanCollectionPage;
import com.microsoft.graph.requests.generated.BasePlannerPlanCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Planner Plan Collection Page.
 */
public class PlannerPlanCollectionPage extends BasePlannerPlanCollectionPage implements IPlannerPlanCollectionPage {

    /**
     * A collection page for Planner.
     *
     * @param response the serialized BasePlannerPlanCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public PlannerPlanCollectionPage(final BasePlannerPlanCollectionResponse response, final IPlannerPlanCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
