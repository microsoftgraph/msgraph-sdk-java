package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the windows10GeneralConfiguration resource.
 */
public class Windows10GeneralConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a Microsoft account.
     */
    private Boolean accountsBlockAddingNonMicrosoftAccountEmail;
    /**
     * Indicates whether or not to block the user from selecting an AntiTheft mode preference (Windows 10 Mobile only).
     */
    private Boolean antiTheftModeBlocked;
    /**
     * State Management Setting.
     */
    private StateManagementSetting appsAllowTrustedAppsSideloading;
    /**
     * Indicates whether or not to disable the launch of all apps from Windows Store that came pre-installed or were downloaded.
     */
    private Boolean appsBlockWindowsStoreOriginatedApps;
    /**
     * Specify a list of allowed Bluetooth services and profiles in hex formatted strings.
     */
    private java.util.List<String> bluetoothAllowedServices;
    /**
     * Whether or not to Block the user from using bluetooth advertising.
     */
    private Boolean bluetoothBlockAdvertising;
    /**
     * Whether or not to Block the user from using bluetooth discoverable mode.
     */
    private Boolean bluetoothBlockDiscoverableMode;
    /**
     * Whether or not to Block the user from using bluetooth.
     */
    private Boolean bluetoothBlocked;
    /**
     * Whether or not to block specific bundled Bluetooth peripherals to automatically pair with the host device.
     */
    private Boolean bluetoothBlockPrePairing;
    /**
     * Whether or not to Block the user from accessing the camera of the device.
     */
    private Boolean cameraBlocked;
    /**
     * Whether or not to Block the user from using data over cellular while roaming.
     */
    private Boolean cellularBlockDataWhenRoaming;
    /**
     * Whether or not to Block the user from using VPN over cellular.
     */
    private Boolean cellularBlockVpn;
    /**
     * Whether or not to Block the user from using VPN when roaming over cellular.
     */
    private Boolean cellularBlockVpnWhenRoaming;
    /**
     * Whether or not to Block the user from doing manual root certificate installation.
     */
    private Boolean certificatesBlockManualRootCertificateInstallation;
    /**
     * Whether or not to block Connected Devices Service which enables discovery and connection to other devices, remote messaging, remote app sessions and other cross-device experiences.
     */
    private Boolean connectedDevicesServiceBlocked;
    /**
     * Whether or not to Block the user from using copy paste.
     */
    private Boolean copyPasteBlocked;
    /**
     * Whether or not to Block the user from using Cortana.
     */
    private Boolean cortanaBlocked;
    /**
     * Whether or not to block end user access to Defender.
     */
    private Boolean defenderBlockEndUserAccess;
    /**
     * Possible values of Cloud Block Level
     */
    private DefenderCloudBlockLevelType defenderCloudBlockLevel;
    /**
     * Number of days before deleting quarantined malware. Valid values 0 to 90
     */
    private Integer defenderDaysBeforeDeletingQuarantinedMalware;
    /**
     * Gets or sets Defenders actions to take on detected Malware per threat level.
     */
    private DefenderDetectedMalwareActions defenderDetectedMalwareActions;
    /**
     * File extensions to exclude from scans and real time protection.
     */
    private java.util.List<String> defenderFileExtensionsToExclude;
    /**
     * Files and folder to exclude from scans and real time protection.
     */
    private java.util.List<String> defenderFilesAndFoldersToExclude;
    /**
     * Possible values for monitoring file activity.
     */
    private DefenderMonitorFileActivity defenderMonitorFileActivity;
    /**
     * Processes to exclude from scans and real time protection.
     */
    private java.util.List<String> defenderProcessesToExclude;
    /**
     * Possible values for prompting user for samples submission.
     */
    private DefenderPromptForSampleSubmission defenderPromptForSampleSubmission;
    /**
     * Indicates whether or not to require behavior monitoring.
     */
    private Boolean defenderRequireBehaviorMonitoring;
    /**
     * Indicates whether or not to require cloud protection.
     */
    private Boolean defenderRequireCloudProtection;
    /**
     * Indicates whether or not to require network inspection system.
     */
    private Boolean defenderRequireNetworkInspectionSystem;
    /**
     * Indicates whether or not to require real time monitoring.
     */
    private Boolean defenderRequireRealTimeMonitoring;
    /**
     * Indicates whether or not to scan archive files.
     */
    private Boolean defenderScanArchiveFiles;
    /**
     * Indicates whether or not to scan downloads.
     */
    private Boolean defenderScanDownloads;
    /**
     * Indicates whether or not to scan incoming mail messages.
     */
    private Boolean defenderScanIncomingMail;
    /**
     * Indicates whether or not to scan mapped network drives during full scan.
     */
    private Boolean defenderScanMappedNetworkDrivesDuringFullScan;
    /**
     * Max CPU usage percentage during scan. Valid values 0 to 100
     */
    private Integer defenderScanMaxCpu;
    /**
     * Indicates whether or not to scan files opened from a network folder.
     */
    private Boolean defenderScanNetworkFiles;
    /**
     * Indicates whether or not to scan removable drives during full scan.
     */
    private Boolean defenderScanRemovableDrivesDuringFullScan;
    /**
     * Indicates whether or not to scan scripts loaded in Internet Explorer browser.
     */
    private Boolean defenderScanScriptsLoadedInInternetExplorer;
    /**
     * Possible values for system scan type.
     */
    private DefenderScanType defenderScanType;
    /**
     * The time to perform a daily quick scan.
     */
    private LocalTime defenderScheduledQuickScanTime;
    /**
     * The defender time for the system scan.
     */
    private LocalTime defenderScheduledScanTime;
    /**
     * The signature update interval in hours. Specify 0 not to check. Valid values 0 to 24
     */
    private Integer defenderSignatureUpdateIntervalInHours;
    /**
     * Possible values for a weekly schedule.
     */
    private WeeklySchedule defenderSystemScanSchedule;
    /**
     * State Management Setting.
     */
    private StateManagementSetting developerUnlockSetting;
    /**
     * Indicates whether or not to Block the user from resetting their phone.
     */
    private Boolean deviceManagementBlockFactoryResetOnMobile;
    /**
     * Indicates whether or not to Block the user from doing manual un-enrollment from device management.
     */
    private Boolean deviceManagementBlockManualUnenroll;
    /**
     * Allow the device to send diagnostic and usage telemetry data, such as Watson.
     */
    private DiagnosticDataSubmissionMode diagnosticsDataSubmissionMode;
    /**
     * Allow users to change Start pages on Edge. Use the EdgeHomepageUrls to specify the Start pages that the user would see by default when they open Edge.
     */
    private Boolean edgeAllowStartPagesModification;
    /**
     * Indicates whether or not to prevent access to about flags on Edge browser.
     */
    private Boolean edgeBlockAccessToAboutFlags;
    /**
     * Block the address bar dropdown functionality in Microsoft Edge. Disable this settings to minimize network connections from Microsoft Edge to Microsoft services.
     */
    private Boolean edgeBlockAddressBarDropdown;
    /**
     * Indicates whether or not to block auto fill.
     */
    private Boolean edgeBlockAutofill;
    /**
     * Block Microsoft compatibility list in Microsoft Edge. This list from Microsoft helps Edge properly display sites with known compatibility issues.
     */
    private Boolean edgeBlockCompatibilityList;
    /**
     * Indicates whether or not to block developer tools in the Edge browser.
     */
    private Boolean edgeBlockDeveloperTools;
    /**
     * Indicates whether or not to Block the user from using the Edge browser.
     */
    private Boolean edgeBlocked;
    /**
     * Indicates whether or not to block extensions in the Edge browser.
     */
    private Boolean edgeBlockExtensions;
    /**
     * Indicates whether or not to block InPrivate browsing on corporate networks, in the Edge browser.
     */
    private Boolean edgeBlockInPrivateBrowsing;
    /**
     * Indicates whether or not to Block the user from using JavaScript.
     */
    private Boolean edgeBlockJavaScript;
    /**
     * Block the collection of information by Microsoft for live tile creation when users pin a site to Start from Microsoft Edge.
     */
    private Boolean edgeBlockLiveTileDataCollection;
    /**
     * Indicates whether or not to Block password manager.
     */
    private Boolean edgeBlockPasswordManager;
    /**
     * Indicates whether or not to block popups.
     */
    private Boolean edgeBlockPopups;
    /**
     * Indicates whether or not to block the user from using the search suggestions in the address bar.
     */
    private Boolean edgeBlockSearchSuggestions;
    /**
     * Indicates whether or not to Block the user from sending the do not track header.
     */
    private Boolean edgeBlockSendingDoNotTrackHeader;
    /**
     * Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. Note: the name of this property is misleading; the property is obsolete, use EdgeSendIntranetTrafficToInternetExplorer instead.
     */
    private Boolean edgeBlockSendingIntranetTrafficToInternetExplorer;
    /**
     * Clear browsing data on exiting Microsoft Edge.
     */
    private Boolean edgeClearBrowsingDataOnExit;
    /**
     * Possible values to specify which cookies are allowed in Microsoft Edge.
     */
    private EdgeCookiePolicy edgeCookiePolicy;
    /**
     * Block the Microsoft web page that opens on the first use of Microsoft Edge. This policy allows enterprises, like those enrolled in zero emissions configurations, to block this page.
     */
    private Boolean edgeDisableFirstRunPage;
    /**
     * Indicates the enterprise mode site list location. Could be a local file, local network or http location.
     */
    private String edgeEnterpriseModeSiteListLocation;
    /**
     * The first run URL for when Edge browser is opened for the first time.
     */
    private String edgeFirstRunUrl;
    /**
     * The list of URLs for homepages shodwn on MDM-enrolled devices on Edge browser.
     */
    private java.util.List<String> edgeHomepageUrls;
    /**
     * Indicates whether or not to Require the user to use the smart screen filter.
     */
    private Boolean edgeRequireSmartScreen;
    /**
     * Allows IT admins to set a default search engine for MDM-Controlled devices. Users can override this and change their default search engine provided the AllowSearchEngineCustomization policy is not set.
     */
    private EdgeSearchEngineBase edgeSearchEngine;
    /**
     * Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer.
     */
    private Boolean edgeSendIntranetTrafficToInternetExplorer;
    /**
     * Enable favorites sync between Internet Explorer and Microsoft Edge. Additions, deletions, modifications and order changes to favorites are shared between browsers.
     */
    private Boolean edgeSyncFavoritesWithInternetExplorer;
    /**
     * Endpoint for discovering cloud printers.
     */
    private String enterpriseCloudPrintDiscoveryEndPoint;
    /**
     * Maximum number of printers that should be queried from a discovery endpoint. This is a mobile only setting. Valid values 1 to 65535
     */
    private Integer enterpriseCloudPrintDiscoveryMaxLimit;
    /**
     * OAuth resource URI for printer discovery service as configured in Azure portal.
     */
    private String enterpriseCloudPrintMopriaDiscoveryResourceIdentifier;
    /**
     * Authentication endpoint for acquiring OAuth tokens.
     */
    private String enterpriseCloudPrintOAuthAuthority;
    /**
     * GUID of a client application authorized to retrieve OAuth tokens from the OAuth Authority.
     */
    private String enterpriseCloudPrintOAuthClientIdentifier;
    /**
     * OAuth resource URI for print service as configured in the Azure portal.
     */
    private String enterpriseCloudPrintResourceIdentifier;
    /**
     * Indicates whether or not to enable device discovery UX.
     */
    private Boolean experienceBlockDeviceDiscovery;
    /**
     * Indicates whether or not to allow the error dialog from displaying if no SIM card is detected.
     */
    private Boolean experienceBlockErrorDialogWhenNoSIM;
    /**
     * Indicates whether or not to enable task switching on the device.
     */
    private Boolean experienceBlockTaskSwitcher;
    /**
     * Indicates whether or not to block DVR and broadcasting.
     */
    private Boolean gameDvrBlocked;
    /**
     * Indicates whether or not to Block the user from using internet sharing.
     */
    private Boolean internetSharingBlocked;
    /**
     * Indicates whether or not to Block the user from location services.
     */
    private Boolean locationServicesBlocked;
    /**
     * Specify whether to show a user-configurable setting to control the screen timeout while on the lock screen of Windows 10 Mobile devices. If this policy is set to Allow, the value set by lockScreenTimeoutInSeconds is ignored.
     */
    private Boolean lockScreenAllowTimeoutConfiguration;
    /**
     * Indicates whether or not to block action center notifications over lock screen.
     */
    private Boolean lockScreenBlockActionCenterNotifications;
    /**
     * Indicates whether or not the user can interact with Cortana using speech while the system is locked.
     */
    private Boolean lockScreenBlockCortana;
    /**
     * Indicates whether to allow toast notifications above the device lock screen.
     */
    private Boolean lockScreenBlockToastNotifications;
    /**
     * Set the duration (in seconds) from the screen locking to the screen turning off for Windows 10 Mobile devices. Supported values are 11-1800. Valid values 11 to 1800
     */
    private Integer lockScreenTimeoutInSeconds;
    /**
     * Disables the ability to quickly switch between users that are logged on simultaneously without logging off.
     */
    private Boolean logonBlockFastUserSwitching;
    /**
     * Indicates whether or not to Block a Microsoft account.
     */
    private Boolean microsoftAccountBlocked;
    /**
     * Indicates whether or not to Block Microsoft account settings sync.
     */
    private Boolean microsoftAccountBlockSettingsSync;
    /**
     * If set, proxy settings will be applied to all processes and accounts in the device. Otherwise, it will be applied to the user account thats enrolled into MDM.
     */
    private Boolean networkProxyApplySettingsDeviceWide;
    /**
     * Address to the proxy auto-config (PAC) script you want to use.
     */
    private String networkProxyAutomaticConfigurationUrl;
    /**
     * Disable automatic detection of settings. If enabled, the system will try to find the path to a proxy auto-config (PAC) script.
     */
    private Boolean networkProxyDisableAutoDetect;
    /**
     * Specifies manual proxy server settings.
     */
    private Windows10NetworkProxyServer networkProxyServer;
    /**
     * Indicates whether or not to Block the user from using near field communication.
     */
    private Boolean nfcBlocked;
    /**
     * Gets or sets a value allowing IT admins to prevent apps and features from working with files on OneDrive.
     */
    private Boolean oneDriveDisableFileSync;
    /**
     * Specify whether PINs or passwords such as '1111' or '1234' are allowed. For Windows 10 desktops, it also controls the use of picture passwords.
     */
    private Boolean passwordBlockSimple;
    /**
     * The password expiration in days. Valid values 0 to 730
     */
    private Integer passwordExpirationDays;
    /**
     * The number of character sets required in the password.
     */
    private Integer passwordMinimumCharacterSetCount;
    /**
     * The minimum password length. Valid values 4 to 16
     */
    private Integer passwordMinimumLength;
    /**
     * The minutes of inactivity before the screen times out.
     */
    private Integer passwordMinutesOfInactivityBeforeScreenTimeout;
    /**
     * The number of previous passwords to prevent reuse of. Valid values 0 to 50
     */
    private Integer passwordPreviousPasswordBlockCount;
    /**
     * Indicates whether or not to require the user to have a password.
     */
    private Boolean passwordRequired;
    /**
     * Possible values of required passwords.
     */
    private RequiredPasswordType passwordRequiredType;
    /**
     * Indicates whether or not to require a password upon resuming from an idle state.
     */
    private Boolean passwordRequireWhenResumeFromIdleState;
    /**
     * The number of sign in failures before factory reset. Valid values 0 to 999
     */
    private Integer passwordSignInFailureCountBeforeFactoryReset;
    /**
     * A http or https Url to a jpg, jpeg or png image that needs to be downloaded and used as the Desktop Image or a file Url to a local image on the file system that needs to used as the Desktop Image.
     */
    private String personalizationDesktopImageUrl;
    /**
     * A http or https Url to a jpg, jpeg or png image that neeeds to be downloaded and used as the Lock Screen Image or a file Url to a local image on the file system that needs to be used as the Lock Screen Image.
     */
    private String personalizationLockScreenImageUrl;
    /**
     * State Management Setting.
     */
    private StateManagementSetting privacyAdvertisingId;
    /**
     * Indicates whether or not to allow the automatic acceptance of the pairing and privacy user consent dialog when launching apps.
     */
    private Boolean privacyAutoAcceptPairingAndConsentPrompts;
    /**
     * Indicates whether or not to block the usage of cloud based speech services for Cortana, Dictation, or Store applications.
     */
    private Boolean privacyBlockInputPersonalization;
    /**
     * Indicates whether or not to Block the user from reset protection mode.
     */
    private Boolean resetProtectionModeBlocked;
    /**
     * Specifies what level of safe search (filtering adult content) is required
     */
    private SafeSearchFilterType safeSearchFilter;
    /**
     * Indicates whether or not to Block the user from taking Screenshots.
     */
    private Boolean screenCaptureBlocked;
    /**
     * Specifies if search can use diacritics.
     */
    private Boolean searchBlockDiacritics;
    /**
     * Specifies whether to use automatic language detection when indexing content and properties.
     */
    private Boolean searchDisableAutoLanguageDetection;
    /**
     * Indicates whether or not to disable the search indexer backoff feature.
     */
    private Boolean searchDisableIndexerBackoff;
    /**
     * Indicates whether or not to block indexing of WIP-protected items to prevent them from appearing in search results for Cortana or Explorer.
     */
    private Boolean searchDisableIndexingEncryptedItems;
    /**
     * Indicates whether or not to allow users to add locations on removable drives to libraries and to be indexed.
     */
    private Boolean searchDisableIndexingRemovableDrive;
    /**
     * Specifies minimum amount of hard drive space on the same drive as the index location before indexing stops.
     */
    private Boolean searchEnableAutomaticIndexSizeManangement;
    /**
     * Indicates whether or not to block remote queries of this computers index.
     */
    private Boolean searchEnableRemoteQueries;
    /**
     * Indicates whether or not to block access to Accounts in Settings app.
     */
    private Boolean settingsBlockAccountsPage;
    /**
     * Indicates whether or not to block the user from installing provisioning packages.
     */
    private Boolean settingsBlockAddProvisioningPackage;
    /**
     * Indicates whether or not to block access to Apps in Settings app.
     */
    private Boolean settingsBlockAppsPage;
    /**
     * Indicates whether or not to block the user from changing the language settings.
     */
    private Boolean settingsBlockChangeLanguage;
    /**
     * Indicates whether or not to block the user from changing power and sleep settings.
     */
    private Boolean settingsBlockChangePowerSleep;
    /**
     * Indicates whether or not to block the user from changing the region settings.
     */
    private Boolean settingsBlockChangeRegion;
    /**
     * Indicates whether or not to block the user from changing date and time settings.
     */
    private Boolean settingsBlockChangeSystemTime;
    /**
     * Indicates whether or not to block access to Devices in Settings app.
     */
    private Boolean settingsBlockDevicesPage;
    /**
     * Indicates whether or not to block access to Ease of Access in Settings app.
     */
    private Boolean settingsBlockEaseOfAccessPage;
    /**
     * Indicates whether or not to block the user from editing the device name.
     */
    private Boolean settingsBlockEditDeviceName;
    /**
     * Indicates whether or not to block access to Gaming in Settings app.
     */
    private Boolean settingsBlockGamingPage;
    /**
     * Indicates whether or not to block access to Network & Internet in Settings app.
     */
    private Boolean settingsBlockNetworkInternetPage;
    /**
     * Indicates whether or not to block access to Personalization in Settings app.
     */
    private Boolean settingsBlockPersonalizationPage;
    /**
     * Indicates whether or not to block access to Privacy in Settings app.
     */
    private Boolean settingsBlockPrivacyPage;
    /**
     * Indicates whether or not to block the runtime configuration agent from removing provisioning packages.
     */
    private Boolean settingsBlockRemoveProvisioningPackage;
    /**
     * Indicates whether or not to block access to Settings app.
     */
    private Boolean settingsBlockSettingsApp;
    /**
     * Indicates whether or not to block access to System in Settings app.
     */
    private Boolean settingsBlockSystemPage;
    /**
     * Indicates whether or not to block access to Time & Language in Settings app.
     */
    private Boolean settingsBlockTimeLanguagePage;
    /**
     * Indicates whether or not to block access to Update & Security in Settings app.
     */
    private Boolean settingsBlockUpdateSecurityPage;
    /**
     * Indicates whether or not to block multiple users of the same app to share data.
     */
    private Boolean sharedUserAppDataAllowed;
    /**
     * Indicates whether or not users can override SmartScreen Filter warnings about potentially malicious websites.
     */
    private Boolean smartScreenBlockPromptOverride;
    /**
     * Indicates whether or not users can override the SmartScreen Filter warnings about downloading unverified files
     */
    private Boolean smartScreenBlockPromptOverrideForFiles;
    /**
     * This property will be deprecated in July 2019 and will be replaced by property SmartScreenAppInstallControl. Allows IT Admins to control whether users are allowed to install apps from places other than the Store.
     */
    private Boolean smartScreenEnableAppInstallControl;
    /**
     * Indicates whether or not to block the user from unpinning apps from taskbar.
     */
    private Boolean startBlockUnpinningAppsFromTaskbar;
    /**
     * Type of start menu app list visibility.
     */
    private WindowsStartMenuAppListVisibilityType startMenuAppListVisibility;
    /**
     * Enabling this policy hides the change account setting from appearing in the user tile in the start menu.
     */
    private Boolean startMenuHideChangeAccountSettings;
    /**
     * Enabling this policy hides the most used apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     */
    private Boolean startMenuHideFrequentlyUsedApps;
    /**
     * Enabling this policy hides hibernate from appearing in the power button in the start menu.
     */
    private Boolean startMenuHideHibernate;
    /**
     * Enabling this policy hides lock from appearing in the user tile in the start menu.
     */
    private Boolean startMenuHideLock;
    /**
     * Enabling this policy hides the power button from appearing in the start menu.
     */
    private Boolean startMenuHidePowerButton;
    /**
     * Enabling this policy hides recent jump lists from appearing on the start menu/taskbar and disables the corresponding toggle in the Settings app.
     */
    private Boolean startMenuHideRecentJumpLists;
    /**
     * Enabling this policy hides recently added apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     */
    private Boolean startMenuHideRecentlyAddedApps;
    /**
     * Enabling this policy hides 'Restart/Update and Restart' from appearing in the power button in the start menu.
     */
    private Boolean startMenuHideRestartOptions;
    /**
     * Enabling this policy hides shut down/update and shut down from appearing in the power button in the start menu.
     */
    private Boolean startMenuHideShutDown;
    /**
     * Enabling this policy hides sign out from appearing in the user tile in the start menu.
     */
    private Boolean startMenuHideSignOut;
    /**
     * Enabling this policy hides sleep from appearing in the power button in the start menu.
     */
    private Boolean startMenuHideSleep;
    /**
     * Enabling this policy hides switch account from appearing in the user tile in the start menu.
     */
    private Boolean startMenuHideSwitchAccount;
    /**
     * Enabling this policy hides the user tile from appearing in the start menu.
     */
    private Boolean startMenuHideUserTile;
    /**
     * This policy setting allows you to import Edge assets to be used with startMenuLayoutXml policy. Start layout can contain secondary tile from Edge app which looks for Edge local asset file. Edge local asset would not exist and cause Edge secondary tile to appear empty in this case. This policy only gets applied when startMenuLayoutXml policy is modified. The value should be a UTF-8 Base64 encoded byte array.
     */
    private byte[] startMenuLayoutEdgeAssetsXml;
    /**
     * Allows admins to override the default Start menu layout and prevents the user from changing it. The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in a UTF8 encoded byte array format.
     */
    private byte[] startMenuLayoutXml;
    /**
     * Type of display modes for the start menu.
     */
    private WindowsStartMenuModeType startMenuMode;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderDocuments;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderDownloads;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderFileExplorer;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderHomeGroup;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderMusic;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderNetwork;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderPersonalFolder;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderPictures;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderSettings;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderVideos;
    /**
     * Indicates whether or not to Block the user from using removable storage.
     */
    private Boolean storageBlockRemovableStorage;
    /**
     * Indicating whether or not to require encryption on a mobile device.
     */
    private Boolean storageRequireMobileDeviceEncryption;
    /**
     * Indicates whether application data is restricted to the system drive.
     */
    private Boolean storageRestrictAppDataToSystemVolume;
    /**
     * Indicates whether the installation of applications is restricted to the system drive.
     */
    private Boolean storageRestrictAppInstallToSystemVolume;
    /**
     * Whether the device is required to connect to the network.
     */
    private Boolean tenantLockdownRequireNetworkDuringOutOfBoxExperience;
    /**
     * Indicates whether or not to Block the user from USB connection.
     */
    private Boolean usbBlocked;
    /**
     * Indicates whether or not to Block the user from voice recording.
     */
    private Boolean voiceRecordingBlocked;
    /**
     * Indicates whether or not user's localhost IP address is displayed while making phone calls using the WebRTC
     */
    private Boolean webRtcBlockLocalhostIpAddress;
    /**
     * Indicating whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
     */
    private Boolean wiFiBlockAutomaticConnectHotspots;
    /**
     * Indicates whether or not to Block the user from using Wi-Fi.
     */
    private Boolean wiFiBlocked;
    /**
     * Indicates whether or not to Block the user from using Wi-Fi manual configuration.
     */
    private Boolean wiFiBlockManualConfiguration;
    /**
     * Specify how often devices scan for Wi-Fi networks. Supported values are 1-500, where 100 = default, and 500 = low frequency. Valid values 1 to 500
     */
    private Integer wiFiScanInterval;
    /**
     * Allows IT admins to block experiences that are typically for consumers only, such as Start suggestions, Membership notifications, Post-OOBE app install and redirect tiles.
     */
    private Boolean windowsSpotlightBlockConsumerSpecificFeatures;
    /**
     * Allows IT admins to turn off all Windows Spotlight features
     */
    private Boolean windowsSpotlightBlocked;
    /**
     * Block suggestions from Microsoft that show after each OS clean install, upgrade or in an on-going basis to introduce users to what is new or changed
     */
    private Boolean windowsSpotlightBlockOnActionCenter;
    /**
     * Block personalized content in Windows spotlight based on users device usage.
     */
    private Boolean windowsSpotlightBlockTailoredExperiences;
    /**
     * Block third party content delivered via Windows Spotlight
     */
    private Boolean windowsSpotlightBlockThirdPartyNotifications;
    /**
     * Block Windows Spotlight Windows welcome experience
     */
    private Boolean windowsSpotlightBlockWelcomeExperience;
    /**
     * Allows IT admins to turn off the popup of Windows Tips.
     */
    private Boolean windowsSpotlightBlockWindowsTips;
    /**
     * Allows IT admind to set a predefined default search engine for MDM-Controlled devices
     */
    private WindowsSpotlightEnablementSettings windowsSpotlightConfigureOnLockScreen;
    /**
     * Indicates whether or not to block automatic update of apps from Windows Store.
     */
    private Boolean windowsStoreBlockAutoUpdate;
    /**
     * Indicates whether or not to Block the user from using the Windows store.
     */
    private Boolean windowsStoreBlocked;
    /**
     * Indicates whether or not to enable Private Store Only.
     */
    private Boolean windowsStoreEnablePrivateStoreOnly;
    /**
     * Indicates whether or not to allow other devices from discovering this PC for projection.
     */
    private Boolean wirelessDisplayBlockProjectionToThisDevice;
    /**
     * Indicates whether or not to allow user input from wireless display receiver.
     */
    private Boolean wirelessDisplayBlockUserInputFromReceiver;
    /**
     * Indicates whether or not to require a PIN for new devices to initiate pairing.
     */
    private Boolean wirelessDisplayRequirePinForPairing;
    /**
     * Instantiates a new windows10GeneralConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Windows10GeneralConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10GeneralConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windows10GeneralConfiguration
     */
    @javax.annotation.Nonnull
    public static Windows10GeneralConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10GeneralConfiguration();
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
     * Gets the antiTheftModeBlocked property value. Indicates whether or not to block the user from selecting an AntiTheft mode preference (Windows 10 Mobile only).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAntiTheftModeBlocked() {
        return this.antiTheftModeBlocked;
    }
    /**
     * Gets the appsAllowTrustedAppsSideloading property value. State Management Setting.
     * @return a stateManagementSetting
     */
    @javax.annotation.Nullable
    public StateManagementSetting getAppsAllowTrustedAppsSideloading() {
        return this.appsAllowTrustedAppsSideloading;
    }
    /**
     * Gets the appsBlockWindowsStoreOriginatedApps property value. Indicates whether or not to disable the launch of all apps from Windows Store that came pre-installed or were downloaded.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppsBlockWindowsStoreOriginatedApps() {
        return this.appsBlockWindowsStoreOriginatedApps;
    }
    /**
     * Gets the bluetoothAllowedServices property value. Specify a list of allowed Bluetooth services and profiles in hex formatted strings.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getBluetoothAllowedServices() {
        return this.bluetoothAllowedServices;
    }
    /**
     * Gets the bluetoothBlockAdvertising property value. Whether or not to Block the user from using bluetooth advertising.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockAdvertising() {
        return this.bluetoothBlockAdvertising;
    }
    /**
     * Gets the bluetoothBlockDiscoverableMode property value. Whether or not to Block the user from using bluetooth discoverable mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockDiscoverableMode() {
        return this.bluetoothBlockDiscoverableMode;
    }
    /**
     * Gets the bluetoothBlocked property value. Whether or not to Block the user from using bluetooth.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlocked() {
        return this.bluetoothBlocked;
    }
    /**
     * Gets the bluetoothBlockPrePairing property value. Whether or not to block specific bundled Bluetooth peripherals to automatically pair with the host device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockPrePairing() {
        return this.bluetoothBlockPrePairing;
    }
    /**
     * Gets the cameraBlocked property value. Whether or not to Block the user from accessing the camera of the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this.cameraBlocked;
    }
    /**
     * Gets the cellularBlockDataWhenRoaming property value. Whether or not to Block the user from using data over cellular while roaming.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockDataWhenRoaming() {
        return this.cellularBlockDataWhenRoaming;
    }
    /**
     * Gets the cellularBlockVpn property value. Whether or not to Block the user from using VPN over cellular.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockVpn() {
        return this.cellularBlockVpn;
    }
    /**
     * Gets the cellularBlockVpnWhenRoaming property value. Whether or not to Block the user from using VPN when roaming over cellular.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockVpnWhenRoaming() {
        return this.cellularBlockVpnWhenRoaming;
    }
    /**
     * Gets the certificatesBlockManualRootCertificateInstallation property value. Whether or not to Block the user from doing manual root certificate installation.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCertificatesBlockManualRootCertificateInstallation() {
        return this.certificatesBlockManualRootCertificateInstallation;
    }
    /**
     * Gets the connectedDevicesServiceBlocked property value. Whether or not to block Connected Devices Service which enables discovery and connection to other devices, remote messaging, remote app sessions and other cross-device experiences.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConnectedDevicesServiceBlocked() {
        return this.connectedDevicesServiceBlocked;
    }
    /**
     * Gets the copyPasteBlocked property value. Whether or not to Block the user from using copy paste.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCopyPasteBlocked() {
        return this.copyPasteBlocked;
    }
    /**
     * Gets the cortanaBlocked property value. Whether or not to Block the user from using Cortana.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCortanaBlocked() {
        return this.cortanaBlocked;
    }
    /**
     * Gets the defenderBlockEndUserAccess property value. Whether or not to block end user access to Defender.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderBlockEndUserAccess() {
        return this.defenderBlockEndUserAccess;
    }
    /**
     * Gets the defenderCloudBlockLevel property value. Possible values of Cloud Block Level
     * @return a defenderCloudBlockLevelType
     */
    @javax.annotation.Nullable
    public DefenderCloudBlockLevelType getDefenderCloudBlockLevel() {
        return this.defenderCloudBlockLevel;
    }
    /**
     * Gets the defenderDaysBeforeDeletingQuarantinedMalware property value. Number of days before deleting quarantined malware. Valid values 0 to 90
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderDaysBeforeDeletingQuarantinedMalware() {
        return this.defenderDaysBeforeDeletingQuarantinedMalware;
    }
    /**
     * Gets the defenderDetectedMalwareActions property value. Gets or sets Defenders actions to take on detected Malware per threat level.
     * @return a defenderDetectedMalwareActions
     */
    @javax.annotation.Nullable
    public DefenderDetectedMalwareActions getDefenderDetectedMalwareActions() {
        return this.defenderDetectedMalwareActions;
    }
    /**
     * Gets the defenderFileExtensionsToExclude property value. File extensions to exclude from scans and real time protection.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderFileExtensionsToExclude() {
        return this.defenderFileExtensionsToExclude;
    }
    /**
     * Gets the defenderFilesAndFoldersToExclude property value. Files and folder to exclude from scans and real time protection.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderFilesAndFoldersToExclude() {
        return this.defenderFilesAndFoldersToExclude;
    }
    /**
     * Gets the defenderMonitorFileActivity property value. Possible values for monitoring file activity.
     * @return a defenderMonitorFileActivity
     */
    @javax.annotation.Nullable
    public DefenderMonitorFileActivity getDefenderMonitorFileActivity() {
        return this.defenderMonitorFileActivity;
    }
    /**
     * Gets the defenderProcessesToExclude property value. Processes to exclude from scans and real time protection.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderProcessesToExclude() {
        return this.defenderProcessesToExclude;
    }
    /**
     * Gets the defenderPromptForSampleSubmission property value. Possible values for prompting user for samples submission.
     * @return a defenderPromptForSampleSubmission
     */
    @javax.annotation.Nullable
    public DefenderPromptForSampleSubmission getDefenderPromptForSampleSubmission() {
        return this.defenderPromptForSampleSubmission;
    }
    /**
     * Gets the defenderRequireBehaviorMonitoring property value. Indicates whether or not to require behavior monitoring.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderRequireBehaviorMonitoring() {
        return this.defenderRequireBehaviorMonitoring;
    }
    /**
     * Gets the defenderRequireCloudProtection property value. Indicates whether or not to require cloud protection.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderRequireCloudProtection() {
        return this.defenderRequireCloudProtection;
    }
    /**
     * Gets the defenderRequireNetworkInspectionSystem property value. Indicates whether or not to require network inspection system.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderRequireNetworkInspectionSystem() {
        return this.defenderRequireNetworkInspectionSystem;
    }
    /**
     * Gets the defenderRequireRealTimeMonitoring property value. Indicates whether or not to require real time monitoring.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderRequireRealTimeMonitoring() {
        return this.defenderRequireRealTimeMonitoring;
    }
    /**
     * Gets the defenderScanArchiveFiles property value. Indicates whether or not to scan archive files.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanArchiveFiles() {
        return this.defenderScanArchiveFiles;
    }
    /**
     * Gets the defenderScanDownloads property value. Indicates whether or not to scan downloads.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanDownloads() {
        return this.defenderScanDownloads;
    }
    /**
     * Gets the defenderScanIncomingMail property value. Indicates whether or not to scan incoming mail messages.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanIncomingMail() {
        return this.defenderScanIncomingMail;
    }
    /**
     * Gets the defenderScanMappedNetworkDrivesDuringFullScan property value. Indicates whether or not to scan mapped network drives during full scan.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanMappedNetworkDrivesDuringFullScan() {
        return this.defenderScanMappedNetworkDrivesDuringFullScan;
    }
    /**
     * Gets the defenderScanMaxCpu property value. Max CPU usage percentage during scan. Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderScanMaxCpu() {
        return this.defenderScanMaxCpu;
    }
    /**
     * Gets the defenderScanNetworkFiles property value. Indicates whether or not to scan files opened from a network folder.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanNetworkFiles() {
        return this.defenderScanNetworkFiles;
    }
    /**
     * Gets the defenderScanRemovableDrivesDuringFullScan property value. Indicates whether or not to scan removable drives during full scan.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanRemovableDrivesDuringFullScan() {
        return this.defenderScanRemovableDrivesDuringFullScan;
    }
    /**
     * Gets the defenderScanScriptsLoadedInInternetExplorer property value. Indicates whether or not to scan scripts loaded in Internet Explorer browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanScriptsLoadedInInternetExplorer() {
        return this.defenderScanScriptsLoadedInInternetExplorer;
    }
    /**
     * Gets the defenderScanType property value. Possible values for system scan type.
     * @return a defenderScanType
     */
    @javax.annotation.Nullable
    public DefenderScanType getDefenderScanType() {
        return this.defenderScanType;
    }
    /**
     * Gets the defenderScheduledQuickScanTime property value. The time to perform a daily quick scan.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getDefenderScheduledQuickScanTime() {
        return this.defenderScheduledQuickScanTime;
    }
    /**
     * Gets the defenderScheduledScanTime property value. The defender time for the system scan.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getDefenderScheduledScanTime() {
        return this.defenderScheduledScanTime;
    }
    /**
     * Gets the defenderSignatureUpdateIntervalInHours property value. The signature update interval in hours. Specify 0 not to check. Valid values 0 to 24
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderSignatureUpdateIntervalInHours() {
        return this.defenderSignatureUpdateIntervalInHours;
    }
    /**
     * Gets the defenderSystemScanSchedule property value. Possible values for a weekly schedule.
     * @return a weeklySchedule
     */
    @javax.annotation.Nullable
    public WeeklySchedule getDefenderSystemScanSchedule() {
        return this.defenderSystemScanSchedule;
    }
    /**
     * Gets the developerUnlockSetting property value. State Management Setting.
     * @return a stateManagementSetting
     */
    @javax.annotation.Nullable
    public StateManagementSetting getDeveloperUnlockSetting() {
        return this.developerUnlockSetting;
    }
    /**
     * Gets the deviceManagementBlockFactoryResetOnMobile property value. Indicates whether or not to Block the user from resetting their phone.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceManagementBlockFactoryResetOnMobile() {
        return this.deviceManagementBlockFactoryResetOnMobile;
    }
    /**
     * Gets the deviceManagementBlockManualUnenroll property value. Indicates whether or not to Block the user from doing manual un-enrollment from device management.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceManagementBlockManualUnenroll() {
        return this.deviceManagementBlockManualUnenroll;
    }
    /**
     * Gets the diagnosticsDataSubmissionMode property value. Allow the device to send diagnostic and usage telemetry data, such as Watson.
     * @return a diagnosticDataSubmissionMode
     */
    @javax.annotation.Nullable
    public DiagnosticDataSubmissionMode getDiagnosticsDataSubmissionMode() {
        return this.diagnosticsDataSubmissionMode;
    }
    /**
     * Gets the edgeAllowStartPagesModification property value. Allow users to change Start pages on Edge. Use the EdgeHomepageUrls to specify the Start pages that the user would see by default when they open Edge.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeAllowStartPagesModification() {
        return this.edgeAllowStartPagesModification;
    }
    /**
     * Gets the edgeBlockAccessToAboutFlags property value. Indicates whether or not to prevent access to about flags on Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockAccessToAboutFlags() {
        return this.edgeBlockAccessToAboutFlags;
    }
    /**
     * Gets the edgeBlockAddressBarDropdown property value. Block the address bar dropdown functionality in Microsoft Edge. Disable this settings to minimize network connections from Microsoft Edge to Microsoft services.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockAddressBarDropdown() {
        return this.edgeBlockAddressBarDropdown;
    }
    /**
     * Gets the edgeBlockAutofill property value. Indicates whether or not to block auto fill.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockAutofill() {
        return this.edgeBlockAutofill;
    }
    /**
     * Gets the edgeBlockCompatibilityList property value. Block Microsoft compatibility list in Microsoft Edge. This list from Microsoft helps Edge properly display sites with known compatibility issues.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockCompatibilityList() {
        return this.edgeBlockCompatibilityList;
    }
    /**
     * Gets the edgeBlockDeveloperTools property value. Indicates whether or not to block developer tools in the Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockDeveloperTools() {
        return this.edgeBlockDeveloperTools;
    }
    /**
     * Gets the edgeBlocked property value. Indicates whether or not to Block the user from using the Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlocked() {
        return this.edgeBlocked;
    }
    /**
     * Gets the edgeBlockExtensions property value. Indicates whether or not to block extensions in the Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockExtensions() {
        return this.edgeBlockExtensions;
    }
    /**
     * Gets the edgeBlockInPrivateBrowsing property value. Indicates whether or not to block InPrivate browsing on corporate networks, in the Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockInPrivateBrowsing() {
        return this.edgeBlockInPrivateBrowsing;
    }
    /**
     * Gets the edgeBlockJavaScript property value. Indicates whether or not to Block the user from using JavaScript.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockJavaScript() {
        return this.edgeBlockJavaScript;
    }
    /**
     * Gets the edgeBlockLiveTileDataCollection property value. Block the collection of information by Microsoft for live tile creation when users pin a site to Start from Microsoft Edge.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockLiveTileDataCollection() {
        return this.edgeBlockLiveTileDataCollection;
    }
    /**
     * Gets the edgeBlockPasswordManager property value. Indicates whether or not to Block password manager.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockPasswordManager() {
        return this.edgeBlockPasswordManager;
    }
    /**
     * Gets the edgeBlockPopups property value. Indicates whether or not to block popups.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockPopups() {
        return this.edgeBlockPopups;
    }
    /**
     * Gets the edgeBlockSearchSuggestions property value. Indicates whether or not to block the user from using the search suggestions in the address bar.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockSearchSuggestions() {
        return this.edgeBlockSearchSuggestions;
    }
    /**
     * Gets the edgeBlockSendingDoNotTrackHeader property value. Indicates whether or not to Block the user from sending the do not track header.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockSendingDoNotTrackHeader() {
        return this.edgeBlockSendingDoNotTrackHeader;
    }
    /**
     * Gets the edgeBlockSendingIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. Note: the name of this property is misleading; the property is obsolete, use EdgeSendIntranetTrafficToInternetExplorer instead.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockSendingIntranetTrafficToInternetExplorer() {
        return this.edgeBlockSendingIntranetTrafficToInternetExplorer;
    }
    /**
     * Gets the edgeClearBrowsingDataOnExit property value. Clear browsing data on exiting Microsoft Edge.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeClearBrowsingDataOnExit() {
        return this.edgeClearBrowsingDataOnExit;
    }
    /**
     * Gets the edgeCookiePolicy property value. Possible values to specify which cookies are allowed in Microsoft Edge.
     * @return a edgeCookiePolicy
     */
    @javax.annotation.Nullable
    public EdgeCookiePolicy getEdgeCookiePolicy() {
        return this.edgeCookiePolicy;
    }
    /**
     * Gets the edgeDisableFirstRunPage property value. Block the Microsoft web page that opens on the first use of Microsoft Edge. This policy allows enterprises, like those enrolled in zero emissions configurations, to block this page.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeDisableFirstRunPage() {
        return this.edgeDisableFirstRunPage;
    }
    /**
     * Gets the edgeEnterpriseModeSiteListLocation property value. Indicates the enterprise mode site list location. Could be a local file, local network or http location.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEdgeEnterpriseModeSiteListLocation() {
        return this.edgeEnterpriseModeSiteListLocation;
    }
    /**
     * Gets the edgeFirstRunUrl property value. The first run URL for when Edge browser is opened for the first time.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEdgeFirstRunUrl() {
        return this.edgeFirstRunUrl;
    }
    /**
     * Gets the edgeHomepageUrls property value. The list of URLs for homepages shodwn on MDM-enrolled devices on Edge browser.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEdgeHomepageUrls() {
        return this.edgeHomepageUrls;
    }
    /**
     * Gets the edgeRequireSmartScreen property value. Indicates whether or not to Require the user to use the smart screen filter.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeRequireSmartScreen() {
        return this.edgeRequireSmartScreen;
    }
    /**
     * Gets the edgeSearchEngine property value. Allows IT admins to set a default search engine for MDM-Controlled devices. Users can override this and change their default search engine provided the AllowSearchEngineCustomization policy is not set.
     * @return a edgeSearchEngineBase
     */
    @javax.annotation.Nullable
    public EdgeSearchEngineBase getEdgeSearchEngine() {
        return this.edgeSearchEngine;
    }
    /**
     * Gets the edgeSendIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeSendIntranetTrafficToInternetExplorer() {
        return this.edgeSendIntranetTrafficToInternetExplorer;
    }
    /**
     * Gets the edgeSyncFavoritesWithInternetExplorer property value. Enable favorites sync between Internet Explorer and Microsoft Edge. Additions, deletions, modifications and order changes to favorites are shared between browsers.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeSyncFavoritesWithInternetExplorer() {
        return this.edgeSyncFavoritesWithInternetExplorer;
    }
    /**
     * Gets the enterpriseCloudPrintDiscoveryEndPoint property value. Endpoint for discovering cloud printers.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintDiscoveryEndPoint() {
        return this.enterpriseCloudPrintDiscoveryEndPoint;
    }
    /**
     * Gets the enterpriseCloudPrintDiscoveryMaxLimit property value. Maximum number of printers that should be queried from a discovery endpoint. This is a mobile only setting. Valid values 1 to 65535
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEnterpriseCloudPrintDiscoveryMaxLimit() {
        return this.enterpriseCloudPrintDiscoveryMaxLimit;
    }
    /**
     * Gets the enterpriseCloudPrintMopriaDiscoveryResourceIdentifier property value. OAuth resource URI for printer discovery service as configured in Azure portal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier() {
        return this.enterpriseCloudPrintMopriaDiscoveryResourceIdentifier;
    }
    /**
     * Gets the enterpriseCloudPrintOAuthAuthority property value. Authentication endpoint for acquiring OAuth tokens.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintOAuthAuthority() {
        return this.enterpriseCloudPrintOAuthAuthority;
    }
    /**
     * Gets the enterpriseCloudPrintOAuthClientIdentifier property value. GUID of a client application authorized to retrieve OAuth tokens from the OAuth Authority.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintOAuthClientIdentifier() {
        return this.enterpriseCloudPrintOAuthClientIdentifier;
    }
    /**
     * Gets the enterpriseCloudPrintResourceIdentifier property value. OAuth resource URI for print service as configured in the Azure portal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintResourceIdentifier() {
        return this.enterpriseCloudPrintResourceIdentifier;
    }
    /**
     * Gets the experienceBlockDeviceDiscovery property value. Indicates whether or not to enable device discovery UX.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExperienceBlockDeviceDiscovery() {
        return this.experienceBlockDeviceDiscovery;
    }
    /**
     * Gets the experienceBlockErrorDialogWhenNoSIM property value. Indicates whether or not to allow the error dialog from displaying if no SIM card is detected.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExperienceBlockErrorDialogWhenNoSIM() {
        return this.experienceBlockErrorDialogWhenNoSIM;
    }
    /**
     * Gets the experienceBlockTaskSwitcher property value. Indicates whether or not to enable task switching on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExperienceBlockTaskSwitcher() {
        return this.experienceBlockTaskSwitcher;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountsBlockAddingNonMicrosoftAccountEmail", (n) -> { this.setAccountsBlockAddingNonMicrosoftAccountEmail(n.getBooleanValue()); });
        deserializerMap.put("antiTheftModeBlocked", (n) -> { this.setAntiTheftModeBlocked(n.getBooleanValue()); });
        deserializerMap.put("appsAllowTrustedAppsSideloading", (n) -> { this.setAppsAllowTrustedAppsSideloading(n.getEnumValue(StateManagementSetting.class)); });
        deserializerMap.put("appsBlockWindowsStoreOriginatedApps", (n) -> { this.setAppsBlockWindowsStoreOriginatedApps(n.getBooleanValue()); });
        deserializerMap.put("bluetoothAllowedServices", (n) -> { this.setBluetoothAllowedServices(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("bluetoothBlockAdvertising", (n) -> { this.setBluetoothBlockAdvertising(n.getBooleanValue()); });
        deserializerMap.put("bluetoothBlockDiscoverableMode", (n) -> { this.setBluetoothBlockDiscoverableMode(n.getBooleanValue()); });
        deserializerMap.put("bluetoothBlocked", (n) -> { this.setBluetoothBlocked(n.getBooleanValue()); });
        deserializerMap.put("bluetoothBlockPrePairing", (n) -> { this.setBluetoothBlockPrePairing(n.getBooleanValue()); });
        deserializerMap.put("cameraBlocked", (n) -> { this.setCameraBlocked(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockDataWhenRoaming", (n) -> { this.setCellularBlockDataWhenRoaming(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockVpn", (n) -> { this.setCellularBlockVpn(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockVpnWhenRoaming", (n) -> { this.setCellularBlockVpnWhenRoaming(n.getBooleanValue()); });
        deserializerMap.put("certificatesBlockManualRootCertificateInstallation", (n) -> { this.setCertificatesBlockManualRootCertificateInstallation(n.getBooleanValue()); });
        deserializerMap.put("connectedDevicesServiceBlocked", (n) -> { this.setConnectedDevicesServiceBlocked(n.getBooleanValue()); });
        deserializerMap.put("copyPasteBlocked", (n) -> { this.setCopyPasteBlocked(n.getBooleanValue()); });
        deserializerMap.put("cortanaBlocked", (n) -> { this.setCortanaBlocked(n.getBooleanValue()); });
        deserializerMap.put("defenderBlockEndUserAccess", (n) -> { this.setDefenderBlockEndUserAccess(n.getBooleanValue()); });
        deserializerMap.put("defenderCloudBlockLevel", (n) -> { this.setDefenderCloudBlockLevel(n.getEnumValue(DefenderCloudBlockLevelType.class)); });
        deserializerMap.put("defenderDaysBeforeDeletingQuarantinedMalware", (n) -> { this.setDefenderDaysBeforeDeletingQuarantinedMalware(n.getIntegerValue()); });
        deserializerMap.put("defenderDetectedMalwareActions", (n) -> { this.setDefenderDetectedMalwareActions(n.getObjectValue(DefenderDetectedMalwareActions::createFromDiscriminatorValue)); });
        deserializerMap.put("defenderFileExtensionsToExclude", (n) -> { this.setDefenderFileExtensionsToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderFilesAndFoldersToExclude", (n) -> { this.setDefenderFilesAndFoldersToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderMonitorFileActivity", (n) -> { this.setDefenderMonitorFileActivity(n.getEnumValue(DefenderMonitorFileActivity.class)); });
        deserializerMap.put("defenderProcessesToExclude", (n) -> { this.setDefenderProcessesToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderPromptForSampleSubmission", (n) -> { this.setDefenderPromptForSampleSubmission(n.getEnumValue(DefenderPromptForSampleSubmission.class)); });
        deserializerMap.put("defenderRequireBehaviorMonitoring", (n) -> { this.setDefenderRequireBehaviorMonitoring(n.getBooleanValue()); });
        deserializerMap.put("defenderRequireCloudProtection", (n) -> { this.setDefenderRequireCloudProtection(n.getBooleanValue()); });
        deserializerMap.put("defenderRequireNetworkInspectionSystem", (n) -> { this.setDefenderRequireNetworkInspectionSystem(n.getBooleanValue()); });
        deserializerMap.put("defenderRequireRealTimeMonitoring", (n) -> { this.setDefenderRequireRealTimeMonitoring(n.getBooleanValue()); });
        deserializerMap.put("defenderScanArchiveFiles", (n) -> { this.setDefenderScanArchiveFiles(n.getBooleanValue()); });
        deserializerMap.put("defenderScanDownloads", (n) -> { this.setDefenderScanDownloads(n.getBooleanValue()); });
        deserializerMap.put("defenderScanIncomingMail", (n) -> { this.setDefenderScanIncomingMail(n.getBooleanValue()); });
        deserializerMap.put("defenderScanMappedNetworkDrivesDuringFullScan", (n) -> { this.setDefenderScanMappedNetworkDrivesDuringFullScan(n.getBooleanValue()); });
        deserializerMap.put("defenderScanMaxCpu", (n) -> { this.setDefenderScanMaxCpu(n.getIntegerValue()); });
        deserializerMap.put("defenderScanNetworkFiles", (n) -> { this.setDefenderScanNetworkFiles(n.getBooleanValue()); });
        deserializerMap.put("defenderScanRemovableDrivesDuringFullScan", (n) -> { this.setDefenderScanRemovableDrivesDuringFullScan(n.getBooleanValue()); });
        deserializerMap.put("defenderScanScriptsLoadedInInternetExplorer", (n) -> { this.setDefenderScanScriptsLoadedInInternetExplorer(n.getBooleanValue()); });
        deserializerMap.put("defenderScanType", (n) -> { this.setDefenderScanType(n.getEnumValue(DefenderScanType.class)); });
        deserializerMap.put("defenderScheduledQuickScanTime", (n) -> { this.setDefenderScheduledQuickScanTime(n.getLocalTimeValue()); });
        deserializerMap.put("defenderScheduledScanTime", (n) -> { this.setDefenderScheduledScanTime(n.getLocalTimeValue()); });
        deserializerMap.put("defenderSignatureUpdateIntervalInHours", (n) -> { this.setDefenderSignatureUpdateIntervalInHours(n.getIntegerValue()); });
        deserializerMap.put("defenderSystemScanSchedule", (n) -> { this.setDefenderSystemScanSchedule(n.getEnumValue(WeeklySchedule.class)); });
        deserializerMap.put("developerUnlockSetting", (n) -> { this.setDeveloperUnlockSetting(n.getEnumValue(StateManagementSetting.class)); });
        deserializerMap.put("deviceManagementBlockFactoryResetOnMobile", (n) -> { this.setDeviceManagementBlockFactoryResetOnMobile(n.getBooleanValue()); });
        deserializerMap.put("deviceManagementBlockManualUnenroll", (n) -> { this.setDeviceManagementBlockManualUnenroll(n.getBooleanValue()); });
        deserializerMap.put("diagnosticsDataSubmissionMode", (n) -> { this.setDiagnosticsDataSubmissionMode(n.getEnumValue(DiagnosticDataSubmissionMode.class)); });
        deserializerMap.put("edgeAllowStartPagesModification", (n) -> { this.setEdgeAllowStartPagesModification(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockAccessToAboutFlags", (n) -> { this.setEdgeBlockAccessToAboutFlags(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockAddressBarDropdown", (n) -> { this.setEdgeBlockAddressBarDropdown(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockAutofill", (n) -> { this.setEdgeBlockAutofill(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockCompatibilityList", (n) -> { this.setEdgeBlockCompatibilityList(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockDeveloperTools", (n) -> { this.setEdgeBlockDeveloperTools(n.getBooleanValue()); });
        deserializerMap.put("edgeBlocked", (n) -> { this.setEdgeBlocked(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockExtensions", (n) -> { this.setEdgeBlockExtensions(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockInPrivateBrowsing", (n) -> { this.setEdgeBlockInPrivateBrowsing(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockJavaScript", (n) -> { this.setEdgeBlockJavaScript(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockLiveTileDataCollection", (n) -> { this.setEdgeBlockLiveTileDataCollection(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockPasswordManager", (n) -> { this.setEdgeBlockPasswordManager(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockPopups", (n) -> { this.setEdgeBlockPopups(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockSearchSuggestions", (n) -> { this.setEdgeBlockSearchSuggestions(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockSendingDoNotTrackHeader", (n) -> { this.setEdgeBlockSendingDoNotTrackHeader(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockSendingIntranetTrafficToInternetExplorer", (n) -> { this.setEdgeBlockSendingIntranetTrafficToInternetExplorer(n.getBooleanValue()); });
        deserializerMap.put("edgeClearBrowsingDataOnExit", (n) -> { this.setEdgeClearBrowsingDataOnExit(n.getBooleanValue()); });
        deserializerMap.put("edgeCookiePolicy", (n) -> { this.setEdgeCookiePolicy(n.getEnumValue(EdgeCookiePolicy.class)); });
        deserializerMap.put("edgeDisableFirstRunPage", (n) -> { this.setEdgeDisableFirstRunPage(n.getBooleanValue()); });
        deserializerMap.put("edgeEnterpriseModeSiteListLocation", (n) -> { this.setEdgeEnterpriseModeSiteListLocation(n.getStringValue()); });
        deserializerMap.put("edgeFirstRunUrl", (n) -> { this.setEdgeFirstRunUrl(n.getStringValue()); });
        deserializerMap.put("edgeHomepageUrls", (n) -> { this.setEdgeHomepageUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("edgeRequireSmartScreen", (n) -> { this.setEdgeRequireSmartScreen(n.getBooleanValue()); });
        deserializerMap.put("edgeSearchEngine", (n) -> { this.setEdgeSearchEngine(n.getObjectValue(EdgeSearchEngineBase::createFromDiscriminatorValue)); });
        deserializerMap.put("edgeSendIntranetTrafficToInternetExplorer", (n) -> { this.setEdgeSendIntranetTrafficToInternetExplorer(n.getBooleanValue()); });
        deserializerMap.put("edgeSyncFavoritesWithInternetExplorer", (n) -> { this.setEdgeSyncFavoritesWithInternetExplorer(n.getBooleanValue()); });
        deserializerMap.put("enterpriseCloudPrintDiscoveryEndPoint", (n) -> { this.setEnterpriseCloudPrintDiscoveryEndPoint(n.getStringValue()); });
        deserializerMap.put("enterpriseCloudPrintDiscoveryMaxLimit", (n) -> { this.setEnterpriseCloudPrintDiscoveryMaxLimit(n.getIntegerValue()); });
        deserializerMap.put("enterpriseCloudPrintMopriaDiscoveryResourceIdentifier", (n) -> { this.setEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier(n.getStringValue()); });
        deserializerMap.put("enterpriseCloudPrintOAuthAuthority", (n) -> { this.setEnterpriseCloudPrintOAuthAuthority(n.getStringValue()); });
        deserializerMap.put("enterpriseCloudPrintOAuthClientIdentifier", (n) -> { this.setEnterpriseCloudPrintOAuthClientIdentifier(n.getStringValue()); });
        deserializerMap.put("enterpriseCloudPrintResourceIdentifier", (n) -> { this.setEnterpriseCloudPrintResourceIdentifier(n.getStringValue()); });
        deserializerMap.put("experienceBlockDeviceDiscovery", (n) -> { this.setExperienceBlockDeviceDiscovery(n.getBooleanValue()); });
        deserializerMap.put("experienceBlockErrorDialogWhenNoSIM", (n) -> { this.setExperienceBlockErrorDialogWhenNoSIM(n.getBooleanValue()); });
        deserializerMap.put("experienceBlockTaskSwitcher", (n) -> { this.setExperienceBlockTaskSwitcher(n.getBooleanValue()); });
        deserializerMap.put("gameDvrBlocked", (n) -> { this.setGameDvrBlocked(n.getBooleanValue()); });
        deserializerMap.put("internetSharingBlocked", (n) -> { this.setInternetSharingBlocked(n.getBooleanValue()); });
        deserializerMap.put("locationServicesBlocked", (n) -> { this.setLocationServicesBlocked(n.getBooleanValue()); });
        deserializerMap.put("lockScreenAllowTimeoutConfiguration", (n) -> { this.setLockScreenAllowTimeoutConfiguration(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockActionCenterNotifications", (n) -> { this.setLockScreenBlockActionCenterNotifications(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockCortana", (n) -> { this.setLockScreenBlockCortana(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockToastNotifications", (n) -> { this.setLockScreenBlockToastNotifications(n.getBooleanValue()); });
        deserializerMap.put("lockScreenTimeoutInSeconds", (n) -> { this.setLockScreenTimeoutInSeconds(n.getIntegerValue()); });
        deserializerMap.put("logonBlockFastUserSwitching", (n) -> { this.setLogonBlockFastUserSwitching(n.getBooleanValue()); });
        deserializerMap.put("microsoftAccountBlocked", (n) -> { this.setMicrosoftAccountBlocked(n.getBooleanValue()); });
        deserializerMap.put("microsoftAccountBlockSettingsSync", (n) -> { this.setMicrosoftAccountBlockSettingsSync(n.getBooleanValue()); });
        deserializerMap.put("networkProxyApplySettingsDeviceWide", (n) -> { this.setNetworkProxyApplySettingsDeviceWide(n.getBooleanValue()); });
        deserializerMap.put("networkProxyAutomaticConfigurationUrl", (n) -> { this.setNetworkProxyAutomaticConfigurationUrl(n.getStringValue()); });
        deserializerMap.put("networkProxyDisableAutoDetect", (n) -> { this.setNetworkProxyDisableAutoDetect(n.getBooleanValue()); });
        deserializerMap.put("networkProxyServer", (n) -> { this.setNetworkProxyServer(n.getObjectValue(Windows10NetworkProxyServer::createFromDiscriminatorValue)); });
        deserializerMap.put("nfcBlocked", (n) -> { this.setNfcBlocked(n.getBooleanValue()); });
        deserializerMap.put("oneDriveDisableFileSync", (n) -> { this.setOneDriveDisableFileSync(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockSimple", (n) -> { this.setPasswordBlockSimple(n.getBooleanValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { this.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumCharacterSetCount", (n) -> { this.setPasswordMinimumCharacterSetCount(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { this.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordBlockCount", (n) -> { this.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passwordRequired", (n) -> { this.setPasswordRequired(n.getBooleanValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
        deserializerMap.put("passwordRequireWhenResumeFromIdleState", (n) -> { this.setPasswordRequireWhenResumeFromIdleState(n.getBooleanValue()); });
        deserializerMap.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { this.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        deserializerMap.put("personalizationDesktopImageUrl", (n) -> { this.setPersonalizationDesktopImageUrl(n.getStringValue()); });
        deserializerMap.put("personalizationLockScreenImageUrl", (n) -> { this.setPersonalizationLockScreenImageUrl(n.getStringValue()); });
        deserializerMap.put("privacyAdvertisingId", (n) -> { this.setPrivacyAdvertisingId(n.getEnumValue(StateManagementSetting.class)); });
        deserializerMap.put("privacyAutoAcceptPairingAndConsentPrompts", (n) -> { this.setPrivacyAutoAcceptPairingAndConsentPrompts(n.getBooleanValue()); });
        deserializerMap.put("privacyBlockInputPersonalization", (n) -> { this.setPrivacyBlockInputPersonalization(n.getBooleanValue()); });
        deserializerMap.put("resetProtectionModeBlocked", (n) -> { this.setResetProtectionModeBlocked(n.getBooleanValue()); });
        deserializerMap.put("safeSearchFilter", (n) -> { this.setSafeSearchFilter(n.getEnumValue(SafeSearchFilterType.class)); });
        deserializerMap.put("screenCaptureBlocked", (n) -> { this.setScreenCaptureBlocked(n.getBooleanValue()); });
        deserializerMap.put("searchBlockDiacritics", (n) -> { this.setSearchBlockDiacritics(n.getBooleanValue()); });
        deserializerMap.put("searchDisableAutoLanguageDetection", (n) -> { this.setSearchDisableAutoLanguageDetection(n.getBooleanValue()); });
        deserializerMap.put("searchDisableIndexerBackoff", (n) -> { this.setSearchDisableIndexerBackoff(n.getBooleanValue()); });
        deserializerMap.put("searchDisableIndexingEncryptedItems", (n) -> { this.setSearchDisableIndexingEncryptedItems(n.getBooleanValue()); });
        deserializerMap.put("searchDisableIndexingRemovableDrive", (n) -> { this.setSearchDisableIndexingRemovableDrive(n.getBooleanValue()); });
        deserializerMap.put("searchEnableAutomaticIndexSizeManangement", (n) -> { this.setSearchEnableAutomaticIndexSizeManangement(n.getBooleanValue()); });
        deserializerMap.put("searchEnableRemoteQueries", (n) -> { this.setSearchEnableRemoteQueries(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockAccountsPage", (n) -> { this.setSettingsBlockAccountsPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockAddProvisioningPackage", (n) -> { this.setSettingsBlockAddProvisioningPackage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockAppsPage", (n) -> { this.setSettingsBlockAppsPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockChangeLanguage", (n) -> { this.setSettingsBlockChangeLanguage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockChangePowerSleep", (n) -> { this.setSettingsBlockChangePowerSleep(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockChangeRegion", (n) -> { this.setSettingsBlockChangeRegion(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockChangeSystemTime", (n) -> { this.setSettingsBlockChangeSystemTime(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockDevicesPage", (n) -> { this.setSettingsBlockDevicesPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockEaseOfAccessPage", (n) -> { this.setSettingsBlockEaseOfAccessPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockEditDeviceName", (n) -> { this.setSettingsBlockEditDeviceName(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockGamingPage", (n) -> { this.setSettingsBlockGamingPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockNetworkInternetPage", (n) -> { this.setSettingsBlockNetworkInternetPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockPersonalizationPage", (n) -> { this.setSettingsBlockPersonalizationPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockPrivacyPage", (n) -> { this.setSettingsBlockPrivacyPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockRemoveProvisioningPackage", (n) -> { this.setSettingsBlockRemoveProvisioningPackage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockSettingsApp", (n) -> { this.setSettingsBlockSettingsApp(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockSystemPage", (n) -> { this.setSettingsBlockSystemPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockTimeLanguagePage", (n) -> { this.setSettingsBlockTimeLanguagePage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockUpdateSecurityPage", (n) -> { this.setSettingsBlockUpdateSecurityPage(n.getBooleanValue()); });
        deserializerMap.put("sharedUserAppDataAllowed", (n) -> { this.setSharedUserAppDataAllowed(n.getBooleanValue()); });
        deserializerMap.put("smartScreenBlockPromptOverride", (n) -> { this.setSmartScreenBlockPromptOverride(n.getBooleanValue()); });
        deserializerMap.put("smartScreenBlockPromptOverrideForFiles", (n) -> { this.setSmartScreenBlockPromptOverrideForFiles(n.getBooleanValue()); });
        deserializerMap.put("smartScreenEnableAppInstallControl", (n) -> { this.setSmartScreenEnableAppInstallControl(n.getBooleanValue()); });
        deserializerMap.put("startBlockUnpinningAppsFromTaskbar", (n) -> { this.setStartBlockUnpinningAppsFromTaskbar(n.getBooleanValue()); });
        deserializerMap.put("startMenuAppListVisibility", (n) -> { this.setStartMenuAppListVisibility(n.getEnumValue(WindowsStartMenuAppListVisibilityType.class)); });
        deserializerMap.put("startMenuHideChangeAccountSettings", (n) -> { this.setStartMenuHideChangeAccountSettings(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideFrequentlyUsedApps", (n) -> { this.setStartMenuHideFrequentlyUsedApps(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideHibernate", (n) -> { this.setStartMenuHideHibernate(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideLock", (n) -> { this.setStartMenuHideLock(n.getBooleanValue()); });
        deserializerMap.put("startMenuHidePowerButton", (n) -> { this.setStartMenuHidePowerButton(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideRecentJumpLists", (n) -> { this.setStartMenuHideRecentJumpLists(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideRecentlyAddedApps", (n) -> { this.setStartMenuHideRecentlyAddedApps(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideRestartOptions", (n) -> { this.setStartMenuHideRestartOptions(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideShutDown", (n) -> { this.setStartMenuHideShutDown(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideSignOut", (n) -> { this.setStartMenuHideSignOut(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideSleep", (n) -> { this.setStartMenuHideSleep(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideSwitchAccount", (n) -> { this.setStartMenuHideSwitchAccount(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideUserTile", (n) -> { this.setStartMenuHideUserTile(n.getBooleanValue()); });
        deserializerMap.put("startMenuLayoutEdgeAssetsXml", (n) -> { this.setStartMenuLayoutEdgeAssetsXml(n.getByteArrayValue()); });
        deserializerMap.put("startMenuLayoutXml", (n) -> { this.setStartMenuLayoutXml(n.getByteArrayValue()); });
        deserializerMap.put("startMenuMode", (n) -> { this.setStartMenuMode(n.getEnumValue(WindowsStartMenuModeType.class)); });
        deserializerMap.put("startMenuPinnedFolderDocuments", (n) -> { this.setStartMenuPinnedFolderDocuments(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderDownloads", (n) -> { this.setStartMenuPinnedFolderDownloads(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderFileExplorer", (n) -> { this.setStartMenuPinnedFolderFileExplorer(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderHomeGroup", (n) -> { this.setStartMenuPinnedFolderHomeGroup(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderMusic", (n) -> { this.setStartMenuPinnedFolderMusic(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderNetwork", (n) -> { this.setStartMenuPinnedFolderNetwork(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderPersonalFolder", (n) -> { this.setStartMenuPinnedFolderPersonalFolder(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderPictures", (n) -> { this.setStartMenuPinnedFolderPictures(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderSettings", (n) -> { this.setStartMenuPinnedFolderSettings(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderVideos", (n) -> { this.setStartMenuPinnedFolderVideos(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("storageBlockRemovableStorage", (n) -> { this.setStorageBlockRemovableStorage(n.getBooleanValue()); });
        deserializerMap.put("storageRequireMobileDeviceEncryption", (n) -> { this.setStorageRequireMobileDeviceEncryption(n.getBooleanValue()); });
        deserializerMap.put("storageRestrictAppDataToSystemVolume", (n) -> { this.setStorageRestrictAppDataToSystemVolume(n.getBooleanValue()); });
        deserializerMap.put("storageRestrictAppInstallToSystemVolume", (n) -> { this.setStorageRestrictAppInstallToSystemVolume(n.getBooleanValue()); });
        deserializerMap.put("tenantLockdownRequireNetworkDuringOutOfBoxExperience", (n) -> { this.setTenantLockdownRequireNetworkDuringOutOfBoxExperience(n.getBooleanValue()); });
        deserializerMap.put("usbBlocked", (n) -> { this.setUsbBlocked(n.getBooleanValue()); });
        deserializerMap.put("voiceRecordingBlocked", (n) -> { this.setVoiceRecordingBlocked(n.getBooleanValue()); });
        deserializerMap.put("webRtcBlockLocalhostIpAddress", (n) -> { this.setWebRtcBlockLocalhostIpAddress(n.getBooleanValue()); });
        deserializerMap.put("wiFiBlockAutomaticConnectHotspots", (n) -> { this.setWiFiBlockAutomaticConnectHotspots(n.getBooleanValue()); });
        deserializerMap.put("wiFiBlocked", (n) -> { this.setWiFiBlocked(n.getBooleanValue()); });
        deserializerMap.put("wiFiBlockManualConfiguration", (n) -> { this.setWiFiBlockManualConfiguration(n.getBooleanValue()); });
        deserializerMap.put("wiFiScanInterval", (n) -> { this.setWiFiScanInterval(n.getIntegerValue()); });
        deserializerMap.put("windowsSpotlightBlockConsumerSpecificFeatures", (n) -> { this.setWindowsSpotlightBlockConsumerSpecificFeatures(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightBlocked", (n) -> { this.setWindowsSpotlightBlocked(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightBlockOnActionCenter", (n) -> { this.setWindowsSpotlightBlockOnActionCenter(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightBlockTailoredExperiences", (n) -> { this.setWindowsSpotlightBlockTailoredExperiences(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightBlockThirdPartyNotifications", (n) -> { this.setWindowsSpotlightBlockThirdPartyNotifications(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightBlockWelcomeExperience", (n) -> { this.setWindowsSpotlightBlockWelcomeExperience(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightBlockWindowsTips", (n) -> { this.setWindowsSpotlightBlockWindowsTips(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightConfigureOnLockScreen", (n) -> { this.setWindowsSpotlightConfigureOnLockScreen(n.getEnumValue(WindowsSpotlightEnablementSettings.class)); });
        deserializerMap.put("windowsStoreBlockAutoUpdate", (n) -> { this.setWindowsStoreBlockAutoUpdate(n.getBooleanValue()); });
        deserializerMap.put("windowsStoreBlocked", (n) -> { this.setWindowsStoreBlocked(n.getBooleanValue()); });
        deserializerMap.put("windowsStoreEnablePrivateStoreOnly", (n) -> { this.setWindowsStoreEnablePrivateStoreOnly(n.getBooleanValue()); });
        deserializerMap.put("wirelessDisplayBlockProjectionToThisDevice", (n) -> { this.setWirelessDisplayBlockProjectionToThisDevice(n.getBooleanValue()); });
        deserializerMap.put("wirelessDisplayBlockUserInputFromReceiver", (n) -> { this.setWirelessDisplayBlockUserInputFromReceiver(n.getBooleanValue()); });
        deserializerMap.put("wirelessDisplayRequirePinForPairing", (n) -> { this.setWirelessDisplayRequirePinForPairing(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gameDvrBlocked property value. Indicates whether or not to block DVR and broadcasting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGameDvrBlocked() {
        return this.gameDvrBlocked;
    }
    /**
     * Gets the internetSharingBlocked property value. Indicates whether or not to Block the user from using internet sharing.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getInternetSharingBlocked() {
        return this.internetSharingBlocked;
    }
    /**
     * Gets the locationServicesBlocked property value. Indicates whether or not to Block the user from location services.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocationServicesBlocked() {
        return this.locationServicesBlocked;
    }
    /**
     * Gets the lockScreenAllowTimeoutConfiguration property value. Specify whether to show a user-configurable setting to control the screen timeout while on the lock screen of Windows 10 Mobile devices. If this policy is set to Allow, the value set by lockScreenTimeoutInSeconds is ignored.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenAllowTimeoutConfiguration() {
        return this.lockScreenAllowTimeoutConfiguration;
    }
    /**
     * Gets the lockScreenBlockActionCenterNotifications property value. Indicates whether or not to block action center notifications over lock screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenBlockActionCenterNotifications() {
        return this.lockScreenBlockActionCenterNotifications;
    }
    /**
     * Gets the lockScreenBlockCortana property value. Indicates whether or not the user can interact with Cortana using speech while the system is locked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenBlockCortana() {
        return this.lockScreenBlockCortana;
    }
    /**
     * Gets the lockScreenBlockToastNotifications property value. Indicates whether to allow toast notifications above the device lock screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenBlockToastNotifications() {
        return this.lockScreenBlockToastNotifications;
    }
    /**
     * Gets the lockScreenTimeoutInSeconds property value. Set the duration (in seconds) from the screen locking to the screen turning off for Windows 10 Mobile devices. Supported values are 11-1800. Valid values 11 to 1800
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLockScreenTimeoutInSeconds() {
        return this.lockScreenTimeoutInSeconds;
    }
    /**
     * Gets the logonBlockFastUserSwitching property value. Disables the ability to quickly switch between users that are logged on simultaneously without logging off.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLogonBlockFastUserSwitching() {
        return this.logonBlockFastUserSwitching;
    }
    /**
     * Gets the microsoftAccountBlocked property value. Indicates whether or not to Block a Microsoft account.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftAccountBlocked() {
        return this.microsoftAccountBlocked;
    }
    /**
     * Gets the microsoftAccountBlockSettingsSync property value. Indicates whether or not to Block Microsoft account settings sync.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftAccountBlockSettingsSync() {
        return this.microsoftAccountBlockSettingsSync;
    }
    /**
     * Gets the networkProxyApplySettingsDeviceWide property value. If set, proxy settings will be applied to all processes and accounts in the device. Otherwise, it will be applied to the user account thats enrolled into MDM.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNetworkProxyApplySettingsDeviceWide() {
        return this.networkProxyApplySettingsDeviceWide;
    }
    /**
     * Gets the networkProxyAutomaticConfigurationUrl property value. Address to the proxy auto-config (PAC) script you want to use.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkProxyAutomaticConfigurationUrl() {
        return this.networkProxyAutomaticConfigurationUrl;
    }
    /**
     * Gets the networkProxyDisableAutoDetect property value. Disable automatic detection of settings. If enabled, the system will try to find the path to a proxy auto-config (PAC) script.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNetworkProxyDisableAutoDetect() {
        return this.networkProxyDisableAutoDetect;
    }
    /**
     * Gets the networkProxyServer property value. Specifies manual proxy server settings.
     * @return a windows10NetworkProxyServer
     */
    @javax.annotation.Nullable
    public Windows10NetworkProxyServer getNetworkProxyServer() {
        return this.networkProxyServer;
    }
    /**
     * Gets the nfcBlocked property value. Indicates whether or not to Block the user from using near field communication.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNfcBlocked() {
        return this.nfcBlocked;
    }
    /**
     * Gets the oneDriveDisableFileSync property value. Gets or sets a value allowing IT admins to prevent apps and features from working with files on OneDrive.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOneDriveDisableFileSync() {
        return this.oneDriveDisableFileSync;
    }
    /**
     * Gets the passwordBlockSimple property value. Specify whether PINs or passwords such as '1111' or '1234' are allowed. For Windows 10 desktops, it also controls the use of picture passwords.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockSimple() {
        return this.passwordBlockSimple;
    }
    /**
     * Gets the passwordExpirationDays property value. The password expiration in days. Valid values 0 to 730
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
     * Gets the passwordMinimumLength property value. The minimum password length. Valid values 4 to 16
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
     * Gets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent reuse of. Valid values 0 to 50
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequired property value. Indicates whether or not to require the user to have a password.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this.passwordRequired;
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
     * Gets the passwordRequireWhenResumeFromIdleState property value. Indicates whether or not to require a password upon resuming from an idle state.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequireWhenResumeFromIdleState() {
        return this.passwordRequireWhenResumeFromIdleState;
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. The number of sign in failures before factory reset. Valid values 0 to 999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this.passwordSignInFailureCountBeforeFactoryReset;
    }
    /**
     * Gets the personalizationDesktopImageUrl property value. A http or https Url to a jpg, jpeg or png image that needs to be downloaded and used as the Desktop Image or a file Url to a local image on the file system that needs to used as the Desktop Image.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPersonalizationDesktopImageUrl() {
        return this.personalizationDesktopImageUrl;
    }
    /**
     * Gets the personalizationLockScreenImageUrl property value. A http or https Url to a jpg, jpeg or png image that neeeds to be downloaded and used as the Lock Screen Image or a file Url to a local image on the file system that needs to be used as the Lock Screen Image.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPersonalizationLockScreenImageUrl() {
        return this.personalizationLockScreenImageUrl;
    }
    /**
     * Gets the privacyAdvertisingId property value. State Management Setting.
     * @return a stateManagementSetting
     */
    @javax.annotation.Nullable
    public StateManagementSetting getPrivacyAdvertisingId() {
        return this.privacyAdvertisingId;
    }
    /**
     * Gets the privacyAutoAcceptPairingAndConsentPrompts property value. Indicates whether or not to allow the automatic acceptance of the pairing and privacy user consent dialog when launching apps.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrivacyAutoAcceptPairingAndConsentPrompts() {
        return this.privacyAutoAcceptPairingAndConsentPrompts;
    }
    /**
     * Gets the privacyBlockInputPersonalization property value. Indicates whether or not to block the usage of cloud based speech services for Cortana, Dictation, or Store applications.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrivacyBlockInputPersonalization() {
        return this.privacyBlockInputPersonalization;
    }
    /**
     * Gets the resetProtectionModeBlocked property value. Indicates whether or not to Block the user from reset protection mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getResetProtectionModeBlocked() {
        return this.resetProtectionModeBlocked;
    }
    /**
     * Gets the safeSearchFilter property value. Specifies what level of safe search (filtering adult content) is required
     * @return a safeSearchFilterType
     */
    @javax.annotation.Nullable
    public SafeSearchFilterType getSafeSearchFilter() {
        return this.safeSearchFilter;
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to Block the user from taking Screenshots.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this.screenCaptureBlocked;
    }
    /**
     * Gets the searchBlockDiacritics property value. Specifies if search can use diacritics.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchBlockDiacritics() {
        return this.searchBlockDiacritics;
    }
    /**
     * Gets the searchDisableAutoLanguageDetection property value. Specifies whether to use automatic language detection when indexing content and properties.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableAutoLanguageDetection() {
        return this.searchDisableAutoLanguageDetection;
    }
    /**
     * Gets the searchDisableIndexerBackoff property value. Indicates whether or not to disable the search indexer backoff feature.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableIndexerBackoff() {
        return this.searchDisableIndexerBackoff;
    }
    /**
     * Gets the searchDisableIndexingEncryptedItems property value. Indicates whether or not to block indexing of WIP-protected items to prevent them from appearing in search results for Cortana or Explorer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableIndexingEncryptedItems() {
        return this.searchDisableIndexingEncryptedItems;
    }
    /**
     * Gets the searchDisableIndexingRemovableDrive property value. Indicates whether or not to allow users to add locations on removable drives to libraries and to be indexed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableIndexingRemovableDrive() {
        return this.searchDisableIndexingRemovableDrive;
    }
    /**
     * Gets the searchEnableAutomaticIndexSizeManangement property value. Specifies minimum amount of hard drive space on the same drive as the index location before indexing stops.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchEnableAutomaticIndexSizeManangement() {
        return this.searchEnableAutomaticIndexSizeManangement;
    }
    /**
     * Gets the searchEnableRemoteQueries property value. Indicates whether or not to block remote queries of this computers index.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchEnableRemoteQueries() {
        return this.searchEnableRemoteQueries;
    }
    /**
     * Gets the settingsBlockAccountsPage property value. Indicates whether or not to block access to Accounts in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockAccountsPage() {
        return this.settingsBlockAccountsPage;
    }
    /**
     * Gets the settingsBlockAddProvisioningPackage property value. Indicates whether or not to block the user from installing provisioning packages.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockAddProvisioningPackage() {
        return this.settingsBlockAddProvisioningPackage;
    }
    /**
     * Gets the settingsBlockAppsPage property value. Indicates whether or not to block access to Apps in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockAppsPage() {
        return this.settingsBlockAppsPage;
    }
    /**
     * Gets the settingsBlockChangeLanguage property value. Indicates whether or not to block the user from changing the language settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockChangeLanguage() {
        return this.settingsBlockChangeLanguage;
    }
    /**
     * Gets the settingsBlockChangePowerSleep property value. Indicates whether or not to block the user from changing power and sleep settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockChangePowerSleep() {
        return this.settingsBlockChangePowerSleep;
    }
    /**
     * Gets the settingsBlockChangeRegion property value. Indicates whether or not to block the user from changing the region settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockChangeRegion() {
        return this.settingsBlockChangeRegion;
    }
    /**
     * Gets the settingsBlockChangeSystemTime property value. Indicates whether or not to block the user from changing date and time settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockChangeSystemTime() {
        return this.settingsBlockChangeSystemTime;
    }
    /**
     * Gets the settingsBlockDevicesPage property value. Indicates whether or not to block access to Devices in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockDevicesPage() {
        return this.settingsBlockDevicesPage;
    }
    /**
     * Gets the settingsBlockEaseOfAccessPage property value. Indicates whether or not to block access to Ease of Access in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockEaseOfAccessPage() {
        return this.settingsBlockEaseOfAccessPage;
    }
    /**
     * Gets the settingsBlockEditDeviceName property value. Indicates whether or not to block the user from editing the device name.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockEditDeviceName() {
        return this.settingsBlockEditDeviceName;
    }
    /**
     * Gets the settingsBlockGamingPage property value. Indicates whether or not to block access to Gaming in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockGamingPage() {
        return this.settingsBlockGamingPage;
    }
    /**
     * Gets the settingsBlockNetworkInternetPage property value. Indicates whether or not to block access to Network & Internet in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockNetworkInternetPage() {
        return this.settingsBlockNetworkInternetPage;
    }
    /**
     * Gets the settingsBlockPersonalizationPage property value. Indicates whether or not to block access to Personalization in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockPersonalizationPage() {
        return this.settingsBlockPersonalizationPage;
    }
    /**
     * Gets the settingsBlockPrivacyPage property value. Indicates whether or not to block access to Privacy in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockPrivacyPage() {
        return this.settingsBlockPrivacyPage;
    }
    /**
     * Gets the settingsBlockRemoveProvisioningPackage property value. Indicates whether or not to block the runtime configuration agent from removing provisioning packages.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockRemoveProvisioningPackage() {
        return this.settingsBlockRemoveProvisioningPackage;
    }
    /**
     * Gets the settingsBlockSettingsApp property value. Indicates whether or not to block access to Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockSettingsApp() {
        return this.settingsBlockSettingsApp;
    }
    /**
     * Gets the settingsBlockSystemPage property value. Indicates whether or not to block access to System in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockSystemPage() {
        return this.settingsBlockSystemPage;
    }
    /**
     * Gets the settingsBlockTimeLanguagePage property value. Indicates whether or not to block access to Time & Language in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockTimeLanguagePage() {
        return this.settingsBlockTimeLanguagePage;
    }
    /**
     * Gets the settingsBlockUpdateSecurityPage property value. Indicates whether or not to block access to Update & Security in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockUpdateSecurityPage() {
        return this.settingsBlockUpdateSecurityPage;
    }
    /**
     * Gets the sharedUserAppDataAllowed property value. Indicates whether or not to block multiple users of the same app to share data.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSharedUserAppDataAllowed() {
        return this.sharedUserAppDataAllowed;
    }
    /**
     * Gets the smartScreenBlockPromptOverride property value. Indicates whether or not users can override SmartScreen Filter warnings about potentially malicious websites.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmartScreenBlockPromptOverride() {
        return this.smartScreenBlockPromptOverride;
    }
    /**
     * Gets the smartScreenBlockPromptOverrideForFiles property value. Indicates whether or not users can override the SmartScreen Filter warnings about downloading unverified files
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmartScreenBlockPromptOverrideForFiles() {
        return this.smartScreenBlockPromptOverrideForFiles;
    }
    /**
     * Gets the smartScreenEnableAppInstallControl property value. This property will be deprecated in July 2019 and will be replaced by property SmartScreenAppInstallControl. Allows IT Admins to control whether users are allowed to install apps from places other than the Store.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmartScreenEnableAppInstallControl() {
        return this.smartScreenEnableAppInstallControl;
    }
    /**
     * Gets the startBlockUnpinningAppsFromTaskbar property value. Indicates whether or not to block the user from unpinning apps from taskbar.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartBlockUnpinningAppsFromTaskbar() {
        return this.startBlockUnpinningAppsFromTaskbar;
    }
    /**
     * Gets the startMenuAppListVisibility property value. Type of start menu app list visibility.
     * @return a windowsStartMenuAppListVisibilityType
     */
    @javax.annotation.Nullable
    public WindowsStartMenuAppListVisibilityType getStartMenuAppListVisibility() {
        return this.startMenuAppListVisibility;
    }
    /**
     * Gets the startMenuHideChangeAccountSettings property value. Enabling this policy hides the change account setting from appearing in the user tile in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideChangeAccountSettings() {
        return this.startMenuHideChangeAccountSettings;
    }
    /**
     * Gets the startMenuHideFrequentlyUsedApps property value. Enabling this policy hides the most used apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideFrequentlyUsedApps() {
        return this.startMenuHideFrequentlyUsedApps;
    }
    /**
     * Gets the startMenuHideHibernate property value. Enabling this policy hides hibernate from appearing in the power button in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideHibernate() {
        return this.startMenuHideHibernate;
    }
    /**
     * Gets the startMenuHideLock property value. Enabling this policy hides lock from appearing in the user tile in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideLock() {
        return this.startMenuHideLock;
    }
    /**
     * Gets the startMenuHidePowerButton property value. Enabling this policy hides the power button from appearing in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHidePowerButton() {
        return this.startMenuHidePowerButton;
    }
    /**
     * Gets the startMenuHideRecentJumpLists property value. Enabling this policy hides recent jump lists from appearing on the start menu/taskbar and disables the corresponding toggle in the Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideRecentJumpLists() {
        return this.startMenuHideRecentJumpLists;
    }
    /**
     * Gets the startMenuHideRecentlyAddedApps property value. Enabling this policy hides recently added apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideRecentlyAddedApps() {
        return this.startMenuHideRecentlyAddedApps;
    }
    /**
     * Gets the startMenuHideRestartOptions property value. Enabling this policy hides 'Restart/Update and Restart' from appearing in the power button in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideRestartOptions() {
        return this.startMenuHideRestartOptions;
    }
    /**
     * Gets the startMenuHideShutDown property value. Enabling this policy hides shut down/update and shut down from appearing in the power button in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideShutDown() {
        return this.startMenuHideShutDown;
    }
    /**
     * Gets the startMenuHideSignOut property value. Enabling this policy hides sign out from appearing in the user tile in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideSignOut() {
        return this.startMenuHideSignOut;
    }
    /**
     * Gets the startMenuHideSleep property value. Enabling this policy hides sleep from appearing in the power button in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideSleep() {
        return this.startMenuHideSleep;
    }
    /**
     * Gets the startMenuHideSwitchAccount property value. Enabling this policy hides switch account from appearing in the user tile in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideSwitchAccount() {
        return this.startMenuHideSwitchAccount;
    }
    /**
     * Gets the startMenuHideUserTile property value. Enabling this policy hides the user tile from appearing in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideUserTile() {
        return this.startMenuHideUserTile;
    }
    /**
     * Gets the startMenuLayoutEdgeAssetsXml property value. This policy setting allows you to import Edge assets to be used with startMenuLayoutXml policy. Start layout can contain secondary tile from Edge app which looks for Edge local asset file. Edge local asset would not exist and cause Edge secondary tile to appear empty in this case. This policy only gets applied when startMenuLayoutXml policy is modified. The value should be a UTF-8 Base64 encoded byte array.
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getStartMenuLayoutEdgeAssetsXml() {
        return this.startMenuLayoutEdgeAssetsXml;
    }
    /**
     * Gets the startMenuLayoutXml property value. Allows admins to override the default Start menu layout and prevents the user from changing it. The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in a UTF8 encoded byte array format.
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getStartMenuLayoutXml() {
        return this.startMenuLayoutXml;
    }
    /**
     * Gets the startMenuMode property value. Type of display modes for the start menu.
     * @return a windowsStartMenuModeType
     */
    @javax.annotation.Nullable
    public WindowsStartMenuModeType getStartMenuMode() {
        return this.startMenuMode;
    }
    /**
     * Gets the startMenuPinnedFolderDocuments property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderDocuments() {
        return this.startMenuPinnedFolderDocuments;
    }
    /**
     * Gets the startMenuPinnedFolderDownloads property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderDownloads() {
        return this.startMenuPinnedFolderDownloads;
    }
    /**
     * Gets the startMenuPinnedFolderFileExplorer property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderFileExplorer() {
        return this.startMenuPinnedFolderFileExplorer;
    }
    /**
     * Gets the startMenuPinnedFolderHomeGroup property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderHomeGroup() {
        return this.startMenuPinnedFolderHomeGroup;
    }
    /**
     * Gets the startMenuPinnedFolderMusic property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderMusic() {
        return this.startMenuPinnedFolderMusic;
    }
    /**
     * Gets the startMenuPinnedFolderNetwork property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderNetwork() {
        return this.startMenuPinnedFolderNetwork;
    }
    /**
     * Gets the startMenuPinnedFolderPersonalFolder property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderPersonalFolder() {
        return this.startMenuPinnedFolderPersonalFolder;
    }
    /**
     * Gets the startMenuPinnedFolderPictures property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderPictures() {
        return this.startMenuPinnedFolderPictures;
    }
    /**
     * Gets the startMenuPinnedFolderSettings property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderSettings() {
        return this.startMenuPinnedFolderSettings;
    }
    /**
     * Gets the startMenuPinnedFolderVideos property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderVideos() {
        return this.startMenuPinnedFolderVideos;
    }
    /**
     * Gets the storageBlockRemovableStorage property value. Indicates whether or not to Block the user from using removable storage.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageBlockRemovableStorage() {
        return this.storageBlockRemovableStorage;
    }
    /**
     * Gets the storageRequireMobileDeviceEncryption property value. Indicating whether or not to require encryption on a mobile device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRequireMobileDeviceEncryption() {
        return this.storageRequireMobileDeviceEncryption;
    }
    /**
     * Gets the storageRestrictAppDataToSystemVolume property value. Indicates whether application data is restricted to the system drive.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRestrictAppDataToSystemVolume() {
        return this.storageRestrictAppDataToSystemVolume;
    }
    /**
     * Gets the storageRestrictAppInstallToSystemVolume property value. Indicates whether the installation of applications is restricted to the system drive.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRestrictAppInstallToSystemVolume() {
        return this.storageRestrictAppInstallToSystemVolume;
    }
    /**
     * Gets the tenantLockdownRequireNetworkDuringOutOfBoxExperience property value. Whether the device is required to connect to the network.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTenantLockdownRequireNetworkDuringOutOfBoxExperience() {
        return this.tenantLockdownRequireNetworkDuringOutOfBoxExperience;
    }
    /**
     * Gets the usbBlocked property value. Indicates whether or not to Block the user from USB connection.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUsbBlocked() {
        return this.usbBlocked;
    }
    /**
     * Gets the voiceRecordingBlocked property value. Indicates whether or not to Block the user from voice recording.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getVoiceRecordingBlocked() {
        return this.voiceRecordingBlocked;
    }
    /**
     * Gets the webRtcBlockLocalhostIpAddress property value. Indicates whether or not user's localhost IP address is displayed while making phone calls using the WebRTC
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWebRtcBlockLocalhostIpAddress() {
        return this.webRtcBlockLocalhostIpAddress;
    }
    /**
     * Gets the wiFiBlockAutomaticConnectHotspots property value. Indicating whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWiFiBlockAutomaticConnectHotspots() {
        return this.wiFiBlockAutomaticConnectHotspots;
    }
    /**
     * Gets the wiFiBlocked property value. Indicates whether or not to Block the user from using Wi-Fi.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWiFiBlocked() {
        return this.wiFiBlocked;
    }
    /**
     * Gets the wiFiBlockManualConfiguration property value. Indicates whether or not to Block the user from using Wi-Fi manual configuration.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWiFiBlockManualConfiguration() {
        return this.wiFiBlockManualConfiguration;
    }
    /**
     * Gets the wiFiScanInterval property value. Specify how often devices scan for Wi-Fi networks. Supported values are 1-500, where 100 = default, and 500 = low frequency. Valid values 1 to 500
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWiFiScanInterval() {
        return this.wiFiScanInterval;
    }
    /**
     * Gets the windowsSpotlightBlockConsumerSpecificFeatures property value. Allows IT admins to block experiences that are typically for consumers only, such as Start suggestions, Membership notifications, Post-OOBE app install and redirect tiles.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockConsumerSpecificFeatures() {
        return this.windowsSpotlightBlockConsumerSpecificFeatures;
    }
    /**
     * Gets the windowsSpotlightBlocked property value. Allows IT admins to turn off all Windows Spotlight features
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlocked() {
        return this.windowsSpotlightBlocked;
    }
    /**
     * Gets the windowsSpotlightBlockOnActionCenter property value. Block suggestions from Microsoft that show after each OS clean install, upgrade or in an on-going basis to introduce users to what is new or changed
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockOnActionCenter() {
        return this.windowsSpotlightBlockOnActionCenter;
    }
    /**
     * Gets the windowsSpotlightBlockTailoredExperiences property value. Block personalized content in Windows spotlight based on users device usage.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockTailoredExperiences() {
        return this.windowsSpotlightBlockTailoredExperiences;
    }
    /**
     * Gets the windowsSpotlightBlockThirdPartyNotifications property value. Block third party content delivered via Windows Spotlight
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockThirdPartyNotifications() {
        return this.windowsSpotlightBlockThirdPartyNotifications;
    }
    /**
     * Gets the windowsSpotlightBlockWelcomeExperience property value. Block Windows Spotlight Windows welcome experience
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockWelcomeExperience() {
        return this.windowsSpotlightBlockWelcomeExperience;
    }
    /**
     * Gets the windowsSpotlightBlockWindowsTips property value. Allows IT admins to turn off the popup of Windows Tips.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockWindowsTips() {
        return this.windowsSpotlightBlockWindowsTips;
    }
    /**
     * Gets the windowsSpotlightConfigureOnLockScreen property value. Allows IT admind to set a predefined default search engine for MDM-Controlled devices
     * @return a windowsSpotlightEnablementSettings
     */
    @javax.annotation.Nullable
    public WindowsSpotlightEnablementSettings getWindowsSpotlightConfigureOnLockScreen() {
        return this.windowsSpotlightConfigureOnLockScreen;
    }
    /**
     * Gets the windowsStoreBlockAutoUpdate property value. Indicates whether or not to block automatic update of apps from Windows Store.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsStoreBlockAutoUpdate() {
        return this.windowsStoreBlockAutoUpdate;
    }
    /**
     * Gets the windowsStoreBlocked property value. Indicates whether or not to Block the user from using the Windows store.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsStoreBlocked() {
        return this.windowsStoreBlocked;
    }
    /**
     * Gets the windowsStoreEnablePrivateStoreOnly property value. Indicates whether or not to enable Private Store Only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsStoreEnablePrivateStoreOnly() {
        return this.windowsStoreEnablePrivateStoreOnly;
    }
    /**
     * Gets the wirelessDisplayBlockProjectionToThisDevice property value. Indicates whether or not to allow other devices from discovering this PC for projection.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWirelessDisplayBlockProjectionToThisDevice() {
        return this.wirelessDisplayBlockProjectionToThisDevice;
    }
    /**
     * Gets the wirelessDisplayBlockUserInputFromReceiver property value. Indicates whether or not to allow user input from wireless display receiver.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWirelessDisplayBlockUserInputFromReceiver() {
        return this.wirelessDisplayBlockUserInputFromReceiver;
    }
    /**
     * Gets the wirelessDisplayRequirePinForPairing property value. Indicates whether or not to require a PIN for new devices to initiate pairing.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWirelessDisplayRequirePinForPairing() {
        return this.wirelessDisplayRequirePinForPairing;
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
        writer.writeBooleanValue("antiTheftModeBlocked", this.getAntiTheftModeBlocked());
        writer.writeEnumValue("appsAllowTrustedAppsSideloading", this.getAppsAllowTrustedAppsSideloading());
        writer.writeBooleanValue("appsBlockWindowsStoreOriginatedApps", this.getAppsBlockWindowsStoreOriginatedApps());
        writer.writeCollectionOfPrimitiveValues("bluetoothAllowedServices", this.getBluetoothAllowedServices());
        writer.writeBooleanValue("bluetoothBlockAdvertising", this.getBluetoothBlockAdvertising());
        writer.writeBooleanValue("bluetoothBlockDiscoverableMode", this.getBluetoothBlockDiscoverableMode());
        writer.writeBooleanValue("bluetoothBlocked", this.getBluetoothBlocked());
        writer.writeBooleanValue("bluetoothBlockPrePairing", this.getBluetoothBlockPrePairing());
        writer.writeBooleanValue("cameraBlocked", this.getCameraBlocked());
        writer.writeBooleanValue("cellularBlockDataWhenRoaming", this.getCellularBlockDataWhenRoaming());
        writer.writeBooleanValue("cellularBlockVpn", this.getCellularBlockVpn());
        writer.writeBooleanValue("cellularBlockVpnWhenRoaming", this.getCellularBlockVpnWhenRoaming());
        writer.writeBooleanValue("certificatesBlockManualRootCertificateInstallation", this.getCertificatesBlockManualRootCertificateInstallation());
        writer.writeBooleanValue("connectedDevicesServiceBlocked", this.getConnectedDevicesServiceBlocked());
        writer.writeBooleanValue("copyPasteBlocked", this.getCopyPasteBlocked());
        writer.writeBooleanValue("cortanaBlocked", this.getCortanaBlocked());
        writer.writeBooleanValue("defenderBlockEndUserAccess", this.getDefenderBlockEndUserAccess());
        writer.writeEnumValue("defenderCloudBlockLevel", this.getDefenderCloudBlockLevel());
        writer.writeIntegerValue("defenderDaysBeforeDeletingQuarantinedMalware", this.getDefenderDaysBeforeDeletingQuarantinedMalware());
        writer.writeObjectValue("defenderDetectedMalwareActions", this.getDefenderDetectedMalwareActions());
        writer.writeCollectionOfPrimitiveValues("defenderFileExtensionsToExclude", this.getDefenderFileExtensionsToExclude());
        writer.writeCollectionOfPrimitiveValues("defenderFilesAndFoldersToExclude", this.getDefenderFilesAndFoldersToExclude());
        writer.writeEnumValue("defenderMonitorFileActivity", this.getDefenderMonitorFileActivity());
        writer.writeCollectionOfPrimitiveValues("defenderProcessesToExclude", this.getDefenderProcessesToExclude());
        writer.writeEnumValue("defenderPromptForSampleSubmission", this.getDefenderPromptForSampleSubmission());
        writer.writeBooleanValue("defenderRequireBehaviorMonitoring", this.getDefenderRequireBehaviorMonitoring());
        writer.writeBooleanValue("defenderRequireCloudProtection", this.getDefenderRequireCloudProtection());
        writer.writeBooleanValue("defenderRequireNetworkInspectionSystem", this.getDefenderRequireNetworkInspectionSystem());
        writer.writeBooleanValue("defenderRequireRealTimeMonitoring", this.getDefenderRequireRealTimeMonitoring());
        writer.writeBooleanValue("defenderScanArchiveFiles", this.getDefenderScanArchiveFiles());
        writer.writeBooleanValue("defenderScanDownloads", this.getDefenderScanDownloads());
        writer.writeBooleanValue("defenderScanIncomingMail", this.getDefenderScanIncomingMail());
        writer.writeBooleanValue("defenderScanMappedNetworkDrivesDuringFullScan", this.getDefenderScanMappedNetworkDrivesDuringFullScan());
        writer.writeIntegerValue("defenderScanMaxCpu", this.getDefenderScanMaxCpu());
        writer.writeBooleanValue("defenderScanNetworkFiles", this.getDefenderScanNetworkFiles());
        writer.writeBooleanValue("defenderScanRemovableDrivesDuringFullScan", this.getDefenderScanRemovableDrivesDuringFullScan());
        writer.writeBooleanValue("defenderScanScriptsLoadedInInternetExplorer", this.getDefenderScanScriptsLoadedInInternetExplorer());
        writer.writeEnumValue("defenderScanType", this.getDefenderScanType());
        writer.writeLocalTimeValue("defenderScheduledQuickScanTime", this.getDefenderScheduledQuickScanTime());
        writer.writeLocalTimeValue("defenderScheduledScanTime", this.getDefenderScheduledScanTime());
        writer.writeIntegerValue("defenderSignatureUpdateIntervalInHours", this.getDefenderSignatureUpdateIntervalInHours());
        writer.writeEnumValue("defenderSystemScanSchedule", this.getDefenderSystemScanSchedule());
        writer.writeEnumValue("developerUnlockSetting", this.getDeveloperUnlockSetting());
        writer.writeBooleanValue("deviceManagementBlockFactoryResetOnMobile", this.getDeviceManagementBlockFactoryResetOnMobile());
        writer.writeBooleanValue("deviceManagementBlockManualUnenroll", this.getDeviceManagementBlockManualUnenroll());
        writer.writeEnumValue("diagnosticsDataSubmissionMode", this.getDiagnosticsDataSubmissionMode());
        writer.writeBooleanValue("edgeAllowStartPagesModification", this.getEdgeAllowStartPagesModification());
        writer.writeBooleanValue("edgeBlockAccessToAboutFlags", this.getEdgeBlockAccessToAboutFlags());
        writer.writeBooleanValue("edgeBlockAddressBarDropdown", this.getEdgeBlockAddressBarDropdown());
        writer.writeBooleanValue("edgeBlockAutofill", this.getEdgeBlockAutofill());
        writer.writeBooleanValue("edgeBlockCompatibilityList", this.getEdgeBlockCompatibilityList());
        writer.writeBooleanValue("edgeBlockDeveloperTools", this.getEdgeBlockDeveloperTools());
        writer.writeBooleanValue("edgeBlocked", this.getEdgeBlocked());
        writer.writeBooleanValue("edgeBlockExtensions", this.getEdgeBlockExtensions());
        writer.writeBooleanValue("edgeBlockInPrivateBrowsing", this.getEdgeBlockInPrivateBrowsing());
        writer.writeBooleanValue("edgeBlockJavaScript", this.getEdgeBlockJavaScript());
        writer.writeBooleanValue("edgeBlockLiveTileDataCollection", this.getEdgeBlockLiveTileDataCollection());
        writer.writeBooleanValue("edgeBlockPasswordManager", this.getEdgeBlockPasswordManager());
        writer.writeBooleanValue("edgeBlockPopups", this.getEdgeBlockPopups());
        writer.writeBooleanValue("edgeBlockSearchSuggestions", this.getEdgeBlockSearchSuggestions());
        writer.writeBooleanValue("edgeBlockSendingDoNotTrackHeader", this.getEdgeBlockSendingDoNotTrackHeader());
        writer.writeBooleanValue("edgeBlockSendingIntranetTrafficToInternetExplorer", this.getEdgeBlockSendingIntranetTrafficToInternetExplorer());
        writer.writeBooleanValue("edgeClearBrowsingDataOnExit", this.getEdgeClearBrowsingDataOnExit());
        writer.writeEnumValue("edgeCookiePolicy", this.getEdgeCookiePolicy());
        writer.writeBooleanValue("edgeDisableFirstRunPage", this.getEdgeDisableFirstRunPage());
        writer.writeStringValue("edgeEnterpriseModeSiteListLocation", this.getEdgeEnterpriseModeSiteListLocation());
        writer.writeStringValue("edgeFirstRunUrl", this.getEdgeFirstRunUrl());
        writer.writeCollectionOfPrimitiveValues("edgeHomepageUrls", this.getEdgeHomepageUrls());
        writer.writeBooleanValue("edgeRequireSmartScreen", this.getEdgeRequireSmartScreen());
        writer.writeObjectValue("edgeSearchEngine", this.getEdgeSearchEngine());
        writer.writeBooleanValue("edgeSendIntranetTrafficToInternetExplorer", this.getEdgeSendIntranetTrafficToInternetExplorer());
        writer.writeBooleanValue("edgeSyncFavoritesWithInternetExplorer", this.getEdgeSyncFavoritesWithInternetExplorer());
        writer.writeStringValue("enterpriseCloudPrintDiscoveryEndPoint", this.getEnterpriseCloudPrintDiscoveryEndPoint());
        writer.writeIntegerValue("enterpriseCloudPrintDiscoveryMaxLimit", this.getEnterpriseCloudPrintDiscoveryMaxLimit());
        writer.writeStringValue("enterpriseCloudPrintMopriaDiscoveryResourceIdentifier", this.getEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier());
        writer.writeStringValue("enterpriseCloudPrintOAuthAuthority", this.getEnterpriseCloudPrintOAuthAuthority());
        writer.writeStringValue("enterpriseCloudPrintOAuthClientIdentifier", this.getEnterpriseCloudPrintOAuthClientIdentifier());
        writer.writeStringValue("enterpriseCloudPrintResourceIdentifier", this.getEnterpriseCloudPrintResourceIdentifier());
        writer.writeBooleanValue("experienceBlockDeviceDiscovery", this.getExperienceBlockDeviceDiscovery());
        writer.writeBooleanValue("experienceBlockErrorDialogWhenNoSIM", this.getExperienceBlockErrorDialogWhenNoSIM());
        writer.writeBooleanValue("experienceBlockTaskSwitcher", this.getExperienceBlockTaskSwitcher());
        writer.writeBooleanValue("gameDvrBlocked", this.getGameDvrBlocked());
        writer.writeBooleanValue("internetSharingBlocked", this.getInternetSharingBlocked());
        writer.writeBooleanValue("locationServicesBlocked", this.getLocationServicesBlocked());
        writer.writeBooleanValue("lockScreenAllowTimeoutConfiguration", this.getLockScreenAllowTimeoutConfiguration());
        writer.writeBooleanValue("lockScreenBlockActionCenterNotifications", this.getLockScreenBlockActionCenterNotifications());
        writer.writeBooleanValue("lockScreenBlockCortana", this.getLockScreenBlockCortana());
        writer.writeBooleanValue("lockScreenBlockToastNotifications", this.getLockScreenBlockToastNotifications());
        writer.writeIntegerValue("lockScreenTimeoutInSeconds", this.getLockScreenTimeoutInSeconds());
        writer.writeBooleanValue("logonBlockFastUserSwitching", this.getLogonBlockFastUserSwitching());
        writer.writeBooleanValue("microsoftAccountBlocked", this.getMicrosoftAccountBlocked());
        writer.writeBooleanValue("microsoftAccountBlockSettingsSync", this.getMicrosoftAccountBlockSettingsSync());
        writer.writeBooleanValue("networkProxyApplySettingsDeviceWide", this.getNetworkProxyApplySettingsDeviceWide());
        writer.writeStringValue("networkProxyAutomaticConfigurationUrl", this.getNetworkProxyAutomaticConfigurationUrl());
        writer.writeBooleanValue("networkProxyDisableAutoDetect", this.getNetworkProxyDisableAutoDetect());
        writer.writeObjectValue("networkProxyServer", this.getNetworkProxyServer());
        writer.writeBooleanValue("nfcBlocked", this.getNfcBlocked());
        writer.writeBooleanValue("oneDriveDisableFileSync", this.getOneDriveDisableFileSync());
        writer.writeBooleanValue("passwordBlockSimple", this.getPasswordBlockSimple());
        writer.writeIntegerValue("passwordExpirationDays", this.getPasswordExpirationDays());
        writer.writeIntegerValue("passwordMinimumCharacterSetCount", this.getPasswordMinimumCharacterSetCount());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeScreenTimeout", this.getPasswordMinutesOfInactivityBeforeScreenTimeout());
        writer.writeIntegerValue("passwordPreviousPasswordBlockCount", this.getPasswordPreviousPasswordBlockCount());
        writer.writeBooleanValue("passwordRequired", this.getPasswordRequired());
        writer.writeEnumValue("passwordRequiredType", this.getPasswordRequiredType());
        writer.writeBooleanValue("passwordRequireWhenResumeFromIdleState", this.getPasswordRequireWhenResumeFromIdleState());
        writer.writeIntegerValue("passwordSignInFailureCountBeforeFactoryReset", this.getPasswordSignInFailureCountBeforeFactoryReset());
        writer.writeStringValue("personalizationDesktopImageUrl", this.getPersonalizationDesktopImageUrl());
        writer.writeStringValue("personalizationLockScreenImageUrl", this.getPersonalizationLockScreenImageUrl());
        writer.writeEnumValue("privacyAdvertisingId", this.getPrivacyAdvertisingId());
        writer.writeBooleanValue("privacyAutoAcceptPairingAndConsentPrompts", this.getPrivacyAutoAcceptPairingAndConsentPrompts());
        writer.writeBooleanValue("privacyBlockInputPersonalization", this.getPrivacyBlockInputPersonalization());
        writer.writeBooleanValue("resetProtectionModeBlocked", this.getResetProtectionModeBlocked());
        writer.writeEnumValue("safeSearchFilter", this.getSafeSearchFilter());
        writer.writeBooleanValue("screenCaptureBlocked", this.getScreenCaptureBlocked());
        writer.writeBooleanValue("searchBlockDiacritics", this.getSearchBlockDiacritics());
        writer.writeBooleanValue("searchDisableAutoLanguageDetection", this.getSearchDisableAutoLanguageDetection());
        writer.writeBooleanValue("searchDisableIndexerBackoff", this.getSearchDisableIndexerBackoff());
        writer.writeBooleanValue("searchDisableIndexingEncryptedItems", this.getSearchDisableIndexingEncryptedItems());
        writer.writeBooleanValue("searchDisableIndexingRemovableDrive", this.getSearchDisableIndexingRemovableDrive());
        writer.writeBooleanValue("searchEnableAutomaticIndexSizeManangement", this.getSearchEnableAutomaticIndexSizeManangement());
        writer.writeBooleanValue("searchEnableRemoteQueries", this.getSearchEnableRemoteQueries());
        writer.writeBooleanValue("settingsBlockAccountsPage", this.getSettingsBlockAccountsPage());
        writer.writeBooleanValue("settingsBlockAddProvisioningPackage", this.getSettingsBlockAddProvisioningPackage());
        writer.writeBooleanValue("settingsBlockAppsPage", this.getSettingsBlockAppsPage());
        writer.writeBooleanValue("settingsBlockChangeLanguage", this.getSettingsBlockChangeLanguage());
        writer.writeBooleanValue("settingsBlockChangePowerSleep", this.getSettingsBlockChangePowerSleep());
        writer.writeBooleanValue("settingsBlockChangeRegion", this.getSettingsBlockChangeRegion());
        writer.writeBooleanValue("settingsBlockChangeSystemTime", this.getSettingsBlockChangeSystemTime());
        writer.writeBooleanValue("settingsBlockDevicesPage", this.getSettingsBlockDevicesPage());
        writer.writeBooleanValue("settingsBlockEaseOfAccessPage", this.getSettingsBlockEaseOfAccessPage());
        writer.writeBooleanValue("settingsBlockEditDeviceName", this.getSettingsBlockEditDeviceName());
        writer.writeBooleanValue("settingsBlockGamingPage", this.getSettingsBlockGamingPage());
        writer.writeBooleanValue("settingsBlockNetworkInternetPage", this.getSettingsBlockNetworkInternetPage());
        writer.writeBooleanValue("settingsBlockPersonalizationPage", this.getSettingsBlockPersonalizationPage());
        writer.writeBooleanValue("settingsBlockPrivacyPage", this.getSettingsBlockPrivacyPage());
        writer.writeBooleanValue("settingsBlockRemoveProvisioningPackage", this.getSettingsBlockRemoveProvisioningPackage());
        writer.writeBooleanValue("settingsBlockSettingsApp", this.getSettingsBlockSettingsApp());
        writer.writeBooleanValue("settingsBlockSystemPage", this.getSettingsBlockSystemPage());
        writer.writeBooleanValue("settingsBlockTimeLanguagePage", this.getSettingsBlockTimeLanguagePage());
        writer.writeBooleanValue("settingsBlockUpdateSecurityPage", this.getSettingsBlockUpdateSecurityPage());
        writer.writeBooleanValue("sharedUserAppDataAllowed", this.getSharedUserAppDataAllowed());
        writer.writeBooleanValue("smartScreenBlockPromptOverride", this.getSmartScreenBlockPromptOverride());
        writer.writeBooleanValue("smartScreenBlockPromptOverrideForFiles", this.getSmartScreenBlockPromptOverrideForFiles());
        writer.writeBooleanValue("smartScreenEnableAppInstallControl", this.getSmartScreenEnableAppInstallControl());
        writer.writeBooleanValue("startBlockUnpinningAppsFromTaskbar", this.getStartBlockUnpinningAppsFromTaskbar());
        writer.writeEnumValue("startMenuAppListVisibility", this.getStartMenuAppListVisibility());
        writer.writeBooleanValue("startMenuHideChangeAccountSettings", this.getStartMenuHideChangeAccountSettings());
        writer.writeBooleanValue("startMenuHideFrequentlyUsedApps", this.getStartMenuHideFrequentlyUsedApps());
        writer.writeBooleanValue("startMenuHideHibernate", this.getStartMenuHideHibernate());
        writer.writeBooleanValue("startMenuHideLock", this.getStartMenuHideLock());
        writer.writeBooleanValue("startMenuHidePowerButton", this.getStartMenuHidePowerButton());
        writer.writeBooleanValue("startMenuHideRecentJumpLists", this.getStartMenuHideRecentJumpLists());
        writer.writeBooleanValue("startMenuHideRecentlyAddedApps", this.getStartMenuHideRecentlyAddedApps());
        writer.writeBooleanValue("startMenuHideRestartOptions", this.getStartMenuHideRestartOptions());
        writer.writeBooleanValue("startMenuHideShutDown", this.getStartMenuHideShutDown());
        writer.writeBooleanValue("startMenuHideSignOut", this.getStartMenuHideSignOut());
        writer.writeBooleanValue("startMenuHideSleep", this.getStartMenuHideSleep());
        writer.writeBooleanValue("startMenuHideSwitchAccount", this.getStartMenuHideSwitchAccount());
        writer.writeBooleanValue("startMenuHideUserTile", this.getStartMenuHideUserTile());
        writer.writeByteArrayValue("startMenuLayoutEdgeAssetsXml", this.getStartMenuLayoutEdgeAssetsXml());
        writer.writeByteArrayValue("startMenuLayoutXml", this.getStartMenuLayoutXml());
        writer.writeEnumValue("startMenuMode", this.getStartMenuMode());
        writer.writeEnumValue("startMenuPinnedFolderDocuments", this.getStartMenuPinnedFolderDocuments());
        writer.writeEnumValue("startMenuPinnedFolderDownloads", this.getStartMenuPinnedFolderDownloads());
        writer.writeEnumValue("startMenuPinnedFolderFileExplorer", this.getStartMenuPinnedFolderFileExplorer());
        writer.writeEnumValue("startMenuPinnedFolderHomeGroup", this.getStartMenuPinnedFolderHomeGroup());
        writer.writeEnumValue("startMenuPinnedFolderMusic", this.getStartMenuPinnedFolderMusic());
        writer.writeEnumValue("startMenuPinnedFolderNetwork", this.getStartMenuPinnedFolderNetwork());
        writer.writeEnumValue("startMenuPinnedFolderPersonalFolder", this.getStartMenuPinnedFolderPersonalFolder());
        writer.writeEnumValue("startMenuPinnedFolderPictures", this.getStartMenuPinnedFolderPictures());
        writer.writeEnumValue("startMenuPinnedFolderSettings", this.getStartMenuPinnedFolderSettings());
        writer.writeEnumValue("startMenuPinnedFolderVideos", this.getStartMenuPinnedFolderVideos());
        writer.writeBooleanValue("storageBlockRemovableStorage", this.getStorageBlockRemovableStorage());
        writer.writeBooleanValue("storageRequireMobileDeviceEncryption", this.getStorageRequireMobileDeviceEncryption());
        writer.writeBooleanValue("storageRestrictAppDataToSystemVolume", this.getStorageRestrictAppDataToSystemVolume());
        writer.writeBooleanValue("storageRestrictAppInstallToSystemVolume", this.getStorageRestrictAppInstallToSystemVolume());
        writer.writeBooleanValue("tenantLockdownRequireNetworkDuringOutOfBoxExperience", this.getTenantLockdownRequireNetworkDuringOutOfBoxExperience());
        writer.writeBooleanValue("usbBlocked", this.getUsbBlocked());
        writer.writeBooleanValue("voiceRecordingBlocked", this.getVoiceRecordingBlocked());
        writer.writeBooleanValue("webRtcBlockLocalhostIpAddress", this.getWebRtcBlockLocalhostIpAddress());
        writer.writeBooleanValue("wiFiBlockAutomaticConnectHotspots", this.getWiFiBlockAutomaticConnectHotspots());
        writer.writeBooleanValue("wiFiBlocked", this.getWiFiBlocked());
        writer.writeBooleanValue("wiFiBlockManualConfiguration", this.getWiFiBlockManualConfiguration());
        writer.writeIntegerValue("wiFiScanInterval", this.getWiFiScanInterval());
        writer.writeBooleanValue("windowsSpotlightBlockConsumerSpecificFeatures", this.getWindowsSpotlightBlockConsumerSpecificFeatures());
        writer.writeBooleanValue("windowsSpotlightBlocked", this.getWindowsSpotlightBlocked());
        writer.writeBooleanValue("windowsSpotlightBlockOnActionCenter", this.getWindowsSpotlightBlockOnActionCenter());
        writer.writeBooleanValue("windowsSpotlightBlockTailoredExperiences", this.getWindowsSpotlightBlockTailoredExperiences());
        writer.writeBooleanValue("windowsSpotlightBlockThirdPartyNotifications", this.getWindowsSpotlightBlockThirdPartyNotifications());
        writer.writeBooleanValue("windowsSpotlightBlockWelcomeExperience", this.getWindowsSpotlightBlockWelcomeExperience());
        writer.writeBooleanValue("windowsSpotlightBlockWindowsTips", this.getWindowsSpotlightBlockWindowsTips());
        writer.writeEnumValue("windowsSpotlightConfigureOnLockScreen", this.getWindowsSpotlightConfigureOnLockScreen());
        writer.writeBooleanValue("windowsStoreBlockAutoUpdate", this.getWindowsStoreBlockAutoUpdate());
        writer.writeBooleanValue("windowsStoreBlocked", this.getWindowsStoreBlocked());
        writer.writeBooleanValue("windowsStoreEnablePrivateStoreOnly", this.getWindowsStoreEnablePrivateStoreOnly());
        writer.writeBooleanValue("wirelessDisplayBlockProjectionToThisDevice", this.getWirelessDisplayBlockProjectionToThisDevice());
        writer.writeBooleanValue("wirelessDisplayBlockUserInputFromReceiver", this.getWirelessDisplayBlockUserInputFromReceiver());
        writer.writeBooleanValue("wirelessDisplayRequirePinForPairing", this.getWirelessDisplayRequirePinForPairing());
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
     * Sets the antiTheftModeBlocked property value. Indicates whether or not to block the user from selecting an AntiTheft mode preference (Windows 10 Mobile only).
     * @param value Value to set for the antiTheftModeBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAntiTheftModeBlocked(@javax.annotation.Nullable final Boolean value) {
        this.antiTheftModeBlocked = value;
    }
    /**
     * Sets the appsAllowTrustedAppsSideloading property value. State Management Setting.
     * @param value Value to set for the appsAllowTrustedAppsSideloading property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsAllowTrustedAppsSideloading(@javax.annotation.Nullable final StateManagementSetting value) {
        this.appsAllowTrustedAppsSideloading = value;
    }
    /**
     * Sets the appsBlockWindowsStoreOriginatedApps property value. Indicates whether or not to disable the launch of all apps from Windows Store that came pre-installed or were downloaded.
     * @param value Value to set for the appsBlockWindowsStoreOriginatedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsBlockWindowsStoreOriginatedApps(@javax.annotation.Nullable final Boolean value) {
        this.appsBlockWindowsStoreOriginatedApps = value;
    }
    /**
     * Sets the bluetoothAllowedServices property value. Specify a list of allowed Bluetooth services and profiles in hex formatted strings.
     * @param value Value to set for the bluetoothAllowedServices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothAllowedServices(@javax.annotation.Nullable final java.util.List<String> value) {
        this.bluetoothAllowedServices = value;
    }
    /**
     * Sets the bluetoothBlockAdvertising property value. Whether or not to Block the user from using bluetooth advertising.
     * @param value Value to set for the bluetoothBlockAdvertising property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlockAdvertising(@javax.annotation.Nullable final Boolean value) {
        this.bluetoothBlockAdvertising = value;
    }
    /**
     * Sets the bluetoothBlockDiscoverableMode property value. Whether or not to Block the user from using bluetooth discoverable mode.
     * @param value Value to set for the bluetoothBlockDiscoverableMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlockDiscoverableMode(@javax.annotation.Nullable final Boolean value) {
        this.bluetoothBlockDiscoverableMode = value;
    }
    /**
     * Sets the bluetoothBlocked property value. Whether or not to Block the user from using bluetooth.
     * @param value Value to set for the bluetoothBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlocked(@javax.annotation.Nullable final Boolean value) {
        this.bluetoothBlocked = value;
    }
    /**
     * Sets the bluetoothBlockPrePairing property value. Whether or not to block specific bundled Bluetooth peripherals to automatically pair with the host device.
     * @param value Value to set for the bluetoothBlockPrePairing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlockPrePairing(@javax.annotation.Nullable final Boolean value) {
        this.bluetoothBlockPrePairing = value;
    }
    /**
     * Sets the cameraBlocked property value. Whether or not to Block the user from accessing the camera of the device.
     * @param value Value to set for the cameraBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCameraBlocked(@javax.annotation.Nullable final Boolean value) {
        this.cameraBlocked = value;
    }
    /**
     * Sets the cellularBlockDataWhenRoaming property value. Whether or not to Block the user from using data over cellular while roaming.
     * @param value Value to set for the cellularBlockDataWhenRoaming property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockDataWhenRoaming(@javax.annotation.Nullable final Boolean value) {
        this.cellularBlockDataWhenRoaming = value;
    }
    /**
     * Sets the cellularBlockVpn property value. Whether or not to Block the user from using VPN over cellular.
     * @param value Value to set for the cellularBlockVpn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockVpn(@javax.annotation.Nullable final Boolean value) {
        this.cellularBlockVpn = value;
    }
    /**
     * Sets the cellularBlockVpnWhenRoaming property value. Whether or not to Block the user from using VPN when roaming over cellular.
     * @param value Value to set for the cellularBlockVpnWhenRoaming property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockVpnWhenRoaming(@javax.annotation.Nullable final Boolean value) {
        this.cellularBlockVpnWhenRoaming = value;
    }
    /**
     * Sets the certificatesBlockManualRootCertificateInstallation property value. Whether or not to Block the user from doing manual root certificate installation.
     * @param value Value to set for the certificatesBlockManualRootCertificateInstallation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificatesBlockManualRootCertificateInstallation(@javax.annotation.Nullable final Boolean value) {
        this.certificatesBlockManualRootCertificateInstallation = value;
    }
    /**
     * Sets the connectedDevicesServiceBlocked property value. Whether or not to block Connected Devices Service which enables discovery and connection to other devices, remote messaging, remote app sessions and other cross-device experiences.
     * @param value Value to set for the connectedDevicesServiceBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectedDevicesServiceBlocked(@javax.annotation.Nullable final Boolean value) {
        this.connectedDevicesServiceBlocked = value;
    }
    /**
     * Sets the copyPasteBlocked property value. Whether or not to Block the user from using copy paste.
     * @param value Value to set for the copyPasteBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCopyPasteBlocked(@javax.annotation.Nullable final Boolean value) {
        this.copyPasteBlocked = value;
    }
    /**
     * Sets the cortanaBlocked property value. Whether or not to Block the user from using Cortana.
     * @param value Value to set for the cortanaBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCortanaBlocked(@javax.annotation.Nullable final Boolean value) {
        this.cortanaBlocked = value;
    }
    /**
     * Sets the defenderBlockEndUserAccess property value. Whether or not to block end user access to Defender.
     * @param value Value to set for the defenderBlockEndUserAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderBlockEndUserAccess(@javax.annotation.Nullable final Boolean value) {
        this.defenderBlockEndUserAccess = value;
    }
    /**
     * Sets the defenderCloudBlockLevel property value. Possible values of Cloud Block Level
     * @param value Value to set for the defenderCloudBlockLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderCloudBlockLevel(@javax.annotation.Nullable final DefenderCloudBlockLevelType value) {
        this.defenderCloudBlockLevel = value;
    }
    /**
     * Sets the defenderDaysBeforeDeletingQuarantinedMalware property value. Number of days before deleting quarantined malware. Valid values 0 to 90
     * @param value Value to set for the defenderDaysBeforeDeletingQuarantinedMalware property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDaysBeforeDeletingQuarantinedMalware(@javax.annotation.Nullable final Integer value) {
        this.defenderDaysBeforeDeletingQuarantinedMalware = value;
    }
    /**
     * Sets the defenderDetectedMalwareActions property value. Gets or sets Defenders actions to take on detected Malware per threat level.
     * @param value Value to set for the defenderDetectedMalwareActions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDetectedMalwareActions(@javax.annotation.Nullable final DefenderDetectedMalwareActions value) {
        this.defenderDetectedMalwareActions = value;
    }
    /**
     * Sets the defenderFileExtensionsToExclude property value. File extensions to exclude from scans and real time protection.
     * @param value Value to set for the defenderFileExtensionsToExclude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderFileExtensionsToExclude(@javax.annotation.Nullable final java.util.List<String> value) {
        this.defenderFileExtensionsToExclude = value;
    }
    /**
     * Sets the defenderFilesAndFoldersToExclude property value. Files and folder to exclude from scans and real time protection.
     * @param value Value to set for the defenderFilesAndFoldersToExclude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderFilesAndFoldersToExclude(@javax.annotation.Nullable final java.util.List<String> value) {
        this.defenderFilesAndFoldersToExclude = value;
    }
    /**
     * Sets the defenderMonitorFileActivity property value. Possible values for monitoring file activity.
     * @param value Value to set for the defenderMonitorFileActivity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderMonitorFileActivity(@javax.annotation.Nullable final DefenderMonitorFileActivity value) {
        this.defenderMonitorFileActivity = value;
    }
    /**
     * Sets the defenderProcessesToExclude property value. Processes to exclude from scans and real time protection.
     * @param value Value to set for the defenderProcessesToExclude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderProcessesToExclude(@javax.annotation.Nullable final java.util.List<String> value) {
        this.defenderProcessesToExclude = value;
    }
    /**
     * Sets the defenderPromptForSampleSubmission property value. Possible values for prompting user for samples submission.
     * @param value Value to set for the defenderPromptForSampleSubmission property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderPromptForSampleSubmission(@javax.annotation.Nullable final DefenderPromptForSampleSubmission value) {
        this.defenderPromptForSampleSubmission = value;
    }
    /**
     * Sets the defenderRequireBehaviorMonitoring property value. Indicates whether or not to require behavior monitoring.
     * @param value Value to set for the defenderRequireBehaviorMonitoring property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderRequireBehaviorMonitoring(@javax.annotation.Nullable final Boolean value) {
        this.defenderRequireBehaviorMonitoring = value;
    }
    /**
     * Sets the defenderRequireCloudProtection property value. Indicates whether or not to require cloud protection.
     * @param value Value to set for the defenderRequireCloudProtection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderRequireCloudProtection(@javax.annotation.Nullable final Boolean value) {
        this.defenderRequireCloudProtection = value;
    }
    /**
     * Sets the defenderRequireNetworkInspectionSystem property value. Indicates whether or not to require network inspection system.
     * @param value Value to set for the defenderRequireNetworkInspectionSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderRequireNetworkInspectionSystem(@javax.annotation.Nullable final Boolean value) {
        this.defenderRequireNetworkInspectionSystem = value;
    }
    /**
     * Sets the defenderRequireRealTimeMonitoring property value. Indicates whether or not to require real time monitoring.
     * @param value Value to set for the defenderRequireRealTimeMonitoring property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderRequireRealTimeMonitoring(@javax.annotation.Nullable final Boolean value) {
        this.defenderRequireRealTimeMonitoring = value;
    }
    /**
     * Sets the defenderScanArchiveFiles property value. Indicates whether or not to scan archive files.
     * @param value Value to set for the defenderScanArchiveFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanArchiveFiles(@javax.annotation.Nullable final Boolean value) {
        this.defenderScanArchiveFiles = value;
    }
    /**
     * Sets the defenderScanDownloads property value. Indicates whether or not to scan downloads.
     * @param value Value to set for the defenderScanDownloads property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanDownloads(@javax.annotation.Nullable final Boolean value) {
        this.defenderScanDownloads = value;
    }
    /**
     * Sets the defenderScanIncomingMail property value. Indicates whether or not to scan incoming mail messages.
     * @param value Value to set for the defenderScanIncomingMail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanIncomingMail(@javax.annotation.Nullable final Boolean value) {
        this.defenderScanIncomingMail = value;
    }
    /**
     * Sets the defenderScanMappedNetworkDrivesDuringFullScan property value. Indicates whether or not to scan mapped network drives during full scan.
     * @param value Value to set for the defenderScanMappedNetworkDrivesDuringFullScan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanMappedNetworkDrivesDuringFullScan(@javax.annotation.Nullable final Boolean value) {
        this.defenderScanMappedNetworkDrivesDuringFullScan = value;
    }
    /**
     * Sets the defenderScanMaxCpu property value. Max CPU usage percentage during scan. Valid values 0 to 100
     * @param value Value to set for the defenderScanMaxCpu property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanMaxCpu(@javax.annotation.Nullable final Integer value) {
        this.defenderScanMaxCpu = value;
    }
    /**
     * Sets the defenderScanNetworkFiles property value. Indicates whether or not to scan files opened from a network folder.
     * @param value Value to set for the defenderScanNetworkFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanNetworkFiles(@javax.annotation.Nullable final Boolean value) {
        this.defenderScanNetworkFiles = value;
    }
    /**
     * Sets the defenderScanRemovableDrivesDuringFullScan property value. Indicates whether or not to scan removable drives during full scan.
     * @param value Value to set for the defenderScanRemovableDrivesDuringFullScan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanRemovableDrivesDuringFullScan(@javax.annotation.Nullable final Boolean value) {
        this.defenderScanRemovableDrivesDuringFullScan = value;
    }
    /**
     * Sets the defenderScanScriptsLoadedInInternetExplorer property value. Indicates whether or not to scan scripts loaded in Internet Explorer browser.
     * @param value Value to set for the defenderScanScriptsLoadedInInternetExplorer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanScriptsLoadedInInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this.defenderScanScriptsLoadedInInternetExplorer = value;
    }
    /**
     * Sets the defenderScanType property value. Possible values for system scan type.
     * @param value Value to set for the defenderScanType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanType(@javax.annotation.Nullable final DefenderScanType value) {
        this.defenderScanType = value;
    }
    /**
     * Sets the defenderScheduledQuickScanTime property value. The time to perform a daily quick scan.
     * @param value Value to set for the defenderScheduledQuickScanTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScheduledQuickScanTime(@javax.annotation.Nullable final LocalTime value) {
        this.defenderScheduledQuickScanTime = value;
    }
    /**
     * Sets the defenderScheduledScanTime property value. The defender time for the system scan.
     * @param value Value to set for the defenderScheduledScanTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScheduledScanTime(@javax.annotation.Nullable final LocalTime value) {
        this.defenderScheduledScanTime = value;
    }
    /**
     * Sets the defenderSignatureUpdateIntervalInHours property value. The signature update interval in hours. Specify 0 not to check. Valid values 0 to 24
     * @param value Value to set for the defenderSignatureUpdateIntervalInHours property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSignatureUpdateIntervalInHours(@javax.annotation.Nullable final Integer value) {
        this.defenderSignatureUpdateIntervalInHours = value;
    }
    /**
     * Sets the defenderSystemScanSchedule property value. Possible values for a weekly schedule.
     * @param value Value to set for the defenderSystemScanSchedule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSystemScanSchedule(@javax.annotation.Nullable final WeeklySchedule value) {
        this.defenderSystemScanSchedule = value;
    }
    /**
     * Sets the developerUnlockSetting property value. State Management Setting.
     * @param value Value to set for the developerUnlockSetting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeveloperUnlockSetting(@javax.annotation.Nullable final StateManagementSetting value) {
        this.developerUnlockSetting = value;
    }
    /**
     * Sets the deviceManagementBlockFactoryResetOnMobile property value. Indicates whether or not to Block the user from resetting their phone.
     * @param value Value to set for the deviceManagementBlockFactoryResetOnMobile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceManagementBlockFactoryResetOnMobile(@javax.annotation.Nullable final Boolean value) {
        this.deviceManagementBlockFactoryResetOnMobile = value;
    }
    /**
     * Sets the deviceManagementBlockManualUnenroll property value. Indicates whether or not to Block the user from doing manual un-enrollment from device management.
     * @param value Value to set for the deviceManagementBlockManualUnenroll property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceManagementBlockManualUnenroll(@javax.annotation.Nullable final Boolean value) {
        this.deviceManagementBlockManualUnenroll = value;
    }
    /**
     * Sets the diagnosticsDataSubmissionMode property value. Allow the device to send diagnostic and usage telemetry data, such as Watson.
     * @param value Value to set for the diagnosticsDataSubmissionMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiagnosticsDataSubmissionMode(@javax.annotation.Nullable final DiagnosticDataSubmissionMode value) {
        this.diagnosticsDataSubmissionMode = value;
    }
    /**
     * Sets the edgeAllowStartPagesModification property value. Allow users to change Start pages on Edge. Use the EdgeHomepageUrls to specify the Start pages that the user would see by default when they open Edge.
     * @param value Value to set for the edgeAllowStartPagesModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeAllowStartPagesModification(@javax.annotation.Nullable final Boolean value) {
        this.edgeAllowStartPagesModification = value;
    }
    /**
     * Sets the edgeBlockAccessToAboutFlags property value. Indicates whether or not to prevent access to about flags on Edge browser.
     * @param value Value to set for the edgeBlockAccessToAboutFlags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockAccessToAboutFlags(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockAccessToAboutFlags = value;
    }
    /**
     * Sets the edgeBlockAddressBarDropdown property value. Block the address bar dropdown functionality in Microsoft Edge. Disable this settings to minimize network connections from Microsoft Edge to Microsoft services.
     * @param value Value to set for the edgeBlockAddressBarDropdown property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockAddressBarDropdown(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockAddressBarDropdown = value;
    }
    /**
     * Sets the edgeBlockAutofill property value. Indicates whether or not to block auto fill.
     * @param value Value to set for the edgeBlockAutofill property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockAutofill(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockAutofill = value;
    }
    /**
     * Sets the edgeBlockCompatibilityList property value. Block Microsoft compatibility list in Microsoft Edge. This list from Microsoft helps Edge properly display sites with known compatibility issues.
     * @param value Value to set for the edgeBlockCompatibilityList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockCompatibilityList(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockCompatibilityList = value;
    }
    /**
     * Sets the edgeBlockDeveloperTools property value. Indicates whether or not to block developer tools in the Edge browser.
     * @param value Value to set for the edgeBlockDeveloperTools property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockDeveloperTools(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockDeveloperTools = value;
    }
    /**
     * Sets the edgeBlocked property value. Indicates whether or not to Block the user from using the Edge browser.
     * @param value Value to set for the edgeBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlocked(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlocked = value;
    }
    /**
     * Sets the edgeBlockExtensions property value. Indicates whether or not to block extensions in the Edge browser.
     * @param value Value to set for the edgeBlockExtensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockExtensions(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockExtensions = value;
    }
    /**
     * Sets the edgeBlockInPrivateBrowsing property value. Indicates whether or not to block InPrivate browsing on corporate networks, in the Edge browser.
     * @param value Value to set for the edgeBlockInPrivateBrowsing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockInPrivateBrowsing(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockInPrivateBrowsing = value;
    }
    /**
     * Sets the edgeBlockJavaScript property value. Indicates whether or not to Block the user from using JavaScript.
     * @param value Value to set for the edgeBlockJavaScript property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockJavaScript(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockJavaScript = value;
    }
    /**
     * Sets the edgeBlockLiveTileDataCollection property value. Block the collection of information by Microsoft for live tile creation when users pin a site to Start from Microsoft Edge.
     * @param value Value to set for the edgeBlockLiveTileDataCollection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockLiveTileDataCollection(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockLiveTileDataCollection = value;
    }
    /**
     * Sets the edgeBlockPasswordManager property value. Indicates whether or not to Block password manager.
     * @param value Value to set for the edgeBlockPasswordManager property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockPasswordManager(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockPasswordManager = value;
    }
    /**
     * Sets the edgeBlockPopups property value. Indicates whether or not to block popups.
     * @param value Value to set for the edgeBlockPopups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockPopups(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockPopups = value;
    }
    /**
     * Sets the edgeBlockSearchSuggestions property value. Indicates whether or not to block the user from using the search suggestions in the address bar.
     * @param value Value to set for the edgeBlockSearchSuggestions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockSearchSuggestions(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockSearchSuggestions = value;
    }
    /**
     * Sets the edgeBlockSendingDoNotTrackHeader property value. Indicates whether or not to Block the user from sending the do not track header.
     * @param value Value to set for the edgeBlockSendingDoNotTrackHeader property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockSendingDoNotTrackHeader(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockSendingDoNotTrackHeader = value;
    }
    /**
     * Sets the edgeBlockSendingIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. Note: the name of this property is misleading; the property is obsolete, use EdgeSendIntranetTrafficToInternetExplorer instead.
     * @param value Value to set for the edgeBlockSendingIntranetTrafficToInternetExplorer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockSendingIntranetTrafficToInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockSendingIntranetTrafficToInternetExplorer = value;
    }
    /**
     * Sets the edgeClearBrowsingDataOnExit property value. Clear browsing data on exiting Microsoft Edge.
     * @param value Value to set for the edgeClearBrowsingDataOnExit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeClearBrowsingDataOnExit(@javax.annotation.Nullable final Boolean value) {
        this.edgeClearBrowsingDataOnExit = value;
    }
    /**
     * Sets the edgeCookiePolicy property value. Possible values to specify which cookies are allowed in Microsoft Edge.
     * @param value Value to set for the edgeCookiePolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeCookiePolicy(@javax.annotation.Nullable final EdgeCookiePolicy value) {
        this.edgeCookiePolicy = value;
    }
    /**
     * Sets the edgeDisableFirstRunPage property value. Block the Microsoft web page that opens on the first use of Microsoft Edge. This policy allows enterprises, like those enrolled in zero emissions configurations, to block this page.
     * @param value Value to set for the edgeDisableFirstRunPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeDisableFirstRunPage(@javax.annotation.Nullable final Boolean value) {
        this.edgeDisableFirstRunPage = value;
    }
    /**
     * Sets the edgeEnterpriseModeSiteListLocation property value. Indicates the enterprise mode site list location. Could be a local file, local network or http location.
     * @param value Value to set for the edgeEnterpriseModeSiteListLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeEnterpriseModeSiteListLocation(@javax.annotation.Nullable final String value) {
        this.edgeEnterpriseModeSiteListLocation = value;
    }
    /**
     * Sets the edgeFirstRunUrl property value. The first run URL for when Edge browser is opened for the first time.
     * @param value Value to set for the edgeFirstRunUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeFirstRunUrl(@javax.annotation.Nullable final String value) {
        this.edgeFirstRunUrl = value;
    }
    /**
     * Sets the edgeHomepageUrls property value. The list of URLs for homepages shodwn on MDM-enrolled devices on Edge browser.
     * @param value Value to set for the edgeHomepageUrls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeHomepageUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this.edgeHomepageUrls = value;
    }
    /**
     * Sets the edgeRequireSmartScreen property value. Indicates whether or not to Require the user to use the smart screen filter.
     * @param value Value to set for the edgeRequireSmartScreen property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeRequireSmartScreen(@javax.annotation.Nullable final Boolean value) {
        this.edgeRequireSmartScreen = value;
    }
    /**
     * Sets the edgeSearchEngine property value. Allows IT admins to set a default search engine for MDM-Controlled devices. Users can override this and change their default search engine provided the AllowSearchEngineCustomization policy is not set.
     * @param value Value to set for the edgeSearchEngine property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeSearchEngine(@javax.annotation.Nullable final EdgeSearchEngineBase value) {
        this.edgeSearchEngine = value;
    }
    /**
     * Sets the edgeSendIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer.
     * @param value Value to set for the edgeSendIntranetTrafficToInternetExplorer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeSendIntranetTrafficToInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this.edgeSendIntranetTrafficToInternetExplorer = value;
    }
    /**
     * Sets the edgeSyncFavoritesWithInternetExplorer property value. Enable favorites sync between Internet Explorer and Microsoft Edge. Additions, deletions, modifications and order changes to favorites are shared between browsers.
     * @param value Value to set for the edgeSyncFavoritesWithInternetExplorer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeSyncFavoritesWithInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this.edgeSyncFavoritesWithInternetExplorer = value;
    }
    /**
     * Sets the enterpriseCloudPrintDiscoveryEndPoint property value. Endpoint for discovering cloud printers.
     * @param value Value to set for the enterpriseCloudPrintDiscoveryEndPoint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseCloudPrintDiscoveryEndPoint(@javax.annotation.Nullable final String value) {
        this.enterpriseCloudPrintDiscoveryEndPoint = value;
    }
    /**
     * Sets the enterpriseCloudPrintDiscoveryMaxLimit property value. Maximum number of printers that should be queried from a discovery endpoint. This is a mobile only setting. Valid values 1 to 65535
     * @param value Value to set for the enterpriseCloudPrintDiscoveryMaxLimit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseCloudPrintDiscoveryMaxLimit(@javax.annotation.Nullable final Integer value) {
        this.enterpriseCloudPrintDiscoveryMaxLimit = value;
    }
    /**
     * Sets the enterpriseCloudPrintMopriaDiscoveryResourceIdentifier property value. OAuth resource URI for printer discovery service as configured in Azure portal.
     * @param value Value to set for the enterpriseCloudPrintMopriaDiscoveryResourceIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier(@javax.annotation.Nullable final String value) {
        this.enterpriseCloudPrintMopriaDiscoveryResourceIdentifier = value;
    }
    /**
     * Sets the enterpriseCloudPrintOAuthAuthority property value. Authentication endpoint for acquiring OAuth tokens.
     * @param value Value to set for the enterpriseCloudPrintOAuthAuthority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseCloudPrintOAuthAuthority(@javax.annotation.Nullable final String value) {
        this.enterpriseCloudPrintOAuthAuthority = value;
    }
    /**
     * Sets the enterpriseCloudPrintOAuthClientIdentifier property value. GUID of a client application authorized to retrieve OAuth tokens from the OAuth Authority.
     * @param value Value to set for the enterpriseCloudPrintOAuthClientIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseCloudPrintOAuthClientIdentifier(@javax.annotation.Nullable final String value) {
        this.enterpriseCloudPrintOAuthClientIdentifier = value;
    }
    /**
     * Sets the enterpriseCloudPrintResourceIdentifier property value. OAuth resource URI for print service as configured in the Azure portal.
     * @param value Value to set for the enterpriseCloudPrintResourceIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseCloudPrintResourceIdentifier(@javax.annotation.Nullable final String value) {
        this.enterpriseCloudPrintResourceIdentifier = value;
    }
    /**
     * Sets the experienceBlockDeviceDiscovery property value. Indicates whether or not to enable device discovery UX.
     * @param value Value to set for the experienceBlockDeviceDiscovery property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExperienceBlockDeviceDiscovery(@javax.annotation.Nullable final Boolean value) {
        this.experienceBlockDeviceDiscovery = value;
    }
    /**
     * Sets the experienceBlockErrorDialogWhenNoSIM property value. Indicates whether or not to allow the error dialog from displaying if no SIM card is detected.
     * @param value Value to set for the experienceBlockErrorDialogWhenNoSIM property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExperienceBlockErrorDialogWhenNoSIM(@javax.annotation.Nullable final Boolean value) {
        this.experienceBlockErrorDialogWhenNoSIM = value;
    }
    /**
     * Sets the experienceBlockTaskSwitcher property value. Indicates whether or not to enable task switching on the device.
     * @param value Value to set for the experienceBlockTaskSwitcher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExperienceBlockTaskSwitcher(@javax.annotation.Nullable final Boolean value) {
        this.experienceBlockTaskSwitcher = value;
    }
    /**
     * Sets the gameDvrBlocked property value. Indicates whether or not to block DVR and broadcasting.
     * @param value Value to set for the gameDvrBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGameDvrBlocked(@javax.annotation.Nullable final Boolean value) {
        this.gameDvrBlocked = value;
    }
    /**
     * Sets the internetSharingBlocked property value. Indicates whether or not to Block the user from using internet sharing.
     * @param value Value to set for the internetSharingBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInternetSharingBlocked(@javax.annotation.Nullable final Boolean value) {
        this.internetSharingBlocked = value;
    }
    /**
     * Sets the locationServicesBlocked property value. Indicates whether or not to Block the user from location services.
     * @param value Value to set for the locationServicesBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocationServicesBlocked(@javax.annotation.Nullable final Boolean value) {
        this.locationServicesBlocked = value;
    }
    /**
     * Sets the lockScreenAllowTimeoutConfiguration property value. Specify whether to show a user-configurable setting to control the screen timeout while on the lock screen of Windows 10 Mobile devices. If this policy is set to Allow, the value set by lockScreenTimeoutInSeconds is ignored.
     * @param value Value to set for the lockScreenAllowTimeoutConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenAllowTimeoutConfiguration(@javax.annotation.Nullable final Boolean value) {
        this.lockScreenAllowTimeoutConfiguration = value;
    }
    /**
     * Sets the lockScreenBlockActionCenterNotifications property value. Indicates whether or not to block action center notifications over lock screen.
     * @param value Value to set for the lockScreenBlockActionCenterNotifications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenBlockActionCenterNotifications(@javax.annotation.Nullable final Boolean value) {
        this.lockScreenBlockActionCenterNotifications = value;
    }
    /**
     * Sets the lockScreenBlockCortana property value. Indicates whether or not the user can interact with Cortana using speech while the system is locked.
     * @param value Value to set for the lockScreenBlockCortana property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenBlockCortana(@javax.annotation.Nullable final Boolean value) {
        this.lockScreenBlockCortana = value;
    }
    /**
     * Sets the lockScreenBlockToastNotifications property value. Indicates whether to allow toast notifications above the device lock screen.
     * @param value Value to set for the lockScreenBlockToastNotifications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenBlockToastNotifications(@javax.annotation.Nullable final Boolean value) {
        this.lockScreenBlockToastNotifications = value;
    }
    /**
     * Sets the lockScreenTimeoutInSeconds property value. Set the duration (in seconds) from the screen locking to the screen turning off for Windows 10 Mobile devices. Supported values are 11-1800. Valid values 11 to 1800
     * @param value Value to set for the lockScreenTimeoutInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenTimeoutInSeconds(@javax.annotation.Nullable final Integer value) {
        this.lockScreenTimeoutInSeconds = value;
    }
    /**
     * Sets the logonBlockFastUserSwitching property value. Disables the ability to quickly switch between users that are logged on simultaneously without logging off.
     * @param value Value to set for the logonBlockFastUserSwitching property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogonBlockFastUserSwitching(@javax.annotation.Nullable final Boolean value) {
        this.logonBlockFastUserSwitching = value;
    }
    /**
     * Sets the microsoftAccountBlocked property value. Indicates whether or not to Block a Microsoft account.
     * @param value Value to set for the microsoftAccountBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftAccountBlocked(@javax.annotation.Nullable final Boolean value) {
        this.microsoftAccountBlocked = value;
    }
    /**
     * Sets the microsoftAccountBlockSettingsSync property value. Indicates whether or not to Block Microsoft account settings sync.
     * @param value Value to set for the microsoftAccountBlockSettingsSync property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftAccountBlockSettingsSync(@javax.annotation.Nullable final Boolean value) {
        this.microsoftAccountBlockSettingsSync = value;
    }
    /**
     * Sets the networkProxyApplySettingsDeviceWide property value. If set, proxy settings will be applied to all processes and accounts in the device. Otherwise, it will be applied to the user account thats enrolled into MDM.
     * @param value Value to set for the networkProxyApplySettingsDeviceWide property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkProxyApplySettingsDeviceWide(@javax.annotation.Nullable final Boolean value) {
        this.networkProxyApplySettingsDeviceWide = value;
    }
    /**
     * Sets the networkProxyAutomaticConfigurationUrl property value. Address to the proxy auto-config (PAC) script you want to use.
     * @param value Value to set for the networkProxyAutomaticConfigurationUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkProxyAutomaticConfigurationUrl(@javax.annotation.Nullable final String value) {
        this.networkProxyAutomaticConfigurationUrl = value;
    }
    /**
     * Sets the networkProxyDisableAutoDetect property value. Disable automatic detection of settings. If enabled, the system will try to find the path to a proxy auto-config (PAC) script.
     * @param value Value to set for the networkProxyDisableAutoDetect property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkProxyDisableAutoDetect(@javax.annotation.Nullable final Boolean value) {
        this.networkProxyDisableAutoDetect = value;
    }
    /**
     * Sets the networkProxyServer property value. Specifies manual proxy server settings.
     * @param value Value to set for the networkProxyServer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkProxyServer(@javax.annotation.Nullable final Windows10NetworkProxyServer value) {
        this.networkProxyServer = value;
    }
    /**
     * Sets the nfcBlocked property value. Indicates whether or not to Block the user from using near field communication.
     * @param value Value to set for the nfcBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNfcBlocked(@javax.annotation.Nullable final Boolean value) {
        this.nfcBlocked = value;
    }
    /**
     * Sets the oneDriveDisableFileSync property value. Gets or sets a value allowing IT admins to prevent apps and features from working with files on OneDrive.
     * @param value Value to set for the oneDriveDisableFileSync property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOneDriveDisableFileSync(@javax.annotation.Nullable final Boolean value) {
        this.oneDriveDisableFileSync = value;
    }
    /**
     * Sets the passwordBlockSimple property value. Specify whether PINs or passwords such as '1111' or '1234' are allowed. For Windows 10 desktops, it also controls the use of picture passwords.
     * @param value Value to set for the passwordBlockSimple property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockSimple(@javax.annotation.Nullable final Boolean value) {
        this.passwordBlockSimple = value;
    }
    /**
     * Sets the passwordExpirationDays property value. The password expiration in days. Valid values 0 to 730
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
     * Sets the passwordMinimumLength property value. The minimum password length. Valid values 4 to 16
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
     * Sets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent reuse of. Valid values 0 to 50
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordPreviousPasswordBlockCount(@javax.annotation.Nullable final Integer value) {
        this.passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequired property value. Indicates whether or not to require the user to have a password.
     * @param value Value to set for the passwordRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequired(@javax.annotation.Nullable final Boolean value) {
        this.passwordRequired = value;
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
     * Sets the passwordRequireWhenResumeFromIdleState property value. Indicates whether or not to require a password upon resuming from an idle state.
     * @param value Value to set for the passwordRequireWhenResumeFromIdleState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequireWhenResumeFromIdleState(@javax.annotation.Nullable final Boolean value) {
        this.passwordRequireWhenResumeFromIdleState = value;
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. The number of sign in failures before factory reset. Valid values 0 to 999
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordSignInFailureCountBeforeFactoryReset(@javax.annotation.Nullable final Integer value) {
        this.passwordSignInFailureCountBeforeFactoryReset = value;
    }
    /**
     * Sets the personalizationDesktopImageUrl property value. A http or https Url to a jpg, jpeg or png image that needs to be downloaded and used as the Desktop Image or a file Url to a local image on the file system that needs to used as the Desktop Image.
     * @param value Value to set for the personalizationDesktopImageUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalizationDesktopImageUrl(@javax.annotation.Nullable final String value) {
        this.personalizationDesktopImageUrl = value;
    }
    /**
     * Sets the personalizationLockScreenImageUrl property value. A http or https Url to a jpg, jpeg or png image that neeeds to be downloaded and used as the Lock Screen Image or a file Url to a local image on the file system that needs to be used as the Lock Screen Image.
     * @param value Value to set for the personalizationLockScreenImageUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalizationLockScreenImageUrl(@javax.annotation.Nullable final String value) {
        this.personalizationLockScreenImageUrl = value;
    }
    /**
     * Sets the privacyAdvertisingId property value. State Management Setting.
     * @param value Value to set for the privacyAdvertisingId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyAdvertisingId(@javax.annotation.Nullable final StateManagementSetting value) {
        this.privacyAdvertisingId = value;
    }
    /**
     * Sets the privacyAutoAcceptPairingAndConsentPrompts property value. Indicates whether or not to allow the automatic acceptance of the pairing and privacy user consent dialog when launching apps.
     * @param value Value to set for the privacyAutoAcceptPairingAndConsentPrompts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyAutoAcceptPairingAndConsentPrompts(@javax.annotation.Nullable final Boolean value) {
        this.privacyAutoAcceptPairingAndConsentPrompts = value;
    }
    /**
     * Sets the privacyBlockInputPersonalization property value. Indicates whether or not to block the usage of cloud based speech services for Cortana, Dictation, or Store applications.
     * @param value Value to set for the privacyBlockInputPersonalization property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyBlockInputPersonalization(@javax.annotation.Nullable final Boolean value) {
        this.privacyBlockInputPersonalization = value;
    }
    /**
     * Sets the resetProtectionModeBlocked property value. Indicates whether or not to Block the user from reset protection mode.
     * @param value Value to set for the resetProtectionModeBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResetProtectionModeBlocked(@javax.annotation.Nullable final Boolean value) {
        this.resetProtectionModeBlocked = value;
    }
    /**
     * Sets the safeSearchFilter property value. Specifies what level of safe search (filtering adult content) is required
     * @param value Value to set for the safeSearchFilter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSafeSearchFilter(@javax.annotation.Nullable final SafeSearchFilterType value) {
        this.safeSearchFilter = value;
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to Block the user from taking Screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScreenCaptureBlocked(@javax.annotation.Nullable final Boolean value) {
        this.screenCaptureBlocked = value;
    }
    /**
     * Sets the searchBlockDiacritics property value. Specifies if search can use diacritics.
     * @param value Value to set for the searchBlockDiacritics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchBlockDiacritics(@javax.annotation.Nullable final Boolean value) {
        this.searchBlockDiacritics = value;
    }
    /**
     * Sets the searchDisableAutoLanguageDetection property value. Specifies whether to use automatic language detection when indexing content and properties.
     * @param value Value to set for the searchDisableAutoLanguageDetection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchDisableAutoLanguageDetection(@javax.annotation.Nullable final Boolean value) {
        this.searchDisableAutoLanguageDetection = value;
    }
    /**
     * Sets the searchDisableIndexerBackoff property value. Indicates whether or not to disable the search indexer backoff feature.
     * @param value Value to set for the searchDisableIndexerBackoff property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchDisableIndexerBackoff(@javax.annotation.Nullable final Boolean value) {
        this.searchDisableIndexerBackoff = value;
    }
    /**
     * Sets the searchDisableIndexingEncryptedItems property value. Indicates whether or not to block indexing of WIP-protected items to prevent them from appearing in search results for Cortana or Explorer.
     * @param value Value to set for the searchDisableIndexingEncryptedItems property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchDisableIndexingEncryptedItems(@javax.annotation.Nullable final Boolean value) {
        this.searchDisableIndexingEncryptedItems = value;
    }
    /**
     * Sets the searchDisableIndexingRemovableDrive property value. Indicates whether or not to allow users to add locations on removable drives to libraries and to be indexed.
     * @param value Value to set for the searchDisableIndexingRemovableDrive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchDisableIndexingRemovableDrive(@javax.annotation.Nullable final Boolean value) {
        this.searchDisableIndexingRemovableDrive = value;
    }
    /**
     * Sets the searchEnableAutomaticIndexSizeManangement property value. Specifies minimum amount of hard drive space on the same drive as the index location before indexing stops.
     * @param value Value to set for the searchEnableAutomaticIndexSizeManangement property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchEnableAutomaticIndexSizeManangement(@javax.annotation.Nullable final Boolean value) {
        this.searchEnableAutomaticIndexSizeManangement = value;
    }
    /**
     * Sets the searchEnableRemoteQueries property value. Indicates whether or not to block remote queries of this computers index.
     * @param value Value to set for the searchEnableRemoteQueries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchEnableRemoteQueries(@javax.annotation.Nullable final Boolean value) {
        this.searchEnableRemoteQueries = value;
    }
    /**
     * Sets the settingsBlockAccountsPage property value. Indicates whether or not to block access to Accounts in Settings app.
     * @param value Value to set for the settingsBlockAccountsPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockAccountsPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockAccountsPage = value;
    }
    /**
     * Sets the settingsBlockAddProvisioningPackage property value. Indicates whether or not to block the user from installing provisioning packages.
     * @param value Value to set for the settingsBlockAddProvisioningPackage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockAddProvisioningPackage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockAddProvisioningPackage = value;
    }
    /**
     * Sets the settingsBlockAppsPage property value. Indicates whether or not to block access to Apps in Settings app.
     * @param value Value to set for the settingsBlockAppsPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockAppsPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockAppsPage = value;
    }
    /**
     * Sets the settingsBlockChangeLanguage property value. Indicates whether or not to block the user from changing the language settings.
     * @param value Value to set for the settingsBlockChangeLanguage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockChangeLanguage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockChangeLanguage = value;
    }
    /**
     * Sets the settingsBlockChangePowerSleep property value. Indicates whether or not to block the user from changing power and sleep settings.
     * @param value Value to set for the settingsBlockChangePowerSleep property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockChangePowerSleep(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockChangePowerSleep = value;
    }
    /**
     * Sets the settingsBlockChangeRegion property value. Indicates whether or not to block the user from changing the region settings.
     * @param value Value to set for the settingsBlockChangeRegion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockChangeRegion(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockChangeRegion = value;
    }
    /**
     * Sets the settingsBlockChangeSystemTime property value. Indicates whether or not to block the user from changing date and time settings.
     * @param value Value to set for the settingsBlockChangeSystemTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockChangeSystemTime(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockChangeSystemTime = value;
    }
    /**
     * Sets the settingsBlockDevicesPage property value. Indicates whether or not to block access to Devices in Settings app.
     * @param value Value to set for the settingsBlockDevicesPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockDevicesPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockDevicesPage = value;
    }
    /**
     * Sets the settingsBlockEaseOfAccessPage property value. Indicates whether or not to block access to Ease of Access in Settings app.
     * @param value Value to set for the settingsBlockEaseOfAccessPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockEaseOfAccessPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockEaseOfAccessPage = value;
    }
    /**
     * Sets the settingsBlockEditDeviceName property value. Indicates whether or not to block the user from editing the device name.
     * @param value Value to set for the settingsBlockEditDeviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockEditDeviceName(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockEditDeviceName = value;
    }
    /**
     * Sets the settingsBlockGamingPage property value. Indicates whether or not to block access to Gaming in Settings app.
     * @param value Value to set for the settingsBlockGamingPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockGamingPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockGamingPage = value;
    }
    /**
     * Sets the settingsBlockNetworkInternetPage property value. Indicates whether or not to block access to Network & Internet in Settings app.
     * @param value Value to set for the settingsBlockNetworkInternetPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockNetworkInternetPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockNetworkInternetPage = value;
    }
    /**
     * Sets the settingsBlockPersonalizationPage property value. Indicates whether or not to block access to Personalization in Settings app.
     * @param value Value to set for the settingsBlockPersonalizationPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockPersonalizationPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockPersonalizationPage = value;
    }
    /**
     * Sets the settingsBlockPrivacyPage property value. Indicates whether or not to block access to Privacy in Settings app.
     * @param value Value to set for the settingsBlockPrivacyPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockPrivacyPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockPrivacyPage = value;
    }
    /**
     * Sets the settingsBlockRemoveProvisioningPackage property value. Indicates whether or not to block the runtime configuration agent from removing provisioning packages.
     * @param value Value to set for the settingsBlockRemoveProvisioningPackage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockRemoveProvisioningPackage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockRemoveProvisioningPackage = value;
    }
    /**
     * Sets the settingsBlockSettingsApp property value. Indicates whether or not to block access to Settings app.
     * @param value Value to set for the settingsBlockSettingsApp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockSettingsApp(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockSettingsApp = value;
    }
    /**
     * Sets the settingsBlockSystemPage property value. Indicates whether or not to block access to System in Settings app.
     * @param value Value to set for the settingsBlockSystemPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockSystemPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockSystemPage = value;
    }
    /**
     * Sets the settingsBlockTimeLanguagePage property value. Indicates whether or not to block access to Time & Language in Settings app.
     * @param value Value to set for the settingsBlockTimeLanguagePage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockTimeLanguagePage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockTimeLanguagePage = value;
    }
    /**
     * Sets the settingsBlockUpdateSecurityPage property value. Indicates whether or not to block access to Update & Security in Settings app.
     * @param value Value to set for the settingsBlockUpdateSecurityPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockUpdateSecurityPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockUpdateSecurityPage = value;
    }
    /**
     * Sets the sharedUserAppDataAllowed property value. Indicates whether or not to block multiple users of the same app to share data.
     * @param value Value to set for the sharedUserAppDataAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedUserAppDataAllowed(@javax.annotation.Nullable final Boolean value) {
        this.sharedUserAppDataAllowed = value;
    }
    /**
     * Sets the smartScreenBlockPromptOverride property value. Indicates whether or not users can override SmartScreen Filter warnings about potentially malicious websites.
     * @param value Value to set for the smartScreenBlockPromptOverride property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmartScreenBlockPromptOverride(@javax.annotation.Nullable final Boolean value) {
        this.smartScreenBlockPromptOverride = value;
    }
    /**
     * Sets the smartScreenBlockPromptOverrideForFiles property value. Indicates whether or not users can override the SmartScreen Filter warnings about downloading unverified files
     * @param value Value to set for the smartScreenBlockPromptOverrideForFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmartScreenBlockPromptOverrideForFiles(@javax.annotation.Nullable final Boolean value) {
        this.smartScreenBlockPromptOverrideForFiles = value;
    }
    /**
     * Sets the smartScreenEnableAppInstallControl property value. This property will be deprecated in July 2019 and will be replaced by property SmartScreenAppInstallControl. Allows IT Admins to control whether users are allowed to install apps from places other than the Store.
     * @param value Value to set for the smartScreenEnableAppInstallControl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmartScreenEnableAppInstallControl(@javax.annotation.Nullable final Boolean value) {
        this.smartScreenEnableAppInstallControl = value;
    }
    /**
     * Sets the startBlockUnpinningAppsFromTaskbar property value. Indicates whether or not to block the user from unpinning apps from taskbar.
     * @param value Value to set for the startBlockUnpinningAppsFromTaskbar property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartBlockUnpinningAppsFromTaskbar(@javax.annotation.Nullable final Boolean value) {
        this.startBlockUnpinningAppsFromTaskbar = value;
    }
    /**
     * Sets the startMenuAppListVisibility property value. Type of start menu app list visibility.
     * @param value Value to set for the startMenuAppListVisibility property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuAppListVisibility(@javax.annotation.Nullable final WindowsStartMenuAppListVisibilityType value) {
        this.startMenuAppListVisibility = value;
    }
    /**
     * Sets the startMenuHideChangeAccountSettings property value. Enabling this policy hides the change account setting from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideChangeAccountSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideChangeAccountSettings(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideChangeAccountSettings = value;
    }
    /**
     * Sets the startMenuHideFrequentlyUsedApps property value. Enabling this policy hides the most used apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @param value Value to set for the startMenuHideFrequentlyUsedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideFrequentlyUsedApps(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideFrequentlyUsedApps = value;
    }
    /**
     * Sets the startMenuHideHibernate property value. Enabling this policy hides hibernate from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideHibernate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideHibernate(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideHibernate = value;
    }
    /**
     * Sets the startMenuHideLock property value. Enabling this policy hides lock from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideLock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideLock(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideLock = value;
    }
    /**
     * Sets the startMenuHidePowerButton property value. Enabling this policy hides the power button from appearing in the start menu.
     * @param value Value to set for the startMenuHidePowerButton property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHidePowerButton(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHidePowerButton = value;
    }
    /**
     * Sets the startMenuHideRecentJumpLists property value. Enabling this policy hides recent jump lists from appearing on the start menu/taskbar and disables the corresponding toggle in the Settings app.
     * @param value Value to set for the startMenuHideRecentJumpLists property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideRecentJumpLists(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideRecentJumpLists = value;
    }
    /**
     * Sets the startMenuHideRecentlyAddedApps property value. Enabling this policy hides recently added apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @param value Value to set for the startMenuHideRecentlyAddedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideRecentlyAddedApps(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideRecentlyAddedApps = value;
    }
    /**
     * Sets the startMenuHideRestartOptions property value. Enabling this policy hides 'Restart/Update and Restart' from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideRestartOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideRestartOptions(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideRestartOptions = value;
    }
    /**
     * Sets the startMenuHideShutDown property value. Enabling this policy hides shut down/update and shut down from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideShutDown property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideShutDown(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideShutDown = value;
    }
    /**
     * Sets the startMenuHideSignOut property value. Enabling this policy hides sign out from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideSignOut property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideSignOut(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideSignOut = value;
    }
    /**
     * Sets the startMenuHideSleep property value. Enabling this policy hides sleep from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideSleep property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideSleep(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideSleep = value;
    }
    /**
     * Sets the startMenuHideSwitchAccount property value. Enabling this policy hides switch account from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideSwitchAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideSwitchAccount(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideSwitchAccount = value;
    }
    /**
     * Sets the startMenuHideUserTile property value. Enabling this policy hides the user tile from appearing in the start menu.
     * @param value Value to set for the startMenuHideUserTile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideUserTile(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideUserTile = value;
    }
    /**
     * Sets the startMenuLayoutEdgeAssetsXml property value. This policy setting allows you to import Edge assets to be used with startMenuLayoutXml policy. Start layout can contain secondary tile from Edge app which looks for Edge local asset file. Edge local asset would not exist and cause Edge secondary tile to appear empty in this case. This policy only gets applied when startMenuLayoutXml policy is modified. The value should be a UTF-8 Base64 encoded byte array.
     * @param value Value to set for the startMenuLayoutEdgeAssetsXml property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuLayoutEdgeAssetsXml(@javax.annotation.Nullable final byte[] value) {
        this.startMenuLayoutEdgeAssetsXml = value;
    }
    /**
     * Sets the startMenuLayoutXml property value. Allows admins to override the default Start menu layout and prevents the user from changing it. The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in a UTF8 encoded byte array format.
     * @param value Value to set for the startMenuLayoutXml property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuLayoutXml(@javax.annotation.Nullable final byte[] value) {
        this.startMenuLayoutXml = value;
    }
    /**
     * Sets the startMenuMode property value. Type of display modes for the start menu.
     * @param value Value to set for the startMenuMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuMode(@javax.annotation.Nullable final WindowsStartMenuModeType value) {
        this.startMenuMode = value;
    }
    /**
     * Sets the startMenuPinnedFolderDocuments property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderDocuments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderDocuments(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderDocuments = value;
    }
    /**
     * Sets the startMenuPinnedFolderDownloads property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderDownloads property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderDownloads(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderDownloads = value;
    }
    /**
     * Sets the startMenuPinnedFolderFileExplorer property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderFileExplorer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderFileExplorer(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderFileExplorer = value;
    }
    /**
     * Sets the startMenuPinnedFolderHomeGroup property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderHomeGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderHomeGroup(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderHomeGroup = value;
    }
    /**
     * Sets the startMenuPinnedFolderMusic property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderMusic property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderMusic(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderMusic = value;
    }
    /**
     * Sets the startMenuPinnedFolderNetwork property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderNetwork property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderNetwork(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderNetwork = value;
    }
    /**
     * Sets the startMenuPinnedFolderPersonalFolder property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderPersonalFolder property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderPersonalFolder(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderPersonalFolder = value;
    }
    /**
     * Sets the startMenuPinnedFolderPictures property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderPictures property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderPictures(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderPictures = value;
    }
    /**
     * Sets the startMenuPinnedFolderSettings property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderSettings(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderSettings = value;
    }
    /**
     * Sets the startMenuPinnedFolderVideos property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderVideos property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderVideos(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderVideos = value;
    }
    /**
     * Sets the storageBlockRemovableStorage property value. Indicates whether or not to Block the user from using removable storage.
     * @param value Value to set for the storageBlockRemovableStorage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageBlockRemovableStorage(@javax.annotation.Nullable final Boolean value) {
        this.storageBlockRemovableStorage = value;
    }
    /**
     * Sets the storageRequireMobileDeviceEncryption property value. Indicating whether or not to require encryption on a mobile device.
     * @param value Value to set for the storageRequireMobileDeviceEncryption property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageRequireMobileDeviceEncryption(@javax.annotation.Nullable final Boolean value) {
        this.storageRequireMobileDeviceEncryption = value;
    }
    /**
     * Sets the storageRestrictAppDataToSystemVolume property value. Indicates whether application data is restricted to the system drive.
     * @param value Value to set for the storageRestrictAppDataToSystemVolume property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageRestrictAppDataToSystemVolume(@javax.annotation.Nullable final Boolean value) {
        this.storageRestrictAppDataToSystemVolume = value;
    }
    /**
     * Sets the storageRestrictAppInstallToSystemVolume property value. Indicates whether the installation of applications is restricted to the system drive.
     * @param value Value to set for the storageRestrictAppInstallToSystemVolume property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageRestrictAppInstallToSystemVolume(@javax.annotation.Nullable final Boolean value) {
        this.storageRestrictAppInstallToSystemVolume = value;
    }
    /**
     * Sets the tenantLockdownRequireNetworkDuringOutOfBoxExperience property value. Whether the device is required to connect to the network.
     * @param value Value to set for the tenantLockdownRequireNetworkDuringOutOfBoxExperience property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantLockdownRequireNetworkDuringOutOfBoxExperience(@javax.annotation.Nullable final Boolean value) {
        this.tenantLockdownRequireNetworkDuringOutOfBoxExperience = value;
    }
    /**
     * Sets the usbBlocked property value. Indicates whether or not to Block the user from USB connection.
     * @param value Value to set for the usbBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsbBlocked(@javax.annotation.Nullable final Boolean value) {
        this.usbBlocked = value;
    }
    /**
     * Sets the voiceRecordingBlocked property value. Indicates whether or not to Block the user from voice recording.
     * @param value Value to set for the voiceRecordingBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVoiceRecordingBlocked(@javax.annotation.Nullable final Boolean value) {
        this.voiceRecordingBlocked = value;
    }
    /**
     * Sets the webRtcBlockLocalhostIpAddress property value. Indicates whether or not user's localhost IP address is displayed while making phone calls using the WebRTC
     * @param value Value to set for the webRtcBlockLocalhostIpAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebRtcBlockLocalhostIpAddress(@javax.annotation.Nullable final Boolean value) {
        this.webRtcBlockLocalhostIpAddress = value;
    }
    /**
     * Sets the wiFiBlockAutomaticConnectHotspots property value. Indicating whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
     * @param value Value to set for the wiFiBlockAutomaticConnectHotspots property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWiFiBlockAutomaticConnectHotspots(@javax.annotation.Nullable final Boolean value) {
        this.wiFiBlockAutomaticConnectHotspots = value;
    }
    /**
     * Sets the wiFiBlocked property value. Indicates whether or not to Block the user from using Wi-Fi.
     * @param value Value to set for the wiFiBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWiFiBlocked(@javax.annotation.Nullable final Boolean value) {
        this.wiFiBlocked = value;
    }
    /**
     * Sets the wiFiBlockManualConfiguration property value. Indicates whether or not to Block the user from using Wi-Fi manual configuration.
     * @param value Value to set for the wiFiBlockManualConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWiFiBlockManualConfiguration(@javax.annotation.Nullable final Boolean value) {
        this.wiFiBlockManualConfiguration = value;
    }
    /**
     * Sets the wiFiScanInterval property value. Specify how often devices scan for Wi-Fi networks. Supported values are 1-500, where 100 = default, and 500 = low frequency. Valid values 1 to 500
     * @param value Value to set for the wiFiScanInterval property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWiFiScanInterval(@javax.annotation.Nullable final Integer value) {
        this.wiFiScanInterval = value;
    }
    /**
     * Sets the windowsSpotlightBlockConsumerSpecificFeatures property value. Allows IT admins to block experiences that are typically for consumers only, such as Start suggestions, Membership notifications, Post-OOBE app install and redirect tiles.
     * @param value Value to set for the windowsSpotlightBlockConsumerSpecificFeatures property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlockConsumerSpecificFeatures(@javax.annotation.Nullable final Boolean value) {
        this.windowsSpotlightBlockConsumerSpecificFeatures = value;
    }
    /**
     * Sets the windowsSpotlightBlocked property value. Allows IT admins to turn off all Windows Spotlight features
     * @param value Value to set for the windowsSpotlightBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlocked(@javax.annotation.Nullable final Boolean value) {
        this.windowsSpotlightBlocked = value;
    }
    /**
     * Sets the windowsSpotlightBlockOnActionCenter property value. Block suggestions from Microsoft that show after each OS clean install, upgrade or in an on-going basis to introduce users to what is new or changed
     * @param value Value to set for the windowsSpotlightBlockOnActionCenter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlockOnActionCenter(@javax.annotation.Nullable final Boolean value) {
        this.windowsSpotlightBlockOnActionCenter = value;
    }
    /**
     * Sets the windowsSpotlightBlockTailoredExperiences property value. Block personalized content in Windows spotlight based on users device usage.
     * @param value Value to set for the windowsSpotlightBlockTailoredExperiences property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlockTailoredExperiences(@javax.annotation.Nullable final Boolean value) {
        this.windowsSpotlightBlockTailoredExperiences = value;
    }
    /**
     * Sets the windowsSpotlightBlockThirdPartyNotifications property value. Block third party content delivered via Windows Spotlight
     * @param value Value to set for the windowsSpotlightBlockThirdPartyNotifications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlockThirdPartyNotifications(@javax.annotation.Nullable final Boolean value) {
        this.windowsSpotlightBlockThirdPartyNotifications = value;
    }
    /**
     * Sets the windowsSpotlightBlockWelcomeExperience property value. Block Windows Spotlight Windows welcome experience
     * @param value Value to set for the windowsSpotlightBlockWelcomeExperience property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlockWelcomeExperience(@javax.annotation.Nullable final Boolean value) {
        this.windowsSpotlightBlockWelcomeExperience = value;
    }
    /**
     * Sets the windowsSpotlightBlockWindowsTips property value. Allows IT admins to turn off the popup of Windows Tips.
     * @param value Value to set for the windowsSpotlightBlockWindowsTips property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlockWindowsTips(@javax.annotation.Nullable final Boolean value) {
        this.windowsSpotlightBlockWindowsTips = value;
    }
    /**
     * Sets the windowsSpotlightConfigureOnLockScreen property value. Allows IT admind to set a predefined default search engine for MDM-Controlled devices
     * @param value Value to set for the windowsSpotlightConfigureOnLockScreen property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightConfigureOnLockScreen(@javax.annotation.Nullable final WindowsSpotlightEnablementSettings value) {
        this.windowsSpotlightConfigureOnLockScreen = value;
    }
    /**
     * Sets the windowsStoreBlockAutoUpdate property value. Indicates whether or not to block automatic update of apps from Windows Store.
     * @param value Value to set for the windowsStoreBlockAutoUpdate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsStoreBlockAutoUpdate(@javax.annotation.Nullable final Boolean value) {
        this.windowsStoreBlockAutoUpdate = value;
    }
    /**
     * Sets the windowsStoreBlocked property value. Indicates whether or not to Block the user from using the Windows store.
     * @param value Value to set for the windowsStoreBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsStoreBlocked(@javax.annotation.Nullable final Boolean value) {
        this.windowsStoreBlocked = value;
    }
    /**
     * Sets the windowsStoreEnablePrivateStoreOnly property value. Indicates whether or not to enable Private Store Only.
     * @param value Value to set for the windowsStoreEnablePrivateStoreOnly property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsStoreEnablePrivateStoreOnly(@javax.annotation.Nullable final Boolean value) {
        this.windowsStoreEnablePrivateStoreOnly = value;
    }
    /**
     * Sets the wirelessDisplayBlockProjectionToThisDevice property value. Indicates whether or not to allow other devices from discovering this PC for projection.
     * @param value Value to set for the wirelessDisplayBlockProjectionToThisDevice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWirelessDisplayBlockProjectionToThisDevice(@javax.annotation.Nullable final Boolean value) {
        this.wirelessDisplayBlockProjectionToThisDevice = value;
    }
    /**
     * Sets the wirelessDisplayBlockUserInputFromReceiver property value. Indicates whether or not to allow user input from wireless display receiver.
     * @param value Value to set for the wirelessDisplayBlockUserInputFromReceiver property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWirelessDisplayBlockUserInputFromReceiver(@javax.annotation.Nullable final Boolean value) {
        this.wirelessDisplayBlockUserInputFromReceiver = value;
    }
    /**
     * Sets the wirelessDisplayRequirePinForPairing property value. Indicates whether or not to require a PIN for new devices to initiate pairing.
     * @param value Value to set for the wirelessDisplayRequirePinForPairing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWirelessDisplayRequirePinForPairing(@javax.annotation.Nullable final Boolean value) {
        this.wirelessDisplayRequirePinForPairing = value;
    }
}
