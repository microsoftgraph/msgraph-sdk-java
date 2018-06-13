// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseSubscribedSkuCollectionPage;
import com.microsoft.graph.requests.generated.BaseSubscribedSkuCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Subscribed Sku Collection Page.
 */
public class SubscribedSkuCollectionPage extends BaseSubscribedSkuCollectionPage implements ISubscribedSkuCollectionPage {

    /**
     * A collection page for SubscribedSku.
     *
     * @param response the serialized BaseSubscribedSkuCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public SubscribedSkuCollectionPage(final BaseSubscribedSkuCollectionResponse response, final ISubscribedSkuCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
