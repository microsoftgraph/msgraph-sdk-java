// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseOnenoteOperationCollectionPage;
import com.microsoft.graph.requests.generated.BaseOnenoteOperationCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Onenote Operation Collection Page.
 */
public class OnenoteOperationCollectionPage extends BaseOnenoteOperationCollectionPage implements IOnenoteOperationCollectionPage {

    /**
     * A collection page for Onenote.
     *
     * @param response the serialized BaseOnenoteOperationCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public OnenoteOperationCollectionPage(final BaseOnenoteOperationCollectionResponse response, final IOnenoteOperationCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
