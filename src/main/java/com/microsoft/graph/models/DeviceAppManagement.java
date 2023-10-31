package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Singleton entity that acts as a container for all device app management functionality.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceAppManagement extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceAppManagement and sets the default values.
     */
    public DeviceAppManagement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceAppManagement
     */
    @jakarta.annotation.Nonnull
    public static DeviceAppManagement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceAppManagement();
    }
    /**
     * Gets the androidManagedAppProtections property value. Android managed app policies.
     * @return a java.util.List<AndroidManagedAppProtection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidManagedAppProtection> getAndroidManagedAppProtections() {
        return this.getBackingStore().get("androidManagedAppProtections");
    }
    /**
     * Gets the defaultManagedAppProtections property value. Default managed app policies.
     * @return a java.util.List<DefaultManagedAppProtection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DefaultManagedAppProtection> getDefaultManagedAppProtections() {
        return this.getBackingStore().get("defaultManagedAppProtections");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * @return a java.util.List<IosManagedAppProtection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IosManagedAppProtection> getIosManagedAppProtections() {
        return this.getBackingStore().get("iosManagedAppProtections");
    }
    /**
     * Gets the isEnabledForMicrosoftStoreForBusiness property value. Whether the account is enabled for syncing applications from the Microsoft Store for Business.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabledForMicrosoftStoreForBusiness() {
        return this.getBackingStore().get("isEnabledForMicrosoftStoreForBusiness");
    }
    /**
     * Gets the managedAppPolicies property value. Managed app policies.
     * @return a java.util.List<ManagedAppPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedAppPolicy> getManagedAppPolicies() {
        return this.getBackingStore().get("managedAppPolicies");
    }
    /**
     * Gets the managedAppRegistrations property value. The managed app registrations.
     * @return a java.util.List<ManagedAppRegistration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedAppRegistration> getManagedAppRegistrations() {
        return this.getBackingStore().get("managedAppRegistrations");
    }
    /**
     * Gets the managedAppStatuses property value. The managed app statuses.
     * @return a java.util.List<ManagedAppStatus>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedAppStatus> getManagedAppStatuses() {
        return this.getBackingStore().get("managedAppStatuses");
    }
    /**
     * Gets the managedEBooks property value. The Managed eBook.
     * @return a java.util.List<ManagedEBook>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedEBook> getManagedEBooks() {
        return this.getBackingStore().get("managedEBooks");
    }
    /**
     * Gets the mdmWindowsInformationProtectionPolicies property value. Windows information protection for apps running on devices which are MDM enrolled.
     * @return a java.util.List<MdmWindowsInformationProtectionPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MdmWindowsInformationProtectionPolicy> getMdmWindowsInformationProtectionPolicies() {
        return this.getBackingStore().get("mdmWindowsInformationProtectionPolicies");
    }
    /**
     * Gets the microsoftStoreForBusinessLanguage property value. The locale information used to sync applications from the Microsoft Store for Business. Cultures that are specific to a country/region. The names of these cultures follow RFC 4646 (Windows Vista and later). The format is -<country/regioncode2>, where  is a lowercase two-letter code derived from ISO 639-1 and <country/regioncode2> is an uppercase two-letter code derived from ISO 3166. For example, en-US for English (United States) is a specific culture.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMicrosoftStoreForBusinessLanguage() {
        return this.getBackingStore().get("microsoftStoreForBusinessLanguage");
    }
    /**
     * Gets the microsoftStoreForBusinessLastCompletedApplicationSyncTime property value. The last time an application sync from the Microsoft Store for Business was completed.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getMicrosoftStoreForBusinessLastCompletedApplicationSyncTime() {
        return this.getBackingStore().get("microsoftStoreForBusinessLastCompletedApplicationSyncTime");
    }
    /**
     * Gets the microsoftStoreForBusinessLastSuccessfulSyncDateTime property value. The last time the apps from the Microsoft Store for Business were synced successfully for the account.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getMicrosoftStoreForBusinessLastSuccessfulSyncDateTime() {
        return this.getBackingStore().get("microsoftStoreForBusinessLastSuccessfulSyncDateTime");
    }
    /**
     * Gets the mobileAppCategories property value. The mobile app categories.
     * @return a java.util.List<MobileAppCategory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileAppCategory> getMobileAppCategories() {
        return this.getBackingStore().get("mobileAppCategories");
    }
    /**
     * Gets the mobileAppConfigurations property value. The Managed Device Mobile Application Configurations.
     * @return a java.util.List<ManagedDeviceMobileAppConfiguration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceMobileAppConfiguration> getMobileAppConfigurations() {
        return this.getBackingStore().get("mobileAppConfigurations");
    }
    /**
     * Gets the mobileApps property value. The mobile apps.
     * @return a java.util.List<MobileApp>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileApp> getMobileApps() {
        return this.getBackingStore().get("mobileApps");
    }
    /**
     * Gets the targetedManagedAppConfigurations property value. Targeted managed app configurations.
     * @return a java.util.List<TargetedManagedAppConfiguration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TargetedManagedAppConfiguration> getTargetedManagedAppConfigurations() {
        return this.getBackingStore().get("targetedManagedAppConfigurations");
    }
    /**
     * Gets the vppTokens property value. List of Vpp tokens for this organization.
     * @return a java.util.List<VppToken>
     */
    @jakarta.annotation.Nullable
    public java.util.List<VppToken> getVppTokens() {
        return this.getBackingStore().get("vppTokens");
    }
    /**
     * Gets the windowsInformationProtectionPolicies property value. Windows information protection for apps running on devices which are not MDM enrolled.
     * @return a java.util.List<WindowsInformationProtectionPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionPolicy> getWindowsInformationProtectionPolicies() {
        return this.getBackingStore().get("windowsInformationProtectionPolicies");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAndroidManagedAppProtections(@jakarta.annotation.Nullable final java.util.List<AndroidManagedAppProtection> value) {
        this.getBackingStore().set("androidManagedAppProtections", value);
    }
    /**
     * Sets the defaultManagedAppProtections property value. Default managed app policies.
     * @param value Value to set for the defaultManagedAppProtections property.
     */
    public void setDefaultManagedAppProtections(@jakarta.annotation.Nullable final java.util.List<DefaultManagedAppProtection> value) {
        this.getBackingStore().set("defaultManagedAppProtections", value);
    }
    /**
     * Sets the iosManagedAppProtections property value. iOS managed app policies.
     * @param value Value to set for the iosManagedAppProtections property.
     */
    public void setIosManagedAppProtections(@jakarta.annotation.Nullable final java.util.List<IosManagedAppProtection> value) {
        this.getBackingStore().set("iosManagedAppProtections", value);
    }
    /**
     * Sets the isEnabledForMicrosoftStoreForBusiness property value. Whether the account is enabled for syncing applications from the Microsoft Store for Business.
     * @param value Value to set for the isEnabledForMicrosoftStoreForBusiness property.
     */
    public void setIsEnabledForMicrosoftStoreForBusiness(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("isEnabledForMicrosoftStoreForBusiness", value);
    }
    /**
     * Sets the managedAppPolicies property value. Managed app policies.
     * @param value Value to set for the managedAppPolicies property.
     */
    public void setManagedAppPolicies(@jakarta.annotation.Nullable final java.util.List<ManagedAppPolicy> value) {
        this.getBackingStore().set("managedAppPolicies", value);
    }
    /**
     * Sets the managedAppRegistrations property value. The managed app registrations.
     * @param value Value to set for the managedAppRegistrations property.
     */
    public void setManagedAppRegistrations(@jakarta.annotation.Nullable final java.util.List<ManagedAppRegistration> value) {
        this.getBackingStore().set("managedAppRegistrations", value);
    }
    /**
     * Sets the managedAppStatuses property value. The managed app statuses.
     * @param value Value to set for the managedAppStatuses property.
     */
    public void setManagedAppStatuses(@jakarta.annotation.Nullable final java.util.List<ManagedAppStatus> value) {
        this.getBackingStore().set("managedAppStatuses", value);
    }
    /**
     * Sets the managedEBooks property value. The Managed eBook.
     * @param value Value to set for the managedEBooks property.
     */
    public void setManagedEBooks(@jakarta.annotation.Nullable final java.util.List<ManagedEBook> value) {
        this.getBackingStore().set("managedEBooks", value);
    }
    /**
     * Sets the mdmWindowsInformationProtectionPolicies property value. Windows information protection for apps running on devices which are MDM enrolled.
     * @param value Value to set for the mdmWindowsInformationProtectionPolicies property.
     */
    public void setMdmWindowsInformationProtectionPolicies(@jakarta.annotation.Nullable final java.util.List<MdmWindowsInformationProtectionPolicy> value) {
        this.getBackingStore().set("mdmWindowsInformationProtectionPolicies", value);
    }
    /**
     * Sets the microsoftStoreForBusinessLanguage property value. The locale information used to sync applications from the Microsoft Store for Business. Cultures that are specific to a country/region. The names of these cultures follow RFC 4646 (Windows Vista and later). The format is -<country/regioncode2>, where  is a lowercase two-letter code derived from ISO 639-1 and <country/regioncode2> is an uppercase two-letter code derived from ISO 3166. For example, en-US for English (United States) is a specific culture.
     * @param value Value to set for the microsoftStoreForBusinessLanguage property.
     */
    public void setMicrosoftStoreForBusinessLanguage(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("microsoftStoreForBusinessLanguage", value);
    }
    /**
     * Sets the microsoftStoreForBusinessLastCompletedApplicationSyncTime property value. The last time an application sync from the Microsoft Store for Business was completed.
     * @param value Value to set for the microsoftStoreForBusinessLastCompletedApplicationSyncTime property.
     */
    public void setMicrosoftStoreForBusinessLastCompletedApplicationSyncTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("microsoftStoreForBusinessLastCompletedApplicationSyncTime", value);
    }
    /**
     * Sets the microsoftStoreForBusinessLastSuccessfulSyncDateTime property value. The last time the apps from the Microsoft Store for Business were synced successfully for the account.
     * @param value Value to set for the microsoftStoreForBusinessLastSuccessfulSyncDateTime property.
     */
    public void setMicrosoftStoreForBusinessLastSuccessfulSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("microsoftStoreForBusinessLastSuccessfulSyncDateTime", value);
    }
    /**
     * Sets the mobileAppCategories property value. The mobile app categories.
     * @param value Value to set for the mobileAppCategories property.
     */
    public void setMobileAppCategories(@jakarta.annotation.Nullable final java.util.List<MobileAppCategory> value) {
        this.getBackingStore().set("mobileAppCategories", value);
    }
    /**
     * Sets the mobileAppConfigurations property value. The Managed Device Mobile Application Configurations.
     * @param value Value to set for the mobileAppConfigurations property.
     */
    public void setMobileAppConfigurations(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceMobileAppConfiguration> value) {
        this.getBackingStore().set("mobileAppConfigurations", value);
    }
    /**
     * Sets the mobileApps property value. The mobile apps.
     * @param value Value to set for the mobileApps property.
     */
    public void setMobileApps(@jakarta.annotation.Nullable final java.util.List<MobileApp> value) {
        this.getBackingStore().set("mobileApps", value);
    }
    /**
     * Sets the targetedManagedAppConfigurations property value. Targeted managed app configurations.
     * @param value Value to set for the targetedManagedAppConfigurations property.
     */
    public void setTargetedManagedAppConfigurations(@jakarta.annotation.Nullable final java.util.List<TargetedManagedAppConfiguration> value) {
        this.getBackingStore().set("targetedManagedAppConfigurations", value);
    }
    /**
     * Sets the vppTokens property value. List of Vpp tokens for this organization.
     * @param value Value to set for the vppTokens property.
     */
    public void setVppTokens(@jakarta.annotation.Nullable final java.util.List<VppToken> value) {
        this.getBackingStore().set("vppTokens", value);
    }
    /**
     * Sets the windowsInformationProtectionPolicies property value. Windows information protection for apps running on devices which are not MDM enrolled.
     * @param value Value to set for the windowsInformationProtectionPolicies property.
     */
    public void setWindowsInformationProtectionPolicies(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionPolicy> value) {
        this.getBackingStore().set("windowsInformationProtectionPolicies", value);
    }
}
