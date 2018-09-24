// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseColumnDefinitionCollectionPage;
import com.microsoft.graph.requests.generated.BaseColumnDefinitionCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Column Definition Collection Page.
 */
public class ColumnDefinitionCollectionPage extends BaseColumnDefinitionCollectionPage implements IColumnDefinitionCollectionPage {

    /**
     * A collection page for List.
     *
     * @param response the serialized BaseColumnDefinitionCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ColumnDefinitionCollectionPage(final BaseColumnDefinitionCollectionResponse response, final IColumnDefinitionCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
