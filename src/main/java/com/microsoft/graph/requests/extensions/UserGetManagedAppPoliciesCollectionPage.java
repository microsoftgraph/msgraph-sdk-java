// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseUserGetManagedAppPoliciesCollectionPage;
import com.microsoft.graph.requests.generated.BaseUserGetManagedAppPoliciesCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the User Get Managed App Policies Collection Page.
 */
public class UserGetManagedAppPoliciesCollectionPage extends BaseUserGetManagedAppPoliciesCollectionPage implements IUserGetManagedAppPoliciesCollectionPage {

    /**
     * A collection page for User.
     *
     * @param response the serialized BaseUserGetManagedAppPoliciesCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserGetManagedAppPoliciesCollectionPage(final BaseUserGetManagedAppPoliciesCollectionResponse response, final IUserGetManagedAppPoliciesCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
