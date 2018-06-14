// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookTableAddRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Table Add Request Builder.
 */
public class WorkbookTableAddRequestBuilder extends BaseWorkbookTableAddRequestBuilder implements IWorkbookTableAddRequestBuilder {

    /**
     * The request builder for this WorkbookTableAdd
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param address the address
     * @param hasHeaders the hasHeaders
     */
    public WorkbookTableAddRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String address, final Boolean hasHeaders) {
        super(requestUrl, client, requestOptions, address, hasHeaders);
    }
}
