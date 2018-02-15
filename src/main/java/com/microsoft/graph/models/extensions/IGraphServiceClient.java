// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.google.gson.JsonObject;
import com.microsoft.graph.models.generated.IBaseGraphServiceClient;
import com.microsoft.graph.requests.extensions.CustomRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The interface for the Graph Service Client.
 */
public interface IGraphServiceClient extends IBaseGraphServiceClient {
	
	<T> CustomRequestBuilder<T> customRequest(final String url, final Class<T> responseType);
	
	CustomRequestBuilder<JsonObject> customRequest(final String url);
}
