// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseManagedDeviceCollectionPage;
import com.microsoft.graph.requests.generated.BaseManagedDeviceCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed Device Collection Page.
 */
public class ManagedDeviceCollectionPage extends BaseManagedDeviceCollectionPage implements IManagedDeviceCollectionPage {

    /**
     * A collection page for DeviceManagement.
     *
     * @param response the serialized BaseManagedDeviceCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ManagedDeviceCollectionPage(final BaseManagedDeviceCollectionResponse response, final IManagedDeviceCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
