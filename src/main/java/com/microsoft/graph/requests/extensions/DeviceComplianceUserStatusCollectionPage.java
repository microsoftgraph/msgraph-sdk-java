// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceComplianceUserStatusCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceComplianceUserStatusCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Compliance User Status Collection Page.
 */
public class DeviceComplianceUserStatusCollectionPage extends BaseDeviceComplianceUserStatusCollectionPage implements IDeviceComplianceUserStatusCollectionPage {

    /**
     * A collection page for DeviceCompliancePolicy.
     *
     * @param response the serialized BaseDeviceComplianceUserStatusCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DeviceComplianceUserStatusCollectionPage(final BaseDeviceComplianceUserStatusCollectionResponse response, final IDeviceComplianceUserStatusCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
