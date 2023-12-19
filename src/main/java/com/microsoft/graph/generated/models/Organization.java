package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Organization extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new Organization and sets the default values.
     */
    public Organization() {
        super();
        this.setOdataType("#microsoft.graph.organization");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Organization
     */
    @jakarta.annotation.Nonnull
    public static Organization createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Organization();
    }
    /**
     * Gets the assignedPlans property value. The collection of service plans associated with the tenant. Not nullable.
     * @return a java.util.List<AssignedPlan>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssignedPlan> getAssignedPlans() {
        return this.backingStore.get("assignedPlans");
    }
    /**
     * Gets the branding property value. Branding for the organization. Nullable.
     * @return a OrganizationalBranding
     */
    @jakarta.annotation.Nullable
    public OrganizationalBranding getBranding() {
        return this.backingStore.get("branding");
    }
    /**
     * Gets the businessPhones property value. Telephone number for the organization. Although this is a string collection, only one number can be set for this property.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBusinessPhones() {
        return this.backingStore.get("businessPhones");
    }
    /**
     * Gets the certificateBasedAuthConfiguration property value. Navigation property to manage certificate-based authentication configuration. Only a single instance of certificateBasedAuthConfiguration can be created in the collection.
     * @return a java.util.List<CertificateBasedAuthConfiguration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CertificateBasedAuthConfiguration> getCertificateBasedAuthConfiguration() {
        return this.backingStore.get("certificateBasedAuthConfiguration");
    }
    /**
     * Gets the city property value. City name of the address for the organization.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.backingStore.get("city");
    }
    /**
     * Gets the country property value. Country/region name of the address for the organization.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.backingStore.get("country");
    }
    /**
     * Gets the countryLetterCode property value. Country or region abbreviation for the organization in ISO 3166-2 format.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCountryLetterCode() {
        return this.backingStore.get("countryLetterCode");
    }
    /**
     * Gets the createdDateTime property value. Timestamp of when the organization was created. The value cannot be modified and is automatically populated when the organization is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the defaultUsageLocation property value. Two-letter ISO 3166 country code indicating the default service usage location of an organization.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefaultUsageLocation() {
        return this.backingStore.get("defaultUsageLocation");
    }
    /**
     * Gets the displayName property value. The display name for the tenant.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the organization. Read-only. Nullable.
     * @return a java.util.List<Extension>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this.backingStore.get("extensions");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedPlans", (n) -> { this.setAssignedPlans(n.getCollectionOfObjectValues(AssignedPlan::createFromDiscriminatorValue)); });
        deserializerMap.put("branding", (n) -> { this.setBranding(n.getObjectValue(OrganizationalBranding::createFromDiscriminatorValue)); });
        deserializerMap.put("businessPhones", (n) -> { this.setBusinessPhones(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("certificateBasedAuthConfiguration", (n) -> { this.setCertificateBasedAuthConfiguration(n.getCollectionOfObjectValues(CertificateBasedAuthConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("countryLetterCode", (n) -> { this.setCountryLetterCode(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("defaultUsageLocation", (n) -> { this.setDefaultUsageLocation(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
        deserializerMap.put("marketingNotificationEmails", (n) -> { this.setMarketingNotificationEmails(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("mobileDeviceManagementAuthority", (n) -> { this.setMobileDeviceManagementAuthority(n.getEnumValue(MdmAuthority::forValue)); });
        deserializerMap.put("onPremisesLastSyncDateTime", (n) -> { this.setOnPremisesLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("onPremisesSyncEnabled", (n) -> { this.setOnPremisesSyncEnabled(n.getBooleanValue()); });
        deserializerMap.put("partnerTenantType", (n) -> { this.setPartnerTenantType(n.getEnumValue(OrganizationPartnerTenantType::forValue)); });
        deserializerMap.put("postalCode", (n) -> { this.setPostalCode(n.getStringValue()); });
        deserializerMap.put("preferredLanguage", (n) -> { this.setPreferredLanguage(n.getStringValue()); });
        deserializerMap.put("privacyProfile", (n) -> { this.setPrivacyProfile(n.getObjectValue(PrivacyProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("provisionedPlans", (n) -> { this.setProvisionedPlans(n.getCollectionOfObjectValues(ProvisionedPlan::createFromDiscriminatorValue)); });
        deserializerMap.put("securityComplianceNotificationMails", (n) -> { this.setSecurityComplianceNotificationMails(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("securityComplianceNotificationPhones", (n) -> { this.setSecurityComplianceNotificationPhones(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("street", (n) -> { this.setStreet(n.getStringValue()); });
        deserializerMap.put("technicalNotificationMails", (n) -> { this.setTechnicalNotificationMails(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tenantType", (n) -> { this.setTenantType(n.getStringValue()); });
        deserializerMap.put("verifiedDomains", (n) -> { this.setVerifiedDomains(n.getCollectionOfObjectValues(VerifiedDomain::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the marketingNotificationEmails property value. Not nullable.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMarketingNotificationEmails() {
        return this.backingStore.get("marketingNotificationEmails");
    }
    /**
     * Gets the mobileDeviceManagementAuthority property value. Mobile device management authority.
     * @return a MdmAuthority
     */
    @jakarta.annotation.Nullable
    public MdmAuthority getMobileDeviceManagementAuthority() {
        return this.backingStore.get("mobileDeviceManagementAuthority");
    }
    /**
     * Gets the onPremisesLastSyncDateTime property value. The time and date at which the tenant was last synced with the on-premises directory. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOnPremisesLastSyncDateTime() {
        return this.backingStore.get("onPremisesLastSyncDateTime");
    }
    /**
     * Gets the onPremisesSyncEnabled property value. true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced. Nullable. null if this object has never been synced from an on-premises directory (default).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOnPremisesSyncEnabled() {
        return this.backingStore.get("onPremisesSyncEnabled");
    }
    /**
     * Gets the partnerTenantType property value. The type of partnership this tenant has with Microsoft. The possible values are: microsoftSupport, syndicatePartner, breadthPartner, breadthPartnerDelegatedAdmin, resellerPartnerDelegatedAdmin, valueAddedResellerPartnerDelegatedAdmin, unknownFutureValue. Nullable. For more information about the possible types, see partnerTenantType values.
     * @return a OrganizationPartnerTenantType
     */
    @jakarta.annotation.Nullable
    public OrganizationPartnerTenantType getPartnerTenantType() {
        return this.backingStore.get("partnerTenantType");
    }
    /**
     * Gets the postalCode property value. Postal code of the address for the organization.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPostalCode() {
        return this.backingStore.get("postalCode");
    }
    /**
     * Gets the preferredLanguage property value. The preferred language for the organization. Should follow ISO 639-1 Code; for example, en.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPreferredLanguage() {
        return this.backingStore.get("preferredLanguage");
    }
    /**
     * Gets the privacyProfile property value. The privacy profile of an organization.
     * @return a PrivacyProfile
     */
    @jakarta.annotation.Nullable
    public PrivacyProfile getPrivacyProfile() {
        return this.backingStore.get("privacyProfile");
    }
    /**
     * Gets the provisionedPlans property value. Not nullable.
     * @return a java.util.List<ProvisionedPlan>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProvisionedPlan> getProvisionedPlans() {
        return this.backingStore.get("provisionedPlans");
    }
    /**
     * Gets the securityComplianceNotificationMails property value. Not nullable.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSecurityComplianceNotificationMails() {
        return this.backingStore.get("securityComplianceNotificationMails");
    }
    /**
     * Gets the securityComplianceNotificationPhones property value. Not nullable.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSecurityComplianceNotificationPhones() {
        return this.backingStore.get("securityComplianceNotificationPhones");
    }
    /**
     * Gets the state property value. State name of the address for the organization.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the street property value. Street name of the address for organization.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStreet() {
        return this.backingStore.get("street");
    }
    /**
     * Gets the technicalNotificationMails property value. Not nullable.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTechnicalNotificationMails() {
        return this.backingStore.get("technicalNotificationMails");
    }
    /**
     * Gets the tenantType property value. Not nullable. The tenant type option that was selected when the tenant was created. The possible values are:  AAD - An enterprise identity access management (IAM) service that serves business-to-employee and business-to-business (B2B) scenarios.  AAD B2C A customer identity access management (CIAM) service that serves business-to-consumer (B2C) scenarios.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantType() {
        return this.backingStore.get("tenantType");
    }
    /**
     * Gets the verifiedDomains property value. The collection of domains associated with this tenant. Not nullable.
     * @return a java.util.List<VerifiedDomain>
     */
    @jakarta.annotation.Nullable
    public java.util.List<VerifiedDomain> getVerifiedDomains() {
        return this.backingStore.get("verifiedDomains");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignedPlans", this.getAssignedPlans());
        writer.writeObjectValue("branding", this.getBranding());
        writer.writeCollectionOfPrimitiveValues("businessPhones", this.getBusinessPhones());
        writer.writeCollectionOfObjectValues("certificateBasedAuthConfiguration", this.getCertificateBasedAuthConfiguration());
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("country", this.getCountry());
        writer.writeStringValue("countryLetterCode", this.getCountryLetterCode());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("defaultUsageLocation", this.getDefaultUsageLocation());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeCollectionOfPrimitiveValues("marketingNotificationEmails", this.getMarketingNotificationEmails());
        writer.writeEnumValue("mobileDeviceManagementAuthority", this.getMobileDeviceManagementAuthority());
        writer.writeOffsetDateTimeValue("onPremisesLastSyncDateTime", this.getOnPremisesLastSyncDateTime());
        writer.writeBooleanValue("onPremisesSyncEnabled", this.getOnPremisesSyncEnabled());
        writer.writeEnumValue("partnerTenantType", this.getPartnerTenantType());
        writer.writeStringValue("postalCode", this.getPostalCode());
        writer.writeStringValue("preferredLanguage", this.getPreferredLanguage());
        writer.writeObjectValue("privacyProfile", this.getPrivacyProfile());
        writer.writeCollectionOfObjectValues("provisionedPlans", this.getProvisionedPlans());
        writer.writeCollectionOfPrimitiveValues("securityComplianceNotificationMails", this.getSecurityComplianceNotificationMails());
        writer.writeCollectionOfPrimitiveValues("securityComplianceNotificationPhones", this.getSecurityComplianceNotificationPhones());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("street", this.getStreet());
        writer.writeCollectionOfPrimitiveValues("technicalNotificationMails", this.getTechnicalNotificationMails());
        writer.writeStringValue("tenantType", this.getTenantType());
        writer.writeCollectionOfObjectValues("verifiedDomains", this.getVerifiedDomains());
    }
    /**
     * Sets the assignedPlans property value. The collection of service plans associated with the tenant. Not nullable.
     * @param value Value to set for the assignedPlans property.
     */
    public void setAssignedPlans(@jakarta.annotation.Nullable final java.util.List<AssignedPlan> value) {
        this.backingStore.set("assignedPlans", value);
    }
    /**
     * Sets the branding property value. Branding for the organization. Nullable.
     * @param value Value to set for the branding property.
     */
    public void setBranding(@jakarta.annotation.Nullable final OrganizationalBranding value) {
        this.backingStore.set("branding", value);
    }
    /**
     * Sets the businessPhones property value. Telephone number for the organization. Although this is a string collection, only one number can be set for this property.
     * @param value Value to set for the businessPhones property.
     */
    public void setBusinessPhones(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("businessPhones", value);
    }
    /**
     * Sets the certificateBasedAuthConfiguration property value. Navigation property to manage certificate-based authentication configuration. Only a single instance of certificateBasedAuthConfiguration can be created in the collection.
     * @param value Value to set for the certificateBasedAuthConfiguration property.
     */
    public void setCertificateBasedAuthConfiguration(@jakarta.annotation.Nullable final java.util.List<CertificateBasedAuthConfiguration> value) {
        this.backingStore.set("certificateBasedAuthConfiguration", value);
    }
    /**
     * Sets the city property value. City name of the address for the organization.
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("city", value);
    }
    /**
     * Sets the country property value. Country/region name of the address for the organization.
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("country", value);
    }
    /**
     * Sets the countryLetterCode property value. Country or region abbreviation for the organization in ISO 3166-2 format.
     * @param value Value to set for the countryLetterCode property.
     */
    public void setCountryLetterCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("countryLetterCode", value);
    }
    /**
     * Sets the createdDateTime property value. Timestamp of when the organization was created. The value cannot be modified and is automatically populated when the organization is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the defaultUsageLocation property value. Two-letter ISO 3166 country code indicating the default service usage location of an organization.
     * @param value Value to set for the defaultUsageLocation property.
     */
    public void setDefaultUsageLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultUsageLocation", value);
    }
    /**
     * Sets the displayName property value. The display name for the tenant.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the organization. Read-only. Nullable.
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final java.util.List<Extension> value) {
        this.backingStore.set("extensions", value);
    }
    /**
     * Sets the marketingNotificationEmails property value. Not nullable.
     * @param value Value to set for the marketingNotificationEmails property.
     */
    public void setMarketingNotificationEmails(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("marketingNotificationEmails", value);
    }
    /**
     * Sets the mobileDeviceManagementAuthority property value. Mobile device management authority.
     * @param value Value to set for the mobileDeviceManagementAuthority property.
     */
    public void setMobileDeviceManagementAuthority(@jakarta.annotation.Nullable final MdmAuthority value) {
        this.backingStore.set("mobileDeviceManagementAuthority", value);
    }
    /**
     * Sets the onPremisesLastSyncDateTime property value. The time and date at which the tenant was last synced with the on-premises directory. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the onPremisesLastSyncDateTime property.
     */
    public void setOnPremisesLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("onPremisesLastSyncDateTime", value);
    }
    /**
     * Sets the onPremisesSyncEnabled property value. true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced. Nullable. null if this object has never been synced from an on-premises directory (default).
     * @param value Value to set for the onPremisesSyncEnabled property.
     */
    public void setOnPremisesSyncEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("onPremisesSyncEnabled", value);
    }
    /**
     * Sets the partnerTenantType property value. The type of partnership this tenant has with Microsoft. The possible values are: microsoftSupport, syndicatePartner, breadthPartner, breadthPartnerDelegatedAdmin, resellerPartnerDelegatedAdmin, valueAddedResellerPartnerDelegatedAdmin, unknownFutureValue. Nullable. For more information about the possible types, see partnerTenantType values.
     * @param value Value to set for the partnerTenantType property.
     */
    public void setPartnerTenantType(@jakarta.annotation.Nullable final OrganizationPartnerTenantType value) {
        this.backingStore.set("partnerTenantType", value);
    }
    /**
     * Sets the postalCode property value. Postal code of the address for the organization.
     * @param value Value to set for the postalCode property.
     */
    public void setPostalCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("postalCode", value);
    }
    /**
     * Sets the preferredLanguage property value. The preferred language for the organization. Should follow ISO 639-1 Code; for example, en.
     * @param value Value to set for the preferredLanguage property.
     */
    public void setPreferredLanguage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preferredLanguage", value);
    }
    /**
     * Sets the privacyProfile property value. The privacy profile of an organization.
     * @param value Value to set for the privacyProfile property.
     */
    public void setPrivacyProfile(@jakarta.annotation.Nullable final PrivacyProfile value) {
        this.backingStore.set("privacyProfile", value);
    }
    /**
     * Sets the provisionedPlans property value. Not nullable.
     * @param value Value to set for the provisionedPlans property.
     */
    public void setProvisionedPlans(@jakarta.annotation.Nullable final java.util.List<ProvisionedPlan> value) {
        this.backingStore.set("provisionedPlans", value);
    }
    /**
     * Sets the securityComplianceNotificationMails property value. Not nullable.
     * @param value Value to set for the securityComplianceNotificationMails property.
     */
    public void setSecurityComplianceNotificationMails(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("securityComplianceNotificationMails", value);
    }
    /**
     * Sets the securityComplianceNotificationPhones property value. Not nullable.
     * @param value Value to set for the securityComplianceNotificationPhones property.
     */
    public void setSecurityComplianceNotificationPhones(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("securityComplianceNotificationPhones", value);
    }
    /**
     * Sets the state property value. State name of the address for the organization.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the street property value. Street name of the address for organization.
     * @param value Value to set for the street property.
     */
    public void setStreet(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("street", value);
    }
    /**
     * Sets the technicalNotificationMails property value. Not nullable.
     * @param value Value to set for the technicalNotificationMails property.
     */
    public void setTechnicalNotificationMails(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("technicalNotificationMails", value);
    }
    /**
     * Sets the tenantType property value. Not nullable. The tenant type option that was selected when the tenant was created. The possible values are:  AAD - An enterprise identity access management (IAM) service that serves business-to-employee and business-to-business (B2B) scenarios.  AAD B2C A customer identity access management (CIAM) service that serves business-to-consumer (B2C) scenarios.
     * @param value Value to set for the tenantType property.
     */
    public void setTenantType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantType", value);
    }
    /**
     * Sets the verifiedDomains property value. The collection of domains associated with this tenant. Not nullable.
     * @param value Value to set for the verifiedDomains property.
     */
    public void setVerifiedDomains(@jakarta.annotation.Nullable final java.util.List<VerifiedDomain> value) {
        this.backingStore.set("verifiedDomains", value);
    }
}
