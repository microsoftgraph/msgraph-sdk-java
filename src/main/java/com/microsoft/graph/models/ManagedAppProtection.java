package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedAppProtection extends ManagedAppPolicy implements Parsable {
    /** Data storage locations where a user may store managed data. */
    private java.util.List<ManagedAppDataStorageLocation> allowedDataStorageLocations;
    /** Data can be transferred from/to these classes of apps */
    private ManagedAppDataTransferLevel allowedInboundDataTransferSources;
    /** Represents the level to which the device's clipboard may be shared between apps */
    private ManagedAppClipboardSharingLevel allowedOutboundClipboardSharingLevel;
    /** Data can be transferred from/to these classes of apps */
    private ManagedAppDataTransferLevel allowedOutboundDataTransferDestinations;
    /** Indicates whether contacts can be synced to the user's device. */
    private Boolean contactSyncBlocked;
    /** Indicates whether the backup of a managed app's data is blocked. */
    private Boolean dataBackupBlocked;
    /** Indicates whether device compliance is required. */
    private Boolean deviceComplianceRequired;
    /** Indicates whether use of the app pin is required if the device pin is set. */
    private Boolean disableAppPinIfDevicePinIsSet;
    /** Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True. */
    private Boolean fingerprintBlocked;
    /** Type of managed browser */
    private ManagedBrowserType managedBrowser;
    /** Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android) */
    private Boolean managedBrowserToOpenLinksRequired;
    /** Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped. */
    private Integer maximumPinRetries;
    /** Minimum pin length required for an app-level pin if PinRequired is set to True */
    private Integer minimumPinLength;
    /** Versions less than the specified version will block the managed app from accessing company data. */
    private String minimumRequiredAppVersion;
    /** Versions less than the specified version will block the managed app from accessing company data. */
    private String minimumRequiredOsVersion;
    /** Versions less than the specified version will result in warning message on the managed app. */
    private String minimumWarningAppVersion;
    /** Versions less than the specified version will result in warning message on the managed app from accessing company data. */
    private String minimumWarningOsVersion;
    /** Indicates whether organizational credentials are required for app use. */
    private Boolean organizationalCredentialsRequired;
    /** TimePeriod before the all-level pin must be reset if PinRequired is set to True. */
    private Period periodBeforePinReset;
    /** The period after which access is checked when the device is not connected to the internet. */
    private Period periodOfflineBeforeAccessCheck;
    /** The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped. */
    private Period periodOfflineBeforeWipeIsEnforced;
    /** The period after which access is checked when the device is connected to the internet. */
    private Period periodOnlineBeforeAccessCheck;
    /** Character set which is to be used for a user's app PIN */
    private ManagedAppPinCharacterSet pinCharacterSet;
    /** Indicates whether an app-level pin is required. */
    private Boolean pinRequired;
    /** Indicates whether printing is allowed from managed apps. */
    private Boolean printBlocked;
    /** Indicates whether users may use the 'Save As' menu item to save a copy of protected files. */
    private Boolean saveAsBlocked;
    /** Indicates whether simplePin is blocked. */
    private Boolean simplePinBlocked;
    /**
     * Instantiates a new ManagedAppProtection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedAppProtection() {
        super();
        this.setOdataType("#microsoft.graph.managedAppProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedAppProtection
     */
    @javax.annotation.Nonnull
    public static ManagedAppProtection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a ManagedAppDataStorageLocation
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAppDataStorageLocation> getAllowedDataStorageLocations() {
        return this.allowedDataStorageLocations;
    }
    /**
     * Gets the allowedInboundDataTransferSources property value. Data can be transferred from/to these classes of apps
     * @return a ManagedAppDataTransferLevel
     */
    @javax.annotation.Nullable
    public ManagedAppDataTransferLevel getAllowedInboundDataTransferSources() {
        return this.allowedInboundDataTransferSources;
    }
    /**
     * Gets the allowedOutboundClipboardSharingLevel property value. Represents the level to which the device's clipboard may be shared between apps
     * @return a ManagedAppClipboardSharingLevel
     */
    @javax.annotation.Nullable
    public ManagedAppClipboardSharingLevel getAllowedOutboundClipboardSharingLevel() {
        return this.allowedOutboundClipboardSharingLevel;
    }
    /**
     * Gets the allowedOutboundDataTransferDestinations property value. Data can be transferred from/to these classes of apps
     * @return a ManagedAppDataTransferLevel
     */
    @javax.annotation.Nullable
    public ManagedAppDataTransferLevel getAllowedOutboundDataTransferDestinations() {
        return this.allowedOutboundDataTransferDestinations;
    }
    /**
     * Gets the contactSyncBlocked property value. Indicates whether contacts can be synced to the user's device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContactSyncBlocked() {
        return this.contactSyncBlocked;
    }
    /**
     * Gets the dataBackupBlocked property value. Indicates whether the backup of a managed app's data is blocked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDataBackupBlocked() {
        return this.dataBackupBlocked;
    }
    /**
     * Gets the deviceComplianceRequired property value. Indicates whether device compliance is required.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceComplianceRequired() {
        return this.deviceComplianceRequired;
    }
    /**
     * Gets the disableAppPinIfDevicePinIsSet property value. Indicates whether use of the app pin is required if the device pin is set.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableAppPinIfDevicePinIsSet() {
        return this.disableAppPinIfDevicePinIsSet;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedDataStorageLocations", (n) -> { this.setAllowedDataStorageLocations(n.getCollectionOfEnumValues(ManagedAppDataStorageLocation.class)); });
        deserializerMap.put("allowedInboundDataTransferSources", (n) -> { this.setAllowedInboundDataTransferSources(n.getEnumValue(ManagedAppDataTransferLevel.class)); });
        deserializerMap.put("allowedOutboundClipboardSharingLevel", (n) -> { this.setAllowedOutboundClipboardSharingLevel(n.getEnumValue(ManagedAppClipboardSharingLevel.class)); });
        deserializerMap.put("allowedOutboundDataTransferDestinations", (n) -> { this.setAllowedOutboundDataTransferDestinations(n.getEnumValue(ManagedAppDataTransferLevel.class)); });
        deserializerMap.put("contactSyncBlocked", (n) -> { this.setContactSyncBlocked(n.getBooleanValue()); });
        deserializerMap.put("dataBackupBlocked", (n) -> { this.setDataBackupBlocked(n.getBooleanValue()); });
        deserializerMap.put("deviceComplianceRequired", (n) -> { this.setDeviceComplianceRequired(n.getBooleanValue()); });
        deserializerMap.put("disableAppPinIfDevicePinIsSet", (n) -> { this.setDisableAppPinIfDevicePinIsSet(n.getBooleanValue()); });
        deserializerMap.put("fingerprintBlocked", (n) -> { this.setFingerprintBlocked(n.getBooleanValue()); });
        deserializerMap.put("managedBrowser", (n) -> { this.setManagedBrowser(n.getEnumValue(ManagedBrowserType.class)); });
        deserializerMap.put("managedBrowserToOpenLinksRequired", (n) -> { this.setManagedBrowserToOpenLinksRequired(n.getBooleanValue()); });
        deserializerMap.put("maximumPinRetries", (n) -> { this.setMaximumPinRetries(n.getIntegerValue()); });
        deserializerMap.put("minimumPinLength", (n) -> { this.setMinimumPinLength(n.getIntegerValue()); });
        deserializerMap.put("minimumRequiredAppVersion", (n) -> { this.setMinimumRequiredAppVersion(n.getStringValue()); });
        deserializerMap.put("minimumRequiredOsVersion", (n) -> { this.setMinimumRequiredOsVersion(n.getStringValue()); });
        deserializerMap.put("minimumWarningAppVersion", (n) -> { this.setMinimumWarningAppVersion(n.getStringValue()); });
        deserializerMap.put("minimumWarningOsVersion", (n) -> { this.setMinimumWarningOsVersion(n.getStringValue()); });
        deserializerMap.put("organizationalCredentialsRequired", (n) -> { this.setOrganizationalCredentialsRequired(n.getBooleanValue()); });
        deserializerMap.put("periodBeforePinReset", (n) -> { this.setPeriodBeforePinReset(n.getPeriodValue()); });
        deserializerMap.put("periodOfflineBeforeAccessCheck", (n) -> { this.setPeriodOfflineBeforeAccessCheck(n.getPeriodValue()); });
        deserializerMap.put("periodOfflineBeforeWipeIsEnforced", (n) -> { this.setPeriodOfflineBeforeWipeIsEnforced(n.getPeriodValue()); });
        deserializerMap.put("periodOnlineBeforeAccessCheck", (n) -> { this.setPeriodOnlineBeforeAccessCheck(n.getPeriodValue()); });
        deserializerMap.put("pinCharacterSet", (n) -> { this.setPinCharacterSet(n.getEnumValue(ManagedAppPinCharacterSet.class)); });
        deserializerMap.put("pinRequired", (n) -> { this.setPinRequired(n.getBooleanValue()); });
        deserializerMap.put("printBlocked", (n) -> { this.setPrintBlocked(n.getBooleanValue()); });
        deserializerMap.put("saveAsBlocked", (n) -> { this.setSaveAsBlocked(n.getBooleanValue()); });
        deserializerMap.put("simplePinBlocked", (n) -> { this.setSimplePinBlocked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fingerprintBlocked property value. Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFingerprintBlocked() {
        return this.fingerprintBlocked;
    }
    /**
     * Gets the managedBrowser property value. Type of managed browser
     * @return a ManagedBrowserType
     */
    @javax.annotation.Nullable
    public ManagedBrowserType getManagedBrowser() {
        return this.managedBrowser;
    }
    /**
     * Gets the managedBrowserToOpenLinksRequired property value. Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android)
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getManagedBrowserToOpenLinksRequired() {
        return this.managedBrowserToOpenLinksRequired;
    }
    /**
     * Gets the maximumPinRetries property value. Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumPinRetries() {
        return this.maximumPinRetries;
    }
    /**
     * Gets the minimumPinLength property value. Minimum pin length required for an app-level pin if PinRequired is set to True
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumPinLength() {
        return this.minimumPinLength;
    }
    /**
     * Gets the minimumRequiredAppVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumRequiredAppVersion() {
        return this.minimumRequiredAppVersion;
    }
    /**
     * Gets the minimumRequiredOsVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumRequiredOsVersion() {
        return this.minimumRequiredOsVersion;
    }
    /**
     * Gets the minimumWarningAppVersion property value. Versions less than the specified version will result in warning message on the managed app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWarningAppVersion() {
        return this.minimumWarningAppVersion;
    }
    /**
     * Gets the minimumWarningOsVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWarningOsVersion() {
        return this.minimumWarningOsVersion;
    }
    /**
     * Gets the organizationalCredentialsRequired property value. Indicates whether organizational credentials are required for app use.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOrganizationalCredentialsRequired() {
        return this.organizationalCredentialsRequired;
    }
    /**
     * Gets the periodBeforePinReset property value. TimePeriod before the all-level pin must be reset if PinRequired is set to True.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPeriodBeforePinReset() {
        return this.periodBeforePinReset;
    }
    /**
     * Gets the periodOfflineBeforeAccessCheck property value. The period after which access is checked when the device is not connected to the internet.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPeriodOfflineBeforeAccessCheck() {
        return this.periodOfflineBeforeAccessCheck;
    }
    /**
     * Gets the periodOfflineBeforeWipeIsEnforced property value. The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPeriodOfflineBeforeWipeIsEnforced() {
        return this.periodOfflineBeforeWipeIsEnforced;
    }
    /**
     * Gets the periodOnlineBeforeAccessCheck property value. The period after which access is checked when the device is connected to the internet.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPeriodOnlineBeforeAccessCheck() {
        return this.periodOnlineBeforeAccessCheck;
    }
    /**
     * Gets the pinCharacterSet property value. Character set which is to be used for a user's app PIN
     * @return a ManagedAppPinCharacterSet
     */
    @javax.annotation.Nullable
    public ManagedAppPinCharacterSet getPinCharacterSet() {
        return this.pinCharacterSet;
    }
    /**
     * Gets the pinRequired property value. Indicates whether an app-level pin is required.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPinRequired() {
        return this.pinRequired;
    }
    /**
     * Gets the printBlocked property value. Indicates whether printing is allowed from managed apps.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrintBlocked() {
        return this.printBlocked;
    }
    /**
     * Gets the saveAsBlocked property value. Indicates whether users may use the 'Save As' menu item to save a copy of protected files.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSaveAsBlocked() {
        return this.saveAsBlocked;
    }
    /**
     * Gets the simplePinBlocked property value. Indicates whether simplePin is blocked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSimplePinBlocked() {
        return this.simplePinBlocked;
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
        writer.writeCollectionOfEnumValues("allowedDataStorageLocations", this.getAllowedDataStorageLocations());
        writer.writeEnumValue("allowedInboundDataTransferSources", this.getAllowedInboundDataTransferSources());
        writer.writeEnumValue("allowedOutboundClipboardSharingLevel", this.getAllowedOutboundClipboardSharingLevel());
        writer.writeEnumValue("allowedOutboundDataTransferDestinations", this.getAllowedOutboundDataTransferDestinations());
        writer.writeBooleanValue("contactSyncBlocked", this.getContactSyncBlocked());
        writer.writeBooleanValue("dataBackupBlocked", this.getDataBackupBlocked());
        writer.writeBooleanValue("deviceComplianceRequired", this.getDeviceComplianceRequired());
        writer.writeBooleanValue("disableAppPinIfDevicePinIsSet", this.getDisableAppPinIfDevicePinIsSet());
        writer.writeBooleanValue("fingerprintBlocked", this.getFingerprintBlocked());
        writer.writeEnumValue("managedBrowser", this.getManagedBrowser());
        writer.writeBooleanValue("managedBrowserToOpenLinksRequired", this.getManagedBrowserToOpenLinksRequired());
        writer.writeIntegerValue("maximumPinRetries", this.getMaximumPinRetries());
        writer.writeIntegerValue("minimumPinLength", this.getMinimumPinLength());
        writer.writeStringValue("minimumRequiredAppVersion", this.getMinimumRequiredAppVersion());
        writer.writeStringValue("minimumRequiredOsVersion", this.getMinimumRequiredOsVersion());
        writer.writeStringValue("minimumWarningAppVersion", this.getMinimumWarningAppVersion());
        writer.writeStringValue("minimumWarningOsVersion", this.getMinimumWarningOsVersion());
        writer.writeBooleanValue("organizationalCredentialsRequired", this.getOrganizationalCredentialsRequired());
        writer.writePeriodValue("periodBeforePinReset", this.getPeriodBeforePinReset());
        writer.writePeriodValue("periodOfflineBeforeAccessCheck", this.getPeriodOfflineBeforeAccessCheck());
        writer.writePeriodValue("periodOfflineBeforeWipeIsEnforced", this.getPeriodOfflineBeforeWipeIsEnforced());
        writer.writePeriodValue("periodOnlineBeforeAccessCheck", this.getPeriodOnlineBeforeAccessCheck());
        writer.writeEnumValue("pinCharacterSet", this.getPinCharacterSet());
        writer.writeBooleanValue("pinRequired", this.getPinRequired());
        writer.writeBooleanValue("printBlocked", this.getPrintBlocked());
        writer.writeBooleanValue("saveAsBlocked", this.getSaveAsBlocked());
        writer.writeBooleanValue("simplePinBlocked", this.getSimplePinBlocked());
    }
    /**
     * Sets the allowedDataStorageLocations property value. Data storage locations where a user may store managed data.
     * @param value Value to set for the allowedDataStorageLocations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedDataStorageLocations(@javax.annotation.Nullable final java.util.List<ManagedAppDataStorageLocation> value) {
        this.allowedDataStorageLocations = value;
    }
    /**
     * Sets the allowedInboundDataTransferSources property value. Data can be transferred from/to these classes of apps
     * @param value Value to set for the allowedInboundDataTransferSources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedInboundDataTransferSources(@javax.annotation.Nullable final ManagedAppDataTransferLevel value) {
        this.allowedInboundDataTransferSources = value;
    }
    /**
     * Sets the allowedOutboundClipboardSharingLevel property value. Represents the level to which the device's clipboard may be shared between apps
     * @param value Value to set for the allowedOutboundClipboardSharingLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedOutboundClipboardSharingLevel(@javax.annotation.Nullable final ManagedAppClipboardSharingLevel value) {
        this.allowedOutboundClipboardSharingLevel = value;
    }
    /**
     * Sets the allowedOutboundDataTransferDestinations property value. Data can be transferred from/to these classes of apps
     * @param value Value to set for the allowedOutboundDataTransferDestinations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedOutboundDataTransferDestinations(@javax.annotation.Nullable final ManagedAppDataTransferLevel value) {
        this.allowedOutboundDataTransferDestinations = value;
    }
    /**
     * Sets the contactSyncBlocked property value. Indicates whether contacts can be synced to the user's device.
     * @param value Value to set for the contactSyncBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContactSyncBlocked(@javax.annotation.Nullable final Boolean value) {
        this.contactSyncBlocked = value;
    }
    /**
     * Sets the dataBackupBlocked property value. Indicates whether the backup of a managed app's data is blocked.
     * @param value Value to set for the dataBackupBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataBackupBlocked(@javax.annotation.Nullable final Boolean value) {
        this.dataBackupBlocked = value;
    }
    /**
     * Sets the deviceComplianceRequired property value. Indicates whether device compliance is required.
     * @param value Value to set for the deviceComplianceRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceComplianceRequired(@javax.annotation.Nullable final Boolean value) {
        this.deviceComplianceRequired = value;
    }
    /**
     * Sets the disableAppPinIfDevicePinIsSet property value. Indicates whether use of the app pin is required if the device pin is set.
     * @param value Value to set for the disableAppPinIfDevicePinIsSet property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisableAppPinIfDevicePinIsSet(@javax.annotation.Nullable final Boolean value) {
        this.disableAppPinIfDevicePinIsSet = value;
    }
    /**
     * Sets the fingerprintBlocked property value. Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True.
     * @param value Value to set for the fingerprintBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFingerprintBlocked(@javax.annotation.Nullable final Boolean value) {
        this.fingerprintBlocked = value;
    }
    /**
     * Sets the managedBrowser property value. Type of managed browser
     * @param value Value to set for the managedBrowser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedBrowser(@javax.annotation.Nullable final ManagedBrowserType value) {
        this.managedBrowser = value;
    }
    /**
     * Sets the managedBrowserToOpenLinksRequired property value. Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android)
     * @param value Value to set for the managedBrowserToOpenLinksRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedBrowserToOpenLinksRequired(@javax.annotation.Nullable final Boolean value) {
        this.managedBrowserToOpenLinksRequired = value;
    }
    /**
     * Sets the maximumPinRetries property value. Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped.
     * @param value Value to set for the maximumPinRetries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumPinRetries(@javax.annotation.Nullable final Integer value) {
        this.maximumPinRetries = value;
    }
    /**
     * Sets the minimumPinLength property value. Minimum pin length required for an app-level pin if PinRequired is set to True
     * @param value Value to set for the minimumPinLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumPinLength(@javax.annotation.Nullable final Integer value) {
        this.minimumPinLength = value;
    }
    /**
     * Sets the minimumRequiredAppVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the minimumRequiredAppVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumRequiredAppVersion(@javax.annotation.Nullable final String value) {
        this.minimumRequiredAppVersion = value;
    }
    /**
     * Sets the minimumRequiredOsVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the minimumRequiredOsVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumRequiredOsVersion(@javax.annotation.Nullable final String value) {
        this.minimumRequiredOsVersion = value;
    }
    /**
     * Sets the minimumWarningAppVersion property value. Versions less than the specified version will result in warning message on the managed app.
     * @param value Value to set for the minimumWarningAppVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumWarningAppVersion(@javax.annotation.Nullable final String value) {
        this.minimumWarningAppVersion = value;
    }
    /**
     * Sets the minimumWarningOsVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data.
     * @param value Value to set for the minimumWarningOsVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumWarningOsVersion(@javax.annotation.Nullable final String value) {
        this.minimumWarningOsVersion = value;
    }
    /**
     * Sets the organizationalCredentialsRequired property value. Indicates whether organizational credentials are required for app use.
     * @param value Value to set for the organizationalCredentialsRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizationalCredentialsRequired(@javax.annotation.Nullable final Boolean value) {
        this.organizationalCredentialsRequired = value;
    }
    /**
     * Sets the periodBeforePinReset property value. TimePeriod before the all-level pin must be reset if PinRequired is set to True.
     * @param value Value to set for the periodBeforePinReset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeriodBeforePinReset(@javax.annotation.Nullable final Period value) {
        this.periodBeforePinReset = value;
    }
    /**
     * Sets the periodOfflineBeforeAccessCheck property value. The period after which access is checked when the device is not connected to the internet.
     * @param value Value to set for the periodOfflineBeforeAccessCheck property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeriodOfflineBeforeAccessCheck(@javax.annotation.Nullable final Period value) {
        this.periodOfflineBeforeAccessCheck = value;
    }
    /**
     * Sets the periodOfflineBeforeWipeIsEnforced property value. The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped.
     * @param value Value to set for the periodOfflineBeforeWipeIsEnforced property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeriodOfflineBeforeWipeIsEnforced(@javax.annotation.Nullable final Period value) {
        this.periodOfflineBeforeWipeIsEnforced = value;
    }
    /**
     * Sets the periodOnlineBeforeAccessCheck property value. The period after which access is checked when the device is connected to the internet.
     * @param value Value to set for the periodOnlineBeforeAccessCheck property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeriodOnlineBeforeAccessCheck(@javax.annotation.Nullable final Period value) {
        this.periodOnlineBeforeAccessCheck = value;
    }
    /**
     * Sets the pinCharacterSet property value. Character set which is to be used for a user's app PIN
     * @param value Value to set for the pinCharacterSet property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPinCharacterSet(@javax.annotation.Nullable final ManagedAppPinCharacterSet value) {
        this.pinCharacterSet = value;
    }
    /**
     * Sets the pinRequired property value. Indicates whether an app-level pin is required.
     * @param value Value to set for the pinRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPinRequired(@javax.annotation.Nullable final Boolean value) {
        this.pinRequired = value;
    }
    /**
     * Sets the printBlocked property value. Indicates whether printing is allowed from managed apps.
     * @param value Value to set for the printBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrintBlocked(@javax.annotation.Nullable final Boolean value) {
        this.printBlocked = value;
    }
    /**
     * Sets the saveAsBlocked property value. Indicates whether users may use the 'Save As' menu item to save a copy of protected files.
     * @param value Value to set for the saveAsBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSaveAsBlocked(@javax.annotation.Nullable final Boolean value) {
        this.saveAsBlocked = value;
    }
    /**
     * Sets the simplePinBlocked property value. Indicates whether simplePin is blocked.
     * @param value Value to set for the simplePinBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSimplePinBlocked(@javax.annotation.Nullable final Boolean value) {
        this.simplePinBlocked = value;
    }
}
