// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseColumnLinkCollectionPage;
import com.microsoft.graph.requests.generated.BaseColumnLinkCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Column Link Collection Page.
 */
public class ColumnLinkCollectionPage extends BaseColumnLinkCollectionPage implements IColumnLinkCollectionPage {

    /**
     * A collection page for ContentType.
     *
     * @param response the serialized BaseColumnLinkCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ColumnLinkCollectionPage(final BaseColumnLinkCollectionResponse response, final IColumnLinkCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
