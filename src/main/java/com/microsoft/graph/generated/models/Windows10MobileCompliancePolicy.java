package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This class contains compliance settings for Windows 10 Mobile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows10MobileCompliancePolicy extends DeviceCompliancePolicy implements Parsable {
    /**
     * Instantiates a new {@link Windows10MobileCompliancePolicy} and sets the default values.
     */
    public Windows10MobileCompliancePolicy() {
        super();
        this.setOdataType("#microsoft.graph.windows10MobileCompliancePolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Windows10MobileCompliancePolicy}
     */
    @jakarta.annotation.Nonnull
    public static Windows10MobileCompliancePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10MobileCompliancePolicy();
    }
    /**
     * Gets the bitLockerEnabled property value. Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBitLockerEnabled() {
        return this.backingStore.get("bitLockerEnabled");
    }
    /**
     * Gets the codeIntegrityEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCodeIntegrityEnabled() {
        return this.backingStore.get("codeIntegrityEnabled");
    }
    /**
     * Gets the earlyLaunchAntiMalwareDriverEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEarlyLaunchAntiMalwareDriverEnabled() {
        return this.backingStore.get("earlyLaunchAntiMalwareDriverEnabled");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bitLockerEnabled", (n) -> { this.setBitLockerEnabled(n.getBooleanValue()); });
        deserializerMap.put("codeIntegrityEnabled", (n) -> { this.setCodeIntegrityEnabled(n.getBooleanValue()); });
        deserializerMap.put("earlyLaunchAntiMalwareDriverEnabled", (n) -> { this.setEarlyLaunchAntiMalwareDriverEnabled(n.getBooleanValue()); });
        deserializerMap.put("osMaximumVersion", (n) -> { this.setOsMaximumVersion(n.getStringValue()); });
        deserializerMap.put("osMinimumVersion", (n) -> { this.setOsMinimumVersion(n.getStringValue()); });
        deserializerMap.put("passwordBlockSimple", (n) -> { this.setPasswordBlockSimple(n.getBooleanValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { this.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumCharacterSetCount", (n) -> { this.setPasswordMinimumCharacterSetCount(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeLock", (n) -> { this.setPasswordMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordBlockCount", (n) -> { this.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passwordRequired", (n) -> { this.setPasswordRequired(n.getBooleanValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType::forValue)); });
        deserializerMap.put("passwordRequireToUnlockFromIdle", (n) -> { this.setPasswordRequireToUnlockFromIdle(n.getBooleanValue()); });
        deserializerMap.put("secureBootEnabled", (n) -> { this.setSecureBootEnabled(n.getBooleanValue()); });
        deserializerMap.put("storageRequireEncryption", (n) -> { this.setStorageRequireEncryption(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the osMaximumVersion property value. Maximum Windows Phone version.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsMaximumVersion() {
        return this.backingStore.get("osMaximumVersion");
    }
    /**
     * Gets the osMinimumVersion property value. Minimum Windows Phone version.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsMinimumVersion() {
        return this.backingStore.get("osMinimumVersion");
    }
    /**
     * Gets the passwordBlockSimple property value. Whether or not to block syncing the calendar.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockSimple() {
        return this.backingStore.get("passwordBlockSimple");
    }
    /**
     * Gets the passwordExpirationDays property value. Number of days before password expiration. Valid values 1 to 255
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.backingStore.get("passwordExpirationDays");
    }
    /**
     * Gets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumCharacterSetCount() {
        return this.backingStore.get("passwordMinimumCharacterSetCount");
    }
    /**
     * Gets the passwordMinimumLength property value. Minimum password length. Valid values 4 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.backingStore.get("passwordMinimumLength");
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a password is required.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeLock() {
        return this.backingStore.get("passwordMinutesOfInactivityBeforeLock");
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent re-use of.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.backingStore.get("passwordPreviousPasswordBlockCount");
    }
    /**
     * Gets the passwordRequired property value. Require a password to unlock Windows Phone device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this.backingStore.get("passwordRequired");
    }
    /**
     * Gets the passwordRequiredType property value. Possible values of required passwords.
     * @return a {@link RequiredPasswordType}
     */
    @jakarta.annotation.Nullable
    public RequiredPasswordType getPasswordRequiredType() {
        return this.backingStore.get("passwordRequiredType");
    }
    /**
     * Gets the passwordRequireToUnlockFromIdle property value. Require a password to unlock an idle device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordRequireToUnlockFromIdle() {
        return this.backingStore.get("passwordRequireToUnlockFromIdle");
    }
    /**
     * Gets the secureBootEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSecureBootEnabled() {
        return this.backingStore.get("secureBootEnabled");
    }
    /**
     * Gets the storageRequireEncryption property value. Require encryption on windows devices.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageRequireEncryption() {
        return this.backingStore.get("storageRequireEncryption");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("bitLockerEnabled", this.getBitLockerEnabled());
        writer.writeBooleanValue("codeIntegrityEnabled", this.getCodeIntegrityEnabled());
        writer.writeBooleanValue("earlyLaunchAntiMalwareDriverEnabled", this.getEarlyLaunchAntiMalwareDriverEnabled());
        writer.writeStringValue("osMaximumVersion", this.getOsMaximumVersion());
        writer.writeStringValue("osMinimumVersion", this.getOsMinimumVersion());
        writer.writeBooleanValue("passwordBlockSimple", this.getPasswordBlockSimple());
        writer.writeIntegerValue("passwordExpirationDays", this.getPasswordExpirationDays());
        writer.writeIntegerValue("passwordMinimumCharacterSetCount", this.getPasswordMinimumCharacterSetCount());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeLock", this.getPasswordMinutesOfInactivityBeforeLock());
        writer.writeIntegerValue("passwordPreviousPasswordBlockCount", this.getPasswordPreviousPasswordBlockCount());
        writer.writeBooleanValue("passwordRequired", this.getPasswordRequired());
        writer.writeEnumValue("passwordRequiredType", this.getPasswordRequiredType());
        writer.writeBooleanValue("passwordRequireToUnlockFromIdle", this.getPasswordRequireToUnlockFromIdle());
        writer.writeBooleanValue("secureBootEnabled", this.getSecureBootEnabled());
        writer.writeBooleanValue("storageRequireEncryption", this.getStorageRequireEncryption());
    }
    /**
     * Sets the bitLockerEnabled property value. Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled
     * @param value Value to set for the bitLockerEnabled property.
     */
    public void setBitLockerEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bitLockerEnabled", value);
    }
    /**
     * Sets the codeIntegrityEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation.
     * @param value Value to set for the codeIntegrityEnabled property.
     */
    public void setCodeIntegrityEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("codeIntegrityEnabled", value);
    }
    /**
     * Sets the earlyLaunchAntiMalwareDriverEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is enabled.
     * @param value Value to set for the earlyLaunchAntiMalwareDriverEnabled property.
     */
    public void setEarlyLaunchAntiMalwareDriverEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("earlyLaunchAntiMalwareDriverEnabled", value);
    }
    /**
     * Sets the osMaximumVersion property value. Maximum Windows Phone version.
     * @param value Value to set for the osMaximumVersion property.
     */
    public void setOsMaximumVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osMaximumVersion", value);
    }
    /**
     * Sets the osMinimumVersion property value. Minimum Windows Phone version.
     * @param value Value to set for the osMinimumVersion property.
     */
    public void setOsMinimumVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osMinimumVersion", value);
    }
    /**
     * Sets the passwordBlockSimple property value. Whether or not to block syncing the calendar.
     * @param value Value to set for the passwordBlockSimple property.
     */
    public void setPasswordBlockSimple(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordBlockSimple", value);
    }
    /**
     * Sets the passwordExpirationDays property value. Number of days before password expiration. Valid values 1 to 255
     * @param value Value to set for the passwordExpirationDays property.
     */
    public void setPasswordExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordExpirationDays", value);
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     */
    public void setPasswordMinimumCharacterSetCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinimumCharacterSetCount", value);
    }
    /**
     * Sets the passwordMinimumLength property value. Minimum password length. Valid values 4 to 16
     * @param value Value to set for the passwordMinimumLength property.
     */
    public void setPasswordMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinimumLength", value);
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a password is required.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeLock property.
     */
    public void setPasswordMinutesOfInactivityBeforeLock(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinutesOfInactivityBeforeLock", value);
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent re-use of.
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     */
    public void setPasswordPreviousPasswordBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordPreviousPasswordBlockCount", value);
    }
    /**
     * Sets the passwordRequired property value. Require a password to unlock Windows Phone device.
     * @param value Value to set for the passwordRequired property.
     */
    public void setPasswordRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordRequired", value);
    }
    /**
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     */
    public void setPasswordRequiredType(@jakarta.annotation.Nullable final RequiredPasswordType value) {
        this.backingStore.set("passwordRequiredType", value);
    }
    /**
     * Sets the passwordRequireToUnlockFromIdle property value. Require a password to unlock an idle device.
     * @param value Value to set for the passwordRequireToUnlockFromIdle property.
     */
    public void setPasswordRequireToUnlockFromIdle(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordRequireToUnlockFromIdle", value);
    }
    /**
     * Sets the secureBootEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.
     * @param value Value to set for the secureBootEnabled property.
     */
    public void setSecureBootEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("secureBootEnabled", value);
    }
    /**
     * Sets the storageRequireEncryption property value. Require encryption on windows devices.
     * @param value Value to set for the storageRequireEncryption property.
     */
    public void setStorageRequireEncryption(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("storageRequireEncryption", value);
    }
}
