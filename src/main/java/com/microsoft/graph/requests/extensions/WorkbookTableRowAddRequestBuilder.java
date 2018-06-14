// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookTableRowAddRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Table Row Add Request Builder.
 */
public class WorkbookTableRowAddRequestBuilder extends BaseWorkbookTableRowAddRequestBuilder implements IWorkbookTableRowAddRequestBuilder {

    /**
     * The request builder for this WorkbookTableRowAdd
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param index the index
     * @param values the values
     */
    public WorkbookTableRowAddRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer index, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions, index, values);
    }
}
