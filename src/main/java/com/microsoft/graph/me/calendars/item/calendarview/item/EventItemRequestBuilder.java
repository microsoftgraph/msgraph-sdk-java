package com.microsoft.graph.me.calendars.item.calendarview.item;

import com.microsoft.graph.me.calendars.item.calendarview.item.accept.AcceptRequestBuilder;
import com.microsoft.graph.me.calendars.item.calendarview.item.attachments.AttachmentsRequestBuilder;
import com.microsoft.graph.me.calendars.item.calendarview.item.attachments.item.AttachmentItemRequestBuilder;
import com.microsoft.graph.me.calendars.item.calendarview.item.calendar.CalendarRequestBuilder;
import com.microsoft.graph.me.calendars.item.calendarview.item.cancel.CancelRequestBuilder;
import com.microsoft.graph.me.calendars.item.calendarview.item.decline.DeclineRequestBuilder;
import com.microsoft.graph.me.calendars.item.calendarview.item.dismissreminder.DismissReminderRequestBuilder;
import com.microsoft.graph.me.calendars.item.calendarview.item.extensions.ExtensionsRequestBuilder;
import com.microsoft.graph.me.calendars.item.calendarview.item.extensions.item.ExtensionItemRequestBuilder;
import com.microsoft.graph.me.calendars.item.calendarview.item.forward.ForwardRequestBuilder;
import com.microsoft.graph.me.calendars.item.calendarview.item.instances.InstancesRequestBuilder;
import com.microsoft.graph.me.calendars.item.calendarview.item.multivalueextendedproperties.item.MultiValueLegacyExtendedPropertyItemRequestBuilder;
import com.microsoft.graph.me.calendars.item.calendarview.item.multivalueextendedproperties.MultiValueExtendedPropertiesRequestBuilder;
import com.microsoft.graph.me.calendars.item.calendarview.item.singlevalueextendedproperties.item.SingleValueLegacyExtendedPropertyItemRequestBuilder;
import com.microsoft.graph.me.calendars.item.calendarview.item.singlevalueextendedproperties.SingleValueExtendedPropertiesRequestBuilder;
import com.microsoft.graph.me.calendars.item.calendarview.item.snoozereminder.SnoozeReminderRequestBuilder;
import com.microsoft.graph.me.calendars.item.calendarview.item.tentativelyaccept.TentativelyAcceptRequestBuilder;
import com.microsoft.graph.models.Event;
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
/** Provides operations to manage the calendarView property of the microsoft.graph.calendar entity. */
public class EventItemRequestBuilder {
    /** Provides operations to call the accept method. */
    @javax.annotation.Nonnull
    public AcceptRequestBuilder accept() {
        return new AcceptRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the attachments property of the microsoft.graph.event entity. */
    @javax.annotation.Nonnull
    public AttachmentsRequestBuilder attachments() {
        return new AttachmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the calendar property of the microsoft.graph.event entity. */
    @javax.annotation.Nonnull
    public CalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the cancel method. */
    @javax.annotation.Nonnull
    public CancelRequestBuilder cancel() {
        return new CancelRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the decline method. */
    @javax.annotation.Nonnull
    public DeclineRequestBuilder decline() {
        return new DeclineRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the dismissReminder method. */
    @javax.annotation.Nonnull
    public DismissReminderRequestBuilder dismissReminder() {
        return new DismissReminderRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the extensions property of the microsoft.graph.event entity. */
    @javax.annotation.Nonnull
    public ExtensionsRequestBuilder extensions() {
        return new ExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the forward method. */
    @javax.annotation.Nonnull
    public ForwardRequestBuilder forward() {
        return new ForwardRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the instances property of the microsoft.graph.event entity. */
    @javax.annotation.Nonnull
    public InstancesRequestBuilder instances() {
        return new InstancesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the multiValueExtendedProperties property of the microsoft.graph.event entity. */
    @javax.annotation.Nonnull
    public MultiValueExtendedPropertiesRequestBuilder multiValueExtendedProperties() {
        return new MultiValueExtendedPropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to manage the singleValueExtendedProperties property of the microsoft.graph.event entity. */
    @javax.annotation.Nonnull
    public SingleValueExtendedPropertiesRequestBuilder singleValueExtendedProperties() {
        return new SingleValueExtendedPropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the snoozeReminder method. */
    @javax.annotation.Nonnull
    public SnoozeReminderRequestBuilder snoozeReminder() {
        return new SnoozeReminderRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the tentativelyAccept method. */
    @javax.annotation.Nonnull
    public TentativelyAcceptRequestBuilder tentativelyAccept() {
        return new TentativelyAcceptRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Provides operations to manage the attachments property of the microsoft.graph.event entity.
     * @param id Unique identifier of the item
     * @return a AttachmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AttachmentItemRequestBuilder attachments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("attachment%2Did", id);
        return new AttachmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new EventItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EventItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/me/calendars/{calendar%2Did}/calendarView/{event%2Did}{?startDateTime*,endDateTime*,%24select}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new EventItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EventItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/me/calendars/{calendar%2Did}/calendarView/{event%2Did}{?startDateTime*,endDateTime*,%24select}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * The calendar view for the calendar. Navigation property. Read-only.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * The calendar view for the calendar. Navigation property. Read-only.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Provides operations to manage the extensions property of the microsoft.graph.event entity.
     * @param id Unique identifier of the item
     * @return a ExtensionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ExtensionItemRequestBuilder extensions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("extension%2Did", id);
        return new ExtensionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * The calendar view for the calendar. Navigation property. Read-only.
     * @return a CompletableFuture of event
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Event> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>()
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Event::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Event>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * The calendar view for the calendar. Navigation property. Read-only.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of event
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Event> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>()
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Event::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Event>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the instances property of the microsoft.graph.event entity.
     * @param id Unique identifier of the item
     * @return a EventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EventItemRequestBuilder instances(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("event%2Did1", id);
        return new EventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the multiValueExtendedProperties property of the microsoft.graph.event entity.
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
     * Provides operations to manage the singleValueExtendedProperties property of the microsoft.graph.event entity.
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
    /** The calendar view for the calendar. Navigation property. Read-only. */
    public class GetQueryParameters {
        /** The end date and time of the time range, represented in ISO 8601 format. For example, 2019-11-08T20:00:00-08:00 */
        @javax.annotation.Nullable
        public String endDateTime;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
        /** The start date and time of the time range, represented in ISO 8601 format. For example, 2019-11-08T19:00:00-08:00 */
        @javax.annotation.Nullable
        public String startDateTime;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
}
