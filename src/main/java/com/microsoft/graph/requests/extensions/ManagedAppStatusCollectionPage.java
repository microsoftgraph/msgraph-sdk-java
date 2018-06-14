// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseManagedAppStatusCollectionPage;
import com.microsoft.graph.requests.generated.BaseManagedAppStatusCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed App Status Collection Page.
 */
public class ManagedAppStatusCollectionPage extends BaseManagedAppStatusCollectionPage implements IManagedAppStatusCollectionPage {

    /**
     * A collection page for DeviceAppManagement.
     *
     * @param response the serialized BaseManagedAppStatusCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ManagedAppStatusCollectionPage(final BaseManagedAppStatusCollectionResponse response, final IManagedAppStatusCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
