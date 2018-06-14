// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseUserInstallStateSummaryCollectionPage;
import com.microsoft.graph.requests.generated.BaseUserInstallStateSummaryCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the User Install State Summary Collection Page.
 */
public class UserInstallStateSummaryCollectionPage extends BaseUserInstallStateSummaryCollectionPage implements IUserInstallStateSummaryCollectionPage {

    /**
     * A collection page for ManagedEBook.
     *
     * @param response the serialized BaseUserInstallStateSummaryCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public UserInstallStateSummaryCollectionPage(final BaseUserInstallStateSummaryCollectionResponse response, final IUserInstallStateSummaryCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
