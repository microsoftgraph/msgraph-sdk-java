// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseMailFolderDeltaCollectionPage;
import com.microsoft.graph.requests.generated.BaseMailFolderDeltaCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Mail Folder Delta Collection Page.
 */
public class MailFolderDeltaCollectionPage extends BaseMailFolderDeltaCollectionPage implements IMailFolderDeltaCollectionPage {

    /**
     * A collection page for MailFolder.
     *
     * @param response the serialized BaseMailFolderDeltaCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MailFolderDeltaCollectionPage(final BaseMailFolderDeltaCollectionResponse response, final IMailFolderDeltaCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
