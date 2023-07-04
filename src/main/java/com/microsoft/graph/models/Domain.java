package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Domain extends Entity implements Parsable {
    /**
     * Indicates the configured authentication type for the domain. The value is either Managed or Federated. Managed indicates a cloud managed domain where Azure AD performs user authentication. Federated indicates authentication is federated with an identity provider such as the tenant's on-premises Active Directory via Active Directory Federation Services. This property is read-only and is not nullable.
     */
    private String authenticationType;
    /**
     * This property is always null except when the verify action is used. When the verify action is used, a domain entity is returned in the response. The availabilityStatus property of the domain entity in the response is either AvailableImmediately or EmailVerifiedDomainTakeoverScheduled.
     */
    private String availabilityStatus;
    /**
     * The objects such as users and groups that reference the domain ID. Read-only, Nullable. Supports $expand and $filter by the OData type of objects returned. For example /domains/{domainId}/domainNameReferences/microsoft.graph.user and /domains/{domainId}/domainNameReferences/microsoft.graph.group.
     */
    private java.util.List<DirectoryObject> domainNameReferences;
    /**
     * Domain settings configured by a customer when federated with Azure AD. Supports $expand.
     */
    private java.util.List<InternalDomainFederation> federationConfiguration;
    /**
     * The value of the property is false if the DNS record management of the domain has been delegated to Microsoft 365. Otherwise, the value is true. Not nullable
     */
    private Boolean isAdminManaged;
    /**
     * true if this is the default domain that is used for user creation. There is only one default domain per company. Not nullable
     */
    private Boolean isDefault;
    /**
     * true if this is the initial domain created by Microsoft Online Services (companyname.onmicrosoft.com). There is only one initial domain per company. Not nullable
     */
    private Boolean isInitial;
    /**
     * true if the domain is a verified root domain. Otherwise, false if the domain is a subdomain or unverified. Not nullable
     */
    private Boolean isRoot;
    /**
     * true if the domain has completed domain ownership verification. Not nullable
     */
    private Boolean isVerified;
    /**
     * The manufacturer property
     */
    private String manufacturer;
    /**
     * The model property
     */
    private String model;
    /**
     * Specifies the number of days before a user receives notification that their password will expire. If the property is not set, a default value of 14 days will be used.
     */
    private Integer passwordNotificationWindowInDays;
    /**
     * Specifies the length of time that a password is valid before it must be changed. If the property is not set, a default value of 90 days will be used.
     */
    private Integer passwordValidityPeriodInDays;
    /**
     * DNS records the customer adds to the DNS zone file of the domain before the domain can be used by Microsoft Online services. Read-only, Nullable. Supports $expand.
     */
    private java.util.List<DomainDnsRecord> serviceConfigurationRecords;
    /**
     * Status of asynchronous operations scheduled for the domain.
     */
    private DomainState state;
    /**
     * The capabilities assigned to the domain. Can include 0, 1 or more of following values: Email, Sharepoint, EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation, SharePointPublic, OrgIdAuthentication, Yammer, Intune. The values which you can add/remove using Graph API include: Email, OfficeCommunicationsOnline, Yammer. Not nullable.
     */
    private java.util.List<String> supportedServices;
    /**
     * DNS records that the customer adds to the DNS zone file of the domain before the customer can complete domain ownership verification with Azure AD. Read-only, Nullable. Supports $expand.
     */
    private java.util.List<DomainDnsRecord> verificationDnsRecords;
    /**
     * Instantiates a new Domain and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Domain() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Domain
     */
    @javax.annotation.Nonnull
    public static Domain createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Domain();
    }
    /**
     * Gets the authenticationType property value. Indicates the configured authentication type for the domain. The value is either Managed or Federated. Managed indicates a cloud managed domain where Azure AD performs user authentication. Federated indicates authentication is federated with an identity provider such as the tenant's on-premises Active Directory via Active Directory Federation Services. This property is read-only and is not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthenticationType() {
        return this.authenticationType;
    }
    /**
     * Gets the availabilityStatus property value. This property is always null except when the verify action is used. When the verify action is used, a domain entity is returned in the response. The availabilityStatus property of the domain entity in the response is either AvailableImmediately or EmailVerifiedDomainTakeoverScheduled.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAvailabilityStatus() {
        return this.availabilityStatus;
    }
    /**
     * Gets the domainNameReferences property value. The objects such as users and groups that reference the domain ID. Read-only, Nullable. Supports $expand and $filter by the OData type of objects returned. For example /domains/{domainId}/domainNameReferences/microsoft.graph.user and /domains/{domainId}/domainNameReferences/microsoft.graph.group.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getDomainNameReferences() {
        return this.domainNameReferences;
    }
    /**
     * Gets the federationConfiguration property value. Domain settings configured by a customer when federated with Azure AD. Supports $expand.
     * @return a internalDomainFederation
     */
    @javax.annotation.Nullable
    public java.util.List<InternalDomainFederation> getFederationConfiguration() {
        return this.federationConfiguration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationType", (n) -> { this.setAuthenticationType(n.getStringValue()); });
        deserializerMap.put("availabilityStatus", (n) -> { this.setAvailabilityStatus(n.getStringValue()); });
        deserializerMap.put("domainNameReferences", (n) -> { this.setDomainNameReferences(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("federationConfiguration", (n) -> { this.setFederationConfiguration(n.getCollectionOfObjectValues(InternalDomainFederation::createFromDiscriminatorValue)); });
        deserializerMap.put("isAdminManaged", (n) -> { this.setIsAdminManaged(n.getBooleanValue()); });
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("isInitial", (n) -> { this.setIsInitial(n.getBooleanValue()); });
        deserializerMap.put("isRoot", (n) -> { this.setIsRoot(n.getBooleanValue()); });
        deserializerMap.put("isVerified", (n) -> { this.setIsVerified(n.getBooleanValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("passwordNotificationWindowInDays", (n) -> { this.setPasswordNotificationWindowInDays(n.getIntegerValue()); });
        deserializerMap.put("passwordValidityPeriodInDays", (n) -> { this.setPasswordValidityPeriodInDays(n.getIntegerValue()); });
        deserializerMap.put("serviceConfigurationRecords", (n) -> { this.setServiceConfigurationRecords(n.getCollectionOfObjectValues(DomainDnsRecord::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getObjectValue(DomainState::createFromDiscriminatorValue)); });
        deserializerMap.put("supportedServices", (n) -> { this.setSupportedServices(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("verificationDnsRecords", (n) -> { this.setVerificationDnsRecords(n.getCollectionOfObjectValues(DomainDnsRecord::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isAdminManaged property value. The value of the property is false if the DNS record management of the domain has been delegated to Microsoft 365. Otherwise, the value is true. Not nullable
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAdminManaged() {
        return this.isAdminManaged;
    }
    /**
     * Gets the isDefault property value. true if this is the default domain that is used for user creation. There is only one default domain per company. Not nullable
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefault() {
        return this.isDefault;
    }
    /**
     * Gets the isInitial property value. true if this is the initial domain created by Microsoft Online Services (companyname.onmicrosoft.com). There is only one initial domain per company. Not nullable
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsInitial() {
        return this.isInitial;
    }
    /**
     * Gets the isRoot property value. true if the domain is a verified root domain. Otherwise, false if the domain is a subdomain or unverified. Not nullable
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRoot() {
        return this.isRoot;
    }
    /**
     * Gets the isVerified property value. true if the domain has completed domain ownership verification. Not nullable
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsVerified() {
        return this.isVerified;
    }
    /**
     * Gets the manufacturer property value. The manufacturer property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the model property value. The model property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the passwordNotificationWindowInDays property value. Specifies the number of days before a user receives notification that their password will expire. If the property is not set, a default value of 14 days will be used.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordNotificationWindowInDays() {
        return this.passwordNotificationWindowInDays;
    }
    /**
     * Gets the passwordValidityPeriodInDays property value. Specifies the length of time that a password is valid before it must be changed. If the property is not set, a default value of 90 days will be used.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordValidityPeriodInDays() {
        return this.passwordValidityPeriodInDays;
    }
    /**
     * Gets the serviceConfigurationRecords property value. DNS records the customer adds to the DNS zone file of the domain before the domain can be used by Microsoft Online services. Read-only, Nullable. Supports $expand.
     * @return a domainDnsRecord
     */
    @javax.annotation.Nullable
    public java.util.List<DomainDnsRecord> getServiceConfigurationRecords() {
        return this.serviceConfigurationRecords;
    }
    /**
     * Gets the state property value. Status of asynchronous operations scheduled for the domain.
     * @return a domainState
     */
    @javax.annotation.Nullable
    public DomainState getState() {
        return this.state;
    }
    /**
     * Gets the supportedServices property value. The capabilities assigned to the domain. Can include 0, 1 or more of following values: Email, Sharepoint, EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation, SharePointPublic, OrgIdAuthentication, Yammer, Intune. The values which you can add/remove using Graph API include: Email, OfficeCommunicationsOnline, Yammer. Not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSupportedServices() {
        return this.supportedServices;
    }
    /**
     * Gets the verificationDnsRecords property value. DNS records that the customer adds to the DNS zone file of the domain before the customer can complete domain ownership verification with Azure AD. Read-only, Nullable. Supports $expand.
     * @return a domainDnsRecord
     */
    @javax.annotation.Nullable
    public java.util.List<DomainDnsRecord> getVerificationDnsRecords() {
        return this.verificationDnsRecords;
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
        writer.writeStringValue("authenticationType", this.getAuthenticationType());
        writer.writeStringValue("availabilityStatus", this.getAvailabilityStatus());
        writer.writeCollectionOfObjectValues("domainNameReferences", this.getDomainNameReferences());
        writer.writeCollectionOfObjectValues("federationConfiguration", this.getFederationConfiguration());
        writer.writeBooleanValue("isAdminManaged", this.getIsAdminManaged());
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeBooleanValue("isInitial", this.getIsInitial());
        writer.writeBooleanValue("isRoot", this.getIsRoot());
        writer.writeBooleanValue("isVerified", this.getIsVerified());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeIntegerValue("passwordNotificationWindowInDays", this.getPasswordNotificationWindowInDays());
        writer.writeIntegerValue("passwordValidityPeriodInDays", this.getPasswordValidityPeriodInDays());
        writer.writeCollectionOfObjectValues("serviceConfigurationRecords", this.getServiceConfigurationRecords());
        writer.writeObjectValue("state", this.getState());
        writer.writeCollectionOfPrimitiveValues("supportedServices", this.getSupportedServices());
        writer.writeCollectionOfObjectValues("verificationDnsRecords", this.getVerificationDnsRecords());
    }
    /**
     * Sets the authenticationType property value. Indicates the configured authentication type for the domain. The value is either Managed or Federated. Managed indicates a cloud managed domain where Azure AD performs user authentication. Federated indicates authentication is federated with an identity provider such as the tenant's on-premises Active Directory via Active Directory Federation Services. This property is read-only and is not nullable.
     * @param value Value to set for the authenticationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationType(@javax.annotation.Nullable final String value) {
        this.authenticationType = value;
    }
    /**
     * Sets the availabilityStatus property value. This property is always null except when the verify action is used. When the verify action is used, a domain entity is returned in the response. The availabilityStatus property of the domain entity in the response is either AvailableImmediately or EmailVerifiedDomainTakeoverScheduled.
     * @param value Value to set for the availabilityStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAvailabilityStatus(@javax.annotation.Nullable final String value) {
        this.availabilityStatus = value;
    }
    /**
     * Sets the domainNameReferences property value. The objects such as users and groups that reference the domain ID. Read-only, Nullable. Supports $expand and $filter by the OData type of objects returned. For example /domains/{domainId}/domainNameReferences/microsoft.graph.user and /domains/{domainId}/domainNameReferences/microsoft.graph.group.
     * @param value Value to set for the domainNameReferences property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomainNameReferences(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.domainNameReferences = value;
    }
    /**
     * Sets the federationConfiguration property value. Domain settings configured by a customer when federated with Azure AD. Supports $expand.
     * @param value Value to set for the federationConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFederationConfiguration(@javax.annotation.Nullable final java.util.List<InternalDomainFederation> value) {
        this.federationConfiguration = value;
    }
    /**
     * Sets the isAdminManaged property value. The value of the property is false if the DNS record management of the domain has been delegated to Microsoft 365. Otherwise, the value is true. Not nullable
     * @param value Value to set for the isAdminManaged property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAdminManaged(@javax.annotation.Nullable final Boolean value) {
        this.isAdminManaged = value;
    }
    /**
     * Sets the isDefault property value. true if this is the default domain that is used for user creation. There is only one default domain per company. Not nullable
     * @param value Value to set for the isDefault property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDefault(@javax.annotation.Nullable final Boolean value) {
        this.isDefault = value;
    }
    /**
     * Sets the isInitial property value. true if this is the initial domain created by Microsoft Online Services (companyname.onmicrosoft.com). There is only one initial domain per company. Not nullable
     * @param value Value to set for the isInitial property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsInitial(@javax.annotation.Nullable final Boolean value) {
        this.isInitial = value;
    }
    /**
     * Sets the isRoot property value. true if the domain is a verified root domain. Otherwise, false if the domain is a subdomain or unverified. Not nullable
     * @param value Value to set for the isRoot property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRoot(@javax.annotation.Nullable final Boolean value) {
        this.isRoot = value;
    }
    /**
     * Sets the isVerified property value. true if the domain has completed domain ownership verification. Not nullable
     * @param value Value to set for the isVerified property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsVerified(@javax.annotation.Nullable final Boolean value) {
        this.isVerified = value;
    }
    /**
     * Sets the manufacturer property value. The manufacturer property
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the model property value. The model property
     * @param value Value to set for the model property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModel(@javax.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the passwordNotificationWindowInDays property value. Specifies the number of days before a user receives notification that their password will expire. If the property is not set, a default value of 14 days will be used.
     * @param value Value to set for the passwordNotificationWindowInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordNotificationWindowInDays(@javax.annotation.Nullable final Integer value) {
        this.passwordNotificationWindowInDays = value;
    }
    /**
     * Sets the passwordValidityPeriodInDays property value. Specifies the length of time that a password is valid before it must be changed. If the property is not set, a default value of 90 days will be used.
     * @param value Value to set for the passwordValidityPeriodInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordValidityPeriodInDays(@javax.annotation.Nullable final Integer value) {
        this.passwordValidityPeriodInDays = value;
    }
    /**
     * Sets the serviceConfigurationRecords property value. DNS records the customer adds to the DNS zone file of the domain before the domain can be used by Microsoft Online services. Read-only, Nullable. Supports $expand.
     * @param value Value to set for the serviceConfigurationRecords property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceConfigurationRecords(@javax.annotation.Nullable final java.util.List<DomainDnsRecord> value) {
        this.serviceConfigurationRecords = value;
    }
    /**
     * Sets the state property value. Status of asynchronous operations scheduled for the domain.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final DomainState value) {
        this.state = value;
    }
    /**
     * Sets the supportedServices property value. The capabilities assigned to the domain. Can include 0, 1 or more of following values: Email, Sharepoint, EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation, SharePointPublic, OrgIdAuthentication, Yammer, Intune. The values which you can add/remove using Graph API include: Email, OfficeCommunicationsOnline, Yammer. Not nullable.
     * @param value Value to set for the supportedServices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportedServices(@javax.annotation.Nullable final java.util.List<String> value) {
        this.supportedServices = value;
    }
    /**
     * Sets the verificationDnsRecords property value. DNS records that the customer adds to the DNS zone file of the domain before the customer can complete domain ownership verification with Azure AD. Read-only, Nullable. Supports $expand.
     * @param value Value to set for the verificationDnsRecords property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVerificationDnsRecords(@javax.annotation.Nullable final java.util.List<DomainDnsRecord> value) {
        this.verificationDnsRecords = value;
    }
}
