// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseGroupCollectionPage;
import com.microsoft.graph.requests.generated.BaseGroupCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Group Collection Page.
 */
public class GroupCollectionPage extends BaseGroupCollectionPage implements IGroupCollectionPage {

    /**
     * A collection page for Group.
     *
     * @param response the serialized BaseGroupCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public GroupCollectionPage(final BaseGroupCollectionResponse response, final IGroupCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
