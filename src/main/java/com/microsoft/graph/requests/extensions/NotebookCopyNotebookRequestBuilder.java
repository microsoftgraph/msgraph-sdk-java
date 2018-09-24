// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseNotebookCopyNotebookRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Notebook Copy Notebook Request Builder.
 */
public class NotebookCopyNotebookRequestBuilder extends BaseNotebookCopyNotebookRequestBuilder implements INotebookCopyNotebookRequestBuilder {

    /**
     * The request builder for this NotebookCopyNotebook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param groupId the groupId
     * @param renameAs the renameAs
     * @param notebookFolder the notebookFolder
     * @param siteCollectionId the siteCollectionId
     * @param siteId the siteId
     */
    public NotebookCopyNotebookRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String groupId, final String renameAs, final String notebookFolder, final String siteCollectionId, final String siteId) {
        super(requestUrl, client, requestOptions, groupId, renameAs, notebookFolder, siteCollectionId, siteId);
    }
}
