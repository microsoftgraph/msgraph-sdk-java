// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseManagedDeviceWindowsDefenderScanRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed Device Windows Defender Scan Request Builder.
 */
public class ManagedDeviceWindowsDefenderScanRequestBuilder extends BaseManagedDeviceWindowsDefenderScanRequestBuilder implements IManagedDeviceWindowsDefenderScanRequestBuilder {

    /**
     * The request builder for this ManagedDeviceWindowsDefenderScan
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param quickScan the quickScan
     */
    public ManagedDeviceWindowsDefenderScanRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Boolean quickScan) {
        super(requestUrl, client, requestOptions, quickScan);
    }
}
