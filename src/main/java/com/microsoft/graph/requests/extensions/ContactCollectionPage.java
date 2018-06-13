// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseContactCollectionPage;
import com.microsoft.graph.requests.generated.BaseContactCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Contact Collection Page.
 */
public class ContactCollectionPage extends BaseContactCollectionPage implements IContactCollectionPage {

    /**
     * A collection page for ContactFolder.
     *
     * @param response the serialized BaseContactCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ContactCollectionPage(final BaseContactCollectionResponse response, final IContactCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
