// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDefaultManagedAppProtectionCollectionPage;
import com.microsoft.graph.requests.generated.BaseDefaultManagedAppProtectionCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Default Managed App Protection Collection Page.
 */
public class DefaultManagedAppProtectionCollectionPage extends BaseDefaultManagedAppProtectionCollectionPage implements IDefaultManagedAppProtectionCollectionPage {

    /**
     * A collection page for DeviceAppManagement.
     *
     * @param response the serialized BaseDefaultManagedAppProtectionCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DefaultManagedAppProtectionCollectionPage(final BaseDefaultManagedAppProtectionCollectionResponse response, final IDefaultManagedAppProtectionCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
