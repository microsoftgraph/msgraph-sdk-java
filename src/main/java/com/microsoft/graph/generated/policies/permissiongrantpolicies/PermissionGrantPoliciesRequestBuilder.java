package com.microsoft.graph.policies.permissiongrantpolicies;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.PermissionGrantPolicy;
import com.microsoft.graph.models.PermissionGrantPolicyCollectionResponse;
import com.microsoft.graph.policies.permissiongrantpolicies.count.CountRequestBuilder;
import com.microsoft.graph.policies.permissiongrantpolicies.item.PermissionGrantPolicyItemRequestBuilder;
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
 * Provides operations to manage the permissionGrantPolicies property of the microsoft.graph.policyRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PermissionGrantPoliciesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the permissionGrantPolicies property of the microsoft.graph.policyRoot entity.
     * @param permissionGrantPolicyId The unique identifier of permissionGrantPolicy
     * @return a {@link PermissionGrantPolicyItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermissionGrantPolicyItemRequestBuilder byPermissionGrantPolicyId(@jakarta.annotation.Nonnull final String permissionGrantPolicyId) {
        Objects.requireNonNull(permissionGrantPolicyId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("permissionGrantPolicy%2Did", permissionGrantPolicyId);
        return new PermissionGrantPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link PermissionGrantPoliciesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PermissionGrantPoliciesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies/permissionGrantPolicies{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link PermissionGrantPoliciesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PermissionGrantPoliciesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies/permissionGrantPolicies{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Retrieve the list of permissionGrantPolicy objects.
     * @return a {@link PermissionGrantPolicyCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/permissiongrantpolicy-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PermissionGrantPolicyCollectionResponse get() {
        return get(null);
    }
    /**
     * Retrieve the list of permissionGrantPolicy objects.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PermissionGrantPolicyCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/permissiongrantpolicy-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PermissionGrantPolicyCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PermissionGrantPolicyCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Creates a permissionGrantPolicy. A permission grant policy is used to describe the conditions under which permissions can be granted (for example, during application consent). After creating the permission grant policy, you can add include condition sets to add matching rules, and add exclude condition sets to add exclusion rules.
     * @param body The request body
     * @return a {@link PermissionGrantPolicy}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/permissiongrantpolicy-post-permissiongrantpolicies?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PermissionGrantPolicy post(@jakarta.annotation.Nonnull final PermissionGrantPolicy body) {
        return post(body, null);
    }
    /**
     * Creates a permissionGrantPolicy. A permission grant policy is used to describe the conditions under which permissions can be granted (for example, during application consent). After creating the permission grant policy, you can add include condition sets to add matching rules, and add exclude condition sets to add exclusion rules.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PermissionGrantPolicy}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/permissiongrantpolicy-post-permissiongrantpolicies?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PermissionGrantPolicy post(@jakarta.annotation.Nonnull final PermissionGrantPolicy body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PermissionGrantPolicy::createFromDiscriminatorValue);
    }
    /**
     * Retrieve the list of permissionGrantPolicy objects.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the list of permissionGrantPolicy objects.
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
     * Creates a permissionGrantPolicy. A permission grant policy is used to describe the conditions under which permissions can be granted (for example, during application consent). After creating the permission grant policy, you can add include condition sets to add matching rules, and add exclude condition sets to add exclusion rules.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PermissionGrantPolicy body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Creates a permissionGrantPolicy. A permission grant policy is used to describe the conditions under which permissions can be granted (for example, during application consent). After creating the permission grant policy, you can add include condition sets to add matching rules, and add exclude condition sets to add exclusion rules.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PermissionGrantPolicy body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link PermissionGrantPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermissionGrantPoliciesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PermissionGrantPoliciesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve the list of permissionGrantPolicy objects.
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
