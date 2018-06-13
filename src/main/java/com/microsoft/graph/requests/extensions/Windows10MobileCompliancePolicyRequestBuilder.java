// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWindows10MobileCompliancePolicyRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Windows10Mobile Compliance Policy Request Builder.
 */
public class Windows10MobileCompliancePolicyRequestBuilder extends BaseWindows10MobileCompliancePolicyRequestBuilder implements IWindows10MobileCompliancePolicyRequestBuilder {

    /**
     * The request builder for the Windows10MobileCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10MobileCompliancePolicyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
}
