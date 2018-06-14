// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookRangeClearRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Range Clear Request Builder.
 */
public class WorkbookRangeClearRequestBuilder extends BaseWorkbookRangeClearRequestBuilder implements IWorkbookRangeClearRequestBuilder {

    /**
     * The request builder for this WorkbookRangeClear
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param applyTo the applyTo
     */
    public WorkbookRangeClearRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String applyTo) {
        super(requestUrl, client, requestOptions, applyTo);
    }
}
