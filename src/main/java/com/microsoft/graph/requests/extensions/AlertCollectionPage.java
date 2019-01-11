// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseAlertCollectionPage;
import com.microsoft.graph.requests.generated.BaseAlertCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Alert Collection Page.
 */
public class AlertCollectionPage extends BaseAlertCollectionPage implements IAlertCollectionPage {

    /**
     * A collection page for Security.
     *
     * @param response the serialized BaseAlertCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public AlertCollectionPage(final BaseAlertCollectionResponse response, final IAlertCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
