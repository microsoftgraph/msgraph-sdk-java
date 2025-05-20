package com.microsoft.graph.users.item.calendargroups.item.calendars.item.calendarview.item.exceptionoccurrences;

import com.microsoft.graph.models.EventCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.users.item.calendargroups.item.calendars.item.calendarview.item.exceptionoccurrences.count.CountRequestBuilder;
import com.microsoft.graph.users.item.calendargroups.item.calendars.item.calendarview.item.exceptionoccurrences.delta.DeltaRequestBuilder;
import com.microsoft.graph.users.item.calendargroups.item.calendars.item.calendarview.item.exceptionoccurrences.item.EventItemRequestBuilder;
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
 * Provides operations to manage the exceptionOccurrences property of the microsoft.graph.event entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExceptionOccurrencesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the delta method.
     * @return a {@link DeltaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeltaRequestBuilder delta() {
        return new DeltaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the exceptionOccurrences property of the microsoft.graph.event entity.
     * @param eventId1 The unique identifier of event
     * @return a {@link EventItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EventItemRequestBuilder byEventId1(@jakarta.annotation.Nonnull final String eventId1) {
        Objects.requireNonNull(eventId1);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("event%2Did1", eventId1);
        return new EventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ExceptionOccurrencesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ExceptionOccurrencesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/calendarGroups/{calendarGroup%2Did}/calendars/{calendar%2Did}/calendarView/{event%2Did}/exceptionOccurrences{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link ExceptionOccurrencesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ExceptionOccurrencesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/calendarGroups/{calendarGroup%2Did}/calendars/{calendar%2Did}/calendarView/{event%2Did}/exceptionOccurrences{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Contains the id property values of the event instances that are exceptions in a recurring series.Exceptions can differ from other occurrences in a recurring series, such as the subject, start or end times, or attendees. Exceptions don&apos;t include canceled occurrences.Returned only on $select and $expand in a GET operation that specifies the ID (seriesMasterId property value) of a series master event.
     * @return a {@link EventCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public EventCollectionResponse get() {
        return get(null);
    }
    /**
     * Contains the id property values of the event instances that are exceptions in a recurring series.Exceptions can differ from other occurrences in a recurring series, such as the subject, start or end times, or attendees. Exceptions don&apos;t include canceled occurrences.Returned only on $select and $expand in a GET operation that specifies the ID (seriesMasterId property value) of a series master event.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EventCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public EventCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EventCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Contains the id property values of the event instances that are exceptions in a recurring series.Exceptions can differ from other occurrences in a recurring series, such as the subject, start or end times, or attendees. Exceptions don&apos;t include canceled occurrences.Returned only on $select and $expand in a GET operation that specifies the ID (seriesMasterId property value) of a series master event.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Contains the id property values of the event instances that are exceptions in a recurring series.Exceptions can differ from other occurrences in a recurring series, such as the subject, start or end times, or attendees. Exceptions don&apos;t include canceled occurrences.Returned only on $select and $expand in a GET operation that specifies the ID (seriesMasterId property value) of a series master event.
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
     * @return a {@link ExceptionOccurrencesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExceptionOccurrencesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ExceptionOccurrencesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Contains the id property values of the event instances that are exceptions in a recurring series.Exceptions can differ from other occurrences in a recurring series, such as the subject, start or end times, or attendees. Exceptions don&apos;t include canceled occurrences.Returned only on $select and $expand in a GET operation that specifies the ID (seriesMasterId property value) of a series master event.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24orderby", orderby);
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
