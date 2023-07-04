package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class ServicePrincipal extends DirectoryObject implements Parsable {
    /**
     * true if the service principal account is enabled; otherwise, false. If set to false, then no users will be able to sign in to this app, even if they are assigned to it. Supports $filter (eq, ne, not, in).
     */
    private Boolean accountEnabled;
    /**
     * Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services like Microsoft 365 call the application in the context of a document the user is working on.
     */
    private java.util.List<AddIn> addIns;
    /**
     * Used to retrieve service principals by subscription, identify resource group and full resource ids for managed identities. Supports $filter (eq, not, ge, le, startsWith).
     */
    private java.util.List<String> alternativeNames;
    /**
     * The description exposed by the associated application.
     */
    private String appDescription;
    /**
     * The display name exposed by the associated application.
     */
    private String appDisplayName;
    /**
     * The unique identifier for the associated application (its appId property). Supports $filter (eq, ne, not, in, startsWith).
     */
    private String appId;
    /**
     * Unique identifier of the applicationTemplate that the servicePrincipal was created from. Read-only. Supports $filter (eq, ne, NOT, startsWith).
     */
    private String applicationTemplateId;
    /**
     * The appManagementPolicy applied to this application.
     */
    private java.util.List<AppManagementPolicy> appManagementPolicies;
    /**
     * Contains the tenant id where the application is registered. This is applicable only to service principals backed by applications. Supports $filter (eq, ne, NOT, ge, le).
     */
    private UUID appOwnerOrganizationId;
    /**
     * App role assignments for this app or service, granted to users, groups, and other service principals. Supports $expand.
     */
    private java.util.List<AppRoleAssignment> appRoleAssignedTo;
    /**
     * Specifies whether users or other service principals need to be granted an app role assignment for this service principal before users can sign in or apps can get tokens. The default value is false. Not nullable. Supports $filter (eq, ne, NOT).
     */
    private Boolean appRoleAssignmentRequired;
    /**
     * App role assignment for another app or service, granted to this service principal. Supports $expand.
     */
    private java.util.List<AppRoleAssignment> appRoleAssignments;
    /**
     * The roles exposed by the application which this service principal represents. For more information see the appRoles property definition on the application entity. Not nullable.
     */
    private java.util.List<AppRole> appRoles;
    /**
     * The claimsMappingPolicies assigned to this service principal. Supports $expand.
     */
    private java.util.List<ClaimsMappingPolicy> claimsMappingPolicies;
    /**
     * Directory objects created by this service principal. Read-only. Nullable.
     */
    private java.util.List<DirectoryObject> createdObjects;
    /**
     * The delegatedPermissionClassifications property
     */
    private java.util.List<DelegatedPermissionClassification> delegatedPermissionClassifications;
    /**
     * Free text field to provide an internal end-user facing description of the service principal. End-user portals such MyApps will display the application description in this field. The maximum allowed size is 1024 characters. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     */
    private String description;
    /**
     * Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value), NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons may include suspicious, abusive, or malicious activity, or a violation of the Microsoft Services Agreement).  Supports $filter (eq, ne, not).
     */
    private String disabledByMicrosoftStatus;
    /**
     * The display name for the service principal. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     */
    private String displayName;
    /**
     * The endpoints property
     */
    private java.util.List<Endpoint> endpoints;
    /**
     * Federated identities for a specific type of service principal - managed identity. Supports $expand and $filter (/$count eq 0, /$count ne 0).
     */
    private java.util.List<FederatedIdentityCredential> federatedIdentityCredentials;
    /**
     * Home page or landing page of the application.
     */
    private String homepage;
    /**
     * The homeRealmDiscoveryPolicies assigned to this service principal. Supports $expand.
     */
    private java.util.List<HomeRealmDiscoveryPolicy> homeRealmDiscoveryPolicies;
    /**
     * Basic profile information of the acquired application such as app's marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Azure AD apps. Supports $filter (eq, ne, not, ge, le, and eq on null values).
     */
    private InformationalUrl info;
    /**
     * The collection of key credentials associated with the service principal. Not nullable. Supports $filter (eq, not, ge, le).
     */
    private java.util.List<KeyCredential> keyCredentials;
    /**
     * Specifies the URL where the service provider redirects the user to Azure AD to authenticate. Azure AD uses the URL to launch the application from Microsoft 365 or the Azure AD My Apps. When blank, Azure AD performs IdP-initiated sign-on for applications configured with SAML-based single sign-on. The user launches the application from Microsoft 365, the Azure AD My Apps, or the Azure AD SSO URL.
     */
    private String loginUrl;
    /**
     * Specifies the URL that will be used by Microsoft's authorization service to logout an user using OpenId Connect front-channel, back-channel or SAML logout protocols.
     */
    private String logoutUrl;
    /**
     * Roles that this service principal is a member of. HTTP Methods: GET Read-only. Nullable. Supports $expand.
     */
    private java.util.List<DirectoryObject> memberOf;
    /**
     * Free text field to capture information about the service principal, typically used for operational purposes. Maximum allowed size is 1024 characters.
     */
    private String notes;
    /**
     * Specifies the list of email addresses where Azure AD sends a notification when the active certificate is near the expiration date. This is only for the certificates used to sign the SAML token issued for Azure AD Gallery applications.
     */
    private java.util.List<String> notificationEmailAddresses;
    /**
     * Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user. Read-only. Nullable.
     */
    private java.util.List<OAuth2PermissionGrant> oauth2PermissionGrants;
    /**
     * The delegated permissions exposed by the application. For more information see the oauth2PermissionScopes property on the application entity's api property. Not nullable.
     */
    private java.util.List<PermissionScope> oauth2PermissionScopes;
    /**
     * Directory objects that are owned by this service principal. Read-only. Nullable. Supports $expand and $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1).
     */
    private java.util.List<DirectoryObject> ownedObjects;
    /**
     * Directory objects that are owners of this servicePrincipal. The owners are a set of non-admin users or servicePrincipals who are allowed to modify this object. Read-only. Nullable.  Supports $expand and $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1).
     */
    private java.util.List<DirectoryObject> owners;
    /**
     * The collection of password credentials associated with the application. Not nullable.
     */
    private java.util.List<PasswordCredential> passwordCredentials;
    /**
     * Specifies the single sign-on mode configured for this application. Azure AD uses the preferred single sign-on mode to launch the application from Microsoft 365 or the Azure AD My Apps. The supported values are password, saml, notSupported, and oidc.
     */
    private String preferredSingleSignOnMode;
    /**
     * This property can be used on SAML applications (apps that have preferredSingleSignOnMode set to saml) to control which certificate is used to sign the SAML responses. For applications that are not SAML, do not write or otherwise rely on this property.
     */
    private String preferredTokenSigningKeyThumbprint;
    /**
     * The URLs that user tokens are sent to for sign in with the associated application, or the redirect URIs that OAuth 2.0 authorization codes and access tokens are sent to for the associated application. Not nullable.
     */
    private java.util.List<String> replyUrls;
    /**
     * The resource-specific application permissions exposed by this application. Currently, resource-specific permissions are only supported for Teams apps accessing to specific chats and teams using Microsoft Graph. Read-only.
     */
    private java.util.List<ResourceSpecificPermission> resourceSpecificApplicationPermissions;
    /**
     * The collection for settings related to saml single sign-on.
     */
    private SamlSingleSignOnSettings samlSingleSignOnSettings;
    /**
     * Contains the list of identifiersUris, copied over from the associated application. Additional values can be added to hybrid applications. These values can be used to identify the permissions exposed by this app within Azure AD. For example,Client apps can specify a resource URI which is based on the values of this property to acquire an access token, which is the URI returned in the 'aud' claim.The any operator is required for filter expressions on multi-valued properties. Not nullable.  Supports $filter (eq, not, ge, le, startsWith).
     */
    private java.util.List<String> servicePrincipalNames;
    /**
     * Identifies whether the service principal represents an application, a managed identity, or a legacy application. This is set by Azure AD internally. The servicePrincipalType property can be set to three different values: __Application - A service principal that represents an application or service. The appId property identifies the associated app registration, and matches the appId of an application, possibly from a different tenant. If the associated app registration is missing, tokens are not issued for the service principal.__ManagedIdentity - A service principal that represents a managed identity. Service principals representing managed identities can be granted access and permissions, but cannot be updated or modified directly.__Legacy - A service principal that represents an app created before app registrations, or through legacy experiences. Legacy service principal can have credentials, service principal names, reply URLs, and other properties which are editable by an authorized user, but does not have an associated app registration. The appId value does not associate the service principal with an app registration. The service principal can only be used in the tenant where it was created.__SocialIdp - For internal use.
     */
    private String servicePrincipalType;
    /**
     * Specifies the Microsoft accounts that are supported for the current application. Read-only. Supported values are:AzureADMyOrg: Users with a Microsoft work or school account in my organization's Azure AD tenant (single-tenant).AzureADMultipleOrgs: Users with a Microsoft work or school account in any organization's Azure AD tenant (multi-tenant).AzureADandPersonalMicrosoftAccount: Users with a personal Microsoft account, or a work or school account in any organization's Azure AD tenant.PersonalMicrosoftAccount: Users with a personal Microsoft account only.
     */
    private String signInAudience;
    /**
     * The synchronization property
     */
    private Synchronization synchronization;
    /**
     * Custom strings that can be used to categorize and identify the service principal. Not nullable. The value is the union of strings set here and on the associated application entity's tags property.Supports $filter (eq, not, ge, le, startsWith).
     */
    private java.util.List<String> tags;
    /**
     * Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD issues tokens for this application encrypted using the key specified by this property. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     */
    private UUID tokenEncryptionKeyId;
    /**
     * The tokenIssuancePolicies assigned to this service principal.
     */
    private java.util.List<TokenIssuancePolicy> tokenIssuancePolicies;
    /**
     * The tokenLifetimePolicies assigned to this service principal.
     */
    private java.util.List<TokenLifetimePolicy> tokenLifetimePolicies;
    /**
     * The transitiveMemberOf property
     */
    private java.util.List<DirectoryObject> transitiveMemberOf;
    /**
     * Specifies the verified publisher of the application which this service principal represents.
     */
    private VerifiedPublisher verifiedPublisher;
    /**
     * Instantiates a new ServicePrincipal and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServicePrincipal() {
        super();
        this.setOdataType("#microsoft.graph.servicePrincipal");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServicePrincipal
     */
    @javax.annotation.Nonnull
    public static ServicePrincipal createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrincipal();
    }
    /**
     * Gets the accountEnabled property value. true if the service principal account is enabled; otherwise, false. If set to false, then no users will be able to sign in to this app, even if they are assigned to it. Supports $filter (eq, ne, not, in).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAccountEnabled() {
        return this.accountEnabled;
    }
    /**
     * Gets the addIns property value. Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services like Microsoft 365 call the application in the context of a document the user is working on.
     * @return a AddIn
     */
    @javax.annotation.Nullable
    public java.util.List<AddIn> getAddIns() {
        return this.addIns;
    }
    /**
     * Gets the alternativeNames property value. Used to retrieve service principals by subscription, identify resource group and full resource ids for managed identities. Supports $filter (eq, not, ge, le, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAlternativeNames() {
        return this.alternativeNames;
    }
    /**
     * Gets the appDescription property value. The description exposed by the associated application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppDescription() {
        return this.appDescription;
    }
    /**
     * Gets the appDisplayName property value. The display name exposed by the associated application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppDisplayName() {
        return this.appDisplayName;
    }
    /**
     * Gets the appId property value. The unique identifier for the associated application (its appId property). Supports $filter (eq, ne, not, in, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * Gets the applicationTemplateId property value. Unique identifier of the applicationTemplate that the servicePrincipal was created from. Read-only. Supports $filter (eq, ne, NOT, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }
    /**
     * Gets the appManagementPolicies property value. The appManagementPolicy applied to this application.
     * @return a appManagementPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<AppManagementPolicy> getAppManagementPolicies() {
        return this.appManagementPolicies;
    }
    /**
     * Gets the appOwnerOrganizationId property value. Contains the tenant id where the application is registered. This is applicable only to service principals backed by applications. Supports $filter (eq, ne, NOT, ge, le).
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getAppOwnerOrganizationId() {
        return this.appOwnerOrganizationId;
    }
    /**
     * Gets the appRoleAssignedTo property value. App role assignments for this app or service, granted to users, groups, and other service principals. Supports $expand.
     * @return a appRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<AppRoleAssignment> getAppRoleAssignedTo() {
        return this.appRoleAssignedTo;
    }
    /**
     * Gets the appRoleAssignmentRequired property value. Specifies whether users or other service principals need to be granted an app role assignment for this service principal before users can sign in or apps can get tokens. The default value is false. Not nullable. Supports $filter (eq, ne, NOT).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppRoleAssignmentRequired() {
        return this.appRoleAssignmentRequired;
    }
    /**
     * Gets the appRoleAssignments property value. App role assignment for another app or service, granted to this service principal. Supports $expand.
     * @return a appRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<AppRoleAssignment> getAppRoleAssignments() {
        return this.appRoleAssignments;
    }
    /**
     * Gets the appRoles property value. The roles exposed by the application which this service principal represents. For more information see the appRoles property definition on the application entity. Not nullable.
     * @return a AppRole
     */
    @javax.annotation.Nullable
    public java.util.List<AppRole> getAppRoles() {
        return this.appRoles;
    }
    /**
     * Gets the claimsMappingPolicies property value. The claimsMappingPolicies assigned to this service principal. Supports $expand.
     * @return a claimsMappingPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<ClaimsMappingPolicy> getClaimsMappingPolicies() {
        return this.claimsMappingPolicies;
    }
    /**
     * Gets the createdObjects property value. Directory objects created by this service principal. Read-only. Nullable.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getCreatedObjects() {
        return this.createdObjects;
    }
    /**
     * Gets the delegatedPermissionClassifications property value. The delegatedPermissionClassifications property
     * @return a delegatedPermissionClassification
     */
    @javax.annotation.Nullable
    public java.util.List<DelegatedPermissionClassification> getDelegatedPermissionClassifications() {
        return this.delegatedPermissionClassifications;
    }
    /**
     * Gets the description property value. Free text field to provide an internal end-user facing description of the service principal. End-user portals such MyApps will display the application description in this field. The maximum allowed size is 1024 characters. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the disabledByMicrosoftStatus property value. Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value), NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons may include suspicious, abusive, or malicious activity, or a violation of the Microsoft Services Agreement).  Supports $filter (eq, ne, not).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisabledByMicrosoftStatus() {
        return this.disabledByMicrosoftStatus;
    }
    /**
     * Gets the displayName property value. The display name for the service principal. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the endpoints property value. The endpoints property
     * @return a endpoint
     */
    @javax.annotation.Nullable
    public java.util.List<Endpoint> getEndpoints() {
        return this.endpoints;
    }
    /**
     * Gets the federatedIdentityCredentials property value. Federated identities for a specific type of service principal - managed identity. Supports $expand and $filter (/$count eq 0, /$count ne 0).
     * @return a federatedIdentityCredential
     */
    @javax.annotation.Nullable
    public java.util.List<FederatedIdentityCredential> getFederatedIdentityCredentials() {
        return this.federatedIdentityCredentials;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountEnabled", (n) -> { this.setAccountEnabled(n.getBooleanValue()); });
        deserializerMap.put("addIns", (n) -> { this.setAddIns(n.getCollectionOfObjectValues(AddIn::createFromDiscriminatorValue)); });
        deserializerMap.put("alternativeNames", (n) -> { this.setAlternativeNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("appDescription", (n) -> { this.setAppDescription(n.getStringValue()); });
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("applicationTemplateId", (n) -> { this.setApplicationTemplateId(n.getStringValue()); });
        deserializerMap.put("appManagementPolicies", (n) -> { this.setAppManagementPolicies(n.getCollectionOfObjectValues(AppManagementPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("appOwnerOrganizationId", (n) -> { this.setAppOwnerOrganizationId(n.getUUIDValue()); });
        deserializerMap.put("appRoleAssignedTo", (n) -> { this.setAppRoleAssignedTo(n.getCollectionOfObjectValues(AppRoleAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("appRoleAssignmentRequired", (n) -> { this.setAppRoleAssignmentRequired(n.getBooleanValue()); });
        deserializerMap.put("appRoleAssignments", (n) -> { this.setAppRoleAssignments(n.getCollectionOfObjectValues(AppRoleAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("appRoles", (n) -> { this.setAppRoles(n.getCollectionOfObjectValues(AppRole::createFromDiscriminatorValue)); });
        deserializerMap.put("claimsMappingPolicies", (n) -> { this.setClaimsMappingPolicies(n.getCollectionOfObjectValues(ClaimsMappingPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("createdObjects", (n) -> { this.setCreatedObjects(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("delegatedPermissionClassifications", (n) -> { this.setDelegatedPermissionClassifications(n.getCollectionOfObjectValues(DelegatedPermissionClassification::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("disabledByMicrosoftStatus", (n) -> { this.setDisabledByMicrosoftStatus(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("endpoints", (n) -> { this.setEndpoints(n.getCollectionOfObjectValues(Endpoint::createFromDiscriminatorValue)); });
        deserializerMap.put("federatedIdentityCredentials", (n) -> { this.setFederatedIdentityCredentials(n.getCollectionOfObjectValues(FederatedIdentityCredential::createFromDiscriminatorValue)); });
        deserializerMap.put("homepage", (n) -> { this.setHomepage(n.getStringValue()); });
        deserializerMap.put("homeRealmDiscoveryPolicies", (n) -> { this.setHomeRealmDiscoveryPolicies(n.getCollectionOfObjectValues(HomeRealmDiscoveryPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("info", (n) -> { this.setInfo(n.getObjectValue(InformationalUrl::createFromDiscriminatorValue)); });
        deserializerMap.put("keyCredentials", (n) -> { this.setKeyCredentials(n.getCollectionOfObjectValues(KeyCredential::createFromDiscriminatorValue)); });
        deserializerMap.put("loginUrl", (n) -> { this.setLoginUrl(n.getStringValue()); });
        deserializerMap.put("logoutUrl", (n) -> { this.setLogoutUrl(n.getStringValue()); });
        deserializerMap.put("memberOf", (n) -> { this.setMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("notificationEmailAddresses", (n) -> { this.setNotificationEmailAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("oauth2PermissionGrants", (n) -> { this.setOauth2PermissionGrants(n.getCollectionOfObjectValues(OAuth2PermissionGrant::createFromDiscriminatorValue)); });
        deserializerMap.put("oauth2PermissionScopes", (n) -> { this.setOauth2PermissionScopes(n.getCollectionOfObjectValues(PermissionScope::createFromDiscriminatorValue)); });
        deserializerMap.put("ownedObjects", (n) -> { this.setOwnedObjects(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("owners", (n) -> { this.setOwners(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("passwordCredentials", (n) -> { this.setPasswordCredentials(n.getCollectionOfObjectValues(PasswordCredential::createFromDiscriminatorValue)); });
        deserializerMap.put("preferredSingleSignOnMode", (n) -> { this.setPreferredSingleSignOnMode(n.getStringValue()); });
        deserializerMap.put("preferredTokenSigningKeyThumbprint", (n) -> { this.setPreferredTokenSigningKeyThumbprint(n.getStringValue()); });
        deserializerMap.put("replyUrls", (n) -> { this.setReplyUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("resourceSpecificApplicationPermissions", (n) -> { this.setResourceSpecificApplicationPermissions(n.getCollectionOfObjectValues(ResourceSpecificPermission::createFromDiscriminatorValue)); });
        deserializerMap.put("samlSingleSignOnSettings", (n) -> { this.setSamlSingleSignOnSettings(n.getObjectValue(SamlSingleSignOnSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("servicePrincipalNames", (n) -> { this.setServicePrincipalNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("servicePrincipalType", (n) -> { this.setServicePrincipalType(n.getStringValue()); });
        deserializerMap.put("signInAudience", (n) -> { this.setSignInAudience(n.getStringValue()); });
        deserializerMap.put("synchronization", (n) -> { this.setSynchronization(n.getObjectValue(Synchronization::createFromDiscriminatorValue)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tokenEncryptionKeyId", (n) -> { this.setTokenEncryptionKeyId(n.getUUIDValue()); });
        deserializerMap.put("tokenIssuancePolicies", (n) -> { this.setTokenIssuancePolicies(n.getCollectionOfObjectValues(TokenIssuancePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("tokenLifetimePolicies", (n) -> { this.setTokenLifetimePolicies(n.getCollectionOfObjectValues(TokenLifetimePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("transitiveMemberOf", (n) -> { this.setTransitiveMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("verifiedPublisher", (n) -> { this.setVerifiedPublisher(n.getObjectValue(VerifiedPublisher::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the homepage property value. Home page or landing page of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHomepage() {
        return this.homepage;
    }
    /**
     * Gets the homeRealmDiscoveryPolicies property value. The homeRealmDiscoveryPolicies assigned to this service principal. Supports $expand.
     * @return a homeRealmDiscoveryPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<HomeRealmDiscoveryPolicy> getHomeRealmDiscoveryPolicies() {
        return this.homeRealmDiscoveryPolicies;
    }
    /**
     * Gets the info property value. Basic profile information of the acquired application such as app's marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Azure AD apps. Supports $filter (eq, ne, not, ge, le, and eq on null values).
     * @return a informationalUrl
     */
    @javax.annotation.Nullable
    public InformationalUrl getInfo() {
        return this.info;
    }
    /**
     * Gets the keyCredentials property value. The collection of key credentials associated with the service principal. Not nullable. Supports $filter (eq, not, ge, le).
     * @return a KeyCredential
     */
    @javax.annotation.Nullable
    public java.util.List<KeyCredential> getKeyCredentials() {
        return this.keyCredentials;
    }
    /**
     * Gets the loginUrl property value. Specifies the URL where the service provider redirects the user to Azure AD to authenticate. Azure AD uses the URL to launch the application from Microsoft 365 or the Azure AD My Apps. When blank, Azure AD performs IdP-initiated sign-on for applications configured with SAML-based single sign-on. The user launches the application from Microsoft 365, the Azure AD My Apps, or the Azure AD SSO URL.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLoginUrl() {
        return this.loginUrl;
    }
    /**
     * Gets the logoutUrl property value. Specifies the URL that will be used by Microsoft's authorization service to logout an user using OpenId Connect front-channel, back-channel or SAML logout protocols.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLogoutUrl() {
        return this.logoutUrl;
    }
    /**
     * Gets the memberOf property value. Roles that this service principal is a member of. HTTP Methods: GET Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getMemberOf() {
        return this.memberOf;
    }
    /**
     * Gets the notes property value. Free text field to capture information about the service principal, typically used for operational purposes. Maximum allowed size is 1024 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotes() {
        return this.notes;
    }
    /**
     * Gets the notificationEmailAddresses property value. Specifies the list of email addresses where Azure AD sends a notification when the active certificate is near the expiration date. This is only for the certificates used to sign the SAML token issued for Azure AD Gallery applications.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getNotificationEmailAddresses() {
        return this.notificationEmailAddresses;
    }
    /**
     * Gets the oauth2PermissionGrants property value. Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user. Read-only. Nullable.
     * @return a oAuth2PermissionGrant
     */
    @javax.annotation.Nullable
    public java.util.List<OAuth2PermissionGrant> getOauth2PermissionGrants() {
        return this.oauth2PermissionGrants;
    }
    /**
     * Gets the oauth2PermissionScopes property value. The delegated permissions exposed by the application. For more information see the oauth2PermissionScopes property on the application entity's api property. Not nullable.
     * @return a PermissionScope
     */
    @javax.annotation.Nullable
    public java.util.List<PermissionScope> getOauth2PermissionScopes() {
        return this.oauth2PermissionScopes;
    }
    /**
     * Gets the ownedObjects property value. Directory objects that are owned by this service principal. Read-only. Nullable. Supports $expand and $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1).
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getOwnedObjects() {
        return this.ownedObjects;
    }
    /**
     * Gets the owners property value. Directory objects that are owners of this servicePrincipal. The owners are a set of non-admin users or servicePrincipals who are allowed to modify this object. Read-only. Nullable.  Supports $expand and $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1).
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getOwners() {
        return this.owners;
    }
    /**
     * Gets the passwordCredentials property value. The collection of password credentials associated with the application. Not nullable.
     * @return a PasswordCredential
     */
    @javax.annotation.Nullable
    public java.util.List<PasswordCredential> getPasswordCredentials() {
        return this.passwordCredentials;
    }
    /**
     * Gets the preferredSingleSignOnMode property value. Specifies the single sign-on mode configured for this application. Azure AD uses the preferred single sign-on mode to launch the application from Microsoft 365 or the Azure AD My Apps. The supported values are password, saml, notSupported, and oidc.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreferredSingleSignOnMode() {
        return this.preferredSingleSignOnMode;
    }
    /**
     * Gets the preferredTokenSigningKeyThumbprint property value. This property can be used on SAML applications (apps that have preferredSingleSignOnMode set to saml) to control which certificate is used to sign the SAML responses. For applications that are not SAML, do not write or otherwise rely on this property.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreferredTokenSigningKeyThumbprint() {
        return this.preferredTokenSigningKeyThumbprint;
    }
    /**
     * Gets the replyUrls property value. The URLs that user tokens are sent to for sign in with the associated application, or the redirect URIs that OAuth 2.0 authorization codes and access tokens are sent to for the associated application. Not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getReplyUrls() {
        return this.replyUrls;
    }
    /**
     * Gets the resourceSpecificApplicationPermissions property value. The resource-specific application permissions exposed by this application. Currently, resource-specific permissions are only supported for Teams apps accessing to specific chats and teams using Microsoft Graph. Read-only.
     * @return a ResourceSpecificPermission
     */
    @javax.annotation.Nullable
    public java.util.List<ResourceSpecificPermission> getResourceSpecificApplicationPermissions() {
        return this.resourceSpecificApplicationPermissions;
    }
    /**
     * Gets the samlSingleSignOnSettings property value. The collection for settings related to saml single sign-on.
     * @return a samlSingleSignOnSettings
     */
    @javax.annotation.Nullable
    public SamlSingleSignOnSettings getSamlSingleSignOnSettings() {
        return this.samlSingleSignOnSettings;
    }
    /**
     * Gets the servicePrincipalNames property value. Contains the list of identifiersUris, copied over from the associated application. Additional values can be added to hybrid applications. These values can be used to identify the permissions exposed by this app within Azure AD. For example,Client apps can specify a resource URI which is based on the values of this property to acquire an access token, which is the URI returned in the 'aud' claim.The any operator is required for filter expressions on multi-valued properties. Not nullable.  Supports $filter (eq, not, ge, le, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getServicePrincipalNames() {
        return this.servicePrincipalNames;
    }
    /**
     * Gets the servicePrincipalType property value. Identifies whether the service principal represents an application, a managed identity, or a legacy application. This is set by Azure AD internally. The servicePrincipalType property can be set to three different values: __Application - A service principal that represents an application or service. The appId property identifies the associated app registration, and matches the appId of an application, possibly from a different tenant. If the associated app registration is missing, tokens are not issued for the service principal.__ManagedIdentity - A service principal that represents a managed identity. Service principals representing managed identities can be granted access and permissions, but cannot be updated or modified directly.__Legacy - A service principal that represents an app created before app registrations, or through legacy experiences. Legacy service principal can have credentials, service principal names, reply URLs, and other properties which are editable by an authorized user, but does not have an associated app registration. The appId value does not associate the service principal with an app registration. The service principal can only be used in the tenant where it was created.__SocialIdp - For internal use.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePrincipalType() {
        return this.servicePrincipalType;
    }
    /**
     * Gets the signInAudience property value. Specifies the Microsoft accounts that are supported for the current application. Read-only. Supported values are:AzureADMyOrg: Users with a Microsoft work or school account in my organization's Azure AD tenant (single-tenant).AzureADMultipleOrgs: Users with a Microsoft work or school account in any organization's Azure AD tenant (multi-tenant).AzureADandPersonalMicrosoftAccount: Users with a personal Microsoft account, or a work or school account in any organization's Azure AD tenant.PersonalMicrosoftAccount: Users with a personal Microsoft account only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSignInAudience() {
        return this.signInAudience;
    }
    /**
     * Gets the synchronization property value. The synchronization property
     * @return a synchronization
     */
    @javax.annotation.Nullable
    public Synchronization getSynchronization() {
        return this.synchronization;
    }
    /**
     * Gets the tags property value. Custom strings that can be used to categorize and identify the service principal. Not nullable. The value is the union of strings set here and on the associated application entity's tags property.Supports $filter (eq, not, ge, le, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.tags;
    }
    /**
     * Gets the tokenEncryptionKeyId property value. Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD issues tokens for this application encrypted using the key specified by this property. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getTokenEncryptionKeyId() {
        return this.tokenEncryptionKeyId;
    }
    /**
     * Gets the tokenIssuancePolicies property value. The tokenIssuancePolicies assigned to this service principal.
     * @return a tokenIssuancePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<TokenIssuancePolicy> getTokenIssuancePolicies() {
        return this.tokenIssuancePolicies;
    }
    /**
     * Gets the tokenLifetimePolicies property value. The tokenLifetimePolicies assigned to this service principal.
     * @return a tokenLifetimePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<TokenLifetimePolicy> getTokenLifetimePolicies() {
        return this.tokenLifetimePolicies;
    }
    /**
     * Gets the transitiveMemberOf property value. The transitiveMemberOf property
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getTransitiveMemberOf() {
        return this.transitiveMemberOf;
    }
    /**
     * Gets the verifiedPublisher property value. Specifies the verified publisher of the application which this service principal represents.
     * @return a verifiedPublisher
     */
    @javax.annotation.Nullable
    public VerifiedPublisher getVerifiedPublisher() {
        return this.verifiedPublisher;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("accountEnabled", this.getAccountEnabled());
        writer.writeCollectionOfObjectValues("addIns", this.getAddIns());
        writer.writeCollectionOfPrimitiveValues("alternativeNames", this.getAlternativeNames());
        writer.writeStringValue("appDescription", this.getAppDescription());
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("applicationTemplateId", this.getApplicationTemplateId());
        writer.writeCollectionOfObjectValues("appManagementPolicies", this.getAppManagementPolicies());
        writer.writeUUIDValue("appOwnerOrganizationId", this.getAppOwnerOrganizationId());
        writer.writeCollectionOfObjectValues("appRoleAssignedTo", this.getAppRoleAssignedTo());
        writer.writeBooleanValue("appRoleAssignmentRequired", this.getAppRoleAssignmentRequired());
        writer.writeCollectionOfObjectValues("appRoleAssignments", this.getAppRoleAssignments());
        writer.writeCollectionOfObjectValues("appRoles", this.getAppRoles());
        writer.writeCollectionOfObjectValues("claimsMappingPolicies", this.getClaimsMappingPolicies());
        writer.writeCollectionOfObjectValues("createdObjects", this.getCreatedObjects());
        writer.writeCollectionOfObjectValues("delegatedPermissionClassifications", this.getDelegatedPermissionClassifications());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("disabledByMicrosoftStatus", this.getDisabledByMicrosoftStatus());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("endpoints", this.getEndpoints());
        writer.writeCollectionOfObjectValues("federatedIdentityCredentials", this.getFederatedIdentityCredentials());
        writer.writeStringValue("homepage", this.getHomepage());
        writer.writeCollectionOfObjectValues("homeRealmDiscoveryPolicies", this.getHomeRealmDiscoveryPolicies());
        writer.writeObjectValue("info", this.getInfo());
        writer.writeCollectionOfObjectValues("keyCredentials", this.getKeyCredentials());
        writer.writeStringValue("loginUrl", this.getLoginUrl());
        writer.writeStringValue("logoutUrl", this.getLogoutUrl());
        writer.writeCollectionOfObjectValues("memberOf", this.getMemberOf());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeCollectionOfPrimitiveValues("notificationEmailAddresses", this.getNotificationEmailAddresses());
        writer.writeCollectionOfObjectValues("oauth2PermissionGrants", this.getOauth2PermissionGrants());
        writer.writeCollectionOfObjectValues("oauth2PermissionScopes", this.getOauth2PermissionScopes());
        writer.writeCollectionOfObjectValues("ownedObjects", this.getOwnedObjects());
        writer.writeCollectionOfObjectValues("owners", this.getOwners());
        writer.writeCollectionOfObjectValues("passwordCredentials", this.getPasswordCredentials());
        writer.writeStringValue("preferredSingleSignOnMode", this.getPreferredSingleSignOnMode());
        writer.writeStringValue("preferredTokenSigningKeyThumbprint", this.getPreferredTokenSigningKeyThumbprint());
        writer.writeCollectionOfPrimitiveValues("replyUrls", this.getReplyUrls());
        writer.writeCollectionOfObjectValues("resourceSpecificApplicationPermissions", this.getResourceSpecificApplicationPermissions());
        writer.writeObjectValue("samlSingleSignOnSettings", this.getSamlSingleSignOnSettings());
        writer.writeCollectionOfPrimitiveValues("servicePrincipalNames", this.getServicePrincipalNames());
        writer.writeStringValue("servicePrincipalType", this.getServicePrincipalType());
        writer.writeStringValue("signInAudience", this.getSignInAudience());
        writer.writeObjectValue("synchronization", this.getSynchronization());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeUUIDValue("tokenEncryptionKeyId", this.getTokenEncryptionKeyId());
        writer.writeCollectionOfObjectValues("tokenIssuancePolicies", this.getTokenIssuancePolicies());
        writer.writeCollectionOfObjectValues("tokenLifetimePolicies", this.getTokenLifetimePolicies());
        writer.writeCollectionOfObjectValues("transitiveMemberOf", this.getTransitiveMemberOf());
        writer.writeObjectValue("verifiedPublisher", this.getVerifiedPublisher());
    }
    /**
     * Sets the accountEnabled property value. true if the service principal account is enabled; otherwise, false. If set to false, then no users will be able to sign in to this app, even if they are assigned to it. Supports $filter (eq, ne, not, in).
     * @param value Value to set for the accountEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountEnabled(@javax.annotation.Nullable final Boolean value) {
        this.accountEnabled = value;
    }
    /**
     * Sets the addIns property value. Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services like Microsoft 365 call the application in the context of a document the user is working on.
     * @param value Value to set for the addIns property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddIns(@javax.annotation.Nullable final java.util.List<AddIn> value) {
        this.addIns = value;
    }
    /**
     * Sets the alternativeNames property value. Used to retrieve service principals by subscription, identify resource group and full resource ids for managed identities. Supports $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the alternativeNames property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlternativeNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this.alternativeNames = value;
    }
    /**
     * Sets the appDescription property value. The description exposed by the associated application.
     * @param value Value to set for the appDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppDescription(@javax.annotation.Nullable final String value) {
        this.appDescription = value;
    }
    /**
     * Sets the appDisplayName property value. The display name exposed by the associated application.
     * @param value Value to set for the appDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppDisplayName(@javax.annotation.Nullable final String value) {
        this.appDisplayName = value;
    }
    /**
     * Sets the appId property value. The unique identifier for the associated application (its appId property). Supports $filter (eq, ne, not, in, startsWith).
     * @param value Value to set for the appId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppId(@javax.annotation.Nullable final String value) {
        this.appId = value;
    }
    /**
     * Sets the applicationTemplateId property value. Unique identifier of the applicationTemplate that the servicePrincipal was created from. Read-only. Supports $filter (eq, ne, NOT, startsWith).
     * @param value Value to set for the applicationTemplateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationTemplateId(@javax.annotation.Nullable final String value) {
        this.applicationTemplateId = value;
    }
    /**
     * Sets the appManagementPolicies property value. The appManagementPolicy applied to this application.
     * @param value Value to set for the appManagementPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppManagementPolicies(@javax.annotation.Nullable final java.util.List<AppManagementPolicy> value) {
        this.appManagementPolicies = value;
    }
    /**
     * Sets the appOwnerOrganizationId property value. Contains the tenant id where the application is registered. This is applicable only to service principals backed by applications. Supports $filter (eq, ne, NOT, ge, le).
     * @param value Value to set for the appOwnerOrganizationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppOwnerOrganizationId(@javax.annotation.Nullable final UUID value) {
        this.appOwnerOrganizationId = value;
    }
    /**
     * Sets the appRoleAssignedTo property value. App role assignments for this app or service, granted to users, groups, and other service principals. Supports $expand.
     * @param value Value to set for the appRoleAssignedTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppRoleAssignedTo(@javax.annotation.Nullable final java.util.List<AppRoleAssignment> value) {
        this.appRoleAssignedTo = value;
    }
    /**
     * Sets the appRoleAssignmentRequired property value. Specifies whether users or other service principals need to be granted an app role assignment for this service principal before users can sign in or apps can get tokens. The default value is false. Not nullable. Supports $filter (eq, ne, NOT).
     * @param value Value to set for the appRoleAssignmentRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppRoleAssignmentRequired(@javax.annotation.Nullable final Boolean value) {
        this.appRoleAssignmentRequired = value;
    }
    /**
     * Sets the appRoleAssignments property value. App role assignment for another app or service, granted to this service principal. Supports $expand.
     * @param value Value to set for the appRoleAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppRoleAssignments(@javax.annotation.Nullable final java.util.List<AppRoleAssignment> value) {
        this.appRoleAssignments = value;
    }
    /**
     * Sets the appRoles property value. The roles exposed by the application which this service principal represents. For more information see the appRoles property definition on the application entity. Not nullable.
     * @param value Value to set for the appRoles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppRoles(@javax.annotation.Nullable final java.util.List<AppRole> value) {
        this.appRoles = value;
    }
    /**
     * Sets the claimsMappingPolicies property value. The claimsMappingPolicies assigned to this service principal. Supports $expand.
     * @param value Value to set for the claimsMappingPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClaimsMappingPolicies(@javax.annotation.Nullable final java.util.List<ClaimsMappingPolicy> value) {
        this.claimsMappingPolicies = value;
    }
    /**
     * Sets the createdObjects property value. Directory objects created by this service principal. Read-only. Nullable.
     * @param value Value to set for the createdObjects property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedObjects(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.createdObjects = value;
    }
    /**
     * Sets the delegatedPermissionClassifications property value. The delegatedPermissionClassifications property
     * @param value Value to set for the delegatedPermissionClassifications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDelegatedPermissionClassifications(@javax.annotation.Nullable final java.util.List<DelegatedPermissionClassification> value) {
        this.delegatedPermissionClassifications = value;
    }
    /**
     * Sets the description property value. Free text field to provide an internal end-user facing description of the service principal. End-user portals such MyApps will display the application description in this field. The maximum allowed size is 1024 characters. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the disabledByMicrosoftStatus property value. Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value), NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons may include suspicious, abusive, or malicious activity, or a violation of the Microsoft Services Agreement).  Supports $filter (eq, ne, not).
     * @param value Value to set for the disabledByMicrosoftStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisabledByMicrosoftStatus(@javax.annotation.Nullable final String value) {
        this.disabledByMicrosoftStatus = value;
    }
    /**
     * Sets the displayName property value. The display name for the service principal. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the endpoints property value. The endpoints property
     * @param value Value to set for the endpoints property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndpoints(@javax.annotation.Nullable final java.util.List<Endpoint> value) {
        this.endpoints = value;
    }
    /**
     * Sets the federatedIdentityCredentials property value. Federated identities for a specific type of service principal - managed identity. Supports $expand and $filter (/$count eq 0, /$count ne 0).
     * @param value Value to set for the federatedIdentityCredentials property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFederatedIdentityCredentials(@javax.annotation.Nullable final java.util.List<FederatedIdentityCredential> value) {
        this.federatedIdentityCredentials = value;
    }
    /**
     * Sets the homepage property value. Home page or landing page of the application.
     * @param value Value to set for the homepage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHomepage(@javax.annotation.Nullable final String value) {
        this.homepage = value;
    }
    /**
     * Sets the homeRealmDiscoveryPolicies property value. The homeRealmDiscoveryPolicies assigned to this service principal. Supports $expand.
     * @param value Value to set for the homeRealmDiscoveryPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHomeRealmDiscoveryPolicies(@javax.annotation.Nullable final java.util.List<HomeRealmDiscoveryPolicy> value) {
        this.homeRealmDiscoveryPolicies = value;
    }
    /**
     * Sets the info property value. Basic profile information of the acquired application such as app's marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Azure AD apps. Supports $filter (eq, ne, not, ge, le, and eq on null values).
     * @param value Value to set for the info property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInfo(@javax.annotation.Nullable final InformationalUrl value) {
        this.info = value;
    }
    /**
     * Sets the keyCredentials property value. The collection of key credentials associated with the service principal. Not nullable. Supports $filter (eq, not, ge, le).
     * @param value Value to set for the keyCredentials property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeyCredentials(@javax.annotation.Nullable final java.util.List<KeyCredential> value) {
        this.keyCredentials = value;
    }
    /**
     * Sets the loginUrl property value. Specifies the URL where the service provider redirects the user to Azure AD to authenticate. Azure AD uses the URL to launch the application from Microsoft 365 or the Azure AD My Apps. When blank, Azure AD performs IdP-initiated sign-on for applications configured with SAML-based single sign-on. The user launches the application from Microsoft 365, the Azure AD My Apps, or the Azure AD SSO URL.
     * @param value Value to set for the loginUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLoginUrl(@javax.annotation.Nullable final String value) {
        this.loginUrl = value;
    }
    /**
     * Sets the logoutUrl property value. Specifies the URL that will be used by Microsoft's authorization service to logout an user using OpenId Connect front-channel, back-channel or SAML logout protocols.
     * @param value Value to set for the logoutUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogoutUrl(@javax.annotation.Nullable final String value) {
        this.logoutUrl = value;
    }
    /**
     * Sets the memberOf property value. Roles that this service principal is a member of. HTTP Methods: GET Read-only. Nullable. Supports $expand.
     * @param value Value to set for the memberOf property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemberOf(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.memberOf = value;
    }
    /**
     * Sets the notes property value. Free text field to capture information about the service principal, typically used for operational purposes. Maximum allowed size is 1024 characters.
     * @param value Value to set for the notes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotes(@javax.annotation.Nullable final String value) {
        this.notes = value;
    }
    /**
     * Sets the notificationEmailAddresses property value. Specifies the list of email addresses where Azure AD sends a notification when the active certificate is near the expiration date. This is only for the certificates used to sign the SAML token issued for Azure AD Gallery applications.
     * @param value Value to set for the notificationEmailAddresses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationEmailAddresses(@javax.annotation.Nullable final java.util.List<String> value) {
        this.notificationEmailAddresses = value;
    }
    /**
     * Sets the oauth2PermissionGrants property value. Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user. Read-only. Nullable.
     * @param value Value to set for the oauth2PermissionGrants property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOauth2PermissionGrants(@javax.annotation.Nullable final java.util.List<OAuth2PermissionGrant> value) {
        this.oauth2PermissionGrants = value;
    }
    /**
     * Sets the oauth2PermissionScopes property value. The delegated permissions exposed by the application. For more information see the oauth2PermissionScopes property on the application entity's api property. Not nullable.
     * @param value Value to set for the oauth2PermissionScopes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOauth2PermissionScopes(@javax.annotation.Nullable final java.util.List<PermissionScope> value) {
        this.oauth2PermissionScopes = value;
    }
    /**
     * Sets the ownedObjects property value. Directory objects that are owned by this service principal. Read-only. Nullable. Supports $expand and $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1).
     * @param value Value to set for the ownedObjects property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwnedObjects(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.ownedObjects = value;
    }
    /**
     * Sets the owners property value. Directory objects that are owners of this servicePrincipal. The owners are a set of non-admin users or servicePrincipals who are allowed to modify this object. Read-only. Nullable.  Supports $expand and $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1).
     * @param value Value to set for the owners property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwners(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.owners = value;
    }
    /**
     * Sets the passwordCredentials property value. The collection of password credentials associated with the application. Not nullable.
     * @param value Value to set for the passwordCredentials property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordCredentials(@javax.annotation.Nullable final java.util.List<PasswordCredential> value) {
        this.passwordCredentials = value;
    }
    /**
     * Sets the preferredSingleSignOnMode property value. Specifies the single sign-on mode configured for this application. Azure AD uses the preferred single sign-on mode to launch the application from Microsoft 365 or the Azure AD My Apps. The supported values are password, saml, notSupported, and oidc.
     * @param value Value to set for the preferredSingleSignOnMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreferredSingleSignOnMode(@javax.annotation.Nullable final String value) {
        this.preferredSingleSignOnMode = value;
    }
    /**
     * Sets the preferredTokenSigningKeyThumbprint property value. This property can be used on SAML applications (apps that have preferredSingleSignOnMode set to saml) to control which certificate is used to sign the SAML responses. For applications that are not SAML, do not write or otherwise rely on this property.
     * @param value Value to set for the preferredTokenSigningKeyThumbprint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreferredTokenSigningKeyThumbprint(@javax.annotation.Nullable final String value) {
        this.preferredTokenSigningKeyThumbprint = value;
    }
    /**
     * Sets the replyUrls property value. The URLs that user tokens are sent to for sign in with the associated application, or the redirect URIs that OAuth 2.0 authorization codes and access tokens are sent to for the associated application. Not nullable.
     * @param value Value to set for the replyUrls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReplyUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this.replyUrls = value;
    }
    /**
     * Sets the resourceSpecificApplicationPermissions property value. The resource-specific application permissions exposed by this application. Currently, resource-specific permissions are only supported for Teams apps accessing to specific chats and teams using Microsoft Graph. Read-only.
     * @param value Value to set for the resourceSpecificApplicationPermissions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceSpecificApplicationPermissions(@javax.annotation.Nullable final java.util.List<ResourceSpecificPermission> value) {
        this.resourceSpecificApplicationPermissions = value;
    }
    /**
     * Sets the samlSingleSignOnSettings property value. The collection for settings related to saml single sign-on.
     * @param value Value to set for the samlSingleSignOnSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSamlSingleSignOnSettings(@javax.annotation.Nullable final SamlSingleSignOnSettings value) {
        this.samlSingleSignOnSettings = value;
    }
    /**
     * Sets the servicePrincipalNames property value. Contains the list of identifiersUris, copied over from the associated application. Additional values can be added to hybrid applications. These values can be used to identify the permissions exposed by this app within Azure AD. For example,Client apps can specify a resource URI which is based on the values of this property to acquire an access token, which is the URI returned in the 'aud' claim.The any operator is required for filter expressions on multi-valued properties. Not nullable.  Supports $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the servicePrincipalNames property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePrincipalNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this.servicePrincipalNames = value;
    }
    /**
     * Sets the servicePrincipalType property value. Identifies whether the service principal represents an application, a managed identity, or a legacy application. This is set by Azure AD internally. The servicePrincipalType property can be set to three different values: __Application - A service principal that represents an application or service. The appId property identifies the associated app registration, and matches the appId of an application, possibly from a different tenant. If the associated app registration is missing, tokens are not issued for the service principal.__ManagedIdentity - A service principal that represents a managed identity. Service principals representing managed identities can be granted access and permissions, but cannot be updated or modified directly.__Legacy - A service principal that represents an app created before app registrations, or through legacy experiences. Legacy service principal can have credentials, service principal names, reply URLs, and other properties which are editable by an authorized user, but does not have an associated app registration. The appId value does not associate the service principal with an app registration. The service principal can only be used in the tenant where it was created.__SocialIdp - For internal use.
     * @param value Value to set for the servicePrincipalType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePrincipalType(@javax.annotation.Nullable final String value) {
        this.servicePrincipalType = value;
    }
    /**
     * Sets the signInAudience property value. Specifies the Microsoft accounts that are supported for the current application. Read-only. Supported values are:AzureADMyOrg: Users with a Microsoft work or school account in my organization's Azure AD tenant (single-tenant).AzureADMultipleOrgs: Users with a Microsoft work or school account in any organization's Azure AD tenant (multi-tenant).AzureADandPersonalMicrosoftAccount: Users with a personal Microsoft account, or a work or school account in any organization's Azure AD tenant.PersonalMicrosoftAccount: Users with a personal Microsoft account only.
     * @param value Value to set for the signInAudience property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignInAudience(@javax.annotation.Nullable final String value) {
        this.signInAudience = value;
    }
    /**
     * Sets the synchronization property value. The synchronization property
     * @param value Value to set for the synchronization property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSynchronization(@javax.annotation.Nullable final Synchronization value) {
        this.synchronization = value;
    }
    /**
     * Sets the tags property value. Custom strings that can be used to categorize and identify the service principal. Not nullable. The value is the union of strings set here and on the associated application entity's tags property.Supports $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the tags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this.tags = value;
    }
    /**
     * Sets the tokenEncryptionKeyId property value. Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD issues tokens for this application encrypted using the key specified by this property. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     * @param value Value to set for the tokenEncryptionKeyId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTokenEncryptionKeyId(@javax.annotation.Nullable final UUID value) {
        this.tokenEncryptionKeyId = value;
    }
    /**
     * Sets the tokenIssuancePolicies property value. The tokenIssuancePolicies assigned to this service principal.
     * @param value Value to set for the tokenIssuancePolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTokenIssuancePolicies(@javax.annotation.Nullable final java.util.List<TokenIssuancePolicy> value) {
        this.tokenIssuancePolicies = value;
    }
    /**
     * Sets the tokenLifetimePolicies property value. The tokenLifetimePolicies assigned to this service principal.
     * @param value Value to set for the tokenLifetimePolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTokenLifetimePolicies(@javax.annotation.Nullable final java.util.List<TokenLifetimePolicy> value) {
        this.tokenLifetimePolicies = value;
    }
    /**
     * Sets the transitiveMemberOf property value. The transitiveMemberOf property
     * @param value Value to set for the transitiveMemberOf property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTransitiveMemberOf(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.transitiveMemberOf = value;
    }
    /**
     * Sets the verifiedPublisher property value. Specifies the verified publisher of the application which this service principal represents.
     * @param value Value to set for the verifiedPublisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVerifiedPublisher(@javax.annotation.Nullable final VerifiedPublisher value) {
        this.verifiedPublisher = value;
    }
}
