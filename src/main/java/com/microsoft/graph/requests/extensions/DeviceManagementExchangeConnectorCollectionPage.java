// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceManagementExchangeConnectorCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceManagementExchangeConnectorCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Management Exchange Connector Collection Page.
 */
public class DeviceManagementExchangeConnectorCollectionPage extends BaseDeviceManagementExchangeConnectorCollectionPage implements IDeviceManagementExchangeConnectorCollectionPage {

    /**
     * A collection page for DeviceManagement.
     *
     * @param response the serialized BaseDeviceManagementExchangeConnectorCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DeviceManagementExchangeConnectorCollectionPage(final BaseDeviceManagementExchangeConnectorCollectionResponse response, final IDeviceManagementExchangeConnectorCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
