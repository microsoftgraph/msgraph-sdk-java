// Template Source: BaseMethodCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IListItemGetActivitiesByIntervalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ListItemGetActivitiesByIntervalCollectionPage;
import com.microsoft.graph.requests.extensions.ListItemGetActivitiesByIntervalCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Item Get Activities By Interval Collection Request.
 */
public class ListItemGetActivitiesByIntervalCollectionRequest extends BaseCollectionRequest<ListItemGetActivitiesByIntervalCollectionResponse, IListItemGetActivitiesByIntervalCollectionPage> implements IListItemGetActivitiesByIntervalCollectionRequest {


    /**
     * The request for this ListItemGetActivitiesByInterval
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ListItemGetActivitiesByIntervalCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ListItemGetActivitiesByIntervalCollectionResponse.class, IListItemGetActivitiesByIntervalCollectionPage.class);
    }


    public void get(final ICallback<? super IListItemGetActivitiesByIntervalCollectionPage> callback) {
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

    public IListItemGetActivitiesByIntervalCollectionPage get() throws ClientException {
        final ListItemGetActivitiesByIntervalCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IListItemGetActivitiesByIntervalCollectionPage buildFromResponse(final ListItemGetActivitiesByIntervalCollectionResponse response) {
        final IListItemGetActivitiesByIntervalCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ListItemGetActivitiesByIntervalCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IListItemGetActivitiesByIntervalCollectionPage page = new ListItemGetActivitiesByIntervalCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IListItemGetActivitiesByIntervalCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IListItemGetActivitiesByIntervalCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IListItemGetActivitiesByIntervalCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IListItemGetActivitiesByIntervalCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IListItemGetActivitiesByIntervalCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IListItemGetActivitiesByIntervalCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IListItemGetActivitiesByIntervalCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IListItemGetActivitiesByIntervalCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IListItemGetActivitiesByIntervalCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IListItemGetActivitiesByIntervalCollectionRequest)this;
    }

}