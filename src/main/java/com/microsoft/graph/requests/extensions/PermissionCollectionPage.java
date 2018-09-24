// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BasePermissionCollectionPage;
import com.microsoft.graph.requests.generated.BasePermissionCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Permission Collection Page.
 */
public class PermissionCollectionPage extends BasePermissionCollectionPage implements IPermissionCollectionPage {

    /**
     * A collection page for DriveItem.
     *
     * @param response the serialized BasePermissionCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public PermissionCollectionPage(final BasePermissionCollectionResponse response, final IPermissionCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
