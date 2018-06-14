// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseMobileAppAssignmentCollectionPage;
import com.microsoft.graph.requests.generated.BaseMobileAppAssignmentCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Mobile App Assignment Collection Page.
 */
public class MobileAppAssignmentCollectionPage extends BaseMobileAppAssignmentCollectionPage implements IMobileAppAssignmentCollectionPage {

    /**
     * A collection page for MobileApp.
     *
     * @param response the serialized BaseMobileAppAssignmentCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public MobileAppAssignmentCollectionPage(final BaseMobileAppAssignmentCollectionResponse response, final IMobileAppAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
