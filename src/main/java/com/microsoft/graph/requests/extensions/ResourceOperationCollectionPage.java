// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseResourceOperationCollectionPage;
import com.microsoft.graph.requests.generated.BaseResourceOperationCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Resource Operation Collection Page.
 */
public class ResourceOperationCollectionPage extends BaseResourceOperationCollectionPage implements IResourceOperationCollectionPage {

    /**
     * A collection page for DeviceManagement.
     *
     * @param response the serialized BaseResourceOperationCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ResourceOperationCollectionPage(final BaseResourceOperationCollectionResponse response, final IResourceOperationCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
