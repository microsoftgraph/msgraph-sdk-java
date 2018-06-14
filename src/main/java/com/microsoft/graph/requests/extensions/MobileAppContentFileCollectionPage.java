// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseMobileAppContentFileCollectionPage;
import com.microsoft.graph.requests.generated.BaseMobileAppContentFileCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Mobile App Content File Collection Page.
 */
public class MobileAppContentFileCollectionPage extends BaseMobileAppContentFileCollectionPage implements IMobileAppContentFileCollectionPage {

    /**
     * A collection page for MobileAppContent.
     *
     * @param response the serialized BaseMobileAppContentFileCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public MobileAppContentFileCollectionPage(final BaseMobileAppContentFileCollectionResponse response, final IMobileAppContentFileCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
