package com.microsoft.graph.users.item.insights.shared;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SharedInsight;
import com.microsoft.graph.models.SharedInsightCollectionResponse;
import com.microsoft.graph.users.item.insights.shared.count.CountRequestBuilder;
import com.microsoft.graph.users.item.insights.shared.item.SharedInsightItemRequestBuilder;
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
 * Provides operations to manage the shared property of the microsoft.graph.officeGraphInsights entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharedRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the shared property of the microsoft.graph.officeGraphInsights entity.
     * @param sharedInsightId The unique identifier of sharedInsight
     * @return a SharedInsightItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SharedInsightItemRequestBuilder bySharedInsightId(@jakarta.annotation.Nonnull final String sharedInsightId) {
        Objects.requireNonNull(sharedInsightId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sharedInsight%2Did", sharedInsightId);
        return new SharedInsightItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SharedRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SharedRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/insights/shared{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new SharedRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SharedRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/insights/shared{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Calculated insight that includes the list of documents shared with a user. This insight includes documents hosted on OneDrive/SharePoint in the user's Microsoft 365 tenant that are shared with the user, and documents that are attached as files and sent to the user.
     * @return a SharedInsightCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/insights-list-shared?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SharedInsightCollectionResponse get() {
        return get(null);
    }
    /**
     * Calculated insight that includes the list of documents shared with a user. This insight includes documents hosted on OneDrive/SharePoint in the user's Microsoft 365 tenant that are shared with the user, and documents that are attached as files and sent to the user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SharedInsightCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/insights-list-shared?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SharedInsightCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SharedInsightCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to shared for users
     * @param body The request body
     * @return a SharedInsight
     */
    @jakarta.annotation.Nullable
    public SharedInsight post(@jakarta.annotation.Nonnull final SharedInsight body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to shared for users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SharedInsight
     */
    @jakarta.annotation.Nullable
    public SharedInsight post(@jakarta.annotation.Nonnull final SharedInsight body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SharedInsight::createFromDiscriminatorValue);
    }
    /**
     * Calculated insight that includes the list of documents shared with a user. This insight includes documents hosted on OneDrive/SharePoint in the user's Microsoft 365 tenant that are shared with the user, and documents that are attached as files and sent to the user.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Calculated insight that includes the list of documents shared with a user. This insight includes documents hosted on OneDrive/SharePoint in the user's Microsoft 365 tenant that are shared with the user, and documents that are attached as files and sent to the user.
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
     * Create new navigation property to shared for users
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SharedInsight body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to shared for users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SharedInsight body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a SharedRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SharedRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SharedRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Calculated insight that includes the list of documents shared with a user. This insight includes documents hosted on OneDrive/SharePoint in the user's Microsoft 365 tenant that are shared with the user, and documents that are attached as files and sent to the user.
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
         * @return a Map<String, Object>
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
