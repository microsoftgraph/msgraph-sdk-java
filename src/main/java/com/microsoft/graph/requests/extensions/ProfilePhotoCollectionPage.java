// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseProfilePhotoCollectionPage;
import com.microsoft.graph.requests.generated.BaseProfilePhotoCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Profile Photo Collection Page.
 */
public class ProfilePhotoCollectionPage extends BaseProfilePhotoCollectionPage implements IProfilePhotoCollectionPage {

    /**
     * A collection page for User.
     *
     * @param response the serialized BaseProfilePhotoCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ProfilePhotoCollectionPage(final BaseProfilePhotoCollectionResponse response, final IProfilePhotoCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
