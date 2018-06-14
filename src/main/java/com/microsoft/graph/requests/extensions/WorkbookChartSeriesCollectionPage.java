// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseWorkbookChartSeriesCollectionPage;
import com.microsoft.graph.requests.generated.BaseWorkbookChartSeriesCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Chart Series Collection Page.
 */
public class WorkbookChartSeriesCollectionPage extends BaseWorkbookChartSeriesCollectionPage implements IWorkbookChartSeriesCollectionPage {

    /**
     * A collection page for WorkbookChart.
     *
     * @param response the serialized BaseWorkbookChartSeriesCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public WorkbookChartSeriesCollectionPage(final BaseWorkbookChartSeriesCollectionResponse response, final IWorkbookChartSeriesCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
