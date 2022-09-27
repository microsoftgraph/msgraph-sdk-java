package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10CompliancePolicy extends DeviceCompliancePolicy implements Parsable {
    /** Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled */
    private Boolean _bitLockerEnabled;
    /** Require devices to be reported as healthy by Windows Device Health Attestation. */
    private Boolean _codeIntegrityEnabled;
    /** Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is enabled. */
    private Boolean _earlyLaunchAntiMalwareDriverEnabled;
    /** Maximum Windows Phone version. */
    private String _mobileOsMaximumVersion;
    /** Minimum Windows Phone version. */
    private String _mobileOsMinimumVersion;
    /** Maximum Windows 10 version. */
    private String _osMaximumVersion;
    /** Minimum Windows 10 version. */
    private String _osMinimumVersion;
    /** Indicates whether or not to block simple password. */
    private Boolean _passwordBlockSimple;
    /** The password expiration in days. */
    private Integer _passwordExpirationDays;
    /** The number of character sets required in the password. */
    private Integer _passwordMinimumCharacterSetCount;
    /** The minimum password length. */
    private Integer _passwordMinimumLength;
    /** Minutes of inactivity before a password is required. */
    private Integer _passwordMinutesOfInactivityBeforeLock;
    /** The number of previous passwords to prevent re-use of. */
    private Integer _passwordPreviousPasswordBlockCount;
    /** Require a password to unlock Windows device. */
    private Boolean _passwordRequired;
    /** Require a password to unlock an idle device. */
    private Boolean _passwordRequiredToUnlockFromIdle;
    /** Possible values of required passwords. */
    private RequiredPasswordType _passwordRequiredType;
    /** Require devices to be reported as healthy by Windows Device Health Attestation. */
    private Boolean _requireHealthyDeviceReport;
    /** Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled. */
    private Boolean _secureBootEnabled;
    /** Require encryption on windows devices. */
    private Boolean _storageRequireEncryption;
    /**
     * Instantiates a new Windows10CompliancePolicy and sets the default values.
     * @return a void
     */
    public Windows10CompliancePolicy() {
        super();
        this.setOdataType("#microsoft.graph.windows10CompliancePolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10CompliancePolicy
     */
    @javax.annotation.Nonnull
    public static Windows10CompliancePolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10CompliancePolicy();
    }
    /**
     * Gets the bitLockerEnabled property value. Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBitLockerEnabled() {
        return this._bitLockerEnabled;
    }
    /**
     * Gets the codeIntegrityEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCodeIntegrityEnabled() {
        return this._codeIntegrityEnabled;
    }
    /**
     * Gets the earlyLaunchAntiMalwareDriverEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEarlyLaunchAntiMalwareDriverEnabled() {
        return this._earlyLaunchAntiMalwareDriverEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows10CompliancePolicy currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("bitLockerEnabled", (n) -> { currentObject.setBitLockerEnabled(n.getBooleanValue()); });
            this.put("codeIntegrityEnabled", (n) -> { currentObject.setCodeIntegrityEnabled(n.getBooleanValue()); });
            this.put("earlyLaunchAntiMalwareDriverEnabled", (n) -> { currentObject.setEarlyLaunchAntiMalwareDriverEnabled(n.getBooleanValue()); });
            this.put("mobileOsMaximumVersion", (n) -> { currentObject.setMobileOsMaximumVersion(n.getStringValue()); });
            this.put("mobileOsMinimumVersion", (n) -> { currentObject.setMobileOsMinimumVersion(n.getStringValue()); });
            this.put("osMaximumVersion", (n) -> { currentObject.setOsMaximumVersion(n.getStringValue()); });
            this.put("osMinimumVersion", (n) -> { currentObject.setOsMinimumVersion(n.getStringValue()); });
            this.put("passwordBlockSimple", (n) -> { currentObject.setPasswordBlockSimple(n.getBooleanValue()); });
            this.put("passwordExpirationDays", (n) -> { currentObject.setPasswordExpirationDays(n.getIntegerValue()); });
            this.put("passwordMinimumCharacterSetCount", (n) -> { currentObject.setPasswordMinimumCharacterSetCount(n.getIntegerValue()); });
            this.put("passwordMinimumLength", (n) -> { currentObject.setPasswordMinimumLength(n.getIntegerValue()); });
            this.put("passwordMinutesOfInactivityBeforeLock", (n) -> { currentObject.setPasswordMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
            this.put("passwordPreviousPasswordBlockCount", (n) -> { currentObject.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
            this.put("passwordRequired", (n) -> { currentObject.setPasswordRequired(n.getBooleanValue()); });
            this.put("passwordRequiredToUnlockFromIdle", (n) -> { currentObject.setPasswordRequiredToUnlockFromIdle(n.getBooleanValue()); });
            this.put("passwordRequiredType", (n) -> { currentObject.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
            this.put("requireHealthyDeviceReport", (n) -> { currentObject.setRequireHealthyDeviceReport(n.getBooleanValue()); });
            this.put("secureBootEnabled", (n) -> { currentObject.setSecureBootEnabled(n.getBooleanValue()); });
            this.put("storageRequireEncryption", (n) -> { currentObject.setStorageRequireEncryption(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the mobileOsMaximumVersion property value. Maximum Windows Phone version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMobileOsMaximumVersion() {
        return this._mobileOsMaximumVersion;
    }
    /**
     * Gets the mobileOsMinimumVersion property value. Minimum Windows Phone version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMobileOsMinimumVersion() {
        return this._mobileOsMinimumVersion;
    }
    /**
     * Gets the osMaximumVersion property value. Maximum Windows 10 version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsMaximumVersion() {
        return this._osMaximumVersion;
    }
    /**
     * Gets the osMinimumVersion property value. Minimum Windows 10 version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsMinimumVersion() {
        return this._osMinimumVersion;
    }
    /**
     * Gets the passwordBlockSimple property value. Indicates whether or not to block simple password.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockSimple() {
        return this._passwordBlockSimple;
    }
    /**
     * Gets the passwordExpirationDays property value. The password expiration in days.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this._passwordExpirationDays;
    }
    /**
     * Gets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumCharacterSetCount() {
        return this._passwordMinimumCharacterSetCount;
    }
    /**
     * Gets the passwordMinimumLength property value. The minimum password length.
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
     * Gets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent re-use of.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this._passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequired property value. Require a password to unlock Windows device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this._passwordRequired;
    }
    /**
     * Gets the passwordRequiredToUnlockFromIdle property value. Require a password to unlock an idle device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequiredToUnlockFromIdle() {
        return this._passwordRequiredToUnlockFromIdle;
    }
    /**
     * Gets the passwordRequiredType property value. Possible values of required passwords.
     * @return a requiredPasswordType
     */
    @javax.annotation.Nullable
    public RequiredPasswordType getPasswordRequiredType() {
        return this._passwordRequiredType;
    }
    /**
     * Gets the requireHealthyDeviceReport property value. Require devices to be reported as healthy by Windows Device Health Attestation.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireHealthyDeviceReport() {
        return this._requireHealthyDeviceReport;
    }
    /**
     * Gets the secureBootEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecureBootEnabled() {
        return this._secureBootEnabled;
    }
    /**
     * Gets the storageRequireEncryption property value. Require encryption on windows devices.
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
        writer.writeBooleanValue("bitLockerEnabled", this.getBitLockerEnabled());
        writer.writeBooleanValue("codeIntegrityEnabled", this.getCodeIntegrityEnabled());
        writer.writeBooleanValue("earlyLaunchAntiMalwareDriverEnabled", this.getEarlyLaunchAntiMalwareDriverEnabled());
        writer.writeStringValue("mobileOsMaximumVersion", this.getMobileOsMaximumVersion());
        writer.writeStringValue("mobileOsMinimumVersion", this.getMobileOsMinimumVersion());
        writer.writeStringValue("osMaximumVersion", this.getOsMaximumVersion());
        writer.writeStringValue("osMinimumVersion", this.getOsMinimumVersion());
        writer.writeBooleanValue("passwordBlockSimple", this.getPasswordBlockSimple());
        writer.writeIntegerValue("passwordExpirationDays", this.getPasswordExpirationDays());
        writer.writeIntegerValue("passwordMinimumCharacterSetCount", this.getPasswordMinimumCharacterSetCount());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeLock", this.getPasswordMinutesOfInactivityBeforeLock());
        writer.writeIntegerValue("passwordPreviousPasswordBlockCount", this.getPasswordPreviousPasswordBlockCount());
        writer.writeBooleanValue("passwordRequired", this.getPasswordRequired());
        writer.writeBooleanValue("passwordRequiredToUnlockFromIdle", this.getPasswordRequiredToUnlockFromIdle());
        writer.writeEnumValue("passwordRequiredType", this.getPasswordRequiredType());
        writer.writeBooleanValue("requireHealthyDeviceReport", this.getRequireHealthyDeviceReport());
        writer.writeBooleanValue("secureBootEnabled", this.getSecureBootEnabled());
        writer.writeBooleanValue("storageRequireEncryption", this.getStorageRequireEncryption());
    }
    /**
     * Sets the bitLockerEnabled property value. Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled
     * @param value Value to set for the bitLockerEnabled property.
     * @return a void
     */
    public void setBitLockerEnabled(@javax.annotation.Nullable final Boolean value) {
        this._bitLockerEnabled = value;
    }
    /**
     * Sets the codeIntegrityEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation.
     * @param value Value to set for the codeIntegrityEnabled property.
     * @return a void
     */
    public void setCodeIntegrityEnabled(@javax.annotation.Nullable final Boolean value) {
        this._codeIntegrityEnabled = value;
    }
    /**
     * Sets the earlyLaunchAntiMalwareDriverEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is enabled.
     * @param value Value to set for the earlyLaunchAntiMalwareDriverEnabled property.
     * @return a void
     */
    public void setEarlyLaunchAntiMalwareDriverEnabled(@javax.annotation.Nullable final Boolean value) {
        this._earlyLaunchAntiMalwareDriverEnabled = value;
    }
    /**
     * Sets the mobileOsMaximumVersion property value. Maximum Windows Phone version.
     * @param value Value to set for the mobileOsMaximumVersion property.
     * @return a void
     */
    public void setMobileOsMaximumVersion(@javax.annotation.Nullable final String value) {
        this._mobileOsMaximumVersion = value;
    }
    /**
     * Sets the mobileOsMinimumVersion property value. Minimum Windows Phone version.
     * @param value Value to set for the mobileOsMinimumVersion property.
     * @return a void
     */
    public void setMobileOsMinimumVersion(@javax.annotation.Nullable final String value) {
        this._mobileOsMinimumVersion = value;
    }
    /**
     * Sets the osMaximumVersion property value. Maximum Windows 10 version.
     * @param value Value to set for the osMaximumVersion property.
     * @return a void
     */
    public void setOsMaximumVersion(@javax.annotation.Nullable final String value) {
        this._osMaximumVersion = value;
    }
    /**
     * Sets the osMinimumVersion property value. Minimum Windows 10 version.
     * @param value Value to set for the osMinimumVersion property.
     * @return a void
     */
    public void setOsMinimumVersion(@javax.annotation.Nullable final String value) {
        this._osMinimumVersion = value;
    }
    /**
     * Sets the passwordBlockSimple property value. Indicates whether or not to block simple password.
     * @param value Value to set for the passwordBlockSimple property.
     * @return a void
     */
    public void setPasswordBlockSimple(@javax.annotation.Nullable final Boolean value) {
        this._passwordBlockSimple = value;
    }
    /**
     * Sets the passwordExpirationDays property value. The password expiration in days.
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this._passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     * @return a void
     */
    public void setPasswordMinimumCharacterSetCount(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumCharacterSetCount = value;
    }
    /**
     * Sets the passwordMinimumLength property value. The minimum password length.
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
     * Sets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent re-use of.
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     * @return a void
     */
    public void setPasswordPreviousPasswordBlockCount(@javax.annotation.Nullable final Integer value) {
        this._passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequired property value. Require a password to unlock Windows device.
     * @param value Value to set for the passwordRequired property.
     * @return a void
     */
    public void setPasswordRequired(@javax.annotation.Nullable final Boolean value) {
        this._passwordRequired = value;
    }
    /**
     * Sets the passwordRequiredToUnlockFromIdle property value. Require a password to unlock an idle device.
     * @param value Value to set for the passwordRequiredToUnlockFromIdle property.
     * @return a void
     */
    public void setPasswordRequiredToUnlockFromIdle(@javax.annotation.Nullable final Boolean value) {
        this._passwordRequiredToUnlockFromIdle = value;
    }
    /**
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    public void setPasswordRequiredType(@javax.annotation.Nullable final RequiredPasswordType value) {
        this._passwordRequiredType = value;
    }
    /**
     * Sets the requireHealthyDeviceReport property value. Require devices to be reported as healthy by Windows Device Health Attestation.
     * @param value Value to set for the requireHealthyDeviceReport property.
     * @return a void
     */
    public void setRequireHealthyDeviceReport(@javax.annotation.Nullable final Boolean value) {
        this._requireHealthyDeviceReport = value;
    }
    /**
     * Sets the secureBootEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.
     * @param value Value to set for the secureBootEnabled property.
     * @return a void
     */
    public void setSecureBootEnabled(@javax.annotation.Nullable final Boolean value) {
        this._secureBootEnabled = value;
    }
    /**
     * Sets the storageRequireEncryption property value. Require encryption on windows devices.
     * @param value Value to set for the storageRequireEncryption property.
     * @return a void
     */
    public void setStorageRequireEncryption(@javax.annotation.Nullable final Boolean value) {
        this._storageRequireEncryption = value;
    }
}
