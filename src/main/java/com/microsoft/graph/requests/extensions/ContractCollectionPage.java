// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseContractCollectionPage;
import com.microsoft.graph.requests.generated.BaseContractCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Contract Collection Page.
 */
public class ContractCollectionPage extends BaseContractCollectionPage implements IContractCollectionPage {

    /**
     * A collection page for Contract.
     *
     * @param response the serialized BaseContractCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ContractCollectionPage(final BaseContractCollectionResponse response, final IContractCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
