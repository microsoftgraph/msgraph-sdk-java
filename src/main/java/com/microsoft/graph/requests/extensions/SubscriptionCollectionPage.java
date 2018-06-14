// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseSubscriptionCollectionPage;
import com.microsoft.graph.requests.generated.BaseSubscriptionCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Subscription Collection Page.
 */
public class SubscriptionCollectionPage extends BaseSubscriptionCollectionPage implements ISubscriptionCollectionPage {

    /**
     * A collection page for Subscription.
     *
     * @param response the serialized BaseSubscriptionCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public SubscriptionCollectionPage(final BaseSubscriptionCollectionResponse response, final ISubscriptionCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
