package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceAppManagement extends Entity implements Parsable {
    /** Android managed app policies. */
    private java.util.List<AndroidManagedAppProtection> _androidManagedAppProtections;
    /** Default managed app policies. */
    private java.util.List<DefaultManagedAppProtection> _defaultManagedAppProtections;
    /** iOS managed app policies. */
    private java.util.List<IosManagedAppProtection> _iosManagedAppProtections;
    /** Whether the account is enabled for syncing applications from the Microsoft Store for Business. */
    private Boolean _isEnabledForMicrosoftStoreForBusiness;
    /** Managed app policies. */
    private java.util.List<ManagedAppPolicy> _managedAppPolicies;
    /** The managed app registrations. */
    private java.util.List<ManagedAppRegistration> _managedAppRegistrations;
    /** The managed app statuses. */
    private java.util.List<ManagedAppStatus> _managedAppStatuses;
    /** The Managed eBook. */
    private java.util.List<ManagedEBook> _managedEBooks;
    /** Windows information protection for apps running on devices which are MDM enrolled. */
    private java.util.List<MdmWindowsInformationProtectionPolicy> _mdmWindowsInformationProtectionPolicies;
    /** The locale information used to sync applications from the Microsoft Store for Business. Cultures that are specific to a country/region. The names of these cultures follow RFC 4646 (Windows Vista and later). The format is -<country/regioncode2>, where  is a lowercase two-letter code derived from ISO 639-1 and <country/regioncode2> is an uppercase two-letter code derived from ISO 3166. For example, en-US for English (United States) is a specific culture. */
    private String _microsoftStoreForBusinessLanguage;
    /** The last time an application sync from the Microsoft Store for Business was completed. */
    private OffsetDateTime _microsoftStoreForBusinessLastCompletedApplicationSyncTime;
    /** The last time the apps from the Microsoft Store for Business were synced successfully for the account. */
    private OffsetDateTime _microsoftStoreForBusinessLastSuccessfulSyncDateTime;
    /** The mobile app categories. */
    private java.util.List<MobileAppCategory> _mobileAppCategories;
    /** The Managed Device Mobile Application Configurations. */
    private java.util.List<ManagedDeviceMobileAppConfiguration> _mobileAppConfigurations;
    /** The mobile apps. */
    private java.util.List<MobileApp> _mobileApps;
    /** Targeted managed app configurations. */
    private java.util.List<TargetedManagedAppConfiguration> _targetedManagedAppConfigurations;
    /** List of Vpp tokens for this organization. */
    private java.util.List<VppToken> _vppTokens;
    /** Windows information protection for apps running on devices which are not MDM enrolled. */
    private java.util.List<WindowsInformationProtectionPolicy> _windowsInformationProtectionPolicies;
    /**
     * Instantiates a new DeviceAppManagement and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceAppManagement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceAppManagement
     */
    @javax.annotation.Nonnull
    public static DeviceAppManagement createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceAppManagement();
    }
    /**
     * Gets the androidManagedAppProtections property value. Android managed app policies.
     * @return a androidManagedAppProtection
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidManagedAppProtection> getAndroidManagedAppProtections() {
        return this._androidManagedAppProtections;
    }
    /**
     * Gets the defaultManagedAppProtections property value. Default managed app policies.
     * @return a defaultManagedAppProtection
     */
    @javax.annotation.Nullable
    public java.util.List<DefaultManagedAppProtection> getDefaultManagedAppProtections() {
        return this._defaultManagedAppProtections;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("androidManagedAppProtections", (n) -> { this.setAndroidManagedAppProtections(n.getCollectionOfObjectValues(AndroidManagedAppProtection::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultManagedAppProtections", (n) -> { this.setDefaultManagedAppProtections(n.getCollectionOfObjectValues(DefaultManagedAppProtection::createFromDiscriminatorValue)); });
        deserializerMap.put("iosManagedAppProtections", (n) -> { this.setIosManagedAppProtections(n.getCollectionOfObjectValues(IosManagedAppProtection::createFromDiscriminatorValue)); });
        deserializerMap.put("isEnabledForMicrosoftStoreForBusiness", (n) -> { this.setIsEnabledForMicrosoftStoreForBusiness(n.getBooleanValue()); });
        deserializerMap.put("managedAppPolicies", (n) -> { this.setManagedAppPolicies(n.getCollectionOfObjectValues(ManagedAppPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("managedAppRegistrations", (n) -> { this.setManagedAppRegistrations(n.getCollectionOfObjectValues(ManagedAppRegistration::createFromDiscriminatorValue)); });
        deserializerMap.put("managedAppStatuses", (n) -> { this.setManagedAppStatuses(n.getCollectionOfObjectValues(ManagedAppStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("managedEBooks", (n) -> { this.setManagedEBooks(n.getCollectionOfObjectValues(ManagedEBook::createFromDiscriminatorValue)); });
        deserializerMap.put("mdmWindowsInformationProtectionPolicies", (n) -> { this.setMdmWindowsInformationProtectionPolicies(n.getCollectionOfObjectValues(MdmWindowsInformationProtectionPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("microsoftStoreForBusinessLanguage", (n) -> { this.setMicrosoftStoreForBusinessLanguage(n.getStringValue()); });
        deserializerMap.put("microsoftStoreForBusinessLastCompletedApplicationSyncTime", (n) -> { this.setMicrosoftStoreForBusinessLastCompletedApplicationSyncTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("microsoftStoreForBusinessLastSuccessfulSyncDateTime", (n) -> { this.setMicrosoftStoreForBusinessLastSuccessfulSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("mobileAppCategories", (n) -> { this.setMobileAppCategories(n.getCollectionOfObjectValues(MobileAppCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("mobileAppConfigurations", (n) -> { this.setMobileAppConfigurations(n.getCollectionOfObjectValues(ManagedDeviceMobileAppConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("mobileApps", (n) -> { this.setMobileApps(n.getCollectionOfObjectValues(MobileApp::createFromDiscriminatorValue)); });
        deserializerMap.put("targetedManagedAppConfigurations", (n) -> { this.setTargetedManagedAppConfigurations(n.getCollectionOfObjectValues(TargetedManagedAppConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("vppTokens", (n) -> { this.setVppTokens(n.getCollectionOfObjectValues(VppToken::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsInformationProtectionPolicies", (n) -> { this.setWindowsInformationProtectionPolicies(n.getCollectionOfObjectValues(WindowsInformationProtectionPolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the iosManagedAppProtections property value. iOS managed app policies.
     * @return a iosManagedAppProtection
     */
    @javax.annotation.Nullable
    public java.util.List<IosManagedAppProtection> getIosManagedAppProtections() {
        return this._iosManagedAppProtections;
    }
    /**
     * Gets the isEnabledForMicrosoftStoreForBusiness property value. Whether the account is enabled for syncing applications from the Microsoft Store for Business.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabledForMicrosoftStoreForBusiness() {
        return this._isEnabledForMicrosoftStoreForBusiness;
    }
    /**
     * Gets the managedAppPolicies property value. Managed app policies.
     * @return a managedAppPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAppPolicy> getManagedAppPolicies() {
        return this._managedAppPolicies;
    }
    /**
     * Gets the managedAppRegistrations property value. The managed app registrations.
     * @return a managedAppRegistration
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAppRegistration> getManagedAppRegistrations() {
        return this._managedAppRegistrations;
    }
    /**
     * Gets the managedAppStatuses property value. The managed app statuses.
     * @return a managedAppStatus
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAppStatus> getManagedAppStatuses() {
        return this._managedAppStatuses;
    }
    /**
     * Gets the managedEBooks property value. The Managed eBook.
     * @return a managedEBook
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedEBook> getManagedEBooks() {
        return this._managedEBooks;
    }
    /**
     * Gets the mdmWindowsInformationProtectionPolicies property value. Windows information protection for apps running on devices which are MDM enrolled.
     * @return a mdmWindowsInformationProtectionPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<MdmWindowsInformationProtectionPolicy> getMdmWindowsInformationProtectionPolicies() {
        return this._mdmWindowsInformationProtectionPolicies;
    }
    /**
     * Gets the microsoftStoreForBusinessLanguage property value. The locale information used to sync applications from the Microsoft Store for Business. Cultures that are specific to a country/region. The names of these cultures follow RFC 4646 (Windows Vista and later). The format is -<country/regioncode2>, where  is a lowercase two-letter code derived from ISO 639-1 and <country/regioncode2> is an uppercase two-letter code derived from ISO 3166. For example, en-US for English (United States) is a specific culture.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMicrosoftStoreForBusinessLanguage() {
        return this._microsoftStoreForBusinessLanguage;
    }
    /**
     * Gets the microsoftStoreForBusinessLastCompletedApplicationSyncTime property value. The last time an application sync from the Microsoft Store for Business was completed.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getMicrosoftStoreForBusinessLastCompletedApplicationSyncTime() {
        return this._microsoftStoreForBusinessLastCompletedApplicationSyncTime;
    }
    /**
     * Gets the microsoftStoreForBusinessLastSuccessfulSyncDateTime property value. The last time the apps from the Microsoft Store for Business were synced successfully for the account.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getMicrosoftStoreForBusinessLastSuccessfulSyncDateTime() {
        return this._microsoftStoreForBusinessLastSuccessfulSyncDateTime;
    }
    /**
     * Gets the mobileAppCategories property value. The mobile app categories.
     * @return a mobileAppCategory
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppCategory> getMobileAppCategories() {
        return this._mobileAppCategories;
    }
    /**
     * Gets the mobileAppConfigurations property value. The Managed Device Mobile Application Configurations.
     * @return a managedDeviceMobileAppConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceMobileAppConfiguration> getMobileAppConfigurations() {
        return this._mobileAppConfigurations;
    }
    /**
     * Gets the mobileApps property value. The mobile apps.
     * @return a mobileApp
     */
    @javax.annotation.Nullable
    public java.util.List<MobileApp> getMobileApps() {
        return this._mobileApps;
    }
    /**
     * Gets the targetedManagedAppConfigurations property value. Targeted managed app configurations.
     * @return a targetedManagedAppConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<TargetedManagedAppConfiguration> getTargetedManagedAppConfigurations() {
        return this._targetedManagedAppConfigurations;
    }
    /**
     * Gets the vppTokens property value. List of Vpp tokens for this organization.
     * @return a vppToken
     */
    @javax.annotation.Nullable
    public java.util.List<VppToken> getVppTokens() {
        return this._vppTokens;
    }
    /**
     * Gets the windowsInformationProtectionPolicies property value. Windows information protection for apps running on devices which are not MDM enrolled.
     * @return a windowsInformationProtectionPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionPolicy> getWindowsInformationProtectionPolicies() {
        return this._windowsInformationProtectionPolicies;
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
        writer.writeCollectionOfObjectValues("androidManagedAppProtections", this.getAndroidManagedAppProtections());
        writer.writeCollectionOfObjectValues("defaultManagedAppProtections", this.getDefaultManagedAppProtections());
        writer.writeCollectionOfObjectValues("iosManagedAppProtections", this.getIosManagedAppProtections());
        writer.writeBooleanValue("isEnabledForMicrosoftStoreForBusiness", this.getIsEnabledForMicrosoftStoreForBusiness());
        writer.writeCollectionOfObjectValues("managedAppPolicies", this.getManagedAppPolicies());
        writer.writeCollectionOfObjectValues("managedAppRegistrations", this.getManagedAppRegistrations());
        writer.writeCollectionOfObjectValues("managedAppStatuses", this.getManagedAppStatuses());
        writer.writeCollectionOfObjectValues("managedEBooks", this.getManagedEBooks());
        writer.writeCollectionOfObjectValues("mdmWindowsInformationProtectionPolicies", this.getMdmWindowsInformationProtectionPolicies());
        writer.writeStringValue("microsoftStoreForBusinessLanguage", this.getMicrosoftStoreForBusinessLanguage());
        writer.writeOffsetDateTimeValue("microsoftStoreForBusinessLastCompletedApplicationSyncTime", this.getMicrosoftStoreForBusinessLastCompletedApplicationSyncTime());
        writer.writeOffsetDateTimeValue("microsoftStoreForBusinessLastSuccessfulSyncDateTime", this.getMicrosoftStoreForBusinessLastSuccessfulSyncDateTime());
        writer.writeCollectionOfObjectValues("mobileAppCategories", this.getMobileAppCategories());
        writer.writeCollectionOfObjectValues("mobileAppConfigurations", this.getMobileAppConfigurations());
        writer.writeCollectionOfObjectValues("mobileApps", this.getMobileApps());
        writer.writeCollectionOfObjectValues("targetedManagedAppConfigurations", this.getTargetedManagedAppConfigurations());
        writer.writeCollectionOfObjectValues("vppTokens", this.getVppTokens());
        writer.writeCollectionOfObjectValues("windowsInformationProtectionPolicies", this.getWindowsInformationProtectionPolicies());
    }
    /**
     * Sets the androidManagedAppProtections property value. Android managed app policies.
     * @param value Value to set for the androidManagedAppProtections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidManagedAppProtections(@javax.annotation.Nullable final java.util.List<AndroidManagedAppProtection> value) {
        this._androidManagedAppProtections = value;
    }
    /**
     * Sets the defaultManagedAppProtections property value. Default managed app policies.
     * @param value Value to set for the defaultManagedAppProtections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultManagedAppProtections(@javax.annotation.Nullable final java.util.List<DefaultManagedAppProtection> value) {
        this._defaultManagedAppProtections = value;
    }
    /**
     * Sets the iosManagedAppProtections property value. iOS managed app policies.
     * @param value Value to set for the iosManagedAppProtections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIosManagedAppProtections(@javax.annotation.Nullable final java.util.List<IosManagedAppProtection> value) {
        this._iosManagedAppProtections = value;
    }
    /**
     * Sets the isEnabledForMicrosoftStoreForBusiness property value. Whether the account is enabled for syncing applications from the Microsoft Store for Business.
     * @param value Value to set for the isEnabledForMicrosoftStoreForBusiness property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabledForMicrosoftStoreForBusiness(@javax.annotation.Nullable final Boolean value) {
        this._isEnabledForMicrosoftStoreForBusiness = value;
    }
    /**
     * Sets the managedAppPolicies property value. Managed app policies.
     * @param value Value to set for the managedAppPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedAppPolicies(@javax.annotation.Nullable final java.util.List<ManagedAppPolicy> value) {
        this._managedAppPolicies = value;
    }
    /**
     * Sets the managedAppRegistrations property value. The managed app registrations.
     * @param value Value to set for the managedAppRegistrations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedAppRegistrations(@javax.annotation.Nullable final java.util.List<ManagedAppRegistration> value) {
        this._managedAppRegistrations = value;
    }
    /**
     * Sets the managedAppStatuses property value. The managed app statuses.
     * @param value Value to set for the managedAppStatuses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedAppStatuses(@javax.annotation.Nullable final java.util.List<ManagedAppStatus> value) {
        this._managedAppStatuses = value;
    }
    /**
     * Sets the managedEBooks property value. The Managed eBook.
     * @param value Value to set for the managedEBooks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedEBooks(@javax.annotation.Nullable final java.util.List<ManagedEBook> value) {
        this._managedEBooks = value;
    }
    /**
     * Sets the mdmWindowsInformationProtectionPolicies property value. Windows information protection for apps running on devices which are MDM enrolled.
     * @param value Value to set for the mdmWindowsInformationProtectionPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMdmWindowsInformationProtectionPolicies(@javax.annotation.Nullable final java.util.List<MdmWindowsInformationProtectionPolicy> value) {
        this._mdmWindowsInformationProtectionPolicies = value;
    }
    /**
     * Sets the microsoftStoreForBusinessLanguage property value. The locale information used to sync applications from the Microsoft Store for Business. Cultures that are specific to a country/region. The names of these cultures follow RFC 4646 (Windows Vista and later). The format is -<country/regioncode2>, where  is a lowercase two-letter code derived from ISO 639-1 and <country/regioncode2> is an uppercase two-letter code derived from ISO 3166. For example, en-US for English (United States) is a specific culture.
     * @param value Value to set for the microsoftStoreForBusinessLanguage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftStoreForBusinessLanguage(@javax.annotation.Nullable final String value) {
        this._microsoftStoreForBusinessLanguage = value;
    }
    /**
     * Sets the microsoftStoreForBusinessLastCompletedApplicationSyncTime property value. The last time an application sync from the Microsoft Store for Business was completed.
     * @param value Value to set for the microsoftStoreForBusinessLastCompletedApplicationSyncTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftStoreForBusinessLastCompletedApplicationSyncTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._microsoftStoreForBusinessLastCompletedApplicationSyncTime = value;
    }
    /**
     * Sets the microsoftStoreForBusinessLastSuccessfulSyncDateTime property value. The last time the apps from the Microsoft Store for Business were synced successfully for the account.
     * @param value Value to set for the microsoftStoreForBusinessLastSuccessfulSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftStoreForBusinessLastSuccessfulSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._microsoftStoreForBusinessLastSuccessfulSyncDateTime = value;
    }
    /**
     * Sets the mobileAppCategories property value. The mobile app categories.
     * @param value Value to set for the mobileAppCategories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileAppCategories(@javax.annotation.Nullable final java.util.List<MobileAppCategory> value) {
        this._mobileAppCategories = value;
    }
    /**
     * Sets the mobileAppConfigurations property value. The Managed Device Mobile Application Configurations.
     * @param value Value to set for the mobileAppConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileAppConfigurations(@javax.annotation.Nullable final java.util.List<ManagedDeviceMobileAppConfiguration> value) {
        this._mobileAppConfigurations = value;
    }
    /**
     * Sets the mobileApps property value. The mobile apps.
     * @param value Value to set for the mobileApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileApps(@javax.annotation.Nullable final java.util.List<MobileApp> value) {
        this._mobileApps = value;
    }
    /**
     * Sets the targetedManagedAppConfigurations property value. Targeted managed app configurations.
     * @param value Value to set for the targetedManagedAppConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetedManagedAppConfigurations(@javax.annotation.Nullable final java.util.List<TargetedManagedAppConfiguration> value) {
        this._targetedManagedAppConfigurations = value;
    }
    /**
     * Sets the vppTokens property value. List of Vpp tokens for this organization.
     * @param value Value to set for the vppTokens property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVppTokens(@javax.annotation.Nullable final java.util.List<VppToken> value) {
        this._vppTokens = value;
    }
    /**
     * Sets the windowsInformationProtectionPolicies property value. Windows information protection for apps running on devices which are not MDM enrolled.
     * @param value Value to set for the windowsInformationProtectionPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsInformationProtectionPolicies(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionPolicy> value) {
        this._windowsInformationProtectionPolicies = value;
    }
}
