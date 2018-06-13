// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDetectedAppCollectionPage;
import com.microsoft.graph.requests.generated.BaseDetectedAppCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Detected App Collection Page.
 */
public class DetectedAppCollectionPage extends BaseDetectedAppCollectionPage implements IDetectedAppCollectionPage {

    /**
     * A collection page for DeviceManagement.
     *
     * @param response the serialized BaseDetectedAppCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DetectedAppCollectionPage(final BaseDetectedAppCollectionResponse response, final IDetectedAppCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
