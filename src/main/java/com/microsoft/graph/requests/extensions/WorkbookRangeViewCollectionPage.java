// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseWorkbookRangeViewCollectionPage;
import com.microsoft.graph.requests.generated.BaseWorkbookRangeViewCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Range View Collection Page.
 */
public class WorkbookRangeViewCollectionPage extends BaseWorkbookRangeViewCollectionPage implements IWorkbookRangeViewCollectionPage {

    /**
     * A collection page for WorkbookRangeView.
     *
     * @param response the serialized BaseWorkbookRangeViewCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public WorkbookRangeViewCollectionPage(final BaseWorkbookRangeViewCollectionResponse response, final IWorkbookRangeViewCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
