// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.ExtensionProperty;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequest;
import com.microsoft.graph.requests.extensions.IDirectoryObjectValidatePropertiesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectGetAvailableExtensionPropertiesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectGetByIdsCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Collection Request Builder.
 */
public class DirectoryObjectCollectionRequestBuilder extends BaseRequestBuilder implements IDirectoryObjectCollectionRequestBuilder {

    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryObjectCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDirectoryObjectCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDirectoryObjectCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DirectoryObjectCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDirectoryObjectRequestBuilder byId(final String id) {
        return new DirectoryObjectRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IDirectoryObjectValidatePropertiesRequestBuilder validateProperties(final String entityType, final String displayName, final String mailNickname, final java.util.UUID onBehalfOfUserId) {
        return new DirectoryObjectValidatePropertiesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.validateProperties"), getClient(), null, entityType, displayName, mailNickname, onBehalfOfUserId);
    }

    public IDirectoryObjectGetAvailableExtensionPropertiesCollectionRequestBuilder getAvailableExtensionProperties(final Boolean isSyncedFromOnPremises) {
        return new DirectoryObjectGetAvailableExtensionPropertiesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAvailableExtensionProperties"), getClient(), null, isSyncedFromOnPremises);
    }

    public IDirectoryObjectGetByIdsCollectionRequestBuilder getByIds(final java.util.List<String> ids, final java.util.List<String> types) {
        return new DirectoryObjectGetByIdsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getByIds"), getClient(), null, ids, types);
    }
}