package com.microsoft.graph.policies.rolemanagementpolicies.item.effectiverules;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.UnifiedRoleManagementPolicyRule;
import com.microsoft.graph.models.UnifiedRoleManagementPolicyRuleCollectionResponse;
import com.microsoft.graph.policies.rolemanagementpolicies.item.effectiverules.count.CountRequestBuilder;
import com.microsoft.graph.policies.rolemanagementpolicies.item.effectiverules.item.UnifiedRoleManagementPolicyRuleItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the effectiveRules property of the microsoft.graph.unifiedRoleManagementPolicy entity.
 */
public class EffectiveRulesRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to count the resources in the collection. */
    @javax.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the effectiveRules property of the microsoft.graph.unifiedRoleManagementPolicy entity.
     * @param unifiedRoleManagementPolicyRuleId Unique identifier of the item
     * @return a UnifiedRoleManagementPolicyRuleItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleManagementPolicyRuleItemRequestBuilder byUnifiedRoleManagementPolicyRuleId(@javax.annotation.Nonnull final String unifiedRoleManagementPolicyRuleId) {
        Objects.requireNonNull(unifiedRoleManagementPolicyRuleId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleManagementPolicyRule%2Did", unifiedRoleManagementPolicyRuleId);
        return new UnifiedRoleManagementPolicyRuleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new EffectiveRulesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EffectiveRulesRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies/roleManagementPolicies/{unifiedRoleManagementPolicy%2Did}/effectiveRules{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new EffectiveRulesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EffectiveRulesRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies/roleManagementPolicies/{unifiedRoleManagementPolicy%2Did}/effectiveRules{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * The list of effective rules like approval rules and expiration rules evaluated based on inherited referenced rules. For example, if there is a tenant-wide policy to enforce enabling an approval rule, the effective rule will be to enable approval even if the policy has a rule to disable approval. Supports $expand.
     * @return a CompletableFuture of UnifiedRoleManagementPolicyRuleCollectionResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleManagementPolicyRuleCollectionResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleManagementPolicyRuleCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UnifiedRoleManagementPolicyRuleCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<UnifiedRoleManagementPolicyRuleCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * The list of effective rules like approval rules and expiration rules evaluated based on inherited referenced rules. For example, if there is a tenant-wide policy to enforce enabling an approval rule, the effective rule will be to enable approval even if the policy has a rule to disable approval. Supports $expand.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of UnifiedRoleManagementPolicyRuleCollectionResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleManagementPolicyRuleCollectionResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleManagementPolicyRuleCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UnifiedRoleManagementPolicyRuleCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<UnifiedRoleManagementPolicyRuleCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create new navigation property to effectiveRules for policies
     * @param body The request body
     * @return a CompletableFuture of unifiedRoleManagementPolicyRule
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleManagementPolicyRule> post(@javax.annotation.Nonnull final UnifiedRoleManagementPolicyRule body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleManagementPolicyRule::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UnifiedRoleManagementPolicyRule> executionException = new java.util.concurrent.CompletableFuture<UnifiedRoleManagementPolicyRule>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create new navigation property to effectiveRules for policies
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of unifiedRoleManagementPolicyRule
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleManagementPolicyRule> post(@javax.annotation.Nonnull final UnifiedRoleManagementPolicyRule body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleManagementPolicyRule::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UnifiedRoleManagementPolicyRule> executionException = new java.util.concurrent.CompletableFuture<UnifiedRoleManagementPolicyRule>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * The list of effective rules like approval rules and expiration rules evaluated based on inherited referenced rules. For example, if there is a tenant-wide policy to enforce enabling an approval rule, the effective rule will be to enable approval even if the policy has a rule to disable approval. Supports $expand.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * The list of effective rules like approval rules and expiration rules evaluated based on inherited referenced rules. For example, if there is a tenant-wide policy to enforce enabling an approval rule, the effective rule will be to enable approval even if the policy has a rule to disable approval. Supports $expand.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Create new navigation property to effectiveRules for policies
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final UnifiedRoleManagementPolicyRule body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to effectiveRules for policies
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final UnifiedRoleManagementPolicyRule body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * The list of effective rules like approval rules and expiration rules evaluated based on inherited referenced rules. For example, if there is a tenant-wide policy to enforce enabling an approval rule, the effective rule will be to enable approval even if the policy has a rule to disable approval. Supports $expand.
     */
    public class GetQueryParameters {
        /** Include count of items */
        @QueryParameter(name = "%24count")
        @javax.annotation.Nullable
        public Boolean count;
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Filter items by property values */
        @QueryParameter(name = "%24filter")
        @javax.annotation.Nullable
        public String filter;
        /** Order items by property values */
        @QueryParameter(name = "%24orderby")
        @javax.annotation.Nullable
        public String[] orderby;
        /** Search items by search phrases */
        @QueryParameter(name = "%24search")
        @javax.annotation.Nullable
        public String search;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
        /** Skip the first n items */
        @QueryParameter(name = "%24skip")
        @javax.annotation.Nullable
        public Integer skip;
        /** Show only the first n items */
        @QueryParameter(name = "%24top")
        @javax.annotation.Nullable
        public Integer top;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
