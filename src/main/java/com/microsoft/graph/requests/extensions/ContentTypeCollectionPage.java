// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseContentTypeCollectionPage;
import com.microsoft.graph.requests.generated.BaseContentTypeCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Content Type Collection Page.
 */
public class ContentTypeCollectionPage extends BaseContentTypeCollectionPage implements IContentTypeCollectionPage {

    /**
     * A collection page for List.
     *
     * @param response the serialized BaseContentTypeCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ContentTypeCollectionPage(final BaseContentTypeCollectionResponse response, final IContentTypeCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
