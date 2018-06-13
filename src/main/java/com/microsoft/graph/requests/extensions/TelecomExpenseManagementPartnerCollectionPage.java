// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseTelecomExpenseManagementPartnerCollectionPage;
import com.microsoft.graph.requests.generated.BaseTelecomExpenseManagementPartnerCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Telecom Expense Management Partner Collection Page.
 */
public class TelecomExpenseManagementPartnerCollectionPage extends BaseTelecomExpenseManagementPartnerCollectionPage implements ITelecomExpenseManagementPartnerCollectionPage {

    /**
     * A collection page for DeviceManagement.
     *
     * @param response the serialized BaseTelecomExpenseManagementPartnerCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public TelecomExpenseManagementPartnerCollectionPage(final BaseTelecomExpenseManagementPartnerCollectionResponse response, final ITelecomExpenseManagementPartnerCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
