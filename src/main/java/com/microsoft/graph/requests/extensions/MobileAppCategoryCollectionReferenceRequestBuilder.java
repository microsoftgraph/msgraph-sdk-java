// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseMobileAppCategoryCollectionReferenceRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Mobile App Category Collection Reference Request Builder.
 */
public class MobileAppCategoryCollectionReferenceRequestBuilder extends BaseMobileAppCategoryCollectionReferenceRequestBuilder implements IMobileAppCategoryCollectionReferenceRequestBuilder {

    /**
     * The request builder for this collection of MobileApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppCategoryCollectionReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
}
