// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceCompliancePolicyAssignmentCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceCompliancePolicyAssignmentCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Compliance Policy Assignment Collection Page.
 */
public class DeviceCompliancePolicyAssignmentCollectionPage extends BaseDeviceCompliancePolicyAssignmentCollectionPage implements IDeviceCompliancePolicyAssignmentCollectionPage {

    /**
     * A collection page for DeviceCompliancePolicy.
     *
     * @param response the serialized BaseDeviceCompliancePolicyAssignmentCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DeviceCompliancePolicyAssignmentCollectionPage(final BaseDeviceCompliancePolicyAssignmentCollectionResponse response, final IDeviceCompliancePolicyAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
