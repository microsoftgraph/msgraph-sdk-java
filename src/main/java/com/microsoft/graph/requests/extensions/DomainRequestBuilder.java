// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Domain;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainDnsRecordRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Request Builder.
 */
public class DomainRequestBuilder extends BaseRequestBuilder implements IDomainRequestBuilder {

    /**
     * The request builder for the Domain
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DomainRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDomainRequest instance
     */
    public IDomainRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDomainRequest instance
     */
    public IDomainRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DomainRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDirectoryObjectCollectionWithReferencesRequestBuilder domainNameReferences() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("domainNameReferences"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder domainNameReferences(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("domainNameReferences") + "/" + id, getClient(), null);
    }
    public IDomainDnsRecordCollectionRequestBuilder serviceConfigurationRecords() {
        return new DomainDnsRecordCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("serviceConfigurationRecords"), getClient(), null);
    }

    public IDomainDnsRecordRequestBuilder serviceConfigurationRecords(final String id) {
        return new DomainDnsRecordRequestBuilder(getRequestUrlWithAdditionalSegment("serviceConfigurationRecords") + "/" + id, getClient(), null);
    }
    public IDomainDnsRecordCollectionRequestBuilder verificationDnsRecords() {
        return new DomainDnsRecordCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("verificationDnsRecords"), getClient(), null);
    }

    public IDomainDnsRecordRequestBuilder verificationDnsRecords(final String id) {
        return new DomainDnsRecordRequestBuilder(getRequestUrlWithAdditionalSegment("verificationDnsRecords") + "/" + id, getClient(), null);
    }

    public IDomainForceDeleteRequestBuilder forceDelete(final Boolean disableUserAccounts) {
        return new DomainForceDeleteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.forceDelete"), getClient(), null, disableUserAccounts);
    }

    public IDomainVerifyRequestBuilder verify() {
        return new DomainVerifyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.verify"), getClient(), null);
    }
}