package com.microsoft.graph.core;

import java.util.List;

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
	public final Class<T> responseType; 
	
	public CustomRequestBuilder(final String requestUrl, final IBaseClient client, final List<? extends Option> requestOptions, final Class<T> responseType) {
		super(requestUrl, client, requestOptions);
		this.responseType = responseType;
	}
	
	public CustomRequest<T> buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
		return buildRequest(getOptions(requestOptions));
	}
	
	public CustomRequest<T> buildRequest(final List<? extends Option> requestOptions) {
		return new CustomRequest<T>(getRequestUrl(), getClient(), requestOptions, responseType);
	}
}
