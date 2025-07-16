package com.microsoft.graph.users.item.activities.recent;

import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to call the recent method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecentRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link RecentRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RecentRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/activities/recent(){?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link RecentRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RecentRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/activities/recent(){?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get recent activities for a given user. This OData function has some default behaviors included to make it operate like a &apos;most recently used&apos; API. The service queries for the most recent activityHistoryItems, and then pull those related activities. Activities are sorted according to the most recent lastModified on the activityHistoryItem. This means that activities without activityHistoryItems won&apos;t be included in the response. The UserActivity.ReadWrite.CreatedByApp permission will also apply extra filtering to the response, so that only activities created by your application are returned. This server-side filtering might result in empty pages if the user is active and other applications have created more recent activities. To get your application&apos;s activities, use the nextLink property to paginate.
     * @return a {@link RecentGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/projectrome-get-recent-activities?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public RecentGetResponse get() {
        return get(null);
    }
    /**
     * Get recent activities for a given user. This OData function has some default behaviors included to make it operate like a &apos;most recently used&apos; API. The service queries for the most recent activityHistoryItems, and then pull those related activities. Activities are sorted according to the most recent lastModified on the activityHistoryItem. This means that activities without activityHistoryItems won&apos;t be included in the response. The UserActivity.ReadWrite.CreatedByApp permission will also apply extra filtering to the response, so that only activities created by your application are returned. This server-side filtering might result in empty pages if the user is active and other applications have created more recent activities. To get your application&apos;s activities, use the nextLink property to paginate.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RecentGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/projectrome-get-recent-activities?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public RecentGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, RecentGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Get recent activities for a given user. This OData function has some default behaviors included to make it operate like a &apos;most recently used&apos; API. The service queries for the most recent activityHistoryItems, and then pull those related activities. Activities are sorted according to the most recent lastModified on the activityHistoryItem. This means that activities without activityHistoryItems won&apos;t be included in the response. The UserActivity.ReadWrite.CreatedByApp permission will also apply extra filtering to the response, so that only activities created by your application are returned. This server-side filtering might result in empty pages if the user is active and other applications have created more recent activities. To get your application&apos;s activities, use the nextLink property to paginate.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get recent activities for a given user. This OData function has some default behaviors included to make it operate like a &apos;most recently used&apos; API. The service queries for the most recent activityHistoryItems, and then pull those related activities. Activities are sorted according to the most recent lastModified on the activityHistoryItem. This means that activities without activityHistoryItems won&apos;t be included in the response. The UserActivity.ReadWrite.CreatedByApp permission will also apply extra filtering to the response, so that only activities created by your application are returned. This server-side filtering might result in empty pages if the user is active and other applications have created more recent activities. To get your application&apos;s activities, use the nextLink property to paginate.
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
     * @return a {@link RecentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RecentRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RecentRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get recent activities for a given user. This OData function has some default behaviors included to make it operate like a &apos;most recently used&apos; API. The service queries for the most recent activityHistoryItems, and then pull those related activities. Activities are sorted according to the most recent lastModified on the activityHistoryItem. This means that activities without activityHistoryItems won&apos;t be included in the response. The UserActivity.ReadWrite.CreatedByApp permission will also apply extra filtering to the response, so that only activities created by your application are returned. This server-side filtering might result in empty pages if the user is active and other applications have created more recent activities. To get your application&apos;s activities, use the nextLink property to paginate.
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
