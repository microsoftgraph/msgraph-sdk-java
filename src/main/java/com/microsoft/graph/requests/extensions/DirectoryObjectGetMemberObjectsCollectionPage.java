// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDirectoryObjectGetMemberObjectsCollectionPage;
import com.microsoft.graph.requests.generated.BaseDirectoryObjectGetMemberObjectsCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Directory Object Get Member Objects Collection Page.
 */
public class DirectoryObjectGetMemberObjectsCollectionPage extends BaseDirectoryObjectGetMemberObjectsCollectionPage implements IDirectoryObjectGetMemberObjectsCollectionPage {

    /**
     * A collection page for DirectoryObject.
     *
     * @param response the serialized BaseDirectoryObjectGetMemberObjectsCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DirectoryObjectGetMemberObjectsCollectionPage(final BaseDirectoryObjectGetMemberObjectsCollectionResponse response, final IDirectoryObjectGetMemberObjectsCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
