package com.microsoft.graph.policies.rolemanagementpolicyassignments.item.policy;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.UnifiedRoleManagementPolicy;
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
 * Provides operations to manage the policy property of the microsoft.graph.unifiedRoleManagementPolicyAssignment entity.
 */
public class PolicyRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new PolicyRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public PolicyRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies/roleManagementPolicyAssignments/{unifiedRoleManagementPolicyAssignment%2Did}/policy{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new PolicyRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public PolicyRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies/roleManagementPolicyAssignments/{unifiedRoleManagementPolicyAssignment%2Did}/policy{?%24select,%24expand}", rawUrl);
    }
    /**
     * The policy that's associated with a policy assignment. Supports $expand and a nested $expand of the rules and effectiveRules relationships for the policy.
     * @return a CompletableFuture of unifiedRoleManagementPolicy
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleManagementPolicy> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleManagementPolicy::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UnifiedRoleManagementPolicy> executionException = new java.util.concurrent.CompletableFuture<UnifiedRoleManagementPolicy>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * The policy that's associated with a policy assignment. Supports $expand and a nested $expand of the rules and effectiveRules relationships for the policy.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of unifiedRoleManagementPolicy
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleManagementPolicy> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleManagementPolicy::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UnifiedRoleManagementPolicy> executionException = new java.util.concurrent.CompletableFuture<UnifiedRoleManagementPolicy>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * The policy that's associated with a policy assignment. Supports $expand and a nested $expand of the rules and effectiveRules relationships for the policy.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * The policy that's associated with a policy assignment. Supports $expand and a nested $expand of the rules and effectiveRules relationships for the policy.
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
     * The policy that's associated with a policy assignment. Supports $expand and a nested $expand of the rules and effectiveRules relationships for the policy.
     */
    public class GetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
