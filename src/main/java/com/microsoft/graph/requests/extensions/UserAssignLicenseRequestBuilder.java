// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseUserAssignLicenseRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the User Assign License Request Builder.
 */
public class UserAssignLicenseRequestBuilder extends BaseUserAssignLicenseRequestBuilder implements IUserAssignLicenseRequestBuilder {

    /**
     * The request builder for this UserAssignLicense
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param addLicenses the addLicenses
     * @param removeLicenses the removeLicenses
     */
    public UserAssignLicenseRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<AssignedLicense> addLicenses, final java.util.List<java.util.UUID> removeLicenses) {
        super(requestUrl, client, requestOptions, addLicenses, removeLicenses);
    }
}
