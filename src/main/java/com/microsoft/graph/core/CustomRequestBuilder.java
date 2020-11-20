package com.microsoft.graph.core;

import java.util.List;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.http.CustomRequest;
import com.microsoft.graph.options.Option;

/**
 * The class for the CustomRequestBuilder
 *
 * If the provided URL is malformed, the ClientException will contain a MalformedURLException
 */
public class CustomRequestBuilder<T> extends BaseRequestBuilder<T> {
	/** Type to use for response deserialization */
	public final Class<T> responseType;
	
	/**
	 * Instanciates a new custom request builder
	 * 
	 * @param requestUrl the URL to send the request to
	 * @param client the client to use for the request
	 * @param requestOptions options to apply to the request
	 * @param responseType type to use for response deserialization
	 */
	public CustomRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final List<? extends Option> requestOptions, @Nonnull final Class<T> responseType) {
		super(requestUrl, client, requestOptions);
		this.responseType = responseType;
	}
	
	/**
	 * Builds the request to be executed
	 * 
	 * @return the request to be executed
	 * @param requestOptions the options to apply to the request
	 */
	@Nonnull
	public CustomRequest<T> buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
		return buildRequest(getOptions(requestOptions));
	}
	
	/**
	 * Builds the request to be executed
	 * 
	 * @return the request to be executed
	 * @param requestOptions the options to apply to the request
	 */
	@Nonnull
	public CustomRequest<T> buildRequest(@Nullable final List<? extends Option> requestOptions) {
		return new CustomRequest<T>(getRequestUrl(), getClient(), requestOptions, responseType);
	}
}
