package com.microsoft.graph.http;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.Nonnull;

import okhttp3.Headers;
import okhttp3.Response;

/** Internal utility class to help parsing the response headers */
public class HttpResponseHeadersHelper {
    /**
	 * Gets the response headers from OkHttp Response
	 *
	 * @param response the OkHttp response
	 * @return           the set of headers names and value
	 */
	@Nonnull
	public Map<String, String> getResponseHeadersAsMapStringString(@Nonnull final Response response) {
		final Map<String, String> headers = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		int index = 0;
		final Headers responseHeaders = response.headers();
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
	@Nonnull
	public Map<String, List<String>> getResponseHeadersAsMapOfStringList(@Nonnull final Response response) {
		final Map<String, List<String>> headerFields = response.headers().toMultimap();
		// Add the response code
		final List<String> list = new ArrayList<>();
		headerFields.put("responseCode", list);
		return headerFields;
	}
}
