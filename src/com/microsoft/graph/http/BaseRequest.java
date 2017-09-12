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

import android.net.Uri;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.GraphErrorCodes;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.BuildConfig;
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
    public static final String REQUEST_STATS_HEADER_VALUE_FORMAT_STRING = "graph-android-v%s";

    /**
     * The http method for this request.
     */
    private HttpMethod mMethod;

    /**
     * The url for this request.
     */
    private final String mRequestUrl;

    /**
     * The backing client for this request.
     */
    private final IBaseClient mClient;

    /**
     * The header options for this request.
     */
    private final List<HeaderOption> mHeadersOptions;

    /**
     * The query options for this request.
     */
    protected final List<QueryOption> mQueryOptions;

    /**
     * The function options for this request.
     */
    protected final List<FunctionOption> mFunctionOptions;

    /**
     * The class for the response.
     */
    private final Class mResponseClass;

    /**
     * Value to pass to setUseCaches in connection.
     */
    private boolean mUseCaches;

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
        mRequestUrl = requestUrl;
        mClient = client;
        mResponseClass = responseClass;

        mHeadersOptions = new ArrayList<>();
        mQueryOptions = new ArrayList<>();
        mFunctionOptions = new ArrayList<>();

        if (options != null) {
            for (final Option option : options) {
                if (option instanceof HeaderOption) {
                    mHeadersOptions.add((HeaderOption) option);
                }
                if (option instanceof QueryOption) {
                    mQueryOptions.add((QueryOption) option);
                }

                if (option instanceof FunctionOption) {
                    mFunctionOptions.add((FunctionOption) option);
                }
            }
        }
        final HeaderOption requestStatsHeader = new HeaderOption(REQUEST_STATS_HEADER_NAME,
                String.format(REQUEST_STATS_HEADER_VALUE_FORMAT_STRING, BuildConfig.VERSION_NAME));
        mHeadersOptions.add(requestStatsHeader);
    }

    /**
     * Gets the request url.
     *
     * @return The request url.
     */
    @Override
    public URL getRequestUrl() {
        String requestUrl = addFunctionParameters();
        Uri baseUrl = Uri.parse(requestUrl);
        final Uri.Builder uriBuilder = baseUrl.buildUpon();

        for (final QueryOption option : mQueryOptions) {
            uriBuilder.appendQueryParameter(option.getName(), option.getValue().toString());
        }

        try {
            return new URL(uriBuilder.toString());
        } catch (final MalformedURLException e) {
            throw new ClientException("Invalid URL: " + uriBuilder.toString(), e, GraphErrorCodes.InvalidRequest);
        }
    }

    private String addFunctionParameters() {
        final StringBuilder requestUrl = new StringBuilder(mRequestUrl);

        if (getFunctionOptions().size() > 0) {
            requestUrl.append("(");

            for (int i = 0; i < mFunctionOptions.size(); i++) {
                final FunctionOption option = mFunctionOptions.get(i);
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

                if (i + 1 < mFunctionOptions.size()) {
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
        return mMethod;
    }

    /**
     * Gets the headers.
     *
     * @return The headers.
     */
    @Override
    public List<HeaderOption> getHeaders() {
        return mHeadersOptions;
    }

    /**
     * Adds a header to this request.
     *
     * @param header The name of the header.
     * @param value  The value of the header.
     */
    @Override
    public void addHeader(final String header, final String value) {
        mHeadersOptions.add(new HeaderOption(header, value));
    }

    /**
     * Sets useCaches parameter to cache the response.
     *
     * @param useCaches The value of useCaches.
     */
    @Override
    public void setUseCaches(boolean useCaches) {
        mUseCaches = useCaches;
    }

    /**
     * Gets useCaches parameter.
     *
     * @return The value of useCaches.
     */
    @Override
    public boolean getUseCaches() {
        return mUseCaches;
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
        mMethod = method;
        mClient.getHttpProvider().send(this, callback, mResponseClass, serializedObject);
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
        mMethod = method;
        return (T1) mClient.getHttpProvider().send(this, mResponseClass, serializedObject);
    }

    /**
     * Gets the query options for this request.
     *
     * @return The query options for this request.
     */
    public List<QueryOption> getQueryOptions() {
        return mQueryOptions;
    }

    /**
     * Gets the function options for this request.
     *
     * @return The function options for this request.
     */
    public List<FunctionOption> getFunctionOptions() {
        return mFunctionOptions;
    }

    /**
     * Gets the full list of options for this request.
     *
     * @return The full list of options for this request.
     */
    public List<Option> getOptions() {
        final LinkedList<Option> list = new LinkedList<>();
        list.addAll(mHeadersOptions);
        list.addAll(mQueryOptions);
        list.addAll(mFunctionOptions);
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
        mMethod = httpMethod;
    }

    /**
     * Gets the client.
     *
     * @return The client.
     */
    public IBaseClient getClient() {
        return mClient;
    }

    /**
     * Gets the response type.
     *
     * @return The response type.
     */
    public Class getResponseType() {
        return mResponseClass;
    }
}
