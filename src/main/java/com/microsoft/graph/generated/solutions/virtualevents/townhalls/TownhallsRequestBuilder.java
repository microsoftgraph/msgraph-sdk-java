package com.microsoft.graph.solutions.virtualevents.townhalls;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.VirtualEventTownhall;
import com.microsoft.graph.models.VirtualEventTownhallCollectionResponse;
import com.microsoft.graph.solutions.virtualevents.townhalls.count.CountRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.townhalls.getbyuseridandrolewithuseridwithrole.GetByUserIdAndRoleWithUserIdWithRoleRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.townhalls.getbyuserrolewithrole.GetByUserRoleWithRoleRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.townhalls.item.VirtualEventTownhallItemRequestBuilder;
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
 * Provides operations to manage the townhalls property of the microsoft.graph.virtualEventsRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TownhallsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the townhalls property of the microsoft.graph.virtualEventsRoot entity.
     * @param virtualEventTownhallId The unique identifier of virtualEventTownhall
     * @return a {@link VirtualEventTownhallItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VirtualEventTownhallItemRequestBuilder byVirtualEventTownhallId(@jakarta.annotation.Nonnull final String virtualEventTownhallId) {
        Objects.requireNonNull(virtualEventTownhallId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("virtualEventTownhall%2Did", virtualEventTownhallId);
        return new VirtualEventTownhallItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link TownhallsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TownhallsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/virtualEvents/townhalls{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link TownhallsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TownhallsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/virtualEvents/townhalls{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Read the properties and relationships of a virtualEventTownhall object. All roles can get the details of a townhall event.
     * @return a {@link VirtualEventTownhallCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public VirtualEventTownhallCollectionResponse get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of a virtualEventTownhall object. All roles can get the details of a townhall event.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VirtualEventTownhallCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public VirtualEventTownhallCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, VirtualEventTownhallCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the getByUserIdAndRole method.
     * @param role Usage: role='{role}'
     * @param userId Usage: userId='{userId}'
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
     * @param role Usage: role='{role}'
     * @return a {@link GetByUserRoleWithRoleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetByUserRoleWithRoleRequestBuilder getByUserRoleWithRole(@jakarta.annotation.Nonnull final String role) {
        Objects.requireNonNull(role);
        return new GetByUserRoleWithRoleRequestBuilder(pathParameters, requestAdapter, role);
    }
    /**
     * Create a new virtualEventTownhall object in draft mode.
     * @param body The request body
     * @return a {@link VirtualEventTownhall}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/virtualeventsroot-post-townhalls?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public VirtualEventTownhall post(@jakarta.annotation.Nonnull final VirtualEventTownhall body) {
        return post(body, null);
    }
    /**
     * Create a new virtualEventTownhall object in draft mode.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VirtualEventTownhall}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/virtualeventsroot-post-townhalls?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public VirtualEventTownhall post(@jakarta.annotation.Nonnull final VirtualEventTownhall body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, VirtualEventTownhall::createFromDiscriminatorValue);
    }
    /**
     * Read the properties and relationships of a virtualEventTownhall object. All roles can get the details of a townhall event.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a virtualEventTownhall object. All roles can get the details of a townhall event.
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
     * Create a new virtualEventTownhall object in draft mode.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final VirtualEventTownhall body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new virtualEventTownhall object in draft mode.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final VirtualEventTownhall body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link TownhallsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TownhallsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TownhallsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Read the properties and relationships of a virtualEventTownhall object. All roles can get the details of a townhall event.
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
