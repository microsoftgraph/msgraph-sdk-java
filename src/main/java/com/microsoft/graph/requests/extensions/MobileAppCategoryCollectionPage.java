// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseMobileAppCategoryCollectionPage;
import com.microsoft.graph.requests.generated.BaseMobileAppCategoryCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Mobile App Category Collection Page.
 */
public class MobileAppCategoryCollectionPage extends BaseMobileAppCategoryCollectionPage implements IMobileAppCategoryCollectionPage {

    /**
     * A collection page for MobileApp.
     *
     * @param response the serialized BaseMobileAppCategoryCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public MobileAppCategoryCollectionPage(final BaseMobileAppCategoryCollectionResponse response, final IMobileAppCategoryCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
