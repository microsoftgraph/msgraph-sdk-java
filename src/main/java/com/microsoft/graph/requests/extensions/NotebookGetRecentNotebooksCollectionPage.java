// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseNotebookGetRecentNotebooksCollectionPage;
import com.microsoft.graph.requests.generated.BaseNotebookGetRecentNotebooksCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Notebook Get Recent Notebooks Collection Page.
 */
public class NotebookGetRecentNotebooksCollectionPage extends BaseNotebookGetRecentNotebooksCollectionPage implements INotebookGetRecentNotebooksCollectionPage {

    /**
     * A collection page for Notebook.
     *
     * @param response the serialized BaseNotebookGetRecentNotebooksCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public NotebookGetRecentNotebooksCollectionPage(final BaseNotebookGetRecentNotebooksCollectionResponse response, final INotebookGetRecentNotebooksCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
