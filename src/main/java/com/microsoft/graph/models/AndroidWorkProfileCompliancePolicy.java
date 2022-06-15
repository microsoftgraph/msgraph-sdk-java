package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidWorkProfileCompliancePolicy extends DeviceCompliancePolicy implements Parsable {
    /** Require that devices have enabled device threat protection. */
    private Boolean _deviceThreatProtectionEnabled;
    /** Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet. */
    private DeviceThreatProtectionLevel _deviceThreatProtectionRequiredSecurityLevel;
    /** Minimum Android security patch level. */
    private String _minAndroidSecurityPatchLevel;
    /** Maximum Android version. */
    private String _osMaximumVersion;
    /** Minimum Android version. */
    private String _osMinimumVersion;
    /** Number of days before the password expires. Valid values 1 to 365 */
    private Integer _passwordExpirationDays;
    /** Minimum password length. Valid values 4 to 16 */
    private Integer _passwordMinimumLength;
    /** Minutes of inactivity before a password is required. */
    private Integer _passwordMinutesOfInactivityBeforeLock;
    /** Number of previous passwords to block. Valid values 1 to 24 */
    private Integer _passwordPreviousPasswordBlockCount;
    /** Require a password to unlock device. */
    private Boolean _passwordRequired;
    /** Type of characters in password. Possible values are: deviceDefault, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, numeric, numericComplex, any. */
    private AndroidRequiredPasswordType _passwordRequiredType;
    /** Devices must not be jailbroken or rooted. */
    private Boolean _securityBlockJailbrokenDevices;
    /** Disable USB debugging on Android devices. */
    private Boolean _securityDisableUsbDebugging;
    /** Require that devices disallow installation of apps from unknown sources. */
    private Boolean _securityPreventInstallAppsFromUnknownSources;
    /** Require the device to pass the Company Portal client app runtime integrity check. */
    private Boolean _securityRequireCompanyPortalAppIntegrity;
    /** Require Google Play Services to be installed and enabled on the device. */
    private Boolean _securityRequireGooglePlayServices;
    /** Require the device to pass the SafetyNet basic integrity check. */
    private Boolean _securityRequireSafetyNetAttestationBasicIntegrity;
    /** Require the device to pass the SafetyNet certified device check. */
    private Boolean _securityRequireSafetyNetAttestationCertifiedDevice;
    /** Require the device to have up to date security providers. The device will require Google Play Services to be enabled and up to date. */
    private Boolean _securityRequireUpToDateSecurityProviders;
    /** Require the Android Verify apps feature is turned on. */
    private Boolean _securityRequireVerifyApps;
    /** Require encryption on Android devices. */
    private Boolean _storageRequireEncryption;
    /**
     * Instantiates a new AndroidWorkProfileCompliancePolicy and sets the default values.
     * @return a void
     */
    public AndroidWorkProfileCompliancePolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidWorkProfileCompliancePolicy
     */
    @javax.annotation.Nonnull
    public static AndroidWorkProfileCompliancePolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidWorkProfileCompliancePolicy();
    }
    /**
     * Gets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceThreatProtectionEnabled() {
        return this._deviceThreatProtectionEnabled;
    }
    /**
     * Gets the deviceThreatProtectionRequiredSecurityLevel property value. Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet.
     * @return a deviceThreatProtectionLevel
     */
    @javax.annotation.Nullable
    public DeviceThreatProtectionLevel getDeviceThreatProtectionRequiredSecurityLevel() {
        return this._deviceThreatProtectionRequiredSecurityLevel;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidWorkProfileCompliancePolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deviceThreatProtectionEnabled", (n) -> { currentObject.setDeviceThreatProtectionEnabled(n.getBooleanValue()); });
            this.put("deviceThreatProtectionRequiredSecurityLevel", (n) -> { currentObject.setDeviceThreatProtectionRequiredSecurityLevel(n.getEnumValue(DeviceThreatProtectionLevel.class)); });
            this.put("minAndroidSecurityPatchLevel", (n) -> { currentObject.setMinAndroidSecurityPatchLevel(n.getStringValue()); });
            this.put("osMaximumVersion", (n) -> { currentObject.setOsMaximumVersion(n.getStringValue()); });
            this.put("osMinimumVersion", (n) -> { currentObject.setOsMinimumVersion(n.getStringValue()); });
            this.put("passwordExpirationDays", (n) -> { currentObject.setPasswordExpirationDays(n.getIntegerValue()); });
            this.put("passwordMinimumLength", (n) -> { currentObject.setPasswordMinimumLength(n.getIntegerValue()); });
            this.put("passwordMinutesOfInactivityBeforeLock", (n) -> { currentObject.setPasswordMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
            this.put("passwordPreviousPasswordBlockCount", (n) -> { currentObject.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
            this.put("passwordRequired", (n) -> { currentObject.setPasswordRequired(n.getBooleanValue()); });
            this.put("passwordRequiredType", (n) -> { currentObject.setPasswordRequiredType(n.getEnumValue(AndroidRequiredPasswordType.class)); });
            this.put("securityBlockJailbrokenDevices", (n) -> { currentObject.setSecurityBlockJailbrokenDevices(n.getBooleanValue()); });
            this.put("securityDisableUsbDebugging", (n) -> { currentObject.setSecurityDisableUsbDebugging(n.getBooleanValue()); });
            this.put("securityPreventInstallAppsFromUnknownSources", (n) -> { currentObject.setSecurityPreventInstallAppsFromUnknownSources(n.getBooleanValue()); });
            this.put("securityRequireCompanyPortalAppIntegrity", (n) -> { currentObject.setSecurityRequireCompanyPortalAppIntegrity(n.getBooleanValue()); });
            this.put("securityRequireGooglePlayServices", (n) -> { currentObject.setSecurityRequireGooglePlayServices(n.getBooleanValue()); });
            this.put("securityRequireSafetyNetAttestationBasicIntegrity", (n) -> { currentObject.setSecurityRequireSafetyNetAttestationBasicIntegrity(n.getBooleanValue()); });
            this.put("securityRequireSafetyNetAttestationCertifiedDevice", (n) -> { currentObject.setSecurityRequireSafetyNetAttestationCertifiedDevice(n.getBooleanValue()); });
            this.put("securityRequireUpToDateSecurityProviders", (n) -> { currentObject.setSecurityRequireUpToDateSecurityProviders(n.getBooleanValue()); });
            this.put("securityRequireVerifyApps", (n) -> { currentObject.setSecurityRequireVerifyApps(n.getBooleanValue()); });
            this.put("storageRequireEncryption", (n) -> { currentObject.setStorageRequireEncryption(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the minAndroidSecurityPatchLevel property value. Minimum Android security patch level.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinAndroidSecurityPatchLevel() {
        return this._minAndroidSecurityPatchLevel;
    }
    /**
     * Gets the osMaximumVersion property value. Maximum Android version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsMaximumVersion() {
        return this._osMaximumVersion;
    }
    /**
     * Gets the osMinimumVersion property value. Minimum Android version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsMinimumVersion() {
        return this._osMinimumVersion;
    }
    /**
     * Gets the passwordExpirationDays property value. Number of days before the password expires. Valid values 1 to 365
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this._passwordExpirationDays;
    }
    /**
     * Gets the passwordMinimumLength property value. Minimum password length. Valid values 4 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this._passwordMinimumLength;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a password is required.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeLock() {
        return this._passwordMinutesOfInactivityBeforeLock;
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block. Valid values 1 to 24
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this._passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequired property value. Require a password to unlock device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this._passwordRequired;
    }
    /**
     * Gets the passwordRequiredType property value. Type of characters in password. Possible values are: deviceDefault, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, numeric, numericComplex, any.
     * @return a androidRequiredPasswordType
     */
    @javax.annotation.Nullable
    public AndroidRequiredPasswordType getPasswordRequiredType() {
        return this._passwordRequiredType;
    }
    /**
     * Gets the securityBlockJailbrokenDevices property value. Devices must not be jailbroken or rooted.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityBlockJailbrokenDevices() {
        return this._securityBlockJailbrokenDevices;
    }
    /**
     * Gets the securityDisableUsbDebugging property value. Disable USB debugging on Android devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityDisableUsbDebugging() {
        return this._securityDisableUsbDebugging;
    }
    /**
     * Gets the securityPreventInstallAppsFromUnknownSources property value. Require that devices disallow installation of apps from unknown sources.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityPreventInstallAppsFromUnknownSources() {
        return this._securityPreventInstallAppsFromUnknownSources;
    }
    /**
     * Gets the securityRequireCompanyPortalAppIntegrity property value. Require the device to pass the Company Portal client app runtime integrity check.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityRequireCompanyPortalAppIntegrity() {
        return this._securityRequireCompanyPortalAppIntegrity;
    }
    /**
     * Gets the securityRequireGooglePlayServices property value. Require Google Play Services to be installed and enabled on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityRequireGooglePlayServices() {
        return this._securityRequireGooglePlayServices;
    }
    /**
     * Gets the securityRequireSafetyNetAttestationBasicIntegrity property value. Require the device to pass the SafetyNet basic integrity check.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityRequireSafetyNetAttestationBasicIntegrity() {
        return this._securityRequireSafetyNetAttestationBasicIntegrity;
    }
    /**
     * Gets the securityRequireSafetyNetAttestationCertifiedDevice property value. Require the device to pass the SafetyNet certified device check.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityRequireSafetyNetAttestationCertifiedDevice() {
        return this._securityRequireSafetyNetAttestationCertifiedDevice;
    }
    /**
     * Gets the securityRequireUpToDateSecurityProviders property value. Require the device to have up to date security providers. The device will require Google Play Services to be enabled and up to date.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityRequireUpToDateSecurityProviders() {
        return this._securityRequireUpToDateSecurityProviders;
    }
    /**
     * Gets the securityRequireVerifyApps property value. Require the Android Verify apps feature is turned on.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityRequireVerifyApps() {
        return this._securityRequireVerifyApps;
    }
    /**
     * Gets the storageRequireEncryption property value. Require encryption on Android devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRequireEncryption() {
        return this._storageRequireEncryption;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("deviceThreatProtectionEnabled", this.getDeviceThreatProtectionEnabled());
        writer.writeEnumValue("deviceThreatProtectionRequiredSecurityLevel", this.getDeviceThreatProtectionRequiredSecurityLevel());
        writer.writeStringValue("minAndroidSecurityPatchLevel", this.getMinAndroidSecurityPatchLevel());
        writer.writeStringValue("osMaximumVersion", this.getOsMaximumVersion());
        writer.writeStringValue("osMinimumVersion", this.getOsMinimumVersion());
        writer.writeIntegerValue("passwordExpirationDays", this.getPasswordExpirationDays());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeLock", this.getPasswordMinutesOfInactivityBeforeLock());
        writer.writeIntegerValue("passwordPreviousPasswordBlockCount", this.getPasswordPreviousPasswordBlockCount());
        writer.writeBooleanValue("passwordRequired", this.getPasswordRequired());
        writer.writeEnumValue("passwordRequiredType", this.getPasswordRequiredType());
        writer.writeBooleanValue("securityBlockJailbrokenDevices", this.getSecurityBlockJailbrokenDevices());
        writer.writeBooleanValue("securityDisableUsbDebugging", this.getSecurityDisableUsbDebugging());
        writer.writeBooleanValue("securityPreventInstallAppsFromUnknownSources", this.getSecurityPreventInstallAppsFromUnknownSources());
        writer.writeBooleanValue("securityRequireCompanyPortalAppIntegrity", this.getSecurityRequireCompanyPortalAppIntegrity());
        writer.writeBooleanValue("securityRequireGooglePlayServices", this.getSecurityRequireGooglePlayServices());
        writer.writeBooleanValue("securityRequireSafetyNetAttestationBasicIntegrity", this.getSecurityRequireSafetyNetAttestationBasicIntegrity());
        writer.writeBooleanValue("securityRequireSafetyNetAttestationCertifiedDevice", this.getSecurityRequireSafetyNetAttestationCertifiedDevice());
        writer.writeBooleanValue("securityRequireUpToDateSecurityProviders", this.getSecurityRequireUpToDateSecurityProviders());
        writer.writeBooleanValue("securityRequireVerifyApps", this.getSecurityRequireVerifyApps());
        writer.writeBooleanValue("storageRequireEncryption", this.getStorageRequireEncryption());
    }
    /**
     * Sets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection.
     * @param value Value to set for the deviceThreatProtectionEnabled property.
     * @return a void
     */
    public void setDeviceThreatProtectionEnabled(@javax.annotation.Nullable final Boolean value) {
        this._deviceThreatProtectionEnabled = value;
    }
    /**
     * Sets the deviceThreatProtectionRequiredSecurityLevel property value. Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet.
     * @param value Value to set for the deviceThreatProtectionRequiredSecurityLevel property.
     * @return a void
     */
    public void setDeviceThreatProtectionRequiredSecurityLevel(@javax.annotation.Nullable final DeviceThreatProtectionLevel value) {
        this._deviceThreatProtectionRequiredSecurityLevel = value;
    }
    /**
     * Sets the minAndroidSecurityPatchLevel property value. Minimum Android security patch level.
     * @param value Value to set for the minAndroidSecurityPatchLevel property.
     * @return a void
     */
    public void setMinAndroidSecurityPatchLevel(@javax.annotation.Nullable final String value) {
        this._minAndroidSecurityPatchLevel = value;
    }
    /**
     * Sets the osMaximumVersion property value. Maximum Android version.
     * @param value Value to set for the osMaximumVersion property.
     * @return a void
     */
    public void setOsMaximumVersion(@javax.annotation.Nullable final String value) {
        this._osMaximumVersion = value;
    }
    /**
     * Sets the osMinimumVersion property value. Minimum Android version.
     * @param value Value to set for the osMinimumVersion property.
     * @return a void
     */
    public void setOsMinimumVersion(@javax.annotation.Nullable final String value) {
        this._osMinimumVersion = value;
    }
    /**
     * Sets the passwordExpirationDays property value. Number of days before the password expires. Valid values 1 to 365
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this._passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumLength property value. Minimum password length. Valid values 4 to 16
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a password is required.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeLock property.
     * @return a void
     */
    public void setPasswordMinutesOfInactivityBeforeLock(@javax.annotation.Nullable final Integer value) {
        this._passwordMinutesOfInactivityBeforeLock = value;
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block. Valid values 1 to 24
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     * @return a void
     */
    public void setPasswordPreviousPasswordBlockCount(@javax.annotation.Nullable final Integer value) {
        this._passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequired property value. Require a password to unlock device.
     * @param value Value to set for the passwordRequired property.
     * @return a void
     */
    public void setPasswordRequired(@javax.annotation.Nullable final Boolean value) {
        this._passwordRequired = value;
    }
    /**
     * Sets the passwordRequiredType property value. Type of characters in password. Possible values are: deviceDefault, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, numeric, numericComplex, any.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    public void setPasswordRequiredType(@javax.annotation.Nullable final AndroidRequiredPasswordType value) {
        this._passwordRequiredType = value;
    }
    /**
     * Sets the securityBlockJailbrokenDevices property value. Devices must not be jailbroken or rooted.
     * @param value Value to set for the securityBlockJailbrokenDevices property.
     * @return a void
     */
    public void setSecurityBlockJailbrokenDevices(@javax.annotation.Nullable final Boolean value) {
        this._securityBlockJailbrokenDevices = value;
    }
    /**
     * Sets the securityDisableUsbDebugging property value. Disable USB debugging on Android devices.
     * @param value Value to set for the securityDisableUsbDebugging property.
     * @return a void
     */
    public void setSecurityDisableUsbDebugging(@javax.annotation.Nullable final Boolean value) {
        this._securityDisableUsbDebugging = value;
    }
    /**
     * Sets the securityPreventInstallAppsFromUnknownSources property value. Require that devices disallow installation of apps from unknown sources.
     * @param value Value to set for the securityPreventInstallAppsFromUnknownSources property.
     * @return a void
     */
    public void setSecurityPreventInstallAppsFromUnknownSources(@javax.annotation.Nullable final Boolean value) {
        this._securityPreventInstallAppsFromUnknownSources = value;
    }
    /**
     * Sets the securityRequireCompanyPortalAppIntegrity property value. Require the device to pass the Company Portal client app runtime integrity check.
     * @param value Value to set for the securityRequireCompanyPortalAppIntegrity property.
     * @return a void
     */
    public void setSecurityRequireCompanyPortalAppIntegrity(@javax.annotation.Nullable final Boolean value) {
        this._securityRequireCompanyPortalAppIntegrity = value;
    }
    /**
     * Sets the securityRequireGooglePlayServices property value. Require Google Play Services to be installed and enabled on the device.
     * @param value Value to set for the securityRequireGooglePlayServices property.
     * @return a void
     */
    public void setSecurityRequireGooglePlayServices(@javax.annotation.Nullable final Boolean value) {
        this._securityRequireGooglePlayServices = value;
    }
    /**
     * Sets the securityRequireSafetyNetAttestationBasicIntegrity property value. Require the device to pass the SafetyNet basic integrity check.
     * @param value Value to set for the securityRequireSafetyNetAttestationBasicIntegrity property.
     * @return a void
     */
    public void setSecurityRequireSafetyNetAttestationBasicIntegrity(@javax.annotation.Nullable final Boolean value) {
        this._securityRequireSafetyNetAttestationBasicIntegrity = value;
    }
    /**
     * Sets the securityRequireSafetyNetAttestationCertifiedDevice property value. Require the device to pass the SafetyNet certified device check.
     * @param value Value to set for the securityRequireSafetyNetAttestationCertifiedDevice property.
     * @return a void
     */
    public void setSecurityRequireSafetyNetAttestationCertifiedDevice(@javax.annotation.Nullable final Boolean value) {
        this._securityRequireSafetyNetAttestationCertifiedDevice = value;
    }
    /**
     * Sets the securityRequireUpToDateSecurityProviders property value. Require the device to have up to date security providers. The device will require Google Play Services to be enabled and up to date.
     * @param value Value to set for the securityRequireUpToDateSecurityProviders property.
     * @return a void
     */
    public void setSecurityRequireUpToDateSecurityProviders(@javax.annotation.Nullable final Boolean value) {
        this._securityRequireUpToDateSecurityProviders = value;
    }
    /**
     * Sets the securityRequireVerifyApps property value. Require the Android Verify apps feature is turned on.
     * @param value Value to set for the securityRequireVerifyApps property.
     * @return a void
     */
    public void setSecurityRequireVerifyApps(@javax.annotation.Nullable final Boolean value) {
        this._securityRequireVerifyApps = value;
    }
    /**
     * Sets the storageRequireEncryption property value. Require encryption on Android devices.
     * @param value Value to set for the storageRequireEncryption property.
     * @return a void
     */
    public void setStorageRequireEncryption(@javax.annotation.Nullable final Boolean value) {
        this._storageRequireEncryption = value;
    }
}
