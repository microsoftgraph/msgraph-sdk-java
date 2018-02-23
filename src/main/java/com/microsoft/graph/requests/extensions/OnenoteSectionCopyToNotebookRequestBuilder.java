// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Onenote Section Copy To Notebook Request Builder.
 */
public class OnenoteSectionCopyToNotebookRequestBuilder extends BaseOnenoteSectionCopyToNotebookRequestBuilder implements IOnenoteSectionCopyToNotebookRequestBuilder {

    /**
     * The request builder for this OnenoteSectionCopyToNotebook
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param id The id
     * @param groupId The groupId
     * @param renameAs The renameAs
     */
    public OnenoteSectionCopyToNotebookRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String id, final String groupId, final String renameAs) {
        super(requestUrl, client, requestOptions, id, groupId, renameAs);
    }
}
