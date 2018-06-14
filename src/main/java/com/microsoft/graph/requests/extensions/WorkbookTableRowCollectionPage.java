// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseWorkbookTableRowCollectionPage;
import com.microsoft.graph.requests.generated.BaseWorkbookTableRowCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Table Row Collection Page.
 */
public class WorkbookTableRowCollectionPage extends BaseWorkbookTableRowCollectionPage implements IWorkbookTableRowCollectionPage {

    /**
     * A collection page for WorkbookTable.
     *
     * @param response the serialized BaseWorkbookTableRowCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public WorkbookTableRowCollectionPage(final BaseWorkbookTableRowCollectionResponse response, final IWorkbookTableRowCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
