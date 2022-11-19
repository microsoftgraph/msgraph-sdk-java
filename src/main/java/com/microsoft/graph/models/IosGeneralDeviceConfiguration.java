package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosGeneralDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /** Indicates whether or not to allow account modification when the device is in supervised mode. */
    private Boolean _accountBlockModification;
    /** Indicates whether or not to allow activation lock when the device is in the supervised mode. */
    private Boolean _activationLockAllowWhenSupervised;
    /** Indicates whether or not to allow AirDrop when the device is in supervised mode. */
    private Boolean _airDropBlocked;
    /** Indicates whether or not to cause AirDrop to be considered an unmanaged drop target (iOS 9.0 and later). */
    private Boolean _airDropForceUnmanagedDropTarget;
    /** Indicates whether or not to enforce all devices receiving AirPlay requests from this device to use a pairing password. */
    private Boolean _airPlayForcePairingPasswordForOutgoingRequests;
    /** Indicates whether or not to block the user from using News when the device is in supervised mode (iOS 9.0 and later). */
    private Boolean _appleNewsBlocked;
    /** Indicates whether or not to allow Apple Watch pairing when the device is in supervised mode (iOS 9.0 and later). */
    private Boolean _appleWatchBlockPairing;
    /** Indicates whether or not to force a paired Apple Watch to use Wrist Detection (iOS 8.2 and later). */
    private Boolean _appleWatchForceWristDetection;
    /** Gets or sets the list of iOS apps allowed to autonomously enter Single App Mode. Supervised only. iOS 7.0 and later. This collection can contain a maximum of 500 elements. */
    private java.util.List<AppListItem> _appsSingleAppModeList;
    /** Indicates whether or not to block the automatic downloading of apps purchased on other devices when the device is in supervised mode (iOS 9.0 and later). */
    private Boolean _appStoreBlockAutomaticDownloads;
    /** Indicates whether or not to block the user from using the App Store. Requires a supervised device for iOS 13 and later. */
    private Boolean _appStoreBlocked;
    /** Indicates whether or not to block the user from making in app purchases. */
    private Boolean _appStoreBlockInAppPurchases;
    /** Indicates whether or not to block the App Store app, not restricting installation through Host apps. Applies to supervised mode only (iOS 9.0 and later). */
    private Boolean _appStoreBlockUIAppInstallation;
    /** Indicates whether or not to require a password when using the app store. */
    private Boolean _appStoreRequirePassword;
    /** List of apps in the visibility list (either visible/launchable apps list or hidden/unlaunchable apps list, controlled by AppsVisibilityListType) (iOS 9.3 and later). This collection can contain a maximum of 10000 elements. */
    private java.util.List<AppListItem> _appsVisibilityList;
    /** Possible values of the compliance app list. */
    private AppListType _appsVisibilityListType;
    /** Indicates whether or not to allow modification of Bluetooth settings when the device is in supervised mode (iOS 10.0 and later). */
    private Boolean _bluetoothBlockModification;
    /** Indicates whether or not to block the user from accessing the camera of the device. Requires a supervised device for iOS 13 and later. */
    private Boolean _cameraBlocked;
    /** Indicates whether or not to block data roaming. */
    private Boolean _cellularBlockDataRoaming;
    /** Indicates whether or not to block global background fetch while roaming. */
    private Boolean _cellularBlockGlobalBackgroundFetchWhileRoaming;
    /** Indicates whether or not to allow changes to cellular app data usage settings when the device is in supervised mode. */
    private Boolean _cellularBlockPerAppDataModification;
    /** Indicates whether or not to block Personal Hotspot. */
    private Boolean _cellularBlockPersonalHotspot;
    /** Indicates whether or not to block voice roaming. */
    private Boolean _cellularBlockVoiceRoaming;
    /** Indicates whether or not to block untrusted TLS certificates. */
    private Boolean _certificatesBlockUntrustedTlsCertificates;
    /** Indicates whether or not to allow remote screen observation by Classroom app when the device is in supervised mode (iOS 9.3 and later). */
    private Boolean _classroomAppBlockRemoteScreenObservation;
    /** Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to view a student's screen without prompting when the device is in supervised mode. */
    private Boolean _classroomAppForceUnpromptedScreenObservation;
    /** Possible values of the compliance app list. */
    private AppListType _compliantAppListType;
    /** List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements. */
    private java.util.List<AppListItem> _compliantAppsList;
    /** Indicates whether or not to block the user from installing configuration profiles and certificates interactively when the device is in supervised mode. */
    private Boolean _configurationProfileBlockChanges;
    /** Indicates whether or not to block definition lookup when the device is in supervised mode (iOS 8.1.3 and later ). */
    private Boolean _definitionLookupBlocked;
    /** Indicates whether or not to allow the user to enables restrictions in the device settings when the device is in supervised mode. */
    private Boolean _deviceBlockEnableRestrictions;
    /** Indicates whether or not to allow the use of the 'Erase all content and settings' option on the device when the device is in supervised mode. */
    private Boolean _deviceBlockEraseContentAndSettings;
    /** Indicates whether or not to allow device name modification when the device is in supervised mode (iOS 9.0 and later). */
    private Boolean _deviceBlockNameModification;
    /** Indicates whether or not to block diagnostic data submission. */
    private Boolean _diagnosticDataBlockSubmission;
    /** Indicates whether or not to allow diagnostics submission settings modification when the device is in supervised mode (iOS 9.3.2 and later). */
    private Boolean _diagnosticDataBlockSubmissionModification;
    /** Indicates whether or not to block the user from viewing managed documents in unmanaged apps. */
    private Boolean _documentsBlockManagedDocumentsInUnmanagedApps;
    /** Indicates whether or not to block the user from viewing unmanaged documents in managed apps. */
    private Boolean _documentsBlockUnmanagedDocumentsInManagedApps;
    /** An email address lacking a suffix that matches any of these strings will be considered out-of-domain. */
    private java.util.List<String> _emailInDomainSuffixes;
    /** Indicates whether or not to block the user from trusting an enterprise app. */
    private Boolean _enterpriseAppBlockTrust;
    /** [Deprecated] Configuring this setting and setting the value to 'true' has no effect on the device. */
    private Boolean _enterpriseAppBlockTrustModification;
    /** Indicates whether or not to block the user from using FaceTime. Requires a supervised device for iOS 13 and later. */
    private Boolean _faceTimeBlocked;
    /** Indicates whether or not to block changes to Find My Friends when the device is in supervised mode. */
    private Boolean _findMyFriendsBlocked;
    /** Indicates whether or not to block the user from using Game Center when the device is in supervised mode. */
    private Boolean _gameCenterBlocked;
    /** Indicates whether or not to block the user from having friends in Game Center. Requires a supervised device for iOS 13 and later. */
    private Boolean _gamingBlockGameCenterFriends;
    /** Indicates whether or not to block the user from using multiplayer gaming. Requires a supervised device for iOS 13 and later. */
    private Boolean _gamingBlockMultiplayer;
    /** indicates whether or not to allow host pairing to control the devices an iOS device can pair with when the iOS device is in supervised mode. */
    private Boolean _hostPairingBlocked;
    /** Indicates whether or not to block the user from using the iBooks Store when the device is in supervised mode. */
    private Boolean _iBooksStoreBlocked;
    /** Indicates whether or not to block the user from downloading media from the iBookstore that has been tagged as erotica. */
    private Boolean _iBooksStoreBlockErotica;
    /** Indicates whether or not to block the user from continuing work they started on iOS device to another iOS or macOS device. */
    private Boolean _iCloudBlockActivityContinuation;
    /** Indicates whether or not to block iCloud backup. Requires a supervised device for iOS 13 and later. */
    private Boolean _iCloudBlockBackup;
    /** Indicates whether or not to block iCloud document sync. Requires a supervised device for iOS 13 and later. */
    private Boolean _iCloudBlockDocumentSync;
    /** Indicates whether or not to block Managed Apps Cloud Sync. */
    private Boolean _iCloudBlockManagedAppsSync;
    /** Indicates whether or not to block iCloud Photo Library. */
    private Boolean _iCloudBlockPhotoLibrary;
    /** Indicates whether or not to block iCloud Photo Stream Sync. */
    private Boolean _iCloudBlockPhotoStreamSync;
    /** Indicates whether or not to block Shared Photo Stream. */
    private Boolean _iCloudBlockSharedPhotoStream;
    /** Indicates whether or not to require backups to iCloud be encrypted. */
    private Boolean _iCloudRequireEncryptedBackup;
    /** Indicates whether or not to block the user from accessing explicit content in iTunes and the App Store. Requires a supervised device for iOS 13 and later. */
    private Boolean _iTunesBlockExplicitContent;
    /** Indicates whether or not to block Music service and revert Music app to classic mode when the device is in supervised mode (iOS 9.3 and later and macOS 10.12 and later). */
    private Boolean _iTunesBlockMusicService;
    /** Indicates whether or not to block the user from using iTunes Radio when the device is in supervised mode (iOS 9.3 and later). */
    private Boolean _iTunesBlockRadio;
    /** Indicates whether or not to block keyboard auto-correction when the device is in supervised mode (iOS 8.1.3 and later). */
    private Boolean _keyboardBlockAutoCorrect;
    /** Indicates whether or not to block the user from using dictation input when the device is in supervised mode. */
    private Boolean _keyboardBlockDictation;
    /** Indicates whether or not to block predictive keyboards when device is in supervised mode (iOS 8.1.3 and later). */
    private Boolean _keyboardBlockPredictive;
    /** Indicates whether or not to block keyboard shortcuts when the device is in supervised mode (iOS 9.0 and later). */
    private Boolean _keyboardBlockShortcuts;
    /** Indicates whether or not to block keyboard spell-checking when the device is in supervised mode (iOS 8.1.3 and later). */
    private Boolean _keyboardBlockSpellCheck;
    /** Indicates whether or not to allow assistive speak while in kiosk mode. */
    private Boolean _kioskModeAllowAssistiveSpeak;
    /** Indicates whether or not to allow access to the Assistive Touch Settings while in kiosk mode. */
    private Boolean _kioskModeAllowAssistiveTouchSettings;
    /** Indicates whether or not to allow device auto lock while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockAutoLock instead. */
    private Boolean _kioskModeAllowAutoLock;
    /** Indicates whether or not to allow access to the Color Inversion Settings while in kiosk mode. */
    private Boolean _kioskModeAllowColorInversionSettings;
    /** Indicates whether or not to allow use of the ringer switch while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockRingerSwitch instead. */
    private Boolean _kioskModeAllowRingerSwitch;
    /** Indicates whether or not to allow screen rotation while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockScreenRotation instead. */
    private Boolean _kioskModeAllowScreenRotation;
    /** Indicates whether or not to allow use of the sleep button while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockSleepButton instead. */
    private Boolean _kioskModeAllowSleepButton;
    /** Indicates whether or not to allow use of the touchscreen while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockTouchscreen instead. */
    private Boolean _kioskModeAllowTouchscreen;
    /** Indicates whether or not to allow access to the voice over settings while in kiosk mode. */
    private Boolean _kioskModeAllowVoiceOverSettings;
    /** Indicates whether or not to allow use of the volume buttons while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockVolumeButtons instead. */
    private Boolean _kioskModeAllowVolumeButtons;
    /** Indicates whether or not to allow access to the zoom settings while in kiosk mode. */
    private Boolean _kioskModeAllowZoomSettings;
    /** URL in the app store to the app to use for kiosk mode. Use if KioskModeManagedAppId is not known. */
    private String _kioskModeAppStoreUrl;
    /** ID for built-in apps to use for kiosk mode. Used when KioskModeManagedAppId and KioskModeAppStoreUrl are not set. */
    private String _kioskModeBuiltInAppId;
    /** Managed app id of the app to use for kiosk mode. If KioskModeManagedAppId is specified then KioskModeAppStoreUrl will be ignored. */
    private String _kioskModeManagedAppId;
    /** Indicates whether or not to require assistive touch while in kiosk mode. */
    private Boolean _kioskModeRequireAssistiveTouch;
    /** Indicates whether or not to require color inversion while in kiosk mode. */
    private Boolean _kioskModeRequireColorInversion;
    /** Indicates whether or not to require mono audio while in kiosk mode. */
    private Boolean _kioskModeRequireMonoAudio;
    /** Indicates whether or not to require voice over while in kiosk mode. */
    private Boolean _kioskModeRequireVoiceOver;
    /** Indicates whether or not to require zoom while in kiosk mode. */
    private Boolean _kioskModeRequireZoom;
    /** Indicates whether or not to block the user from using control center on the lock screen. */
    private Boolean _lockScreenBlockControlCenter;
    /** Indicates whether or not to block the user from using the notification view on the lock screen. */
    private Boolean _lockScreenBlockNotificationView;
    /** Indicates whether or not to block the user from using passbook when the device is locked. */
    private Boolean _lockScreenBlockPassbook;
    /** Indicates whether or not to block the user from using the Today View on the lock screen. */
    private Boolean _lockScreenBlockTodayView;
    /** Apps rating as in media content */
    private RatingAppsType _mediaContentRatingApps;
    /** Media content rating settings for Australia */
    private MediaContentRatingAustralia _mediaContentRatingAustralia;
    /** Media content rating settings for Canada */
    private MediaContentRatingCanada _mediaContentRatingCanada;
    /** Media content rating settings for France */
    private MediaContentRatingFrance _mediaContentRatingFrance;
    /** Media content rating settings for Germany */
    private MediaContentRatingGermany _mediaContentRatingGermany;
    /** Media content rating settings for Ireland */
    private MediaContentRatingIreland _mediaContentRatingIreland;
    /** Media content rating settings for Japan */
    private MediaContentRatingJapan _mediaContentRatingJapan;
    /** Media content rating settings for New Zealand */
    private MediaContentRatingNewZealand _mediaContentRatingNewZealand;
    /** Media content rating settings for United Kingdom */
    private MediaContentRatingUnitedKingdom _mediaContentRatingUnitedKingdom;
    /** Media content rating settings for United States */
    private MediaContentRatingUnitedStates _mediaContentRatingUnitedStates;
    /** Indicates whether or not to block the user from using the Messages app on the supervised device. */
    private Boolean _messagesBlocked;
    /** List of managed apps and the network rules that applies to them. This collection can contain a maximum of 1000 elements. */
    private java.util.List<IosNetworkUsageRule> _networkUsageRules;
    /** Indicates whether or not to allow notifications settings modification (iOS 9.3 and later). */
    private Boolean _notificationsBlockSettingsModification;
    /** Block modification of registered Touch ID fingerprints when in supervised mode. */
    private Boolean _passcodeBlockFingerprintModification;
    /** Indicates whether or not to block fingerprint unlock. */
    private Boolean _passcodeBlockFingerprintUnlock;
    /** Indicates whether or not to allow passcode modification on the supervised device (iOS 9.0 and later). */
    private Boolean _passcodeBlockModification;
    /** Indicates whether or not to block simple passcodes. */
    private Boolean _passcodeBlockSimple;
    /** Number of days before the passcode expires. Valid values 1 to 65535 */
    private Integer _passcodeExpirationDays;
    /** Number of character sets a passcode must contain. Valid values 0 to 4 */
    private Integer _passcodeMinimumCharacterSetCount;
    /** Minimum length of passcode. Valid values 4 to 14 */
    private Integer _passcodeMinimumLength;
    /** Minutes of inactivity before a passcode is required. */
    private Integer _passcodeMinutesOfInactivityBeforeLock;
    /** Minutes of inactivity before the screen times out. */
    private Integer _passcodeMinutesOfInactivityBeforeScreenTimeout;
    /** Number of previous passcodes to block. Valid values 1 to 24 */
    private Integer _passcodePreviousPasscodeBlockCount;
    /** Indicates whether or not to require a passcode. */
    private Boolean _passcodeRequired;
    /** Possible values of required passwords. */
    private RequiredPasswordType _passcodeRequiredType;
    /** Number of sign in failures allowed before wiping the device. Valid values 2 to 11 */
    private Integer _passcodeSignInFailureCountBeforeWipe;
    /** Indicates whether or not to block the user from using podcasts on the supervised device (iOS 8.0 and later). */
    private Boolean _podcastsBlocked;
    /** Indicates whether or not to block the user from using Auto fill in Safari. Requires a supervised device for iOS 13 and later. */
    private Boolean _safariBlockAutofill;
    /** Indicates whether or not to block the user from using Safari. Requires a supervised device for iOS 13 and later. */
    private Boolean _safariBlocked;
    /** Indicates whether or not to block JavaScript in Safari. */
    private Boolean _safariBlockJavaScript;
    /** Indicates whether or not to block popups in Safari. */
    private Boolean _safariBlockPopups;
    /** Web Browser Cookie Settings. */
    private WebBrowserCookieSettings _safariCookieSettings;
    /** URLs matching the patterns listed here will be considered managed. */
    private java.util.List<String> _safariManagedDomains;
    /** Users can save passwords in Safari only from URLs matching the patterns listed here. Applies to devices in supervised mode (iOS 9.3 and later). */
    private java.util.List<String> _safariPasswordAutoFillDomains;
    /** Indicates whether or not to require fraud warning in Safari. */
    private Boolean _safariRequireFraudWarning;
    /** Indicates whether or not to block the user from taking Screenshots. */
    private Boolean _screenCaptureBlocked;
    /** Indicates whether or not to block the user from using Siri. */
    private Boolean _siriBlocked;
    /** Indicates whether or not to block the user from using Siri when locked. */
    private Boolean _siriBlockedWhenLocked;
    /** Indicates whether or not to block Siri from querying user-generated content when used on a supervised device. */
    private Boolean _siriBlockUserGeneratedContent;
    /** Indicates whether or not to prevent Siri from dictating, or speaking profane language on supervised device. */
    private Boolean _siriRequireProfanityFilter;
    /** Indicates whether or not to block Spotlight search from returning internet results on supervised device. */
    private Boolean _spotlightBlockInternetResults;
    /** Indicates whether or not to block voice dialing. */
    private Boolean _voiceDialingBlocked;
    /** Indicates whether or not to allow wallpaper modification on supervised device (iOS 9.0 and later) . */
    private Boolean _wallpaperBlockModification;
    /** Indicates whether or not to force the device to use only Wi-Fi networks from configuration profiles when the device is in supervised mode. Available for devices running iOS and iPadOS versions 14.4 and earlier. Devices running 14.5+ should use the setting, 'WiFiConnectToAllowedNetworksOnlyForced. */
    private Boolean _wiFiConnectOnlyToConfiguredNetworks;
    /**
     * Instantiates a new IosGeneralDeviceConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosGeneralDeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosGeneralDeviceConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosGeneralDeviceConfiguration
     */
    @javax.annotation.Nonnull
    public static IosGeneralDeviceConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosGeneralDeviceConfiguration();
    }
    /**
     * Gets the accountBlockModification property value. Indicates whether or not to allow account modification when the device is in supervised mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAccountBlockModification() {
        return this._accountBlockModification;
    }
    /**
     * Gets the activationLockAllowWhenSupervised property value. Indicates whether or not to allow activation lock when the device is in the supervised mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getActivationLockAllowWhenSupervised() {
        return this._activationLockAllowWhenSupervised;
    }
    /**
     * Gets the airDropBlocked property value. Indicates whether or not to allow AirDrop when the device is in supervised mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAirDropBlocked() {
        return this._airDropBlocked;
    }
    /**
     * Gets the airDropForceUnmanagedDropTarget property value. Indicates whether or not to cause AirDrop to be considered an unmanaged drop target (iOS 9.0 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAirDropForceUnmanagedDropTarget() {
        return this._airDropForceUnmanagedDropTarget;
    }
    /**
     * Gets the airPlayForcePairingPasswordForOutgoingRequests property value. Indicates whether or not to enforce all devices receiving AirPlay requests from this device to use a pairing password.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAirPlayForcePairingPasswordForOutgoingRequests() {
        return this._airPlayForcePairingPasswordForOutgoingRequests;
    }
    /**
     * Gets the appleNewsBlocked property value. Indicates whether or not to block the user from using News when the device is in supervised mode (iOS 9.0 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppleNewsBlocked() {
        return this._appleNewsBlocked;
    }
    /**
     * Gets the appleWatchBlockPairing property value. Indicates whether or not to allow Apple Watch pairing when the device is in supervised mode (iOS 9.0 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppleWatchBlockPairing() {
        return this._appleWatchBlockPairing;
    }
    /**
     * Gets the appleWatchForceWristDetection property value. Indicates whether or not to force a paired Apple Watch to use Wrist Detection (iOS 8.2 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppleWatchForceWristDetection() {
        return this._appleWatchForceWristDetection;
    }
    /**
     * Gets the appsSingleAppModeList property value. Gets or sets the list of iOS apps allowed to autonomously enter Single App Mode. Supervised only. iOS 7.0 and later. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getAppsSingleAppModeList() {
        return this._appsSingleAppModeList;
    }
    /**
     * Gets the appStoreBlockAutomaticDownloads property value. Indicates whether or not to block the automatic downloading of apps purchased on other devices when the device is in supervised mode (iOS 9.0 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppStoreBlockAutomaticDownloads() {
        return this._appStoreBlockAutomaticDownloads;
    }
    /**
     * Gets the appStoreBlocked property value. Indicates whether or not to block the user from using the App Store. Requires a supervised device for iOS 13 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppStoreBlocked() {
        return this._appStoreBlocked;
    }
    /**
     * Gets the appStoreBlockInAppPurchases property value. Indicates whether or not to block the user from making in app purchases.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppStoreBlockInAppPurchases() {
        return this._appStoreBlockInAppPurchases;
    }
    /**
     * Gets the appStoreBlockUIAppInstallation property value. Indicates whether or not to block the App Store app, not restricting installation through Host apps. Applies to supervised mode only (iOS 9.0 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppStoreBlockUIAppInstallation() {
        return this._appStoreBlockUIAppInstallation;
    }
    /**
     * Gets the appStoreRequirePassword property value. Indicates whether or not to require a password when using the app store.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppStoreRequirePassword() {
        return this._appStoreRequirePassword;
    }
    /**
     * Gets the appsVisibilityList property value. List of apps in the visibility list (either visible/launchable apps list or hidden/unlaunchable apps list, controlled by AppsVisibilityListType) (iOS 9.3 and later). This collection can contain a maximum of 10000 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getAppsVisibilityList() {
        return this._appsVisibilityList;
    }
    /**
     * Gets the appsVisibilityListType property value. Possible values of the compliance app list.
     * @return a appListType
     */
    @javax.annotation.Nullable
    public AppListType getAppsVisibilityListType() {
        return this._appsVisibilityListType;
    }
    /**
     * Gets the bluetoothBlockModification property value. Indicates whether or not to allow modification of Bluetooth settings when the device is in supervised mode (iOS 10.0 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockModification() {
        return this._bluetoothBlockModification;
    }
    /**
     * Gets the cameraBlocked property value. Indicates whether or not to block the user from accessing the camera of the device. Requires a supervised device for iOS 13 and later.
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
     * Gets the cellularBlockGlobalBackgroundFetchWhileRoaming property value. Indicates whether or not to block global background fetch while roaming.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockGlobalBackgroundFetchWhileRoaming() {
        return this._cellularBlockGlobalBackgroundFetchWhileRoaming;
    }
    /**
     * Gets the cellularBlockPerAppDataModification property value. Indicates whether or not to allow changes to cellular app data usage settings when the device is in supervised mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockPerAppDataModification() {
        return this._cellularBlockPerAppDataModification;
    }
    /**
     * Gets the cellularBlockPersonalHotspot property value. Indicates whether or not to block Personal Hotspot.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockPersonalHotspot() {
        return this._cellularBlockPersonalHotspot;
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
     * Gets the certificatesBlockUntrustedTlsCertificates property value. Indicates whether or not to block untrusted TLS certificates.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCertificatesBlockUntrustedTlsCertificates() {
        return this._certificatesBlockUntrustedTlsCertificates;
    }
    /**
     * Gets the classroomAppBlockRemoteScreenObservation property value. Indicates whether or not to allow remote screen observation by Classroom app when the device is in supervised mode (iOS 9.3 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getClassroomAppBlockRemoteScreenObservation() {
        return this._classroomAppBlockRemoteScreenObservation;
    }
    /**
     * Gets the classroomAppForceUnpromptedScreenObservation property value. Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to view a student's screen without prompting when the device is in supervised mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getClassroomAppForceUnpromptedScreenObservation() {
        return this._classroomAppForceUnpromptedScreenObservation;
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
     * Gets the configurationProfileBlockChanges property value. Indicates whether or not to block the user from installing configuration profiles and certificates interactively when the device is in supervised mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConfigurationProfileBlockChanges() {
        return this._configurationProfileBlockChanges;
    }
    /**
     * Gets the definitionLookupBlocked property value. Indicates whether or not to block definition lookup when the device is in supervised mode (iOS 8.1.3 and later ).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefinitionLookupBlocked() {
        return this._definitionLookupBlocked;
    }
    /**
     * Gets the deviceBlockEnableRestrictions property value. Indicates whether or not to allow the user to enables restrictions in the device settings when the device is in supervised mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceBlockEnableRestrictions() {
        return this._deviceBlockEnableRestrictions;
    }
    /**
     * Gets the deviceBlockEraseContentAndSettings property value. Indicates whether or not to allow the use of the 'Erase all content and settings' option on the device when the device is in supervised mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceBlockEraseContentAndSettings() {
        return this._deviceBlockEraseContentAndSettings;
    }
    /**
     * Gets the deviceBlockNameModification property value. Indicates whether or not to allow device name modification when the device is in supervised mode (iOS 9.0 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceBlockNameModification() {
        return this._deviceBlockNameModification;
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
     * Gets the diagnosticDataBlockSubmissionModification property value. Indicates whether or not to allow diagnostics submission settings modification when the device is in supervised mode (iOS 9.3.2 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDiagnosticDataBlockSubmissionModification() {
        return this._diagnosticDataBlockSubmissionModification;
    }
    /**
     * Gets the documentsBlockManagedDocumentsInUnmanagedApps property value. Indicates whether or not to block the user from viewing managed documents in unmanaged apps.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDocumentsBlockManagedDocumentsInUnmanagedApps() {
        return this._documentsBlockManagedDocumentsInUnmanagedApps;
    }
    /**
     * Gets the documentsBlockUnmanagedDocumentsInManagedApps property value. Indicates whether or not to block the user from viewing unmanaged documents in managed apps.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDocumentsBlockUnmanagedDocumentsInManagedApps() {
        return this._documentsBlockUnmanagedDocumentsInManagedApps;
    }
    /**
     * Gets the emailInDomainSuffixes property value. An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEmailInDomainSuffixes() {
        return this._emailInDomainSuffixes;
    }
    /**
     * Gets the enterpriseAppBlockTrust property value. Indicates whether or not to block the user from trusting an enterprise app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnterpriseAppBlockTrust() {
        return this._enterpriseAppBlockTrust;
    }
    /**
     * Gets the enterpriseAppBlockTrustModification property value. [Deprecated] Configuring this setting and setting the value to 'true' has no effect on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnterpriseAppBlockTrustModification() {
        return this._enterpriseAppBlockTrustModification;
    }
    /**
     * Gets the faceTimeBlocked property value. Indicates whether or not to block the user from using FaceTime. Requires a supervised device for iOS 13 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFaceTimeBlocked() {
        return this._faceTimeBlocked;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosGeneralDeviceConfiguration currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountBlockModification", (n) -> { currentObject.setAccountBlockModification(n.getBooleanValue()); });
        deserializerMap.put("activationLockAllowWhenSupervised", (n) -> { currentObject.setActivationLockAllowWhenSupervised(n.getBooleanValue()); });
        deserializerMap.put("airDropBlocked", (n) -> { currentObject.setAirDropBlocked(n.getBooleanValue()); });
        deserializerMap.put("airDropForceUnmanagedDropTarget", (n) -> { currentObject.setAirDropForceUnmanagedDropTarget(n.getBooleanValue()); });
        deserializerMap.put("airPlayForcePairingPasswordForOutgoingRequests", (n) -> { currentObject.setAirPlayForcePairingPasswordForOutgoingRequests(n.getBooleanValue()); });
        deserializerMap.put("appleNewsBlocked", (n) -> { currentObject.setAppleNewsBlocked(n.getBooleanValue()); });
        deserializerMap.put("appleWatchBlockPairing", (n) -> { currentObject.setAppleWatchBlockPairing(n.getBooleanValue()); });
        deserializerMap.put("appleWatchForceWristDetection", (n) -> { currentObject.setAppleWatchForceWristDetection(n.getBooleanValue()); });
        deserializerMap.put("appsSingleAppModeList", (n) -> { currentObject.setAppsSingleAppModeList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("appStoreBlockAutomaticDownloads", (n) -> { currentObject.setAppStoreBlockAutomaticDownloads(n.getBooleanValue()); });
        deserializerMap.put("appStoreBlocked", (n) -> { currentObject.setAppStoreBlocked(n.getBooleanValue()); });
        deserializerMap.put("appStoreBlockInAppPurchases", (n) -> { currentObject.setAppStoreBlockInAppPurchases(n.getBooleanValue()); });
        deserializerMap.put("appStoreBlockUIAppInstallation", (n) -> { currentObject.setAppStoreBlockUIAppInstallation(n.getBooleanValue()); });
        deserializerMap.put("appStoreRequirePassword", (n) -> { currentObject.setAppStoreRequirePassword(n.getBooleanValue()); });
        deserializerMap.put("appsVisibilityList", (n) -> { currentObject.setAppsVisibilityList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("appsVisibilityListType", (n) -> { currentObject.setAppsVisibilityListType(n.getEnumValue(AppListType.class)); });
        deserializerMap.put("bluetoothBlockModification", (n) -> { currentObject.setBluetoothBlockModification(n.getBooleanValue()); });
        deserializerMap.put("cameraBlocked", (n) -> { currentObject.setCameraBlocked(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockDataRoaming", (n) -> { currentObject.setCellularBlockDataRoaming(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockGlobalBackgroundFetchWhileRoaming", (n) -> { currentObject.setCellularBlockGlobalBackgroundFetchWhileRoaming(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockPerAppDataModification", (n) -> { currentObject.setCellularBlockPerAppDataModification(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockPersonalHotspot", (n) -> { currentObject.setCellularBlockPersonalHotspot(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockVoiceRoaming", (n) -> { currentObject.setCellularBlockVoiceRoaming(n.getBooleanValue()); });
        deserializerMap.put("certificatesBlockUntrustedTlsCertificates", (n) -> { currentObject.setCertificatesBlockUntrustedTlsCertificates(n.getBooleanValue()); });
        deserializerMap.put("classroomAppBlockRemoteScreenObservation", (n) -> { currentObject.setClassroomAppBlockRemoteScreenObservation(n.getBooleanValue()); });
        deserializerMap.put("classroomAppForceUnpromptedScreenObservation", (n) -> { currentObject.setClassroomAppForceUnpromptedScreenObservation(n.getBooleanValue()); });
        deserializerMap.put("compliantAppListType", (n) -> { currentObject.setCompliantAppListType(n.getEnumValue(AppListType.class)); });
        deserializerMap.put("compliantAppsList", (n) -> { currentObject.setCompliantAppsList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationProfileBlockChanges", (n) -> { currentObject.setConfigurationProfileBlockChanges(n.getBooleanValue()); });
        deserializerMap.put("definitionLookupBlocked", (n) -> { currentObject.setDefinitionLookupBlocked(n.getBooleanValue()); });
        deserializerMap.put("deviceBlockEnableRestrictions", (n) -> { currentObject.setDeviceBlockEnableRestrictions(n.getBooleanValue()); });
        deserializerMap.put("deviceBlockEraseContentAndSettings", (n) -> { currentObject.setDeviceBlockEraseContentAndSettings(n.getBooleanValue()); });
        deserializerMap.put("deviceBlockNameModification", (n) -> { currentObject.setDeviceBlockNameModification(n.getBooleanValue()); });
        deserializerMap.put("diagnosticDataBlockSubmission", (n) -> { currentObject.setDiagnosticDataBlockSubmission(n.getBooleanValue()); });
        deserializerMap.put("diagnosticDataBlockSubmissionModification", (n) -> { currentObject.setDiagnosticDataBlockSubmissionModification(n.getBooleanValue()); });
        deserializerMap.put("documentsBlockManagedDocumentsInUnmanagedApps", (n) -> { currentObject.setDocumentsBlockManagedDocumentsInUnmanagedApps(n.getBooleanValue()); });
        deserializerMap.put("documentsBlockUnmanagedDocumentsInManagedApps", (n) -> { currentObject.setDocumentsBlockUnmanagedDocumentsInManagedApps(n.getBooleanValue()); });
        deserializerMap.put("emailInDomainSuffixes", (n) -> { currentObject.setEmailInDomainSuffixes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("enterpriseAppBlockTrust", (n) -> { currentObject.setEnterpriseAppBlockTrust(n.getBooleanValue()); });
        deserializerMap.put("enterpriseAppBlockTrustModification", (n) -> { currentObject.setEnterpriseAppBlockTrustModification(n.getBooleanValue()); });
        deserializerMap.put("faceTimeBlocked", (n) -> { currentObject.setFaceTimeBlocked(n.getBooleanValue()); });
        deserializerMap.put("findMyFriendsBlocked", (n) -> { currentObject.setFindMyFriendsBlocked(n.getBooleanValue()); });
        deserializerMap.put("gameCenterBlocked", (n) -> { currentObject.setGameCenterBlocked(n.getBooleanValue()); });
        deserializerMap.put("gamingBlockGameCenterFriends", (n) -> { currentObject.setGamingBlockGameCenterFriends(n.getBooleanValue()); });
        deserializerMap.put("gamingBlockMultiplayer", (n) -> { currentObject.setGamingBlockMultiplayer(n.getBooleanValue()); });
        deserializerMap.put("hostPairingBlocked", (n) -> { currentObject.setHostPairingBlocked(n.getBooleanValue()); });
        deserializerMap.put("iBooksStoreBlocked", (n) -> { currentObject.setIBooksStoreBlocked(n.getBooleanValue()); });
        deserializerMap.put("iBooksStoreBlockErotica", (n) -> { currentObject.setIBooksStoreBlockErotica(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockActivityContinuation", (n) -> { currentObject.setICloudBlockActivityContinuation(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockBackup", (n) -> { currentObject.setICloudBlockBackup(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockDocumentSync", (n) -> { currentObject.setICloudBlockDocumentSync(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockManagedAppsSync", (n) -> { currentObject.setICloudBlockManagedAppsSync(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockPhotoLibrary", (n) -> { currentObject.setICloudBlockPhotoLibrary(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockPhotoStreamSync", (n) -> { currentObject.setICloudBlockPhotoStreamSync(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockSharedPhotoStream", (n) -> { currentObject.setICloudBlockSharedPhotoStream(n.getBooleanValue()); });
        deserializerMap.put("iCloudRequireEncryptedBackup", (n) -> { currentObject.setICloudRequireEncryptedBackup(n.getBooleanValue()); });
        deserializerMap.put("iTunesBlockExplicitContent", (n) -> { currentObject.setITunesBlockExplicitContent(n.getBooleanValue()); });
        deserializerMap.put("iTunesBlockMusicService", (n) -> { currentObject.setITunesBlockMusicService(n.getBooleanValue()); });
        deserializerMap.put("iTunesBlockRadio", (n) -> { currentObject.setITunesBlockRadio(n.getBooleanValue()); });
        deserializerMap.put("keyboardBlockAutoCorrect", (n) -> { currentObject.setKeyboardBlockAutoCorrect(n.getBooleanValue()); });
        deserializerMap.put("keyboardBlockDictation", (n) -> { currentObject.setKeyboardBlockDictation(n.getBooleanValue()); });
        deserializerMap.put("keyboardBlockPredictive", (n) -> { currentObject.setKeyboardBlockPredictive(n.getBooleanValue()); });
        deserializerMap.put("keyboardBlockShortcuts", (n) -> { currentObject.setKeyboardBlockShortcuts(n.getBooleanValue()); });
        deserializerMap.put("keyboardBlockSpellCheck", (n) -> { currentObject.setKeyboardBlockSpellCheck(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowAssistiveSpeak", (n) -> { currentObject.setKioskModeAllowAssistiveSpeak(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowAssistiveTouchSettings", (n) -> { currentObject.setKioskModeAllowAssistiveTouchSettings(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowAutoLock", (n) -> { currentObject.setKioskModeAllowAutoLock(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowColorInversionSettings", (n) -> { currentObject.setKioskModeAllowColorInversionSettings(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowRingerSwitch", (n) -> { currentObject.setKioskModeAllowRingerSwitch(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowScreenRotation", (n) -> { currentObject.setKioskModeAllowScreenRotation(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowSleepButton", (n) -> { currentObject.setKioskModeAllowSleepButton(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowTouchscreen", (n) -> { currentObject.setKioskModeAllowTouchscreen(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowVoiceOverSettings", (n) -> { currentObject.setKioskModeAllowVoiceOverSettings(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowVolumeButtons", (n) -> { currentObject.setKioskModeAllowVolumeButtons(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowZoomSettings", (n) -> { currentObject.setKioskModeAllowZoomSettings(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAppStoreUrl", (n) -> { currentObject.setKioskModeAppStoreUrl(n.getStringValue()); });
        deserializerMap.put("kioskModeBuiltInAppId", (n) -> { currentObject.setKioskModeBuiltInAppId(n.getStringValue()); });
        deserializerMap.put("kioskModeManagedAppId", (n) -> { currentObject.setKioskModeManagedAppId(n.getStringValue()); });
        deserializerMap.put("kioskModeRequireAssistiveTouch", (n) -> { currentObject.setKioskModeRequireAssistiveTouch(n.getBooleanValue()); });
        deserializerMap.put("kioskModeRequireColorInversion", (n) -> { currentObject.setKioskModeRequireColorInversion(n.getBooleanValue()); });
        deserializerMap.put("kioskModeRequireMonoAudio", (n) -> { currentObject.setKioskModeRequireMonoAudio(n.getBooleanValue()); });
        deserializerMap.put("kioskModeRequireVoiceOver", (n) -> { currentObject.setKioskModeRequireVoiceOver(n.getBooleanValue()); });
        deserializerMap.put("kioskModeRequireZoom", (n) -> { currentObject.setKioskModeRequireZoom(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockControlCenter", (n) -> { currentObject.setLockScreenBlockControlCenter(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockNotificationView", (n) -> { currentObject.setLockScreenBlockNotificationView(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockPassbook", (n) -> { currentObject.setLockScreenBlockPassbook(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockTodayView", (n) -> { currentObject.setLockScreenBlockTodayView(n.getBooleanValue()); });
        deserializerMap.put("mediaContentRatingApps", (n) -> { currentObject.setMediaContentRatingApps(n.getEnumValue(RatingAppsType.class)); });
        deserializerMap.put("mediaContentRatingAustralia", (n) -> { currentObject.setMediaContentRatingAustralia(n.getObjectValue(MediaContentRatingAustralia::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingCanada", (n) -> { currentObject.setMediaContentRatingCanada(n.getObjectValue(MediaContentRatingCanada::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingFrance", (n) -> { currentObject.setMediaContentRatingFrance(n.getObjectValue(MediaContentRatingFrance::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingGermany", (n) -> { currentObject.setMediaContentRatingGermany(n.getObjectValue(MediaContentRatingGermany::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingIreland", (n) -> { currentObject.setMediaContentRatingIreland(n.getObjectValue(MediaContentRatingIreland::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingJapan", (n) -> { currentObject.setMediaContentRatingJapan(n.getObjectValue(MediaContentRatingJapan::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingNewZealand", (n) -> { currentObject.setMediaContentRatingNewZealand(n.getObjectValue(MediaContentRatingNewZealand::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingUnitedKingdom", (n) -> { currentObject.setMediaContentRatingUnitedKingdom(n.getObjectValue(MediaContentRatingUnitedKingdom::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingUnitedStates", (n) -> { currentObject.setMediaContentRatingUnitedStates(n.getObjectValue(MediaContentRatingUnitedStates::createFromDiscriminatorValue)); });
        deserializerMap.put("messagesBlocked", (n) -> { currentObject.setMessagesBlocked(n.getBooleanValue()); });
        deserializerMap.put("networkUsageRules", (n) -> { currentObject.setNetworkUsageRules(n.getCollectionOfObjectValues(IosNetworkUsageRule::createFromDiscriminatorValue)); });
        deserializerMap.put("notificationsBlockSettingsModification", (n) -> { currentObject.setNotificationsBlockSettingsModification(n.getBooleanValue()); });
        deserializerMap.put("passcodeBlockFingerprintModification", (n) -> { currentObject.setPasscodeBlockFingerprintModification(n.getBooleanValue()); });
        deserializerMap.put("passcodeBlockFingerprintUnlock", (n) -> { currentObject.setPasscodeBlockFingerprintUnlock(n.getBooleanValue()); });
        deserializerMap.put("passcodeBlockModification", (n) -> { currentObject.setPasscodeBlockModification(n.getBooleanValue()); });
        deserializerMap.put("passcodeBlockSimple", (n) -> { currentObject.setPasscodeBlockSimple(n.getBooleanValue()); });
        deserializerMap.put("passcodeExpirationDays", (n) -> { currentObject.setPasscodeExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passcodeMinimumCharacterSetCount", (n) -> { currentObject.setPasscodeMinimumCharacterSetCount(n.getIntegerValue()); });
        deserializerMap.put("passcodeMinimumLength", (n) -> { currentObject.setPasscodeMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passcodeMinutesOfInactivityBeforeLock", (n) -> { currentObject.setPasscodeMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
        deserializerMap.put("passcodeMinutesOfInactivityBeforeScreenTimeout", (n) -> { currentObject.setPasscodeMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("passcodePreviousPasscodeBlockCount", (n) -> { currentObject.setPasscodePreviousPasscodeBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passcodeRequired", (n) -> { currentObject.setPasscodeRequired(n.getBooleanValue()); });
        deserializerMap.put("passcodeRequiredType", (n) -> { currentObject.setPasscodeRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
        deserializerMap.put("passcodeSignInFailureCountBeforeWipe", (n) -> { currentObject.setPasscodeSignInFailureCountBeforeWipe(n.getIntegerValue()); });
        deserializerMap.put("podcastsBlocked", (n) -> { currentObject.setPodcastsBlocked(n.getBooleanValue()); });
        deserializerMap.put("safariBlockAutofill", (n) -> { currentObject.setSafariBlockAutofill(n.getBooleanValue()); });
        deserializerMap.put("safariBlocked", (n) -> { currentObject.setSafariBlocked(n.getBooleanValue()); });
        deserializerMap.put("safariBlockJavaScript", (n) -> { currentObject.setSafariBlockJavaScript(n.getBooleanValue()); });
        deserializerMap.put("safariBlockPopups", (n) -> { currentObject.setSafariBlockPopups(n.getBooleanValue()); });
        deserializerMap.put("safariCookieSettings", (n) -> { currentObject.setSafariCookieSettings(n.getEnumValue(WebBrowserCookieSettings.class)); });
        deserializerMap.put("safariManagedDomains", (n) -> { currentObject.setSafariManagedDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("safariPasswordAutoFillDomains", (n) -> { currentObject.setSafariPasswordAutoFillDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("safariRequireFraudWarning", (n) -> { currentObject.setSafariRequireFraudWarning(n.getBooleanValue()); });
        deserializerMap.put("screenCaptureBlocked", (n) -> { currentObject.setScreenCaptureBlocked(n.getBooleanValue()); });
        deserializerMap.put("siriBlocked", (n) -> { currentObject.setSiriBlocked(n.getBooleanValue()); });
        deserializerMap.put("siriBlockedWhenLocked", (n) -> { currentObject.setSiriBlockedWhenLocked(n.getBooleanValue()); });
        deserializerMap.put("siriBlockUserGeneratedContent", (n) -> { currentObject.setSiriBlockUserGeneratedContent(n.getBooleanValue()); });
        deserializerMap.put("siriRequireProfanityFilter", (n) -> { currentObject.setSiriRequireProfanityFilter(n.getBooleanValue()); });
        deserializerMap.put("spotlightBlockInternetResults", (n) -> { currentObject.setSpotlightBlockInternetResults(n.getBooleanValue()); });
        deserializerMap.put("voiceDialingBlocked", (n) -> { currentObject.setVoiceDialingBlocked(n.getBooleanValue()); });
        deserializerMap.put("wallpaperBlockModification", (n) -> { currentObject.setWallpaperBlockModification(n.getBooleanValue()); });
        deserializerMap.put("wiFiConnectOnlyToConfiguredNetworks", (n) -> { currentObject.setWiFiConnectOnlyToConfiguredNetworks(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the findMyFriendsBlocked property value. Indicates whether or not to block changes to Find My Friends when the device is in supervised mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFindMyFriendsBlocked() {
        return this._findMyFriendsBlocked;
    }
    /**
     * Gets the gameCenterBlocked property value. Indicates whether or not to block the user from using Game Center when the device is in supervised mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGameCenterBlocked() {
        return this._gameCenterBlocked;
    }
    /**
     * Gets the gamingBlockGameCenterFriends property value. Indicates whether or not to block the user from having friends in Game Center. Requires a supervised device for iOS 13 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGamingBlockGameCenterFriends() {
        return this._gamingBlockGameCenterFriends;
    }
    /**
     * Gets the gamingBlockMultiplayer property value. Indicates whether or not to block the user from using multiplayer gaming. Requires a supervised device for iOS 13 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGamingBlockMultiplayer() {
        return this._gamingBlockMultiplayer;
    }
    /**
     * Gets the hostPairingBlocked property value. indicates whether or not to allow host pairing to control the devices an iOS device can pair with when the iOS device is in supervised mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHostPairingBlocked() {
        return this._hostPairingBlocked;
    }
    /**
     * Gets the iBooksStoreBlocked property value. Indicates whether or not to block the user from using the iBooks Store when the device is in supervised mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIBooksStoreBlocked() {
        return this._iBooksStoreBlocked;
    }
    /**
     * Gets the iBooksStoreBlockErotica property value. Indicates whether or not to block the user from downloading media from the iBookstore that has been tagged as erotica.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIBooksStoreBlockErotica() {
        return this._iBooksStoreBlockErotica;
    }
    /**
     * Gets the iCloudBlockActivityContinuation property value. Indicates whether or not to block the user from continuing work they started on iOS device to another iOS or macOS device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudBlockActivityContinuation() {
        return this._iCloudBlockActivityContinuation;
    }
    /**
     * Gets the iCloudBlockBackup property value. Indicates whether or not to block iCloud backup. Requires a supervised device for iOS 13 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudBlockBackup() {
        return this._iCloudBlockBackup;
    }
    /**
     * Gets the iCloudBlockDocumentSync property value. Indicates whether or not to block iCloud document sync. Requires a supervised device for iOS 13 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudBlockDocumentSync() {
        return this._iCloudBlockDocumentSync;
    }
    /**
     * Gets the iCloudBlockManagedAppsSync property value. Indicates whether or not to block Managed Apps Cloud Sync.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudBlockManagedAppsSync() {
        return this._iCloudBlockManagedAppsSync;
    }
    /**
     * Gets the iCloudBlockPhotoLibrary property value. Indicates whether or not to block iCloud Photo Library.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudBlockPhotoLibrary() {
        return this._iCloudBlockPhotoLibrary;
    }
    /**
     * Gets the iCloudBlockPhotoStreamSync property value. Indicates whether or not to block iCloud Photo Stream Sync.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudBlockPhotoStreamSync() {
        return this._iCloudBlockPhotoStreamSync;
    }
    /**
     * Gets the iCloudBlockSharedPhotoStream property value. Indicates whether or not to block Shared Photo Stream.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudBlockSharedPhotoStream() {
        return this._iCloudBlockSharedPhotoStream;
    }
    /**
     * Gets the iCloudRequireEncryptedBackup property value. Indicates whether or not to require backups to iCloud be encrypted.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudRequireEncryptedBackup() {
        return this._iCloudRequireEncryptedBackup;
    }
    /**
     * Gets the iTunesBlockExplicitContent property value. Indicates whether or not to block the user from accessing explicit content in iTunes and the App Store. Requires a supervised device for iOS 13 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getITunesBlockExplicitContent() {
        return this._iTunesBlockExplicitContent;
    }
    /**
     * Gets the iTunesBlockMusicService property value. Indicates whether or not to block Music service and revert Music app to classic mode when the device is in supervised mode (iOS 9.3 and later and macOS 10.12 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getITunesBlockMusicService() {
        return this._iTunesBlockMusicService;
    }
    /**
     * Gets the iTunesBlockRadio property value. Indicates whether or not to block the user from using iTunes Radio when the device is in supervised mode (iOS 9.3 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getITunesBlockRadio() {
        return this._iTunesBlockRadio;
    }
    /**
     * Gets the keyboardBlockAutoCorrect property value. Indicates whether or not to block keyboard auto-correction when the device is in supervised mode (iOS 8.1.3 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKeyboardBlockAutoCorrect() {
        return this._keyboardBlockAutoCorrect;
    }
    /**
     * Gets the keyboardBlockDictation property value. Indicates whether or not to block the user from using dictation input when the device is in supervised mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKeyboardBlockDictation() {
        return this._keyboardBlockDictation;
    }
    /**
     * Gets the keyboardBlockPredictive property value. Indicates whether or not to block predictive keyboards when device is in supervised mode (iOS 8.1.3 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKeyboardBlockPredictive() {
        return this._keyboardBlockPredictive;
    }
    /**
     * Gets the keyboardBlockShortcuts property value. Indicates whether or not to block keyboard shortcuts when the device is in supervised mode (iOS 9.0 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKeyboardBlockShortcuts() {
        return this._keyboardBlockShortcuts;
    }
    /**
     * Gets the keyboardBlockSpellCheck property value. Indicates whether or not to block keyboard spell-checking when the device is in supervised mode (iOS 8.1.3 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKeyboardBlockSpellCheck() {
        return this._keyboardBlockSpellCheck;
    }
    /**
     * Gets the kioskModeAllowAssistiveSpeak property value. Indicates whether or not to allow assistive speak while in kiosk mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeAllowAssistiveSpeak() {
        return this._kioskModeAllowAssistiveSpeak;
    }
    /**
     * Gets the kioskModeAllowAssistiveTouchSettings property value. Indicates whether or not to allow access to the Assistive Touch Settings while in kiosk mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeAllowAssistiveTouchSettings() {
        return this._kioskModeAllowAssistiveTouchSettings;
    }
    /**
     * Gets the kioskModeAllowAutoLock property value. Indicates whether or not to allow device auto lock while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockAutoLock instead.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeAllowAutoLock() {
        return this._kioskModeAllowAutoLock;
    }
    /**
     * Gets the kioskModeAllowColorInversionSettings property value. Indicates whether or not to allow access to the Color Inversion Settings while in kiosk mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeAllowColorInversionSettings() {
        return this._kioskModeAllowColorInversionSettings;
    }
    /**
     * Gets the kioskModeAllowRingerSwitch property value. Indicates whether or not to allow use of the ringer switch while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockRingerSwitch instead.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeAllowRingerSwitch() {
        return this._kioskModeAllowRingerSwitch;
    }
    /**
     * Gets the kioskModeAllowScreenRotation property value. Indicates whether or not to allow screen rotation while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockScreenRotation instead.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeAllowScreenRotation() {
        return this._kioskModeAllowScreenRotation;
    }
    /**
     * Gets the kioskModeAllowSleepButton property value. Indicates whether or not to allow use of the sleep button while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockSleepButton instead.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeAllowSleepButton() {
        return this._kioskModeAllowSleepButton;
    }
    /**
     * Gets the kioskModeAllowTouchscreen property value. Indicates whether or not to allow use of the touchscreen while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockTouchscreen instead.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeAllowTouchscreen() {
        return this._kioskModeAllowTouchscreen;
    }
    /**
     * Gets the kioskModeAllowVoiceOverSettings property value. Indicates whether or not to allow access to the voice over settings while in kiosk mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeAllowVoiceOverSettings() {
        return this._kioskModeAllowVoiceOverSettings;
    }
    /**
     * Gets the kioskModeAllowVolumeButtons property value. Indicates whether or not to allow use of the volume buttons while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockVolumeButtons instead.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeAllowVolumeButtons() {
        return this._kioskModeAllowVolumeButtons;
    }
    /**
     * Gets the kioskModeAllowZoomSettings property value. Indicates whether or not to allow access to the zoom settings while in kiosk mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeAllowZoomSettings() {
        return this._kioskModeAllowZoomSettings;
    }
    /**
     * Gets the kioskModeAppStoreUrl property value. URL in the app store to the app to use for kiosk mode. Use if KioskModeManagedAppId is not known.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKioskModeAppStoreUrl() {
        return this._kioskModeAppStoreUrl;
    }
    /**
     * Gets the kioskModeBuiltInAppId property value. ID for built-in apps to use for kiosk mode. Used when KioskModeManagedAppId and KioskModeAppStoreUrl are not set.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKioskModeBuiltInAppId() {
        return this._kioskModeBuiltInAppId;
    }
    /**
     * Gets the kioskModeManagedAppId property value. Managed app id of the app to use for kiosk mode. If KioskModeManagedAppId is specified then KioskModeAppStoreUrl will be ignored.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKioskModeManagedAppId() {
        return this._kioskModeManagedAppId;
    }
    /**
     * Gets the kioskModeRequireAssistiveTouch property value. Indicates whether or not to require assistive touch while in kiosk mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeRequireAssistiveTouch() {
        return this._kioskModeRequireAssistiveTouch;
    }
    /**
     * Gets the kioskModeRequireColorInversion property value. Indicates whether or not to require color inversion while in kiosk mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeRequireColorInversion() {
        return this._kioskModeRequireColorInversion;
    }
    /**
     * Gets the kioskModeRequireMonoAudio property value. Indicates whether or not to require mono audio while in kiosk mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeRequireMonoAudio() {
        return this._kioskModeRequireMonoAudio;
    }
    /**
     * Gets the kioskModeRequireVoiceOver property value. Indicates whether or not to require voice over while in kiosk mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeRequireVoiceOver() {
        return this._kioskModeRequireVoiceOver;
    }
    /**
     * Gets the kioskModeRequireZoom property value. Indicates whether or not to require zoom while in kiosk mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeRequireZoom() {
        return this._kioskModeRequireZoom;
    }
    /**
     * Gets the lockScreenBlockControlCenter property value. Indicates whether or not to block the user from using control center on the lock screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenBlockControlCenter() {
        return this._lockScreenBlockControlCenter;
    }
    /**
     * Gets the lockScreenBlockNotificationView property value. Indicates whether or not to block the user from using the notification view on the lock screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenBlockNotificationView() {
        return this._lockScreenBlockNotificationView;
    }
    /**
     * Gets the lockScreenBlockPassbook property value. Indicates whether or not to block the user from using passbook when the device is locked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenBlockPassbook() {
        return this._lockScreenBlockPassbook;
    }
    /**
     * Gets the lockScreenBlockTodayView property value. Indicates whether or not to block the user from using the Today View on the lock screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenBlockTodayView() {
        return this._lockScreenBlockTodayView;
    }
    /**
     * Gets the mediaContentRatingApps property value. Apps rating as in media content
     * @return a ratingAppsType
     */
    @javax.annotation.Nullable
    public RatingAppsType getMediaContentRatingApps() {
        return this._mediaContentRatingApps;
    }
    /**
     * Gets the mediaContentRatingAustralia property value. Media content rating settings for Australia
     * @return a mediaContentRatingAustralia
     */
    @javax.annotation.Nullable
    public MediaContentRatingAustralia getMediaContentRatingAustralia() {
        return this._mediaContentRatingAustralia;
    }
    /**
     * Gets the mediaContentRatingCanada property value. Media content rating settings for Canada
     * @return a mediaContentRatingCanada
     */
    @javax.annotation.Nullable
    public MediaContentRatingCanada getMediaContentRatingCanada() {
        return this._mediaContentRatingCanada;
    }
    /**
     * Gets the mediaContentRatingFrance property value. Media content rating settings for France
     * @return a mediaContentRatingFrance
     */
    @javax.annotation.Nullable
    public MediaContentRatingFrance getMediaContentRatingFrance() {
        return this._mediaContentRatingFrance;
    }
    /**
     * Gets the mediaContentRatingGermany property value. Media content rating settings for Germany
     * @return a mediaContentRatingGermany
     */
    @javax.annotation.Nullable
    public MediaContentRatingGermany getMediaContentRatingGermany() {
        return this._mediaContentRatingGermany;
    }
    /**
     * Gets the mediaContentRatingIreland property value. Media content rating settings for Ireland
     * @return a mediaContentRatingIreland
     */
    @javax.annotation.Nullable
    public MediaContentRatingIreland getMediaContentRatingIreland() {
        return this._mediaContentRatingIreland;
    }
    /**
     * Gets the mediaContentRatingJapan property value. Media content rating settings for Japan
     * @return a mediaContentRatingJapan
     */
    @javax.annotation.Nullable
    public MediaContentRatingJapan getMediaContentRatingJapan() {
        return this._mediaContentRatingJapan;
    }
    /**
     * Gets the mediaContentRatingNewZealand property value. Media content rating settings for New Zealand
     * @return a mediaContentRatingNewZealand
     */
    @javax.annotation.Nullable
    public MediaContentRatingNewZealand getMediaContentRatingNewZealand() {
        return this._mediaContentRatingNewZealand;
    }
    /**
     * Gets the mediaContentRatingUnitedKingdom property value. Media content rating settings for United Kingdom
     * @return a mediaContentRatingUnitedKingdom
     */
    @javax.annotation.Nullable
    public MediaContentRatingUnitedKingdom getMediaContentRatingUnitedKingdom() {
        return this._mediaContentRatingUnitedKingdom;
    }
    /**
     * Gets the mediaContentRatingUnitedStates property value. Media content rating settings for United States
     * @return a mediaContentRatingUnitedStates
     */
    @javax.annotation.Nullable
    public MediaContentRatingUnitedStates getMediaContentRatingUnitedStates() {
        return this._mediaContentRatingUnitedStates;
    }
    /**
     * Gets the messagesBlocked property value. Indicates whether or not to block the user from using the Messages app on the supervised device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMessagesBlocked() {
        return this._messagesBlocked;
    }
    /**
     * Gets the networkUsageRules property value. List of managed apps and the network rules that applies to them. This collection can contain a maximum of 1000 elements.
     * @return a iosNetworkUsageRule
     */
    @javax.annotation.Nullable
    public java.util.List<IosNetworkUsageRule> getNetworkUsageRules() {
        return this._networkUsageRules;
    }
    /**
     * Gets the notificationsBlockSettingsModification property value. Indicates whether or not to allow notifications settings modification (iOS 9.3 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNotificationsBlockSettingsModification() {
        return this._notificationsBlockSettingsModification;
    }
    /**
     * Gets the passcodeBlockFingerprintModification property value. Block modification of registered Touch ID fingerprints when in supervised mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasscodeBlockFingerprintModification() {
        return this._passcodeBlockFingerprintModification;
    }
    /**
     * Gets the passcodeBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasscodeBlockFingerprintUnlock() {
        return this._passcodeBlockFingerprintUnlock;
    }
    /**
     * Gets the passcodeBlockModification property value. Indicates whether or not to allow passcode modification on the supervised device (iOS 9.0 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasscodeBlockModification() {
        return this._passcodeBlockModification;
    }
    /**
     * Gets the passcodeBlockSimple property value. Indicates whether or not to block simple passcodes.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasscodeBlockSimple() {
        return this._passcodeBlockSimple;
    }
    /**
     * Gets the passcodeExpirationDays property value. Number of days before the passcode expires. Valid values 1 to 65535
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasscodeExpirationDays() {
        return this._passcodeExpirationDays;
    }
    /**
     * Gets the passcodeMinimumCharacterSetCount property value. Number of character sets a passcode must contain. Valid values 0 to 4
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasscodeMinimumCharacterSetCount() {
        return this._passcodeMinimumCharacterSetCount;
    }
    /**
     * Gets the passcodeMinimumLength property value. Minimum length of passcode. Valid values 4 to 14
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasscodeMinimumLength() {
        return this._passcodeMinimumLength;
    }
    /**
     * Gets the passcodeMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a passcode is required.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasscodeMinutesOfInactivityBeforeLock() {
        return this._passcodeMinutesOfInactivityBeforeLock;
    }
    /**
     * Gets the passcodeMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasscodeMinutesOfInactivityBeforeScreenTimeout() {
        return this._passcodeMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the passcodePreviousPasscodeBlockCount property value. Number of previous passcodes to block. Valid values 1 to 24
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasscodePreviousPasscodeBlockCount() {
        return this._passcodePreviousPasscodeBlockCount;
    }
    /**
     * Gets the passcodeRequired property value. Indicates whether or not to require a passcode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasscodeRequired() {
        return this._passcodeRequired;
    }
    /**
     * Gets the passcodeRequiredType property value. Possible values of required passwords.
     * @return a requiredPasswordType
     */
    @javax.annotation.Nullable
    public RequiredPasswordType getPasscodeRequiredType() {
        return this._passcodeRequiredType;
    }
    /**
     * Gets the passcodeSignInFailureCountBeforeWipe property value. Number of sign in failures allowed before wiping the device. Valid values 2 to 11
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasscodeSignInFailureCountBeforeWipe() {
        return this._passcodeSignInFailureCountBeforeWipe;
    }
    /**
     * Gets the podcastsBlocked property value. Indicates whether or not to block the user from using podcasts on the supervised device (iOS 8.0 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPodcastsBlocked() {
        return this._podcastsBlocked;
    }
    /**
     * Gets the safariBlockAutofill property value. Indicates whether or not to block the user from using Auto fill in Safari. Requires a supervised device for iOS 13 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSafariBlockAutofill() {
        return this._safariBlockAutofill;
    }
    /**
     * Gets the safariBlocked property value. Indicates whether or not to block the user from using Safari. Requires a supervised device for iOS 13 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSafariBlocked() {
        return this._safariBlocked;
    }
    /**
     * Gets the safariBlockJavaScript property value. Indicates whether or not to block JavaScript in Safari.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSafariBlockJavaScript() {
        return this._safariBlockJavaScript;
    }
    /**
     * Gets the safariBlockPopups property value. Indicates whether or not to block popups in Safari.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSafariBlockPopups() {
        return this._safariBlockPopups;
    }
    /**
     * Gets the safariCookieSettings property value. Web Browser Cookie Settings.
     * @return a webBrowserCookieSettings
     */
    @javax.annotation.Nullable
    public WebBrowserCookieSettings getSafariCookieSettings() {
        return this._safariCookieSettings;
    }
    /**
     * Gets the safariManagedDomains property value. URLs matching the patterns listed here will be considered managed.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSafariManagedDomains() {
        return this._safariManagedDomains;
    }
    /**
     * Gets the safariPasswordAutoFillDomains property value. Users can save passwords in Safari only from URLs matching the patterns listed here. Applies to devices in supervised mode (iOS 9.3 and later).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSafariPasswordAutoFillDomains() {
        return this._safariPasswordAutoFillDomains;
    }
    /**
     * Gets the safariRequireFraudWarning property value. Indicates whether or not to require fraud warning in Safari.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSafariRequireFraudWarning() {
        return this._safariRequireFraudWarning;
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to block the user from taking Screenshots.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this._screenCaptureBlocked;
    }
    /**
     * Gets the siriBlocked property value. Indicates whether or not to block the user from using Siri.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSiriBlocked() {
        return this._siriBlocked;
    }
    /**
     * Gets the siriBlockedWhenLocked property value. Indicates whether or not to block the user from using Siri when locked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSiriBlockedWhenLocked() {
        return this._siriBlockedWhenLocked;
    }
    /**
     * Gets the siriBlockUserGeneratedContent property value. Indicates whether or not to block Siri from querying user-generated content when used on a supervised device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSiriBlockUserGeneratedContent() {
        return this._siriBlockUserGeneratedContent;
    }
    /**
     * Gets the siriRequireProfanityFilter property value. Indicates whether or not to prevent Siri from dictating, or speaking profane language on supervised device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSiriRequireProfanityFilter() {
        return this._siriRequireProfanityFilter;
    }
    /**
     * Gets the spotlightBlockInternetResults property value. Indicates whether or not to block Spotlight search from returning internet results on supervised device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSpotlightBlockInternetResults() {
        return this._spotlightBlockInternetResults;
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
     * Gets the wallpaperBlockModification property value. Indicates whether or not to allow wallpaper modification on supervised device (iOS 9.0 and later) .
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWallpaperBlockModification() {
        return this._wallpaperBlockModification;
    }
    /**
     * Gets the wiFiConnectOnlyToConfiguredNetworks property value. Indicates whether or not to force the device to use only Wi-Fi networks from configuration profiles when the device is in supervised mode. Available for devices running iOS and iPadOS versions 14.4 and earlier. Devices running 14.5+ should use the setting, 'WiFiConnectToAllowedNetworksOnlyForced.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWiFiConnectOnlyToConfiguredNetworks() {
        return this._wiFiConnectOnlyToConfiguredNetworks;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountBlockModification(@javax.annotation.Nullable final Boolean value) {
        this._accountBlockModification = value;
    }
    /**
     * Sets the activationLockAllowWhenSupervised property value. Indicates whether or not to allow activation lock when the device is in the supervised mode.
     * @param value Value to set for the activationLockAllowWhenSupervised property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivationLockAllowWhenSupervised(@javax.annotation.Nullable final Boolean value) {
        this._activationLockAllowWhenSupervised = value;
    }
    /**
     * Sets the airDropBlocked property value. Indicates whether or not to allow AirDrop when the device is in supervised mode.
     * @param value Value to set for the airDropBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAirDropBlocked(@javax.annotation.Nullable final Boolean value) {
        this._airDropBlocked = value;
    }
    /**
     * Sets the airDropForceUnmanagedDropTarget property value. Indicates whether or not to cause AirDrop to be considered an unmanaged drop target (iOS 9.0 and later).
     * @param value Value to set for the airDropForceUnmanagedDropTarget property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAirDropForceUnmanagedDropTarget(@javax.annotation.Nullable final Boolean value) {
        this._airDropForceUnmanagedDropTarget = value;
    }
    /**
     * Sets the airPlayForcePairingPasswordForOutgoingRequests property value. Indicates whether or not to enforce all devices receiving AirPlay requests from this device to use a pairing password.
     * @param value Value to set for the airPlayForcePairingPasswordForOutgoingRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAirPlayForcePairingPasswordForOutgoingRequests(@javax.annotation.Nullable final Boolean value) {
        this._airPlayForcePairingPasswordForOutgoingRequests = value;
    }
    /**
     * Sets the appleNewsBlocked property value. Indicates whether or not to block the user from using News when the device is in supervised mode (iOS 9.0 and later).
     * @param value Value to set for the appleNewsBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppleNewsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._appleNewsBlocked = value;
    }
    /**
     * Sets the appleWatchBlockPairing property value. Indicates whether or not to allow Apple Watch pairing when the device is in supervised mode (iOS 9.0 and later).
     * @param value Value to set for the appleWatchBlockPairing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppleWatchBlockPairing(@javax.annotation.Nullable final Boolean value) {
        this._appleWatchBlockPairing = value;
    }
    /**
     * Sets the appleWatchForceWristDetection property value. Indicates whether or not to force a paired Apple Watch to use Wrist Detection (iOS 8.2 and later).
     * @param value Value to set for the appleWatchForceWristDetection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppleWatchForceWristDetection(@javax.annotation.Nullable final Boolean value) {
        this._appleWatchForceWristDetection = value;
    }
    /**
     * Sets the appsSingleAppModeList property value. Gets or sets the list of iOS apps allowed to autonomously enter Single App Mode. Supervised only. iOS 7.0 and later. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the appsSingleAppModeList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsSingleAppModeList(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this._appsSingleAppModeList = value;
    }
    /**
     * Sets the appStoreBlockAutomaticDownloads property value. Indicates whether or not to block the automatic downloading of apps purchased on other devices when the device is in supervised mode (iOS 9.0 and later).
     * @param value Value to set for the appStoreBlockAutomaticDownloads property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppStoreBlockAutomaticDownloads(@javax.annotation.Nullable final Boolean value) {
        this._appStoreBlockAutomaticDownloads = value;
    }
    /**
     * Sets the appStoreBlocked property value. Indicates whether or not to block the user from using the App Store. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the appStoreBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppStoreBlocked(@javax.annotation.Nullable final Boolean value) {
        this._appStoreBlocked = value;
    }
    /**
     * Sets the appStoreBlockInAppPurchases property value. Indicates whether or not to block the user from making in app purchases.
     * @param value Value to set for the appStoreBlockInAppPurchases property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppStoreBlockInAppPurchases(@javax.annotation.Nullable final Boolean value) {
        this._appStoreBlockInAppPurchases = value;
    }
    /**
     * Sets the appStoreBlockUIAppInstallation property value. Indicates whether or not to block the App Store app, not restricting installation through Host apps. Applies to supervised mode only (iOS 9.0 and later).
     * @param value Value to set for the appStoreBlockUIAppInstallation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppStoreBlockUIAppInstallation(@javax.annotation.Nullable final Boolean value) {
        this._appStoreBlockUIAppInstallation = value;
    }
    /**
     * Sets the appStoreRequirePassword property value. Indicates whether or not to require a password when using the app store.
     * @param value Value to set for the appStoreRequirePassword property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppStoreRequirePassword(@javax.annotation.Nullable final Boolean value) {
        this._appStoreRequirePassword = value;
    }
    /**
     * Sets the appsVisibilityList property value. List of apps in the visibility list (either visible/launchable apps list or hidden/unlaunchable apps list, controlled by AppsVisibilityListType) (iOS 9.3 and later). This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the appsVisibilityList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsVisibilityList(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this._appsVisibilityList = value;
    }
    /**
     * Sets the appsVisibilityListType property value. Possible values of the compliance app list.
     * @param value Value to set for the appsVisibilityListType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsVisibilityListType(@javax.annotation.Nullable final AppListType value) {
        this._appsVisibilityListType = value;
    }
    /**
     * Sets the bluetoothBlockModification property value. Indicates whether or not to allow modification of Bluetooth settings when the device is in supervised mode (iOS 10.0 and later).
     * @param value Value to set for the bluetoothBlockModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlockModification(@javax.annotation.Nullable final Boolean value) {
        this._bluetoothBlockModification = value;
    }
    /**
     * Sets the cameraBlocked property value. Indicates whether or not to block the user from accessing the camera of the device. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the cameraBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCameraBlocked(@javax.annotation.Nullable final Boolean value) {
        this._cameraBlocked = value;
    }
    /**
     * Sets the cellularBlockDataRoaming property value. Indicates whether or not to block data roaming.
     * @param value Value to set for the cellularBlockDataRoaming property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockDataRoaming(@javax.annotation.Nullable final Boolean value) {
        this._cellularBlockDataRoaming = value;
    }
    /**
     * Sets the cellularBlockGlobalBackgroundFetchWhileRoaming property value. Indicates whether or not to block global background fetch while roaming.
     * @param value Value to set for the cellularBlockGlobalBackgroundFetchWhileRoaming property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockGlobalBackgroundFetchWhileRoaming(@javax.annotation.Nullable final Boolean value) {
        this._cellularBlockGlobalBackgroundFetchWhileRoaming = value;
    }
    /**
     * Sets the cellularBlockPerAppDataModification property value. Indicates whether or not to allow changes to cellular app data usage settings when the device is in supervised mode.
     * @param value Value to set for the cellularBlockPerAppDataModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockPerAppDataModification(@javax.annotation.Nullable final Boolean value) {
        this._cellularBlockPerAppDataModification = value;
    }
    /**
     * Sets the cellularBlockPersonalHotspot property value. Indicates whether or not to block Personal Hotspot.
     * @param value Value to set for the cellularBlockPersonalHotspot property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockPersonalHotspot(@javax.annotation.Nullable final Boolean value) {
        this._cellularBlockPersonalHotspot = value;
    }
    /**
     * Sets the cellularBlockVoiceRoaming property value. Indicates whether or not to block voice roaming.
     * @param value Value to set for the cellularBlockVoiceRoaming property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockVoiceRoaming(@javax.annotation.Nullable final Boolean value) {
        this._cellularBlockVoiceRoaming = value;
    }
    /**
     * Sets the certificatesBlockUntrustedTlsCertificates property value. Indicates whether or not to block untrusted TLS certificates.
     * @param value Value to set for the certificatesBlockUntrustedTlsCertificates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificatesBlockUntrustedTlsCertificates(@javax.annotation.Nullable final Boolean value) {
        this._certificatesBlockUntrustedTlsCertificates = value;
    }
    /**
     * Sets the classroomAppBlockRemoteScreenObservation property value. Indicates whether or not to allow remote screen observation by Classroom app when the device is in supervised mode (iOS 9.3 and later).
     * @param value Value to set for the classroomAppBlockRemoteScreenObservation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassroomAppBlockRemoteScreenObservation(@javax.annotation.Nullable final Boolean value) {
        this._classroomAppBlockRemoteScreenObservation = value;
    }
    /**
     * Sets the classroomAppForceUnpromptedScreenObservation property value. Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to view a student's screen without prompting when the device is in supervised mode.
     * @param value Value to set for the classroomAppForceUnpromptedScreenObservation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassroomAppForceUnpromptedScreenObservation(@javax.annotation.Nullable final Boolean value) {
        this._classroomAppForceUnpromptedScreenObservation = value;
    }
    /**
     * Sets the compliantAppListType property value. Possible values of the compliance app list.
     * @param value Value to set for the compliantAppListType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompliantAppListType(@javax.annotation.Nullable final AppListType value) {
        this._compliantAppListType = value;
    }
    /**
     * Sets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the compliantAppsList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompliantAppsList(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this._compliantAppsList = value;
    }
    /**
     * Sets the configurationProfileBlockChanges property value. Indicates whether or not to block the user from installing configuration profiles and certificates interactively when the device is in supervised mode.
     * @param value Value to set for the configurationProfileBlockChanges property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationProfileBlockChanges(@javax.annotation.Nullable final Boolean value) {
        this._configurationProfileBlockChanges = value;
    }
    /**
     * Sets the definitionLookupBlocked property value. Indicates whether or not to block definition lookup when the device is in supervised mode (iOS 8.1.3 and later ).
     * @param value Value to set for the definitionLookupBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefinitionLookupBlocked(@javax.annotation.Nullable final Boolean value) {
        this._definitionLookupBlocked = value;
    }
    /**
     * Sets the deviceBlockEnableRestrictions property value. Indicates whether or not to allow the user to enables restrictions in the device settings when the device is in supervised mode.
     * @param value Value to set for the deviceBlockEnableRestrictions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceBlockEnableRestrictions(@javax.annotation.Nullable final Boolean value) {
        this._deviceBlockEnableRestrictions = value;
    }
    /**
     * Sets the deviceBlockEraseContentAndSettings property value. Indicates whether or not to allow the use of the 'Erase all content and settings' option on the device when the device is in supervised mode.
     * @param value Value to set for the deviceBlockEraseContentAndSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceBlockEraseContentAndSettings(@javax.annotation.Nullable final Boolean value) {
        this._deviceBlockEraseContentAndSettings = value;
    }
    /**
     * Sets the deviceBlockNameModification property value. Indicates whether or not to allow device name modification when the device is in supervised mode (iOS 9.0 and later).
     * @param value Value to set for the deviceBlockNameModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceBlockNameModification(@javax.annotation.Nullable final Boolean value) {
        this._deviceBlockNameModification = value;
    }
    /**
     * Sets the diagnosticDataBlockSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @param value Value to set for the diagnosticDataBlockSubmission property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiagnosticDataBlockSubmission(@javax.annotation.Nullable final Boolean value) {
        this._diagnosticDataBlockSubmission = value;
    }
    /**
     * Sets the diagnosticDataBlockSubmissionModification property value. Indicates whether or not to allow diagnostics submission settings modification when the device is in supervised mode (iOS 9.3.2 and later).
     * @param value Value to set for the diagnosticDataBlockSubmissionModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiagnosticDataBlockSubmissionModification(@javax.annotation.Nullable final Boolean value) {
        this._diagnosticDataBlockSubmissionModification = value;
    }
    /**
     * Sets the documentsBlockManagedDocumentsInUnmanagedApps property value. Indicates whether or not to block the user from viewing managed documents in unmanaged apps.
     * @param value Value to set for the documentsBlockManagedDocumentsInUnmanagedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDocumentsBlockManagedDocumentsInUnmanagedApps(@javax.annotation.Nullable final Boolean value) {
        this._documentsBlockManagedDocumentsInUnmanagedApps = value;
    }
    /**
     * Sets the documentsBlockUnmanagedDocumentsInManagedApps property value. Indicates whether or not to block the user from viewing unmanaged documents in managed apps.
     * @param value Value to set for the documentsBlockUnmanagedDocumentsInManagedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDocumentsBlockUnmanagedDocumentsInManagedApps(@javax.annotation.Nullable final Boolean value) {
        this._documentsBlockUnmanagedDocumentsInManagedApps = value;
    }
    /**
     * Sets the emailInDomainSuffixes property value. An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
     * @param value Value to set for the emailInDomainSuffixes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailInDomainSuffixes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._emailInDomainSuffixes = value;
    }
    /**
     * Sets the enterpriseAppBlockTrust property value. Indicates whether or not to block the user from trusting an enterprise app.
     * @param value Value to set for the enterpriseAppBlockTrust property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseAppBlockTrust(@javax.annotation.Nullable final Boolean value) {
        this._enterpriseAppBlockTrust = value;
    }
    /**
     * Sets the enterpriseAppBlockTrustModification property value. [Deprecated] Configuring this setting and setting the value to 'true' has no effect on the device.
     * @param value Value to set for the enterpriseAppBlockTrustModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseAppBlockTrustModification(@javax.annotation.Nullable final Boolean value) {
        this._enterpriseAppBlockTrustModification = value;
    }
    /**
     * Sets the faceTimeBlocked property value. Indicates whether or not to block the user from using FaceTime. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the faceTimeBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFaceTimeBlocked(@javax.annotation.Nullable final Boolean value) {
        this._faceTimeBlocked = value;
    }
    /**
     * Sets the findMyFriendsBlocked property value. Indicates whether or not to block changes to Find My Friends when the device is in supervised mode.
     * @param value Value to set for the findMyFriendsBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFindMyFriendsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._findMyFriendsBlocked = value;
    }
    /**
     * Sets the gameCenterBlocked property value. Indicates whether or not to block the user from using Game Center when the device is in supervised mode.
     * @param value Value to set for the gameCenterBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGameCenterBlocked(@javax.annotation.Nullable final Boolean value) {
        this._gameCenterBlocked = value;
    }
    /**
     * Sets the gamingBlockGameCenterFriends property value. Indicates whether or not to block the user from having friends in Game Center. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the gamingBlockGameCenterFriends property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGamingBlockGameCenterFriends(@javax.annotation.Nullable final Boolean value) {
        this._gamingBlockGameCenterFriends = value;
    }
    /**
     * Sets the gamingBlockMultiplayer property value. Indicates whether or not to block the user from using multiplayer gaming. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the gamingBlockMultiplayer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGamingBlockMultiplayer(@javax.annotation.Nullable final Boolean value) {
        this._gamingBlockMultiplayer = value;
    }
    /**
     * Sets the hostPairingBlocked property value. indicates whether or not to allow host pairing to control the devices an iOS device can pair with when the iOS device is in supervised mode.
     * @param value Value to set for the hostPairingBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHostPairingBlocked(@javax.annotation.Nullable final Boolean value) {
        this._hostPairingBlocked = value;
    }
    /**
     * Sets the iBooksStoreBlocked property value. Indicates whether or not to block the user from using the iBooks Store when the device is in supervised mode.
     * @param value Value to set for the iBooksStoreBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIBooksStoreBlocked(@javax.annotation.Nullable final Boolean value) {
        this._iBooksStoreBlocked = value;
    }
    /**
     * Sets the iBooksStoreBlockErotica property value. Indicates whether or not to block the user from downloading media from the iBookstore that has been tagged as erotica.
     * @param value Value to set for the iBooksStoreBlockErotica property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIBooksStoreBlockErotica(@javax.annotation.Nullable final Boolean value) {
        this._iBooksStoreBlockErotica = value;
    }
    /**
     * Sets the iCloudBlockActivityContinuation property value. Indicates whether or not to block the user from continuing work they started on iOS device to another iOS or macOS device.
     * @param value Value to set for the iCloudBlockActivityContinuation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudBlockActivityContinuation(@javax.annotation.Nullable final Boolean value) {
        this._iCloudBlockActivityContinuation = value;
    }
    /**
     * Sets the iCloudBlockBackup property value. Indicates whether or not to block iCloud backup. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the iCloudBlockBackup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudBlockBackup(@javax.annotation.Nullable final Boolean value) {
        this._iCloudBlockBackup = value;
    }
    /**
     * Sets the iCloudBlockDocumentSync property value. Indicates whether or not to block iCloud document sync. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the iCloudBlockDocumentSync property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudBlockDocumentSync(@javax.annotation.Nullable final Boolean value) {
        this._iCloudBlockDocumentSync = value;
    }
    /**
     * Sets the iCloudBlockManagedAppsSync property value. Indicates whether or not to block Managed Apps Cloud Sync.
     * @param value Value to set for the iCloudBlockManagedAppsSync property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudBlockManagedAppsSync(@javax.annotation.Nullable final Boolean value) {
        this._iCloudBlockManagedAppsSync = value;
    }
    /**
     * Sets the iCloudBlockPhotoLibrary property value. Indicates whether or not to block iCloud Photo Library.
     * @param value Value to set for the iCloudBlockPhotoLibrary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudBlockPhotoLibrary(@javax.annotation.Nullable final Boolean value) {
        this._iCloudBlockPhotoLibrary = value;
    }
    /**
     * Sets the iCloudBlockPhotoStreamSync property value. Indicates whether or not to block iCloud Photo Stream Sync.
     * @param value Value to set for the iCloudBlockPhotoStreamSync property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudBlockPhotoStreamSync(@javax.annotation.Nullable final Boolean value) {
        this._iCloudBlockPhotoStreamSync = value;
    }
    /**
     * Sets the iCloudBlockSharedPhotoStream property value. Indicates whether or not to block Shared Photo Stream.
     * @param value Value to set for the iCloudBlockSharedPhotoStream property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudBlockSharedPhotoStream(@javax.annotation.Nullable final Boolean value) {
        this._iCloudBlockSharedPhotoStream = value;
    }
    /**
     * Sets the iCloudRequireEncryptedBackup property value. Indicates whether or not to require backups to iCloud be encrypted.
     * @param value Value to set for the iCloudRequireEncryptedBackup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudRequireEncryptedBackup(@javax.annotation.Nullable final Boolean value) {
        this._iCloudRequireEncryptedBackup = value;
    }
    /**
     * Sets the iTunesBlockExplicitContent property value. Indicates whether or not to block the user from accessing explicit content in iTunes and the App Store. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the iTunesBlockExplicitContent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setITunesBlockExplicitContent(@javax.annotation.Nullable final Boolean value) {
        this._iTunesBlockExplicitContent = value;
    }
    /**
     * Sets the iTunesBlockMusicService property value. Indicates whether or not to block Music service and revert Music app to classic mode when the device is in supervised mode (iOS 9.3 and later and macOS 10.12 and later).
     * @param value Value to set for the iTunesBlockMusicService property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setITunesBlockMusicService(@javax.annotation.Nullable final Boolean value) {
        this._iTunesBlockMusicService = value;
    }
    /**
     * Sets the iTunesBlockRadio property value. Indicates whether or not to block the user from using iTunes Radio when the device is in supervised mode (iOS 9.3 and later).
     * @param value Value to set for the iTunesBlockRadio property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setITunesBlockRadio(@javax.annotation.Nullable final Boolean value) {
        this._iTunesBlockRadio = value;
    }
    /**
     * Sets the keyboardBlockAutoCorrect property value. Indicates whether or not to block keyboard auto-correction when the device is in supervised mode (iOS 8.1.3 and later).
     * @param value Value to set for the keyboardBlockAutoCorrect property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeyboardBlockAutoCorrect(@javax.annotation.Nullable final Boolean value) {
        this._keyboardBlockAutoCorrect = value;
    }
    /**
     * Sets the keyboardBlockDictation property value. Indicates whether or not to block the user from using dictation input when the device is in supervised mode.
     * @param value Value to set for the keyboardBlockDictation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeyboardBlockDictation(@javax.annotation.Nullable final Boolean value) {
        this._keyboardBlockDictation = value;
    }
    /**
     * Sets the keyboardBlockPredictive property value. Indicates whether or not to block predictive keyboards when device is in supervised mode (iOS 8.1.3 and later).
     * @param value Value to set for the keyboardBlockPredictive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeyboardBlockPredictive(@javax.annotation.Nullable final Boolean value) {
        this._keyboardBlockPredictive = value;
    }
    /**
     * Sets the keyboardBlockShortcuts property value. Indicates whether or not to block keyboard shortcuts when the device is in supervised mode (iOS 9.0 and later).
     * @param value Value to set for the keyboardBlockShortcuts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeyboardBlockShortcuts(@javax.annotation.Nullable final Boolean value) {
        this._keyboardBlockShortcuts = value;
    }
    /**
     * Sets the keyboardBlockSpellCheck property value. Indicates whether or not to block keyboard spell-checking when the device is in supervised mode (iOS 8.1.3 and later).
     * @param value Value to set for the keyboardBlockSpellCheck property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeyboardBlockSpellCheck(@javax.annotation.Nullable final Boolean value) {
        this._keyboardBlockSpellCheck = value;
    }
    /**
     * Sets the kioskModeAllowAssistiveSpeak property value. Indicates whether or not to allow assistive speak while in kiosk mode.
     * @param value Value to set for the kioskModeAllowAssistiveSpeak property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeAllowAssistiveSpeak(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeAllowAssistiveSpeak = value;
    }
    /**
     * Sets the kioskModeAllowAssistiveTouchSettings property value. Indicates whether or not to allow access to the Assistive Touch Settings while in kiosk mode.
     * @param value Value to set for the kioskModeAllowAssistiveTouchSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeAllowAssistiveTouchSettings(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeAllowAssistiveTouchSettings = value;
    }
    /**
     * Sets the kioskModeAllowAutoLock property value. Indicates whether or not to allow device auto lock while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockAutoLock instead.
     * @param value Value to set for the kioskModeAllowAutoLock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeAllowAutoLock(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeAllowAutoLock = value;
    }
    /**
     * Sets the kioskModeAllowColorInversionSettings property value. Indicates whether or not to allow access to the Color Inversion Settings while in kiosk mode.
     * @param value Value to set for the kioskModeAllowColorInversionSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeAllowColorInversionSettings(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeAllowColorInversionSettings = value;
    }
    /**
     * Sets the kioskModeAllowRingerSwitch property value. Indicates whether or not to allow use of the ringer switch while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockRingerSwitch instead.
     * @param value Value to set for the kioskModeAllowRingerSwitch property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeAllowRingerSwitch(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeAllowRingerSwitch = value;
    }
    /**
     * Sets the kioskModeAllowScreenRotation property value. Indicates whether or not to allow screen rotation while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockScreenRotation instead.
     * @param value Value to set for the kioskModeAllowScreenRotation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeAllowScreenRotation(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeAllowScreenRotation = value;
    }
    /**
     * Sets the kioskModeAllowSleepButton property value. Indicates whether or not to allow use of the sleep button while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockSleepButton instead.
     * @param value Value to set for the kioskModeAllowSleepButton property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeAllowSleepButton(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeAllowSleepButton = value;
    }
    /**
     * Sets the kioskModeAllowTouchscreen property value. Indicates whether or not to allow use of the touchscreen while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockTouchscreen instead.
     * @param value Value to set for the kioskModeAllowTouchscreen property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeAllowTouchscreen(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeAllowTouchscreen = value;
    }
    /**
     * Sets the kioskModeAllowVoiceOverSettings property value. Indicates whether or not to allow access to the voice over settings while in kiosk mode.
     * @param value Value to set for the kioskModeAllowVoiceOverSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeAllowVoiceOverSettings(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeAllowVoiceOverSettings = value;
    }
    /**
     * Sets the kioskModeAllowVolumeButtons property value. Indicates whether or not to allow use of the volume buttons while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockVolumeButtons instead.
     * @param value Value to set for the kioskModeAllowVolumeButtons property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeAllowVolumeButtons(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeAllowVolumeButtons = value;
    }
    /**
     * Sets the kioskModeAllowZoomSettings property value. Indicates whether or not to allow access to the zoom settings while in kiosk mode.
     * @param value Value to set for the kioskModeAllowZoomSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeAllowZoomSettings(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeAllowZoomSettings = value;
    }
    /**
     * Sets the kioskModeAppStoreUrl property value. URL in the app store to the app to use for kiosk mode. Use if KioskModeManagedAppId is not known.
     * @param value Value to set for the kioskModeAppStoreUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeAppStoreUrl(@javax.annotation.Nullable final String value) {
        this._kioskModeAppStoreUrl = value;
    }
    /**
     * Sets the kioskModeBuiltInAppId property value. ID for built-in apps to use for kiosk mode. Used when KioskModeManagedAppId and KioskModeAppStoreUrl are not set.
     * @param value Value to set for the kioskModeBuiltInAppId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeBuiltInAppId(@javax.annotation.Nullable final String value) {
        this._kioskModeBuiltInAppId = value;
    }
    /**
     * Sets the kioskModeManagedAppId property value. Managed app id of the app to use for kiosk mode. If KioskModeManagedAppId is specified then KioskModeAppStoreUrl will be ignored.
     * @param value Value to set for the kioskModeManagedAppId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedAppId(@javax.annotation.Nullable final String value) {
        this._kioskModeManagedAppId = value;
    }
    /**
     * Sets the kioskModeRequireAssistiveTouch property value. Indicates whether or not to require assistive touch while in kiosk mode.
     * @param value Value to set for the kioskModeRequireAssistiveTouch property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeRequireAssistiveTouch(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeRequireAssistiveTouch = value;
    }
    /**
     * Sets the kioskModeRequireColorInversion property value. Indicates whether or not to require color inversion while in kiosk mode.
     * @param value Value to set for the kioskModeRequireColorInversion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeRequireColorInversion(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeRequireColorInversion = value;
    }
    /**
     * Sets the kioskModeRequireMonoAudio property value. Indicates whether or not to require mono audio while in kiosk mode.
     * @param value Value to set for the kioskModeRequireMonoAudio property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeRequireMonoAudio(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeRequireMonoAudio = value;
    }
    /**
     * Sets the kioskModeRequireVoiceOver property value. Indicates whether or not to require voice over while in kiosk mode.
     * @param value Value to set for the kioskModeRequireVoiceOver property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeRequireVoiceOver(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeRequireVoiceOver = value;
    }
    /**
     * Sets the kioskModeRequireZoom property value. Indicates whether or not to require zoom while in kiosk mode.
     * @param value Value to set for the kioskModeRequireZoom property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeRequireZoom(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeRequireZoom = value;
    }
    /**
     * Sets the lockScreenBlockControlCenter property value. Indicates whether or not to block the user from using control center on the lock screen.
     * @param value Value to set for the lockScreenBlockControlCenter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenBlockControlCenter(@javax.annotation.Nullable final Boolean value) {
        this._lockScreenBlockControlCenter = value;
    }
    /**
     * Sets the lockScreenBlockNotificationView property value. Indicates whether or not to block the user from using the notification view on the lock screen.
     * @param value Value to set for the lockScreenBlockNotificationView property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenBlockNotificationView(@javax.annotation.Nullable final Boolean value) {
        this._lockScreenBlockNotificationView = value;
    }
    /**
     * Sets the lockScreenBlockPassbook property value. Indicates whether or not to block the user from using passbook when the device is locked.
     * @param value Value to set for the lockScreenBlockPassbook property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenBlockPassbook(@javax.annotation.Nullable final Boolean value) {
        this._lockScreenBlockPassbook = value;
    }
    /**
     * Sets the lockScreenBlockTodayView property value. Indicates whether or not to block the user from using the Today View on the lock screen.
     * @param value Value to set for the lockScreenBlockTodayView property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenBlockTodayView(@javax.annotation.Nullable final Boolean value) {
        this._lockScreenBlockTodayView = value;
    }
    /**
     * Sets the mediaContentRatingApps property value. Apps rating as in media content
     * @param value Value to set for the mediaContentRatingApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaContentRatingApps(@javax.annotation.Nullable final RatingAppsType value) {
        this._mediaContentRatingApps = value;
    }
    /**
     * Sets the mediaContentRatingAustralia property value. Media content rating settings for Australia
     * @param value Value to set for the mediaContentRatingAustralia property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaContentRatingAustralia(@javax.annotation.Nullable final MediaContentRatingAustralia value) {
        this._mediaContentRatingAustralia = value;
    }
    /**
     * Sets the mediaContentRatingCanada property value. Media content rating settings for Canada
     * @param value Value to set for the mediaContentRatingCanada property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaContentRatingCanada(@javax.annotation.Nullable final MediaContentRatingCanada value) {
        this._mediaContentRatingCanada = value;
    }
    /**
     * Sets the mediaContentRatingFrance property value. Media content rating settings for France
     * @param value Value to set for the mediaContentRatingFrance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaContentRatingFrance(@javax.annotation.Nullable final MediaContentRatingFrance value) {
        this._mediaContentRatingFrance = value;
    }
    /**
     * Sets the mediaContentRatingGermany property value. Media content rating settings for Germany
     * @param value Value to set for the mediaContentRatingGermany property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaContentRatingGermany(@javax.annotation.Nullable final MediaContentRatingGermany value) {
        this._mediaContentRatingGermany = value;
    }
    /**
     * Sets the mediaContentRatingIreland property value. Media content rating settings for Ireland
     * @param value Value to set for the mediaContentRatingIreland property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaContentRatingIreland(@javax.annotation.Nullable final MediaContentRatingIreland value) {
        this._mediaContentRatingIreland = value;
    }
    /**
     * Sets the mediaContentRatingJapan property value. Media content rating settings for Japan
     * @param value Value to set for the mediaContentRatingJapan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaContentRatingJapan(@javax.annotation.Nullable final MediaContentRatingJapan value) {
        this._mediaContentRatingJapan = value;
    }
    /**
     * Sets the mediaContentRatingNewZealand property value. Media content rating settings for New Zealand
     * @param value Value to set for the mediaContentRatingNewZealand property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaContentRatingNewZealand(@javax.annotation.Nullable final MediaContentRatingNewZealand value) {
        this._mediaContentRatingNewZealand = value;
    }
    /**
     * Sets the mediaContentRatingUnitedKingdom property value. Media content rating settings for United Kingdom
     * @param value Value to set for the mediaContentRatingUnitedKingdom property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaContentRatingUnitedKingdom(@javax.annotation.Nullable final MediaContentRatingUnitedKingdom value) {
        this._mediaContentRatingUnitedKingdom = value;
    }
    /**
     * Sets the mediaContentRatingUnitedStates property value. Media content rating settings for United States
     * @param value Value to set for the mediaContentRatingUnitedStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaContentRatingUnitedStates(@javax.annotation.Nullable final MediaContentRatingUnitedStates value) {
        this._mediaContentRatingUnitedStates = value;
    }
    /**
     * Sets the messagesBlocked property value. Indicates whether or not to block the user from using the Messages app on the supervised device.
     * @param value Value to set for the messagesBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessagesBlocked(@javax.annotation.Nullable final Boolean value) {
        this._messagesBlocked = value;
    }
    /**
     * Sets the networkUsageRules property value. List of managed apps and the network rules that applies to them. This collection can contain a maximum of 1000 elements.
     * @param value Value to set for the networkUsageRules property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkUsageRules(@javax.annotation.Nullable final java.util.List<IosNetworkUsageRule> value) {
        this._networkUsageRules = value;
    }
    /**
     * Sets the notificationsBlockSettingsModification property value. Indicates whether or not to allow notifications settings modification (iOS 9.3 and later).
     * @param value Value to set for the notificationsBlockSettingsModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationsBlockSettingsModification(@javax.annotation.Nullable final Boolean value) {
        this._notificationsBlockSettingsModification = value;
    }
    /**
     * Sets the passcodeBlockFingerprintModification property value. Block modification of registered Touch ID fingerprints when in supervised mode.
     * @param value Value to set for the passcodeBlockFingerprintModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscodeBlockFingerprintModification(@javax.annotation.Nullable final Boolean value) {
        this._passcodeBlockFingerprintModification = value;
    }
    /**
     * Sets the passcodeBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @param value Value to set for the passcodeBlockFingerprintUnlock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscodeBlockFingerprintUnlock(@javax.annotation.Nullable final Boolean value) {
        this._passcodeBlockFingerprintUnlock = value;
    }
    /**
     * Sets the passcodeBlockModification property value. Indicates whether or not to allow passcode modification on the supervised device (iOS 9.0 and later).
     * @param value Value to set for the passcodeBlockModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscodeBlockModification(@javax.annotation.Nullable final Boolean value) {
        this._passcodeBlockModification = value;
    }
    /**
     * Sets the passcodeBlockSimple property value. Indicates whether or not to block simple passcodes.
     * @param value Value to set for the passcodeBlockSimple property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscodeBlockSimple(@javax.annotation.Nullable final Boolean value) {
        this._passcodeBlockSimple = value;
    }
    /**
     * Sets the passcodeExpirationDays property value. Number of days before the passcode expires. Valid values 1 to 65535
     * @param value Value to set for the passcodeExpirationDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscodeExpirationDays(@javax.annotation.Nullable final Integer value) {
        this._passcodeExpirationDays = value;
    }
    /**
     * Sets the passcodeMinimumCharacterSetCount property value. Number of character sets a passcode must contain. Valid values 0 to 4
     * @param value Value to set for the passcodeMinimumCharacterSetCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscodeMinimumCharacterSetCount(@javax.annotation.Nullable final Integer value) {
        this._passcodeMinimumCharacterSetCount = value;
    }
    /**
     * Sets the passcodeMinimumLength property value. Minimum length of passcode. Valid values 4 to 14
     * @param value Value to set for the passcodeMinimumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscodeMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._passcodeMinimumLength = value;
    }
    /**
     * Sets the passcodeMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a passcode is required.
     * @param value Value to set for the passcodeMinutesOfInactivityBeforeLock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscodeMinutesOfInactivityBeforeLock(@javax.annotation.Nullable final Integer value) {
        this._passcodeMinutesOfInactivityBeforeLock = value;
    }
    /**
     * Sets the passcodeMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @param value Value to set for the passcodeMinutesOfInactivityBeforeScreenTimeout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscodeMinutesOfInactivityBeforeScreenTimeout(@javax.annotation.Nullable final Integer value) {
        this._passcodeMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passcodePreviousPasscodeBlockCount property value. Number of previous passcodes to block. Valid values 1 to 24
     * @param value Value to set for the passcodePreviousPasscodeBlockCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscodePreviousPasscodeBlockCount(@javax.annotation.Nullable final Integer value) {
        this._passcodePreviousPasscodeBlockCount = value;
    }
    /**
     * Sets the passcodeRequired property value. Indicates whether or not to require a passcode.
     * @param value Value to set for the passcodeRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscodeRequired(@javax.annotation.Nullable final Boolean value) {
        this._passcodeRequired = value;
    }
    /**
     * Sets the passcodeRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passcodeRequiredType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscodeRequiredType(@javax.annotation.Nullable final RequiredPasswordType value) {
        this._passcodeRequiredType = value;
    }
    /**
     * Sets the passcodeSignInFailureCountBeforeWipe property value. Number of sign in failures allowed before wiping the device. Valid values 2 to 11
     * @param value Value to set for the passcodeSignInFailureCountBeforeWipe property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscodeSignInFailureCountBeforeWipe(@javax.annotation.Nullable final Integer value) {
        this._passcodeSignInFailureCountBeforeWipe = value;
    }
    /**
     * Sets the podcastsBlocked property value. Indicates whether or not to block the user from using podcasts on the supervised device (iOS 8.0 and later).
     * @param value Value to set for the podcastsBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPodcastsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._podcastsBlocked = value;
    }
    /**
     * Sets the safariBlockAutofill property value. Indicates whether or not to block the user from using Auto fill in Safari. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the safariBlockAutofill property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSafariBlockAutofill(@javax.annotation.Nullable final Boolean value) {
        this._safariBlockAutofill = value;
    }
    /**
     * Sets the safariBlocked property value. Indicates whether or not to block the user from using Safari. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the safariBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSafariBlocked(@javax.annotation.Nullable final Boolean value) {
        this._safariBlocked = value;
    }
    /**
     * Sets the safariBlockJavaScript property value. Indicates whether or not to block JavaScript in Safari.
     * @param value Value to set for the safariBlockJavaScript property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSafariBlockJavaScript(@javax.annotation.Nullable final Boolean value) {
        this._safariBlockJavaScript = value;
    }
    /**
     * Sets the safariBlockPopups property value. Indicates whether or not to block popups in Safari.
     * @param value Value to set for the safariBlockPopups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSafariBlockPopups(@javax.annotation.Nullable final Boolean value) {
        this._safariBlockPopups = value;
    }
    /**
     * Sets the safariCookieSettings property value. Web Browser Cookie Settings.
     * @param value Value to set for the safariCookieSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSafariCookieSettings(@javax.annotation.Nullable final WebBrowserCookieSettings value) {
        this._safariCookieSettings = value;
    }
    /**
     * Sets the safariManagedDomains property value. URLs matching the patterns listed here will be considered managed.
     * @param value Value to set for the safariManagedDomains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSafariManagedDomains(@javax.annotation.Nullable final java.util.List<String> value) {
        this._safariManagedDomains = value;
    }
    /**
     * Sets the safariPasswordAutoFillDomains property value. Users can save passwords in Safari only from URLs matching the patterns listed here. Applies to devices in supervised mode (iOS 9.3 and later).
     * @param value Value to set for the safariPasswordAutoFillDomains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSafariPasswordAutoFillDomains(@javax.annotation.Nullable final java.util.List<String> value) {
        this._safariPasswordAutoFillDomains = value;
    }
    /**
     * Sets the safariRequireFraudWarning property value. Indicates whether or not to require fraud warning in Safari.
     * @param value Value to set for the safariRequireFraudWarning property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSafariRequireFraudWarning(@javax.annotation.Nullable final Boolean value) {
        this._safariRequireFraudWarning = value;
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to block the user from taking Screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScreenCaptureBlocked(@javax.annotation.Nullable final Boolean value) {
        this._screenCaptureBlocked = value;
    }
    /**
     * Sets the siriBlocked property value. Indicates whether or not to block the user from using Siri.
     * @param value Value to set for the siriBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiriBlocked(@javax.annotation.Nullable final Boolean value) {
        this._siriBlocked = value;
    }
    /**
     * Sets the siriBlockedWhenLocked property value. Indicates whether or not to block the user from using Siri when locked.
     * @param value Value to set for the siriBlockedWhenLocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiriBlockedWhenLocked(@javax.annotation.Nullable final Boolean value) {
        this._siriBlockedWhenLocked = value;
    }
    /**
     * Sets the siriBlockUserGeneratedContent property value. Indicates whether or not to block Siri from querying user-generated content when used on a supervised device.
     * @param value Value to set for the siriBlockUserGeneratedContent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiriBlockUserGeneratedContent(@javax.annotation.Nullable final Boolean value) {
        this._siriBlockUserGeneratedContent = value;
    }
    /**
     * Sets the siriRequireProfanityFilter property value. Indicates whether or not to prevent Siri from dictating, or speaking profane language on supervised device.
     * @param value Value to set for the siriRequireProfanityFilter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiriRequireProfanityFilter(@javax.annotation.Nullable final Boolean value) {
        this._siriRequireProfanityFilter = value;
    }
    /**
     * Sets the spotlightBlockInternetResults property value. Indicates whether or not to block Spotlight search from returning internet results on supervised device.
     * @param value Value to set for the spotlightBlockInternetResults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSpotlightBlockInternetResults(@javax.annotation.Nullable final Boolean value) {
        this._spotlightBlockInternetResults = value;
    }
    /**
     * Sets the voiceDialingBlocked property value. Indicates whether or not to block voice dialing.
     * @param value Value to set for the voiceDialingBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVoiceDialingBlocked(@javax.annotation.Nullable final Boolean value) {
        this._voiceDialingBlocked = value;
    }
    /**
     * Sets the wallpaperBlockModification property value. Indicates whether or not to allow wallpaper modification on supervised device (iOS 9.0 and later) .
     * @param value Value to set for the wallpaperBlockModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWallpaperBlockModification(@javax.annotation.Nullable final Boolean value) {
        this._wallpaperBlockModification = value;
    }
    /**
     * Sets the wiFiConnectOnlyToConfiguredNetworks property value. Indicates whether or not to force the device to use only Wi-Fi networks from configuration profiles when the device is in supervised mode. Available for devices running iOS and iPadOS versions 14.4 and earlier. Devices running 14.5+ should use the setting, 'WiFiConnectToAllowedNetworksOnlyForced.
     * @param value Value to set for the wiFiConnectOnlyToConfiguredNetworks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWiFiConnectOnlyToConfiguredNetworks(@javax.annotation.Nullable final Boolean value) {
        this._wiFiConnectOnlyToConfiguredNetworks = value;
    }
}
