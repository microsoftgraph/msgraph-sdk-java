// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.PlannerBucketTaskBoardTaskFormat;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BasePlannerBucketTaskBoardTaskFormatRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Planner Bucket Task Board Task Format Request.
 */
public class PlannerBucketTaskBoardTaskFormatRequest extends BasePlannerBucketTaskBoardTaskFormatRequest implements IPlannerBucketTaskBoardTaskFormatRequest {

    /**
     * The request for the PlannerBucketTaskBoardTaskFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerBucketTaskBoardTaskFormatRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerBucketTaskBoardTaskFormat.class);
    }
}
