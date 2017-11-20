// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Attachment Collection Page.
 */
public class AttachmentCollectionPage extends BaseAttachmentCollectionPage implements IAttachmentCollectionPage {

    /**
     * A collection page for Post.
     *
     * @param response The serialized BaseAttachmentCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public AttachmentCollectionPage(final BaseAttachmentCollectionResponse response, final IAttachmentCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
