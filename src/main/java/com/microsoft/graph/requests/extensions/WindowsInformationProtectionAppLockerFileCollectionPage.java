// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseWindowsInformationProtectionAppLockerFileCollectionPage;
import com.microsoft.graph.requests.generated.BaseWindowsInformationProtectionAppLockerFileCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Windows Information Protection App Locker File Collection Page.
 */
public class WindowsInformationProtectionAppLockerFileCollectionPage extends BaseWindowsInformationProtectionAppLockerFileCollectionPage implements IWindowsInformationProtectionAppLockerFileCollectionPage {

    /**
     * A collection page for WindowsInformationProtection.
     *
     * @param response the serialized BaseWindowsInformationProtectionAppLockerFileCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public WindowsInformationProtectionAppLockerFileCollectionPage(final BaseWindowsInformationProtectionAppLockerFileCollectionResponse response, final IWindowsInformationProtectionAppLockerFileCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
