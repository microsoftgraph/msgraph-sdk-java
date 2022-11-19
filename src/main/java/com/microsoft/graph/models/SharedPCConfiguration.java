package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SharedPCConfiguration extends DeviceConfiguration implements Parsable {
    /** Specifies how accounts are managed on a shared PC. Only applies when disableAccountManager is false. */
    private SharedPCAccountManagerPolicy _accountManagerPolicy;
    /** Type of accounts that are allowed to share the PC. */
    private SharedPCAllowedAccountType _allowedAccounts;
    /** Specifies whether local storage is allowed on a shared PC. */
    private Boolean _allowLocalStorage;
    /** Disables the account manager for shared PC mode. */
    private Boolean _disableAccountManager;
    /** Specifies whether the default shared PC education environment policies should be disabled. For Windows 10 RS2 and later, this policy will be applied without setting Enabled to true. */
    private Boolean _disableEduPolicies;
    /** Specifies whether the default shared PC power policies should be disabled. */
    private Boolean _disablePowerPolicies;
    /** Disables the requirement to sign in whenever the device wakes up from sleep mode. */
    private Boolean _disableSignInOnResume;
    /** Enables shared PC mode and applies the shared pc policies. */
    private Boolean _enabled;
    /** Specifies the time in seconds that a device must sit idle before the PC goes to sleep. Setting this value to 0 prevents the sleep timeout from occurring. */
    private Integer _idleTimeBeforeSleepInSeconds;
    /** Specifies the display text for the account shown on the sign-in screen which launches the app specified by SetKioskAppUserModelId. Only applies when KioskAppUserModelId is set. */
    private String _kioskAppDisplayName;
    /** Specifies the application user model ID of the app to use with assigned access. */
    private String _kioskAppUserModelId;
    /** Specifies the daily start time of maintenance hour. */
    private LocalTime _maintenanceStartTime;
    /**
     * Instantiates a new SharedPCConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SharedPCConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.sharedPCConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SharedPCConfiguration
     */
    @javax.annotation.Nonnull
    public static SharedPCConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharedPCConfiguration();
    }
    /**
     * Gets the accountManagerPolicy property value. Specifies how accounts are managed on a shared PC. Only applies when disableAccountManager is false.
     * @return a sharedPCAccountManagerPolicy
     */
    @javax.annotation.Nullable
    public SharedPCAccountManagerPolicy getAccountManagerPolicy() {
        return this._accountManagerPolicy;
    }
    /**
     * Gets the allowedAccounts property value. Type of accounts that are allowed to share the PC.
     * @return a sharedPCAllowedAccountType
     */
    @javax.annotation.Nullable
    public SharedPCAllowedAccountType getAllowedAccounts() {
        return this._allowedAccounts;
    }
    /**
     * Gets the allowLocalStorage property value. Specifies whether local storage is allowed on a shared PC.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowLocalStorage() {
        return this._allowLocalStorage;
    }
    /**
     * Gets the disableAccountManager property value. Disables the account manager for shared PC mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableAccountManager() {
        return this._disableAccountManager;
    }
    /**
     * Gets the disableEduPolicies property value. Specifies whether the default shared PC education environment policies should be disabled. For Windows 10 RS2 and later, this policy will be applied without setting Enabled to true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableEduPolicies() {
        return this._disableEduPolicies;
    }
    /**
     * Gets the disablePowerPolicies property value. Specifies whether the default shared PC power policies should be disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisablePowerPolicies() {
        return this._disablePowerPolicies;
    }
    /**
     * Gets the disableSignInOnResume property value. Disables the requirement to sign in whenever the device wakes up from sleep mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableSignInOnResume() {
        return this._disableSignInOnResume;
    }
    /**
     * Gets the enabled property value. Enables shared PC mode and applies the shared pc policies.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return this._enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SharedPCConfiguration currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountManagerPolicy", (n) -> { currentObject.setAccountManagerPolicy(n.getObjectValue(SharedPCAccountManagerPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("allowedAccounts", (n) -> { currentObject.setAllowedAccounts(n.getEnumValue(SharedPCAllowedAccountType.class)); });
        deserializerMap.put("allowLocalStorage", (n) -> { currentObject.setAllowLocalStorage(n.getBooleanValue()); });
        deserializerMap.put("disableAccountManager", (n) -> { currentObject.setDisableAccountManager(n.getBooleanValue()); });
        deserializerMap.put("disableEduPolicies", (n) -> { currentObject.setDisableEduPolicies(n.getBooleanValue()); });
        deserializerMap.put("disablePowerPolicies", (n) -> { currentObject.setDisablePowerPolicies(n.getBooleanValue()); });
        deserializerMap.put("disableSignInOnResume", (n) -> { currentObject.setDisableSignInOnResume(n.getBooleanValue()); });
        deserializerMap.put("enabled", (n) -> { currentObject.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("idleTimeBeforeSleepInSeconds", (n) -> { currentObject.setIdleTimeBeforeSleepInSeconds(n.getIntegerValue()); });
        deserializerMap.put("kioskAppDisplayName", (n) -> { currentObject.setKioskAppDisplayName(n.getStringValue()); });
        deserializerMap.put("kioskAppUserModelId", (n) -> { currentObject.setKioskAppUserModelId(n.getStringValue()); });
        deserializerMap.put("maintenanceStartTime", (n) -> { currentObject.setMaintenanceStartTime(n.getLocalTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the idleTimeBeforeSleepInSeconds property value. Specifies the time in seconds that a device must sit idle before the PC goes to sleep. Setting this value to 0 prevents the sleep timeout from occurring.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIdleTimeBeforeSleepInSeconds() {
        return this._idleTimeBeforeSleepInSeconds;
    }
    /**
     * Gets the kioskAppDisplayName property value. Specifies the display text for the account shown on the sign-in screen which launches the app specified by SetKioskAppUserModelId. Only applies when KioskAppUserModelId is set.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKioskAppDisplayName() {
        return this._kioskAppDisplayName;
    }
    /**
     * Gets the kioskAppUserModelId property value. Specifies the application user model ID of the app to use with assigned access.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKioskAppUserModelId() {
        return this._kioskAppUserModelId;
    }
    /**
     * Gets the maintenanceStartTime property value. Specifies the daily start time of maintenance hour.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getMaintenanceStartTime() {
        return this._maintenanceStartTime;
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
        writer.writeObjectValue("accountManagerPolicy", this.getAccountManagerPolicy());
        writer.writeEnumValue("allowedAccounts", this.getAllowedAccounts());
        writer.writeBooleanValue("allowLocalStorage", this.getAllowLocalStorage());
        writer.writeBooleanValue("disableAccountManager", this.getDisableAccountManager());
        writer.writeBooleanValue("disableEduPolicies", this.getDisableEduPolicies());
        writer.writeBooleanValue("disablePowerPolicies", this.getDisablePowerPolicies());
        writer.writeBooleanValue("disableSignInOnResume", this.getDisableSignInOnResume());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeIntegerValue("idleTimeBeforeSleepInSeconds", this.getIdleTimeBeforeSleepInSeconds());
        writer.writeStringValue("kioskAppDisplayName", this.getKioskAppDisplayName());
        writer.writeStringValue("kioskAppUserModelId", this.getKioskAppUserModelId());
        writer.writeLocalTimeValue("maintenanceStartTime", this.getMaintenanceStartTime());
    }
    /**
     * Sets the accountManagerPolicy property value. Specifies how accounts are managed on a shared PC. Only applies when disableAccountManager is false.
     * @param value Value to set for the accountManagerPolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountManagerPolicy(@javax.annotation.Nullable final SharedPCAccountManagerPolicy value) {
        this._accountManagerPolicy = value;
    }
    /**
     * Sets the allowedAccounts property value. Type of accounts that are allowed to share the PC.
     * @param value Value to set for the allowedAccounts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedAccounts(@javax.annotation.Nullable final SharedPCAllowedAccountType value) {
        this._allowedAccounts = value;
    }
    /**
     * Sets the allowLocalStorage property value. Specifies whether local storage is allowed on a shared PC.
     * @param value Value to set for the allowLocalStorage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowLocalStorage(@javax.annotation.Nullable final Boolean value) {
        this._allowLocalStorage = value;
    }
    /**
     * Sets the disableAccountManager property value. Disables the account manager for shared PC mode.
     * @param value Value to set for the disableAccountManager property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisableAccountManager(@javax.annotation.Nullable final Boolean value) {
        this._disableAccountManager = value;
    }
    /**
     * Sets the disableEduPolicies property value. Specifies whether the default shared PC education environment policies should be disabled. For Windows 10 RS2 and later, this policy will be applied without setting Enabled to true.
     * @param value Value to set for the disableEduPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisableEduPolicies(@javax.annotation.Nullable final Boolean value) {
        this._disableEduPolicies = value;
    }
    /**
     * Sets the disablePowerPolicies property value. Specifies whether the default shared PC power policies should be disabled.
     * @param value Value to set for the disablePowerPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisablePowerPolicies(@javax.annotation.Nullable final Boolean value) {
        this._disablePowerPolicies = value;
    }
    /**
     * Sets the disableSignInOnResume property value. Disables the requirement to sign in whenever the device wakes up from sleep mode.
     * @param value Value to set for the disableSignInOnResume property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisableSignInOnResume(@javax.annotation.Nullable final Boolean value) {
        this._disableSignInOnResume = value;
    }
    /**
     * Sets the enabled property value. Enables shared PC mode and applies the shared pc policies.
     * @param value Value to set for the enabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnabled(@javax.annotation.Nullable final Boolean value) {
        this._enabled = value;
    }
    /**
     * Sets the idleTimeBeforeSleepInSeconds property value. Specifies the time in seconds that a device must sit idle before the PC goes to sleep. Setting this value to 0 prevents the sleep timeout from occurring.
     * @param value Value to set for the idleTimeBeforeSleepInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdleTimeBeforeSleepInSeconds(@javax.annotation.Nullable final Integer value) {
        this._idleTimeBeforeSleepInSeconds = value;
    }
    /**
     * Sets the kioskAppDisplayName property value. Specifies the display text for the account shown on the sign-in screen which launches the app specified by SetKioskAppUserModelId. Only applies when KioskAppUserModelId is set.
     * @param value Value to set for the kioskAppDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskAppDisplayName(@javax.annotation.Nullable final String value) {
        this._kioskAppDisplayName = value;
    }
    /**
     * Sets the kioskAppUserModelId property value. Specifies the application user model ID of the app to use with assigned access.
     * @param value Value to set for the kioskAppUserModelId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskAppUserModelId(@javax.annotation.Nullable final String value) {
        this._kioskAppUserModelId = value;
    }
    /**
     * Sets the maintenanceStartTime property value. Specifies the daily start time of maintenance hour.
     * @param value Value to set for the maintenanceStartTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaintenanceStartTime(@javax.annotation.Nullable final LocalTime value) {
        this._maintenanceStartTime = value;
    }
}
