// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseLicenseDetailsCollectionPage;
import com.microsoft.graph.requests.generated.BaseLicenseDetailsCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the License Details Collection Page.
 */
public class LicenseDetailsCollectionPage extends BaseLicenseDetailsCollectionPage implements ILicenseDetailsCollectionPage {

    /**
     * A collection page for User.
     *
     * @param response the serialized BaseLicenseDetailsCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public LicenseDetailsCollectionPage(final BaseLicenseDetailsCollectionResponse response, final ILicenseDetailsCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
