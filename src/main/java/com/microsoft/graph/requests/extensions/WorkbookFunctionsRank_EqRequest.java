// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsRank_EqRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Rank_Eq Request.
 */
public class WorkbookFunctionsRank_EqRequest extends BaseWorkbookFunctionsRank_EqRequest implements IWorkbookFunctionsRank_EqRequest {

    /**
     * The request for this WorkbookFunctionsRank_Eq
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsRank_EqRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
}
