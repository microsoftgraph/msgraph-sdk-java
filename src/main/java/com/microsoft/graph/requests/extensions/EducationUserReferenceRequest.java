// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationUser;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationClassWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education User Reference Request.
 */
public class EducationUserReferenceRequest extends BaseRequest implements IEducationUserReferenceRequest {

    /**
     * The request for the EducationUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationUserReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationUser.class);
    }

    public void delete(final ICallback<? super EducationUser> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public EducationUser delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEducationUserReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (EducationUserReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEducationUserReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EducationUserReferenceRequest)this;
    }
    /**
     * Puts the EducationUser
     *
     * @param srcEducationUser the EducationUser reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(EducationUser srcEducationUser, final ICallback<? super EducationUser> callback) {
        send(HttpMethod.PUT, callback, srcEducationUser);
    }

    /**
     * Puts the EducationUser
     *
     * @param srcEducationUser the EducationUser reference to PUT
     * @return the EducationUser
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public EducationUser put(EducationUser srcEducationUser) throws ClientException {
        return send(HttpMethod.PUT, srcEducationUser);
    }
}