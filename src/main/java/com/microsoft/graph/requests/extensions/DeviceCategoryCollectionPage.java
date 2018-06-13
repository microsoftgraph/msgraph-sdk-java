// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceCategoryCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceCategoryCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Category Collection Page.
 */
public class DeviceCategoryCollectionPage extends BaseDeviceCategoryCollectionPage implements IDeviceCategoryCollectionPage {

    /**
     * A collection page for DeviceManagement.
     *
     * @param response the serialized BaseDeviceCategoryCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DeviceCategoryCollectionPage(final BaseDeviceCategoryCollectionResponse response, final IDeviceCategoryCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
