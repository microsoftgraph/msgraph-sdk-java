// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Fido2AuthenticationMethodConfiguration;
import com.microsoft.graph.requests.extensions.IAuthenticationMethodTargetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthenticationMethodTargetRequestBuilder;
import com.microsoft.graph.requests.extensions.AuthenticationMethodTargetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AuthenticationMethodTargetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Fido2Authentication Method Configuration Request Builder.
 */
public class Fido2AuthenticationMethodConfigurationRequestBuilder extends BaseRequestBuilder implements IFido2AuthenticationMethodConfigurationRequestBuilder {

    /**
     * The request builder for the Fido2AuthenticationMethodConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Fido2AuthenticationMethodConfigurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IFido2AuthenticationMethodConfigurationRequest instance
     */
    public IFido2AuthenticationMethodConfigurationRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IFido2AuthenticationMethodConfigurationRequest instance
     */
    public IFido2AuthenticationMethodConfigurationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.Fido2AuthenticationMethodConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IAuthenticationMethodTargetCollectionRequestBuilder includeTargets() {
        return new AuthenticationMethodTargetCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("includeTargets"), getClient(), null);
    }

    public IAuthenticationMethodTargetRequestBuilder includeTargets(final String id) {
        return new AuthenticationMethodTargetRequestBuilder(getRequestUrlWithAdditionalSegment("includeTargets") + "/" + id, getClient(), null);
    }
}