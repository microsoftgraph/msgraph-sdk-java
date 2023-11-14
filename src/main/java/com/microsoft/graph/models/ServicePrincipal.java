package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
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
     * The unique identifier for the associated application (its appId property). Alternate key. Supports $filter (eq, ne, not, in, startsWith).
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
     * An open complex type that holds the value of a custom security attribute that is assigned to a directory object. Nullable. Returned only on $select. Supports $filter (eq, ne, not, startsWith). Filter value is case sensitive.
     */
    private CustomSecurityAttributeValue customSecurityAttributes;
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
     * The display name for the service principal. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderby.
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
     * Basic profile information of the acquired application such as app's marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Microsoft Entra apps. Supports $filter (eq, ne, not, ge, le, and eq on null values).
     */
    private InformationalUrl info;
    /**
     * The collection of key credentials associated with the service principal. Not nullable. Supports $filter (eq, not, ge, le).
     */
    private java.util.List<KeyCredential> keyCredentials;
    /**
     * Specifies the URL where the service provider redirects the user to Microsoft Entra ID to authenticate. Microsoft Entra ID uses the URL to launch the application from Microsoft 365 or the Microsoft Entra My Apps. When blank, Microsoft Entra ID performs IdP-initiated sign-on for applications configured with SAML-based single sign-on. The user launches the application from Microsoft 365, the Microsoft Entra My Apps, or the Microsoft Entra SSO URL.
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
     * Specifies the list of email addresses where Microsoft Entra ID sends a notification when the active certificate is near the expiration date. This is only for the certificates used to sign the SAML token issued for Microsoft Entra Gallery applications.
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
     * Directory objects that are owned by this service principal. Read-only. Nullable. Supports $expand, $select nested in $expand, and $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1).
     */
    private java.util.List<DirectoryObject> ownedObjects;
    /**
     * Directory objects that are owners of this servicePrincipal. The owners are a set of non-admin users or servicePrincipals who are allowed to modify this object. Read-only. Nullable. Supports $expand, $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1), and $select nested in $expand.
     */
    private java.util.List<DirectoryObject> owners;
    /**
     * The collection of password credentials associated with the application. Not nullable.
     */
    private java.util.List<PasswordCredential> passwordCredentials;
    /**
     * Specifies the single sign-on mode configured for this application. Microsoft Entra ID uses the preferred single sign-on mode to launch the application from Microsoft 365 or the My Apps portal. The supported values are password, saml, notSupported, and oidc.
     */
    private String preferredSingleSignOnMode;
    /**
     * This property can be used on SAML applications (apps that have preferredSingleSignOnMode set to saml) to control which certificate is used to sign the SAML responses. For applications that are not SAML, do not write or otherwise rely on this property.
     */
    private String preferredTokenSigningKeyThumbprint;
    /**
     * The remoteDesktopSecurityConfiguration object applied to this service principal. Supports $filter (eq) for isRemoteDesktopProtocolEnabled property.
     */
    private RemoteDesktopSecurityConfiguration remoteDesktopSecurityConfiguration;
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
     * Contains the list of identifiersUris, copied over from the associated application. Additional values can be added to hybrid applications. These values can be used to identify the permissions exposed by this app within Microsoft Entra ID. For example,Client apps can specify a resource URI which is based on the values of this property to acquire an access token, which is the URI returned in the 'aud' claim.The any operator is required for filter expressions on multi-valued properties. Not nullable.  Supports $filter (eq, not, ge, le, startsWith).
     */
    private java.util.List<String> servicePrincipalNames;
    /**
     * Identifies whether the service principal represents an application, a managed identity, or a legacy application. This is set by Microsoft Entra ID internally. The servicePrincipalType property can be set to three different values: Application - A service principal that represents an application or service. The appId property identifies the associated app registration, and matches the appId of an application, possibly from a different tenant. If the associated app registration is missing, tokens are not issued for the service principal.ManagedIdentity - A service principal that represents a managed identity. Service principals representing managed identities can be granted access and permissions, but cannot be updated or modified directly.Legacy - A service principal that represents an app created before app registrations, or through legacy experiences. Legacy service principal can have credentials, service principal names, reply URLs, and other properties which are editable by an authorized user, but does not have an associated app registration. The appId value does not associate the service principal with an app registration. The service principal can only be used in the tenant where it was created.SocialIdp - For internal use.
     */
    private String servicePrincipalType;
    /**
     * Specifies the Microsoft accounts that are supported for the current application. Read-only. Supported values are:AzureADMyOrg: Users with a Microsoft work or school account in my organization's Microsoft Entra tenant (single-tenant).AzureADMultipleOrgs: Users with a Microsoft work or school account in any organization's Microsoft Entra tenant (multi-tenant).AzureADandPersonalMicrosoftAccount: Users with a personal Microsoft account, or a work or school account in any organization's Microsoft Entra tenant.PersonalMicrosoftAccount: Users with a personal Microsoft account only.
     */
    private String signInAudience;
    /**
     * Represents the capability for Microsoft Entra identity synchronization through the Microsoft Graph API.
     */
    private Synchronization synchronization;
    /**
     * Custom strings that can be used to categorize and identify the service principal. Not nullable. The value is the union of strings set here and on the associated application entity's tags property.Supports $filter (eq, not, ge, le, startsWith).
     */
    private java.util.List<String> tags;
    /**
     * Specifies the keyId of a public key from the keyCredentials collection. When configured, Microsoft Entra ID issues tokens for this application encrypted using the key specified by this property. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
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
     */
    public ServicePrincipal() {
        super();
        this.setOdataType("#microsoft.graph.servicePrincipal");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServicePrincipal
     */
    @jakarta.annotation.Nonnull
    public static ServicePrincipal createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrincipal();
    }
    /**
     * Gets the accountEnabled property value. true if the service principal account is enabled; otherwise, false. If set to false, then no users will be able to sign in to this app, even if they are assigned to it. Supports $filter (eq, ne, not, in).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAccountEnabled() {
        return this.accountEnabled;
    }
    /**
     * Gets the addIns property value. Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services like Microsoft 365 call the application in the context of a document the user is working on.
     * @return a java.util.List<AddIn>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AddIn> getAddIns() {
        return this.addIns;
    }
    /**
     * Gets the alternativeNames property value. Used to retrieve service principals by subscription, identify resource group and full resource ids for managed identities. Supports $filter (eq, not, ge, le, startsWith).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAlternativeNames() {
        return this.alternativeNames;
    }
    /**
     * Gets the appDescription property value. The description exposed by the associated application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppDescription() {
        return this.appDescription;
    }
    /**
     * Gets the appDisplayName property value. The display name exposed by the associated application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppDisplayName() {
        return this.appDisplayName;
    }
    /**
     * Gets the appId property value. The unique identifier for the associated application (its appId property). Alternate key. Supports $filter (eq, ne, not, in, startsWith).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * Gets the applicationTemplateId property value. Unique identifier of the applicationTemplate that the servicePrincipal was created from. Read-only. Supports $filter (eq, ne, NOT, startsWith).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }
    /**
     * Gets the appManagementPolicies property value. The appManagementPolicy applied to this application.
     * @return a java.util.List<AppManagementPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppManagementPolicy> getAppManagementPolicies() {
        return this.appManagementPolicies;
    }
    /**
     * Gets the appOwnerOrganizationId property value. Contains the tenant id where the application is registered. This is applicable only to service principals backed by applications. Supports $filter (eq, ne, NOT, ge, le).
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getAppOwnerOrganizationId() {
        return this.appOwnerOrganizationId;
    }
    /**
     * Gets the appRoleAssignedTo property value. App role assignments for this app or service, granted to users, groups, and other service principals. Supports $expand.
     * @return a java.util.List<AppRoleAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppRoleAssignment> getAppRoleAssignedTo() {
        return this.appRoleAssignedTo;
    }
    /**
     * Gets the appRoleAssignmentRequired property value. Specifies whether users or other service principals need to be granted an app role assignment for this service principal before users can sign in or apps can get tokens. The default value is false. Not nullable. Supports $filter (eq, ne, NOT).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppRoleAssignmentRequired() {
        return this.appRoleAssignmentRequired;
    }
    /**
     * Gets the appRoleAssignments property value. App role assignment for another app or service, granted to this service principal. Supports $expand.
     * @return a java.util.List<AppRoleAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppRoleAssignment> getAppRoleAssignments() {
        return this.appRoleAssignments;
    }
    /**
     * Gets the appRoles property value. The roles exposed by the application which this service principal represents. For more information see the appRoles property definition on the application entity. Not nullable.
     * @return a java.util.List<AppRole>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppRole> getAppRoles() {
        return this.appRoles;
    }
    /**
     * Gets the claimsMappingPolicies property value. The claimsMappingPolicies assigned to this service principal. Supports $expand.
     * @return a java.util.List<ClaimsMappingPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ClaimsMappingPolicy> getClaimsMappingPolicies() {
        return this.claimsMappingPolicies;
    }
    /**
     * Gets the createdObjects property value. Directory objects created by this service principal. Read-only. Nullable.
     * @return a java.util.List<DirectoryObject>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getCreatedObjects() {
        return this.createdObjects;
    }
    /**
     * Gets the customSecurityAttributes property value. An open complex type that holds the value of a custom security attribute that is assigned to a directory object. Nullable. Returned only on $select. Supports $filter (eq, ne, not, startsWith). Filter value is case sensitive.
     * @return a CustomSecurityAttributeValue
     */
    @jakarta.annotation.Nullable
    public CustomSecurityAttributeValue getCustomSecurityAttributes() {
        return this.customSecurityAttributes;
    }
    /**
     * Gets the delegatedPermissionClassifications property value. The delegatedPermissionClassifications property
     * @return a java.util.List<DelegatedPermissionClassification>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DelegatedPermissionClassification> getDelegatedPermissionClassifications() {
        return this.delegatedPermissionClassifications;
    }
    /**
     * Gets the description property value. Free text field to provide an internal end-user facing description of the service principal. End-user portals such MyApps will display the application description in this field. The maximum allowed size is 1024 characters. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the disabledByMicrosoftStatus property value. Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value), NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons may include suspicious, abusive, or malicious activity, or a violation of the Microsoft Services Agreement).  Supports $filter (eq, ne, not).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisabledByMicrosoftStatus() {
        return this.disabledByMicrosoftStatus;
    }
    /**
     * Gets the displayName property value. The display name for the service principal. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderby.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the endpoints property value. The endpoints property
     * @return a java.util.List<Endpoint>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Endpoint> getEndpoints() {
        return this.endpoints;
    }
    /**
     * Gets the federatedIdentityCredentials property value. Federated identities for a specific type of service principal - managed identity. Supports $expand and $filter (/$count eq 0, /$count ne 0).
     * @return a java.util.List<FederatedIdentityCredential>
     */
    @jakarta.annotation.Nullable
    public java.util.List<FederatedIdentityCredential> getFederatedIdentityCredentials() {
        return this.federatedIdentityCredentials;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
        deserializerMap.put("customSecurityAttributes", (n) -> { this.setCustomSecurityAttributes(n.getObjectValue(CustomSecurityAttributeValue::createFromDiscriminatorValue)); });
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
        deserializerMap.put("remoteDesktopSecurityConfiguration", (n) -> { this.setRemoteDesktopSecurityConfiguration(n.getObjectValue(RemoteDesktopSecurityConfiguration::createFromDiscriminatorValue)); });
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHomepage() {
        return this.homepage;
    }
    /**
     * Gets the homeRealmDiscoveryPolicies property value. The homeRealmDiscoveryPolicies assigned to this service principal. Supports $expand.
     * @return a java.util.List<HomeRealmDiscoveryPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<HomeRealmDiscoveryPolicy> getHomeRealmDiscoveryPolicies() {
        return this.homeRealmDiscoveryPolicies;
    }
    /**
     * Gets the info property value. Basic profile information of the acquired application such as app's marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Microsoft Entra apps. Supports $filter (eq, ne, not, ge, le, and eq on null values).
     * @return a InformationalUrl
     */
    @jakarta.annotation.Nullable
    public InformationalUrl getInfo() {
        return this.info;
    }
    /**
     * Gets the keyCredentials property value. The collection of key credentials associated with the service principal. Not nullable. Supports $filter (eq, not, ge, le).
     * @return a java.util.List<KeyCredential>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyCredential> getKeyCredentials() {
        return this.keyCredentials;
    }
    /**
     * Gets the loginUrl property value. Specifies the URL where the service provider redirects the user to Microsoft Entra ID to authenticate. Microsoft Entra ID uses the URL to launch the application from Microsoft 365 or the Microsoft Entra My Apps. When blank, Microsoft Entra ID performs IdP-initiated sign-on for applications configured with SAML-based single sign-on. The user launches the application from Microsoft 365, the Microsoft Entra My Apps, or the Microsoft Entra SSO URL.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLoginUrl() {
        return this.loginUrl;
    }
    /**
     * Gets the logoutUrl property value. Specifies the URL that will be used by Microsoft's authorization service to logout an user using OpenId Connect front-channel, back-channel or SAML logout protocols.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLogoutUrl() {
        return this.logoutUrl;
    }
    /**
     * Gets the memberOf property value. Roles that this service principal is a member of. HTTP Methods: GET Read-only. Nullable. Supports $expand.
     * @return a java.util.List<DirectoryObject>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getMemberOf() {
        return this.memberOf;
    }
    /**
     * Gets the notes property value. Free text field to capture information about the service principal, typically used for operational purposes. Maximum allowed size is 1024 characters.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.notes;
    }
    /**
     * Gets the notificationEmailAddresses property value. Specifies the list of email addresses where Microsoft Entra ID sends a notification when the active certificate is near the expiration date. This is only for the certificates used to sign the SAML token issued for Microsoft Entra Gallery applications.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNotificationEmailAddresses() {
        return this.notificationEmailAddresses;
    }
    /**
     * Gets the oauth2PermissionGrants property value. Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user. Read-only. Nullable.
     * @return a java.util.List<OAuth2PermissionGrant>
     */
    @jakarta.annotation.Nullable
    public java.util.List<OAuth2PermissionGrant> getOauth2PermissionGrants() {
        return this.oauth2PermissionGrants;
    }
    /**
     * Gets the oauth2PermissionScopes property value. The delegated permissions exposed by the application. For more information see the oauth2PermissionScopes property on the application entity's api property. Not nullable.
     * @return a java.util.List<PermissionScope>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PermissionScope> getOauth2PermissionScopes() {
        return this.oauth2PermissionScopes;
    }
    /**
     * Gets the ownedObjects property value. Directory objects that are owned by this service principal. Read-only. Nullable. Supports $expand, $select nested in $expand, and $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1).
     * @return a java.util.List<DirectoryObject>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getOwnedObjects() {
        return this.ownedObjects;
    }
    /**
     * Gets the owners property value. Directory objects that are owners of this servicePrincipal. The owners are a set of non-admin users or servicePrincipals who are allowed to modify this object. Read-only. Nullable. Supports $expand, $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1), and $select nested in $expand.
     * @return a java.util.List<DirectoryObject>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getOwners() {
        return this.owners;
    }
    /**
     * Gets the passwordCredentials property value. The collection of password credentials associated with the application. Not nullable.
     * @return a java.util.List<PasswordCredential>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PasswordCredential> getPasswordCredentials() {
        return this.passwordCredentials;
    }
    /**
     * Gets the preferredSingleSignOnMode property value. Specifies the single sign-on mode configured for this application. Microsoft Entra ID uses the preferred single sign-on mode to launch the application from Microsoft 365 or the My Apps portal. The supported values are password, saml, notSupported, and oidc.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPreferredSingleSignOnMode() {
        return this.preferredSingleSignOnMode;
    }
    /**
     * Gets the preferredTokenSigningKeyThumbprint property value. This property can be used on SAML applications (apps that have preferredSingleSignOnMode set to saml) to control which certificate is used to sign the SAML responses. For applications that are not SAML, do not write or otherwise rely on this property.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPreferredTokenSigningKeyThumbprint() {
        return this.preferredTokenSigningKeyThumbprint;
    }
    /**
     * Gets the remoteDesktopSecurityConfiguration property value. The remoteDesktopSecurityConfiguration object applied to this service principal. Supports $filter (eq) for isRemoteDesktopProtocolEnabled property.
     * @return a RemoteDesktopSecurityConfiguration
     */
    @jakarta.annotation.Nullable
    public RemoteDesktopSecurityConfiguration getRemoteDesktopSecurityConfiguration() {
        return this.remoteDesktopSecurityConfiguration;
    }
    /**
     * Gets the replyUrls property value. The URLs that user tokens are sent to for sign in with the associated application, or the redirect URIs that OAuth 2.0 authorization codes and access tokens are sent to for the associated application. Not nullable.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getReplyUrls() {
        return this.replyUrls;
    }
    /**
     * Gets the resourceSpecificApplicationPermissions property value. The resource-specific application permissions exposed by this application. Currently, resource-specific permissions are only supported for Teams apps accessing to specific chats and teams using Microsoft Graph. Read-only.
     * @return a java.util.List<ResourceSpecificPermission>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ResourceSpecificPermission> getResourceSpecificApplicationPermissions() {
        return this.resourceSpecificApplicationPermissions;
    }
    /**
     * Gets the samlSingleSignOnSettings property value. The collection for settings related to saml single sign-on.
     * @return a SamlSingleSignOnSettings
     */
    @jakarta.annotation.Nullable
    public SamlSingleSignOnSettings getSamlSingleSignOnSettings() {
        return this.samlSingleSignOnSettings;
    }
    /**
     * Gets the servicePrincipalNames property value. Contains the list of identifiersUris, copied over from the associated application. Additional values can be added to hybrid applications. These values can be used to identify the permissions exposed by this app within Microsoft Entra ID. For example,Client apps can specify a resource URI which is based on the values of this property to acquire an access token, which is the URI returned in the 'aud' claim.The any operator is required for filter expressions on multi-valued properties. Not nullable.  Supports $filter (eq, not, ge, le, startsWith).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getServicePrincipalNames() {
        return this.servicePrincipalNames;
    }
    /**
     * Gets the servicePrincipalType property value. Identifies whether the service principal represents an application, a managed identity, or a legacy application. This is set by Microsoft Entra ID internally. The servicePrincipalType property can be set to three different values: Application - A service principal that represents an application or service. The appId property identifies the associated app registration, and matches the appId of an application, possibly from a different tenant. If the associated app registration is missing, tokens are not issued for the service principal.ManagedIdentity - A service principal that represents a managed identity. Service principals representing managed identities can be granted access and permissions, but cannot be updated or modified directly.Legacy - A service principal that represents an app created before app registrations, or through legacy experiences. Legacy service principal can have credentials, service principal names, reply URLs, and other properties which are editable by an authorized user, but does not have an associated app registration. The appId value does not associate the service principal with an app registration. The service principal can only be used in the tenant where it was created.SocialIdp - For internal use.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServicePrincipalType() {
        return this.servicePrincipalType;
    }
    /**
     * Gets the signInAudience property value. Specifies the Microsoft accounts that are supported for the current application. Read-only. Supported values are:AzureADMyOrg: Users with a Microsoft work or school account in my organization's Microsoft Entra tenant (single-tenant).AzureADMultipleOrgs: Users with a Microsoft work or school account in any organization's Microsoft Entra tenant (multi-tenant).AzureADandPersonalMicrosoftAccount: Users with a personal Microsoft account, or a work or school account in any organization's Microsoft Entra tenant.PersonalMicrosoftAccount: Users with a personal Microsoft account only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSignInAudience() {
        return this.signInAudience;
    }
    /**
     * Gets the synchronization property value. Represents the capability for Microsoft Entra identity synchronization through the Microsoft Graph API.
     * @return a Synchronization
     */
    @jakarta.annotation.Nullable
    public Synchronization getSynchronization() {
        return this.synchronization;
    }
    /**
     * Gets the tags property value. Custom strings that can be used to categorize and identify the service principal. Not nullable. The value is the union of strings set here and on the associated application entity's tags property.Supports $filter (eq, not, ge, le, startsWith).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.tags;
    }
    /**
     * Gets the tokenEncryptionKeyId property value. Specifies the keyId of a public key from the keyCredentials collection. When configured, Microsoft Entra ID issues tokens for this application encrypted using the key specified by this property. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getTokenEncryptionKeyId() {
        return this.tokenEncryptionKeyId;
    }
    /**
     * Gets the tokenIssuancePolicies property value. The tokenIssuancePolicies assigned to this service principal.
     * @return a java.util.List<TokenIssuancePolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TokenIssuancePolicy> getTokenIssuancePolicies() {
        return this.tokenIssuancePolicies;
    }
    /**
     * Gets the tokenLifetimePolicies property value. The tokenLifetimePolicies assigned to this service principal.
     * @return a java.util.List<TokenLifetimePolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TokenLifetimePolicy> getTokenLifetimePolicies() {
        return this.tokenLifetimePolicies;
    }
    /**
     * Gets the transitiveMemberOf property value. The transitiveMemberOf property
     * @return a java.util.List<DirectoryObject>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getTransitiveMemberOf() {
        return this.transitiveMemberOf;
    }
    /**
     * Gets the verifiedPublisher property value. Specifies the verified publisher of the application which this service principal represents.
     * @return a VerifiedPublisher
     */
    @jakarta.annotation.Nullable
    public VerifiedPublisher getVerifiedPublisher() {
        return this.verifiedPublisher;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeObjectValue("customSecurityAttributes", this.getCustomSecurityAttributes());
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
        writer.writeObjectValue("remoteDesktopSecurityConfiguration", this.getRemoteDesktopSecurityConfiguration());
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
     */
    public void setAccountEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.accountEnabled = value;
    }
    /**
     * Sets the addIns property value. Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services like Microsoft 365 call the application in the context of a document the user is working on.
     * @param value Value to set for the addIns property.
     */
    public void setAddIns(@jakarta.annotation.Nullable final java.util.List<AddIn> value) {
        this.addIns = value;
    }
    /**
     * Sets the alternativeNames property value. Used to retrieve service principals by subscription, identify resource group and full resource ids for managed identities. Supports $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the alternativeNames property.
     */
    public void setAlternativeNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.alternativeNames = value;
    }
    /**
     * Sets the appDescription property value. The description exposed by the associated application.
     * @param value Value to set for the appDescription property.
     */
    public void setAppDescription(@jakarta.annotation.Nullable final String value) {
        this.appDescription = value;
    }
    /**
     * Sets the appDisplayName property value. The display name exposed by the associated application.
     * @param value Value to set for the appDisplayName property.
     */
    public void setAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.appDisplayName = value;
    }
    /**
     * Sets the appId property value. The unique identifier for the associated application (its appId property). Alternate key. Supports $filter (eq, ne, not, in, startsWith).
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.appId = value;
    }
    /**
     * Sets the applicationTemplateId property value. Unique identifier of the applicationTemplate that the servicePrincipal was created from. Read-only. Supports $filter (eq, ne, NOT, startsWith).
     * @param value Value to set for the applicationTemplateId property.
     */
    public void setApplicationTemplateId(@jakarta.annotation.Nullable final String value) {
        this.applicationTemplateId = value;
    }
    /**
     * Sets the appManagementPolicies property value. The appManagementPolicy applied to this application.
     * @param value Value to set for the appManagementPolicies property.
     */
    public void setAppManagementPolicies(@jakarta.annotation.Nullable final java.util.List<AppManagementPolicy> value) {
        this.appManagementPolicies = value;
    }
    /**
     * Sets the appOwnerOrganizationId property value. Contains the tenant id where the application is registered. This is applicable only to service principals backed by applications. Supports $filter (eq, ne, NOT, ge, le).
     * @param value Value to set for the appOwnerOrganizationId property.
     */
    public void setAppOwnerOrganizationId(@jakarta.annotation.Nullable final UUID value) {
        this.appOwnerOrganizationId = value;
    }
    /**
     * Sets the appRoleAssignedTo property value. App role assignments for this app or service, granted to users, groups, and other service principals. Supports $expand.
     * @param value Value to set for the appRoleAssignedTo property.
     */
    public void setAppRoleAssignedTo(@jakarta.annotation.Nullable final java.util.List<AppRoleAssignment> value) {
        this.appRoleAssignedTo = value;
    }
    /**
     * Sets the appRoleAssignmentRequired property value. Specifies whether users or other service principals need to be granted an app role assignment for this service principal before users can sign in or apps can get tokens. The default value is false. Not nullable. Supports $filter (eq, ne, NOT).
     * @param value Value to set for the appRoleAssignmentRequired property.
     */
    public void setAppRoleAssignmentRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.appRoleAssignmentRequired = value;
    }
    /**
     * Sets the appRoleAssignments property value. App role assignment for another app or service, granted to this service principal. Supports $expand.
     * @param value Value to set for the appRoleAssignments property.
     */
    public void setAppRoleAssignments(@jakarta.annotation.Nullable final java.util.List<AppRoleAssignment> value) {
        this.appRoleAssignments = value;
    }
    /**
     * Sets the appRoles property value. The roles exposed by the application which this service principal represents. For more information see the appRoles property definition on the application entity. Not nullable.
     * @param value Value to set for the appRoles property.
     */
    public void setAppRoles(@jakarta.annotation.Nullable final java.util.List<AppRole> value) {
        this.appRoles = value;
    }
    /**
     * Sets the claimsMappingPolicies property value. The claimsMappingPolicies assigned to this service principal. Supports $expand.
     * @param value Value to set for the claimsMappingPolicies property.
     */
    public void setClaimsMappingPolicies(@jakarta.annotation.Nullable final java.util.List<ClaimsMappingPolicy> value) {
        this.claimsMappingPolicies = value;
    }
    /**
     * Sets the createdObjects property value. Directory objects created by this service principal. Read-only. Nullable.
     * @param value Value to set for the createdObjects property.
     */
    public void setCreatedObjects(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.createdObjects = value;
    }
    /**
     * Sets the customSecurityAttributes property value. An open complex type that holds the value of a custom security attribute that is assigned to a directory object. Nullable. Returned only on $select. Supports $filter (eq, ne, not, startsWith). Filter value is case sensitive.
     * @param value Value to set for the customSecurityAttributes property.
     */
    public void setCustomSecurityAttributes(@jakarta.annotation.Nullable final CustomSecurityAttributeValue value) {
        this.customSecurityAttributes = value;
    }
    /**
     * Sets the delegatedPermissionClassifications property value. The delegatedPermissionClassifications property
     * @param value Value to set for the delegatedPermissionClassifications property.
     */
    public void setDelegatedPermissionClassifications(@jakarta.annotation.Nullable final java.util.List<DelegatedPermissionClassification> value) {
        this.delegatedPermissionClassifications = value;
    }
    /**
     * Sets the description property value. Free text field to provide an internal end-user facing description of the service principal. End-user portals such MyApps will display the application description in this field. The maximum allowed size is 1024 characters. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the disabledByMicrosoftStatus property value. Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value), NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons may include suspicious, abusive, or malicious activity, or a violation of the Microsoft Services Agreement).  Supports $filter (eq, ne, not).
     * @param value Value to set for the disabledByMicrosoftStatus property.
     */
    public void setDisabledByMicrosoftStatus(@jakarta.annotation.Nullable final String value) {
        this.disabledByMicrosoftStatus = value;
    }
    /**
     * Sets the displayName property value. The display name for the service principal. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the endpoints property value. The endpoints property
     * @param value Value to set for the endpoints property.
     */
    public void setEndpoints(@jakarta.annotation.Nullable final java.util.List<Endpoint> value) {
        this.endpoints = value;
    }
    /**
     * Sets the federatedIdentityCredentials property value. Federated identities for a specific type of service principal - managed identity. Supports $expand and $filter (/$count eq 0, /$count ne 0).
     * @param value Value to set for the federatedIdentityCredentials property.
     */
    public void setFederatedIdentityCredentials(@jakarta.annotation.Nullable final java.util.List<FederatedIdentityCredential> value) {
        this.federatedIdentityCredentials = value;
    }
    /**
     * Sets the homepage property value. Home page or landing page of the application.
     * @param value Value to set for the homepage property.
     */
    public void setHomepage(@jakarta.annotation.Nullable final String value) {
        this.homepage = value;
    }
    /**
     * Sets the homeRealmDiscoveryPolicies property value. The homeRealmDiscoveryPolicies assigned to this service principal. Supports $expand.
     * @param value Value to set for the homeRealmDiscoveryPolicies property.
     */
    public void setHomeRealmDiscoveryPolicies(@jakarta.annotation.Nullable final java.util.List<HomeRealmDiscoveryPolicy> value) {
        this.homeRealmDiscoveryPolicies = value;
    }
    /**
     * Sets the info property value. Basic profile information of the acquired application such as app's marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Microsoft Entra apps. Supports $filter (eq, ne, not, ge, le, and eq on null values).
     * @param value Value to set for the info property.
     */
    public void setInfo(@jakarta.annotation.Nullable final InformationalUrl value) {
        this.info = value;
    }
    /**
     * Sets the keyCredentials property value. The collection of key credentials associated with the service principal. Not nullable. Supports $filter (eq, not, ge, le).
     * @param value Value to set for the keyCredentials property.
     */
    public void setKeyCredentials(@jakarta.annotation.Nullable final java.util.List<KeyCredential> value) {
        this.keyCredentials = value;
    }
    /**
     * Sets the loginUrl property value. Specifies the URL where the service provider redirects the user to Microsoft Entra ID to authenticate. Microsoft Entra ID uses the URL to launch the application from Microsoft 365 or the Microsoft Entra My Apps. When blank, Microsoft Entra ID performs IdP-initiated sign-on for applications configured with SAML-based single sign-on. The user launches the application from Microsoft 365, the Microsoft Entra My Apps, or the Microsoft Entra SSO URL.
     * @param value Value to set for the loginUrl property.
     */
    public void setLoginUrl(@jakarta.annotation.Nullable final String value) {
        this.loginUrl = value;
    }
    /**
     * Sets the logoutUrl property value. Specifies the URL that will be used by Microsoft's authorization service to logout an user using OpenId Connect front-channel, back-channel or SAML logout protocols.
     * @param value Value to set for the logoutUrl property.
     */
    public void setLogoutUrl(@jakarta.annotation.Nullable final String value) {
        this.logoutUrl = value;
    }
    /**
     * Sets the memberOf property value. Roles that this service principal is a member of. HTTP Methods: GET Read-only. Nullable. Supports $expand.
     * @param value Value to set for the memberOf property.
     */
    public void setMemberOf(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.memberOf = value;
    }
    /**
     * Sets the notes property value. Free text field to capture information about the service principal, typically used for operational purposes. Maximum allowed size is 1024 characters.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.notes = value;
    }
    /**
     * Sets the notificationEmailAddresses property value. Specifies the list of email addresses where Microsoft Entra ID sends a notification when the active certificate is near the expiration date. This is only for the certificates used to sign the SAML token issued for Microsoft Entra Gallery applications.
     * @param value Value to set for the notificationEmailAddresses property.
     */
    public void setNotificationEmailAddresses(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.notificationEmailAddresses = value;
    }
    /**
     * Sets the oauth2PermissionGrants property value. Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user. Read-only. Nullable.
     * @param value Value to set for the oauth2PermissionGrants property.
     */
    public void setOauth2PermissionGrants(@jakarta.annotation.Nullable final java.util.List<OAuth2PermissionGrant> value) {
        this.oauth2PermissionGrants = value;
    }
    /**
     * Sets the oauth2PermissionScopes property value. The delegated permissions exposed by the application. For more information see the oauth2PermissionScopes property on the application entity's api property. Not nullable.
     * @param value Value to set for the oauth2PermissionScopes property.
     */
    public void setOauth2PermissionScopes(@jakarta.annotation.Nullable final java.util.List<PermissionScope> value) {
        this.oauth2PermissionScopes = value;
    }
    /**
     * Sets the ownedObjects property value. Directory objects that are owned by this service principal. Read-only. Nullable. Supports $expand, $select nested in $expand, and $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1).
     * @param value Value to set for the ownedObjects property.
     */
    public void setOwnedObjects(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.ownedObjects = value;
    }
    /**
     * Sets the owners property value. Directory objects that are owners of this servicePrincipal. The owners are a set of non-admin users or servicePrincipals who are allowed to modify this object. Read-only. Nullable. Supports $expand, $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1), and $select nested in $expand.
     * @param value Value to set for the owners property.
     */
    public void setOwners(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.owners = value;
    }
    /**
     * Sets the passwordCredentials property value. The collection of password credentials associated with the application. Not nullable.
     * @param value Value to set for the passwordCredentials property.
     */
    public void setPasswordCredentials(@jakarta.annotation.Nullable final java.util.List<PasswordCredential> value) {
        this.passwordCredentials = value;
    }
    /**
     * Sets the preferredSingleSignOnMode property value. Specifies the single sign-on mode configured for this application. Microsoft Entra ID uses the preferred single sign-on mode to launch the application from Microsoft 365 or the My Apps portal. The supported values are password, saml, notSupported, and oidc.
     * @param value Value to set for the preferredSingleSignOnMode property.
     */
    public void setPreferredSingleSignOnMode(@jakarta.annotation.Nullable final String value) {
        this.preferredSingleSignOnMode = value;
    }
    /**
     * Sets the preferredTokenSigningKeyThumbprint property value. This property can be used on SAML applications (apps that have preferredSingleSignOnMode set to saml) to control which certificate is used to sign the SAML responses. For applications that are not SAML, do not write or otherwise rely on this property.
     * @param value Value to set for the preferredTokenSigningKeyThumbprint property.
     */
    public void setPreferredTokenSigningKeyThumbprint(@jakarta.annotation.Nullable final String value) {
        this.preferredTokenSigningKeyThumbprint = value;
    }
    /**
     * Sets the remoteDesktopSecurityConfiguration property value. The remoteDesktopSecurityConfiguration object applied to this service principal. Supports $filter (eq) for isRemoteDesktopProtocolEnabled property.
     * @param value Value to set for the remoteDesktopSecurityConfiguration property.
     */
    public void setRemoteDesktopSecurityConfiguration(@jakarta.annotation.Nullable final RemoteDesktopSecurityConfiguration value) {
        this.remoteDesktopSecurityConfiguration = value;
    }
    /**
     * Sets the replyUrls property value. The URLs that user tokens are sent to for sign in with the associated application, or the redirect URIs that OAuth 2.0 authorization codes and access tokens are sent to for the associated application. Not nullable.
     * @param value Value to set for the replyUrls property.
     */
    public void setReplyUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.replyUrls = value;
    }
    /**
     * Sets the resourceSpecificApplicationPermissions property value. The resource-specific application permissions exposed by this application. Currently, resource-specific permissions are only supported for Teams apps accessing to specific chats and teams using Microsoft Graph. Read-only.
     * @param value Value to set for the resourceSpecificApplicationPermissions property.
     */
    public void setResourceSpecificApplicationPermissions(@jakarta.annotation.Nullable final java.util.List<ResourceSpecificPermission> value) {
        this.resourceSpecificApplicationPermissions = value;
    }
    /**
     * Sets the samlSingleSignOnSettings property value. The collection for settings related to saml single sign-on.
     * @param value Value to set for the samlSingleSignOnSettings property.
     */
    public void setSamlSingleSignOnSettings(@jakarta.annotation.Nullable final SamlSingleSignOnSettings value) {
        this.samlSingleSignOnSettings = value;
    }
    /**
     * Sets the servicePrincipalNames property value. Contains the list of identifiersUris, copied over from the associated application. Additional values can be added to hybrid applications. These values can be used to identify the permissions exposed by this app within Microsoft Entra ID. For example,Client apps can specify a resource URI which is based on the values of this property to acquire an access token, which is the URI returned in the 'aud' claim.The any operator is required for filter expressions on multi-valued properties. Not nullable.  Supports $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the servicePrincipalNames property.
     */
    public void setServicePrincipalNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.servicePrincipalNames = value;
    }
    /**
     * Sets the servicePrincipalType property value. Identifies whether the service principal represents an application, a managed identity, or a legacy application. This is set by Microsoft Entra ID internally. The servicePrincipalType property can be set to three different values: Application - A service principal that represents an application or service. The appId property identifies the associated app registration, and matches the appId of an application, possibly from a different tenant. If the associated app registration is missing, tokens are not issued for the service principal.ManagedIdentity - A service principal that represents a managed identity. Service principals representing managed identities can be granted access and permissions, but cannot be updated or modified directly.Legacy - A service principal that represents an app created before app registrations, or through legacy experiences. Legacy service principal can have credentials, service principal names, reply URLs, and other properties which are editable by an authorized user, but does not have an associated app registration. The appId value does not associate the service principal with an app registration. The service principal can only be used in the tenant where it was created.SocialIdp - For internal use.
     * @param value Value to set for the servicePrincipalType property.
     */
    public void setServicePrincipalType(@jakarta.annotation.Nullable final String value) {
        this.servicePrincipalType = value;
    }
    /**
     * Sets the signInAudience property value. Specifies the Microsoft accounts that are supported for the current application. Read-only. Supported values are:AzureADMyOrg: Users with a Microsoft work or school account in my organization's Microsoft Entra tenant (single-tenant).AzureADMultipleOrgs: Users with a Microsoft work or school account in any organization's Microsoft Entra tenant (multi-tenant).AzureADandPersonalMicrosoftAccount: Users with a personal Microsoft account, or a work or school account in any organization's Microsoft Entra tenant.PersonalMicrosoftAccount: Users with a personal Microsoft account only.
     * @param value Value to set for the signInAudience property.
     */
    public void setSignInAudience(@jakarta.annotation.Nullable final String value) {
        this.signInAudience = value;
    }
    /**
     * Sets the synchronization property value. Represents the capability for Microsoft Entra identity synchronization through the Microsoft Graph API.
     * @param value Value to set for the synchronization property.
     */
    public void setSynchronization(@jakarta.annotation.Nullable final Synchronization value) {
        this.synchronization = value;
    }
    /**
     * Sets the tags property value. Custom strings that can be used to categorize and identify the service principal. Not nullable. The value is the union of strings set here and on the associated application entity's tags property.Supports $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.tags = value;
    }
    /**
     * Sets the tokenEncryptionKeyId property value. Specifies the keyId of a public key from the keyCredentials collection. When configured, Microsoft Entra ID issues tokens for this application encrypted using the key specified by this property. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     * @param value Value to set for the tokenEncryptionKeyId property.
     */
    public void setTokenEncryptionKeyId(@jakarta.annotation.Nullable final UUID value) {
        this.tokenEncryptionKeyId = value;
    }
    /**
     * Sets the tokenIssuancePolicies property value. The tokenIssuancePolicies assigned to this service principal.
     * @param value Value to set for the tokenIssuancePolicies property.
     */
    public void setTokenIssuancePolicies(@jakarta.annotation.Nullable final java.util.List<TokenIssuancePolicy> value) {
        this.tokenIssuancePolicies = value;
    }
    /**
     * Sets the tokenLifetimePolicies property value. The tokenLifetimePolicies assigned to this service principal.
     * @param value Value to set for the tokenLifetimePolicies property.
     */
    public void setTokenLifetimePolicies(@jakarta.annotation.Nullable final java.util.List<TokenLifetimePolicy> value) {
        this.tokenLifetimePolicies = value;
    }
    /**
     * Sets the transitiveMemberOf property value. The transitiveMemberOf property
     * @param value Value to set for the transitiveMemberOf property.
     */
    public void setTransitiveMemberOf(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.transitiveMemberOf = value;
    }
    /**
     * Sets the verifiedPublisher property value. Specifies the verified publisher of the application which this service principal represents.
     * @param value Value to set for the verifiedPublisher property.
     */
    public void setVerifiedPublisher(@jakarta.annotation.Nullable final VerifiedPublisher value) {
        this.verifiedPublisher = value;
    }
}
