// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsHex2DecRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Hex2Dec Request.
 */
public class WorkbookFunctionsHex2DecRequest extends BaseWorkbookFunctionsHex2DecRequest implements IWorkbookFunctionsHex2DecRequest {

    /**
     * The request for this WorkbookFunctionsHex2Dec
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsHex2DecRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
}
