// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ExtensionProperty;
import com.microsoft.graph.requests.extensions.IExtensionPropertyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ExtensionPropertyCollectionPage;
import com.microsoft.graph.requests.extensions.ExtensionPropertyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Extension Property Collection Page.
 */
public class ExtensionPropertyCollectionPage extends BaseCollectionPage<ExtensionProperty, IExtensionPropertyCollectionRequestBuilder> implements IExtensionPropertyCollectionPage {

    /**
     * A collection page for ExtensionProperty
     *
     * @param response the serialized ExtensionPropertyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ExtensionPropertyCollectionPage(final ExtensionPropertyCollectionResponse response, final IExtensionPropertyCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}