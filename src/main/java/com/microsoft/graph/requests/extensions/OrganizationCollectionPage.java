// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseOrganizationCollectionPage;
import com.microsoft.graph.requests.generated.BaseOrganizationCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Organization Collection Page.
 */
public class OrganizationCollectionPage extends BaseOrganizationCollectionPage implements IOrganizationCollectionPage {

    /**
     * A collection page for Organization.
     *
     * @param response the serialized BaseOrganizationCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public OrganizationCollectionPage(final BaseOrganizationCollectionResponse response, final IOrganizationCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
