package com.microsoft.graph.me.calendar;

import com.microsoft.graph.me.calendar.allowedcalendarsharingroleswithuser.AllowedCalendarSharingRolesWithUserRequestBuilder;
import com.microsoft.graph.me.calendar.calendarpermissions.CalendarPermissionsRequestBuilder;
import com.microsoft.graph.me.calendar.calendarpermissions.item.CalendarPermissionItemRequestBuilder;
import com.microsoft.graph.me.calendar.calendarview.CalendarViewRequestBuilder;
import com.microsoft.graph.me.calendar.calendarview.item.EventItemRequestBuilder;
import com.microsoft.graph.me.calendar.events.EventsRequestBuilder;
import com.microsoft.graph.me.calendar.getschedule.GetScheduleRequestBuilder;
import com.microsoft.graph.me.calendar.multivalueextendedproperties.item.MultiValueLegacyExtendedPropertyItemRequestBuilder;
import com.microsoft.graph.me.calendar.multivalueextendedproperties.MultiValueExtendedPropertiesRequestBuilder;
import com.microsoft.graph.me.calendar.singlevalueextendedproperties.item.SingleValueLegacyExtendedPropertyItemRequestBuilder;
import com.microsoft.graph.me.calendar.singlevalueextendedproperties.SingleValueExtendedPropertiesRequestBuilder;
import com.microsoft.graph.models.Calendar;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the calendar property of the microsoft.graph.user entity. */
public class CalendarRequestBuilder {
    /** Provides operations to manage the calendarPermissions property of the microsoft.graph.calendar entity. */
    @javax.annotation.Nonnull
    public CalendarPermissionsRequestBuilder calendarPermissions() {
        return new CalendarPermissionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the calendarView property of the microsoft.graph.calendar entity. */
    @javax.annotation.Nonnull
    public CalendarViewRequestBuilder calendarView() {
        return new CalendarViewRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the events property of the microsoft.graph.calendar entity. */
    @javax.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getSchedule method. */
    @javax.annotation.Nonnull
    public GetScheduleRequestBuilder getSchedule() {
        return new GetScheduleRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the multiValueExtendedProperties property of the microsoft.graph.calendar entity. */
    @javax.annotation.Nonnull
    public MultiValueExtendedPropertiesRequestBuilder multiValueExtendedProperties() {
        return new MultiValueExtendedPropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to manage the singleValueExtendedProperties property of the microsoft.graph.calendar entity. */
    @javax.annotation.Nonnull
    public SingleValueExtendedPropertiesRequestBuilder singleValueExtendedProperties() {
        return new SingleValueExtendedPropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Provides operations to call the allowedCalendarSharingRoles method.
     * @param User Usage: User='{User}'
     * @return a allowedCalendarSharingRolesWithUserRequestBuilder
     */
    @javax.annotation.Nonnull
    public AllowedCalendarSharingRolesWithUserRequestBuilder allowedCalendarSharingRolesWithUser(@javax.annotation.Nonnull final String user) {
        Objects.requireNonNull(user);
        return new AllowedCalendarSharingRolesWithUserRequestBuilder(pathParameters, requestAdapter, user);
    }
    /**
     * Provides operations to manage the calendarPermissions property of the microsoft.graph.calendar entity.
     * @param id Unique identifier of the item
     * @return a CalendarPermissionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CalendarPermissionItemRequestBuilder calendarPermissions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("calendarPermission%2Did", id);
        return new CalendarPermissionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the calendarView property of the microsoft.graph.calendar entity.
     * @param id Unique identifier of the item
     * @return a EventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.me.calendar.calendarview.item.EventItemRequestBuilder calendarView(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("event%2Did", id);
        return new com.microsoft.graph.me.calendar.calendarview.item.EventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new CalendarRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CalendarRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/me/calendar{?%24select}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new CalendarRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CalendarRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/me/calendar{?%24select}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get the properties and relationships of a calendar object. The calendar can be one for a user, or the default calendar of a Microsoft 365 group. There are two scenarios where an app can get another user's calendar:
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get the properties and relationships of a calendar object. The calendar can be one for a user, or the default calendar of a Microsoft 365 group. There are two scenarios where an app can get another user's calendar:
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<CalendarRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final CalendarRequestBuilderGetRequestConfiguration requestConfig = new CalendarRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the properties of a calendar object. The calendar can be one for a user, or the default calendar of a Microsoft 365 group.
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Calendar body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a calendar object. The calendar can be one for a user, or the default calendar of a Microsoft 365 group.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Calendar body, @javax.annotation.Nullable final java.util.function.Consumer<CalendarRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final CalendarRequestBuilderPatchRequestConfiguration requestConfig = new CalendarRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Provides operations to manage the events property of the microsoft.graph.calendar entity.
     * @param id Unique identifier of the item
     * @return a EventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.me.calendar.events.item.EventItemRequestBuilder events(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("event%2Did", id);
        return new com.microsoft.graph.me.calendar.events.item.EventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get the properties and relationships of a calendar object. The calendar can be one for a user, or the default calendar of a Microsoft 365 group. There are two scenarios where an app can get another user's calendar:
     * @return a CompletableFuture of calendar
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Calendar> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Calendar::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Calendar>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get the properties and relationships of a calendar object. The calendar can be one for a user, or the default calendar of a Microsoft 365 group. There are two scenarios where an app can get another user's calendar:
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of calendar
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Calendar> get(@javax.annotation.Nullable final java.util.function.Consumer<CalendarRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Calendar::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Calendar>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the multiValueExtendedProperties property of the microsoft.graph.calendar entity.
     * @param id Unique identifier of the item
     * @return a MultiValueLegacyExtendedPropertyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MultiValueLegacyExtendedPropertyItemRequestBuilder multiValueExtendedProperties(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("multiValueLegacyExtendedProperty%2Did", id);
        return new MultiValueLegacyExtendedPropertyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the properties of a calendar object. The calendar can be one for a user, or the default calendar of a Microsoft 365 group.
     * @param body 
     * @return a CompletableFuture of calendar
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Calendar> patch(@javax.annotation.Nonnull final Calendar body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Calendar::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Calendar>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the properties of a calendar object. The calendar can be one for a user, or the default calendar of a Microsoft 365 group.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of calendar
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Calendar> patch(@javax.annotation.Nonnull final Calendar body, @javax.annotation.Nullable final java.util.function.Consumer<CalendarRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Calendar::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Calendar>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the singleValueExtendedProperties property of the microsoft.graph.calendar entity.
     * @param id Unique identifier of the item
     * @return a SingleValueLegacyExtendedPropertyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SingleValueLegacyExtendedPropertyItemRequestBuilder singleValueExtendedProperties(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("singleValueLegacyExtendedProperty%2Did", id);
        return new SingleValueLegacyExtendedPropertyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Get the properties and relationships of a calendar object. The calendar can be one for a user, or the default calendar of a Microsoft 365 group. There are two scenarios where an app can get another user's calendar: */
    public class CalendarRequestBuilderGetQueryParameters {
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class CalendarRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public CalendarRequestBuilderGetQueryParameters queryParameters = new CalendarRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new calendarRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public CalendarRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class CalendarRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new calendarRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public CalendarRequestBuilderPatchRequestConfiguration() {
        }
    }
}
