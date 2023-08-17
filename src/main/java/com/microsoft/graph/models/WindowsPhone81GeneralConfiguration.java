package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the windowsPhone81GeneralConfiguration resource.
 */
public class WindowsPhone81GeneralConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Value indicating whether this policy only applies to Windows Phone 8.1. This property is read-only.
     */
    private Boolean applyOnlyToWindowsPhone81;
    /**
     * Indicates whether or not to block copy paste.
     */
    private Boolean appsBlockCopyPaste;
    /**
     * Indicates whether or not to block bluetooth.
     */
    private Boolean bluetoothBlocked;
    /**
     * Indicates whether or not to block camera.
     */
    private Boolean cameraBlocked;
    /**
     * Indicates whether or not to block Wi-Fi tethering. Has no impact if Wi-Fi is blocked.
     */
    private Boolean cellularBlockWifiTethering;
    /**
     * Possible values of the compliance app list.
     */
    private AppListType compliantAppListType;
    /**
     * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     */
    private java.util.List<AppListItem> compliantAppsList;
    /**
     * Indicates whether or not to block diagnostic data submission.
     */
    private Boolean diagnosticDataBlockSubmission;
    /**
     * Indicates whether or not to block custom email accounts.
     */
    private Boolean emailBlockAddingAccounts;
    /**
     * Indicates whether or not to block location services.
     */
    private Boolean locationServicesBlocked;
    /**
     * Indicates whether or not to block using a Microsoft Account.
     */
    private Boolean microsoftAccountBlocked;
    /**
     * Indicates whether or not to block Near-Field Communication.
     */
    private Boolean nfcBlocked;
    /**
     * Indicates whether or not to block syncing the calendar.
     */
    private Boolean passwordBlockSimple;
    /**
     * Number of days before the password expires.
     */
    private Integer passwordExpirationDays;
    /**
     * Number of character sets a password must contain.
     */
    private Integer passwordMinimumCharacterSetCount;
    /**
     * Minimum length of passwords.
     */
    private Integer passwordMinimumLength;
    /**
     * Minutes of inactivity before screen timeout.
     */
    private Integer passwordMinutesOfInactivityBeforeScreenTimeout;
    /**
     * Number of previous passwords to block. Valid values 0 to 24
     */
    private Integer passwordPreviousPasswordBlockCount;
    /**
     * Indicates whether or not to require a password.
     */
    private Boolean passwordRequired;
    /**
     * Possible values of required passwords.
     */
    private RequiredPasswordType passwordRequiredType;
    /**
     * Number of sign in failures allowed before factory reset.
     */
    private Integer passwordSignInFailureCountBeforeFactoryReset;
    /**
     * Indicates whether or not to block screenshots.
     */
    private Boolean screenCaptureBlocked;
    /**
     * Indicates whether or not to block removable storage.
     */
    private Boolean storageBlockRemovableStorage;
    /**
     * Indicates whether or not to require encryption.
     */
    private Boolean storageRequireEncryption;
    /**
     * Indicates whether or not to block the web browser.
     */
    private Boolean webBrowserBlocked;
    /**
     * Indicates whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
     */
    private Boolean wifiBlockAutomaticConnectHotspots;
    /**
     * Indicates whether or not to block Wi-Fi.
     */
    private Boolean wifiBlocked;
    /**
     * Indicates whether or not to block Wi-Fi hotspot reporting. Has no impact if Wi-Fi is blocked.
     */
    private Boolean wifiBlockHotspotReporting;
    /**
     * Indicates whether or not to block the Windows Store.
     */
    private Boolean windowsStoreBlocked;
    /**
     * Instantiates a new windowsPhone81GeneralConfiguration and sets the default values.
     */
    public WindowsPhone81GeneralConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsPhone81GeneralConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsPhone81GeneralConfiguration
     */
    @jakarta.annotation.Nonnull
    public static WindowsPhone81GeneralConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsPhone81GeneralConfiguration();
    }
    /**
     * Gets the applyOnlyToWindowsPhone81 property value. Value indicating whether this policy only applies to Windows Phone 8.1. This property is read-only.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplyOnlyToWindowsPhone81() {
        return this.applyOnlyToWindowsPhone81;
    }
    /**
     * Gets the appsBlockCopyPaste property value. Indicates whether or not to block copy paste.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppsBlockCopyPaste() {
        return this.appsBlockCopyPaste;
    }
    /**
     * Gets the bluetoothBlocked property value. Indicates whether or not to block bluetooth.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBluetoothBlocked() {
        return this.bluetoothBlocked;
    }
    /**
     * Gets the cameraBlocked property value. Indicates whether or not to block camera.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this.cameraBlocked;
    }
    /**
     * Gets the cellularBlockWifiTethering property value. Indicates whether or not to block Wi-Fi tethering. Has no impact if Wi-Fi is blocked.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockWifiTethering() {
        return this.cellularBlockWifiTethering;
    }
    /**
     * Gets the compliantAppListType property value. Possible values of the compliance app list.
     * @return a appListType
     */
    @jakarta.annotation.Nullable
    public AppListType getCompliantAppListType() {
        return this.compliantAppListType;
    }
    /**
     * Gets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @return a appListItem
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getCompliantAppsList() {
        return this.compliantAppsList;
    }
    /**
     * Gets the diagnosticDataBlockSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDiagnosticDataBlockSubmission() {
        return this.diagnosticDataBlockSubmission;
    }
    /**
     * Gets the emailBlockAddingAccounts property value. Indicates whether or not to block custom email accounts.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEmailBlockAddingAccounts() {
        return this.emailBlockAddingAccounts;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applyOnlyToWindowsPhone81", (n) -> { this.setApplyOnlyToWindowsPhone81(n.getBooleanValue()); });
        deserializerMap.put("appsBlockCopyPaste", (n) -> { this.setAppsBlockCopyPaste(n.getBooleanValue()); });
        deserializerMap.put("bluetoothBlocked", (n) -> { this.setBluetoothBlocked(n.getBooleanValue()); });
        deserializerMap.put("cameraBlocked", (n) -> { this.setCameraBlocked(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockWifiTethering", (n) -> { this.setCellularBlockWifiTethering(n.getBooleanValue()); });
        deserializerMap.put("compliantAppListType", (n) -> { this.setCompliantAppListType(n.getEnumValue(AppListType.class)); });
        deserializerMap.put("compliantAppsList", (n) -> { this.setCompliantAppsList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("diagnosticDataBlockSubmission", (n) -> { this.setDiagnosticDataBlockSubmission(n.getBooleanValue()); });
        deserializerMap.put("emailBlockAddingAccounts", (n) -> { this.setEmailBlockAddingAccounts(n.getBooleanValue()); });
        deserializerMap.put("locationServicesBlocked", (n) -> { this.setLocationServicesBlocked(n.getBooleanValue()); });
        deserializerMap.put("microsoftAccountBlocked", (n) -> { this.setMicrosoftAccountBlocked(n.getBooleanValue()); });
        deserializerMap.put("nfcBlocked", (n) -> { this.setNfcBlocked(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockSimple", (n) -> { this.setPasswordBlockSimple(n.getBooleanValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { this.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumCharacterSetCount", (n) -> { this.setPasswordMinimumCharacterSetCount(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { this.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordBlockCount", (n) -> { this.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passwordRequired", (n) -> { this.setPasswordRequired(n.getBooleanValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
        deserializerMap.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { this.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        deserializerMap.put("screenCaptureBlocked", (n) -> { this.setScreenCaptureBlocked(n.getBooleanValue()); });
        deserializerMap.put("storageBlockRemovableStorage", (n) -> { this.setStorageBlockRemovableStorage(n.getBooleanValue()); });
        deserializerMap.put("storageRequireEncryption", (n) -> { this.setStorageRequireEncryption(n.getBooleanValue()); });
        deserializerMap.put("webBrowserBlocked", (n) -> { this.setWebBrowserBlocked(n.getBooleanValue()); });
        deserializerMap.put("wifiBlockAutomaticConnectHotspots", (n) -> { this.setWifiBlockAutomaticConnectHotspots(n.getBooleanValue()); });
        deserializerMap.put("wifiBlocked", (n) -> { this.setWifiBlocked(n.getBooleanValue()); });
        deserializerMap.put("wifiBlockHotspotReporting", (n) -> { this.setWifiBlockHotspotReporting(n.getBooleanValue()); });
        deserializerMap.put("windowsStoreBlocked", (n) -> { this.setWindowsStoreBlocked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the locationServicesBlocked property value. Indicates whether or not to block location services.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocationServicesBlocked() {
        return this.locationServicesBlocked;
    }
    /**
     * Gets the microsoftAccountBlocked property value. Indicates whether or not to block using a Microsoft Account.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMicrosoftAccountBlocked() {
        return this.microsoftAccountBlocked;
    }
    /**
     * Gets the nfcBlocked property value. Indicates whether or not to block Near-Field Communication.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getNfcBlocked() {
        return this.nfcBlocked;
    }
    /**
     * Gets the passwordBlockSimple property value. Indicates whether or not to block syncing the calendar.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockSimple() {
        return this.passwordBlockSimple;
    }
    /**
     * Gets the passwordExpirationDays property value. Number of days before the password expires.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.passwordExpirationDays;
    }
    /**
     * Gets the passwordMinimumCharacterSetCount property value. Number of character sets a password must contain.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumCharacterSetCount() {
        return this.passwordMinimumCharacterSetCount;
    }
    /**
     * Gets the passwordMinimumLength property value. Minimum length of passwords.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.passwordMinimumLength;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before screen timeout.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this.passwordMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block. Valid values 0 to 24
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequired property value. Indicates whether or not to require a password.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this.passwordRequired;
    }
    /**
     * Gets the passwordRequiredType property value. Possible values of required passwords.
     * @return a requiredPasswordType
     */
    @jakarta.annotation.Nullable
    public RequiredPasswordType getPasswordRequiredType() {
        return this.passwordRequiredType;
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. Number of sign in failures allowed before factory reset.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this.passwordSignInFailureCountBeforeFactoryReset;
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to block screenshots.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this.screenCaptureBlocked;
    }
    /**
     * Gets the storageBlockRemovableStorage property value. Indicates whether or not to block removable storage.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageBlockRemovableStorage() {
        return this.storageBlockRemovableStorage;
    }
    /**
     * Gets the storageRequireEncryption property value. Indicates whether or not to require encryption.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageRequireEncryption() {
        return this.storageRequireEncryption;
    }
    /**
     * Gets the webBrowserBlocked property value. Indicates whether or not to block the web browser.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWebBrowserBlocked() {
        return this.webBrowserBlocked;
    }
    /**
     * Gets the wifiBlockAutomaticConnectHotspots property value. Indicates whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWifiBlockAutomaticConnectHotspots() {
        return this.wifiBlockAutomaticConnectHotspots;
    }
    /**
     * Gets the wifiBlocked property value. Indicates whether or not to block Wi-Fi.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWifiBlocked() {
        return this.wifiBlocked;
    }
    /**
     * Gets the wifiBlockHotspotReporting property value. Indicates whether or not to block Wi-Fi hotspot reporting. Has no impact if Wi-Fi is blocked.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWifiBlockHotspotReporting() {
        return this.wifiBlockHotspotReporting;
    }
    /**
     * Gets the windowsStoreBlocked property value. Indicates whether or not to block the Windows Store.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWindowsStoreBlocked() {
        return this.windowsStoreBlocked;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
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
     */
    public void setApplyOnlyToWindowsPhone81(@jakarta.annotation.Nullable final Boolean value) {
        this.applyOnlyToWindowsPhone81 = value;
    }
    /**
     * Sets the appsBlockCopyPaste property value. Indicates whether or not to block copy paste.
     * @param value Value to set for the appsBlockCopyPaste property.
     */
    public void setAppsBlockCopyPaste(@jakarta.annotation.Nullable final Boolean value) {
        this.appsBlockCopyPaste = value;
    }
    /**
     * Sets the bluetoothBlocked property value. Indicates whether or not to block bluetooth.
     * @param value Value to set for the bluetoothBlocked property.
     */
    public void setBluetoothBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.bluetoothBlocked = value;
    }
    /**
     * Sets the cameraBlocked property value. Indicates whether or not to block camera.
     * @param value Value to set for the cameraBlocked property.
     */
    public void setCameraBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.cameraBlocked = value;
    }
    /**
     * Sets the cellularBlockWifiTethering property value. Indicates whether or not to block Wi-Fi tethering. Has no impact if Wi-Fi is blocked.
     * @param value Value to set for the cellularBlockWifiTethering property.
     */
    public void setCellularBlockWifiTethering(@jakarta.annotation.Nullable final Boolean value) {
        this.cellularBlockWifiTethering = value;
    }
    /**
     * Sets the compliantAppListType property value. Possible values of the compliance app list.
     * @param value Value to set for the compliantAppListType property.
     */
    public void setCompliantAppListType(@jakarta.annotation.Nullable final AppListType value) {
        this.compliantAppListType = value;
    }
    /**
     * Sets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the compliantAppsList property.
     */
    public void setCompliantAppsList(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.compliantAppsList = value;
    }
    /**
     * Sets the diagnosticDataBlockSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @param value Value to set for the diagnosticDataBlockSubmission property.
     */
    public void setDiagnosticDataBlockSubmission(@jakarta.annotation.Nullable final Boolean value) {
        this.diagnosticDataBlockSubmission = value;
    }
    /**
     * Sets the emailBlockAddingAccounts property value. Indicates whether or not to block custom email accounts.
     * @param value Value to set for the emailBlockAddingAccounts property.
     */
    public void setEmailBlockAddingAccounts(@jakarta.annotation.Nullable final Boolean value) {
        this.emailBlockAddingAccounts = value;
    }
    /**
     * Sets the locationServicesBlocked property value. Indicates whether or not to block location services.
     * @param value Value to set for the locationServicesBlocked property.
     */
    public void setLocationServicesBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.locationServicesBlocked = value;
    }
    /**
     * Sets the microsoftAccountBlocked property value. Indicates whether or not to block using a Microsoft Account.
     * @param value Value to set for the microsoftAccountBlocked property.
     */
    public void setMicrosoftAccountBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.microsoftAccountBlocked = value;
    }
    /**
     * Sets the nfcBlocked property value. Indicates whether or not to block Near-Field Communication.
     * @param value Value to set for the nfcBlocked property.
     */
    public void setNfcBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.nfcBlocked = value;
    }
    /**
     * Sets the passwordBlockSimple property value. Indicates whether or not to block syncing the calendar.
     * @param value Value to set for the passwordBlockSimple property.
     */
    public void setPasswordBlockSimple(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordBlockSimple = value;
    }
    /**
     * Sets the passwordExpirationDays property value. Number of days before the password expires.
     * @param value Value to set for the passwordExpirationDays property.
     */
    public void setPasswordExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. Number of character sets a password must contain.
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     */
    public void setPasswordMinimumCharacterSetCount(@jakarta.annotation.Nullable final Integer value) {
        this.passwordMinimumCharacterSetCount = value;
    }
    /**
     * Sets the passwordMinimumLength property value. Minimum length of passwords.
     * @param value Value to set for the passwordMinimumLength property.
     */
    public void setPasswordMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before screen timeout.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     */
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.passwordMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block. Valid values 0 to 24
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     */
    public void setPasswordPreviousPasswordBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequired property value. Indicates whether or not to require a password.
     * @param value Value to set for the passwordRequired property.
     */
    public void setPasswordRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordRequired = value;
    }
    /**
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     */
    public void setPasswordRequiredType(@jakarta.annotation.Nullable final RequiredPasswordType value) {
        this.passwordRequiredType = value;
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. Number of sign in failures allowed before factory reset.
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     */
    public void setPasswordSignInFailureCountBeforeFactoryReset(@jakarta.annotation.Nullable final Integer value) {
        this.passwordSignInFailureCountBeforeFactoryReset = value;
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to block screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     */
    public void setScreenCaptureBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.screenCaptureBlocked = value;
    }
    /**
     * Sets the storageBlockRemovableStorage property value. Indicates whether or not to block removable storage.
     * @param value Value to set for the storageBlockRemovableStorage property.
     */
    public void setStorageBlockRemovableStorage(@jakarta.annotation.Nullable final Boolean value) {
        this.storageBlockRemovableStorage = value;
    }
    /**
     * Sets the storageRequireEncryption property value. Indicates whether or not to require encryption.
     * @param value Value to set for the storageRequireEncryption property.
     */
    public void setStorageRequireEncryption(@jakarta.annotation.Nullable final Boolean value) {
        this.storageRequireEncryption = value;
    }
    /**
     * Sets the webBrowserBlocked property value. Indicates whether or not to block the web browser.
     * @param value Value to set for the webBrowserBlocked property.
     */
    public void setWebBrowserBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.webBrowserBlocked = value;
    }
    /**
     * Sets the wifiBlockAutomaticConnectHotspots property value. Indicates whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
     * @param value Value to set for the wifiBlockAutomaticConnectHotspots property.
     */
    public void setWifiBlockAutomaticConnectHotspots(@jakarta.annotation.Nullable final Boolean value) {
        this.wifiBlockAutomaticConnectHotspots = value;
    }
    /**
     * Sets the wifiBlocked property value. Indicates whether or not to block Wi-Fi.
     * @param value Value to set for the wifiBlocked property.
     */
    public void setWifiBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.wifiBlocked = value;
    }
    /**
     * Sets the wifiBlockHotspotReporting property value. Indicates whether or not to block Wi-Fi hotspot reporting. Has no impact if Wi-Fi is blocked.
     * @param value Value to set for the wifiBlockHotspotReporting property.
     */
    public void setWifiBlockHotspotReporting(@jakarta.annotation.Nullable final Boolean value) {
        this.wifiBlockHotspotReporting = value;
    }
    /**
     * Sets the windowsStoreBlocked property value. Indicates whether or not to block the Windows Store.
     * @param value Value to set for the windowsStoreBlocked property.
     */
    public void setWindowsStoreBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.windowsStoreBlocked = value;
    }
}
