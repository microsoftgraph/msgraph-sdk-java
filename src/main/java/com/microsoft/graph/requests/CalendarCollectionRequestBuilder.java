// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.CalendarGroup;
import com.microsoft.graph.models.Calendar;
import com.microsoft.graph.models.DateTimeTimeZone;
import com.microsoft.graph.models.ScheduleInformation;
import com.microsoft.graph.models.CalendarRoleType;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.CalendarCollectionRequestBuilder;
import com.microsoft.graph.requests.CalendarRequestBuilder;
import com.microsoft.graph.requests.CalendarCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.CalendarGetScheduleParameterSet;
import com.microsoft.graph.models.CalendarAllowedCalendarSharingRolesParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Collection Request Builder.
 */
public class CalendarCollectionRequestBuilder extends BaseCollectionRequestBuilder<Calendar, CalendarRequestBuilder, CalendarCollectionResponse, CalendarCollectionPage, CalendarCollectionRequest> {

    /**
     * The request builder for this collection of CalendarGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CalendarCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CalendarRequestBuilder.class, CalendarCollectionRequest.class);
    }



    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}