// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseColumnLinkCollectionRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Column Link Collection Request.
 */
public class ColumnLinkCollectionRequest extends BaseColumnLinkCollectionRequest implements IColumnLinkCollectionRequest {

    /**
     * The request for this collection of ContentType
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ColumnLinkCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
}
