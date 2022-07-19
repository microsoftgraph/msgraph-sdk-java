package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsPhone81GeneralConfiguration extends DeviceConfiguration implements Parsable {
    /** Value indicating whether this policy only applies to Windows Phone 8.1. This property is read-only. */
    private Boolean _applyOnlyToWindowsPhone81;
    /** Indicates whether or not to block copy paste. */
    private Boolean _appsBlockCopyPaste;
    /** Indicates whether or not to block bluetooth. */
    private Boolean _bluetoothBlocked;
    /** Indicates whether or not to block camera. */
    private Boolean _cameraBlocked;
    /** Indicates whether or not to block Wi-Fi tethering. Has no impact if Wi-Fi is blocked. */
    private Boolean _cellularBlockWifiTethering;
    /** Possible values of the compliance app list. */
    private AppListType _compliantAppListType;
    /** List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements. */
    private java.util.List<AppListItem> _compliantAppsList;
    /** Indicates whether or not to block diagnostic data submission. */
    private Boolean _diagnosticDataBlockSubmission;
    /** Indicates whether or not to block custom email accounts. */
    private Boolean _emailBlockAddingAccounts;
    /** Indicates whether or not to block location services. */
    private Boolean _locationServicesBlocked;
    /** Indicates whether or not to block using a Microsoft Account. */
    private Boolean _microsoftAccountBlocked;
    /** Indicates whether or not to block Near-Field Communication. */
    private Boolean _nfcBlocked;
    /** Indicates whether or not to block syncing the calendar. */
    private Boolean _passwordBlockSimple;
    /** Number of days before the password expires. */
    private Integer _passwordExpirationDays;
    /** Number of character sets a password must contain. */
    private Integer _passwordMinimumCharacterSetCount;
    /** Minimum length of passwords. */
    private Integer _passwordMinimumLength;
    /** Minutes of inactivity before screen timeout. */
    private Integer _passwordMinutesOfInactivityBeforeScreenTimeout;
    /** Number of previous passwords to block. Valid values 0 to 24 */
    private Integer _passwordPreviousPasswordBlockCount;
    /** Indicates whether or not to require a password. */
    private Boolean _passwordRequired;
    /** Possible values of required passwords. */
    private RequiredPasswordType _passwordRequiredType;
    /** Number of sign in failures allowed before factory reset. */
    private Integer _passwordSignInFailureCountBeforeFactoryReset;
    /** Indicates whether or not to block screenshots. */
    private Boolean _screenCaptureBlocked;
    /** Indicates whether or not to block removable storage. */
    private Boolean _storageBlockRemovableStorage;
    /** Indicates whether or not to require encryption. */
    private Boolean _storageRequireEncryption;
    /** Indicates whether or not to block the web browser. */
    private Boolean _webBrowserBlocked;
    /** Indicates whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked. */
    private Boolean _wifiBlockAutomaticConnectHotspots;
    /** Indicates whether or not to block Wi-Fi. */
    private Boolean _wifiBlocked;
    /** Indicates whether or not to block Wi-Fi hotspot reporting. Has no impact if Wi-Fi is blocked. */
    private Boolean _wifiBlockHotspotReporting;
    /** Indicates whether or not to block the Windows Store. */
    private Boolean _windowsStoreBlocked;
    /**
     * Instantiates a new WindowsPhone81GeneralConfiguration and sets the default values.
     * @return a void
     */
    public WindowsPhone81GeneralConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsPhone81GeneralConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsPhone81GeneralConfiguration
     */
    @javax.annotation.Nonnull
    public static WindowsPhone81GeneralConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsPhone81GeneralConfiguration();
    }
    /**
     * Gets the applyOnlyToWindowsPhone81 property value. Value indicating whether this policy only applies to Windows Phone 8.1. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplyOnlyToWindowsPhone81() {
        return this._applyOnlyToWindowsPhone81;
    }
    /**
     * Gets the appsBlockCopyPaste property value. Indicates whether or not to block copy paste.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppsBlockCopyPaste() {
        return this._appsBlockCopyPaste;
    }
    /**
     * Gets the bluetoothBlocked property value. Indicates whether or not to block bluetooth.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlocked() {
        return this._bluetoothBlocked;
    }
    /**
     * Gets the cameraBlocked property value. Indicates whether or not to block camera.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this._cameraBlocked;
    }
    /**
     * Gets the cellularBlockWifiTethering property value. Indicates whether or not to block Wi-Fi tethering. Has no impact if Wi-Fi is blocked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockWifiTethering() {
        return this._cellularBlockWifiTethering;
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
     * Gets the diagnosticDataBlockSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDiagnosticDataBlockSubmission() {
        return this._diagnosticDataBlockSubmission;
    }
    /**
     * Gets the emailBlockAddingAccounts property value. Indicates whether or not to block custom email accounts.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEmailBlockAddingAccounts() {
        return this._emailBlockAddingAccounts;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsPhone81GeneralConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("applyOnlyToWindowsPhone81", (n) -> { currentObject.setApplyOnlyToWindowsPhone81(n.getBooleanValue()); });
            this.put("appsBlockCopyPaste", (n) -> { currentObject.setAppsBlockCopyPaste(n.getBooleanValue()); });
            this.put("bluetoothBlocked", (n) -> { currentObject.setBluetoothBlocked(n.getBooleanValue()); });
            this.put("cameraBlocked", (n) -> { currentObject.setCameraBlocked(n.getBooleanValue()); });
            this.put("cellularBlockWifiTethering", (n) -> { currentObject.setCellularBlockWifiTethering(n.getBooleanValue()); });
            this.put("compliantAppListType", (n) -> { currentObject.setCompliantAppListType(n.getEnumValue(AppListType.class)); });
            this.put("compliantAppsList", (n) -> { currentObject.setCompliantAppsList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
            this.put("diagnosticDataBlockSubmission", (n) -> { currentObject.setDiagnosticDataBlockSubmission(n.getBooleanValue()); });
            this.put("emailBlockAddingAccounts", (n) -> { currentObject.setEmailBlockAddingAccounts(n.getBooleanValue()); });
            this.put("locationServicesBlocked", (n) -> { currentObject.setLocationServicesBlocked(n.getBooleanValue()); });
            this.put("microsoftAccountBlocked", (n) -> { currentObject.setMicrosoftAccountBlocked(n.getBooleanValue()); });
            this.put("nfcBlocked", (n) -> { currentObject.setNfcBlocked(n.getBooleanValue()); });
            this.put("passwordBlockSimple", (n) -> { currentObject.setPasswordBlockSimple(n.getBooleanValue()); });
            this.put("passwordExpirationDays", (n) -> { currentObject.setPasswordExpirationDays(n.getIntegerValue()); });
            this.put("passwordMinimumCharacterSetCount", (n) -> { currentObject.setPasswordMinimumCharacterSetCount(n.getIntegerValue()); });
            this.put("passwordMinimumLength", (n) -> { currentObject.setPasswordMinimumLength(n.getIntegerValue()); });
            this.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { currentObject.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
            this.put("passwordPreviousPasswordBlockCount", (n) -> { currentObject.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
            this.put("passwordRequired", (n) -> { currentObject.setPasswordRequired(n.getBooleanValue()); });
            this.put("passwordRequiredType", (n) -> { currentObject.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
            this.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { currentObject.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
            this.put("screenCaptureBlocked", (n) -> { currentObject.setScreenCaptureBlocked(n.getBooleanValue()); });
            this.put("storageBlockRemovableStorage", (n) -> { currentObject.setStorageBlockRemovableStorage(n.getBooleanValue()); });
            this.put("storageRequireEncryption", (n) -> { currentObject.setStorageRequireEncryption(n.getBooleanValue()); });
            this.put("webBrowserBlocked", (n) -> { currentObject.setWebBrowserBlocked(n.getBooleanValue()); });
            this.put("wifiBlockAutomaticConnectHotspots", (n) -> { currentObject.setWifiBlockAutomaticConnectHotspots(n.getBooleanValue()); });
            this.put("wifiBlocked", (n) -> { currentObject.setWifiBlocked(n.getBooleanValue()); });
            this.put("wifiBlockHotspotReporting", (n) -> { currentObject.setWifiBlockHotspotReporting(n.getBooleanValue()); });
            this.put("windowsStoreBlocked", (n) -> { currentObject.setWindowsStoreBlocked(n.getBooleanValue()); });
        }};
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
     * Gets the microsoftAccountBlocked property value. Indicates whether or not to block using a Microsoft Account.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftAccountBlocked() {
        return this._microsoftAccountBlocked;
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
     * Gets the passwordBlockSimple property value. Indicates whether or not to block syncing the calendar.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockSimple() {
        return this._passwordBlockSimple;
    }
    /**
     * Gets the passwordExpirationDays property value. Number of days before the password expires.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this._passwordExpirationDays;
    }
    /**
     * Gets the passwordMinimumCharacterSetCount property value. Number of character sets a password must contain.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumCharacterSetCount() {
        return this._passwordMinimumCharacterSetCount;
    }
    /**
     * Gets the passwordMinimumLength property value. Minimum length of passwords.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this._passwordMinimumLength;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before screen timeout.
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
     * Gets the passwordRequiredType property value. Possible values of required passwords.
     * @return a requiredPasswordType
     */
    @javax.annotation.Nullable
    public RequiredPasswordType getPasswordRequiredType() {
        return this._passwordRequiredType;
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. Number of sign in failures allowed before factory reset.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this._passwordSignInFailureCountBeforeFactoryReset;
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
     * Gets the storageBlockRemovableStorage property value. Indicates whether or not to block removable storage.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageBlockRemovableStorage() {
        return this._storageBlockRemovableStorage;
    }
    /**
     * Gets the storageRequireEncryption property value. Indicates whether or not to require encryption.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRequireEncryption() {
        return this._storageRequireEncryption;
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
     * Gets the wifiBlockAutomaticConnectHotspots property value. Indicates whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWifiBlockAutomaticConnectHotspots() {
        return this._wifiBlockAutomaticConnectHotspots;
    }
    /**
     * Gets the wifiBlocked property value. Indicates whether or not to block Wi-Fi.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWifiBlocked() {
        return this._wifiBlocked;
    }
    /**
     * Gets the wifiBlockHotspotReporting property value. Indicates whether or not to block Wi-Fi hotspot reporting. Has no impact if Wi-Fi is blocked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWifiBlockHotspotReporting() {
        return this._wifiBlockHotspotReporting;
    }
    /**
     * Gets the windowsStoreBlocked property value. Indicates whether or not to block the Windows Store.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsStoreBlocked() {
        return this._windowsStoreBlocked;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("applyOnlyToWindowsPhone81", this.getApplyOnlyToWindowsPhone81());
        writer.writeBooleanValue("appsBlockCopyPaste", this.getAppsBlockCopyPaste());
        writer.writeBooleanValue("bluetoothBlocked", this.getBluetoothBlocked());
        writer.writeBooleanValue("cameraBlocked", this.getCameraBlocked());
        writer.writeBooleanValue("cellularBlockWifiTethering", this.getCellularBlockWifiTethering());
        writer.writeEnumValue("compliantAppListType", this.getCompliantAppListType());
        writer.writeCollectionOfObjectValues("compliantAppsList", this.getCompliantAppsList());
        writer.writeBooleanValue("diagnosticDataBlockSubmission", this.getDiagnosticDataBlockSubmission());
        writer.writeBooleanValue("emailBlockAddingAccounts", this.getEmailBlockAddingAccounts());
        writer.writeBooleanValue("locationServicesBlocked", this.getLocationServicesBlocked());
        writer.writeBooleanValue("microsoftAccountBlocked", this.getMicrosoftAccountBlocked());
        writer.writeBooleanValue("nfcBlocked", this.getNfcBlocked());
        writer.writeBooleanValue("passwordBlockSimple", this.getPasswordBlockSimple());
        writer.writeIntegerValue("passwordExpirationDays", this.getPasswordExpirationDays());
        writer.writeIntegerValue("passwordMinimumCharacterSetCount", this.getPasswordMinimumCharacterSetCount());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeScreenTimeout", this.getPasswordMinutesOfInactivityBeforeScreenTimeout());
        writer.writeIntegerValue("passwordPreviousPasswordBlockCount", this.getPasswordPreviousPasswordBlockCount());
        writer.writeBooleanValue("passwordRequired", this.getPasswordRequired());
        writer.writeEnumValue("passwordRequiredType", this.getPasswordRequiredType());
        writer.writeIntegerValue("passwordSignInFailureCountBeforeFactoryReset", this.getPasswordSignInFailureCountBeforeFactoryReset());
        writer.writeBooleanValue("screenCaptureBlocked", this.getScreenCaptureBlocked());
        writer.writeBooleanValue("storageBlockRemovableStorage", this.getStorageBlockRemovableStorage());
        writer.writeBooleanValue("storageRequireEncryption", this.getStorageRequireEncryption());
        writer.writeBooleanValue("webBrowserBlocked", this.getWebBrowserBlocked());
        writer.writeBooleanValue("wifiBlockAutomaticConnectHotspots", this.getWifiBlockAutomaticConnectHotspots());
        writer.writeBooleanValue("wifiBlocked", this.getWifiBlocked());
        writer.writeBooleanValue("wifiBlockHotspotReporting", this.getWifiBlockHotspotReporting());
        writer.writeBooleanValue("windowsStoreBlocked", this.getWindowsStoreBlocked());
    }
    /**
     * Sets the applyOnlyToWindowsPhone81 property value. Value indicating whether this policy only applies to Windows Phone 8.1. This property is read-only.
     * @param value Value to set for the applyOnlyToWindowsPhone81 property.
     * @return a void
     */
    public void setApplyOnlyToWindowsPhone81(@javax.annotation.Nullable final Boolean value) {
        this._applyOnlyToWindowsPhone81 = value;
    }
    /**
     * Sets the appsBlockCopyPaste property value. Indicates whether or not to block copy paste.
     * @param value Value to set for the appsBlockCopyPaste property.
     * @return a void
     */
    public void setAppsBlockCopyPaste(@javax.annotation.Nullable final Boolean value) {
        this._appsBlockCopyPaste = value;
    }
    /**
     * Sets the bluetoothBlocked property value. Indicates whether or not to block bluetooth.
     * @param value Value to set for the bluetoothBlocked property.
     * @return a void
     */
    public void setBluetoothBlocked(@javax.annotation.Nullable final Boolean value) {
        this._bluetoothBlocked = value;
    }
    /**
     * Sets the cameraBlocked property value. Indicates whether or not to block camera.
     * @param value Value to set for the cameraBlocked property.
     * @return a void
     */
    public void setCameraBlocked(@javax.annotation.Nullable final Boolean value) {
        this._cameraBlocked = value;
    }
    /**
     * Sets the cellularBlockWifiTethering property value. Indicates whether or not to block Wi-Fi tethering. Has no impact if Wi-Fi is blocked.
     * @param value Value to set for the cellularBlockWifiTethering property.
     * @return a void
     */
    public void setCellularBlockWifiTethering(@javax.annotation.Nullable final Boolean value) {
        this._cellularBlockWifiTethering = value;
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
     * Sets the diagnosticDataBlockSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @param value Value to set for the diagnosticDataBlockSubmission property.
     * @return a void
     */
    public void setDiagnosticDataBlockSubmission(@javax.annotation.Nullable final Boolean value) {
        this._diagnosticDataBlockSubmission = value;
    }
    /**
     * Sets the emailBlockAddingAccounts property value. Indicates whether or not to block custom email accounts.
     * @param value Value to set for the emailBlockAddingAccounts property.
     * @return a void
     */
    public void setEmailBlockAddingAccounts(@javax.annotation.Nullable final Boolean value) {
        this._emailBlockAddingAccounts = value;
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
     * Sets the microsoftAccountBlocked property value. Indicates whether or not to block using a Microsoft Account.
     * @param value Value to set for the microsoftAccountBlocked property.
     * @return a void
     */
    public void setMicrosoftAccountBlocked(@javax.annotation.Nullable final Boolean value) {
        this._microsoftAccountBlocked = value;
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
     * Sets the passwordBlockSimple property value. Indicates whether or not to block syncing the calendar.
     * @param value Value to set for the passwordBlockSimple property.
     * @return a void
     */
    public void setPasswordBlockSimple(@javax.annotation.Nullable final Boolean value) {
        this._passwordBlockSimple = value;
    }
    /**
     * Sets the passwordExpirationDays property value. Number of days before the password expires.
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this._passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. Number of character sets a password must contain.
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     * @return a void
     */
    public void setPasswordMinimumCharacterSetCount(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumCharacterSetCount = value;
    }
    /**
     * Sets the passwordMinimumLength property value. Minimum length of passwords.
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before screen timeout.
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
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    public void setPasswordRequiredType(@javax.annotation.Nullable final RequiredPasswordType value) {
        this._passwordRequiredType = value;
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. Number of sign in failures allowed before factory reset.
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     * @return a void
     */
    public void setPasswordSignInFailureCountBeforeFactoryReset(@javax.annotation.Nullable final Integer value) {
        this._passwordSignInFailureCountBeforeFactoryReset = value;
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
     * Sets the storageBlockRemovableStorage property value. Indicates whether or not to block removable storage.
     * @param value Value to set for the storageBlockRemovableStorage property.
     * @return a void
     */
    public void setStorageBlockRemovableStorage(@javax.annotation.Nullable final Boolean value) {
        this._storageBlockRemovableStorage = value;
    }
    /**
     * Sets the storageRequireEncryption property value. Indicates whether or not to require encryption.
     * @param value Value to set for the storageRequireEncryption property.
     * @return a void
     */
    public void setStorageRequireEncryption(@javax.annotation.Nullable final Boolean value) {
        this._storageRequireEncryption = value;
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
     * Sets the wifiBlockAutomaticConnectHotspots property value. Indicates whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
     * @param value Value to set for the wifiBlockAutomaticConnectHotspots property.
     * @return a void
     */
    public void setWifiBlockAutomaticConnectHotspots(@javax.annotation.Nullable final Boolean value) {
        this._wifiBlockAutomaticConnectHotspots = value;
    }
    /**
     * Sets the wifiBlocked property value. Indicates whether or not to block Wi-Fi.
     * @param value Value to set for the wifiBlocked property.
     * @return a void
     */
    public void setWifiBlocked(@javax.annotation.Nullable final Boolean value) {
        this._wifiBlocked = value;
    }
    /**
     * Sets the wifiBlockHotspotReporting property value. Indicates whether or not to block Wi-Fi hotspot reporting. Has no impact if Wi-Fi is blocked.
     * @param value Value to set for the wifiBlockHotspotReporting property.
     * @return a void
     */
    public void setWifiBlockHotspotReporting(@javax.annotation.Nullable final Boolean value) {
        this._wifiBlockHotspotReporting = value;
    }
    /**
     * Sets the windowsStoreBlocked property value. Indicates whether or not to block the Windows Store.
     * @param value Value to set for the windowsStoreBlocked property.
     * @return a void
     */
    public void setWindowsStoreBlocked(@javax.annotation.Nullable final Boolean value) {
        this._windowsStoreBlocked = value;
    }
}
