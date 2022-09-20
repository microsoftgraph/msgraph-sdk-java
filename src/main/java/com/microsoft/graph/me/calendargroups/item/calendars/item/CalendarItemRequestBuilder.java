package com.microsoft.graph.me.calendargroups.item.calendars.item;

import com.microsoft.graph.me.calendargroups.item.calendars.item.allowedcalendarsharingroleswithuser.AllowedCalendarSharingRolesWithUserRequestBuilder;
import com.microsoft.graph.me.calendargroups.item.calendars.item.calendarpermissions.CalendarPermissionsRequestBuilder;
import com.microsoft.graph.me.calendargroups.item.calendars.item.calendarpermissions.item.CalendarPermissionItemRequestBuilder;
import com.microsoft.graph.me.calendargroups.item.calendars.item.calendarview.CalendarViewRequestBuilder;
import com.microsoft.graph.me.calendargroups.item.calendars.item.calendarview.item.EventItemRequestBuilder;
import com.microsoft.graph.me.calendargroups.item.calendars.item.events.EventsRequestBuilder;
import com.microsoft.graph.me.calendargroups.item.calendars.item.getschedule.GetScheduleRequestBuilder;
import com.microsoft.graph.me.calendargroups.item.calendars.item.multivalueextendedproperties.item.MultiValueLegacyExtendedPropertyItemRequestBuilder;
import com.microsoft.graph.me.calendargroups.item.calendars.item.multivalueextendedproperties.MultiValueExtendedPropertiesRequestBuilder;
import com.microsoft.graph.me.calendargroups.item.calendars.item.singlevalueextendedproperties.item.SingleValueLegacyExtendedPropertyItemRequestBuilder;
import com.microsoft.graph.me.calendargroups.item.calendars.item.singlevalueextendedproperties.SingleValueExtendedPropertiesRequestBuilder;
import com.microsoft.graph.models.Calendar;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the calendars property of the microsoft.graph.calendarGroup entity. */
public class CalendarItemRequestBuilder {
    /** The calendarPermissions property */
    @javax.annotation.Nonnull
    public CalendarPermissionsRequestBuilder calendarPermissions() {
        return new CalendarPermissionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The calendarView property */
    @javax.annotation.Nonnull
    public CalendarViewRequestBuilder calendarView() {
        return new CalendarViewRequestBuilder(pathParameters, requestAdapter);
    }
    /** The events property */
    @javax.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getSchedule property */
    @javax.annotation.Nonnull
    public GetScheduleRequestBuilder getSchedule() {
        return new GetScheduleRequestBuilder(pathParameters, requestAdapter);
    }
    /** The multiValueExtendedProperties property */
    @javax.annotation.Nonnull
    public MultiValueExtendedPropertiesRequestBuilder multiValueExtendedProperties() {
        return new MultiValueExtendedPropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The singleValueExtendedProperties property */
    @javax.annotation.Nonnull
    public SingleValueExtendedPropertiesRequestBuilder singleValueExtendedProperties() {
        return new SingleValueExtendedPropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
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
     * Gets an item from the com.Microsoft.Graph.me.calendarGroups.item.calendars.item.calendarPermissions.item collection
     * @param id Unique identifier of the item
     * @return a CalendarPermissionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CalendarPermissionItemRequestBuilder calendarPermissions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("calendarPermission%2Did", id);
        return new CalendarPermissionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.calendarGroups.item.calendars.item.calendarView.item collection
     * @param id Unique identifier of the item
     * @return a EventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.me.calendargroups.item.calendars.item.calendarview.item.EventItemRequestBuilder calendarView(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("event%2Did", id);
        return new com.microsoft.graph.me.calendargroups.item.calendars.item.calendarview.item.EventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new CalendarItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public CalendarItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/me/calendarGroups/{calendarGroup%2Did}/calendars/{calendar%2Did}{?%24select}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new CalendarItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public CalendarItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/me/calendarGroups/{calendarGroup%2Did}/calendars/{calendar%2Did}{?%24select}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property calendars for me
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property calendars for me
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<CalendarItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final CalendarItemRequestBuilderDeleteRequestConfiguration requestConfig = new CalendarItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * The calendars in the calendar group. Navigation property. Read-only. Nullable.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * The calendars in the calendar group. Navigation property. Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<CalendarItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final CalendarItemRequestBuilderGetRequestConfiguration requestConfig = new CalendarItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property calendars in me
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Calendar body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property calendars in me
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Calendar body, @javax.annotation.Nullable final java.util.function.Consumer<CalendarItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final CalendarItemRequestBuilderPatchRequestConfiguration requestConfig = new CalendarItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property calendars for me
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property calendars for me
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<CalendarItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property calendars for me
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<CalendarItemRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.calendarGroups.item.calendars.item.events.item collection
     * @param id Unique identifier of the item
     * @return a EventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.me.calendargroups.item.calendars.item.events.item.EventItemRequestBuilder events(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("event%2Did", id);
        return new com.microsoft.graph.me.calendargroups.item.calendars.item.events.item.EventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * The calendars in the calendar group. Navigation property. Read-only. Nullable.
     * @return a CompletableFuture of calendar
     */
    public java.util.concurrent.CompletableFuture<Calendar> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Calendar::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * The calendars in the calendar group. Navigation property. Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of calendar
     */
    public java.util.concurrent.CompletableFuture<Calendar> get(@javax.annotation.Nullable final java.util.function.Consumer<CalendarItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Calendar::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * The calendars in the calendar group. Navigation property. Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of calendar
     */
    public java.util.concurrent.CompletableFuture<Calendar> get(@javax.annotation.Nullable final java.util.function.Consumer<CalendarItemRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Calendar::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.calendarGroups.item.calendars.item.multiValueExtendedProperties.item collection
     * @param id Unique identifier of the item
     * @return a MultiValueLegacyExtendedPropertyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MultiValueLegacyExtendedPropertyItemRequestBuilder multiValueExtendedProperties(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("multiValueLegacyExtendedProperty%2Did", id);
        return new MultiValueLegacyExtendedPropertyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property calendars in me
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Calendar body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property calendars in me
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Calendar body, @javax.annotation.Nullable final java.util.function.Consumer<CalendarItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property calendars in me
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Calendar body, @javax.annotation.Nullable final java.util.function.Consumer<CalendarItemRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.calendarGroups.item.calendars.item.singleValueExtendedProperties.item collection
     * @param id Unique identifier of the item
     * @return a SingleValueLegacyExtendedPropertyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SingleValueLegacyExtendedPropertyItemRequestBuilder singleValueExtendedProperties(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("singleValueLegacyExtendedProperty%2Did", id);
        return new SingleValueLegacyExtendedPropertyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class CalendarItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new CalendarItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public CalendarItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** The calendars in the calendar group. Navigation property. Read-only. Nullable. */
    public class CalendarItemRequestBuilderGetQueryParameters {
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class CalendarItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public CalendarItemRequestBuilderGetQueryParameters queryParameters = new CalendarItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new CalendarItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public CalendarItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class CalendarItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new CalendarItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public CalendarItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
