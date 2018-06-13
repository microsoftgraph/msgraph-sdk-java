// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.Windows81GeneralConfiguration;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWindows81GeneralConfigurationRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Windows81General Configuration Request.
 */
public class Windows81GeneralConfigurationRequest extends BaseWindows81GeneralConfigurationRequest implements IWindows81GeneralConfigurationRequest {

    /**
     * The request for the Windows81GeneralConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows81GeneralConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows81GeneralConfiguration.class);
    }
}
