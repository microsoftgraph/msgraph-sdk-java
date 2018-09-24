// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.FileEncryptionInfo;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseMobileAppContentFileCommitRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Mobile App Content File Commit Request Builder.
 */
public class MobileAppContentFileCommitRequestBuilder extends BaseMobileAppContentFileCommitRequestBuilder implements IMobileAppContentFileCommitRequestBuilder {

    /**
     * The request builder for this MobileAppContentFileCommit
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param fileEncryptionInfo the fileEncryptionInfo
     */
    public MobileAppContentFileCommitRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final FileEncryptionInfo fileEncryptionInfo) {
        super(requestUrl, client, requestOptions, fileEncryptionInfo);
    }
}
