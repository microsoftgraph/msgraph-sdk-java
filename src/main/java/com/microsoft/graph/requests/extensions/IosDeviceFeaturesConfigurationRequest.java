// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosDeviceFeaturesConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Device Features Configuration Request.
 */
public class IosDeviceFeaturesConfigurationRequest extends BaseRequest implements IIosDeviceFeaturesConfigurationRequest {
	
    /**
     * The request for the IosDeviceFeaturesConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosDeviceFeaturesConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosDeviceFeaturesConfiguration.class);
    }

    /**
     * Gets the IosDeviceFeaturesConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super IosDeviceFeaturesConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosDeviceFeaturesConfiguration from the service
     *
     * @return the IosDeviceFeaturesConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosDeviceFeaturesConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super IosDeviceFeaturesConfiguration> callback) {
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
     * Patches this IosDeviceFeaturesConfiguration with a source
     *
     * @param sourceIosDeviceFeaturesConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosDeviceFeaturesConfiguration sourceIosDeviceFeaturesConfiguration, final ICallback<? super IosDeviceFeaturesConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceIosDeviceFeaturesConfiguration);
    }

    /**
     * Patches this IosDeviceFeaturesConfiguration with a source
     *
     * @param sourceIosDeviceFeaturesConfiguration the source object with updates
     * @return the updated IosDeviceFeaturesConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosDeviceFeaturesConfiguration patch(final IosDeviceFeaturesConfiguration sourceIosDeviceFeaturesConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosDeviceFeaturesConfiguration);
    }

    /**
     * Creates a IosDeviceFeaturesConfiguration with a new object
     *
     * @param newIosDeviceFeaturesConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosDeviceFeaturesConfiguration newIosDeviceFeaturesConfiguration, final ICallback<? super IosDeviceFeaturesConfiguration> callback) {
        send(HttpMethod.POST, callback, newIosDeviceFeaturesConfiguration);
    }

    /**
     * Creates a IosDeviceFeaturesConfiguration with a new object
     *
     * @param newIosDeviceFeaturesConfiguration the new object to create
     * @return the created IosDeviceFeaturesConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosDeviceFeaturesConfiguration post(final IosDeviceFeaturesConfiguration newIosDeviceFeaturesConfiguration) throws ClientException {
        return send(HttpMethod.POST, newIosDeviceFeaturesConfiguration);
    }

    /**
     * Creates a IosDeviceFeaturesConfiguration with a new object
     *
     * @param newIosDeviceFeaturesConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final IosDeviceFeaturesConfiguration newIosDeviceFeaturesConfiguration, final ICallback<? super IosDeviceFeaturesConfiguration> callback) {
        send(HttpMethod.PUT, callback, newIosDeviceFeaturesConfiguration);
    }

    /**
     * Creates a IosDeviceFeaturesConfiguration with a new object
     *
     * @param newIosDeviceFeaturesConfiguration the object to create/update
     * @return the created IosDeviceFeaturesConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosDeviceFeaturesConfiguration put(final IosDeviceFeaturesConfiguration newIosDeviceFeaturesConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newIosDeviceFeaturesConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosDeviceFeaturesConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IosDeviceFeaturesConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosDeviceFeaturesConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IosDeviceFeaturesConfigurationRequest)this;
     }

}
