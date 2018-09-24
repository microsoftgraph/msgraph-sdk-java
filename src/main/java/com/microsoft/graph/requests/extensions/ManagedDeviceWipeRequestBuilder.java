// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseManagedDeviceWipeRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed Device Wipe Request Builder.
 */
public class ManagedDeviceWipeRequestBuilder extends BaseManagedDeviceWipeRequestBuilder implements IManagedDeviceWipeRequestBuilder {

    /**
     * The request builder for this ManagedDeviceWipe
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param keepEnrollmentData the keepEnrollmentData
     * @param keepUserData the keepUserData
     * @param macOsUnlockCode the macOsUnlockCode
     */
    public ManagedDeviceWipeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Boolean keepEnrollmentData, final Boolean keepUserData, final String macOsUnlockCode) {
        super(requestUrl, client, requestOptions, keepEnrollmentData, keepUserData, macOsUnlockCode);
    }
}
