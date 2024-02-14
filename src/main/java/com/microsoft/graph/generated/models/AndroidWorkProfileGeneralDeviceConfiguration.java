package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Android Work Profile general device configuration.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidWorkProfileGeneralDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link AndroidWorkProfileGeneralDeviceConfiguration} and sets the default values.
     */
    public AndroidWorkProfileGeneralDeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidWorkProfileGeneralDeviceConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AndroidWorkProfileGeneralDeviceConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static AndroidWorkProfileGeneralDeviceConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidWorkProfileGeneralDeviceConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("passwordBlockFingerprintUnlock", (n) -> { this.setPasswordBlockFingerprintUnlock(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockTrustAgents", (n) -> { this.setPasswordBlockTrustAgents(n.getBooleanValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { this.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { this.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordBlockCount", (n) -> { this.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(AndroidWorkProfileRequiredPasswordType::forValue)); });
        deserializerMap.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { this.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        deserializerMap.put("securityRequireVerifyApps", (n) -> { this.setSecurityRequireVerifyApps(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockAddingAccounts", (n) -> { this.setWorkProfileBlockAddingAccounts(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockCamera", (n) -> { this.setWorkProfileBlockCamera(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockCrossProfileCallerId", (n) -> { this.setWorkProfileBlockCrossProfileCallerId(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockCrossProfileContactsSearch", (n) -> { this.setWorkProfileBlockCrossProfileContactsSearch(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockCrossProfileCopyPaste", (n) -> { this.setWorkProfileBlockCrossProfileCopyPaste(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockNotificationsWhileDeviceLocked", (n) -> { this.setWorkProfileBlockNotificationsWhileDeviceLocked(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockScreenCapture", (n) -> { this.setWorkProfileBlockScreenCapture(n.getBooleanValue()); });
        deserializerMap.put("workProfileBluetoothEnableContactSharing", (n) -> { this.setWorkProfileBluetoothEnableContactSharing(n.getBooleanValue()); });
        deserializerMap.put("workProfileDataSharingType", (n) -> { this.setWorkProfileDataSharingType(n.getEnumValue(AndroidWorkProfileCrossProfileDataSharingType::forValue)); });
        deserializerMap.put("workProfileDefaultAppPermissionPolicy", (n) -> { this.setWorkProfileDefaultAppPermissionPolicy(n.getEnumValue(AndroidWorkProfileDefaultAppPermissionPolicyType::forValue)); });
        deserializerMap.put("workProfilePasswordBlockFingerprintUnlock", (n) -> { this.setWorkProfilePasswordBlockFingerprintUnlock(n.getBooleanValue()); });
        deserializerMap.put("workProfilePasswordBlockTrustAgents", (n) -> { this.setWorkProfilePasswordBlockTrustAgents(n.getBooleanValue()); });
        deserializerMap.put("workProfilePasswordExpirationDays", (n) -> { this.setWorkProfilePasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinimumLength", (n) -> { this.setWorkProfilePasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinLetterCharacters", (n) -> { this.setWorkProfilePasswordMinLetterCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinLowerCaseCharacters", (n) -> { this.setWorkProfilePasswordMinLowerCaseCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinNonLetterCharacters", (n) -> { this.setWorkProfilePasswordMinNonLetterCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinNumericCharacters", (n) -> { this.setWorkProfilePasswordMinNumericCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinSymbolCharacters", (n) -> { this.setWorkProfilePasswordMinSymbolCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinUpperCaseCharacters", (n) -> { this.setWorkProfilePasswordMinUpperCaseCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinutesOfInactivityBeforeScreenTimeout", (n) -> { this.setWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordPreviousPasswordBlockCount", (n) -> { this.setWorkProfilePasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordRequiredType", (n) -> { this.setWorkProfilePasswordRequiredType(n.getEnumValue(AndroidWorkProfileRequiredPasswordType::forValue)); });
        deserializerMap.put("workProfilePasswordSignInFailureCountBeforeFactoryReset", (n) -> { this.setWorkProfilePasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        deserializerMap.put("workProfileRequirePassword", (n) -> { this.setWorkProfileRequirePassword(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the passwordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockFingerprintUnlock() {
        return this.backingStore.get("passwordBlockFingerprintUnlock");
    }
    /**
     * Gets the passwordBlockTrustAgents property value. Indicates whether or not to block Smart Lock and other trust agents.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockTrustAgents() {
        return this.backingStore.get("passwordBlockTrustAgents");
    }
    /**
     * Gets the passwordExpirationDays property value. Number of days before the password expires. Valid values 1 to 365
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.backingStore.get("passwordExpirationDays");
    }
    /**
     * Gets the passwordMinimumLength property value. Minimum length of passwords. Valid values 4 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.backingStore.get("passwordMinimumLength");
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this.backingStore.get("passwordMinutesOfInactivityBeforeScreenTimeout");
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block. Valid values 0 to 24
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.backingStore.get("passwordPreviousPasswordBlockCount");
    }
    /**
     * Gets the passwordRequiredType property value. Android Work Profile required password type.
     * @return a {@link AndroidWorkProfileRequiredPasswordType}
     */
    @jakarta.annotation.Nullable
    public AndroidWorkProfileRequiredPasswordType getPasswordRequiredType() {
        return this.backingStore.get("passwordRequiredType");
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. Number of sign in failures allowed before factory reset. Valid values 1 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this.backingStore.get("passwordSignInFailureCountBeforeFactoryReset");
    }
    /**
     * Gets the securityRequireVerifyApps property value. Require the Android Verify apps feature is turned on.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityRequireVerifyApps() {
        return this.backingStore.get("securityRequireVerifyApps");
    }
    /**
     * Gets the workProfileBlockAddingAccounts property value. Block users from adding/removing accounts in work profile.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileBlockAddingAccounts() {
        return this.backingStore.get("workProfileBlockAddingAccounts");
    }
    /**
     * Gets the workProfileBlockCamera property value. Block work profile camera.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileBlockCamera() {
        return this.backingStore.get("workProfileBlockCamera");
    }
    /**
     * Gets the workProfileBlockCrossProfileCallerId property value. Block display work profile caller ID in personal profile.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileBlockCrossProfileCallerId() {
        return this.backingStore.get("workProfileBlockCrossProfileCallerId");
    }
    /**
     * Gets the workProfileBlockCrossProfileContactsSearch property value. Block work profile contacts availability in personal profile.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileBlockCrossProfileContactsSearch() {
        return this.backingStore.get("workProfileBlockCrossProfileContactsSearch");
    }
    /**
     * Gets the workProfileBlockCrossProfileCopyPaste property value. Boolean that indicates if the setting disallow cross profile copy/paste is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileBlockCrossProfileCopyPaste() {
        return this.backingStore.get("workProfileBlockCrossProfileCopyPaste");
    }
    /**
     * Gets the workProfileBlockNotificationsWhileDeviceLocked property value. Indicates whether or not to block notifications while device locked.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileBlockNotificationsWhileDeviceLocked() {
        return this.backingStore.get("workProfileBlockNotificationsWhileDeviceLocked");
    }
    /**
     * Gets the workProfileBlockScreenCapture property value. Block screen capture in work profile.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileBlockScreenCapture() {
        return this.backingStore.get("workProfileBlockScreenCapture");
    }
    /**
     * Gets the workProfileBluetoothEnableContactSharing property value. Allow bluetooth devices to access enterprise contacts.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileBluetoothEnableContactSharing() {
        return this.backingStore.get("workProfileBluetoothEnableContactSharing");
    }
    /**
     * Gets the workProfileDataSharingType property value. Android Work Profile cross profile data sharing type.
     * @return a {@link AndroidWorkProfileCrossProfileDataSharingType}
     */
    @jakarta.annotation.Nullable
    public AndroidWorkProfileCrossProfileDataSharingType getWorkProfileDataSharingType() {
        return this.backingStore.get("workProfileDataSharingType");
    }
    /**
     * Gets the workProfileDefaultAppPermissionPolicy property value. Android Work Profile default app permission policy type.
     * @return a {@link AndroidWorkProfileDefaultAppPermissionPolicyType}
     */
    @jakarta.annotation.Nullable
    public AndroidWorkProfileDefaultAppPermissionPolicyType getWorkProfileDefaultAppPermissionPolicy() {
        return this.backingStore.get("workProfileDefaultAppPermissionPolicy");
    }
    /**
     * Gets the workProfilePasswordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock for work profile.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfilePasswordBlockFingerprintUnlock() {
        return this.backingStore.get("workProfilePasswordBlockFingerprintUnlock");
    }
    /**
     * Gets the workProfilePasswordBlockTrustAgents property value. Indicates whether or not to block Smart Lock and other trust agents for work profile.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfilePasswordBlockTrustAgents() {
        return this.backingStore.get("workProfilePasswordBlockTrustAgents");
    }
    /**
     * Gets the workProfilePasswordExpirationDays property value. Number of days before the work profile password expires. Valid values 1 to 365
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordExpirationDays() {
        return this.backingStore.get("workProfilePasswordExpirationDays");
    }
    /**
     * Gets the workProfilePasswordMinimumLength property value. Minimum length of work profile password. Valid values 4 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumLength() {
        return this.backingStore.get("workProfilePasswordMinimumLength");
    }
    /**
     * Gets the workProfilePasswordMinLetterCharacters property value. Minimum # of letter characters required in work profile password. Valid values 1 to 10
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinLetterCharacters() {
        return this.backingStore.get("workProfilePasswordMinLetterCharacters");
    }
    /**
     * Gets the workProfilePasswordMinLowerCaseCharacters property value. Minimum # of lower-case characters required in work profile password. Valid values 1 to 10
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinLowerCaseCharacters() {
        return this.backingStore.get("workProfilePasswordMinLowerCaseCharacters");
    }
    /**
     * Gets the workProfilePasswordMinNonLetterCharacters property value. Minimum # of non-letter characters required in work profile password. Valid values 1 to 10
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinNonLetterCharacters() {
        return this.backingStore.get("workProfilePasswordMinNonLetterCharacters");
    }
    /**
     * Gets the workProfilePasswordMinNumericCharacters property value. Minimum # of numeric characters required in work profile password. Valid values 1 to 10
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinNumericCharacters() {
        return this.backingStore.get("workProfilePasswordMinNumericCharacters");
    }
    /**
     * Gets the workProfilePasswordMinSymbolCharacters property value. Minimum # of symbols required in work profile password. Valid values 1 to 10
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinSymbolCharacters() {
        return this.backingStore.get("workProfilePasswordMinSymbolCharacters");
    }
    /**
     * Gets the workProfilePasswordMinUpperCaseCharacters property value. Minimum # of upper-case characters required in work profile password. Valid values 1 to 10
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinUpperCaseCharacters() {
        return this.backingStore.get("workProfilePasswordMinUpperCaseCharacters");
    }
    /**
     * Gets the workProfilePasswordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this.backingStore.get("workProfilePasswordMinutesOfInactivityBeforeScreenTimeout");
    }
    /**
     * Gets the workProfilePasswordPreviousPasswordBlockCount property value. Number of previous work profile passwords to block. Valid values 0 to 24
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordPreviousPasswordBlockCount() {
        return this.backingStore.get("workProfilePasswordPreviousPasswordBlockCount");
    }
    /**
     * Gets the workProfilePasswordRequiredType property value. Android Work Profile required password type.
     * @return a {@link AndroidWorkProfileRequiredPasswordType}
     */
    @jakarta.annotation.Nullable
    public AndroidWorkProfileRequiredPasswordType getWorkProfilePasswordRequiredType() {
        return this.backingStore.get("workProfilePasswordRequiredType");
    }
    /**
     * Gets the workProfilePasswordSignInFailureCountBeforeFactoryReset property value. Number of sign in failures allowed before work profile is removed and all corporate data deleted. Valid values 1 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordSignInFailureCountBeforeFactoryReset() {
        return this.backingStore.get("workProfilePasswordSignInFailureCountBeforeFactoryReset");
    }
    /**
     * Gets the workProfileRequirePassword property value. Password is required or not for work profile
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWorkProfileRequirePassword() {
        return this.backingStore.get("workProfileRequirePassword");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("passwordBlockFingerprintUnlock", this.getPasswordBlockFingerprintUnlock());
        writer.writeBooleanValue("passwordBlockTrustAgents", this.getPasswordBlockTrustAgents());
        writer.writeIntegerValue("passwordExpirationDays", this.getPasswordExpirationDays());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeScreenTimeout", this.getPasswordMinutesOfInactivityBeforeScreenTimeout());
        writer.writeIntegerValue("passwordPreviousPasswordBlockCount", this.getPasswordPreviousPasswordBlockCount());
        writer.writeEnumValue("passwordRequiredType", this.getPasswordRequiredType());
        writer.writeIntegerValue("passwordSignInFailureCountBeforeFactoryReset", this.getPasswordSignInFailureCountBeforeFactoryReset());
        writer.writeBooleanValue("securityRequireVerifyApps", this.getSecurityRequireVerifyApps());
        writer.writeBooleanValue("workProfileBlockAddingAccounts", this.getWorkProfileBlockAddingAccounts());
        writer.writeBooleanValue("workProfileBlockCamera", this.getWorkProfileBlockCamera());
        writer.writeBooleanValue("workProfileBlockCrossProfileCallerId", this.getWorkProfileBlockCrossProfileCallerId());
        writer.writeBooleanValue("workProfileBlockCrossProfileContactsSearch", this.getWorkProfileBlockCrossProfileContactsSearch());
        writer.writeBooleanValue("workProfileBlockCrossProfileCopyPaste", this.getWorkProfileBlockCrossProfileCopyPaste());
        writer.writeBooleanValue("workProfileBlockNotificationsWhileDeviceLocked", this.getWorkProfileBlockNotificationsWhileDeviceLocked());
        writer.writeBooleanValue("workProfileBlockScreenCapture", this.getWorkProfileBlockScreenCapture());
        writer.writeBooleanValue("workProfileBluetoothEnableContactSharing", this.getWorkProfileBluetoothEnableContactSharing());
        writer.writeEnumValue("workProfileDataSharingType", this.getWorkProfileDataSharingType());
        writer.writeEnumValue("workProfileDefaultAppPermissionPolicy", this.getWorkProfileDefaultAppPermissionPolicy());
        writer.writeBooleanValue("workProfilePasswordBlockFingerprintUnlock", this.getWorkProfilePasswordBlockFingerprintUnlock());
        writer.writeBooleanValue("workProfilePasswordBlockTrustAgents", this.getWorkProfilePasswordBlockTrustAgents());
        writer.writeIntegerValue("workProfilePasswordExpirationDays", this.getWorkProfilePasswordExpirationDays());
        writer.writeIntegerValue("workProfilePasswordMinimumLength", this.getWorkProfilePasswordMinimumLength());
        writer.writeIntegerValue("workProfilePasswordMinLetterCharacters", this.getWorkProfilePasswordMinLetterCharacters());
        writer.writeIntegerValue("workProfilePasswordMinLowerCaseCharacters", this.getWorkProfilePasswordMinLowerCaseCharacters());
        writer.writeIntegerValue("workProfilePasswordMinNonLetterCharacters", this.getWorkProfilePasswordMinNonLetterCharacters());
        writer.writeIntegerValue("workProfilePasswordMinNumericCharacters", this.getWorkProfilePasswordMinNumericCharacters());
        writer.writeIntegerValue("workProfilePasswordMinSymbolCharacters", this.getWorkProfilePasswordMinSymbolCharacters());
        writer.writeIntegerValue("workProfilePasswordMinUpperCaseCharacters", this.getWorkProfilePasswordMinUpperCaseCharacters());
        writer.writeIntegerValue("workProfilePasswordMinutesOfInactivityBeforeScreenTimeout", this.getWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeout());
        writer.writeIntegerValue("workProfilePasswordPreviousPasswordBlockCount", this.getWorkProfilePasswordPreviousPasswordBlockCount());
        writer.writeEnumValue("workProfilePasswordRequiredType", this.getWorkProfilePasswordRequiredType());
        writer.writeIntegerValue("workProfilePasswordSignInFailureCountBeforeFactoryReset", this.getWorkProfilePasswordSignInFailureCountBeforeFactoryReset());
        writer.writeBooleanValue("workProfileRequirePassword", this.getWorkProfileRequirePassword());
    }
    /**
     * Sets the passwordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @param value Value to set for the passwordBlockFingerprintUnlock property.
     */
    public void setPasswordBlockFingerprintUnlock(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordBlockFingerprintUnlock", value);
    }
    /**
     * Sets the passwordBlockTrustAgents property value. Indicates whether or not to block Smart Lock and other trust agents.
     * @param value Value to set for the passwordBlockTrustAgents property.
     */
    public void setPasswordBlockTrustAgents(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordBlockTrustAgents", value);
    }
    /**
     * Sets the passwordExpirationDays property value. Number of days before the password expires. Valid values 1 to 365
     * @param value Value to set for the passwordExpirationDays property.
     */
    public void setPasswordExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordExpirationDays", value);
    }
    /**
     * Sets the passwordMinimumLength property value. Minimum length of passwords. Valid values 4 to 16
     * @param value Value to set for the passwordMinimumLength property.
     */
    public void setPasswordMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinimumLength", value);
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     */
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinutesOfInactivityBeforeScreenTimeout", value);
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block. Valid values 0 to 24
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     */
    public void setPasswordPreviousPasswordBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordPreviousPasswordBlockCount", value);
    }
    /**
     * Sets the passwordRequiredType property value. Android Work Profile required password type.
     * @param value Value to set for the passwordRequiredType property.
     */
    public void setPasswordRequiredType(@jakarta.annotation.Nullable final AndroidWorkProfileRequiredPasswordType value) {
        this.backingStore.set("passwordRequiredType", value);
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. Number of sign in failures allowed before factory reset. Valid values 1 to 16
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     */
    public void setPasswordSignInFailureCountBeforeFactoryReset(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordSignInFailureCountBeforeFactoryReset", value);
    }
    /**
     * Sets the securityRequireVerifyApps property value. Require the Android Verify apps feature is turned on.
     * @param value Value to set for the securityRequireVerifyApps property.
     */
    public void setSecurityRequireVerifyApps(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityRequireVerifyApps", value);
    }
    /**
     * Sets the workProfileBlockAddingAccounts property value. Block users from adding/removing accounts in work profile.
     * @param value Value to set for the workProfileBlockAddingAccounts property.
     */
    public void setWorkProfileBlockAddingAccounts(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("workProfileBlockAddingAccounts", value);
    }
    /**
     * Sets the workProfileBlockCamera property value. Block work profile camera.
     * @param value Value to set for the workProfileBlockCamera property.
     */
    public void setWorkProfileBlockCamera(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("workProfileBlockCamera", value);
    }
    /**
     * Sets the workProfileBlockCrossProfileCallerId property value. Block display work profile caller ID in personal profile.
     * @param value Value to set for the workProfileBlockCrossProfileCallerId property.
     */
    public void setWorkProfileBlockCrossProfileCallerId(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("workProfileBlockCrossProfileCallerId", value);
    }
    /**
     * Sets the workProfileBlockCrossProfileContactsSearch property value. Block work profile contacts availability in personal profile.
     * @param value Value to set for the workProfileBlockCrossProfileContactsSearch property.
     */
    public void setWorkProfileBlockCrossProfileContactsSearch(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("workProfileBlockCrossProfileContactsSearch", value);
    }
    /**
     * Sets the workProfileBlockCrossProfileCopyPaste property value. Boolean that indicates if the setting disallow cross profile copy/paste is enabled.
     * @param value Value to set for the workProfileBlockCrossProfileCopyPaste property.
     */
    public void setWorkProfileBlockCrossProfileCopyPaste(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("workProfileBlockCrossProfileCopyPaste", value);
    }
    /**
     * Sets the workProfileBlockNotificationsWhileDeviceLocked property value. Indicates whether or not to block notifications while device locked.
     * @param value Value to set for the workProfileBlockNotificationsWhileDeviceLocked property.
     */
    public void setWorkProfileBlockNotificationsWhileDeviceLocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("workProfileBlockNotificationsWhileDeviceLocked", value);
    }
    /**
     * Sets the workProfileBlockScreenCapture property value. Block screen capture in work profile.
     * @param value Value to set for the workProfileBlockScreenCapture property.
     */
    public void setWorkProfileBlockScreenCapture(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("workProfileBlockScreenCapture", value);
    }
    /**
     * Sets the workProfileBluetoothEnableContactSharing property value. Allow bluetooth devices to access enterprise contacts.
     * @param value Value to set for the workProfileBluetoothEnableContactSharing property.
     */
    public void setWorkProfileBluetoothEnableContactSharing(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("workProfileBluetoothEnableContactSharing", value);
    }
    /**
     * Sets the workProfileDataSharingType property value. Android Work Profile cross profile data sharing type.
     * @param value Value to set for the workProfileDataSharingType property.
     */
    public void setWorkProfileDataSharingType(@jakarta.annotation.Nullable final AndroidWorkProfileCrossProfileDataSharingType value) {
        this.backingStore.set("workProfileDataSharingType", value);
    }
    /**
     * Sets the workProfileDefaultAppPermissionPolicy property value. Android Work Profile default app permission policy type.
     * @param value Value to set for the workProfileDefaultAppPermissionPolicy property.
     */
    public void setWorkProfileDefaultAppPermissionPolicy(@jakarta.annotation.Nullable final AndroidWorkProfileDefaultAppPermissionPolicyType value) {
        this.backingStore.set("workProfileDefaultAppPermissionPolicy", value);
    }
    /**
     * Sets the workProfilePasswordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock for work profile.
     * @param value Value to set for the workProfilePasswordBlockFingerprintUnlock property.
     */
    public void setWorkProfilePasswordBlockFingerprintUnlock(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("workProfilePasswordBlockFingerprintUnlock", value);
    }
    /**
     * Sets the workProfilePasswordBlockTrustAgents property value. Indicates whether or not to block Smart Lock and other trust agents for work profile.
     * @param value Value to set for the workProfilePasswordBlockTrustAgents property.
     */
    public void setWorkProfilePasswordBlockTrustAgents(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("workProfilePasswordBlockTrustAgents", value);
    }
    /**
     * Sets the workProfilePasswordExpirationDays property value. Number of days before the work profile password expires. Valid values 1 to 365
     * @param value Value to set for the workProfilePasswordExpirationDays property.
     */
    public void setWorkProfilePasswordExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordExpirationDays", value);
    }
    /**
     * Sets the workProfilePasswordMinimumLength property value. Minimum length of work profile password. Valid values 4 to 16
     * @param value Value to set for the workProfilePasswordMinimumLength property.
     */
    public void setWorkProfilePasswordMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordMinimumLength", value);
    }
    /**
     * Sets the workProfilePasswordMinLetterCharacters property value. Minimum # of letter characters required in work profile password. Valid values 1 to 10
     * @param value Value to set for the workProfilePasswordMinLetterCharacters property.
     */
    public void setWorkProfilePasswordMinLetterCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordMinLetterCharacters", value);
    }
    /**
     * Sets the workProfilePasswordMinLowerCaseCharacters property value. Minimum # of lower-case characters required in work profile password. Valid values 1 to 10
     * @param value Value to set for the workProfilePasswordMinLowerCaseCharacters property.
     */
    public void setWorkProfilePasswordMinLowerCaseCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordMinLowerCaseCharacters", value);
    }
    /**
     * Sets the workProfilePasswordMinNonLetterCharacters property value. Minimum # of non-letter characters required in work profile password. Valid values 1 to 10
     * @param value Value to set for the workProfilePasswordMinNonLetterCharacters property.
     */
    public void setWorkProfilePasswordMinNonLetterCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordMinNonLetterCharacters", value);
    }
    /**
     * Sets the workProfilePasswordMinNumericCharacters property value. Minimum # of numeric characters required in work profile password. Valid values 1 to 10
     * @param value Value to set for the workProfilePasswordMinNumericCharacters property.
     */
    public void setWorkProfilePasswordMinNumericCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordMinNumericCharacters", value);
    }
    /**
     * Sets the workProfilePasswordMinSymbolCharacters property value. Minimum # of symbols required in work profile password. Valid values 1 to 10
     * @param value Value to set for the workProfilePasswordMinSymbolCharacters property.
     */
    public void setWorkProfilePasswordMinSymbolCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordMinSymbolCharacters", value);
    }
    /**
     * Sets the workProfilePasswordMinUpperCaseCharacters property value. Minimum # of upper-case characters required in work profile password. Valid values 1 to 10
     * @param value Value to set for the workProfilePasswordMinUpperCaseCharacters property.
     */
    public void setWorkProfilePasswordMinUpperCaseCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordMinUpperCaseCharacters", value);
    }
    /**
     * Sets the workProfilePasswordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @param value Value to set for the workProfilePasswordMinutesOfInactivityBeforeScreenTimeout property.
     */
    public void setWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordMinutesOfInactivityBeforeScreenTimeout", value);
    }
    /**
     * Sets the workProfilePasswordPreviousPasswordBlockCount property value. Number of previous work profile passwords to block. Valid values 0 to 24
     * @param value Value to set for the workProfilePasswordPreviousPasswordBlockCount property.
     */
    public void setWorkProfilePasswordPreviousPasswordBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordPreviousPasswordBlockCount", value);
    }
    /**
     * Sets the workProfilePasswordRequiredType property value. Android Work Profile required password type.
     * @param value Value to set for the workProfilePasswordRequiredType property.
     */
    public void setWorkProfilePasswordRequiredType(@jakarta.annotation.Nullable final AndroidWorkProfileRequiredPasswordType value) {
        this.backingStore.set("workProfilePasswordRequiredType", value);
    }
    /**
     * Sets the workProfilePasswordSignInFailureCountBeforeFactoryReset property value. Number of sign in failures allowed before work profile is removed and all corporate data deleted. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordSignInFailureCountBeforeFactoryReset property.
     */
    public void setWorkProfilePasswordSignInFailureCountBeforeFactoryReset(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordSignInFailureCountBeforeFactoryReset", value);
    }
    /**
     * Sets the workProfileRequirePassword property value. Password is required or not for work profile
     * @param value Value to set for the workProfileRequirePassword property.
     */
    public void setWorkProfileRequirePassword(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("workProfileRequirePassword", value);
    }
}
