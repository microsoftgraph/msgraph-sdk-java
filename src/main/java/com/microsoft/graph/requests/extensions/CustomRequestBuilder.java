package com.microsoft.graph.requests.extensions;

import java.util.List;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.http.CustomRequest;
import com.microsoft.graph.requests.extensions.GraphServiceClient;
import com.microsoft.graph.options.Option;

/**
 * The class for the CustomRequestBuilder
 *
 * @throws ClientException If the provided URL is malformed, the client exception will contain a MalformedURLException
 */
public class CustomRequestBuilder extends BaseRequestBuilder {
	public final Class<?> responseType; 
	
	public CustomRequestBuilder(final String requestUrl, final IBaseClient client, final List<? extends Option> requestOptions, final Class<?> responseType) {
		super(requestUrl, client, requestOptions);
		this.responseType = responseType;
	}
	
	public CustomRequest buildRequest() {
		return buildRequest(getOptions());
	}
	
	public CustomRequest buildRequest(final List<? extends Option> requestOptions) {
		return new CustomRequest(getRequestUrl(), getClient(), requestOptions, responseType);
	}
}
