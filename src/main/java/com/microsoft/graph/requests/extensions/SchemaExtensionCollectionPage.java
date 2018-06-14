// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseSchemaExtensionCollectionPage;
import com.microsoft.graph.requests.generated.BaseSchemaExtensionCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Schema Extension Collection Page.
 */
public class SchemaExtensionCollectionPage extends BaseSchemaExtensionCollectionPage implements ISchemaExtensionCollectionPage {

    /**
     * A collection page for SchemaExtension.
     *
     * @param response the serialized BaseSchemaExtensionCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public SchemaExtensionCollectionPage(final BaseSchemaExtensionCollectionResponse response, final ISchemaExtensionCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
