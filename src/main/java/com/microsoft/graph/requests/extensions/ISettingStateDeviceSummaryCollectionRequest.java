// Template Source: IBaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.models.extensions.SettingStateDeviceSummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Setting State Device Summary Collection Request.
 */
public interface ISettingStateDeviceSummaryCollectionRequest extends IHttpRequest {

    void get(final ICallback<? super ISettingStateDeviceSummaryCollectionPage> callback);

    ISettingStateDeviceSummaryCollectionPage get() throws ClientException;

    void post(final SettingStateDeviceSummary newSettingStateDeviceSummary, final ICallback<? super SettingStateDeviceSummary> callback);

    SettingStateDeviceSummary post(final SettingStateDeviceSummary newSettingStateDeviceSummary) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISettingStateDeviceSummaryCollectionRequest expand(final String value);

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    ISettingStateDeviceSummaryCollectionRequest filter(final String value);

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    ISettingStateDeviceSummaryCollectionRequest orderBy(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISettingStateDeviceSummaryCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    ISettingStateDeviceSummaryCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    ISettingStateDeviceSummaryCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	ISettingStateDeviceSummaryCollectionRequest skipToken(final String skipToken);
}