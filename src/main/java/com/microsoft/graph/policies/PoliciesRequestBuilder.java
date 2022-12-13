package com.microsoft.graph.policies;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.PolicyRoot;
import com.microsoft.graph.policies.activitybasedtimeoutpolicies.ActivityBasedTimeoutPoliciesRequestBuilder;
import com.microsoft.graph.policies.activitybasedtimeoutpolicies.item.ActivityBasedTimeoutPolicyItemRequestBuilder;
import com.microsoft.graph.policies.adminconsentrequestpolicy.AdminConsentRequestPolicyRequestBuilder;
import com.microsoft.graph.policies.authenticationflowspolicy.AuthenticationFlowsPolicyRequestBuilder;
import com.microsoft.graph.policies.authenticationmethodspolicy.AuthenticationMethodsPolicyRequestBuilder;
import com.microsoft.graph.policies.authorizationpolicy.AuthorizationPolicyRequestBuilder;
import com.microsoft.graph.policies.claimsmappingpolicies.ClaimsMappingPoliciesRequestBuilder;
import com.microsoft.graph.policies.claimsmappingpolicies.item.ClaimsMappingPolicyItemRequestBuilder;
import com.microsoft.graph.policies.conditionalaccesspolicies.ConditionalAccessPoliciesRequestBuilder;
import com.microsoft.graph.policies.conditionalaccesspolicies.item.ConditionalAccessPolicyItemRequestBuilder;
import com.microsoft.graph.policies.crosstenantaccesspolicy.CrossTenantAccessPolicyRequestBuilder;
import com.microsoft.graph.policies.featurerolloutpolicies.FeatureRolloutPoliciesRequestBuilder;
import com.microsoft.graph.policies.featurerolloutpolicies.item.FeatureRolloutPolicyItemRequestBuilder;
import com.microsoft.graph.policies.homerealmdiscoverypolicies.HomeRealmDiscoveryPoliciesRequestBuilder;
import com.microsoft.graph.policies.homerealmdiscoverypolicies.item.HomeRealmDiscoveryPolicyItemRequestBuilder;
import com.microsoft.graph.policies.identitysecuritydefaultsenforcementpolicy.IdentitySecurityDefaultsEnforcementPolicyRequestBuilder;
import com.microsoft.graph.policies.permissiongrantpolicies.item.PermissionGrantPolicyItemRequestBuilder;
import com.microsoft.graph.policies.permissiongrantpolicies.PermissionGrantPoliciesRequestBuilder;
import com.microsoft.graph.policies.rolemanagementpolicies.item.UnifiedRoleManagementPolicyItemRequestBuilder;
import com.microsoft.graph.policies.rolemanagementpolicies.RoleManagementPoliciesRequestBuilder;
import com.microsoft.graph.policies.rolemanagementpolicyassignments.item.UnifiedRoleManagementPolicyAssignmentItemRequestBuilder;
import com.microsoft.graph.policies.rolemanagementpolicyassignments.RoleManagementPolicyAssignmentsRequestBuilder;
import com.microsoft.graph.policies.tokenissuancepolicies.item.TokenIssuancePolicyItemRequestBuilder;
import com.microsoft.graph.policies.tokenissuancepolicies.TokenIssuancePoliciesRequestBuilder;
import com.microsoft.graph.policies.tokenlifetimepolicies.item.TokenLifetimePolicyItemRequestBuilder;
import com.microsoft.graph.policies.tokenlifetimepolicies.TokenLifetimePoliciesRequestBuilder;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestHeaders;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the policyRoot singleton.
 */
public class PoliciesRequestBuilder {
    /** Provides operations to manage the activityBasedTimeoutPolicies property of the microsoft.graph.policyRoot entity. */
    @javax.annotation.Nonnull
    public ActivityBasedTimeoutPoliciesRequestBuilder activityBasedTimeoutPolicies() {
        return new ActivityBasedTimeoutPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the adminConsentRequestPolicy property of the microsoft.graph.policyRoot entity. */
    @javax.annotation.Nonnull
    public AdminConsentRequestPolicyRequestBuilder adminConsentRequestPolicy() {
        return new AdminConsentRequestPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the authenticationFlowsPolicy property of the microsoft.graph.policyRoot entity. */
    @javax.annotation.Nonnull
    public AuthenticationFlowsPolicyRequestBuilder authenticationFlowsPolicy() {
        return new AuthenticationFlowsPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the authenticationMethodsPolicy property of the microsoft.graph.policyRoot entity. */
    @javax.annotation.Nonnull
    public AuthenticationMethodsPolicyRequestBuilder authenticationMethodsPolicy() {
        return new AuthenticationMethodsPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the authorizationPolicy property of the microsoft.graph.policyRoot entity. */
    @javax.annotation.Nonnull
    public AuthorizationPolicyRequestBuilder authorizationPolicy() {
        return new AuthorizationPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the claimsMappingPolicies property of the microsoft.graph.policyRoot entity. */
    @javax.annotation.Nonnull
    public ClaimsMappingPoliciesRequestBuilder claimsMappingPolicies() {
        return new ClaimsMappingPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the conditionalAccessPolicies property of the microsoft.graph.policyRoot entity. */
    @javax.annotation.Nonnull
    public ConditionalAccessPoliciesRequestBuilder conditionalAccessPolicies() {
        return new ConditionalAccessPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the crossTenantAccessPolicy property of the microsoft.graph.policyRoot entity. */
    @javax.annotation.Nonnull
    public CrossTenantAccessPolicyRequestBuilder crossTenantAccessPolicy() {
        return new CrossTenantAccessPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the featureRolloutPolicies property of the microsoft.graph.policyRoot entity. */
    @javax.annotation.Nonnull
    public FeatureRolloutPoliciesRequestBuilder featureRolloutPolicies() {
        return new FeatureRolloutPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the homeRealmDiscoveryPolicies property of the microsoft.graph.policyRoot entity. */
    @javax.annotation.Nonnull
    public HomeRealmDiscoveryPoliciesRequestBuilder homeRealmDiscoveryPolicies() {
        return new HomeRealmDiscoveryPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the identitySecurityDefaultsEnforcementPolicy property of the microsoft.graph.policyRoot entity. */
    @javax.annotation.Nonnull
    public IdentitySecurityDefaultsEnforcementPolicyRequestBuilder identitySecurityDefaultsEnforcementPolicy() {
        return new IdentitySecurityDefaultsEnforcementPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Provides operations to manage the permissionGrantPolicies property of the microsoft.graph.policyRoot entity. */
    @javax.annotation.Nonnull
    public PermissionGrantPoliciesRequestBuilder permissionGrantPolicies() {
        return new PermissionGrantPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to manage the roleManagementPolicies property of the microsoft.graph.policyRoot entity. */
    @javax.annotation.Nonnull
    public RoleManagementPoliciesRequestBuilder roleManagementPolicies() {
        return new RoleManagementPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the roleManagementPolicyAssignments property of the microsoft.graph.policyRoot entity. */
    @javax.annotation.Nonnull
    public RoleManagementPolicyAssignmentsRequestBuilder roleManagementPolicyAssignments() {
        return new RoleManagementPolicyAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the tokenIssuancePolicies property of the microsoft.graph.policyRoot entity. */
    @javax.annotation.Nonnull
    public TokenIssuancePoliciesRequestBuilder tokenIssuancePolicies() {
        return new TokenIssuancePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the tokenLifetimePolicies property of the microsoft.graph.policyRoot entity. */
    @javax.annotation.Nonnull
    public TokenLifetimePoliciesRequestBuilder tokenLifetimePolicies() {
        return new TokenLifetimePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Provides operations to manage the activityBasedTimeoutPolicies property of the microsoft.graph.policyRoot entity.
     * @param id Unique identifier of the item
     * @return a ActivityBasedTimeoutPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ActivityBasedTimeoutPolicyItemRequestBuilder activityBasedTimeoutPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("activityBasedTimeoutPolicy%2Did", id);
        return new ActivityBasedTimeoutPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the claimsMappingPolicies property of the microsoft.graph.policyRoot entity.
     * @param id Unique identifier of the item
     * @return a ClaimsMappingPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ClaimsMappingPolicyItemRequestBuilder claimsMappingPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("claimsMappingPolicy%2Did", id);
        return new ClaimsMappingPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the conditionalAccessPolicies property of the microsoft.graph.policyRoot entity.
     * @param id Unique identifier of the item
     * @return a ConditionalAccessPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ConditionalAccessPolicyItemRequestBuilder conditionalAccessPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("conditionalAccessPolicy%2Did", id);
        return new ConditionalAccessPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new PoliciesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public PoliciesRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/policies{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new PoliciesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public PoliciesRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/policies{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get policies
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get policies
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Update policies
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final PolicyRoot body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update policies
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final PolicyRoot body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Provides operations to manage the featureRolloutPolicies property of the microsoft.graph.policyRoot entity.
     * @param id Unique identifier of the item
     * @return a FeatureRolloutPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public FeatureRolloutPolicyItemRequestBuilder featureRolloutPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("featureRolloutPolicy%2Did", id);
        return new FeatureRolloutPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get policies
     * @return a CompletableFuture of policyRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PolicyRoot> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, PolicyRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<PolicyRoot> executionException = new java.util.concurrent.CompletableFuture<PolicyRoot>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get policies
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of policyRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PolicyRoot> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, PolicyRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<PolicyRoot> executionException = new java.util.concurrent.CompletableFuture<PolicyRoot>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the homeRealmDiscoveryPolicies property of the microsoft.graph.policyRoot entity.
     * @param id Unique identifier of the item
     * @return a HomeRealmDiscoveryPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public HomeRealmDiscoveryPolicyItemRequestBuilder homeRealmDiscoveryPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("homeRealmDiscoveryPolicy%2Did", id);
        return new HomeRealmDiscoveryPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update policies
     * @param body The request body
     * @return a CompletableFuture of policyRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PolicyRoot> patch(@javax.annotation.Nonnull final PolicyRoot body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, PolicyRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<PolicyRoot> executionException = new java.util.concurrent.CompletableFuture<PolicyRoot>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update policies
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of policyRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PolicyRoot> patch(@javax.annotation.Nonnull final PolicyRoot body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, PolicyRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<PolicyRoot> executionException = new java.util.concurrent.CompletableFuture<PolicyRoot>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the permissionGrantPolicies property of the microsoft.graph.policyRoot entity.
     * @param id Unique identifier of the item
     * @return a PermissionGrantPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PermissionGrantPolicyItemRequestBuilder permissionGrantPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("permissionGrantPolicy%2Did", id);
        return new PermissionGrantPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the roleManagementPolicies property of the microsoft.graph.policyRoot entity.
     * @param id Unique identifier of the item
     * @return a UnifiedRoleManagementPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleManagementPolicyItemRequestBuilder roleManagementPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleManagementPolicy%2Did", id);
        return new UnifiedRoleManagementPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the roleManagementPolicyAssignments property of the microsoft.graph.policyRoot entity.
     * @param id Unique identifier of the item
     * @return a UnifiedRoleManagementPolicyAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleManagementPolicyAssignmentItemRequestBuilder roleManagementPolicyAssignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleManagementPolicyAssignment%2Did", id);
        return new UnifiedRoleManagementPolicyAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the tokenIssuancePolicies property of the microsoft.graph.policyRoot entity.
     * @param id Unique identifier of the item
     * @return a TokenIssuancePolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TokenIssuancePolicyItemRequestBuilder tokenIssuancePolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("tokenIssuancePolicy%2Did", id);
        return new TokenIssuancePolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the tokenLifetimePolicies property of the microsoft.graph.policyRoot entity.
     * @param id Unique identifier of the item
     * @return a TokenLifetimePolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TokenLifetimePolicyItemRequestBuilder tokenLifetimePolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("tokenLifetimePolicy%2Did", id);
        return new TokenLifetimePolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get policies
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
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public RequestHeaders headers = new RequestHeaders();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public RequestHeaders headers = new RequestHeaders();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new PatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public PatchRequestConfiguration() {
        }
    }
}
