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
    
    @Nonnull
    <T> CustomRequestBuilder<T> customRequest(@Nonnull final String url, @Nonnull final Class<T> responseType);
	
    @Nonnull
    CustomRequestBuilder<JsonObject> customRequest(@Nonnull final String url);
}
