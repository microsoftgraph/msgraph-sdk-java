// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.DomainDnsRecord;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseDomainDnsRecordRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Domain Dns Record Request.
 */
public class DomainDnsRecordRequest extends BaseDomainDnsRecordRequest implements IDomainDnsRecordRequest {

    /**
     * The request for the DomainDnsRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public DomainDnsRecordRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends DomainDnsRecord> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the DomainDnsRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DomainDnsRecordRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DomainDnsRecord.class);
    }
}
