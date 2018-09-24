// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseWorkbookTableColumnCollectionPage;
import com.microsoft.graph.requests.generated.BaseWorkbookTableColumnCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Table Column Collection Page.
 */
public class WorkbookTableColumnCollectionPage extends BaseWorkbookTableColumnCollectionPage implements IWorkbookTableColumnCollectionPage {

    /**
     * A collection page for WorkbookTable.
     *
     * @param response the serialized BaseWorkbookTableColumnCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public WorkbookTableColumnCollectionPage(final BaseWorkbookTableColumnCollectionResponse response, final IWorkbookTableColumnCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
