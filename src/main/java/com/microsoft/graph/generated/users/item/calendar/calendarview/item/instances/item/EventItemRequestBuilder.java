package com.microsoft.graph.users.item.calendar.calendarview.item.instances.item;

import com.microsoft.graph.models.Event;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.users.item.calendar.calendarview.item.instances.item.accept.AcceptRequestBuilder;
import com.microsoft.graph.users.item.calendar.calendarview.item.instances.item.attachments.AttachmentsRequestBuilder;
import com.microsoft.graph.users.item.calendar.calendarview.item.instances.item.calendar.CalendarRequestBuilder;
import com.microsoft.graph.users.item.calendar.calendarview.item.instances.item.cancel.CancelRequestBuilder;
import com.microsoft.graph.users.item.calendar.calendarview.item.instances.item.decline.DeclineRequestBuilder;
import com.microsoft.graph.users.item.calendar.calendarview.item.instances.item.dismissreminder.DismissReminderRequestBuilder;
import com.microsoft.graph.users.item.calendar.calendarview.item.instances.item.extensions.ExtensionsRequestBuilder;
import com.microsoft.graph.users.item.calendar.calendarview.item.instances.item.forward.ForwardRequestBuilder;
import com.microsoft.graph.users.item.calendar.calendarview.item.instances.item.permanentdelete.PermanentDeleteRequestBuilder;
import com.microsoft.graph.users.item.calendar.calendarview.item.instances.item.snoozereminder.SnoozeReminderRequestBuilder;
import com.microsoft.graph.users.item.calendar.calendarview.item.instances.item.tentativelyaccept.TentativelyAcceptRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Provides operations to manage the instances property of the microsoft.graph.event entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EventItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the accept method.
     * @return a {@link AcceptRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AcceptRequestBuilder accept() {
        return new AcceptRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the attachments property of the microsoft.graph.event entity.
     * @return a {@link AttachmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AttachmentsRequestBuilder attachments() {
        return new AttachmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendar property of the microsoft.graph.event entity.
     * @return a {@link CalendarRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cancel method.
     * @return a {@link CancelRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CancelRequestBuilder cancel() {
        return new CancelRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the decline method.
     * @return a {@link DeclineRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeclineRequestBuilder decline() {
        return new DeclineRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dismissReminder method.
     * @return a {@link DismissReminderRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DismissReminderRequestBuilder dismissReminder() {
        return new DismissReminderRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the extensions property of the microsoft.graph.event entity.
     * @return a {@link ExtensionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExtensionsRequestBuilder extensions() {
        return new ExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the forward method.
     * @return a {@link ForwardRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ForwardRequestBuilder forward() {
        return new ForwardRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the permanentDelete method.
     * @return a {@link PermanentDeleteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermanentDeleteRequestBuilder permanentDelete() {
        return new PermanentDeleteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the snoozeReminder method.
     * @return a {@link SnoozeReminderRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SnoozeReminderRequestBuilder snoozeReminder() {
        return new SnoozeReminderRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the tentativelyAccept method.
     * @return a {@link TentativelyAcceptRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TentativelyAcceptRequestBuilder tentativelyAccept() {
        return new TentativelyAcceptRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link EventItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EventItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/calendar/calendarView/{event%2Did}/instances/{event%2Did1}?endDateTime={endDateTime}&startDateTime={startDateTime}{&%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link EventItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EventItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/calendar/calendarView/{event%2Did}/instances/{event%2Did1}?endDateTime={endDateTime}&startDateTime={startDateTime}{&%24expand,%24select}", rawUrl);
    }
    /**
     * The occurrences of a recurring series, if the event is a series master. This property includes occurrences that are part of the recurrence pattern, and exceptions modified, but doesn&apos;t include occurrences cancelled from the series. Navigation property. Read-only. Nullable.
     * @return a {@link Event}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Event get() {
        return get(null);
    }
    /**
     * The occurrences of a recurring series, if the event is a series master. This property includes occurrences that are part of the recurrence pattern, and exceptions modified, but doesn&apos;t include occurrences cancelled from the series. Navigation property. Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Event}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Event get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Event::createFromDiscriminatorValue);
    }
    /**
     * The occurrences of a recurring series, if the event is a series master. This property includes occurrences that are part of the recurrence pattern, and exceptions modified, but doesn&apos;t include occurrences cancelled from the series. Navigation property. Read-only. Nullable.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The occurrences of a recurring series, if the event is a series master. This property includes occurrences that are part of the recurrence pattern, and exceptions modified, but doesn&apos;t include occurrences cancelled from the series. Navigation property. Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link EventItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EventItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EventItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * The occurrences of a recurring series, if the event is a series master. This property includes occurrences that are part of the recurrence pattern, and exceptions modified, but doesn&apos;t include occurrences cancelled from the series. Navigation property. Read-only. Nullable.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The end date and time of the time range, represented in ISO 8601 format. For example, 2019-11-08T20:00:00-08:00
         */
        @jakarta.annotation.Nullable
        public String endDateTime;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * The start date and time of the time range, represented in ISO 8601 format. For example, 2019-11-08T19:00:00-08:00
         */
        @jakarta.annotation.Nullable
        public String startDateTime;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("endDateTime", endDateTime);
            allQueryParams.put("startDateTime", startDateTime);
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
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
}
