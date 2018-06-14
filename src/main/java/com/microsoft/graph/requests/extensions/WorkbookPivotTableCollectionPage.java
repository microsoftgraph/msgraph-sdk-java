// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseWorkbookPivotTableCollectionPage;
import com.microsoft.graph.requests.generated.BaseWorkbookPivotTableCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Pivot Table Collection Page.
 */
public class WorkbookPivotTableCollectionPage extends BaseWorkbookPivotTableCollectionPage implements IWorkbookPivotTableCollectionPage {

    /**
     * A collection page for WorkbookWorksheet.
     *
     * @param response the serialized BaseWorkbookPivotTableCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public WorkbookPivotTableCollectionPage(final BaseWorkbookPivotTableCollectionResponse response, final IWorkbookPivotTableCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
