// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseManagedDeviceMobileAppConfigurationAssignmentCollectionPage;
import com.microsoft.graph.requests.generated.BaseManagedDeviceMobileAppConfigurationAssignmentCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed Device Mobile App Configuration Assignment Collection Page.
 */
public class ManagedDeviceMobileAppConfigurationAssignmentCollectionPage extends BaseManagedDeviceMobileAppConfigurationAssignmentCollectionPage implements IManagedDeviceMobileAppConfigurationAssignmentCollectionPage {

    /**
     * A collection page for ManagedDeviceMobileAppConfiguration.
     *
     * @param response the serialized BaseManagedDeviceMobileAppConfigurationAssignmentCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ManagedDeviceMobileAppConfigurationAssignmentCollectionPage(final BaseManagedDeviceMobileAppConfigurationAssignmentCollectionResponse response, final IManagedDeviceMobileAppConfigurationAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
