// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseWorkbookRangeBorderCollectionPage;
import com.microsoft.graph.requests.generated.BaseWorkbookRangeBorderCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Range Border Collection Page.
 */
public class WorkbookRangeBorderCollectionPage extends BaseWorkbookRangeBorderCollectionPage implements IWorkbookRangeBorderCollectionPage {

    /**
     * A collection page for WorkbookRangeFormat.
     *
     * @param response the serialized BaseWorkbookRangeBorderCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public WorkbookRangeBorderCollectionPage(final BaseWorkbookRangeBorderCollectionResponse response, final IWorkbookRangeBorderCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
