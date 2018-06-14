// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.EducationOrganization;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseEducationOrganizationRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Education Organization Request.
 */
public class EducationOrganizationRequest extends BaseEducationOrganizationRequest implements IEducationOrganizationRequest {

    /**
     * The request for the EducationOrganization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public EducationOrganizationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends EducationOrganization> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the EducationOrganization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationOrganizationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationOrganization.class);
    }
}
