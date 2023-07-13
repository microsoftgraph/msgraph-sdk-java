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
public class Windows81GeneralConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a Microsoft account.
     */
    private Boolean accountsBlockAddingNonMicrosoftAccountEmail;
    /**
     * Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
     */
    private Boolean applyOnlyToWindows81;
    /**
     * Indicates whether or not to block auto fill.
     */
    private Boolean browserBlockAutofill;
    /**
     * Indicates whether or not to block automatic detection of Intranet sites.
     */
    private Boolean browserBlockAutomaticDetectionOfIntranetSites;
    /**
     * Indicates whether or not to block enterprise mode access.
     */
    private Boolean browserBlockEnterpriseModeAccess;
    /**
     * Indicates whether or not to Block the user from using JavaScript.
     */
    private Boolean browserBlockJavaScript;
    /**
     * Indicates whether or not to block plug-ins.
     */
    private Boolean browserBlockPlugins;
    /**
     * Indicates whether or not to block popups.
     */
    private Boolean browserBlockPopups;
    /**
     * Indicates whether or not to Block the user from sending the do not track header.
     */
    private Boolean browserBlockSendingDoNotTrackHeader;
    /**
     * Indicates whether or not to block a single word entry on Intranet sites.
     */
    private Boolean browserBlockSingleWordEntryOnIntranetSites;
    /**
     * The enterprise mode site list location. Could be a local file, local network or http location.
     */
    private String browserEnterpriseModeSiteListLocation;
    /**
     * Possible values for internet site security level.
     */
    private InternetSiteSecurityLevel browserInternetSecurityLevel;
    /**
     * Possible values for site security level.
     */
    private SiteSecurityLevel browserIntranetSecurityLevel;
    /**
     * The logging report location.
     */
    private String browserLoggingReportLocation;
    /**
     * Indicates whether or not to require a firewall.
     */
    private Boolean browserRequireFirewall;
    /**
     * Indicates whether or not to require fraud warning.
     */
    private Boolean browserRequireFraudWarning;
    /**
     * Indicates whether or not to require high security for restricted sites.
     */
    private Boolean browserRequireHighSecurityForRestrictedSites;
    /**
     * Indicates whether or not to require the user to use the smart screen filter.
     */
    private Boolean browserRequireSmartScreen;
    /**
     * Possible values for site security level.
     */
    private SiteSecurityLevel browserTrustedSitesSecurityLevel;
    /**
     * Indicates whether or not to block data roaming.
     */
    private Boolean cellularBlockDataRoaming;
    /**
     * Indicates whether or not to block diagnostic data submission.
     */
    private Boolean diagnosticsBlockDataSubmission;
    /**
     * Indicates whether or not to Block the user from using a pictures password and pin.
     */
    private Boolean passwordBlockPicturePasswordAndPin;
    /**
     * Password expiration in days.
     */
    private Integer passwordExpirationDays;
    /**
     * The number of character sets required in the password.
     */
    private Integer passwordMinimumCharacterSetCount;
    /**
     * The minimum password length.
     */
    private Integer passwordMinimumLength;
    /**
     * The minutes of inactivity before the screen times out.
     */
    private Integer passwordMinutesOfInactivityBeforeScreenTimeout;
    /**
     * The number of previous passwords to prevent re-use of. Valid values 0 to 24
     */
    private Integer passwordPreviousPasswordBlockCount;
    /**
     * Possible values of required passwords.
     */
    private RequiredPasswordType passwordRequiredType;
    /**
     * The number of sign in failures before factory reset.
     */
    private Integer passwordSignInFailureCountBeforeFactoryReset;
    /**
     * Indicates whether or not to require encryption on a mobile device.
     */
    private Boolean storageRequireDeviceEncryption;
    /**
     * Indicates whether or not to require automatic updates.
     */
    private Boolean updatesRequireAutomaticUpdates;
    /**
     * Possible values for Windows user account control settings.
     */
    private WindowsUserAccountControlSettings userAccountControlSettings;
    /**
     * The work folders url.
     */
    private String workFoldersUrl;
    /**
     * Instantiates a new windows81GeneralConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Windows81GeneralConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows81GeneralConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windows81GeneralConfiguration
     */
    @javax.annotation.Nonnull
    public static Windows81GeneralConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows81GeneralConfiguration();
    }
    /**
     * Gets the accountsBlockAddingNonMicrosoftAccountEmail property value. Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a Microsoft account.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAccountsBlockAddingNonMicrosoftAccountEmail() {
        return this.accountsBlockAddingNonMicrosoftAccountEmail;
    }
    /**
     * Gets the applyOnlyToWindows81 property value. Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplyOnlyToWindows81() {
        return this.applyOnlyToWindows81;
    }
    /**
     * Gets the browserBlockAutofill property value. Indicates whether or not to block auto fill.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserBlockAutofill() {
        return this.browserBlockAutofill;
    }
    /**
     * Gets the browserBlockAutomaticDetectionOfIntranetSites property value. Indicates whether or not to block automatic detection of Intranet sites.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserBlockAutomaticDetectionOfIntranetSites() {
        return this.browserBlockAutomaticDetectionOfIntranetSites;
    }
    /**
     * Gets the browserBlockEnterpriseModeAccess property value. Indicates whether or not to block enterprise mode access.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserBlockEnterpriseModeAccess() {
        return this.browserBlockEnterpriseModeAccess;
    }
    /**
     * Gets the browserBlockJavaScript property value. Indicates whether or not to Block the user from using JavaScript.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserBlockJavaScript() {
        return this.browserBlockJavaScript;
    }
    /**
     * Gets the browserBlockPlugins property value. Indicates whether or not to block plug-ins.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserBlockPlugins() {
        return this.browserBlockPlugins;
    }
    /**
     * Gets the browserBlockPopups property value. Indicates whether or not to block popups.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserBlockPopups() {
        return this.browserBlockPopups;
    }
    /**
     * Gets the browserBlockSendingDoNotTrackHeader property value. Indicates whether or not to Block the user from sending the do not track header.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserBlockSendingDoNotTrackHeader() {
        return this.browserBlockSendingDoNotTrackHeader;
    }
    /**
     * Gets the browserBlockSingleWordEntryOnIntranetSites property value. Indicates whether or not to block a single word entry on Intranet sites.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserBlockSingleWordEntryOnIntranetSites() {
        return this.browserBlockSingleWordEntryOnIntranetSites;
    }
    /**
     * Gets the browserEnterpriseModeSiteListLocation property value. The enterprise mode site list location. Could be a local file, local network or http location.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBrowserEnterpriseModeSiteListLocation() {
        return this.browserEnterpriseModeSiteListLocation;
    }
    /**
     * Gets the browserInternetSecurityLevel property value. Possible values for internet site security level.
     * @return a internetSiteSecurityLevel
     */
    @javax.annotation.Nullable
    public InternetSiteSecurityLevel getBrowserInternetSecurityLevel() {
        return this.browserInternetSecurityLevel;
    }
    /**
     * Gets the browserIntranetSecurityLevel property value. Possible values for site security level.
     * @return a siteSecurityLevel
     */
    @javax.annotation.Nullable
    public SiteSecurityLevel getBrowserIntranetSecurityLevel() {
        return this.browserIntranetSecurityLevel;
    }
    /**
     * Gets the browserLoggingReportLocation property value. The logging report location.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBrowserLoggingReportLocation() {
        return this.browserLoggingReportLocation;
    }
    /**
     * Gets the browserRequireFirewall property value. Indicates whether or not to require a firewall.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserRequireFirewall() {
        return this.browserRequireFirewall;
    }
    /**
     * Gets the browserRequireFraudWarning property value. Indicates whether or not to require fraud warning.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserRequireFraudWarning() {
        return this.browserRequireFraudWarning;
    }
    /**
     * Gets the browserRequireHighSecurityForRestrictedSites property value. Indicates whether or not to require high security for restricted sites.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserRequireHighSecurityForRestrictedSites() {
        return this.browserRequireHighSecurityForRestrictedSites;
    }
    /**
     * Gets the browserRequireSmartScreen property value. Indicates whether or not to require the user to use the smart screen filter.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserRequireSmartScreen() {
        return this.browserRequireSmartScreen;
    }
    /**
     * Gets the browserTrustedSitesSecurityLevel property value. Possible values for site security level.
     * @return a siteSecurityLevel
     */
    @javax.annotation.Nullable
    public SiteSecurityLevel getBrowserTrustedSitesSecurityLevel() {
        return this.browserTrustedSitesSecurityLevel;
    }
    /**
     * Gets the cellularBlockDataRoaming property value. Indicates whether or not to block data roaming.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockDataRoaming() {
        return this.cellularBlockDataRoaming;
    }
    /**
     * Gets the diagnosticsBlockDataSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDiagnosticsBlockDataSubmission() {
        return this.diagnosticsBlockDataSubmission;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockPicturePasswordAndPin() {
        return this.passwordBlockPicturePasswordAndPin;
    }
    /**
     * Gets the passwordExpirationDays property value. Password expiration in days.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.passwordExpirationDays;
    }
    /**
     * Gets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumCharacterSetCount() {
        return this.passwordMinimumCharacterSetCount;
    }
    /**
     * Gets the passwordMinimumLength property value. The minimum password length.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.passwordMinimumLength;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. The minutes of inactivity before the screen times out.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this.passwordMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent re-use of. Valid values 0 to 24
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequiredType property value. Possible values of required passwords.
     * @return a requiredPasswordType
     */
    @javax.annotation.Nullable
    public RequiredPasswordType getPasswordRequiredType() {
        return this.passwordRequiredType;
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. The number of sign in failures before factory reset.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this.passwordSignInFailureCountBeforeFactoryReset;
    }
    /**
     * Gets the storageRequireDeviceEncryption property value. Indicates whether or not to require encryption on a mobile device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRequireDeviceEncryption() {
        return this.storageRequireDeviceEncryption;
    }
    /**
     * Gets the updatesRequireAutomaticUpdates property value. Indicates whether or not to require automatic updates.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUpdatesRequireAutomaticUpdates() {
        return this.updatesRequireAutomaticUpdates;
    }
    /**
     * Gets the userAccountControlSettings property value. Possible values for Windows user account control settings.
     * @return a windowsUserAccountControlSettings
     */
    @javax.annotation.Nullable
    public WindowsUserAccountControlSettings getUserAccountControlSettings() {
        return this.userAccountControlSettings;
    }
    /**
     * Gets the workFoldersUrl property value. The work folders url.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWorkFoldersUrl() {
        return this.workFoldersUrl;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountsBlockAddingNonMicrosoftAccountEmail(@javax.annotation.Nullable final Boolean value) {
        this.accountsBlockAddingNonMicrosoftAccountEmail = value;
    }
    /**
     * Sets the applyOnlyToWindows81 property value. Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
     * @param value Value to set for the applyOnlyToWindows81 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplyOnlyToWindows81(@javax.annotation.Nullable final Boolean value) {
        this.applyOnlyToWindows81 = value;
    }
    /**
     * Sets the browserBlockAutofill property value. Indicates whether or not to block auto fill.
     * @param value Value to set for the browserBlockAutofill property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowserBlockAutofill(@javax.annotation.Nullable final Boolean value) {
        this.browserBlockAutofill = value;
    }
    /**
     * Sets the browserBlockAutomaticDetectionOfIntranetSites property value. Indicates whether or not to block automatic detection of Intranet sites.
     * @param value Value to set for the browserBlockAutomaticDetectionOfIntranetSites property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowserBlockAutomaticDetectionOfIntranetSites(@javax.annotation.Nullable final Boolean value) {
        this.browserBlockAutomaticDetectionOfIntranetSites = value;
    }
    /**
     * Sets the browserBlockEnterpriseModeAccess property value. Indicates whether or not to block enterprise mode access.
     * @param value Value to set for the browserBlockEnterpriseModeAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowserBlockEnterpriseModeAccess(@javax.annotation.Nullable final Boolean value) {
        this.browserBlockEnterpriseModeAccess = value;
    }
    /**
     * Sets the browserBlockJavaScript property value. Indicates whether or not to Block the user from using JavaScript.
     * @param value Value to set for the browserBlockJavaScript property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowserBlockJavaScript(@javax.annotation.Nullable final Boolean value) {
        this.browserBlockJavaScript = value;
    }
    /**
     * Sets the browserBlockPlugins property value. Indicates whether or not to block plug-ins.
     * @param value Value to set for the browserBlockPlugins property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowserBlockPlugins(@javax.annotation.Nullable final Boolean value) {
        this.browserBlockPlugins = value;
    }
    /**
     * Sets the browserBlockPopups property value. Indicates whether or not to block popups.
     * @param value Value to set for the browserBlockPopups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowserBlockPopups(@javax.annotation.Nullable final Boolean value) {
        this.browserBlockPopups = value;
    }
    /**
     * Sets the browserBlockSendingDoNotTrackHeader property value. Indicates whether or not to Block the user from sending the do not track header.
     * @param value Value to set for the browserBlockSendingDoNotTrackHeader property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowserBlockSendingDoNotTrackHeader(@javax.annotation.Nullable final Boolean value) {
        this.browserBlockSendingDoNotTrackHeader = value;
    }
    /**
     * Sets the browserBlockSingleWordEntryOnIntranetSites property value. Indicates whether or not to block a single word entry on Intranet sites.
     * @param value Value to set for the browserBlockSingleWordEntryOnIntranetSites property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowserBlockSingleWordEntryOnIntranetSites(@javax.annotation.Nullable final Boolean value) {
        this.browserBlockSingleWordEntryOnIntranetSites = value;
    }
    /**
     * Sets the browserEnterpriseModeSiteListLocation property value. The enterprise mode site list location. Could be a local file, local network or http location.
     * @param value Value to set for the browserEnterpriseModeSiteListLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowserEnterpriseModeSiteListLocation(@javax.annotation.Nullable final String value) {
        this.browserEnterpriseModeSiteListLocation = value;
    }
    /**
     * Sets the browserInternetSecurityLevel property value. Possible values for internet site security level.
     * @param value Value to set for the browserInternetSecurityLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowserInternetSecurityLevel(@javax.annotation.Nullable final InternetSiteSecurityLevel value) {
        this.browserInternetSecurityLevel = value;
    }
    /**
     * Sets the browserIntranetSecurityLevel property value. Possible values for site security level.
     * @param value Value to set for the browserIntranetSecurityLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowserIntranetSecurityLevel(@javax.annotation.Nullable final SiteSecurityLevel value) {
        this.browserIntranetSecurityLevel = value;
    }
    /**
     * Sets the browserLoggingReportLocation property value. The logging report location.
     * @param value Value to set for the browserLoggingReportLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowserLoggingReportLocation(@javax.annotation.Nullable final String value) {
        this.browserLoggingReportLocation = value;
    }
    /**
     * Sets the browserRequireFirewall property value. Indicates whether or not to require a firewall.
     * @param value Value to set for the browserRequireFirewall property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowserRequireFirewall(@javax.annotation.Nullable final Boolean value) {
        this.browserRequireFirewall = value;
    }
    /**
     * Sets the browserRequireFraudWarning property value. Indicates whether or not to require fraud warning.
     * @param value Value to set for the browserRequireFraudWarning property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowserRequireFraudWarning(@javax.annotation.Nullable final Boolean value) {
        this.browserRequireFraudWarning = value;
    }
    /**
     * Sets the browserRequireHighSecurityForRestrictedSites property value. Indicates whether or not to require high security for restricted sites.
     * @param value Value to set for the browserRequireHighSecurityForRestrictedSites property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowserRequireHighSecurityForRestrictedSites(@javax.annotation.Nullable final Boolean value) {
        this.browserRequireHighSecurityForRestrictedSites = value;
    }
    /**
     * Sets the browserRequireSmartScreen property value. Indicates whether or not to require the user to use the smart screen filter.
     * @param value Value to set for the browserRequireSmartScreen property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowserRequireSmartScreen(@javax.annotation.Nullable final Boolean value) {
        this.browserRequireSmartScreen = value;
    }
    /**
     * Sets the browserTrustedSitesSecurityLevel property value. Possible values for site security level.
     * @param value Value to set for the browserTrustedSitesSecurityLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowserTrustedSitesSecurityLevel(@javax.annotation.Nullable final SiteSecurityLevel value) {
        this.browserTrustedSitesSecurityLevel = value;
    }
    /**
     * Sets the cellularBlockDataRoaming property value. Indicates whether or not to block data roaming.
     * @param value Value to set for the cellularBlockDataRoaming property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockDataRoaming(@javax.annotation.Nullable final Boolean value) {
        this.cellularBlockDataRoaming = value;
    }
    /**
     * Sets the diagnosticsBlockDataSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @param value Value to set for the diagnosticsBlockDataSubmission property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiagnosticsBlockDataSubmission(@javax.annotation.Nullable final Boolean value) {
        this.diagnosticsBlockDataSubmission = value;
    }
    /**
     * Sets the passwordBlockPicturePasswordAndPin property value. Indicates whether or not to Block the user from using a pictures password and pin.
     * @param value Value to set for the passwordBlockPicturePasswordAndPin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockPicturePasswordAndPin(@javax.annotation.Nullable final Boolean value) {
        this.passwordBlockPicturePasswordAndPin = value;
    }
    /**
     * Sets the passwordExpirationDays property value. Password expiration in days.
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this.passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumCharacterSetCount(@javax.annotation.Nullable final Integer value) {
        this.passwordMinimumCharacterSetCount = value;
    }
    /**
     * Sets the passwordMinimumLength property value. The minimum password length.
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this.passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. The minutes of inactivity before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@javax.annotation.Nullable final Integer value) {
        this.passwordMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent re-use of. Valid values 0 to 24
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordPreviousPasswordBlockCount(@javax.annotation.Nullable final Integer value) {
        this.passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequiredType(@javax.annotation.Nullable final RequiredPasswordType value) {
        this.passwordRequiredType = value;
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. The number of sign in failures before factory reset.
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordSignInFailureCountBeforeFactoryReset(@javax.annotation.Nullable final Integer value) {
        this.passwordSignInFailureCountBeforeFactoryReset = value;
    }
    /**
     * Sets the storageRequireDeviceEncryption property value. Indicates whether or not to require encryption on a mobile device.
     * @param value Value to set for the storageRequireDeviceEncryption property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageRequireDeviceEncryption(@javax.annotation.Nullable final Boolean value) {
        this.storageRequireDeviceEncryption = value;
    }
    /**
     * Sets the updatesRequireAutomaticUpdates property value. Indicates whether or not to require automatic updates.
     * @param value Value to set for the updatesRequireAutomaticUpdates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdatesRequireAutomaticUpdates(@javax.annotation.Nullable final Boolean value) {
        this.updatesRequireAutomaticUpdates = value;
    }
    /**
     * Sets the userAccountControlSettings property value. Possible values for Windows user account control settings.
     * @param value Value to set for the userAccountControlSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserAccountControlSettings(@javax.annotation.Nullable final WindowsUserAccountControlSettings value) {
        this.userAccountControlSettings = value;
    }
    /**
     * Sets the workFoldersUrl property value. The work folders url.
     * @param value Value to set for the workFoldersUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkFoldersUrl(@javax.annotation.Nullable final String value) {
        this.workFoldersUrl = value;
    }
}
