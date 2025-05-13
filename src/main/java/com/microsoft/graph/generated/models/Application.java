package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Application extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link Application} and sets the default values.
     */
    public Application() {
        super();
        this.setOdataType("#microsoft.graph.application");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Application}
     */
    @jakarta.annotation.Nonnull
    public static Application createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Application();
    }
    /**
     * Gets the addIns property value. Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications that can render file streams can set the addIns property for its &apos;FileHandler&apos; functionality. This lets services like Microsoft 365 call the application in the context of a document the user is working on.
     * @return a {@link java.util.List<AddIn>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AddIn> getAddIns() {
        return this.backingStore.get("addIns");
    }
    /**
     * Gets the api property value. Specifies settings for an application that implements a web API.
     * @return a {@link ApiApplication}
     */
    @jakarta.annotation.Nullable
    public ApiApplication getApi() {
        return this.backingStore.get("api");
    }
    /**
     * Gets the appId property value. The unique identifier for the application that is assigned to an application by Microsoft Entra ID. Not nullable. Read-only. Alternate key. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.backingStore.get("appId");
    }
    /**
     * Gets the applicationTemplateId property value. Unique identifier of the applicationTemplate. Supports $filter (eq, not, ne). Read-only. null if the app wasn&apos;t created from an application template.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicationTemplateId() {
        return this.backingStore.get("applicationTemplateId");
    }
    /**
     * Gets the appManagementPolicies property value. The appManagementPolicy applied to this application.
     * @return a {@link java.util.List<AppManagementPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppManagementPolicy> getAppManagementPolicies() {
        return this.backingStore.get("appManagementPolicies");
    }
    /**
     * Gets the appRoles property value. The collection of roles defined for the application. With app role assignments, these roles can be assigned to users, groups, or service principals associated with other applications. Not nullable.
     * @return a {@link java.util.List<AppRole>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppRole> getAppRoles() {
        return this.backingStore.get("appRoles");
    }
    /**
     * Gets the authenticationBehaviors property value. The authenticationBehaviors property
     * @return a {@link AuthenticationBehaviors}
     */
    @jakarta.annotation.Nullable
    public AuthenticationBehaviors getAuthenticationBehaviors() {
        return this.backingStore.get("authenticationBehaviors");
    }
    /**
     * Gets the certification property value. Specifies the certification status of the application.
     * @return a {@link Certification}
     */
    @jakarta.annotation.Nullable
    public Certification getCertification() {
        return this.backingStore.get("certification");
    }
    /**
     * Gets the createdDateTime property value. The date and time the application was registered. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.  Supports $filter (eq, ne, not, ge, le, in, and eq on null values) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the createdOnBehalfOf property value. Supports $filter (/$count eq 0, /$count ne 0). Read-only.
     * @return a {@link DirectoryObject}
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getCreatedOnBehalfOf() {
        return this.backingStore.get("createdOnBehalfOf");
    }
    /**
     * Gets the defaultRedirectUri property value. The defaultRedirectUri property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultRedirectUri() {
        return this.backingStore.get("defaultRedirectUri");
    }
    /**
     * Gets the description property value. Free text field to provide a description of the application object to end users. The maximum allowed size is 1,024 characters. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the disabledByMicrosoftStatus property value. Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value), NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons include suspicious, abusive, or malicious activity, or a violation of the Microsoft Services Agreement).  Supports $filter (eq, ne, not).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisabledByMicrosoftStatus() {
        return this.backingStore.get("disabledByMicrosoftStatus");
    }
    /**
     * Gets the displayName property value. The display name for the application. Maximum length is 256 characters. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the extensionProperties property value. Read-only. Nullable. Supports $expand and $filter (/$count eq 0, /$count ne 0).
     * @return a {@link java.util.List<ExtensionProperty>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExtensionProperty> getExtensionProperties() {
        return this.backingStore.get("extensionProperties");
    }
    /**
     * Gets the federatedIdentityCredentials property value. Federated identities for applications. Supports $expand and $filter (startsWith, /$count eq 0, /$count ne 0).
     * @return a {@link java.util.List<FederatedIdentityCredential>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FederatedIdentityCredential> getFederatedIdentityCredentials() {
        return this.backingStore.get("federatedIdentityCredentials");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
        deserializerMap.put("authenticationBehaviors", (n) -> { this.setAuthenticationBehaviors(n.getObjectValue(AuthenticationBehaviors::createFromDiscriminatorValue)); });
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
        deserializerMap.put("nativeAuthenticationApisEnabled", (n) -> { this.setNativeAuthenticationApisEnabled(n.getEnumSetValue(NativeAuthenticationApisEnabled::forValue)); });
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
        deserializerMap.put("uniqueName", (n) -> { this.setUniqueName(n.getStringValue()); });
        deserializerMap.put("verifiedPublisher", (n) -> { this.setVerifiedPublisher(n.getObjectValue(VerifiedPublisher::createFromDiscriminatorValue)); });
        deserializerMap.put("web", (n) -> { this.setWeb(n.getObjectValue(WebApplication::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupMembershipClaims property value. Configures the groups claim issued in a user or OAuth 2.0 access token that the application expects. To set this attribute, use one of the following valid string values: None, SecurityGroup (for security groups and Microsoft Entra roles), All (this gets all of the security groups, distribution groups, and Microsoft Entra directory roles that the signed-in user is a member of).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGroupMembershipClaims() {
        return this.backingStore.get("groupMembershipClaims");
    }
    /**
     * Gets the homeRealmDiscoveryPolicies property value. The homeRealmDiscoveryPolicies property
     * @return a {@link java.util.List<HomeRealmDiscoveryPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HomeRealmDiscoveryPolicy> getHomeRealmDiscoveryPolicies() {
        return this.backingStore.get("homeRealmDiscoveryPolicies");
    }
    /**
     * Gets the identifierUris property value. Also known as App ID URI, this value is set when an application is used as a resource app. The identifierUris acts as the prefix for the scopes you reference in your API&apos;s code, and it must be globally unique. For more information on valid identifierUris patterns and best practices, see Microsoft Entra application registration security best practices. Not nullable. Supports $filter (eq, ne, ge, le, startsWith).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIdentifierUris() {
        return this.backingStore.get("identifierUris");
    }
    /**
     * Gets the info property value. Basic profile information of the application such as  app&apos;s marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Microsoft Entra apps. Supports $filter (eq, ne, not, ge, le, and eq on null values).
     * @return a {@link InformationalUrl}
     */
    @jakarta.annotation.Nullable
    public InformationalUrl getInfo() {
        return this.backingStore.get("info");
    }
    /**
     * Gets the isDeviceOnlyAuthSupported property value. Specifies whether this application supports device authentication without a user. The default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDeviceOnlyAuthSupported() {
        return this.backingStore.get("isDeviceOnlyAuthSupported");
    }
    /**
     * Gets the isFallbackPublicClient property value. Specifies the fallback application type as public client, such as an installed application running on a mobile device. The default value is false, which means the fallback application type is confidential client such as a web app. There are certain scenarios where Microsoft Entra ID can&apos;t determine the client application type. For example, the ROPC flow where it&apos;s configured without specifying a redirect URI. In those cases, Microsoft Entra ID interprets the application type based on the value of this property.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFallbackPublicClient() {
        return this.backingStore.get("isFallbackPublicClient");
    }
    /**
     * Gets the keyCredentials property value. The collection of key credentials associated with the application. Not nullable. Supports $filter (eq, not, ge, le).
     * @return a {@link java.util.List<KeyCredential>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyCredential> getKeyCredentials() {
        return this.backingStore.get("keyCredentials");
    }
    /**
     * Gets the logo property value. The main logo for the application. Not nullable.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getLogo() {
        return this.backingStore.get("logo");
    }
    /**
     * Gets the nativeAuthenticationApisEnabled property value. Specifies whether the Native Authentication APIs are enabled for the application. The possible values are: none and all. Default is none. For more information, see Native Authentication.
     * @return a {@link EnumSet<NativeAuthenticationApisEnabled>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<NativeAuthenticationApisEnabled> getNativeAuthenticationApisEnabled() {
        return this.backingStore.get("nativeAuthenticationApisEnabled");
    }
    /**
     * Gets the notes property value. Notes relevant for the management of the application.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.backingStore.get("notes");
    }
    /**
     * Gets the oauth2RequirePostResponse property value. The oauth2RequirePostResponse property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOauth2RequirePostResponse() {
        return this.backingStore.get("oauth2RequirePostResponse");
    }
    /**
     * Gets the optionalClaims property value. Application developers can configure optional claims in their Microsoft Entra applications to specify the claims that are sent to their application by the Microsoft security token service. For more information, see How to: Provide optional claims to your app.
     * @return a {@link OptionalClaims}
     */
    @jakarta.annotation.Nullable
    public OptionalClaims getOptionalClaims() {
        return this.backingStore.get("optionalClaims");
    }
    /**
     * Gets the owners property value. Directory objects that are owners of this application. The owners are a set of nonadmin users or service principals who are allowed to modify this object. Supports $expand, $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1), and $select nested in $expand.
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getOwners() {
        return this.backingStore.get("owners");
    }
    /**
     * Gets the parentalControlSettings property value. Specifies parental control settings for an application.
     * @return a {@link ParentalControlSettings}
     */
    @jakarta.annotation.Nullable
    public ParentalControlSettings getParentalControlSettings() {
        return this.backingStore.get("parentalControlSettings");
    }
    /**
     * Gets the passwordCredentials property value. The collection of password credentials associated with the application. Not nullable.
     * @return a {@link java.util.List<PasswordCredential>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PasswordCredential> getPasswordCredentials() {
        return this.backingStore.get("passwordCredentials");
    }
    /**
     * Gets the publicClient property value. Specifies settings for installed clients such as desktop or mobile devices.
     * @return a {@link PublicClientApplication}
     */
    @jakarta.annotation.Nullable
    public PublicClientApplication getPublicClient() {
        return this.backingStore.get("publicClient");
    }
    /**
     * Gets the publisherDomain property value. The verified publisher domain for the application. Read-only. For more information, see How to: Configure an application&apos;s publisher domain. Supports $filter (eq, ne, ge, le, startsWith).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPublisherDomain() {
        return this.backingStore.get("publisherDomain");
    }
    /**
     * Gets the requestSignatureVerification property value. Specifies whether this application requires Microsoft Entra ID to verify the signed authentication requests.
     * @return a {@link RequestSignatureVerification}
     */
    @jakarta.annotation.Nullable
    public RequestSignatureVerification getRequestSignatureVerification() {
        return this.backingStore.get("requestSignatureVerification");
    }
    /**
     * Gets the requiredResourceAccess property value. Specifies the resources that the application needs to access. This property also specifies the set of delegated permissions and application roles that it needs for each of those resources. This configuration of access to the required resources drives the consent experience. No more than 50 resource services (APIs) can be configured. Beginning mid-October 2021, the total number of required permissions must not exceed 400. For more information, see Limits on requested permissions per app. Not nullable. Supports $filter (eq, not, ge, le).
     * @return a {@link java.util.List<RequiredResourceAccess>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RequiredResourceAccess> getRequiredResourceAccess() {
        return this.backingStore.get("requiredResourceAccess");
    }
    /**
     * Gets the samlMetadataUrl property value. The URL where the service exposes SAML metadata for federation. This property is valid only for single-tenant applications. Nullable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSamlMetadataUrl() {
        return this.backingStore.get("samlMetadataUrl");
    }
    /**
     * Gets the serviceManagementReference property value. References application or service contact information from a Service or Asset Management database. Nullable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServiceManagementReference() {
        return this.backingStore.get("serviceManagementReference");
    }
    /**
     * Gets the servicePrincipalLockConfiguration property value. Specifies whether sensitive properties of a multitenant application should be locked for editing after the application is provisioned in a tenant. Nullable. null by default.
     * @return a {@link ServicePrincipalLockConfiguration}
     */
    @jakarta.annotation.Nullable
    public ServicePrincipalLockConfiguration getServicePrincipalLockConfiguration() {
        return this.backingStore.get("servicePrincipalLockConfiguration");
    }
    /**
     * Gets the signInAudience property value. Specifies the Microsoft accounts that are supported for the current application. The possible values are: AzureADMyOrg (default), AzureADMultipleOrgs, AzureADandPersonalMicrosoftAccount, and PersonalMicrosoftAccount. See more in the table. The value of this object also limits the number of permissions an app can request. For more information, see Limits on requested permissions per app. The value for this property has implications on other app object properties. As a result, if you change this property, you might need to change other properties first. For more information, see Validation differences for signInAudience.Supports $filter (eq, ne, not).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSignInAudience() {
        return this.backingStore.get("signInAudience");
    }
    /**
     * Gets the spa property value. Specifies settings for a single-page application, including sign out URLs and redirect URIs for authorization codes and access tokens.
     * @return a {@link SpaApplication}
     */
    @jakarta.annotation.Nullable
    public SpaApplication getSpa() {
        return this.backingStore.get("spa");
    }
    /**
     * Gets the synchronization property value. Represents the capability for Microsoft Entra identity synchronization through the Microsoft Graph API.
     * @return a {@link Synchronization}
     */
    @jakarta.annotation.Nullable
    public Synchronization getSynchronization() {
        return this.backingStore.get("synchronization");
    }
    /**
     * Gets the tags property value. Custom strings that can be used to categorize and identify the application. Not nullable. Strings added here will also appear in the tags property of any associated service principals.Supports $filter (eq, not, ge, le, startsWith) and $search.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.backingStore.get("tags");
    }
    /**
     * Gets the tokenEncryptionKeyId property value. Specifies the keyId of a public key from the keyCredentials collection. When configured, Microsoft Entra ID encrypts all the tokens it emits by using the key this property points to. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getTokenEncryptionKeyId() {
        return this.backingStore.get("tokenEncryptionKeyId");
    }
    /**
     * Gets the tokenIssuancePolicies property value. The tokenIssuancePolicies property
     * @return a {@link java.util.List<TokenIssuancePolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TokenIssuancePolicy> getTokenIssuancePolicies() {
        return this.backingStore.get("tokenIssuancePolicies");
    }
    /**
     * Gets the tokenLifetimePolicies property value. The tokenLifetimePolicies property
     * @return a {@link java.util.List<TokenLifetimePolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TokenLifetimePolicy> getTokenLifetimePolicies() {
        return this.backingStore.get("tokenLifetimePolicies");
    }
    /**
     * Gets the uniqueName property value. The unique identifier that can be assigned to an application and used as an alternate key. Immutable. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUniqueName() {
        return this.backingStore.get("uniqueName");
    }
    /**
     * Gets the verifiedPublisher property value. Specifies the verified publisher of the application. For more information about how publisher verification helps support application security, trustworthiness, and compliance, see Publisher verification.
     * @return a {@link VerifiedPublisher}
     */
    @jakarta.annotation.Nullable
    public VerifiedPublisher getVerifiedPublisher() {
        return this.backingStore.get("verifiedPublisher");
    }
    /**
     * Gets the web property value. Specifies settings for a web application.
     * @return a {@link WebApplication}
     */
    @jakarta.annotation.Nullable
    public WebApplication getWeb() {
        return this.backingStore.get("web");
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
        writer.writeObjectValue("authenticationBehaviors", this.getAuthenticationBehaviors());
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
        writer.writeEnumSetValue("nativeAuthenticationApisEnabled", this.getNativeAuthenticationApisEnabled());
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
        writer.writeStringValue("uniqueName", this.getUniqueName());
        writer.writeObjectValue("verifiedPublisher", this.getVerifiedPublisher());
        writer.writeObjectValue("web", this.getWeb());
    }
    /**
     * Sets the addIns property value. Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications that can render file streams can set the addIns property for its &apos;FileHandler&apos; functionality. This lets services like Microsoft 365 call the application in the context of a document the user is working on.
     * @param value Value to set for the addIns property.
     */
    public void setAddIns(@jakarta.annotation.Nullable final java.util.List<AddIn> value) {
        this.backingStore.set("addIns", value);
    }
    /**
     * Sets the api property value. Specifies settings for an application that implements a web API.
     * @param value Value to set for the api property.
     */
    public void setApi(@jakarta.annotation.Nullable final ApiApplication value) {
        this.backingStore.set("api", value);
    }
    /**
     * Sets the appId property value. The unique identifier for the application that is assigned to an application by Microsoft Entra ID. Not nullable. Read-only. Alternate key. Supports $filter (eq).
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appId", value);
    }
    /**
     * Sets the applicationTemplateId property value. Unique identifier of the applicationTemplate. Supports $filter (eq, not, ne). Read-only. null if the app wasn&apos;t created from an application template.
     * @param value Value to set for the applicationTemplateId property.
     */
    public void setApplicationTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applicationTemplateId", value);
    }
    /**
     * Sets the appManagementPolicies property value. The appManagementPolicy applied to this application.
     * @param value Value to set for the appManagementPolicies property.
     */
    public void setAppManagementPolicies(@jakarta.annotation.Nullable final java.util.List<AppManagementPolicy> value) {
        this.backingStore.set("appManagementPolicies", value);
    }
    /**
     * Sets the appRoles property value. The collection of roles defined for the application. With app role assignments, these roles can be assigned to users, groups, or service principals associated with other applications. Not nullable.
     * @param value Value to set for the appRoles property.
     */
    public void setAppRoles(@jakarta.annotation.Nullable final java.util.List<AppRole> value) {
        this.backingStore.set("appRoles", value);
    }
    /**
     * Sets the authenticationBehaviors property value. The authenticationBehaviors property
     * @param value Value to set for the authenticationBehaviors property.
     */
    public void setAuthenticationBehaviors(@jakarta.annotation.Nullable final AuthenticationBehaviors value) {
        this.backingStore.set("authenticationBehaviors", value);
    }
    /**
     * Sets the certification property value. Specifies the certification status of the application.
     * @param value Value to set for the certification property.
     */
    public void setCertification(@jakarta.annotation.Nullable final Certification value) {
        this.backingStore.set("certification", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time the application was registered. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.  Supports $filter (eq, ne, not, ge, le, in, and eq on null values) and $orderby.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the createdOnBehalfOf property value. Supports $filter (/$count eq 0, /$count ne 0). Read-only.
     * @param value Value to set for the createdOnBehalfOf property.
     */
    public void setCreatedOnBehalfOf(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.backingStore.set("createdOnBehalfOf", value);
    }
    /**
     * Sets the defaultRedirectUri property value. The defaultRedirectUri property
     * @param value Value to set for the defaultRedirectUri property.
     */
    public void setDefaultRedirectUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultRedirectUri", value);
    }
    /**
     * Sets the description property value. Free text field to provide a description of the application object to end users. The maximum allowed size is 1,024 characters. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the disabledByMicrosoftStatus property value. Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value), NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons include suspicious, abusive, or malicious activity, or a violation of the Microsoft Services Agreement).  Supports $filter (eq, ne, not).
     * @param value Value to set for the disabledByMicrosoftStatus property.
     */
    public void setDisabledByMicrosoftStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("disabledByMicrosoftStatus", value);
    }
    /**
     * Sets the displayName property value. The display name for the application. Maximum length is 256 characters. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the extensionProperties property value. Read-only. Nullable. Supports $expand and $filter (/$count eq 0, /$count ne 0).
     * @param value Value to set for the extensionProperties property.
     */
    public void setExtensionProperties(@jakarta.annotation.Nullable final java.util.List<ExtensionProperty> value) {
        this.backingStore.set("extensionProperties", value);
    }
    /**
     * Sets the federatedIdentityCredentials property value. Federated identities for applications. Supports $expand and $filter (startsWith, /$count eq 0, /$count ne 0).
     * @param value Value to set for the federatedIdentityCredentials property.
     */
    public void setFederatedIdentityCredentials(@jakarta.annotation.Nullable final java.util.List<FederatedIdentityCredential> value) {
        this.backingStore.set("federatedIdentityCredentials", value);
    }
    /**
     * Sets the groupMembershipClaims property value. Configures the groups claim issued in a user or OAuth 2.0 access token that the application expects. To set this attribute, use one of the following valid string values: None, SecurityGroup (for security groups and Microsoft Entra roles), All (this gets all of the security groups, distribution groups, and Microsoft Entra directory roles that the signed-in user is a member of).
     * @param value Value to set for the groupMembershipClaims property.
     */
    public void setGroupMembershipClaims(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupMembershipClaims", value);
    }
    /**
     * Sets the homeRealmDiscoveryPolicies property value. The homeRealmDiscoveryPolicies property
     * @param value Value to set for the homeRealmDiscoveryPolicies property.
     */
    public void setHomeRealmDiscoveryPolicies(@jakarta.annotation.Nullable final java.util.List<HomeRealmDiscoveryPolicy> value) {
        this.backingStore.set("homeRealmDiscoveryPolicies", value);
    }
    /**
     * Sets the identifierUris property value. Also known as App ID URI, this value is set when an application is used as a resource app. The identifierUris acts as the prefix for the scopes you reference in your API&apos;s code, and it must be globally unique. For more information on valid identifierUris patterns and best practices, see Microsoft Entra application registration security best practices. Not nullable. Supports $filter (eq, ne, ge, le, startsWith).
     * @param value Value to set for the identifierUris property.
     */
    public void setIdentifierUris(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("identifierUris", value);
    }
    /**
     * Sets the info property value. Basic profile information of the application such as  app&apos;s marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Microsoft Entra apps. Supports $filter (eq, ne, not, ge, le, and eq on null values).
     * @param value Value to set for the info property.
     */
    public void setInfo(@jakarta.annotation.Nullable final InformationalUrl value) {
        this.backingStore.set("info", value);
    }
    /**
     * Sets the isDeviceOnlyAuthSupported property value. Specifies whether this application supports device authentication without a user. The default is false.
     * @param value Value to set for the isDeviceOnlyAuthSupported property.
     */
    public void setIsDeviceOnlyAuthSupported(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDeviceOnlyAuthSupported", value);
    }
    /**
     * Sets the isFallbackPublicClient property value. Specifies the fallback application type as public client, such as an installed application running on a mobile device. The default value is false, which means the fallback application type is confidential client such as a web app. There are certain scenarios where Microsoft Entra ID can&apos;t determine the client application type. For example, the ROPC flow where it&apos;s configured without specifying a redirect URI. In those cases, Microsoft Entra ID interprets the application type based on the value of this property.
     * @param value Value to set for the isFallbackPublicClient property.
     */
    public void setIsFallbackPublicClient(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isFallbackPublicClient", value);
    }
    /**
     * Sets the keyCredentials property value. The collection of key credentials associated with the application. Not nullable. Supports $filter (eq, not, ge, le).
     * @param value Value to set for the keyCredentials property.
     */
    public void setKeyCredentials(@jakarta.annotation.Nullable final java.util.List<KeyCredential> value) {
        this.backingStore.set("keyCredentials", value);
    }
    /**
     * Sets the logo property value. The main logo for the application. Not nullable.
     * @param value Value to set for the logo property.
     */
    public void setLogo(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("logo", value);
    }
    /**
     * Sets the nativeAuthenticationApisEnabled property value. Specifies whether the Native Authentication APIs are enabled for the application. The possible values are: none and all. Default is none. For more information, see Native Authentication.
     * @param value Value to set for the nativeAuthenticationApisEnabled property.
     */
    public void setNativeAuthenticationApisEnabled(@jakarta.annotation.Nullable final EnumSet<NativeAuthenticationApisEnabled> value) {
        this.backingStore.set("nativeAuthenticationApisEnabled", value);
    }
    /**
     * Sets the notes property value. Notes relevant for the management of the application.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("notes", value);
    }
    /**
     * Sets the oauth2RequirePostResponse property value. The oauth2RequirePostResponse property
     * @param value Value to set for the oauth2RequirePostResponse property.
     */
    public void setOauth2RequirePostResponse(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("oauth2RequirePostResponse", value);
    }
    /**
     * Sets the optionalClaims property value. Application developers can configure optional claims in their Microsoft Entra applications to specify the claims that are sent to their application by the Microsoft security token service. For more information, see How to: Provide optional claims to your app.
     * @param value Value to set for the optionalClaims property.
     */
    public void setOptionalClaims(@jakarta.annotation.Nullable final OptionalClaims value) {
        this.backingStore.set("optionalClaims", value);
    }
    /**
     * Sets the owners property value. Directory objects that are owners of this application. The owners are a set of nonadmin users or service principals who are allowed to modify this object. Supports $expand, $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1), and $select nested in $expand.
     * @param value Value to set for the owners property.
     */
    public void setOwners(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("owners", value);
    }
    /**
     * Sets the parentalControlSettings property value. Specifies parental control settings for an application.
     * @param value Value to set for the parentalControlSettings property.
     */
    public void setParentalControlSettings(@jakarta.annotation.Nullable final ParentalControlSettings value) {
        this.backingStore.set("parentalControlSettings", value);
    }
    /**
     * Sets the passwordCredentials property value. The collection of password credentials associated with the application. Not nullable.
     * @param value Value to set for the passwordCredentials property.
     */
    public void setPasswordCredentials(@jakarta.annotation.Nullable final java.util.List<PasswordCredential> value) {
        this.backingStore.set("passwordCredentials", value);
    }
    /**
     * Sets the publicClient property value. Specifies settings for installed clients such as desktop or mobile devices.
     * @param value Value to set for the publicClient property.
     */
    public void setPublicClient(@jakarta.annotation.Nullable final PublicClientApplication value) {
        this.backingStore.set("publicClient", value);
    }
    /**
     * Sets the publisherDomain property value. The verified publisher domain for the application. Read-only. For more information, see How to: Configure an application&apos;s publisher domain. Supports $filter (eq, ne, ge, le, startsWith).
     * @param value Value to set for the publisherDomain property.
     */
    public void setPublisherDomain(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("publisherDomain", value);
    }
    /**
     * Sets the requestSignatureVerification property value. Specifies whether this application requires Microsoft Entra ID to verify the signed authentication requests.
     * @param value Value to set for the requestSignatureVerification property.
     */
    public void setRequestSignatureVerification(@jakarta.annotation.Nullable final RequestSignatureVerification value) {
        this.backingStore.set("requestSignatureVerification", value);
    }
    /**
     * Sets the requiredResourceAccess property value. Specifies the resources that the application needs to access. This property also specifies the set of delegated permissions and application roles that it needs for each of those resources. This configuration of access to the required resources drives the consent experience. No more than 50 resource services (APIs) can be configured. Beginning mid-October 2021, the total number of required permissions must not exceed 400. For more information, see Limits on requested permissions per app. Not nullable. Supports $filter (eq, not, ge, le).
     * @param value Value to set for the requiredResourceAccess property.
     */
    public void setRequiredResourceAccess(@jakarta.annotation.Nullable final java.util.List<RequiredResourceAccess> value) {
        this.backingStore.set("requiredResourceAccess", value);
    }
    /**
     * Sets the samlMetadataUrl property value. The URL where the service exposes SAML metadata for federation. This property is valid only for single-tenant applications. Nullable.
     * @param value Value to set for the samlMetadataUrl property.
     */
    public void setSamlMetadataUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("samlMetadataUrl", value);
    }
    /**
     * Sets the serviceManagementReference property value. References application or service contact information from a Service or Asset Management database. Nullable.
     * @param value Value to set for the serviceManagementReference property.
     */
    public void setServiceManagementReference(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serviceManagementReference", value);
    }
    /**
     * Sets the servicePrincipalLockConfiguration property value. Specifies whether sensitive properties of a multitenant application should be locked for editing after the application is provisioned in a tenant. Nullable. null by default.
     * @param value Value to set for the servicePrincipalLockConfiguration property.
     */
    public void setServicePrincipalLockConfiguration(@jakarta.annotation.Nullable final ServicePrincipalLockConfiguration value) {
        this.backingStore.set("servicePrincipalLockConfiguration", value);
    }
    /**
     * Sets the signInAudience property value. Specifies the Microsoft accounts that are supported for the current application. The possible values are: AzureADMyOrg (default), AzureADMultipleOrgs, AzureADandPersonalMicrosoftAccount, and PersonalMicrosoftAccount. See more in the table. The value of this object also limits the number of permissions an app can request. For more information, see Limits on requested permissions per app. The value for this property has implications on other app object properties. As a result, if you change this property, you might need to change other properties first. For more information, see Validation differences for signInAudience.Supports $filter (eq, ne, not).
     * @param value Value to set for the signInAudience property.
     */
    public void setSignInAudience(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("signInAudience", value);
    }
    /**
     * Sets the spa property value. Specifies settings for a single-page application, including sign out URLs and redirect URIs for authorization codes and access tokens.
     * @param value Value to set for the spa property.
     */
    public void setSpa(@jakarta.annotation.Nullable final SpaApplication value) {
        this.backingStore.set("spa", value);
    }
    /**
     * Sets the synchronization property value. Represents the capability for Microsoft Entra identity synchronization through the Microsoft Graph API.
     * @param value Value to set for the synchronization property.
     */
    public void setSynchronization(@jakarta.annotation.Nullable final Synchronization value) {
        this.backingStore.set("synchronization", value);
    }
    /**
     * Sets the tags property value. Custom strings that can be used to categorize and identify the application. Not nullable. Strings added here will also appear in the tags property of any associated service principals.Supports $filter (eq, not, ge, le, startsWith) and $search.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("tags", value);
    }
    /**
     * Sets the tokenEncryptionKeyId property value. Specifies the keyId of a public key from the keyCredentials collection. When configured, Microsoft Entra ID encrypts all the tokens it emits by using the key this property points to. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     * @param value Value to set for the tokenEncryptionKeyId property.
     */
    public void setTokenEncryptionKeyId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("tokenEncryptionKeyId", value);
    }
    /**
     * Sets the tokenIssuancePolicies property value. The tokenIssuancePolicies property
     * @param value Value to set for the tokenIssuancePolicies property.
     */
    public void setTokenIssuancePolicies(@jakarta.annotation.Nullable final java.util.List<TokenIssuancePolicy> value) {
        this.backingStore.set("tokenIssuancePolicies", value);
    }
    /**
     * Sets the tokenLifetimePolicies property value. The tokenLifetimePolicies property
     * @param value Value to set for the tokenLifetimePolicies property.
     */
    public void setTokenLifetimePolicies(@jakarta.annotation.Nullable final java.util.List<TokenLifetimePolicy> value) {
        this.backingStore.set("tokenLifetimePolicies", value);
    }
    /**
     * Sets the uniqueName property value. The unique identifier that can be assigned to an application and used as an alternate key. Immutable. Read-only.
     * @param value Value to set for the uniqueName property.
     */
    public void setUniqueName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("uniqueName", value);
    }
    /**
     * Sets the verifiedPublisher property value. Specifies the verified publisher of the application. For more information about how publisher verification helps support application security, trustworthiness, and compliance, see Publisher verification.
     * @param value Value to set for the verifiedPublisher property.
     */
    public void setVerifiedPublisher(@jakarta.annotation.Nullable final VerifiedPublisher value) {
        this.backingStore.set("verifiedPublisher", value);
    }
    /**
     * Sets the web property value. Specifies settings for a web application.
     * @param value Value to set for the web property.
     */
    public void setWeb(@jakarta.annotation.Nullable final WebApplication value) {
        this.backingStore.set("web", value);
    }
}
