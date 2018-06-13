// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseEducationSchoolCollectionPage;
import com.microsoft.graph.requests.generated.BaseEducationSchoolCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Education School Collection Page.
 */
public class EducationSchoolCollectionPage extends BaseEducationSchoolCollectionPage implements IEducationSchoolCollectionPage {

    /**
     * A collection page for EducationRoot.
     *
     * @param response the serialized BaseEducationSchoolCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public EducationSchoolCollectionPage(final BaseEducationSchoolCollectionResponse response, final IEducationSchoolCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
