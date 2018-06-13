// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseEducationUserCollectionPage;
import com.microsoft.graph.requests.generated.BaseEducationUserCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Education User Collection Page.
 */
public class EducationUserCollectionPage extends BaseEducationUserCollectionPage implements IEducationUserCollectionPage {

    /**
     * A collection page for EducationRoot.
     *
     * @param response the serialized BaseEducationUserCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public EducationUserCollectionPage(final BaseEducationUserCollectionResponse response, final IEducationUserCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
