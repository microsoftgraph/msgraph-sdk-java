package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PolicyRoot extends Entity implements Parsable {
    /**
     * The policy that controls the idle time out for web sessions for applications.
     */
    private java.util.List<ActivityBasedTimeoutPolicy> activityBasedTimeoutPolicies;
    /**
     * The policy by which consent requests are created and managed for the entire tenant.
     */
    private AdminConsentRequestPolicy adminConsentRequestPolicy;
    /**
     * The policies that enforce app management restrictions for specific applications and service principals, overriding the defaultAppManagementPolicy.
     */
    private java.util.List<AppManagementPolicy> appManagementPolicies;
    /**
     * The policy configuration of the self-service sign-up experience of external users.
     */
    private AuthenticationFlowsPolicy authenticationFlowsPolicy;
    /**
     * The authentication methods and the users that are allowed to use them to sign in and perform multifactor authentication (MFA) in Azure Active Directory (Azure AD).
     */
    private AuthenticationMethodsPolicy authenticationMethodsPolicy;
    /**
     * The authentication method combinations that are to be used in scenarios defined by Azure AD Conditional Access.
     */
    private java.util.List<AuthenticationStrengthPolicy> authenticationStrengthPolicies;
    /**
     * The policy that controls Azure AD authorization settings.
     */
    private AuthorizationPolicy authorizationPolicy;
    /**
     * The claim-mapping policies for WS-Fed, SAML, OAuth 2.0, and OpenID Connect protocols, for tokens issued to a specific application.
     */
    private java.util.List<ClaimsMappingPolicy> claimsMappingPolicies;
    /**
     * The custom rules that define an access scenario.
     */
    private java.util.List<ConditionalAccessPolicy> conditionalAccessPolicies;
    /**
     * The custom rules that define an access scenario when interacting with external Azure AD tenants.
     */
    private CrossTenantAccessPolicy crossTenantAccessPolicy;
    /**
     * The tenant-wide policy that enforces app management restrictions for all applications and service principals.
     */
    private TenantAppManagementPolicy defaultAppManagementPolicy;
    /**
     * The feature rollout policy associated with a directory object.
     */
    private java.util.List<FeatureRolloutPolicy> featureRolloutPolicies;
    /**
     * The policy to control Azure AD authentication behavior for federated users.
     */
    private java.util.List<HomeRealmDiscoveryPolicy> homeRealmDiscoveryPolicies;
    /**
     * The policy that represents the security defaults that protect against common attacks.
     */
    private IdentitySecurityDefaultsEnforcementPolicy identitySecurityDefaultsEnforcementPolicy;
    /**
     * The policy that specifies the conditions under which consent can be granted.
     */
    private java.util.List<PermissionGrantPolicy> permissionGrantPolicies;
    /**
     * Specifies the various policies associated with scopes and roles.
     */
    private java.util.List<UnifiedRoleManagementPolicy> roleManagementPolicies;
    /**
     * The assignment of a role management policy to a role definition object.
     */
    private java.util.List<UnifiedRoleManagementPolicyAssignment> roleManagementPolicyAssignments;
    /**
     * The policy that specifies the characteristics of SAML tokens issued by Azure AD.
     */
    private java.util.List<TokenIssuancePolicy> tokenIssuancePolicies;
    /**
     * The policy that controls the lifetime of a JWT access token, an ID token, or a SAML 1.1/2.0 token issued by Azure AD.
     */
    private java.util.List<TokenLifetimePolicy> tokenLifetimePolicies;
    /**
     * Instantiates a new policyRoot and sets the default values.
     */
    public PolicyRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a policyRoot
     */
    @jakarta.annotation.Nonnull
    public static PolicyRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicyRoot();
    }
    /**
     * Gets the activityBasedTimeoutPolicies property value. The policy that controls the idle time out for web sessions for applications.
     * @return a activityBasedTimeoutPolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<ActivityBasedTimeoutPolicy> getActivityBasedTimeoutPolicies() {
        return this.activityBasedTimeoutPolicies;
    }
    /**
     * Gets the adminConsentRequestPolicy property value. The policy by which consent requests are created and managed for the entire tenant.
     * @return a adminConsentRequestPolicy
     */
    @jakarta.annotation.Nullable
    public AdminConsentRequestPolicy getAdminConsentRequestPolicy() {
        return this.adminConsentRequestPolicy;
    }
    /**
     * Gets the appManagementPolicies property value. The policies that enforce app management restrictions for specific applications and service principals, overriding the defaultAppManagementPolicy.
     * @return a appManagementPolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppManagementPolicy> getAppManagementPolicies() {
        return this.appManagementPolicies;
    }
    /**
     * Gets the authenticationFlowsPolicy property value. The policy configuration of the self-service sign-up experience of external users.
     * @return a authenticationFlowsPolicy
     */
    @jakarta.annotation.Nullable
    public AuthenticationFlowsPolicy getAuthenticationFlowsPolicy() {
        return this.authenticationFlowsPolicy;
    }
    /**
     * Gets the authenticationMethodsPolicy property value. The authentication methods and the users that are allowed to use them to sign in and perform multifactor authentication (MFA) in Azure Active Directory (Azure AD).
     * @return a authenticationMethodsPolicy
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodsPolicy getAuthenticationMethodsPolicy() {
        return this.authenticationMethodsPolicy;
    }
    /**
     * Gets the authenticationStrengthPolicies property value. The authentication method combinations that are to be used in scenarios defined by Azure AD Conditional Access.
     * @return a authenticationStrengthPolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationStrengthPolicy> getAuthenticationStrengthPolicies() {
        return this.authenticationStrengthPolicies;
    }
    /**
     * Gets the authorizationPolicy property value. The policy that controls Azure AD authorization settings.
     * @return a authorizationPolicy
     */
    @jakarta.annotation.Nullable
    public AuthorizationPolicy getAuthorizationPolicy() {
        return this.authorizationPolicy;
    }
    /**
     * Gets the claimsMappingPolicies property value. The claim-mapping policies for WS-Fed, SAML, OAuth 2.0, and OpenID Connect protocols, for tokens issued to a specific application.
     * @return a claimsMappingPolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<ClaimsMappingPolicy> getClaimsMappingPolicies() {
        return this.claimsMappingPolicies;
    }
    /**
     * Gets the conditionalAccessPolicies property value. The custom rules that define an access scenario.
     * @return a conditionalAccessPolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConditionalAccessPolicy> getConditionalAccessPolicies() {
        return this.conditionalAccessPolicies;
    }
    /**
     * Gets the crossTenantAccessPolicy property value. The custom rules that define an access scenario when interacting with external Azure AD tenants.
     * @return a crossTenantAccessPolicy
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicy getCrossTenantAccessPolicy() {
        return this.crossTenantAccessPolicy;
    }
    /**
     * Gets the defaultAppManagementPolicy property value. The tenant-wide policy that enforces app management restrictions for all applications and service principals.
     * @return a tenantAppManagementPolicy
     */
    @jakarta.annotation.Nullable
    public TenantAppManagementPolicy getDefaultAppManagementPolicy() {
        return this.defaultAppManagementPolicy;
    }
    /**
     * Gets the featureRolloutPolicies property value. The feature rollout policy associated with a directory object.
     * @return a featureRolloutPolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<FeatureRolloutPolicy> getFeatureRolloutPolicies() {
        return this.featureRolloutPolicies;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activityBasedTimeoutPolicies", (n) -> { this.setActivityBasedTimeoutPolicies(n.getCollectionOfObjectValues(ActivityBasedTimeoutPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("adminConsentRequestPolicy", (n) -> { this.setAdminConsentRequestPolicy(n.getObjectValue(AdminConsentRequestPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("appManagementPolicies", (n) -> { this.setAppManagementPolicies(n.getCollectionOfObjectValues(AppManagementPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationFlowsPolicy", (n) -> { this.setAuthenticationFlowsPolicy(n.getObjectValue(AuthenticationFlowsPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationMethodsPolicy", (n) -> { this.setAuthenticationMethodsPolicy(n.getObjectValue(AuthenticationMethodsPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationStrengthPolicies", (n) -> { this.setAuthenticationStrengthPolicies(n.getCollectionOfObjectValues(AuthenticationStrengthPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("authorizationPolicy", (n) -> { this.setAuthorizationPolicy(n.getObjectValue(AuthorizationPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("claimsMappingPolicies", (n) -> { this.setClaimsMappingPolicies(n.getCollectionOfObjectValues(ClaimsMappingPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("conditionalAccessPolicies", (n) -> { this.setConditionalAccessPolicies(n.getCollectionOfObjectValues(ConditionalAccessPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("crossTenantAccessPolicy", (n) -> { this.setCrossTenantAccessPolicy(n.getObjectValue(CrossTenantAccessPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultAppManagementPolicy", (n) -> { this.setDefaultAppManagementPolicy(n.getObjectValue(TenantAppManagementPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("featureRolloutPolicies", (n) -> { this.setFeatureRolloutPolicies(n.getCollectionOfObjectValues(FeatureRolloutPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("homeRealmDiscoveryPolicies", (n) -> { this.setHomeRealmDiscoveryPolicies(n.getCollectionOfObjectValues(HomeRealmDiscoveryPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("identitySecurityDefaultsEnforcementPolicy", (n) -> { this.setIdentitySecurityDefaultsEnforcementPolicy(n.getObjectValue(IdentitySecurityDefaultsEnforcementPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("permissionGrantPolicies", (n) -> { this.setPermissionGrantPolicies(n.getCollectionOfObjectValues(PermissionGrantPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("roleManagementPolicies", (n) -> { this.setRoleManagementPolicies(n.getCollectionOfObjectValues(UnifiedRoleManagementPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("roleManagementPolicyAssignments", (n) -> { this.setRoleManagementPolicyAssignments(n.getCollectionOfObjectValues(UnifiedRoleManagementPolicyAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("tokenIssuancePolicies", (n) -> { this.setTokenIssuancePolicies(n.getCollectionOfObjectValues(TokenIssuancePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("tokenLifetimePolicies", (n) -> { this.setTokenLifetimePolicies(n.getCollectionOfObjectValues(TokenLifetimePolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the homeRealmDiscoveryPolicies property value. The policy to control Azure AD authentication behavior for federated users.
     * @return a homeRealmDiscoveryPolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<HomeRealmDiscoveryPolicy> getHomeRealmDiscoveryPolicies() {
        return this.homeRealmDiscoveryPolicies;
    }
    /**
     * Gets the identitySecurityDefaultsEnforcementPolicy property value. The policy that represents the security defaults that protect against common attacks.
     * @return a identitySecurityDefaultsEnforcementPolicy
     */
    @jakarta.annotation.Nullable
    public IdentitySecurityDefaultsEnforcementPolicy getIdentitySecurityDefaultsEnforcementPolicy() {
        return this.identitySecurityDefaultsEnforcementPolicy;
    }
    /**
     * Gets the permissionGrantPolicies property value. The policy that specifies the conditions under which consent can be granted.
     * @return a permissionGrantPolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<PermissionGrantPolicy> getPermissionGrantPolicies() {
        return this.permissionGrantPolicies;
    }
    /**
     * Gets the roleManagementPolicies property value. Specifies the various policies associated with scopes and roles.
     * @return a unifiedRoleManagementPolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleManagementPolicy> getRoleManagementPolicies() {
        return this.roleManagementPolicies;
    }
    /**
     * Gets the roleManagementPolicyAssignments property value. The assignment of a role management policy to a role definition object.
     * @return a unifiedRoleManagementPolicyAssignment
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleManagementPolicyAssignment> getRoleManagementPolicyAssignments() {
        return this.roleManagementPolicyAssignments;
    }
    /**
     * Gets the tokenIssuancePolicies property value. The policy that specifies the characteristics of SAML tokens issued by Azure AD.
     * @return a tokenIssuancePolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<TokenIssuancePolicy> getTokenIssuancePolicies() {
        return this.tokenIssuancePolicies;
    }
    /**
     * Gets the tokenLifetimePolicies property value. The policy that controls the lifetime of a JWT access token, an ID token, or a SAML 1.1/2.0 token issued by Azure AD.
     * @return a tokenLifetimePolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<TokenLifetimePolicy> getTokenLifetimePolicies() {
        return this.tokenLifetimePolicies;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("activityBasedTimeoutPolicies", this.getActivityBasedTimeoutPolicies());
        writer.writeObjectValue("adminConsentRequestPolicy", this.getAdminConsentRequestPolicy());
        writer.writeCollectionOfObjectValues("appManagementPolicies", this.getAppManagementPolicies());
        writer.writeObjectValue("authenticationFlowsPolicy", this.getAuthenticationFlowsPolicy());
        writer.writeObjectValue("authenticationMethodsPolicy", this.getAuthenticationMethodsPolicy());
        writer.writeCollectionOfObjectValues("authenticationStrengthPolicies", this.getAuthenticationStrengthPolicies());
        writer.writeObjectValue("authorizationPolicy", this.getAuthorizationPolicy());
        writer.writeCollectionOfObjectValues("claimsMappingPolicies", this.getClaimsMappingPolicies());
        writer.writeCollectionOfObjectValues("conditionalAccessPolicies", this.getConditionalAccessPolicies());
        writer.writeObjectValue("crossTenantAccessPolicy", this.getCrossTenantAccessPolicy());
        writer.writeObjectValue("defaultAppManagementPolicy", this.getDefaultAppManagementPolicy());
        writer.writeCollectionOfObjectValues("featureRolloutPolicies", this.getFeatureRolloutPolicies());
        writer.writeCollectionOfObjectValues("homeRealmDiscoveryPolicies", this.getHomeRealmDiscoveryPolicies());
        writer.writeObjectValue("identitySecurityDefaultsEnforcementPolicy", this.getIdentitySecurityDefaultsEnforcementPolicy());
        writer.writeCollectionOfObjectValues("permissionGrantPolicies", this.getPermissionGrantPolicies());
        writer.writeCollectionOfObjectValues("roleManagementPolicies", this.getRoleManagementPolicies());
        writer.writeCollectionOfObjectValues("roleManagementPolicyAssignments", this.getRoleManagementPolicyAssignments());
        writer.writeCollectionOfObjectValues("tokenIssuancePolicies", this.getTokenIssuancePolicies());
        writer.writeCollectionOfObjectValues("tokenLifetimePolicies", this.getTokenLifetimePolicies());
    }
    /**
     * Sets the activityBasedTimeoutPolicies property value. The policy that controls the idle time out for web sessions for applications.
     * @param value Value to set for the activityBasedTimeoutPolicies property.
     */
    public void setActivityBasedTimeoutPolicies(@jakarta.annotation.Nullable final java.util.List<ActivityBasedTimeoutPolicy> value) {
        this.activityBasedTimeoutPolicies = value;
    }
    /**
     * Sets the adminConsentRequestPolicy property value. The policy by which consent requests are created and managed for the entire tenant.
     * @param value Value to set for the adminConsentRequestPolicy property.
     */
    public void setAdminConsentRequestPolicy(@jakarta.annotation.Nullable final AdminConsentRequestPolicy value) {
        this.adminConsentRequestPolicy = value;
    }
    /**
     * Sets the appManagementPolicies property value. The policies that enforce app management restrictions for specific applications and service principals, overriding the defaultAppManagementPolicy.
     * @param value Value to set for the appManagementPolicies property.
     */
    public void setAppManagementPolicies(@jakarta.annotation.Nullable final java.util.List<AppManagementPolicy> value) {
        this.appManagementPolicies = value;
    }
    /**
     * Sets the authenticationFlowsPolicy property value. The policy configuration of the self-service sign-up experience of external users.
     * @param value Value to set for the authenticationFlowsPolicy property.
     */
    public void setAuthenticationFlowsPolicy(@jakarta.annotation.Nullable final AuthenticationFlowsPolicy value) {
        this.authenticationFlowsPolicy = value;
    }
    /**
     * Sets the authenticationMethodsPolicy property value. The authentication methods and the users that are allowed to use them to sign in and perform multifactor authentication (MFA) in Azure Active Directory (Azure AD).
     * @param value Value to set for the authenticationMethodsPolicy property.
     */
    public void setAuthenticationMethodsPolicy(@jakarta.annotation.Nullable final AuthenticationMethodsPolicy value) {
        this.authenticationMethodsPolicy = value;
    }
    /**
     * Sets the authenticationStrengthPolicies property value. The authentication method combinations that are to be used in scenarios defined by Azure AD Conditional Access.
     * @param value Value to set for the authenticationStrengthPolicies property.
     */
    public void setAuthenticationStrengthPolicies(@jakarta.annotation.Nullable final java.util.List<AuthenticationStrengthPolicy> value) {
        this.authenticationStrengthPolicies = value;
    }
    /**
     * Sets the authorizationPolicy property value. The policy that controls Azure AD authorization settings.
     * @param value Value to set for the authorizationPolicy property.
     */
    public void setAuthorizationPolicy(@jakarta.annotation.Nullable final AuthorizationPolicy value) {
        this.authorizationPolicy = value;
    }
    /**
     * Sets the claimsMappingPolicies property value. The claim-mapping policies for WS-Fed, SAML, OAuth 2.0, and OpenID Connect protocols, for tokens issued to a specific application.
     * @param value Value to set for the claimsMappingPolicies property.
     */
    public void setClaimsMappingPolicies(@jakarta.annotation.Nullable final java.util.List<ClaimsMappingPolicy> value) {
        this.claimsMappingPolicies = value;
    }
    /**
     * Sets the conditionalAccessPolicies property value. The custom rules that define an access scenario.
     * @param value Value to set for the conditionalAccessPolicies property.
     */
    public void setConditionalAccessPolicies(@jakarta.annotation.Nullable final java.util.List<ConditionalAccessPolicy> value) {
        this.conditionalAccessPolicies = value;
    }
    /**
     * Sets the crossTenantAccessPolicy property value. The custom rules that define an access scenario when interacting with external Azure AD tenants.
     * @param value Value to set for the crossTenantAccessPolicy property.
     */
    public void setCrossTenantAccessPolicy(@jakarta.annotation.Nullable final CrossTenantAccessPolicy value) {
        this.crossTenantAccessPolicy = value;
    }
    /**
     * Sets the defaultAppManagementPolicy property value. The tenant-wide policy that enforces app management restrictions for all applications and service principals.
     * @param value Value to set for the defaultAppManagementPolicy property.
     */
    public void setDefaultAppManagementPolicy(@jakarta.annotation.Nullable final TenantAppManagementPolicy value) {
        this.defaultAppManagementPolicy = value;
    }
    /**
     * Sets the featureRolloutPolicies property value. The feature rollout policy associated with a directory object.
     * @param value Value to set for the featureRolloutPolicies property.
     */
    public void setFeatureRolloutPolicies(@jakarta.annotation.Nullable final java.util.List<FeatureRolloutPolicy> value) {
        this.featureRolloutPolicies = value;
    }
    /**
     * Sets the homeRealmDiscoveryPolicies property value. The policy to control Azure AD authentication behavior for federated users.
     * @param value Value to set for the homeRealmDiscoveryPolicies property.
     */
    public void setHomeRealmDiscoveryPolicies(@jakarta.annotation.Nullable final java.util.List<HomeRealmDiscoveryPolicy> value) {
        this.homeRealmDiscoveryPolicies = value;
    }
    /**
     * Sets the identitySecurityDefaultsEnforcementPolicy property value. The policy that represents the security defaults that protect against common attacks.
     * @param value Value to set for the identitySecurityDefaultsEnforcementPolicy property.
     */
    public void setIdentitySecurityDefaultsEnforcementPolicy(@jakarta.annotation.Nullable final IdentitySecurityDefaultsEnforcementPolicy value) {
        this.identitySecurityDefaultsEnforcementPolicy = value;
    }
    /**
     * Sets the permissionGrantPolicies property value. The policy that specifies the conditions under which consent can be granted.
     * @param value Value to set for the permissionGrantPolicies property.
     */
    public void setPermissionGrantPolicies(@jakarta.annotation.Nullable final java.util.List<PermissionGrantPolicy> value) {
        this.permissionGrantPolicies = value;
    }
    /**
     * Sets the roleManagementPolicies property value. Specifies the various policies associated with scopes and roles.
     * @param value Value to set for the roleManagementPolicies property.
     */
    public void setRoleManagementPolicies(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleManagementPolicy> value) {
        this.roleManagementPolicies = value;
    }
    /**
     * Sets the roleManagementPolicyAssignments property value. The assignment of a role management policy to a role definition object.
     * @param value Value to set for the roleManagementPolicyAssignments property.
     */
    public void setRoleManagementPolicyAssignments(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleManagementPolicyAssignment> value) {
        this.roleManagementPolicyAssignments = value;
    }
    /**
     * Sets the tokenIssuancePolicies property value. The policy that specifies the characteristics of SAML tokens issued by Azure AD.
     * @param value Value to set for the tokenIssuancePolicies property.
     */
    public void setTokenIssuancePolicies(@jakarta.annotation.Nullable final java.util.List<TokenIssuancePolicy> value) {
        this.tokenIssuancePolicies = value;
    }
    /**
     * Sets the tokenLifetimePolicies property value. The policy that controls the lifetime of a JWT access token, an ID token, or a SAML 1.1/2.0 token issued by Azure AD.
     * @param value Value to set for the tokenLifetimePolicies property.
     */
    public void setTokenLifetimePolicies(@jakarta.annotation.Nullable final java.util.List<TokenLifetimePolicy> value) {
        this.tokenLifetimePolicies = value;
    }
}
