// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseEducationSchoolCollectionResponse;
import com.microsoft.graph.requests.generated.BaseEducationSchoolCollectionWithReferencesPage;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Education School Collection With References Page.
 */
public class EducationSchoolCollectionWithReferencesPage extends BaseEducationSchoolCollectionWithReferencesPage implements IEducationSchoolCollectionWithReferencesPage {

    /**
     * A collection page for EducationUser.
     *
     * @param response the serialized BaseEducationSchoolCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EducationSchoolCollectionWithReferencesPage(final BaseEducationSchoolCollectionResponse response, final IEducationSchoolCollectionWithReferencesRequestBuilder builder) {
        super(response, builder);
    }
}
