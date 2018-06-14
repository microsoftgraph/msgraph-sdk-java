// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseTargetedManagedAppConfigurationCollectionPage;
import com.microsoft.graph.requests.generated.BaseTargetedManagedAppConfigurationCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Targeted Managed App Configuration Collection Page.
 */
public class TargetedManagedAppConfigurationCollectionPage extends BaseTargetedManagedAppConfigurationCollectionPage implements ITargetedManagedAppConfigurationCollectionPage {

    /**
     * A collection page for DeviceAppManagement.
     *
     * @param response the serialized BaseTargetedManagedAppConfigurationCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public TargetedManagedAppConfigurationCollectionPage(final BaseTargetedManagedAppConfigurationCollectionResponse response, final ITargetedManagedAppConfigurationCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
