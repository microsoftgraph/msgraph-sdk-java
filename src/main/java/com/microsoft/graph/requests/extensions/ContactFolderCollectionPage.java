// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseContactFolderCollectionPage;
import com.microsoft.graph.requests.generated.BaseContactFolderCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Contact Folder Collection Page.
 */
public class ContactFolderCollectionPage extends BaseContactFolderCollectionPage implements IContactFolderCollectionPage {

    /**
     * A collection page for ContactFolder.
     *
     * @param response the serialized BaseContactFolderCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ContactFolderCollectionPage(final BaseContactFolderCollectionResponse response, final IContactFolderCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
