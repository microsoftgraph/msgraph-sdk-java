// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDomainDnsRecordCollectionPage;
import com.microsoft.graph.requests.generated.BaseDomainDnsRecordCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Domain Dns Record Collection Page.
 */
public class DomainDnsRecordCollectionPage extends BaseDomainDnsRecordCollectionPage implements IDomainDnsRecordCollectionPage {

    /**
     * A collection page for DomainDnsRecord.
     *
     * @param response the serialized BaseDomainDnsRecordCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DomainDnsRecordCollectionPage(final BaseDomainDnsRecordCollectionResponse response, final IDomainDnsRecordCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
