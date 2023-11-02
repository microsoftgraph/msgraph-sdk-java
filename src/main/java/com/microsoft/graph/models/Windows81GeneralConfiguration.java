package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the windows81GeneralConfiguration resource.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows81GeneralConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new Windows81GeneralConfiguration and sets the default values.
     */
    public Windows81GeneralConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows81GeneralConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows81GeneralConfiguration
     */
    @jakarta.annotation.Nonnull
    public static Windows81GeneralConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows81GeneralConfiguration();
    }
    /**
     * Gets the accountsBlockAddingNonMicrosoftAccountEmail property value. Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a Microsoft account.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAccountsBlockAddingNonMicrosoftAccountEmail() {
        return this.getBackingStore().get("accountsBlockAddingNonMicrosoftAccountEmail");
    }
    /**
     * Gets the applyOnlyToWindows81 property value. Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplyOnlyToWindows81() {
        return this.getBackingStore().get("applyOnlyToWindows81");
    }
    /**
     * Gets the browserBlockAutofill property value. Indicates whether or not to block auto fill.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserBlockAutofill() {
        return this.getBackingStore().get("browserBlockAutofill");
    }
    /**
     * Gets the browserBlockAutomaticDetectionOfIntranetSites property value. Indicates whether or not to block automatic detection of Intranet sites.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserBlockAutomaticDetectionOfIntranetSites() {
        return this.getBackingStore().get("browserBlockAutomaticDetectionOfIntranetSites");
    }
    /**
     * Gets the browserBlockEnterpriseModeAccess property value. Indicates whether or not to block enterprise mode access.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserBlockEnterpriseModeAccess() {
        return this.getBackingStore().get("browserBlockEnterpriseModeAccess");
    }
    /**
     * Gets the browserBlockJavaScript property value. Indicates whether or not to Block the user from using JavaScript.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserBlockJavaScript() {
        return this.getBackingStore().get("browserBlockJavaScript");
    }
    /**
     * Gets the browserBlockPlugins property value. Indicates whether or not to block plug-ins.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserBlockPlugins() {
        return this.getBackingStore().get("browserBlockPlugins");
    }
    /**
     * Gets the browserBlockPopups property value. Indicates whether or not to block popups.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserBlockPopups() {
        return this.getBackingStore().get("browserBlockPopups");
    }
    /**
     * Gets the browserBlockSendingDoNotTrackHeader property value. Indicates whether or not to Block the user from sending the do not track header.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserBlockSendingDoNotTrackHeader() {
        return this.getBackingStore().get("browserBlockSendingDoNotTrackHeader");
    }
    /**
     * Gets the browserBlockSingleWordEntryOnIntranetSites property value. Indicates whether or not to block a single word entry on Intranet sites.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserBlockSingleWordEntryOnIntranetSites() {
        return this.getBackingStore().get("browserBlockSingleWordEntryOnIntranetSites");
    }
    /**
     * Gets the browserEnterpriseModeSiteListLocation property value. The enterprise mode site list location. Could be a local file, local network or http location.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBrowserEnterpriseModeSiteListLocation() {
        return this.getBackingStore().get("browserEnterpriseModeSiteListLocation");
    }
    /**
     * Gets the browserInternetSecurityLevel property value. Possible values for internet site security level.
     * @return a InternetSiteSecurityLevel
     */
    @jakarta.annotation.Nullable
    public InternetSiteSecurityLevel getBrowserInternetSecurityLevel() {
        return this.getBackingStore().get("browserInternetSecurityLevel");
    }
    /**
     * Gets the browserIntranetSecurityLevel property value. Possible values for site security level.
     * @return a SiteSecurityLevel
     */
    @jakarta.annotation.Nullable
    public SiteSecurityLevel getBrowserIntranetSecurityLevel() {
        return this.getBackingStore().get("browserIntranetSecurityLevel");
    }
    /**
     * Gets the browserLoggingReportLocation property value. The logging report location.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBrowserLoggingReportLocation() {
        return this.getBackingStore().get("browserLoggingReportLocation");
    }
    /**
     * Gets the browserRequireFirewall property value. Indicates whether or not to require a firewall.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserRequireFirewall() {
        return this.getBackingStore().get("browserRequireFirewall");
    }
    /**
     * Gets the browserRequireFraudWarning property value. Indicates whether or not to require fraud warning.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserRequireFraudWarning() {
        return this.getBackingStore().get("browserRequireFraudWarning");
    }
    /**
     * Gets the browserRequireHighSecurityForRestrictedSites property value. Indicates whether or not to require high security for restricted sites.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserRequireHighSecurityForRestrictedSites() {
        return this.getBackingStore().get("browserRequireHighSecurityForRestrictedSites");
    }
    /**
     * Gets the browserRequireSmartScreen property value. Indicates whether or not to require the user to use the smart screen filter.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserRequireSmartScreen() {
        return this.getBackingStore().get("browserRequireSmartScreen");
    }
    /**
     * Gets the browserTrustedSitesSecurityLevel property value. Possible values for site security level.
     * @return a SiteSecurityLevel
     */
    @jakarta.annotation.Nullable
    public SiteSecurityLevel getBrowserTrustedSitesSecurityLevel() {
        return this.getBackingStore().get("browserTrustedSitesSecurityLevel");
    }
    /**
     * Gets the cellularBlockDataRoaming property value. Indicates whether or not to block data roaming.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockDataRoaming() {
        return this.getBackingStore().get("cellularBlockDataRoaming");
    }
    /**
     * Gets the diagnosticsBlockDataSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDiagnosticsBlockDataSubmission() {
        return this.getBackingStore().get("diagnosticsBlockDataSubmission");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountsBlockAddingNonMicrosoftAccountEmail", (n) -> { this.setAccountsBlockAddingNonMicrosoftAccountEmail(n.getBooleanValue()); });
        deserializerMap.put("applyOnlyToWindows81", (n) -> { this.setApplyOnlyToWindows81(n.getBooleanValue()); });
        deserializerMap.put("browserBlockAutofill", (n) -> { this.setBrowserBlockAutofill(n.getBooleanValue()); });
        deserializerMap.put("browserBlockAutomaticDetectionOfIntranetSites", (n) -> { this.setBrowserBlockAutomaticDetectionOfIntranetSites(n.getBooleanValue()); });
        deserializerMap.put("browserBlockEnterpriseModeAccess", (n) -> { this.setBrowserBlockEnterpriseModeAccess(n.getBooleanValue()); });
        deserializerMap.put("browserBlockJavaScript", (n) -> { this.setBrowserBlockJavaScript(n.getBooleanValue()); });
        deserializerMap.put("browserBlockPlugins", (n) -> { this.setBrowserBlockPlugins(n.getBooleanValue()); });
        deserializerMap.put("browserBlockPopups", (n) -> { this.setBrowserBlockPopups(n.getBooleanValue()); });
        deserializerMap.put("browserBlockSendingDoNotTrackHeader", (n) -> { this.setBrowserBlockSendingDoNotTrackHeader(n.getBooleanValue()); });
        deserializerMap.put("browserBlockSingleWordEntryOnIntranetSites", (n) -> { this.setBrowserBlockSingleWordEntryOnIntranetSites(n.getBooleanValue()); });
        deserializerMap.put("browserEnterpriseModeSiteListLocation", (n) -> { this.setBrowserEnterpriseModeSiteListLocation(n.getStringValue()); });
        deserializerMap.put("browserInternetSecurityLevel", (n) -> { this.setBrowserInternetSecurityLevel(n.getEnumValue(InternetSiteSecurityLevel.class)); });
        deserializerMap.put("browserIntranetSecurityLevel", (n) -> { this.setBrowserIntranetSecurityLevel(n.getEnumValue(SiteSecurityLevel.class)); });
        deserializerMap.put("browserLoggingReportLocation", (n) -> { this.setBrowserLoggingReportLocation(n.getStringValue()); });
        deserializerMap.put("browserRequireFirewall", (n) -> { this.setBrowserRequireFirewall(n.getBooleanValue()); });
        deserializerMap.put("browserRequireFraudWarning", (n) -> { this.setBrowserRequireFraudWarning(n.getBooleanValue()); });
        deserializerMap.put("browserRequireHighSecurityForRestrictedSites", (n) -> { this.setBrowserRequireHighSecurityForRestrictedSites(n.getBooleanValue()); });
        deserializerMap.put("browserRequireSmartScreen", (n) -> { this.setBrowserRequireSmartScreen(n.getBooleanValue()); });
        deserializerMap.put("browserTrustedSitesSecurityLevel", (n) -> { this.setBrowserTrustedSitesSecurityLevel(n.getEnumValue(SiteSecurityLevel.class)); });
        deserializerMap.put("cellularBlockDataRoaming", (n) -> { this.setCellularBlockDataRoaming(n.getBooleanValue()); });
        deserializerMap.put("diagnosticsBlockDataSubmission", (n) -> { this.setDiagnosticsBlockDataSubmission(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockPicturePasswordAndPin", (n) -> { this.setPasswordBlockPicturePasswordAndPin(n.getBooleanValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { this.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumCharacterSetCount", (n) -> { this.setPasswordMinimumCharacterSetCount(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { this.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordBlockCount", (n) -> { this.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
        deserializerMap.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { this.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        deserializerMap.put("storageRequireDeviceEncryption", (n) -> { this.setStorageRequireDeviceEncryption(n.getBooleanValue()); });
        deserializerMap.put("updatesRequireAutomaticUpdates", (n) -> { this.setUpdatesRequireAutomaticUpdates(n.getBooleanValue()); });
        deserializerMap.put("userAccountControlSettings", (n) -> { this.setUserAccountControlSettings(n.getEnumValue(WindowsUserAccountControlSettings.class)); });
        deserializerMap.put("workFoldersUrl", (n) -> { this.setWorkFoldersUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the passwordBlockPicturePasswordAndPin property value. Indicates whether or not to Block the user from using a pictures password and pin.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockPicturePasswordAndPin() {
        return this.getBackingStore().get("passwordBlockPicturePasswordAndPin");
    }
    /**
     * Gets the passwordExpirationDays property value. Password expiration in days.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.getBackingStore().get("passwordExpirationDays");
    }
    /**
     * Gets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumCharacterSetCount() {
        return this.getBackingStore().get("passwordMinimumCharacterSetCount");
    }
    /**
     * Gets the passwordMinimumLength property value. The minimum password length.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.getBackingStore().get("passwordMinimumLength");
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. The minutes of inactivity before the screen times out.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this.getBackingStore().get("passwordMinutesOfInactivityBeforeScreenTimeout");
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent re-use of. Valid values 0 to 24
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.getBackingStore().get("passwordPreviousPasswordBlockCount");
    }
    /**
     * Gets the passwordRequiredType property value. Possible values of required passwords.
     * @return a RequiredPasswordType
     */
    @jakarta.annotation.Nullable
    public RequiredPasswordType getPasswordRequiredType() {
        return this.getBackingStore().get("passwordRequiredType");
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. The number of sign in failures before factory reset.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this.getBackingStore().get("passwordSignInFailureCountBeforeFactoryReset");
    }
    /**
     * Gets the storageRequireDeviceEncryption property value. Indicates whether or not to require encryption on a mobile device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageRequireDeviceEncryption() {
        return this.getBackingStore().get("storageRequireDeviceEncryption");
    }
    /**
     * Gets the updatesRequireAutomaticUpdates property value. Indicates whether or not to require automatic updates.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUpdatesRequireAutomaticUpdates() {
        return this.getBackingStore().get("updatesRequireAutomaticUpdates");
    }
    /**
     * Gets the userAccountControlSettings property value. Possible values for Windows user account control settings.
     * @return a WindowsUserAccountControlSettings
     */
    @jakarta.annotation.Nullable
    public WindowsUserAccountControlSettings getUserAccountControlSettings() {
        return this.getBackingStore().get("userAccountControlSettings");
    }
    /**
     * Gets the workFoldersUrl property value. The work folders url.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWorkFoldersUrl() {
        return this.getBackingStore().get("workFoldersUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("accountsBlockAddingNonMicrosoftAccountEmail", this.getAccountsBlockAddingNonMicrosoftAccountEmail());
        writer.writeBooleanValue("browserBlockAutofill", this.getBrowserBlockAutofill());
        writer.writeBooleanValue("browserBlockAutomaticDetectionOfIntranetSites", this.getBrowserBlockAutomaticDetectionOfIntranetSites());
        writer.writeBooleanValue("browserBlockEnterpriseModeAccess", this.getBrowserBlockEnterpriseModeAccess());
        writer.writeBooleanValue("browserBlockJavaScript", this.getBrowserBlockJavaScript());
        writer.writeBooleanValue("browserBlockPlugins", this.getBrowserBlockPlugins());
        writer.writeBooleanValue("browserBlockPopups", this.getBrowserBlockPopups());
        writer.writeBooleanValue("browserBlockSendingDoNotTrackHeader", this.getBrowserBlockSendingDoNotTrackHeader());
        writer.writeBooleanValue("browserBlockSingleWordEntryOnIntranetSites", this.getBrowserBlockSingleWordEntryOnIntranetSites());
        writer.writeStringValue("browserEnterpriseModeSiteListLocation", this.getBrowserEnterpriseModeSiteListLocation());
        writer.writeEnumValue("browserInternetSecurityLevel", this.getBrowserInternetSecurityLevel());
        writer.writeEnumValue("browserIntranetSecurityLevel", this.getBrowserIntranetSecurityLevel());
        writer.writeStringValue("browserLoggingReportLocation", this.getBrowserLoggingReportLocation());
        writer.writeBooleanValue("browserRequireFirewall", this.getBrowserRequireFirewall());
        writer.writeBooleanValue("browserRequireFraudWarning", this.getBrowserRequireFraudWarning());
        writer.writeBooleanValue("browserRequireHighSecurityForRestrictedSites", this.getBrowserRequireHighSecurityForRestrictedSites());
        writer.writeBooleanValue("browserRequireSmartScreen", this.getBrowserRequireSmartScreen());
        writer.writeEnumValue("browserTrustedSitesSecurityLevel", this.getBrowserTrustedSitesSecurityLevel());
        writer.writeBooleanValue("cellularBlockDataRoaming", this.getCellularBlockDataRoaming());
        writer.writeBooleanValue("diagnosticsBlockDataSubmission", this.getDiagnosticsBlockDataSubmission());
        writer.writeBooleanValue("passwordBlockPicturePasswordAndPin", this.getPasswordBlockPicturePasswordAndPin());
        writer.writeIntegerValue("passwordExpirationDays", this.getPasswordExpirationDays());
        writer.writeIntegerValue("passwordMinimumCharacterSetCount", this.getPasswordMinimumCharacterSetCount());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeScreenTimeout", this.getPasswordMinutesOfInactivityBeforeScreenTimeout());
        writer.writeIntegerValue("passwordPreviousPasswordBlockCount", this.getPasswordPreviousPasswordBlockCount());
        writer.writeEnumValue("passwordRequiredType", this.getPasswordRequiredType());
        writer.writeIntegerValue("passwordSignInFailureCountBeforeFactoryReset", this.getPasswordSignInFailureCountBeforeFactoryReset());
        writer.writeBooleanValue("storageRequireDeviceEncryption", this.getStorageRequireDeviceEncryption());
        writer.writeBooleanValue("updatesRequireAutomaticUpdates", this.getUpdatesRequireAutomaticUpdates());
        writer.writeEnumValue("userAccountControlSettings", this.getUserAccountControlSettings());
        writer.writeStringValue("workFoldersUrl", this.getWorkFoldersUrl());
    }
    /**
     * Sets the accountsBlockAddingNonMicrosoftAccountEmail property value. Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a Microsoft account.
     * @param value Value to set for the accountsBlockAddingNonMicrosoftAccountEmail property.
     */
    public void setAccountsBlockAddingNonMicrosoftAccountEmail(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("accountsBlockAddingNonMicrosoftAccountEmail", value);
    }
    /**
     * Sets the applyOnlyToWindows81 property value. Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
     * @param value Value to set for the applyOnlyToWindows81 property.
     */
    public void setApplyOnlyToWindows81(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("applyOnlyToWindows81", value);
    }
    /**
     * Sets the browserBlockAutofill property value. Indicates whether or not to block auto fill.
     * @param value Value to set for the browserBlockAutofill property.
     */
    public void setBrowserBlockAutofill(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("browserBlockAutofill", value);
    }
    /**
     * Sets the browserBlockAutomaticDetectionOfIntranetSites property value. Indicates whether or not to block automatic detection of Intranet sites.
     * @param value Value to set for the browserBlockAutomaticDetectionOfIntranetSites property.
     */
    public void setBrowserBlockAutomaticDetectionOfIntranetSites(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("browserBlockAutomaticDetectionOfIntranetSites", value);
    }
    /**
     * Sets the browserBlockEnterpriseModeAccess property value. Indicates whether or not to block enterprise mode access.
     * @param value Value to set for the browserBlockEnterpriseModeAccess property.
     */
    public void setBrowserBlockEnterpriseModeAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("browserBlockEnterpriseModeAccess", value);
    }
    /**
     * Sets the browserBlockJavaScript property value. Indicates whether or not to Block the user from using JavaScript.
     * @param value Value to set for the browserBlockJavaScript property.
     */
    public void setBrowserBlockJavaScript(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("browserBlockJavaScript", value);
    }
    /**
     * Sets the browserBlockPlugins property value. Indicates whether or not to block plug-ins.
     * @param value Value to set for the browserBlockPlugins property.
     */
    public void setBrowserBlockPlugins(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("browserBlockPlugins", value);
    }
    /**
     * Sets the browserBlockPopups property value. Indicates whether or not to block popups.
     * @param value Value to set for the browserBlockPopups property.
     */
    public void setBrowserBlockPopups(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("browserBlockPopups", value);
    }
    /**
     * Sets the browserBlockSendingDoNotTrackHeader property value. Indicates whether or not to Block the user from sending the do not track header.
     * @param value Value to set for the browserBlockSendingDoNotTrackHeader property.
     */
    public void setBrowserBlockSendingDoNotTrackHeader(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("browserBlockSendingDoNotTrackHeader", value);
    }
    /**
     * Sets the browserBlockSingleWordEntryOnIntranetSites property value. Indicates whether or not to block a single word entry on Intranet sites.
     * @param value Value to set for the browserBlockSingleWordEntryOnIntranetSites property.
     */
    public void setBrowserBlockSingleWordEntryOnIntranetSites(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("browserBlockSingleWordEntryOnIntranetSites", value);
    }
    /**
     * Sets the browserEnterpriseModeSiteListLocation property value. The enterprise mode site list location. Could be a local file, local network or http location.
     * @param value Value to set for the browserEnterpriseModeSiteListLocation property.
     */
    public void setBrowserEnterpriseModeSiteListLocation(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("browserEnterpriseModeSiteListLocation", value);
    }
    /**
     * Sets the browserInternetSecurityLevel property value. Possible values for internet site security level.
     * @param value Value to set for the browserInternetSecurityLevel property.
     */
    public void setBrowserInternetSecurityLevel(@jakarta.annotation.Nullable final InternetSiteSecurityLevel value) {
        this.getBackingStore().set("browserInternetSecurityLevel", value);
    }
    /**
     * Sets the browserIntranetSecurityLevel property value. Possible values for site security level.
     * @param value Value to set for the browserIntranetSecurityLevel property.
     */
    public void setBrowserIntranetSecurityLevel(@jakarta.annotation.Nullable final SiteSecurityLevel value) {
        this.getBackingStore().set("browserIntranetSecurityLevel", value);
    }
    /**
     * Sets the browserLoggingReportLocation property value. The logging report location.
     * @param value Value to set for the browserLoggingReportLocation property.
     */
    public void setBrowserLoggingReportLocation(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("browserLoggingReportLocation", value);
    }
    /**
     * Sets the browserRequireFirewall property value. Indicates whether or not to require a firewall.
     * @param value Value to set for the browserRequireFirewall property.
     */
    public void setBrowserRequireFirewall(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("browserRequireFirewall", value);
    }
    /**
     * Sets the browserRequireFraudWarning property value. Indicates whether or not to require fraud warning.
     * @param value Value to set for the browserRequireFraudWarning property.
     */
    public void setBrowserRequireFraudWarning(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("browserRequireFraudWarning", value);
    }
    /**
     * Sets the browserRequireHighSecurityForRestrictedSites property value. Indicates whether or not to require high security for restricted sites.
     * @param value Value to set for the browserRequireHighSecurityForRestrictedSites property.
     */
    public void setBrowserRequireHighSecurityForRestrictedSites(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("browserRequireHighSecurityForRestrictedSites", value);
    }
    /**
     * Sets the browserRequireSmartScreen property value. Indicates whether or not to require the user to use the smart screen filter.
     * @param value Value to set for the browserRequireSmartScreen property.
     */
    public void setBrowserRequireSmartScreen(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("browserRequireSmartScreen", value);
    }
    /**
     * Sets the browserTrustedSitesSecurityLevel property value. Possible values for site security level.
     * @param value Value to set for the browserTrustedSitesSecurityLevel property.
     */
    public void setBrowserTrustedSitesSecurityLevel(@jakarta.annotation.Nullable final SiteSecurityLevel value) {
        this.getBackingStore().set("browserTrustedSitesSecurityLevel", value);
    }
    /**
     * Sets the cellularBlockDataRoaming property value. Indicates whether or not to block data roaming.
     * @param value Value to set for the cellularBlockDataRoaming property.
     */
    public void setCellularBlockDataRoaming(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("cellularBlockDataRoaming", value);
    }
    /**
     * Sets the diagnosticsBlockDataSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @param value Value to set for the diagnosticsBlockDataSubmission property.
     */
    public void setDiagnosticsBlockDataSubmission(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("diagnosticsBlockDataSubmission", value);
    }
    /**
     * Sets the passwordBlockPicturePasswordAndPin property value. Indicates whether or not to Block the user from using a pictures password and pin.
     * @param value Value to set for the passwordBlockPicturePasswordAndPin property.
     */
    public void setPasswordBlockPicturePasswordAndPin(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("passwordBlockPicturePasswordAndPin", value);
    }
    /**
     * Sets the passwordExpirationDays property value. Password expiration in days.
     * @param value Value to set for the passwordExpirationDays property.
     */
    public void setPasswordExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("passwordExpirationDays", value);
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     */
    public void setPasswordMinimumCharacterSetCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("passwordMinimumCharacterSetCount", value);
    }
    /**
     * Sets the passwordMinimumLength property value. The minimum password length.
     * @param value Value to set for the passwordMinimumLength property.
     */
    public void setPasswordMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("passwordMinimumLength", value);
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. The minutes of inactivity before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     */
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("passwordMinutesOfInactivityBeforeScreenTimeout", value);
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent re-use of. Valid values 0 to 24
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     */
    public void setPasswordPreviousPasswordBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("passwordPreviousPasswordBlockCount", value);
    }
    /**
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     */
    public void setPasswordRequiredType(@jakarta.annotation.Nullable final RequiredPasswordType value) {
        this.getBackingStore().set("passwordRequiredType", value);
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. The number of sign in failures before factory reset.
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     */
    public void setPasswordSignInFailureCountBeforeFactoryReset(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("passwordSignInFailureCountBeforeFactoryReset", value);
    }
    /**
     * Sets the storageRequireDeviceEncryption property value. Indicates whether or not to require encryption on a mobile device.
     * @param value Value to set for the storageRequireDeviceEncryption property.
     */
    public void setStorageRequireDeviceEncryption(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("storageRequireDeviceEncryption", value);
    }
    /**
     * Sets the updatesRequireAutomaticUpdates property value. Indicates whether or not to require automatic updates.
     * @param value Value to set for the updatesRequireAutomaticUpdates property.
     */
    public void setUpdatesRequireAutomaticUpdates(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("updatesRequireAutomaticUpdates", value);
    }
    /**
     * Sets the userAccountControlSettings property value. Possible values for Windows user account control settings.
     * @param value Value to set for the userAccountControlSettings property.
     */
    public void setUserAccountControlSettings(@jakarta.annotation.Nullable final WindowsUserAccountControlSettings value) {
        this.getBackingStore().set("userAccountControlSettings", value);
    }
    /**
     * Sets the workFoldersUrl property value. The work folders url.
     * @param value Value to set for the workFoldersUrl property.
     */
    public void setWorkFoldersUrl(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("workFoldersUrl", value);
    }
}
