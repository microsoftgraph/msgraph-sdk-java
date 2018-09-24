// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceCompliancePolicySettingStateSummaryCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceCompliancePolicySettingStateSummaryCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Compliance Policy Setting State Summary Collection Page.
 */
public class DeviceCompliancePolicySettingStateSummaryCollectionPage extends BaseDeviceCompliancePolicySettingStateSummaryCollectionPage implements IDeviceCompliancePolicySettingStateSummaryCollectionPage {

    /**
     * A collection page for DeviceManagement.
     *
     * @param response the serialized BaseDeviceCompliancePolicySettingStateSummaryCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DeviceCompliancePolicySettingStateSummaryCollectionPage(final BaseDeviceCompliancePolicySettingStateSummaryCollectionResponse response, final IDeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
