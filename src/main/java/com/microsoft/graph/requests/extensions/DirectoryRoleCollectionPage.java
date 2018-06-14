// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDirectoryRoleCollectionPage;
import com.microsoft.graph.requests.generated.BaseDirectoryRoleCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Directory Role Collection Page.
 */
public class DirectoryRoleCollectionPage extends BaseDirectoryRoleCollectionPage implements IDirectoryRoleCollectionPage {

    /**
     * A collection page for DirectoryRole.
     *
     * @param response the serialized BaseDirectoryRoleCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DirectoryRoleCollectionPage(final BaseDirectoryRoleCollectionResponse response, final IDirectoryRoleCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
