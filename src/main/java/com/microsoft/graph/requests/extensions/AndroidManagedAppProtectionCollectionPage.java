// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseAndroidManagedAppProtectionCollectionPage;
import com.microsoft.graph.requests.generated.BaseAndroidManagedAppProtectionCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Android Managed App Protection Collection Page.
 */
public class AndroidManagedAppProtectionCollectionPage extends BaseAndroidManagedAppProtectionCollectionPage implements IAndroidManagedAppProtectionCollectionPage {

    /**
     * A collection page for DeviceAppManagement.
     *
     * @param response the serialized BaseAndroidManagedAppProtectionCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public AndroidManagedAppProtectionCollectionPage(final BaseAndroidManagedAppProtectionCollectionResponse response, final IAndroidManagedAppProtectionCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
