// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.WorkbookFilterCriteria;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFilterApplyRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Filter Apply Request Builder.
 */
public class WorkbookFilterApplyRequestBuilder extends BaseWorkbookFilterApplyRequestBuilder implements IWorkbookFilterApplyRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApply
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param criteria the criteria
     */
    public WorkbookFilterApplyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final WorkbookFilterCriteria criteria) {
        super(requestUrl, client, requestOptions, criteria);
    }
}
