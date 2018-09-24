// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsPercentile_ExcRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Percentile_Exc Request.
 */
public class WorkbookFunctionsPercentile_ExcRequest extends BaseWorkbookFunctionsPercentile_ExcRequest implements IWorkbookFunctionsPercentile_ExcRequest {

    /**
     * The request for this WorkbookFunctionsPercentile_Exc
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsPercentile_ExcRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
}
