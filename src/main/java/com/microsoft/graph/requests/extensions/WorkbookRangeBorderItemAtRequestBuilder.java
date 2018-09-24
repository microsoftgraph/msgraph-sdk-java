// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookRangeBorderItemAtRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Range Border Item At Request Builder.
 */
public class WorkbookRangeBorderItemAtRequestBuilder extends BaseWorkbookRangeBorderItemAtRequestBuilder implements IWorkbookRangeBorderItemAtRequestBuilder {

    /**
     * The request builder for this WorkbookRangeBorderItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param index the index
     */
    public WorkbookRangeBorderItemAtRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer index) {
        super(requestUrl, client, requestOptions, index);
    }
}
