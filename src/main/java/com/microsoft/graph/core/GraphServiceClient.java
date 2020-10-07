// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.core;

import com.microsoft.graph.core.ClientException;

import com.microsoft.graph.httpcore.HttpClients;
import com.microsoft.graph.httpcore.ICoreAuthenticationProvider;
import com.microsoft.graph.core.DefaultConnectionConfig;
import com.microsoft.graph.core.IConnectionConfig;
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
	public <T> CustomRequestBuilder<T> customRequest(final String url, final Class<T> responseType) {
		return new CustomRequestBuilder<T>(getServiceRoot() + url, this, null, responseType);
	}

	/**
	 * Send a custom request to Graph
	 * 
	 * @param url
	 *			the full URL to make a request with
	 * @return the instance of this builder
	 */
	public CustomRequestBuilder<JsonObject> customRequest(final String url) {
		return new CustomRequestBuilder<JsonObject>(getServiceRoot() + url, this, null,
				JsonObject.class);
	}

	public static Builder<OkHttpClient> builder() {
		return new Builder<OkHttpClient>();
	}

	public static final class Builder<httpClientType> {
		private ISerializer serializer;
		private IHttpProvider httpProvider;
		private IExecutors executors;
		private ILogger logger;
		private httpClientType httpClient;
		private IConnectionConfig connConfig;
		private ICoreAuthenticationProvider auth;

		private ICoreAuthenticationProvider getAuth() {
			if(auth == null) {
				throw new NullPointerException("auth"); // TODO initialize to default once moved to core
			} else {
				return auth;
			}
		}
		private IConnectionConfig getConnectionConfig() {
			if(connConfig == null) {
				return new DefaultConnectionConfig() {};
			} else {
				return connConfig;
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
				return new CoreHttpProvider(getSerializer(), getExecutors(), getLogger(), (OkHttpClient)getHttpClient(), getConnectionConfig());
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
		public Builder<httpClientType> serializer(final ISerializer serializer) {
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
		public Builder<httpClientType> httpProvider(final IHttpProvider httpProvider) {
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
		public Builder<httpClientType> executors(final IExecutors executors) {
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
		public Builder<httpClientType> logger(final ILogger logger) {
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
		public Builder<httpClientType> httpClient(final httpClientType client) {
			checkNotNull(client, "client");
			this.httpClient = client;
			return this;
		}

		/**
		 * Sets the connection configuration
		 * 
		 * @param config connection configuration
		 * 
		 * @return the instance of this builder
		 */
		public Builder<httpClientType> connectionConfig(final IConnectionConfig config) {
			checkNotNull(config, "config");
			this.connConfig = config;
			return this;
		}
		/**
		 * Sets the authentication provider
		 * 
		 * @param auth the authentication provider
		 * @return the instance of this builder
		 */
		public Builder<httpClientType> authenticationProvider(final ICoreAuthenticationProvider auth) {
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
	
	private static void checkNotNull(Object o, String name) {
		if (o==null) {
			throw new NullPointerException(name + " cannot be null");
		}
	}
}
