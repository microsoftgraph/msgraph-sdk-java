// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.WorkbookSortField;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookTableSortApplyRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Table Sort Apply Request Builder.
 */
public class WorkbookTableSortApplyRequestBuilder extends BaseWorkbookTableSortApplyRequestBuilder implements IWorkbookTableSortApplyRequestBuilder {

    /**
     * The request builder for this WorkbookTableSortApply
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param fields the fields
     * @param matchCase the matchCase
     * @param method the method
     */
    public WorkbookTableSortApplyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<WorkbookSortField> fields, final Boolean matchCase, final String method) {
        super(requestUrl, client, requestOptions, fields, matchCase, method);
    }
}
