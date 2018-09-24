// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseActivityHistoryItemCollectionPage;
import com.microsoft.graph.requests.generated.BaseActivityHistoryItemCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Activity History Item Collection Page.
 */
public class ActivityHistoryItemCollectionPage extends BaseActivityHistoryItemCollectionPage implements IActivityHistoryItemCollectionPage {

    /**
     * A collection page for UserActivity.
     *
     * @param response the serialized BaseActivityHistoryItemCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ActivityHistoryItemCollectionPage(final BaseActivityHistoryItemCollectionResponse response, final IActivityHistoryItemCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
