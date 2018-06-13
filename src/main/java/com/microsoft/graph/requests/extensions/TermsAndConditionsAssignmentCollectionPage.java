// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseTermsAndConditionsAssignmentCollectionPage;
import com.microsoft.graph.requests.generated.BaseTermsAndConditionsAssignmentCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Terms And Conditions Assignment Collection Page.
 */
public class TermsAndConditionsAssignmentCollectionPage extends BaseTermsAndConditionsAssignmentCollectionPage implements ITermsAndConditionsAssignmentCollectionPage {

    /**
     * A collection page for TermsAndConditions.
     *
     * @param response the serialized BaseTermsAndConditionsAssignmentCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public TermsAndConditionsAssignmentCollectionPage(final BaseTermsAndConditionsAssignmentCollectionResponse response, final ITermsAndConditionsAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
