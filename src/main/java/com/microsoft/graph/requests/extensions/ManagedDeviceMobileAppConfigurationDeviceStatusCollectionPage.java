// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage;
import com.microsoft.graph.requests.generated.BaseManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed Device Mobile App Configuration Device Status Collection Page.
 */
public class ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage extends BaseManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage implements IManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage {

    /**
     * A collection page for ManagedDeviceMobileAppConfiguration.
     *
     * @param response the serialized BaseManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage(final BaseManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse response, final IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
