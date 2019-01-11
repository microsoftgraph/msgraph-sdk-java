// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationAssignment;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseManagedDeviceMobileAppConfigurationAssignRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed Device Mobile App Configuration Assign Request Builder.
 */
public class ManagedDeviceMobileAppConfigurationAssignRequestBuilder extends BaseManagedDeviceMobileAppConfigurationAssignRequestBuilder implements IManagedDeviceMobileAppConfigurationAssignRequestBuilder {

    /**
     * The request builder for this ManagedDeviceMobileAppConfigurationAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param assignments the assignments
     */
    public ManagedDeviceMobileAppConfigurationAssignRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<ManagedDeviceMobileAppConfigurationAssignment> assignments) {
        super(requestUrl, client, requestOptions, assignments);
    }
}
