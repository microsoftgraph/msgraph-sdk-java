// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseOnenoteResourceCollectionPage;
import com.microsoft.graph.requests.generated.BaseOnenoteResourceCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Onenote Resource Collection Page.
 */
public class OnenoteResourceCollectionPage extends BaseOnenoteResourceCollectionPage implements IOnenoteResourceCollectionPage {

    /**
     * A collection page for Onenote.
     *
     * @param response the serialized BaseOnenoteResourceCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public OnenoteResourceCollectionPage(final BaseOnenoteResourceCollectionResponse response, final IOnenoteResourceCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
