package com.microsoft.graph.policies;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.PolicyRoot;
import com.microsoft.graph.policies.activitybasedtimeoutpolicies.ActivityBasedTimeoutPoliciesRequestBuilder;
import com.microsoft.graph.policies.adminconsentrequestpolicy.AdminConsentRequestPolicyRequestBuilder;
import com.microsoft.graph.policies.appmanagementpolicies.AppManagementPoliciesRequestBuilder;
import com.microsoft.graph.policies.authenticationflowspolicy.AuthenticationFlowsPolicyRequestBuilder;
import com.microsoft.graph.policies.authenticationmethodspolicy.AuthenticationMethodsPolicyRequestBuilder;
import com.microsoft.graph.policies.authenticationstrengthpolicies.AuthenticationStrengthPoliciesRequestBuilder;
import com.microsoft.graph.policies.authorizationpolicy.AuthorizationPolicyRequestBuilder;
import com.microsoft.graph.policies.claimsmappingpolicies.ClaimsMappingPoliciesRequestBuilder;
import com.microsoft.graph.policies.conditionalaccesspolicies.ConditionalAccessPoliciesRequestBuilder;
import com.microsoft.graph.policies.crosstenantaccesspolicy.CrossTenantAccessPolicyRequestBuilder;
import com.microsoft.graph.policies.defaultappmanagementpolicy.DefaultAppManagementPolicyRequestBuilder;
import com.microsoft.graph.policies.featurerolloutpolicies.FeatureRolloutPoliciesRequestBuilder;
import com.microsoft.graph.policies.homerealmdiscoverypolicies.HomeRealmDiscoveryPoliciesRequestBuilder;
import com.microsoft.graph.policies.identitysecuritydefaultsenforcementpolicy.IdentitySecurityDefaultsEnforcementPolicyRequestBuilder;
import com.microsoft.graph.policies.permissiongrantpolicies.PermissionGrantPoliciesRequestBuilder;
import com.microsoft.graph.policies.rolemanagementpolicies.RoleManagementPoliciesRequestBuilder;
import com.microsoft.graph.policies.rolemanagementpolicyassignments.RoleManagementPolicyAssignmentsRequestBuilder;
import com.microsoft.graph.policies.tokenissuancepolicies.TokenIssuancePoliciesRequestBuilder;
import com.microsoft.graph.policies.tokenlifetimepolicies.TokenLifetimePoliciesRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;

import java.util.HashMap;
import java.util.Objects;
/**
 * Provides operations to manage the policyRoot singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PoliciesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the activityBasedTimeoutPolicies property of the microsoft.graph.policyRoot entity.
     */
    @jakarta.annotation.Nonnull
    public ActivityBasedTimeoutPoliciesRequestBuilder activityBasedTimeoutPolicies() {
        return new ActivityBasedTimeoutPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the adminConsentRequestPolicy property of the microsoft.graph.policyRoot entity.
     */
    @jakarta.annotation.Nonnull
    public AdminConsentRequestPolicyRequestBuilder adminConsentRequestPolicy() {
        return new AdminConsentRequestPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appManagementPolicies property of the microsoft.graph.policyRoot entity.
     */
    @jakarta.annotation.Nonnull
    public AppManagementPoliciesRequestBuilder appManagementPolicies() {
        return new AppManagementPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authenticationFlowsPolicy property of the microsoft.graph.policyRoot entity.
     */
    @jakarta.annotation.Nonnull
    public AuthenticationFlowsPolicyRequestBuilder authenticationFlowsPolicy() {
        return new AuthenticationFlowsPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authenticationMethodsPolicy property of the microsoft.graph.policyRoot entity.
     */
    @jakarta.annotation.Nonnull
    public AuthenticationMethodsPolicyRequestBuilder authenticationMethodsPolicy() {
        return new AuthenticationMethodsPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authenticationStrengthPolicies property of the microsoft.graph.policyRoot entity.
     */
    @jakarta.annotation.Nonnull
    public AuthenticationStrengthPoliciesRequestBuilder authenticationStrengthPolicies() {
        return new AuthenticationStrengthPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authorizationPolicy property of the microsoft.graph.policyRoot entity.
     */
    @jakarta.annotation.Nonnull
    public AuthorizationPolicyRequestBuilder authorizationPolicy() {
        return new AuthorizationPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the claimsMappingPolicies property of the microsoft.graph.policyRoot entity.
     */
    @jakarta.annotation.Nonnull
    public ClaimsMappingPoliciesRequestBuilder claimsMappingPolicies() {
        return new ClaimsMappingPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the conditionalAccessPolicies property of the microsoft.graph.policyRoot entity.
     */
    @jakarta.annotation.Nonnull
    public ConditionalAccessPoliciesRequestBuilder conditionalAccessPolicies() {
        return new ConditionalAccessPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the crossTenantAccessPolicy property of the microsoft.graph.policyRoot entity.
     */
    @jakarta.annotation.Nonnull
    public CrossTenantAccessPolicyRequestBuilder crossTenantAccessPolicy() {
        return new CrossTenantAccessPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the defaultAppManagementPolicy property of the microsoft.graph.policyRoot entity.
     */
    @jakarta.annotation.Nonnull
    public DefaultAppManagementPolicyRequestBuilder defaultAppManagementPolicy() {
        return new DefaultAppManagementPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the featureRolloutPolicies property of the microsoft.graph.policyRoot entity.
     */
    @jakarta.annotation.Nonnull
    public FeatureRolloutPoliciesRequestBuilder featureRolloutPolicies() {
        return new FeatureRolloutPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the homeRealmDiscoveryPolicies property of the microsoft.graph.policyRoot entity.
     */
    @jakarta.annotation.Nonnull
    public HomeRealmDiscoveryPoliciesRequestBuilder homeRealmDiscoveryPolicies() {
        return new HomeRealmDiscoveryPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the identitySecurityDefaultsEnforcementPolicy property of the microsoft.graph.policyRoot entity.
     */
    @jakarta.annotation.Nonnull
    public IdentitySecurityDefaultsEnforcementPolicyRequestBuilder identitySecurityDefaultsEnforcementPolicy() {
        return new IdentitySecurityDefaultsEnforcementPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the permissionGrantPolicies property of the microsoft.graph.policyRoot entity.
     */
    @jakarta.annotation.Nonnull
    public PermissionGrantPoliciesRequestBuilder permissionGrantPolicies() {
        return new PermissionGrantPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleManagementPolicies property of the microsoft.graph.policyRoot entity.
     */
    @jakarta.annotation.Nonnull
    public RoleManagementPoliciesRequestBuilder roleManagementPolicies() {
        return new RoleManagementPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleManagementPolicyAssignments property of the microsoft.graph.policyRoot entity.
     */
    @jakarta.annotation.Nonnull
    public RoleManagementPolicyAssignmentsRequestBuilder roleManagementPolicyAssignments() {
        return new RoleManagementPolicyAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tokenIssuancePolicies property of the microsoft.graph.policyRoot entity.
     */
    @jakarta.annotation.Nonnull
    public TokenIssuancePoliciesRequestBuilder tokenIssuancePolicies() {
        return new TokenIssuancePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tokenLifetimePolicies property of the microsoft.graph.policyRoot entity.
     */
    @jakarta.annotation.Nonnull
    public TokenLifetimePoliciesRequestBuilder tokenLifetimePolicies() {
        return new TokenLifetimePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new PoliciesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PoliciesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new PoliciesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PoliciesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get policies
     * @return a PolicyRoot
     */
    @jakarta.annotation.Nullable
    public PolicyRoot get() {
        return get(null);
    }
    /**
     * Get policies
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a PolicyRoot
     */
    @jakarta.annotation.Nullable
    public PolicyRoot get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PolicyRoot::createFromDiscriminatorValue);
    }
    /**
     * Update policies
     * @param body The request body
     * @return a PolicyRoot
     */
    @jakarta.annotation.Nullable
    public PolicyRoot patch(@jakarta.annotation.Nonnull final PolicyRoot body) {
        return patch(body, null);
    }
    /**
     * Update policies
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a PolicyRoot
     */
    @jakarta.annotation.Nullable
    public PolicyRoot patch(@jakarta.annotation.Nonnull final PolicyRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PolicyRoot::createFromDiscriminatorValue);
    }
    /**
     * Get policies
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get policies
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
     * Update policies
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final PolicyRoot body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update policies
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final PolicyRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a PoliciesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public PoliciesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PoliciesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get policies
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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
