// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the List Collection Page.
 */
public class ListCollectionPage extends BaseListCollectionPage implements IListCollectionPage {

    /**
     * A collection page for Site.
     *
     * @param response The serialized BaseListCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ListCollectionPage(final BaseListCollectionResponse response, final IListCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
