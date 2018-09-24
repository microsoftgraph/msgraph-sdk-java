// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseWorkbookWorksheetCollectionPage;
import com.microsoft.graph.requests.generated.BaseWorkbookWorksheetCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Worksheet Collection Page.
 */
public class WorkbookWorksheetCollectionPage extends BaseWorkbookWorksheetCollectionPage implements IWorkbookWorksheetCollectionPage {

    /**
     * A collection page for Workbook.
     *
     * @param response the serialized BaseWorkbookWorksheetCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public WorkbookWorksheetCollectionPage(final BaseWorkbookWorksheetCollectionResponse response, final IWorkbookWorksheetCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
