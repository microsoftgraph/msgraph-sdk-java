package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10GeneralConfiguration extends DeviceConfiguration implements Parsable {
    /** Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a Microsoft account. */
    private Boolean _accountsBlockAddingNonMicrosoftAccountEmail;
    /** Indicates whether or not to block the user from selecting an AntiTheft mode preference (Windows 10 Mobile only). */
    private Boolean _antiTheftModeBlocked;
    /** State Management Setting. */
    private StateManagementSetting _appsAllowTrustedAppsSideloading;
    /** Indicates whether or not to disable the launch of all apps from Windows Store that came pre-installed or were downloaded. */
    private Boolean _appsBlockWindowsStoreOriginatedApps;
    /** Specify a list of allowed Bluetooth services and profiles in hex formatted strings. */
    private java.util.List<String> _bluetoothAllowedServices;
    /** Whether or not to Block the user from using bluetooth advertising. */
    private Boolean _bluetoothBlockAdvertising;
    /** Whether or not to Block the user from using bluetooth discoverable mode. */
    private Boolean _bluetoothBlockDiscoverableMode;
    /** Whether or not to Block the user from using bluetooth. */
    private Boolean _bluetoothBlocked;
    /** Whether or not to block specific bundled Bluetooth peripherals to automatically pair with the host device. */
    private Boolean _bluetoothBlockPrePairing;
    /** Whether or not to Block the user from accessing the camera of the device. */
    private Boolean _cameraBlocked;
    /** Whether or not to Block the user from using data over cellular while roaming. */
    private Boolean _cellularBlockDataWhenRoaming;
    /** Whether or not to Block the user from using VPN over cellular. */
    private Boolean _cellularBlockVpn;
    /** Whether or not to Block the user from using VPN when roaming over cellular. */
    private Boolean _cellularBlockVpnWhenRoaming;
    /** Whether or not to Block the user from doing manual root certificate installation. */
    private Boolean _certificatesBlockManualRootCertificateInstallation;
    /** Whether or not to block Connected Devices Service which enables discovery and connection to other devices, remote messaging, remote app sessions and other cross-device experiences. */
    private Boolean _connectedDevicesServiceBlocked;
    /** Whether or not to Block the user from using copy paste. */
    private Boolean _copyPasteBlocked;
    /** Whether or not to Block the user from using Cortana. */
    private Boolean _cortanaBlocked;
    /** Whether or not to block end user access to Defender. */
    private Boolean _defenderBlockEndUserAccess;
    /** Possible values of Cloud Block Level */
    private DefenderCloudBlockLevelType _defenderCloudBlockLevel;
    /** Number of days before deleting quarantined malware. Valid values 0 to 90 */
    private Integer _defenderDaysBeforeDeletingQuarantinedMalware;
    /** Gets or sets Defenders actions to take on detected Malware per threat level. */
    private DefenderDetectedMalwareActions _defenderDetectedMalwareActions;
    /** File extensions to exclude from scans and real time protection. */
    private java.util.List<String> _defenderFileExtensionsToExclude;
    /** Files and folder to exclude from scans and real time protection. */
    private java.util.List<String> _defenderFilesAndFoldersToExclude;
    /** Possible values for monitoring file activity. */
    private DefenderMonitorFileActivity _defenderMonitorFileActivity;
    /** Processes to exclude from scans and real time protection. */
    private java.util.List<String> _defenderProcessesToExclude;
    /** Possible values for prompting user for samples submission. */
    private DefenderPromptForSampleSubmission _defenderPromptForSampleSubmission;
    /** Indicates whether or not to require behavior monitoring. */
    private Boolean _defenderRequireBehaviorMonitoring;
    /** Indicates whether or not to require cloud protection. */
    private Boolean _defenderRequireCloudProtection;
    /** Indicates whether or not to require network inspection system. */
    private Boolean _defenderRequireNetworkInspectionSystem;
    /** Indicates whether or not to require real time monitoring. */
    private Boolean _defenderRequireRealTimeMonitoring;
    /** Indicates whether or not to scan archive files. */
    private Boolean _defenderScanArchiveFiles;
    /** Indicates whether or not to scan downloads. */
    private Boolean _defenderScanDownloads;
    /** Indicates whether or not to scan incoming mail messages. */
    private Boolean _defenderScanIncomingMail;
    /** Indicates whether or not to scan mapped network drives during full scan. */
    private Boolean _defenderScanMappedNetworkDrivesDuringFullScan;
    /** Max CPU usage percentage during scan. Valid values 0 to 100 */
    private Integer _defenderScanMaxCpu;
    /** Indicates whether or not to scan files opened from a network folder. */
    private Boolean _defenderScanNetworkFiles;
    /** Indicates whether or not to scan removable drives during full scan. */
    private Boolean _defenderScanRemovableDrivesDuringFullScan;
    /** Indicates whether or not to scan scripts loaded in Internet Explorer browser. */
    private Boolean _defenderScanScriptsLoadedInInternetExplorer;
    /** Possible values for system scan type. */
    private DefenderScanType _defenderScanType;
    /** The time to perform a daily quick scan. */
    private LocalTime _defenderScheduledQuickScanTime;
    /** The defender time for the system scan. */
    private LocalTime _defenderScheduledScanTime;
    /** The signature update interval in hours. Specify 0 not to check. Valid values 0 to 24 */
    private Integer _defenderSignatureUpdateIntervalInHours;
    /** Possible values for a weekly schedule. */
    private WeeklySchedule _defenderSystemScanSchedule;
    /** State Management Setting. */
    private StateManagementSetting _developerUnlockSetting;
    /** Indicates whether or not to Block the user from resetting their phone. */
    private Boolean _deviceManagementBlockFactoryResetOnMobile;
    /** Indicates whether or not to Block the user from doing manual un-enrollment from device management. */
    private Boolean _deviceManagementBlockManualUnenroll;
    /** Allow the device to send diagnostic and usage telemetry data, such as Watson. */
    private DiagnosticDataSubmissionMode _diagnosticsDataSubmissionMode;
    /** Allow users to change Start pages on Edge. Use the EdgeHomepageUrls to specify the Start pages that the user would see by default when they open Edge. */
    private Boolean _edgeAllowStartPagesModification;
    /** Indicates whether or not to prevent access to about flags on Edge browser. */
    private Boolean _edgeBlockAccessToAboutFlags;
    /** Block the address bar dropdown functionality in Microsoft Edge. Disable this settings to minimize network connections from Microsoft Edge to Microsoft services. */
    private Boolean _edgeBlockAddressBarDropdown;
    /** Indicates whether or not to block auto fill. */
    private Boolean _edgeBlockAutofill;
    /** Block Microsoft compatibility list in Microsoft Edge. This list from Microsoft helps Edge properly display sites with known compatibility issues. */
    private Boolean _edgeBlockCompatibilityList;
    /** Indicates whether or not to block developer tools in the Edge browser. */
    private Boolean _edgeBlockDeveloperTools;
    /** Indicates whether or not to Block the user from using the Edge browser. */
    private Boolean _edgeBlocked;
    /** Indicates whether or not to block extensions in the Edge browser. */
    private Boolean _edgeBlockExtensions;
    /** Indicates whether or not to block InPrivate browsing on corporate networks, in the Edge browser. */
    private Boolean _edgeBlockInPrivateBrowsing;
    /** Indicates whether or not to Block the user from using JavaScript. */
    private Boolean _edgeBlockJavaScript;
    /** Block the collection of information by Microsoft for live tile creation when users pin a site to Start from Microsoft Edge. */
    private Boolean _edgeBlockLiveTileDataCollection;
    /** Indicates whether or not to Block password manager. */
    private Boolean _edgeBlockPasswordManager;
    /** Indicates whether or not to block popups. */
    private Boolean _edgeBlockPopups;
    /** Indicates whether or not to block the user from using the search suggestions in the address bar. */
    private Boolean _edgeBlockSearchSuggestions;
    /** Indicates whether or not to Block the user from sending the do not track header. */
    private Boolean _edgeBlockSendingDoNotTrackHeader;
    /** Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. Note: the name of this property is misleading; the property is obsolete, use EdgeSendIntranetTrafficToInternetExplorer instead. */
    private Boolean _edgeBlockSendingIntranetTrafficToInternetExplorer;
    /** Clear browsing data on exiting Microsoft Edge. */
    private Boolean _edgeClearBrowsingDataOnExit;
    /** Possible values to specify which cookies are allowed in Microsoft Edge. */
    private EdgeCookiePolicy _edgeCookiePolicy;
    /** Block the Microsoft web page that opens on the first use of Microsoft Edge. This policy allows enterprises, like those enrolled in zero emissions configurations, to block this page. */
    private Boolean _edgeDisableFirstRunPage;
    /** Indicates the enterprise mode site list location. Could be a local file, local network or http location. */
    private String _edgeEnterpriseModeSiteListLocation;
    /** The first run URL for when Edge browser is opened for the first time. */
    private String _edgeFirstRunUrl;
    /** The list of URLs for homepages shodwn on MDM-enrolled devices on Edge browser. */
    private java.util.List<String> _edgeHomepageUrls;
    /** Indicates whether or not to Require the user to use the smart screen filter. */
    private Boolean _edgeRequireSmartScreen;
    /** Allows IT admins to set a default search engine for MDM-Controlled devices. Users can override this and change their default search engine provided the AllowSearchEngineCustomization policy is not set. */
    private EdgeSearchEngineBase _edgeSearchEngine;
    /** Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. */
    private Boolean _edgeSendIntranetTrafficToInternetExplorer;
    /** Enable favorites sync between Internet Explorer and Microsoft Edge. Additions, deletions, modifications and order changes to favorites are shared between browsers. */
    private Boolean _edgeSyncFavoritesWithInternetExplorer;
    /** Endpoint for discovering cloud printers. */
    private String _enterpriseCloudPrintDiscoveryEndPoint;
    /** Maximum number of printers that should be queried from a discovery endpoint. This is a mobile only setting. Valid values 1 to 65535 */
    private Integer _enterpriseCloudPrintDiscoveryMaxLimit;
    /** OAuth resource URI for printer discovery service as configured in Azure portal. */
    private String _enterpriseCloudPrintMopriaDiscoveryResourceIdentifier;
    /** Authentication endpoint for acquiring OAuth tokens. */
    private String _enterpriseCloudPrintOAuthAuthority;
    /** GUID of a client application authorized to retrieve OAuth tokens from the OAuth Authority. */
    private String _enterpriseCloudPrintOAuthClientIdentifier;
    /** OAuth resource URI for print service as configured in the Azure portal. */
    private String _enterpriseCloudPrintResourceIdentifier;
    /** Indicates whether or not to enable device discovery UX. */
    private Boolean _experienceBlockDeviceDiscovery;
    /** Indicates whether or not to allow the error dialog from displaying if no SIM card is detected. */
    private Boolean _experienceBlockErrorDialogWhenNoSIM;
    /** Indicates whether or not to enable task switching on the device. */
    private Boolean _experienceBlockTaskSwitcher;
    /** Indicates whether or not to block DVR and broadcasting. */
    private Boolean _gameDvrBlocked;
    /** Indicates whether or not to Block the user from using internet sharing. */
    private Boolean _internetSharingBlocked;
    /** Indicates whether or not to Block the user from location services. */
    private Boolean _locationServicesBlocked;
    /** Specify whether to show a user-configurable setting to control the screen timeout while on the lock screen of Windows 10 Mobile devices. If this policy is set to Allow, the value set by lockScreenTimeoutInSeconds is ignored. */
    private Boolean _lockScreenAllowTimeoutConfiguration;
    /** Indicates whether or not to block action center notifications over lock screen. */
    private Boolean _lockScreenBlockActionCenterNotifications;
    /** Indicates whether or not the user can interact with Cortana using speech while the system is locked. */
    private Boolean _lockScreenBlockCortana;
    /** Indicates whether to allow toast notifications above the device lock screen. */
    private Boolean _lockScreenBlockToastNotifications;
    /** Set the duration (in seconds) from the screen locking to the screen turning off for Windows 10 Mobile devices. Supported values are 11-1800. Valid values 11 to 1800 */
    private Integer _lockScreenTimeoutInSeconds;
    /** Disables the ability to quickly switch between users that are logged on simultaneously without logging off. */
    private Boolean _logonBlockFastUserSwitching;
    /** Indicates whether or not to Block a Microsoft account. */
    private Boolean _microsoftAccountBlocked;
    /** Indicates whether or not to Block Microsoft account settings sync. */
    private Boolean _microsoftAccountBlockSettingsSync;
    /** If set, proxy settings will be applied to all processes and accounts in the device. Otherwise, it will be applied to the user account thats enrolled into MDM. */
    private Boolean _networkProxyApplySettingsDeviceWide;
    /** Address to the proxy auto-config (PAC) script you want to use. */
    private String _networkProxyAutomaticConfigurationUrl;
    /** Disable automatic detection of settings. If enabled, the system will try to find the path to a proxy auto-config (PAC) script. */
    private Boolean _networkProxyDisableAutoDetect;
    /** Specifies manual proxy server settings. */
    private Windows10NetworkProxyServer _networkProxyServer;
    /** Indicates whether or not to Block the user from using near field communication. */
    private Boolean _nfcBlocked;
    /** Gets or sets a value allowing IT admins to prevent apps and features from working with files on OneDrive. */
    private Boolean _oneDriveDisableFileSync;
    /** Specify whether PINs or passwords such as '1111' or '1234' are allowed. For Windows 10 desktops, it also controls the use of picture passwords. */
    private Boolean _passwordBlockSimple;
    /** The password expiration in days. Valid values 0 to 730 */
    private Integer _passwordExpirationDays;
    /** The number of character sets required in the password. */
    private Integer _passwordMinimumCharacterSetCount;
    /** The minimum password length. Valid values 4 to 16 */
    private Integer _passwordMinimumLength;
    /** The minutes of inactivity before the screen times out. */
    private Integer _passwordMinutesOfInactivityBeforeScreenTimeout;
    /** The number of previous passwords to prevent reuse of. Valid values 0 to 50 */
    private Integer _passwordPreviousPasswordBlockCount;
    /** Indicates whether or not to require the user to have a password. */
    private Boolean _passwordRequired;
    /** Possible values of required passwords. */
    private RequiredPasswordType _passwordRequiredType;
    /** Indicates whether or not to require a password upon resuming from an idle state. */
    private Boolean _passwordRequireWhenResumeFromIdleState;
    /** The number of sign in failures before factory reset. Valid values 0 to 999 */
    private Integer _passwordSignInFailureCountBeforeFactoryReset;
    /** A http or https Url to a jpg, jpeg or png image that needs to be downloaded and used as the Desktop Image or a file Url to a local image on the file system that needs to used as the Desktop Image. */
    private String _personalizationDesktopImageUrl;
    /** A http or https Url to a jpg, jpeg or png image that neeeds to be downloaded and used as the Lock Screen Image or a file Url to a local image on the file system that needs to be used as the Lock Screen Image. */
    private String _personalizationLockScreenImageUrl;
    /** State Management Setting. */
    private StateManagementSetting _privacyAdvertisingId;
    /** Indicates whether or not to allow the automatic acceptance of the pairing and privacy user consent dialog when launching apps. */
    private Boolean _privacyAutoAcceptPairingAndConsentPrompts;
    /** Indicates whether or not to block the usage of cloud based speech services for Cortana, Dictation, or Store applications. */
    private Boolean _privacyBlockInputPersonalization;
    /** Indicates whether or not to Block the user from reset protection mode. */
    private Boolean _resetProtectionModeBlocked;
    /** Specifies what level of safe search (filtering adult content) is required */
    private SafeSearchFilterType _safeSearchFilter;
    /** Indicates whether or not to Block the user from taking Screenshots. */
    private Boolean _screenCaptureBlocked;
    /** Specifies if search can use diacritics. */
    private Boolean _searchBlockDiacritics;
    /** Specifies whether to use automatic language detection when indexing content and properties. */
    private Boolean _searchDisableAutoLanguageDetection;
    /** Indicates whether or not to disable the search indexer backoff feature. */
    private Boolean _searchDisableIndexerBackoff;
    /** Indicates whether or not to block indexing of WIP-protected items to prevent them from appearing in search results for Cortana or Explorer. */
    private Boolean _searchDisableIndexingEncryptedItems;
    /** Indicates whether or not to allow users to add locations on removable drives to libraries and to be indexed. */
    private Boolean _searchDisableIndexingRemovableDrive;
    /** Specifies minimum amount of hard drive space on the same drive as the index location before indexing stops. */
    private Boolean _searchEnableAutomaticIndexSizeManangement;
    /** Indicates whether or not to block remote queries of this computers index. */
    private Boolean _searchEnableRemoteQueries;
    /** Indicates whether or not to block access to Accounts in Settings app. */
    private Boolean _settingsBlockAccountsPage;
    /** Indicates whether or not to block the user from installing provisioning packages. */
    private Boolean _settingsBlockAddProvisioningPackage;
    /** Indicates whether or not to block access to Apps in Settings app. */
    private Boolean _settingsBlockAppsPage;
    /** Indicates whether or not to block the user from changing the language settings. */
    private Boolean _settingsBlockChangeLanguage;
    /** Indicates whether or not to block the user from changing power and sleep settings. */
    private Boolean _settingsBlockChangePowerSleep;
    /** Indicates whether or not to block the user from changing the region settings. */
    private Boolean _settingsBlockChangeRegion;
    /** Indicates whether or not to block the user from changing date and time settings. */
    private Boolean _settingsBlockChangeSystemTime;
    /** Indicates whether or not to block access to Devices in Settings app. */
    private Boolean _settingsBlockDevicesPage;
    /** Indicates whether or not to block access to Ease of Access in Settings app. */
    private Boolean _settingsBlockEaseOfAccessPage;
    /** Indicates whether or not to block the user from editing the device name. */
    private Boolean _settingsBlockEditDeviceName;
    /** Indicates whether or not to block access to Gaming in Settings app. */
    private Boolean _settingsBlockGamingPage;
    /** Indicates whether or not to block access to Network & Internet in Settings app. */
    private Boolean _settingsBlockNetworkInternetPage;
    /** Indicates whether or not to block access to Personalization in Settings app. */
    private Boolean _settingsBlockPersonalizationPage;
    /** Indicates whether or not to block access to Privacy in Settings app. */
    private Boolean _settingsBlockPrivacyPage;
    /** Indicates whether or not to block the runtime configuration agent from removing provisioning packages. */
    private Boolean _settingsBlockRemoveProvisioningPackage;
    /** Indicates whether or not to block access to Settings app. */
    private Boolean _settingsBlockSettingsApp;
    /** Indicates whether or not to block access to System in Settings app. */
    private Boolean _settingsBlockSystemPage;
    /** Indicates whether or not to block access to Time & Language in Settings app. */
    private Boolean _settingsBlockTimeLanguagePage;
    /** Indicates whether or not to block access to Update & Security in Settings app. */
    private Boolean _settingsBlockUpdateSecurityPage;
    /** Indicates whether or not to block multiple users of the same app to share data. */
    private Boolean _sharedUserAppDataAllowed;
    /** Indicates whether or not users can override SmartScreen Filter warnings about potentially malicious websites. */
    private Boolean _smartScreenBlockPromptOverride;
    /** Indicates whether or not users can override the SmartScreen Filter warnings about downloading unverified files */
    private Boolean _smartScreenBlockPromptOverrideForFiles;
    /** This property will be deprecated in July 2019 and will be replaced by property SmartScreenAppInstallControl. Allows IT Admins to control whether users are allowed to install apps from places other than the Store. */
    private Boolean _smartScreenEnableAppInstallControl;
    /** Indicates whether or not to block the user from unpinning apps from taskbar. */
    private Boolean _startBlockUnpinningAppsFromTaskbar;
    /** Type of start menu app list visibility. */
    private WindowsStartMenuAppListVisibilityType _startMenuAppListVisibility;
    /** Enabling this policy hides the change account setting from appearing in the user tile in the start menu. */
    private Boolean _startMenuHideChangeAccountSettings;
    /** Enabling this policy hides the most used apps from appearing on the start menu and disables the corresponding toggle in the Settings app. */
    private Boolean _startMenuHideFrequentlyUsedApps;
    /** Enabling this policy hides hibernate from appearing in the power button in the start menu. */
    private Boolean _startMenuHideHibernate;
    /** Enabling this policy hides lock from appearing in the user tile in the start menu. */
    private Boolean _startMenuHideLock;
    /** Enabling this policy hides the power button from appearing in the start menu. */
    private Boolean _startMenuHidePowerButton;
    /** Enabling this policy hides recent jump lists from appearing on the start menu/taskbar and disables the corresponding toggle in the Settings app. */
    private Boolean _startMenuHideRecentJumpLists;
    /** Enabling this policy hides recently added apps from appearing on the start menu and disables the corresponding toggle in the Settings app. */
    private Boolean _startMenuHideRecentlyAddedApps;
    /** Enabling this policy hides 'Restart/Update and Restart' from appearing in the power button in the start menu. */
    private Boolean _startMenuHideRestartOptions;
    /** Enabling this policy hides shut down/update and shut down from appearing in the power button in the start menu. */
    private Boolean _startMenuHideShutDown;
    /** Enabling this policy hides sign out from appearing in the user tile in the start menu. */
    private Boolean _startMenuHideSignOut;
    /** Enabling this policy hides sleep from appearing in the power button in the start menu. */
    private Boolean _startMenuHideSleep;
    /** Enabling this policy hides switch account from appearing in the user tile in the start menu. */
    private Boolean _startMenuHideSwitchAccount;
    /** Enabling this policy hides the user tile from appearing in the start menu. */
    private Boolean _startMenuHideUserTile;
    /** This policy setting allows you to import Edge assets to be used with startMenuLayoutXml policy. Start layout can contain secondary tile from Edge app which looks for Edge local asset file. Edge local asset would not exist and cause Edge secondary tile to appear empty in this case. This policy only gets applied when startMenuLayoutXml policy is modified. The value should be a UTF-8 Base64 encoded byte array. */
    private byte[] _startMenuLayoutEdgeAssetsXml;
    /** Allows admins to override the default Start menu layout and prevents the user from changing it. The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in a UTF8 encoded byte array format. */
    private byte[] _startMenuLayoutXml;
    /** Type of display modes for the start menu. */
    private WindowsStartMenuModeType _startMenuMode;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderDocuments;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderDownloads;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderFileExplorer;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderHomeGroup;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderMusic;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderNetwork;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderPersonalFolder;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderPictures;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderSettings;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderVideos;
    /** Indicates whether or not to Block the user from using removable storage. */
    private Boolean _storageBlockRemovableStorage;
    /** Indicating whether or not to require encryption on a mobile device. */
    private Boolean _storageRequireMobileDeviceEncryption;
    /** Indicates whether application data is restricted to the system drive. */
    private Boolean _storageRestrictAppDataToSystemVolume;
    /** Indicates whether the installation of applications is restricted to the system drive. */
    private Boolean _storageRestrictAppInstallToSystemVolume;
    /** Whether the device is required to connect to the network. */
    private Boolean _tenantLockdownRequireNetworkDuringOutOfBoxExperience;
    /** Indicates whether or not to Block the user from USB connection. */
    private Boolean _usbBlocked;
    /** Indicates whether or not to Block the user from voice recording. */
    private Boolean _voiceRecordingBlocked;
    /** Indicates whether or not user's localhost IP address is displayed while making phone calls using the WebRTC */
    private Boolean _webRtcBlockLocalhostIpAddress;
    /** Indicating whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked. */
    private Boolean _wiFiBlockAutomaticConnectHotspots;
    /** Indicates whether or not to Block the user from using Wi-Fi. */
    private Boolean _wiFiBlocked;
    /** Indicates whether or not to Block the user from using Wi-Fi manual configuration. */
    private Boolean _wiFiBlockManualConfiguration;
    /** Specify how often devices scan for Wi-Fi networks. Supported values are 1-500, where 100 = default, and 500 = low frequency. Valid values 1 to 500 */
    private Integer _wiFiScanInterval;
    /** Allows IT admins to block experiences that are typically for consumers only, such as Start suggestions, Membership notifications, Post-OOBE app install and redirect tiles. */
    private Boolean _windowsSpotlightBlockConsumerSpecificFeatures;
    /** Allows IT admins to turn off all Windows Spotlight features */
    private Boolean _windowsSpotlightBlocked;
    /** Block suggestions from Microsoft that show after each OS clean install, upgrade or in an on-going basis to introduce users to what is new or changed */
    private Boolean _windowsSpotlightBlockOnActionCenter;
    /** Block personalized content in Windows spotlight based on users device usage. */
    private Boolean _windowsSpotlightBlockTailoredExperiences;
    /** Block third party content delivered via Windows Spotlight */
    private Boolean _windowsSpotlightBlockThirdPartyNotifications;
    /** Block Windows Spotlight Windows welcome experience */
    private Boolean _windowsSpotlightBlockWelcomeExperience;
    /** Allows IT admins to turn off the popup of Windows Tips. */
    private Boolean _windowsSpotlightBlockWindowsTips;
    /** Allows IT admind to set a predefined default search engine for MDM-Controlled devices */
    private WindowsSpotlightEnablementSettings _windowsSpotlightConfigureOnLockScreen;
    /** Indicates whether or not to block automatic update of apps from Windows Store. */
    private Boolean _windowsStoreBlockAutoUpdate;
    /** Indicates whether or not to Block the user from using the Windows store. */
    private Boolean _windowsStoreBlocked;
    /** Indicates whether or not to enable Private Store Only. */
    private Boolean _windowsStoreEnablePrivateStoreOnly;
    /** Indicates whether or not to allow other devices from discovering this PC for projection. */
    private Boolean _wirelessDisplayBlockProjectionToThisDevice;
    /** Indicates whether or not to allow user input from wireless display receiver. */
    private Boolean _wirelessDisplayBlockUserInputFromReceiver;
    /** Indicates whether or not to require a PIN for new devices to initiate pairing. */
    private Boolean _wirelessDisplayRequirePinForPairing;
    /**
     * Instantiates a new Windows10GeneralConfiguration and sets the default values.
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
     * @return a Windows10GeneralConfiguration
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
        return this._accountsBlockAddingNonMicrosoftAccountEmail;
    }
    /**
     * Gets the antiTheftModeBlocked property value. Indicates whether or not to block the user from selecting an AntiTheft mode preference (Windows 10 Mobile only).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAntiTheftModeBlocked() {
        return this._antiTheftModeBlocked;
    }
    /**
     * Gets the appsAllowTrustedAppsSideloading property value. State Management Setting.
     * @return a stateManagementSetting
     */
    @javax.annotation.Nullable
    public StateManagementSetting getAppsAllowTrustedAppsSideloading() {
        return this._appsAllowTrustedAppsSideloading;
    }
    /**
     * Gets the appsBlockWindowsStoreOriginatedApps property value. Indicates whether or not to disable the launch of all apps from Windows Store that came pre-installed or were downloaded.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppsBlockWindowsStoreOriginatedApps() {
        return this._appsBlockWindowsStoreOriginatedApps;
    }
    /**
     * Gets the bluetoothAllowedServices property value. Specify a list of allowed Bluetooth services and profiles in hex formatted strings.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getBluetoothAllowedServices() {
        return this._bluetoothAllowedServices;
    }
    /**
     * Gets the bluetoothBlockAdvertising property value. Whether or not to Block the user from using bluetooth advertising.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockAdvertising() {
        return this._bluetoothBlockAdvertising;
    }
    /**
     * Gets the bluetoothBlockDiscoverableMode property value. Whether or not to Block the user from using bluetooth discoverable mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockDiscoverableMode() {
        return this._bluetoothBlockDiscoverableMode;
    }
    /**
     * Gets the bluetoothBlocked property value. Whether or not to Block the user from using bluetooth.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlocked() {
        return this._bluetoothBlocked;
    }
    /**
     * Gets the bluetoothBlockPrePairing property value. Whether or not to block specific bundled Bluetooth peripherals to automatically pair with the host device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockPrePairing() {
        return this._bluetoothBlockPrePairing;
    }
    /**
     * Gets the cameraBlocked property value. Whether or not to Block the user from accessing the camera of the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this._cameraBlocked;
    }
    /**
     * Gets the cellularBlockDataWhenRoaming property value. Whether or not to Block the user from using data over cellular while roaming.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockDataWhenRoaming() {
        return this._cellularBlockDataWhenRoaming;
    }
    /**
     * Gets the cellularBlockVpn property value. Whether or not to Block the user from using VPN over cellular.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockVpn() {
        return this._cellularBlockVpn;
    }
    /**
     * Gets the cellularBlockVpnWhenRoaming property value. Whether or not to Block the user from using VPN when roaming over cellular.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockVpnWhenRoaming() {
        return this._cellularBlockVpnWhenRoaming;
    }
    /**
     * Gets the certificatesBlockManualRootCertificateInstallation property value. Whether or not to Block the user from doing manual root certificate installation.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCertificatesBlockManualRootCertificateInstallation() {
        return this._certificatesBlockManualRootCertificateInstallation;
    }
    /**
     * Gets the connectedDevicesServiceBlocked property value. Whether or not to block Connected Devices Service which enables discovery and connection to other devices, remote messaging, remote app sessions and other cross-device experiences.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConnectedDevicesServiceBlocked() {
        return this._connectedDevicesServiceBlocked;
    }
    /**
     * Gets the copyPasteBlocked property value. Whether or not to Block the user from using copy paste.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCopyPasteBlocked() {
        return this._copyPasteBlocked;
    }
    /**
     * Gets the cortanaBlocked property value. Whether or not to Block the user from using Cortana.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCortanaBlocked() {
        return this._cortanaBlocked;
    }
    /**
     * Gets the defenderBlockEndUserAccess property value. Whether or not to block end user access to Defender.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderBlockEndUserAccess() {
        return this._defenderBlockEndUserAccess;
    }
    /**
     * Gets the defenderCloudBlockLevel property value. Possible values of Cloud Block Level
     * @return a defenderCloudBlockLevelType
     */
    @javax.annotation.Nullable
    public DefenderCloudBlockLevelType getDefenderCloudBlockLevel() {
        return this._defenderCloudBlockLevel;
    }
    /**
     * Gets the defenderDaysBeforeDeletingQuarantinedMalware property value. Number of days before deleting quarantined malware. Valid values 0 to 90
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderDaysBeforeDeletingQuarantinedMalware() {
        return this._defenderDaysBeforeDeletingQuarantinedMalware;
    }
    /**
     * Gets the defenderDetectedMalwareActions property value. Gets or sets Defenders actions to take on detected Malware per threat level.
     * @return a defenderDetectedMalwareActions
     */
    @javax.annotation.Nullable
    public DefenderDetectedMalwareActions getDefenderDetectedMalwareActions() {
        return this._defenderDetectedMalwareActions;
    }
    /**
     * Gets the defenderFileExtensionsToExclude property value. File extensions to exclude from scans and real time protection.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderFileExtensionsToExclude() {
        return this._defenderFileExtensionsToExclude;
    }
    /**
     * Gets the defenderFilesAndFoldersToExclude property value. Files and folder to exclude from scans and real time protection.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderFilesAndFoldersToExclude() {
        return this._defenderFilesAndFoldersToExclude;
    }
    /**
     * Gets the defenderMonitorFileActivity property value. Possible values for monitoring file activity.
     * @return a defenderMonitorFileActivity
     */
    @javax.annotation.Nullable
    public DefenderMonitorFileActivity getDefenderMonitorFileActivity() {
        return this._defenderMonitorFileActivity;
    }
    /**
     * Gets the defenderProcessesToExclude property value. Processes to exclude from scans and real time protection.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderProcessesToExclude() {
        return this._defenderProcessesToExclude;
    }
    /**
     * Gets the defenderPromptForSampleSubmission property value. Possible values for prompting user for samples submission.
     * @return a defenderPromptForSampleSubmission
     */
    @javax.annotation.Nullable
    public DefenderPromptForSampleSubmission getDefenderPromptForSampleSubmission() {
        return this._defenderPromptForSampleSubmission;
    }
    /**
     * Gets the defenderRequireBehaviorMonitoring property value. Indicates whether or not to require behavior monitoring.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderRequireBehaviorMonitoring() {
        return this._defenderRequireBehaviorMonitoring;
    }
    /**
     * Gets the defenderRequireCloudProtection property value. Indicates whether or not to require cloud protection.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderRequireCloudProtection() {
        return this._defenderRequireCloudProtection;
    }
    /**
     * Gets the defenderRequireNetworkInspectionSystem property value. Indicates whether or not to require network inspection system.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderRequireNetworkInspectionSystem() {
        return this._defenderRequireNetworkInspectionSystem;
    }
    /**
     * Gets the defenderRequireRealTimeMonitoring property value. Indicates whether or not to require real time monitoring.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderRequireRealTimeMonitoring() {
        return this._defenderRequireRealTimeMonitoring;
    }
    /**
     * Gets the defenderScanArchiveFiles property value. Indicates whether or not to scan archive files.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanArchiveFiles() {
        return this._defenderScanArchiveFiles;
    }
    /**
     * Gets the defenderScanDownloads property value. Indicates whether or not to scan downloads.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanDownloads() {
        return this._defenderScanDownloads;
    }
    /**
     * Gets the defenderScanIncomingMail property value. Indicates whether or not to scan incoming mail messages.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanIncomingMail() {
        return this._defenderScanIncomingMail;
    }
    /**
     * Gets the defenderScanMappedNetworkDrivesDuringFullScan property value. Indicates whether or not to scan mapped network drives during full scan.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanMappedNetworkDrivesDuringFullScan() {
        return this._defenderScanMappedNetworkDrivesDuringFullScan;
    }
    /**
     * Gets the defenderScanMaxCpu property value. Max CPU usage percentage during scan. Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderScanMaxCpu() {
        return this._defenderScanMaxCpu;
    }
    /**
     * Gets the defenderScanNetworkFiles property value. Indicates whether or not to scan files opened from a network folder.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanNetworkFiles() {
        return this._defenderScanNetworkFiles;
    }
    /**
     * Gets the defenderScanRemovableDrivesDuringFullScan property value. Indicates whether or not to scan removable drives during full scan.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanRemovableDrivesDuringFullScan() {
        return this._defenderScanRemovableDrivesDuringFullScan;
    }
    /**
     * Gets the defenderScanScriptsLoadedInInternetExplorer property value. Indicates whether or not to scan scripts loaded in Internet Explorer browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanScriptsLoadedInInternetExplorer() {
        return this._defenderScanScriptsLoadedInInternetExplorer;
    }
    /**
     * Gets the defenderScanType property value. Possible values for system scan type.
     * @return a defenderScanType
     */
    @javax.annotation.Nullable
    public DefenderScanType getDefenderScanType() {
        return this._defenderScanType;
    }
    /**
     * Gets the defenderScheduledQuickScanTime property value. The time to perform a daily quick scan.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getDefenderScheduledQuickScanTime() {
        return this._defenderScheduledQuickScanTime;
    }
    /**
     * Gets the defenderScheduledScanTime property value. The defender time for the system scan.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getDefenderScheduledScanTime() {
        return this._defenderScheduledScanTime;
    }
    /**
     * Gets the defenderSignatureUpdateIntervalInHours property value. The signature update interval in hours. Specify 0 not to check. Valid values 0 to 24
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderSignatureUpdateIntervalInHours() {
        return this._defenderSignatureUpdateIntervalInHours;
    }
    /**
     * Gets the defenderSystemScanSchedule property value. Possible values for a weekly schedule.
     * @return a weeklySchedule
     */
    @javax.annotation.Nullable
    public WeeklySchedule getDefenderSystemScanSchedule() {
        return this._defenderSystemScanSchedule;
    }
    /**
     * Gets the developerUnlockSetting property value. State Management Setting.
     * @return a stateManagementSetting
     */
    @javax.annotation.Nullable
    public StateManagementSetting getDeveloperUnlockSetting() {
        return this._developerUnlockSetting;
    }
    /**
     * Gets the deviceManagementBlockFactoryResetOnMobile property value. Indicates whether or not to Block the user from resetting their phone.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceManagementBlockFactoryResetOnMobile() {
        return this._deviceManagementBlockFactoryResetOnMobile;
    }
    /**
     * Gets the deviceManagementBlockManualUnenroll property value. Indicates whether or not to Block the user from doing manual un-enrollment from device management.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceManagementBlockManualUnenroll() {
        return this._deviceManagementBlockManualUnenroll;
    }
    /**
     * Gets the diagnosticsDataSubmissionMode property value. Allow the device to send diagnostic and usage telemetry data, such as Watson.
     * @return a diagnosticDataSubmissionMode
     */
    @javax.annotation.Nullable
    public DiagnosticDataSubmissionMode getDiagnosticsDataSubmissionMode() {
        return this._diagnosticsDataSubmissionMode;
    }
    /**
     * Gets the edgeAllowStartPagesModification property value. Allow users to change Start pages on Edge. Use the EdgeHomepageUrls to specify the Start pages that the user would see by default when they open Edge.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeAllowStartPagesModification() {
        return this._edgeAllowStartPagesModification;
    }
    /**
     * Gets the edgeBlockAccessToAboutFlags property value. Indicates whether or not to prevent access to about flags on Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockAccessToAboutFlags() {
        return this._edgeBlockAccessToAboutFlags;
    }
    /**
     * Gets the edgeBlockAddressBarDropdown property value. Block the address bar dropdown functionality in Microsoft Edge. Disable this settings to minimize network connections from Microsoft Edge to Microsoft services.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockAddressBarDropdown() {
        return this._edgeBlockAddressBarDropdown;
    }
    /**
     * Gets the edgeBlockAutofill property value. Indicates whether or not to block auto fill.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockAutofill() {
        return this._edgeBlockAutofill;
    }
    /**
     * Gets the edgeBlockCompatibilityList property value. Block Microsoft compatibility list in Microsoft Edge. This list from Microsoft helps Edge properly display sites with known compatibility issues.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockCompatibilityList() {
        return this._edgeBlockCompatibilityList;
    }
    /**
     * Gets the edgeBlockDeveloperTools property value. Indicates whether or not to block developer tools in the Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockDeveloperTools() {
        return this._edgeBlockDeveloperTools;
    }
    /**
     * Gets the edgeBlocked property value. Indicates whether or not to Block the user from using the Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlocked() {
        return this._edgeBlocked;
    }
    /**
     * Gets the edgeBlockExtensions property value. Indicates whether or not to block extensions in the Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockExtensions() {
        return this._edgeBlockExtensions;
    }
    /**
     * Gets the edgeBlockInPrivateBrowsing property value. Indicates whether or not to block InPrivate browsing on corporate networks, in the Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockInPrivateBrowsing() {
        return this._edgeBlockInPrivateBrowsing;
    }
    /**
     * Gets the edgeBlockJavaScript property value. Indicates whether or not to Block the user from using JavaScript.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockJavaScript() {
        return this._edgeBlockJavaScript;
    }
    /**
     * Gets the edgeBlockLiveTileDataCollection property value. Block the collection of information by Microsoft for live tile creation when users pin a site to Start from Microsoft Edge.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockLiveTileDataCollection() {
        return this._edgeBlockLiveTileDataCollection;
    }
    /**
     * Gets the edgeBlockPasswordManager property value. Indicates whether or not to Block password manager.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockPasswordManager() {
        return this._edgeBlockPasswordManager;
    }
    /**
     * Gets the edgeBlockPopups property value. Indicates whether or not to block popups.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockPopups() {
        return this._edgeBlockPopups;
    }
    /**
     * Gets the edgeBlockSearchSuggestions property value. Indicates whether or not to block the user from using the search suggestions in the address bar.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockSearchSuggestions() {
        return this._edgeBlockSearchSuggestions;
    }
    /**
     * Gets the edgeBlockSendingDoNotTrackHeader property value. Indicates whether or not to Block the user from sending the do not track header.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockSendingDoNotTrackHeader() {
        return this._edgeBlockSendingDoNotTrackHeader;
    }
    /**
     * Gets the edgeBlockSendingIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. Note: the name of this property is misleading; the property is obsolete, use EdgeSendIntranetTrafficToInternetExplorer instead.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockSendingIntranetTrafficToInternetExplorer() {
        return this._edgeBlockSendingIntranetTrafficToInternetExplorer;
    }
    /**
     * Gets the edgeClearBrowsingDataOnExit property value. Clear browsing data on exiting Microsoft Edge.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeClearBrowsingDataOnExit() {
        return this._edgeClearBrowsingDataOnExit;
    }
    /**
     * Gets the edgeCookiePolicy property value. Possible values to specify which cookies are allowed in Microsoft Edge.
     * @return a edgeCookiePolicy
     */
    @javax.annotation.Nullable
    public EdgeCookiePolicy getEdgeCookiePolicy() {
        return this._edgeCookiePolicy;
    }
    /**
     * Gets the edgeDisableFirstRunPage property value. Block the Microsoft web page that opens on the first use of Microsoft Edge. This policy allows enterprises, like those enrolled in zero emissions configurations, to block this page.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeDisableFirstRunPage() {
        return this._edgeDisableFirstRunPage;
    }
    /**
     * Gets the edgeEnterpriseModeSiteListLocation property value. Indicates the enterprise mode site list location. Could be a local file, local network or http location.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEdgeEnterpriseModeSiteListLocation() {
        return this._edgeEnterpriseModeSiteListLocation;
    }
    /**
     * Gets the edgeFirstRunUrl property value. The first run URL for when Edge browser is opened for the first time.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEdgeFirstRunUrl() {
        return this._edgeFirstRunUrl;
    }
    /**
     * Gets the edgeHomepageUrls property value. The list of URLs for homepages shodwn on MDM-enrolled devices on Edge browser.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEdgeHomepageUrls() {
        return this._edgeHomepageUrls;
    }
    /**
     * Gets the edgeRequireSmartScreen property value. Indicates whether or not to Require the user to use the smart screen filter.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeRequireSmartScreen() {
        return this._edgeRequireSmartScreen;
    }
    /**
     * Gets the edgeSearchEngine property value. Allows IT admins to set a default search engine for MDM-Controlled devices. Users can override this and change their default search engine provided the AllowSearchEngineCustomization policy is not set.
     * @return a edgeSearchEngineBase
     */
    @javax.annotation.Nullable
    public EdgeSearchEngineBase getEdgeSearchEngine() {
        return this._edgeSearchEngine;
    }
    /**
     * Gets the edgeSendIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeSendIntranetTrafficToInternetExplorer() {
        return this._edgeSendIntranetTrafficToInternetExplorer;
    }
    /**
     * Gets the edgeSyncFavoritesWithInternetExplorer property value. Enable favorites sync between Internet Explorer and Microsoft Edge. Additions, deletions, modifications and order changes to favorites are shared between browsers.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeSyncFavoritesWithInternetExplorer() {
        return this._edgeSyncFavoritesWithInternetExplorer;
    }
    /**
     * Gets the enterpriseCloudPrintDiscoveryEndPoint property value. Endpoint for discovering cloud printers.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintDiscoveryEndPoint() {
        return this._enterpriseCloudPrintDiscoveryEndPoint;
    }
    /**
     * Gets the enterpriseCloudPrintDiscoveryMaxLimit property value. Maximum number of printers that should be queried from a discovery endpoint. This is a mobile only setting. Valid values 1 to 65535
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEnterpriseCloudPrintDiscoveryMaxLimit() {
        return this._enterpriseCloudPrintDiscoveryMaxLimit;
    }
    /**
     * Gets the enterpriseCloudPrintMopriaDiscoveryResourceIdentifier property value. OAuth resource URI for printer discovery service as configured in Azure portal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier() {
        return this._enterpriseCloudPrintMopriaDiscoveryResourceIdentifier;
    }
    /**
     * Gets the enterpriseCloudPrintOAuthAuthority property value. Authentication endpoint for acquiring OAuth tokens.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintOAuthAuthority() {
        return this._enterpriseCloudPrintOAuthAuthority;
    }
    /**
     * Gets the enterpriseCloudPrintOAuthClientIdentifier property value. GUID of a client application authorized to retrieve OAuth tokens from the OAuth Authority.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintOAuthClientIdentifier() {
        return this._enterpriseCloudPrintOAuthClientIdentifier;
    }
    /**
     * Gets the enterpriseCloudPrintResourceIdentifier property value. OAuth resource URI for print service as configured in the Azure portal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintResourceIdentifier() {
        return this._enterpriseCloudPrintResourceIdentifier;
    }
    /**
     * Gets the experienceBlockDeviceDiscovery property value. Indicates whether or not to enable device discovery UX.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExperienceBlockDeviceDiscovery() {
        return this._experienceBlockDeviceDiscovery;
    }
    /**
     * Gets the experienceBlockErrorDialogWhenNoSIM property value. Indicates whether or not to allow the error dialog from displaying if no SIM card is detected.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExperienceBlockErrorDialogWhenNoSIM() {
        return this._experienceBlockErrorDialogWhenNoSIM;
    }
    /**
     * Gets the experienceBlockTaskSwitcher property value. Indicates whether or not to enable task switching on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExperienceBlockTaskSwitcher() {
        return this._experienceBlockTaskSwitcher;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows10GeneralConfiguration currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountsBlockAddingNonMicrosoftAccountEmail", (n) -> { currentObject.setAccountsBlockAddingNonMicrosoftAccountEmail(n.getBooleanValue()); });
        deserializerMap.put("antiTheftModeBlocked", (n) -> { currentObject.setAntiTheftModeBlocked(n.getBooleanValue()); });
        deserializerMap.put("appsAllowTrustedAppsSideloading", (n) -> { currentObject.setAppsAllowTrustedAppsSideloading(n.getEnumValue(StateManagementSetting.class)); });
        deserializerMap.put("appsBlockWindowsStoreOriginatedApps", (n) -> { currentObject.setAppsBlockWindowsStoreOriginatedApps(n.getBooleanValue()); });
        deserializerMap.put("bluetoothAllowedServices", (n) -> { currentObject.setBluetoothAllowedServices(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("bluetoothBlockAdvertising", (n) -> { currentObject.setBluetoothBlockAdvertising(n.getBooleanValue()); });
        deserializerMap.put("bluetoothBlockDiscoverableMode", (n) -> { currentObject.setBluetoothBlockDiscoverableMode(n.getBooleanValue()); });
        deserializerMap.put("bluetoothBlocked", (n) -> { currentObject.setBluetoothBlocked(n.getBooleanValue()); });
        deserializerMap.put("bluetoothBlockPrePairing", (n) -> { currentObject.setBluetoothBlockPrePairing(n.getBooleanValue()); });
        deserializerMap.put("cameraBlocked", (n) -> { currentObject.setCameraBlocked(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockDataWhenRoaming", (n) -> { currentObject.setCellularBlockDataWhenRoaming(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockVpn", (n) -> { currentObject.setCellularBlockVpn(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockVpnWhenRoaming", (n) -> { currentObject.setCellularBlockVpnWhenRoaming(n.getBooleanValue()); });
        deserializerMap.put("certificatesBlockManualRootCertificateInstallation", (n) -> { currentObject.setCertificatesBlockManualRootCertificateInstallation(n.getBooleanValue()); });
        deserializerMap.put("connectedDevicesServiceBlocked", (n) -> { currentObject.setConnectedDevicesServiceBlocked(n.getBooleanValue()); });
        deserializerMap.put("copyPasteBlocked", (n) -> { currentObject.setCopyPasteBlocked(n.getBooleanValue()); });
        deserializerMap.put("cortanaBlocked", (n) -> { currentObject.setCortanaBlocked(n.getBooleanValue()); });
        deserializerMap.put("defenderBlockEndUserAccess", (n) -> { currentObject.setDefenderBlockEndUserAccess(n.getBooleanValue()); });
        deserializerMap.put("defenderCloudBlockLevel", (n) -> { currentObject.setDefenderCloudBlockLevel(n.getEnumValue(DefenderCloudBlockLevelType.class)); });
        deserializerMap.put("defenderDaysBeforeDeletingQuarantinedMalware", (n) -> { currentObject.setDefenderDaysBeforeDeletingQuarantinedMalware(n.getIntegerValue()); });
        deserializerMap.put("defenderDetectedMalwareActions", (n) -> { currentObject.setDefenderDetectedMalwareActions(n.getObjectValue(DefenderDetectedMalwareActions::createFromDiscriminatorValue)); });
        deserializerMap.put("defenderFileExtensionsToExclude", (n) -> { currentObject.setDefenderFileExtensionsToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderFilesAndFoldersToExclude", (n) -> { currentObject.setDefenderFilesAndFoldersToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderMonitorFileActivity", (n) -> { currentObject.setDefenderMonitorFileActivity(n.getEnumValue(DefenderMonitorFileActivity.class)); });
        deserializerMap.put("defenderProcessesToExclude", (n) -> { currentObject.setDefenderProcessesToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderPromptForSampleSubmission", (n) -> { currentObject.setDefenderPromptForSampleSubmission(n.getEnumValue(DefenderPromptForSampleSubmission.class)); });
        deserializerMap.put("defenderRequireBehaviorMonitoring", (n) -> { currentObject.setDefenderRequireBehaviorMonitoring(n.getBooleanValue()); });
        deserializerMap.put("defenderRequireCloudProtection", (n) -> { currentObject.setDefenderRequireCloudProtection(n.getBooleanValue()); });
        deserializerMap.put("defenderRequireNetworkInspectionSystem", (n) -> { currentObject.setDefenderRequireNetworkInspectionSystem(n.getBooleanValue()); });
        deserializerMap.put("defenderRequireRealTimeMonitoring", (n) -> { currentObject.setDefenderRequireRealTimeMonitoring(n.getBooleanValue()); });
        deserializerMap.put("defenderScanArchiveFiles", (n) -> { currentObject.setDefenderScanArchiveFiles(n.getBooleanValue()); });
        deserializerMap.put("defenderScanDownloads", (n) -> { currentObject.setDefenderScanDownloads(n.getBooleanValue()); });
        deserializerMap.put("defenderScanIncomingMail", (n) -> { currentObject.setDefenderScanIncomingMail(n.getBooleanValue()); });
        deserializerMap.put("defenderScanMappedNetworkDrivesDuringFullScan", (n) -> { currentObject.setDefenderScanMappedNetworkDrivesDuringFullScan(n.getBooleanValue()); });
        deserializerMap.put("defenderScanMaxCpu", (n) -> { currentObject.setDefenderScanMaxCpu(n.getIntegerValue()); });
        deserializerMap.put("defenderScanNetworkFiles", (n) -> { currentObject.setDefenderScanNetworkFiles(n.getBooleanValue()); });
        deserializerMap.put("defenderScanRemovableDrivesDuringFullScan", (n) -> { currentObject.setDefenderScanRemovableDrivesDuringFullScan(n.getBooleanValue()); });
        deserializerMap.put("defenderScanScriptsLoadedInInternetExplorer", (n) -> { currentObject.setDefenderScanScriptsLoadedInInternetExplorer(n.getBooleanValue()); });
        deserializerMap.put("defenderScanType", (n) -> { currentObject.setDefenderScanType(n.getEnumValue(DefenderScanType.class)); });
        deserializerMap.put("defenderScheduledQuickScanTime", (n) -> { currentObject.setDefenderScheduledQuickScanTime(n.getLocalTimeValue()); });
        deserializerMap.put("defenderScheduledScanTime", (n) -> { currentObject.setDefenderScheduledScanTime(n.getLocalTimeValue()); });
        deserializerMap.put("defenderSignatureUpdateIntervalInHours", (n) -> { currentObject.setDefenderSignatureUpdateIntervalInHours(n.getIntegerValue()); });
        deserializerMap.put("defenderSystemScanSchedule", (n) -> { currentObject.setDefenderSystemScanSchedule(n.getEnumValue(WeeklySchedule.class)); });
        deserializerMap.put("developerUnlockSetting", (n) -> { currentObject.setDeveloperUnlockSetting(n.getEnumValue(StateManagementSetting.class)); });
        deserializerMap.put("deviceManagementBlockFactoryResetOnMobile", (n) -> { currentObject.setDeviceManagementBlockFactoryResetOnMobile(n.getBooleanValue()); });
        deserializerMap.put("deviceManagementBlockManualUnenroll", (n) -> { currentObject.setDeviceManagementBlockManualUnenroll(n.getBooleanValue()); });
        deserializerMap.put("diagnosticsDataSubmissionMode", (n) -> { currentObject.setDiagnosticsDataSubmissionMode(n.getEnumValue(DiagnosticDataSubmissionMode.class)); });
        deserializerMap.put("edgeAllowStartPagesModification", (n) -> { currentObject.setEdgeAllowStartPagesModification(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockAccessToAboutFlags", (n) -> { currentObject.setEdgeBlockAccessToAboutFlags(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockAddressBarDropdown", (n) -> { currentObject.setEdgeBlockAddressBarDropdown(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockAutofill", (n) -> { currentObject.setEdgeBlockAutofill(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockCompatibilityList", (n) -> { currentObject.setEdgeBlockCompatibilityList(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockDeveloperTools", (n) -> { currentObject.setEdgeBlockDeveloperTools(n.getBooleanValue()); });
        deserializerMap.put("edgeBlocked", (n) -> { currentObject.setEdgeBlocked(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockExtensions", (n) -> { currentObject.setEdgeBlockExtensions(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockInPrivateBrowsing", (n) -> { currentObject.setEdgeBlockInPrivateBrowsing(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockJavaScript", (n) -> { currentObject.setEdgeBlockJavaScript(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockLiveTileDataCollection", (n) -> { currentObject.setEdgeBlockLiveTileDataCollection(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockPasswordManager", (n) -> { currentObject.setEdgeBlockPasswordManager(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockPopups", (n) -> { currentObject.setEdgeBlockPopups(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockSearchSuggestions", (n) -> { currentObject.setEdgeBlockSearchSuggestions(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockSendingDoNotTrackHeader", (n) -> { currentObject.setEdgeBlockSendingDoNotTrackHeader(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockSendingIntranetTrafficToInternetExplorer", (n) -> { currentObject.setEdgeBlockSendingIntranetTrafficToInternetExplorer(n.getBooleanValue()); });
        deserializerMap.put("edgeClearBrowsingDataOnExit", (n) -> { currentObject.setEdgeClearBrowsingDataOnExit(n.getBooleanValue()); });
        deserializerMap.put("edgeCookiePolicy", (n) -> { currentObject.setEdgeCookiePolicy(n.getEnumValue(EdgeCookiePolicy.class)); });
        deserializerMap.put("edgeDisableFirstRunPage", (n) -> { currentObject.setEdgeDisableFirstRunPage(n.getBooleanValue()); });
        deserializerMap.put("edgeEnterpriseModeSiteListLocation", (n) -> { currentObject.setEdgeEnterpriseModeSiteListLocation(n.getStringValue()); });
        deserializerMap.put("edgeFirstRunUrl", (n) -> { currentObject.setEdgeFirstRunUrl(n.getStringValue()); });
        deserializerMap.put("edgeHomepageUrls", (n) -> { currentObject.setEdgeHomepageUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("edgeRequireSmartScreen", (n) -> { currentObject.setEdgeRequireSmartScreen(n.getBooleanValue()); });
        deserializerMap.put("edgeSearchEngine", (n) -> { currentObject.setEdgeSearchEngine(n.getObjectValue(EdgeSearchEngineBase::createFromDiscriminatorValue)); });
        deserializerMap.put("edgeSendIntranetTrafficToInternetExplorer", (n) -> { currentObject.setEdgeSendIntranetTrafficToInternetExplorer(n.getBooleanValue()); });
        deserializerMap.put("edgeSyncFavoritesWithInternetExplorer", (n) -> { currentObject.setEdgeSyncFavoritesWithInternetExplorer(n.getBooleanValue()); });
        deserializerMap.put("enterpriseCloudPrintDiscoveryEndPoint", (n) -> { currentObject.setEnterpriseCloudPrintDiscoveryEndPoint(n.getStringValue()); });
        deserializerMap.put("enterpriseCloudPrintDiscoveryMaxLimit", (n) -> { currentObject.setEnterpriseCloudPrintDiscoveryMaxLimit(n.getIntegerValue()); });
        deserializerMap.put("enterpriseCloudPrintMopriaDiscoveryResourceIdentifier", (n) -> { currentObject.setEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier(n.getStringValue()); });
        deserializerMap.put("enterpriseCloudPrintOAuthAuthority", (n) -> { currentObject.setEnterpriseCloudPrintOAuthAuthority(n.getStringValue()); });
        deserializerMap.put("enterpriseCloudPrintOAuthClientIdentifier", (n) -> { currentObject.setEnterpriseCloudPrintOAuthClientIdentifier(n.getStringValue()); });
        deserializerMap.put("enterpriseCloudPrintResourceIdentifier", (n) -> { currentObject.setEnterpriseCloudPrintResourceIdentifier(n.getStringValue()); });
        deserializerMap.put("experienceBlockDeviceDiscovery", (n) -> { currentObject.setExperienceBlockDeviceDiscovery(n.getBooleanValue()); });
        deserializerMap.put("experienceBlockErrorDialogWhenNoSIM", (n) -> { currentObject.setExperienceBlockErrorDialogWhenNoSIM(n.getBooleanValue()); });
        deserializerMap.put("experienceBlockTaskSwitcher", (n) -> { currentObject.setExperienceBlockTaskSwitcher(n.getBooleanValue()); });
        deserializerMap.put("gameDvrBlocked", (n) -> { currentObject.setGameDvrBlocked(n.getBooleanValue()); });
        deserializerMap.put("internetSharingBlocked", (n) -> { currentObject.setInternetSharingBlocked(n.getBooleanValue()); });
        deserializerMap.put("locationServicesBlocked", (n) -> { currentObject.setLocationServicesBlocked(n.getBooleanValue()); });
        deserializerMap.put("lockScreenAllowTimeoutConfiguration", (n) -> { currentObject.setLockScreenAllowTimeoutConfiguration(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockActionCenterNotifications", (n) -> { currentObject.setLockScreenBlockActionCenterNotifications(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockCortana", (n) -> { currentObject.setLockScreenBlockCortana(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockToastNotifications", (n) -> { currentObject.setLockScreenBlockToastNotifications(n.getBooleanValue()); });
        deserializerMap.put("lockScreenTimeoutInSeconds", (n) -> { currentObject.setLockScreenTimeoutInSeconds(n.getIntegerValue()); });
        deserializerMap.put("logonBlockFastUserSwitching", (n) -> { currentObject.setLogonBlockFastUserSwitching(n.getBooleanValue()); });
        deserializerMap.put("microsoftAccountBlocked", (n) -> { currentObject.setMicrosoftAccountBlocked(n.getBooleanValue()); });
        deserializerMap.put("microsoftAccountBlockSettingsSync", (n) -> { currentObject.setMicrosoftAccountBlockSettingsSync(n.getBooleanValue()); });
        deserializerMap.put("networkProxyApplySettingsDeviceWide", (n) -> { currentObject.setNetworkProxyApplySettingsDeviceWide(n.getBooleanValue()); });
        deserializerMap.put("networkProxyAutomaticConfigurationUrl", (n) -> { currentObject.setNetworkProxyAutomaticConfigurationUrl(n.getStringValue()); });
        deserializerMap.put("networkProxyDisableAutoDetect", (n) -> { currentObject.setNetworkProxyDisableAutoDetect(n.getBooleanValue()); });
        deserializerMap.put("networkProxyServer", (n) -> { currentObject.setNetworkProxyServer(n.getObjectValue(Windows10NetworkProxyServer::createFromDiscriminatorValue)); });
        deserializerMap.put("nfcBlocked", (n) -> { currentObject.setNfcBlocked(n.getBooleanValue()); });
        deserializerMap.put("oneDriveDisableFileSync", (n) -> { currentObject.setOneDriveDisableFileSync(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockSimple", (n) -> { currentObject.setPasswordBlockSimple(n.getBooleanValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { currentObject.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumCharacterSetCount", (n) -> { currentObject.setPasswordMinimumCharacterSetCount(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { currentObject.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { currentObject.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordBlockCount", (n) -> { currentObject.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passwordRequired", (n) -> { currentObject.setPasswordRequired(n.getBooleanValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { currentObject.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
        deserializerMap.put("passwordRequireWhenResumeFromIdleState", (n) -> { currentObject.setPasswordRequireWhenResumeFromIdleState(n.getBooleanValue()); });
        deserializerMap.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { currentObject.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        deserializerMap.put("personalizationDesktopImageUrl", (n) -> { currentObject.setPersonalizationDesktopImageUrl(n.getStringValue()); });
        deserializerMap.put("personalizationLockScreenImageUrl", (n) -> { currentObject.setPersonalizationLockScreenImageUrl(n.getStringValue()); });
        deserializerMap.put("privacyAdvertisingId", (n) -> { currentObject.setPrivacyAdvertisingId(n.getEnumValue(StateManagementSetting.class)); });
        deserializerMap.put("privacyAutoAcceptPairingAndConsentPrompts", (n) -> { currentObject.setPrivacyAutoAcceptPairingAndConsentPrompts(n.getBooleanValue()); });
        deserializerMap.put("privacyBlockInputPersonalization", (n) -> { currentObject.setPrivacyBlockInputPersonalization(n.getBooleanValue()); });
        deserializerMap.put("resetProtectionModeBlocked", (n) -> { currentObject.setResetProtectionModeBlocked(n.getBooleanValue()); });
        deserializerMap.put("safeSearchFilter", (n) -> { currentObject.setSafeSearchFilter(n.getEnumValue(SafeSearchFilterType.class)); });
        deserializerMap.put("screenCaptureBlocked", (n) -> { currentObject.setScreenCaptureBlocked(n.getBooleanValue()); });
        deserializerMap.put("searchBlockDiacritics", (n) -> { currentObject.setSearchBlockDiacritics(n.getBooleanValue()); });
        deserializerMap.put("searchDisableAutoLanguageDetection", (n) -> { currentObject.setSearchDisableAutoLanguageDetection(n.getBooleanValue()); });
        deserializerMap.put("searchDisableIndexerBackoff", (n) -> { currentObject.setSearchDisableIndexerBackoff(n.getBooleanValue()); });
        deserializerMap.put("searchDisableIndexingEncryptedItems", (n) -> { currentObject.setSearchDisableIndexingEncryptedItems(n.getBooleanValue()); });
        deserializerMap.put("searchDisableIndexingRemovableDrive", (n) -> { currentObject.setSearchDisableIndexingRemovableDrive(n.getBooleanValue()); });
        deserializerMap.put("searchEnableAutomaticIndexSizeManangement", (n) -> { currentObject.setSearchEnableAutomaticIndexSizeManangement(n.getBooleanValue()); });
        deserializerMap.put("searchEnableRemoteQueries", (n) -> { currentObject.setSearchEnableRemoteQueries(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockAccountsPage", (n) -> { currentObject.setSettingsBlockAccountsPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockAddProvisioningPackage", (n) -> { currentObject.setSettingsBlockAddProvisioningPackage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockAppsPage", (n) -> { currentObject.setSettingsBlockAppsPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockChangeLanguage", (n) -> { currentObject.setSettingsBlockChangeLanguage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockChangePowerSleep", (n) -> { currentObject.setSettingsBlockChangePowerSleep(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockChangeRegion", (n) -> { currentObject.setSettingsBlockChangeRegion(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockChangeSystemTime", (n) -> { currentObject.setSettingsBlockChangeSystemTime(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockDevicesPage", (n) -> { currentObject.setSettingsBlockDevicesPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockEaseOfAccessPage", (n) -> { currentObject.setSettingsBlockEaseOfAccessPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockEditDeviceName", (n) -> { currentObject.setSettingsBlockEditDeviceName(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockGamingPage", (n) -> { currentObject.setSettingsBlockGamingPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockNetworkInternetPage", (n) -> { currentObject.setSettingsBlockNetworkInternetPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockPersonalizationPage", (n) -> { currentObject.setSettingsBlockPersonalizationPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockPrivacyPage", (n) -> { currentObject.setSettingsBlockPrivacyPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockRemoveProvisioningPackage", (n) -> { currentObject.setSettingsBlockRemoveProvisioningPackage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockSettingsApp", (n) -> { currentObject.setSettingsBlockSettingsApp(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockSystemPage", (n) -> { currentObject.setSettingsBlockSystemPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockTimeLanguagePage", (n) -> { currentObject.setSettingsBlockTimeLanguagePage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockUpdateSecurityPage", (n) -> { currentObject.setSettingsBlockUpdateSecurityPage(n.getBooleanValue()); });
        deserializerMap.put("sharedUserAppDataAllowed", (n) -> { currentObject.setSharedUserAppDataAllowed(n.getBooleanValue()); });
        deserializerMap.put("smartScreenBlockPromptOverride", (n) -> { currentObject.setSmartScreenBlockPromptOverride(n.getBooleanValue()); });
        deserializerMap.put("smartScreenBlockPromptOverrideForFiles", (n) -> { currentObject.setSmartScreenBlockPromptOverrideForFiles(n.getBooleanValue()); });
        deserializerMap.put("smartScreenEnableAppInstallControl", (n) -> { currentObject.setSmartScreenEnableAppInstallControl(n.getBooleanValue()); });
        deserializerMap.put("startBlockUnpinningAppsFromTaskbar", (n) -> { currentObject.setStartBlockUnpinningAppsFromTaskbar(n.getBooleanValue()); });
        deserializerMap.put("startMenuAppListVisibility", (n) -> { currentObject.setStartMenuAppListVisibility(n.getEnumValue(WindowsStartMenuAppListVisibilityType.class)); });
        deserializerMap.put("startMenuHideChangeAccountSettings", (n) -> { currentObject.setStartMenuHideChangeAccountSettings(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideFrequentlyUsedApps", (n) -> { currentObject.setStartMenuHideFrequentlyUsedApps(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideHibernate", (n) -> { currentObject.setStartMenuHideHibernate(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideLock", (n) -> { currentObject.setStartMenuHideLock(n.getBooleanValue()); });
        deserializerMap.put("startMenuHidePowerButton", (n) -> { currentObject.setStartMenuHidePowerButton(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideRecentJumpLists", (n) -> { currentObject.setStartMenuHideRecentJumpLists(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideRecentlyAddedApps", (n) -> { currentObject.setStartMenuHideRecentlyAddedApps(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideRestartOptions", (n) -> { currentObject.setStartMenuHideRestartOptions(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideShutDown", (n) -> { currentObject.setStartMenuHideShutDown(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideSignOut", (n) -> { currentObject.setStartMenuHideSignOut(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideSleep", (n) -> { currentObject.setStartMenuHideSleep(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideSwitchAccount", (n) -> { currentObject.setStartMenuHideSwitchAccount(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideUserTile", (n) -> { currentObject.setStartMenuHideUserTile(n.getBooleanValue()); });
        deserializerMap.put("startMenuLayoutEdgeAssetsXml", (n) -> { currentObject.setStartMenuLayoutEdgeAssetsXml(n.getByteArrayValue()); });
        deserializerMap.put("startMenuLayoutXml", (n) -> { currentObject.setStartMenuLayoutXml(n.getByteArrayValue()); });
        deserializerMap.put("startMenuMode", (n) -> { currentObject.setStartMenuMode(n.getEnumValue(WindowsStartMenuModeType.class)); });
        deserializerMap.put("startMenuPinnedFolderDocuments", (n) -> { currentObject.setStartMenuPinnedFolderDocuments(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderDownloads", (n) -> { currentObject.setStartMenuPinnedFolderDownloads(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderFileExplorer", (n) -> { currentObject.setStartMenuPinnedFolderFileExplorer(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderHomeGroup", (n) -> { currentObject.setStartMenuPinnedFolderHomeGroup(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderMusic", (n) -> { currentObject.setStartMenuPinnedFolderMusic(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderNetwork", (n) -> { currentObject.setStartMenuPinnedFolderNetwork(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderPersonalFolder", (n) -> { currentObject.setStartMenuPinnedFolderPersonalFolder(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderPictures", (n) -> { currentObject.setStartMenuPinnedFolderPictures(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderSettings", (n) -> { currentObject.setStartMenuPinnedFolderSettings(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderVideos", (n) -> { currentObject.setStartMenuPinnedFolderVideos(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("storageBlockRemovableStorage", (n) -> { currentObject.setStorageBlockRemovableStorage(n.getBooleanValue()); });
        deserializerMap.put("storageRequireMobileDeviceEncryption", (n) -> { currentObject.setStorageRequireMobileDeviceEncryption(n.getBooleanValue()); });
        deserializerMap.put("storageRestrictAppDataToSystemVolume", (n) -> { currentObject.setStorageRestrictAppDataToSystemVolume(n.getBooleanValue()); });
        deserializerMap.put("storageRestrictAppInstallToSystemVolume", (n) -> { currentObject.setStorageRestrictAppInstallToSystemVolume(n.getBooleanValue()); });
        deserializerMap.put("tenantLockdownRequireNetworkDuringOutOfBoxExperience", (n) -> { currentObject.setTenantLockdownRequireNetworkDuringOutOfBoxExperience(n.getBooleanValue()); });
        deserializerMap.put("usbBlocked", (n) -> { currentObject.setUsbBlocked(n.getBooleanValue()); });
        deserializerMap.put("voiceRecordingBlocked", (n) -> { currentObject.setVoiceRecordingBlocked(n.getBooleanValue()); });
        deserializerMap.put("webRtcBlockLocalhostIpAddress", (n) -> { currentObject.setWebRtcBlockLocalhostIpAddress(n.getBooleanValue()); });
        deserializerMap.put("wiFiBlockAutomaticConnectHotspots", (n) -> { currentObject.setWiFiBlockAutomaticConnectHotspots(n.getBooleanValue()); });
        deserializerMap.put("wiFiBlocked", (n) -> { currentObject.setWiFiBlocked(n.getBooleanValue()); });
        deserializerMap.put("wiFiBlockManualConfiguration", (n) -> { currentObject.setWiFiBlockManualConfiguration(n.getBooleanValue()); });
        deserializerMap.put("wiFiScanInterval", (n) -> { currentObject.setWiFiScanInterval(n.getIntegerValue()); });
        deserializerMap.put("windowsSpotlightBlockConsumerSpecificFeatures", (n) -> { currentObject.setWindowsSpotlightBlockConsumerSpecificFeatures(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightBlocked", (n) -> { currentObject.setWindowsSpotlightBlocked(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightBlockOnActionCenter", (n) -> { currentObject.setWindowsSpotlightBlockOnActionCenter(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightBlockTailoredExperiences", (n) -> { currentObject.setWindowsSpotlightBlockTailoredExperiences(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightBlockThirdPartyNotifications", (n) -> { currentObject.setWindowsSpotlightBlockThirdPartyNotifications(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightBlockWelcomeExperience", (n) -> { currentObject.setWindowsSpotlightBlockWelcomeExperience(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightBlockWindowsTips", (n) -> { currentObject.setWindowsSpotlightBlockWindowsTips(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightConfigureOnLockScreen", (n) -> { currentObject.setWindowsSpotlightConfigureOnLockScreen(n.getEnumValue(WindowsSpotlightEnablementSettings.class)); });
        deserializerMap.put("windowsStoreBlockAutoUpdate", (n) -> { currentObject.setWindowsStoreBlockAutoUpdate(n.getBooleanValue()); });
        deserializerMap.put("windowsStoreBlocked", (n) -> { currentObject.setWindowsStoreBlocked(n.getBooleanValue()); });
        deserializerMap.put("windowsStoreEnablePrivateStoreOnly", (n) -> { currentObject.setWindowsStoreEnablePrivateStoreOnly(n.getBooleanValue()); });
        deserializerMap.put("wirelessDisplayBlockProjectionToThisDevice", (n) -> { currentObject.setWirelessDisplayBlockProjectionToThisDevice(n.getBooleanValue()); });
        deserializerMap.put("wirelessDisplayBlockUserInputFromReceiver", (n) -> { currentObject.setWirelessDisplayBlockUserInputFromReceiver(n.getBooleanValue()); });
        deserializerMap.put("wirelessDisplayRequirePinForPairing", (n) -> { currentObject.setWirelessDisplayRequirePinForPairing(n.getBooleanValue()); });
        return deserializerMap
    }
    /**
     * Gets the gameDvrBlocked property value. Indicates whether or not to block DVR and broadcasting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGameDvrBlocked() {
        return this._gameDvrBlocked;
    }
    /**
     * Gets the internetSharingBlocked property value. Indicates whether or not to Block the user from using internet sharing.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getInternetSharingBlocked() {
        return this._internetSharingBlocked;
    }
    /**
     * Gets the locationServicesBlocked property value. Indicates whether or not to Block the user from location services.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocationServicesBlocked() {
        return this._locationServicesBlocked;
    }
    /**
     * Gets the lockScreenAllowTimeoutConfiguration property value. Specify whether to show a user-configurable setting to control the screen timeout while on the lock screen of Windows 10 Mobile devices. If this policy is set to Allow, the value set by lockScreenTimeoutInSeconds is ignored.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenAllowTimeoutConfiguration() {
        return this._lockScreenAllowTimeoutConfiguration;
    }
    /**
     * Gets the lockScreenBlockActionCenterNotifications property value. Indicates whether or not to block action center notifications over lock screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenBlockActionCenterNotifications() {
        return this._lockScreenBlockActionCenterNotifications;
    }
    /**
     * Gets the lockScreenBlockCortana property value. Indicates whether or not the user can interact with Cortana using speech while the system is locked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenBlockCortana() {
        return this._lockScreenBlockCortana;
    }
    /**
     * Gets the lockScreenBlockToastNotifications property value. Indicates whether to allow toast notifications above the device lock screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenBlockToastNotifications() {
        return this._lockScreenBlockToastNotifications;
    }
    /**
     * Gets the lockScreenTimeoutInSeconds property value. Set the duration (in seconds) from the screen locking to the screen turning off for Windows 10 Mobile devices. Supported values are 11-1800. Valid values 11 to 1800
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLockScreenTimeoutInSeconds() {
        return this._lockScreenTimeoutInSeconds;
    }
    /**
     * Gets the logonBlockFastUserSwitching property value. Disables the ability to quickly switch between users that are logged on simultaneously without logging off.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLogonBlockFastUserSwitching() {
        return this._logonBlockFastUserSwitching;
    }
    /**
     * Gets the microsoftAccountBlocked property value. Indicates whether or not to Block a Microsoft account.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftAccountBlocked() {
        return this._microsoftAccountBlocked;
    }
    /**
     * Gets the microsoftAccountBlockSettingsSync property value. Indicates whether or not to Block Microsoft account settings sync.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftAccountBlockSettingsSync() {
        return this._microsoftAccountBlockSettingsSync;
    }
    /**
     * Gets the networkProxyApplySettingsDeviceWide property value. If set, proxy settings will be applied to all processes and accounts in the device. Otherwise, it will be applied to the user account thats enrolled into MDM.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNetworkProxyApplySettingsDeviceWide() {
        return this._networkProxyApplySettingsDeviceWide;
    }
    /**
     * Gets the networkProxyAutomaticConfigurationUrl property value. Address to the proxy auto-config (PAC) script you want to use.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkProxyAutomaticConfigurationUrl() {
        return this._networkProxyAutomaticConfigurationUrl;
    }
    /**
     * Gets the networkProxyDisableAutoDetect property value. Disable automatic detection of settings. If enabled, the system will try to find the path to a proxy auto-config (PAC) script.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNetworkProxyDisableAutoDetect() {
        return this._networkProxyDisableAutoDetect;
    }
    /**
     * Gets the networkProxyServer property value. Specifies manual proxy server settings.
     * @return a windows10NetworkProxyServer
     */
    @javax.annotation.Nullable
    public Windows10NetworkProxyServer getNetworkProxyServer() {
        return this._networkProxyServer;
    }
    /**
     * Gets the nfcBlocked property value. Indicates whether or not to Block the user from using near field communication.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNfcBlocked() {
        return this._nfcBlocked;
    }
    /**
     * Gets the oneDriveDisableFileSync property value. Gets or sets a value allowing IT admins to prevent apps and features from working with files on OneDrive.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOneDriveDisableFileSync() {
        return this._oneDriveDisableFileSync;
    }
    /**
     * Gets the passwordBlockSimple property value. Specify whether PINs or passwords such as '1111' or '1234' are allowed. For Windows 10 desktops, it also controls the use of picture passwords.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockSimple() {
        return this._passwordBlockSimple;
    }
    /**
     * Gets the passwordExpirationDays property value. The password expiration in days. Valid values 0 to 730
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
     * Gets the passwordMinimumLength property value. The minimum password length. Valid values 4 to 16
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
     * Gets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent reuse of. Valid values 0 to 50
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this._passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequired property value. Indicates whether or not to require the user to have a password.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this._passwordRequired;
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
     * Gets the passwordRequireWhenResumeFromIdleState property value. Indicates whether or not to require a password upon resuming from an idle state.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequireWhenResumeFromIdleState() {
        return this._passwordRequireWhenResumeFromIdleState;
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. The number of sign in failures before factory reset. Valid values 0 to 999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this._passwordSignInFailureCountBeforeFactoryReset;
    }
    /**
     * Gets the personalizationDesktopImageUrl property value. A http or https Url to a jpg, jpeg or png image that needs to be downloaded and used as the Desktop Image or a file Url to a local image on the file system that needs to used as the Desktop Image.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPersonalizationDesktopImageUrl() {
        return this._personalizationDesktopImageUrl;
    }
    /**
     * Gets the personalizationLockScreenImageUrl property value. A http or https Url to a jpg, jpeg or png image that neeeds to be downloaded and used as the Lock Screen Image or a file Url to a local image on the file system that needs to be used as the Lock Screen Image.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPersonalizationLockScreenImageUrl() {
        return this._personalizationLockScreenImageUrl;
    }
    /**
     * Gets the privacyAdvertisingId property value. State Management Setting.
     * @return a stateManagementSetting
     */
    @javax.annotation.Nullable
    public StateManagementSetting getPrivacyAdvertisingId() {
        return this._privacyAdvertisingId;
    }
    /**
     * Gets the privacyAutoAcceptPairingAndConsentPrompts property value. Indicates whether or not to allow the automatic acceptance of the pairing and privacy user consent dialog when launching apps.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrivacyAutoAcceptPairingAndConsentPrompts() {
        return this._privacyAutoAcceptPairingAndConsentPrompts;
    }
    /**
     * Gets the privacyBlockInputPersonalization property value. Indicates whether or not to block the usage of cloud based speech services for Cortana, Dictation, or Store applications.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrivacyBlockInputPersonalization() {
        return this._privacyBlockInputPersonalization;
    }
    /**
     * Gets the resetProtectionModeBlocked property value. Indicates whether or not to Block the user from reset protection mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getResetProtectionModeBlocked() {
        return this._resetProtectionModeBlocked;
    }
    /**
     * Gets the safeSearchFilter property value. Specifies what level of safe search (filtering adult content) is required
     * @return a safeSearchFilterType
     */
    @javax.annotation.Nullable
    public SafeSearchFilterType getSafeSearchFilter() {
        return this._safeSearchFilter;
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to Block the user from taking Screenshots.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this._screenCaptureBlocked;
    }
    /**
     * Gets the searchBlockDiacritics property value. Specifies if search can use diacritics.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchBlockDiacritics() {
        return this._searchBlockDiacritics;
    }
    /**
     * Gets the searchDisableAutoLanguageDetection property value. Specifies whether to use automatic language detection when indexing content and properties.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableAutoLanguageDetection() {
        return this._searchDisableAutoLanguageDetection;
    }
    /**
     * Gets the searchDisableIndexerBackoff property value. Indicates whether or not to disable the search indexer backoff feature.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableIndexerBackoff() {
        return this._searchDisableIndexerBackoff;
    }
    /**
     * Gets the searchDisableIndexingEncryptedItems property value. Indicates whether or not to block indexing of WIP-protected items to prevent them from appearing in search results for Cortana or Explorer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableIndexingEncryptedItems() {
        return this._searchDisableIndexingEncryptedItems;
    }
    /**
     * Gets the searchDisableIndexingRemovableDrive property value. Indicates whether or not to allow users to add locations on removable drives to libraries and to be indexed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableIndexingRemovableDrive() {
        return this._searchDisableIndexingRemovableDrive;
    }
    /**
     * Gets the searchEnableAutomaticIndexSizeManangement property value. Specifies minimum amount of hard drive space on the same drive as the index location before indexing stops.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchEnableAutomaticIndexSizeManangement() {
        return this._searchEnableAutomaticIndexSizeManangement;
    }
    /**
     * Gets the searchEnableRemoteQueries property value. Indicates whether or not to block remote queries of this computers index.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchEnableRemoteQueries() {
        return this._searchEnableRemoteQueries;
    }
    /**
     * Gets the settingsBlockAccountsPage property value. Indicates whether or not to block access to Accounts in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockAccountsPage() {
        return this._settingsBlockAccountsPage;
    }
    /**
     * Gets the settingsBlockAddProvisioningPackage property value. Indicates whether or not to block the user from installing provisioning packages.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockAddProvisioningPackage() {
        return this._settingsBlockAddProvisioningPackage;
    }
    /**
     * Gets the settingsBlockAppsPage property value. Indicates whether or not to block access to Apps in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockAppsPage() {
        return this._settingsBlockAppsPage;
    }
    /**
     * Gets the settingsBlockChangeLanguage property value. Indicates whether or not to block the user from changing the language settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockChangeLanguage() {
        return this._settingsBlockChangeLanguage;
    }
    /**
     * Gets the settingsBlockChangePowerSleep property value. Indicates whether or not to block the user from changing power and sleep settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockChangePowerSleep() {
        return this._settingsBlockChangePowerSleep;
    }
    /**
     * Gets the settingsBlockChangeRegion property value. Indicates whether or not to block the user from changing the region settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockChangeRegion() {
        return this._settingsBlockChangeRegion;
    }
    /**
     * Gets the settingsBlockChangeSystemTime property value. Indicates whether or not to block the user from changing date and time settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockChangeSystemTime() {
        return this._settingsBlockChangeSystemTime;
    }
    /**
     * Gets the settingsBlockDevicesPage property value. Indicates whether or not to block access to Devices in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockDevicesPage() {
        return this._settingsBlockDevicesPage;
    }
    /**
     * Gets the settingsBlockEaseOfAccessPage property value. Indicates whether or not to block access to Ease of Access in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockEaseOfAccessPage() {
        return this._settingsBlockEaseOfAccessPage;
    }
    /**
     * Gets the settingsBlockEditDeviceName property value. Indicates whether or not to block the user from editing the device name.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockEditDeviceName() {
        return this._settingsBlockEditDeviceName;
    }
    /**
     * Gets the settingsBlockGamingPage property value. Indicates whether or not to block access to Gaming in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockGamingPage() {
        return this._settingsBlockGamingPage;
    }
    /**
     * Gets the settingsBlockNetworkInternetPage property value. Indicates whether or not to block access to Network & Internet in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockNetworkInternetPage() {
        return this._settingsBlockNetworkInternetPage;
    }
    /**
     * Gets the settingsBlockPersonalizationPage property value. Indicates whether or not to block access to Personalization in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockPersonalizationPage() {
        return this._settingsBlockPersonalizationPage;
    }
    /**
     * Gets the settingsBlockPrivacyPage property value. Indicates whether or not to block access to Privacy in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockPrivacyPage() {
        return this._settingsBlockPrivacyPage;
    }
    /**
     * Gets the settingsBlockRemoveProvisioningPackage property value. Indicates whether or not to block the runtime configuration agent from removing provisioning packages.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockRemoveProvisioningPackage() {
        return this._settingsBlockRemoveProvisioningPackage;
    }
    /**
     * Gets the settingsBlockSettingsApp property value. Indicates whether or not to block access to Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockSettingsApp() {
        return this._settingsBlockSettingsApp;
    }
    /**
     * Gets the settingsBlockSystemPage property value. Indicates whether or not to block access to System in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockSystemPage() {
        return this._settingsBlockSystemPage;
    }
    /**
     * Gets the settingsBlockTimeLanguagePage property value. Indicates whether or not to block access to Time & Language in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockTimeLanguagePage() {
        return this._settingsBlockTimeLanguagePage;
    }
    /**
     * Gets the settingsBlockUpdateSecurityPage property value. Indicates whether or not to block access to Update & Security in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockUpdateSecurityPage() {
        return this._settingsBlockUpdateSecurityPage;
    }
    /**
     * Gets the sharedUserAppDataAllowed property value. Indicates whether or not to block multiple users of the same app to share data.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSharedUserAppDataAllowed() {
        return this._sharedUserAppDataAllowed;
    }
    /**
     * Gets the smartScreenBlockPromptOverride property value. Indicates whether or not users can override SmartScreen Filter warnings about potentially malicious websites.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmartScreenBlockPromptOverride() {
        return this._smartScreenBlockPromptOverride;
    }
    /**
     * Gets the smartScreenBlockPromptOverrideForFiles property value. Indicates whether or not users can override the SmartScreen Filter warnings about downloading unverified files
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmartScreenBlockPromptOverrideForFiles() {
        return this._smartScreenBlockPromptOverrideForFiles;
    }
    /**
     * Gets the smartScreenEnableAppInstallControl property value. This property will be deprecated in July 2019 and will be replaced by property SmartScreenAppInstallControl. Allows IT Admins to control whether users are allowed to install apps from places other than the Store.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmartScreenEnableAppInstallControl() {
        return this._smartScreenEnableAppInstallControl;
    }
    /**
     * Gets the startBlockUnpinningAppsFromTaskbar property value. Indicates whether or not to block the user from unpinning apps from taskbar.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartBlockUnpinningAppsFromTaskbar() {
        return this._startBlockUnpinningAppsFromTaskbar;
    }
    /**
     * Gets the startMenuAppListVisibility property value. Type of start menu app list visibility.
     * @return a windowsStartMenuAppListVisibilityType
     */
    @javax.annotation.Nullable
    public WindowsStartMenuAppListVisibilityType getStartMenuAppListVisibility() {
        return this._startMenuAppListVisibility;
    }
    /**
     * Gets the startMenuHideChangeAccountSettings property value. Enabling this policy hides the change account setting from appearing in the user tile in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideChangeAccountSettings() {
        return this._startMenuHideChangeAccountSettings;
    }
    /**
     * Gets the startMenuHideFrequentlyUsedApps property value. Enabling this policy hides the most used apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideFrequentlyUsedApps() {
        return this._startMenuHideFrequentlyUsedApps;
    }
    /**
     * Gets the startMenuHideHibernate property value. Enabling this policy hides hibernate from appearing in the power button in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideHibernate() {
        return this._startMenuHideHibernate;
    }
    /**
     * Gets the startMenuHideLock property value. Enabling this policy hides lock from appearing in the user tile in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideLock() {
        return this._startMenuHideLock;
    }
    /**
     * Gets the startMenuHidePowerButton property value. Enabling this policy hides the power button from appearing in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHidePowerButton() {
        return this._startMenuHidePowerButton;
    }
    /**
     * Gets the startMenuHideRecentJumpLists property value. Enabling this policy hides recent jump lists from appearing on the start menu/taskbar and disables the corresponding toggle in the Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideRecentJumpLists() {
        return this._startMenuHideRecentJumpLists;
    }
    /**
     * Gets the startMenuHideRecentlyAddedApps property value. Enabling this policy hides recently added apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideRecentlyAddedApps() {
        return this._startMenuHideRecentlyAddedApps;
    }
    /**
     * Gets the startMenuHideRestartOptions property value. Enabling this policy hides 'Restart/Update and Restart' from appearing in the power button in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideRestartOptions() {
        return this._startMenuHideRestartOptions;
    }
    /**
     * Gets the startMenuHideShutDown property value. Enabling this policy hides shut down/update and shut down from appearing in the power button in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideShutDown() {
        return this._startMenuHideShutDown;
    }
    /**
     * Gets the startMenuHideSignOut property value. Enabling this policy hides sign out from appearing in the user tile in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideSignOut() {
        return this._startMenuHideSignOut;
    }
    /**
     * Gets the startMenuHideSleep property value. Enabling this policy hides sleep from appearing in the power button in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideSleep() {
        return this._startMenuHideSleep;
    }
    /**
     * Gets the startMenuHideSwitchAccount property value. Enabling this policy hides switch account from appearing in the user tile in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideSwitchAccount() {
        return this._startMenuHideSwitchAccount;
    }
    /**
     * Gets the startMenuHideUserTile property value. Enabling this policy hides the user tile from appearing in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideUserTile() {
        return this._startMenuHideUserTile;
    }
    /**
     * Gets the startMenuLayoutEdgeAssetsXml property value. This policy setting allows you to import Edge assets to be used with startMenuLayoutXml policy. Start layout can contain secondary tile from Edge app which looks for Edge local asset file. Edge local asset would not exist and cause Edge secondary tile to appear empty in this case. This policy only gets applied when startMenuLayoutXml policy is modified. The value should be a UTF-8 Base64 encoded byte array.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getStartMenuLayoutEdgeAssetsXml() {
        return this._startMenuLayoutEdgeAssetsXml;
    }
    /**
     * Gets the startMenuLayoutXml property value. Allows admins to override the default Start menu layout and prevents the user from changing it. The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in a UTF8 encoded byte array format.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getStartMenuLayoutXml() {
        return this._startMenuLayoutXml;
    }
    /**
     * Gets the startMenuMode property value. Type of display modes for the start menu.
     * @return a windowsStartMenuModeType
     */
    @javax.annotation.Nullable
    public WindowsStartMenuModeType getStartMenuMode() {
        return this._startMenuMode;
    }
    /**
     * Gets the startMenuPinnedFolderDocuments property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderDocuments() {
        return this._startMenuPinnedFolderDocuments;
    }
    /**
     * Gets the startMenuPinnedFolderDownloads property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderDownloads() {
        return this._startMenuPinnedFolderDownloads;
    }
    /**
     * Gets the startMenuPinnedFolderFileExplorer property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderFileExplorer() {
        return this._startMenuPinnedFolderFileExplorer;
    }
    /**
     * Gets the startMenuPinnedFolderHomeGroup property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderHomeGroup() {
        return this._startMenuPinnedFolderHomeGroup;
    }
    /**
     * Gets the startMenuPinnedFolderMusic property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderMusic() {
        return this._startMenuPinnedFolderMusic;
    }
    /**
     * Gets the startMenuPinnedFolderNetwork property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderNetwork() {
        return this._startMenuPinnedFolderNetwork;
    }
    /**
     * Gets the startMenuPinnedFolderPersonalFolder property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderPersonalFolder() {
        return this._startMenuPinnedFolderPersonalFolder;
    }
    /**
     * Gets the startMenuPinnedFolderPictures property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderPictures() {
        return this._startMenuPinnedFolderPictures;
    }
    /**
     * Gets the startMenuPinnedFolderSettings property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderSettings() {
        return this._startMenuPinnedFolderSettings;
    }
    /**
     * Gets the startMenuPinnedFolderVideos property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderVideos() {
        return this._startMenuPinnedFolderVideos;
    }
    /**
     * Gets the storageBlockRemovableStorage property value. Indicates whether or not to Block the user from using removable storage.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageBlockRemovableStorage() {
        return this._storageBlockRemovableStorage;
    }
    /**
     * Gets the storageRequireMobileDeviceEncryption property value. Indicating whether or not to require encryption on a mobile device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRequireMobileDeviceEncryption() {
        return this._storageRequireMobileDeviceEncryption;
    }
    /**
     * Gets the storageRestrictAppDataToSystemVolume property value. Indicates whether application data is restricted to the system drive.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRestrictAppDataToSystemVolume() {
        return this._storageRestrictAppDataToSystemVolume;
    }
    /**
     * Gets the storageRestrictAppInstallToSystemVolume property value. Indicates whether the installation of applications is restricted to the system drive.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRestrictAppInstallToSystemVolume() {
        return this._storageRestrictAppInstallToSystemVolume;
    }
    /**
     * Gets the tenantLockdownRequireNetworkDuringOutOfBoxExperience property value. Whether the device is required to connect to the network.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTenantLockdownRequireNetworkDuringOutOfBoxExperience() {
        return this._tenantLockdownRequireNetworkDuringOutOfBoxExperience;
    }
    /**
     * Gets the usbBlocked property value. Indicates whether or not to Block the user from USB connection.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUsbBlocked() {
        return this._usbBlocked;
    }
    /**
     * Gets the voiceRecordingBlocked property value. Indicates whether or not to Block the user from voice recording.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getVoiceRecordingBlocked() {
        return this._voiceRecordingBlocked;
    }
    /**
     * Gets the webRtcBlockLocalhostIpAddress property value. Indicates whether or not user's localhost IP address is displayed while making phone calls using the WebRTC
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWebRtcBlockLocalhostIpAddress() {
        return this._webRtcBlockLocalhostIpAddress;
    }
    /**
     * Gets the wiFiBlockAutomaticConnectHotspots property value. Indicating whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWiFiBlockAutomaticConnectHotspots() {
        return this._wiFiBlockAutomaticConnectHotspots;
    }
    /**
     * Gets the wiFiBlocked property value. Indicates whether or not to Block the user from using Wi-Fi.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWiFiBlocked() {
        return this._wiFiBlocked;
    }
    /**
     * Gets the wiFiBlockManualConfiguration property value. Indicates whether or not to Block the user from using Wi-Fi manual configuration.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWiFiBlockManualConfiguration() {
        return this._wiFiBlockManualConfiguration;
    }
    /**
     * Gets the wiFiScanInterval property value. Specify how often devices scan for Wi-Fi networks. Supported values are 1-500, where 100 = default, and 500 = low frequency. Valid values 1 to 500
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWiFiScanInterval() {
        return this._wiFiScanInterval;
    }
    /**
     * Gets the windowsSpotlightBlockConsumerSpecificFeatures property value. Allows IT admins to block experiences that are typically for consumers only, such as Start suggestions, Membership notifications, Post-OOBE app install and redirect tiles.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockConsumerSpecificFeatures() {
        return this._windowsSpotlightBlockConsumerSpecificFeatures;
    }
    /**
     * Gets the windowsSpotlightBlocked property value. Allows IT admins to turn off all Windows Spotlight features
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlocked() {
        return this._windowsSpotlightBlocked;
    }
    /**
     * Gets the windowsSpotlightBlockOnActionCenter property value. Block suggestions from Microsoft that show after each OS clean install, upgrade or in an on-going basis to introduce users to what is new or changed
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockOnActionCenter() {
        return this._windowsSpotlightBlockOnActionCenter;
    }
    /**
     * Gets the windowsSpotlightBlockTailoredExperiences property value. Block personalized content in Windows spotlight based on users device usage.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockTailoredExperiences() {
        return this._windowsSpotlightBlockTailoredExperiences;
    }
    /**
     * Gets the windowsSpotlightBlockThirdPartyNotifications property value. Block third party content delivered via Windows Spotlight
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockThirdPartyNotifications() {
        return this._windowsSpotlightBlockThirdPartyNotifications;
    }
    /**
     * Gets the windowsSpotlightBlockWelcomeExperience property value. Block Windows Spotlight Windows welcome experience
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockWelcomeExperience() {
        return this._windowsSpotlightBlockWelcomeExperience;
    }
    /**
     * Gets the windowsSpotlightBlockWindowsTips property value. Allows IT admins to turn off the popup of Windows Tips.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockWindowsTips() {
        return this._windowsSpotlightBlockWindowsTips;
    }
    /**
     * Gets the windowsSpotlightConfigureOnLockScreen property value. Allows IT admind to set a predefined default search engine for MDM-Controlled devices
     * @return a windowsSpotlightEnablementSettings
     */
    @javax.annotation.Nullable
    public WindowsSpotlightEnablementSettings getWindowsSpotlightConfigureOnLockScreen() {
        return this._windowsSpotlightConfigureOnLockScreen;
    }
    /**
     * Gets the windowsStoreBlockAutoUpdate property value. Indicates whether or not to block automatic update of apps from Windows Store.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsStoreBlockAutoUpdate() {
        return this._windowsStoreBlockAutoUpdate;
    }
    /**
     * Gets the windowsStoreBlocked property value. Indicates whether or not to Block the user from using the Windows store.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsStoreBlocked() {
        return this._windowsStoreBlocked;
    }
    /**
     * Gets the windowsStoreEnablePrivateStoreOnly property value. Indicates whether or not to enable Private Store Only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsStoreEnablePrivateStoreOnly() {
        return this._windowsStoreEnablePrivateStoreOnly;
    }
    /**
     * Gets the wirelessDisplayBlockProjectionToThisDevice property value. Indicates whether or not to allow other devices from discovering this PC for projection.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWirelessDisplayBlockProjectionToThisDevice() {
        return this._wirelessDisplayBlockProjectionToThisDevice;
    }
    /**
     * Gets the wirelessDisplayBlockUserInputFromReceiver property value. Indicates whether or not to allow user input from wireless display receiver.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWirelessDisplayBlockUserInputFromReceiver() {
        return this._wirelessDisplayBlockUserInputFromReceiver;
    }
    /**
     * Gets the wirelessDisplayRequirePinForPairing property value. Indicates whether or not to require a PIN for new devices to initiate pairing.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWirelessDisplayRequirePinForPairing() {
        return this._wirelessDisplayRequirePinForPairing;
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
        this._accountsBlockAddingNonMicrosoftAccountEmail = value;
    }
    /**
     * Sets the antiTheftModeBlocked property value. Indicates whether or not to block the user from selecting an AntiTheft mode preference (Windows 10 Mobile only).
     * @param value Value to set for the antiTheftModeBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAntiTheftModeBlocked(@javax.annotation.Nullable final Boolean value) {
        this._antiTheftModeBlocked = value;
    }
    /**
     * Sets the appsAllowTrustedAppsSideloading property value. State Management Setting.
     * @param value Value to set for the appsAllowTrustedAppsSideloading property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsAllowTrustedAppsSideloading(@javax.annotation.Nullable final StateManagementSetting value) {
        this._appsAllowTrustedAppsSideloading = value;
    }
    /**
     * Sets the appsBlockWindowsStoreOriginatedApps property value. Indicates whether or not to disable the launch of all apps from Windows Store that came pre-installed or were downloaded.
     * @param value Value to set for the appsBlockWindowsStoreOriginatedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsBlockWindowsStoreOriginatedApps(@javax.annotation.Nullable final Boolean value) {
        this._appsBlockWindowsStoreOriginatedApps = value;
    }
    /**
     * Sets the bluetoothAllowedServices property value. Specify a list of allowed Bluetooth services and profiles in hex formatted strings.
     * @param value Value to set for the bluetoothAllowedServices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothAllowedServices(@javax.annotation.Nullable final java.util.List<String> value) {
        this._bluetoothAllowedServices = value;
    }
    /**
     * Sets the bluetoothBlockAdvertising property value. Whether or not to Block the user from using bluetooth advertising.
     * @param value Value to set for the bluetoothBlockAdvertising property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlockAdvertising(@javax.annotation.Nullable final Boolean value) {
        this._bluetoothBlockAdvertising = value;
    }
    /**
     * Sets the bluetoothBlockDiscoverableMode property value. Whether or not to Block the user from using bluetooth discoverable mode.
     * @param value Value to set for the bluetoothBlockDiscoverableMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlockDiscoverableMode(@javax.annotation.Nullable final Boolean value) {
        this._bluetoothBlockDiscoverableMode = value;
    }
    /**
     * Sets the bluetoothBlocked property value. Whether or not to Block the user from using bluetooth.
     * @param value Value to set for the bluetoothBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlocked(@javax.annotation.Nullable final Boolean value) {
        this._bluetoothBlocked = value;
    }
    /**
     * Sets the bluetoothBlockPrePairing property value. Whether or not to block specific bundled Bluetooth peripherals to automatically pair with the host device.
     * @param value Value to set for the bluetoothBlockPrePairing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlockPrePairing(@javax.annotation.Nullable final Boolean value) {
        this._bluetoothBlockPrePairing = value;
    }
    /**
     * Sets the cameraBlocked property value. Whether or not to Block the user from accessing the camera of the device.
     * @param value Value to set for the cameraBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCameraBlocked(@javax.annotation.Nullable final Boolean value) {
        this._cameraBlocked = value;
    }
    /**
     * Sets the cellularBlockDataWhenRoaming property value. Whether or not to Block the user from using data over cellular while roaming.
     * @param value Value to set for the cellularBlockDataWhenRoaming property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockDataWhenRoaming(@javax.annotation.Nullable final Boolean value) {
        this._cellularBlockDataWhenRoaming = value;
    }
    /**
     * Sets the cellularBlockVpn property value. Whether or not to Block the user from using VPN over cellular.
     * @param value Value to set for the cellularBlockVpn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockVpn(@javax.annotation.Nullable final Boolean value) {
        this._cellularBlockVpn = value;
    }
    /**
     * Sets the cellularBlockVpnWhenRoaming property value. Whether or not to Block the user from using VPN when roaming over cellular.
     * @param value Value to set for the cellularBlockVpnWhenRoaming property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockVpnWhenRoaming(@javax.annotation.Nullable final Boolean value) {
        this._cellularBlockVpnWhenRoaming = value;
    }
    /**
     * Sets the certificatesBlockManualRootCertificateInstallation property value. Whether or not to Block the user from doing manual root certificate installation.
     * @param value Value to set for the certificatesBlockManualRootCertificateInstallation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificatesBlockManualRootCertificateInstallation(@javax.annotation.Nullable final Boolean value) {
        this._certificatesBlockManualRootCertificateInstallation = value;
    }
    /**
     * Sets the connectedDevicesServiceBlocked property value. Whether or not to block Connected Devices Service which enables discovery and connection to other devices, remote messaging, remote app sessions and other cross-device experiences.
     * @param value Value to set for the connectedDevicesServiceBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectedDevicesServiceBlocked(@javax.annotation.Nullable final Boolean value) {
        this._connectedDevicesServiceBlocked = value;
    }
    /**
     * Sets the copyPasteBlocked property value. Whether or not to Block the user from using copy paste.
     * @param value Value to set for the copyPasteBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCopyPasteBlocked(@javax.annotation.Nullable final Boolean value) {
        this._copyPasteBlocked = value;
    }
    /**
     * Sets the cortanaBlocked property value. Whether or not to Block the user from using Cortana.
     * @param value Value to set for the cortanaBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCortanaBlocked(@javax.annotation.Nullable final Boolean value) {
        this._cortanaBlocked = value;
    }
    /**
     * Sets the defenderBlockEndUserAccess property value. Whether or not to block end user access to Defender.
     * @param value Value to set for the defenderBlockEndUserAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderBlockEndUserAccess(@javax.annotation.Nullable final Boolean value) {
        this._defenderBlockEndUserAccess = value;
    }
    /**
     * Sets the defenderCloudBlockLevel property value. Possible values of Cloud Block Level
     * @param value Value to set for the defenderCloudBlockLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderCloudBlockLevel(@javax.annotation.Nullable final DefenderCloudBlockLevelType value) {
        this._defenderCloudBlockLevel = value;
    }
    /**
     * Sets the defenderDaysBeforeDeletingQuarantinedMalware property value. Number of days before deleting quarantined malware. Valid values 0 to 90
     * @param value Value to set for the defenderDaysBeforeDeletingQuarantinedMalware property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDaysBeforeDeletingQuarantinedMalware(@javax.annotation.Nullable final Integer value) {
        this._defenderDaysBeforeDeletingQuarantinedMalware = value;
    }
    /**
     * Sets the defenderDetectedMalwareActions property value. Gets or sets Defenders actions to take on detected Malware per threat level.
     * @param value Value to set for the defenderDetectedMalwareActions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDetectedMalwareActions(@javax.annotation.Nullable final DefenderDetectedMalwareActions value) {
        this._defenderDetectedMalwareActions = value;
    }
    /**
     * Sets the defenderFileExtensionsToExclude property value. File extensions to exclude from scans and real time protection.
     * @param value Value to set for the defenderFileExtensionsToExclude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderFileExtensionsToExclude(@javax.annotation.Nullable final java.util.List<String> value) {
        this._defenderFileExtensionsToExclude = value;
    }
    /**
     * Sets the defenderFilesAndFoldersToExclude property value. Files and folder to exclude from scans and real time protection.
     * @param value Value to set for the defenderFilesAndFoldersToExclude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderFilesAndFoldersToExclude(@javax.annotation.Nullable final java.util.List<String> value) {
        this._defenderFilesAndFoldersToExclude = value;
    }
    /**
     * Sets the defenderMonitorFileActivity property value. Possible values for monitoring file activity.
     * @param value Value to set for the defenderMonitorFileActivity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderMonitorFileActivity(@javax.annotation.Nullable final DefenderMonitorFileActivity value) {
        this._defenderMonitorFileActivity = value;
    }
    /**
     * Sets the defenderProcessesToExclude property value. Processes to exclude from scans and real time protection.
     * @param value Value to set for the defenderProcessesToExclude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderProcessesToExclude(@javax.annotation.Nullable final java.util.List<String> value) {
        this._defenderProcessesToExclude = value;
    }
    /**
     * Sets the defenderPromptForSampleSubmission property value. Possible values for prompting user for samples submission.
     * @param value Value to set for the defenderPromptForSampleSubmission property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderPromptForSampleSubmission(@javax.annotation.Nullable final DefenderPromptForSampleSubmission value) {
        this._defenderPromptForSampleSubmission = value;
    }
    /**
     * Sets the defenderRequireBehaviorMonitoring property value. Indicates whether or not to require behavior monitoring.
     * @param value Value to set for the defenderRequireBehaviorMonitoring property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderRequireBehaviorMonitoring(@javax.annotation.Nullable final Boolean value) {
        this._defenderRequireBehaviorMonitoring = value;
    }
    /**
     * Sets the defenderRequireCloudProtection property value. Indicates whether or not to require cloud protection.
     * @param value Value to set for the defenderRequireCloudProtection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderRequireCloudProtection(@javax.annotation.Nullable final Boolean value) {
        this._defenderRequireCloudProtection = value;
    }
    /**
     * Sets the defenderRequireNetworkInspectionSystem property value. Indicates whether or not to require network inspection system.
     * @param value Value to set for the defenderRequireNetworkInspectionSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderRequireNetworkInspectionSystem(@javax.annotation.Nullable final Boolean value) {
        this._defenderRequireNetworkInspectionSystem = value;
    }
    /**
     * Sets the defenderRequireRealTimeMonitoring property value. Indicates whether or not to require real time monitoring.
     * @param value Value to set for the defenderRequireRealTimeMonitoring property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderRequireRealTimeMonitoring(@javax.annotation.Nullable final Boolean value) {
        this._defenderRequireRealTimeMonitoring = value;
    }
    /**
     * Sets the defenderScanArchiveFiles property value. Indicates whether or not to scan archive files.
     * @param value Value to set for the defenderScanArchiveFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanArchiveFiles(@javax.annotation.Nullable final Boolean value) {
        this._defenderScanArchiveFiles = value;
    }
    /**
     * Sets the defenderScanDownloads property value. Indicates whether or not to scan downloads.
     * @param value Value to set for the defenderScanDownloads property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanDownloads(@javax.annotation.Nullable final Boolean value) {
        this._defenderScanDownloads = value;
    }
    /**
     * Sets the defenderScanIncomingMail property value. Indicates whether or not to scan incoming mail messages.
     * @param value Value to set for the defenderScanIncomingMail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanIncomingMail(@javax.annotation.Nullable final Boolean value) {
        this._defenderScanIncomingMail = value;
    }
    /**
     * Sets the defenderScanMappedNetworkDrivesDuringFullScan property value. Indicates whether or not to scan mapped network drives during full scan.
     * @param value Value to set for the defenderScanMappedNetworkDrivesDuringFullScan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanMappedNetworkDrivesDuringFullScan(@javax.annotation.Nullable final Boolean value) {
        this._defenderScanMappedNetworkDrivesDuringFullScan = value;
    }
    /**
     * Sets the defenderScanMaxCpu property value. Max CPU usage percentage during scan. Valid values 0 to 100
     * @param value Value to set for the defenderScanMaxCpu property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanMaxCpu(@javax.annotation.Nullable final Integer value) {
        this._defenderScanMaxCpu = value;
    }
    /**
     * Sets the defenderScanNetworkFiles property value. Indicates whether or not to scan files opened from a network folder.
     * @param value Value to set for the defenderScanNetworkFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanNetworkFiles(@javax.annotation.Nullable final Boolean value) {
        this._defenderScanNetworkFiles = value;
    }
    /**
     * Sets the defenderScanRemovableDrivesDuringFullScan property value. Indicates whether or not to scan removable drives during full scan.
     * @param value Value to set for the defenderScanRemovableDrivesDuringFullScan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanRemovableDrivesDuringFullScan(@javax.annotation.Nullable final Boolean value) {
        this._defenderScanRemovableDrivesDuringFullScan = value;
    }
    /**
     * Sets the defenderScanScriptsLoadedInInternetExplorer property value. Indicates whether or not to scan scripts loaded in Internet Explorer browser.
     * @param value Value to set for the defenderScanScriptsLoadedInInternetExplorer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanScriptsLoadedInInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this._defenderScanScriptsLoadedInInternetExplorer = value;
    }
    /**
     * Sets the defenderScanType property value. Possible values for system scan type.
     * @param value Value to set for the defenderScanType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanType(@javax.annotation.Nullable final DefenderScanType value) {
        this._defenderScanType = value;
    }
    /**
     * Sets the defenderScheduledQuickScanTime property value. The time to perform a daily quick scan.
     * @param value Value to set for the defenderScheduledQuickScanTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScheduledQuickScanTime(@javax.annotation.Nullable final LocalTime value) {
        this._defenderScheduledQuickScanTime = value;
    }
    /**
     * Sets the defenderScheduledScanTime property value. The defender time for the system scan.
     * @param value Value to set for the defenderScheduledScanTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScheduledScanTime(@javax.annotation.Nullable final LocalTime value) {
        this._defenderScheduledScanTime = value;
    }
    /**
     * Sets the defenderSignatureUpdateIntervalInHours property value. The signature update interval in hours. Specify 0 not to check. Valid values 0 to 24
     * @param value Value to set for the defenderSignatureUpdateIntervalInHours property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSignatureUpdateIntervalInHours(@javax.annotation.Nullable final Integer value) {
        this._defenderSignatureUpdateIntervalInHours = value;
    }
    /**
     * Sets the defenderSystemScanSchedule property value. Possible values for a weekly schedule.
     * @param value Value to set for the defenderSystemScanSchedule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSystemScanSchedule(@javax.annotation.Nullable final WeeklySchedule value) {
        this._defenderSystemScanSchedule = value;
    }
    /**
     * Sets the developerUnlockSetting property value. State Management Setting.
     * @param value Value to set for the developerUnlockSetting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeveloperUnlockSetting(@javax.annotation.Nullable final StateManagementSetting value) {
        this._developerUnlockSetting = value;
    }
    /**
     * Sets the deviceManagementBlockFactoryResetOnMobile property value. Indicates whether or not to Block the user from resetting their phone.
     * @param value Value to set for the deviceManagementBlockFactoryResetOnMobile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceManagementBlockFactoryResetOnMobile(@javax.annotation.Nullable final Boolean value) {
        this._deviceManagementBlockFactoryResetOnMobile = value;
    }
    /**
     * Sets the deviceManagementBlockManualUnenroll property value. Indicates whether or not to Block the user from doing manual un-enrollment from device management.
     * @param value Value to set for the deviceManagementBlockManualUnenroll property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceManagementBlockManualUnenroll(@javax.annotation.Nullable final Boolean value) {
        this._deviceManagementBlockManualUnenroll = value;
    }
    /**
     * Sets the diagnosticsDataSubmissionMode property value. Allow the device to send diagnostic and usage telemetry data, such as Watson.
     * @param value Value to set for the diagnosticsDataSubmissionMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiagnosticsDataSubmissionMode(@javax.annotation.Nullable final DiagnosticDataSubmissionMode value) {
        this._diagnosticsDataSubmissionMode = value;
    }
    /**
     * Sets the edgeAllowStartPagesModification property value. Allow users to change Start pages on Edge. Use the EdgeHomepageUrls to specify the Start pages that the user would see by default when they open Edge.
     * @param value Value to set for the edgeAllowStartPagesModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeAllowStartPagesModification(@javax.annotation.Nullable final Boolean value) {
        this._edgeAllowStartPagesModification = value;
    }
    /**
     * Sets the edgeBlockAccessToAboutFlags property value. Indicates whether or not to prevent access to about flags on Edge browser.
     * @param value Value to set for the edgeBlockAccessToAboutFlags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockAccessToAboutFlags(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockAccessToAboutFlags = value;
    }
    /**
     * Sets the edgeBlockAddressBarDropdown property value. Block the address bar dropdown functionality in Microsoft Edge. Disable this settings to minimize network connections from Microsoft Edge to Microsoft services.
     * @param value Value to set for the edgeBlockAddressBarDropdown property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockAddressBarDropdown(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockAddressBarDropdown = value;
    }
    /**
     * Sets the edgeBlockAutofill property value. Indicates whether or not to block auto fill.
     * @param value Value to set for the edgeBlockAutofill property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockAutofill(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockAutofill = value;
    }
    /**
     * Sets the edgeBlockCompatibilityList property value. Block Microsoft compatibility list in Microsoft Edge. This list from Microsoft helps Edge properly display sites with known compatibility issues.
     * @param value Value to set for the edgeBlockCompatibilityList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockCompatibilityList(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockCompatibilityList = value;
    }
    /**
     * Sets the edgeBlockDeveloperTools property value. Indicates whether or not to block developer tools in the Edge browser.
     * @param value Value to set for the edgeBlockDeveloperTools property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockDeveloperTools(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockDeveloperTools = value;
    }
    /**
     * Sets the edgeBlocked property value. Indicates whether or not to Block the user from using the Edge browser.
     * @param value Value to set for the edgeBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlocked(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlocked = value;
    }
    /**
     * Sets the edgeBlockExtensions property value. Indicates whether or not to block extensions in the Edge browser.
     * @param value Value to set for the edgeBlockExtensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockExtensions(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockExtensions = value;
    }
    /**
     * Sets the edgeBlockInPrivateBrowsing property value. Indicates whether or not to block InPrivate browsing on corporate networks, in the Edge browser.
     * @param value Value to set for the edgeBlockInPrivateBrowsing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockInPrivateBrowsing(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockInPrivateBrowsing = value;
    }
    /**
     * Sets the edgeBlockJavaScript property value. Indicates whether or not to Block the user from using JavaScript.
     * @param value Value to set for the edgeBlockJavaScript property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockJavaScript(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockJavaScript = value;
    }
    /**
     * Sets the edgeBlockLiveTileDataCollection property value. Block the collection of information by Microsoft for live tile creation when users pin a site to Start from Microsoft Edge.
     * @param value Value to set for the edgeBlockLiveTileDataCollection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockLiveTileDataCollection(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockLiveTileDataCollection = value;
    }
    /**
     * Sets the edgeBlockPasswordManager property value. Indicates whether or not to Block password manager.
     * @param value Value to set for the edgeBlockPasswordManager property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockPasswordManager(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockPasswordManager = value;
    }
    /**
     * Sets the edgeBlockPopups property value. Indicates whether or not to block popups.
     * @param value Value to set for the edgeBlockPopups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockPopups(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockPopups = value;
    }
    /**
     * Sets the edgeBlockSearchSuggestions property value. Indicates whether or not to block the user from using the search suggestions in the address bar.
     * @param value Value to set for the edgeBlockSearchSuggestions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockSearchSuggestions(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockSearchSuggestions = value;
    }
    /**
     * Sets the edgeBlockSendingDoNotTrackHeader property value. Indicates whether or not to Block the user from sending the do not track header.
     * @param value Value to set for the edgeBlockSendingDoNotTrackHeader property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockSendingDoNotTrackHeader(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockSendingDoNotTrackHeader = value;
    }
    /**
     * Sets the edgeBlockSendingIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. Note: the name of this property is misleading; the property is obsolete, use EdgeSendIntranetTrafficToInternetExplorer instead.
     * @param value Value to set for the edgeBlockSendingIntranetTrafficToInternetExplorer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockSendingIntranetTrafficToInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockSendingIntranetTrafficToInternetExplorer = value;
    }
    /**
     * Sets the edgeClearBrowsingDataOnExit property value. Clear browsing data on exiting Microsoft Edge.
     * @param value Value to set for the edgeClearBrowsingDataOnExit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeClearBrowsingDataOnExit(@javax.annotation.Nullable final Boolean value) {
        this._edgeClearBrowsingDataOnExit = value;
    }
    /**
     * Sets the edgeCookiePolicy property value. Possible values to specify which cookies are allowed in Microsoft Edge.
     * @param value Value to set for the edgeCookiePolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeCookiePolicy(@javax.annotation.Nullable final EdgeCookiePolicy value) {
        this._edgeCookiePolicy = value;
    }
    /**
     * Sets the edgeDisableFirstRunPage property value. Block the Microsoft web page that opens on the first use of Microsoft Edge. This policy allows enterprises, like those enrolled in zero emissions configurations, to block this page.
     * @param value Value to set for the edgeDisableFirstRunPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeDisableFirstRunPage(@javax.annotation.Nullable final Boolean value) {
        this._edgeDisableFirstRunPage = value;
    }
    /**
     * Sets the edgeEnterpriseModeSiteListLocation property value. Indicates the enterprise mode site list location. Could be a local file, local network or http location.
     * @param value Value to set for the edgeEnterpriseModeSiteListLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeEnterpriseModeSiteListLocation(@javax.annotation.Nullable final String value) {
        this._edgeEnterpriseModeSiteListLocation = value;
    }
    /**
     * Sets the edgeFirstRunUrl property value. The first run URL for when Edge browser is opened for the first time.
     * @param value Value to set for the edgeFirstRunUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeFirstRunUrl(@javax.annotation.Nullable final String value) {
        this._edgeFirstRunUrl = value;
    }
    /**
     * Sets the edgeHomepageUrls property value. The list of URLs for homepages shodwn on MDM-enrolled devices on Edge browser.
     * @param value Value to set for the edgeHomepageUrls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeHomepageUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this._edgeHomepageUrls = value;
    }
    /**
     * Sets the edgeRequireSmartScreen property value. Indicates whether or not to Require the user to use the smart screen filter.
     * @param value Value to set for the edgeRequireSmartScreen property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeRequireSmartScreen(@javax.annotation.Nullable final Boolean value) {
        this._edgeRequireSmartScreen = value;
    }
    /**
     * Sets the edgeSearchEngine property value. Allows IT admins to set a default search engine for MDM-Controlled devices. Users can override this and change their default search engine provided the AllowSearchEngineCustomization policy is not set.
     * @param value Value to set for the edgeSearchEngine property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeSearchEngine(@javax.annotation.Nullable final EdgeSearchEngineBase value) {
        this._edgeSearchEngine = value;
    }
    /**
     * Sets the edgeSendIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer.
     * @param value Value to set for the edgeSendIntranetTrafficToInternetExplorer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeSendIntranetTrafficToInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this._edgeSendIntranetTrafficToInternetExplorer = value;
    }
    /**
     * Sets the edgeSyncFavoritesWithInternetExplorer property value. Enable favorites sync between Internet Explorer and Microsoft Edge. Additions, deletions, modifications and order changes to favorites are shared between browsers.
     * @param value Value to set for the edgeSyncFavoritesWithInternetExplorer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeSyncFavoritesWithInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this._edgeSyncFavoritesWithInternetExplorer = value;
    }
    /**
     * Sets the enterpriseCloudPrintDiscoveryEndPoint property value. Endpoint for discovering cloud printers.
     * @param value Value to set for the enterpriseCloudPrintDiscoveryEndPoint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseCloudPrintDiscoveryEndPoint(@javax.annotation.Nullable final String value) {
        this._enterpriseCloudPrintDiscoveryEndPoint = value;
    }
    /**
     * Sets the enterpriseCloudPrintDiscoveryMaxLimit property value. Maximum number of printers that should be queried from a discovery endpoint. This is a mobile only setting. Valid values 1 to 65535
     * @param value Value to set for the enterpriseCloudPrintDiscoveryMaxLimit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseCloudPrintDiscoveryMaxLimit(@javax.annotation.Nullable final Integer value) {
        this._enterpriseCloudPrintDiscoveryMaxLimit = value;
    }
    /**
     * Sets the enterpriseCloudPrintMopriaDiscoveryResourceIdentifier property value. OAuth resource URI for printer discovery service as configured in Azure portal.
     * @param value Value to set for the enterpriseCloudPrintMopriaDiscoveryResourceIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier(@javax.annotation.Nullable final String value) {
        this._enterpriseCloudPrintMopriaDiscoveryResourceIdentifier = value;
    }
    /**
     * Sets the enterpriseCloudPrintOAuthAuthority property value. Authentication endpoint for acquiring OAuth tokens.
     * @param value Value to set for the enterpriseCloudPrintOAuthAuthority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseCloudPrintOAuthAuthority(@javax.annotation.Nullable final String value) {
        this._enterpriseCloudPrintOAuthAuthority = value;
    }
    /**
     * Sets the enterpriseCloudPrintOAuthClientIdentifier property value. GUID of a client application authorized to retrieve OAuth tokens from the OAuth Authority.
     * @param value Value to set for the enterpriseCloudPrintOAuthClientIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseCloudPrintOAuthClientIdentifier(@javax.annotation.Nullable final String value) {
        this._enterpriseCloudPrintOAuthClientIdentifier = value;
    }
    /**
     * Sets the enterpriseCloudPrintResourceIdentifier property value. OAuth resource URI for print service as configured in the Azure portal.
     * @param value Value to set for the enterpriseCloudPrintResourceIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseCloudPrintResourceIdentifier(@javax.annotation.Nullable final String value) {
        this._enterpriseCloudPrintResourceIdentifier = value;
    }
    /**
     * Sets the experienceBlockDeviceDiscovery property value. Indicates whether or not to enable device discovery UX.
     * @param value Value to set for the experienceBlockDeviceDiscovery property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExperienceBlockDeviceDiscovery(@javax.annotation.Nullable final Boolean value) {
        this._experienceBlockDeviceDiscovery = value;
    }
    /**
     * Sets the experienceBlockErrorDialogWhenNoSIM property value. Indicates whether or not to allow the error dialog from displaying if no SIM card is detected.
     * @param value Value to set for the experienceBlockErrorDialogWhenNoSIM property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExperienceBlockErrorDialogWhenNoSIM(@javax.annotation.Nullable final Boolean value) {
        this._experienceBlockErrorDialogWhenNoSIM = value;
    }
    /**
     * Sets the experienceBlockTaskSwitcher property value. Indicates whether or not to enable task switching on the device.
     * @param value Value to set for the experienceBlockTaskSwitcher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExperienceBlockTaskSwitcher(@javax.annotation.Nullable final Boolean value) {
        this._experienceBlockTaskSwitcher = value;
    }
    /**
     * Sets the gameDvrBlocked property value. Indicates whether or not to block DVR and broadcasting.
     * @param value Value to set for the gameDvrBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGameDvrBlocked(@javax.annotation.Nullable final Boolean value) {
        this._gameDvrBlocked = value;
    }
    /**
     * Sets the internetSharingBlocked property value. Indicates whether or not to Block the user from using internet sharing.
     * @param value Value to set for the internetSharingBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInternetSharingBlocked(@javax.annotation.Nullable final Boolean value) {
        this._internetSharingBlocked = value;
    }
    /**
     * Sets the locationServicesBlocked property value. Indicates whether or not to Block the user from location services.
     * @param value Value to set for the locationServicesBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocationServicesBlocked(@javax.annotation.Nullable final Boolean value) {
        this._locationServicesBlocked = value;
    }
    /**
     * Sets the lockScreenAllowTimeoutConfiguration property value. Specify whether to show a user-configurable setting to control the screen timeout while on the lock screen of Windows 10 Mobile devices. If this policy is set to Allow, the value set by lockScreenTimeoutInSeconds is ignored.
     * @param value Value to set for the lockScreenAllowTimeoutConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenAllowTimeoutConfiguration(@javax.annotation.Nullable final Boolean value) {
        this._lockScreenAllowTimeoutConfiguration = value;
    }
    /**
     * Sets the lockScreenBlockActionCenterNotifications property value. Indicates whether or not to block action center notifications over lock screen.
     * @param value Value to set for the lockScreenBlockActionCenterNotifications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenBlockActionCenterNotifications(@javax.annotation.Nullable final Boolean value) {
        this._lockScreenBlockActionCenterNotifications = value;
    }
    /**
     * Sets the lockScreenBlockCortana property value. Indicates whether or not the user can interact with Cortana using speech while the system is locked.
     * @param value Value to set for the lockScreenBlockCortana property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenBlockCortana(@javax.annotation.Nullable final Boolean value) {
        this._lockScreenBlockCortana = value;
    }
    /**
     * Sets the lockScreenBlockToastNotifications property value. Indicates whether to allow toast notifications above the device lock screen.
     * @param value Value to set for the lockScreenBlockToastNotifications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenBlockToastNotifications(@javax.annotation.Nullable final Boolean value) {
        this._lockScreenBlockToastNotifications = value;
    }
    /**
     * Sets the lockScreenTimeoutInSeconds property value. Set the duration (in seconds) from the screen locking to the screen turning off for Windows 10 Mobile devices. Supported values are 11-1800. Valid values 11 to 1800
     * @param value Value to set for the lockScreenTimeoutInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenTimeoutInSeconds(@javax.annotation.Nullable final Integer value) {
        this._lockScreenTimeoutInSeconds = value;
    }
    /**
     * Sets the logonBlockFastUserSwitching property value. Disables the ability to quickly switch between users that are logged on simultaneously without logging off.
     * @param value Value to set for the logonBlockFastUserSwitching property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogonBlockFastUserSwitching(@javax.annotation.Nullable final Boolean value) {
        this._logonBlockFastUserSwitching = value;
    }
    /**
     * Sets the microsoftAccountBlocked property value. Indicates whether or not to Block a Microsoft account.
     * @param value Value to set for the microsoftAccountBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftAccountBlocked(@javax.annotation.Nullable final Boolean value) {
        this._microsoftAccountBlocked = value;
    }
    /**
     * Sets the microsoftAccountBlockSettingsSync property value. Indicates whether or not to Block Microsoft account settings sync.
     * @param value Value to set for the microsoftAccountBlockSettingsSync property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftAccountBlockSettingsSync(@javax.annotation.Nullable final Boolean value) {
        this._microsoftAccountBlockSettingsSync = value;
    }
    /**
     * Sets the networkProxyApplySettingsDeviceWide property value. If set, proxy settings will be applied to all processes and accounts in the device. Otherwise, it will be applied to the user account thats enrolled into MDM.
     * @param value Value to set for the networkProxyApplySettingsDeviceWide property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkProxyApplySettingsDeviceWide(@javax.annotation.Nullable final Boolean value) {
        this._networkProxyApplySettingsDeviceWide = value;
    }
    /**
     * Sets the networkProxyAutomaticConfigurationUrl property value. Address to the proxy auto-config (PAC) script you want to use.
     * @param value Value to set for the networkProxyAutomaticConfigurationUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkProxyAutomaticConfigurationUrl(@javax.annotation.Nullable final String value) {
        this._networkProxyAutomaticConfigurationUrl = value;
    }
    /**
     * Sets the networkProxyDisableAutoDetect property value. Disable automatic detection of settings. If enabled, the system will try to find the path to a proxy auto-config (PAC) script.
     * @param value Value to set for the networkProxyDisableAutoDetect property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkProxyDisableAutoDetect(@javax.annotation.Nullable final Boolean value) {
        this._networkProxyDisableAutoDetect = value;
    }
    /**
     * Sets the networkProxyServer property value. Specifies manual proxy server settings.
     * @param value Value to set for the networkProxyServer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkProxyServer(@javax.annotation.Nullable final Windows10NetworkProxyServer value) {
        this._networkProxyServer = value;
    }
    /**
     * Sets the nfcBlocked property value. Indicates whether or not to Block the user from using near field communication.
     * @param value Value to set for the nfcBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNfcBlocked(@javax.annotation.Nullable final Boolean value) {
        this._nfcBlocked = value;
    }
    /**
     * Sets the oneDriveDisableFileSync property value. Gets or sets a value allowing IT admins to prevent apps and features from working with files on OneDrive.
     * @param value Value to set for the oneDriveDisableFileSync property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOneDriveDisableFileSync(@javax.annotation.Nullable final Boolean value) {
        this._oneDriveDisableFileSync = value;
    }
    /**
     * Sets the passwordBlockSimple property value. Specify whether PINs or passwords such as '1111' or '1234' are allowed. For Windows 10 desktops, it also controls the use of picture passwords.
     * @param value Value to set for the passwordBlockSimple property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockSimple(@javax.annotation.Nullable final Boolean value) {
        this._passwordBlockSimple = value;
    }
    /**
     * Sets the passwordExpirationDays property value. The password expiration in days. Valid values 0 to 730
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this._passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumCharacterSetCount(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumCharacterSetCount = value;
    }
    /**
     * Sets the passwordMinimumLength property value. The minimum password length. Valid values 4 to 16
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. The minutes of inactivity before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@javax.annotation.Nullable final Integer value) {
        this._passwordMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent reuse of. Valid values 0 to 50
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordPreviousPasswordBlockCount(@javax.annotation.Nullable final Integer value) {
        this._passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequired property value. Indicates whether or not to require the user to have a password.
     * @param value Value to set for the passwordRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequired(@javax.annotation.Nullable final Boolean value) {
        this._passwordRequired = value;
    }
    /**
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequiredType(@javax.annotation.Nullable final RequiredPasswordType value) {
        this._passwordRequiredType = value;
    }
    /**
     * Sets the passwordRequireWhenResumeFromIdleState property value. Indicates whether or not to require a password upon resuming from an idle state.
     * @param value Value to set for the passwordRequireWhenResumeFromIdleState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequireWhenResumeFromIdleState(@javax.annotation.Nullable final Boolean value) {
        this._passwordRequireWhenResumeFromIdleState = value;
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. The number of sign in failures before factory reset. Valid values 0 to 999
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordSignInFailureCountBeforeFactoryReset(@javax.annotation.Nullable final Integer value) {
        this._passwordSignInFailureCountBeforeFactoryReset = value;
    }
    /**
     * Sets the personalizationDesktopImageUrl property value. A http or https Url to a jpg, jpeg or png image that needs to be downloaded and used as the Desktop Image or a file Url to a local image on the file system that needs to used as the Desktop Image.
     * @param value Value to set for the personalizationDesktopImageUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalizationDesktopImageUrl(@javax.annotation.Nullable final String value) {
        this._personalizationDesktopImageUrl = value;
    }
    /**
     * Sets the personalizationLockScreenImageUrl property value. A http or https Url to a jpg, jpeg or png image that neeeds to be downloaded and used as the Lock Screen Image or a file Url to a local image on the file system that needs to be used as the Lock Screen Image.
     * @param value Value to set for the personalizationLockScreenImageUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalizationLockScreenImageUrl(@javax.annotation.Nullable final String value) {
        this._personalizationLockScreenImageUrl = value;
    }
    /**
     * Sets the privacyAdvertisingId property value. State Management Setting.
     * @param value Value to set for the privacyAdvertisingId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyAdvertisingId(@javax.annotation.Nullable final StateManagementSetting value) {
        this._privacyAdvertisingId = value;
    }
    /**
     * Sets the privacyAutoAcceptPairingAndConsentPrompts property value. Indicates whether or not to allow the automatic acceptance of the pairing and privacy user consent dialog when launching apps.
     * @param value Value to set for the privacyAutoAcceptPairingAndConsentPrompts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyAutoAcceptPairingAndConsentPrompts(@javax.annotation.Nullable final Boolean value) {
        this._privacyAutoAcceptPairingAndConsentPrompts = value;
    }
    /**
     * Sets the privacyBlockInputPersonalization property value. Indicates whether or not to block the usage of cloud based speech services for Cortana, Dictation, or Store applications.
     * @param value Value to set for the privacyBlockInputPersonalization property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyBlockInputPersonalization(@javax.annotation.Nullable final Boolean value) {
        this._privacyBlockInputPersonalization = value;
    }
    /**
     * Sets the resetProtectionModeBlocked property value. Indicates whether or not to Block the user from reset protection mode.
     * @param value Value to set for the resetProtectionModeBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResetProtectionModeBlocked(@javax.annotation.Nullable final Boolean value) {
        this._resetProtectionModeBlocked = value;
    }
    /**
     * Sets the safeSearchFilter property value. Specifies what level of safe search (filtering adult content) is required
     * @param value Value to set for the safeSearchFilter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSafeSearchFilter(@javax.annotation.Nullable final SafeSearchFilterType value) {
        this._safeSearchFilter = value;
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to Block the user from taking Screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScreenCaptureBlocked(@javax.annotation.Nullable final Boolean value) {
        this._screenCaptureBlocked = value;
    }
    /**
     * Sets the searchBlockDiacritics property value. Specifies if search can use diacritics.
     * @param value Value to set for the searchBlockDiacritics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchBlockDiacritics(@javax.annotation.Nullable final Boolean value) {
        this._searchBlockDiacritics = value;
    }
    /**
     * Sets the searchDisableAutoLanguageDetection property value. Specifies whether to use automatic language detection when indexing content and properties.
     * @param value Value to set for the searchDisableAutoLanguageDetection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchDisableAutoLanguageDetection(@javax.annotation.Nullable final Boolean value) {
        this._searchDisableAutoLanguageDetection = value;
    }
    /**
     * Sets the searchDisableIndexerBackoff property value. Indicates whether or not to disable the search indexer backoff feature.
     * @param value Value to set for the searchDisableIndexerBackoff property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchDisableIndexerBackoff(@javax.annotation.Nullable final Boolean value) {
        this._searchDisableIndexerBackoff = value;
    }
    /**
     * Sets the searchDisableIndexingEncryptedItems property value. Indicates whether or not to block indexing of WIP-protected items to prevent them from appearing in search results for Cortana or Explorer.
     * @param value Value to set for the searchDisableIndexingEncryptedItems property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchDisableIndexingEncryptedItems(@javax.annotation.Nullable final Boolean value) {
        this._searchDisableIndexingEncryptedItems = value;
    }
    /**
     * Sets the searchDisableIndexingRemovableDrive property value. Indicates whether or not to allow users to add locations on removable drives to libraries and to be indexed.
     * @param value Value to set for the searchDisableIndexingRemovableDrive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchDisableIndexingRemovableDrive(@javax.annotation.Nullable final Boolean value) {
        this._searchDisableIndexingRemovableDrive = value;
    }
    /**
     * Sets the searchEnableAutomaticIndexSizeManangement property value. Specifies minimum amount of hard drive space on the same drive as the index location before indexing stops.
     * @param value Value to set for the searchEnableAutomaticIndexSizeManangement property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchEnableAutomaticIndexSizeManangement(@javax.annotation.Nullable final Boolean value) {
        this._searchEnableAutomaticIndexSizeManangement = value;
    }
    /**
     * Sets the searchEnableRemoteQueries property value. Indicates whether or not to block remote queries of this computers index.
     * @param value Value to set for the searchEnableRemoteQueries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchEnableRemoteQueries(@javax.annotation.Nullable final Boolean value) {
        this._searchEnableRemoteQueries = value;
    }
    /**
     * Sets the settingsBlockAccountsPage property value. Indicates whether or not to block access to Accounts in Settings app.
     * @param value Value to set for the settingsBlockAccountsPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockAccountsPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockAccountsPage = value;
    }
    /**
     * Sets the settingsBlockAddProvisioningPackage property value. Indicates whether or not to block the user from installing provisioning packages.
     * @param value Value to set for the settingsBlockAddProvisioningPackage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockAddProvisioningPackage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockAddProvisioningPackage = value;
    }
    /**
     * Sets the settingsBlockAppsPage property value. Indicates whether or not to block access to Apps in Settings app.
     * @param value Value to set for the settingsBlockAppsPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockAppsPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockAppsPage = value;
    }
    /**
     * Sets the settingsBlockChangeLanguage property value. Indicates whether or not to block the user from changing the language settings.
     * @param value Value to set for the settingsBlockChangeLanguage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockChangeLanguage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockChangeLanguage = value;
    }
    /**
     * Sets the settingsBlockChangePowerSleep property value. Indicates whether or not to block the user from changing power and sleep settings.
     * @param value Value to set for the settingsBlockChangePowerSleep property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockChangePowerSleep(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockChangePowerSleep = value;
    }
    /**
     * Sets the settingsBlockChangeRegion property value. Indicates whether or not to block the user from changing the region settings.
     * @param value Value to set for the settingsBlockChangeRegion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockChangeRegion(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockChangeRegion = value;
    }
    /**
     * Sets the settingsBlockChangeSystemTime property value. Indicates whether or not to block the user from changing date and time settings.
     * @param value Value to set for the settingsBlockChangeSystemTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockChangeSystemTime(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockChangeSystemTime = value;
    }
    /**
     * Sets the settingsBlockDevicesPage property value. Indicates whether or not to block access to Devices in Settings app.
     * @param value Value to set for the settingsBlockDevicesPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockDevicesPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockDevicesPage = value;
    }
    /**
     * Sets the settingsBlockEaseOfAccessPage property value. Indicates whether or not to block access to Ease of Access in Settings app.
     * @param value Value to set for the settingsBlockEaseOfAccessPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockEaseOfAccessPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockEaseOfAccessPage = value;
    }
    /**
     * Sets the settingsBlockEditDeviceName property value. Indicates whether or not to block the user from editing the device name.
     * @param value Value to set for the settingsBlockEditDeviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockEditDeviceName(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockEditDeviceName = value;
    }
    /**
     * Sets the settingsBlockGamingPage property value. Indicates whether or not to block access to Gaming in Settings app.
     * @param value Value to set for the settingsBlockGamingPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockGamingPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockGamingPage = value;
    }
    /**
     * Sets the settingsBlockNetworkInternetPage property value. Indicates whether or not to block access to Network & Internet in Settings app.
     * @param value Value to set for the settingsBlockNetworkInternetPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockNetworkInternetPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockNetworkInternetPage = value;
    }
    /**
     * Sets the settingsBlockPersonalizationPage property value. Indicates whether or not to block access to Personalization in Settings app.
     * @param value Value to set for the settingsBlockPersonalizationPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockPersonalizationPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockPersonalizationPage = value;
    }
    /**
     * Sets the settingsBlockPrivacyPage property value. Indicates whether or not to block access to Privacy in Settings app.
     * @param value Value to set for the settingsBlockPrivacyPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockPrivacyPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockPrivacyPage = value;
    }
    /**
     * Sets the settingsBlockRemoveProvisioningPackage property value. Indicates whether or not to block the runtime configuration agent from removing provisioning packages.
     * @param value Value to set for the settingsBlockRemoveProvisioningPackage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockRemoveProvisioningPackage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockRemoveProvisioningPackage = value;
    }
    /**
     * Sets the settingsBlockSettingsApp property value. Indicates whether or not to block access to Settings app.
     * @param value Value to set for the settingsBlockSettingsApp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockSettingsApp(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockSettingsApp = value;
    }
    /**
     * Sets the settingsBlockSystemPage property value. Indicates whether or not to block access to System in Settings app.
     * @param value Value to set for the settingsBlockSystemPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockSystemPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockSystemPage = value;
    }
    /**
     * Sets the settingsBlockTimeLanguagePage property value. Indicates whether or not to block access to Time & Language in Settings app.
     * @param value Value to set for the settingsBlockTimeLanguagePage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockTimeLanguagePage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockTimeLanguagePage = value;
    }
    /**
     * Sets the settingsBlockUpdateSecurityPage property value. Indicates whether or not to block access to Update & Security in Settings app.
     * @param value Value to set for the settingsBlockUpdateSecurityPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockUpdateSecurityPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockUpdateSecurityPage = value;
    }
    /**
     * Sets the sharedUserAppDataAllowed property value. Indicates whether or not to block multiple users of the same app to share data.
     * @param value Value to set for the sharedUserAppDataAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedUserAppDataAllowed(@javax.annotation.Nullable final Boolean value) {
        this._sharedUserAppDataAllowed = value;
    }
    /**
     * Sets the smartScreenBlockPromptOverride property value. Indicates whether or not users can override SmartScreen Filter warnings about potentially malicious websites.
     * @param value Value to set for the smartScreenBlockPromptOverride property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmartScreenBlockPromptOverride(@javax.annotation.Nullable final Boolean value) {
        this._smartScreenBlockPromptOverride = value;
    }
    /**
     * Sets the smartScreenBlockPromptOverrideForFiles property value. Indicates whether or not users can override the SmartScreen Filter warnings about downloading unverified files
     * @param value Value to set for the smartScreenBlockPromptOverrideForFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmartScreenBlockPromptOverrideForFiles(@javax.annotation.Nullable final Boolean value) {
        this._smartScreenBlockPromptOverrideForFiles = value;
    }
    /**
     * Sets the smartScreenEnableAppInstallControl property value. This property will be deprecated in July 2019 and will be replaced by property SmartScreenAppInstallControl. Allows IT Admins to control whether users are allowed to install apps from places other than the Store.
     * @param value Value to set for the smartScreenEnableAppInstallControl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmartScreenEnableAppInstallControl(@javax.annotation.Nullable final Boolean value) {
        this._smartScreenEnableAppInstallControl = value;
    }
    /**
     * Sets the startBlockUnpinningAppsFromTaskbar property value. Indicates whether or not to block the user from unpinning apps from taskbar.
     * @param value Value to set for the startBlockUnpinningAppsFromTaskbar property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartBlockUnpinningAppsFromTaskbar(@javax.annotation.Nullable final Boolean value) {
        this._startBlockUnpinningAppsFromTaskbar = value;
    }
    /**
     * Sets the startMenuAppListVisibility property value. Type of start menu app list visibility.
     * @param value Value to set for the startMenuAppListVisibility property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuAppListVisibility(@javax.annotation.Nullable final WindowsStartMenuAppListVisibilityType value) {
        this._startMenuAppListVisibility = value;
    }
    /**
     * Sets the startMenuHideChangeAccountSettings property value. Enabling this policy hides the change account setting from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideChangeAccountSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideChangeAccountSettings(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideChangeAccountSettings = value;
    }
    /**
     * Sets the startMenuHideFrequentlyUsedApps property value. Enabling this policy hides the most used apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @param value Value to set for the startMenuHideFrequentlyUsedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideFrequentlyUsedApps(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideFrequentlyUsedApps = value;
    }
    /**
     * Sets the startMenuHideHibernate property value. Enabling this policy hides hibernate from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideHibernate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideHibernate(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideHibernate = value;
    }
    /**
     * Sets the startMenuHideLock property value. Enabling this policy hides lock from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideLock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideLock(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideLock = value;
    }
    /**
     * Sets the startMenuHidePowerButton property value. Enabling this policy hides the power button from appearing in the start menu.
     * @param value Value to set for the startMenuHidePowerButton property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHidePowerButton(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHidePowerButton = value;
    }
    /**
     * Sets the startMenuHideRecentJumpLists property value. Enabling this policy hides recent jump lists from appearing on the start menu/taskbar and disables the corresponding toggle in the Settings app.
     * @param value Value to set for the startMenuHideRecentJumpLists property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideRecentJumpLists(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideRecentJumpLists = value;
    }
    /**
     * Sets the startMenuHideRecentlyAddedApps property value. Enabling this policy hides recently added apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @param value Value to set for the startMenuHideRecentlyAddedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideRecentlyAddedApps(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideRecentlyAddedApps = value;
    }
    /**
     * Sets the startMenuHideRestartOptions property value. Enabling this policy hides 'Restart/Update and Restart' from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideRestartOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideRestartOptions(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideRestartOptions = value;
    }
    /**
     * Sets the startMenuHideShutDown property value. Enabling this policy hides shut down/update and shut down from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideShutDown property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideShutDown(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideShutDown = value;
    }
    /**
     * Sets the startMenuHideSignOut property value. Enabling this policy hides sign out from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideSignOut property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideSignOut(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideSignOut = value;
    }
    /**
     * Sets the startMenuHideSleep property value. Enabling this policy hides sleep from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideSleep property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideSleep(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideSleep = value;
    }
    /**
     * Sets the startMenuHideSwitchAccount property value. Enabling this policy hides switch account from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideSwitchAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideSwitchAccount(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideSwitchAccount = value;
    }
    /**
     * Sets the startMenuHideUserTile property value. Enabling this policy hides the user tile from appearing in the start menu.
     * @param value Value to set for the startMenuHideUserTile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideUserTile(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideUserTile = value;
    }
    /**
     * Sets the startMenuLayoutEdgeAssetsXml property value. This policy setting allows you to import Edge assets to be used with startMenuLayoutXml policy. Start layout can contain secondary tile from Edge app which looks for Edge local asset file. Edge local asset would not exist and cause Edge secondary tile to appear empty in this case. This policy only gets applied when startMenuLayoutXml policy is modified. The value should be a UTF-8 Base64 encoded byte array.
     * @param value Value to set for the startMenuLayoutEdgeAssetsXml property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuLayoutEdgeAssetsXml(@javax.annotation.Nullable final byte[] value) {
        this._startMenuLayoutEdgeAssetsXml = value;
    }
    /**
     * Sets the startMenuLayoutXml property value. Allows admins to override the default Start menu layout and prevents the user from changing it. The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in a UTF8 encoded byte array format.
     * @param value Value to set for the startMenuLayoutXml property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuLayoutXml(@javax.annotation.Nullable final byte[] value) {
        this._startMenuLayoutXml = value;
    }
    /**
     * Sets the startMenuMode property value. Type of display modes for the start menu.
     * @param value Value to set for the startMenuMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuMode(@javax.annotation.Nullable final WindowsStartMenuModeType value) {
        this._startMenuMode = value;
    }
    /**
     * Sets the startMenuPinnedFolderDocuments property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderDocuments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderDocuments(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderDocuments = value;
    }
    /**
     * Sets the startMenuPinnedFolderDownloads property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderDownloads property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderDownloads(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderDownloads = value;
    }
    /**
     * Sets the startMenuPinnedFolderFileExplorer property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderFileExplorer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderFileExplorer(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderFileExplorer = value;
    }
    /**
     * Sets the startMenuPinnedFolderHomeGroup property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderHomeGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderHomeGroup(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderHomeGroup = value;
    }
    /**
     * Sets the startMenuPinnedFolderMusic property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderMusic property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderMusic(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderMusic = value;
    }
    /**
     * Sets the startMenuPinnedFolderNetwork property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderNetwork property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderNetwork(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderNetwork = value;
    }
    /**
     * Sets the startMenuPinnedFolderPersonalFolder property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderPersonalFolder property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderPersonalFolder(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderPersonalFolder = value;
    }
    /**
     * Sets the startMenuPinnedFolderPictures property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderPictures property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderPictures(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderPictures = value;
    }
    /**
     * Sets the startMenuPinnedFolderSettings property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderSettings(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderSettings = value;
    }
    /**
     * Sets the startMenuPinnedFolderVideos property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderVideos property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderVideos(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderVideos = value;
    }
    /**
     * Sets the storageBlockRemovableStorage property value. Indicates whether or not to Block the user from using removable storage.
     * @param value Value to set for the storageBlockRemovableStorage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageBlockRemovableStorage(@javax.annotation.Nullable final Boolean value) {
        this._storageBlockRemovableStorage = value;
    }
    /**
     * Sets the storageRequireMobileDeviceEncryption property value. Indicating whether or not to require encryption on a mobile device.
     * @param value Value to set for the storageRequireMobileDeviceEncryption property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageRequireMobileDeviceEncryption(@javax.annotation.Nullable final Boolean value) {
        this._storageRequireMobileDeviceEncryption = value;
    }
    /**
     * Sets the storageRestrictAppDataToSystemVolume property value. Indicates whether application data is restricted to the system drive.
     * @param value Value to set for the storageRestrictAppDataToSystemVolume property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageRestrictAppDataToSystemVolume(@javax.annotation.Nullable final Boolean value) {
        this._storageRestrictAppDataToSystemVolume = value;
    }
    /**
     * Sets the storageRestrictAppInstallToSystemVolume property value. Indicates whether the installation of applications is restricted to the system drive.
     * @param value Value to set for the storageRestrictAppInstallToSystemVolume property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageRestrictAppInstallToSystemVolume(@javax.annotation.Nullable final Boolean value) {
        this._storageRestrictAppInstallToSystemVolume = value;
    }
    /**
     * Sets the tenantLockdownRequireNetworkDuringOutOfBoxExperience property value. Whether the device is required to connect to the network.
     * @param value Value to set for the tenantLockdownRequireNetworkDuringOutOfBoxExperience property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantLockdownRequireNetworkDuringOutOfBoxExperience(@javax.annotation.Nullable final Boolean value) {
        this._tenantLockdownRequireNetworkDuringOutOfBoxExperience = value;
    }
    /**
     * Sets the usbBlocked property value. Indicates whether or not to Block the user from USB connection.
     * @param value Value to set for the usbBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsbBlocked(@javax.annotation.Nullable final Boolean value) {
        this._usbBlocked = value;
    }
    /**
     * Sets the voiceRecordingBlocked property value. Indicates whether or not to Block the user from voice recording.
     * @param value Value to set for the voiceRecordingBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVoiceRecordingBlocked(@javax.annotation.Nullable final Boolean value) {
        this._voiceRecordingBlocked = value;
    }
    /**
     * Sets the webRtcBlockLocalhostIpAddress property value. Indicates whether or not user's localhost IP address is displayed while making phone calls using the WebRTC
     * @param value Value to set for the webRtcBlockLocalhostIpAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebRtcBlockLocalhostIpAddress(@javax.annotation.Nullable final Boolean value) {
        this._webRtcBlockLocalhostIpAddress = value;
    }
    /**
     * Sets the wiFiBlockAutomaticConnectHotspots property value. Indicating whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
     * @param value Value to set for the wiFiBlockAutomaticConnectHotspots property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWiFiBlockAutomaticConnectHotspots(@javax.annotation.Nullable final Boolean value) {
        this._wiFiBlockAutomaticConnectHotspots = value;
    }
    /**
     * Sets the wiFiBlocked property value. Indicates whether or not to Block the user from using Wi-Fi.
     * @param value Value to set for the wiFiBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWiFiBlocked(@javax.annotation.Nullable final Boolean value) {
        this._wiFiBlocked = value;
    }
    /**
     * Sets the wiFiBlockManualConfiguration property value. Indicates whether or not to Block the user from using Wi-Fi manual configuration.
     * @param value Value to set for the wiFiBlockManualConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWiFiBlockManualConfiguration(@javax.annotation.Nullable final Boolean value) {
        this._wiFiBlockManualConfiguration = value;
    }
    /**
     * Sets the wiFiScanInterval property value. Specify how often devices scan for Wi-Fi networks. Supported values are 1-500, where 100 = default, and 500 = low frequency. Valid values 1 to 500
     * @param value Value to set for the wiFiScanInterval property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWiFiScanInterval(@javax.annotation.Nullable final Integer value) {
        this._wiFiScanInterval = value;
    }
    /**
     * Sets the windowsSpotlightBlockConsumerSpecificFeatures property value. Allows IT admins to block experiences that are typically for consumers only, such as Start suggestions, Membership notifications, Post-OOBE app install and redirect tiles.
     * @param value Value to set for the windowsSpotlightBlockConsumerSpecificFeatures property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlockConsumerSpecificFeatures(@javax.annotation.Nullable final Boolean value) {
        this._windowsSpotlightBlockConsumerSpecificFeatures = value;
    }
    /**
     * Sets the windowsSpotlightBlocked property value. Allows IT admins to turn off all Windows Spotlight features
     * @param value Value to set for the windowsSpotlightBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlocked(@javax.annotation.Nullable final Boolean value) {
        this._windowsSpotlightBlocked = value;
    }
    /**
     * Sets the windowsSpotlightBlockOnActionCenter property value. Block suggestions from Microsoft that show after each OS clean install, upgrade or in an on-going basis to introduce users to what is new or changed
     * @param value Value to set for the windowsSpotlightBlockOnActionCenter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlockOnActionCenter(@javax.annotation.Nullable final Boolean value) {
        this._windowsSpotlightBlockOnActionCenter = value;
    }
    /**
     * Sets the windowsSpotlightBlockTailoredExperiences property value. Block personalized content in Windows spotlight based on users device usage.
     * @param value Value to set for the windowsSpotlightBlockTailoredExperiences property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlockTailoredExperiences(@javax.annotation.Nullable final Boolean value) {
        this._windowsSpotlightBlockTailoredExperiences = value;
    }
    /**
     * Sets the windowsSpotlightBlockThirdPartyNotifications property value. Block third party content delivered via Windows Spotlight
     * @param value Value to set for the windowsSpotlightBlockThirdPartyNotifications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlockThirdPartyNotifications(@javax.annotation.Nullable final Boolean value) {
        this._windowsSpotlightBlockThirdPartyNotifications = value;
    }
    /**
     * Sets the windowsSpotlightBlockWelcomeExperience property value. Block Windows Spotlight Windows welcome experience
     * @param value Value to set for the windowsSpotlightBlockWelcomeExperience property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlockWelcomeExperience(@javax.annotation.Nullable final Boolean value) {
        this._windowsSpotlightBlockWelcomeExperience = value;
    }
    /**
     * Sets the windowsSpotlightBlockWindowsTips property value. Allows IT admins to turn off the popup of Windows Tips.
     * @param value Value to set for the windowsSpotlightBlockWindowsTips property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlockWindowsTips(@javax.annotation.Nullable final Boolean value) {
        this._windowsSpotlightBlockWindowsTips = value;
    }
    /**
     * Sets the windowsSpotlightConfigureOnLockScreen property value. Allows IT admind to set a predefined default search engine for MDM-Controlled devices
     * @param value Value to set for the windowsSpotlightConfigureOnLockScreen property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightConfigureOnLockScreen(@javax.annotation.Nullable final WindowsSpotlightEnablementSettings value) {
        this._windowsSpotlightConfigureOnLockScreen = value;
    }
    /**
     * Sets the windowsStoreBlockAutoUpdate property value. Indicates whether or not to block automatic update of apps from Windows Store.
     * @param value Value to set for the windowsStoreBlockAutoUpdate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsStoreBlockAutoUpdate(@javax.annotation.Nullable final Boolean value) {
        this._windowsStoreBlockAutoUpdate = value;
    }
    /**
     * Sets the windowsStoreBlocked property value. Indicates whether or not to Block the user from using the Windows store.
     * @param value Value to set for the windowsStoreBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsStoreBlocked(@javax.annotation.Nullable final Boolean value) {
        this._windowsStoreBlocked = value;
    }
    /**
     * Sets the windowsStoreEnablePrivateStoreOnly property value. Indicates whether or not to enable Private Store Only.
     * @param value Value to set for the windowsStoreEnablePrivateStoreOnly property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsStoreEnablePrivateStoreOnly(@javax.annotation.Nullable final Boolean value) {
        this._windowsStoreEnablePrivateStoreOnly = value;
    }
    /**
     * Sets the wirelessDisplayBlockProjectionToThisDevice property value. Indicates whether or not to allow other devices from discovering this PC for projection.
     * @param value Value to set for the wirelessDisplayBlockProjectionToThisDevice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWirelessDisplayBlockProjectionToThisDevice(@javax.annotation.Nullable final Boolean value) {
        this._wirelessDisplayBlockProjectionToThisDevice = value;
    }
    /**
     * Sets the wirelessDisplayBlockUserInputFromReceiver property value. Indicates whether or not to allow user input from wireless display receiver.
     * @param value Value to set for the wirelessDisplayBlockUserInputFromReceiver property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWirelessDisplayBlockUserInputFromReceiver(@javax.annotation.Nullable final Boolean value) {
        this._wirelessDisplayBlockUserInputFromReceiver = value;
    }
    /**
     * Sets the wirelessDisplayRequirePinForPairing property value. Indicates whether or not to require a PIN for new devices to initiate pairing.
     * @param value Value to set for the wirelessDisplayRequirePinForPairing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWirelessDisplayRequirePinForPairing(@javax.annotation.Nullable final Boolean value) {
        this._wirelessDisplayRequirePinForPairing = value;
    }
}
