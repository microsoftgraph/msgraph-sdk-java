// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseManagedAppRegistrationCollectionPage;
import com.microsoft.graph.requests.generated.BaseManagedAppRegistrationCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed App Registration Collection Page.
 */
public class ManagedAppRegistrationCollectionPage extends BaseManagedAppRegistrationCollectionPage implements IManagedAppRegistrationCollectionPage {

    /**
     * A collection page for DeviceAppManagement.
     *
     * @param response the serialized BaseManagedAppRegistrationCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ManagedAppRegistrationCollectionPage(final BaseManagedAppRegistrationCollectionResponse response, final IManagedAppRegistrationCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
