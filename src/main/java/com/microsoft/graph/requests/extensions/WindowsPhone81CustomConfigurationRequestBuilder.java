// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWindowsPhone81CustomConfigurationRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Windows Phone81Custom Configuration Request Builder.
 */
public class WindowsPhone81CustomConfigurationRequestBuilder extends BaseWindowsPhone81CustomConfigurationRequestBuilder implements IWindowsPhone81CustomConfigurationRequestBuilder {

    /**
     * The request builder for the WindowsPhone81CustomConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsPhone81CustomConfigurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
}
