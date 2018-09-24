// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseEducationSchoolCollectionReferenceRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Education School Collection Reference Request.
 */
public class EducationSchoolCollectionReferenceRequest extends BaseEducationSchoolCollectionReferenceRequest implements IEducationSchoolCollectionReferenceRequest {

    /**
     * The request for this collection of EducationUser
     *
     * @param requestUrl the request URL
     * @param client     the service client
     * @param options    the options for this request
     */
    public EducationSchoolCollectionReferenceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> options) {
        super(requestUrl, client, options);
    }
}
