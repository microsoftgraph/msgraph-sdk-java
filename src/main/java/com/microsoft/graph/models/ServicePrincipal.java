package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Casts the previous resource to servicePrincipal. */
public class ServicePrincipal extends DirectoryObject implements Parsable {
    /** true if the service principal account is enabled; otherwise, false. Supports $filter (eq, ne, not, in). */
    private Boolean _accountEnabled;
    /** Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services like Microsoft 365 call the application in the context of a document the user is working on. */
    private java.util.List<AddIn> _addIns;
    /** Used to retrieve service principals by subscription, identify resource group and full resource ids for managed identities. Supports $filter (eq, not, ge, le, startsWith). */
    private java.util.List<String> _alternativeNames;
    /** The description exposed by the associated application. */
    private String _appDescription;
    /** The display name exposed by the associated application. */
    private String _appDisplayName;
    /** The unique identifier for the associated application (its appId property). Supports $filter (eq, ne, not, in, startsWith). */
    private String _appId;
    /** Unique identifier of the applicationTemplate that the servicePrincipal was created from. Read-only. Supports $filter (eq, ne, NOT, startsWith). */
    private String _applicationTemplateId;
    /** Contains the tenant id where the application is registered. This is applicable only to service principals backed by applications. Supports $filter (eq, ne, NOT, ge, le). */
    private String _appOwnerOrganizationId;
    /** App role assignments for this app or service, granted to users, groups, and other service principals. Supports $expand. */
    private java.util.List<AppRoleAssignment> _appRoleAssignedTo;
    /** Specifies whether users or other service principals need to be granted an app role assignment for this service principal before users can sign in or apps can get tokens. The default value is false. Not nullable. Supports $filter (eq, ne, NOT). */
    private Boolean _appRoleAssignmentRequired;
    /** App role assignment for another app or service, granted to this service principal. Supports $expand. */
    private java.util.List<AppRoleAssignment> _appRoleAssignments;
    /** The roles exposed by the application which this service principal represents. For more information see the appRoles property definition on the application entity. Not nullable. */
    private java.util.List<AppRole> _appRoles;
    /** The claimsMappingPolicies assigned to this service principal. Supports $expand. */
    private java.util.List<ClaimsMappingPolicy> _claimsMappingPolicies;
    /** Directory objects created by this service principal. Read-only. Nullable. */
    private java.util.List<DirectoryObject> _createdObjects;
    /** The delegatedPermissionClassifications property */
    private java.util.List<DelegatedPermissionClassification> _delegatedPermissionClassifications;
    /** Free text field to provide an internal end-user facing description of the service principal. End-user portals such MyApps will display the application description in this field. The maximum allowed size is 1024 characters. Supports $filter (eq, ne, not, ge, le, startsWith) and $search. */
    private String _description;
    /** Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value), NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons may include suspicious, abusive, or malicious activity, or a violation of the Microsoft Services Agreement).  Supports $filter (eq, ne, not). */
    private String _disabledByMicrosoftStatus;
    /** The display name for the service principal. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy. */
    private String _displayName;
    /** The endpoints property */
    private java.util.List<Endpoint> _endpoints;
    /** Federated identities for a specific type of service principal - managed identity. Supports $expand and $filter (eq when counting empty collections). */
    private java.util.List<FederatedIdentityCredential> _federatedIdentityCredentials;
    /** Home page or landing page of the application. */
    private String _homepage;
    /** The homeRealmDiscoveryPolicies assigned to this service principal. Supports $expand. */
    private java.util.List<HomeRealmDiscoveryPolicy> _homeRealmDiscoveryPolicies;
    /** Basic profile information of the acquired application such as app's marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Azure AD apps. Supports $filter (eq, ne, not, ge, le, and eq on null values). */
    private InformationalUrl _info;
    /** The collection of key credentials associated with the service principal. Not nullable. Supports $filter (eq, not, ge, le). */
    private java.util.List<KeyCredential> _keyCredentials;
    /** Specifies the URL where the service provider redirects the user to Azure AD to authenticate. Azure AD uses the URL to launch the application from Microsoft 365 or the Azure AD My Apps. When blank, Azure AD performs IdP-initiated sign-on for applications configured with SAML-based single sign-on. The user launches the application from Microsoft 365, the Azure AD My Apps, or the Azure AD SSO URL. */
    private String _loginUrl;
    /** Specifies the URL that will be used by Microsoft's authorization service to logout an user using OpenId Connect front-channel, back-channel or SAML logout protocols. */
    private String _logoutUrl;
    /** Roles that this service principal is a member of. HTTP Methods: GET Read-only. Nullable. Supports $expand. */
    private java.util.List<DirectoryObject> _memberOf;
    /** Free text field to capture information about the service principal, typically used for operational purposes. Maximum allowed size is 1024 characters. */
    private String _notes;
    /** Specifies the list of email addresses where Azure AD sends a notification when the active certificate is near the expiration date. This is only for the certificates used to sign the SAML token issued for Azure AD Gallery applications. */
    private java.util.List<String> _notificationEmailAddresses;
    /** Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user. Read-only. Nullable. */
    private java.util.List<OAuth2PermissionGrant> _oauth2PermissionGrants;
    /** The delegated permissions exposed by the application. For more information see the oauth2PermissionScopes property on the application entity's api property. Not nullable. */
    private java.util.List<PermissionScope> _oauth2PermissionScopes;
    /** Directory objects that are owned by this service principal. Read-only. Nullable. Supports $expand. */
    private java.util.List<DirectoryObject> _ownedObjects;
    /** Directory objects that are owners of this servicePrincipal. The owners are a set of non-admin users or servicePrincipals who are allowed to modify this object. Read-only. Nullable. Supports $expand. */
    private java.util.List<DirectoryObject> _owners;
    /** The collection of password credentials associated with the application. Not nullable. */
    private java.util.List<PasswordCredential> _passwordCredentials;
    /** Specifies the single sign-on mode configured for this application. Azure AD uses the preferred single sign-on mode to launch the application from Microsoft 365 or the Azure AD My Apps. The supported values are password, saml, notSupported, and oidc. */
    private String _preferredSingleSignOnMode;
    /** Reserved for internal use only. Do not write or otherwise rely on this property. May be removed in future versions. */
    private String _preferredTokenSigningKeyThumbprint;
    /** The URLs that user tokens are sent to for sign in with the associated application, or the redirect URIs that OAuth 2.0 authorization codes and access tokens are sent to for the associated application. Not nullable. */
    private java.util.List<String> _replyUrls;
    /** The resource-specific application permissions exposed by this application. Currently, resource-specific permissions are only supported for Teams apps accessing to specific chats and teams using Microsoft Graph. Read-only. */
    private java.util.List<ResourceSpecificPermission> _resourceSpecificApplicationPermissions;
    /** The collection for settings related to saml single sign-on. */
    private SamlSingleSignOnSettings _samlSingleSignOnSettings;
    /** Contains the list of identifiersUris, copied over from the associated application. Additional values can be added to hybrid applications. These values can be used to identify the permissions exposed by this app within Azure AD. For example,Client apps can specify a resource URI which is based on the values of this property to acquire an access token, which is the URI returned in the 'aud' claim.The any operator is required for filter expressions on multi-valued properties. Not nullable.  Supports $filter (eq, not, ge, le, startsWith). */
    private java.util.List<String> _servicePrincipalNames;
    /** Identifies whether the service principal represents an application, a managed identity, or a legacy application. This is set by Azure AD internally. The servicePrincipalType property can be set to three different values: __Application - A service principal that represents an application or service. The appId property identifies the associated app registration, and matches the appId of an application, possibly from a different tenant. If the associated app registration is missing, tokens are not issued for the service principal.__ManagedIdentity - A service principal that represents a managed identity. Service principals representing managed identities can be granted access and permissions, but cannot be updated or modified directly.__Legacy - A service principal that represents an app created before app registrations, or through legacy experiences. Legacy service principal can have credentials, service principal names, reply URLs, and other properties which are editable by an authorized user, but does not have an associated app registration. The appId value does not associate the service principal with an app registration. The service principal can only be used in the tenant where it was created.__SocialIdp - For internal use. */
    private String _servicePrincipalType;
    /** Specifies the Microsoft accounts that are supported for the current application. Read-only. Supported values are:AzureADMyOrg: Users with a Microsoft work or school account in my organizations Azure AD tenant (single-tenant).AzureADMultipleOrgs: Users with a Microsoft work or school account in any organizations Azure AD tenant (multi-tenant).AzureADandPersonalMicrosoftAccount: Users with a personal Microsoft account, or a work or school account in any organizations Azure AD tenant.PersonalMicrosoftAccount: Users with a personal Microsoft account only. */
    private String _signInAudience;
    /** Custom strings that can be used to categorize and identify the service principal. Not nullable. Supports $filter (eq, not, ge, le, startsWith). */
    private java.util.List<String> _tags;
    /** Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD issues tokens for this application encrypted using the key specified by this property. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user. */
    private String _tokenEncryptionKeyId;
    /** The tokenIssuancePolicies assigned to this service principal. */
    private java.util.List<TokenIssuancePolicy> _tokenIssuancePolicies;
    /** The tokenLifetimePolicies assigned to this service principal. */
    private java.util.List<TokenLifetimePolicy> _tokenLifetimePolicies;
    /** The transitiveMemberOf property */
    private java.util.List<DirectoryObject> _transitiveMemberOf;
    /** Specifies the verified publisher of the application which this service principal represents. */
    private VerifiedPublisher _verifiedPublisher;
    /**
     * Instantiates a new servicePrincipal and sets the default values.
     * @return a void
     */
    public ServicePrincipal() {
        super();
        this.setOdataType("#microsoft.graph.servicePrincipal");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a servicePrincipal
     */
    @javax.annotation.Nonnull
    public static ServicePrincipal createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrincipal();
    }
    /**
     * Gets the accountEnabled property value. true if the service principal account is enabled; otherwise, false. Supports $filter (eq, ne, not, in).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAccountEnabled() {
        return this._accountEnabled;
    }
    /**
     * Gets the addIns property value. Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services like Microsoft 365 call the application in the context of a document the user is working on.
     * @return a addIn
     */
    @javax.annotation.Nullable
    public java.util.List<AddIn> getAddIns() {
        return this._addIns;
    }
    /**
     * Gets the alternativeNames property value. Used to retrieve service principals by subscription, identify resource group and full resource ids for managed identities. Supports $filter (eq, not, ge, le, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAlternativeNames() {
        return this._alternativeNames;
    }
    /**
     * Gets the appDescription property value. The description exposed by the associated application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppDescription() {
        return this._appDescription;
    }
    /**
     * Gets the appDisplayName property value. The display name exposed by the associated application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppDisplayName() {
        return this._appDisplayName;
    }
    /**
     * Gets the appId property value. The unique identifier for the associated application (its appId property). Supports $filter (eq, ne, not, in, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this._appId;
    }
    /**
     * Gets the applicationTemplateId property value. Unique identifier of the applicationTemplate that the servicePrincipal was created from. Read-only. Supports $filter (eq, ne, NOT, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationTemplateId() {
        return this._applicationTemplateId;
    }
    /**
     * Gets the appOwnerOrganizationId property value. Contains the tenant id where the application is registered. This is applicable only to service principals backed by applications. Supports $filter (eq, ne, NOT, ge, le).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppOwnerOrganizationId() {
        return this._appOwnerOrganizationId;
    }
    /**
     * Gets the appRoleAssignedTo property value. App role assignments for this app or service, granted to users, groups, and other service principals. Supports $expand.
     * @return a appRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<AppRoleAssignment> getAppRoleAssignedTo() {
        return this._appRoleAssignedTo;
    }
    /**
     * Gets the appRoleAssignmentRequired property value. Specifies whether users or other service principals need to be granted an app role assignment for this service principal before users can sign in or apps can get tokens. The default value is false. Not nullable. Supports $filter (eq, ne, NOT).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppRoleAssignmentRequired() {
        return this._appRoleAssignmentRequired;
    }
    /**
     * Gets the appRoleAssignments property value. App role assignment for another app or service, granted to this service principal. Supports $expand.
     * @return a appRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<AppRoleAssignment> getAppRoleAssignments() {
        return this._appRoleAssignments;
    }
    /**
     * Gets the appRoles property value. The roles exposed by the application which this service principal represents. For more information see the appRoles property definition on the application entity. Not nullable.
     * @return a appRole
     */
    @javax.annotation.Nullable
    public java.util.List<AppRole> getAppRoles() {
        return this._appRoles;
    }
    /**
     * Gets the claimsMappingPolicies property value. The claimsMappingPolicies assigned to this service principal. Supports $expand.
     * @return a claimsMappingPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<ClaimsMappingPolicy> getClaimsMappingPolicies() {
        return this._claimsMappingPolicies;
    }
    /**
     * Gets the createdObjects property value. Directory objects created by this service principal. Read-only. Nullable.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getCreatedObjects() {
        return this._createdObjects;
    }
    /**
     * Gets the delegatedPermissionClassifications property value. The delegatedPermissionClassifications property
     * @return a delegatedPermissionClassification
     */
    @javax.annotation.Nullable
    public java.util.List<DelegatedPermissionClassification> getDelegatedPermissionClassifications() {
        return this._delegatedPermissionClassifications;
    }
    /**
     * Gets the description property value. Free text field to provide an internal end-user facing description of the service principal. End-user portals such MyApps will display the application description in this field. The maximum allowed size is 1024 characters. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the disabledByMicrosoftStatus property value. Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value), NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons may include suspicious, abusive, or malicious activity, or a violation of the Microsoft Services Agreement).  Supports $filter (eq, ne, not).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisabledByMicrosoftStatus() {
        return this._disabledByMicrosoftStatus;
    }
    /**
     * Gets the displayName property value. The display name for the service principal. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the endpoints property value. The endpoints property
     * @return a endpoint
     */
    @javax.annotation.Nullable
    public java.util.List<Endpoint> getEndpoints() {
        return this._endpoints;
    }
    /**
     * Gets the federatedIdentityCredentials property value. Federated identities for a specific type of service principal - managed identity. Supports $expand and $filter (eq when counting empty collections).
     * @return a federatedIdentityCredential
     */
    @javax.annotation.Nullable
    public java.util.List<FederatedIdentityCredential> getFederatedIdentityCredentials() {
        return this._federatedIdentityCredentials;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ServicePrincipal currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("accountEnabled", (n) -> { currentObject.setAccountEnabled(n.getBooleanValue()); });
            this.put("addIns", (n) -> { currentObject.setAddIns(n.getCollectionOfObjectValues(AddIn::createFromDiscriminatorValue)); });
            this.put("alternativeNames", (n) -> { currentObject.setAlternativeNames(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("appDescription", (n) -> { currentObject.setAppDescription(n.getStringValue()); });
            this.put("appDisplayName", (n) -> { currentObject.setAppDisplayName(n.getStringValue()); });
            this.put("appId", (n) -> { currentObject.setAppId(n.getStringValue()); });
            this.put("applicationTemplateId", (n) -> { currentObject.setApplicationTemplateId(n.getStringValue()); });
            this.put("appOwnerOrganizationId", (n) -> { currentObject.setAppOwnerOrganizationId(n.getStringValue()); });
            this.put("appRoleAssignedTo", (n) -> { currentObject.setAppRoleAssignedTo(n.getCollectionOfObjectValues(AppRoleAssignment::createFromDiscriminatorValue)); });
            this.put("appRoleAssignmentRequired", (n) -> { currentObject.setAppRoleAssignmentRequired(n.getBooleanValue()); });
            this.put("appRoleAssignments", (n) -> { currentObject.setAppRoleAssignments(n.getCollectionOfObjectValues(AppRoleAssignment::createFromDiscriminatorValue)); });
            this.put("appRoles", (n) -> { currentObject.setAppRoles(n.getCollectionOfObjectValues(AppRole::createFromDiscriminatorValue)); });
            this.put("claimsMappingPolicies", (n) -> { currentObject.setClaimsMappingPolicies(n.getCollectionOfObjectValues(ClaimsMappingPolicy::createFromDiscriminatorValue)); });
            this.put("createdObjects", (n) -> { currentObject.setCreatedObjects(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("delegatedPermissionClassifications", (n) -> { currentObject.setDelegatedPermissionClassifications(n.getCollectionOfObjectValues(DelegatedPermissionClassification::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("disabledByMicrosoftStatus", (n) -> { currentObject.setDisabledByMicrosoftStatus(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("endpoints", (n) -> { currentObject.setEndpoints(n.getCollectionOfObjectValues(Endpoint::createFromDiscriminatorValue)); });
            this.put("federatedIdentityCredentials", (n) -> { currentObject.setFederatedIdentityCredentials(n.getCollectionOfObjectValues(FederatedIdentityCredential::createFromDiscriminatorValue)); });
            this.put("homepage", (n) -> { currentObject.setHomepage(n.getStringValue()); });
            this.put("homeRealmDiscoveryPolicies", (n) -> { currentObject.setHomeRealmDiscoveryPolicies(n.getCollectionOfObjectValues(HomeRealmDiscoveryPolicy::createFromDiscriminatorValue)); });
            this.put("info", (n) -> { currentObject.setInfo(n.getObjectValue(InformationalUrl::createFromDiscriminatorValue)); });
            this.put("keyCredentials", (n) -> { currentObject.setKeyCredentials(n.getCollectionOfObjectValues(KeyCredential::createFromDiscriminatorValue)); });
            this.put("loginUrl", (n) -> { currentObject.setLoginUrl(n.getStringValue()); });
            this.put("logoutUrl", (n) -> { currentObject.setLogoutUrl(n.getStringValue()); });
            this.put("memberOf", (n) -> { currentObject.setMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("notes", (n) -> { currentObject.setNotes(n.getStringValue()); });
            this.put("notificationEmailAddresses", (n) -> { currentObject.setNotificationEmailAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("oauth2PermissionGrants", (n) -> { currentObject.setOauth2PermissionGrants(n.getCollectionOfObjectValues(OAuth2PermissionGrant::createFromDiscriminatorValue)); });
            this.put("oauth2PermissionScopes", (n) -> { currentObject.setOauth2PermissionScopes(n.getCollectionOfObjectValues(PermissionScope::createFromDiscriminatorValue)); });
            this.put("ownedObjects", (n) -> { currentObject.setOwnedObjects(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("owners", (n) -> { currentObject.setOwners(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("passwordCredentials", (n) -> { currentObject.setPasswordCredentials(n.getCollectionOfObjectValues(PasswordCredential::createFromDiscriminatorValue)); });
            this.put("preferredSingleSignOnMode", (n) -> { currentObject.setPreferredSingleSignOnMode(n.getStringValue()); });
            this.put("preferredTokenSigningKeyThumbprint", (n) -> { currentObject.setPreferredTokenSigningKeyThumbprint(n.getStringValue()); });
            this.put("replyUrls", (n) -> { currentObject.setReplyUrls(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("resourceSpecificApplicationPermissions", (n) -> { currentObject.setResourceSpecificApplicationPermissions(n.getCollectionOfObjectValues(ResourceSpecificPermission::createFromDiscriminatorValue)); });
            this.put("samlSingleSignOnSettings", (n) -> { currentObject.setSamlSingleSignOnSettings(n.getObjectValue(SamlSingleSignOnSettings::createFromDiscriminatorValue)); });
            this.put("servicePrincipalNames", (n) -> { currentObject.setServicePrincipalNames(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("servicePrincipalType", (n) -> { currentObject.setServicePrincipalType(n.getStringValue()); });
            this.put("signInAudience", (n) -> { currentObject.setSignInAudience(n.getStringValue()); });
            this.put("tags", (n) -> { currentObject.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("tokenEncryptionKeyId", (n) -> { currentObject.setTokenEncryptionKeyId(n.getStringValue()); });
            this.put("tokenIssuancePolicies", (n) -> { currentObject.setTokenIssuancePolicies(n.getCollectionOfObjectValues(TokenIssuancePolicy::createFromDiscriminatorValue)); });
            this.put("tokenLifetimePolicies", (n) -> { currentObject.setTokenLifetimePolicies(n.getCollectionOfObjectValues(TokenLifetimePolicy::createFromDiscriminatorValue)); });
            this.put("transitiveMemberOf", (n) -> { currentObject.setTransitiveMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("verifiedPublisher", (n) -> { currentObject.setVerifiedPublisher(n.getObjectValue(VerifiedPublisher::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the homepage property value. Home page or landing page of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHomepage() {
        return this._homepage;
    }
    /**
     * Gets the homeRealmDiscoveryPolicies property value. The homeRealmDiscoveryPolicies assigned to this service principal. Supports $expand.
     * @return a homeRealmDiscoveryPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<HomeRealmDiscoveryPolicy> getHomeRealmDiscoveryPolicies() {
        return this._homeRealmDiscoveryPolicies;
    }
    /**
     * Gets the info property value. Basic profile information of the acquired application such as app's marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Azure AD apps. Supports $filter (eq, ne, not, ge, le, and eq on null values).
     * @return a informationalUrl
     */
    @javax.annotation.Nullable
    public InformationalUrl getInfo() {
        return this._info;
    }
    /**
     * Gets the keyCredentials property value. The collection of key credentials associated with the service principal. Not nullable. Supports $filter (eq, not, ge, le).
     * @return a keyCredential
     */
    @javax.annotation.Nullable
    public java.util.List<KeyCredential> getKeyCredentials() {
        return this._keyCredentials;
    }
    /**
     * Gets the loginUrl property value. Specifies the URL where the service provider redirects the user to Azure AD to authenticate. Azure AD uses the URL to launch the application from Microsoft 365 or the Azure AD My Apps. When blank, Azure AD performs IdP-initiated sign-on for applications configured with SAML-based single sign-on. The user launches the application from Microsoft 365, the Azure AD My Apps, or the Azure AD SSO URL.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLoginUrl() {
        return this._loginUrl;
    }
    /**
     * Gets the logoutUrl property value. Specifies the URL that will be used by Microsoft's authorization service to logout an user using OpenId Connect front-channel, back-channel or SAML logout protocols.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLogoutUrl() {
        return this._logoutUrl;
    }
    /**
     * Gets the memberOf property value. Roles that this service principal is a member of. HTTP Methods: GET Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getMemberOf() {
        return this._memberOf;
    }
    /**
     * Gets the notes property value. Free text field to capture information about the service principal, typically used for operational purposes. Maximum allowed size is 1024 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotes() {
        return this._notes;
    }
    /**
     * Gets the notificationEmailAddresses property value. Specifies the list of email addresses where Azure AD sends a notification when the active certificate is near the expiration date. This is only for the certificates used to sign the SAML token issued for Azure AD Gallery applications.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getNotificationEmailAddresses() {
        return this._notificationEmailAddresses;
    }
    /**
     * Gets the oauth2PermissionGrants property value. Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user. Read-only. Nullable.
     * @return a oAuth2PermissionGrant
     */
    @javax.annotation.Nullable
    public java.util.List<OAuth2PermissionGrant> getOauth2PermissionGrants() {
        return this._oauth2PermissionGrants;
    }
    /**
     * Gets the oauth2PermissionScopes property value. The delegated permissions exposed by the application. For more information see the oauth2PermissionScopes property on the application entity's api property. Not nullable.
     * @return a permissionScope
     */
    @javax.annotation.Nullable
    public java.util.List<PermissionScope> getOauth2PermissionScopes() {
        return this._oauth2PermissionScopes;
    }
    /**
     * Gets the ownedObjects property value. Directory objects that are owned by this service principal. Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getOwnedObjects() {
        return this._ownedObjects;
    }
    /**
     * Gets the owners property value. Directory objects that are owners of this servicePrincipal. The owners are a set of non-admin users or servicePrincipals who are allowed to modify this object. Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getOwners() {
        return this._owners;
    }
    /**
     * Gets the passwordCredentials property value. The collection of password credentials associated with the application. Not nullable.
     * @return a passwordCredential
     */
    @javax.annotation.Nullable
    public java.util.List<PasswordCredential> getPasswordCredentials() {
        return this._passwordCredentials;
    }
    /**
     * Gets the preferredSingleSignOnMode property value. Specifies the single sign-on mode configured for this application. Azure AD uses the preferred single sign-on mode to launch the application from Microsoft 365 or the Azure AD My Apps. The supported values are password, saml, notSupported, and oidc.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreferredSingleSignOnMode() {
        return this._preferredSingleSignOnMode;
    }
    /**
     * Gets the preferredTokenSigningKeyThumbprint property value. Reserved for internal use only. Do not write or otherwise rely on this property. May be removed in future versions.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreferredTokenSigningKeyThumbprint() {
        return this._preferredTokenSigningKeyThumbprint;
    }
    /**
     * Gets the replyUrls property value. The URLs that user tokens are sent to for sign in with the associated application, or the redirect URIs that OAuth 2.0 authorization codes and access tokens are sent to for the associated application. Not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getReplyUrls() {
        return this._replyUrls;
    }
    /**
     * Gets the resourceSpecificApplicationPermissions property value. The resource-specific application permissions exposed by this application. Currently, resource-specific permissions are only supported for Teams apps accessing to specific chats and teams using Microsoft Graph. Read-only.
     * @return a resourceSpecificPermission
     */
    @javax.annotation.Nullable
    public java.util.List<ResourceSpecificPermission> getResourceSpecificApplicationPermissions() {
        return this._resourceSpecificApplicationPermissions;
    }
    /**
     * Gets the samlSingleSignOnSettings property value. The collection for settings related to saml single sign-on.
     * @return a samlSingleSignOnSettings
     */
    @javax.annotation.Nullable
    public SamlSingleSignOnSettings getSamlSingleSignOnSettings() {
        return this._samlSingleSignOnSettings;
    }
    /**
     * Gets the servicePrincipalNames property value. Contains the list of identifiersUris, copied over from the associated application. Additional values can be added to hybrid applications. These values can be used to identify the permissions exposed by this app within Azure AD. For example,Client apps can specify a resource URI which is based on the values of this property to acquire an access token, which is the URI returned in the 'aud' claim.The any operator is required for filter expressions on multi-valued properties. Not nullable.  Supports $filter (eq, not, ge, le, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getServicePrincipalNames() {
        return this._servicePrincipalNames;
    }
    /**
     * Gets the servicePrincipalType property value. Identifies whether the service principal represents an application, a managed identity, or a legacy application. This is set by Azure AD internally. The servicePrincipalType property can be set to three different values: __Application - A service principal that represents an application or service. The appId property identifies the associated app registration, and matches the appId of an application, possibly from a different tenant. If the associated app registration is missing, tokens are not issued for the service principal.__ManagedIdentity - A service principal that represents a managed identity. Service principals representing managed identities can be granted access and permissions, but cannot be updated or modified directly.__Legacy - A service principal that represents an app created before app registrations, or through legacy experiences. Legacy service principal can have credentials, service principal names, reply URLs, and other properties which are editable by an authorized user, but does not have an associated app registration. The appId value does not associate the service principal with an app registration. The service principal can only be used in the tenant where it was created.__SocialIdp - For internal use.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePrincipalType() {
        return this._servicePrincipalType;
    }
    /**
     * Gets the signInAudience property value. Specifies the Microsoft accounts that are supported for the current application. Read-only. Supported values are:AzureADMyOrg: Users with a Microsoft work or school account in my organizations Azure AD tenant (single-tenant).AzureADMultipleOrgs: Users with a Microsoft work or school account in any organizations Azure AD tenant (multi-tenant).AzureADandPersonalMicrosoftAccount: Users with a personal Microsoft account, or a work or school account in any organizations Azure AD tenant.PersonalMicrosoftAccount: Users with a personal Microsoft account only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSignInAudience() {
        return this._signInAudience;
    }
    /**
     * Gets the tags property value. Custom strings that can be used to categorize and identify the service principal. Not nullable. Supports $filter (eq, not, ge, le, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTags() {
        return this._tags;
    }
    /**
     * Gets the tokenEncryptionKeyId property value. Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD issues tokens for this application encrypted using the key specified by this property. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTokenEncryptionKeyId() {
        return this._tokenEncryptionKeyId;
    }
    /**
     * Gets the tokenIssuancePolicies property value. The tokenIssuancePolicies assigned to this service principal.
     * @return a tokenIssuancePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<TokenIssuancePolicy> getTokenIssuancePolicies() {
        return this._tokenIssuancePolicies;
    }
    /**
     * Gets the tokenLifetimePolicies property value. The tokenLifetimePolicies assigned to this service principal.
     * @return a tokenLifetimePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<TokenLifetimePolicy> getTokenLifetimePolicies() {
        return this._tokenLifetimePolicies;
    }
    /**
     * Gets the transitiveMemberOf property value. The transitiveMemberOf property
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getTransitiveMemberOf() {
        return this._transitiveMemberOf;
    }
    /**
     * Gets the verifiedPublisher property value. Specifies the verified publisher of the application which this service principal represents.
     * @return a verifiedPublisher
     */
    @javax.annotation.Nullable
    public VerifiedPublisher getVerifiedPublisher() {
        return this._verifiedPublisher;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
        writer.writeStringValue("appOwnerOrganizationId", this.getAppOwnerOrganizationId());
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
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeStringValue("tokenEncryptionKeyId", this.getTokenEncryptionKeyId());
        writer.writeCollectionOfObjectValues("tokenIssuancePolicies", this.getTokenIssuancePolicies());
        writer.writeCollectionOfObjectValues("tokenLifetimePolicies", this.getTokenLifetimePolicies());
        writer.writeCollectionOfObjectValues("transitiveMemberOf", this.getTransitiveMemberOf());
        writer.writeObjectValue("verifiedPublisher", this.getVerifiedPublisher());
    }
    /**
     * Sets the accountEnabled property value. true if the service principal account is enabled; otherwise, false. Supports $filter (eq, ne, not, in).
     * @param value Value to set for the accountEnabled property.
     * @return a void
     */
    public void setAccountEnabled(@javax.annotation.Nullable final Boolean value) {
        this._accountEnabled = value;
    }
    /**
     * Sets the addIns property value. Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services like Microsoft 365 call the application in the context of a document the user is working on.
     * @param value Value to set for the addIns property.
     * @return a void
     */
    public void setAddIns(@javax.annotation.Nullable final java.util.List<AddIn> value) {
        this._addIns = value;
    }
    /**
     * Sets the alternativeNames property value. Used to retrieve service principals by subscription, identify resource group and full resource ids for managed identities. Supports $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the alternativeNames property.
     * @return a void
     */
    public void setAlternativeNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._alternativeNames = value;
    }
    /**
     * Sets the appDescription property value. The description exposed by the associated application.
     * @param value Value to set for the appDescription property.
     * @return a void
     */
    public void setAppDescription(@javax.annotation.Nullable final String value) {
        this._appDescription = value;
    }
    /**
     * Sets the appDisplayName property value. The display name exposed by the associated application.
     * @param value Value to set for the appDisplayName property.
     * @return a void
     */
    public void setAppDisplayName(@javax.annotation.Nullable final String value) {
        this._appDisplayName = value;
    }
    /**
     * Sets the appId property value. The unique identifier for the associated application (its appId property). Supports $filter (eq, ne, not, in, startsWith).
     * @param value Value to set for the appId property.
     * @return a void
     */
    public void setAppId(@javax.annotation.Nullable final String value) {
        this._appId = value;
    }
    /**
     * Sets the applicationTemplateId property value. Unique identifier of the applicationTemplate that the servicePrincipal was created from. Read-only. Supports $filter (eq, ne, NOT, startsWith).
     * @param value Value to set for the applicationTemplateId property.
     * @return a void
     */
    public void setApplicationTemplateId(@javax.annotation.Nullable final String value) {
        this._applicationTemplateId = value;
    }
    /**
     * Sets the appOwnerOrganizationId property value. Contains the tenant id where the application is registered. This is applicable only to service principals backed by applications. Supports $filter (eq, ne, NOT, ge, le).
     * @param value Value to set for the appOwnerOrganizationId property.
     * @return a void
     */
    public void setAppOwnerOrganizationId(@javax.annotation.Nullable final String value) {
        this._appOwnerOrganizationId = value;
    }
    /**
     * Sets the appRoleAssignedTo property value. App role assignments for this app or service, granted to users, groups, and other service principals. Supports $expand.
     * @param value Value to set for the appRoleAssignedTo property.
     * @return a void
     */
    public void setAppRoleAssignedTo(@javax.annotation.Nullable final java.util.List<AppRoleAssignment> value) {
        this._appRoleAssignedTo = value;
    }
    /**
     * Sets the appRoleAssignmentRequired property value. Specifies whether users or other service principals need to be granted an app role assignment for this service principal before users can sign in or apps can get tokens. The default value is false. Not nullable. Supports $filter (eq, ne, NOT).
     * @param value Value to set for the appRoleAssignmentRequired property.
     * @return a void
     */
    public void setAppRoleAssignmentRequired(@javax.annotation.Nullable final Boolean value) {
        this._appRoleAssignmentRequired = value;
    }
    /**
     * Sets the appRoleAssignments property value. App role assignment for another app or service, granted to this service principal. Supports $expand.
     * @param value Value to set for the appRoleAssignments property.
     * @return a void
     */
    public void setAppRoleAssignments(@javax.annotation.Nullable final java.util.List<AppRoleAssignment> value) {
        this._appRoleAssignments = value;
    }
    /**
     * Sets the appRoles property value. The roles exposed by the application which this service principal represents. For more information see the appRoles property definition on the application entity. Not nullable.
     * @param value Value to set for the appRoles property.
     * @return a void
     */
    public void setAppRoles(@javax.annotation.Nullable final java.util.List<AppRole> value) {
        this._appRoles = value;
    }
    /**
     * Sets the claimsMappingPolicies property value. The claimsMappingPolicies assigned to this service principal. Supports $expand.
     * @param value Value to set for the claimsMappingPolicies property.
     * @return a void
     */
    public void setClaimsMappingPolicies(@javax.annotation.Nullable final java.util.List<ClaimsMappingPolicy> value) {
        this._claimsMappingPolicies = value;
    }
    /**
     * Sets the createdObjects property value. Directory objects created by this service principal. Read-only. Nullable.
     * @param value Value to set for the createdObjects property.
     * @return a void
     */
    public void setCreatedObjects(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._createdObjects = value;
    }
    /**
     * Sets the delegatedPermissionClassifications property value. The delegatedPermissionClassifications property
     * @param value Value to set for the delegatedPermissionClassifications property.
     * @return a void
     */
    public void setDelegatedPermissionClassifications(@javax.annotation.Nullable final java.util.List<DelegatedPermissionClassification> value) {
        this._delegatedPermissionClassifications = value;
    }
    /**
     * Sets the description property value. Free text field to provide an internal end-user facing description of the service principal. End-user portals such MyApps will display the application description in this field. The maximum allowed size is 1024 characters. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the disabledByMicrosoftStatus property value. Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value), NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons may include suspicious, abusive, or malicious activity, or a violation of the Microsoft Services Agreement).  Supports $filter (eq, ne, not).
     * @param value Value to set for the disabledByMicrosoftStatus property.
     * @return a void
     */
    public void setDisabledByMicrosoftStatus(@javax.annotation.Nullable final String value) {
        this._disabledByMicrosoftStatus = value;
    }
    /**
     * Sets the displayName property value. The display name for the service principal. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the endpoints property value. The endpoints property
     * @param value Value to set for the endpoints property.
     * @return a void
     */
    public void setEndpoints(@javax.annotation.Nullable final java.util.List<Endpoint> value) {
        this._endpoints = value;
    }
    /**
     * Sets the federatedIdentityCredentials property value. Federated identities for a specific type of service principal - managed identity. Supports $expand and $filter (eq when counting empty collections).
     * @param value Value to set for the federatedIdentityCredentials property.
     * @return a void
     */
    public void setFederatedIdentityCredentials(@javax.annotation.Nullable final java.util.List<FederatedIdentityCredential> value) {
        this._federatedIdentityCredentials = value;
    }
    /**
     * Sets the homepage property value. Home page or landing page of the application.
     * @param value Value to set for the homepage property.
     * @return a void
     */
    public void setHomepage(@javax.annotation.Nullable final String value) {
        this._homepage = value;
    }
    /**
     * Sets the homeRealmDiscoveryPolicies property value. The homeRealmDiscoveryPolicies assigned to this service principal. Supports $expand.
     * @param value Value to set for the homeRealmDiscoveryPolicies property.
     * @return a void
     */
    public void setHomeRealmDiscoveryPolicies(@javax.annotation.Nullable final java.util.List<HomeRealmDiscoveryPolicy> value) {
        this._homeRealmDiscoveryPolicies = value;
    }
    /**
     * Sets the info property value. Basic profile information of the acquired application such as app's marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Azure AD apps. Supports $filter (eq, ne, not, ge, le, and eq on null values).
     * @param value Value to set for the info property.
     * @return a void
     */
    public void setInfo(@javax.annotation.Nullable final InformationalUrl value) {
        this._info = value;
    }
    /**
     * Sets the keyCredentials property value. The collection of key credentials associated with the service principal. Not nullable. Supports $filter (eq, not, ge, le).
     * @param value Value to set for the keyCredentials property.
     * @return a void
     */
    public void setKeyCredentials(@javax.annotation.Nullable final java.util.List<KeyCredential> value) {
        this._keyCredentials = value;
    }
    /**
     * Sets the loginUrl property value. Specifies the URL where the service provider redirects the user to Azure AD to authenticate. Azure AD uses the URL to launch the application from Microsoft 365 or the Azure AD My Apps. When blank, Azure AD performs IdP-initiated sign-on for applications configured with SAML-based single sign-on. The user launches the application from Microsoft 365, the Azure AD My Apps, or the Azure AD SSO URL.
     * @param value Value to set for the loginUrl property.
     * @return a void
     */
    public void setLoginUrl(@javax.annotation.Nullable final String value) {
        this._loginUrl = value;
    }
    /**
     * Sets the logoutUrl property value. Specifies the URL that will be used by Microsoft's authorization service to logout an user using OpenId Connect front-channel, back-channel or SAML logout protocols.
     * @param value Value to set for the logoutUrl property.
     * @return a void
     */
    public void setLogoutUrl(@javax.annotation.Nullable final String value) {
        this._logoutUrl = value;
    }
    /**
     * Sets the memberOf property value. Roles that this service principal is a member of. HTTP Methods: GET Read-only. Nullable. Supports $expand.
     * @param value Value to set for the memberOf property.
     * @return a void
     */
    public void setMemberOf(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._memberOf = value;
    }
    /**
     * Sets the notes property value. Free text field to capture information about the service principal, typically used for operational purposes. Maximum allowed size is 1024 characters.
     * @param value Value to set for the notes property.
     * @return a void
     */
    public void setNotes(@javax.annotation.Nullable final String value) {
        this._notes = value;
    }
    /**
     * Sets the notificationEmailAddresses property value. Specifies the list of email addresses where Azure AD sends a notification when the active certificate is near the expiration date. This is only for the certificates used to sign the SAML token issued for Azure AD Gallery applications.
     * @param value Value to set for the notificationEmailAddresses property.
     * @return a void
     */
    public void setNotificationEmailAddresses(@javax.annotation.Nullable final java.util.List<String> value) {
        this._notificationEmailAddresses = value;
    }
    /**
     * Sets the oauth2PermissionGrants property value. Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user. Read-only. Nullable.
     * @param value Value to set for the oauth2PermissionGrants property.
     * @return a void
     */
    public void setOauth2PermissionGrants(@javax.annotation.Nullable final java.util.List<OAuth2PermissionGrant> value) {
        this._oauth2PermissionGrants = value;
    }
    /**
     * Sets the oauth2PermissionScopes property value. The delegated permissions exposed by the application. For more information see the oauth2PermissionScopes property on the application entity's api property. Not nullable.
     * @param value Value to set for the oauth2PermissionScopes property.
     * @return a void
     */
    public void setOauth2PermissionScopes(@javax.annotation.Nullable final java.util.List<PermissionScope> value) {
        this._oauth2PermissionScopes = value;
    }
    /**
     * Sets the ownedObjects property value. Directory objects that are owned by this service principal. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the ownedObjects property.
     * @return a void
     */
    public void setOwnedObjects(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._ownedObjects = value;
    }
    /**
     * Sets the owners property value. Directory objects that are owners of this servicePrincipal. The owners are a set of non-admin users or servicePrincipals who are allowed to modify this object. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the owners property.
     * @return a void
     */
    public void setOwners(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._owners = value;
    }
    /**
     * Sets the passwordCredentials property value. The collection of password credentials associated with the application. Not nullable.
     * @param value Value to set for the passwordCredentials property.
     * @return a void
     */
    public void setPasswordCredentials(@javax.annotation.Nullable final java.util.List<PasswordCredential> value) {
        this._passwordCredentials = value;
    }
    /**
     * Sets the preferredSingleSignOnMode property value. Specifies the single sign-on mode configured for this application. Azure AD uses the preferred single sign-on mode to launch the application from Microsoft 365 or the Azure AD My Apps. The supported values are password, saml, notSupported, and oidc.
     * @param value Value to set for the preferredSingleSignOnMode property.
     * @return a void
     */
    public void setPreferredSingleSignOnMode(@javax.annotation.Nullable final String value) {
        this._preferredSingleSignOnMode = value;
    }
    /**
     * Sets the preferredTokenSigningKeyThumbprint property value. Reserved for internal use only. Do not write or otherwise rely on this property. May be removed in future versions.
     * @param value Value to set for the preferredTokenSigningKeyThumbprint property.
     * @return a void
     */
    public void setPreferredTokenSigningKeyThumbprint(@javax.annotation.Nullable final String value) {
        this._preferredTokenSigningKeyThumbprint = value;
    }
    /**
     * Sets the replyUrls property value. The URLs that user tokens are sent to for sign in with the associated application, or the redirect URIs that OAuth 2.0 authorization codes and access tokens are sent to for the associated application. Not nullable.
     * @param value Value to set for the replyUrls property.
     * @return a void
     */
    public void setReplyUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this._replyUrls = value;
    }
    /**
     * Sets the resourceSpecificApplicationPermissions property value. The resource-specific application permissions exposed by this application. Currently, resource-specific permissions are only supported for Teams apps accessing to specific chats and teams using Microsoft Graph. Read-only.
     * @param value Value to set for the resourceSpecificApplicationPermissions property.
     * @return a void
     */
    public void setResourceSpecificApplicationPermissions(@javax.annotation.Nullable final java.util.List<ResourceSpecificPermission> value) {
        this._resourceSpecificApplicationPermissions = value;
    }
    /**
     * Sets the samlSingleSignOnSettings property value. The collection for settings related to saml single sign-on.
     * @param value Value to set for the samlSingleSignOnSettings property.
     * @return a void
     */
    public void setSamlSingleSignOnSettings(@javax.annotation.Nullable final SamlSingleSignOnSettings value) {
        this._samlSingleSignOnSettings = value;
    }
    /**
     * Sets the servicePrincipalNames property value. Contains the list of identifiersUris, copied over from the associated application. Additional values can be added to hybrid applications. These values can be used to identify the permissions exposed by this app within Azure AD. For example,Client apps can specify a resource URI which is based on the values of this property to acquire an access token, which is the URI returned in the 'aud' claim.The any operator is required for filter expressions on multi-valued properties. Not nullable.  Supports $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the servicePrincipalNames property.
     * @return a void
     */
    public void setServicePrincipalNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._servicePrincipalNames = value;
    }
    /**
     * Sets the servicePrincipalType property value. Identifies whether the service principal represents an application, a managed identity, or a legacy application. This is set by Azure AD internally. The servicePrincipalType property can be set to three different values: __Application - A service principal that represents an application or service. The appId property identifies the associated app registration, and matches the appId of an application, possibly from a different tenant. If the associated app registration is missing, tokens are not issued for the service principal.__ManagedIdentity - A service principal that represents a managed identity. Service principals representing managed identities can be granted access and permissions, but cannot be updated or modified directly.__Legacy - A service principal that represents an app created before app registrations, or through legacy experiences. Legacy service principal can have credentials, service principal names, reply URLs, and other properties which are editable by an authorized user, but does not have an associated app registration. The appId value does not associate the service principal with an app registration. The service principal can only be used in the tenant where it was created.__SocialIdp - For internal use.
     * @param value Value to set for the servicePrincipalType property.
     * @return a void
     */
    public void setServicePrincipalType(@javax.annotation.Nullable final String value) {
        this._servicePrincipalType = value;
    }
    /**
     * Sets the signInAudience property value. Specifies the Microsoft accounts that are supported for the current application. Read-only. Supported values are:AzureADMyOrg: Users with a Microsoft work or school account in my organizations Azure AD tenant (single-tenant).AzureADMultipleOrgs: Users with a Microsoft work or school account in any organizations Azure AD tenant (multi-tenant).AzureADandPersonalMicrosoftAccount: Users with a personal Microsoft account, or a work or school account in any organizations Azure AD tenant.PersonalMicrosoftAccount: Users with a personal Microsoft account only.
     * @param value Value to set for the signInAudience property.
     * @return a void
     */
    public void setSignInAudience(@javax.annotation.Nullable final String value) {
        this._signInAudience = value;
    }
    /**
     * Sets the tags property value. Custom strings that can be used to categorize and identify the service principal. Not nullable. Supports $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the tags property.
     * @return a void
     */
    public void setTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._tags = value;
    }
    /**
     * Sets the tokenEncryptionKeyId property value. Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD issues tokens for this application encrypted using the key specified by this property. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     * @param value Value to set for the tokenEncryptionKeyId property.
     * @return a void
     */
    public void setTokenEncryptionKeyId(@javax.annotation.Nullable final String value) {
        this._tokenEncryptionKeyId = value;
    }
    /**
     * Sets the tokenIssuancePolicies property value. The tokenIssuancePolicies assigned to this service principal.
     * @param value Value to set for the tokenIssuancePolicies property.
     * @return a void
     */
    public void setTokenIssuancePolicies(@javax.annotation.Nullable final java.util.List<TokenIssuancePolicy> value) {
        this._tokenIssuancePolicies = value;
    }
    /**
     * Sets the tokenLifetimePolicies property value. The tokenLifetimePolicies assigned to this service principal.
     * @param value Value to set for the tokenLifetimePolicies property.
     * @return a void
     */
    public void setTokenLifetimePolicies(@javax.annotation.Nullable final java.util.List<TokenLifetimePolicy> value) {
        this._tokenLifetimePolicies = value;
    }
    /**
     * Sets the transitiveMemberOf property value. The transitiveMemberOf property
     * @param value Value to set for the transitiveMemberOf property.
     * @return a void
     */
    public void setTransitiveMemberOf(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._transitiveMemberOf = value;
    }
    /**
     * Sets the verifiedPublisher property value. Specifies the verified publisher of the application which this service principal represents.
     * @param value Value to set for the verifiedPublisher property.
     * @return a void
     */
    public void setVerifiedPublisher(@javax.annotation.Nullable final VerifiedPublisher value) {
        this._verifiedPublisher = value;
    }
}
