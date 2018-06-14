// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseInferenceClassificationOverrideCollectionPage;
import com.microsoft.graph.requests.generated.BaseInferenceClassificationOverrideCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Inference Classification Override Collection Page.
 */
public class InferenceClassificationOverrideCollectionPage extends BaseInferenceClassificationOverrideCollectionPage implements IInferenceClassificationOverrideCollectionPage {

    /**
     * A collection page for InferenceClassification.
     *
     * @param response the serialized BaseInferenceClassificationOverrideCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public InferenceClassificationOverrideCollectionPage(final BaseInferenceClassificationOverrideCollectionResponse response, final IInferenceClassificationOverrideCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
