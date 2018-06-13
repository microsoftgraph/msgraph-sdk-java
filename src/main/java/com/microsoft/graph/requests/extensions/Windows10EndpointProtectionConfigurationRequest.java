// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.Windows10EndpointProtectionConfiguration;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWindows10EndpointProtectionConfigurationRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Windows10Endpoint Protection Configuration Request.
 */
public class Windows10EndpointProtectionConfigurationRequest extends BaseWindows10EndpointProtectionConfigurationRequest implements IWindows10EndpointProtectionConfigurationRequest {

    /**
     * The request for the Windows10EndpointProtectionConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10EndpointProtectionConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10EndpointProtectionConfiguration.class);
    }
}
