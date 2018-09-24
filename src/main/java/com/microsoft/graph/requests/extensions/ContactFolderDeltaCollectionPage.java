// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseContactFolderDeltaCollectionPage;
import com.microsoft.graph.requests.generated.BaseContactFolderDeltaCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Contact Folder Delta Collection Page.
 */
public class ContactFolderDeltaCollectionPage extends BaseContactFolderDeltaCollectionPage implements IContactFolderDeltaCollectionPage {

    /**
     * A collection page for ContactFolder.
     *
     * @param response the serialized BaseContactFolderDeltaCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ContactFolderDeltaCollectionPage(final BaseContactFolderDeltaCollectionResponse response, final IContactFolderDeltaCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
