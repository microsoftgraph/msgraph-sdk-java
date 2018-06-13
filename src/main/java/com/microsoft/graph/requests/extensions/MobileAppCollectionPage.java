// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseMobileAppCollectionPage;
import com.microsoft.graph.requests.generated.BaseMobileAppCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Mobile App Collection Page.
 */
public class MobileAppCollectionPage extends BaseMobileAppCollectionPage implements IMobileAppCollectionPage {

    /**
     * A collection page for DeviceAppManagement.
     *
     * @param response the serialized BaseMobileAppCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public MobileAppCollectionPage(final BaseMobileAppCollectionResponse response, final IMobileAppCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
