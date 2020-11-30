// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.core;

import com.microsoft.graph.core.ClientException;

import com.microsoft.graph.httpcore.HttpClients;
import com.microsoft.graph.httpcore.ICoreAuthenticationProvider;
import com.microsoft.graph.concurrency.DefaultExecutors;
import com.microsoft.graph.logger.*;
import com.google.gson.JsonObject;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.IGraphServiceClient;
import com.microsoft.graph.http.CoreHttpProvider;
import com.microsoft.graph.http.IHttpProvider;
import com.microsoft.graph.serializer.DefaultSerializer;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.core.CustomRequestBuilder;
import com.microsoft.graph.requests.extensions.BaseGraphServiceClient;

import okhttp3.OkHttpClient;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;


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
	 * Send a custom request to Graph
	 * 
	 * @param url
	 *			the full URL to make a request with
	 * @param responseType
	 *			the response class to deserialize the response into
	 * @return the instance of this builder
	 */
	@Nonnull
	public <T> CustomRequestBuilder<T> customRequest(@Nonnull final String url, @Nonnull final Class<T> responseType) {
		return new CustomRequestBuilder<T>(getServiceRoot() + url, this, null, responseType);
	}

	/**
	 * Send a custom request to Graph
	 * 
	 * @param url
	 *			the full URL to make a request with
	 * @return the instance of this builder
	 */
	@Nonnull
	public CustomRequestBuilder<JsonObject> customRequest(@Nonnull final String url) {
		return new CustomRequestBuilder<JsonObject>(getServiceRoot() + url, this, null,
				JsonObject.class);
	}

	/**
	 * Gets the builder to start configuring the client
	 * 
	 * @return builder to start configuring the client
	 */
	@Nonnull
	public static Builder<OkHttpClient> builder() {
		return new Builder<OkHttpClient>();
	}

	/**
	 * Builder to help configure the Graph service client
	 */
	public static final class Builder<httpClientType> {
		private ISerializer serializer;
		private IHttpProvider httpProvider;
		private IExecutors executors;
		private ILogger logger;
		private httpClientType httpClient;
		private ICoreAuthenticationProvider auth;

		private ICoreAuthenticationProvider getAuth() {
			if(auth == null) {
				throw new NullPointerException("auth"); // TODO initialize to default once moved to core
			} else {
				return auth;
			}
		}
		private ILogger getLogger() {
			if(logger == null) {
				return new DefaultLogger();
			} else {
				return logger;
			}
		}
		private IExecutors getExecutors() {
			if(executors == null) {
				return new DefaultExecutors(getLogger());
			} else {
				return executors;
			}
		}
		private ISerializer getSerializer() {
			if(serializer == null) {
				return new DefaultSerializer(getLogger());
			} else {
				return serializer;
			}
		}
		@SuppressWarnings("unchecked")
		private httpClientType getHttpClient() {
			if(httpClient == null) {
				return (httpClientType)HttpClients.createDefault(getAuth());
			} else {
				return httpClient;
			}
		}
		private IHttpProvider getHttpProvider() {
			if(httpProvider == null) {
				return new CoreHttpProvider(getSerializer(), getExecutors(), getLogger(), (OkHttpClient)getHttpClient());
			} else {
				return httpProvider;
			}
		}
		
		/**
		 * Sets the serializer.
		 * 
		 * @param serializer
		 *			the serializer
		 * @return the instance of this builder
		 */
		@Nonnull
		public Builder<httpClientType> serializer(@Nonnull final ISerializer serializer) {
			checkNotNull(serializer, "serializer");
			this.serializer = serializer;
			return this;
		}

		/**
		 * Sets the httpProvider
		 * 
		 * @param httpProvider
		 *			the httpProvider
		 * @return the instance of this builder
		 */
		@Nonnull
		public Builder<httpClientType> httpProvider(@Nonnull final IHttpProvider httpProvider) {
			checkNotNull(httpProvider, "httpProvider");
			this.httpProvider = httpProvider;
			return this;
		}

		/**
		 * Sets the executors
		 * 
		 * @param executors
		 *			the executors
		 * @return the instance of this builder
		 */
		@Nonnull
		public Builder<httpClientType> executors(@Nonnull final IExecutors executors) {
			checkNotNull(executors, "executors");
			this.executors = executors;
			return this;
		}

		/**
		 * Sets the logger
		 * 
		 * @param logger
		 *			the logger
		 * @return the instance of this builder
		 */
		@Nonnull
		public Builder<httpClientType> logger(@Nonnull final ILogger logger) {
			checkNotNull(logger, "logger");
			this.logger = logger;
			return this;
		}

		/**
		 * Sets the http client
		 * 
		 * @param client the http client
		 * 
		 * @return the instance of this builder
		 */
		@Nonnull
		public Builder<httpClientType> httpClient(@Nonnull final httpClientType client) {
			checkNotNull(client, "client");
			this.httpClient = client;
			return this;
		}

		/**
		 * Sets the authentication provider
		 * 
		 * @param auth the authentication provider
		 * @return the instance of this builder
		 */
		@Nonnull
		public Builder<httpClientType> authenticationProvider(@Nonnull final ICoreAuthenticationProvider auth) {
			checkNotNull(auth, "auth");
			this.auth = auth;
			return this;
		}

		/**
		 * Builds and returns the Graph service client.
		 * 
		 * @return the Graph service client object
		 * @throws ClientException
		 *			 if there was an exception creating the client
		 */
		@Nonnull
		public IGraphServiceClient buildClient() throws ClientException {
			GraphServiceClient client = new GraphServiceClient();
			client.setExecutors(this.getExecutors());
			client.setHttpProvider(this.getHttpProvider());
			client.setLogger(this.getLogger());
			client.setSerializer(this.getSerializer());
			client.validate();
			return client;
		}
	}
	
	/**
	 * Checks whether the provided object is null or not and throws an exception if it is
	 * 
	 * @param o object to check
	 * @param name name to use in the exception message
	 */
	protected static void checkNotNull(@Nullable final Object o, @Nonnull final String name) {
		if (o==null) {
			throw new NullPointerException(name + " cannot be null");
		}
	}
}
