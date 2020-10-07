// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.core;

import com.google.gson.JsonObject;
import com.microsoft.graph.models.extensions.IBaseGraphServiceClient;
import com.microsoft.graph.core.CustomRequestBuilder;

/**
 * The interface for the Graph Service Client.
 */
public interface IGraphServiceClient extends IBaseGraphServiceClient {
    
    <T> CustomRequestBuilder<T> customRequest(final String url, final Class<T> responseType);
	
    CustomRequestBuilder<JsonObject> customRequest(final String url);
}
