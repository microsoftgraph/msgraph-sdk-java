// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseManagedMobileAppCollectionPage;
import com.microsoft.graph.requests.generated.BaseManagedMobileAppCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed Mobile App Collection Page.
 */
public class ManagedMobileAppCollectionPage extends BaseManagedMobileAppCollectionPage implements IManagedMobileAppCollectionPage {

    /**
     * A collection page for TargetedManagedAppConfiguration.
     *
     * @param response the serialized BaseManagedMobileAppCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ManagedMobileAppCollectionPage(final BaseManagedMobileAppCollectionResponse response, final IManagedMobileAppCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
