// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseOutlookUserSupportedTimeZonesCollectionPage;
import com.microsoft.graph.requests.generated.BaseOutlookUserSupportedTimeZonesCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Outlook User Supported Time Zones Collection Page.
 */
public class OutlookUserSupportedTimeZonesCollectionPage extends BaseOutlookUserSupportedTimeZonesCollectionPage implements IOutlookUserSupportedTimeZonesCollectionPage {

    /**
     * A collection page for OutlookUser.
     *
     * @param response the serialized BaseOutlookUserSupportedTimeZonesCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OutlookUserSupportedTimeZonesCollectionPage(final BaseOutlookUserSupportedTimeZonesCollectionResponse response, final IOutlookUserSupportedTimeZonesCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
