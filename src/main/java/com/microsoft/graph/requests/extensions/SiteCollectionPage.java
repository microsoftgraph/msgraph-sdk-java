// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseSiteCollectionPage;
import com.microsoft.graph.requests.generated.BaseSiteCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Site Collection Page.
 */
public class SiteCollectionPage extends BaseSiteCollectionPage implements ISiteCollectionPage {

    /**
     * A collection page for Site.
     *
     * @param response the serialized BaseSiteCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public SiteCollectionPage(final BaseSiteCollectionResponse response, final ISiteCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
