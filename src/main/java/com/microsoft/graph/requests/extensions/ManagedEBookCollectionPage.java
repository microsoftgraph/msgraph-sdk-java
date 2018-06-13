// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseManagedEBookCollectionPage;
import com.microsoft.graph.requests.generated.BaseManagedEBookCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed EBook Collection Page.
 */
public class ManagedEBookCollectionPage extends BaseManagedEBookCollectionPage implements IManagedEBookCollectionPage {

    /**
     * A collection page for DeviceAppManagement.
     *
     * @param response the serialized BaseManagedEBookCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ManagedEBookCollectionPage(final BaseManagedEBookCollectionResponse response, final IManagedEBookCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
