// Template Source: BaseMethodCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.LocaleInfo;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IOutlookUserSupportedLanguagesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookUserSupportedLanguagesCollectionPage;
import com.microsoft.graph.requests.extensions.OutlookUserSupportedLanguagesCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook User Supported Languages Collection Request.
 */
public class OutlookUserSupportedLanguagesCollectionRequest extends BaseCollectionRequest<OutlookUserSupportedLanguagesCollectionResponse, IOutlookUserSupportedLanguagesCollectionPage> implements IOutlookUserSupportedLanguagesCollectionRequest {


    /**
     * The request for this OutlookUserSupportedLanguages
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OutlookUserSupportedLanguagesCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OutlookUserSupportedLanguagesCollectionResponse.class, IOutlookUserSupportedLanguagesCollectionPage.class);
    }


    public void get(final ICallback<? super IOutlookUserSupportedLanguagesCollectionPage> callback) {
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

    public IOutlookUserSupportedLanguagesCollectionPage get() throws ClientException {
        final OutlookUserSupportedLanguagesCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IOutlookUserSupportedLanguagesCollectionPage buildFromResponse(final OutlookUserSupportedLanguagesCollectionResponse response) {
        final IOutlookUserSupportedLanguagesCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new OutlookUserSupportedLanguagesCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IOutlookUserSupportedLanguagesCollectionPage page = new OutlookUserSupportedLanguagesCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IOutlookUserSupportedLanguagesCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IOutlookUserSupportedLanguagesCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IOutlookUserSupportedLanguagesCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IOutlookUserSupportedLanguagesCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IOutlookUserSupportedLanguagesCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IOutlookUserSupportedLanguagesCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IOutlookUserSupportedLanguagesCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IOutlookUserSupportedLanguagesCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IOutlookUserSupportedLanguagesCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IOutlookUserSupportedLanguagesCollectionRequest)this;
    }

}