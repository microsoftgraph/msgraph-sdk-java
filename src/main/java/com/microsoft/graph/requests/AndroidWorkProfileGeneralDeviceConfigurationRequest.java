// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidWorkProfileGeneralDeviceConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Work Profile General Device Configuration Request.
 */
public class AndroidWorkProfileGeneralDeviceConfigurationRequest extends BaseRequest<AndroidWorkProfileGeneralDeviceConfiguration> {
	
    /**
     * The request for the AndroidWorkProfileGeneralDeviceConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidWorkProfileGeneralDeviceConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidWorkProfileGeneralDeviceConfiguration.class);
    }

    /**
     * Gets the AndroidWorkProfileGeneralDeviceConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileGeneralDeviceConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidWorkProfileGeneralDeviceConfiguration from the service
     *
     * @return the AndroidWorkProfileGeneralDeviceConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileGeneralDeviceConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileGeneralDeviceConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidWorkProfileGeneralDeviceConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidWorkProfileGeneralDeviceConfiguration with a source
     *
     * @param sourceAndroidWorkProfileGeneralDeviceConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileGeneralDeviceConfiguration> patchAsync(@Nonnull final AndroidWorkProfileGeneralDeviceConfiguration sourceAndroidWorkProfileGeneralDeviceConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidWorkProfileGeneralDeviceConfiguration);
    }

    /**
     * Patches this AndroidWorkProfileGeneralDeviceConfiguration with a source
     *
     * @param sourceAndroidWorkProfileGeneralDeviceConfiguration the source object with updates
     * @return the updated AndroidWorkProfileGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileGeneralDeviceConfiguration patch(@Nonnull final AndroidWorkProfileGeneralDeviceConfiguration sourceAndroidWorkProfileGeneralDeviceConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidWorkProfileGeneralDeviceConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidWorkProfileGeneralDeviceConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileGeneralDeviceConfiguration> postAsync(@Nonnull final AndroidWorkProfileGeneralDeviceConfiguration newAndroidWorkProfileGeneralDeviceConfiguration) {
        return sendAsync(HttpMethod.POST, newAndroidWorkProfileGeneralDeviceConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidWorkProfileGeneralDeviceConfiguration the new object to create
     * @return the created AndroidWorkProfileGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileGeneralDeviceConfiguration post(@Nonnull final AndroidWorkProfileGeneralDeviceConfiguration newAndroidWorkProfileGeneralDeviceConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAndroidWorkProfileGeneralDeviceConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidWorkProfileGeneralDeviceConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileGeneralDeviceConfiguration> putAsync(@Nonnull final AndroidWorkProfileGeneralDeviceConfiguration newAndroidWorkProfileGeneralDeviceConfiguration) {
        return sendAsync(HttpMethod.PUT, newAndroidWorkProfileGeneralDeviceConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidWorkProfileGeneralDeviceConfiguration the object to create/update
     * @return the created AndroidWorkProfileGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileGeneralDeviceConfiguration put(@Nonnull final AndroidWorkProfileGeneralDeviceConfiguration newAndroidWorkProfileGeneralDeviceConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newAndroidWorkProfileGeneralDeviceConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidWorkProfileGeneralDeviceConfigurationRequest select(@Nonnull final String value) {
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
     public AndroidWorkProfileGeneralDeviceConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
