// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileAppCategory;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.MobileAppCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.MobileAppCategoryCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Category Collection Page.
 */
public class MobileAppCategoryCollectionPage extends BaseCollectionPage<MobileAppCategory, IMobileAppCategoryCollectionRequestBuilder> implements IMobileAppCategoryCollectionPage {

    /**
     * A collection page for MobileAppCategory
     *
     * @param response the serialized MobileAppCategoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MobileAppCategoryCollectionPage(final MobileAppCategoryCollectionResponse response, final IMobileAppCategoryCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}