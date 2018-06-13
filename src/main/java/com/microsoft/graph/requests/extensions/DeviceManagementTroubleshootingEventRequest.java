// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.DeviceManagementTroubleshootingEvent;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseDeviceManagementTroubleshootingEventRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Management Troubleshooting Event Request.
 */
public class DeviceManagementTroubleshootingEventRequest extends BaseDeviceManagementTroubleshootingEventRequest implements IDeviceManagementTroubleshootingEventRequest {

    /**
     * The request for the DeviceManagementTroubleshootingEvent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public DeviceManagementTroubleshootingEventRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends DeviceManagementTroubleshootingEvent> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the DeviceManagementTroubleshootingEvent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementTroubleshootingEventRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementTroubleshootingEvent.class);
    }
}
