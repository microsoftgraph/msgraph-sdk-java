// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseOutlookUserSupportedLanguagesCollectionPage;
import com.microsoft.graph.requests.generated.BaseOutlookUserSupportedLanguagesCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Outlook User Supported Languages Collection Page.
 */
public class OutlookUserSupportedLanguagesCollectionPage extends BaseOutlookUserSupportedLanguagesCollectionPage implements IOutlookUserSupportedLanguagesCollectionPage {

    /**
     * A collection page for OutlookUser.
     *
     * @param response the serialized BaseOutlookUserSupportedLanguagesCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OutlookUserSupportedLanguagesCollectionPage(final BaseOutlookUserSupportedLanguagesCollectionResponse response, final IOutlookUserSupportedLanguagesCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
