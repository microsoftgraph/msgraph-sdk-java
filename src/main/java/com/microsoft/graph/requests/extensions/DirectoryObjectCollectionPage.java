// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDirectoryObjectCollectionPage;
import com.microsoft.graph.requests.generated.BaseDirectoryObjectCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Directory Object Collection Page.
 */
public class DirectoryObjectCollectionPage extends BaseDirectoryObjectCollectionPage implements IDirectoryObjectCollectionPage {

    /**
     * A collection page for DirectoryObject.
     *
     * @param response the serialized BaseDirectoryObjectCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DirectoryObjectCollectionPage(final BaseDirectoryObjectCollectionResponse response, final IDirectoryObjectCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
