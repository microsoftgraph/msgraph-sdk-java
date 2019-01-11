// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseMobileAppCategoryCollectionResponse;
import com.microsoft.graph.requests.generated.BaseMobileAppCategoryCollectionWithReferencesPage;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Mobile App Category Collection With References Page.
 */
public class MobileAppCategoryCollectionWithReferencesPage extends BaseMobileAppCategoryCollectionWithReferencesPage implements IMobileAppCategoryCollectionWithReferencesPage {

    /**
     * A collection page for MobileApp.
     *
     * @param response the serialized BaseMobileAppCategoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MobileAppCategoryCollectionWithReferencesPage(final BaseMobileAppCategoryCollectionResponse response, final IMobileAppCategoryCollectionWithReferencesRequestBuilder builder) {
        super(response, builder);
    }
}
