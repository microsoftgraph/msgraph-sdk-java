package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidWorkProfileGeneralDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /** Indicates whether or not to block fingerprint unlock. */
    private Boolean _passwordBlockFingerprintUnlock;
    /** Indicates whether or not to block Smart Lock and other trust agents. */
    private Boolean _passwordBlockTrustAgents;
    /** Number of days before the password expires. Valid values 1 to 365 */
    private Integer _passwordExpirationDays;
    /** Minimum length of passwords. Valid values 4 to 16 */
    private Integer _passwordMinimumLength;
    /** Minutes of inactivity before the screen times out. */
    private Integer _passwordMinutesOfInactivityBeforeScreenTimeout;
    /** Number of previous passwords to block. Valid values 0 to 24 */
    private Integer _passwordPreviousPasswordBlockCount;
    /** Android Work Profile required password type. */
    private AndroidWorkProfileRequiredPasswordType _passwordRequiredType;
    /** Number of sign in failures allowed before factory reset. Valid values 1 to 16 */
    private Integer _passwordSignInFailureCountBeforeFactoryReset;
    /** Require the Android Verify apps feature is turned on. */
    private Boolean _securityRequireVerifyApps;
    /** Block users from adding/removing accounts in work profile. */
    private Boolean _workProfileBlockAddingAccounts;
    /** Block work profile camera. */
    private Boolean _workProfileBlockCamera;
    /** Block display work profile caller ID in personal profile. */
    private Boolean _workProfileBlockCrossProfileCallerId;
    /** Block work profile contacts availability in personal profile. */
    private Boolean _workProfileBlockCrossProfileContactsSearch;
    /** Boolean that indicates if the setting disallow cross profile copy/paste is enabled. */
    private Boolean _workProfileBlockCrossProfileCopyPaste;
    /** Indicates whether or not to block notifications while device locked. */
    private Boolean _workProfileBlockNotificationsWhileDeviceLocked;
    /** Block screen capture in work profile. */
    private Boolean _workProfileBlockScreenCapture;
    /** Allow bluetooth devices to access enterprise contacts. */
    private Boolean _workProfileBluetoothEnableContactSharing;
    /** Android Work Profile cross profile data sharing type. */
    private AndroidWorkProfileCrossProfileDataSharingType _workProfileDataSharingType;
    /** Android Work Profile default app permission policy type. */
    private AndroidWorkProfileDefaultAppPermissionPolicyType _workProfileDefaultAppPermissionPolicy;
    /** Indicates whether or not to block fingerprint unlock for work profile. */
    private Boolean _workProfilePasswordBlockFingerprintUnlock;
    /** Indicates whether or not to block Smart Lock and other trust agents for work profile. */
    private Boolean _workProfilePasswordBlockTrustAgents;
    /** Number of days before the work profile password expires. Valid values 1 to 365 */
    private Integer _workProfilePasswordExpirationDays;
    /** Minimum length of work profile password. Valid values 4 to 16 */
    private Integer _workProfilePasswordMinimumLength;
    /** Minimum # of letter characters required in work profile password. Valid values 1 to 10 */
    private Integer _workProfilePasswordMinLetterCharacters;
    /** Minimum # of lower-case characters required in work profile password. Valid values 1 to 10 */
    private Integer _workProfilePasswordMinLowerCaseCharacters;
    /** Minimum # of non-letter characters required in work profile password. Valid values 1 to 10 */
    private Integer _workProfilePasswordMinNonLetterCharacters;
    /** Minimum # of numeric characters required in work profile password. Valid values 1 to 10 */
    private Integer _workProfilePasswordMinNumericCharacters;
    /** Minimum # of symbols required in work profile password. Valid values 1 to 10 */
    private Integer _workProfilePasswordMinSymbolCharacters;
    /** Minimum # of upper-case characters required in work profile password. Valid values 1 to 10 */
    private Integer _workProfilePasswordMinUpperCaseCharacters;
    /** Minutes of inactivity before the screen times out. */
    private Integer _workProfilePasswordMinutesOfInactivityBeforeScreenTimeout;
    /** Number of previous work profile passwords to block. Valid values 0 to 24 */
    private Integer _workProfilePasswordPreviousPasswordBlockCount;
    /** Android Work Profile required password type. */
    private AndroidWorkProfileRequiredPasswordType _workProfilePasswordRequiredType;
    /** Number of sign in failures allowed before work profile is removed and all corporate data deleted. Valid values 1 to 16 */
    private Integer _workProfilePasswordSignInFailureCountBeforeFactoryReset;
    /** Password is required or not for work profile */
    private Boolean _workProfileRequirePassword;
    /**
     * Instantiates a new AndroidWorkProfileGeneralDeviceConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidWorkProfileGeneralDeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidWorkProfileGeneralDeviceConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidWorkProfileGeneralDeviceConfiguration
     */
    @javax.annotation.Nonnull
    public static AndroidWorkProfileGeneralDeviceConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidWorkProfileGeneralDeviceConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidWorkProfileGeneralDeviceConfiguration currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("passwordBlockFingerprintUnlock", (n) -> { currentObject.setPasswordBlockFingerprintUnlock(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockTrustAgents", (n) -> { currentObject.setPasswordBlockTrustAgents(n.getBooleanValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { currentObject.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { currentObject.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { currentObject.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordBlockCount", (n) -> { currentObject.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { currentObject.setPasswordRequiredType(n.getEnumValue(AndroidWorkProfileRequiredPasswordType.class)); });
        deserializerMap.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { currentObject.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        deserializerMap.put("securityRequireVerifyApps", (n) -> { currentObject.setSecurityRequireVerifyApps(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockAddingAccounts", (n) -> { currentObject.setWorkProfileBlockAddingAccounts(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockCamera", (n) -> { currentObject.setWorkProfileBlockCamera(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockCrossProfileCallerId", (n) -> { currentObject.setWorkProfileBlockCrossProfileCallerId(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockCrossProfileContactsSearch", (n) -> { currentObject.setWorkProfileBlockCrossProfileContactsSearch(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockCrossProfileCopyPaste", (n) -> { currentObject.setWorkProfileBlockCrossProfileCopyPaste(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockNotificationsWhileDeviceLocked", (n) -> { currentObject.setWorkProfileBlockNotificationsWhileDeviceLocked(n.getBooleanValue()); });
        deserializerMap.put("workProfileBlockScreenCapture", (n) -> { currentObject.setWorkProfileBlockScreenCapture(n.getBooleanValue()); });
        deserializerMap.put("workProfileBluetoothEnableContactSharing", (n) -> { currentObject.setWorkProfileBluetoothEnableContactSharing(n.getBooleanValue()); });
        deserializerMap.put("workProfileDataSharingType", (n) -> { currentObject.setWorkProfileDataSharingType(n.getEnumValue(AndroidWorkProfileCrossProfileDataSharingType.class)); });
        deserializerMap.put("workProfileDefaultAppPermissionPolicy", (n) -> { currentObject.setWorkProfileDefaultAppPermissionPolicy(n.getEnumValue(AndroidWorkProfileDefaultAppPermissionPolicyType.class)); });
        deserializerMap.put("workProfilePasswordBlockFingerprintUnlock", (n) -> { currentObject.setWorkProfilePasswordBlockFingerprintUnlock(n.getBooleanValue()); });
        deserializerMap.put("workProfilePasswordBlockTrustAgents", (n) -> { currentObject.setWorkProfilePasswordBlockTrustAgents(n.getBooleanValue()); });
        deserializerMap.put("workProfilePasswordExpirationDays", (n) -> { currentObject.setWorkProfilePasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinimumLength", (n) -> { currentObject.setWorkProfilePasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinLetterCharacters", (n) -> { currentObject.setWorkProfilePasswordMinLetterCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinLowerCaseCharacters", (n) -> { currentObject.setWorkProfilePasswordMinLowerCaseCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinNonLetterCharacters", (n) -> { currentObject.setWorkProfilePasswordMinNonLetterCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinNumericCharacters", (n) -> { currentObject.setWorkProfilePasswordMinNumericCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinSymbolCharacters", (n) -> { currentObject.setWorkProfilePasswordMinSymbolCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinUpperCaseCharacters", (n) -> { currentObject.setWorkProfilePasswordMinUpperCaseCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinutesOfInactivityBeforeScreenTimeout", (n) -> { currentObject.setWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordPreviousPasswordBlockCount", (n) -> { currentObject.setWorkProfilePasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordRequiredType", (n) -> { currentObject.setWorkProfilePasswordRequiredType(n.getEnumValue(AndroidWorkProfileRequiredPasswordType.class)); });
        deserializerMap.put("workProfilePasswordSignInFailureCountBeforeFactoryReset", (n) -> { currentObject.setWorkProfilePasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        deserializerMap.put("workProfileRequirePassword", (n) -> { currentObject.setWorkProfileRequirePassword(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the passwordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockFingerprintUnlock() {
        return this._passwordBlockFingerprintUnlock;
    }
    /**
     * Gets the passwordBlockTrustAgents property value. Indicates whether or not to block Smart Lock and other trust agents.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockTrustAgents() {
        return this._passwordBlockTrustAgents;
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
     * Gets the passwordMinimumLength property value. Minimum length of passwords. Valid values 4 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this._passwordMinimumLength;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this._passwordMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block. Valid values 0 to 24
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this._passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequiredType property value. Android Work Profile required password type.
     * @return a androidWorkProfileRequiredPasswordType
     */
    @javax.annotation.Nullable
    public AndroidWorkProfileRequiredPasswordType getPasswordRequiredType() {
        return this._passwordRequiredType;
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. Number of sign in failures allowed before factory reset. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this._passwordSignInFailureCountBeforeFactoryReset;
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
     * Gets the workProfileBlockAddingAccounts property value. Block users from adding/removing accounts in work profile.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWorkProfileBlockAddingAccounts() {
        return this._workProfileBlockAddingAccounts;
    }
    /**
     * Gets the workProfileBlockCamera property value. Block work profile camera.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWorkProfileBlockCamera() {
        return this._workProfileBlockCamera;
    }
    /**
     * Gets the workProfileBlockCrossProfileCallerId property value. Block display work profile caller ID in personal profile.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWorkProfileBlockCrossProfileCallerId() {
        return this._workProfileBlockCrossProfileCallerId;
    }
    /**
     * Gets the workProfileBlockCrossProfileContactsSearch property value. Block work profile contacts availability in personal profile.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWorkProfileBlockCrossProfileContactsSearch() {
        return this._workProfileBlockCrossProfileContactsSearch;
    }
    /**
     * Gets the workProfileBlockCrossProfileCopyPaste property value. Boolean that indicates if the setting disallow cross profile copy/paste is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWorkProfileBlockCrossProfileCopyPaste() {
        return this._workProfileBlockCrossProfileCopyPaste;
    }
    /**
     * Gets the workProfileBlockNotificationsWhileDeviceLocked property value. Indicates whether or not to block notifications while device locked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWorkProfileBlockNotificationsWhileDeviceLocked() {
        return this._workProfileBlockNotificationsWhileDeviceLocked;
    }
    /**
     * Gets the workProfileBlockScreenCapture property value. Block screen capture in work profile.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWorkProfileBlockScreenCapture() {
        return this._workProfileBlockScreenCapture;
    }
    /**
     * Gets the workProfileBluetoothEnableContactSharing property value. Allow bluetooth devices to access enterprise contacts.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWorkProfileBluetoothEnableContactSharing() {
        return this._workProfileBluetoothEnableContactSharing;
    }
    /**
     * Gets the workProfileDataSharingType property value. Android Work Profile cross profile data sharing type.
     * @return a androidWorkProfileCrossProfileDataSharingType
     */
    @javax.annotation.Nullable
    public AndroidWorkProfileCrossProfileDataSharingType getWorkProfileDataSharingType() {
        return this._workProfileDataSharingType;
    }
    /**
     * Gets the workProfileDefaultAppPermissionPolicy property value. Android Work Profile default app permission policy type.
     * @return a androidWorkProfileDefaultAppPermissionPolicyType
     */
    @javax.annotation.Nullable
    public AndroidWorkProfileDefaultAppPermissionPolicyType getWorkProfileDefaultAppPermissionPolicy() {
        return this._workProfileDefaultAppPermissionPolicy;
    }
    /**
     * Gets the workProfilePasswordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock for work profile.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWorkProfilePasswordBlockFingerprintUnlock() {
        return this._workProfilePasswordBlockFingerprintUnlock;
    }
    /**
     * Gets the workProfilePasswordBlockTrustAgents property value. Indicates whether or not to block Smart Lock and other trust agents for work profile.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWorkProfilePasswordBlockTrustAgents() {
        return this._workProfilePasswordBlockTrustAgents;
    }
    /**
     * Gets the workProfilePasswordExpirationDays property value. Number of days before the work profile password expires. Valid values 1 to 365
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordExpirationDays() {
        return this._workProfilePasswordExpirationDays;
    }
    /**
     * Gets the workProfilePasswordMinimumLength property value. Minimum length of work profile password. Valid values 4 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumLength() {
        return this._workProfilePasswordMinimumLength;
    }
    /**
     * Gets the workProfilePasswordMinLetterCharacters property value. Minimum # of letter characters required in work profile password. Valid values 1 to 10
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinLetterCharacters() {
        return this._workProfilePasswordMinLetterCharacters;
    }
    /**
     * Gets the workProfilePasswordMinLowerCaseCharacters property value. Minimum # of lower-case characters required in work profile password. Valid values 1 to 10
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinLowerCaseCharacters() {
        return this._workProfilePasswordMinLowerCaseCharacters;
    }
    /**
     * Gets the workProfilePasswordMinNonLetterCharacters property value. Minimum # of non-letter characters required in work profile password. Valid values 1 to 10
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinNonLetterCharacters() {
        return this._workProfilePasswordMinNonLetterCharacters;
    }
    /**
     * Gets the workProfilePasswordMinNumericCharacters property value. Minimum # of numeric characters required in work profile password. Valid values 1 to 10
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinNumericCharacters() {
        return this._workProfilePasswordMinNumericCharacters;
    }
    /**
     * Gets the workProfilePasswordMinSymbolCharacters property value. Minimum # of symbols required in work profile password. Valid values 1 to 10
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinSymbolCharacters() {
        return this._workProfilePasswordMinSymbolCharacters;
    }
    /**
     * Gets the workProfilePasswordMinUpperCaseCharacters property value. Minimum # of upper-case characters required in work profile password. Valid values 1 to 10
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinUpperCaseCharacters() {
        return this._workProfilePasswordMinUpperCaseCharacters;
    }
    /**
     * Gets the workProfilePasswordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this._workProfilePasswordMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the workProfilePasswordPreviousPasswordBlockCount property value. Number of previous work profile passwords to block. Valid values 0 to 24
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordPreviousPasswordBlockCount() {
        return this._workProfilePasswordPreviousPasswordBlockCount;
    }
    /**
     * Gets the workProfilePasswordRequiredType property value. Android Work Profile required password type.
     * @return a androidWorkProfileRequiredPasswordType
     */
    @javax.annotation.Nullable
    public AndroidWorkProfileRequiredPasswordType getWorkProfilePasswordRequiredType() {
        return this._workProfilePasswordRequiredType;
    }
    /**
     * Gets the workProfilePasswordSignInFailureCountBeforeFactoryReset property value. Number of sign in failures allowed before work profile is removed and all corporate data deleted. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordSignInFailureCountBeforeFactoryReset() {
        return this._workProfilePasswordSignInFailureCountBeforeFactoryReset;
    }
    /**
     * Gets the workProfileRequirePassword property value. Password is required or not for work profile
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWorkProfileRequirePassword() {
        return this._workProfileRequirePassword;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockFingerprintUnlock(@javax.annotation.Nullable final Boolean value) {
        this._passwordBlockFingerprintUnlock = value;
    }
    /**
     * Sets the passwordBlockTrustAgents property value. Indicates whether or not to block Smart Lock and other trust agents.
     * @param value Value to set for the passwordBlockTrustAgents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockTrustAgents(@javax.annotation.Nullable final Boolean value) {
        this._passwordBlockTrustAgents = value;
    }
    /**
     * Sets the passwordExpirationDays property value. Number of days before the password expires. Valid values 1 to 365
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this._passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumLength property value. Minimum length of passwords. Valid values 4 to 16
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@javax.annotation.Nullable final Integer value) {
        this._passwordMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block. Valid values 0 to 24
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordPreviousPasswordBlockCount(@javax.annotation.Nullable final Integer value) {
        this._passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequiredType property value. Android Work Profile required password type.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequiredType(@javax.annotation.Nullable final AndroidWorkProfileRequiredPasswordType value) {
        this._passwordRequiredType = value;
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. Number of sign in failures allowed before factory reset. Valid values 1 to 16
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordSignInFailureCountBeforeFactoryReset(@javax.annotation.Nullable final Integer value) {
        this._passwordSignInFailureCountBeforeFactoryReset = value;
    }
    /**
     * Sets the securityRequireVerifyApps property value. Require the Android Verify apps feature is turned on.
     * @param value Value to set for the securityRequireVerifyApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityRequireVerifyApps(@javax.annotation.Nullable final Boolean value) {
        this._securityRequireVerifyApps = value;
    }
    /**
     * Sets the workProfileBlockAddingAccounts property value. Block users from adding/removing accounts in work profile.
     * @param value Value to set for the workProfileBlockAddingAccounts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfileBlockAddingAccounts(@javax.annotation.Nullable final Boolean value) {
        this._workProfileBlockAddingAccounts = value;
    }
    /**
     * Sets the workProfileBlockCamera property value. Block work profile camera.
     * @param value Value to set for the workProfileBlockCamera property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfileBlockCamera(@javax.annotation.Nullable final Boolean value) {
        this._workProfileBlockCamera = value;
    }
    /**
     * Sets the workProfileBlockCrossProfileCallerId property value. Block display work profile caller ID in personal profile.
     * @param value Value to set for the workProfileBlockCrossProfileCallerId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfileBlockCrossProfileCallerId(@javax.annotation.Nullable final Boolean value) {
        this._workProfileBlockCrossProfileCallerId = value;
    }
    /**
     * Sets the workProfileBlockCrossProfileContactsSearch property value. Block work profile contacts availability in personal profile.
     * @param value Value to set for the workProfileBlockCrossProfileContactsSearch property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfileBlockCrossProfileContactsSearch(@javax.annotation.Nullable final Boolean value) {
        this._workProfileBlockCrossProfileContactsSearch = value;
    }
    /**
     * Sets the workProfileBlockCrossProfileCopyPaste property value. Boolean that indicates if the setting disallow cross profile copy/paste is enabled.
     * @param value Value to set for the workProfileBlockCrossProfileCopyPaste property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfileBlockCrossProfileCopyPaste(@javax.annotation.Nullable final Boolean value) {
        this._workProfileBlockCrossProfileCopyPaste = value;
    }
    /**
     * Sets the workProfileBlockNotificationsWhileDeviceLocked property value. Indicates whether or not to block notifications while device locked.
     * @param value Value to set for the workProfileBlockNotificationsWhileDeviceLocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfileBlockNotificationsWhileDeviceLocked(@javax.annotation.Nullable final Boolean value) {
        this._workProfileBlockNotificationsWhileDeviceLocked = value;
    }
    /**
     * Sets the workProfileBlockScreenCapture property value. Block screen capture in work profile.
     * @param value Value to set for the workProfileBlockScreenCapture property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfileBlockScreenCapture(@javax.annotation.Nullable final Boolean value) {
        this._workProfileBlockScreenCapture = value;
    }
    /**
     * Sets the workProfileBluetoothEnableContactSharing property value. Allow bluetooth devices to access enterprise contacts.
     * @param value Value to set for the workProfileBluetoothEnableContactSharing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfileBluetoothEnableContactSharing(@javax.annotation.Nullable final Boolean value) {
        this._workProfileBluetoothEnableContactSharing = value;
    }
    /**
     * Sets the workProfileDataSharingType property value. Android Work Profile cross profile data sharing type.
     * @param value Value to set for the workProfileDataSharingType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfileDataSharingType(@javax.annotation.Nullable final AndroidWorkProfileCrossProfileDataSharingType value) {
        this._workProfileDataSharingType = value;
    }
    /**
     * Sets the workProfileDefaultAppPermissionPolicy property value. Android Work Profile default app permission policy type.
     * @param value Value to set for the workProfileDefaultAppPermissionPolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfileDefaultAppPermissionPolicy(@javax.annotation.Nullable final AndroidWorkProfileDefaultAppPermissionPolicyType value) {
        this._workProfileDefaultAppPermissionPolicy = value;
    }
    /**
     * Sets the workProfilePasswordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock for work profile.
     * @param value Value to set for the workProfilePasswordBlockFingerprintUnlock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordBlockFingerprintUnlock(@javax.annotation.Nullable final Boolean value) {
        this._workProfilePasswordBlockFingerprintUnlock = value;
    }
    /**
     * Sets the workProfilePasswordBlockTrustAgents property value. Indicates whether or not to block Smart Lock and other trust agents for work profile.
     * @param value Value to set for the workProfilePasswordBlockTrustAgents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordBlockTrustAgents(@javax.annotation.Nullable final Boolean value) {
        this._workProfilePasswordBlockTrustAgents = value;
    }
    /**
     * Sets the workProfilePasswordExpirationDays property value. Number of days before the work profile password expires. Valid values 1 to 365
     * @param value Value to set for the workProfilePasswordExpirationDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordExpirationDays = value;
    }
    /**
     * Sets the workProfilePasswordMinimumLength property value. Minimum length of work profile password. Valid values 4 to 16
     * @param value Value to set for the workProfilePasswordMinimumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordMinimumLength = value;
    }
    /**
     * Sets the workProfilePasswordMinLetterCharacters property value. Minimum # of letter characters required in work profile password. Valid values 1 to 10
     * @param value Value to set for the workProfilePasswordMinLetterCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinLetterCharacters(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordMinLetterCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinLowerCaseCharacters property value. Minimum # of lower-case characters required in work profile password. Valid values 1 to 10
     * @param value Value to set for the workProfilePasswordMinLowerCaseCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinLowerCaseCharacters(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordMinLowerCaseCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinNonLetterCharacters property value. Minimum # of non-letter characters required in work profile password. Valid values 1 to 10
     * @param value Value to set for the workProfilePasswordMinNonLetterCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinNonLetterCharacters(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordMinNonLetterCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinNumericCharacters property value. Minimum # of numeric characters required in work profile password. Valid values 1 to 10
     * @param value Value to set for the workProfilePasswordMinNumericCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinNumericCharacters(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordMinNumericCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinSymbolCharacters property value. Minimum # of symbols required in work profile password. Valid values 1 to 10
     * @param value Value to set for the workProfilePasswordMinSymbolCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinSymbolCharacters(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordMinSymbolCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinUpperCaseCharacters property value. Minimum # of upper-case characters required in work profile password. Valid values 1 to 10
     * @param value Value to set for the workProfilePasswordMinUpperCaseCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinUpperCaseCharacters(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordMinUpperCaseCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @param value Value to set for the workProfilePasswordMinutesOfInactivityBeforeScreenTimeout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeout(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the workProfilePasswordPreviousPasswordBlockCount property value. Number of previous work profile passwords to block. Valid values 0 to 24
     * @param value Value to set for the workProfilePasswordPreviousPasswordBlockCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordPreviousPasswordBlockCount(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the workProfilePasswordRequiredType property value. Android Work Profile required password type.
     * @param value Value to set for the workProfilePasswordRequiredType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordRequiredType(@javax.annotation.Nullable final AndroidWorkProfileRequiredPasswordType value) {
        this._workProfilePasswordRequiredType = value;
    }
    /**
     * Sets the workProfilePasswordSignInFailureCountBeforeFactoryReset property value. Number of sign in failures allowed before work profile is removed and all corporate data deleted. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordSignInFailureCountBeforeFactoryReset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordSignInFailureCountBeforeFactoryReset(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordSignInFailureCountBeforeFactoryReset = value;
    }
    /**
     * Sets the workProfileRequirePassword property value. Password is required or not for work profile
     * @param value Value to set for the workProfileRequirePassword property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfileRequirePassword(@javax.annotation.Nullable final Boolean value) {
        this._workProfileRequirePassword = value;
    }
}
