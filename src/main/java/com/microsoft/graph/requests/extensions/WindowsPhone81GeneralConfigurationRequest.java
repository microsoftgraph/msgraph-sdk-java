// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.WindowsPhone81GeneralConfiguration;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWindowsPhone81GeneralConfigurationRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Windows Phone81General Configuration Request.
 */
public class WindowsPhone81GeneralConfigurationRequest extends BaseWindowsPhone81GeneralConfigurationRequest implements IWindowsPhone81GeneralConfigurationRequest {

    /**
     * The request for the WindowsPhone81GeneralConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsPhone81GeneralConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsPhone81GeneralConfiguration.class);
    }
}
