// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseExtensionCollectionPage;
import com.microsoft.graph.requests.generated.BaseExtensionCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Extension Collection Page.
 */
public class ExtensionCollectionPage extends BaseExtensionCollectionPage implements IExtensionCollectionPage {

    /**
     * A collection page for Post.
     *
     * @param response the serialized BaseExtensionCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ExtensionCollectionPage(final BaseExtensionCollectionResponse response, final IExtensionCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
