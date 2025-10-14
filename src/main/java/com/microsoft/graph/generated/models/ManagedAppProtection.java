package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Policy used to configure detailed management settings for a specified set of apps
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedAppProtection extends ManagedAppPolicy implements Parsable {
    /**
     * Instantiates a new {@link ManagedAppProtection} and sets the default values.
     */
    public ManagedAppProtection() {
        super();
        this.setOdataType("#microsoft.graph.managedAppProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManagedAppProtection}
     */
    @jakarta.annotation.Nonnull
    public static ManagedAppProtection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidManagedAppProtection": return new AndroidManagedAppProtection();
                case "#microsoft.graph.defaultManagedAppProtection": return new DefaultManagedAppProtection();
                case "#microsoft.graph.iosManagedAppProtection": return new IosManagedAppProtection();
                case "#microsoft.graph.targetedManagedAppProtection": return new TargetedManagedAppProtection();
            }
        }
        return new ManagedAppProtection();
    }
    /**
     * Gets the allowedDataStorageLocations property value. Data storage locations where a user may store managed data.
     * @return a {@link java.util.List<ManagedAppDataStorageLocation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedAppDataStorageLocation> getAllowedDataStorageLocations() {
        return this.backingStore.get("allowedDataStorageLocations");
    }
    /**
     * Gets the allowedInboundDataTransferSources property value. Data can be transferred from/to these classes of apps
     * @return a {@link ManagedAppDataTransferLevel}
     */
    @jakarta.annotation.Nullable
    public ManagedAppDataTransferLevel getAllowedInboundDataTransferSources() {
        return this.backingStore.get("allowedInboundDataTransferSources");
    }
    /**
     * Gets the allowedOutboundClipboardSharingLevel property value. Represents the level to which the device&apos;s clipboard may be shared between apps
     * @return a {@link ManagedAppClipboardSharingLevel}
     */
    @jakarta.annotation.Nullable
    public ManagedAppClipboardSharingLevel getAllowedOutboundClipboardSharingLevel() {
        return this.backingStore.get("allowedOutboundClipboardSharingLevel");
    }
    /**
     * Gets the allowedOutboundDataTransferDestinations property value. Data can be transferred from/to these classes of apps
     * @return a {@link ManagedAppDataTransferLevel}
     */
    @jakarta.annotation.Nullable
    public ManagedAppDataTransferLevel getAllowedOutboundDataTransferDestinations() {
        return this.backingStore.get("allowedOutboundDataTransferDestinations");
    }
    /**
     * Gets the contactSyncBlocked property value. Indicates whether contacts can be synced to the user&apos;s device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getContactSyncBlocked() {
        return this.backingStore.get("contactSyncBlocked");
    }
    /**
     * Gets the dataBackupBlocked property value. Indicates whether the backup of a managed app&apos;s data is blocked.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDataBackupBlocked() {
        return this.backingStore.get("dataBackupBlocked");
    }
    /**
     * Gets the deviceComplianceRequired property value. Indicates whether device compliance is required.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceComplianceRequired() {
        return this.backingStore.get("deviceComplianceRequired");
    }
    /**
     * Gets the disableAppPinIfDevicePinIsSet property value. Indicates whether use of the app pin is required if the device pin is set.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableAppPinIfDevicePinIsSet() {
        return this.backingStore.get("disableAppPinIfDevicePinIsSet");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedDataStorageLocations", (n) -> { this.setAllowedDataStorageLocations(n.getCollectionOfEnumValues(ManagedAppDataStorageLocation::forValue)); });
        deserializerMap.put("allowedInboundDataTransferSources", (n) -> { this.setAllowedInboundDataTransferSources(n.getEnumValue(ManagedAppDataTransferLevel::forValue)); });
        deserializerMap.put("allowedOutboundClipboardSharingLevel", (n) -> { this.setAllowedOutboundClipboardSharingLevel(n.getEnumValue(ManagedAppClipboardSharingLevel::forValue)); });
        deserializerMap.put("allowedOutboundDataTransferDestinations", (n) -> { this.setAllowedOutboundDataTransferDestinations(n.getEnumValue(ManagedAppDataTransferLevel::forValue)); });
        deserializerMap.put("contactSyncBlocked", (n) -> { this.setContactSyncBlocked(n.getBooleanValue()); });
        deserializerMap.put("dataBackupBlocked", (n) -> { this.setDataBackupBlocked(n.getBooleanValue()); });
        deserializerMap.put("deviceComplianceRequired", (n) -> { this.setDeviceComplianceRequired(n.getBooleanValue()); });
        deserializerMap.put("disableAppPinIfDevicePinIsSet", (n) -> { this.setDisableAppPinIfDevicePinIsSet(n.getBooleanValue()); });
        deserializerMap.put("fingerprintBlocked", (n) -> { this.setFingerprintBlocked(n.getBooleanValue()); });
        deserializerMap.put("managedBrowser", (n) -> { this.setManagedBrowser(n.getEnumSetValue(ManagedBrowserType::forValue)); });
        deserializerMap.put("managedBrowserToOpenLinksRequired", (n) -> { this.setManagedBrowserToOpenLinksRequired(n.getBooleanValue()); });
        deserializerMap.put("maximumPinRetries", (n) -> { this.setMaximumPinRetries(n.getIntegerValue()); });
        deserializerMap.put("minimumPinLength", (n) -> { this.setMinimumPinLength(n.getIntegerValue()); });
        deserializerMap.put("minimumRequiredAppVersion", (n) -> { this.setMinimumRequiredAppVersion(n.getStringValue()); });
        deserializerMap.put("minimumRequiredOsVersion", (n) -> { this.setMinimumRequiredOsVersion(n.getStringValue()); });
        deserializerMap.put("minimumWarningAppVersion", (n) -> { this.setMinimumWarningAppVersion(n.getStringValue()); });
        deserializerMap.put("minimumWarningOsVersion", (n) -> { this.setMinimumWarningOsVersion(n.getStringValue()); });
        deserializerMap.put("organizationalCredentialsRequired", (n) -> { this.setOrganizationalCredentialsRequired(n.getBooleanValue()); });
        deserializerMap.put("periodBeforePinReset", (n) -> { this.setPeriodBeforePinReset(n.getPeriodAndDurationValue()); });
        deserializerMap.put("periodOfflineBeforeAccessCheck", (n) -> { this.setPeriodOfflineBeforeAccessCheck(n.getPeriodAndDurationValue()); });
        deserializerMap.put("periodOfflineBeforeWipeIsEnforced", (n) -> { this.setPeriodOfflineBeforeWipeIsEnforced(n.getPeriodAndDurationValue()); });
        deserializerMap.put("periodOnlineBeforeAccessCheck", (n) -> { this.setPeriodOnlineBeforeAccessCheck(n.getPeriodAndDurationValue()); });
        deserializerMap.put("pinCharacterSet", (n) -> { this.setPinCharacterSet(n.getEnumValue(ManagedAppPinCharacterSet::forValue)); });
        deserializerMap.put("pinRequired", (n) -> { this.setPinRequired(n.getBooleanValue()); });
        deserializerMap.put("printBlocked", (n) -> { this.setPrintBlocked(n.getBooleanValue()); });
        deserializerMap.put("saveAsBlocked", (n) -> { this.setSaveAsBlocked(n.getBooleanValue()); });
        deserializerMap.put("simplePinBlocked", (n) -> { this.setSimplePinBlocked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fingerprintBlocked property value. Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFingerprintBlocked() {
        return this.backingStore.get("fingerprintBlocked");
    }
    /**
     * Gets the managedBrowser property value. Type of managed browser
     * @return a {@link EnumSet<ManagedBrowserType>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ManagedBrowserType> getManagedBrowser() {
        return this.backingStore.get("managedBrowser");
    }
    /**
     * Gets the managedBrowserToOpenLinksRequired property value. Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android)
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getManagedBrowserToOpenLinksRequired() {
        return this.backingStore.get("managedBrowserToOpenLinksRequired");
    }
    /**
     * Gets the maximumPinRetries property value. Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped. Valid values 1 to 65535
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumPinRetries() {
        return this.backingStore.get("maximumPinRetries");
    }
    /**
     * Gets the minimumPinLength property value. Minimum pin length required for an app-level pin if PinRequired is set to True
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumPinLength() {
        return this.backingStore.get("minimumPinLength");
    }
    /**
     * Gets the minimumRequiredAppVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMinimumRequiredAppVersion() {
        return this.backingStore.get("minimumRequiredAppVersion");
    }
    /**
     * Gets the minimumRequiredOsVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMinimumRequiredOsVersion() {
        return this.backingStore.get("minimumRequiredOsVersion");
    }
    /**
     * Gets the minimumWarningAppVersion property value. Versions less than the specified version will result in warning message on the managed app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMinimumWarningAppVersion() {
        return this.backingStore.get("minimumWarningAppVersion");
    }
    /**
     * Gets the minimumWarningOsVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMinimumWarningOsVersion() {
        return this.backingStore.get("minimumWarningOsVersion");
    }
    /**
     * Gets the organizationalCredentialsRequired property value. Indicates whether organizational credentials are required for app use.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOrganizationalCredentialsRequired() {
        return this.backingStore.get("organizationalCredentialsRequired");
    }
    /**
     * Gets the periodBeforePinReset property value. TimePeriod before the all-level pin must be reset if PinRequired is set to True.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getPeriodBeforePinReset() {
        return this.backingStore.get("periodBeforePinReset");
    }
    /**
     * Gets the periodOfflineBeforeAccessCheck property value. The period after which access is checked when the device is not connected to the internet.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getPeriodOfflineBeforeAccessCheck() {
        return this.backingStore.get("periodOfflineBeforeAccessCheck");
    }
    /**
     * Gets the periodOfflineBeforeWipeIsEnforced property value. The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getPeriodOfflineBeforeWipeIsEnforced() {
        return this.backingStore.get("periodOfflineBeforeWipeIsEnforced");
    }
    /**
     * Gets the periodOnlineBeforeAccessCheck property value. The period after which access is checked when the device is connected to the internet.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getPeriodOnlineBeforeAccessCheck() {
        return this.backingStore.get("periodOnlineBeforeAccessCheck");
    }
    /**
     * Gets the pinCharacterSet property value. Character set which is to be used for a user&apos;s app PIN
     * @return a {@link ManagedAppPinCharacterSet}
     */
    @jakarta.annotation.Nullable
    public ManagedAppPinCharacterSet getPinCharacterSet() {
        return this.backingStore.get("pinCharacterSet");
    }
    /**
     * Gets the pinRequired property value. Indicates whether an app-level pin is required.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPinRequired() {
        return this.backingStore.get("pinRequired");
    }
    /**
     * Gets the printBlocked property value. Indicates whether printing is allowed from managed apps.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPrintBlocked() {
        return this.backingStore.get("printBlocked");
    }
    /**
     * Gets the saveAsBlocked property value. Indicates whether users may use the &apos;Save As&apos; menu item to save a copy of protected files.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSaveAsBlocked() {
        return this.backingStore.get("saveAsBlocked");
    }
    /**
     * Gets the simplePinBlocked property value. Indicates whether simplePin is blocked.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSimplePinBlocked() {
        return this.backingStore.get("simplePinBlocked");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfEnumValues("allowedDataStorageLocations", this.getAllowedDataStorageLocations());
        writer.writeEnumValue("allowedInboundDataTransferSources", this.getAllowedInboundDataTransferSources());
        writer.writeEnumValue("allowedOutboundClipboardSharingLevel", this.getAllowedOutboundClipboardSharingLevel());
        writer.writeEnumValue("allowedOutboundDataTransferDestinations", this.getAllowedOutboundDataTransferDestinations());
        writer.writeBooleanValue("contactSyncBlocked", this.getContactSyncBlocked());
        writer.writeBooleanValue("dataBackupBlocked", this.getDataBackupBlocked());
        writer.writeBooleanValue("deviceComplianceRequired", this.getDeviceComplianceRequired());
        writer.writeBooleanValue("disableAppPinIfDevicePinIsSet", this.getDisableAppPinIfDevicePinIsSet());
        writer.writeBooleanValue("fingerprintBlocked", this.getFingerprintBlocked());
        writer.writeEnumSetValue("managedBrowser", this.getManagedBrowser());
        writer.writeBooleanValue("managedBrowserToOpenLinksRequired", this.getManagedBrowserToOpenLinksRequired());
        writer.writeIntegerValue("maximumPinRetries", this.getMaximumPinRetries());
        writer.writeIntegerValue("minimumPinLength", this.getMinimumPinLength());
        writer.writeStringValue("minimumRequiredAppVersion", this.getMinimumRequiredAppVersion());
        writer.writeStringValue("minimumRequiredOsVersion", this.getMinimumRequiredOsVersion());
        writer.writeStringValue("minimumWarningAppVersion", this.getMinimumWarningAppVersion());
        writer.writeStringValue("minimumWarningOsVersion", this.getMinimumWarningOsVersion());
        writer.writeBooleanValue("organizationalCredentialsRequired", this.getOrganizationalCredentialsRequired());
        writer.writePeriodAndDurationValue("periodBeforePinReset", this.getPeriodBeforePinReset());
        writer.writePeriodAndDurationValue("periodOfflineBeforeAccessCheck", this.getPeriodOfflineBeforeAccessCheck());
        writer.writePeriodAndDurationValue("periodOfflineBeforeWipeIsEnforced", this.getPeriodOfflineBeforeWipeIsEnforced());
        writer.writePeriodAndDurationValue("periodOnlineBeforeAccessCheck", this.getPeriodOnlineBeforeAccessCheck());
        writer.writeEnumValue("pinCharacterSet", this.getPinCharacterSet());
        writer.writeBooleanValue("pinRequired", this.getPinRequired());
        writer.writeBooleanValue("printBlocked", this.getPrintBlocked());
        writer.writeBooleanValue("saveAsBlocked", this.getSaveAsBlocked());
        writer.writeBooleanValue("simplePinBlocked", this.getSimplePinBlocked());
    }
    /**
     * Sets the allowedDataStorageLocations property value. Data storage locations where a user may store managed data.
     * @param value Value to set for the allowedDataStorageLocations property.
     */
    public void setAllowedDataStorageLocations(@jakarta.annotation.Nullable final java.util.List<ManagedAppDataStorageLocation> value) {
        this.backingStore.set("allowedDataStorageLocations", value);
    }
    /**
     * Sets the allowedInboundDataTransferSources property value. Data can be transferred from/to these classes of apps
     * @param value Value to set for the allowedInboundDataTransferSources property.
     */
    public void setAllowedInboundDataTransferSources(@jakarta.annotation.Nullable final ManagedAppDataTransferLevel value) {
        this.backingStore.set("allowedInboundDataTransferSources", value);
    }
    /**
     * Sets the allowedOutboundClipboardSharingLevel property value. Represents the level to which the device&apos;s clipboard may be shared between apps
     * @param value Value to set for the allowedOutboundClipboardSharingLevel property.
     */
    public void setAllowedOutboundClipboardSharingLevel(@jakarta.annotation.Nullable final ManagedAppClipboardSharingLevel value) {
        this.backingStore.set("allowedOutboundClipboardSharingLevel", value);
    }
    /**
     * Sets the allowedOutboundDataTransferDestinations property value. Data can be transferred from/to these classes of apps
     * @param value Value to set for the allowedOutboundDataTransferDestinations property.
     */
    public void setAllowedOutboundDataTransferDestinations(@jakarta.annotation.Nullable final ManagedAppDataTransferLevel value) {
        this.backingStore.set("allowedOutboundDataTransferDestinations", value);
    }
    /**
     * Sets the contactSyncBlocked property value. Indicates whether contacts can be synced to the user&apos;s device.
     * @param value Value to set for the contactSyncBlocked property.
     */
    public void setContactSyncBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("contactSyncBlocked", value);
    }
    /**
     * Sets the dataBackupBlocked property value. Indicates whether the backup of a managed app&apos;s data is blocked.
     * @param value Value to set for the dataBackupBlocked property.
     */
    public void setDataBackupBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("dataBackupBlocked", value);
    }
    /**
     * Sets the deviceComplianceRequired property value. Indicates whether device compliance is required.
     * @param value Value to set for the deviceComplianceRequired property.
     */
    public void setDeviceComplianceRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("deviceComplianceRequired", value);
    }
    /**
     * Sets the disableAppPinIfDevicePinIsSet property value. Indicates whether use of the app pin is required if the device pin is set.
     * @param value Value to set for the disableAppPinIfDevicePinIsSet property.
     */
    public void setDisableAppPinIfDevicePinIsSet(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("disableAppPinIfDevicePinIsSet", value);
    }
    /**
     * Sets the fingerprintBlocked property value. Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True.
     * @param value Value to set for the fingerprintBlocked property.
     */
    public void setFingerprintBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("fingerprintBlocked", value);
    }
    /**
     * Sets the managedBrowser property value. Type of managed browser
     * @param value Value to set for the managedBrowser property.
     */
    public void setManagedBrowser(@jakarta.annotation.Nullable final EnumSet<ManagedBrowserType> value) {
        this.backingStore.set("managedBrowser", value);
    }
    /**
     * Sets the managedBrowserToOpenLinksRequired property value. Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android)
     * @param value Value to set for the managedBrowserToOpenLinksRequired property.
     */
    public void setManagedBrowserToOpenLinksRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("managedBrowserToOpenLinksRequired", value);
    }
    /**
     * Sets the maximumPinRetries property value. Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped. Valid values 1 to 65535
     * @param value Value to set for the maximumPinRetries property.
     */
    public void setMaximumPinRetries(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maximumPinRetries", value);
    }
    /**
     * Sets the minimumPinLength property value. Minimum pin length required for an app-level pin if PinRequired is set to True
     * @param value Value to set for the minimumPinLength property.
     */
    public void setMinimumPinLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("minimumPinLength", value);
    }
    /**
     * Sets the minimumRequiredAppVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the minimumRequiredAppVersion property.
     */
    public void setMinimumRequiredAppVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumRequiredAppVersion", value);
    }
    /**
     * Sets the minimumRequiredOsVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the minimumRequiredOsVersion property.
     */
    public void setMinimumRequiredOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumRequiredOsVersion", value);
    }
    /**
     * Sets the minimumWarningAppVersion property value. Versions less than the specified version will result in warning message on the managed app.
     * @param value Value to set for the minimumWarningAppVersion property.
     */
    public void setMinimumWarningAppVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumWarningAppVersion", value);
    }
    /**
     * Sets the minimumWarningOsVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data.
     * @param value Value to set for the minimumWarningOsVersion property.
     */
    public void setMinimumWarningOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumWarningOsVersion", value);
    }
    /**
     * Sets the organizationalCredentialsRequired property value. Indicates whether organizational credentials are required for app use.
     * @param value Value to set for the organizationalCredentialsRequired property.
     */
    public void setOrganizationalCredentialsRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("organizationalCredentialsRequired", value);
    }
    /**
     * Sets the periodBeforePinReset property value. TimePeriod before the all-level pin must be reset if PinRequired is set to True.
     * @param value Value to set for the periodBeforePinReset property.
     */
    public void setPeriodBeforePinReset(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("periodBeforePinReset", value);
    }
    /**
     * Sets the periodOfflineBeforeAccessCheck property value. The period after which access is checked when the device is not connected to the internet.
     * @param value Value to set for the periodOfflineBeforeAccessCheck property.
     */
    public void setPeriodOfflineBeforeAccessCheck(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("periodOfflineBeforeAccessCheck", value);
    }
    /**
     * Sets the periodOfflineBeforeWipeIsEnforced property value. The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped.
     * @param value Value to set for the periodOfflineBeforeWipeIsEnforced property.
     */
    public void setPeriodOfflineBeforeWipeIsEnforced(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("periodOfflineBeforeWipeIsEnforced", value);
    }
    /**
     * Sets the periodOnlineBeforeAccessCheck property value. The period after which access is checked when the device is connected to the internet.
     * @param value Value to set for the periodOnlineBeforeAccessCheck property.
     */
    public void setPeriodOnlineBeforeAccessCheck(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("periodOnlineBeforeAccessCheck", value);
    }
    /**
     * Sets the pinCharacterSet property value. Character set which is to be used for a user&apos;s app PIN
     * @param value Value to set for the pinCharacterSet property.
     */
    public void setPinCharacterSet(@jakarta.annotation.Nullable final ManagedAppPinCharacterSet value) {
        this.backingStore.set("pinCharacterSet", value);
    }
    /**
     * Sets the pinRequired property value. Indicates whether an app-level pin is required.
     * @param value Value to set for the pinRequired property.
     */
    public void setPinRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("pinRequired", value);
    }
    /**
     * Sets the printBlocked property value. Indicates whether printing is allowed from managed apps.
     * @param value Value to set for the printBlocked property.
     */
    public void setPrintBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("printBlocked", value);
    }
    /**
     * Sets the saveAsBlocked property value. Indicates whether users may use the &apos;Save As&apos; menu item to save a copy of protected files.
     * @param value Value to set for the saveAsBlocked property.
     */
    public void setSaveAsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("saveAsBlocked", value);
    }
    /**
     * Sets the simplePinBlocked property value. Indicates whether simplePin is blocked.
     * @param value Value to set for the simplePinBlocked property.
     */
    public void setSimplePinBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("simplePinBlocked", value);
    }
}
