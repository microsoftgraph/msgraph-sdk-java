package com.microsoft.graph.requests.extensions;

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
public class CustomRequestBuilder<T> extends BaseRequestBuilder {
	public final Class<T> responseType; 
	
	public CustomRequestBuilder(final String requestUrl, final IBaseClient client, final List<? extends Option> requestOptions, final Class<T> responseType) {
		super(requestUrl, client, requestOptions);
		this.responseType = responseType;
	}
	
	public CustomRequest<T> buildRequest() {
		return buildRequest(getOptions());
	}
	
	public CustomRequest<T> buildRequest(final List<? extends Option> requestOptions) {
		return new CustomRequest<T>(getRequestUrl(), getClient(), requestOptions, responseType);
	}
}
