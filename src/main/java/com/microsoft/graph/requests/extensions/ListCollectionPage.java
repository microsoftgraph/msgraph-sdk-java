// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseListCollectionPage;
import com.microsoft.graph.requests.generated.BaseListCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the List Collection Page.
 */
public class ListCollectionPage extends BaseListCollectionPage implements IListCollectionPage {

    /**
     * A collection page for Site.
     *
     * @param response the serialized BaseListCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ListCollectionPage(final BaseListCollectionResponse response, final IListCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
