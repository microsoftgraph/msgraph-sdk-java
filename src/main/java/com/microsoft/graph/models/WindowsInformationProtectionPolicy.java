package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsInformationProtectionPolicy extends WindowsInformationProtection implements Parsable {
    /** Offline interval before app data is wiped (days)  */
    private Integer _daysWithoutContactBeforeUnenroll;
    /** Enrollment url for the MDM  */
    private String _mdmEnrollmentUrl;
    /** Specifies the maximum amount of time (in minutes) allowed after the device is idle that will cause the device to become PIN or password locked.   Range is an integer X where 0 <= X <= 999.  */
    private Integer _minutesOfInactivityBeforeDeviceLock;
    /** Integer value that specifies the number of past PINs that can be associated to a user account that can't be reused. The largest number you can configure for this policy setting is 50. The lowest number you can configure for this policy setting is 0. If this policy is set to 0, then storage of previous PINs is not required. This node was added in Windows 10, version 1511. Default is 0.  */
    private Integer _numberOfPastPinsRemembered;
    /** The number of authentication failures allowed before the device will be wiped. A value of 0 disables device wipe functionality. Range is an integer X where 4 <= X <= 16 for desktop and 0 <= X <= 999 for mobile devices.  */
    private Integer _passwordMaximumAttemptCount;
    /** Integer value specifies the period of time (in days) that a PIN can be used before the system requires the user to change it. The largest number you can configure for this policy setting is 730. The lowest number you can configure for this policy setting is 0. If this policy is set to 0, then the user's PIN will never expire. This node was added in Windows 10, version 1511. Default is 0.  */
    private Integer _pinExpirationDays;
    /** Integer value that configures the use of lowercase letters in the Windows Hello for Business PIN. Default is NotAllow. Possible values are: notAllow, requireAtLeastOne, allow.  */
    private WindowsInformationProtectionPinCharacterRequirements _pinLowercaseLetters;
    /** Integer value that sets the minimum number of characters required for the PIN. Default value is 4. The lowest number you can configure for this policy setting is 4. The largest number you can configure must be less than the number configured in the Maximum PIN length policy setting or the number 127, whichever is the lowest.  */
    private Integer _pinMinimumLength;
    /** Integer value that configures the use of special characters in the Windows Hello for Business PIN. Valid special characters for Windows Hello for Business PIN gestures include: ! ' # $ % & ' ( )  + , - . / : ; < = > ? @ [ / ] ^  ` {  */
    private WindowsInformationProtectionPinCharacterRequirements _pinSpecialCharacters;
    /** Integer value that configures the use of uppercase letters in the Windows Hello for Business PIN. Default is NotAllow. Possible values are: notAllow, requireAtLeastOne, allow.  */
    private WindowsInformationProtectionPinCharacterRequirements _pinUppercaseLetters;
    /** New property in RS2, pending documentation  */
    private Boolean _revokeOnMdmHandoffDisabled;
    /** Boolean value that sets Windows Hello for Business as a method for signing into Windows.  */
    private Boolean _windowsHelloForBusinessBlocked;
    /**
     * Instantiates a new windowsInformationProtectionPolicy and sets the default values.
     * @return a void
     */
    public WindowsInformationProtectionPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsInformationProtectionPolicy
     */
    @javax.annotation.Nonnull
    public static WindowsInformationProtectionPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsInformationProtectionPolicy();
    }
    /**
     * Gets the daysWithoutContactBeforeUnenroll property value. Offline interval before app data is wiped (days)
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDaysWithoutContactBeforeUnenroll() {
        return this._daysWithoutContactBeforeUnenroll;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsInformationProtectionPolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("daysWithoutContactBeforeUnenroll", (n) -> { currentObject.setDaysWithoutContactBeforeUnenroll(n.getIntegerValue()); });
            this.put("mdmEnrollmentUrl", (n) -> { currentObject.setMdmEnrollmentUrl(n.getStringValue()); });
            this.put("minutesOfInactivityBeforeDeviceLock", (n) -> { currentObject.setMinutesOfInactivityBeforeDeviceLock(n.getIntegerValue()); });
            this.put("numberOfPastPinsRemembered", (n) -> { currentObject.setNumberOfPastPinsRemembered(n.getIntegerValue()); });
            this.put("passwordMaximumAttemptCount", (n) -> { currentObject.setPasswordMaximumAttemptCount(n.getIntegerValue()); });
            this.put("pinExpirationDays", (n) -> { currentObject.setPinExpirationDays(n.getIntegerValue()); });
            this.put("pinLowercaseLetters", (n) -> { currentObject.setPinLowercaseLetters(n.getEnumValue(WindowsInformationProtectionPinCharacterRequirements.class)); });
            this.put("pinMinimumLength", (n) -> { currentObject.setPinMinimumLength(n.getIntegerValue()); });
            this.put("pinSpecialCharacters", (n) -> { currentObject.setPinSpecialCharacters(n.getEnumValue(WindowsInformationProtectionPinCharacterRequirements.class)); });
            this.put("pinUppercaseLetters", (n) -> { currentObject.setPinUppercaseLetters(n.getEnumValue(WindowsInformationProtectionPinCharacterRequirements.class)); });
            this.put("revokeOnMdmHandoffDisabled", (n) -> { currentObject.setRevokeOnMdmHandoffDisabled(n.getBooleanValue()); });
            this.put("windowsHelloForBusinessBlocked", (n) -> { currentObject.setWindowsHelloForBusinessBlocked(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the mdmEnrollmentUrl property value. Enrollment url for the MDM
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMdmEnrollmentUrl() {
        return this._mdmEnrollmentUrl;
    }
    /**
     * Gets the minutesOfInactivityBeforeDeviceLock property value. Specifies the maximum amount of time (in minutes) allowed after the device is idle that will cause the device to become PIN or password locked.   Range is an integer X where 0 <= X <= 999.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinutesOfInactivityBeforeDeviceLock() {
        return this._minutesOfInactivityBeforeDeviceLock;
    }
    /**
     * Gets the numberOfPastPinsRemembered property value. Integer value that specifies the number of past PINs that can be associated to a user account that can't be reused. The largest number you can configure for this policy setting is 50. The lowest number you can configure for this policy setting is 0. If this policy is set to 0, then storage of previous PINs is not required. This node was added in Windows 10, version 1511. Default is 0.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfPastPinsRemembered() {
        return this._numberOfPastPinsRemembered;
    }
    /**
     * Gets the passwordMaximumAttemptCount property value. The number of authentication failures allowed before the device will be wiped. A value of 0 disables device wipe functionality. Range is an integer X where 4 <= X <= 16 for desktop and 0 <= X <= 999 for mobile devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMaximumAttemptCount() {
        return this._passwordMaximumAttemptCount;
    }
    /**
     * Gets the pinExpirationDays property value. Integer value specifies the period of time (in days) that a PIN can be used before the system requires the user to change it. The largest number you can configure for this policy setting is 730. The lowest number you can configure for this policy setting is 0. If this policy is set to 0, then the user's PIN will never expire. This node was added in Windows 10, version 1511. Default is 0.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPinExpirationDays() {
        return this._pinExpirationDays;
    }
    /**
     * Gets the pinLowercaseLetters property value. Integer value that configures the use of lowercase letters in the Windows Hello for Business PIN. Default is NotAllow. Possible values are: notAllow, requireAtLeastOne, allow.
     * @return a windowsInformationProtectionPinCharacterRequirements
     */
    @javax.annotation.Nullable
    public WindowsInformationProtectionPinCharacterRequirements getPinLowercaseLetters() {
        return this._pinLowercaseLetters;
    }
    /**
     * Gets the pinMinimumLength property value. Integer value that sets the minimum number of characters required for the PIN. Default value is 4. The lowest number you can configure for this policy setting is 4. The largest number you can configure must be less than the number configured in the Maximum PIN length policy setting or the number 127, whichever is the lowest.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPinMinimumLength() {
        return this._pinMinimumLength;
    }
    /**
     * Gets the pinSpecialCharacters property value. Integer value that configures the use of special characters in the Windows Hello for Business PIN. Valid special characters for Windows Hello for Business PIN gestures include: ! ' # $ % & ' ( )  + , - . / : ; < = > ? @ [ / ] ^  ` {
     * @return a windowsInformationProtectionPinCharacterRequirements
     */
    @javax.annotation.Nullable
    public WindowsInformationProtectionPinCharacterRequirements getPinSpecialCharacters() {
        return this._pinSpecialCharacters;
    }
    /**
     * Gets the pinUppercaseLetters property value. Integer value that configures the use of uppercase letters in the Windows Hello for Business PIN. Default is NotAllow. Possible values are: notAllow, requireAtLeastOne, allow.
     * @return a windowsInformationProtectionPinCharacterRequirements
     */
    @javax.annotation.Nullable
    public WindowsInformationProtectionPinCharacterRequirements getPinUppercaseLetters() {
        return this._pinUppercaseLetters;
    }
    /**
     * Gets the revokeOnMdmHandoffDisabled property value. New property in RS2, pending documentation
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRevokeOnMdmHandoffDisabled() {
        return this._revokeOnMdmHandoffDisabled;
    }
    /**
     * Gets the windowsHelloForBusinessBlocked property value. Boolean value that sets Windows Hello for Business as a method for signing into Windows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsHelloForBusinessBlocked() {
        return this._windowsHelloForBusinessBlocked;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("daysWithoutContactBeforeUnenroll", this.getDaysWithoutContactBeforeUnenroll());
        writer.writeStringValue("mdmEnrollmentUrl", this.getMdmEnrollmentUrl());
        writer.writeIntegerValue("minutesOfInactivityBeforeDeviceLock", this.getMinutesOfInactivityBeforeDeviceLock());
        writer.writeIntegerValue("numberOfPastPinsRemembered", this.getNumberOfPastPinsRemembered());
        writer.writeIntegerValue("passwordMaximumAttemptCount", this.getPasswordMaximumAttemptCount());
        writer.writeIntegerValue("pinExpirationDays", this.getPinExpirationDays());
        writer.writeEnumValue("pinLowercaseLetters", this.getPinLowercaseLetters());
        writer.writeIntegerValue("pinMinimumLength", this.getPinMinimumLength());
        writer.writeEnumValue("pinSpecialCharacters", this.getPinSpecialCharacters());
        writer.writeEnumValue("pinUppercaseLetters", this.getPinUppercaseLetters());
        writer.writeBooleanValue("revokeOnMdmHandoffDisabled", this.getRevokeOnMdmHandoffDisabled());
        writer.writeBooleanValue("windowsHelloForBusinessBlocked", this.getWindowsHelloForBusinessBlocked());
    }
    /**
     * Sets the daysWithoutContactBeforeUnenroll property value. Offline interval before app data is wiped (days)
     * @param value Value to set for the daysWithoutContactBeforeUnenroll property.
     * @return a void
     */
    public void setDaysWithoutContactBeforeUnenroll(@javax.annotation.Nullable final Integer value) {
        this._daysWithoutContactBeforeUnenroll = value;
    }
    /**
     * Sets the mdmEnrollmentUrl property value. Enrollment url for the MDM
     * @param value Value to set for the mdmEnrollmentUrl property.
     * @return a void
     */
    public void setMdmEnrollmentUrl(@javax.annotation.Nullable final String value) {
        this._mdmEnrollmentUrl = value;
    }
    /**
     * Sets the minutesOfInactivityBeforeDeviceLock property value. Specifies the maximum amount of time (in minutes) allowed after the device is idle that will cause the device to become PIN or password locked.   Range is an integer X where 0 <= X <= 999.
     * @param value Value to set for the minutesOfInactivityBeforeDeviceLock property.
     * @return a void
     */
    public void setMinutesOfInactivityBeforeDeviceLock(@javax.annotation.Nullable final Integer value) {
        this._minutesOfInactivityBeforeDeviceLock = value;
    }
    /**
     * Sets the numberOfPastPinsRemembered property value. Integer value that specifies the number of past PINs that can be associated to a user account that can't be reused. The largest number you can configure for this policy setting is 50. The lowest number you can configure for this policy setting is 0. If this policy is set to 0, then storage of previous PINs is not required. This node was added in Windows 10, version 1511. Default is 0.
     * @param value Value to set for the numberOfPastPinsRemembered property.
     * @return a void
     */
    public void setNumberOfPastPinsRemembered(@javax.annotation.Nullable final Integer value) {
        this._numberOfPastPinsRemembered = value;
    }
    /**
     * Sets the passwordMaximumAttemptCount property value. The number of authentication failures allowed before the device will be wiped. A value of 0 disables device wipe functionality. Range is an integer X where 4 <= X <= 16 for desktop and 0 <= X <= 999 for mobile devices.
     * @param value Value to set for the passwordMaximumAttemptCount property.
     * @return a void
     */
    public void setPasswordMaximumAttemptCount(@javax.annotation.Nullable final Integer value) {
        this._passwordMaximumAttemptCount = value;
    }
    /**
     * Sets the pinExpirationDays property value. Integer value specifies the period of time (in days) that a PIN can be used before the system requires the user to change it. The largest number you can configure for this policy setting is 730. The lowest number you can configure for this policy setting is 0. If this policy is set to 0, then the user's PIN will never expire. This node was added in Windows 10, version 1511. Default is 0.
     * @param value Value to set for the pinExpirationDays property.
     * @return a void
     */
    public void setPinExpirationDays(@javax.annotation.Nullable final Integer value) {
        this._pinExpirationDays = value;
    }
    /**
     * Sets the pinLowercaseLetters property value. Integer value that configures the use of lowercase letters in the Windows Hello for Business PIN. Default is NotAllow. Possible values are: notAllow, requireAtLeastOne, allow.
     * @param value Value to set for the pinLowercaseLetters property.
     * @return a void
     */
    public void setPinLowercaseLetters(@javax.annotation.Nullable final WindowsInformationProtectionPinCharacterRequirements value) {
        this._pinLowercaseLetters = value;
    }
    /**
     * Sets the pinMinimumLength property value. Integer value that sets the minimum number of characters required for the PIN. Default value is 4. The lowest number you can configure for this policy setting is 4. The largest number you can configure must be less than the number configured in the Maximum PIN length policy setting or the number 127, whichever is the lowest.
     * @param value Value to set for the pinMinimumLength property.
     * @return a void
     */
    public void setPinMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._pinMinimumLength = value;
    }
    /**
     * Sets the pinSpecialCharacters property value. Integer value that configures the use of special characters in the Windows Hello for Business PIN. Valid special characters for Windows Hello for Business PIN gestures include: ! ' # $ % & ' ( )  + , - . / : ; < = > ? @ [ / ] ^  ` {
     * @param value Value to set for the pinSpecialCharacters property.
     * @return a void
     */
    public void setPinSpecialCharacters(@javax.annotation.Nullable final WindowsInformationProtectionPinCharacterRequirements value) {
        this._pinSpecialCharacters = value;
    }
    /**
     * Sets the pinUppercaseLetters property value. Integer value that configures the use of uppercase letters in the Windows Hello for Business PIN. Default is NotAllow. Possible values are: notAllow, requireAtLeastOne, allow.
     * @param value Value to set for the pinUppercaseLetters property.
     * @return a void
     */
    public void setPinUppercaseLetters(@javax.annotation.Nullable final WindowsInformationProtectionPinCharacterRequirements value) {
        this._pinUppercaseLetters = value;
    }
    /**
     * Sets the revokeOnMdmHandoffDisabled property value. New property in RS2, pending documentation
     * @param value Value to set for the revokeOnMdmHandoffDisabled property.
     * @return a void
     */
    public void setRevokeOnMdmHandoffDisabled(@javax.annotation.Nullable final Boolean value) {
        this._revokeOnMdmHandoffDisabled = value;
    }
    /**
     * Sets the windowsHelloForBusinessBlocked property value. Boolean value that sets Windows Hello for Business as a method for signing into Windows.
     * @param value Value to set for the windowsHelloForBusinessBlocked property.
     * @return a void
     */
    public void setWindowsHelloForBusinessBlocked(@javax.annotation.Nullable final Boolean value) {
        this._windowsHelloForBusinessBlocked = value;
    }
}
