// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseListItemVersionCollectionPage;
import com.microsoft.graph.requests.generated.BaseListItemVersionCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the List Item Version Collection Page.
 */
public class ListItemVersionCollectionPage extends BaseListItemVersionCollectionPage implements IListItemVersionCollectionPage {

    /**
     * A collection page for ListItem.
     *
     * @param response the serialized BaseListItemVersionCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ListItemVersionCollectionPage(final BaseListItemVersionCollectionResponse response, final IListItemVersionCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
