// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceComplianceScheduledActionForRuleCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceComplianceScheduledActionForRuleCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Compliance Scheduled Action For Rule Collection Page.
 */
public class DeviceComplianceScheduledActionForRuleCollectionPage extends BaseDeviceComplianceScheduledActionForRuleCollectionPage implements IDeviceComplianceScheduledActionForRuleCollectionPage {

    /**
     * A collection page for DeviceCompliancePolicy.
     *
     * @param response the serialized BaseDeviceComplianceScheduledActionForRuleCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DeviceComplianceScheduledActionForRuleCollectionPage(final BaseDeviceComplianceScheduledActionForRuleCollectionResponse response, final IDeviceComplianceScheduledActionForRuleCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
