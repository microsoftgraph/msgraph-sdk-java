// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsT_InvRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions T_Inv Request.
 */
public class WorkbookFunctionsT_InvRequest extends BaseWorkbookFunctionsT_InvRequest implements IWorkbookFunctionsT_InvRequest {

    /**
     * The request for this WorkbookFunctionsT_Inv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsT_InvRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
}
