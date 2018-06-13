// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseMobileThreatDefenseConnectorCollectionPage;
import com.microsoft.graph.requests.generated.BaseMobileThreatDefenseConnectorCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Mobile Threat Defense Connector Collection Page.
 */
public class MobileThreatDefenseConnectorCollectionPage extends BaseMobileThreatDefenseConnectorCollectionPage implements IMobileThreatDefenseConnectorCollectionPage {

    /**
     * A collection page for DeviceManagement.
     *
     * @param response the serialized BaseMobileThreatDefenseConnectorCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public MobileThreatDefenseConnectorCollectionPage(final BaseMobileThreatDefenseConnectorCollectionResponse response, final IMobileThreatDefenseConnectorCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
