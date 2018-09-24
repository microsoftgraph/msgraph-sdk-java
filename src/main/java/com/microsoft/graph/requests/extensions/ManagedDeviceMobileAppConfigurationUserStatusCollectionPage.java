// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseManagedDeviceMobileAppConfigurationUserStatusCollectionPage;
import com.microsoft.graph.requests.generated.BaseManagedDeviceMobileAppConfigurationUserStatusCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed Device Mobile App Configuration User Status Collection Page.
 */
public class ManagedDeviceMobileAppConfigurationUserStatusCollectionPage extends BaseManagedDeviceMobileAppConfigurationUserStatusCollectionPage implements IManagedDeviceMobileAppConfigurationUserStatusCollectionPage {

    /**
     * A collection page for ManagedDeviceMobileAppConfiguration.
     *
     * @param response the serialized BaseManagedDeviceMobileAppConfigurationUserStatusCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ManagedDeviceMobileAppConfigurationUserStatusCollectionPage(final BaseManagedDeviceMobileAppConfigurationUserStatusCollectionResponse response, final IManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
