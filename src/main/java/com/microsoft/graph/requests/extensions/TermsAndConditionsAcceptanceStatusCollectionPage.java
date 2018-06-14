// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseTermsAndConditionsAcceptanceStatusCollectionPage;
import com.microsoft.graph.requests.generated.BaseTermsAndConditionsAcceptanceStatusCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Terms And Conditions Acceptance Status Collection Page.
 */
public class TermsAndConditionsAcceptanceStatusCollectionPage extends BaseTermsAndConditionsAcceptanceStatusCollectionPage implements ITermsAndConditionsAcceptanceStatusCollectionPage {

    /**
     * A collection page for TermsAndConditions.
     *
     * @param response the serialized BaseTermsAndConditionsAcceptanceStatusCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public TermsAndConditionsAcceptanceStatusCollectionPage(final BaseTermsAndConditionsAcceptanceStatusCollectionResponse response, final ITermsAndConditionsAcceptanceStatusCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
