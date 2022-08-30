package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedAppProtection extends ManagedAppPolicy implements Parsable {
    /** Data storage locations where a user may store managed data. */
    private java.util.List<String> _allowedDataStorageLocations;
    /** Data can be transferred from/to these classes of apps */
    private ManagedAppDataTransferLevel _allowedInboundDataTransferSources;
    /** Represents the level to which the device's clipboard may be shared between apps */
    private ManagedAppClipboardSharingLevel _allowedOutboundClipboardSharingLevel;
    /** Data can be transferred from/to these classes of apps */
    private ManagedAppDataTransferLevel _allowedOutboundDataTransferDestinations;
    /** Indicates whether contacts can be synced to the user's device. */
    private Boolean _contactSyncBlocked;
    /** Indicates whether the backup of a managed app's data is blocked. */
    private Boolean _dataBackupBlocked;
    /** Indicates whether device compliance is required. */
    private Boolean _deviceComplianceRequired;
    /** Indicates whether use of the app pin is required if the device pin is set. */
    private Boolean _disableAppPinIfDevicePinIsSet;
    /** Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True. */
    private Boolean _fingerprintBlocked;
    /** Type of managed browser */
    private ManagedBrowserType _managedBrowser;
    /** Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android) */
    private Boolean _managedBrowserToOpenLinksRequired;
    /** Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped. */
    private Integer _maximumPinRetries;
    /** Minimum pin length required for an app-level pin if PinRequired is set to True */
    private Integer _minimumPinLength;
    /** Versions less than the specified version will block the managed app from accessing company data. */
    private String _minimumRequiredAppVersion;
    /** Versions less than the specified version will block the managed app from accessing company data. */
    private String _minimumRequiredOsVersion;
    /** Versions less than the specified version will result in warning message on the managed app. */
    private String _minimumWarningAppVersion;
    /** Versions less than the specified version will result in warning message on the managed app from accessing company data. */
    private String _minimumWarningOsVersion;
    /** Indicates whether organizational credentials are required for app use. */
    private Boolean _organizationalCredentialsRequired;
    /** TimePeriod before the all-level pin must be reset if PinRequired is set to True. */
    private Period _periodBeforePinReset;
    /** The period after which access is checked when the device is not connected to the internet. */
    private Period _periodOfflineBeforeAccessCheck;
    /** The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped. */
    private Period _periodOfflineBeforeWipeIsEnforced;
    /** The period after which access is checked when the device is connected to the internet. */
    private Period _periodOnlineBeforeAccessCheck;
    /** Character set which is to be used for a user's app PIN */
    private ManagedAppPinCharacterSet _pinCharacterSet;
    /** Indicates whether an app-level pin is required. */
    private Boolean _pinRequired;
    /** Indicates whether printing is allowed from managed apps. */
    private Boolean _printBlocked;
    /** Indicates whether users may use the 'Save As' menu item to save a copy of protected files. */
    private Boolean _saveAsBlocked;
    /** Indicates whether simplePin is blocked. */
    private Boolean _simplePinBlocked;
    /**
     * Instantiates a new ManagedAppProtection and sets the default values.
     * @return a void
     */
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
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedDataStorageLocations() {
        return this._allowedDataStorageLocations;
    }
    /**
     * Gets the allowedInboundDataTransferSources property value. Data can be transferred from/to these classes of apps
     * @return a managedAppDataTransferLevel
     */
    @javax.annotation.Nullable
    public ManagedAppDataTransferLevel getAllowedInboundDataTransferSources() {
        return this._allowedInboundDataTransferSources;
    }
    /**
     * Gets the allowedOutboundClipboardSharingLevel property value. Represents the level to which the device's clipboard may be shared between apps
     * @return a managedAppClipboardSharingLevel
     */
    @javax.annotation.Nullable
    public ManagedAppClipboardSharingLevel getAllowedOutboundClipboardSharingLevel() {
        return this._allowedOutboundClipboardSharingLevel;
    }
    /**
     * Gets the allowedOutboundDataTransferDestinations property value. Data can be transferred from/to these classes of apps
     * @return a managedAppDataTransferLevel
     */
    @javax.annotation.Nullable
    public ManagedAppDataTransferLevel getAllowedOutboundDataTransferDestinations() {
        return this._allowedOutboundDataTransferDestinations;
    }
    /**
     * Gets the contactSyncBlocked property value. Indicates whether contacts can be synced to the user's device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContactSyncBlocked() {
        return this._contactSyncBlocked;
    }
    /**
     * Gets the dataBackupBlocked property value. Indicates whether the backup of a managed app's data is blocked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDataBackupBlocked() {
        return this._dataBackupBlocked;
    }
    /**
     * Gets the deviceComplianceRequired property value. Indicates whether device compliance is required.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceComplianceRequired() {
        return this._deviceComplianceRequired;
    }
    /**
     * Gets the disableAppPinIfDevicePinIsSet property value. Indicates whether use of the app pin is required if the device pin is set.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableAppPinIfDevicePinIsSet() {
        return this._disableAppPinIfDevicePinIsSet;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedAppProtection currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowedDataStorageLocations", (n) -> { currentObject.setAllowedDataStorageLocations(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("allowedInboundDataTransferSources", (n) -> { currentObject.setAllowedInboundDataTransferSources(n.getEnumValue(ManagedAppDataTransferLevel.class)); });
            this.put("allowedOutboundClipboardSharingLevel", (n) -> { currentObject.setAllowedOutboundClipboardSharingLevel(n.getEnumValue(ManagedAppClipboardSharingLevel.class)); });
            this.put("allowedOutboundDataTransferDestinations", (n) -> { currentObject.setAllowedOutboundDataTransferDestinations(n.getEnumValue(ManagedAppDataTransferLevel.class)); });
            this.put("contactSyncBlocked", (n) -> { currentObject.setContactSyncBlocked(n.getBooleanValue()); });
            this.put("dataBackupBlocked", (n) -> { currentObject.setDataBackupBlocked(n.getBooleanValue()); });
            this.put("deviceComplianceRequired", (n) -> { currentObject.setDeviceComplianceRequired(n.getBooleanValue()); });
            this.put("disableAppPinIfDevicePinIsSet", (n) -> { currentObject.setDisableAppPinIfDevicePinIsSet(n.getBooleanValue()); });
            this.put("fingerprintBlocked", (n) -> { currentObject.setFingerprintBlocked(n.getBooleanValue()); });
            this.put("managedBrowser", (n) -> { currentObject.setManagedBrowser(n.getEnumValue(ManagedBrowserType.class)); });
            this.put("managedBrowserToOpenLinksRequired", (n) -> { currentObject.setManagedBrowserToOpenLinksRequired(n.getBooleanValue()); });
            this.put("maximumPinRetries", (n) -> { currentObject.setMaximumPinRetries(n.getIntegerValue()); });
            this.put("minimumPinLength", (n) -> { currentObject.setMinimumPinLength(n.getIntegerValue()); });
            this.put("minimumRequiredAppVersion", (n) -> { currentObject.setMinimumRequiredAppVersion(n.getStringValue()); });
            this.put("minimumRequiredOsVersion", (n) -> { currentObject.setMinimumRequiredOsVersion(n.getStringValue()); });
            this.put("minimumWarningAppVersion", (n) -> { currentObject.setMinimumWarningAppVersion(n.getStringValue()); });
            this.put("minimumWarningOsVersion", (n) -> { currentObject.setMinimumWarningOsVersion(n.getStringValue()); });
            this.put("organizationalCredentialsRequired", (n) -> { currentObject.setOrganizationalCredentialsRequired(n.getBooleanValue()); });
            this.put("periodBeforePinReset", (n) -> { currentObject.setPeriodBeforePinReset(n.getPeriodValue()); });
            this.put("periodOfflineBeforeAccessCheck", (n) -> { currentObject.setPeriodOfflineBeforeAccessCheck(n.getPeriodValue()); });
            this.put("periodOfflineBeforeWipeIsEnforced", (n) -> { currentObject.setPeriodOfflineBeforeWipeIsEnforced(n.getPeriodValue()); });
            this.put("periodOnlineBeforeAccessCheck", (n) -> { currentObject.setPeriodOnlineBeforeAccessCheck(n.getPeriodValue()); });
            this.put("pinCharacterSet", (n) -> { currentObject.setPinCharacterSet(n.getEnumValue(ManagedAppPinCharacterSet.class)); });
            this.put("pinRequired", (n) -> { currentObject.setPinRequired(n.getBooleanValue()); });
            this.put("printBlocked", (n) -> { currentObject.setPrintBlocked(n.getBooleanValue()); });
            this.put("saveAsBlocked", (n) -> { currentObject.setSaveAsBlocked(n.getBooleanValue()); });
            this.put("simplePinBlocked", (n) -> { currentObject.setSimplePinBlocked(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the fingerprintBlocked property value. Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFingerprintBlocked() {
        return this._fingerprintBlocked;
    }
    /**
     * Gets the managedBrowser property value. Type of managed browser
     * @return a managedBrowserType
     */
    @javax.annotation.Nullable
    public ManagedBrowserType getManagedBrowser() {
        return this._managedBrowser;
    }
    /**
     * Gets the managedBrowserToOpenLinksRequired property value. Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android)
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getManagedBrowserToOpenLinksRequired() {
        return this._managedBrowserToOpenLinksRequired;
    }
    /**
     * Gets the maximumPinRetries property value. Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumPinRetries() {
        return this._maximumPinRetries;
    }
    /**
     * Gets the minimumPinLength property value. Minimum pin length required for an app-level pin if PinRequired is set to True
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumPinLength() {
        return this._minimumPinLength;
    }
    /**
     * Gets the minimumRequiredAppVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumRequiredAppVersion() {
        return this._minimumRequiredAppVersion;
    }
    /**
     * Gets the minimumRequiredOsVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumRequiredOsVersion() {
        return this._minimumRequiredOsVersion;
    }
    /**
     * Gets the minimumWarningAppVersion property value. Versions less than the specified version will result in warning message on the managed app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWarningAppVersion() {
        return this._minimumWarningAppVersion;
    }
    /**
     * Gets the minimumWarningOsVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWarningOsVersion() {
        return this._minimumWarningOsVersion;
    }
    /**
     * Gets the organizationalCredentialsRequired property value. Indicates whether organizational credentials are required for app use.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOrganizationalCredentialsRequired() {
        return this._organizationalCredentialsRequired;
    }
    /**
     * Gets the periodBeforePinReset property value. TimePeriod before the all-level pin must be reset if PinRequired is set to True.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPeriodBeforePinReset() {
        return this._periodBeforePinReset;
    }
    /**
     * Gets the periodOfflineBeforeAccessCheck property value. The period after which access is checked when the device is not connected to the internet.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPeriodOfflineBeforeAccessCheck() {
        return this._periodOfflineBeforeAccessCheck;
    }
    /**
     * Gets the periodOfflineBeforeWipeIsEnforced property value. The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPeriodOfflineBeforeWipeIsEnforced() {
        return this._periodOfflineBeforeWipeIsEnforced;
    }
    /**
     * Gets the periodOnlineBeforeAccessCheck property value. The period after which access is checked when the device is connected to the internet.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getPeriodOnlineBeforeAccessCheck() {
        return this._periodOnlineBeforeAccessCheck;
    }
    /**
     * Gets the pinCharacterSet property value. Character set which is to be used for a user's app PIN
     * @return a managedAppPinCharacterSet
     */
    @javax.annotation.Nullable
    public ManagedAppPinCharacterSet getPinCharacterSet() {
        return this._pinCharacterSet;
    }
    /**
     * Gets the pinRequired property value. Indicates whether an app-level pin is required.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPinRequired() {
        return this._pinRequired;
    }
    /**
     * Gets the printBlocked property value. Indicates whether printing is allowed from managed apps.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrintBlocked() {
        return this._printBlocked;
    }
    /**
     * Gets the saveAsBlocked property value. Indicates whether users may use the 'Save As' menu item to save a copy of protected files.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSaveAsBlocked() {
        return this._saveAsBlocked;
    }
    /**
     * Gets the simplePinBlocked property value. Indicates whether simplePin is blocked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSimplePinBlocked() {
        return this._simplePinBlocked;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("allowedDataStorageLocations", this.getAllowedDataStorageLocations());
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
    public void setAllowedDataStorageLocations(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedDataStorageLocations = value;
    }
    /**
     * Sets the allowedInboundDataTransferSources property value. Data can be transferred from/to these classes of apps
     * @param value Value to set for the allowedInboundDataTransferSources property.
     * @return a void
     */
    public void setAllowedInboundDataTransferSources(@javax.annotation.Nullable final ManagedAppDataTransferLevel value) {
        this._allowedInboundDataTransferSources = value;
    }
    /**
     * Sets the allowedOutboundClipboardSharingLevel property value. Represents the level to which the device's clipboard may be shared between apps
     * @param value Value to set for the allowedOutboundClipboardSharingLevel property.
     * @return a void
     */
    public void setAllowedOutboundClipboardSharingLevel(@javax.annotation.Nullable final ManagedAppClipboardSharingLevel value) {
        this._allowedOutboundClipboardSharingLevel = value;
    }
    /**
     * Sets the allowedOutboundDataTransferDestinations property value. Data can be transferred from/to these classes of apps
     * @param value Value to set for the allowedOutboundDataTransferDestinations property.
     * @return a void
     */
    public void setAllowedOutboundDataTransferDestinations(@javax.annotation.Nullable final ManagedAppDataTransferLevel value) {
        this._allowedOutboundDataTransferDestinations = value;
    }
    /**
     * Sets the contactSyncBlocked property value. Indicates whether contacts can be synced to the user's device.
     * @param value Value to set for the contactSyncBlocked property.
     * @return a void
     */
    public void setContactSyncBlocked(@javax.annotation.Nullable final Boolean value) {
        this._contactSyncBlocked = value;
    }
    /**
     * Sets the dataBackupBlocked property value. Indicates whether the backup of a managed app's data is blocked.
     * @param value Value to set for the dataBackupBlocked property.
     * @return a void
     */
    public void setDataBackupBlocked(@javax.annotation.Nullable final Boolean value) {
        this._dataBackupBlocked = value;
    }
    /**
     * Sets the deviceComplianceRequired property value. Indicates whether device compliance is required.
     * @param value Value to set for the deviceComplianceRequired property.
     * @return a void
     */
    public void setDeviceComplianceRequired(@javax.annotation.Nullable final Boolean value) {
        this._deviceComplianceRequired = value;
    }
    /**
     * Sets the disableAppPinIfDevicePinIsSet property value. Indicates whether use of the app pin is required if the device pin is set.
     * @param value Value to set for the disableAppPinIfDevicePinIsSet property.
     * @return a void
     */
    public void setDisableAppPinIfDevicePinIsSet(@javax.annotation.Nullable final Boolean value) {
        this._disableAppPinIfDevicePinIsSet = value;
    }
    /**
     * Sets the fingerprintBlocked property value. Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True.
     * @param value Value to set for the fingerprintBlocked property.
     * @return a void
     */
    public void setFingerprintBlocked(@javax.annotation.Nullable final Boolean value) {
        this._fingerprintBlocked = value;
    }
    /**
     * Sets the managedBrowser property value. Type of managed browser
     * @param value Value to set for the managedBrowser property.
     * @return a void
     */
    public void setManagedBrowser(@javax.annotation.Nullable final ManagedBrowserType value) {
        this._managedBrowser = value;
    }
    /**
     * Sets the managedBrowserToOpenLinksRequired property value. Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android)
     * @param value Value to set for the managedBrowserToOpenLinksRequired property.
     * @return a void
     */
    public void setManagedBrowserToOpenLinksRequired(@javax.annotation.Nullable final Boolean value) {
        this._managedBrowserToOpenLinksRequired = value;
    }
    /**
     * Sets the maximumPinRetries property value. Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped.
     * @param value Value to set for the maximumPinRetries property.
     * @return a void
     */
    public void setMaximumPinRetries(@javax.annotation.Nullable final Integer value) {
        this._maximumPinRetries = value;
    }
    /**
     * Sets the minimumPinLength property value. Minimum pin length required for an app-level pin if PinRequired is set to True
     * @param value Value to set for the minimumPinLength property.
     * @return a void
     */
    public void setMinimumPinLength(@javax.annotation.Nullable final Integer value) {
        this._minimumPinLength = value;
    }
    /**
     * Sets the minimumRequiredAppVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the minimumRequiredAppVersion property.
     * @return a void
     */
    public void setMinimumRequiredAppVersion(@javax.annotation.Nullable final String value) {
        this._minimumRequiredAppVersion = value;
    }
    /**
     * Sets the minimumRequiredOsVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the minimumRequiredOsVersion property.
     * @return a void
     */
    public void setMinimumRequiredOsVersion(@javax.annotation.Nullable final String value) {
        this._minimumRequiredOsVersion = value;
    }
    /**
     * Sets the minimumWarningAppVersion property value. Versions less than the specified version will result in warning message on the managed app.
     * @param value Value to set for the minimumWarningAppVersion property.
     * @return a void
     */
    public void setMinimumWarningAppVersion(@javax.annotation.Nullable final String value) {
        this._minimumWarningAppVersion = value;
    }
    /**
     * Sets the minimumWarningOsVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data.
     * @param value Value to set for the minimumWarningOsVersion property.
     * @return a void
     */
    public void setMinimumWarningOsVersion(@javax.annotation.Nullable final String value) {
        this._minimumWarningOsVersion = value;
    }
    /**
     * Sets the organizationalCredentialsRequired property value. Indicates whether organizational credentials are required for app use.
     * @param value Value to set for the organizationalCredentialsRequired property.
     * @return a void
     */
    public void setOrganizationalCredentialsRequired(@javax.annotation.Nullable final Boolean value) {
        this._organizationalCredentialsRequired = value;
    }
    /**
     * Sets the periodBeforePinReset property value. TimePeriod before the all-level pin must be reset if PinRequired is set to True.
     * @param value Value to set for the periodBeforePinReset property.
     * @return a void
     */
    public void setPeriodBeforePinReset(@javax.annotation.Nullable final Period value) {
        this._periodBeforePinReset = value;
    }
    /**
     * Sets the periodOfflineBeforeAccessCheck property value. The period after which access is checked when the device is not connected to the internet.
     * @param value Value to set for the periodOfflineBeforeAccessCheck property.
     * @return a void
     */
    public void setPeriodOfflineBeforeAccessCheck(@javax.annotation.Nullable final Period value) {
        this._periodOfflineBeforeAccessCheck = value;
    }
    /**
     * Sets the periodOfflineBeforeWipeIsEnforced property value. The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped.
     * @param value Value to set for the periodOfflineBeforeWipeIsEnforced property.
     * @return a void
     */
    public void setPeriodOfflineBeforeWipeIsEnforced(@javax.annotation.Nullable final Period value) {
        this._periodOfflineBeforeWipeIsEnforced = value;
    }
    /**
     * Sets the periodOnlineBeforeAccessCheck property value. The period after which access is checked when the device is connected to the internet.
     * @param value Value to set for the periodOnlineBeforeAccessCheck property.
     * @return a void
     */
    public void setPeriodOnlineBeforeAccessCheck(@javax.annotation.Nullable final Period value) {
        this._periodOnlineBeforeAccessCheck = value;
    }
    /**
     * Sets the pinCharacterSet property value. Character set which is to be used for a user's app PIN
     * @param value Value to set for the pinCharacterSet property.
     * @return a void
     */
    public void setPinCharacterSet(@javax.annotation.Nullable final ManagedAppPinCharacterSet value) {
        this._pinCharacterSet = value;
    }
    /**
     * Sets the pinRequired property value. Indicates whether an app-level pin is required.
     * @param value Value to set for the pinRequired property.
     * @return a void
     */
    public void setPinRequired(@javax.annotation.Nullable final Boolean value) {
        this._pinRequired = value;
    }
    /**
     * Sets the printBlocked property value. Indicates whether printing is allowed from managed apps.
     * @param value Value to set for the printBlocked property.
     * @return a void
     */
    public void setPrintBlocked(@javax.annotation.Nullable final Boolean value) {
        this._printBlocked = value;
    }
    /**
     * Sets the saveAsBlocked property value. Indicates whether users may use the 'Save As' menu item to save a copy of protected files.
     * @param value Value to set for the saveAsBlocked property.
     * @return a void
     */
    public void setSaveAsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._saveAsBlocked = value;
    }
    /**
     * Sets the simplePinBlocked property value. Indicates whether simplePin is blocked.
     * @param value Value to set for the simplePinBlocked property.
     * @return a void
     */
    public void setSimplePinBlocked(@javax.annotation.Nullable final Boolean value) {
        this._simplePinBlocked = value;
    }
}
