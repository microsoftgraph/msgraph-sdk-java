// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.ItemReference;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseDriveItemCopyRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Drive Item Copy Request Builder.
 */
public class DriveItemCopyRequestBuilder extends BaseDriveItemCopyRequestBuilder implements IDriveItemCopyRequestBuilder {

    /**
     * The request builder for this DriveItemCopy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param name the name
     * @param parentReference the parentReference
     */
    public DriveItemCopyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String name, final ItemReference parentReference) {
        super(requestUrl, client, requestOptions, name, parentReference);
    }
}
