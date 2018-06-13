// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookNamedItemAddFormulaLocalRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Named Item Add Formula Local Request Builder.
 */
public class WorkbookNamedItemAddFormulaLocalRequestBuilder extends BaseWorkbookNamedItemAddFormulaLocalRequestBuilder implements IWorkbookNamedItemAddFormulaLocalRequestBuilder {

    /**
     * The request builder for this WorkbookNamedItemAddFormulaLocal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param name the name
     * @param formula the formula
     * @param comment the comment
     */
    public WorkbookNamedItemAddFormulaLocalRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String name, final String formula, final String comment) {
        super(requestUrl, client, requestOptions, name, formula, comment);
    }
}
