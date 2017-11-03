// ------------------------------------------------------------------------------
// Copyright (c) 2015 Microsoft Corporation
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.http;

import java.net.URI;
import javax.ws.rs.core.UriBuilder;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.GraphErrorCodes;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.options.Option;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * An http request.
 */
public abstract class BaseRequest implements IHttpRequest {

    /**
     * The request stats header name.
     */
    private static final String REQUEST_STATS_HEADER_NAME = "SdkVersion";

    /**
     * The request stats header value format string.
     */
    public static final String REQUEST_STATS_HEADER_VALUE_FORMAT_STRING = "graph-java-v%s";

    /**
     * The http method for this request.
     */
    private HttpMethod method;

    /**
     * The url for this request.
     */
    private final String requestUrl;

    /**
     * The backing client for this request.
     */
    private final IBaseClient client;

    /**
     * The header options for this request.
     */
    private final List<HeaderOption> headersOptions;

    /**
     * The query options for this request.
     */
    protected final List<QueryOption> queryOptions;

    /**
     * The function options for this request.
     */
    protected final List<FunctionOption> functionOptions;

    /**
     * The class for the response.
     */
    private final Class responseClass;

    /**
     * Value to pass to setUseCaches in connection.
     */
    private boolean useCaches;

    /**
     * Create the request.
     *
     * @param requestUrl    The url to make the request against.
     * @param client        The client which can issue the request.
     * @param options       The options for this request.
     * @param responseClass The class for the response.
     */
    public BaseRequest(final String requestUrl,
                       final IBaseClient client,
                       final List<Option> options,
                       final Class responseClass) {
        this.requestUrl = requestUrl;
        this.client = client;
        this.responseClass = responseClass;

        headersOptions = new ArrayList<>();
        queryOptions = new ArrayList<>();
        functionOptions = new ArrayList<>();

        if (options != null) {
            for (final Option option : options) {
                if (option instanceof HeaderOption) {
                    headersOptions.add((HeaderOption) option);
                }
                if (option instanceof QueryOption) {
                    queryOptions.add((QueryOption) option);
                }

                if (option instanceof FunctionOption) {
                    functionOptions.add((FunctionOption) option);
                }
            }
        }
        final HeaderOption requestStatsHeader = new HeaderOption(REQUEST_STATS_HEADER_NAME,
                String.format(REQUEST_STATS_HEADER_VALUE_FORMAT_STRING, "1.0.0"));
        headersOptions.add(requestStatsHeader);
    }

    /**
     * Gets the request url.
     *
     * @return The request url.
     */
    @Override
    public URL getRequestUrl() {
        String requestUrl = addFunctionParameters();
        URI baseUrl = URI.create(requestUrl);
        final UriBuilder uriBuilder = UriBuilder.fromUri(baseUrl);

        for (final QueryOption option : queryOptions) {
        	uriBuilder.queryParam(option.getName(), option.getValue().toString());
        }

        try {
            return new URL(uriBuilder.build().toString());
        } catch (final MalformedURLException e) {
            throw new ClientException("Invalid URL: " + uriBuilder.toString(), e, GraphErrorCodes.INVALID_REQUEST);
        }
    }

    private String addFunctionParameters() {
        final StringBuilder requestUrl = new StringBuilder(this.requestUrl);

        if (getFunctionOptions().size() > 0) {
            requestUrl.append("(");

            for (int i = 0; i < functionOptions.size(); i++) {
                final FunctionOption option = functionOptions.get(i);
                requestUrl.append(option.getName());
                requestUrl.append("=");
                if (option.getValue() != null) {
                    if (option.getValue() instanceof String) {
                        requestUrl.append("'" + option.getValue() + "'");
                    } else {
                        requestUrl.append(option.getValue());
                    }
                } else {
                    requestUrl.append("null");
                }

                if (i + 1 < functionOptions.size()) {
                    requestUrl.append(",");
                }
            }

            requestUrl.append(")");
        }
        return requestUrl.toString();
    }

    /**
     * Gets the http method.
     *
     * @return The http method.
     */
    @Override
    public HttpMethod getHttpMethod() {
        return method;
    }

    /**
     * Gets the headers.
     *
     * @return The headers.
     */
    @Override
    public List<HeaderOption> getHeaders() {
        return headersOptions;
    }

    /**
     * Adds a header to this request.
     *
     * @param header The name of the header.
     * @param value  The value of the header.
     */
    @Override
    public void addHeader(final String header, final String value) {
        headersOptions.add(new HeaderOption(header, value));
    }

    /**
     * Sets useCaches parameter to cache the response.
     *
     * @param useCaches The value of useCaches.
     */
    @Override
    public void setUseCaches(boolean useCaches) {
        this.useCaches = useCaches;
    }

    /**
     * Gets useCaches parameter.
     *
     * @return The value of useCaches.
     */
    @Override
    public boolean getUseCaches() {
        return useCaches;
    }

    /**
     * Sends this request.
     *
     * @param method           The http method.
     * @param callback         The callback when this request complements.
     * @param serializedObject The object to serialize as the body.
     * @param <T1>             The type of the callback result.
     * @param <T2>             The type of the serialized body.
     */
    @SuppressWarnings("unchecked")
    protected <T1, T2> void send(final HttpMethod method,
                                 final ICallback<T1> callback,
                                 final T2 serializedObject) {
        this.method = method;
        client.getHttpProvider().send(this, callback, responseClass, serializedObject);
    }

    /**
     * Sends this request.
     *
     * @param method           The http method.
     * @param serializedObject The object to serialize as the body.
     * @param <T1>             The type of the callback result.
     * @param <T2>             The type of the serialized body.
     * @return The response object.
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    @SuppressWarnings("unchecked")
    protected <T1, T2> T1 send(final HttpMethod method,
                               final T2 serializedObject) throws ClientException {
        this.method = method;
        return (T1) client.getHttpProvider().send(this, responseClass, serializedObject);
    }

    /**
     * Gets the query options for this request.
     *
     * @return The query options for this request.
     */
    public List<QueryOption> getQueryOptions() {
        return queryOptions;
    }

    /**
     * Gets the function options for this request.
     *
     * @return The function options for this request.
     */
    public List<FunctionOption> getFunctionOptions() {
        return functionOptions;
    }

    /**
     * Gets the full list of options for this request.
     *
     * @return The full list of options for this request.
     */
    public List<Option> getOptions() {
        final LinkedList<Option> list = new LinkedList<>();
        list.addAll(headersOptions);
        list.addAll(queryOptions);
        list.addAll(functionOptions);
        return Collections.unmodifiableList(list);
    }

    /**
     * Adds a query option.
     *
     * @param option The query option to add.
     */
    public void addQueryOption(final QueryOption option) {
        getQueryOptions().add(option);
    }

    /**
     * Adds a function option.
     *
     * @param option The function option to add.
     */
    public void addFunctionOption(final FunctionOption option) {
        getFunctionOptions().add(option);
    }

    /**
     * Sets the http method.
     *
     * @param httpMethod The http method.
     */
    public void setHttpMethod(final HttpMethod httpMethod) {
        method = httpMethod;
    }

    /**
     * Gets the client.
     *
     * @return The client.
     */
    public IBaseClient getClient() {
        return client;
    }

    /**
     * Gets the response type.
     *
     * @return The response type.
     */
    public Class getResponseType() {
        return responseClass;
    }
}
