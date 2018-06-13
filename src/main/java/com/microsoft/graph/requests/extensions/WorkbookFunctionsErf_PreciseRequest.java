// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsErf_PreciseRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Erf_Precise Request.
 */
public class WorkbookFunctionsErf_PreciseRequest extends BaseWorkbookFunctionsErf_PreciseRequest implements IWorkbookFunctionsErf_PreciseRequest {

    /**
     * The request for this WorkbookFunctionsErf_Precise
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsErf_PreciseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
}
