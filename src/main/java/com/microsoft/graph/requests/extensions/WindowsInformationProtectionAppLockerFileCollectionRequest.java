// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsInformationProtection;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionAppLockerFile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLockerFileCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLockerFileCollectionResponse;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLockerFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLockerFileCollectionRequest;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLockerFileCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection App Locker File Collection Request.
 */
public class WindowsInformationProtectionAppLockerFileCollectionRequest extends BaseCollectionRequest<WindowsInformationProtectionAppLockerFileCollectionResponse, IWindowsInformationProtectionAppLockerFileCollectionPage> implements IWindowsInformationProtectionAppLockerFileCollectionRequest {

    /**
     * The request builder for this collection of WindowsInformationProtectionAppLockerFile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsInformationProtectionAppLockerFileCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsInformationProtectionAppLockerFileCollectionResponse.class, IWindowsInformationProtectionAppLockerFileCollectionPage.class);
    }

    public void get(final ICallback<? super IWindowsInformationProtectionAppLockerFileCollectionPage> callback) {
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

    public IWindowsInformationProtectionAppLockerFileCollectionPage get() throws ClientException {
        final WindowsInformationProtectionAppLockerFileCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WindowsInformationProtectionAppLockerFile newWindowsInformationProtectionAppLockerFile, final ICallback<? super WindowsInformationProtectionAppLockerFile> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WindowsInformationProtectionAppLockerFileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWindowsInformationProtectionAppLockerFile, callback);
    }

    public WindowsInformationProtectionAppLockerFile post(final WindowsInformationProtectionAppLockerFile newWindowsInformationProtectionAppLockerFile) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WindowsInformationProtectionAppLockerFileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWindowsInformationProtectionAppLockerFile);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWindowsInformationProtectionAppLockerFileCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WindowsInformationProtectionAppLockerFileCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IWindowsInformationProtectionAppLockerFileCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (WindowsInformationProtectionAppLockerFileCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IWindowsInformationProtectionAppLockerFileCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (WindowsInformationProtectionAppLockerFileCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWindowsInformationProtectionAppLockerFileCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WindowsInformationProtectionAppLockerFileCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWindowsInformationProtectionAppLockerFileCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (WindowsInformationProtectionAppLockerFileCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IWindowsInformationProtectionAppLockerFileCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (WindowsInformationProtectionAppLockerFileCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IWindowsInformationProtectionAppLockerFileCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IWindowsInformationProtectionAppLockerFileCollectionRequest)this;
    }
    public IWindowsInformationProtectionAppLockerFileCollectionPage buildFromResponse(final WindowsInformationProtectionAppLockerFileCollectionResponse response) {
        final IWindowsInformationProtectionAppLockerFileCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WindowsInformationProtectionAppLockerFileCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WindowsInformationProtectionAppLockerFileCollectionPage page = new WindowsInformationProtectionAppLockerFileCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}