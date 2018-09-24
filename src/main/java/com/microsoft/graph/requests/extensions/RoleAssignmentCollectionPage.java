// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.generated.BaseRoleAssignmentCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Role Assignment Collection Page.
 */
public class RoleAssignmentCollectionPage extends BaseRoleAssignmentCollectionPage implements IRoleAssignmentCollectionPage {

    /**
     * A collection page for RoleDefinition.
     *
     * @param response the serialized BaseRoleAssignmentCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public RoleAssignmentCollectionPage(final BaseRoleAssignmentCollectionResponse response, final IRoleAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
