// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TermsAndConditionsAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms And Conditions Assignment Request.
 */
public class TermsAndConditionsAssignmentRequest extends BaseRequest implements ITermsAndConditionsAssignmentRequest {
	
    /**
     * The request for the TermsAndConditionsAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TermsAndConditionsAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TermsAndConditionsAssignment.class);
    }

    /**
     * Gets the TermsAndConditionsAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super TermsAndConditionsAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TermsAndConditionsAssignment from the service
     *
     * @return the TermsAndConditionsAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TermsAndConditionsAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super TermsAndConditionsAssignment> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TermsAndConditionsAssignment with a source
     *
     * @param sourceTermsAndConditionsAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TermsAndConditionsAssignment sourceTermsAndConditionsAssignment, final ICallback<? super TermsAndConditionsAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceTermsAndConditionsAssignment);
    }

    /**
     * Patches this TermsAndConditionsAssignment with a source
     *
     * @param sourceTermsAndConditionsAssignment the source object with updates
     * @return the updated TermsAndConditionsAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TermsAndConditionsAssignment patch(final TermsAndConditionsAssignment sourceTermsAndConditionsAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceTermsAndConditionsAssignment);
    }

    /**
     * Creates a TermsAndConditionsAssignment with a new object
     *
     * @param newTermsAndConditionsAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TermsAndConditionsAssignment newTermsAndConditionsAssignment, final ICallback<? super TermsAndConditionsAssignment> callback) {
        send(HttpMethod.POST, callback, newTermsAndConditionsAssignment);
    }

    /**
     * Creates a TermsAndConditionsAssignment with a new object
     *
     * @param newTermsAndConditionsAssignment the new object to create
     * @return the created TermsAndConditionsAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TermsAndConditionsAssignment post(final TermsAndConditionsAssignment newTermsAndConditionsAssignment) throws ClientException {
        return send(HttpMethod.POST, newTermsAndConditionsAssignment);
    }

    /**
     * Creates a TermsAndConditionsAssignment with a new object
     *
     * @param newTermsAndConditionsAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final TermsAndConditionsAssignment newTermsAndConditionsAssignment, final ICallback<? super TermsAndConditionsAssignment> callback) {
        send(HttpMethod.PUT, callback, newTermsAndConditionsAssignment);
    }

    /**
     * Creates a TermsAndConditionsAssignment with a new object
     *
     * @param newTermsAndConditionsAssignment the object to create/update
     * @return the created TermsAndConditionsAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TermsAndConditionsAssignment put(final TermsAndConditionsAssignment newTermsAndConditionsAssignment) throws ClientException {
        return send(HttpMethod.PUT, newTermsAndConditionsAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITermsAndConditionsAssignmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TermsAndConditionsAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITermsAndConditionsAssignmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TermsAndConditionsAssignmentRequest)this;
     }

}
