// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseOnenotePageCopyToSectionRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Onenote Page Copy To Section Request Builder.
 */
public class OnenotePageCopyToSectionRequestBuilder extends BaseOnenotePageCopyToSectionRequestBuilder implements IOnenotePageCopyToSectionRequestBuilder {

    /**
     * The request builder for this OnenotePageCopyToSection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param id the id
     * @param groupId the groupId
     */
    public OnenotePageCopyToSectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String id, final String groupId) {
        super(requestUrl, client, requestOptions, id, groupId);
    }
}
