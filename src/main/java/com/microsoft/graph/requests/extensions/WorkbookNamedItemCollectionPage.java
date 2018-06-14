// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseWorkbookNamedItemCollectionPage;
import com.microsoft.graph.requests.generated.BaseWorkbookNamedItemCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Named Item Collection Page.
 */
public class WorkbookNamedItemCollectionPage extends BaseWorkbookNamedItemCollectionPage implements IWorkbookNamedItemCollectionPage {

    /**
     * A collection page for WorkbookWorksheet.
     *
     * @param response the serialized BaseWorkbookNamedItemCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public WorkbookNamedItemCollectionPage(final BaseWorkbookNamedItemCollectionResponse response, final IWorkbookNamedItemCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
