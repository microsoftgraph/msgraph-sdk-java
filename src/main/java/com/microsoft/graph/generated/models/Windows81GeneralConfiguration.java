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
     * Instantiates a new {@link Windows81GeneralConfiguration} and sets the default values.
     */
    public Windows81GeneralConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows81GeneralConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Windows81GeneralConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static Windows81GeneralConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows81GeneralConfiguration();
    }
    /**
     * Gets the accountsBlockAddingNonMicrosoftAccountEmail property value. Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a Microsoft account.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAccountsBlockAddingNonMicrosoftAccountEmail() {
        return this.backingStore.get("accountsBlockAddingNonMicrosoftAccountEmail");
    }
    /**
     * Gets the applyOnlyToWindows81 property value. Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getApplyOnlyToWindows81() {
        return this.backingStore.get("applyOnlyToWindows81");
    }
    /**
     * Gets the browserBlockAutofill property value. Indicates whether or not to block auto fill.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserBlockAutofill() {
        return this.backingStore.get("browserBlockAutofill");
    }
    /**
     * Gets the browserBlockAutomaticDetectionOfIntranetSites property value. Indicates whether or not to block automatic detection of Intranet sites.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserBlockAutomaticDetectionOfIntranetSites() {
        return this.backingStore.get("browserBlockAutomaticDetectionOfIntranetSites");
    }
    /**
     * Gets the browserBlockEnterpriseModeAccess property value. Indicates whether or not to block enterprise mode access.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserBlockEnterpriseModeAccess() {
        return this.backingStore.get("browserBlockEnterpriseModeAccess");
    }
    /**
     * Gets the browserBlockJavaScript property value. Indicates whether or not to Block the user from using JavaScript.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserBlockJavaScript() {
        return this.backingStore.get("browserBlockJavaScript");
    }
    /**
     * Gets the browserBlockPlugins property value. Indicates whether or not to block plug-ins.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserBlockPlugins() {
        return this.backingStore.get("browserBlockPlugins");
    }
    /**
     * Gets the browserBlockPopups property value. Indicates whether or not to block popups.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserBlockPopups() {
        return this.backingStore.get("browserBlockPopups");
    }
    /**
     * Gets the browserBlockSendingDoNotTrackHeader property value. Indicates whether or not to Block the user from sending the do not track header.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserBlockSendingDoNotTrackHeader() {
        return this.backingStore.get("browserBlockSendingDoNotTrackHeader");
    }
    /**
     * Gets the browserBlockSingleWordEntryOnIntranetSites property value. Indicates whether or not to block a single word entry on Intranet sites.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserBlockSingleWordEntryOnIntranetSites() {
        return this.backingStore.get("browserBlockSingleWordEntryOnIntranetSites");
    }
    /**
     * Gets the browserEnterpriseModeSiteListLocation property value. The enterprise mode site list location. Could be a local file, local network or http location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrowserEnterpriseModeSiteListLocation() {
        return this.backingStore.get("browserEnterpriseModeSiteListLocation");
    }
    /**
     * Gets the browserInternetSecurityLevel property value. Possible values for internet site security level.
     * @return a {@link InternetSiteSecurityLevel}
     */
    @jakarta.annotation.Nullable
    public InternetSiteSecurityLevel getBrowserInternetSecurityLevel() {
        return this.backingStore.get("browserInternetSecurityLevel");
    }
    /**
     * Gets the browserIntranetSecurityLevel property value. Possible values for site security level.
     * @return a {@link SiteSecurityLevel}
     */
    @jakarta.annotation.Nullable
    public SiteSecurityLevel getBrowserIntranetSecurityLevel() {
        return this.backingStore.get("browserIntranetSecurityLevel");
    }
    /**
     * Gets the browserLoggingReportLocation property value. The logging report location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrowserLoggingReportLocation() {
        return this.backingStore.get("browserLoggingReportLocation");
    }
    /**
     * Gets the browserRequireFirewall property value. Indicates whether or not to require a firewall.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserRequireFirewall() {
        return this.backingStore.get("browserRequireFirewall");
    }
    /**
     * Gets the browserRequireFraudWarning property value. Indicates whether or not to require fraud warning.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserRequireFraudWarning() {
        return this.backingStore.get("browserRequireFraudWarning");
    }
    /**
     * Gets the browserRequireHighSecurityForRestrictedSites property value. Indicates whether or not to require high security for restricted sites.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserRequireHighSecurityForRestrictedSites() {
        return this.backingStore.get("browserRequireHighSecurityForRestrictedSites");
    }
    /**
     * Gets the browserRequireSmartScreen property value. Indicates whether or not to require the user to use the smart screen filter.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBrowserRequireSmartScreen() {
        return this.backingStore.get("browserRequireSmartScreen");
    }
    /**
     * Gets the browserTrustedSitesSecurityLevel property value. Possible values for site security level.
     * @return a {@link SiteSecurityLevel}
     */
    @jakarta.annotation.Nullable
    public SiteSecurityLevel getBrowserTrustedSitesSecurityLevel() {
        return this.backingStore.get("browserTrustedSitesSecurityLevel");
    }
    /**
     * Gets the cellularBlockDataRoaming property value. Indicates whether or not to block data roaming.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockDataRoaming() {
        return this.backingStore.get("cellularBlockDataRoaming");
    }
    /**
     * Gets the diagnosticsBlockDataSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDiagnosticsBlockDataSubmission() {
        return this.backingStore.get("diagnosticsBlockDataSubmission");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
        deserializerMap.put("browserInternetSecurityLevel", (n) -> { this.setBrowserInternetSecurityLevel(n.getEnumValue(InternetSiteSecurityLevel::forValue)); });
        deserializerMap.put("browserIntranetSecurityLevel", (n) -> { this.setBrowserIntranetSecurityLevel(n.getEnumValue(SiteSecurityLevel::forValue)); });
        deserializerMap.put("browserLoggingReportLocation", (n) -> { this.setBrowserLoggingReportLocation(n.getStringValue()); });
        deserializerMap.put("browserRequireFirewall", (n) -> { this.setBrowserRequireFirewall(n.getBooleanValue()); });
        deserializerMap.put("browserRequireFraudWarning", (n) -> { this.setBrowserRequireFraudWarning(n.getBooleanValue()); });
        deserializerMap.put("browserRequireHighSecurityForRestrictedSites", (n) -> { this.setBrowserRequireHighSecurityForRestrictedSites(n.getBooleanValue()); });
        deserializerMap.put("browserRequireSmartScreen", (n) -> { this.setBrowserRequireSmartScreen(n.getBooleanValue()); });
        deserializerMap.put("browserTrustedSitesSecurityLevel", (n) -> { this.setBrowserTrustedSitesSecurityLevel(n.getEnumValue(SiteSecurityLevel::forValue)); });
        deserializerMap.put("cellularBlockDataRoaming", (n) -> { this.setCellularBlockDataRoaming(n.getBooleanValue()); });
        deserializerMap.put("diagnosticsBlockDataSubmission", (n) -> { this.setDiagnosticsBlockDataSubmission(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockPicturePasswordAndPin", (n) -> { this.setPasswordBlockPicturePasswordAndPin(n.getBooleanValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { this.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumCharacterSetCount", (n) -> { this.setPasswordMinimumCharacterSetCount(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { this.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordBlockCount", (n) -> { this.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType::forValue)); });
        deserializerMap.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { this.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        deserializerMap.put("storageRequireDeviceEncryption", (n) -> { this.setStorageRequireDeviceEncryption(n.getBooleanValue()); });
        deserializerMap.put("updatesRequireAutomaticUpdates", (n) -> { this.setUpdatesRequireAutomaticUpdates(n.getBooleanValue()); });
        deserializerMap.put("userAccountControlSettings", (n) -> { this.setUserAccountControlSettings(n.getEnumValue(WindowsUserAccountControlSettings::forValue)); });
        deserializerMap.put("workFoldersUrl", (n) -> { this.setWorkFoldersUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the passwordBlockPicturePasswordAndPin property value. Indicates whether or not to Block the user from using a pictures password and pin.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockPicturePasswordAndPin() {
        return this.backingStore.get("passwordBlockPicturePasswordAndPin");
    }
    /**
     * Gets the passwordExpirationDays property value. Password expiration in days.
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
     * Gets the passwordMinimumLength property value. The minimum password length.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.backingStore.get("passwordMinimumLength");
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. The minutes of inactivity before the screen times out.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this.backingStore.get("passwordMinutesOfInactivityBeforeScreenTimeout");
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent re-use of. Valid values 0 to 24
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.backingStore.get("passwordPreviousPasswordBlockCount");
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
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. The number of sign in failures before factory reset.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this.backingStore.get("passwordSignInFailureCountBeforeFactoryReset");
    }
    /**
     * Gets the storageRequireDeviceEncryption property value. Indicates whether or not to require encryption on a mobile device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageRequireDeviceEncryption() {
        return this.backingStore.get("storageRequireDeviceEncryption");
    }
    /**
     * Gets the updatesRequireAutomaticUpdates property value. Indicates whether or not to require automatic updates.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUpdatesRequireAutomaticUpdates() {
        return this.backingStore.get("updatesRequireAutomaticUpdates");
    }
    /**
     * Gets the userAccountControlSettings property value. Possible values for Windows user account control settings.
     * @return a {@link WindowsUserAccountControlSettings}
     */
    @jakarta.annotation.Nullable
    public WindowsUserAccountControlSettings getUserAccountControlSettings() {
        return this.backingStore.get("userAccountControlSettings");
    }
    /**
     * Gets the workFoldersUrl property value. The work folders url.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWorkFoldersUrl() {
        return this.backingStore.get("workFoldersUrl");
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
        this.backingStore.set("accountsBlockAddingNonMicrosoftAccountEmail", value);
    }
    /**
     * Sets the applyOnlyToWindows81 property value. Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
     * @param value Value to set for the applyOnlyToWindows81 property.
     */
    public void setApplyOnlyToWindows81(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applyOnlyToWindows81", value);
    }
    /**
     * Sets the browserBlockAutofill property value. Indicates whether or not to block auto fill.
     * @param value Value to set for the browserBlockAutofill property.
     */
    public void setBrowserBlockAutofill(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("browserBlockAutofill", value);
    }
    /**
     * Sets the browserBlockAutomaticDetectionOfIntranetSites property value. Indicates whether or not to block automatic detection of Intranet sites.
     * @param value Value to set for the browserBlockAutomaticDetectionOfIntranetSites property.
     */
    public void setBrowserBlockAutomaticDetectionOfIntranetSites(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("browserBlockAutomaticDetectionOfIntranetSites", value);
    }
    /**
     * Sets the browserBlockEnterpriseModeAccess property value. Indicates whether or not to block enterprise mode access.
     * @param value Value to set for the browserBlockEnterpriseModeAccess property.
     */
    public void setBrowserBlockEnterpriseModeAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("browserBlockEnterpriseModeAccess", value);
    }
    /**
     * Sets the browserBlockJavaScript property value. Indicates whether or not to Block the user from using JavaScript.
     * @param value Value to set for the browserBlockJavaScript property.
     */
    public void setBrowserBlockJavaScript(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("browserBlockJavaScript", value);
    }
    /**
     * Sets the browserBlockPlugins property value. Indicates whether or not to block plug-ins.
     * @param value Value to set for the browserBlockPlugins property.
     */
    public void setBrowserBlockPlugins(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("browserBlockPlugins", value);
    }
    /**
     * Sets the browserBlockPopups property value. Indicates whether or not to block popups.
     * @param value Value to set for the browserBlockPopups property.
     */
    public void setBrowserBlockPopups(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("browserBlockPopups", value);
    }
    /**
     * Sets the browserBlockSendingDoNotTrackHeader property value. Indicates whether or not to Block the user from sending the do not track header.
     * @param value Value to set for the browserBlockSendingDoNotTrackHeader property.
     */
    public void setBrowserBlockSendingDoNotTrackHeader(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("browserBlockSendingDoNotTrackHeader", value);
    }
    /**
     * Sets the browserBlockSingleWordEntryOnIntranetSites property value. Indicates whether or not to block a single word entry on Intranet sites.
     * @param value Value to set for the browserBlockSingleWordEntryOnIntranetSites property.
     */
    public void setBrowserBlockSingleWordEntryOnIntranetSites(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("browserBlockSingleWordEntryOnIntranetSites", value);
    }
    /**
     * Sets the browserEnterpriseModeSiteListLocation property value. The enterprise mode site list location. Could be a local file, local network or http location.
     * @param value Value to set for the browserEnterpriseModeSiteListLocation property.
     */
    public void setBrowserEnterpriseModeSiteListLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("browserEnterpriseModeSiteListLocation", value);
    }
    /**
     * Sets the browserInternetSecurityLevel property value. Possible values for internet site security level.
     * @param value Value to set for the browserInternetSecurityLevel property.
     */
    public void setBrowserInternetSecurityLevel(@jakarta.annotation.Nullable final InternetSiteSecurityLevel value) {
        this.backingStore.set("browserInternetSecurityLevel", value);
    }
    /**
     * Sets the browserIntranetSecurityLevel property value. Possible values for site security level.
     * @param value Value to set for the browserIntranetSecurityLevel property.
     */
    public void setBrowserIntranetSecurityLevel(@jakarta.annotation.Nullable final SiteSecurityLevel value) {
        this.backingStore.set("browserIntranetSecurityLevel", value);
    }
    /**
     * Sets the browserLoggingReportLocation property value. The logging report location.
     * @param value Value to set for the browserLoggingReportLocation property.
     */
    public void setBrowserLoggingReportLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("browserLoggingReportLocation", value);
    }
    /**
     * Sets the browserRequireFirewall property value. Indicates whether or not to require a firewall.
     * @param value Value to set for the browserRequireFirewall property.
     */
    public void setBrowserRequireFirewall(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("browserRequireFirewall", value);
    }
    /**
     * Sets the browserRequireFraudWarning property value. Indicates whether or not to require fraud warning.
     * @param value Value to set for the browserRequireFraudWarning property.
     */
    public void setBrowserRequireFraudWarning(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("browserRequireFraudWarning", value);
    }
    /**
     * Sets the browserRequireHighSecurityForRestrictedSites property value. Indicates whether or not to require high security for restricted sites.
     * @param value Value to set for the browserRequireHighSecurityForRestrictedSites property.
     */
    public void setBrowserRequireHighSecurityForRestrictedSites(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("browserRequireHighSecurityForRestrictedSites", value);
    }
    /**
     * Sets the browserRequireSmartScreen property value. Indicates whether or not to require the user to use the smart screen filter.
     * @param value Value to set for the browserRequireSmartScreen property.
     */
    public void setBrowserRequireSmartScreen(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("browserRequireSmartScreen", value);
    }
    /**
     * Sets the browserTrustedSitesSecurityLevel property value. Possible values for site security level.
     * @param value Value to set for the browserTrustedSitesSecurityLevel property.
     */
    public void setBrowserTrustedSitesSecurityLevel(@jakarta.annotation.Nullable final SiteSecurityLevel value) {
        this.backingStore.set("browserTrustedSitesSecurityLevel", value);
    }
    /**
     * Sets the cellularBlockDataRoaming property value. Indicates whether or not to block data roaming.
     * @param value Value to set for the cellularBlockDataRoaming property.
     */
    public void setCellularBlockDataRoaming(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cellularBlockDataRoaming", value);
    }
    /**
     * Sets the diagnosticsBlockDataSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @param value Value to set for the diagnosticsBlockDataSubmission property.
     */
    public void setDiagnosticsBlockDataSubmission(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("diagnosticsBlockDataSubmission", value);
    }
    /**
     * Sets the passwordBlockPicturePasswordAndPin property value. Indicates whether or not to Block the user from using a pictures password and pin.
     * @param value Value to set for the passwordBlockPicturePasswordAndPin property.
     */
    public void setPasswordBlockPicturePasswordAndPin(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordBlockPicturePasswordAndPin", value);
    }
    /**
     * Sets the passwordExpirationDays property value. Password expiration in days.
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
     * Sets the passwordMinimumLength property value. The minimum password length.
     * @param value Value to set for the passwordMinimumLength property.
     */
    public void setPasswordMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinimumLength", value);
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. The minutes of inactivity before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     */
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinutesOfInactivityBeforeScreenTimeout", value);
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent re-use of. Valid values 0 to 24
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     */
    public void setPasswordPreviousPasswordBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordPreviousPasswordBlockCount", value);
    }
    /**
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     */
    public void setPasswordRequiredType(@jakarta.annotation.Nullable final RequiredPasswordType value) {
        this.backingStore.set("passwordRequiredType", value);
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. The number of sign in failures before factory reset.
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     */
    public void setPasswordSignInFailureCountBeforeFactoryReset(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordSignInFailureCountBeforeFactoryReset", value);
    }
    /**
     * Sets the storageRequireDeviceEncryption property value. Indicates whether or not to require encryption on a mobile device.
     * @param value Value to set for the storageRequireDeviceEncryption property.
     */
    public void setStorageRequireDeviceEncryption(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("storageRequireDeviceEncryption", value);
    }
    /**
     * Sets the updatesRequireAutomaticUpdates property value. Indicates whether or not to require automatic updates.
     * @param value Value to set for the updatesRequireAutomaticUpdates property.
     */
    public void setUpdatesRequireAutomaticUpdates(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("updatesRequireAutomaticUpdates", value);
    }
    /**
     * Sets the userAccountControlSettings property value. Possible values for Windows user account control settings.
     * @param value Value to set for the userAccountControlSettings property.
     */
    public void setUserAccountControlSettings(@jakarta.annotation.Nullable final WindowsUserAccountControlSettings value) {
        this.backingStore.set("userAccountControlSettings", value);
    }
    /**
     * Sets the workFoldersUrl property value. The work folders url.
     * @param value Value to set for the workFoldersUrl property.
     */
    public void setWorkFoldersUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("workFoldersUrl", value);
    }
}
