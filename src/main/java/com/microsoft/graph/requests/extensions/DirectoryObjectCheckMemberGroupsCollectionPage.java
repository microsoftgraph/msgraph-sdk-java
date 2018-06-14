// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDirectoryObjectCheckMemberGroupsCollectionPage;
import com.microsoft.graph.requests.generated.BaseDirectoryObjectCheckMemberGroupsCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Directory Object Check Member Groups Collection Page.
 */
public class DirectoryObjectCheckMemberGroupsCollectionPage extends BaseDirectoryObjectCheckMemberGroupsCollectionPage implements IDirectoryObjectCheckMemberGroupsCollectionPage {

    /**
     * A collection page for DirectoryObject.
     *
     * @param response the serialized BaseDirectoryObjectCheckMemberGroupsCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DirectoryObjectCheckMemberGroupsCollectionPage(final BaseDirectoryObjectCheckMemberGroupsCollectionResponse response, final IDirectoryObjectCheckMemberGroupsCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
