// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseManagedAppRegistrationCollectionResponse;
import com.microsoft.graph.requests.generated.BaseManagedAppRegistrationCollectionWithReferencesPage;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed App Registration Collection With References Page.
 */
public class ManagedAppRegistrationCollectionWithReferencesPage extends BaseManagedAppRegistrationCollectionWithReferencesPage implements IManagedAppRegistrationCollectionWithReferencesPage {

    /**
     * A collection page for User.
     *
     * @param response the serialized BaseManagedAppRegistrationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedAppRegistrationCollectionWithReferencesPage(final BaseManagedAppRegistrationCollectionResponse response, final IManagedAppRegistrationCollectionWithReferencesRequestBuilder builder) {
        super(response, builder);
    }
}
