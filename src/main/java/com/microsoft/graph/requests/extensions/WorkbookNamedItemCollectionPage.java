// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookNamedItem;
import com.microsoft.graph.requests.extensions.IWorkbookNamedItemCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Named Item Collection Page.
 */
public class WorkbookNamedItemCollectionPage extends BaseCollectionPage<WorkbookNamedItem, IWorkbookNamedItemCollectionRequestBuilder> implements IWorkbookNamedItemCollectionPage {

    /**
     * A collection page for WorkbookNamedItem
     *
     * @param response the serialized WorkbookNamedItemCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookNamedItemCollectionPage(final WorkbookNamedItemCollectionResponse response, final IWorkbookNamedItemCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}