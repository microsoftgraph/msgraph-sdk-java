// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Collection Page.
 */
public class DeviceCollectionPage extends BaseDeviceCollectionPage implements IDeviceCollectionPage {

    /**
     * A collection page for Device.
     *
     * @param response the serialized BaseDeviceCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DeviceCollectionPage(final BaseDeviceCollectionResponse response, final IDeviceCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
