// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BasePersonCollectionPage;
import com.microsoft.graph.requests.generated.BasePersonCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Person Collection Page.
 */
public class PersonCollectionPage extends BasePersonCollectionPage implements IPersonCollectionPage {

    /**
     * A collection page for User.
     *
     * @param response the serialized BasePersonCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public PersonCollectionPage(final BasePersonCollectionResponse response, final IPersonCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
