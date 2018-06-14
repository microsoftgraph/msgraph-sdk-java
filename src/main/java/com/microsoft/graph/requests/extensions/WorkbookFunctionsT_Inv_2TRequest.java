// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsT_Inv_2TRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions T_Inv_2TRequest.
 */
public class WorkbookFunctionsT_Inv_2TRequest extends BaseWorkbookFunctionsT_Inv_2TRequest implements IWorkbookFunctionsT_Inv_2TRequest {

    /**
     * The request for this WorkbookFunctionsT_Inv_2T
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsT_Inv_2TRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
}
