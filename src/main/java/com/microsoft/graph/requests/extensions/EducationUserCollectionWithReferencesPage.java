// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseEducationUserCollectionResponse;
import com.microsoft.graph.requests.generated.BaseEducationUserCollectionWithReferencesPage;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Education User Collection With References Page.
 */
public class EducationUserCollectionWithReferencesPage extends BaseEducationUserCollectionWithReferencesPage implements IEducationUserCollectionWithReferencesPage {

    /**
     * A collection page for EducationSchool.
     *
     * @param response the serialized BaseEducationUserCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EducationUserCollectionWithReferencesPage(final BaseEducationUserCollectionResponse response, final IEducationUserCollectionWithReferencesRequestBuilder builder) {
        super(response, builder);
    }
}
