// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.InferenceClassification;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseInferenceClassificationRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Inference Classification Request.
 */
public class InferenceClassificationRequest extends BaseInferenceClassificationRequest implements IInferenceClassificationRequest {

    /**
     * The request for the InferenceClassification
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InferenceClassificationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, InferenceClassification.class);
    }
}
