// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDirectoryObjectGetMemberGroupsCollectionPage;
import com.microsoft.graph.requests.generated.BaseDirectoryObjectGetMemberGroupsCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Directory Object Get Member Groups Collection Page.
 */
public class DirectoryObjectGetMemberGroupsCollectionPage extends BaseDirectoryObjectGetMemberGroupsCollectionPage implements IDirectoryObjectGetMemberGroupsCollectionPage {

    /**
     * A collection page for DirectoryObject.
     *
     * @param response the serialized BaseDirectoryObjectGetMemberGroupsCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DirectoryObjectGetMemberGroupsCollectionPage(final BaseDirectoryObjectGetMemberGroupsCollectionResponse response, final IDirectoryObjectGetMemberGroupsCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
