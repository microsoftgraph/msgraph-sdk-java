// Template Source: IBaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookTable;
import com.microsoft.graph.models.extensions.WorkbookTableColumn;
import com.microsoft.graph.models.extensions.WorkbookRange;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWorkbookTableColumnRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnCollectionRequest;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnAddRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnCountRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnItemAtRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Table Column Collection Request Builder.
 */
public interface IWorkbookTableColumnCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IWorkbookTableColumnCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IWorkbookTableColumnCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IWorkbookTableColumnRequestBuilder byId(final String id);

    IWorkbookTableColumnAddRequestBuilder add(final Integer index, final com.google.gson.JsonElement values, final String name);
    IWorkbookTableColumnCountRequestBuilder count();
    IWorkbookTableColumnItemAtRequestBuilder itemAt(final Integer index);
}