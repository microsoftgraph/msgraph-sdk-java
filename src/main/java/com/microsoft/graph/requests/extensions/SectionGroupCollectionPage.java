// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SectionGroup;
import com.microsoft.graph.requests.extensions.ISectionGroupCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.SectionGroupCollectionPage;
import com.microsoft.graph.requests.extensions.SectionGroupCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Section Group Collection Page.
 */
public class SectionGroupCollectionPage extends BaseCollectionPage<SectionGroup, ISectionGroupCollectionRequestBuilder> implements ISectionGroupCollectionPage {

    /**
     * A collection page for SectionGroup
     *
     * @param response the serialized SectionGroupCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SectionGroupCollectionPage(final SectionGroupCollectionResponse response, final ISectionGroupCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}