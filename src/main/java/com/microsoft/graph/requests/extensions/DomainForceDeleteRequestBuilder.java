// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseDomainForceDeleteRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Domain Force Delete Request Builder.
 */
public class DomainForceDeleteRequestBuilder extends BaseDomainForceDeleteRequestBuilder implements IDomainForceDeleteRequestBuilder {

    /**
     * The request builder for this DomainForceDelete
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param disableUserAccounts the disableUserAccounts
     */
    public DomainForceDeleteRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Boolean disableUserAccounts) {
        super(requestUrl, client, requestOptions, disableUserAccounts);
    }
}
