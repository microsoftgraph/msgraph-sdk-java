// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDirectoryObjectCollectionResponse;
import com.microsoft.graph.requests.generated.BaseDirectoryObjectCollectionWithReferencesPage;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Directory Object Collection With References Page.
 */
public class DirectoryObjectCollectionWithReferencesPage extends BaseDirectoryObjectCollectionWithReferencesPage implements IDirectoryObjectCollectionWithReferencesPage {

    /**
     * A collection page for User.
     *
     * @param response the serialized BaseDirectoryObjectCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DirectoryObjectCollectionWithReferencesPage(final BaseDirectoryObjectCollectionResponse response, final IDirectoryObjectCollectionWithReferencesRequestBuilder builder) {
        super(response, builder);
    }
}
