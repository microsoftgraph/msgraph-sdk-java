// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDirectoryObjectGetByIdsCollectionPage;
import com.microsoft.graph.requests.generated.BaseDirectoryObjectGetByIdsCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Directory Object Get By Ids Collection Page.
 */
public class DirectoryObjectGetByIdsCollectionPage extends BaseDirectoryObjectGetByIdsCollectionPage implements IDirectoryObjectGetByIdsCollectionPage {

    /**
     * A collection page for DirectoryObject.
     *
     * @param response the serialized BaseDirectoryObjectGetByIdsCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DirectoryObjectGetByIdsCollectionPage(final BaseDirectoryObjectGetByIdsCollectionResponse response, final IDirectoryObjectGetByIdsCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
