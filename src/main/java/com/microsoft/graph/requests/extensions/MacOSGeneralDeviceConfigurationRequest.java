// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSGeneralDeviceConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSGeneral Device Configuration Request.
 */
public class MacOSGeneralDeviceConfigurationRequest extends BaseRequest implements IMacOSGeneralDeviceConfigurationRequest {
	
    /**
     * The request for the MacOSGeneralDeviceConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSGeneralDeviceConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSGeneralDeviceConfiguration.class);
    }

    /**
     * Gets the MacOSGeneralDeviceConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super MacOSGeneralDeviceConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MacOSGeneralDeviceConfiguration from the service
     *
     * @return the MacOSGeneralDeviceConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSGeneralDeviceConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super MacOSGeneralDeviceConfiguration> callback) {
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
     * Patches this MacOSGeneralDeviceConfiguration with a source
     *
     * @param sourceMacOSGeneralDeviceConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MacOSGeneralDeviceConfiguration sourceMacOSGeneralDeviceConfiguration, final ICallback<? super MacOSGeneralDeviceConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceMacOSGeneralDeviceConfiguration);
    }

    /**
     * Patches this MacOSGeneralDeviceConfiguration with a source
     *
     * @param sourceMacOSGeneralDeviceConfiguration the source object with updates
     * @return the updated MacOSGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSGeneralDeviceConfiguration patch(final MacOSGeneralDeviceConfiguration sourceMacOSGeneralDeviceConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSGeneralDeviceConfiguration);
    }

    /**
     * Creates a MacOSGeneralDeviceConfiguration with a new object
     *
     * @param newMacOSGeneralDeviceConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MacOSGeneralDeviceConfiguration newMacOSGeneralDeviceConfiguration, final ICallback<? super MacOSGeneralDeviceConfiguration> callback) {
        send(HttpMethod.POST, callback, newMacOSGeneralDeviceConfiguration);
    }

    /**
     * Creates a MacOSGeneralDeviceConfiguration with a new object
     *
     * @param newMacOSGeneralDeviceConfiguration the new object to create
     * @return the created MacOSGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSGeneralDeviceConfiguration post(final MacOSGeneralDeviceConfiguration newMacOSGeneralDeviceConfiguration) throws ClientException {
        return send(HttpMethod.POST, newMacOSGeneralDeviceConfiguration);
    }

    /**
     * Creates a MacOSGeneralDeviceConfiguration with a new object
     *
     * @param newMacOSGeneralDeviceConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final MacOSGeneralDeviceConfiguration newMacOSGeneralDeviceConfiguration, final ICallback<? super MacOSGeneralDeviceConfiguration> callback) {
        send(HttpMethod.PUT, callback, newMacOSGeneralDeviceConfiguration);
    }

    /**
     * Creates a MacOSGeneralDeviceConfiguration with a new object
     *
     * @param newMacOSGeneralDeviceConfiguration the object to create/update
     * @return the created MacOSGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSGeneralDeviceConfiguration put(final MacOSGeneralDeviceConfiguration newMacOSGeneralDeviceConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newMacOSGeneralDeviceConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMacOSGeneralDeviceConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MacOSGeneralDeviceConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMacOSGeneralDeviceConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MacOSGeneralDeviceConfigurationRequest)this;
     }

}
