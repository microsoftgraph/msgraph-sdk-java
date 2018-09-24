// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseOnenoteSectionCopyToSectionGroupRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Onenote Section Copy To Section Group Request Builder.
 */
public class OnenoteSectionCopyToSectionGroupRequestBuilder extends BaseOnenoteSectionCopyToSectionGroupRequestBuilder implements IOnenoteSectionCopyToSectionGroupRequestBuilder {

    /**
     * The request builder for this OnenoteSectionCopyToSectionGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param id the id
     * @param groupId the groupId
     * @param renameAs the renameAs
     * @param siteCollectionId the siteCollectionId
     * @param siteId the siteId
     */
    public OnenoteSectionCopyToSectionGroupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String id, final String groupId, final String renameAs, final String siteCollectionId, final String siteId) {
        super(requestUrl, client, requestOptions, id, groupId, renameAs, siteCollectionId, siteId);
    }
}
