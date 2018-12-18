// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDataPolicyOperationCollectionPage;
import com.microsoft.graph.requests.generated.BaseDataPolicyOperationCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Data Policy Operation Collection Page.
 */
public class DataPolicyOperationCollectionPage extends BaseDataPolicyOperationCollectionPage implements IDataPolicyOperationCollectionPage {

    /**
     * A collection page for DataPolicyOperation.
     *
     * @param response the serialized BaseDataPolicyOperationCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DataPolicyOperationCollectionPage(final BaseDataPolicyOperationCollectionResponse response, final IDataPolicyOperationCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
