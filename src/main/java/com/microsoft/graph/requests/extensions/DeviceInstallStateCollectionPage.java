// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceInstallStateCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceInstallStateCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Install State Collection Page.
 */
public class DeviceInstallStateCollectionPage extends BaseDeviceInstallStateCollectionPage implements IDeviceInstallStateCollectionPage {

    /**
     * A collection page for UserInstallStateSummary.
     *
     * @param response the serialized BaseDeviceInstallStateCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DeviceInstallStateCollectionPage(final BaseDeviceInstallStateCollectionResponse response, final IDeviceInstallStateCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
