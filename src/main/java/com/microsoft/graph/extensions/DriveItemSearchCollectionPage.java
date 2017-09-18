// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Drive Item Search Collection Page.
 */
public class DriveItemSearchCollectionPage extends BaseDriveItemSearchCollectionPage implements IDriveItemSearchCollectionPage {

    /**
     * A collection page for DriveItem.
     *
     * @param response The serialized BaseDriveItemSearchCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DriveItemSearchCollectionPage(final BaseDriveItemSearchCollectionResponse response, final IDriveItemSearchCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
