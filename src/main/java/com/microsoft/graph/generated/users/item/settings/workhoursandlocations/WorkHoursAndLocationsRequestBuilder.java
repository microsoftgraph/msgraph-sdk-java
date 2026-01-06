package com.microsoft.graph.users.item.settings.workhoursandlocations;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.WorkHoursAndLocationsSetting;
import com.microsoft.graph.users.item.settings.workhoursandlocations.occurrences.OccurrencesRequestBuilder;
import com.microsoft.graph.users.item.settings.workhoursandlocations.occurrencesviewwithstartdatetimewithenddatetime.OccurrencesViewWithStartDateTimeWithEndDateTimeRequestBuilder;
import com.microsoft.graph.users.item.settings.workhoursandlocations.recurrences.RecurrencesRequestBuilder;
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
 * Provides operations to manage the workHoursAndLocations property of the microsoft.graph.userSettings entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkHoursAndLocationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the occurrences property of the microsoft.graph.workHoursAndLocationsSetting entity.
     * @return a {@link OccurrencesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OccurrencesRequestBuilder occurrences() {
        return new OccurrencesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the recurrences property of the microsoft.graph.workHoursAndLocationsSetting entity.
     * @return a {@link RecurrencesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RecurrencesRequestBuilder recurrences() {
        return new RecurrencesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WorkHoursAndLocationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WorkHoursAndLocationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/settings/workHoursAndLocations{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link WorkHoursAndLocationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WorkHoursAndLocationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/settings/workHoursAndLocations{?%24expand,%24select}", rawUrl);
    }
    /**
     * The user&apos;s settings for work hours and location preferences for scheduling and availability management.
     * @return a {@link WorkHoursAndLocationsSetting}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public WorkHoursAndLocationsSetting get() {
        return get(null);
    }
    /**
     * The user&apos;s settings for work hours and location preferences for scheduling and availability management.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link WorkHoursAndLocationsSetting}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public WorkHoursAndLocationsSetting get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WorkHoursAndLocationsSetting::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the occurrencesView method.
     * @param endDateTime Usage: endDateTime=&apos;{endDateTime}&apos;
     * @param startDateTime Usage: startDateTime=&apos;{startDateTime}&apos;
     * @return a {@link OccurrencesViewWithStartDateTimeWithEndDateTimeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OccurrencesViewWithStartDateTimeWithEndDateTimeRequestBuilder occurrencesViewWithStartDateTimeWithEndDateTime(@jakarta.annotation.Nonnull final String endDateTime, @jakarta.annotation.Nonnull final String startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new OccurrencesViewWithStartDateTimeWithEndDateTimeRequestBuilder(pathParameters, requestAdapter, endDateTime, startDateTime);
    }
    /**
     * Update the navigation property workHoursAndLocations in users
     * @param body The request body
     * @return a {@link WorkHoursAndLocationsSetting}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public WorkHoursAndLocationsSetting patch(@jakarta.annotation.Nonnull final WorkHoursAndLocationsSetting body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property workHoursAndLocations in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link WorkHoursAndLocationsSetting}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public WorkHoursAndLocationsSetting patch(@jakarta.annotation.Nonnull final WorkHoursAndLocationsSetting body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WorkHoursAndLocationsSetting::createFromDiscriminatorValue);
    }
    /**
     * The user&apos;s settings for work hours and location preferences for scheduling and availability management.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The user&apos;s settings for work hours and location preferences for scheduling and availability management.
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
     * Update the navigation property workHoursAndLocations in users
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WorkHoursAndLocationsSetting body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property workHoursAndLocations in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WorkHoursAndLocationsSetting body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link WorkHoursAndLocationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WorkHoursAndLocationsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WorkHoursAndLocationsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * The user&apos;s settings for work hours and location preferences for scheduling and availability management.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
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
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
