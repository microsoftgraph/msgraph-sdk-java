package com.microsoft.graph.http;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import okhttp3.Headers;
import okhttp3.Response;

public class HttpResponseHeadersHelper {
    /**
	 * Gets the response headers from OkHttp Response
	 *
	 * @param response the OkHttp response
	 * @return           the set of headers names and value
	 */
	public Map<String, String> getResponseHeadersAsMapStringString(final Response response) {
		final Map<String, String> headers = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		int index = 0;
		Headers responseHeaders = response.headers();
		while (index < responseHeaders.size()) {
			final String headerName = responseHeaders.name(index);
			final String headerValue = responseHeaders.value(index);
			if (headerName == null || headerValue == null) {
				break;
			}
			headers.put(headerName, headerValue);
			index++;
		}
		return headers;
    }
    
    /**
	 * Gets the response headers from OkHttp Response
	 *
	 * @param response the OkHttp response
	 * @return           the set of headers names and value
	 */
	public Map<String, List<String>> getResponseHeadersAsMapOfStringList(Response response) {
		Map<String, List<String>> headerFields = response.headers().toMultimap();
		// Add the response code
		List<String> list = new ArrayList<>();
		list.add(String.format("%d", response.code()));
		headerFields.put("responseCode", list);
		return headerFields;
	}
}
