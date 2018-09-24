// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceCompliancePolicyCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceCompliancePolicyCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Compliance Policy Collection Page.
 */
public class DeviceCompliancePolicyCollectionPage extends BaseDeviceCompliancePolicyCollectionPage implements IDeviceCompliancePolicyCollectionPage {

    /**
     * A collection page for DeviceManagement.
     *
     * @param response the serialized BaseDeviceCompliancePolicyCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DeviceCompliancePolicyCollectionPage(final BaseDeviceCompliancePolicyCollectionResponse response, final IDeviceCompliancePolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
