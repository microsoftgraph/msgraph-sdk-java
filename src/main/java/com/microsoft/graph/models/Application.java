package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Application extends DirectoryObject implements Parsable {
    /**
     * Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services like Office 365 call the application in the context of a document the user is working on.
     */
    private java.util.List<AddIn> addIns;
    /**
     * Specifies settings for an application that implements a web API.
     */
    private ApiApplication api;
    /**
     * The unique identifier for the application that is assigned to an application by Azure AD. Not nullable. Read-only. Supports $filter (eq).
     */
    private String appId;
    /**
     * Unique identifier of the applicationTemplate. Supports $filter (eq, not, ne).
     */
    private String applicationTemplateId;
    /**
     * The appManagementPolicy applied to this application.
     */
    private java.util.List<AppManagementPolicy> appManagementPolicies;
    /**
     * The collection of roles defined for the application. With app role assignments, these roles can be assigned to users, groups, or service principals associated with other applications. Not nullable.
     */
    private java.util.List<AppRole> appRoles;
    /**
     * Specifies the certification status of the application.
     */
    private Certification certification;
    /**
     * The date and time the application was registered. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.  Supports $filter (eq, ne, not, ge, le, in, and eq on null values) and $orderBy.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Supports $filter (/$count eq 0, /$count ne 0). Read-only.
     */
    private DirectoryObject createdOnBehalfOf;
    /**
     * The defaultRedirectUri property
     */
    private String defaultRedirectUri;
    /**
     * Free text field to provide a description of the application object to end users. The maximum allowed size is 1024 characters. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     */
    private String description;
    /**
     * Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value), NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons may include suspicious, abusive, or malicious activity, or a violation of the Microsoft Services Agreement).  Supports $filter (eq, ne, not).
     */
    private String disabledByMicrosoftStatus;
    /**
     * The display name for the application. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     */
    private String displayName;
    /**
     * Read-only. Nullable. Supports $expand and $filter (/$count eq 0, /$count ne 0).
     */
    private java.util.List<ExtensionProperty> extensionProperties;
    /**
     * Federated identities for applications. Supports $expand and $filter (startsWith, /$count eq 0, /$count ne 0).
     */
    private java.util.List<FederatedIdentityCredential> federatedIdentityCredentials;
    /**
     * Configures the groups claim issued in a user or OAuth 2.0 access token that the application expects. To set this attribute, use one of the following valid string values: None, SecurityGroup (for security groups and Azure AD roles), All (this gets all of the security groups, distribution groups, and Azure AD directory roles that the signed-in user is a member of).
     */
    private String groupMembershipClaims;
    /**
     * The homeRealmDiscoveryPolicies property
     */
    private java.util.List<HomeRealmDiscoveryPolicy> homeRealmDiscoveryPolicies;
    /**
     * Also known as App ID URI, this value is set when an application is used as a resource app. The identifierUris acts as the prefix for the scopes you'll reference in your API's code, and it must be globally unique. You can use the default value provided, which is in the form api://<application-client-id>, or specify a more readable URI like https://contoso.com/api. For more information on valid identifierUris patterns and best practices, see Azure AD application registration security best practices. Not nullable. Supports $filter (eq, ne, ge, le, startsWith).
     */
    private java.util.List<String> identifierUris;
    /**
     * Basic profile information of the application such as  app's marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Azure AD apps. Supports $filter (eq, ne, not, ge, le, and eq on null values).
     */
    private InformationalUrl info;
    /**
     * Specifies whether this application supports device authentication without a user. The default is false.
     */
    private Boolean isDeviceOnlyAuthSupported;
    /**
     * Specifies the fallback application type as public client, such as an installed application running on a mobile device. The default value is false which means the fallback application type is confidential client such as a web app. There are certain scenarios where Azure AD cannot determine the client application type. For example, the ROPC flow where it is configured without specifying a redirect URI. In those cases Azure AD interprets the application type based on the value of this property.
     */
    private Boolean isFallbackPublicClient;
    /**
     * The collection of key credentials associated with the application. Not nullable. Supports $filter (eq, not, ge, le).
     */
    private java.util.List<KeyCredential> keyCredentials;
    /**
     * The main logo for the application. Not nullable.
     */
    private byte[] logo;
    /**
     * Notes relevant for the management of the application.
     */
    private String notes;
    /**
     * The oauth2RequirePostResponse property
     */
    private Boolean oauth2RequirePostResponse;
    /**
     * Application developers can configure optional claims in their Azure AD applications to specify the claims that are sent to their application by the Microsoft security token service. For more information, see How to: Provide optional claims to your app.
     */
    private OptionalClaims optionalClaims;
    /**
     * Directory objects that are owners of the application. Read-only. Nullable. Supports $expand, $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1), and $select nested in $expand.
     */
    private java.util.List<DirectoryObject> owners;
    /**
     * Specifies parental control settings for an application.
     */
    private ParentalControlSettings parentalControlSettings;
    /**
     * The collection of password credentials associated with the application. Not nullable.
     */
    private java.util.List<PasswordCredential> passwordCredentials;
    /**
     * Specifies settings for installed clients such as desktop or mobile devices.
     */
    private PublicClientApplication publicClient;
    /**
     * The verified publisher domain for the application. Read-only. For more information, see How to: Configure an application's publisher domain. Supports $filter (eq, ne, ge, le, startsWith).
     */
    private String publisherDomain;
    /**
     * Specifies whether this application requires Azure AD to verify the signed authentication requests.
     */
    private RequestSignatureVerification requestSignatureVerification;
    /**
     * Specifies the resources that the application needs to access. This property also specifies the set of delegated permissions and application roles that it needs for each of those resources. This configuration of access to the required resources drives the consent experience. No more than 50 resource services (APIs) can be configured. Beginning mid-October 2021, the total number of required permissions must not exceed 400. For more information, see Limits on requested permissions per app. Not nullable. Supports $filter (eq, not, ge, le).
     */
    private java.util.List<RequiredResourceAccess> requiredResourceAccess;
    /**
     * The URL where the service exposes SAML metadata for federation. This property is valid only for single-tenant applications. Nullable.
     */
    private String samlMetadataUrl;
    /**
     * References application or service contact information from a Service or Asset Management database. Nullable.
     */
    private String serviceManagementReference;
    /**
     * Specifies whether sensitive properties of a multi-tenant application should be locked for editing after the application is provisioned in a tenant. Nullable. null by default.
     */
    private ServicePrincipalLockConfiguration servicePrincipalLockConfiguration;
    /**
     * Specifies the Microsoft accounts that are supported for the current application. The possible values are: AzureADMyOrg, AzureADMultipleOrgs, AzureADandPersonalMicrosoftAccount (default), and PersonalMicrosoftAccount. See more in the table. The value of this object also limits the number of permissions an app can request. For more information, see Limits on requested permissions per app. The value for this property has implications on other app object properties. As a result, if you change this property, you may need to change other properties first. For more information, see Validation differences for signInAudience.Supports $filter (eq, ne, not).
     */
    private String signInAudience;
    /**
     * Specifies settings for a single-page application, including sign out URLs and redirect URIs for authorization codes and access tokens.
     */
    private SpaApplication spa;
    /**
     * Represents the capability for Azure Active Directory (Azure AD) identity synchronization through the Microsoft Graph API.
     */
    private Synchronization synchronization;
    /**
     * Custom strings that can be used to categorize and identify the application. Not nullable. Strings added here will also appear in the tags property of any associated service principals.Supports $filter (eq, not, ge, le, startsWith) and $search.
     */
    private java.util.List<String> tags;
    /**
     * Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD encrypts all the tokens it emits by using the key this property points to. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     */
    private UUID tokenEncryptionKeyId;
    /**
     * The tokenIssuancePolicies property
     */
    private java.util.List<TokenIssuancePolicy> tokenIssuancePolicies;
    /**
     * The tokenLifetimePolicies property
     */
    private java.util.List<TokenLifetimePolicy> tokenLifetimePolicies;
    /**
     * Specifies the verified publisher of the application. For more information about how publisher verification helps support application security, trustworthiness, and compliance, see Publisher verification.
     */
    private VerifiedPublisher verifiedPublisher;
    /**
     * Specifies settings for a web application.
     */
    private WebApplication web;
    /**
     * Instantiates a new application and sets the default values.
     */
    public Application() {
        super();
        this.setOdataType("#microsoft.graph.application");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a application
     */
    @jakarta.annotation.Nonnull
    public static Application createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Application();
    }
    /**
     * Gets the addIns property value. Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services like Office 365 call the application in the context of a document the user is working on.
     * @return a addIn
     */
    @jakarta.annotation.Nullable
    public java.util.List<AddIn> getAddIns() {
        return this.addIns;
    }
    /**
     * Gets the api property value. Specifies settings for an application that implements a web API.
     * @return a apiApplication
     */
    @jakarta.annotation.Nullable
    public ApiApplication getApi() {
        return this.api;
    }
    /**
     * Gets the appId property value. The unique identifier for the application that is assigned to an application by Azure AD. Not nullable. Read-only. Supports $filter (eq).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * Gets the applicationTemplateId property value. Unique identifier of the applicationTemplate. Supports $filter (eq, not, ne).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }
    /**
     * Gets the appManagementPolicies property value. The appManagementPolicy applied to this application.
     * @return a appManagementPolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppManagementPolicy> getAppManagementPolicies() {
        return this.appManagementPolicies;
    }
    /**
     * Gets the appRoles property value. The collection of roles defined for the application. With app role assignments, these roles can be assigned to users, groups, or service principals associated with other applications. Not nullable.
     * @return a appRole
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppRole> getAppRoles() {
        return this.appRoles;
    }
    /**
     * Gets the certification property value. Specifies the certification status of the application.
     * @return a certification
     */
    @jakarta.annotation.Nullable
    public Certification getCertification() {
        return this.certification;
    }
    /**
     * Gets the createdDateTime property value. The date and time the application was registered. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.  Supports $filter (eq, ne, not, ge, le, in, and eq on null values) and $orderBy.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the createdOnBehalfOf property value. Supports $filter (/$count eq 0, /$count ne 0). Read-only.
     * @return a directoryObject
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getCreatedOnBehalfOf() {
        return this.createdOnBehalfOf;
    }
    /**
     * Gets the defaultRedirectUri property value. The defaultRedirectUri property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDefaultRedirectUri() {
        return this.defaultRedirectUri;
    }
    /**
     * Gets the description property value. Free text field to provide a description of the application object to end users. The maximum allowed size is 1024 characters. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the disabledByMicrosoftStatus property value. Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value), NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons may include suspicious, abusive, or malicious activity, or a violation of the Microsoft Services Agreement).  Supports $filter (eq, ne, not).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisabledByMicrosoftStatus() {
        return this.disabledByMicrosoftStatus;
    }
    /**
     * Gets the displayName property value. The display name for the application. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the extensionProperties property value. Read-only. Nullable. Supports $expand and $filter (/$count eq 0, /$count ne 0).
     * @return a extensionProperty
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExtensionProperty> getExtensionProperties() {
        return this.extensionProperties;
    }
    /**
     * Gets the federatedIdentityCredentials property value. Federated identities for applications. Supports $expand and $filter (startsWith, /$count eq 0, /$count ne 0).
     * @return a federatedIdentityCredential
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
        deserializerMap.put("addIns", (n) -> { this.setAddIns(n.getCollectionOfObjectValues(AddIn::createFromDiscriminatorValue)); });
        deserializerMap.put("api", (n) -> { this.setApi(n.getObjectValue(ApiApplication::createFromDiscriminatorValue)); });
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("applicationTemplateId", (n) -> { this.setApplicationTemplateId(n.getStringValue()); });
        deserializerMap.put("appManagementPolicies", (n) -> { this.setAppManagementPolicies(n.getCollectionOfObjectValues(AppManagementPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("appRoles", (n) -> { this.setAppRoles(n.getCollectionOfObjectValues(AppRole::createFromDiscriminatorValue)); });
        deserializerMap.put("certification", (n) -> { this.setCertification(n.getObjectValue(Certification::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdOnBehalfOf", (n) -> { this.setCreatedOnBehalfOf(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultRedirectUri", (n) -> { this.setDefaultRedirectUri(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("disabledByMicrosoftStatus", (n) -> { this.setDisabledByMicrosoftStatus(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("extensionProperties", (n) -> { this.setExtensionProperties(n.getCollectionOfObjectValues(ExtensionProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("federatedIdentityCredentials", (n) -> { this.setFederatedIdentityCredentials(n.getCollectionOfObjectValues(FederatedIdentityCredential::createFromDiscriminatorValue)); });
        deserializerMap.put("groupMembershipClaims", (n) -> { this.setGroupMembershipClaims(n.getStringValue()); });
        deserializerMap.put("homeRealmDiscoveryPolicies", (n) -> { this.setHomeRealmDiscoveryPolicies(n.getCollectionOfObjectValues(HomeRealmDiscoveryPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("identifierUris", (n) -> { this.setIdentifierUris(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("info", (n) -> { this.setInfo(n.getObjectValue(InformationalUrl::createFromDiscriminatorValue)); });
        deserializerMap.put("isDeviceOnlyAuthSupported", (n) -> { this.setIsDeviceOnlyAuthSupported(n.getBooleanValue()); });
        deserializerMap.put("isFallbackPublicClient", (n) -> { this.setIsFallbackPublicClient(n.getBooleanValue()); });
        deserializerMap.put("keyCredentials", (n) -> { this.setKeyCredentials(n.getCollectionOfObjectValues(KeyCredential::createFromDiscriminatorValue)); });
        deserializerMap.put("logo", (n) -> { this.setLogo(n.getByteArrayValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("oauth2RequirePostResponse", (n) -> { this.setOauth2RequirePostResponse(n.getBooleanValue()); });
        deserializerMap.put("optionalClaims", (n) -> { this.setOptionalClaims(n.getObjectValue(OptionalClaims::createFromDiscriminatorValue)); });
        deserializerMap.put("owners", (n) -> { this.setOwners(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("parentalControlSettings", (n) -> { this.setParentalControlSettings(n.getObjectValue(ParentalControlSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("passwordCredentials", (n) -> { this.setPasswordCredentials(n.getCollectionOfObjectValues(PasswordCredential::createFromDiscriminatorValue)); });
        deserializerMap.put("publicClient", (n) -> { this.setPublicClient(n.getObjectValue(PublicClientApplication::createFromDiscriminatorValue)); });
        deserializerMap.put("publisherDomain", (n) -> { this.setPublisherDomain(n.getStringValue()); });
        deserializerMap.put("requestSignatureVerification", (n) -> { this.setRequestSignatureVerification(n.getObjectValue(RequestSignatureVerification::createFromDiscriminatorValue)); });
        deserializerMap.put("requiredResourceAccess", (n) -> { this.setRequiredResourceAccess(n.getCollectionOfObjectValues(RequiredResourceAccess::createFromDiscriminatorValue)); });
        deserializerMap.put("samlMetadataUrl", (n) -> { this.setSamlMetadataUrl(n.getStringValue()); });
        deserializerMap.put("serviceManagementReference", (n) -> { this.setServiceManagementReference(n.getStringValue()); });
        deserializerMap.put("servicePrincipalLockConfiguration", (n) -> { this.setServicePrincipalLockConfiguration(n.getObjectValue(ServicePrincipalLockConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("signInAudience", (n) -> { this.setSignInAudience(n.getStringValue()); });
        deserializerMap.put("spa", (n) -> { this.setSpa(n.getObjectValue(SpaApplication::createFromDiscriminatorValue)); });
        deserializerMap.put("synchronization", (n) -> { this.setSynchronization(n.getObjectValue(Synchronization::createFromDiscriminatorValue)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tokenEncryptionKeyId", (n) -> { this.setTokenEncryptionKeyId(n.getUUIDValue()); });
        deserializerMap.put("tokenIssuancePolicies", (n) -> { this.setTokenIssuancePolicies(n.getCollectionOfObjectValues(TokenIssuancePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("tokenLifetimePolicies", (n) -> { this.setTokenLifetimePolicies(n.getCollectionOfObjectValues(TokenLifetimePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("verifiedPublisher", (n) -> { this.setVerifiedPublisher(n.getObjectValue(VerifiedPublisher::createFromDiscriminatorValue)); });
        deserializerMap.put("web", (n) -> { this.setWeb(n.getObjectValue(WebApplication::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupMembershipClaims property value. Configures the groups claim issued in a user or OAuth 2.0 access token that the application expects. To set this attribute, use one of the following valid string values: None, SecurityGroup (for security groups and Azure AD roles), All (this gets all of the security groups, distribution groups, and Azure AD directory roles that the signed-in user is a member of).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getGroupMembershipClaims() {
        return this.groupMembershipClaims;
    }
    /**
     * Gets the homeRealmDiscoveryPolicies property value. The homeRealmDiscoveryPolicies property
     * @return a homeRealmDiscoveryPolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<HomeRealmDiscoveryPolicy> getHomeRealmDiscoveryPolicies() {
        return this.homeRealmDiscoveryPolicies;
    }
    /**
     * Gets the identifierUris property value. Also known as App ID URI, this value is set when an application is used as a resource app. The identifierUris acts as the prefix for the scopes you'll reference in your API's code, and it must be globally unique. You can use the default value provided, which is in the form api://<application-client-id>, or specify a more readable URI like https://contoso.com/api. For more information on valid identifierUris patterns and best practices, see Azure AD application registration security best practices. Not nullable. Supports $filter (eq, ne, ge, le, startsWith).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIdentifierUris() {
        return this.identifierUris;
    }
    /**
     * Gets the info property value. Basic profile information of the application such as  app's marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Azure AD apps. Supports $filter (eq, ne, not, ge, le, and eq on null values).
     * @return a informationalUrl
     */
    @jakarta.annotation.Nullable
    public InformationalUrl getInfo() {
        return this.info;
    }
    /**
     * Gets the isDeviceOnlyAuthSupported property value. Specifies whether this application supports device authentication without a user. The default is false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDeviceOnlyAuthSupported() {
        return this.isDeviceOnlyAuthSupported;
    }
    /**
     * Gets the isFallbackPublicClient property value. Specifies the fallback application type as public client, such as an installed application running on a mobile device. The default value is false which means the fallback application type is confidential client such as a web app. There are certain scenarios where Azure AD cannot determine the client application type. For example, the ROPC flow where it is configured without specifying a redirect URI. In those cases Azure AD interprets the application type based on the value of this property.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFallbackPublicClient() {
        return this.isFallbackPublicClient;
    }
    /**
     * Gets the keyCredentials property value. The collection of key credentials associated with the application. Not nullable. Supports $filter (eq, not, ge, le).
     * @return a keyCredential
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyCredential> getKeyCredentials() {
        return this.keyCredentials;
    }
    /**
     * Gets the logo property value. The main logo for the application. Not nullable.
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getLogo() {
        return this.logo;
    }
    /**
     * Gets the notes property value. Notes relevant for the management of the application.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.notes;
    }
    /**
     * Gets the oauth2RequirePostResponse property value. The oauth2RequirePostResponse property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOauth2RequirePostResponse() {
        return this.oauth2RequirePostResponse;
    }
    /**
     * Gets the optionalClaims property value. Application developers can configure optional claims in their Azure AD applications to specify the claims that are sent to their application by the Microsoft security token service. For more information, see How to: Provide optional claims to your app.
     * @return a optionalClaims
     */
    @jakarta.annotation.Nullable
    public OptionalClaims getOptionalClaims() {
        return this.optionalClaims;
    }
    /**
     * Gets the owners property value. Directory objects that are owners of the application. Read-only. Nullable. Supports $expand, $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1), and $select nested in $expand.
     * @return a directoryObject
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getOwners() {
        return this.owners;
    }
    /**
     * Gets the parentalControlSettings property value. Specifies parental control settings for an application.
     * @return a parentalControlSettings
     */
    @jakarta.annotation.Nullable
    public ParentalControlSettings getParentalControlSettings() {
        return this.parentalControlSettings;
    }
    /**
     * Gets the passwordCredentials property value. The collection of password credentials associated with the application. Not nullable.
     * @return a passwordCredential
     */
    @jakarta.annotation.Nullable
    public java.util.List<PasswordCredential> getPasswordCredentials() {
        return this.passwordCredentials;
    }
    /**
     * Gets the publicClient property value. Specifies settings for installed clients such as desktop or mobile devices.
     * @return a publicClientApplication
     */
    @jakarta.annotation.Nullable
    public PublicClientApplication getPublicClient() {
        return this.publicClient;
    }
    /**
     * Gets the publisherDomain property value. The verified publisher domain for the application. Read-only. For more information, see How to: Configure an application's publisher domain. Supports $filter (eq, ne, ge, le, startsWith).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPublisherDomain() {
        return this.publisherDomain;
    }
    /**
     * Gets the requestSignatureVerification property value. Specifies whether this application requires Azure AD to verify the signed authentication requests.
     * @return a requestSignatureVerification
     */
    @jakarta.annotation.Nullable
    public RequestSignatureVerification getRequestSignatureVerification() {
        return this.requestSignatureVerification;
    }
    /**
     * Gets the requiredResourceAccess property value. Specifies the resources that the application needs to access. This property also specifies the set of delegated permissions and application roles that it needs for each of those resources. This configuration of access to the required resources drives the consent experience. No more than 50 resource services (APIs) can be configured. Beginning mid-October 2021, the total number of required permissions must not exceed 400. For more information, see Limits on requested permissions per app. Not nullable. Supports $filter (eq, not, ge, le).
     * @return a requiredResourceAccess
     */
    @jakarta.annotation.Nullable
    public java.util.List<RequiredResourceAccess> getRequiredResourceAccess() {
        return this.requiredResourceAccess;
    }
    /**
     * Gets the samlMetadataUrl property value. The URL where the service exposes SAML metadata for federation. This property is valid only for single-tenant applications. Nullable.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSamlMetadataUrl() {
        return this.samlMetadataUrl;
    }
    /**
     * Gets the serviceManagementReference property value. References application or service contact information from a Service or Asset Management database. Nullable.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getServiceManagementReference() {
        return this.serviceManagementReference;
    }
    /**
     * Gets the servicePrincipalLockConfiguration property value. Specifies whether sensitive properties of a multi-tenant application should be locked for editing after the application is provisioned in a tenant. Nullable. null by default.
     * @return a servicePrincipalLockConfiguration
     */
    @jakarta.annotation.Nullable
    public ServicePrincipalLockConfiguration getServicePrincipalLockConfiguration() {
        return this.servicePrincipalLockConfiguration;
    }
    /**
     * Gets the signInAudience property value. Specifies the Microsoft accounts that are supported for the current application. The possible values are: AzureADMyOrg, AzureADMultipleOrgs, AzureADandPersonalMicrosoftAccount (default), and PersonalMicrosoftAccount. See more in the table. The value of this object also limits the number of permissions an app can request. For more information, see Limits on requested permissions per app. The value for this property has implications on other app object properties. As a result, if you change this property, you may need to change other properties first. For more information, see Validation differences for signInAudience.Supports $filter (eq, ne, not).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSignInAudience() {
        return this.signInAudience;
    }
    /**
     * Gets the spa property value. Specifies settings for a single-page application, including sign out URLs and redirect URIs for authorization codes and access tokens.
     * @return a spaApplication
     */
    @jakarta.annotation.Nullable
    public SpaApplication getSpa() {
        return this.spa;
    }
    /**
     * Gets the synchronization property value. Represents the capability for Azure Active Directory (Azure AD) identity synchronization through the Microsoft Graph API.
     * @return a synchronization
     */
    @jakarta.annotation.Nullable
    public Synchronization getSynchronization() {
        return this.synchronization;
    }
    /**
     * Gets the tags property value. Custom strings that can be used to categorize and identify the application. Not nullable. Strings added here will also appear in the tags property of any associated service principals.Supports $filter (eq, not, ge, le, startsWith) and $search.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.tags;
    }
    /**
     * Gets the tokenEncryptionKeyId property value. Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD encrypts all the tokens it emits by using the key this property points to. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getTokenEncryptionKeyId() {
        return this.tokenEncryptionKeyId;
    }
    /**
     * Gets the tokenIssuancePolicies property value. The tokenIssuancePolicies property
     * @return a tokenIssuancePolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<TokenIssuancePolicy> getTokenIssuancePolicies() {
        return this.tokenIssuancePolicies;
    }
    /**
     * Gets the tokenLifetimePolicies property value. The tokenLifetimePolicies property
     * @return a tokenLifetimePolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<TokenLifetimePolicy> getTokenLifetimePolicies() {
        return this.tokenLifetimePolicies;
    }
    /**
     * Gets the verifiedPublisher property value. Specifies the verified publisher of the application. For more information about how publisher verification helps support application security, trustworthiness, and compliance, see Publisher verification.
     * @return a verifiedPublisher
     */
    @jakarta.annotation.Nullable
    public VerifiedPublisher getVerifiedPublisher() {
        return this.verifiedPublisher;
    }
    /**
     * Gets the web property value. Specifies settings for a web application.
     * @return a webApplication
     */
    @jakarta.annotation.Nullable
    public WebApplication getWeb() {
        return this.web;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("addIns", this.getAddIns());
        writer.writeObjectValue("api", this.getApi());
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("applicationTemplateId", this.getApplicationTemplateId());
        writer.writeCollectionOfObjectValues("appManagementPolicies", this.getAppManagementPolicies());
        writer.writeCollectionOfObjectValues("appRoles", this.getAppRoles());
        writer.writeObjectValue("certification", this.getCertification());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("createdOnBehalfOf", this.getCreatedOnBehalfOf());
        writer.writeStringValue("defaultRedirectUri", this.getDefaultRedirectUri());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("disabledByMicrosoftStatus", this.getDisabledByMicrosoftStatus());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("extensionProperties", this.getExtensionProperties());
        writer.writeCollectionOfObjectValues("federatedIdentityCredentials", this.getFederatedIdentityCredentials());
        writer.writeStringValue("groupMembershipClaims", this.getGroupMembershipClaims());
        writer.writeCollectionOfObjectValues("homeRealmDiscoveryPolicies", this.getHomeRealmDiscoveryPolicies());
        writer.writeCollectionOfPrimitiveValues("identifierUris", this.getIdentifierUris());
        writer.writeObjectValue("info", this.getInfo());
        writer.writeBooleanValue("isDeviceOnlyAuthSupported", this.getIsDeviceOnlyAuthSupported());
        writer.writeBooleanValue("isFallbackPublicClient", this.getIsFallbackPublicClient());
        writer.writeCollectionOfObjectValues("keyCredentials", this.getKeyCredentials());
        writer.writeByteArrayValue("logo", this.getLogo());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeBooleanValue("oauth2RequirePostResponse", this.getOauth2RequirePostResponse());
        writer.writeObjectValue("optionalClaims", this.getOptionalClaims());
        writer.writeCollectionOfObjectValues("owners", this.getOwners());
        writer.writeObjectValue("parentalControlSettings", this.getParentalControlSettings());
        writer.writeCollectionOfObjectValues("passwordCredentials", this.getPasswordCredentials());
        writer.writeObjectValue("publicClient", this.getPublicClient());
        writer.writeStringValue("publisherDomain", this.getPublisherDomain());
        writer.writeObjectValue("requestSignatureVerification", this.getRequestSignatureVerification());
        writer.writeCollectionOfObjectValues("requiredResourceAccess", this.getRequiredResourceAccess());
        writer.writeStringValue("samlMetadataUrl", this.getSamlMetadataUrl());
        writer.writeStringValue("serviceManagementReference", this.getServiceManagementReference());
        writer.writeObjectValue("servicePrincipalLockConfiguration", this.getServicePrincipalLockConfiguration());
        writer.writeStringValue("signInAudience", this.getSignInAudience());
        writer.writeObjectValue("spa", this.getSpa());
        writer.writeObjectValue("synchronization", this.getSynchronization());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeUUIDValue("tokenEncryptionKeyId", this.getTokenEncryptionKeyId());
        writer.writeCollectionOfObjectValues("tokenIssuancePolicies", this.getTokenIssuancePolicies());
        writer.writeCollectionOfObjectValues("tokenLifetimePolicies", this.getTokenLifetimePolicies());
        writer.writeObjectValue("verifiedPublisher", this.getVerifiedPublisher());
        writer.writeObjectValue("web", this.getWeb());
    }
    /**
     * Sets the addIns property value. Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services like Office 365 call the application in the context of a document the user is working on.
     * @param value Value to set for the addIns property.
     */
    public void setAddIns(@jakarta.annotation.Nullable final java.util.List<AddIn> value) {
        this.addIns = value;
    }
    /**
     * Sets the api property value. Specifies settings for an application that implements a web API.
     * @param value Value to set for the api property.
     */
    public void setApi(@jakarta.annotation.Nullable final ApiApplication value) {
        this.api = value;
    }
    /**
     * Sets the appId property value. The unique identifier for the application that is assigned to an application by Azure AD. Not nullable. Read-only. Supports $filter (eq).
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.appId = value;
    }
    /**
     * Sets the applicationTemplateId property value. Unique identifier of the applicationTemplate. Supports $filter (eq, not, ne).
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
     * Sets the appRoles property value. The collection of roles defined for the application. With app role assignments, these roles can be assigned to users, groups, or service principals associated with other applications. Not nullable.
     * @param value Value to set for the appRoles property.
     */
    public void setAppRoles(@jakarta.annotation.Nullable final java.util.List<AppRole> value) {
        this.appRoles = value;
    }
    /**
     * Sets the certification property value. Specifies the certification status of the application.
     * @param value Value to set for the certification property.
     */
    public void setCertification(@jakarta.annotation.Nullable final Certification value) {
        this.certification = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the application was registered. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.  Supports $filter (eq, ne, not, ge, le, in, and eq on null values) and $orderBy.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the createdOnBehalfOf property value. Supports $filter (/$count eq 0, /$count ne 0). Read-only.
     * @param value Value to set for the createdOnBehalfOf property.
     */
    public void setCreatedOnBehalfOf(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.createdOnBehalfOf = value;
    }
    /**
     * Sets the defaultRedirectUri property value. The defaultRedirectUri property
     * @param value Value to set for the defaultRedirectUri property.
     */
    public void setDefaultRedirectUri(@jakarta.annotation.Nullable final String value) {
        this.defaultRedirectUri = value;
    }
    /**
     * Sets the description property value. Free text field to provide a description of the application object to end users. The maximum allowed size is 1024 characters. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
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
     * Sets the displayName property value. The display name for the application. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the extensionProperties property value. Read-only. Nullable. Supports $expand and $filter (/$count eq 0, /$count ne 0).
     * @param value Value to set for the extensionProperties property.
     */
    public void setExtensionProperties(@jakarta.annotation.Nullable final java.util.List<ExtensionProperty> value) {
        this.extensionProperties = value;
    }
    /**
     * Sets the federatedIdentityCredentials property value. Federated identities for applications. Supports $expand and $filter (startsWith, /$count eq 0, /$count ne 0).
     * @param value Value to set for the federatedIdentityCredentials property.
     */
    public void setFederatedIdentityCredentials(@jakarta.annotation.Nullable final java.util.List<FederatedIdentityCredential> value) {
        this.federatedIdentityCredentials = value;
    }
    /**
     * Sets the groupMembershipClaims property value. Configures the groups claim issued in a user or OAuth 2.0 access token that the application expects. To set this attribute, use one of the following valid string values: None, SecurityGroup (for security groups and Azure AD roles), All (this gets all of the security groups, distribution groups, and Azure AD directory roles that the signed-in user is a member of).
     * @param value Value to set for the groupMembershipClaims property.
     */
    public void setGroupMembershipClaims(@jakarta.annotation.Nullable final String value) {
        this.groupMembershipClaims = value;
    }
    /**
     * Sets the homeRealmDiscoveryPolicies property value. The homeRealmDiscoveryPolicies property
     * @param value Value to set for the homeRealmDiscoveryPolicies property.
     */
    public void setHomeRealmDiscoveryPolicies(@jakarta.annotation.Nullable final java.util.List<HomeRealmDiscoveryPolicy> value) {
        this.homeRealmDiscoveryPolicies = value;
    }
    /**
     * Sets the identifierUris property value. Also known as App ID URI, this value is set when an application is used as a resource app. The identifierUris acts as the prefix for the scopes you'll reference in your API's code, and it must be globally unique. You can use the default value provided, which is in the form api://<application-client-id>, or specify a more readable URI like https://contoso.com/api. For more information on valid identifierUris patterns and best practices, see Azure AD application registration security best practices. Not nullable. Supports $filter (eq, ne, ge, le, startsWith).
     * @param value Value to set for the identifierUris property.
     */
    public void setIdentifierUris(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.identifierUris = value;
    }
    /**
     * Sets the info property value. Basic profile information of the application such as  app's marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Azure AD apps. Supports $filter (eq, ne, not, ge, le, and eq on null values).
     * @param value Value to set for the info property.
     */
    public void setInfo(@jakarta.annotation.Nullable final InformationalUrl value) {
        this.info = value;
    }
    /**
     * Sets the isDeviceOnlyAuthSupported property value. Specifies whether this application supports device authentication without a user. The default is false.
     * @param value Value to set for the isDeviceOnlyAuthSupported property.
     */
    public void setIsDeviceOnlyAuthSupported(@jakarta.annotation.Nullable final Boolean value) {
        this.isDeviceOnlyAuthSupported = value;
    }
    /**
     * Sets the isFallbackPublicClient property value. Specifies the fallback application type as public client, such as an installed application running on a mobile device. The default value is false which means the fallback application type is confidential client such as a web app. There are certain scenarios where Azure AD cannot determine the client application type. For example, the ROPC flow where it is configured without specifying a redirect URI. In those cases Azure AD interprets the application type based on the value of this property.
     * @param value Value to set for the isFallbackPublicClient property.
     */
    public void setIsFallbackPublicClient(@jakarta.annotation.Nullable final Boolean value) {
        this.isFallbackPublicClient = value;
    }
    /**
     * Sets the keyCredentials property value. The collection of key credentials associated with the application. Not nullable. Supports $filter (eq, not, ge, le).
     * @param value Value to set for the keyCredentials property.
     */
    public void setKeyCredentials(@jakarta.annotation.Nullable final java.util.List<KeyCredential> value) {
        this.keyCredentials = value;
    }
    /**
     * Sets the logo property value. The main logo for the application. Not nullable.
     * @param value Value to set for the logo property.
     */
    public void setLogo(@jakarta.annotation.Nullable final byte[] value) {
        this.logo = value;
    }
    /**
     * Sets the notes property value. Notes relevant for the management of the application.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.notes = value;
    }
    /**
     * Sets the oauth2RequirePostResponse property value. The oauth2RequirePostResponse property
     * @param value Value to set for the oauth2RequirePostResponse property.
     */
    public void setOauth2RequirePostResponse(@jakarta.annotation.Nullable final Boolean value) {
        this.oauth2RequirePostResponse = value;
    }
    /**
     * Sets the optionalClaims property value. Application developers can configure optional claims in their Azure AD applications to specify the claims that are sent to their application by the Microsoft security token service. For more information, see How to: Provide optional claims to your app.
     * @param value Value to set for the optionalClaims property.
     */
    public void setOptionalClaims(@jakarta.annotation.Nullable final OptionalClaims value) {
        this.optionalClaims = value;
    }
    /**
     * Sets the owners property value. Directory objects that are owners of the application. Read-only. Nullable. Supports $expand, $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1), and $select nested in $expand.
     * @param value Value to set for the owners property.
     */
    public void setOwners(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.owners = value;
    }
    /**
     * Sets the parentalControlSettings property value. Specifies parental control settings for an application.
     * @param value Value to set for the parentalControlSettings property.
     */
    public void setParentalControlSettings(@jakarta.annotation.Nullable final ParentalControlSettings value) {
        this.parentalControlSettings = value;
    }
    /**
     * Sets the passwordCredentials property value. The collection of password credentials associated with the application. Not nullable.
     * @param value Value to set for the passwordCredentials property.
     */
    public void setPasswordCredentials(@jakarta.annotation.Nullable final java.util.List<PasswordCredential> value) {
        this.passwordCredentials = value;
    }
    /**
     * Sets the publicClient property value. Specifies settings for installed clients such as desktop or mobile devices.
     * @param value Value to set for the publicClient property.
     */
    public void setPublicClient(@jakarta.annotation.Nullable final PublicClientApplication value) {
        this.publicClient = value;
    }
    /**
     * Sets the publisherDomain property value. The verified publisher domain for the application. Read-only. For more information, see How to: Configure an application's publisher domain. Supports $filter (eq, ne, ge, le, startsWith).
     * @param value Value to set for the publisherDomain property.
     */
    public void setPublisherDomain(@jakarta.annotation.Nullable final String value) {
        this.publisherDomain = value;
    }
    /**
     * Sets the requestSignatureVerification property value. Specifies whether this application requires Azure AD to verify the signed authentication requests.
     * @param value Value to set for the requestSignatureVerification property.
     */
    public void setRequestSignatureVerification(@jakarta.annotation.Nullable final RequestSignatureVerification value) {
        this.requestSignatureVerification = value;
    }
    /**
     * Sets the requiredResourceAccess property value. Specifies the resources that the application needs to access. This property also specifies the set of delegated permissions and application roles that it needs for each of those resources. This configuration of access to the required resources drives the consent experience. No more than 50 resource services (APIs) can be configured. Beginning mid-October 2021, the total number of required permissions must not exceed 400. For more information, see Limits on requested permissions per app. Not nullable. Supports $filter (eq, not, ge, le).
     * @param value Value to set for the requiredResourceAccess property.
     */
    public void setRequiredResourceAccess(@jakarta.annotation.Nullable final java.util.List<RequiredResourceAccess> value) {
        this.requiredResourceAccess = value;
    }
    /**
     * Sets the samlMetadataUrl property value. The URL where the service exposes SAML metadata for federation. This property is valid only for single-tenant applications. Nullable.
     * @param value Value to set for the samlMetadataUrl property.
     */
    public void setSamlMetadataUrl(@jakarta.annotation.Nullable final String value) {
        this.samlMetadataUrl = value;
    }
    /**
     * Sets the serviceManagementReference property value. References application or service contact information from a Service or Asset Management database. Nullable.
     * @param value Value to set for the serviceManagementReference property.
     */
    public void setServiceManagementReference(@jakarta.annotation.Nullable final String value) {
        this.serviceManagementReference = value;
    }
    /**
     * Sets the servicePrincipalLockConfiguration property value. Specifies whether sensitive properties of a multi-tenant application should be locked for editing after the application is provisioned in a tenant. Nullable. null by default.
     * @param value Value to set for the servicePrincipalLockConfiguration property.
     */
    public void setServicePrincipalLockConfiguration(@jakarta.annotation.Nullable final ServicePrincipalLockConfiguration value) {
        this.servicePrincipalLockConfiguration = value;
    }
    /**
     * Sets the signInAudience property value. Specifies the Microsoft accounts that are supported for the current application. The possible values are: AzureADMyOrg, AzureADMultipleOrgs, AzureADandPersonalMicrosoftAccount (default), and PersonalMicrosoftAccount. See more in the table. The value of this object also limits the number of permissions an app can request. For more information, see Limits on requested permissions per app. The value for this property has implications on other app object properties. As a result, if you change this property, you may need to change other properties first. For more information, see Validation differences for signInAudience.Supports $filter (eq, ne, not).
     * @param value Value to set for the signInAudience property.
     */
    public void setSignInAudience(@jakarta.annotation.Nullable final String value) {
        this.signInAudience = value;
    }
    /**
     * Sets the spa property value. Specifies settings for a single-page application, including sign out URLs and redirect URIs for authorization codes and access tokens.
     * @param value Value to set for the spa property.
     */
    public void setSpa(@jakarta.annotation.Nullable final SpaApplication value) {
        this.spa = value;
    }
    /**
     * Sets the synchronization property value. Represents the capability for Azure Active Directory (Azure AD) identity synchronization through the Microsoft Graph API.
     * @param value Value to set for the synchronization property.
     */
    public void setSynchronization(@jakarta.annotation.Nullable final Synchronization value) {
        this.synchronization = value;
    }
    /**
     * Sets the tags property value. Custom strings that can be used to categorize and identify the application. Not nullable. Strings added here will also appear in the tags property of any associated service principals.Supports $filter (eq, not, ge, le, startsWith) and $search.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.tags = value;
    }
    /**
     * Sets the tokenEncryptionKeyId property value. Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD encrypts all the tokens it emits by using the key this property points to. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     * @param value Value to set for the tokenEncryptionKeyId property.
     */
    public void setTokenEncryptionKeyId(@jakarta.annotation.Nullable final UUID value) {
        this.tokenEncryptionKeyId = value;
    }
    /**
     * Sets the tokenIssuancePolicies property value. The tokenIssuancePolicies property
     * @param value Value to set for the tokenIssuancePolicies property.
     */
    public void setTokenIssuancePolicies(@jakarta.annotation.Nullable final java.util.List<TokenIssuancePolicy> value) {
        this.tokenIssuancePolicies = value;
    }
    /**
     * Sets the tokenLifetimePolicies property value. The tokenLifetimePolicies property
     * @param value Value to set for the tokenLifetimePolicies property.
     */
    public void setTokenLifetimePolicies(@jakarta.annotation.Nullable final java.util.List<TokenLifetimePolicy> value) {
        this.tokenLifetimePolicies = value;
    }
    /**
     * Sets the verifiedPublisher property value. Specifies the verified publisher of the application. For more information about how publisher verification helps support application security, trustworthiness, and compliance, see Publisher verification.
     * @param value Value to set for the verifiedPublisher property.
     */
    public void setVerifiedPublisher(@jakarta.annotation.Nullable final VerifiedPublisher value) {
        this.verifiedPublisher = value;
    }
    /**
     * Sets the web property value. Specifies settings for a web application.
     * @param value Value to set for the web property.
     */
    public void setWeb(@jakarta.annotation.Nullable final WebApplication value) {
        this.web = value;
    }
}
