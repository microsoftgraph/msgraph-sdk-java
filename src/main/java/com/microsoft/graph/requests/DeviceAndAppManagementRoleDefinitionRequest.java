// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceAndAppManagementRoleDefinition;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device And App Management Role Definition Request.
 */
public class DeviceAndAppManagementRoleDefinitionRequest extends BaseRequest<DeviceAndAppManagementRoleDefinition> {
	
    /**
     * The request for the DeviceAndAppManagementRoleDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAndAppManagementRoleDefinitionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceAndAppManagementRoleDefinition.class);
    }

    /**
     * Gets the DeviceAndAppManagementRoleDefinition from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAndAppManagementRoleDefinition> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceAndAppManagementRoleDefinition from the service
     *
     * @return the DeviceAndAppManagementRoleDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceAndAppManagementRoleDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAndAppManagementRoleDefinition> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceAndAppManagementRoleDefinition delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceAndAppManagementRoleDefinition with a source
     *
     * @param sourceDeviceAndAppManagementRoleDefinition the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAndAppManagementRoleDefinition> patchAsync(@Nonnull final DeviceAndAppManagementRoleDefinition sourceDeviceAndAppManagementRoleDefinition) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceAndAppManagementRoleDefinition);
    }

    /**
     * Patches this DeviceAndAppManagementRoleDefinition with a source
     *
     * @param sourceDeviceAndAppManagementRoleDefinition the source object with updates
     * @return the updated DeviceAndAppManagementRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceAndAppManagementRoleDefinition patch(@Nonnull final DeviceAndAppManagementRoleDefinition sourceDeviceAndAppManagementRoleDefinition) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceAndAppManagementRoleDefinition);
    }

    /**
     * Creates a DeviceAndAppManagementRoleDefinition with a new object
     *
     * @param newDeviceAndAppManagementRoleDefinition the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAndAppManagementRoleDefinition> postAsync(@Nonnull final DeviceAndAppManagementRoleDefinition newDeviceAndAppManagementRoleDefinition) {
        return sendAsync(HttpMethod.POST, newDeviceAndAppManagementRoleDefinition);
    }

    /**
     * Creates a DeviceAndAppManagementRoleDefinition with a new object
     *
     * @param newDeviceAndAppManagementRoleDefinition the new object to create
     * @return the created DeviceAndAppManagementRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceAndAppManagementRoleDefinition post(@Nonnull final DeviceAndAppManagementRoleDefinition newDeviceAndAppManagementRoleDefinition) throws ClientException {
        return send(HttpMethod.POST, newDeviceAndAppManagementRoleDefinition);
    }

    /**
     * Creates a DeviceAndAppManagementRoleDefinition with a new object
     *
     * @param newDeviceAndAppManagementRoleDefinition the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAndAppManagementRoleDefinition> putAsync(@Nonnull final DeviceAndAppManagementRoleDefinition newDeviceAndAppManagementRoleDefinition) {
        return sendAsync(HttpMethod.PUT, newDeviceAndAppManagementRoleDefinition);
    }

    /**
     * Creates a DeviceAndAppManagementRoleDefinition with a new object
     *
     * @param newDeviceAndAppManagementRoleDefinition the object to create/update
     * @return the created DeviceAndAppManagementRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceAndAppManagementRoleDefinition put(@Nonnull final DeviceAndAppManagementRoleDefinition newDeviceAndAppManagementRoleDefinition) throws ClientException {
        return send(HttpMethod.PUT, newDeviceAndAppManagementRoleDefinition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceAndAppManagementRoleDefinitionRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public DeviceAndAppManagementRoleDefinitionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

