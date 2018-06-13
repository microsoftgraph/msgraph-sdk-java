// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseManagedDeviceCollectionResponse;
import com.microsoft.graph.requests.generated.BaseManagedDeviceCollectionWithReferencesPage;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed Device Collection With References Page.
 */
public class ManagedDeviceCollectionWithReferencesPage extends BaseManagedDeviceCollectionWithReferencesPage implements IManagedDeviceCollectionWithReferencesPage {

    /**
     * A collection page for DetectedApp.
     *
     * @param response the serialized BaseManagedDeviceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedDeviceCollectionWithReferencesPage(final BaseManagedDeviceCollectionResponse response, final IManagedDeviceCollectionWithReferencesRequestBuilder builder) {
        super(response, builder);
    }
}
