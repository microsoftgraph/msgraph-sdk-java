// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDomainCollectionPage;
import com.microsoft.graph.requests.generated.BaseDomainCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Domain Collection Page.
 */
public class DomainCollectionPage extends BaseDomainCollectionPage implements IDomainCollectionPage {

    /**
     * A collection page for Domain.
     *
     * @param response the serialized BaseDomainCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DomainCollectionPage(final BaseDomainCollectionResponse response, final IDomainCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
