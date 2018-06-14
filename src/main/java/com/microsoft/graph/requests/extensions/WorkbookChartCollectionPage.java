// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseWorkbookChartCollectionPage;
import com.microsoft.graph.requests.generated.BaseWorkbookChartCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Chart Collection Page.
 */
public class WorkbookChartCollectionPage extends BaseWorkbookChartCollectionPage implements IWorkbookChartCollectionPage {

    /**
     * A collection page for WorkbookWorksheet.
     *
     * @param response the serialized BaseWorkbookChartCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public WorkbookChartCollectionPage(final BaseWorkbookChartCollectionResponse response, final IWorkbookChartCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
