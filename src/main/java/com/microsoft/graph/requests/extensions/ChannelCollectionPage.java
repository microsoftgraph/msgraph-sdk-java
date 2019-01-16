// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseChannelCollectionPage;
import com.microsoft.graph.requests.generated.BaseChannelCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Channel Collection Page.
 */
public class ChannelCollectionPage extends BaseChannelCollectionPage implements IChannelCollectionPage {

    /**
     * A collection page for Team.
     *
     * @param response the serialized BaseChannelCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ChannelCollectionPage(final BaseChannelCollectionResponse response, final IChannelCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
