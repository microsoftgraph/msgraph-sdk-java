// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseMailFolderCollectionPage;
import com.microsoft.graph.requests.generated.BaseMailFolderCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Mail Folder Collection Page.
 */
public class MailFolderCollectionPage extends BaseMailFolderCollectionPage implements IMailFolderCollectionPage {

    /**
     * A collection page for MailFolder.
     *
     * @param response the serialized BaseMailFolderCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public MailFolderCollectionPage(final BaseMailFolderCollectionResponse response, final IMailFolderCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
