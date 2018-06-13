// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseDirectoryObjectCollectionReferenceRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Directory Object Collection Reference Request.
 */
public class DirectoryObjectCollectionReferenceRequest extends BaseDirectoryObjectCollectionReferenceRequest implements IDirectoryObjectCollectionReferenceRequest {

    /**
     * The request for this collection of User
     *
     * @param requestUrl the request URL
     * @param client     the service client
     * @param options    the options for this request
     */
    public DirectoryObjectCollectionReferenceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> options) {
        super(requestUrl, client, options);
    }
}
