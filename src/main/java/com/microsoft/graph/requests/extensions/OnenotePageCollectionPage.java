// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseOnenotePageCollectionPage;
import com.microsoft.graph.requests.generated.BaseOnenotePageCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Onenote Page Collection Page.
 */
public class OnenotePageCollectionPage extends BaseOnenotePageCollectionPage implements IOnenotePageCollectionPage {

    /**
     * A collection page for OnenoteSection.
     *
     * @param response the serialized BaseOnenotePageCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public OnenotePageCollectionPage(final BaseOnenotePageCollectionResponse response, final IOnenotePageCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
