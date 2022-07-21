package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidGeneralDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /** Indicates whether or not to block clipboard sharing to copy and paste between applications. */
    private Boolean _appsBlockClipboardSharing;
    /** Indicates whether or not to block copy and paste within applications. */
    private Boolean _appsBlockCopyPaste;
    /** Indicates whether or not to block the YouTube app. */
    private Boolean _appsBlockYouTube;
    /** List of apps to be hidden on the KNOX device. This collection can contain a maximum of 500 elements. */
    private java.util.List<AppListItem> _appsHideList;
    /** List of apps which can be installed on the KNOX device. This collection can contain a maximum of 500 elements. */
    private java.util.List<AppListItem> _appsInstallAllowList;
    /** List of apps which are blocked from being launched on the KNOX device. This collection can contain a maximum of 500 elements. */
    private java.util.List<AppListItem> _appsLaunchBlockList;
    /** Indicates whether or not to block Bluetooth. */
    private Boolean _bluetoothBlocked;
    /** Indicates whether or not to block the use of the camera. */
    private Boolean _cameraBlocked;
    /** Indicates whether or not to block data roaming. */
    private Boolean _cellularBlockDataRoaming;
    /** Indicates whether or not to block SMS/MMS messaging. */
    private Boolean _cellularBlockMessaging;
    /** Indicates whether or not to block voice roaming. */
    private Boolean _cellularBlockVoiceRoaming;
    /** Indicates whether or not to block syncing Wi-Fi tethering. */
    private Boolean _cellularBlockWiFiTethering;
    /** Possible values of the compliance app list. */
    private AppListType _compliantAppListType;
    /** List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements. */
    private java.util.List<AppListItem> _compliantAppsList;
    /** Indicates whether or not to allow device sharing mode. */
    private Boolean _deviceSharingAllowed;
    /** Indicates whether or not to block diagnostic data submission. */
    private Boolean _diagnosticDataBlockSubmission;
    /** Indicates whether or not to block user performing a factory reset. */
    private Boolean _factoryResetBlocked;
    /** Indicates whether or not to block Google account auto sync. */
    private Boolean _googleAccountBlockAutoSync;
    /** Indicates whether or not to block the Google Play store. */
    private Boolean _googlePlayStoreBlocked;
    /** A list of apps that will be allowed to run when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements. */
    private java.util.List<AppListItem> _kioskModeApps;
    /** Indicates whether or not to block the screen sleep button while in Kiosk Mode. */
    private Boolean _kioskModeBlockSleepButton;
    /** Indicates whether or not to block the volume buttons while in Kiosk Mode. */
    private Boolean _kioskModeBlockVolumeButtons;
    /** Indicates whether or not to block location services. */
    private Boolean _locationServicesBlocked;
    /** Indicates whether or not to block Near-Field Communication. */
    private Boolean _nfcBlocked;
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
    /** Indicates whether or not to require a password. */
    private Boolean _passwordRequired;
    /** Android required password type. */
    private AndroidRequiredPasswordType _passwordRequiredType;
    /** Number of sign in failures allowed before factory reset. Valid values 1 to 16 */
    private Integer _passwordSignInFailureCountBeforeFactoryReset;
    /** Indicates whether or not to block powering off the device. */
    private Boolean _powerOffBlocked;
    /** Indicates whether or not to block screenshots. */
    private Boolean _screenCaptureBlocked;
    /** Require the Android Verify apps feature is turned on. */
    private Boolean _securityRequireVerifyApps;
    /** Indicates whether or not to block Google Backup. */
    private Boolean _storageBlockGoogleBackup;
    /** Indicates whether or not to block removable storage usage. */
    private Boolean _storageBlockRemovableStorage;
    /** Indicates whether or not to require device encryption. */
    private Boolean _storageRequireDeviceEncryption;
    /** Indicates whether or not to require removable storage encryption. */
    private Boolean _storageRequireRemovableStorageEncryption;
    /** Indicates whether or not to block the use of the Voice Assistant. */
    private Boolean _voiceAssistantBlocked;
    /** Indicates whether or not to block voice dialing. */
    private Boolean _voiceDialingBlocked;
    /** Indicates whether or not to block the web browser's auto fill feature. */
    private Boolean _webBrowserBlockAutofill;
    /** Indicates whether or not to block the web browser. */
    private Boolean _webBrowserBlocked;
    /** Indicates whether or not to block JavaScript within the web browser. */
    private Boolean _webBrowserBlockJavaScript;
    /** Indicates whether or not to block popups within the web browser. */
    private Boolean _webBrowserBlockPopups;
    /** Web Browser Cookie Settings. */
    private WebBrowserCookieSettings _webBrowserCookieSettings;
    /** Indicates whether or not to block syncing Wi-Fi. */
    private Boolean _wiFiBlocked;
    /**
     * Instantiates a new AndroidGeneralDeviceConfiguration and sets the default values.
     * @return a void
     */
    public AndroidGeneralDeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidGeneralDeviceConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidGeneralDeviceConfiguration
     */
    @javax.annotation.Nonnull
    public static AndroidGeneralDeviceConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidGeneralDeviceConfiguration();
    }
    /**
     * Gets the appsBlockClipboardSharing property value. Indicates whether or not to block clipboard sharing to copy and paste between applications.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppsBlockClipboardSharing() {
        return this._appsBlockClipboardSharing;
    }
    /**
     * Gets the appsBlockCopyPaste property value. Indicates whether or not to block copy and paste within applications.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppsBlockCopyPaste() {
        return this._appsBlockCopyPaste;
    }
    /**
     * Gets the appsBlockYouTube property value. Indicates whether or not to block the YouTube app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppsBlockYouTube() {
        return this._appsBlockYouTube;
    }
    /**
     * Gets the appsHideList property value. List of apps to be hidden on the KNOX device. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getAppsHideList() {
        return this._appsHideList;
    }
    /**
     * Gets the appsInstallAllowList property value. List of apps which can be installed on the KNOX device. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getAppsInstallAllowList() {
        return this._appsInstallAllowList;
    }
    /**
     * Gets the appsLaunchBlockList property value. List of apps which are blocked from being launched on the KNOX device. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getAppsLaunchBlockList() {
        return this._appsLaunchBlockList;
    }
    /**
     * Gets the bluetoothBlocked property value. Indicates whether or not to block Bluetooth.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlocked() {
        return this._bluetoothBlocked;
    }
    /**
     * Gets the cameraBlocked property value. Indicates whether or not to block the use of the camera.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this._cameraBlocked;
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
     * Gets the cellularBlockMessaging property value. Indicates whether or not to block SMS/MMS messaging.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockMessaging() {
        return this._cellularBlockMessaging;
    }
    /**
     * Gets the cellularBlockVoiceRoaming property value. Indicates whether or not to block voice roaming.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockVoiceRoaming() {
        return this._cellularBlockVoiceRoaming;
    }
    /**
     * Gets the cellularBlockWiFiTethering property value. Indicates whether or not to block syncing Wi-Fi tethering.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockWiFiTethering() {
        return this._cellularBlockWiFiTethering;
    }
    /**
     * Gets the compliantAppListType property value. Possible values of the compliance app list.
     * @return a appListType
     */
    @javax.annotation.Nullable
    public AppListType getCompliantAppListType() {
        return this._compliantAppListType;
    }
    /**
     * Gets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getCompliantAppsList() {
        return this._compliantAppsList;
    }
    /**
     * Gets the deviceSharingAllowed property value. Indicates whether or not to allow device sharing mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceSharingAllowed() {
        return this._deviceSharingAllowed;
    }
    /**
     * Gets the diagnosticDataBlockSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDiagnosticDataBlockSubmission() {
        return this._diagnosticDataBlockSubmission;
    }
    /**
     * Gets the factoryResetBlocked property value. Indicates whether or not to block user performing a factory reset.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFactoryResetBlocked() {
        return this._factoryResetBlocked;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidGeneralDeviceConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appsBlockClipboardSharing", (n) -> { currentObject.setAppsBlockClipboardSharing(n.getBooleanValue()); });
            this.put("appsBlockCopyPaste", (n) -> { currentObject.setAppsBlockCopyPaste(n.getBooleanValue()); });
            this.put("appsBlockYouTube", (n) -> { currentObject.setAppsBlockYouTube(n.getBooleanValue()); });
            this.put("appsHideList", (n) -> { currentObject.setAppsHideList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
            this.put("appsInstallAllowList", (n) -> { currentObject.setAppsInstallAllowList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
            this.put("appsLaunchBlockList", (n) -> { currentObject.setAppsLaunchBlockList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
            this.put("bluetoothBlocked", (n) -> { currentObject.setBluetoothBlocked(n.getBooleanValue()); });
            this.put("cameraBlocked", (n) -> { currentObject.setCameraBlocked(n.getBooleanValue()); });
            this.put("cellularBlockDataRoaming", (n) -> { currentObject.setCellularBlockDataRoaming(n.getBooleanValue()); });
            this.put("cellularBlockMessaging", (n) -> { currentObject.setCellularBlockMessaging(n.getBooleanValue()); });
            this.put("cellularBlockVoiceRoaming", (n) -> { currentObject.setCellularBlockVoiceRoaming(n.getBooleanValue()); });
            this.put("cellularBlockWiFiTethering", (n) -> { currentObject.setCellularBlockWiFiTethering(n.getBooleanValue()); });
            this.put("compliantAppListType", (n) -> { currentObject.setCompliantAppListType(n.getEnumValue(AppListType.class)); });
            this.put("compliantAppsList", (n) -> { currentObject.setCompliantAppsList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
            this.put("deviceSharingAllowed", (n) -> { currentObject.setDeviceSharingAllowed(n.getBooleanValue()); });
            this.put("diagnosticDataBlockSubmission", (n) -> { currentObject.setDiagnosticDataBlockSubmission(n.getBooleanValue()); });
            this.put("factoryResetBlocked", (n) -> { currentObject.setFactoryResetBlocked(n.getBooleanValue()); });
            this.put("googleAccountBlockAutoSync", (n) -> { currentObject.setGoogleAccountBlockAutoSync(n.getBooleanValue()); });
            this.put("googlePlayStoreBlocked", (n) -> { currentObject.setGooglePlayStoreBlocked(n.getBooleanValue()); });
            this.put("kioskModeApps", (n) -> { currentObject.setKioskModeApps(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
            this.put("kioskModeBlockSleepButton", (n) -> { currentObject.setKioskModeBlockSleepButton(n.getBooleanValue()); });
            this.put("kioskModeBlockVolumeButtons", (n) -> { currentObject.setKioskModeBlockVolumeButtons(n.getBooleanValue()); });
            this.put("locationServicesBlocked", (n) -> { currentObject.setLocationServicesBlocked(n.getBooleanValue()); });
            this.put("nfcBlocked", (n) -> { currentObject.setNfcBlocked(n.getBooleanValue()); });
            this.put("passwordBlockFingerprintUnlock", (n) -> { currentObject.setPasswordBlockFingerprintUnlock(n.getBooleanValue()); });
            this.put("passwordBlockTrustAgents", (n) -> { currentObject.setPasswordBlockTrustAgents(n.getBooleanValue()); });
            this.put("passwordExpirationDays", (n) -> { currentObject.setPasswordExpirationDays(n.getIntegerValue()); });
            this.put("passwordMinimumLength", (n) -> { currentObject.setPasswordMinimumLength(n.getIntegerValue()); });
            this.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { currentObject.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
            this.put("passwordPreviousPasswordBlockCount", (n) -> { currentObject.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
            this.put("passwordRequired", (n) -> { currentObject.setPasswordRequired(n.getBooleanValue()); });
            this.put("passwordRequiredType", (n) -> { currentObject.setPasswordRequiredType(n.getEnumValue(AndroidRequiredPasswordType.class)); });
            this.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { currentObject.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
            this.put("powerOffBlocked", (n) -> { currentObject.setPowerOffBlocked(n.getBooleanValue()); });
            this.put("screenCaptureBlocked", (n) -> { currentObject.setScreenCaptureBlocked(n.getBooleanValue()); });
            this.put("securityRequireVerifyApps", (n) -> { currentObject.setSecurityRequireVerifyApps(n.getBooleanValue()); });
            this.put("storageBlockGoogleBackup", (n) -> { currentObject.setStorageBlockGoogleBackup(n.getBooleanValue()); });
            this.put("storageBlockRemovableStorage", (n) -> { currentObject.setStorageBlockRemovableStorage(n.getBooleanValue()); });
            this.put("storageRequireDeviceEncryption", (n) -> { currentObject.setStorageRequireDeviceEncryption(n.getBooleanValue()); });
            this.put("storageRequireRemovableStorageEncryption", (n) -> { currentObject.setStorageRequireRemovableStorageEncryption(n.getBooleanValue()); });
            this.put("voiceAssistantBlocked", (n) -> { currentObject.setVoiceAssistantBlocked(n.getBooleanValue()); });
            this.put("voiceDialingBlocked", (n) -> { currentObject.setVoiceDialingBlocked(n.getBooleanValue()); });
            this.put("webBrowserBlockAutofill", (n) -> { currentObject.setWebBrowserBlockAutofill(n.getBooleanValue()); });
            this.put("webBrowserBlocked", (n) -> { currentObject.setWebBrowserBlocked(n.getBooleanValue()); });
            this.put("webBrowserBlockJavaScript", (n) -> { currentObject.setWebBrowserBlockJavaScript(n.getBooleanValue()); });
            this.put("webBrowserBlockPopups", (n) -> { currentObject.setWebBrowserBlockPopups(n.getBooleanValue()); });
            this.put("webBrowserCookieSettings", (n) -> { currentObject.setWebBrowserCookieSettings(n.getEnumValue(WebBrowserCookieSettings.class)); });
            this.put("wiFiBlocked", (n) -> { currentObject.setWiFiBlocked(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the googleAccountBlockAutoSync property value. Indicates whether or not to block Google account auto sync.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGoogleAccountBlockAutoSync() {
        return this._googleAccountBlockAutoSync;
    }
    /**
     * Gets the googlePlayStoreBlocked property value. Indicates whether or not to block the Google Play store.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGooglePlayStoreBlocked() {
        return this._googlePlayStoreBlocked;
    }
    /**
     * Gets the kioskModeApps property value. A list of apps that will be allowed to run when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getKioskModeApps() {
        return this._kioskModeApps;
    }
    /**
     * Gets the kioskModeBlockSleepButton property value. Indicates whether or not to block the screen sleep button while in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeBlockSleepButton() {
        return this._kioskModeBlockSleepButton;
    }
    /**
     * Gets the kioskModeBlockVolumeButtons property value. Indicates whether or not to block the volume buttons while in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeBlockVolumeButtons() {
        return this._kioskModeBlockVolumeButtons;
    }
    /**
     * Gets the locationServicesBlocked property value. Indicates whether or not to block location services.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocationServicesBlocked() {
        return this._locationServicesBlocked;
    }
    /**
     * Gets the nfcBlocked property value. Indicates whether or not to block Near-Field Communication.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNfcBlocked() {
        return this._nfcBlocked;
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
     * Gets the passwordRequired property value. Indicates whether or not to require a password.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this._passwordRequired;
    }
    /**
     * Gets the passwordRequiredType property value. Android required password type.
     * @return a androidRequiredPasswordType
     */
    @javax.annotation.Nullable
    public AndroidRequiredPasswordType getPasswordRequiredType() {
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
     * Gets the powerOffBlocked property value. Indicates whether or not to block powering off the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPowerOffBlocked() {
        return this._powerOffBlocked;
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to block screenshots.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this._screenCaptureBlocked;
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
     * Gets the storageBlockGoogleBackup property value. Indicates whether or not to block Google Backup.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageBlockGoogleBackup() {
        return this._storageBlockGoogleBackup;
    }
    /**
     * Gets the storageBlockRemovableStorage property value. Indicates whether or not to block removable storage usage.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageBlockRemovableStorage() {
        return this._storageBlockRemovableStorage;
    }
    /**
     * Gets the storageRequireDeviceEncryption property value. Indicates whether or not to require device encryption.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRequireDeviceEncryption() {
        return this._storageRequireDeviceEncryption;
    }
    /**
     * Gets the storageRequireRemovableStorageEncryption property value. Indicates whether or not to require removable storage encryption.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRequireRemovableStorageEncryption() {
        return this._storageRequireRemovableStorageEncryption;
    }
    /**
     * Gets the voiceAssistantBlocked property value. Indicates whether or not to block the use of the Voice Assistant.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getVoiceAssistantBlocked() {
        return this._voiceAssistantBlocked;
    }
    /**
     * Gets the voiceDialingBlocked property value. Indicates whether or not to block voice dialing.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getVoiceDialingBlocked() {
        return this._voiceDialingBlocked;
    }
    /**
     * Gets the webBrowserBlockAutofill property value. Indicates whether or not to block the web browser's auto fill feature.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWebBrowserBlockAutofill() {
        return this._webBrowserBlockAutofill;
    }
    /**
     * Gets the webBrowserBlocked property value. Indicates whether or not to block the web browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWebBrowserBlocked() {
        return this._webBrowserBlocked;
    }
    /**
     * Gets the webBrowserBlockJavaScript property value. Indicates whether or not to block JavaScript within the web browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWebBrowserBlockJavaScript() {
        return this._webBrowserBlockJavaScript;
    }
    /**
     * Gets the webBrowserBlockPopups property value. Indicates whether or not to block popups within the web browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWebBrowserBlockPopups() {
        return this._webBrowserBlockPopups;
    }
    /**
     * Gets the webBrowserCookieSettings property value. Web Browser Cookie Settings.
     * @return a webBrowserCookieSettings
     */
    @javax.annotation.Nullable
    public WebBrowserCookieSettings getWebBrowserCookieSettings() {
        return this._webBrowserCookieSettings;
    }
    /**
     * Gets the wiFiBlocked property value. Indicates whether or not to block syncing Wi-Fi.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWiFiBlocked() {
        return this._wiFiBlocked;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("appsBlockClipboardSharing", this.getAppsBlockClipboardSharing());
        writer.writeBooleanValue("appsBlockCopyPaste", this.getAppsBlockCopyPaste());
        writer.writeBooleanValue("appsBlockYouTube", this.getAppsBlockYouTube());
        writer.writeCollectionOfObjectValues("appsHideList", this.getAppsHideList());
        writer.writeCollectionOfObjectValues("appsInstallAllowList", this.getAppsInstallAllowList());
        writer.writeCollectionOfObjectValues("appsLaunchBlockList", this.getAppsLaunchBlockList());
        writer.writeBooleanValue("bluetoothBlocked", this.getBluetoothBlocked());
        writer.writeBooleanValue("cameraBlocked", this.getCameraBlocked());
        writer.writeBooleanValue("cellularBlockDataRoaming", this.getCellularBlockDataRoaming());
        writer.writeBooleanValue("cellularBlockMessaging", this.getCellularBlockMessaging());
        writer.writeBooleanValue("cellularBlockVoiceRoaming", this.getCellularBlockVoiceRoaming());
        writer.writeBooleanValue("cellularBlockWiFiTethering", this.getCellularBlockWiFiTethering());
        writer.writeEnumValue("compliantAppListType", this.getCompliantAppListType());
        writer.writeCollectionOfObjectValues("compliantAppsList", this.getCompliantAppsList());
        writer.writeBooleanValue("deviceSharingAllowed", this.getDeviceSharingAllowed());
        writer.writeBooleanValue("diagnosticDataBlockSubmission", this.getDiagnosticDataBlockSubmission());
        writer.writeBooleanValue("factoryResetBlocked", this.getFactoryResetBlocked());
        writer.writeBooleanValue("googleAccountBlockAutoSync", this.getGoogleAccountBlockAutoSync());
        writer.writeBooleanValue("googlePlayStoreBlocked", this.getGooglePlayStoreBlocked());
        writer.writeCollectionOfObjectValues("kioskModeApps", this.getKioskModeApps());
        writer.writeBooleanValue("kioskModeBlockSleepButton", this.getKioskModeBlockSleepButton());
        writer.writeBooleanValue("kioskModeBlockVolumeButtons", this.getKioskModeBlockVolumeButtons());
        writer.writeBooleanValue("locationServicesBlocked", this.getLocationServicesBlocked());
        writer.writeBooleanValue("nfcBlocked", this.getNfcBlocked());
        writer.writeBooleanValue("passwordBlockFingerprintUnlock", this.getPasswordBlockFingerprintUnlock());
        writer.writeBooleanValue("passwordBlockTrustAgents", this.getPasswordBlockTrustAgents());
        writer.writeIntegerValue("passwordExpirationDays", this.getPasswordExpirationDays());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeScreenTimeout", this.getPasswordMinutesOfInactivityBeforeScreenTimeout());
        writer.writeIntegerValue("passwordPreviousPasswordBlockCount", this.getPasswordPreviousPasswordBlockCount());
        writer.writeBooleanValue("passwordRequired", this.getPasswordRequired());
        writer.writeEnumValue("passwordRequiredType", this.getPasswordRequiredType());
        writer.writeIntegerValue("passwordSignInFailureCountBeforeFactoryReset", this.getPasswordSignInFailureCountBeforeFactoryReset());
        writer.writeBooleanValue("powerOffBlocked", this.getPowerOffBlocked());
        writer.writeBooleanValue("screenCaptureBlocked", this.getScreenCaptureBlocked());
        writer.writeBooleanValue("securityRequireVerifyApps", this.getSecurityRequireVerifyApps());
        writer.writeBooleanValue("storageBlockGoogleBackup", this.getStorageBlockGoogleBackup());
        writer.writeBooleanValue("storageBlockRemovableStorage", this.getStorageBlockRemovableStorage());
        writer.writeBooleanValue("storageRequireDeviceEncryption", this.getStorageRequireDeviceEncryption());
        writer.writeBooleanValue("storageRequireRemovableStorageEncryption", this.getStorageRequireRemovableStorageEncryption());
        writer.writeBooleanValue("voiceAssistantBlocked", this.getVoiceAssistantBlocked());
        writer.writeBooleanValue("voiceDialingBlocked", this.getVoiceDialingBlocked());
        writer.writeBooleanValue("webBrowserBlockAutofill", this.getWebBrowserBlockAutofill());
        writer.writeBooleanValue("webBrowserBlocked", this.getWebBrowserBlocked());
        writer.writeBooleanValue("webBrowserBlockJavaScript", this.getWebBrowserBlockJavaScript());
        writer.writeBooleanValue("webBrowserBlockPopups", this.getWebBrowserBlockPopups());
        writer.writeEnumValue("webBrowserCookieSettings", this.getWebBrowserCookieSettings());
        writer.writeBooleanValue("wiFiBlocked", this.getWiFiBlocked());
    }
    /**
     * Sets the appsBlockClipboardSharing property value. Indicates whether or not to block clipboard sharing to copy and paste between applications.
     * @param value Value to set for the appsBlockClipboardSharing property.
     * @return a void
     */
    public void setAppsBlockClipboardSharing(@javax.annotation.Nullable final Boolean value) {
        this._appsBlockClipboardSharing = value;
    }
    /**
     * Sets the appsBlockCopyPaste property value. Indicates whether or not to block copy and paste within applications.
     * @param value Value to set for the appsBlockCopyPaste property.
     * @return a void
     */
    public void setAppsBlockCopyPaste(@javax.annotation.Nullable final Boolean value) {
        this._appsBlockCopyPaste = value;
    }
    /**
     * Sets the appsBlockYouTube property value. Indicates whether or not to block the YouTube app.
     * @param value Value to set for the appsBlockYouTube property.
     * @return a void
     */
    public void setAppsBlockYouTube(@javax.annotation.Nullable final Boolean value) {
        this._appsBlockYouTube = value;
    }
    /**
     * Sets the appsHideList property value. List of apps to be hidden on the KNOX device. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the appsHideList property.
     * @return a void
     */
    public void setAppsHideList(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this._appsHideList = value;
    }
    /**
     * Sets the appsInstallAllowList property value. List of apps which can be installed on the KNOX device. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the appsInstallAllowList property.
     * @return a void
     */
    public void setAppsInstallAllowList(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this._appsInstallAllowList = value;
    }
    /**
     * Sets the appsLaunchBlockList property value. List of apps which are blocked from being launched on the KNOX device. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the appsLaunchBlockList property.
     * @return a void
     */
    public void setAppsLaunchBlockList(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this._appsLaunchBlockList = value;
    }
    /**
     * Sets the bluetoothBlocked property value. Indicates whether or not to block Bluetooth.
     * @param value Value to set for the bluetoothBlocked property.
     * @return a void
     */
    public void setBluetoothBlocked(@javax.annotation.Nullable final Boolean value) {
        this._bluetoothBlocked = value;
    }
    /**
     * Sets the cameraBlocked property value. Indicates whether or not to block the use of the camera.
     * @param value Value to set for the cameraBlocked property.
     * @return a void
     */
    public void setCameraBlocked(@javax.annotation.Nullable final Boolean value) {
        this._cameraBlocked = value;
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
     * Sets the cellularBlockMessaging property value. Indicates whether or not to block SMS/MMS messaging.
     * @param value Value to set for the cellularBlockMessaging property.
     * @return a void
     */
    public void setCellularBlockMessaging(@javax.annotation.Nullable final Boolean value) {
        this._cellularBlockMessaging = value;
    }
    /**
     * Sets the cellularBlockVoiceRoaming property value. Indicates whether or not to block voice roaming.
     * @param value Value to set for the cellularBlockVoiceRoaming property.
     * @return a void
     */
    public void setCellularBlockVoiceRoaming(@javax.annotation.Nullable final Boolean value) {
        this._cellularBlockVoiceRoaming = value;
    }
    /**
     * Sets the cellularBlockWiFiTethering property value. Indicates whether or not to block syncing Wi-Fi tethering.
     * @param value Value to set for the cellularBlockWiFiTethering property.
     * @return a void
     */
    public void setCellularBlockWiFiTethering(@javax.annotation.Nullable final Boolean value) {
        this._cellularBlockWiFiTethering = value;
    }
    /**
     * Sets the compliantAppListType property value. Possible values of the compliance app list.
     * @param value Value to set for the compliantAppListType property.
     * @return a void
     */
    public void setCompliantAppListType(@javax.annotation.Nullable final AppListType value) {
        this._compliantAppListType = value;
    }
    /**
     * Sets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the compliantAppsList property.
     * @return a void
     */
    public void setCompliantAppsList(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this._compliantAppsList = value;
    }
    /**
     * Sets the deviceSharingAllowed property value. Indicates whether or not to allow device sharing mode.
     * @param value Value to set for the deviceSharingAllowed property.
     * @return a void
     */
    public void setDeviceSharingAllowed(@javax.annotation.Nullable final Boolean value) {
        this._deviceSharingAllowed = value;
    }
    /**
     * Sets the diagnosticDataBlockSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @param value Value to set for the diagnosticDataBlockSubmission property.
     * @return a void
     */
    public void setDiagnosticDataBlockSubmission(@javax.annotation.Nullable final Boolean value) {
        this._diagnosticDataBlockSubmission = value;
    }
    /**
     * Sets the factoryResetBlocked property value. Indicates whether or not to block user performing a factory reset.
     * @param value Value to set for the factoryResetBlocked property.
     * @return a void
     */
    public void setFactoryResetBlocked(@javax.annotation.Nullable final Boolean value) {
        this._factoryResetBlocked = value;
    }
    /**
     * Sets the googleAccountBlockAutoSync property value. Indicates whether or not to block Google account auto sync.
     * @param value Value to set for the googleAccountBlockAutoSync property.
     * @return a void
     */
    public void setGoogleAccountBlockAutoSync(@javax.annotation.Nullable final Boolean value) {
        this._googleAccountBlockAutoSync = value;
    }
    /**
     * Sets the googlePlayStoreBlocked property value. Indicates whether or not to block the Google Play store.
     * @param value Value to set for the googlePlayStoreBlocked property.
     * @return a void
     */
    public void setGooglePlayStoreBlocked(@javax.annotation.Nullable final Boolean value) {
        this._googlePlayStoreBlocked = value;
    }
    /**
     * Sets the kioskModeApps property value. A list of apps that will be allowed to run when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the kioskModeApps property.
     * @return a void
     */
    public void setKioskModeApps(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this._kioskModeApps = value;
    }
    /**
     * Sets the kioskModeBlockSleepButton property value. Indicates whether or not to block the screen sleep button while in Kiosk Mode.
     * @param value Value to set for the kioskModeBlockSleepButton property.
     * @return a void
     */
    public void setKioskModeBlockSleepButton(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeBlockSleepButton = value;
    }
    /**
     * Sets the kioskModeBlockVolumeButtons property value. Indicates whether or not to block the volume buttons while in Kiosk Mode.
     * @param value Value to set for the kioskModeBlockVolumeButtons property.
     * @return a void
     */
    public void setKioskModeBlockVolumeButtons(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeBlockVolumeButtons = value;
    }
    /**
     * Sets the locationServicesBlocked property value. Indicates whether or not to block location services.
     * @param value Value to set for the locationServicesBlocked property.
     * @return a void
     */
    public void setLocationServicesBlocked(@javax.annotation.Nullable final Boolean value) {
        this._locationServicesBlocked = value;
    }
    /**
     * Sets the nfcBlocked property value. Indicates whether or not to block Near-Field Communication.
     * @param value Value to set for the nfcBlocked property.
     * @return a void
     */
    public void setNfcBlocked(@javax.annotation.Nullable final Boolean value) {
        this._nfcBlocked = value;
    }
    /**
     * Sets the passwordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @param value Value to set for the passwordBlockFingerprintUnlock property.
     * @return a void
     */
    public void setPasswordBlockFingerprintUnlock(@javax.annotation.Nullable final Boolean value) {
        this._passwordBlockFingerprintUnlock = value;
    }
    /**
     * Sets the passwordBlockTrustAgents property value. Indicates whether or not to block Smart Lock and other trust agents.
     * @param value Value to set for the passwordBlockTrustAgents property.
     * @return a void
     */
    public void setPasswordBlockTrustAgents(@javax.annotation.Nullable final Boolean value) {
        this._passwordBlockTrustAgents = value;
    }
    /**
     * Sets the passwordExpirationDays property value. Number of days before the password expires. Valid values 1 to 365
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this._passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumLength property value. Minimum length of passwords. Valid values 4 to 16
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     * @return a void
     */
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@javax.annotation.Nullable final Integer value) {
        this._passwordMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block. Valid values 0 to 24
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     * @return a void
     */
    public void setPasswordPreviousPasswordBlockCount(@javax.annotation.Nullable final Integer value) {
        this._passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequired property value. Indicates whether or not to require a password.
     * @param value Value to set for the passwordRequired property.
     * @return a void
     */
    public void setPasswordRequired(@javax.annotation.Nullable final Boolean value) {
        this._passwordRequired = value;
    }
    /**
     * Sets the passwordRequiredType property value. Android required password type.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    public void setPasswordRequiredType(@javax.annotation.Nullable final AndroidRequiredPasswordType value) {
        this._passwordRequiredType = value;
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. Number of sign in failures allowed before factory reset. Valid values 1 to 16
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     * @return a void
     */
    public void setPasswordSignInFailureCountBeforeFactoryReset(@javax.annotation.Nullable final Integer value) {
        this._passwordSignInFailureCountBeforeFactoryReset = value;
    }
    /**
     * Sets the powerOffBlocked property value. Indicates whether or not to block powering off the device.
     * @param value Value to set for the powerOffBlocked property.
     * @return a void
     */
    public void setPowerOffBlocked(@javax.annotation.Nullable final Boolean value) {
        this._powerOffBlocked = value;
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to block screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     * @return a void
     */
    public void setScreenCaptureBlocked(@javax.annotation.Nullable final Boolean value) {
        this._screenCaptureBlocked = value;
    }
    /**
     * Sets the securityRequireVerifyApps property value. Require the Android Verify apps feature is turned on.
     * @param value Value to set for the securityRequireVerifyApps property.
     * @return a void
     */
    public void setSecurityRequireVerifyApps(@javax.annotation.Nullable final Boolean value) {
        this._securityRequireVerifyApps = value;
    }
    /**
     * Sets the storageBlockGoogleBackup property value. Indicates whether or not to block Google Backup.
     * @param value Value to set for the storageBlockGoogleBackup property.
     * @return a void
     */
    public void setStorageBlockGoogleBackup(@javax.annotation.Nullable final Boolean value) {
        this._storageBlockGoogleBackup = value;
    }
    /**
     * Sets the storageBlockRemovableStorage property value. Indicates whether or not to block removable storage usage.
     * @param value Value to set for the storageBlockRemovableStorage property.
     * @return a void
     */
    public void setStorageBlockRemovableStorage(@javax.annotation.Nullable final Boolean value) {
        this._storageBlockRemovableStorage = value;
    }
    /**
     * Sets the storageRequireDeviceEncryption property value. Indicates whether or not to require device encryption.
     * @param value Value to set for the storageRequireDeviceEncryption property.
     * @return a void
     */
    public void setStorageRequireDeviceEncryption(@javax.annotation.Nullable final Boolean value) {
        this._storageRequireDeviceEncryption = value;
    }
    /**
     * Sets the storageRequireRemovableStorageEncryption property value. Indicates whether or not to require removable storage encryption.
     * @param value Value to set for the storageRequireRemovableStorageEncryption property.
     * @return a void
     */
    public void setStorageRequireRemovableStorageEncryption(@javax.annotation.Nullable final Boolean value) {
        this._storageRequireRemovableStorageEncryption = value;
    }
    /**
     * Sets the voiceAssistantBlocked property value. Indicates whether or not to block the use of the Voice Assistant.
     * @param value Value to set for the voiceAssistantBlocked property.
     * @return a void
     */
    public void setVoiceAssistantBlocked(@javax.annotation.Nullable final Boolean value) {
        this._voiceAssistantBlocked = value;
    }
    /**
     * Sets the voiceDialingBlocked property value. Indicates whether or not to block voice dialing.
     * @param value Value to set for the voiceDialingBlocked property.
     * @return a void
     */
    public void setVoiceDialingBlocked(@javax.annotation.Nullable final Boolean value) {
        this._voiceDialingBlocked = value;
    }
    /**
     * Sets the webBrowserBlockAutofill property value. Indicates whether or not to block the web browser's auto fill feature.
     * @param value Value to set for the webBrowserBlockAutofill property.
     * @return a void
     */
    public void setWebBrowserBlockAutofill(@javax.annotation.Nullable final Boolean value) {
        this._webBrowserBlockAutofill = value;
    }
    /**
     * Sets the webBrowserBlocked property value. Indicates whether or not to block the web browser.
     * @param value Value to set for the webBrowserBlocked property.
     * @return a void
     */
    public void setWebBrowserBlocked(@javax.annotation.Nullable final Boolean value) {
        this._webBrowserBlocked = value;
    }
    /**
     * Sets the webBrowserBlockJavaScript property value. Indicates whether or not to block JavaScript within the web browser.
     * @param value Value to set for the webBrowserBlockJavaScript property.
     * @return a void
     */
    public void setWebBrowserBlockJavaScript(@javax.annotation.Nullable final Boolean value) {
        this._webBrowserBlockJavaScript = value;
    }
    /**
     * Sets the webBrowserBlockPopups property value. Indicates whether or not to block popups within the web browser.
     * @param value Value to set for the webBrowserBlockPopups property.
     * @return a void
     */
    public void setWebBrowserBlockPopups(@javax.annotation.Nullable final Boolean value) {
        this._webBrowserBlockPopups = value;
    }
    /**
     * Sets the webBrowserCookieSettings property value. Web Browser Cookie Settings.
     * @param value Value to set for the webBrowserCookieSettings property.
     * @return a void
     */
    public void setWebBrowserCookieSettings(@javax.annotation.Nullable final WebBrowserCookieSettings value) {
        this._webBrowserCookieSettings = value;
    }
    /**
     * Sets the wiFiBlocked property value. Indicates whether or not to block syncing Wi-Fi.
     * @param value Value to set for the wiFiBlocked property.
     * @return a void
     */
    public void setWiFiBlocked(@javax.annotation.Nullable final Boolean value) {
        this._wiFiBlocked = value;
    }
}
