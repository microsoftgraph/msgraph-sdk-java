// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.WorkbookIcon;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFilterApplyIconFilterRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Filter Apply Icon Filter Request Builder.
 */
public class WorkbookFilterApplyIconFilterRequestBuilder extends BaseWorkbookFilterApplyIconFilterRequestBuilder implements IWorkbookFilterApplyIconFilterRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApplyIconFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param icon the icon
     */
    public WorkbookFilterApplyIconFilterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final WorkbookIcon icon) {
        super(requestUrl, client, requestOptions, icon);
    }
}
