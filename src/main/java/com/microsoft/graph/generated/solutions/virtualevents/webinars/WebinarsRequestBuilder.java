package com.microsoft.graph.solutions.virtualevents.webinars;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.VirtualEventWebinar;
import com.microsoft.graph.models.VirtualEventWebinarCollectionResponse;
import com.microsoft.graph.solutions.virtualevents.webinars.count.CountRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.webinars.getbyuseridandrolewithuseridwithrole.GetByUserIdAndRoleWithUserIdWithRoleRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.webinars.getbyuserrolewithrole.GetByUserRoleWithRoleRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.webinars.item.VirtualEventWebinarItemRequestBuilder;
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
 * Provides operations to manage the webinars property of the microsoft.graph.virtualEventsRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WebinarsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the webinars property of the microsoft.graph.virtualEventsRoot entity.
     * @param virtualEventWebinarId The unique identifier of virtualEventWebinar
     * @return a {@link VirtualEventWebinarItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VirtualEventWebinarItemRequestBuilder byVirtualEventWebinarId(@jakarta.annotation.Nonnull final String virtualEventWebinarId) {
        Objects.requireNonNull(virtualEventWebinarId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("virtualEventWebinar%2Did", virtualEventWebinarId);
        return new VirtualEventWebinarItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link WebinarsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WebinarsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/virtualEvents/webinars{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link WebinarsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WebinarsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/virtualEvents/webinars{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get the list of all virtualEventWebinar objects created in a tenant.
     * @return a {@link VirtualEventWebinarCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/virtualeventsroot-list-webinars?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public VirtualEventWebinarCollectionResponse get() {
        return get(null);
    }
    /**
     * Get the list of all virtualEventWebinar objects created in a tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VirtualEventWebinarCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/virtualeventsroot-list-webinars?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public VirtualEventWebinarCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, VirtualEventWebinarCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the getByUserIdAndRole method.
     * @param role Usage: role=&apos;{role}&apos;
     * @param userId Usage: userId=&apos;{userId}&apos;
     * @return a {@link GetByUserIdAndRoleWithUserIdWithRoleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetByUserIdAndRoleWithUserIdWithRoleRequestBuilder getByUserIdAndRoleWithUserIdWithRole(@jakarta.annotation.Nonnull final String role, @jakarta.annotation.Nonnull final String userId) {
        Objects.requireNonNull(role);
        Objects.requireNonNull(userId);
        return new GetByUserIdAndRoleWithUserIdWithRoleRequestBuilder(pathParameters, requestAdapter, role, userId);
    }
    /**
     * Provides operations to call the getByUserRole method.
     * @param role Usage: role=&apos;{role}&apos;
     * @return a {@link GetByUserRoleWithRoleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetByUserRoleWithRoleRequestBuilder getByUserRoleWithRole(@jakarta.annotation.Nonnull final String role) {
        Objects.requireNonNull(role);
        return new GetByUserRoleWithRoleRequestBuilder(pathParameters, requestAdapter, role);
    }
    /**
     * Create a new virtualEventWebinar object in draft mode.
     * @param body The request body
     * @return a {@link VirtualEventWebinar}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/virtualeventsroot-post-webinars?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public VirtualEventWebinar post(@jakarta.annotation.Nonnull final VirtualEventWebinar body) {
        return post(body, null);
    }
    /**
     * Create a new virtualEventWebinar object in draft mode.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VirtualEventWebinar}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/virtualeventsroot-post-webinars?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public VirtualEventWebinar post(@jakarta.annotation.Nonnull final VirtualEventWebinar body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, VirtualEventWebinar::createFromDiscriminatorValue);
    }
    /**
     * Get the list of all virtualEventWebinar objects created in a tenant.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the list of all virtualEventWebinar objects created in a tenant.
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
     * Create a new virtualEventWebinar object in draft mode.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final VirtualEventWebinar body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new virtualEventWebinar object in draft mode.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final VirtualEventWebinar body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link WebinarsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WebinarsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WebinarsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the list of all virtualEventWebinar objects created in a tenant.
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
        public Long skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Long top;
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
