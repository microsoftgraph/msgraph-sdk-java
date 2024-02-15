package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the androidGeneralDeviceConfiguration resource.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidGeneralDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link AndroidGeneralDeviceConfiguration} and sets the default values.
     */
    public AndroidGeneralDeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidGeneralDeviceConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AndroidGeneralDeviceConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static AndroidGeneralDeviceConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidGeneralDeviceConfiguration();
    }
    /**
     * Gets the appsBlockClipboardSharing property value. Indicates whether or not to block clipboard sharing to copy and paste between applications.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAppsBlockClipboardSharing() {
        return this.backingStore.get("appsBlockClipboardSharing");
    }
    /**
     * Gets the appsBlockCopyPaste property value. Indicates whether or not to block copy and paste within applications.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAppsBlockCopyPaste() {
        return this.backingStore.get("appsBlockCopyPaste");
    }
    /**
     * Gets the appsBlockYouTube property value. Indicates whether or not to block the YouTube app.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAppsBlockYouTube() {
        return this.backingStore.get("appsBlockYouTube");
    }
    /**
     * Gets the appsHideList property value. List of apps to be hidden on the KNOX device. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<AppListItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getAppsHideList() {
        return this.backingStore.get("appsHideList");
    }
    /**
     * Gets the appsInstallAllowList property value. List of apps which can be installed on the KNOX device. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<AppListItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getAppsInstallAllowList() {
        return this.backingStore.get("appsInstallAllowList");
    }
    /**
     * Gets the appsLaunchBlockList property value. List of apps which are blocked from being launched on the KNOX device. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<AppListItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getAppsLaunchBlockList() {
        return this.backingStore.get("appsLaunchBlockList");
    }
    /**
     * Gets the bluetoothBlocked property value. Indicates whether or not to block Bluetooth.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBluetoothBlocked() {
        return this.backingStore.get("bluetoothBlocked");
    }
    /**
     * Gets the cameraBlocked property value. Indicates whether or not to block the use of the camera.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this.backingStore.get("cameraBlocked");
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
     * Gets the cellularBlockMessaging property value. Indicates whether or not to block SMS/MMS messaging.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockMessaging() {
        return this.backingStore.get("cellularBlockMessaging");
    }
    /**
     * Gets the cellularBlockVoiceRoaming property value. Indicates whether or not to block voice roaming.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockVoiceRoaming() {
        return this.backingStore.get("cellularBlockVoiceRoaming");
    }
    /**
     * Gets the cellularBlockWiFiTethering property value. Indicates whether or not to block syncing Wi-Fi tethering.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockWiFiTethering() {
        return this.backingStore.get("cellularBlockWiFiTethering");
    }
    /**
     * Gets the compliantAppListType property value. Possible values of the compliance app list.
     * @return a {@link AppListType}
     */
    @jakarta.annotation.Nullable
    public AppListType getCompliantAppListType() {
        return this.backingStore.get("compliantAppListType");
    }
    /**
     * Gets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @return a {@link java.util.List<AppListItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getCompliantAppsList() {
        return this.backingStore.get("compliantAppsList");
    }
    /**
     * Gets the deviceSharingAllowed property value. Indicates whether or not to allow device sharing mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceSharingAllowed() {
        return this.backingStore.get("deviceSharingAllowed");
    }
    /**
     * Gets the diagnosticDataBlockSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDiagnosticDataBlockSubmission() {
        return this.backingStore.get("diagnosticDataBlockSubmission");
    }
    /**
     * Gets the factoryResetBlocked property value. Indicates whether or not to block user performing a factory reset.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFactoryResetBlocked() {
        return this.backingStore.get("factoryResetBlocked");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
        deserializerMap.put("compliantAppListType", (n) -> { this.setCompliantAppListType(n.getEnumValue(AppListType::forValue)); });
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
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(AndroidRequiredPasswordType::forValue)); });
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
        deserializerMap.put("webBrowserCookieSettings", (n) -> { this.setWebBrowserCookieSettings(n.getEnumValue(WebBrowserCookieSettings::forValue)); });
        deserializerMap.put("wiFiBlocked", (n) -> { this.setWiFiBlocked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the googleAccountBlockAutoSync property value. Indicates whether or not to block Google account auto sync.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getGoogleAccountBlockAutoSync() {
        return this.backingStore.get("googleAccountBlockAutoSync");
    }
    /**
     * Gets the googlePlayStoreBlocked property value. Indicates whether or not to block the Google Play store.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getGooglePlayStoreBlocked() {
        return this.backingStore.get("googlePlayStoreBlocked");
    }
    /**
     * Gets the kioskModeApps property value. A list of apps that will be allowed to run when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<AppListItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getKioskModeApps() {
        return this.backingStore.get("kioskModeApps");
    }
    /**
     * Gets the kioskModeBlockSleepButton property value. Indicates whether or not to block the screen sleep button while in Kiosk Mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeBlockSleepButton() {
        return this.backingStore.get("kioskModeBlockSleepButton");
    }
    /**
     * Gets the kioskModeBlockVolumeButtons property value. Indicates whether or not to block the volume buttons while in Kiosk Mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeBlockVolumeButtons() {
        return this.backingStore.get("kioskModeBlockVolumeButtons");
    }
    /**
     * Gets the locationServicesBlocked property value. Indicates whether or not to block location services.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocationServicesBlocked() {
        return this.backingStore.get("locationServicesBlocked");
    }
    /**
     * Gets the nfcBlocked property value. Indicates whether or not to block Near-Field Communication.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getNfcBlocked() {
        return this.backingStore.get("nfcBlocked");
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
     * Gets the passwordRequired property value. Indicates whether or not to require a password.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this.backingStore.get("passwordRequired");
    }
    /**
     * Gets the passwordRequiredType property value. Android required password type.
     * @return a {@link AndroidRequiredPasswordType}
     */
    @jakarta.annotation.Nullable
    public AndroidRequiredPasswordType getPasswordRequiredType() {
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
     * Gets the powerOffBlocked property value. Indicates whether or not to block powering off the device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPowerOffBlocked() {
        return this.backingStore.get("powerOffBlocked");
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to block screenshots.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this.backingStore.get("screenCaptureBlocked");
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
     * Gets the storageBlockGoogleBackup property value. Indicates whether or not to block Google Backup.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageBlockGoogleBackup() {
        return this.backingStore.get("storageBlockGoogleBackup");
    }
    /**
     * Gets the storageBlockRemovableStorage property value. Indicates whether or not to block removable storage usage.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageBlockRemovableStorage() {
        return this.backingStore.get("storageBlockRemovableStorage");
    }
    /**
     * Gets the storageRequireDeviceEncryption property value. Indicates whether or not to require device encryption.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageRequireDeviceEncryption() {
        return this.backingStore.get("storageRequireDeviceEncryption");
    }
    /**
     * Gets the storageRequireRemovableStorageEncryption property value. Indicates whether or not to require removable storage encryption.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageRequireRemovableStorageEncryption() {
        return this.backingStore.get("storageRequireRemovableStorageEncryption");
    }
    /**
     * Gets the voiceAssistantBlocked property value. Indicates whether or not to block the use of the Voice Assistant.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getVoiceAssistantBlocked() {
        return this.backingStore.get("voiceAssistantBlocked");
    }
    /**
     * Gets the voiceDialingBlocked property value. Indicates whether or not to block voice dialing.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getVoiceDialingBlocked() {
        return this.backingStore.get("voiceDialingBlocked");
    }
    /**
     * Gets the webBrowserBlockAutofill property value. Indicates whether or not to block the web browser's auto fill feature.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWebBrowserBlockAutofill() {
        return this.backingStore.get("webBrowserBlockAutofill");
    }
    /**
     * Gets the webBrowserBlocked property value. Indicates whether or not to block the web browser.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWebBrowserBlocked() {
        return this.backingStore.get("webBrowserBlocked");
    }
    /**
     * Gets the webBrowserBlockJavaScript property value. Indicates whether or not to block JavaScript within the web browser.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWebBrowserBlockJavaScript() {
        return this.backingStore.get("webBrowserBlockJavaScript");
    }
    /**
     * Gets the webBrowserBlockPopups property value. Indicates whether or not to block popups within the web browser.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWebBrowserBlockPopups() {
        return this.backingStore.get("webBrowserBlockPopups");
    }
    /**
     * Gets the webBrowserCookieSettings property value. Web Browser Cookie Settings.
     * @return a {@link WebBrowserCookieSettings}
     */
    @jakarta.annotation.Nullable
    public WebBrowserCookieSettings getWebBrowserCookieSettings() {
        return this.backingStore.get("webBrowserCookieSettings");
    }
    /**
     * Gets the wiFiBlocked property value. Indicates whether or not to block syncing Wi-Fi.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWiFiBlocked() {
        return this.backingStore.get("wiFiBlocked");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAppsBlockClipboardSharing(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("appsBlockClipboardSharing", value);
    }
    /**
     * Sets the appsBlockCopyPaste property value. Indicates whether or not to block copy and paste within applications.
     * @param value Value to set for the appsBlockCopyPaste property.
     */
    public void setAppsBlockCopyPaste(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("appsBlockCopyPaste", value);
    }
    /**
     * Sets the appsBlockYouTube property value. Indicates whether or not to block the YouTube app.
     * @param value Value to set for the appsBlockYouTube property.
     */
    public void setAppsBlockYouTube(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("appsBlockYouTube", value);
    }
    /**
     * Sets the appsHideList property value. List of apps to be hidden on the KNOX device. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the appsHideList property.
     */
    public void setAppsHideList(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.backingStore.set("appsHideList", value);
    }
    /**
     * Sets the appsInstallAllowList property value. List of apps which can be installed on the KNOX device. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the appsInstallAllowList property.
     */
    public void setAppsInstallAllowList(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.backingStore.set("appsInstallAllowList", value);
    }
    /**
     * Sets the appsLaunchBlockList property value. List of apps which are blocked from being launched on the KNOX device. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the appsLaunchBlockList property.
     */
    public void setAppsLaunchBlockList(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.backingStore.set("appsLaunchBlockList", value);
    }
    /**
     * Sets the bluetoothBlocked property value. Indicates whether or not to block Bluetooth.
     * @param value Value to set for the bluetoothBlocked property.
     */
    public void setBluetoothBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bluetoothBlocked", value);
    }
    /**
     * Sets the cameraBlocked property value. Indicates whether or not to block the use of the camera.
     * @param value Value to set for the cameraBlocked property.
     */
    public void setCameraBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cameraBlocked", value);
    }
    /**
     * Sets the cellularBlockDataRoaming property value. Indicates whether or not to block data roaming.
     * @param value Value to set for the cellularBlockDataRoaming property.
     */
    public void setCellularBlockDataRoaming(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cellularBlockDataRoaming", value);
    }
    /**
     * Sets the cellularBlockMessaging property value. Indicates whether or not to block SMS/MMS messaging.
     * @param value Value to set for the cellularBlockMessaging property.
     */
    public void setCellularBlockMessaging(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cellularBlockMessaging", value);
    }
    /**
     * Sets the cellularBlockVoiceRoaming property value. Indicates whether or not to block voice roaming.
     * @param value Value to set for the cellularBlockVoiceRoaming property.
     */
    public void setCellularBlockVoiceRoaming(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cellularBlockVoiceRoaming", value);
    }
    /**
     * Sets the cellularBlockWiFiTethering property value. Indicates whether or not to block syncing Wi-Fi tethering.
     * @param value Value to set for the cellularBlockWiFiTethering property.
     */
    public void setCellularBlockWiFiTethering(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cellularBlockWiFiTethering", value);
    }
    /**
     * Sets the compliantAppListType property value. Possible values of the compliance app list.
     * @param value Value to set for the compliantAppListType property.
     */
    public void setCompliantAppListType(@jakarta.annotation.Nullable final AppListType value) {
        this.backingStore.set("compliantAppListType", value);
    }
    /**
     * Sets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the compliantAppsList property.
     */
    public void setCompliantAppsList(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.backingStore.set("compliantAppsList", value);
    }
    /**
     * Sets the deviceSharingAllowed property value. Indicates whether or not to allow device sharing mode.
     * @param value Value to set for the deviceSharingAllowed property.
     */
    public void setDeviceSharingAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("deviceSharingAllowed", value);
    }
    /**
     * Sets the diagnosticDataBlockSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @param value Value to set for the diagnosticDataBlockSubmission property.
     */
    public void setDiagnosticDataBlockSubmission(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("diagnosticDataBlockSubmission", value);
    }
    /**
     * Sets the factoryResetBlocked property value. Indicates whether or not to block user performing a factory reset.
     * @param value Value to set for the factoryResetBlocked property.
     */
    public void setFactoryResetBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("factoryResetBlocked", value);
    }
    /**
     * Sets the googleAccountBlockAutoSync property value. Indicates whether or not to block Google account auto sync.
     * @param value Value to set for the googleAccountBlockAutoSync property.
     */
    public void setGoogleAccountBlockAutoSync(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("googleAccountBlockAutoSync", value);
    }
    /**
     * Sets the googlePlayStoreBlocked property value. Indicates whether or not to block the Google Play store.
     * @param value Value to set for the googlePlayStoreBlocked property.
     */
    public void setGooglePlayStoreBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("googlePlayStoreBlocked", value);
    }
    /**
     * Sets the kioskModeApps property value. A list of apps that will be allowed to run when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the kioskModeApps property.
     */
    public void setKioskModeApps(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.backingStore.set("kioskModeApps", value);
    }
    /**
     * Sets the kioskModeBlockSleepButton property value. Indicates whether or not to block the screen sleep button while in Kiosk Mode.
     * @param value Value to set for the kioskModeBlockSleepButton property.
     */
    public void setKioskModeBlockSleepButton(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeBlockSleepButton", value);
    }
    /**
     * Sets the kioskModeBlockVolumeButtons property value. Indicates whether or not to block the volume buttons while in Kiosk Mode.
     * @param value Value to set for the kioskModeBlockVolumeButtons property.
     */
    public void setKioskModeBlockVolumeButtons(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeBlockVolumeButtons", value);
    }
    /**
     * Sets the locationServicesBlocked property value. Indicates whether or not to block location services.
     * @param value Value to set for the locationServicesBlocked property.
     */
    public void setLocationServicesBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("locationServicesBlocked", value);
    }
    /**
     * Sets the nfcBlocked property value. Indicates whether or not to block Near-Field Communication.
     * @param value Value to set for the nfcBlocked property.
     */
    public void setNfcBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("nfcBlocked", value);
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
     * Sets the passwordRequired property value. Indicates whether or not to require a password.
     * @param value Value to set for the passwordRequired property.
     */
    public void setPasswordRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordRequired", value);
    }
    /**
     * Sets the passwordRequiredType property value. Android required password type.
     * @param value Value to set for the passwordRequiredType property.
     */
    public void setPasswordRequiredType(@jakarta.annotation.Nullable final AndroidRequiredPasswordType value) {
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
     * Sets the powerOffBlocked property value. Indicates whether or not to block powering off the device.
     * @param value Value to set for the powerOffBlocked property.
     */
    public void setPowerOffBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("powerOffBlocked", value);
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to block screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     */
    public void setScreenCaptureBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("screenCaptureBlocked", value);
    }
    /**
     * Sets the securityRequireVerifyApps property value. Require the Android Verify apps feature is turned on.
     * @param value Value to set for the securityRequireVerifyApps property.
     */
    public void setSecurityRequireVerifyApps(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityRequireVerifyApps", value);
    }
    /**
     * Sets the storageBlockGoogleBackup property value. Indicates whether or not to block Google Backup.
     * @param value Value to set for the storageBlockGoogleBackup property.
     */
    public void setStorageBlockGoogleBackup(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("storageBlockGoogleBackup", value);
    }
    /**
     * Sets the storageBlockRemovableStorage property value. Indicates whether or not to block removable storage usage.
     * @param value Value to set for the storageBlockRemovableStorage property.
     */
    public void setStorageBlockRemovableStorage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("storageBlockRemovableStorage", value);
    }
    /**
     * Sets the storageRequireDeviceEncryption property value. Indicates whether or not to require device encryption.
     * @param value Value to set for the storageRequireDeviceEncryption property.
     */
    public void setStorageRequireDeviceEncryption(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("storageRequireDeviceEncryption", value);
    }
    /**
     * Sets the storageRequireRemovableStorageEncryption property value. Indicates whether or not to require removable storage encryption.
     * @param value Value to set for the storageRequireRemovableStorageEncryption property.
     */
    public void setStorageRequireRemovableStorageEncryption(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("storageRequireRemovableStorageEncryption", value);
    }
    /**
     * Sets the voiceAssistantBlocked property value. Indicates whether or not to block the use of the Voice Assistant.
     * @param value Value to set for the voiceAssistantBlocked property.
     */
    public void setVoiceAssistantBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("voiceAssistantBlocked", value);
    }
    /**
     * Sets the voiceDialingBlocked property value. Indicates whether or not to block voice dialing.
     * @param value Value to set for the voiceDialingBlocked property.
     */
    public void setVoiceDialingBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("voiceDialingBlocked", value);
    }
    /**
     * Sets the webBrowserBlockAutofill property value. Indicates whether or not to block the web browser's auto fill feature.
     * @param value Value to set for the webBrowserBlockAutofill property.
     */
    public void setWebBrowserBlockAutofill(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("webBrowserBlockAutofill", value);
    }
    /**
     * Sets the webBrowserBlocked property value. Indicates whether or not to block the web browser.
     * @param value Value to set for the webBrowserBlocked property.
     */
    public void setWebBrowserBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("webBrowserBlocked", value);
    }
    /**
     * Sets the webBrowserBlockJavaScript property value. Indicates whether or not to block JavaScript within the web browser.
     * @param value Value to set for the webBrowserBlockJavaScript property.
     */
    public void setWebBrowserBlockJavaScript(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("webBrowserBlockJavaScript", value);
    }
    /**
     * Sets the webBrowserBlockPopups property value. Indicates whether or not to block popups within the web browser.
     * @param value Value to set for the webBrowserBlockPopups property.
     */
    public void setWebBrowserBlockPopups(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("webBrowserBlockPopups", value);
    }
    /**
     * Sets the webBrowserCookieSettings property value. Web Browser Cookie Settings.
     * @param value Value to set for the webBrowserCookieSettings property.
     */
    public void setWebBrowserCookieSettings(@jakarta.annotation.Nullable final WebBrowserCookieSettings value) {
        this.backingStore.set("webBrowserCookieSettings", value);
    }
    /**
     * Sets the wiFiBlocked property value. Indicates whether or not to block syncing Wi-Fi.
     * @param value Value to set for the wiFiBlocked property.
     */
    public void setWiFiBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("wiFiBlocked", value);
    }
}
