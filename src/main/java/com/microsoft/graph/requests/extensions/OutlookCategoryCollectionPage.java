// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseOutlookCategoryCollectionPage;
import com.microsoft.graph.requests.generated.BaseOutlookCategoryCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Outlook Category Collection Page.
 */
public class OutlookCategoryCollectionPage extends BaseOutlookCategoryCollectionPage implements IOutlookCategoryCollectionPage {

    /**
     * A collection page for OutlookUser.
     *
     * @param response the serialized BaseOutlookCategoryCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public OutlookCategoryCollectionPage(final BaseOutlookCategoryCollectionResponse response, final IOutlookCategoryCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
