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
    @javax.annotation.Nullable
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bitLockerEnabled", (n) -> { this.setBitLockerEnabled(n.getBooleanValue()); });
        deserializerMap.put("codeIntegrityEnabled", (n) -> { this.setCodeIntegrityEnabled(n.getBooleanValue()); });
        deserializerMap.put("earlyLaunchAntiMalwareDriverEnabled", (n) -> { this.setEarlyLaunchAntiMalwareDriverEnabled(n.getBooleanValue()); });
        deserializerMap.put("mobileOsMaximumVersion", (n) -> { this.setMobileOsMaximumVersion(n.getStringValue()); });
        deserializerMap.put("mobileOsMinimumVersion", (n) -> { this.setMobileOsMinimumVersion(n.getStringValue()); });
        deserializerMap.put("osMaximumVersion", (n) -> { this.setOsMaximumVersion(n.getStringValue()); });
        deserializerMap.put("osMinimumVersion", (n) -> { this.setOsMinimumVersion(n.getStringValue()); });
        deserializerMap.put("passwordBlockSimple", (n) -> { this.setPasswordBlockSimple(n.getBooleanValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { this.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumCharacterSetCount", (n) -> { this.setPasswordMinimumCharacterSetCount(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeLock", (n) -> { this.setPasswordMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordBlockCount", (n) -> { this.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passwordRequired", (n) -> { this.setPasswordRequired(n.getBooleanValue()); });
        deserializerMap.put("passwordRequiredToUnlockFromIdle", (n) -> { this.setPasswordRequiredToUnlockFromIdle(n.getBooleanValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
        deserializerMap.put("requireHealthyDeviceReport", (n) -> { this.setRequireHealthyDeviceReport(n.getBooleanValue()); });
        deserializerMap.put("secureBootEnabled", (n) -> { this.setSecureBootEnabled(n.getBooleanValue()); });
        deserializerMap.put("storageRequireEncryption", (n) -> { this.setStorageRequireEncryption(n.getBooleanValue()); });
        return deserializerMap;
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
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setBitLockerEnabled(@javax.annotation.Nullable final Boolean value) {
        this._bitLockerEnabled = value;
    }
    /**
     * Sets the codeIntegrityEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation.
     * @param value Value to set for the codeIntegrityEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCodeIntegrityEnabled(@javax.annotation.Nullable final Boolean value) {
        this._codeIntegrityEnabled = value;
    }
    /**
     * Sets the earlyLaunchAntiMalwareDriverEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is enabled.
     * @param value Value to set for the earlyLaunchAntiMalwareDriverEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEarlyLaunchAntiMalwareDriverEnabled(@javax.annotation.Nullable final Boolean value) {
        this._earlyLaunchAntiMalwareDriverEnabled = value;
    }
    /**
     * Sets the mobileOsMaximumVersion property value. Maximum Windows Phone version.
     * @param value Value to set for the mobileOsMaximumVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileOsMaximumVersion(@javax.annotation.Nullable final String value) {
        this._mobileOsMaximumVersion = value;
    }
    /**
     * Sets the mobileOsMinimumVersion property value. Minimum Windows Phone version.
     * @param value Value to set for the mobileOsMinimumVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileOsMinimumVersion(@javax.annotation.Nullable final String value) {
        this._mobileOsMinimumVersion = value;
    }
    /**
     * Sets the osMaximumVersion property value. Maximum Windows 10 version.
     * @param value Value to set for the osMaximumVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsMaximumVersion(@javax.annotation.Nullable final String value) {
        this._osMaximumVersion = value;
    }
    /**
     * Sets the osMinimumVersion property value. Minimum Windows 10 version.
     * @param value Value to set for the osMinimumVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsMinimumVersion(@javax.annotation.Nullable final String value) {
        this._osMinimumVersion = value;
    }
    /**
     * Sets the passwordBlockSimple property value. Indicates whether or not to block simple password.
     * @param value Value to set for the passwordBlockSimple property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockSimple(@javax.annotation.Nullable final Boolean value) {
        this._passwordBlockSimple = value;
    }
    /**
     * Sets the passwordExpirationDays property value. The password expiration in days.
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this._passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumCharacterSetCount(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumCharacterSetCount = value;
    }
    /**
     * Sets the passwordMinimumLength property value. The minimum password length.
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a password is required.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeLock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinutesOfInactivityBeforeLock(@javax.annotation.Nullable final Integer value) {
        this._passwordMinutesOfInactivityBeforeLock = value;
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent re-use of.
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordPreviousPasswordBlockCount(@javax.annotation.Nullable final Integer value) {
        this._passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequired property value. Require a password to unlock Windows device.
     * @param value Value to set for the passwordRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequired(@javax.annotation.Nullable final Boolean value) {
        this._passwordRequired = value;
    }
    /**
     * Sets the passwordRequiredToUnlockFromIdle property value. Require a password to unlock an idle device.
     * @param value Value to set for the passwordRequiredToUnlockFromIdle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequiredToUnlockFromIdle(@javax.annotation.Nullable final Boolean value) {
        this._passwordRequiredToUnlockFromIdle = value;
    }
    /**
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequiredType(@javax.annotation.Nullable final RequiredPasswordType value) {
        this._passwordRequiredType = value;
    }
    /**
     * Sets the requireHealthyDeviceReport property value. Require devices to be reported as healthy by Windows Device Health Attestation.
     * @param value Value to set for the requireHealthyDeviceReport property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequireHealthyDeviceReport(@javax.annotation.Nullable final Boolean value) {
        this._requireHealthyDeviceReport = value;
    }
    /**
     * Sets the secureBootEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.
     * @param value Value to set for the secureBootEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecureBootEnabled(@javax.annotation.Nullable final Boolean value) {
        this._secureBootEnabled = value;
    }
    /**
     * Sets the storageRequireEncryption property value. Require encryption on windows devices.
     * @param value Value to set for the storageRequireEncryption property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageRequireEncryption(@javax.annotation.Nullable final Boolean value) {
        this._storageRequireEncryption = value;
    }
}
