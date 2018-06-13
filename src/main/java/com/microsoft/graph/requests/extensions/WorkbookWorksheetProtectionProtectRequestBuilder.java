// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.WorkbookWorksheetProtectionOptions;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookWorksheetProtectionProtectRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Worksheet Protection Protect Request Builder.
 */
public class WorkbookWorksheetProtectionProtectRequestBuilder extends BaseWorkbookWorksheetProtectionProtectRequestBuilder implements IWorkbookWorksheetProtectionProtectRequestBuilder {

    /**
     * The request builder for this WorkbookWorksheetProtectionProtect
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param options the options
     */
    public WorkbookWorksheetProtectionProtectRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final WorkbookWorksheetProtectionOptions options) {
        super(requestUrl, client, requestOptions, options);
    }
}
