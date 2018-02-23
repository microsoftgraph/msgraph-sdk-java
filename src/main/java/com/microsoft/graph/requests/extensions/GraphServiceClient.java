// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.authentication.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.logger.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.serializer.*;

import com.google.gson.JsonObject;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Graph Service Client
 */
public class GraphServiceClient extends BaseGraphServiceClient implements IGraphServiceClient {

    /**
     * Restricted constructor
     */
    protected GraphServiceClient() {
    }
    
    /**
     * Send a custom request to Graph
     * 
     * @param url          the full URL to make a request with
     * @param responseType the response class to deserialize the response into
     * @return the instance of this builder
     */
    public CustomRequestBuilder customRequest(final String url, final Class responseType) {
    	return new CustomRequestBuilder(getServiceRoot() + url, (IGraphServiceClient)this, null, responseType);
    }
    
    /**
     * Send a custom request to Graph
     * 
     * @param url the full URL to make a request with
     * @return the instance of this builder
     */
    public CustomRequestBuilder customRequest(final String url) {
    	return new CustomRequestBuilder(getServiceRoot() + url, (IGraphServiceClient)this, null, JsonObject.class);
    }
    
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The builder for this GraphServiceClient
     */
    public static class Builder  {
        
        Builder() {
            // ensure instantiation only from static factory method 
        }

        /**
         * The client under construction
         */
        private final GraphServiceClient client = new GraphServiceClient();

        /**
         * Sets the serializer
         * 
         * @param serializer the serializer
         * @return the instance of this builder
         */
        public Builder serializer(final ISerializer serializer) {
            client.setSerializer(serializer);
            return this;
        }

        /**
         * Sets the httpProvider
         * 
         * @param httpProvider the httpProvider
         * @return the instance of this builder
         */
        public Builder httpProvider(final IHttpProvider httpProvider) {
            client.setHttpProvider(httpProvider);
            return this;
        }

        /**
         * Sets the authentication provider
         * 
         * @param authenticationProvider the authentication provider
         * @return the instance of this builder
         */
        public Builder authenticationProvider(final IAuthenticationProvider authenticationProvider) {
            client.setAuthenticationProvider(authenticationProvider);
            return this;
        }

        /**
         * Sets the executors
         * 
         * @param executors the executors
         * @return the instance of this builder
         */
        public Builder executors(final IExecutors executors) {
            client.setExecutors(executors);
            return this;
        }

        /**
         * Sets the logger
         * 
         * @param logger the logger
         * @return the instance of this builder
         */
        public Builder logger(final ILogger logger) {
            client.setLogger(logger);
            return this;
        }

        /**
         * Set this builder based on the client configuration
         * 
         * @param clientConfig the client configuration
         * @return the instance of this builder
         */
        public Builder fromConfig(final IClientConfig clientConfig) {
            return this.authenticationProvider(clientConfig.getAuthenticationProvider())
                       .executors(clientConfig.getExecutors())
                       .httpProvider(clientConfig.getHttpProvider())
                       .logger(clientConfig.getLogger())
                       .serializer(clientConfig.getSerializer());
        }

        /**
         * Builds and returns the GraphServiceClient
         * 
         * @return the GraphServiceClient object
         * @throws ClientException if there was an exception creating the client
         */
        public IGraphServiceClient buildClient() throws ClientException  {
            client.validate();
            return client;
        }
    }
}
