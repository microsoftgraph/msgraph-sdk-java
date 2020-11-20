// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.core;

import com.google.gson.JsonObject;

import javax.annotation.Nonnull;

import com.microsoft.graph.models.extensions.IBaseGraphServiceClient;
import com.microsoft.graph.core.CustomRequestBuilder;

/**
 * The interface for the Graph Service Client.
 */
public interface IGraphServiceClient extends IBaseGraphServiceClient {
    
    /**
     * Gets a builder to execute a custom request
     * 
     * @return the custom request builder
     * @param url the url to send the request to
     * @param responseType the class to deserialize the response to
     * @param <T> the type to deserialize the response to
     */
    @Nonnull
    <T> CustomRequestBuilder<T> customRequest(@Nonnull final String url, @Nonnull final Class<T> responseType);
    
    /**
     * Gets a builder to execute a custom request with a generic JSONObject response
     * 
     * @return the custom request builder
     * @param url the url to send the request to
     */
    @Nonnull
    CustomRequestBuilder<JsonObject> customRequest(@Nonnull final String url);
}
