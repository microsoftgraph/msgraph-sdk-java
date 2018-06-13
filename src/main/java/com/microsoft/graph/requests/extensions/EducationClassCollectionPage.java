// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseEducationClassCollectionPage;
import com.microsoft.graph.requests.generated.BaseEducationClassCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Education Class Collection Page.
 */
public class EducationClassCollectionPage extends BaseEducationClassCollectionPage implements IEducationClassCollectionPage {

    /**
     * A collection page for EducationRoot.
     *
     * @param response the serialized BaseEducationClassCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public EducationClassCollectionPage(final BaseEducationClassCollectionResponse response, final IEducationClassCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
