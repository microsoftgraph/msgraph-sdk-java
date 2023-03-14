package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidGeneralDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /** Indicates whether or not to block clipboard sharing to copy and paste between applications. */
    private Boolean appsBlockClipboardSharing;
    /** Indicates whether or not to block copy and paste within applications. */
    private Boolean appsBlockCopyPaste;
    /** Indicates whether or not to block the YouTube app. */
    private Boolean appsBlockYouTube;
    /** List of apps to be hidden on the KNOX device. This collection can contain a maximum of 500 elements. */
    private java.util.List<AppListItem> appsHideList;
    /** List of apps which can be installed on the KNOX device. This collection can contain a maximum of 500 elements. */
    private java.util.List<AppListItem> appsInstallAllowList;
    /** List of apps which are blocked from being launched on the KNOX device. This collection can contain a maximum of 500 elements. */
    private java.util.List<AppListItem> appsLaunchBlockList;
    /** Indicates whether or not to block Bluetooth. */
    private Boolean bluetoothBlocked;
    /** Indicates whether or not to block the use of the camera. */
    private Boolean cameraBlocked;
    /** Indicates whether or not to block data roaming. */
    private Boolean cellularBlockDataRoaming;
    /** Indicates whether or not to block SMS/MMS messaging. */
    private Boolean cellularBlockMessaging;
    /** Indicates whether or not to block voice roaming. */
    private Boolean cellularBlockVoiceRoaming;
    /** Indicates whether or not to block syncing Wi-Fi tethering. */
    private Boolean cellularBlockWiFiTethering;
    /** Possible values of the compliance app list. */
    private AppListType compliantAppListType;
    /** List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements. */
    private java.util.List<AppListItem> compliantAppsList;
    /** Indicates whether or not to allow device sharing mode. */
    private Boolean deviceSharingAllowed;
    /** Indicates whether or not to block diagnostic data submission. */
    private Boolean diagnosticDataBlockSubmission;
    /** Indicates whether or not to block user performing a factory reset. */
    private Boolean factoryResetBlocked;
    /** Indicates whether or not to block Google account auto sync. */
    private Boolean googleAccountBlockAutoSync;
    /** Indicates whether or not to block the Google Play store. */
    private Boolean googlePlayStoreBlocked;
    /** A list of apps that will be allowed to run when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements. */
    private java.util.List<AppListItem> kioskModeApps;
    /** Indicates whether or not to block the screen sleep button while in Kiosk Mode. */
    private Boolean kioskModeBlockSleepButton;
    /** Indicates whether or not to block the volume buttons while in Kiosk Mode. */
    private Boolean kioskModeBlockVolumeButtons;
    /** Indicates whether or not to block location services. */
    private Boolean locationServicesBlocked;
    /** Indicates whether or not to block Near-Field Communication. */
    private Boolean nfcBlocked;
    /** Indicates whether or not to block fingerprint unlock. */
    private Boolean passwordBlockFingerprintUnlock;
    /** Indicates whether or not to block Smart Lock and other trust agents. */
    private Boolean passwordBlockTrustAgents;
    /** Number of days before the password expires. Valid values 1 to 365 */
    private Integer passwordExpirationDays;
    /** Minimum length of passwords. Valid values 4 to 16 */
    private Integer passwordMinimumLength;
    /** Minutes of inactivity before the screen times out. */
    private Integer passwordMinutesOfInactivityBeforeScreenTimeout;
    /** Number of previous passwords to block. Valid values 0 to 24 */
    private Integer passwordPreviousPasswordBlockCount;
    /** Indicates whether or not to require a password. */
    private Boolean passwordRequired;
    /** Android required password type. */
    private AndroidRequiredPasswordType passwordRequiredType;
    /** Number of sign in failures allowed before factory reset. Valid values 1 to 16 */
    private Integer passwordSignInFailureCountBeforeFactoryReset;
    /** Indicates whether or not to block powering off the device. */
    private Boolean powerOffBlocked;
    /** Indicates whether or not to block screenshots. */
    private Boolean screenCaptureBlocked;
    /** Require the Android Verify apps feature is turned on. */
    private Boolean securityRequireVerifyApps;
    /** Indicates whether or not to block Google Backup. */
    private Boolean storageBlockGoogleBackup;
    /** Indicates whether or not to block removable storage usage. */
    private Boolean storageBlockRemovableStorage;
    /** Indicates whether or not to require device encryption. */
    private Boolean storageRequireDeviceEncryption;
    /** Indicates whether or not to require removable storage encryption. */
    private Boolean storageRequireRemovableStorageEncryption;
    /** Indicates whether or not to block the use of the Voice Assistant. */
    private Boolean voiceAssistantBlocked;
    /** Indicates whether or not to block voice dialing. */
    private Boolean voiceDialingBlocked;
    /** Indicates whether or not to block the web browser's auto fill feature. */
    private Boolean webBrowserBlockAutofill;
    /** Indicates whether or not to block the web browser. */
    private Boolean webBrowserBlocked;
    /** Indicates whether or not to block JavaScript within the web browser. */
    private Boolean webBrowserBlockJavaScript;
    /** Indicates whether or not to block popups within the web browser. */
    private Boolean webBrowserBlockPopups;
    /** Web Browser Cookie Settings. */
    private WebBrowserCookieSettings webBrowserCookieSettings;
    /** Indicates whether or not to block syncing Wi-Fi. */
    private Boolean wiFiBlocked;
    /**
     * Instantiates a new AndroidGeneralDeviceConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.appsBlockClipboardSharing;
    }
    /**
     * Gets the appsBlockCopyPaste property value. Indicates whether or not to block copy and paste within applications.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppsBlockCopyPaste() {
        return this.appsBlockCopyPaste;
    }
    /**
     * Gets the appsBlockYouTube property value. Indicates whether or not to block the YouTube app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppsBlockYouTube() {
        return this.appsBlockYouTube;
    }
    /**
     * Gets the appsHideList property value. List of apps to be hidden on the KNOX device. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getAppsHideList() {
        return this.appsHideList;
    }
    /**
     * Gets the appsInstallAllowList property value. List of apps which can be installed on the KNOX device. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getAppsInstallAllowList() {
        return this.appsInstallAllowList;
    }
    /**
     * Gets the appsLaunchBlockList property value. List of apps which are blocked from being launched on the KNOX device. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getAppsLaunchBlockList() {
        return this.appsLaunchBlockList;
    }
    /**
     * Gets the bluetoothBlocked property value. Indicates whether or not to block Bluetooth.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlocked() {
        return this.bluetoothBlocked;
    }
    /**
     * Gets the cameraBlocked property value. Indicates whether or not to block the use of the camera.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this.cameraBlocked;
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
     * Gets the cellularBlockMessaging property value. Indicates whether or not to block SMS/MMS messaging.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockMessaging() {
        return this.cellularBlockMessaging;
    }
    /**
     * Gets the cellularBlockVoiceRoaming property value. Indicates whether or not to block voice roaming.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockVoiceRoaming() {
        return this.cellularBlockVoiceRoaming;
    }
    /**
     * Gets the cellularBlockWiFiTethering property value. Indicates whether or not to block syncing Wi-Fi tethering.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockWiFiTethering() {
        return this.cellularBlockWiFiTethering;
    }
    /**
     * Gets the compliantAppListType property value. Possible values of the compliance app list.
     * @return a appListType
     */
    @javax.annotation.Nullable
    public AppListType getCompliantAppListType() {
        return this.compliantAppListType;
    }
    /**
     * Gets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getCompliantAppsList() {
        return this.compliantAppsList;
    }
    /**
     * Gets the deviceSharingAllowed property value. Indicates whether or not to allow device sharing mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceSharingAllowed() {
        return this.deviceSharingAllowed;
    }
    /**
     * Gets the diagnosticDataBlockSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDiagnosticDataBlockSubmission() {
        return this.diagnosticDataBlockSubmission;
    }
    /**
     * Gets the factoryResetBlocked property value. Indicates whether or not to block user performing a factory reset.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFactoryResetBlocked() {
        return this.factoryResetBlocked;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appsBlockClipboardSharing", (n) -> { this.setAppsBlockClipboardSharing(n.getBooleanValue()); });
        deserializerMap.put("appsBlockCopyPaste", (n) -> { this.setAppsBlockCopyPaste(n.getBooleanValue()); });
        deserializerMap.put("appsBlockYouTube", (n) -> { this.setAppsBlockYouTube(n.getBooleanValue()); });
        deserializerMap.put("appsHideList", (n) -> { this.setAppsHideList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("appsInstallAllowList", (n) -> { this.setAppsInstallAllowList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("appsLaunchBlockList", (n) -> { this.setAppsLaunchBlockList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("bluetoothBlocked", (n) -> { this.setBluetoothBlocked(n.getBooleanValue()); });
        deserializerMap.put("cameraBlocked", (n) -> { this.setCameraBlocked(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockDataRoaming", (n) -> { this.setCellularBlockDataRoaming(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockMessaging", (n) -> { this.setCellularBlockMessaging(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockVoiceRoaming", (n) -> { this.setCellularBlockVoiceRoaming(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockWiFiTethering", (n) -> { this.setCellularBlockWiFiTethering(n.getBooleanValue()); });
        deserializerMap.put("compliantAppListType", (n) -> { this.setCompliantAppListType(n.getEnumValue(AppListType.class)); });
        deserializerMap.put("compliantAppsList", (n) -> { this.setCompliantAppsList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceSharingAllowed", (n) -> { this.setDeviceSharingAllowed(n.getBooleanValue()); });
        deserializerMap.put("diagnosticDataBlockSubmission", (n) -> { this.setDiagnosticDataBlockSubmission(n.getBooleanValue()); });
        deserializerMap.put("factoryResetBlocked", (n) -> { this.setFactoryResetBlocked(n.getBooleanValue()); });
        deserializerMap.put("googleAccountBlockAutoSync", (n) -> { this.setGoogleAccountBlockAutoSync(n.getBooleanValue()); });
        deserializerMap.put("googlePlayStoreBlocked", (n) -> { this.setGooglePlayStoreBlocked(n.getBooleanValue()); });
        deserializerMap.put("kioskModeApps", (n) -> { this.setKioskModeApps(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("kioskModeBlockSleepButton", (n) -> { this.setKioskModeBlockSleepButton(n.getBooleanValue()); });
        deserializerMap.put("kioskModeBlockVolumeButtons", (n) -> { this.setKioskModeBlockVolumeButtons(n.getBooleanValue()); });
        deserializerMap.put("locationServicesBlocked", (n) -> { this.setLocationServicesBlocked(n.getBooleanValue()); });
        deserializerMap.put("nfcBlocked", (n) -> { this.setNfcBlocked(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockFingerprintUnlock", (n) -> { this.setPasswordBlockFingerprintUnlock(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockTrustAgents", (n) -> { this.setPasswordBlockTrustAgents(n.getBooleanValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { this.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { this.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordBlockCount", (n) -> { this.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passwordRequired", (n) -> { this.setPasswordRequired(n.getBooleanValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(AndroidRequiredPasswordType.class)); });
        deserializerMap.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { this.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        deserializerMap.put("powerOffBlocked", (n) -> { this.setPowerOffBlocked(n.getBooleanValue()); });
        deserializerMap.put("screenCaptureBlocked", (n) -> { this.setScreenCaptureBlocked(n.getBooleanValue()); });
        deserializerMap.put("securityRequireVerifyApps", (n) -> { this.setSecurityRequireVerifyApps(n.getBooleanValue()); });
        deserializerMap.put("storageBlockGoogleBackup", (n) -> { this.setStorageBlockGoogleBackup(n.getBooleanValue()); });
        deserializerMap.put("storageBlockRemovableStorage", (n) -> { this.setStorageBlockRemovableStorage(n.getBooleanValue()); });
        deserializerMap.put("storageRequireDeviceEncryption", (n) -> { this.setStorageRequireDeviceEncryption(n.getBooleanValue()); });
        deserializerMap.put("storageRequireRemovableStorageEncryption", (n) -> { this.setStorageRequireRemovableStorageEncryption(n.getBooleanValue()); });
        deserializerMap.put("voiceAssistantBlocked", (n) -> { this.setVoiceAssistantBlocked(n.getBooleanValue()); });
        deserializerMap.put("voiceDialingBlocked", (n) -> { this.setVoiceDialingBlocked(n.getBooleanValue()); });
        deserializerMap.put("webBrowserBlockAutofill", (n) -> { this.setWebBrowserBlockAutofill(n.getBooleanValue()); });
        deserializerMap.put("webBrowserBlocked", (n) -> { this.setWebBrowserBlocked(n.getBooleanValue()); });
        deserializerMap.put("webBrowserBlockJavaScript", (n) -> { this.setWebBrowserBlockJavaScript(n.getBooleanValue()); });
        deserializerMap.put("webBrowserBlockPopups", (n) -> { this.setWebBrowserBlockPopups(n.getBooleanValue()); });
        deserializerMap.put("webBrowserCookieSettings", (n) -> { this.setWebBrowserCookieSettings(n.getEnumValue(WebBrowserCookieSettings.class)); });
        deserializerMap.put("wiFiBlocked", (n) -> { this.setWiFiBlocked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the googleAccountBlockAutoSync property value. Indicates whether or not to block Google account auto sync.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGoogleAccountBlockAutoSync() {
        return this.googleAccountBlockAutoSync;
    }
    /**
     * Gets the googlePlayStoreBlocked property value. Indicates whether or not to block the Google Play store.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGooglePlayStoreBlocked() {
        return this.googlePlayStoreBlocked;
    }
    /**
     * Gets the kioskModeApps property value. A list of apps that will be allowed to run when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getKioskModeApps() {
        return this.kioskModeApps;
    }
    /**
     * Gets the kioskModeBlockSleepButton property value. Indicates whether or not to block the screen sleep button while in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeBlockSleepButton() {
        return this.kioskModeBlockSleepButton;
    }
    /**
     * Gets the kioskModeBlockVolumeButtons property value. Indicates whether or not to block the volume buttons while in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeBlockVolumeButtons() {
        return this.kioskModeBlockVolumeButtons;
    }
    /**
     * Gets the locationServicesBlocked property value. Indicates whether or not to block location services.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocationServicesBlocked() {
        return this.locationServicesBlocked;
    }
    /**
     * Gets the nfcBlocked property value. Indicates whether or not to block Near-Field Communication.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNfcBlocked() {
        return this.nfcBlocked;
    }
    /**
     * Gets the passwordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockFingerprintUnlock() {
        return this.passwordBlockFingerprintUnlock;
    }
    /**
     * Gets the passwordBlockTrustAgents property value. Indicates whether or not to block Smart Lock and other trust agents.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockTrustAgents() {
        return this.passwordBlockTrustAgents;
    }
    /**
     * Gets the passwordExpirationDays property value. Number of days before the password expires. Valid values 1 to 365
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.passwordExpirationDays;
    }
    /**
     * Gets the passwordMinimumLength property value. Minimum length of passwords. Valid values 4 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.passwordMinimumLength;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this.passwordMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block. Valid values 0 to 24
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequired property value. Indicates whether or not to require a password.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this.passwordRequired;
    }
    /**
     * Gets the passwordRequiredType property value. Android required password type.
     * @return a androidRequiredPasswordType
     */
    @javax.annotation.Nullable
    public AndroidRequiredPasswordType getPasswordRequiredType() {
        return this.passwordRequiredType;
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. Number of sign in failures allowed before factory reset. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this.passwordSignInFailureCountBeforeFactoryReset;
    }
    /**
     * Gets the powerOffBlocked property value. Indicates whether or not to block powering off the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPowerOffBlocked() {
        return this.powerOffBlocked;
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to block screenshots.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this.screenCaptureBlocked;
    }
    /**
     * Gets the securityRequireVerifyApps property value. Require the Android Verify apps feature is turned on.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityRequireVerifyApps() {
        return this.securityRequireVerifyApps;
    }
    /**
     * Gets the storageBlockGoogleBackup property value. Indicates whether or not to block Google Backup.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageBlockGoogleBackup() {
        return this.storageBlockGoogleBackup;
    }
    /**
     * Gets the storageBlockRemovableStorage property value. Indicates whether or not to block removable storage usage.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageBlockRemovableStorage() {
        return this.storageBlockRemovableStorage;
    }
    /**
     * Gets the storageRequireDeviceEncryption property value. Indicates whether or not to require device encryption.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRequireDeviceEncryption() {
        return this.storageRequireDeviceEncryption;
    }
    /**
     * Gets the storageRequireRemovableStorageEncryption property value. Indicates whether or not to require removable storage encryption.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRequireRemovableStorageEncryption() {
        return this.storageRequireRemovableStorageEncryption;
    }
    /**
     * Gets the voiceAssistantBlocked property value. Indicates whether or not to block the use of the Voice Assistant.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getVoiceAssistantBlocked() {
        return this.voiceAssistantBlocked;
    }
    /**
     * Gets the voiceDialingBlocked property value. Indicates whether or not to block voice dialing.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getVoiceDialingBlocked() {
        return this.voiceDialingBlocked;
    }
    /**
     * Gets the webBrowserBlockAutofill property value. Indicates whether or not to block the web browser's auto fill feature.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWebBrowserBlockAutofill() {
        return this.webBrowserBlockAutofill;
    }
    /**
     * Gets the webBrowserBlocked property value. Indicates whether or not to block the web browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWebBrowserBlocked() {
        return this.webBrowserBlocked;
    }
    /**
     * Gets the webBrowserBlockJavaScript property value. Indicates whether or not to block JavaScript within the web browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWebBrowserBlockJavaScript() {
        return this.webBrowserBlockJavaScript;
    }
    /**
     * Gets the webBrowserBlockPopups property value. Indicates whether or not to block popups within the web browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWebBrowserBlockPopups() {
        return this.webBrowserBlockPopups;
    }
    /**
     * Gets the webBrowserCookieSettings property value. Web Browser Cookie Settings.
     * @return a webBrowserCookieSettings
     */
    @javax.annotation.Nullable
    public WebBrowserCookieSettings getWebBrowserCookieSettings() {
        return this.webBrowserCookieSettings;
    }
    /**
     * Gets the wiFiBlocked property value. Indicates whether or not to block syncing Wi-Fi.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWiFiBlocked() {
        return this.wiFiBlocked;
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
    @javax.annotation.Nonnull
    public void setAppsBlockClipboardSharing(@javax.annotation.Nullable final Boolean value) {
        this.appsBlockClipboardSharing = value;
    }
    /**
     * Sets the appsBlockCopyPaste property value. Indicates whether or not to block copy and paste within applications.
     * @param value Value to set for the appsBlockCopyPaste property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsBlockCopyPaste(@javax.annotation.Nullable final Boolean value) {
        this.appsBlockCopyPaste = value;
    }
    /**
     * Sets the appsBlockYouTube property value. Indicates whether or not to block the YouTube app.
     * @param value Value to set for the appsBlockYouTube property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsBlockYouTube(@javax.annotation.Nullable final Boolean value) {
        this.appsBlockYouTube = value;
    }
    /**
     * Sets the appsHideList property value. List of apps to be hidden on the KNOX device. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the appsHideList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsHideList(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this.appsHideList = value;
    }
    /**
     * Sets the appsInstallAllowList property value. List of apps which can be installed on the KNOX device. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the appsInstallAllowList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsInstallAllowList(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this.appsInstallAllowList = value;
    }
    /**
     * Sets the appsLaunchBlockList property value. List of apps which are blocked from being launched on the KNOX device. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the appsLaunchBlockList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsLaunchBlockList(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this.appsLaunchBlockList = value;
    }
    /**
     * Sets the bluetoothBlocked property value. Indicates whether or not to block Bluetooth.
     * @param value Value to set for the bluetoothBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlocked(@javax.annotation.Nullable final Boolean value) {
        this.bluetoothBlocked = value;
    }
    /**
     * Sets the cameraBlocked property value. Indicates whether or not to block the use of the camera.
     * @param value Value to set for the cameraBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCameraBlocked(@javax.annotation.Nullable final Boolean value) {
        this.cameraBlocked = value;
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
     * Sets the cellularBlockMessaging property value. Indicates whether or not to block SMS/MMS messaging.
     * @param value Value to set for the cellularBlockMessaging property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockMessaging(@javax.annotation.Nullable final Boolean value) {
        this.cellularBlockMessaging = value;
    }
    /**
     * Sets the cellularBlockVoiceRoaming property value. Indicates whether or not to block voice roaming.
     * @param value Value to set for the cellularBlockVoiceRoaming property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockVoiceRoaming(@javax.annotation.Nullable final Boolean value) {
        this.cellularBlockVoiceRoaming = value;
    }
    /**
     * Sets the cellularBlockWiFiTethering property value. Indicates whether or not to block syncing Wi-Fi tethering.
     * @param value Value to set for the cellularBlockWiFiTethering property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockWiFiTethering(@javax.annotation.Nullable final Boolean value) {
        this.cellularBlockWiFiTethering = value;
    }
    /**
     * Sets the compliantAppListType property value. Possible values of the compliance app list.
     * @param value Value to set for the compliantAppListType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompliantAppListType(@javax.annotation.Nullable final AppListType value) {
        this.compliantAppListType = value;
    }
    /**
     * Sets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the compliantAppsList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompliantAppsList(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this.compliantAppsList = value;
    }
    /**
     * Sets the deviceSharingAllowed property value. Indicates whether or not to allow device sharing mode.
     * @param value Value to set for the deviceSharingAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceSharingAllowed(@javax.annotation.Nullable final Boolean value) {
        this.deviceSharingAllowed = value;
    }
    /**
     * Sets the diagnosticDataBlockSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @param value Value to set for the diagnosticDataBlockSubmission property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiagnosticDataBlockSubmission(@javax.annotation.Nullable final Boolean value) {
        this.diagnosticDataBlockSubmission = value;
    }
    /**
     * Sets the factoryResetBlocked property value. Indicates whether or not to block user performing a factory reset.
     * @param value Value to set for the factoryResetBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFactoryResetBlocked(@javax.annotation.Nullable final Boolean value) {
        this.factoryResetBlocked = value;
    }
    /**
     * Sets the googleAccountBlockAutoSync property value. Indicates whether or not to block Google account auto sync.
     * @param value Value to set for the googleAccountBlockAutoSync property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGoogleAccountBlockAutoSync(@javax.annotation.Nullable final Boolean value) {
        this.googleAccountBlockAutoSync = value;
    }
    /**
     * Sets the googlePlayStoreBlocked property value. Indicates whether or not to block the Google Play store.
     * @param value Value to set for the googlePlayStoreBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGooglePlayStoreBlocked(@javax.annotation.Nullable final Boolean value) {
        this.googlePlayStoreBlocked = value;
    }
    /**
     * Sets the kioskModeApps property value. A list of apps that will be allowed to run when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the kioskModeApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeApps(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this.kioskModeApps = value;
    }
    /**
     * Sets the kioskModeBlockSleepButton property value. Indicates whether or not to block the screen sleep button while in Kiosk Mode.
     * @param value Value to set for the kioskModeBlockSleepButton property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeBlockSleepButton(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeBlockSleepButton = value;
    }
    /**
     * Sets the kioskModeBlockVolumeButtons property value. Indicates whether or not to block the volume buttons while in Kiosk Mode.
     * @param value Value to set for the kioskModeBlockVolumeButtons property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeBlockVolumeButtons(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeBlockVolumeButtons = value;
    }
    /**
     * Sets the locationServicesBlocked property value. Indicates whether or not to block location services.
     * @param value Value to set for the locationServicesBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocationServicesBlocked(@javax.annotation.Nullable final Boolean value) {
        this.locationServicesBlocked = value;
    }
    /**
     * Sets the nfcBlocked property value. Indicates whether or not to block Near-Field Communication.
     * @param value Value to set for the nfcBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNfcBlocked(@javax.annotation.Nullable final Boolean value) {
        this.nfcBlocked = value;
    }
    /**
     * Sets the passwordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @param value Value to set for the passwordBlockFingerprintUnlock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockFingerprintUnlock(@javax.annotation.Nullable final Boolean value) {
        this.passwordBlockFingerprintUnlock = value;
    }
    /**
     * Sets the passwordBlockTrustAgents property value. Indicates whether or not to block Smart Lock and other trust agents.
     * @param value Value to set for the passwordBlockTrustAgents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockTrustAgents(@javax.annotation.Nullable final Boolean value) {
        this.passwordBlockTrustAgents = value;
    }
    /**
     * Sets the passwordExpirationDays property value. Number of days before the password expires. Valid values 1 to 365
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this.passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumLength property value. Minimum length of passwords. Valid values 4 to 16
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this.passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@javax.annotation.Nullable final Integer value) {
        this.passwordMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block. Valid values 0 to 24
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordPreviousPasswordBlockCount(@javax.annotation.Nullable final Integer value) {
        this.passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequired property value. Indicates whether or not to require a password.
     * @param value Value to set for the passwordRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequired(@javax.annotation.Nullable final Boolean value) {
        this.passwordRequired = value;
    }
    /**
     * Sets the passwordRequiredType property value. Android required password type.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequiredType(@javax.annotation.Nullable final AndroidRequiredPasswordType value) {
        this.passwordRequiredType = value;
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. Number of sign in failures allowed before factory reset. Valid values 1 to 16
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordSignInFailureCountBeforeFactoryReset(@javax.annotation.Nullable final Integer value) {
        this.passwordSignInFailureCountBeforeFactoryReset = value;
    }
    /**
     * Sets the powerOffBlocked property value. Indicates whether or not to block powering off the device.
     * @param value Value to set for the powerOffBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPowerOffBlocked(@javax.annotation.Nullable final Boolean value) {
        this.powerOffBlocked = value;
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to block screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScreenCaptureBlocked(@javax.annotation.Nullable final Boolean value) {
        this.screenCaptureBlocked = value;
    }
    /**
     * Sets the securityRequireVerifyApps property value. Require the Android Verify apps feature is turned on.
     * @param value Value to set for the securityRequireVerifyApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityRequireVerifyApps(@javax.annotation.Nullable final Boolean value) {
        this.securityRequireVerifyApps = value;
    }
    /**
     * Sets the storageBlockGoogleBackup property value. Indicates whether or not to block Google Backup.
     * @param value Value to set for the storageBlockGoogleBackup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageBlockGoogleBackup(@javax.annotation.Nullable final Boolean value) {
        this.storageBlockGoogleBackup = value;
    }
    /**
     * Sets the storageBlockRemovableStorage property value. Indicates whether or not to block removable storage usage.
     * @param value Value to set for the storageBlockRemovableStorage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageBlockRemovableStorage(@javax.annotation.Nullable final Boolean value) {
        this.storageBlockRemovableStorage = value;
    }
    /**
     * Sets the storageRequireDeviceEncryption property value. Indicates whether or not to require device encryption.
     * @param value Value to set for the storageRequireDeviceEncryption property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageRequireDeviceEncryption(@javax.annotation.Nullable final Boolean value) {
        this.storageRequireDeviceEncryption = value;
    }
    /**
     * Sets the storageRequireRemovableStorageEncryption property value. Indicates whether or not to require removable storage encryption.
     * @param value Value to set for the storageRequireRemovableStorageEncryption property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageRequireRemovableStorageEncryption(@javax.annotation.Nullable final Boolean value) {
        this.storageRequireRemovableStorageEncryption = value;
    }
    /**
     * Sets the voiceAssistantBlocked property value. Indicates whether or not to block the use of the Voice Assistant.
     * @param value Value to set for the voiceAssistantBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVoiceAssistantBlocked(@javax.annotation.Nullable final Boolean value) {
        this.voiceAssistantBlocked = value;
    }
    /**
     * Sets the voiceDialingBlocked property value. Indicates whether or not to block voice dialing.
     * @param value Value to set for the voiceDialingBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVoiceDialingBlocked(@javax.annotation.Nullable final Boolean value) {
        this.voiceDialingBlocked = value;
    }
    /**
     * Sets the webBrowserBlockAutofill property value. Indicates whether or not to block the web browser's auto fill feature.
     * @param value Value to set for the webBrowserBlockAutofill property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebBrowserBlockAutofill(@javax.annotation.Nullable final Boolean value) {
        this.webBrowserBlockAutofill = value;
    }
    /**
     * Sets the webBrowserBlocked property value. Indicates whether or not to block the web browser.
     * @param value Value to set for the webBrowserBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebBrowserBlocked(@javax.annotation.Nullable final Boolean value) {
        this.webBrowserBlocked = value;
    }
    /**
     * Sets the webBrowserBlockJavaScript property value. Indicates whether or not to block JavaScript within the web browser.
     * @param value Value to set for the webBrowserBlockJavaScript property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebBrowserBlockJavaScript(@javax.annotation.Nullable final Boolean value) {
        this.webBrowserBlockJavaScript = value;
    }
    /**
     * Sets the webBrowserBlockPopups property value. Indicates whether or not to block popups within the web browser.
     * @param value Value to set for the webBrowserBlockPopups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebBrowserBlockPopups(@javax.annotation.Nullable final Boolean value) {
        this.webBrowserBlockPopups = value;
    }
    /**
     * Sets the webBrowserCookieSettings property value. Web Browser Cookie Settings.
     * @param value Value to set for the webBrowserCookieSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebBrowserCookieSettings(@javax.annotation.Nullable final WebBrowserCookieSettings value) {
        this.webBrowserCookieSettings = value;
    }
    /**
     * Sets the wiFiBlocked property value. Indicates whether or not to block syncing Wi-Fi.
     * @param value Value to set for the wiFiBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWiFiBlocked(@javax.annotation.Nullable final Boolean value) {
        this.wiFiBlocked = value;
    }
}
