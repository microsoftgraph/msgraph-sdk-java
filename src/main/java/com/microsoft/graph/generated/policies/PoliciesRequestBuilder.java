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
import com.microsoft.graph.policies.deviceregistrationpolicy.DeviceRegistrationPolicyRequestBuilder;
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
 * Provides operations to manage the policyRoot singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PoliciesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the activityBasedTimeoutPolicies property of the microsoft.graph.policyRoot entity.
     * @return a {@link ActivityBasedTimeoutPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ActivityBasedTimeoutPoliciesRequestBuilder activityBasedTimeoutPolicies() {
        return new ActivityBasedTimeoutPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the adminConsentRequestPolicy property of the microsoft.graph.policyRoot entity.
     * @return a {@link AdminConsentRequestPolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdminConsentRequestPolicyRequestBuilder adminConsentRequestPolicy() {
        return new AdminConsentRequestPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appManagementPolicies property of the microsoft.graph.policyRoot entity.
     * @return a {@link AppManagementPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppManagementPoliciesRequestBuilder appManagementPolicies() {
        return new AppManagementPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authenticationFlowsPolicy property of the microsoft.graph.policyRoot entity.
     * @return a {@link AuthenticationFlowsPolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthenticationFlowsPolicyRequestBuilder authenticationFlowsPolicy() {
        return new AuthenticationFlowsPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authenticationMethodsPolicy property of the microsoft.graph.policyRoot entity.
     * @return a {@link AuthenticationMethodsPolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthenticationMethodsPolicyRequestBuilder authenticationMethodsPolicy() {
        return new AuthenticationMethodsPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authenticationStrengthPolicies property of the microsoft.graph.policyRoot entity.
     * @return a {@link AuthenticationStrengthPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthenticationStrengthPoliciesRequestBuilder authenticationStrengthPolicies() {
        return new AuthenticationStrengthPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authorizationPolicy property of the microsoft.graph.policyRoot entity.
     * @return a {@link AuthorizationPolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthorizationPolicyRequestBuilder authorizationPolicy() {
        return new AuthorizationPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the claimsMappingPolicies property of the microsoft.graph.policyRoot entity.
     * @return a {@link ClaimsMappingPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ClaimsMappingPoliciesRequestBuilder claimsMappingPolicies() {
        return new ClaimsMappingPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the conditionalAccessPolicies property of the microsoft.graph.policyRoot entity.
     * @return a {@link ConditionalAccessPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConditionalAccessPoliciesRequestBuilder conditionalAccessPolicies() {
        return new ConditionalAccessPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the crossTenantAccessPolicy property of the microsoft.graph.policyRoot entity.
     * @return a {@link CrossTenantAccessPolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CrossTenantAccessPolicyRequestBuilder crossTenantAccessPolicy() {
        return new CrossTenantAccessPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the defaultAppManagementPolicy property of the microsoft.graph.policyRoot entity.
     * @return a {@link DefaultAppManagementPolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DefaultAppManagementPolicyRequestBuilder defaultAppManagementPolicy() {
        return new DefaultAppManagementPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceRegistrationPolicy property of the microsoft.graph.policyRoot entity.
     * @return a {@link DeviceRegistrationPolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceRegistrationPolicyRequestBuilder deviceRegistrationPolicy() {
        return new DeviceRegistrationPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the featureRolloutPolicies property of the microsoft.graph.policyRoot entity.
     * @return a {@link FeatureRolloutPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FeatureRolloutPoliciesRequestBuilder featureRolloutPolicies() {
        return new FeatureRolloutPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the homeRealmDiscoveryPolicies property of the microsoft.graph.policyRoot entity.
     * @return a {@link HomeRealmDiscoveryPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HomeRealmDiscoveryPoliciesRequestBuilder homeRealmDiscoveryPolicies() {
        return new HomeRealmDiscoveryPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the identitySecurityDefaultsEnforcementPolicy property of the microsoft.graph.policyRoot entity.
     * @return a {@link IdentitySecurityDefaultsEnforcementPolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IdentitySecurityDefaultsEnforcementPolicyRequestBuilder identitySecurityDefaultsEnforcementPolicy() {
        return new IdentitySecurityDefaultsEnforcementPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the permissionGrantPolicies property of the microsoft.graph.policyRoot entity.
     * @return a {@link PermissionGrantPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermissionGrantPoliciesRequestBuilder permissionGrantPolicies() {
        return new PermissionGrantPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleManagementPolicies property of the microsoft.graph.policyRoot entity.
     * @return a {@link RoleManagementPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RoleManagementPoliciesRequestBuilder roleManagementPolicies() {
        return new RoleManagementPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleManagementPolicyAssignments property of the microsoft.graph.policyRoot entity.
     * @return a {@link RoleManagementPolicyAssignmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RoleManagementPolicyAssignmentsRequestBuilder roleManagementPolicyAssignments() {
        return new RoleManagementPolicyAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tokenIssuancePolicies property of the microsoft.graph.policyRoot entity.
     * @return a {@link TokenIssuancePoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TokenIssuancePoliciesRequestBuilder tokenIssuancePolicies() {
        return new TokenIssuancePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tokenLifetimePolicies property of the microsoft.graph.policyRoot entity.
     * @return a {@link TokenLifetimePoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TokenLifetimePoliciesRequestBuilder tokenLifetimePolicies() {
        return new TokenLifetimePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link PoliciesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PoliciesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link PoliciesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PoliciesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get policies
     * @return a {@link PolicyRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public PolicyRoot get() {
        return get(null);
    }
    /**
     * Get policies
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PolicyRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public PolicyRoot get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PolicyRoot::createFromDiscriminatorValue);
    }
    /**
     * Update policies
     * @param body The request body
     * @return a {@link PolicyRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public PolicyRoot patch(@jakarta.annotation.Nonnull final PolicyRoot body) {
        return patch(body, null);
    }
    /**
     * Update policies
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PolicyRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public PolicyRoot patch(@jakarta.annotation.Nonnull final PolicyRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PolicyRoot::createFromDiscriminatorValue);
    }
    /**
     * Get policies
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get policies
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
     * Update policies
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final PolicyRoot body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update policies
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final PolicyRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, "{+baseurl}/policies", pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link PoliciesRequestBuilder}
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
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
