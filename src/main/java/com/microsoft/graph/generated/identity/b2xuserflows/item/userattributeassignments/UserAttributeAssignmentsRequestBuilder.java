package com.microsoft.graph.identity.b2xuserflows.item.userattributeassignments;

import com.microsoft.graph.identity.b2xuserflows.item.userattributeassignments.count.CountRequestBuilder;
import com.microsoft.graph.identity.b2xuserflows.item.userattributeassignments.getorder.GetOrderRequestBuilder;
import com.microsoft.graph.identity.b2xuserflows.item.userattributeassignments.item.IdentityUserFlowAttributeAssignmentItemRequestBuilder;
import com.microsoft.graph.identity.b2xuserflows.item.userattributeassignments.setorder.SetOrderRequestBuilder;
import com.microsoft.graph.models.IdentityUserFlowAttributeAssignment;
import com.microsoft.graph.models.IdentityUserFlowAttributeAssignmentCollectionResponse;
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
 * Provides operations to manage the userAttributeAssignments property of the microsoft.graph.b2xIdentityUserFlow entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserAttributeAssignmentsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getOrder method.
     * @return a {@link GetOrderRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOrderRequestBuilder getOrder() {
        return new GetOrderRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the setOrder method.
     * @return a {@link SetOrderRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SetOrderRequestBuilder setOrder() {
        return new SetOrderRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userAttributeAssignments property of the microsoft.graph.b2xIdentityUserFlow entity.
     * @param identityUserFlowAttributeAssignmentId The unique identifier of identityUserFlowAttributeAssignment
     * @return a {@link IdentityUserFlowAttributeAssignmentItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IdentityUserFlowAttributeAssignmentItemRequestBuilder byIdentityUserFlowAttributeAssignmentId(@jakarta.annotation.Nonnull final String identityUserFlowAttributeAssignmentId) {
        Objects.requireNonNull(identityUserFlowAttributeAssignmentId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("identityUserFlowAttributeAssignment%2Did", identityUserFlowAttributeAssignmentId);
        return new IdentityUserFlowAttributeAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link UserAttributeAssignmentsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserAttributeAssignmentsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/b2xUserFlows/{b2xIdentityUserFlow%2Did}/userAttributeAssignments{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link UserAttributeAssignmentsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserAttributeAssignmentsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/b2xUserFlows/{b2xIdentityUserFlow%2Did}/userAttributeAssignments{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get the identityUserFlowAttributeAssignment resources from the userAttributeAssignments navigation property in a b2xIdentityUserFlow.
     * @return a {@link IdentityUserFlowAttributeAssignmentCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/b2xidentityuserflow-list-userattributeassignments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public IdentityUserFlowAttributeAssignmentCollectionResponse get() {
        return get(null);
    }
    /**
     * Get the identityUserFlowAttributeAssignment resources from the userAttributeAssignments navigation property in a b2xIdentityUserFlow.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link IdentityUserFlowAttributeAssignmentCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/b2xidentityuserflow-list-userattributeassignments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public IdentityUserFlowAttributeAssignmentCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, IdentityUserFlowAttributeAssignmentCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new identityUserFlowAttributeAssignment object in a b2xIdentityUserFlow.
     * @param body The request body
     * @return a {@link IdentityUserFlowAttributeAssignment}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/b2xidentityuserflow-post-userattributeassignments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public IdentityUserFlowAttributeAssignment post(@jakarta.annotation.Nonnull final IdentityUserFlowAttributeAssignment body) {
        return post(body, null);
    }
    /**
     * Create a new identityUserFlowAttributeAssignment object in a b2xIdentityUserFlow.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link IdentityUserFlowAttributeAssignment}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/b2xidentityuserflow-post-userattributeassignments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public IdentityUserFlowAttributeAssignment post(@jakarta.annotation.Nonnull final IdentityUserFlowAttributeAssignment body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, IdentityUserFlowAttributeAssignment::createFromDiscriminatorValue);
    }
    /**
     * Get the identityUserFlowAttributeAssignment resources from the userAttributeAssignments navigation property in a b2xIdentityUserFlow.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the identityUserFlowAttributeAssignment resources from the userAttributeAssignments navigation property in a b2xIdentityUserFlow.
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
     * Create a new identityUserFlowAttributeAssignment object in a b2xIdentityUserFlow.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final IdentityUserFlowAttributeAssignment body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new identityUserFlowAttributeAssignment object in a b2xIdentityUserFlow.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final IdentityUserFlowAttributeAssignment body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link UserAttributeAssignmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserAttributeAssignmentsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UserAttributeAssignmentsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the identityUserFlowAttributeAssignment resources from the userAttributeAssignments navigation property in a b2xIdentityUserFlow.
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
