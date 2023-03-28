package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceEnrollmentWindowsHelloForBusinessConfiguration extends DeviceEnrollmentConfiguration implements Parsable {
    /** Possible values of a property */
    private Enablement enhancedBiometricsState;
    /** Controls the period of time (in days) that a PIN can be used before the system requires the user to change it. This must be set between 0 and 730, inclusive. If set to 0, the user's PIN will never expire */
    private Integer pinExpirationInDays;
    /** Windows Hello for Business pin usage options */
    private WindowsHelloForBusinessPinUsage pinLowercaseCharactersUsage;
    /** Controls the maximum number of characters allowed for the Windows Hello for Business PIN. This value must be between 4 and 127, inclusive. This value must be greater than or equal to the value set for the minimum PIN. */
    private Integer pinMaximumLength;
    /** Controls the minimum number of characters required for the Windows Hello for Business PIN.  This value must be between 4 and 127, inclusive, and less than or equal to the value set for the maximum PIN. */
    private Integer pinMinimumLength;
    /** Controls the ability to prevent users from using past PINs. This must be set between 0 and 50, inclusive, and the current PIN of the user is included in that count. If set to 0, previous PINs are not stored. PIN history is not preserved through a PIN reset. */
    private Integer pinPreviousBlockCount;
    /** Windows Hello for Business pin usage options */
    private WindowsHelloForBusinessPinUsage pinSpecialCharactersUsage;
    /** Windows Hello for Business pin usage options */
    private WindowsHelloForBusinessPinUsage pinUppercaseCharactersUsage;
    /** Controls the use of Remote Windows Hello for Business. Remote Windows Hello for Business provides the ability for a portable, registered device to be usable as a companion for desktop authentication. The desktop must be Azure AD joined and the companion device must have a Windows Hello for Business PIN. */
    private Boolean remotePassportEnabled;
    /** Controls whether to require a Trusted Platform Module (TPM) for provisioning Windows Hello for Business. A TPM provides an additional security benefit in that data stored on it cannot be used on other devices. If set to False, all devices can provision Windows Hello for Business even if there is not a usable TPM. */
    private Boolean securityDeviceRequired;
    /** Possible values of a property */
    private Enablement state;
    /** Controls the use of biometric gestures, such as face and fingerprint, as an alternative to the Windows Hello for Business PIN.  If set to False, biometric gestures are not allowed. Users must still configure a PIN as a backup in case of failures. */
    private Boolean unlockWithBiometricsEnabled;
    /**
     * Instantiates a new DeviceEnrollmentWindowsHelloForBusinessConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceEnrollmentWindowsHelloForBusinessConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.deviceEnrollmentWindowsHelloForBusinessConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceEnrollmentWindowsHelloForBusinessConfiguration
     */
    @javax.annotation.Nonnull
    public static DeviceEnrollmentWindowsHelloForBusinessConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceEnrollmentWindowsHelloForBusinessConfiguration();
    }
    /**
     * Gets the enhancedBiometricsState property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getEnhancedBiometricsState() {
        return this.enhancedBiometricsState;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enhancedBiometricsState", (n) -> { this.setEnhancedBiometricsState(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("pinExpirationInDays", (n) -> { this.setPinExpirationInDays(n.getIntegerValue()); });
        deserializerMap.put("pinLowercaseCharactersUsage", (n) -> { this.setPinLowercaseCharactersUsage(n.getEnumValue(WindowsHelloForBusinessPinUsage.class)); });
        deserializerMap.put("pinMaximumLength", (n) -> { this.setPinMaximumLength(n.getIntegerValue()); });
        deserializerMap.put("pinMinimumLength", (n) -> { this.setPinMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("pinPreviousBlockCount", (n) -> { this.setPinPreviousBlockCount(n.getIntegerValue()); });
        deserializerMap.put("pinSpecialCharactersUsage", (n) -> { this.setPinSpecialCharactersUsage(n.getEnumValue(WindowsHelloForBusinessPinUsage.class)); });
        deserializerMap.put("pinUppercaseCharactersUsage", (n) -> { this.setPinUppercaseCharactersUsage(n.getEnumValue(WindowsHelloForBusinessPinUsage.class)); });
        deserializerMap.put("remotePassportEnabled", (n) -> { this.setRemotePassportEnabled(n.getBooleanValue()); });
        deserializerMap.put("securityDeviceRequired", (n) -> { this.setSecurityDeviceRequired(n.getBooleanValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("unlockWithBiometricsEnabled", (n) -> { this.setUnlockWithBiometricsEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the pinExpirationInDays property value. Controls the period of time (in days) that a PIN can be used before the system requires the user to change it. This must be set between 0 and 730, inclusive. If set to 0, the user's PIN will never expire
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPinExpirationInDays() {
        return this.pinExpirationInDays;
    }
    /**
     * Gets the pinLowercaseCharactersUsage property value. Windows Hello for Business pin usage options
     * @return a windowsHelloForBusinessPinUsage
     */
    @javax.annotation.Nullable
    public WindowsHelloForBusinessPinUsage getPinLowercaseCharactersUsage() {
        return this.pinLowercaseCharactersUsage;
    }
    /**
     * Gets the pinMaximumLength property value. Controls the maximum number of characters allowed for the Windows Hello for Business PIN. This value must be between 4 and 127, inclusive. This value must be greater than or equal to the value set for the minimum PIN.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPinMaximumLength() {
        return this.pinMaximumLength;
    }
    /**
     * Gets the pinMinimumLength property value. Controls the minimum number of characters required for the Windows Hello for Business PIN.  This value must be between 4 and 127, inclusive, and less than or equal to the value set for the maximum PIN.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPinMinimumLength() {
        return this.pinMinimumLength;
    }
    /**
     * Gets the pinPreviousBlockCount property value. Controls the ability to prevent users from using past PINs. This must be set between 0 and 50, inclusive, and the current PIN of the user is included in that count. If set to 0, previous PINs are not stored. PIN history is not preserved through a PIN reset.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPinPreviousBlockCount() {
        return this.pinPreviousBlockCount;
    }
    /**
     * Gets the pinSpecialCharactersUsage property value. Windows Hello for Business pin usage options
     * @return a windowsHelloForBusinessPinUsage
     */
    @javax.annotation.Nullable
    public WindowsHelloForBusinessPinUsage getPinSpecialCharactersUsage() {
        return this.pinSpecialCharactersUsage;
    }
    /**
     * Gets the pinUppercaseCharactersUsage property value. Windows Hello for Business pin usage options
     * @return a windowsHelloForBusinessPinUsage
     */
    @javax.annotation.Nullable
    public WindowsHelloForBusinessPinUsage getPinUppercaseCharactersUsage() {
        return this.pinUppercaseCharactersUsage;
    }
    /**
     * Gets the remotePassportEnabled property value. Controls the use of Remote Windows Hello for Business. Remote Windows Hello for Business provides the ability for a portable, registered device to be usable as a companion for desktop authentication. The desktop must be Azure AD joined and the companion device must have a Windows Hello for Business PIN.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRemotePassportEnabled() {
        return this.remotePassportEnabled;
    }
    /**
     * Gets the securityDeviceRequired property value. Controls whether to require a Trusted Platform Module (TPM) for provisioning Windows Hello for Business. A TPM provides an additional security benefit in that data stored on it cannot be used on other devices. If set to False, all devices can provision Windows Hello for Business even if there is not a usable TPM.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityDeviceRequired() {
        return this.securityDeviceRequired;
    }
    /**
     * Gets the state property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getState() {
        return this.state;
    }
    /**
     * Gets the unlockWithBiometricsEnabled property value. Controls the use of biometric gestures, such as face and fingerprint, as an alternative to the Windows Hello for Business PIN.  If set to False, biometric gestures are not allowed. Users must still configure a PIN as a backup in case of failures.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUnlockWithBiometricsEnabled() {
        return this.unlockWithBiometricsEnabled;
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
        writer.writeEnumValue("enhancedBiometricsState", this.getEnhancedBiometricsState());
        writer.writeIntegerValue("pinExpirationInDays", this.getPinExpirationInDays());
        writer.writeEnumValue("pinLowercaseCharactersUsage", this.getPinLowercaseCharactersUsage());
        writer.writeIntegerValue("pinMaximumLength", this.getPinMaximumLength());
        writer.writeIntegerValue("pinMinimumLength", this.getPinMinimumLength());
        writer.writeIntegerValue("pinPreviousBlockCount", this.getPinPreviousBlockCount());
        writer.writeEnumValue("pinSpecialCharactersUsage", this.getPinSpecialCharactersUsage());
        writer.writeEnumValue("pinUppercaseCharactersUsage", this.getPinUppercaseCharactersUsage());
        writer.writeBooleanValue("remotePassportEnabled", this.getRemotePassportEnabled());
        writer.writeBooleanValue("securityDeviceRequired", this.getSecurityDeviceRequired());
        writer.writeEnumValue("state", this.getState());
        writer.writeBooleanValue("unlockWithBiometricsEnabled", this.getUnlockWithBiometricsEnabled());
    }
    /**
     * Sets the enhancedBiometricsState property value. Possible values of a property
     * @param value Value to set for the enhancedBiometricsState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnhancedBiometricsState(@javax.annotation.Nullable final Enablement value) {
        this.enhancedBiometricsState = value;
    }
    /**
     * Sets the pinExpirationInDays property value. Controls the period of time (in days) that a PIN can be used before the system requires the user to change it. This must be set between 0 and 730, inclusive. If set to 0, the user's PIN will never expire
     * @param value Value to set for the pinExpirationInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPinExpirationInDays(@javax.annotation.Nullable final Integer value) {
        this.pinExpirationInDays = value;
    }
    /**
     * Sets the pinLowercaseCharactersUsage property value. Windows Hello for Business pin usage options
     * @param value Value to set for the pinLowercaseCharactersUsage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPinLowercaseCharactersUsage(@javax.annotation.Nullable final WindowsHelloForBusinessPinUsage value) {
        this.pinLowercaseCharactersUsage = value;
    }
    /**
     * Sets the pinMaximumLength property value. Controls the maximum number of characters allowed for the Windows Hello for Business PIN. This value must be between 4 and 127, inclusive. This value must be greater than or equal to the value set for the minimum PIN.
     * @param value Value to set for the pinMaximumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPinMaximumLength(@javax.annotation.Nullable final Integer value) {
        this.pinMaximumLength = value;
    }
    /**
     * Sets the pinMinimumLength property value. Controls the minimum number of characters required for the Windows Hello for Business PIN.  This value must be between 4 and 127, inclusive, and less than or equal to the value set for the maximum PIN.
     * @param value Value to set for the pinMinimumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPinMinimumLength(@javax.annotation.Nullable final Integer value) {
        this.pinMinimumLength = value;
    }
    /**
     * Sets the pinPreviousBlockCount property value. Controls the ability to prevent users from using past PINs. This must be set between 0 and 50, inclusive, and the current PIN of the user is included in that count. If set to 0, previous PINs are not stored. PIN history is not preserved through a PIN reset.
     * @param value Value to set for the pinPreviousBlockCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPinPreviousBlockCount(@javax.annotation.Nullable final Integer value) {
        this.pinPreviousBlockCount = value;
    }
    /**
     * Sets the pinSpecialCharactersUsage property value. Windows Hello for Business pin usage options
     * @param value Value to set for the pinSpecialCharactersUsage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPinSpecialCharactersUsage(@javax.annotation.Nullable final WindowsHelloForBusinessPinUsage value) {
        this.pinSpecialCharactersUsage = value;
    }
    /**
     * Sets the pinUppercaseCharactersUsage property value. Windows Hello for Business pin usage options
     * @param value Value to set for the pinUppercaseCharactersUsage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPinUppercaseCharactersUsage(@javax.annotation.Nullable final WindowsHelloForBusinessPinUsage value) {
        this.pinUppercaseCharactersUsage = value;
    }
    /**
     * Sets the remotePassportEnabled property value. Controls the use of Remote Windows Hello for Business. Remote Windows Hello for Business provides the ability for a portable, registered device to be usable as a companion for desktop authentication. The desktop must be Azure AD joined and the companion device must have a Windows Hello for Business PIN.
     * @param value Value to set for the remotePassportEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemotePassportEnabled(@javax.annotation.Nullable final Boolean value) {
        this.remotePassportEnabled = value;
    }
    /**
     * Sets the securityDeviceRequired property value. Controls whether to require a Trusted Platform Module (TPM) for provisioning Windows Hello for Business. A TPM provides an additional security benefit in that data stored on it cannot be used on other devices. If set to False, all devices can provision Windows Hello for Business even if there is not a usable TPM.
     * @param value Value to set for the securityDeviceRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityDeviceRequired(@javax.annotation.Nullable final Boolean value) {
        this.securityDeviceRequired = value;
    }
    /**
     * Sets the state property value. Possible values of a property
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final Enablement value) {
        this.state = value;
    }
    /**
     * Sets the unlockWithBiometricsEnabled property value. Controls the use of biometric gestures, such as face and fingerprint, as an alternative to the Windows Hello for Business PIN.  If set to False, biometric gestures are not allowed. Users must still configure a PIN as a backup in case of failures.
     * @param value Value to set for the unlockWithBiometricsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnlockWithBiometricsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.unlockWithBiometricsEnabled = value;
    }
}
