// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BasePlannerBucketCollectionRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Planner Bucket Collection Request.
 */
public class PlannerBucketCollectionRequest extends BasePlannerBucketCollectionRequest implements IPlannerBucketCollectionRequest {

    /**
     * The request for this collection of Planner
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerBucketCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
}
