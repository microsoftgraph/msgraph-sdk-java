// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseOnenoteSectionCollectionPage;
import com.microsoft.graph.requests.generated.BaseOnenoteSectionCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Onenote Section Collection Page.
 */
public class OnenoteSectionCollectionPage extends BaseOnenoteSectionCollectionPage implements IOnenoteSectionCollectionPage {

    /**
     * A collection page for SectionGroup.
     *
     * @param response the serialized BaseOnenoteSectionCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public OnenoteSectionCollectionPage(final BaseOnenoteSectionCollectionResponse response, final IOnenoteSectionCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
