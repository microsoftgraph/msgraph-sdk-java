// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PlannerPlan;
import com.microsoft.graph.requests.extensions.IPlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PlannerPlanCollectionPage;
import com.microsoft.graph.requests.extensions.PlannerPlanCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Plan Collection Page.
 */
public class PlannerPlanCollectionPage extends BaseCollectionPage<PlannerPlan, IPlannerPlanCollectionRequestBuilder> implements IPlannerPlanCollectionPage {

    /**
     * A collection page for PlannerPlan
     *
     * @param response the serialized PlannerPlanCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PlannerPlanCollectionPage(final PlannerPlanCollectionResponse response, final IPlannerPlanCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}