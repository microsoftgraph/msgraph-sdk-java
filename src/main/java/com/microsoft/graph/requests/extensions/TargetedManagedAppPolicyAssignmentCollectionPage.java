// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseTargetedManagedAppPolicyAssignmentCollectionPage;
import com.microsoft.graph.requests.generated.BaseTargetedManagedAppPolicyAssignmentCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Targeted Managed App Policy Assignment Collection Page.
 */
public class TargetedManagedAppPolicyAssignmentCollectionPage extends BaseTargetedManagedAppPolicyAssignmentCollectionPage implements ITargetedManagedAppPolicyAssignmentCollectionPage {

    /**
     * A collection page for WindowsInformationProtection.
     *
     * @param response the serialized BaseTargetedManagedAppPolicyAssignmentCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public TargetedManagedAppPolicyAssignmentCollectionPage(final BaseTargetedManagedAppPolicyAssignmentCollectionResponse response, final ITargetedManagedAppPolicyAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
