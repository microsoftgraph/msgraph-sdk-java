// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsLog10Request;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Log10Request.
 */
public class WorkbookFunctionsLog10Request extends BaseWorkbookFunctionsLog10Request implements IWorkbookFunctionsLog10Request {

    /**
     * The request for this WorkbookFunctionsLog10
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsLog10Request(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
}
