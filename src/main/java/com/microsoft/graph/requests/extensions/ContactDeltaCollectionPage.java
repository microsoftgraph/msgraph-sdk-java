// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseContactDeltaCollectionPage;
import com.microsoft.graph.requests.generated.BaseContactDeltaCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Contact Delta Collection Page.
 */
public class ContactDeltaCollectionPage extends BaseContactDeltaCollectionPage implements IContactDeltaCollectionPage {

    /**
     * A collection page for Contact.
     *
     * @param response the serialized BaseContactDeltaCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ContactDeltaCollectionPage(final BaseContactDeltaCollectionResponse response, final IContactDeltaCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
