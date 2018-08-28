// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseVppTokenCollectionPage;
import com.microsoft.graph.requests.generated.BaseVppTokenCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Vpp Token Collection Page.
 */
public class VppTokenCollectionPage extends BaseVppTokenCollectionPage implements IVppTokenCollectionPage {

    /**
     * A collection page for DeviceAppManagement.
     *
     * @param response the serialized BaseVppTokenCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public VppTokenCollectionPage(final BaseVppTokenCollectionResponse response, final IVppTokenCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
