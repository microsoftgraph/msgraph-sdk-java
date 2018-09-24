// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseSectionGroupCollectionPage;
import com.microsoft.graph.requests.generated.BaseSectionGroupCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Section Group Collection Page.
 */
public class SectionGroupCollectionPage extends BaseSectionGroupCollectionPage implements ISectionGroupCollectionPage {

    /**
     * A collection page for SectionGroup.
     *
     * @param response the serialized BaseSectionGroupCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public SectionGroupCollectionPage(final BaseSectionGroupCollectionResponse response, final ISectionGroupCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
