package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Organization extends DirectoryObject implements Parsable {
    /** The collection of service plans associated with the tenant. Not nullable. */
    private java.util.List<AssignedPlan> assignedPlans;
    /** Branding for the organization. Nullable. */
    private OrganizationalBranding branding;
    /** Telephone number for the organization. Although this is a string collection, only one number can be set for this property. */
    private java.util.List<String> businessPhones;
    /** Navigation property to manage certificate-based authentication configuration. Only a single instance of certificateBasedAuthConfiguration can be created in the collection. */
    private java.util.List<CertificateBasedAuthConfiguration> certificateBasedAuthConfiguration;
    /** City name of the address for the organization. */
    private String city;
    /** Country/region name of the address for the organization. */
    private String country;
    /** Country or region abbreviation for the organization in ISO 3166-2 format. */
    private String countryLetterCode;
    /** Timestamp of when the organization was created. The value cannot be modified and is automatically populated when the organization is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime createdDateTime;
    /** Two-letter ISO 3166 country code indicating the default service usage location of an organization. */
    private String defaultUsageLocation;
    /** The display name for the tenant. */
    private String displayName;
    /** The collection of open extensions defined for the organization. Read-only. Nullable. */
    private java.util.List<Extension> extensions;
    /** Not nullable. */
    private java.util.List<String> marketingNotificationEmails;
    /** Mobile device management authority. */
    private MdmAuthority mobileDeviceManagementAuthority;
    /** The time and date at which the tenant was last synced with the on-premises directory. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime onPremisesLastSyncDateTime;
    /** true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced. Nullable. null if this object has never been synced from an on-premises directory (default). */
    private Boolean onPremisesSyncEnabled;
    /** The type of partnership this tenant has with Microsoft. The possible values are: microsoftSupport, syndicatePartner, breadthPartner, breadthPartnerDelegatedAdmin, resellerPartnerDelegatedAdmin, valueAddedResellerPartnerDelegatedAdmin, unknownFutureValue. Nullable. For more information about the possible types, see partnerTenantType values. */
    private PartnerTenantType partnerTenantType;
    /** Postal code of the address for the organization. */
    private String postalCode;
    /** The preferred language for the organization. Should follow ISO 639-1 Code; for example, en. */
    private String preferredLanguage;
    /** The privacy profile of an organization. */
    private PrivacyProfile privacyProfile;
    /** Not nullable. */
    private java.util.List<ProvisionedPlan> provisionedPlans;
    /** The securityComplianceNotificationMails property */
    private java.util.List<String> securityComplianceNotificationMails;
    /** The securityComplianceNotificationPhones property */
    private java.util.List<String> securityComplianceNotificationPhones;
    /** State name of the address for the organization. */
    private String state;
    /** Street name of the address for organization. */
    private String street;
    /** Not nullable. */
    private java.util.List<String> technicalNotificationMails;
    /** Not nullable. The tenant type option that was selected when the tenant was created. The possible values are:  AAD - An enterprise identity access management (IAM) service that serves business-to-employee and business-to-business (B2B) scenarios.  AAD B2C A customer identity access management (CIAM) service that serves business-to-consumer (B2C) scenarios. */
    private String tenantType;
    /** The collection of domains associated with this tenant. Not nullable. */
    private java.util.List<VerifiedDomain> verifiedDomains;
    /**
     * Instantiates a new Organization and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Organization() {
        super();
        this.setOdataType("#microsoft.graph.organization");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Organization
     */
    @javax.annotation.Nonnull
    public static Organization createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Organization();
    }
    /**
     * Gets the assignedPlans property value. The collection of service plans associated with the tenant. Not nullable.
     * @return a AssignedPlan
     */
    @javax.annotation.Nullable
    public java.util.List<AssignedPlan> getAssignedPlans() {
        return this.assignedPlans;
    }
    /**
     * Gets the branding property value. Branding for the organization. Nullable.
     * @return a organizationalBranding
     */
    @javax.annotation.Nullable
    public OrganizationalBranding getBranding() {
        return this.branding;
    }
    /**
     * Gets the businessPhones property value. Telephone number for the organization. Although this is a string collection, only one number can be set for this property.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getBusinessPhones() {
        return this.businessPhones;
    }
    /**
     * Gets the certificateBasedAuthConfiguration property value. Navigation property to manage certificate-based authentication configuration. Only a single instance of certificateBasedAuthConfiguration can be created in the collection.
     * @return a certificateBasedAuthConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<CertificateBasedAuthConfiguration> getCertificateBasedAuthConfiguration() {
        return this.certificateBasedAuthConfiguration;
    }
    /**
     * Gets the city property value. City name of the address for the organization.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the country property value. Country/region name of the address for the organization.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * Gets the countryLetterCode property value. Country or region abbreviation for the organization in ISO 3166-2 format.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountryLetterCode() {
        return this.countryLetterCode;
    }
    /**
     * Gets the createdDateTime property value. Timestamp of when the organization was created. The value cannot be modified and is automatically populated when the organization is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the defaultUsageLocation property value. Two-letter ISO 3166 country code indicating the default service usage location of an organization.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultUsageLocation() {
        return this.defaultUsageLocation;
    }
    /**
     * Gets the displayName property value. The display name for the tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the organization. Read-only. Nullable.
     * @return a extension
     */
    @javax.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this.extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
        deserializerMap.put("mobileDeviceManagementAuthority", (n) -> { this.setMobileDeviceManagementAuthority(n.getEnumValue(MdmAuthority.class)); });
        deserializerMap.put("onPremisesLastSyncDateTime", (n) -> { this.setOnPremisesLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("onPremisesSyncEnabled", (n) -> { this.setOnPremisesSyncEnabled(n.getBooleanValue()); });
        deserializerMap.put("partnerTenantType", (n) -> { this.setPartnerTenantType(n.getEnumValue(PartnerTenantType.class)); });
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
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMarketingNotificationEmails() {
        return this.marketingNotificationEmails;
    }
    /**
     * Gets the mobileDeviceManagementAuthority property value. Mobile device management authority.
     * @return a MdmAuthority
     */
    @javax.annotation.Nullable
    public MdmAuthority getMobileDeviceManagementAuthority() {
        return this.mobileDeviceManagementAuthority;
    }
    /**
     * Gets the onPremisesLastSyncDateTime property value. The time and date at which the tenant was last synced with the on-premises directory. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOnPremisesLastSyncDateTime() {
        return this.onPremisesLastSyncDateTime;
    }
    /**
     * Gets the onPremisesSyncEnabled property value. true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced. Nullable. null if this object has never been synced from an on-premises directory (default).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOnPremisesSyncEnabled() {
        return this.onPremisesSyncEnabled;
    }
    /**
     * Gets the partnerTenantType property value. The type of partnership this tenant has with Microsoft. The possible values are: microsoftSupport, syndicatePartner, breadthPartner, breadthPartnerDelegatedAdmin, resellerPartnerDelegatedAdmin, valueAddedResellerPartnerDelegatedAdmin, unknownFutureValue. Nullable. For more information about the possible types, see partnerTenantType values.
     * @return a partnerTenantType
     */
    @javax.annotation.Nullable
    public PartnerTenantType getPartnerTenantType() {
        return this.partnerTenantType;
    }
    /**
     * Gets the postalCode property value. Postal code of the address for the organization.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPostalCode() {
        return this.postalCode;
    }
    /**
     * Gets the preferredLanguage property value. The preferred language for the organization. Should follow ISO 639-1 Code; for example, en.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreferredLanguage() {
        return this.preferredLanguage;
    }
    /**
     * Gets the privacyProfile property value. The privacy profile of an organization.
     * @return a privacyProfile
     */
    @javax.annotation.Nullable
    public PrivacyProfile getPrivacyProfile() {
        return this.privacyProfile;
    }
    /**
     * Gets the provisionedPlans property value. Not nullable.
     * @return a ProvisionedPlan
     */
    @javax.annotation.Nullable
    public java.util.List<ProvisionedPlan> getProvisionedPlans() {
        return this.provisionedPlans;
    }
    /**
     * Gets the securityComplianceNotificationMails property value. The securityComplianceNotificationMails property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSecurityComplianceNotificationMails() {
        return this.securityComplianceNotificationMails;
    }
    /**
     * Gets the securityComplianceNotificationPhones property value. The securityComplianceNotificationPhones property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSecurityComplianceNotificationPhones() {
        return this.securityComplianceNotificationPhones;
    }
    /**
     * Gets the state property value. State name of the address for the organization.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the street property value. Street name of the address for organization.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStreet() {
        return this.street;
    }
    /**
     * Gets the technicalNotificationMails property value. Not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTechnicalNotificationMails() {
        return this.technicalNotificationMails;
    }
    /**
     * Gets the tenantType property value. Not nullable. The tenant type option that was selected when the tenant was created. The possible values are:  AAD - An enterprise identity access management (IAM) service that serves business-to-employee and business-to-business (B2B) scenarios.  AAD B2C A customer identity access management (CIAM) service that serves business-to-consumer (B2C) scenarios.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantType() {
        return this.tenantType;
    }
    /**
     * Gets the verifiedDomains property value. The collection of domains associated with this tenant. Not nullable.
     * @return a VerifiedDomain
     */
    @javax.annotation.Nullable
    public java.util.List<VerifiedDomain> getVerifiedDomains() {
        return this.verifiedDomains;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedPlans(@javax.annotation.Nullable final java.util.List<AssignedPlan> value) {
        this.assignedPlans = value;
    }
    /**
     * Sets the branding property value. Branding for the organization. Nullable.
     * @param value Value to set for the branding property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBranding(@javax.annotation.Nullable final OrganizationalBranding value) {
        this.branding = value;
    }
    /**
     * Sets the businessPhones property value. Telephone number for the organization. Although this is a string collection, only one number can be set for this property.
     * @param value Value to set for the businessPhones property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBusinessPhones(@javax.annotation.Nullable final java.util.List<String> value) {
        this.businessPhones = value;
    }
    /**
     * Sets the certificateBasedAuthConfiguration property value. Navigation property to manage certificate-based authentication configuration. Only a single instance of certificateBasedAuthConfiguration can be created in the collection.
     * @param value Value to set for the certificateBasedAuthConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateBasedAuthConfiguration(@javax.annotation.Nullable final java.util.List<CertificateBasedAuthConfiguration> value) {
        this.certificateBasedAuthConfiguration = value;
    }
    /**
     * Sets the city property value. City name of the address for the organization.
     * @param value Value to set for the city property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCity(@javax.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the country property value. Country/region name of the address for the organization.
     * @param value Value to set for the country property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountry(@javax.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the countryLetterCode property value. Country or region abbreviation for the organization in ISO 3166-2 format.
     * @param value Value to set for the countryLetterCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountryLetterCode(@javax.annotation.Nullable final String value) {
        this.countryLetterCode = value;
    }
    /**
     * Sets the createdDateTime property value. Timestamp of when the organization was created. The value cannot be modified and is automatically populated when the organization is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the defaultUsageLocation property value. Two-letter ISO 3166 country code indicating the default service usage location of an organization.
     * @param value Value to set for the defaultUsageLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultUsageLocation(@javax.annotation.Nullable final String value) {
        this.defaultUsageLocation = value;
    }
    /**
     * Sets the displayName property value. The display name for the tenant.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the organization. Read-only. Nullable.
     * @param value Value to set for the extensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtensions(@javax.annotation.Nullable final java.util.List<Extension> value) {
        this.extensions = value;
    }
    /**
     * Sets the marketingNotificationEmails property value. Not nullable.
     * @param value Value to set for the marketingNotificationEmails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMarketingNotificationEmails(@javax.annotation.Nullable final java.util.List<String> value) {
        this.marketingNotificationEmails = value;
    }
    /**
     * Sets the mobileDeviceManagementAuthority property value. Mobile device management authority.
     * @param value Value to set for the mobileDeviceManagementAuthority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileDeviceManagementAuthority(@javax.annotation.Nullable final MdmAuthority value) {
        this.mobileDeviceManagementAuthority = value;
    }
    /**
     * Sets the onPremisesLastSyncDateTime property value. The time and date at which the tenant was last synced with the on-premises directory. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the onPremisesLastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.onPremisesLastSyncDateTime = value;
    }
    /**
     * Sets the onPremisesSyncEnabled property value. true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced. Nullable. null if this object has never been synced from an on-premises directory (default).
     * @param value Value to set for the onPremisesSyncEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesSyncEnabled(@javax.annotation.Nullable final Boolean value) {
        this.onPremisesSyncEnabled = value;
    }
    /**
     * Sets the partnerTenantType property value. The type of partnership this tenant has with Microsoft. The possible values are: microsoftSupport, syndicatePartner, breadthPartner, breadthPartnerDelegatedAdmin, resellerPartnerDelegatedAdmin, valueAddedResellerPartnerDelegatedAdmin, unknownFutureValue. Nullable. For more information about the possible types, see partnerTenantType values.
     * @param value Value to set for the partnerTenantType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartnerTenantType(@javax.annotation.Nullable final PartnerTenantType value) {
        this.partnerTenantType = value;
    }
    /**
     * Sets the postalCode property value. Postal code of the address for the organization.
     * @param value Value to set for the postalCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPostalCode(@javax.annotation.Nullable final String value) {
        this.postalCode = value;
    }
    /**
     * Sets the preferredLanguage property value. The preferred language for the organization. Should follow ISO 639-1 Code; for example, en.
     * @param value Value to set for the preferredLanguage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreferredLanguage(@javax.annotation.Nullable final String value) {
        this.preferredLanguage = value;
    }
    /**
     * Sets the privacyProfile property value. The privacy profile of an organization.
     * @param value Value to set for the privacyProfile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyProfile(@javax.annotation.Nullable final PrivacyProfile value) {
        this.privacyProfile = value;
    }
    /**
     * Sets the provisionedPlans property value. Not nullable.
     * @param value Value to set for the provisionedPlans property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvisionedPlans(@javax.annotation.Nullable final java.util.List<ProvisionedPlan> value) {
        this.provisionedPlans = value;
    }
    /**
     * Sets the securityComplianceNotificationMails property value. The securityComplianceNotificationMails property
     * @param value Value to set for the securityComplianceNotificationMails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityComplianceNotificationMails(@javax.annotation.Nullable final java.util.List<String> value) {
        this.securityComplianceNotificationMails = value;
    }
    /**
     * Sets the securityComplianceNotificationPhones property value. The securityComplianceNotificationPhones property
     * @param value Value to set for the securityComplianceNotificationPhones property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityComplianceNotificationPhones(@javax.annotation.Nullable final java.util.List<String> value) {
        this.securityComplianceNotificationPhones = value;
    }
    /**
     * Sets the state property value. State name of the address for the organization.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the street property value. Street name of the address for organization.
     * @param value Value to set for the street property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStreet(@javax.annotation.Nullable final String value) {
        this.street = value;
    }
    /**
     * Sets the technicalNotificationMails property value. Not nullable.
     * @param value Value to set for the technicalNotificationMails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTechnicalNotificationMails(@javax.annotation.Nullable final java.util.List<String> value) {
        this.technicalNotificationMails = value;
    }
    /**
     * Sets the tenantType property value. Not nullable. The tenant type option that was selected when the tenant was created. The possible values are:  AAD - An enterprise identity access management (IAM) service that serves business-to-employee and business-to-business (B2B) scenarios.  AAD B2C A customer identity access management (CIAM) service that serves business-to-consumer (B2C) scenarios.
     * @param value Value to set for the tenantType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantType(@javax.annotation.Nullable final String value) {
        this.tenantType = value;
    }
    /**
     * Sets the verifiedDomains property value. The collection of domains associated with this tenant. Not nullable.
     * @param value Value to set for the verifiedDomains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVerifiedDomains(@javax.annotation.Nullable final java.util.List<VerifiedDomain> value) {
        this.verifiedDomains = value;
    }
}
