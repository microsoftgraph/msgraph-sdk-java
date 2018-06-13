// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseWorkbookChartPointCollectionPage;
import com.microsoft.graph.requests.generated.BaseWorkbookChartPointCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Chart Point Collection Page.
 */
public class WorkbookChartPointCollectionPage extends BaseWorkbookChartPointCollectionPage implements IWorkbookChartPointCollectionPage {

    /**
     * A collection page for WorkbookChartSeries.
     *
     * @param response the serialized BaseWorkbookChartPointCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public WorkbookChartPointCollectionPage(final BaseWorkbookChartPointCollectionResponse response, final IWorkbookChartPointCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
