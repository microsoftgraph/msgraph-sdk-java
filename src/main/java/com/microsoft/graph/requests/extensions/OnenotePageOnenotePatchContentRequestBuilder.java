// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.OnenotePatchContentCommand;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseOnenotePageOnenotePatchContentRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Onenote Page Onenote Patch Content Request Builder.
 */
public class OnenotePageOnenotePatchContentRequestBuilder extends BaseOnenotePageOnenotePatchContentRequestBuilder implements IOnenotePageOnenotePatchContentRequestBuilder {

    /**
     * The request builder for this OnenotePageOnenotePatchContent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param commands the commands
     */
    public OnenotePageOnenotePatchContentRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<OnenotePatchContentCommand> commands) {
        super(requestUrl, client, requestOptions, commands);
    }
}
