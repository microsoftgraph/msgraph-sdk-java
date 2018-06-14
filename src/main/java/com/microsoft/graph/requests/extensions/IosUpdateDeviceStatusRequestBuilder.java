// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseIosUpdateDeviceStatusRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Ios Update Device Status Request Builder.
 */
public class IosUpdateDeviceStatusRequestBuilder extends BaseIosUpdateDeviceStatusRequestBuilder implements IIosUpdateDeviceStatusRequestBuilder {

    /**
     * The request builder for the IosUpdateDeviceStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosUpdateDeviceStatusRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
}
