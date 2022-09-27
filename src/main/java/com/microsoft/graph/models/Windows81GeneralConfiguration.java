package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows81GeneralConfiguration extends DeviceConfiguration implements Parsable {
    /** Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a Microsoft account. */
    private Boolean _accountsBlockAddingNonMicrosoftAccountEmail;
    /** Value indicating whether this policy only applies to Windows 8.1. This property is read-only. */
    private Boolean _applyOnlyToWindows81;
    /** Indicates whether or not to block auto fill. */
    private Boolean _browserBlockAutofill;
    /** Indicates whether or not to block automatic detection of Intranet sites. */
    private Boolean _browserBlockAutomaticDetectionOfIntranetSites;
    /** Indicates whether or not to block enterprise mode access. */
    private Boolean _browserBlockEnterpriseModeAccess;
    /** Indicates whether or not to Block the user from using JavaScript. */
    private Boolean _browserBlockJavaScript;
    /** Indicates whether or not to block plug-ins. */
    private Boolean _browserBlockPlugins;
    /** Indicates whether or not to block popups. */
    private Boolean _browserBlockPopups;
    /** Indicates whether or not to Block the user from sending the do not track header. */
    private Boolean _browserBlockSendingDoNotTrackHeader;
    /** Indicates whether or not to block a single word entry on Intranet sites. */
    private Boolean _browserBlockSingleWordEntryOnIntranetSites;
    /** The enterprise mode site list location. Could be a local file, local network or http location. */
    private String _browserEnterpriseModeSiteListLocation;
    /** Possible values for internet site security level. */
    private InternetSiteSecurityLevel _browserInternetSecurityLevel;
    /** Possible values for site security level. */
    private SiteSecurityLevel _browserIntranetSecurityLevel;
    /** The logging report location. */
    private String _browserLoggingReportLocation;
    /** Indicates whether or not to require a firewall. */
    private Boolean _browserRequireFirewall;
    /** Indicates whether or not to require fraud warning. */
    private Boolean _browserRequireFraudWarning;
    /** Indicates whether or not to require high security for restricted sites. */
    private Boolean _browserRequireHighSecurityForRestrictedSites;
    /** Indicates whether or not to require the user to use the smart screen filter. */
    private Boolean _browserRequireSmartScreen;
    /** Possible values for site security level. */
    private SiteSecurityLevel _browserTrustedSitesSecurityLevel;
    /** Indicates whether or not to block data roaming. */
    private Boolean _cellularBlockDataRoaming;
    /** Indicates whether or not to block diagnostic data submission. */
    private Boolean _diagnosticsBlockDataSubmission;
    /** Indicates whether or not to Block the user from using a pictures password and pin. */
    private Boolean _passwordBlockPicturePasswordAndPin;
    /** Password expiration in days. */
    private Integer _passwordExpirationDays;
    /** The number of character sets required in the password. */
    private Integer _passwordMinimumCharacterSetCount;
    /** The minimum password length. */
    private Integer _passwordMinimumLength;
    /** The minutes of inactivity before the screen times out. */
    private Integer _passwordMinutesOfInactivityBeforeScreenTimeout;
    /** The number of previous passwords to prevent re-use of. Valid values 0 to 24 */
    private Integer _passwordPreviousPasswordBlockCount;
    /** Possible values of required passwords. */
    private RequiredPasswordType _passwordRequiredType;
    /** The number of sign in failures before factory reset. */
    private Integer _passwordSignInFailureCountBeforeFactoryReset;
    /** Indicates whether or not to require encryption on a mobile device. */
    private Boolean _storageRequireDeviceEncryption;
    /** Indicates whether or not to require automatic updates. */
    private Boolean _updatesRequireAutomaticUpdates;
    /** Possible values for Windows user account control settings. */
    private WindowsUserAccountControlSettings _userAccountControlSettings;
    /** The work folders url. */
    private String _workFoldersUrl;
    /**
     * Instantiates a new Windows81GeneralConfiguration and sets the default values.
     * @return a void
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
        return this._accountsBlockAddingNonMicrosoftAccountEmail;
    }
    /**
     * Gets the applyOnlyToWindows81 property value. Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplyOnlyToWindows81() {
        return this._applyOnlyToWindows81;
    }
    /**
     * Gets the browserBlockAutofill property value. Indicates whether or not to block auto fill.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserBlockAutofill() {
        return this._browserBlockAutofill;
    }
    /**
     * Gets the browserBlockAutomaticDetectionOfIntranetSites property value. Indicates whether or not to block automatic detection of Intranet sites.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserBlockAutomaticDetectionOfIntranetSites() {
        return this._browserBlockAutomaticDetectionOfIntranetSites;
    }
    /**
     * Gets the browserBlockEnterpriseModeAccess property value. Indicates whether or not to block enterprise mode access.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserBlockEnterpriseModeAccess() {
        return this._browserBlockEnterpriseModeAccess;
    }
    /**
     * Gets the browserBlockJavaScript property value. Indicates whether or not to Block the user from using JavaScript.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserBlockJavaScript() {
        return this._browserBlockJavaScript;
    }
    /**
     * Gets the browserBlockPlugins property value. Indicates whether or not to block plug-ins.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserBlockPlugins() {
        return this._browserBlockPlugins;
    }
    /**
     * Gets the browserBlockPopups property value. Indicates whether or not to block popups.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserBlockPopups() {
        return this._browserBlockPopups;
    }
    /**
     * Gets the browserBlockSendingDoNotTrackHeader property value. Indicates whether or not to Block the user from sending the do not track header.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserBlockSendingDoNotTrackHeader() {
        return this._browserBlockSendingDoNotTrackHeader;
    }
    /**
     * Gets the browserBlockSingleWordEntryOnIntranetSites property value. Indicates whether or not to block a single word entry on Intranet sites.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserBlockSingleWordEntryOnIntranetSites() {
        return this._browserBlockSingleWordEntryOnIntranetSites;
    }
    /**
     * Gets the browserEnterpriseModeSiteListLocation property value. The enterprise mode site list location. Could be a local file, local network or http location.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBrowserEnterpriseModeSiteListLocation() {
        return this._browserEnterpriseModeSiteListLocation;
    }
    /**
     * Gets the browserInternetSecurityLevel property value. Possible values for internet site security level.
     * @return a internetSiteSecurityLevel
     */
    @javax.annotation.Nullable
    public InternetSiteSecurityLevel getBrowserInternetSecurityLevel() {
        return this._browserInternetSecurityLevel;
    }
    /**
     * Gets the browserIntranetSecurityLevel property value. Possible values for site security level.
     * @return a siteSecurityLevel
     */
    @javax.annotation.Nullable
    public SiteSecurityLevel getBrowserIntranetSecurityLevel() {
        return this._browserIntranetSecurityLevel;
    }
    /**
     * Gets the browserLoggingReportLocation property value. The logging report location.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBrowserLoggingReportLocation() {
        return this._browserLoggingReportLocation;
    }
    /**
     * Gets the browserRequireFirewall property value. Indicates whether or not to require a firewall.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserRequireFirewall() {
        return this._browserRequireFirewall;
    }
    /**
     * Gets the browserRequireFraudWarning property value. Indicates whether or not to require fraud warning.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserRequireFraudWarning() {
        return this._browserRequireFraudWarning;
    }
    /**
     * Gets the browserRequireHighSecurityForRestrictedSites property value. Indicates whether or not to require high security for restricted sites.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserRequireHighSecurityForRestrictedSites() {
        return this._browserRequireHighSecurityForRestrictedSites;
    }
    /**
     * Gets the browserRequireSmartScreen property value. Indicates whether or not to require the user to use the smart screen filter.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBrowserRequireSmartScreen() {
        return this._browserRequireSmartScreen;
    }
    /**
     * Gets the browserTrustedSitesSecurityLevel property value. Possible values for site security level.
     * @return a siteSecurityLevel
     */
    @javax.annotation.Nullable
    public SiteSecurityLevel getBrowserTrustedSitesSecurityLevel() {
        return this._browserTrustedSitesSecurityLevel;
    }
    /**
     * Gets the cellularBlockDataRoaming property value. Indicates whether or not to block data roaming.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockDataRoaming() {
        return this._cellularBlockDataRoaming;
    }
    /**
     * Gets the diagnosticsBlockDataSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDiagnosticsBlockDataSubmission() {
        return this._diagnosticsBlockDataSubmission;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows81GeneralConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("accountsBlockAddingNonMicrosoftAccountEmail", (n) -> { currentObject.setAccountsBlockAddingNonMicrosoftAccountEmail(n.getBooleanValue()); });
            this.put("applyOnlyToWindows81", (n) -> { currentObject.setApplyOnlyToWindows81(n.getBooleanValue()); });
            this.put("browserBlockAutofill", (n) -> { currentObject.setBrowserBlockAutofill(n.getBooleanValue()); });
            this.put("browserBlockAutomaticDetectionOfIntranetSites", (n) -> { currentObject.setBrowserBlockAutomaticDetectionOfIntranetSites(n.getBooleanValue()); });
            this.put("browserBlockEnterpriseModeAccess", (n) -> { currentObject.setBrowserBlockEnterpriseModeAccess(n.getBooleanValue()); });
            this.put("browserBlockJavaScript", (n) -> { currentObject.setBrowserBlockJavaScript(n.getBooleanValue()); });
            this.put("browserBlockPlugins", (n) -> { currentObject.setBrowserBlockPlugins(n.getBooleanValue()); });
            this.put("browserBlockPopups", (n) -> { currentObject.setBrowserBlockPopups(n.getBooleanValue()); });
            this.put("browserBlockSendingDoNotTrackHeader", (n) -> { currentObject.setBrowserBlockSendingDoNotTrackHeader(n.getBooleanValue()); });
            this.put("browserBlockSingleWordEntryOnIntranetSites", (n) -> { currentObject.setBrowserBlockSingleWordEntryOnIntranetSites(n.getBooleanValue()); });
            this.put("browserEnterpriseModeSiteListLocation", (n) -> { currentObject.setBrowserEnterpriseModeSiteListLocation(n.getStringValue()); });
            this.put("browserInternetSecurityLevel", (n) -> { currentObject.setBrowserInternetSecurityLevel(n.getEnumValue(InternetSiteSecurityLevel.class)); });
            this.put("browserIntranetSecurityLevel", (n) -> { currentObject.setBrowserIntranetSecurityLevel(n.getEnumValue(SiteSecurityLevel.class)); });
            this.put("browserLoggingReportLocation", (n) -> { currentObject.setBrowserLoggingReportLocation(n.getStringValue()); });
            this.put("browserRequireFirewall", (n) -> { currentObject.setBrowserRequireFirewall(n.getBooleanValue()); });
            this.put("browserRequireFraudWarning", (n) -> { currentObject.setBrowserRequireFraudWarning(n.getBooleanValue()); });
            this.put("browserRequireHighSecurityForRestrictedSites", (n) -> { currentObject.setBrowserRequireHighSecurityForRestrictedSites(n.getBooleanValue()); });
            this.put("browserRequireSmartScreen", (n) -> { currentObject.setBrowserRequireSmartScreen(n.getBooleanValue()); });
            this.put("browserTrustedSitesSecurityLevel", (n) -> { currentObject.setBrowserTrustedSitesSecurityLevel(n.getEnumValue(SiteSecurityLevel.class)); });
            this.put("cellularBlockDataRoaming", (n) -> { currentObject.setCellularBlockDataRoaming(n.getBooleanValue()); });
            this.put("diagnosticsBlockDataSubmission", (n) -> { currentObject.setDiagnosticsBlockDataSubmission(n.getBooleanValue()); });
            this.put("passwordBlockPicturePasswordAndPin", (n) -> { currentObject.setPasswordBlockPicturePasswordAndPin(n.getBooleanValue()); });
            this.put("passwordExpirationDays", (n) -> { currentObject.setPasswordExpirationDays(n.getIntegerValue()); });
            this.put("passwordMinimumCharacterSetCount", (n) -> { currentObject.setPasswordMinimumCharacterSetCount(n.getIntegerValue()); });
            this.put("passwordMinimumLength", (n) -> { currentObject.setPasswordMinimumLength(n.getIntegerValue()); });
            this.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { currentObject.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
            this.put("passwordPreviousPasswordBlockCount", (n) -> { currentObject.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
            this.put("passwordRequiredType", (n) -> { currentObject.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
            this.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { currentObject.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
            this.put("storageRequireDeviceEncryption", (n) -> { currentObject.setStorageRequireDeviceEncryption(n.getBooleanValue()); });
            this.put("updatesRequireAutomaticUpdates", (n) -> { currentObject.setUpdatesRequireAutomaticUpdates(n.getBooleanValue()); });
            this.put("userAccountControlSettings", (n) -> { currentObject.setUserAccountControlSettings(n.getEnumValue(WindowsUserAccountControlSettings.class)); });
            this.put("workFoldersUrl", (n) -> { currentObject.setWorkFoldersUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the passwordBlockPicturePasswordAndPin property value. Indicates whether or not to Block the user from using a pictures password and pin.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockPicturePasswordAndPin() {
        return this._passwordBlockPicturePasswordAndPin;
    }
    /**
     * Gets the passwordExpirationDays property value. Password expiration in days.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this._passwordExpirationDays;
    }
    /**
     * Gets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumCharacterSetCount() {
        return this._passwordMinimumCharacterSetCount;
    }
    /**
     * Gets the passwordMinimumLength property value. The minimum password length.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this._passwordMinimumLength;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. The minutes of inactivity before the screen times out.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this._passwordMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent re-use of. Valid values 0 to 24
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this._passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequiredType property value. Possible values of required passwords.
     * @return a requiredPasswordType
     */
    @javax.annotation.Nullable
    public RequiredPasswordType getPasswordRequiredType() {
        return this._passwordRequiredType;
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. The number of sign in failures before factory reset.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this._passwordSignInFailureCountBeforeFactoryReset;
    }
    /**
     * Gets the storageRequireDeviceEncryption property value. Indicates whether or not to require encryption on a mobile device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRequireDeviceEncryption() {
        return this._storageRequireDeviceEncryption;
    }
    /**
     * Gets the updatesRequireAutomaticUpdates property value. Indicates whether or not to require automatic updates.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUpdatesRequireAutomaticUpdates() {
        return this._updatesRequireAutomaticUpdates;
    }
    /**
     * Gets the userAccountControlSettings property value. Possible values for Windows user account control settings.
     * @return a windowsUserAccountControlSettings
     */
    @javax.annotation.Nullable
    public WindowsUserAccountControlSettings getUserAccountControlSettings() {
        return this._userAccountControlSettings;
    }
    /**
     * Gets the workFoldersUrl property value. The work folders url.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWorkFoldersUrl() {
        return this._workFoldersUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAccountsBlockAddingNonMicrosoftAccountEmail(@javax.annotation.Nullable final Boolean value) {
        this._accountsBlockAddingNonMicrosoftAccountEmail = value;
    }
    /**
     * Sets the applyOnlyToWindows81 property value. Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
     * @param value Value to set for the applyOnlyToWindows81 property.
     * @return a void
     */
    public void setApplyOnlyToWindows81(@javax.annotation.Nullable final Boolean value) {
        this._applyOnlyToWindows81 = value;
    }
    /**
     * Sets the browserBlockAutofill property value. Indicates whether or not to block auto fill.
     * @param value Value to set for the browserBlockAutofill property.
     * @return a void
     */
    public void setBrowserBlockAutofill(@javax.annotation.Nullable final Boolean value) {
        this._browserBlockAutofill = value;
    }
    /**
     * Sets the browserBlockAutomaticDetectionOfIntranetSites property value. Indicates whether or not to block automatic detection of Intranet sites.
     * @param value Value to set for the browserBlockAutomaticDetectionOfIntranetSites property.
     * @return a void
     */
    public void setBrowserBlockAutomaticDetectionOfIntranetSites(@javax.annotation.Nullable final Boolean value) {
        this._browserBlockAutomaticDetectionOfIntranetSites = value;
    }
    /**
     * Sets the browserBlockEnterpriseModeAccess property value. Indicates whether or not to block enterprise mode access.
     * @param value Value to set for the browserBlockEnterpriseModeAccess property.
     * @return a void
     */
    public void setBrowserBlockEnterpriseModeAccess(@javax.annotation.Nullable final Boolean value) {
        this._browserBlockEnterpriseModeAccess = value;
    }
    /**
     * Sets the browserBlockJavaScript property value. Indicates whether or not to Block the user from using JavaScript.
     * @param value Value to set for the browserBlockJavaScript property.
     * @return a void
     */
    public void setBrowserBlockJavaScript(@javax.annotation.Nullable final Boolean value) {
        this._browserBlockJavaScript = value;
    }
    /**
     * Sets the browserBlockPlugins property value. Indicates whether or not to block plug-ins.
     * @param value Value to set for the browserBlockPlugins property.
     * @return a void
     */
    public void setBrowserBlockPlugins(@javax.annotation.Nullable final Boolean value) {
        this._browserBlockPlugins = value;
    }
    /**
     * Sets the browserBlockPopups property value. Indicates whether or not to block popups.
     * @param value Value to set for the browserBlockPopups property.
     * @return a void
     */
    public void setBrowserBlockPopups(@javax.annotation.Nullable final Boolean value) {
        this._browserBlockPopups = value;
    }
    /**
     * Sets the browserBlockSendingDoNotTrackHeader property value. Indicates whether or not to Block the user from sending the do not track header.
     * @param value Value to set for the browserBlockSendingDoNotTrackHeader property.
     * @return a void
     */
    public void setBrowserBlockSendingDoNotTrackHeader(@javax.annotation.Nullable final Boolean value) {
        this._browserBlockSendingDoNotTrackHeader = value;
    }
    /**
     * Sets the browserBlockSingleWordEntryOnIntranetSites property value. Indicates whether or not to block a single word entry on Intranet sites.
     * @param value Value to set for the browserBlockSingleWordEntryOnIntranetSites property.
     * @return a void
     */
    public void setBrowserBlockSingleWordEntryOnIntranetSites(@javax.annotation.Nullable final Boolean value) {
        this._browserBlockSingleWordEntryOnIntranetSites = value;
    }
    /**
     * Sets the browserEnterpriseModeSiteListLocation property value. The enterprise mode site list location. Could be a local file, local network or http location.
     * @param value Value to set for the browserEnterpriseModeSiteListLocation property.
     * @return a void
     */
    public void setBrowserEnterpriseModeSiteListLocation(@javax.annotation.Nullable final String value) {
        this._browserEnterpriseModeSiteListLocation = value;
    }
    /**
     * Sets the browserInternetSecurityLevel property value. Possible values for internet site security level.
     * @param value Value to set for the browserInternetSecurityLevel property.
     * @return a void
     */
    public void setBrowserInternetSecurityLevel(@javax.annotation.Nullable final InternetSiteSecurityLevel value) {
        this._browserInternetSecurityLevel = value;
    }
    /**
     * Sets the browserIntranetSecurityLevel property value. Possible values for site security level.
     * @param value Value to set for the browserIntranetSecurityLevel property.
     * @return a void
     */
    public void setBrowserIntranetSecurityLevel(@javax.annotation.Nullable final SiteSecurityLevel value) {
        this._browserIntranetSecurityLevel = value;
    }
    /**
     * Sets the browserLoggingReportLocation property value. The logging report location.
     * @param value Value to set for the browserLoggingReportLocation property.
     * @return a void
     */
    public void setBrowserLoggingReportLocation(@javax.annotation.Nullable final String value) {
        this._browserLoggingReportLocation = value;
    }
    /**
     * Sets the browserRequireFirewall property value. Indicates whether or not to require a firewall.
     * @param value Value to set for the browserRequireFirewall property.
     * @return a void
     */
    public void setBrowserRequireFirewall(@javax.annotation.Nullable final Boolean value) {
        this._browserRequireFirewall = value;
    }
    /**
     * Sets the browserRequireFraudWarning property value. Indicates whether or not to require fraud warning.
     * @param value Value to set for the browserRequireFraudWarning property.
     * @return a void
     */
    public void setBrowserRequireFraudWarning(@javax.annotation.Nullable final Boolean value) {
        this._browserRequireFraudWarning = value;
    }
    /**
     * Sets the browserRequireHighSecurityForRestrictedSites property value. Indicates whether or not to require high security for restricted sites.
     * @param value Value to set for the browserRequireHighSecurityForRestrictedSites property.
     * @return a void
     */
    public void setBrowserRequireHighSecurityForRestrictedSites(@javax.annotation.Nullable final Boolean value) {
        this._browserRequireHighSecurityForRestrictedSites = value;
    }
    /**
     * Sets the browserRequireSmartScreen property value. Indicates whether or not to require the user to use the smart screen filter.
     * @param value Value to set for the browserRequireSmartScreen property.
     * @return a void
     */
    public void setBrowserRequireSmartScreen(@javax.annotation.Nullable final Boolean value) {
        this._browserRequireSmartScreen = value;
    }
    /**
     * Sets the browserTrustedSitesSecurityLevel property value. Possible values for site security level.
     * @param value Value to set for the browserTrustedSitesSecurityLevel property.
     * @return a void
     */
    public void setBrowserTrustedSitesSecurityLevel(@javax.annotation.Nullable final SiteSecurityLevel value) {
        this._browserTrustedSitesSecurityLevel = value;
    }
    /**
     * Sets the cellularBlockDataRoaming property value. Indicates whether or not to block data roaming.
     * @param value Value to set for the cellularBlockDataRoaming property.
     * @return a void
     */
    public void setCellularBlockDataRoaming(@javax.annotation.Nullable final Boolean value) {
        this._cellularBlockDataRoaming = value;
    }
    /**
     * Sets the diagnosticsBlockDataSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @param value Value to set for the diagnosticsBlockDataSubmission property.
     * @return a void
     */
    public void setDiagnosticsBlockDataSubmission(@javax.annotation.Nullable final Boolean value) {
        this._diagnosticsBlockDataSubmission = value;
    }
    /**
     * Sets the passwordBlockPicturePasswordAndPin property value. Indicates whether or not to Block the user from using a pictures password and pin.
     * @param value Value to set for the passwordBlockPicturePasswordAndPin property.
     * @return a void
     */
    public void setPasswordBlockPicturePasswordAndPin(@javax.annotation.Nullable final Boolean value) {
        this._passwordBlockPicturePasswordAndPin = value;
    }
    /**
     * Sets the passwordExpirationDays property value. Password expiration in days.
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this._passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     * @return a void
     */
    public void setPasswordMinimumCharacterSetCount(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumCharacterSetCount = value;
    }
    /**
     * Sets the passwordMinimumLength property value. The minimum password length.
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. The minutes of inactivity before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     * @return a void
     */
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@javax.annotation.Nullable final Integer value) {
        this._passwordMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent re-use of. Valid values 0 to 24
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     * @return a void
     */
    public void setPasswordPreviousPasswordBlockCount(@javax.annotation.Nullable final Integer value) {
        this._passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    public void setPasswordRequiredType(@javax.annotation.Nullable final RequiredPasswordType value) {
        this._passwordRequiredType = value;
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. The number of sign in failures before factory reset.
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     * @return a void
     */
    public void setPasswordSignInFailureCountBeforeFactoryReset(@javax.annotation.Nullable final Integer value) {
        this._passwordSignInFailureCountBeforeFactoryReset = value;
    }
    /**
     * Sets the storageRequireDeviceEncryption property value. Indicates whether or not to require encryption on a mobile device.
     * @param value Value to set for the storageRequireDeviceEncryption property.
     * @return a void
     */
    public void setStorageRequireDeviceEncryption(@javax.annotation.Nullable final Boolean value) {
        this._storageRequireDeviceEncryption = value;
    }
    /**
     * Sets the updatesRequireAutomaticUpdates property value. Indicates whether or not to require automatic updates.
     * @param value Value to set for the updatesRequireAutomaticUpdates property.
     * @return a void
     */
    public void setUpdatesRequireAutomaticUpdates(@javax.annotation.Nullable final Boolean value) {
        this._updatesRequireAutomaticUpdates = value;
    }
    /**
     * Sets the userAccountControlSettings property value. Possible values for Windows user account control settings.
     * @param value Value to set for the userAccountControlSettings property.
     * @return a void
     */
    public void setUserAccountControlSettings(@javax.annotation.Nullable final WindowsUserAccountControlSettings value) {
        this._userAccountControlSettings = value;
    }
    /**
     * Sets the workFoldersUrl property value. The work folders url.
     * @param value Value to set for the workFoldersUrl property.
     * @return a void
     */
    public void setWorkFoldersUrl(@javax.annotation.Nullable final String value) {
        this._workFoldersUrl = value;
    }
}
