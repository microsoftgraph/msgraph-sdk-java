// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDirectoryRoleDeltaCollectionPage;
import com.microsoft.graph.requests.generated.BaseDirectoryRoleDeltaCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Directory Role Delta Collection Page.
 */
public class DirectoryRoleDeltaCollectionPage extends BaseDirectoryRoleDeltaCollectionPage implements IDirectoryRoleDeltaCollectionPage {

    /**
     * A collection page for DirectoryRole.
     *
     * @param response the serialized BaseDirectoryRoleDeltaCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DirectoryRoleDeltaCollectionPage(final BaseDirectoryRoleDeltaCollectionResponse response, final IDirectoryRoleDeltaCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
