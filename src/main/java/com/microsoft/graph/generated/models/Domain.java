package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Domain extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Domain} and sets the default values.
     */
    public Domain() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Domain}
     */
    @jakarta.annotation.Nonnull
    public static Domain createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Domain();
    }
    /**
     * Gets the authenticationType property value. Indicates the configured authentication type for the domain. The value is either Managed or Federated. Managed indicates a cloud managed domain where Microsoft Entra ID performs user authentication. Federated indicates authentication is federated with an identity provider such as the tenant's on-premises Active Directory via Active Directory Federation Services. Not nullable.  To update this property in delegated scenarios, the calling app must be assigned the Directory.AccessAsUser.All delegated permission.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAuthenticationType() {
        return this.backingStore.get("authenticationType");
    }
    /**
     * Gets the availabilityStatus property value. This property is always null except when the verify action is used. When the verify action is used, a domain entity is returned in the response. The availabilityStatus property of the domain entity in the response is either AvailableImmediately or EmailVerifiedDomainTakeoverScheduled.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAvailabilityStatus() {
        return this.backingStore.get("availabilityStatus");
    }
    /**
     * Gets the domainNameReferences property value. The objects such as users and groups that reference the domain ID. Read-only, Nullable. Doesn't support $expand. Supports $filter by the OData type of objects returned. For example, /domains/{domainId}/domainNameReferences/microsoft.graph.user and /domains/{domainId}/domainNameReferences/microsoft.graph.group.
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getDomainNameReferences() {
        return this.backingStore.get("domainNameReferences");
    }
    /**
     * Gets the federationConfiguration property value. Domain settings configured by a customer when federated with Microsoft Entra ID. Doesn't support $expand.
     * @return a {@link java.util.List<InternalDomainFederation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<InternalDomainFederation> getFederationConfiguration() {
        return this.backingStore.get("federationConfiguration");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
        deserializerMap.put("rootDomain", (n) -> { this.setRootDomain(n.getObjectValue(Domain::createFromDiscriminatorValue)); });
        deserializerMap.put("serviceConfigurationRecords", (n) -> { this.setServiceConfigurationRecords(n.getCollectionOfObjectValues(DomainDnsRecord::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getObjectValue(DomainState::createFromDiscriminatorValue)); });
        deserializerMap.put("supportedServices", (n) -> { this.setSupportedServices(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("verificationDnsRecords", (n) -> { this.setVerificationDnsRecords(n.getCollectionOfObjectValues(DomainDnsRecord::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isAdminManaged property value. The value of the property is false if the DNS record management of the domain is delegated to Microsoft 365. Otherwise, the value is true. Not nullable
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAdminManaged() {
        return this.backingStore.get("isAdminManaged");
    }
    /**
     * Gets the isDefault property value. true if this is the default domain that is used for user creation. There's only one default domain per company. Not nullable.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefault() {
        return this.backingStore.get("isDefault");
    }
    /**
     * Gets the isInitial property value. true if this is the initial domain created by Microsoft Online Services (contoso.com). There's only one initial domain per company. Not nullable
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsInitial() {
        return this.backingStore.get("isInitial");
    }
    /**
     * Gets the isRoot property value. true if the domain is a verified root domain. Otherwise, false if the domain is a subdomain or unverified. Not nullable.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRoot() {
        return this.backingStore.get("isRoot");
    }
    /**
     * Gets the isVerified property value. true if the domain completed domain ownership verification. Not nullable.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsVerified() {
        return this.backingStore.get("isVerified");
    }
    /**
     * Gets the manufacturer property value. The manufacturer property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.backingStore.get("manufacturer");
    }
    /**
     * Gets the model property value. The model property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.backingStore.get("model");
    }
    /**
     * Gets the passwordNotificationWindowInDays property value. Specifies the number of days before a user receives notification that their password expires. If the property isn't set, a default value of 14 days is used.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordNotificationWindowInDays() {
        return this.backingStore.get("passwordNotificationWindowInDays");
    }
    /**
     * Gets the passwordValidityPeriodInDays property value. Specifies the length of time that a password is valid before it must be changed. If the property isn't set, a default value of 90 days is used.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordValidityPeriodInDays() {
        return this.backingStore.get("passwordValidityPeriodInDays");
    }
    /**
     * Gets the rootDomain property value. Root domain of a subdomain. Read-only, Nullable. Supports $expand.
     * @return a {@link Domain}
     */
    @jakarta.annotation.Nullable
    public Domain getRootDomain() {
        return this.backingStore.get("rootDomain");
    }
    /**
     * Gets the serviceConfigurationRecords property value. DNS records the customer adds to the DNS zone file of the domain before the domain can be used by Microsoft Online services. Read-only, Nullable. Doesn't support $expand.
     * @return a {@link java.util.List<DomainDnsRecord>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DomainDnsRecord> getServiceConfigurationRecords() {
        return this.backingStore.get("serviceConfigurationRecords");
    }
    /**
     * Gets the state property value. Status of asynchronous operations scheduled for the domain.
     * @return a {@link DomainState}
     */
    @jakarta.annotation.Nullable
    public DomainState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the supportedServices property value. The capabilities assigned to the domain. Can include 0, 1 or more of following values: Email, Sharepoint, EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation, SharePointPublic, OrgIdAuthentication, Yammer, Intune. The values that you can add or remove using the API include: Email, OfficeCommunicationsOnline, Yammer. Not nullable.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportedServices() {
        return this.backingStore.get("supportedServices");
    }
    /**
     * Gets the verificationDnsRecords property value. DNS records that the customer adds to the DNS zone file of the domain before the customer can complete domain ownership verification with Microsoft Entra ID. Read-only, Nullable. Doesn't support $expand.
     * @return a {@link java.util.List<DomainDnsRecord>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DomainDnsRecord> getVerificationDnsRecords() {
        return this.backingStore.get("verificationDnsRecords");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeObjectValue("rootDomain", this.getRootDomain());
        writer.writeCollectionOfObjectValues("serviceConfigurationRecords", this.getServiceConfigurationRecords());
        writer.writeObjectValue("state", this.getState());
        writer.writeCollectionOfPrimitiveValues("supportedServices", this.getSupportedServices());
        writer.writeCollectionOfObjectValues("verificationDnsRecords", this.getVerificationDnsRecords());
    }
    /**
     * Sets the authenticationType property value. Indicates the configured authentication type for the domain. The value is either Managed or Federated. Managed indicates a cloud managed domain where Microsoft Entra ID performs user authentication. Federated indicates authentication is federated with an identity provider such as the tenant's on-premises Active Directory via Active Directory Federation Services. Not nullable.  To update this property in delegated scenarios, the calling app must be assigned the Directory.AccessAsUser.All delegated permission.
     * @param value Value to set for the authenticationType property.
     */
    public void setAuthenticationType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("authenticationType", value);
    }
    /**
     * Sets the availabilityStatus property value. This property is always null except when the verify action is used. When the verify action is used, a domain entity is returned in the response. The availabilityStatus property of the domain entity in the response is either AvailableImmediately or EmailVerifiedDomainTakeoverScheduled.
     * @param value Value to set for the availabilityStatus property.
     */
    public void setAvailabilityStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("availabilityStatus", value);
    }
    /**
     * Sets the domainNameReferences property value. The objects such as users and groups that reference the domain ID. Read-only, Nullable. Doesn't support $expand. Supports $filter by the OData type of objects returned. For example, /domains/{domainId}/domainNameReferences/microsoft.graph.user and /domains/{domainId}/domainNameReferences/microsoft.graph.group.
     * @param value Value to set for the domainNameReferences property.
     */
    public void setDomainNameReferences(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("domainNameReferences", value);
    }
    /**
     * Sets the federationConfiguration property value. Domain settings configured by a customer when federated with Microsoft Entra ID. Doesn't support $expand.
     * @param value Value to set for the federationConfiguration property.
     */
    public void setFederationConfiguration(@jakarta.annotation.Nullable final java.util.List<InternalDomainFederation> value) {
        this.backingStore.set("federationConfiguration", value);
    }
    /**
     * Sets the isAdminManaged property value. The value of the property is false if the DNS record management of the domain is delegated to Microsoft 365. Otherwise, the value is true. Not nullable
     * @param value Value to set for the isAdminManaged property.
     */
    public void setIsAdminManaged(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAdminManaged", value);
    }
    /**
     * Sets the isDefault property value. true if this is the default domain that is used for user creation. There's only one default domain per company. Not nullable.
     * @param value Value to set for the isDefault property.
     */
    public void setIsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDefault", value);
    }
    /**
     * Sets the isInitial property value. true if this is the initial domain created by Microsoft Online Services (contoso.com). There's only one initial domain per company. Not nullable
     * @param value Value to set for the isInitial property.
     */
    public void setIsInitial(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isInitial", value);
    }
    /**
     * Sets the isRoot property value. true if the domain is a verified root domain. Otherwise, false if the domain is a subdomain or unverified. Not nullable.
     * @param value Value to set for the isRoot property.
     */
    public void setIsRoot(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRoot", value);
    }
    /**
     * Sets the isVerified property value. true if the domain completed domain ownership verification. Not nullable.
     * @param value Value to set for the isVerified property.
     */
    public void setIsVerified(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isVerified", value);
    }
    /**
     * Sets the manufacturer property value. The manufacturer property
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manufacturer", value);
    }
    /**
     * Sets the model property value. The model property
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("model", value);
    }
    /**
     * Sets the passwordNotificationWindowInDays property value. Specifies the number of days before a user receives notification that their password expires. If the property isn't set, a default value of 14 days is used.
     * @param value Value to set for the passwordNotificationWindowInDays property.
     */
    public void setPasswordNotificationWindowInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordNotificationWindowInDays", value);
    }
    /**
     * Sets the passwordValidityPeriodInDays property value. Specifies the length of time that a password is valid before it must be changed. If the property isn't set, a default value of 90 days is used.
     * @param value Value to set for the passwordValidityPeriodInDays property.
     */
    public void setPasswordValidityPeriodInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordValidityPeriodInDays", value);
    }
    /**
     * Sets the rootDomain property value. Root domain of a subdomain. Read-only, Nullable. Supports $expand.
     * @param value Value to set for the rootDomain property.
     */
    public void setRootDomain(@jakarta.annotation.Nullable final Domain value) {
        this.backingStore.set("rootDomain", value);
    }
    /**
     * Sets the serviceConfigurationRecords property value. DNS records the customer adds to the DNS zone file of the domain before the domain can be used by Microsoft Online services. Read-only, Nullable. Doesn't support $expand.
     * @param value Value to set for the serviceConfigurationRecords property.
     */
    public void setServiceConfigurationRecords(@jakarta.annotation.Nullable final java.util.List<DomainDnsRecord> value) {
        this.backingStore.set("serviceConfigurationRecords", value);
    }
    /**
     * Sets the state property value. Status of asynchronous operations scheduled for the domain.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final DomainState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the supportedServices property value. The capabilities assigned to the domain. Can include 0, 1 or more of following values: Email, Sharepoint, EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation, SharePointPublic, OrgIdAuthentication, Yammer, Intune. The values that you can add or remove using the API include: Email, OfficeCommunicationsOnline, Yammer. Not nullable.
     * @param value Value to set for the supportedServices property.
     */
    public void setSupportedServices(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("supportedServices", value);
    }
    /**
     * Sets the verificationDnsRecords property value. DNS records that the customer adds to the DNS zone file of the domain before the customer can complete domain ownership verification with Microsoft Entra ID. Read-only, Nullable. Doesn't support $expand.
     * @param value Value to set for the verificationDnsRecords property.
     */
    public void setVerificationDnsRecords(@jakarta.annotation.Nullable final java.util.List<DomainDnsRecord> value) {
        this.backingStore.set("verificationDnsRecords", value);
    }
}
