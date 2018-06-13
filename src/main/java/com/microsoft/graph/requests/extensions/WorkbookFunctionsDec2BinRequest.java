// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsDec2BinRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Dec2Bin Request.
 */
public class WorkbookFunctionsDec2BinRequest extends BaseWorkbookFunctionsDec2BinRequest implements IWorkbookFunctionsDec2BinRequest {

    /**
     * The request for this WorkbookFunctionsDec2Bin
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsDec2BinRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
}
