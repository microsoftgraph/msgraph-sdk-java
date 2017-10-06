// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.authentication.*;
import com.microsoft.graph.logger.*;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Graph Service Client.
 */
public class GraphServiceClient extends BaseGraphServiceClient implements IGraphServiceClient {

    /**
     * Restricted constructor
     */
    protected GraphServiceClient() {
    }

    /**
     * The builder for this GraphServiceClient
     */
    public static class Builder  {

        /**
         * The client under construction
         */
        private final GraphServiceClient mClient = new GraphServiceClient();

        /**
         * Sets the serializer
         * @param serializer The serializer
         * @return the instance of this builder
         */
        public Builder serializer(final ISerializer serializer) {
            mClient.setSerializer(serializer);
            return this;
        }

        /**
         * Sets the httpProvider
         * @param httpProvider The httpProvider
         * @return the instance of this builder
         */
        public Builder httpProvider(final IHttpProvider httpProvider) {
            mClient.setHttpProvider(httpProvider);
            return this;
        }

        /**
         * Sets the authentication provider
         * @param authenticationProvider The authentication provider
         * @return the instance of this builder
         */
        public Builder authenticationProvider(final IAuthenticationProvider authenticationProvider) {
            mClient.setAuthenticationProvider(authenticationProvider);
            return this;
        }

        /**
         * Sets the executors
         * @param executors The executors
         * @return the instance of this builder
         */
        public Builder executors(final IExecutors executors) {
            mClient.setExecutors(executors);
            return this;
        }

        /**
         * Sets the logger
         * @param logger The logger
         * @return the instance of this builder
         */
        public Builder logger(final ILogger logger) {
            mClient.setLogger(logger);
            return this;
        }

        /**
         * Set this builder based on the client configuration
         * @param clientConfig The client configuration
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
         * @throws ClientException if there was an exception creating the client
         */
        public IGraphServiceClient buildClient() throws ClientException  {
            mClient.validate();
            return mClient;
        }
    }
}
