// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookWorksheetUsedRangeRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Worksheet Used Range Request Builder.
 */
public class WorkbookWorksheetUsedRangeRequestBuilder extends BaseWorkbookWorksheetUsedRangeRequestBuilder implements IWorkbookWorksheetUsedRangeRequestBuilder {

    /**
     * The request builder for this WorkbookWorksheetUsedRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookWorksheetUsedRangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * The request builder for this WorkbookWorksheetUsedRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param valuesOnly the valuesOnly
     */
    public WorkbookWorksheetUsedRangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Boolean valuesOnly) {
        super(requestUrl, client, requestOptions, valuesOnly);
    }
}
