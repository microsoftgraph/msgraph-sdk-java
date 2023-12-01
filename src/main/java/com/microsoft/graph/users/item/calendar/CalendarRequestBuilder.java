package com.microsoft.graph.users.item.calendar;

import com.microsoft.graph.models.Calendar;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.users.item.calendar.allowedcalendarsharingroleswithuser.AllowedCalendarSharingRolesWithUserRequestBuilder;
import com.microsoft.graph.users.item.calendar.calendarpermissions.CalendarPermissionsRequestBuilder;
import com.microsoft.graph.users.item.calendar.calendarview.CalendarViewRequestBuilder;
import com.microsoft.graph.users.item.calendar.events.EventsRequestBuilder;
import com.microsoft.graph.users.item.calendar.getschedule.GetScheduleRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the calendar property of the microsoft.graph.user entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CalendarRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the calendarPermissions property of the microsoft.graph.calendar entity.
     */
    @jakarta.annotation.Nonnull
    public CalendarPermissionsRequestBuilder calendarPermissions() {
        return new CalendarPermissionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendarView property of the microsoft.graph.calendar entity.
     */
    @jakarta.annotation.Nonnull
    public CalendarViewRequestBuilder calendarView() {
        return new CalendarViewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the events property of the microsoft.graph.calendar entity.
     */
    @jakarta.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getSchedule method.
     */
    @jakarta.annotation.Nonnull
    public GetScheduleRequestBuilder getSchedule() {
        return new GetScheduleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the allowedCalendarSharingRoles method.
     * @param User Usage: User='{User}'
     * @return a AllowedCalendarSharingRolesWithUserRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AllowedCalendarSharingRolesWithUserRequestBuilder allowedCalendarSharingRolesWithUser(@jakarta.annotation.Nonnull final String User) {
        Objects.requireNonNull(User);
        return new AllowedCalendarSharingRolesWithUserRequestBuilder(pathParameters, requestAdapter, User);
    }
    /**
     * Instantiates a new CalendarRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CalendarRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/calendar{?%24select}", pathParameters);
    }
    /**
     * Instantiates a new CalendarRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CalendarRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/calendar{?%24select}", rawUrl);
    }
    /**
     * Get the properties and relationships of a calendar object. The calendar can be one for a user, or the default calendar of a Microsoft 365 group. There are two scenarios where an app can get another user's calendar: This API is available in the following national cloud deployments.
     * @return a Calendar
     * @see <a href="https://learn.microsoft.com/graph/api/calendar-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Calendar get() {
        return get(null);
    }
    /**
     * Get the properties and relationships of a calendar object. The calendar can be one for a user, or the default calendar of a Microsoft 365 group. There are two scenarios where an app can get another user's calendar: This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Calendar
     * @see <a href="https://learn.microsoft.com/graph/api/calendar-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Calendar get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Calendar::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of a calendar object. The calendar can be one for a user, or the default calendar of a Microsoft 365 group. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a Calendar
     * @see <a href="https://learn.microsoft.com/graph/api/calendar-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Calendar patch(@jakarta.annotation.Nonnull final Calendar body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a calendar object. The calendar can be one for a user, or the default calendar of a Microsoft 365 group. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Calendar
     * @see <a href="https://learn.microsoft.com/graph/api/calendar-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Calendar patch(@jakarta.annotation.Nonnull final Calendar body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Calendar::createFromDiscriminatorValue);
    }
    /**
     * Get the properties and relationships of a calendar object. The calendar can be one for a user, or the default calendar of a Microsoft 365 group. There are two scenarios where an app can get another user's calendar: This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the properties and relationships of a calendar object. The calendar can be one for a user, or the default calendar of a Microsoft 365 group. There are two scenarios where an app can get another user's calendar: This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the properties of a calendar object. The calendar can be one for a user, or the default calendar of a Microsoft 365 group. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Calendar body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a calendar object. The calendar can be one for a user, or the default calendar of a Microsoft 365 group. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Calendar body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a CalendarRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public CalendarRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CalendarRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the properties and relationships of a calendar object. The calendar can be one for a user, or the default calendar of a Microsoft 365 group. There are two scenarios where an app can get another user's calendar: This API is available in the following national cloud deployments.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
