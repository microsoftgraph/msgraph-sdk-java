package com.microsoft.graph.groups.item.events.item;

import com.microsoft.graph.groups.item.events.item.accept.AcceptRequestBuilder;
import com.microsoft.graph.groups.item.events.item.attachments.AttachmentsRequestBuilder;
import com.microsoft.graph.groups.item.events.item.calendar.CalendarRequestBuilder;
import com.microsoft.graph.groups.item.events.item.cancel.CancelRequestBuilder;
import com.microsoft.graph.groups.item.events.item.decline.DeclineRequestBuilder;
import com.microsoft.graph.groups.item.events.item.dismissreminder.DismissReminderRequestBuilder;
import com.microsoft.graph.groups.item.events.item.extensions.ExtensionsRequestBuilder;
import com.microsoft.graph.groups.item.events.item.forward.ForwardRequestBuilder;
import com.microsoft.graph.groups.item.events.item.instances.InstancesRequestBuilder;
import com.microsoft.graph.groups.item.events.item.snoozereminder.SnoozeReminderRequestBuilder;
import com.microsoft.graph.groups.item.events.item.tentativelyaccept.TentativelyAcceptRequestBuilder;
import com.microsoft.graph.models.Event;
import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to manage the events property of the microsoft.graph.group entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EventItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the accept method.
     */
    @jakarta.annotation.Nonnull
    public AcceptRequestBuilder accept() {
        return new AcceptRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the attachments property of the microsoft.graph.event entity.
     */
    @jakarta.annotation.Nonnull
    public AttachmentsRequestBuilder attachments() {
        return new AttachmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendar property of the microsoft.graph.event entity.
     */
    @jakarta.annotation.Nonnull
    public CalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cancel method.
     */
    @jakarta.annotation.Nonnull
    public CancelRequestBuilder cancel() {
        return new CancelRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the decline method.
     */
    @jakarta.annotation.Nonnull
    public DeclineRequestBuilder decline() {
        return new DeclineRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dismissReminder method.
     */
    @jakarta.annotation.Nonnull
    public DismissReminderRequestBuilder dismissReminder() {
        return new DismissReminderRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the extensions property of the microsoft.graph.event entity.
     */
    @jakarta.annotation.Nonnull
    public ExtensionsRequestBuilder extensions() {
        return new ExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the forward method.
     */
    @jakarta.annotation.Nonnull
    public ForwardRequestBuilder forward() {
        return new ForwardRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the instances property of the microsoft.graph.event entity.
     */
    @jakarta.annotation.Nonnull
    public InstancesRequestBuilder instances() {
        return new InstancesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the snoozeReminder method.
     */
    @jakarta.annotation.Nonnull
    public SnoozeReminderRequestBuilder snoozeReminder() {
        return new SnoozeReminderRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the tentativelyAccept method.
     */
    @jakarta.annotation.Nonnull
    public TentativelyAcceptRequestBuilder tentativelyAccept() {
        return new TentativelyAcceptRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new EventItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EventItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/events/{event%2Did}{?%24select}", pathParameters);
    }
    /**
     * Instantiates a new EventItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EventItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/events/{event%2Did}{?%24select}", rawUrl);
    }
    /**
     * Delete an event object.
     * @see <a href="https://learn.microsoft.com/graph/api/group-delete-event?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete an event object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/group-delete-event?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Get an event object.
     * @return a CompletableFuture of event
     * @see <a href="https://learn.microsoft.com/graph/api/group-get-event?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Event> get() {
        return get(null);
    }
    /**
     * Get an event object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of event
     * @see <a href="https://learn.microsoft.com/graph/api/group-get-event?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Event> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Event::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property events in groups
     * @param body The request body
     * @return a CompletableFuture of event
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Event> patch(@jakarta.annotation.Nonnull final Event body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property events in groups
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of event
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Event> patch(@jakarta.annotation.Nonnull final Event body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Event::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete an event object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete an event object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get an event object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get an event object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property events in groups
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Event body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property events in groups
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Event body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a EventItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public EventItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EventItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get an event object.
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
