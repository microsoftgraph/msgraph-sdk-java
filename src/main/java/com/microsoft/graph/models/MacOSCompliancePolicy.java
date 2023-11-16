package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This class contains compliance settings for Mac OS.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSCompliancePolicy extends DeviceCompliancePolicy implements Parsable {
    /**
     * Instantiates a new MacOSCompliancePolicy and sets the default values.
     */
    public MacOSCompliancePolicy() {
        super();
        this.setOdataType("#microsoft.graph.macOSCompliancePolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSCompliancePolicy
     */
    @jakarta.annotation.Nonnull
    public static MacOSCompliancePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSCompliancePolicy();
    }
    /**
     * Gets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceThreatProtectionEnabled() {
        return this.BackingStore.get("deviceThreatProtectionEnabled");
    }
    /**
     * Gets the deviceThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
     * @return a DeviceThreatProtectionLevel
     */
    @jakarta.annotation.Nullable
    public DeviceThreatProtectionLevel getDeviceThreatProtectionRequiredSecurityLevel() {
        return this.BackingStore.get("deviceThreatProtectionRequiredSecurityLevel");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceThreatProtectionEnabled", (n) -> { this.setDeviceThreatProtectionEnabled(n.getBooleanValue()); });
        deserializerMap.put("deviceThreatProtectionRequiredSecurityLevel", (n) -> { this.setDeviceThreatProtectionRequiredSecurityLevel(n.getEnumValue(DeviceThreatProtectionLevel.class)); });
        deserializerMap.put("firewallBlockAllIncoming", (n) -> { this.setFirewallBlockAllIncoming(n.getBooleanValue()); });
        deserializerMap.put("firewallEnabled", (n) -> { this.setFirewallEnabled(n.getBooleanValue()); });
        deserializerMap.put("firewallEnableStealthMode", (n) -> { this.setFirewallEnableStealthMode(n.getBooleanValue()); });
        deserializerMap.put("osMaximumVersion", (n) -> { this.setOsMaximumVersion(n.getStringValue()); });
        deserializerMap.put("osMinimumVersion", (n) -> { this.setOsMinimumVersion(n.getStringValue()); });
        deserializerMap.put("passwordBlockSimple", (n) -> { this.setPasswordBlockSimple(n.getBooleanValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { this.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumCharacterSetCount", (n) -> { this.setPasswordMinimumCharacterSetCount(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeLock", (n) -> { this.setPasswordMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordBlockCount", (n) -> { this.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passwordRequired", (n) -> { this.setPasswordRequired(n.getBooleanValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
        deserializerMap.put("storageRequireEncryption", (n) -> { this.setStorageRequireEncryption(n.getBooleanValue()); });
        deserializerMap.put("systemIntegrityProtectionEnabled", (n) -> { this.setSystemIntegrityProtectionEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firewallBlockAllIncoming property value. Corresponds to the 'Block all incoming connections' option.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallBlockAllIncoming() {
        return this.BackingStore.get("firewallBlockAllIncoming");
    }
    /**
     * Gets the firewallEnabled property value. Whether the firewall should be enabled or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallEnabled() {
        return this.BackingStore.get("firewallEnabled");
    }
    /**
     * Gets the firewallEnableStealthMode property value. Corresponds to 'Enable stealth mode.'
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallEnableStealthMode() {
        return this.BackingStore.get("firewallEnableStealthMode");
    }
    /**
     * Gets the osMaximumVersion property value. Maximum MacOS version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsMaximumVersion() {
        return this.BackingStore.get("osMaximumVersion");
    }
    /**
     * Gets the osMinimumVersion property value. Minimum MacOS version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsMinimumVersion() {
        return this.BackingStore.get("osMinimumVersion");
    }
    /**
     * Gets the passwordBlockSimple property value. Indicates whether or not to block simple passwords.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockSimple() {
        return this.BackingStore.get("passwordBlockSimple");
    }
    /**
     * Gets the passwordExpirationDays property value. Number of days before the password expires. Valid values 1 to 65535
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.BackingStore.get("passwordExpirationDays");
    }
    /**
     * Gets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumCharacterSetCount() {
        return this.BackingStore.get("passwordMinimumCharacterSetCount");
    }
    /**
     * Gets the passwordMinimumLength property value. Minimum length of password. Valid values 4 to 14
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.BackingStore.get("passwordMinimumLength");
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a password is required.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeLock() {
        return this.BackingStore.get("passwordMinutesOfInactivityBeforeLock");
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block. Valid values 1 to 24
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.BackingStore.get("passwordPreviousPasswordBlockCount");
    }
    /**
     * Gets the passwordRequired property value. Whether or not to require a password.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this.BackingStore.get("passwordRequired");
    }
    /**
     * Gets the passwordRequiredType property value. Possible values of required passwords.
     * @return a RequiredPasswordType
     */
    @jakarta.annotation.Nullable
    public RequiredPasswordType getPasswordRequiredType() {
        return this.BackingStore.get("passwordRequiredType");
    }
    /**
     * Gets the storageRequireEncryption property value. Require encryption on Mac OS devices.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageRequireEncryption() {
        return this.BackingStore.get("storageRequireEncryption");
    }
    /**
     * Gets the systemIntegrityProtectionEnabled property value. Require that devices have enabled system integrity protection.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSystemIntegrityProtectionEnabled() {
        return this.BackingStore.get("systemIntegrityProtectionEnabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("deviceThreatProtectionEnabled", this.getDeviceThreatProtectionEnabled());
        writer.writeEnumValue("deviceThreatProtectionRequiredSecurityLevel", this.getDeviceThreatProtectionRequiredSecurityLevel());
        writer.writeBooleanValue("firewallBlockAllIncoming", this.getFirewallBlockAllIncoming());
        writer.writeBooleanValue("firewallEnabled", this.getFirewallEnabled());
        writer.writeBooleanValue("firewallEnableStealthMode", this.getFirewallEnableStealthMode());
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
        writer.writeBooleanValue("storageRequireEncryption", this.getStorageRequireEncryption());
        writer.writeBooleanValue("systemIntegrityProtectionEnabled", this.getSystemIntegrityProtectionEnabled());
    }
    /**
     * Sets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection.
     * @param value Value to set for the deviceThreatProtectionEnabled property.
     */
    public void setDeviceThreatProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("deviceThreatProtectionEnabled", value);
    }
    /**
     * Sets the deviceThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
     * @param value Value to set for the deviceThreatProtectionRequiredSecurityLevel property.
     */
    public void setDeviceThreatProtectionRequiredSecurityLevel(@jakarta.annotation.Nullable final DeviceThreatProtectionLevel value) {
        this.BackingStore.set("deviceThreatProtectionRequiredSecurityLevel", value);
    }
    /**
     * Sets the firewallBlockAllIncoming property value. Corresponds to the 'Block all incoming connections' option.
     * @param value Value to set for the firewallBlockAllIncoming property.
     */
    public void setFirewallBlockAllIncoming(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("firewallBlockAllIncoming", value);
    }
    /**
     * Sets the firewallEnabled property value. Whether the firewall should be enabled or not.
     * @param value Value to set for the firewallEnabled property.
     */
    public void setFirewallEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("firewallEnabled", value);
    }
    /**
     * Sets the firewallEnableStealthMode property value. Corresponds to 'Enable stealth mode.'
     * @param value Value to set for the firewallEnableStealthMode property.
     */
    public void setFirewallEnableStealthMode(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("firewallEnableStealthMode", value);
    }
    /**
     * Sets the osMaximumVersion property value. Maximum MacOS version.
     * @param value Value to set for the osMaximumVersion property.
     */
    public void setOsMaximumVersion(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("osMaximumVersion", value);
    }
    /**
     * Sets the osMinimumVersion property value. Minimum MacOS version.
     * @param value Value to set for the osMinimumVersion property.
     */
    public void setOsMinimumVersion(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("osMinimumVersion", value);
    }
    /**
     * Sets the passwordBlockSimple property value. Indicates whether or not to block simple passwords.
     * @param value Value to set for the passwordBlockSimple property.
     */
    public void setPasswordBlockSimple(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("passwordBlockSimple", value);
    }
    /**
     * Sets the passwordExpirationDays property value. Number of days before the password expires. Valid values 1 to 65535
     * @param value Value to set for the passwordExpirationDays property.
     */
    public void setPasswordExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("passwordExpirationDays", value);
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     */
    public void setPasswordMinimumCharacterSetCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("passwordMinimumCharacterSetCount", value);
    }
    /**
     * Sets the passwordMinimumLength property value. Minimum length of password. Valid values 4 to 14
     * @param value Value to set for the passwordMinimumLength property.
     */
    public void setPasswordMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("passwordMinimumLength", value);
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a password is required.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeLock property.
     */
    public void setPasswordMinutesOfInactivityBeforeLock(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("passwordMinutesOfInactivityBeforeLock", value);
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block. Valid values 1 to 24
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     */
    public void setPasswordPreviousPasswordBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("passwordPreviousPasswordBlockCount", value);
    }
    /**
     * Sets the passwordRequired property value. Whether or not to require a password.
     * @param value Value to set for the passwordRequired property.
     */
    public void setPasswordRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("passwordRequired", value);
    }
    /**
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     */
    public void setPasswordRequiredType(@jakarta.annotation.Nullable final RequiredPasswordType value) {
        this.BackingStore.set("passwordRequiredType", value);
    }
    /**
     * Sets the storageRequireEncryption property value. Require encryption on Mac OS devices.
     * @param value Value to set for the storageRequireEncryption property.
     */
    public void setStorageRequireEncryption(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("storageRequireEncryption", value);
    }
    /**
     * Sets the systemIntegrityProtectionEnabled property value. Require that devices have enabled system integrity protection.
     * @param value Value to set for the systemIntegrityProtectionEnabled property.
     */
    public void setSystemIntegrityProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("systemIntegrityProtectionEnabled", value);
    }
}
