// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage;
import com.microsoft.graph.requests.generated.BaseManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed App Registration Get User Ids With Flagged App Registration Collection Page.
 */
public class ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage extends BaseManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage implements IManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage {

    /**
     * A collection page for ManagedAppRegistration.
     *
     * @param response the serialized BaseManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage(final BaseManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionResponse response, final IManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
