// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ListItem;
import com.microsoft.graph.models.extensions.ListItemVersion;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IListItemVersionCollectionPage;
import com.microsoft.graph.requests.extensions.ListItemVersionCollectionResponse;
import com.microsoft.graph.requests.extensions.IListItemVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IListItemVersionCollectionRequest;
import com.microsoft.graph.requests.extensions.ListItemVersionCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Item Version Collection Request.
 */
public class ListItemVersionCollectionRequest extends BaseCollectionRequest<ListItemVersionCollectionResponse, IListItemVersionCollectionPage> implements IListItemVersionCollectionRequest {

    /**
     * The request builder for this collection of ListItemVersion
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ListItemVersionCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ListItemVersionCollectionResponse.class, IListItemVersionCollectionPage.class);
    }

    public void get(final ICallback<? super IListItemVersionCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IListItemVersionCollectionPage get() throws ClientException {
        final ListItemVersionCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ListItemVersion newListItemVersion, final ICallback<? super ListItemVersion> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ListItemVersionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newListItemVersion, callback);
    }

    public ListItemVersion post(final ListItemVersion newListItemVersion) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ListItemVersionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newListItemVersion);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IListItemVersionCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ListItemVersionCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IListItemVersionCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ListItemVersionCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IListItemVersionCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ListItemVersionCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IListItemVersionCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ListItemVersionCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IListItemVersionCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ListItemVersionCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IListItemVersionCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ListItemVersionCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IListItemVersionCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IListItemVersionCollectionRequest)this;
    }
    public IListItemVersionCollectionPage buildFromResponse(final ListItemVersionCollectionResponse response) {
        final IListItemVersionCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ListItemVersionCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ListItemVersionCollectionPage page = new ListItemVersionCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}