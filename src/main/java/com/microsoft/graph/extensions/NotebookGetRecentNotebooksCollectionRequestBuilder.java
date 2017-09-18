// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Notebook Get Recent Notebooks Collection Request Builder.
 */
public class NotebookGetRecentNotebooksCollectionRequestBuilder extends BaseNotebookGetRecentNotebooksCollectionRequestBuilder implements INotebookGetRecentNotebooksCollectionRequestBuilder {

    /**
     * The request builder for this collection of Notebook
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public NotebookGetRecentNotebooksCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final Boolean includePersonalNotebooks) {
        super(requestUrl, client, requestOptions, includePersonalNotebooks);
    }
}
