package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the iosGeneralDeviceConfiguration resource.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosGeneralDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new IosGeneralDeviceConfiguration and sets the default values.
     */
    public IosGeneralDeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosGeneralDeviceConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosGeneralDeviceConfiguration
     */
    @jakarta.annotation.Nonnull
    public static IosGeneralDeviceConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosGeneralDeviceConfiguration();
    }
    /**
     * Gets the accountBlockModification property value. Indicates whether or not to allow account modification when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAccountBlockModification() {
        return this.getBackingStore().get("accountBlockModification");
    }
    /**
     * Gets the activationLockAllowWhenSupervised property value. Indicates whether or not to allow activation lock when the device is in the supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getActivationLockAllowWhenSupervised() {
        return this.getBackingStore().get("activationLockAllowWhenSupervised");
    }
    /**
     * Gets the airDropBlocked property value. Indicates whether or not to allow AirDrop when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAirDropBlocked() {
        return this.getBackingStore().get("airDropBlocked");
    }
    /**
     * Gets the airDropForceUnmanagedDropTarget property value. Indicates whether or not to cause AirDrop to be considered an unmanaged drop target (iOS 9.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAirDropForceUnmanagedDropTarget() {
        return this.getBackingStore().get("airDropForceUnmanagedDropTarget");
    }
    /**
     * Gets the airPlayForcePairingPasswordForOutgoingRequests property value. Indicates whether or not to enforce all devices receiving AirPlay requests from this device to use a pairing password.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAirPlayForcePairingPasswordForOutgoingRequests() {
        return this.getBackingStore().get("airPlayForcePairingPasswordForOutgoingRequests");
    }
    /**
     * Gets the appleNewsBlocked property value. Indicates whether or not to block the user from using News when the device is in supervised mode (iOS 9.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppleNewsBlocked() {
        return this.getBackingStore().get("appleNewsBlocked");
    }
    /**
     * Gets the appleWatchBlockPairing property value. Indicates whether or not to allow Apple Watch pairing when the device is in supervised mode (iOS 9.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppleWatchBlockPairing() {
        return this.getBackingStore().get("appleWatchBlockPairing");
    }
    /**
     * Gets the appleWatchForceWristDetection property value. Indicates whether or not to force a paired Apple Watch to use Wrist Detection (iOS 8.2 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppleWatchForceWristDetection() {
        return this.getBackingStore().get("appleWatchForceWristDetection");
    }
    /**
     * Gets the appsSingleAppModeList property value. Gets or sets the list of iOS apps allowed to autonomously enter Single App Mode. Supervised only. iOS 7.0 and later. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<AppListItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getAppsSingleAppModeList() {
        return this.getBackingStore().get("appsSingleAppModeList");
    }
    /**
     * Gets the appStoreBlockAutomaticDownloads property value. Indicates whether or not to block the automatic downloading of apps purchased on other devices when the device is in supervised mode (iOS 9.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppStoreBlockAutomaticDownloads() {
        return this.getBackingStore().get("appStoreBlockAutomaticDownloads");
    }
    /**
     * Gets the appStoreBlocked property value. Indicates whether or not to block the user from using the App Store. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppStoreBlocked() {
        return this.getBackingStore().get("appStoreBlocked");
    }
    /**
     * Gets the appStoreBlockInAppPurchases property value. Indicates whether or not to block the user from making in app purchases.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppStoreBlockInAppPurchases() {
        return this.getBackingStore().get("appStoreBlockInAppPurchases");
    }
    /**
     * Gets the appStoreBlockUIAppInstallation property value. Indicates whether or not to block the App Store app, not restricting installation through Host apps. Applies to supervised mode only (iOS 9.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppStoreBlockUIAppInstallation() {
        return this.getBackingStore().get("appStoreBlockUIAppInstallation");
    }
    /**
     * Gets the appStoreRequirePassword property value. Indicates whether or not to require a password when using the app store.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppStoreRequirePassword() {
        return this.getBackingStore().get("appStoreRequirePassword");
    }
    /**
     * Gets the appsVisibilityList property value. List of apps in the visibility list (either visible/launchable apps list or hidden/unlaunchable apps list, controlled by AppsVisibilityListType) (iOS 9.3 and later). This collection can contain a maximum of 10000 elements.
     * @return a java.util.List<AppListItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getAppsVisibilityList() {
        return this.getBackingStore().get("appsVisibilityList");
    }
    /**
     * Gets the appsVisibilityListType property value. Possible values of the compliance app list.
     * @return a AppListType
     */
    @jakarta.annotation.Nullable
    public AppListType getAppsVisibilityListType() {
        return this.getBackingStore().get("appsVisibilityListType");
    }
    /**
     * Gets the bluetoothBlockModification property value. Indicates whether or not to allow modification of Bluetooth settings when the device is in supervised mode (iOS 10.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBluetoothBlockModification() {
        return this.getBackingStore().get("bluetoothBlockModification");
    }
    /**
     * Gets the cameraBlocked property value. Indicates whether or not to block the user from accessing the camera of the device. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this.getBackingStore().get("cameraBlocked");
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
     * Gets the cellularBlockGlobalBackgroundFetchWhileRoaming property value. Indicates whether or not to block global background fetch while roaming.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockGlobalBackgroundFetchWhileRoaming() {
        return this.getBackingStore().get("cellularBlockGlobalBackgroundFetchWhileRoaming");
    }
    /**
     * Gets the cellularBlockPerAppDataModification property value. Indicates whether or not to allow changes to cellular app data usage settings when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockPerAppDataModification() {
        return this.getBackingStore().get("cellularBlockPerAppDataModification");
    }
    /**
     * Gets the cellularBlockPersonalHotspot property value. Indicates whether or not to block Personal Hotspot.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockPersonalHotspot() {
        return this.getBackingStore().get("cellularBlockPersonalHotspot");
    }
    /**
     * Gets the cellularBlockVoiceRoaming property value. Indicates whether or not to block voice roaming.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockVoiceRoaming() {
        return this.getBackingStore().get("cellularBlockVoiceRoaming");
    }
    /**
     * Gets the certificatesBlockUntrustedTlsCertificates property value. Indicates whether or not to block untrusted TLS certificates.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCertificatesBlockUntrustedTlsCertificates() {
        return this.getBackingStore().get("certificatesBlockUntrustedTlsCertificates");
    }
    /**
     * Gets the classroomAppBlockRemoteScreenObservation property value. Indicates whether or not to allow remote screen observation by Classroom app when the device is in supervised mode (iOS 9.3 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getClassroomAppBlockRemoteScreenObservation() {
        return this.getBackingStore().get("classroomAppBlockRemoteScreenObservation");
    }
    /**
     * Gets the classroomAppForceUnpromptedScreenObservation property value. Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to view a student's screen without prompting when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getClassroomAppForceUnpromptedScreenObservation() {
        return this.getBackingStore().get("classroomAppForceUnpromptedScreenObservation");
    }
    /**
     * Gets the compliantAppListType property value. Possible values of the compliance app list.
     * @return a AppListType
     */
    @jakarta.annotation.Nullable
    public AppListType getCompliantAppListType() {
        return this.getBackingStore().get("compliantAppListType");
    }
    /**
     * Gets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @return a java.util.List<AppListItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getCompliantAppsList() {
        return this.getBackingStore().get("compliantAppsList");
    }
    /**
     * Gets the configurationProfileBlockChanges property value. Indicates whether or not to block the user from installing configuration profiles and certificates interactively when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConfigurationProfileBlockChanges() {
        return this.getBackingStore().get("configurationProfileBlockChanges");
    }
    /**
     * Gets the definitionLookupBlocked property value. Indicates whether or not to block definition lookup when the device is in supervised mode (iOS 8.1.3 and later ).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefinitionLookupBlocked() {
        return this.getBackingStore().get("definitionLookupBlocked");
    }
    /**
     * Gets the deviceBlockEnableRestrictions property value. Indicates whether or not to allow the user to enables restrictions in the device settings when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceBlockEnableRestrictions() {
        return this.getBackingStore().get("deviceBlockEnableRestrictions");
    }
    /**
     * Gets the deviceBlockEraseContentAndSettings property value. Indicates whether or not to allow the use of the 'Erase all content and settings' option on the device when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceBlockEraseContentAndSettings() {
        return this.getBackingStore().get("deviceBlockEraseContentAndSettings");
    }
    /**
     * Gets the deviceBlockNameModification property value. Indicates whether or not to allow device name modification when the device is in supervised mode (iOS 9.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceBlockNameModification() {
        return this.getBackingStore().get("deviceBlockNameModification");
    }
    /**
     * Gets the diagnosticDataBlockSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDiagnosticDataBlockSubmission() {
        return this.getBackingStore().get("diagnosticDataBlockSubmission");
    }
    /**
     * Gets the diagnosticDataBlockSubmissionModification property value. Indicates whether or not to allow diagnostics submission settings modification when the device is in supervised mode (iOS 9.3.2 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDiagnosticDataBlockSubmissionModification() {
        return this.getBackingStore().get("diagnosticDataBlockSubmissionModification");
    }
    /**
     * Gets the documentsBlockManagedDocumentsInUnmanagedApps property value. Indicates whether or not to block the user from viewing managed documents in unmanaged apps.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDocumentsBlockManagedDocumentsInUnmanagedApps() {
        return this.getBackingStore().get("documentsBlockManagedDocumentsInUnmanagedApps");
    }
    /**
     * Gets the documentsBlockUnmanagedDocumentsInManagedApps property value. Indicates whether or not to block the user from viewing unmanaged documents in managed apps.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDocumentsBlockUnmanagedDocumentsInManagedApps() {
        return this.getBackingStore().get("documentsBlockUnmanagedDocumentsInManagedApps");
    }
    /**
     * Gets the emailInDomainSuffixes property value. An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEmailInDomainSuffixes() {
        return this.getBackingStore().get("emailInDomainSuffixes");
    }
    /**
     * Gets the enterpriseAppBlockTrust property value. Indicates whether or not to block the user from trusting an enterprise app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnterpriseAppBlockTrust() {
        return this.getBackingStore().get("enterpriseAppBlockTrust");
    }
    /**
     * Gets the enterpriseAppBlockTrustModification property value. [Deprecated] Configuring this setting and setting the value to 'true' has no effect on the device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnterpriseAppBlockTrustModification() {
        return this.getBackingStore().get("enterpriseAppBlockTrustModification");
    }
    /**
     * Gets the faceTimeBlocked property value. Indicates whether or not to block the user from using FaceTime. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFaceTimeBlocked() {
        return this.getBackingStore().get("faceTimeBlocked");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountBlockModification", (n) -> { this.setAccountBlockModification(n.getBooleanValue()); });
        deserializerMap.put("activationLockAllowWhenSupervised", (n) -> { this.setActivationLockAllowWhenSupervised(n.getBooleanValue()); });
        deserializerMap.put("airDropBlocked", (n) -> { this.setAirDropBlocked(n.getBooleanValue()); });
        deserializerMap.put("airDropForceUnmanagedDropTarget", (n) -> { this.setAirDropForceUnmanagedDropTarget(n.getBooleanValue()); });
        deserializerMap.put("airPlayForcePairingPasswordForOutgoingRequests", (n) -> { this.setAirPlayForcePairingPasswordForOutgoingRequests(n.getBooleanValue()); });
        deserializerMap.put("appleNewsBlocked", (n) -> { this.setAppleNewsBlocked(n.getBooleanValue()); });
        deserializerMap.put("appleWatchBlockPairing", (n) -> { this.setAppleWatchBlockPairing(n.getBooleanValue()); });
        deserializerMap.put("appleWatchForceWristDetection", (n) -> { this.setAppleWatchForceWristDetection(n.getBooleanValue()); });
        deserializerMap.put("appsSingleAppModeList", (n) -> { this.setAppsSingleAppModeList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("appStoreBlockAutomaticDownloads", (n) -> { this.setAppStoreBlockAutomaticDownloads(n.getBooleanValue()); });
        deserializerMap.put("appStoreBlocked", (n) -> { this.setAppStoreBlocked(n.getBooleanValue()); });
        deserializerMap.put("appStoreBlockInAppPurchases", (n) -> { this.setAppStoreBlockInAppPurchases(n.getBooleanValue()); });
        deserializerMap.put("appStoreBlockUIAppInstallation", (n) -> { this.setAppStoreBlockUIAppInstallation(n.getBooleanValue()); });
        deserializerMap.put("appStoreRequirePassword", (n) -> { this.setAppStoreRequirePassword(n.getBooleanValue()); });
        deserializerMap.put("appsVisibilityList", (n) -> { this.setAppsVisibilityList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("appsVisibilityListType", (n) -> { this.setAppsVisibilityListType(n.getEnumValue(AppListType.class)); });
        deserializerMap.put("bluetoothBlockModification", (n) -> { this.setBluetoothBlockModification(n.getBooleanValue()); });
        deserializerMap.put("cameraBlocked", (n) -> { this.setCameraBlocked(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockDataRoaming", (n) -> { this.setCellularBlockDataRoaming(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockGlobalBackgroundFetchWhileRoaming", (n) -> { this.setCellularBlockGlobalBackgroundFetchWhileRoaming(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockPerAppDataModification", (n) -> { this.setCellularBlockPerAppDataModification(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockPersonalHotspot", (n) -> { this.setCellularBlockPersonalHotspot(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockVoiceRoaming", (n) -> { this.setCellularBlockVoiceRoaming(n.getBooleanValue()); });
        deserializerMap.put("certificatesBlockUntrustedTlsCertificates", (n) -> { this.setCertificatesBlockUntrustedTlsCertificates(n.getBooleanValue()); });
        deserializerMap.put("classroomAppBlockRemoteScreenObservation", (n) -> { this.setClassroomAppBlockRemoteScreenObservation(n.getBooleanValue()); });
        deserializerMap.put("classroomAppForceUnpromptedScreenObservation", (n) -> { this.setClassroomAppForceUnpromptedScreenObservation(n.getBooleanValue()); });
        deserializerMap.put("compliantAppListType", (n) -> { this.setCompliantAppListType(n.getEnumValue(AppListType.class)); });
        deserializerMap.put("compliantAppsList", (n) -> { this.setCompliantAppsList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationProfileBlockChanges", (n) -> { this.setConfigurationProfileBlockChanges(n.getBooleanValue()); });
        deserializerMap.put("definitionLookupBlocked", (n) -> { this.setDefinitionLookupBlocked(n.getBooleanValue()); });
        deserializerMap.put("deviceBlockEnableRestrictions", (n) -> { this.setDeviceBlockEnableRestrictions(n.getBooleanValue()); });
        deserializerMap.put("deviceBlockEraseContentAndSettings", (n) -> { this.setDeviceBlockEraseContentAndSettings(n.getBooleanValue()); });
        deserializerMap.put("deviceBlockNameModification", (n) -> { this.setDeviceBlockNameModification(n.getBooleanValue()); });
        deserializerMap.put("diagnosticDataBlockSubmission", (n) -> { this.setDiagnosticDataBlockSubmission(n.getBooleanValue()); });
        deserializerMap.put("diagnosticDataBlockSubmissionModification", (n) -> { this.setDiagnosticDataBlockSubmissionModification(n.getBooleanValue()); });
        deserializerMap.put("documentsBlockManagedDocumentsInUnmanagedApps", (n) -> { this.setDocumentsBlockManagedDocumentsInUnmanagedApps(n.getBooleanValue()); });
        deserializerMap.put("documentsBlockUnmanagedDocumentsInManagedApps", (n) -> { this.setDocumentsBlockUnmanagedDocumentsInManagedApps(n.getBooleanValue()); });
        deserializerMap.put("emailInDomainSuffixes", (n) -> { this.setEmailInDomainSuffixes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("enterpriseAppBlockTrust", (n) -> { this.setEnterpriseAppBlockTrust(n.getBooleanValue()); });
        deserializerMap.put("enterpriseAppBlockTrustModification", (n) -> { this.setEnterpriseAppBlockTrustModification(n.getBooleanValue()); });
        deserializerMap.put("faceTimeBlocked", (n) -> { this.setFaceTimeBlocked(n.getBooleanValue()); });
        deserializerMap.put("findMyFriendsBlocked", (n) -> { this.setFindMyFriendsBlocked(n.getBooleanValue()); });
        deserializerMap.put("gameCenterBlocked", (n) -> { this.setGameCenterBlocked(n.getBooleanValue()); });
        deserializerMap.put("gamingBlockGameCenterFriends", (n) -> { this.setGamingBlockGameCenterFriends(n.getBooleanValue()); });
        deserializerMap.put("gamingBlockMultiplayer", (n) -> { this.setGamingBlockMultiplayer(n.getBooleanValue()); });
        deserializerMap.put("hostPairingBlocked", (n) -> { this.setHostPairingBlocked(n.getBooleanValue()); });
        deserializerMap.put("iBooksStoreBlocked", (n) -> { this.setIBooksStoreBlocked(n.getBooleanValue()); });
        deserializerMap.put("iBooksStoreBlockErotica", (n) -> { this.setIBooksStoreBlockErotica(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockActivityContinuation", (n) -> { this.setICloudBlockActivityContinuation(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockBackup", (n) -> { this.setICloudBlockBackup(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockDocumentSync", (n) -> { this.setICloudBlockDocumentSync(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockManagedAppsSync", (n) -> { this.setICloudBlockManagedAppsSync(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockPhotoLibrary", (n) -> { this.setICloudBlockPhotoLibrary(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockPhotoStreamSync", (n) -> { this.setICloudBlockPhotoStreamSync(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockSharedPhotoStream", (n) -> { this.setICloudBlockSharedPhotoStream(n.getBooleanValue()); });
        deserializerMap.put("iCloudRequireEncryptedBackup", (n) -> { this.setICloudRequireEncryptedBackup(n.getBooleanValue()); });
        deserializerMap.put("iTunesBlockExplicitContent", (n) -> { this.setITunesBlockExplicitContent(n.getBooleanValue()); });
        deserializerMap.put("iTunesBlockMusicService", (n) -> { this.setITunesBlockMusicService(n.getBooleanValue()); });
        deserializerMap.put("iTunesBlockRadio", (n) -> { this.setITunesBlockRadio(n.getBooleanValue()); });
        deserializerMap.put("keyboardBlockAutoCorrect", (n) -> { this.setKeyboardBlockAutoCorrect(n.getBooleanValue()); });
        deserializerMap.put("keyboardBlockDictation", (n) -> { this.setKeyboardBlockDictation(n.getBooleanValue()); });
        deserializerMap.put("keyboardBlockPredictive", (n) -> { this.setKeyboardBlockPredictive(n.getBooleanValue()); });
        deserializerMap.put("keyboardBlockShortcuts", (n) -> { this.setKeyboardBlockShortcuts(n.getBooleanValue()); });
        deserializerMap.put("keyboardBlockSpellCheck", (n) -> { this.setKeyboardBlockSpellCheck(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowAssistiveSpeak", (n) -> { this.setKioskModeAllowAssistiveSpeak(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowAssistiveTouchSettings", (n) -> { this.setKioskModeAllowAssistiveTouchSettings(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowAutoLock", (n) -> { this.setKioskModeAllowAutoLock(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowColorInversionSettings", (n) -> { this.setKioskModeAllowColorInversionSettings(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowRingerSwitch", (n) -> { this.setKioskModeAllowRingerSwitch(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowScreenRotation", (n) -> { this.setKioskModeAllowScreenRotation(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowSleepButton", (n) -> { this.setKioskModeAllowSleepButton(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowTouchscreen", (n) -> { this.setKioskModeAllowTouchscreen(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowVoiceOverSettings", (n) -> { this.setKioskModeAllowVoiceOverSettings(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowVolumeButtons", (n) -> { this.setKioskModeAllowVolumeButtons(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowZoomSettings", (n) -> { this.setKioskModeAllowZoomSettings(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAppStoreUrl", (n) -> { this.setKioskModeAppStoreUrl(n.getStringValue()); });
        deserializerMap.put("kioskModeBuiltInAppId", (n) -> { this.setKioskModeBuiltInAppId(n.getStringValue()); });
        deserializerMap.put("kioskModeManagedAppId", (n) -> { this.setKioskModeManagedAppId(n.getStringValue()); });
        deserializerMap.put("kioskModeRequireAssistiveTouch", (n) -> { this.setKioskModeRequireAssistiveTouch(n.getBooleanValue()); });
        deserializerMap.put("kioskModeRequireColorInversion", (n) -> { this.setKioskModeRequireColorInversion(n.getBooleanValue()); });
        deserializerMap.put("kioskModeRequireMonoAudio", (n) -> { this.setKioskModeRequireMonoAudio(n.getBooleanValue()); });
        deserializerMap.put("kioskModeRequireVoiceOver", (n) -> { this.setKioskModeRequireVoiceOver(n.getBooleanValue()); });
        deserializerMap.put("kioskModeRequireZoom", (n) -> { this.setKioskModeRequireZoom(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockControlCenter", (n) -> { this.setLockScreenBlockControlCenter(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockNotificationView", (n) -> { this.setLockScreenBlockNotificationView(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockPassbook", (n) -> { this.setLockScreenBlockPassbook(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockTodayView", (n) -> { this.setLockScreenBlockTodayView(n.getBooleanValue()); });
        deserializerMap.put("mediaContentRatingApps", (n) -> { this.setMediaContentRatingApps(n.getEnumValue(RatingAppsType.class)); });
        deserializerMap.put("mediaContentRatingAustralia", (n) -> { this.setMediaContentRatingAustralia(n.getObjectValue(MediaContentRatingAustralia::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingCanada", (n) -> { this.setMediaContentRatingCanada(n.getObjectValue(MediaContentRatingCanada::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingFrance", (n) -> { this.setMediaContentRatingFrance(n.getObjectValue(MediaContentRatingFrance::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingGermany", (n) -> { this.setMediaContentRatingGermany(n.getObjectValue(MediaContentRatingGermany::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingIreland", (n) -> { this.setMediaContentRatingIreland(n.getObjectValue(MediaContentRatingIreland::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingJapan", (n) -> { this.setMediaContentRatingJapan(n.getObjectValue(MediaContentRatingJapan::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingNewZealand", (n) -> { this.setMediaContentRatingNewZealand(n.getObjectValue(MediaContentRatingNewZealand::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingUnitedKingdom", (n) -> { this.setMediaContentRatingUnitedKingdom(n.getObjectValue(MediaContentRatingUnitedKingdom::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingUnitedStates", (n) -> { this.setMediaContentRatingUnitedStates(n.getObjectValue(MediaContentRatingUnitedStates::createFromDiscriminatorValue)); });
        deserializerMap.put("messagesBlocked", (n) -> { this.setMessagesBlocked(n.getBooleanValue()); });
        deserializerMap.put("networkUsageRules", (n) -> { this.setNetworkUsageRules(n.getCollectionOfObjectValues(IosNetworkUsageRule::createFromDiscriminatorValue)); });
        deserializerMap.put("notificationsBlockSettingsModification", (n) -> { this.setNotificationsBlockSettingsModification(n.getBooleanValue()); });
        deserializerMap.put("passcodeBlockFingerprintModification", (n) -> { this.setPasscodeBlockFingerprintModification(n.getBooleanValue()); });
        deserializerMap.put("passcodeBlockFingerprintUnlock", (n) -> { this.setPasscodeBlockFingerprintUnlock(n.getBooleanValue()); });
        deserializerMap.put("passcodeBlockModification", (n) -> { this.setPasscodeBlockModification(n.getBooleanValue()); });
        deserializerMap.put("passcodeBlockSimple", (n) -> { this.setPasscodeBlockSimple(n.getBooleanValue()); });
        deserializerMap.put("passcodeExpirationDays", (n) -> { this.setPasscodeExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passcodeMinimumCharacterSetCount", (n) -> { this.setPasscodeMinimumCharacterSetCount(n.getIntegerValue()); });
        deserializerMap.put("passcodeMinimumLength", (n) -> { this.setPasscodeMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passcodeMinutesOfInactivityBeforeLock", (n) -> { this.setPasscodeMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
        deserializerMap.put("passcodeMinutesOfInactivityBeforeScreenTimeout", (n) -> { this.setPasscodeMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("passcodePreviousPasscodeBlockCount", (n) -> { this.setPasscodePreviousPasscodeBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passcodeRequired", (n) -> { this.setPasscodeRequired(n.getBooleanValue()); });
        deserializerMap.put("passcodeRequiredType", (n) -> { this.setPasscodeRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
        deserializerMap.put("passcodeSignInFailureCountBeforeWipe", (n) -> { this.setPasscodeSignInFailureCountBeforeWipe(n.getIntegerValue()); });
        deserializerMap.put("podcastsBlocked", (n) -> { this.setPodcastsBlocked(n.getBooleanValue()); });
        deserializerMap.put("safariBlockAutofill", (n) -> { this.setSafariBlockAutofill(n.getBooleanValue()); });
        deserializerMap.put("safariBlocked", (n) -> { this.setSafariBlocked(n.getBooleanValue()); });
        deserializerMap.put("safariBlockJavaScript", (n) -> { this.setSafariBlockJavaScript(n.getBooleanValue()); });
        deserializerMap.put("safariBlockPopups", (n) -> { this.setSafariBlockPopups(n.getBooleanValue()); });
        deserializerMap.put("safariCookieSettings", (n) -> { this.setSafariCookieSettings(n.getEnumValue(WebBrowserCookieSettings.class)); });
        deserializerMap.put("safariManagedDomains", (n) -> { this.setSafariManagedDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("safariPasswordAutoFillDomains", (n) -> { this.setSafariPasswordAutoFillDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("safariRequireFraudWarning", (n) -> { this.setSafariRequireFraudWarning(n.getBooleanValue()); });
        deserializerMap.put("screenCaptureBlocked", (n) -> { this.setScreenCaptureBlocked(n.getBooleanValue()); });
        deserializerMap.put("siriBlocked", (n) -> { this.setSiriBlocked(n.getBooleanValue()); });
        deserializerMap.put("siriBlockedWhenLocked", (n) -> { this.setSiriBlockedWhenLocked(n.getBooleanValue()); });
        deserializerMap.put("siriBlockUserGeneratedContent", (n) -> { this.setSiriBlockUserGeneratedContent(n.getBooleanValue()); });
        deserializerMap.put("siriRequireProfanityFilter", (n) -> { this.setSiriRequireProfanityFilter(n.getBooleanValue()); });
        deserializerMap.put("spotlightBlockInternetResults", (n) -> { this.setSpotlightBlockInternetResults(n.getBooleanValue()); });
        deserializerMap.put("voiceDialingBlocked", (n) -> { this.setVoiceDialingBlocked(n.getBooleanValue()); });
        deserializerMap.put("wallpaperBlockModification", (n) -> { this.setWallpaperBlockModification(n.getBooleanValue()); });
        deserializerMap.put("wiFiConnectOnlyToConfiguredNetworks", (n) -> { this.setWiFiConnectOnlyToConfiguredNetworks(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the findMyFriendsBlocked property value. Indicates whether or not to block changes to Find My Friends when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFindMyFriendsBlocked() {
        return this.getBackingStore().get("findMyFriendsBlocked");
    }
    /**
     * Gets the gameCenterBlocked property value. Indicates whether or not to block the user from using Game Center when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getGameCenterBlocked() {
        return this.getBackingStore().get("gameCenterBlocked");
    }
    /**
     * Gets the gamingBlockGameCenterFriends property value. Indicates whether or not to block the user from having friends in Game Center. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getGamingBlockGameCenterFriends() {
        return this.getBackingStore().get("gamingBlockGameCenterFriends");
    }
    /**
     * Gets the gamingBlockMultiplayer property value. Indicates whether or not to block the user from using multiplayer gaming. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getGamingBlockMultiplayer() {
        return this.getBackingStore().get("gamingBlockMultiplayer");
    }
    /**
     * Gets the hostPairingBlocked property value. indicates whether or not to allow host pairing to control the devices an iOS device can pair with when the iOS device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHostPairingBlocked() {
        return this.getBackingStore().get("hostPairingBlocked");
    }
    /**
     * Gets the iBooksStoreBlocked property value. Indicates whether or not to block the user from using the iBooks Store when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIBooksStoreBlocked() {
        return this.getBackingStore().get("iBooksStoreBlocked");
    }
    /**
     * Gets the iBooksStoreBlockErotica property value. Indicates whether or not to block the user from downloading media from the iBookstore that has been tagged as erotica.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIBooksStoreBlockErotica() {
        return this.getBackingStore().get("iBooksStoreBlockErotica");
    }
    /**
     * Gets the iCloudBlockActivityContinuation property value. Indicates whether or not to block the user from continuing work they started on iOS device to another iOS or macOS device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockActivityContinuation() {
        return this.getBackingStore().get("iCloudBlockActivityContinuation");
    }
    /**
     * Gets the iCloudBlockBackup property value. Indicates whether or not to block iCloud backup. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockBackup() {
        return this.getBackingStore().get("iCloudBlockBackup");
    }
    /**
     * Gets the iCloudBlockDocumentSync property value. Indicates whether or not to block iCloud document sync. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockDocumentSync() {
        return this.getBackingStore().get("iCloudBlockDocumentSync");
    }
    /**
     * Gets the iCloudBlockManagedAppsSync property value. Indicates whether or not to block Managed Apps Cloud Sync.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockManagedAppsSync() {
        return this.getBackingStore().get("iCloudBlockManagedAppsSync");
    }
    /**
     * Gets the iCloudBlockPhotoLibrary property value. Indicates whether or not to block iCloud Photo Library.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockPhotoLibrary() {
        return this.getBackingStore().get("iCloudBlockPhotoLibrary");
    }
    /**
     * Gets the iCloudBlockPhotoStreamSync property value. Indicates whether or not to block iCloud Photo Stream Sync.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockPhotoStreamSync() {
        return this.getBackingStore().get("iCloudBlockPhotoStreamSync");
    }
    /**
     * Gets the iCloudBlockSharedPhotoStream property value. Indicates whether or not to block Shared Photo Stream.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockSharedPhotoStream() {
        return this.getBackingStore().get("iCloudBlockSharedPhotoStream");
    }
    /**
     * Gets the iCloudRequireEncryptedBackup property value. Indicates whether or not to require backups to iCloud be encrypted.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudRequireEncryptedBackup() {
        return this.getBackingStore().get("iCloudRequireEncryptedBackup");
    }
    /**
     * Gets the iTunesBlockExplicitContent property value. Indicates whether or not to block the user from accessing explicit content in iTunes and the App Store. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getITunesBlockExplicitContent() {
        return this.getBackingStore().get("iTunesBlockExplicitContent");
    }
    /**
     * Gets the iTunesBlockMusicService property value. Indicates whether or not to block Music service and revert Music app to classic mode when the device is in supervised mode (iOS 9.3 and later and macOS 10.12 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getITunesBlockMusicService() {
        return this.getBackingStore().get("iTunesBlockMusicService");
    }
    /**
     * Gets the iTunesBlockRadio property value. Indicates whether or not to block the user from using iTunes Radio when the device is in supervised mode (iOS 9.3 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getITunesBlockRadio() {
        return this.getBackingStore().get("iTunesBlockRadio");
    }
    /**
     * Gets the keyboardBlockAutoCorrect property value. Indicates whether or not to block keyboard auto-correction when the device is in supervised mode (iOS 8.1.3 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeyboardBlockAutoCorrect() {
        return this.getBackingStore().get("keyboardBlockAutoCorrect");
    }
    /**
     * Gets the keyboardBlockDictation property value. Indicates whether or not to block the user from using dictation input when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeyboardBlockDictation() {
        return this.getBackingStore().get("keyboardBlockDictation");
    }
    /**
     * Gets the keyboardBlockPredictive property value. Indicates whether or not to block predictive keyboards when device is in supervised mode (iOS 8.1.3 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeyboardBlockPredictive() {
        return this.getBackingStore().get("keyboardBlockPredictive");
    }
    /**
     * Gets the keyboardBlockShortcuts property value. Indicates whether or not to block keyboard shortcuts when the device is in supervised mode (iOS 9.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeyboardBlockShortcuts() {
        return this.getBackingStore().get("keyboardBlockShortcuts");
    }
    /**
     * Gets the keyboardBlockSpellCheck property value. Indicates whether or not to block keyboard spell-checking when the device is in supervised mode (iOS 8.1.3 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeyboardBlockSpellCheck() {
        return this.getBackingStore().get("keyboardBlockSpellCheck");
    }
    /**
     * Gets the kioskModeAllowAssistiveSpeak property value. Indicates whether or not to allow assistive speak while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowAssistiveSpeak() {
        return this.getBackingStore().get("kioskModeAllowAssistiveSpeak");
    }
    /**
     * Gets the kioskModeAllowAssistiveTouchSettings property value. Indicates whether or not to allow access to the Assistive Touch Settings while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowAssistiveTouchSettings() {
        return this.getBackingStore().get("kioskModeAllowAssistiveTouchSettings");
    }
    /**
     * Gets the kioskModeAllowAutoLock property value. Indicates whether or not to allow device auto lock while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockAutoLock instead.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowAutoLock() {
        return this.getBackingStore().get("kioskModeAllowAutoLock");
    }
    /**
     * Gets the kioskModeAllowColorInversionSettings property value. Indicates whether or not to allow access to the Color Inversion Settings while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowColorInversionSettings() {
        return this.getBackingStore().get("kioskModeAllowColorInversionSettings");
    }
    /**
     * Gets the kioskModeAllowRingerSwitch property value. Indicates whether or not to allow use of the ringer switch while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockRingerSwitch instead.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowRingerSwitch() {
        return this.getBackingStore().get("kioskModeAllowRingerSwitch");
    }
    /**
     * Gets the kioskModeAllowScreenRotation property value. Indicates whether or not to allow screen rotation while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockScreenRotation instead.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowScreenRotation() {
        return this.getBackingStore().get("kioskModeAllowScreenRotation");
    }
    /**
     * Gets the kioskModeAllowSleepButton property value. Indicates whether or not to allow use of the sleep button while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockSleepButton instead.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowSleepButton() {
        return this.getBackingStore().get("kioskModeAllowSleepButton");
    }
    /**
     * Gets the kioskModeAllowTouchscreen property value. Indicates whether or not to allow use of the touchscreen while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockTouchscreen instead.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowTouchscreen() {
        return this.getBackingStore().get("kioskModeAllowTouchscreen");
    }
    /**
     * Gets the kioskModeAllowVoiceOverSettings property value. Indicates whether or not to allow access to the voice over settings while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowVoiceOverSettings() {
        return this.getBackingStore().get("kioskModeAllowVoiceOverSettings");
    }
    /**
     * Gets the kioskModeAllowVolumeButtons property value. Indicates whether or not to allow use of the volume buttons while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockVolumeButtons instead.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowVolumeButtons() {
        return this.getBackingStore().get("kioskModeAllowVolumeButtons");
    }
    /**
     * Gets the kioskModeAllowZoomSettings property value. Indicates whether or not to allow access to the zoom settings while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowZoomSettings() {
        return this.getBackingStore().get("kioskModeAllowZoomSettings");
    }
    /**
     * Gets the kioskModeAppStoreUrl property value. URL in the app store to the app to use for kiosk mode. Use if KioskModeManagedAppId is not known.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKioskModeAppStoreUrl() {
        return this.getBackingStore().get("kioskModeAppStoreUrl");
    }
    /**
     * Gets the kioskModeBuiltInAppId property value. ID for built-in apps to use for kiosk mode. Used when KioskModeManagedAppId and KioskModeAppStoreUrl are not set.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKioskModeBuiltInAppId() {
        return this.getBackingStore().get("kioskModeBuiltInAppId");
    }
    /**
     * Gets the kioskModeManagedAppId property value. Managed app id of the app to use for kiosk mode. If KioskModeManagedAppId is specified then KioskModeAppStoreUrl will be ignored.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKioskModeManagedAppId() {
        return this.getBackingStore().get("kioskModeManagedAppId");
    }
    /**
     * Gets the kioskModeRequireAssistiveTouch property value. Indicates whether or not to require assistive touch while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeRequireAssistiveTouch() {
        return this.getBackingStore().get("kioskModeRequireAssistiveTouch");
    }
    /**
     * Gets the kioskModeRequireColorInversion property value. Indicates whether or not to require color inversion while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeRequireColorInversion() {
        return this.getBackingStore().get("kioskModeRequireColorInversion");
    }
    /**
     * Gets the kioskModeRequireMonoAudio property value. Indicates whether or not to require mono audio while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeRequireMonoAudio() {
        return this.getBackingStore().get("kioskModeRequireMonoAudio");
    }
    /**
     * Gets the kioskModeRequireVoiceOver property value. Indicates whether or not to require voice over while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeRequireVoiceOver() {
        return this.getBackingStore().get("kioskModeRequireVoiceOver");
    }
    /**
     * Gets the kioskModeRequireZoom property value. Indicates whether or not to require zoom while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeRequireZoom() {
        return this.getBackingStore().get("kioskModeRequireZoom");
    }
    /**
     * Gets the lockScreenBlockControlCenter property value. Indicates whether or not to block the user from using control center on the lock screen.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLockScreenBlockControlCenter() {
        return this.getBackingStore().get("lockScreenBlockControlCenter");
    }
    /**
     * Gets the lockScreenBlockNotificationView property value. Indicates whether or not to block the user from using the notification view on the lock screen.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLockScreenBlockNotificationView() {
        return this.getBackingStore().get("lockScreenBlockNotificationView");
    }
    /**
     * Gets the lockScreenBlockPassbook property value. Indicates whether or not to block the user from using passbook when the device is locked.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLockScreenBlockPassbook() {
        return this.getBackingStore().get("lockScreenBlockPassbook");
    }
    /**
     * Gets the lockScreenBlockTodayView property value. Indicates whether or not to block the user from using the Today View on the lock screen.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLockScreenBlockTodayView() {
        return this.getBackingStore().get("lockScreenBlockTodayView");
    }
    /**
     * Gets the mediaContentRatingApps property value. Apps rating as in media content
     * @return a RatingAppsType
     */
    @jakarta.annotation.Nullable
    public RatingAppsType getMediaContentRatingApps() {
        return this.getBackingStore().get("mediaContentRatingApps");
    }
    /**
     * Gets the mediaContentRatingAustralia property value. Media content rating settings for Australia
     * @return a MediaContentRatingAustralia
     */
    @jakarta.annotation.Nullable
    public MediaContentRatingAustralia getMediaContentRatingAustralia() {
        return this.getBackingStore().get("mediaContentRatingAustralia");
    }
    /**
     * Gets the mediaContentRatingCanada property value. Media content rating settings for Canada
     * @return a MediaContentRatingCanada
     */
    @jakarta.annotation.Nullable
    public MediaContentRatingCanada getMediaContentRatingCanada() {
        return this.getBackingStore().get("mediaContentRatingCanada");
    }
    /**
     * Gets the mediaContentRatingFrance property value. Media content rating settings for France
     * @return a MediaContentRatingFrance
     */
    @jakarta.annotation.Nullable
    public MediaContentRatingFrance getMediaContentRatingFrance() {
        return this.getBackingStore().get("mediaContentRatingFrance");
    }
    /**
     * Gets the mediaContentRatingGermany property value. Media content rating settings for Germany
     * @return a MediaContentRatingGermany
     */
    @jakarta.annotation.Nullable
    public MediaContentRatingGermany getMediaContentRatingGermany() {
        return this.getBackingStore().get("mediaContentRatingGermany");
    }
    /**
     * Gets the mediaContentRatingIreland property value. Media content rating settings for Ireland
     * @return a MediaContentRatingIreland
     */
    @jakarta.annotation.Nullable
    public MediaContentRatingIreland getMediaContentRatingIreland() {
        return this.getBackingStore().get("mediaContentRatingIreland");
    }
    /**
     * Gets the mediaContentRatingJapan property value. Media content rating settings for Japan
     * @return a MediaContentRatingJapan
     */
    @jakarta.annotation.Nullable
    public MediaContentRatingJapan getMediaContentRatingJapan() {
        return this.getBackingStore().get("mediaContentRatingJapan");
    }
    /**
     * Gets the mediaContentRatingNewZealand property value. Media content rating settings for New Zealand
     * @return a MediaContentRatingNewZealand
     */
    @jakarta.annotation.Nullable
    public MediaContentRatingNewZealand getMediaContentRatingNewZealand() {
        return this.getBackingStore().get("mediaContentRatingNewZealand");
    }
    /**
     * Gets the mediaContentRatingUnitedKingdom property value. Media content rating settings for United Kingdom
     * @return a MediaContentRatingUnitedKingdom
     */
    @jakarta.annotation.Nullable
    public MediaContentRatingUnitedKingdom getMediaContentRatingUnitedKingdom() {
        return this.getBackingStore().get("mediaContentRatingUnitedKingdom");
    }
    /**
     * Gets the mediaContentRatingUnitedStates property value. Media content rating settings for United States
     * @return a MediaContentRatingUnitedStates
     */
    @jakarta.annotation.Nullable
    public MediaContentRatingUnitedStates getMediaContentRatingUnitedStates() {
        return this.getBackingStore().get("mediaContentRatingUnitedStates");
    }
    /**
     * Gets the messagesBlocked property value. Indicates whether or not to block the user from using the Messages app on the supervised device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMessagesBlocked() {
        return this.getBackingStore().get("messagesBlocked");
    }
    /**
     * Gets the networkUsageRules property value. List of managed apps and the network rules that applies to them. This collection can contain a maximum of 1000 elements.
     * @return a java.util.List<IosNetworkUsageRule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IosNetworkUsageRule> getNetworkUsageRules() {
        return this.getBackingStore().get("networkUsageRules");
    }
    /**
     * Gets the notificationsBlockSettingsModification property value. Indicates whether or not to allow notifications settings modification (iOS 9.3 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getNotificationsBlockSettingsModification() {
        return this.getBackingStore().get("notificationsBlockSettingsModification");
    }
    /**
     * Gets the passcodeBlockFingerprintModification property value. Block modification of registered Touch ID fingerprints when in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasscodeBlockFingerprintModification() {
        return this.getBackingStore().get("passcodeBlockFingerprintModification");
    }
    /**
     * Gets the passcodeBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasscodeBlockFingerprintUnlock() {
        return this.getBackingStore().get("passcodeBlockFingerprintUnlock");
    }
    /**
     * Gets the passcodeBlockModification property value. Indicates whether or not to allow passcode modification on the supervised device (iOS 9.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasscodeBlockModification() {
        return this.getBackingStore().get("passcodeBlockModification");
    }
    /**
     * Gets the passcodeBlockSimple property value. Indicates whether or not to block simple passcodes.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasscodeBlockSimple() {
        return this.getBackingStore().get("passcodeBlockSimple");
    }
    /**
     * Gets the passcodeExpirationDays property value. Number of days before the passcode expires. Valid values 1 to 65535
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeExpirationDays() {
        return this.getBackingStore().get("passcodeExpirationDays");
    }
    /**
     * Gets the passcodeMinimumCharacterSetCount property value. Number of character sets a passcode must contain. Valid values 0 to 4
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeMinimumCharacterSetCount() {
        return this.getBackingStore().get("passcodeMinimumCharacterSetCount");
    }
    /**
     * Gets the passcodeMinimumLength property value. Minimum length of passcode. Valid values 4 to 14
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeMinimumLength() {
        return this.getBackingStore().get("passcodeMinimumLength");
    }
    /**
     * Gets the passcodeMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a passcode is required.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeMinutesOfInactivityBeforeLock() {
        return this.getBackingStore().get("passcodeMinutesOfInactivityBeforeLock");
    }
    /**
     * Gets the passcodeMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeMinutesOfInactivityBeforeScreenTimeout() {
        return this.getBackingStore().get("passcodeMinutesOfInactivityBeforeScreenTimeout");
    }
    /**
     * Gets the passcodePreviousPasscodeBlockCount property value. Number of previous passcodes to block. Valid values 1 to 24
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodePreviousPasscodeBlockCount() {
        return this.getBackingStore().get("passcodePreviousPasscodeBlockCount");
    }
    /**
     * Gets the passcodeRequired property value. Indicates whether or not to require a passcode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasscodeRequired() {
        return this.getBackingStore().get("passcodeRequired");
    }
    /**
     * Gets the passcodeRequiredType property value. Possible values of required passwords.
     * @return a RequiredPasswordType
     */
    @jakarta.annotation.Nullable
    public RequiredPasswordType getPasscodeRequiredType() {
        return this.getBackingStore().get("passcodeRequiredType");
    }
    /**
     * Gets the passcodeSignInFailureCountBeforeWipe property value. Number of sign in failures allowed before wiping the device. Valid values 2 to 11
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeSignInFailureCountBeforeWipe() {
        return this.getBackingStore().get("passcodeSignInFailureCountBeforeWipe");
    }
    /**
     * Gets the podcastsBlocked property value. Indicates whether or not to block the user from using podcasts on the supervised device (iOS 8.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPodcastsBlocked() {
        return this.getBackingStore().get("podcastsBlocked");
    }
    /**
     * Gets the safariBlockAutofill property value. Indicates whether or not to block the user from using Auto fill in Safari. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSafariBlockAutofill() {
        return this.getBackingStore().get("safariBlockAutofill");
    }
    /**
     * Gets the safariBlocked property value. Indicates whether or not to block the user from using Safari. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSafariBlocked() {
        return this.getBackingStore().get("safariBlocked");
    }
    /**
     * Gets the safariBlockJavaScript property value. Indicates whether or not to block JavaScript in Safari.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSafariBlockJavaScript() {
        return this.getBackingStore().get("safariBlockJavaScript");
    }
    /**
     * Gets the safariBlockPopups property value. Indicates whether or not to block popups in Safari.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSafariBlockPopups() {
        return this.getBackingStore().get("safariBlockPopups");
    }
    /**
     * Gets the safariCookieSettings property value. Web Browser Cookie Settings.
     * @return a WebBrowserCookieSettings
     */
    @jakarta.annotation.Nullable
    public WebBrowserCookieSettings getSafariCookieSettings() {
        return this.getBackingStore().get("safariCookieSettings");
    }
    /**
     * Gets the safariManagedDomains property value. URLs matching the patterns listed here will be considered managed.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSafariManagedDomains() {
        return this.getBackingStore().get("safariManagedDomains");
    }
    /**
     * Gets the safariPasswordAutoFillDomains property value. Users can save passwords in Safari only from URLs matching the patterns listed here. Applies to devices in supervised mode (iOS 9.3 and later).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSafariPasswordAutoFillDomains() {
        return this.getBackingStore().get("safariPasswordAutoFillDomains");
    }
    /**
     * Gets the safariRequireFraudWarning property value. Indicates whether or not to require fraud warning in Safari.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSafariRequireFraudWarning() {
        return this.getBackingStore().get("safariRequireFraudWarning");
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to block the user from taking Screenshots.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this.getBackingStore().get("screenCaptureBlocked");
    }
    /**
     * Gets the siriBlocked property value. Indicates whether or not to block the user from using Siri.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSiriBlocked() {
        return this.getBackingStore().get("siriBlocked");
    }
    /**
     * Gets the siriBlockedWhenLocked property value. Indicates whether or not to block the user from using Siri when locked.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSiriBlockedWhenLocked() {
        return this.getBackingStore().get("siriBlockedWhenLocked");
    }
    /**
     * Gets the siriBlockUserGeneratedContent property value. Indicates whether or not to block Siri from querying user-generated content when used on a supervised device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSiriBlockUserGeneratedContent() {
        return this.getBackingStore().get("siriBlockUserGeneratedContent");
    }
    /**
     * Gets the siriRequireProfanityFilter property value. Indicates whether or not to prevent Siri from dictating, or speaking profane language on supervised device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSiriRequireProfanityFilter() {
        return this.getBackingStore().get("siriRequireProfanityFilter");
    }
    /**
     * Gets the spotlightBlockInternetResults property value. Indicates whether or not to block Spotlight search from returning internet results on supervised device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSpotlightBlockInternetResults() {
        return this.getBackingStore().get("spotlightBlockInternetResults");
    }
    /**
     * Gets the voiceDialingBlocked property value. Indicates whether or not to block voice dialing.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getVoiceDialingBlocked() {
        return this.getBackingStore().get("voiceDialingBlocked");
    }
    /**
     * Gets the wallpaperBlockModification property value. Indicates whether or not to allow wallpaper modification on supervised device (iOS 9.0 and later) .
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWallpaperBlockModification() {
        return this.getBackingStore().get("wallpaperBlockModification");
    }
    /**
     * Gets the wiFiConnectOnlyToConfiguredNetworks property value. Indicates whether or not to force the device to use only Wi-Fi networks from configuration profiles when the device is in supervised mode. Available for devices running iOS and iPadOS versions 14.4 and earlier. Devices running 14.5+ should use the setting, 'WiFiConnectToAllowedNetworksOnlyForced.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWiFiConnectOnlyToConfiguredNetworks() {
        return this.getBackingStore().get("wiFiConnectOnlyToConfiguredNetworks");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("accountBlockModification", this.getAccountBlockModification());
        writer.writeBooleanValue("activationLockAllowWhenSupervised", this.getActivationLockAllowWhenSupervised());
        writer.writeBooleanValue("airDropBlocked", this.getAirDropBlocked());
        writer.writeBooleanValue("airDropForceUnmanagedDropTarget", this.getAirDropForceUnmanagedDropTarget());
        writer.writeBooleanValue("airPlayForcePairingPasswordForOutgoingRequests", this.getAirPlayForcePairingPasswordForOutgoingRequests());
        writer.writeBooleanValue("appleNewsBlocked", this.getAppleNewsBlocked());
        writer.writeBooleanValue("appleWatchBlockPairing", this.getAppleWatchBlockPairing());
        writer.writeBooleanValue("appleWatchForceWristDetection", this.getAppleWatchForceWristDetection());
        writer.writeCollectionOfObjectValues("appsSingleAppModeList", this.getAppsSingleAppModeList());
        writer.writeBooleanValue("appStoreBlockAutomaticDownloads", this.getAppStoreBlockAutomaticDownloads());
        writer.writeBooleanValue("appStoreBlocked", this.getAppStoreBlocked());
        writer.writeBooleanValue("appStoreBlockInAppPurchases", this.getAppStoreBlockInAppPurchases());
        writer.writeBooleanValue("appStoreBlockUIAppInstallation", this.getAppStoreBlockUIAppInstallation());
        writer.writeBooleanValue("appStoreRequirePassword", this.getAppStoreRequirePassword());
        writer.writeCollectionOfObjectValues("appsVisibilityList", this.getAppsVisibilityList());
        writer.writeEnumValue("appsVisibilityListType", this.getAppsVisibilityListType());
        writer.writeBooleanValue("bluetoothBlockModification", this.getBluetoothBlockModification());
        writer.writeBooleanValue("cameraBlocked", this.getCameraBlocked());
        writer.writeBooleanValue("cellularBlockDataRoaming", this.getCellularBlockDataRoaming());
        writer.writeBooleanValue("cellularBlockGlobalBackgroundFetchWhileRoaming", this.getCellularBlockGlobalBackgroundFetchWhileRoaming());
        writer.writeBooleanValue("cellularBlockPerAppDataModification", this.getCellularBlockPerAppDataModification());
        writer.writeBooleanValue("cellularBlockPersonalHotspot", this.getCellularBlockPersonalHotspot());
        writer.writeBooleanValue("cellularBlockVoiceRoaming", this.getCellularBlockVoiceRoaming());
        writer.writeBooleanValue("certificatesBlockUntrustedTlsCertificates", this.getCertificatesBlockUntrustedTlsCertificates());
        writer.writeBooleanValue("classroomAppBlockRemoteScreenObservation", this.getClassroomAppBlockRemoteScreenObservation());
        writer.writeBooleanValue("classroomAppForceUnpromptedScreenObservation", this.getClassroomAppForceUnpromptedScreenObservation());
        writer.writeEnumValue("compliantAppListType", this.getCompliantAppListType());
        writer.writeCollectionOfObjectValues("compliantAppsList", this.getCompliantAppsList());
        writer.writeBooleanValue("configurationProfileBlockChanges", this.getConfigurationProfileBlockChanges());
        writer.writeBooleanValue("definitionLookupBlocked", this.getDefinitionLookupBlocked());
        writer.writeBooleanValue("deviceBlockEnableRestrictions", this.getDeviceBlockEnableRestrictions());
        writer.writeBooleanValue("deviceBlockEraseContentAndSettings", this.getDeviceBlockEraseContentAndSettings());
        writer.writeBooleanValue("deviceBlockNameModification", this.getDeviceBlockNameModification());
        writer.writeBooleanValue("diagnosticDataBlockSubmission", this.getDiagnosticDataBlockSubmission());
        writer.writeBooleanValue("diagnosticDataBlockSubmissionModification", this.getDiagnosticDataBlockSubmissionModification());
        writer.writeBooleanValue("documentsBlockManagedDocumentsInUnmanagedApps", this.getDocumentsBlockManagedDocumentsInUnmanagedApps());
        writer.writeBooleanValue("documentsBlockUnmanagedDocumentsInManagedApps", this.getDocumentsBlockUnmanagedDocumentsInManagedApps());
        writer.writeCollectionOfPrimitiveValues("emailInDomainSuffixes", this.getEmailInDomainSuffixes());
        writer.writeBooleanValue("enterpriseAppBlockTrust", this.getEnterpriseAppBlockTrust());
        writer.writeBooleanValue("enterpriseAppBlockTrustModification", this.getEnterpriseAppBlockTrustModification());
        writer.writeBooleanValue("faceTimeBlocked", this.getFaceTimeBlocked());
        writer.writeBooleanValue("findMyFriendsBlocked", this.getFindMyFriendsBlocked());
        writer.writeBooleanValue("gameCenterBlocked", this.getGameCenterBlocked());
        writer.writeBooleanValue("gamingBlockGameCenterFriends", this.getGamingBlockGameCenterFriends());
        writer.writeBooleanValue("gamingBlockMultiplayer", this.getGamingBlockMultiplayer());
        writer.writeBooleanValue("hostPairingBlocked", this.getHostPairingBlocked());
        writer.writeBooleanValue("iBooksStoreBlocked", this.getIBooksStoreBlocked());
        writer.writeBooleanValue("iBooksStoreBlockErotica", this.getIBooksStoreBlockErotica());
        writer.writeBooleanValue("iCloudBlockActivityContinuation", this.getICloudBlockActivityContinuation());
        writer.writeBooleanValue("iCloudBlockBackup", this.getICloudBlockBackup());
        writer.writeBooleanValue("iCloudBlockDocumentSync", this.getICloudBlockDocumentSync());
        writer.writeBooleanValue("iCloudBlockManagedAppsSync", this.getICloudBlockManagedAppsSync());
        writer.writeBooleanValue("iCloudBlockPhotoLibrary", this.getICloudBlockPhotoLibrary());
        writer.writeBooleanValue("iCloudBlockPhotoStreamSync", this.getICloudBlockPhotoStreamSync());
        writer.writeBooleanValue("iCloudBlockSharedPhotoStream", this.getICloudBlockSharedPhotoStream());
        writer.writeBooleanValue("iCloudRequireEncryptedBackup", this.getICloudRequireEncryptedBackup());
        writer.writeBooleanValue("iTunesBlockExplicitContent", this.getITunesBlockExplicitContent());
        writer.writeBooleanValue("iTunesBlockMusicService", this.getITunesBlockMusicService());
        writer.writeBooleanValue("iTunesBlockRadio", this.getITunesBlockRadio());
        writer.writeBooleanValue("keyboardBlockAutoCorrect", this.getKeyboardBlockAutoCorrect());
        writer.writeBooleanValue("keyboardBlockDictation", this.getKeyboardBlockDictation());
        writer.writeBooleanValue("keyboardBlockPredictive", this.getKeyboardBlockPredictive());
        writer.writeBooleanValue("keyboardBlockShortcuts", this.getKeyboardBlockShortcuts());
        writer.writeBooleanValue("keyboardBlockSpellCheck", this.getKeyboardBlockSpellCheck());
        writer.writeBooleanValue("kioskModeAllowAssistiveSpeak", this.getKioskModeAllowAssistiveSpeak());
        writer.writeBooleanValue("kioskModeAllowAssistiveTouchSettings", this.getKioskModeAllowAssistiveTouchSettings());
        writer.writeBooleanValue("kioskModeAllowAutoLock", this.getKioskModeAllowAutoLock());
        writer.writeBooleanValue("kioskModeAllowColorInversionSettings", this.getKioskModeAllowColorInversionSettings());
        writer.writeBooleanValue("kioskModeAllowRingerSwitch", this.getKioskModeAllowRingerSwitch());
        writer.writeBooleanValue("kioskModeAllowScreenRotation", this.getKioskModeAllowScreenRotation());
        writer.writeBooleanValue("kioskModeAllowSleepButton", this.getKioskModeAllowSleepButton());
        writer.writeBooleanValue("kioskModeAllowTouchscreen", this.getKioskModeAllowTouchscreen());
        writer.writeBooleanValue("kioskModeAllowVoiceOverSettings", this.getKioskModeAllowVoiceOverSettings());
        writer.writeBooleanValue("kioskModeAllowVolumeButtons", this.getKioskModeAllowVolumeButtons());
        writer.writeBooleanValue("kioskModeAllowZoomSettings", this.getKioskModeAllowZoomSettings());
        writer.writeStringValue("kioskModeAppStoreUrl", this.getKioskModeAppStoreUrl());
        writer.writeStringValue("kioskModeBuiltInAppId", this.getKioskModeBuiltInAppId());
        writer.writeStringValue("kioskModeManagedAppId", this.getKioskModeManagedAppId());
        writer.writeBooleanValue("kioskModeRequireAssistiveTouch", this.getKioskModeRequireAssistiveTouch());
        writer.writeBooleanValue("kioskModeRequireColorInversion", this.getKioskModeRequireColorInversion());
        writer.writeBooleanValue("kioskModeRequireMonoAudio", this.getKioskModeRequireMonoAudio());
        writer.writeBooleanValue("kioskModeRequireVoiceOver", this.getKioskModeRequireVoiceOver());
        writer.writeBooleanValue("kioskModeRequireZoom", this.getKioskModeRequireZoom());
        writer.writeBooleanValue("lockScreenBlockControlCenter", this.getLockScreenBlockControlCenter());
        writer.writeBooleanValue("lockScreenBlockNotificationView", this.getLockScreenBlockNotificationView());
        writer.writeBooleanValue("lockScreenBlockPassbook", this.getLockScreenBlockPassbook());
        writer.writeBooleanValue("lockScreenBlockTodayView", this.getLockScreenBlockTodayView());
        writer.writeEnumValue("mediaContentRatingApps", this.getMediaContentRatingApps());
        writer.writeObjectValue("mediaContentRatingAustralia", this.getMediaContentRatingAustralia());
        writer.writeObjectValue("mediaContentRatingCanada", this.getMediaContentRatingCanada());
        writer.writeObjectValue("mediaContentRatingFrance", this.getMediaContentRatingFrance());
        writer.writeObjectValue("mediaContentRatingGermany", this.getMediaContentRatingGermany());
        writer.writeObjectValue("mediaContentRatingIreland", this.getMediaContentRatingIreland());
        writer.writeObjectValue("mediaContentRatingJapan", this.getMediaContentRatingJapan());
        writer.writeObjectValue("mediaContentRatingNewZealand", this.getMediaContentRatingNewZealand());
        writer.writeObjectValue("mediaContentRatingUnitedKingdom", this.getMediaContentRatingUnitedKingdom());
        writer.writeObjectValue("mediaContentRatingUnitedStates", this.getMediaContentRatingUnitedStates());
        writer.writeBooleanValue("messagesBlocked", this.getMessagesBlocked());
        writer.writeCollectionOfObjectValues("networkUsageRules", this.getNetworkUsageRules());
        writer.writeBooleanValue("notificationsBlockSettingsModification", this.getNotificationsBlockSettingsModification());
        writer.writeBooleanValue("passcodeBlockFingerprintModification", this.getPasscodeBlockFingerprintModification());
        writer.writeBooleanValue("passcodeBlockFingerprintUnlock", this.getPasscodeBlockFingerprintUnlock());
        writer.writeBooleanValue("passcodeBlockModification", this.getPasscodeBlockModification());
        writer.writeBooleanValue("passcodeBlockSimple", this.getPasscodeBlockSimple());
        writer.writeIntegerValue("passcodeExpirationDays", this.getPasscodeExpirationDays());
        writer.writeIntegerValue("passcodeMinimumCharacterSetCount", this.getPasscodeMinimumCharacterSetCount());
        writer.writeIntegerValue("passcodeMinimumLength", this.getPasscodeMinimumLength());
        writer.writeIntegerValue("passcodeMinutesOfInactivityBeforeLock", this.getPasscodeMinutesOfInactivityBeforeLock());
        writer.writeIntegerValue("passcodeMinutesOfInactivityBeforeScreenTimeout", this.getPasscodeMinutesOfInactivityBeforeScreenTimeout());
        writer.writeIntegerValue("passcodePreviousPasscodeBlockCount", this.getPasscodePreviousPasscodeBlockCount());
        writer.writeBooleanValue("passcodeRequired", this.getPasscodeRequired());
        writer.writeEnumValue("passcodeRequiredType", this.getPasscodeRequiredType());
        writer.writeIntegerValue("passcodeSignInFailureCountBeforeWipe", this.getPasscodeSignInFailureCountBeforeWipe());
        writer.writeBooleanValue("podcastsBlocked", this.getPodcastsBlocked());
        writer.writeBooleanValue("safariBlockAutofill", this.getSafariBlockAutofill());
        writer.writeBooleanValue("safariBlocked", this.getSafariBlocked());
        writer.writeBooleanValue("safariBlockJavaScript", this.getSafariBlockJavaScript());
        writer.writeBooleanValue("safariBlockPopups", this.getSafariBlockPopups());
        writer.writeEnumValue("safariCookieSettings", this.getSafariCookieSettings());
        writer.writeCollectionOfPrimitiveValues("safariManagedDomains", this.getSafariManagedDomains());
        writer.writeCollectionOfPrimitiveValues("safariPasswordAutoFillDomains", this.getSafariPasswordAutoFillDomains());
        writer.writeBooleanValue("safariRequireFraudWarning", this.getSafariRequireFraudWarning());
        writer.writeBooleanValue("screenCaptureBlocked", this.getScreenCaptureBlocked());
        writer.writeBooleanValue("siriBlocked", this.getSiriBlocked());
        writer.writeBooleanValue("siriBlockedWhenLocked", this.getSiriBlockedWhenLocked());
        writer.writeBooleanValue("siriBlockUserGeneratedContent", this.getSiriBlockUserGeneratedContent());
        writer.writeBooleanValue("siriRequireProfanityFilter", this.getSiriRequireProfanityFilter());
        writer.writeBooleanValue("spotlightBlockInternetResults", this.getSpotlightBlockInternetResults());
        writer.writeBooleanValue("voiceDialingBlocked", this.getVoiceDialingBlocked());
        writer.writeBooleanValue("wallpaperBlockModification", this.getWallpaperBlockModification());
        writer.writeBooleanValue("wiFiConnectOnlyToConfiguredNetworks", this.getWiFiConnectOnlyToConfiguredNetworks());
    }
    /**
     * Sets the accountBlockModification property value. Indicates whether or not to allow account modification when the device is in supervised mode.
     * @param value Value to set for the accountBlockModification property.
     */
    public void setAccountBlockModification(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("accountBlockModification", value);
    }
    /**
     * Sets the activationLockAllowWhenSupervised property value. Indicates whether or not to allow activation lock when the device is in the supervised mode.
     * @param value Value to set for the activationLockAllowWhenSupervised property.
     */
    public void setActivationLockAllowWhenSupervised(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("activationLockAllowWhenSupervised", value);
    }
    /**
     * Sets the airDropBlocked property value. Indicates whether or not to allow AirDrop when the device is in supervised mode.
     * @param value Value to set for the airDropBlocked property.
     */
    public void setAirDropBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("airDropBlocked", value);
    }
    /**
     * Sets the airDropForceUnmanagedDropTarget property value. Indicates whether or not to cause AirDrop to be considered an unmanaged drop target (iOS 9.0 and later).
     * @param value Value to set for the airDropForceUnmanagedDropTarget property.
     */
    public void setAirDropForceUnmanagedDropTarget(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("airDropForceUnmanagedDropTarget", value);
    }
    /**
     * Sets the airPlayForcePairingPasswordForOutgoingRequests property value. Indicates whether or not to enforce all devices receiving AirPlay requests from this device to use a pairing password.
     * @param value Value to set for the airPlayForcePairingPasswordForOutgoingRequests property.
     */
    public void setAirPlayForcePairingPasswordForOutgoingRequests(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("airPlayForcePairingPasswordForOutgoingRequests", value);
    }
    /**
     * Sets the appleNewsBlocked property value. Indicates whether or not to block the user from using News when the device is in supervised mode (iOS 9.0 and later).
     * @param value Value to set for the appleNewsBlocked property.
     */
    public void setAppleNewsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("appleNewsBlocked", value);
    }
    /**
     * Sets the appleWatchBlockPairing property value. Indicates whether or not to allow Apple Watch pairing when the device is in supervised mode (iOS 9.0 and later).
     * @param value Value to set for the appleWatchBlockPairing property.
     */
    public void setAppleWatchBlockPairing(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("appleWatchBlockPairing", value);
    }
    /**
     * Sets the appleWatchForceWristDetection property value. Indicates whether or not to force a paired Apple Watch to use Wrist Detection (iOS 8.2 and later).
     * @param value Value to set for the appleWatchForceWristDetection property.
     */
    public void setAppleWatchForceWristDetection(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("appleWatchForceWristDetection", value);
    }
    /**
     * Sets the appsSingleAppModeList property value. Gets or sets the list of iOS apps allowed to autonomously enter Single App Mode. Supervised only. iOS 7.0 and later. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the appsSingleAppModeList property.
     */
    public void setAppsSingleAppModeList(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.getBackingStore().set("appsSingleAppModeList", value);
    }
    /**
     * Sets the appStoreBlockAutomaticDownloads property value. Indicates whether or not to block the automatic downloading of apps purchased on other devices when the device is in supervised mode (iOS 9.0 and later).
     * @param value Value to set for the appStoreBlockAutomaticDownloads property.
     */
    public void setAppStoreBlockAutomaticDownloads(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("appStoreBlockAutomaticDownloads", value);
    }
    /**
     * Sets the appStoreBlocked property value. Indicates whether or not to block the user from using the App Store. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the appStoreBlocked property.
     */
    public void setAppStoreBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("appStoreBlocked", value);
    }
    /**
     * Sets the appStoreBlockInAppPurchases property value. Indicates whether or not to block the user from making in app purchases.
     * @param value Value to set for the appStoreBlockInAppPurchases property.
     */
    public void setAppStoreBlockInAppPurchases(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("appStoreBlockInAppPurchases", value);
    }
    /**
     * Sets the appStoreBlockUIAppInstallation property value. Indicates whether or not to block the App Store app, not restricting installation through Host apps. Applies to supervised mode only (iOS 9.0 and later).
     * @param value Value to set for the appStoreBlockUIAppInstallation property.
     */
    public void setAppStoreBlockUIAppInstallation(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("appStoreBlockUIAppInstallation", value);
    }
    /**
     * Sets the appStoreRequirePassword property value. Indicates whether or not to require a password when using the app store.
     * @param value Value to set for the appStoreRequirePassword property.
     */
    public void setAppStoreRequirePassword(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("appStoreRequirePassword", value);
    }
    /**
     * Sets the appsVisibilityList property value. List of apps in the visibility list (either visible/launchable apps list or hidden/unlaunchable apps list, controlled by AppsVisibilityListType) (iOS 9.3 and later). This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the appsVisibilityList property.
     */
    public void setAppsVisibilityList(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.getBackingStore().set("appsVisibilityList", value);
    }
    /**
     * Sets the appsVisibilityListType property value. Possible values of the compliance app list.
     * @param value Value to set for the appsVisibilityListType property.
     */
    public void setAppsVisibilityListType(@jakarta.annotation.Nullable final AppListType value) {
        this.getBackingStore().set("appsVisibilityListType", value);
    }
    /**
     * Sets the bluetoothBlockModification property value. Indicates whether or not to allow modification of Bluetooth settings when the device is in supervised mode (iOS 10.0 and later).
     * @param value Value to set for the bluetoothBlockModification property.
     */
    public void setBluetoothBlockModification(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("bluetoothBlockModification", value);
    }
    /**
     * Sets the cameraBlocked property value. Indicates whether or not to block the user from accessing the camera of the device. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the cameraBlocked property.
     */
    public void setCameraBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("cameraBlocked", value);
    }
    /**
     * Sets the cellularBlockDataRoaming property value. Indicates whether or not to block data roaming.
     * @param value Value to set for the cellularBlockDataRoaming property.
     */
    public void setCellularBlockDataRoaming(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("cellularBlockDataRoaming", value);
    }
    /**
     * Sets the cellularBlockGlobalBackgroundFetchWhileRoaming property value. Indicates whether or not to block global background fetch while roaming.
     * @param value Value to set for the cellularBlockGlobalBackgroundFetchWhileRoaming property.
     */
    public void setCellularBlockGlobalBackgroundFetchWhileRoaming(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("cellularBlockGlobalBackgroundFetchWhileRoaming", value);
    }
    /**
     * Sets the cellularBlockPerAppDataModification property value. Indicates whether or not to allow changes to cellular app data usage settings when the device is in supervised mode.
     * @param value Value to set for the cellularBlockPerAppDataModification property.
     */
    public void setCellularBlockPerAppDataModification(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("cellularBlockPerAppDataModification", value);
    }
    /**
     * Sets the cellularBlockPersonalHotspot property value. Indicates whether or not to block Personal Hotspot.
     * @param value Value to set for the cellularBlockPersonalHotspot property.
     */
    public void setCellularBlockPersonalHotspot(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("cellularBlockPersonalHotspot", value);
    }
    /**
     * Sets the cellularBlockVoiceRoaming property value. Indicates whether or not to block voice roaming.
     * @param value Value to set for the cellularBlockVoiceRoaming property.
     */
    public void setCellularBlockVoiceRoaming(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("cellularBlockVoiceRoaming", value);
    }
    /**
     * Sets the certificatesBlockUntrustedTlsCertificates property value. Indicates whether or not to block untrusted TLS certificates.
     * @param value Value to set for the certificatesBlockUntrustedTlsCertificates property.
     */
    public void setCertificatesBlockUntrustedTlsCertificates(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("certificatesBlockUntrustedTlsCertificates", value);
    }
    /**
     * Sets the classroomAppBlockRemoteScreenObservation property value. Indicates whether or not to allow remote screen observation by Classroom app when the device is in supervised mode (iOS 9.3 and later).
     * @param value Value to set for the classroomAppBlockRemoteScreenObservation property.
     */
    public void setClassroomAppBlockRemoteScreenObservation(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("classroomAppBlockRemoteScreenObservation", value);
    }
    /**
     * Sets the classroomAppForceUnpromptedScreenObservation property value. Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to view a student's screen without prompting when the device is in supervised mode.
     * @param value Value to set for the classroomAppForceUnpromptedScreenObservation property.
     */
    public void setClassroomAppForceUnpromptedScreenObservation(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("classroomAppForceUnpromptedScreenObservation", value);
    }
    /**
     * Sets the compliantAppListType property value. Possible values of the compliance app list.
     * @param value Value to set for the compliantAppListType property.
     */
    public void setCompliantAppListType(@jakarta.annotation.Nullable final AppListType value) {
        this.getBackingStore().set("compliantAppListType", value);
    }
    /**
     * Sets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the compliantAppsList property.
     */
    public void setCompliantAppsList(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.getBackingStore().set("compliantAppsList", value);
    }
    /**
     * Sets the configurationProfileBlockChanges property value. Indicates whether or not to block the user from installing configuration profiles and certificates interactively when the device is in supervised mode.
     * @param value Value to set for the configurationProfileBlockChanges property.
     */
    public void setConfigurationProfileBlockChanges(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("configurationProfileBlockChanges", value);
    }
    /**
     * Sets the definitionLookupBlocked property value. Indicates whether or not to block definition lookup when the device is in supervised mode (iOS 8.1.3 and later ).
     * @param value Value to set for the definitionLookupBlocked property.
     */
    public void setDefinitionLookupBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("definitionLookupBlocked", value);
    }
    /**
     * Sets the deviceBlockEnableRestrictions property value. Indicates whether or not to allow the user to enables restrictions in the device settings when the device is in supervised mode.
     * @param value Value to set for the deviceBlockEnableRestrictions property.
     */
    public void setDeviceBlockEnableRestrictions(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("deviceBlockEnableRestrictions", value);
    }
    /**
     * Sets the deviceBlockEraseContentAndSettings property value. Indicates whether or not to allow the use of the 'Erase all content and settings' option on the device when the device is in supervised mode.
     * @param value Value to set for the deviceBlockEraseContentAndSettings property.
     */
    public void setDeviceBlockEraseContentAndSettings(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("deviceBlockEraseContentAndSettings", value);
    }
    /**
     * Sets the deviceBlockNameModification property value. Indicates whether or not to allow device name modification when the device is in supervised mode (iOS 9.0 and later).
     * @param value Value to set for the deviceBlockNameModification property.
     */
    public void setDeviceBlockNameModification(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("deviceBlockNameModification", value);
    }
    /**
     * Sets the diagnosticDataBlockSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @param value Value to set for the diagnosticDataBlockSubmission property.
     */
    public void setDiagnosticDataBlockSubmission(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("diagnosticDataBlockSubmission", value);
    }
    /**
     * Sets the diagnosticDataBlockSubmissionModification property value. Indicates whether or not to allow diagnostics submission settings modification when the device is in supervised mode (iOS 9.3.2 and later).
     * @param value Value to set for the diagnosticDataBlockSubmissionModification property.
     */
    public void setDiagnosticDataBlockSubmissionModification(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("diagnosticDataBlockSubmissionModification", value);
    }
    /**
     * Sets the documentsBlockManagedDocumentsInUnmanagedApps property value. Indicates whether or not to block the user from viewing managed documents in unmanaged apps.
     * @param value Value to set for the documentsBlockManagedDocumentsInUnmanagedApps property.
     */
    public void setDocumentsBlockManagedDocumentsInUnmanagedApps(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("documentsBlockManagedDocumentsInUnmanagedApps", value);
    }
    /**
     * Sets the documentsBlockUnmanagedDocumentsInManagedApps property value. Indicates whether or not to block the user from viewing unmanaged documents in managed apps.
     * @param value Value to set for the documentsBlockUnmanagedDocumentsInManagedApps property.
     */
    public void setDocumentsBlockUnmanagedDocumentsInManagedApps(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("documentsBlockUnmanagedDocumentsInManagedApps", value);
    }
    /**
     * Sets the emailInDomainSuffixes property value. An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
     * @param value Value to set for the emailInDomainSuffixes property.
     */
    public void setEmailInDomainSuffixes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.getBackingStore().set("emailInDomainSuffixes", value);
    }
    /**
     * Sets the enterpriseAppBlockTrust property value. Indicates whether or not to block the user from trusting an enterprise app.
     * @param value Value to set for the enterpriseAppBlockTrust property.
     */
    public void setEnterpriseAppBlockTrust(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("enterpriseAppBlockTrust", value);
    }
    /**
     * Sets the enterpriseAppBlockTrustModification property value. [Deprecated] Configuring this setting and setting the value to 'true' has no effect on the device.
     * @param value Value to set for the enterpriseAppBlockTrustModification property.
     */
    public void setEnterpriseAppBlockTrustModification(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("enterpriseAppBlockTrustModification", value);
    }
    /**
     * Sets the faceTimeBlocked property value. Indicates whether or not to block the user from using FaceTime. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the faceTimeBlocked property.
     */
    public void setFaceTimeBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("faceTimeBlocked", value);
    }
    /**
     * Sets the findMyFriendsBlocked property value. Indicates whether or not to block changes to Find My Friends when the device is in supervised mode.
     * @param value Value to set for the findMyFriendsBlocked property.
     */
    public void setFindMyFriendsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("findMyFriendsBlocked", value);
    }
    /**
     * Sets the gameCenterBlocked property value. Indicates whether or not to block the user from using Game Center when the device is in supervised mode.
     * @param value Value to set for the gameCenterBlocked property.
     */
    public void setGameCenterBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("gameCenterBlocked", value);
    }
    /**
     * Sets the gamingBlockGameCenterFriends property value. Indicates whether or not to block the user from having friends in Game Center. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the gamingBlockGameCenterFriends property.
     */
    public void setGamingBlockGameCenterFriends(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("gamingBlockGameCenterFriends", value);
    }
    /**
     * Sets the gamingBlockMultiplayer property value. Indicates whether or not to block the user from using multiplayer gaming. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the gamingBlockMultiplayer property.
     */
    public void setGamingBlockMultiplayer(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("gamingBlockMultiplayer", value);
    }
    /**
     * Sets the hostPairingBlocked property value. indicates whether or not to allow host pairing to control the devices an iOS device can pair with when the iOS device is in supervised mode.
     * @param value Value to set for the hostPairingBlocked property.
     */
    public void setHostPairingBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("hostPairingBlocked", value);
    }
    /**
     * Sets the iBooksStoreBlocked property value. Indicates whether or not to block the user from using the iBooks Store when the device is in supervised mode.
     * @param value Value to set for the iBooksStoreBlocked property.
     */
    public void setIBooksStoreBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("iBooksStoreBlocked", value);
    }
    /**
     * Sets the iBooksStoreBlockErotica property value. Indicates whether or not to block the user from downloading media from the iBookstore that has been tagged as erotica.
     * @param value Value to set for the iBooksStoreBlockErotica property.
     */
    public void setIBooksStoreBlockErotica(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("iBooksStoreBlockErotica", value);
    }
    /**
     * Sets the iCloudBlockActivityContinuation property value. Indicates whether or not to block the user from continuing work they started on iOS device to another iOS or macOS device.
     * @param value Value to set for the iCloudBlockActivityContinuation property.
     */
    public void setICloudBlockActivityContinuation(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("iCloudBlockActivityContinuation", value);
    }
    /**
     * Sets the iCloudBlockBackup property value. Indicates whether or not to block iCloud backup. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the iCloudBlockBackup property.
     */
    public void setICloudBlockBackup(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("iCloudBlockBackup", value);
    }
    /**
     * Sets the iCloudBlockDocumentSync property value. Indicates whether or not to block iCloud document sync. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the iCloudBlockDocumentSync property.
     */
    public void setICloudBlockDocumentSync(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("iCloudBlockDocumentSync", value);
    }
    /**
     * Sets the iCloudBlockManagedAppsSync property value. Indicates whether or not to block Managed Apps Cloud Sync.
     * @param value Value to set for the iCloudBlockManagedAppsSync property.
     */
    public void setICloudBlockManagedAppsSync(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("iCloudBlockManagedAppsSync", value);
    }
    /**
     * Sets the iCloudBlockPhotoLibrary property value. Indicates whether or not to block iCloud Photo Library.
     * @param value Value to set for the iCloudBlockPhotoLibrary property.
     */
    public void setICloudBlockPhotoLibrary(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("iCloudBlockPhotoLibrary", value);
    }
    /**
     * Sets the iCloudBlockPhotoStreamSync property value. Indicates whether or not to block iCloud Photo Stream Sync.
     * @param value Value to set for the iCloudBlockPhotoStreamSync property.
     */
    public void setICloudBlockPhotoStreamSync(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("iCloudBlockPhotoStreamSync", value);
    }
    /**
     * Sets the iCloudBlockSharedPhotoStream property value. Indicates whether or not to block Shared Photo Stream.
     * @param value Value to set for the iCloudBlockSharedPhotoStream property.
     */
    public void setICloudBlockSharedPhotoStream(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("iCloudBlockSharedPhotoStream", value);
    }
    /**
     * Sets the iCloudRequireEncryptedBackup property value. Indicates whether or not to require backups to iCloud be encrypted.
     * @param value Value to set for the iCloudRequireEncryptedBackup property.
     */
    public void setICloudRequireEncryptedBackup(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("iCloudRequireEncryptedBackup", value);
    }
    /**
     * Sets the iTunesBlockExplicitContent property value. Indicates whether or not to block the user from accessing explicit content in iTunes and the App Store. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the iTunesBlockExplicitContent property.
     */
    public void setITunesBlockExplicitContent(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("iTunesBlockExplicitContent", value);
    }
    /**
     * Sets the iTunesBlockMusicService property value. Indicates whether or not to block Music service and revert Music app to classic mode when the device is in supervised mode (iOS 9.3 and later and macOS 10.12 and later).
     * @param value Value to set for the iTunesBlockMusicService property.
     */
    public void setITunesBlockMusicService(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("iTunesBlockMusicService", value);
    }
    /**
     * Sets the iTunesBlockRadio property value. Indicates whether or not to block the user from using iTunes Radio when the device is in supervised mode (iOS 9.3 and later).
     * @param value Value to set for the iTunesBlockRadio property.
     */
    public void setITunesBlockRadio(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("iTunesBlockRadio", value);
    }
    /**
     * Sets the keyboardBlockAutoCorrect property value. Indicates whether or not to block keyboard auto-correction when the device is in supervised mode (iOS 8.1.3 and later).
     * @param value Value to set for the keyboardBlockAutoCorrect property.
     */
    public void setKeyboardBlockAutoCorrect(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("keyboardBlockAutoCorrect", value);
    }
    /**
     * Sets the keyboardBlockDictation property value. Indicates whether or not to block the user from using dictation input when the device is in supervised mode.
     * @param value Value to set for the keyboardBlockDictation property.
     */
    public void setKeyboardBlockDictation(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("keyboardBlockDictation", value);
    }
    /**
     * Sets the keyboardBlockPredictive property value. Indicates whether or not to block predictive keyboards when device is in supervised mode (iOS 8.1.3 and later).
     * @param value Value to set for the keyboardBlockPredictive property.
     */
    public void setKeyboardBlockPredictive(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("keyboardBlockPredictive", value);
    }
    /**
     * Sets the keyboardBlockShortcuts property value. Indicates whether or not to block keyboard shortcuts when the device is in supervised mode (iOS 9.0 and later).
     * @param value Value to set for the keyboardBlockShortcuts property.
     */
    public void setKeyboardBlockShortcuts(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("keyboardBlockShortcuts", value);
    }
    /**
     * Sets the keyboardBlockSpellCheck property value. Indicates whether or not to block keyboard spell-checking when the device is in supervised mode (iOS 8.1.3 and later).
     * @param value Value to set for the keyboardBlockSpellCheck property.
     */
    public void setKeyboardBlockSpellCheck(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("keyboardBlockSpellCheck", value);
    }
    /**
     * Sets the kioskModeAllowAssistiveSpeak property value. Indicates whether or not to allow assistive speak while in kiosk mode.
     * @param value Value to set for the kioskModeAllowAssistiveSpeak property.
     */
    public void setKioskModeAllowAssistiveSpeak(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("kioskModeAllowAssistiveSpeak", value);
    }
    /**
     * Sets the kioskModeAllowAssistiveTouchSettings property value. Indicates whether or not to allow access to the Assistive Touch Settings while in kiosk mode.
     * @param value Value to set for the kioskModeAllowAssistiveTouchSettings property.
     */
    public void setKioskModeAllowAssistiveTouchSettings(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("kioskModeAllowAssistiveTouchSettings", value);
    }
    /**
     * Sets the kioskModeAllowAutoLock property value. Indicates whether or not to allow device auto lock while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockAutoLock instead.
     * @param value Value to set for the kioskModeAllowAutoLock property.
     */
    public void setKioskModeAllowAutoLock(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("kioskModeAllowAutoLock", value);
    }
    /**
     * Sets the kioskModeAllowColorInversionSettings property value. Indicates whether or not to allow access to the Color Inversion Settings while in kiosk mode.
     * @param value Value to set for the kioskModeAllowColorInversionSettings property.
     */
    public void setKioskModeAllowColorInversionSettings(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("kioskModeAllowColorInversionSettings", value);
    }
    /**
     * Sets the kioskModeAllowRingerSwitch property value. Indicates whether or not to allow use of the ringer switch while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockRingerSwitch instead.
     * @param value Value to set for the kioskModeAllowRingerSwitch property.
     */
    public void setKioskModeAllowRingerSwitch(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("kioskModeAllowRingerSwitch", value);
    }
    /**
     * Sets the kioskModeAllowScreenRotation property value. Indicates whether or not to allow screen rotation while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockScreenRotation instead.
     * @param value Value to set for the kioskModeAllowScreenRotation property.
     */
    public void setKioskModeAllowScreenRotation(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("kioskModeAllowScreenRotation", value);
    }
    /**
     * Sets the kioskModeAllowSleepButton property value. Indicates whether or not to allow use of the sleep button while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockSleepButton instead.
     * @param value Value to set for the kioskModeAllowSleepButton property.
     */
    public void setKioskModeAllowSleepButton(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("kioskModeAllowSleepButton", value);
    }
    /**
     * Sets the kioskModeAllowTouchscreen property value. Indicates whether or not to allow use of the touchscreen while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockTouchscreen instead.
     * @param value Value to set for the kioskModeAllowTouchscreen property.
     */
    public void setKioskModeAllowTouchscreen(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("kioskModeAllowTouchscreen", value);
    }
    /**
     * Sets the kioskModeAllowVoiceOverSettings property value. Indicates whether or not to allow access to the voice over settings while in kiosk mode.
     * @param value Value to set for the kioskModeAllowVoiceOverSettings property.
     */
    public void setKioskModeAllowVoiceOverSettings(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("kioskModeAllowVoiceOverSettings", value);
    }
    /**
     * Sets the kioskModeAllowVolumeButtons property value. Indicates whether or not to allow use of the volume buttons while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockVolumeButtons instead.
     * @param value Value to set for the kioskModeAllowVolumeButtons property.
     */
    public void setKioskModeAllowVolumeButtons(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("kioskModeAllowVolumeButtons", value);
    }
    /**
     * Sets the kioskModeAllowZoomSettings property value. Indicates whether or not to allow access to the zoom settings while in kiosk mode.
     * @param value Value to set for the kioskModeAllowZoomSettings property.
     */
    public void setKioskModeAllowZoomSettings(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("kioskModeAllowZoomSettings", value);
    }
    /**
     * Sets the kioskModeAppStoreUrl property value. URL in the app store to the app to use for kiosk mode. Use if KioskModeManagedAppId is not known.
     * @param value Value to set for the kioskModeAppStoreUrl property.
     */
    public void setKioskModeAppStoreUrl(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("kioskModeAppStoreUrl", value);
    }
    /**
     * Sets the kioskModeBuiltInAppId property value. ID for built-in apps to use for kiosk mode. Used when KioskModeManagedAppId and KioskModeAppStoreUrl are not set.
     * @param value Value to set for the kioskModeBuiltInAppId property.
     */
    public void setKioskModeBuiltInAppId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("kioskModeBuiltInAppId", value);
    }
    /**
     * Sets the kioskModeManagedAppId property value. Managed app id of the app to use for kiosk mode. If KioskModeManagedAppId is specified then KioskModeAppStoreUrl will be ignored.
     * @param value Value to set for the kioskModeManagedAppId property.
     */
    public void setKioskModeManagedAppId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("kioskModeManagedAppId", value);
    }
    /**
     * Sets the kioskModeRequireAssistiveTouch property value. Indicates whether or not to require assistive touch while in kiosk mode.
     * @param value Value to set for the kioskModeRequireAssistiveTouch property.
     */
    public void setKioskModeRequireAssistiveTouch(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("kioskModeRequireAssistiveTouch", value);
    }
    /**
     * Sets the kioskModeRequireColorInversion property value. Indicates whether or not to require color inversion while in kiosk mode.
     * @param value Value to set for the kioskModeRequireColorInversion property.
     */
    public void setKioskModeRequireColorInversion(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("kioskModeRequireColorInversion", value);
    }
    /**
     * Sets the kioskModeRequireMonoAudio property value. Indicates whether or not to require mono audio while in kiosk mode.
     * @param value Value to set for the kioskModeRequireMonoAudio property.
     */
    public void setKioskModeRequireMonoAudio(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("kioskModeRequireMonoAudio", value);
    }
    /**
     * Sets the kioskModeRequireVoiceOver property value. Indicates whether or not to require voice over while in kiosk mode.
     * @param value Value to set for the kioskModeRequireVoiceOver property.
     */
    public void setKioskModeRequireVoiceOver(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("kioskModeRequireVoiceOver", value);
    }
    /**
     * Sets the kioskModeRequireZoom property value. Indicates whether or not to require zoom while in kiosk mode.
     * @param value Value to set for the kioskModeRequireZoom property.
     */
    public void setKioskModeRequireZoom(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("kioskModeRequireZoom", value);
    }
    /**
     * Sets the lockScreenBlockControlCenter property value. Indicates whether or not to block the user from using control center on the lock screen.
     * @param value Value to set for the lockScreenBlockControlCenter property.
     */
    public void setLockScreenBlockControlCenter(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("lockScreenBlockControlCenter", value);
    }
    /**
     * Sets the lockScreenBlockNotificationView property value. Indicates whether or not to block the user from using the notification view on the lock screen.
     * @param value Value to set for the lockScreenBlockNotificationView property.
     */
    public void setLockScreenBlockNotificationView(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("lockScreenBlockNotificationView", value);
    }
    /**
     * Sets the lockScreenBlockPassbook property value. Indicates whether or not to block the user from using passbook when the device is locked.
     * @param value Value to set for the lockScreenBlockPassbook property.
     */
    public void setLockScreenBlockPassbook(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("lockScreenBlockPassbook", value);
    }
    /**
     * Sets the lockScreenBlockTodayView property value. Indicates whether or not to block the user from using the Today View on the lock screen.
     * @param value Value to set for the lockScreenBlockTodayView property.
     */
    public void setLockScreenBlockTodayView(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("lockScreenBlockTodayView", value);
    }
    /**
     * Sets the mediaContentRatingApps property value. Apps rating as in media content
     * @param value Value to set for the mediaContentRatingApps property.
     */
    public void setMediaContentRatingApps(@jakarta.annotation.Nullable final RatingAppsType value) {
        this.getBackingStore().set("mediaContentRatingApps", value);
    }
    /**
     * Sets the mediaContentRatingAustralia property value. Media content rating settings for Australia
     * @param value Value to set for the mediaContentRatingAustralia property.
     */
    public void setMediaContentRatingAustralia(@jakarta.annotation.Nullable final MediaContentRatingAustralia value) {
        this.getBackingStore().set("mediaContentRatingAustralia", value);
    }
    /**
     * Sets the mediaContentRatingCanada property value. Media content rating settings for Canada
     * @param value Value to set for the mediaContentRatingCanada property.
     */
    public void setMediaContentRatingCanada(@jakarta.annotation.Nullable final MediaContentRatingCanada value) {
        this.getBackingStore().set("mediaContentRatingCanada", value);
    }
    /**
     * Sets the mediaContentRatingFrance property value. Media content rating settings for France
     * @param value Value to set for the mediaContentRatingFrance property.
     */
    public void setMediaContentRatingFrance(@jakarta.annotation.Nullable final MediaContentRatingFrance value) {
        this.getBackingStore().set("mediaContentRatingFrance", value);
    }
    /**
     * Sets the mediaContentRatingGermany property value. Media content rating settings for Germany
     * @param value Value to set for the mediaContentRatingGermany property.
     */
    public void setMediaContentRatingGermany(@jakarta.annotation.Nullable final MediaContentRatingGermany value) {
        this.getBackingStore().set("mediaContentRatingGermany", value);
    }
    /**
     * Sets the mediaContentRatingIreland property value. Media content rating settings for Ireland
     * @param value Value to set for the mediaContentRatingIreland property.
     */
    public void setMediaContentRatingIreland(@jakarta.annotation.Nullable final MediaContentRatingIreland value) {
        this.getBackingStore().set("mediaContentRatingIreland", value);
    }
    /**
     * Sets the mediaContentRatingJapan property value. Media content rating settings for Japan
     * @param value Value to set for the mediaContentRatingJapan property.
     */
    public void setMediaContentRatingJapan(@jakarta.annotation.Nullable final MediaContentRatingJapan value) {
        this.getBackingStore().set("mediaContentRatingJapan", value);
    }
    /**
     * Sets the mediaContentRatingNewZealand property value. Media content rating settings for New Zealand
     * @param value Value to set for the mediaContentRatingNewZealand property.
     */
    public void setMediaContentRatingNewZealand(@jakarta.annotation.Nullable final MediaContentRatingNewZealand value) {
        this.getBackingStore().set("mediaContentRatingNewZealand", value);
    }
    /**
     * Sets the mediaContentRatingUnitedKingdom property value. Media content rating settings for United Kingdom
     * @param value Value to set for the mediaContentRatingUnitedKingdom property.
     */
    public void setMediaContentRatingUnitedKingdom(@jakarta.annotation.Nullable final MediaContentRatingUnitedKingdom value) {
        this.getBackingStore().set("mediaContentRatingUnitedKingdom", value);
    }
    /**
     * Sets the mediaContentRatingUnitedStates property value. Media content rating settings for United States
     * @param value Value to set for the mediaContentRatingUnitedStates property.
     */
    public void setMediaContentRatingUnitedStates(@jakarta.annotation.Nullable final MediaContentRatingUnitedStates value) {
        this.getBackingStore().set("mediaContentRatingUnitedStates", value);
    }
    /**
     * Sets the messagesBlocked property value. Indicates whether or not to block the user from using the Messages app on the supervised device.
     * @param value Value to set for the messagesBlocked property.
     */
    public void setMessagesBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("messagesBlocked", value);
    }
    /**
     * Sets the networkUsageRules property value. List of managed apps and the network rules that applies to them. This collection can contain a maximum of 1000 elements.
     * @param value Value to set for the networkUsageRules property.
     */
    public void setNetworkUsageRules(@jakarta.annotation.Nullable final java.util.List<IosNetworkUsageRule> value) {
        this.getBackingStore().set("networkUsageRules", value);
    }
    /**
     * Sets the notificationsBlockSettingsModification property value. Indicates whether or not to allow notifications settings modification (iOS 9.3 and later).
     * @param value Value to set for the notificationsBlockSettingsModification property.
     */
    public void setNotificationsBlockSettingsModification(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("notificationsBlockSettingsModification", value);
    }
    /**
     * Sets the passcodeBlockFingerprintModification property value. Block modification of registered Touch ID fingerprints when in supervised mode.
     * @param value Value to set for the passcodeBlockFingerprintModification property.
     */
    public void setPasscodeBlockFingerprintModification(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("passcodeBlockFingerprintModification", value);
    }
    /**
     * Sets the passcodeBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @param value Value to set for the passcodeBlockFingerprintUnlock property.
     */
    public void setPasscodeBlockFingerprintUnlock(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("passcodeBlockFingerprintUnlock", value);
    }
    /**
     * Sets the passcodeBlockModification property value. Indicates whether or not to allow passcode modification on the supervised device (iOS 9.0 and later).
     * @param value Value to set for the passcodeBlockModification property.
     */
    public void setPasscodeBlockModification(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("passcodeBlockModification", value);
    }
    /**
     * Sets the passcodeBlockSimple property value. Indicates whether or not to block simple passcodes.
     * @param value Value to set for the passcodeBlockSimple property.
     */
    public void setPasscodeBlockSimple(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("passcodeBlockSimple", value);
    }
    /**
     * Sets the passcodeExpirationDays property value. Number of days before the passcode expires. Valid values 1 to 65535
     * @param value Value to set for the passcodeExpirationDays property.
     */
    public void setPasscodeExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("passcodeExpirationDays", value);
    }
    /**
     * Sets the passcodeMinimumCharacterSetCount property value. Number of character sets a passcode must contain. Valid values 0 to 4
     * @param value Value to set for the passcodeMinimumCharacterSetCount property.
     */
    public void setPasscodeMinimumCharacterSetCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("passcodeMinimumCharacterSetCount", value);
    }
    /**
     * Sets the passcodeMinimumLength property value. Minimum length of passcode. Valid values 4 to 14
     * @param value Value to set for the passcodeMinimumLength property.
     */
    public void setPasscodeMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("passcodeMinimumLength", value);
    }
    /**
     * Sets the passcodeMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a passcode is required.
     * @param value Value to set for the passcodeMinutesOfInactivityBeforeLock property.
     */
    public void setPasscodeMinutesOfInactivityBeforeLock(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("passcodeMinutesOfInactivityBeforeLock", value);
    }
    /**
     * Sets the passcodeMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @param value Value to set for the passcodeMinutesOfInactivityBeforeScreenTimeout property.
     */
    public void setPasscodeMinutesOfInactivityBeforeScreenTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("passcodeMinutesOfInactivityBeforeScreenTimeout", value);
    }
    /**
     * Sets the passcodePreviousPasscodeBlockCount property value. Number of previous passcodes to block. Valid values 1 to 24
     * @param value Value to set for the passcodePreviousPasscodeBlockCount property.
     */
    public void setPasscodePreviousPasscodeBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("passcodePreviousPasscodeBlockCount", value);
    }
    /**
     * Sets the passcodeRequired property value. Indicates whether or not to require a passcode.
     * @param value Value to set for the passcodeRequired property.
     */
    public void setPasscodeRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("passcodeRequired", value);
    }
    /**
     * Sets the passcodeRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passcodeRequiredType property.
     */
    public void setPasscodeRequiredType(@jakarta.annotation.Nullable final RequiredPasswordType value) {
        this.getBackingStore().set("passcodeRequiredType", value);
    }
    /**
     * Sets the passcodeSignInFailureCountBeforeWipe property value. Number of sign in failures allowed before wiping the device. Valid values 2 to 11
     * @param value Value to set for the passcodeSignInFailureCountBeforeWipe property.
     */
    public void setPasscodeSignInFailureCountBeforeWipe(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("passcodeSignInFailureCountBeforeWipe", value);
    }
    /**
     * Sets the podcastsBlocked property value. Indicates whether or not to block the user from using podcasts on the supervised device (iOS 8.0 and later).
     * @param value Value to set for the podcastsBlocked property.
     */
    public void setPodcastsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("podcastsBlocked", value);
    }
    /**
     * Sets the safariBlockAutofill property value. Indicates whether or not to block the user from using Auto fill in Safari. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the safariBlockAutofill property.
     */
    public void setSafariBlockAutofill(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("safariBlockAutofill", value);
    }
    /**
     * Sets the safariBlocked property value. Indicates whether or not to block the user from using Safari. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the safariBlocked property.
     */
    public void setSafariBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("safariBlocked", value);
    }
    /**
     * Sets the safariBlockJavaScript property value. Indicates whether or not to block JavaScript in Safari.
     * @param value Value to set for the safariBlockJavaScript property.
     */
    public void setSafariBlockJavaScript(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("safariBlockJavaScript", value);
    }
    /**
     * Sets the safariBlockPopups property value. Indicates whether or not to block popups in Safari.
     * @param value Value to set for the safariBlockPopups property.
     */
    public void setSafariBlockPopups(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("safariBlockPopups", value);
    }
    /**
     * Sets the safariCookieSettings property value. Web Browser Cookie Settings.
     * @param value Value to set for the safariCookieSettings property.
     */
    public void setSafariCookieSettings(@jakarta.annotation.Nullable final WebBrowserCookieSettings value) {
        this.getBackingStore().set("safariCookieSettings", value);
    }
    /**
     * Sets the safariManagedDomains property value. URLs matching the patterns listed here will be considered managed.
     * @param value Value to set for the safariManagedDomains property.
     */
    public void setSafariManagedDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.getBackingStore().set("safariManagedDomains", value);
    }
    /**
     * Sets the safariPasswordAutoFillDomains property value. Users can save passwords in Safari only from URLs matching the patterns listed here. Applies to devices in supervised mode (iOS 9.3 and later).
     * @param value Value to set for the safariPasswordAutoFillDomains property.
     */
    public void setSafariPasswordAutoFillDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.getBackingStore().set("safariPasswordAutoFillDomains", value);
    }
    /**
     * Sets the safariRequireFraudWarning property value. Indicates whether or not to require fraud warning in Safari.
     * @param value Value to set for the safariRequireFraudWarning property.
     */
    public void setSafariRequireFraudWarning(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("safariRequireFraudWarning", value);
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to block the user from taking Screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     */
    public void setScreenCaptureBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("screenCaptureBlocked", value);
    }
    /**
     * Sets the siriBlocked property value. Indicates whether or not to block the user from using Siri.
     * @param value Value to set for the siriBlocked property.
     */
    public void setSiriBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("siriBlocked", value);
    }
    /**
     * Sets the siriBlockedWhenLocked property value. Indicates whether or not to block the user from using Siri when locked.
     * @param value Value to set for the siriBlockedWhenLocked property.
     */
    public void setSiriBlockedWhenLocked(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("siriBlockedWhenLocked", value);
    }
    /**
     * Sets the siriBlockUserGeneratedContent property value. Indicates whether or not to block Siri from querying user-generated content when used on a supervised device.
     * @param value Value to set for the siriBlockUserGeneratedContent property.
     */
    public void setSiriBlockUserGeneratedContent(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("siriBlockUserGeneratedContent", value);
    }
    /**
     * Sets the siriRequireProfanityFilter property value. Indicates whether or not to prevent Siri from dictating, or speaking profane language on supervised device.
     * @param value Value to set for the siriRequireProfanityFilter property.
     */
    public void setSiriRequireProfanityFilter(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("siriRequireProfanityFilter", value);
    }
    /**
     * Sets the spotlightBlockInternetResults property value. Indicates whether or not to block Spotlight search from returning internet results on supervised device.
     * @param value Value to set for the spotlightBlockInternetResults property.
     */
    public void setSpotlightBlockInternetResults(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("spotlightBlockInternetResults", value);
    }
    /**
     * Sets the voiceDialingBlocked property value. Indicates whether or not to block voice dialing.
     * @param value Value to set for the voiceDialingBlocked property.
     */
    public void setVoiceDialingBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("voiceDialingBlocked", value);
    }
    /**
     * Sets the wallpaperBlockModification property value. Indicates whether or not to allow wallpaper modification on supervised device (iOS 9.0 and later) .
     * @param value Value to set for the wallpaperBlockModification property.
     */
    public void setWallpaperBlockModification(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("wallpaperBlockModification", value);
    }
    /**
     * Sets the wiFiConnectOnlyToConfiguredNetworks property value. Indicates whether or not to force the device to use only Wi-Fi networks from configuration profiles when the device is in supervised mode. Available for devices running iOS and iPadOS versions 14.4 and earlier. Devices running 14.5+ should use the setting, 'WiFiConnectToAllowedNetworksOnlyForced.
     * @param value Value to set for the wiFiConnectOnlyToConfiguredNetworks property.
     */
    public void setWiFiConnectOnlyToConfiguredNetworks(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("wiFiConnectOnlyToConfiguredNetworks", value);
    }
}
