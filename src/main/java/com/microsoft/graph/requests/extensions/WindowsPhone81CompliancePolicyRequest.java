// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.WindowsPhone81CompliancePolicy;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWindowsPhone81CompliancePolicyRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Windows Phone81Compliance Policy Request.
 */
public class WindowsPhone81CompliancePolicyRequest extends BaseWindowsPhone81CompliancePolicyRequest implements IWindowsPhone81CompliancePolicyRequest {

    /**
     * The request for the WindowsPhone81CompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsPhone81CompliancePolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsPhone81CompliancePolicy.class);
    }
}
