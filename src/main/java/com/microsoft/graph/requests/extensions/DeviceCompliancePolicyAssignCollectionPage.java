// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceCompliancePolicyAssignCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceCompliancePolicyAssignCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Compliance Policy Assign Collection Page.
 */
public class DeviceCompliancePolicyAssignCollectionPage extends BaseDeviceCompliancePolicyAssignCollectionPage implements IDeviceCompliancePolicyAssignCollectionPage {

    /**
     * A collection page for DeviceCompliancePolicy.
     *
     * @param response the serialized BaseDeviceCompliancePolicyAssignCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceCompliancePolicyAssignCollectionPage(final BaseDeviceCompliancePolicyAssignCollectionResponse response, final IDeviceCompliancePolicyAssignCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
