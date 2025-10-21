package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This class contains compliance settings for IOS.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosCompliancePolicy extends DeviceCompliancePolicy implements Parsable {
    /**
     * Instantiates a new {@link IosCompliancePolicy} and sets the default values.
     */
    public IosCompliancePolicy() {
        super();
        this.setOdataType("#microsoft.graph.iosCompliancePolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IosCompliancePolicy}
     */
    @jakarta.annotation.Nonnull
    public static IosCompliancePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosCompliancePolicy();
    }
    /**
     * Gets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection .
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceThreatProtectionEnabled() {
        return this.backingStore.get("deviceThreatProtectionEnabled");
    }
    /**
     * Gets the deviceThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
     * @return a {@link DeviceThreatProtectionLevel}
     */
    @jakarta.annotation.Nullable
    public DeviceThreatProtectionLevel getDeviceThreatProtectionRequiredSecurityLevel() {
        return this.backingStore.get("deviceThreatProtectionRequiredSecurityLevel");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceThreatProtectionEnabled", (n) -> { this.setDeviceThreatProtectionEnabled(n.getBooleanValue()); });
        deserializerMap.put("deviceThreatProtectionRequiredSecurityLevel", (n) -> { this.setDeviceThreatProtectionRequiredSecurityLevel(n.getEnumValue(DeviceThreatProtectionLevel::forValue)); });
        deserializerMap.put("managedEmailProfileRequired", (n) -> { this.setManagedEmailProfileRequired(n.getBooleanValue()); });
        deserializerMap.put("osMaximumVersion", (n) -> { this.setOsMaximumVersion(n.getStringValue()); });
        deserializerMap.put("osMinimumVersion", (n) -> { this.setOsMinimumVersion(n.getStringValue()); });
        deserializerMap.put("passcodeBlockSimple", (n) -> { this.setPasscodeBlockSimple(n.getBooleanValue()); });
        deserializerMap.put("passcodeExpirationDays", (n) -> { this.setPasscodeExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passcodeMinimumCharacterSetCount", (n) -> { this.setPasscodeMinimumCharacterSetCount(n.getIntegerValue()); });
        deserializerMap.put("passcodeMinimumLength", (n) -> { this.setPasscodeMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passcodeMinutesOfInactivityBeforeLock", (n) -> { this.setPasscodeMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
        deserializerMap.put("passcodePreviousPasscodeBlockCount", (n) -> { this.setPasscodePreviousPasscodeBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passcodeRequired", (n) -> { this.setPasscodeRequired(n.getBooleanValue()); });
        deserializerMap.put("passcodeRequiredType", (n) -> { this.setPasscodeRequiredType(n.getEnumValue(RequiredPasswordType::forValue)); });
        deserializerMap.put("securityBlockJailbrokenDevices", (n) -> { this.setSecurityBlockJailbrokenDevices(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedEmailProfileRequired property value. Indicates whether or not to require a managed email profile.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getManagedEmailProfileRequired() {
        return this.backingStore.get("managedEmailProfileRequired");
    }
    /**
     * Gets the osMaximumVersion property value. Maximum IOS version.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsMaximumVersion() {
        return this.backingStore.get("osMaximumVersion");
    }
    /**
     * Gets the osMinimumVersion property value. Minimum IOS version.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsMinimumVersion() {
        return this.backingStore.get("osMinimumVersion");
    }
    /**
     * Gets the passcodeBlockSimple property value. Indicates whether or not to block simple passcodes.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPasscodeBlockSimple() {
        return this.backingStore.get("passcodeBlockSimple");
    }
    /**
     * Gets the passcodeExpirationDays property value. Number of days before the passcode expires. Valid values 1 to 65535
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeExpirationDays() {
        return this.backingStore.get("passcodeExpirationDays");
    }
    /**
     * Gets the passcodeMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeMinimumCharacterSetCount() {
        return this.backingStore.get("passcodeMinimumCharacterSetCount");
    }
    /**
     * Gets the passcodeMinimumLength property value. Minimum length of passcode. Valid values 4 to 14
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeMinimumLength() {
        return this.backingStore.get("passcodeMinimumLength");
    }
    /**
     * Gets the passcodeMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a passcode is required.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeMinutesOfInactivityBeforeLock() {
        return this.backingStore.get("passcodeMinutesOfInactivityBeforeLock");
    }
    /**
     * Gets the passcodePreviousPasscodeBlockCount property value. Number of previous passcodes to block. Valid values 1 to 24
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodePreviousPasscodeBlockCount() {
        return this.backingStore.get("passcodePreviousPasscodeBlockCount");
    }
    /**
     * Gets the passcodeRequired property value. Indicates whether or not to require a passcode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPasscodeRequired() {
        return this.backingStore.get("passcodeRequired");
    }
    /**
     * Gets the passcodeRequiredType property value. Possible values of required passwords.
     * @return a {@link RequiredPasswordType}
     */
    @jakarta.annotation.Nullable
    public RequiredPasswordType getPasscodeRequiredType() {
        return this.backingStore.get("passcodeRequiredType");
    }
    /**
     * Gets the securityBlockJailbrokenDevices property value. Indicates the device should not be jailbroken. When TRUE, if the device is detected as jailbroken it will be reported non-compliant. When FALSE, the device is not reported as non-compliant regardless of device jailbroken state. Default is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityBlockJailbrokenDevices() {
        return this.backingStore.get("securityBlockJailbrokenDevices");
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
        writer.writeBooleanValue("managedEmailProfileRequired", this.getManagedEmailProfileRequired());
        writer.writeStringValue("osMaximumVersion", this.getOsMaximumVersion());
        writer.writeStringValue("osMinimumVersion", this.getOsMinimumVersion());
        writer.writeBooleanValue("passcodeBlockSimple", this.getPasscodeBlockSimple());
        writer.writeIntegerValue("passcodeExpirationDays", this.getPasscodeExpirationDays());
        writer.writeIntegerValue("passcodeMinimumCharacterSetCount", this.getPasscodeMinimumCharacterSetCount());
        writer.writeIntegerValue("passcodeMinimumLength", this.getPasscodeMinimumLength());
        writer.writeIntegerValue("passcodeMinutesOfInactivityBeforeLock", this.getPasscodeMinutesOfInactivityBeforeLock());
        writer.writeIntegerValue("passcodePreviousPasscodeBlockCount", this.getPasscodePreviousPasscodeBlockCount());
        writer.writeBooleanValue("passcodeRequired", this.getPasscodeRequired());
        writer.writeEnumValue("passcodeRequiredType", this.getPasscodeRequiredType());
        writer.writeBooleanValue("securityBlockJailbrokenDevices", this.getSecurityBlockJailbrokenDevices());
    }
    /**
     * Sets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection .
     * @param value Value to set for the deviceThreatProtectionEnabled property.
     */
    public void setDeviceThreatProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("deviceThreatProtectionEnabled", value);
    }
    /**
     * Sets the deviceThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
     * @param value Value to set for the deviceThreatProtectionRequiredSecurityLevel property.
     */
    public void setDeviceThreatProtectionRequiredSecurityLevel(@jakarta.annotation.Nullable final DeviceThreatProtectionLevel value) {
        this.backingStore.set("deviceThreatProtectionRequiredSecurityLevel", value);
    }
    /**
     * Sets the managedEmailProfileRequired property value. Indicates whether or not to require a managed email profile.
     * @param value Value to set for the managedEmailProfileRequired property.
     */
    public void setManagedEmailProfileRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("managedEmailProfileRequired", value);
    }
    /**
     * Sets the osMaximumVersion property value. Maximum IOS version.
     * @param value Value to set for the osMaximumVersion property.
     */
    public void setOsMaximumVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osMaximumVersion", value);
    }
    /**
     * Sets the osMinimumVersion property value. Minimum IOS version.
     * @param value Value to set for the osMinimumVersion property.
     */
    public void setOsMinimumVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osMinimumVersion", value);
    }
    /**
     * Sets the passcodeBlockSimple property value. Indicates whether or not to block simple passcodes.
     * @param value Value to set for the passcodeBlockSimple property.
     */
    public void setPasscodeBlockSimple(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passcodeBlockSimple", value);
    }
    /**
     * Sets the passcodeExpirationDays property value. Number of days before the passcode expires. Valid values 1 to 65535
     * @param value Value to set for the passcodeExpirationDays property.
     */
    public void setPasscodeExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passcodeExpirationDays", value);
    }
    /**
     * Sets the passcodeMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @param value Value to set for the passcodeMinimumCharacterSetCount property.
     */
    public void setPasscodeMinimumCharacterSetCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passcodeMinimumCharacterSetCount", value);
    }
    /**
     * Sets the passcodeMinimumLength property value. Minimum length of passcode. Valid values 4 to 14
     * @param value Value to set for the passcodeMinimumLength property.
     */
    public void setPasscodeMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passcodeMinimumLength", value);
    }
    /**
     * Sets the passcodeMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a passcode is required.
     * @param value Value to set for the passcodeMinutesOfInactivityBeforeLock property.
     */
    public void setPasscodeMinutesOfInactivityBeforeLock(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passcodeMinutesOfInactivityBeforeLock", value);
    }
    /**
     * Sets the passcodePreviousPasscodeBlockCount property value. Number of previous passcodes to block. Valid values 1 to 24
     * @param value Value to set for the passcodePreviousPasscodeBlockCount property.
     */
    public void setPasscodePreviousPasscodeBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passcodePreviousPasscodeBlockCount", value);
    }
    /**
     * Sets the passcodeRequired property value. Indicates whether or not to require a passcode.
     * @param value Value to set for the passcodeRequired property.
     */
    public void setPasscodeRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passcodeRequired", value);
    }
    /**
     * Sets the passcodeRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passcodeRequiredType property.
     */
    public void setPasscodeRequiredType(@jakarta.annotation.Nullable final RequiredPasswordType value) {
        this.backingStore.set("passcodeRequiredType", value);
    }
    /**
     * Sets the securityBlockJailbrokenDevices property value. Indicates the device should not be jailbroken. When TRUE, if the device is detected as jailbroken it will be reported non-compliant. When FALSE, the device is not reported as non-compliant regardless of device jailbroken state. Default is FALSE.
     * @param value Value to set for the securityBlockJailbrokenDevices property.
     */
    public void setSecurityBlockJailbrokenDevices(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityBlockJailbrokenDevices", value);
    }
}
