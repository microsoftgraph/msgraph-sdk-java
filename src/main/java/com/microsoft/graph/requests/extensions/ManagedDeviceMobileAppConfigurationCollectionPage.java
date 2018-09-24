// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseManagedDeviceMobileAppConfigurationCollectionPage;
import com.microsoft.graph.requests.generated.BaseManagedDeviceMobileAppConfigurationCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed Device Mobile App Configuration Collection Page.
 */
public class ManagedDeviceMobileAppConfigurationCollectionPage extends BaseManagedDeviceMobileAppConfigurationCollectionPage implements IManagedDeviceMobileAppConfigurationCollectionPage {

    /**
     * A collection page for DeviceAppManagement.
     *
     * @param response the serialized BaseManagedDeviceMobileAppConfigurationCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ManagedDeviceMobileAppConfigurationCollectionPage(final BaseManagedDeviceMobileAppConfigurationCollectionResponse response, final IManagedDeviceMobileAppConfigurationCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
