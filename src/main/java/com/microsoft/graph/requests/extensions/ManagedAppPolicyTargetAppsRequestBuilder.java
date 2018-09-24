// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseManagedAppPolicyTargetAppsRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed App Policy Target Apps Request Builder.
 */
public class ManagedAppPolicyTargetAppsRequestBuilder extends BaseManagedAppPolicyTargetAppsRequestBuilder implements IManagedAppPolicyTargetAppsRequestBuilder {

    /**
     * The request builder for this ManagedAppPolicyTargetApps
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param apps the apps
     */
    public ManagedAppPolicyTargetAppsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<ManagedMobileApp> apps) {
        super(requestUrl, client, requestOptions, apps);
    }
}
