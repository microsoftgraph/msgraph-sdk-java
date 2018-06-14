// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseDriveItemRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Drive Item Request Builder.
 */
public class DriveItemRequestBuilder extends BaseDriveItemRequestBuilder implements IDriveItemRequestBuilder {

    /**
     * The request builder for the DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    @Override
    public IDriveItemRequestBuilder itemWithPath(final String path) {
        return new DriveItemRequestBuilder(getRequestUrl() + ":/" + path + ":", getClient(), null);
    }
}
