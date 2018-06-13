// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseWindowsInformationProtectionNetworkLearningSummaryCollectionPage;
import com.microsoft.graph.requests.generated.BaseWindowsInformationProtectionNetworkLearningSummaryCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Windows Information Protection Network Learning Summary Collection Page.
 */
public class WindowsInformationProtectionNetworkLearningSummaryCollectionPage extends BaseWindowsInformationProtectionNetworkLearningSummaryCollectionPage implements IWindowsInformationProtectionNetworkLearningSummaryCollectionPage {

    /**
     * A collection page for DeviceManagement.
     *
     * @param response the serialized BaseWindowsInformationProtectionNetworkLearningSummaryCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public WindowsInformationProtectionNetworkLearningSummaryCollectionPage(final BaseWindowsInformationProtectionNetworkLearningSummaryCollectionResponse response, final IWindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
