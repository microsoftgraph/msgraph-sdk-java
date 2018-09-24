// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseMobileAppContentCollectionPage;
import com.microsoft.graph.requests.generated.BaseMobileAppContentCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Mobile App Content Collection Page.
 */
public class MobileAppContentCollectionPage extends BaseMobileAppContentCollectionPage implements IMobileAppContentCollectionPage {

    /**
     * A collection page for MobileLobApp.
     *
     * @param response the serialized BaseMobileAppContentCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public MobileAppContentCollectionPage(final BaseMobileAppContentCollectionResponse response, final IMobileAppContentCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
