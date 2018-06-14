// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsF_Inv_RTRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions F_Inv_RTRequest.
 */
public class WorkbookFunctionsF_Inv_RTRequest extends BaseWorkbookFunctionsF_Inv_RTRequest implements IWorkbookFunctionsF_Inv_RTRequest {

    /**
     * The request for this WorkbookFunctionsF_Inv_RT
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsF_Inv_RTRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
}
