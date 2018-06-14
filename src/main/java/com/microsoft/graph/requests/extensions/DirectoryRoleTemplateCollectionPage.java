// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDirectoryRoleTemplateCollectionPage;
import com.microsoft.graph.requests.generated.BaseDirectoryRoleTemplateCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Directory Role Template Collection Page.
 */
public class DirectoryRoleTemplateCollectionPage extends BaseDirectoryRoleTemplateCollectionPage implements IDirectoryRoleTemplateCollectionPage {

    /**
     * A collection page for DirectoryRoleTemplate.
     *
     * @param response the serialized BaseDirectoryRoleTemplateCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DirectoryRoleTemplateCollectionPage(final BaseDirectoryRoleTemplateCollectionResponse response, final IDirectoryRoleTemplateCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
