// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseWindowsInformationProtectionPolicyCollectionPage;
import com.microsoft.graph.requests.generated.BaseWindowsInformationProtectionPolicyCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Windows Information Protection Policy Collection Page.
 */
public class WindowsInformationProtectionPolicyCollectionPage extends BaseWindowsInformationProtectionPolicyCollectionPage implements IWindowsInformationProtectionPolicyCollectionPage {

    /**
     * A collection page for DeviceAppManagement.
     *
     * @param response the serialized BaseWindowsInformationProtectionPolicyCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public WindowsInformationProtectionPolicyCollectionPage(final BaseWindowsInformationProtectionPolicyCollectionResponse response, final IWindowsInformationProtectionPolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
