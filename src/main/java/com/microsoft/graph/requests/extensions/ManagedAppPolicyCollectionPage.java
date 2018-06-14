// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseManagedAppPolicyCollectionPage;
import com.microsoft.graph.requests.generated.BaseManagedAppPolicyCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed App Policy Collection Page.
 */
public class ManagedAppPolicyCollectionPage extends BaseManagedAppPolicyCollectionPage implements IManagedAppPolicyCollectionPage {

    /**
     * A collection page for DeviceAppManagement.
     *
     * @param response the serialized BaseManagedAppPolicyCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ManagedAppPolicyCollectionPage(final BaseManagedAppPolicyCollectionResponse response, final IManagedAppPolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
