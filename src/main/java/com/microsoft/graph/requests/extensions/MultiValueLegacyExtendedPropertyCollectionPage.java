// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseMultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.generated.BaseMultiValueLegacyExtendedPropertyCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Multi Value Legacy Extended Property Collection Page.
 */
public class MultiValueLegacyExtendedPropertyCollectionPage extends BaseMultiValueLegacyExtendedPropertyCollectionPage implements IMultiValueLegacyExtendedPropertyCollectionPage {

    /**
     * A collection page for Post.
     *
     * @param response the serialized BaseMultiValueLegacyExtendedPropertyCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public MultiValueLegacyExtendedPropertyCollectionPage(final BaseMultiValueLegacyExtendedPropertyCollectionResponse response, final IMultiValueLegacyExtendedPropertyCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
