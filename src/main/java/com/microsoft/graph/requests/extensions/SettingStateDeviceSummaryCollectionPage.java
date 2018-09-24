// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseSettingStateDeviceSummaryCollectionPage;
import com.microsoft.graph.requests.generated.BaseSettingStateDeviceSummaryCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Setting State Device Summary Collection Page.
 */
public class SettingStateDeviceSummaryCollectionPage extends BaseSettingStateDeviceSummaryCollectionPage implements ISettingStateDeviceSummaryCollectionPage {

    /**
     * A collection page for DeviceCompliancePolicy.
     *
     * @param response the serialized BaseSettingStateDeviceSummaryCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public SettingStateDeviceSummaryCollectionPage(final BaseSettingStateDeviceSummaryCollectionResponse response, final ISettingStateDeviceSummaryCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
