// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseGroupDeltaCollectionPage;
import com.microsoft.graph.requests.generated.BaseGroupDeltaCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Group Delta Collection Page.
 */
public class GroupDeltaCollectionPage extends BaseGroupDeltaCollectionPage implements IGroupDeltaCollectionPage {

    /**
     * A collection page for Group.
     *
     * @param response the serialized BaseGroupDeltaCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GroupDeltaCollectionPage(final BaseGroupDeltaCollectionResponse response, final IGroupDeltaCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
