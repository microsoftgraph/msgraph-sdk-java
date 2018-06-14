// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFilterApplyCustomFilterRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Filter Apply Custom Filter Request Builder.
 */
public class WorkbookFilterApplyCustomFilterRequestBuilder extends BaseWorkbookFilterApplyCustomFilterRequestBuilder implements IWorkbookFilterApplyCustomFilterRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApplyCustomFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param criteria1 the criteria1
     * @param criteria2 the criteria2
     * @param oper the oper
     */
    public WorkbookFilterApplyCustomFilterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String criteria1, final String criteria2, final String oper) {
        super(requestUrl, client, requestOptions, criteria1, criteria2, oper);
    }
}
