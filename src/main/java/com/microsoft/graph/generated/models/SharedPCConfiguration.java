package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the sharedPCConfiguration resource.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharedPCConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link SharedPCConfiguration} and sets the default values.
     */
    public SharedPCConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.sharedPCConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharedPCConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static SharedPCConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharedPCConfiguration();
    }
    /**
     * Gets the accountManagerPolicy property value. Specifies how accounts are managed on a shared PC. Only applies when disableAccountManager is false.
     * @return a {@link SharedPCAccountManagerPolicy}
     */
    @jakarta.annotation.Nullable
    public SharedPCAccountManagerPolicy getAccountManagerPolicy() {
        return this.backingStore.get("accountManagerPolicy");
    }
    /**
     * Gets the allowedAccounts property value. Type of accounts that are allowed to share the PC.
     * @return a {@link EnumSet<SharedPCAllowedAccountType>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<SharedPCAllowedAccountType> getAllowedAccounts() {
        return this.backingStore.get("allowedAccounts");
    }
    /**
     * Gets the allowLocalStorage property value. Specifies whether local storage is allowed on a shared PC.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowLocalStorage() {
        return this.backingStore.get("allowLocalStorage");
    }
    /**
     * Gets the disableAccountManager property value. Disables the account manager for shared PC mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableAccountManager() {
        return this.backingStore.get("disableAccountManager");
    }
    /**
     * Gets the disableEduPolicies property value. Specifies whether the default shared PC education environment policies should be disabled. For Windows 10 RS2 and later, this policy will be applied without setting Enabled to true.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableEduPolicies() {
        return this.backingStore.get("disableEduPolicies");
    }
    /**
     * Gets the disablePowerPolicies property value. Specifies whether the default shared PC power policies should be disabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDisablePowerPolicies() {
        return this.backingStore.get("disablePowerPolicies");
    }
    /**
     * Gets the disableSignInOnResume property value. Disables the requirement to sign in whenever the device wakes up from sleep mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableSignInOnResume() {
        return this.backingStore.get("disableSignInOnResume");
    }
    /**
     * Gets the enabled property value. Enables shared PC mode and applies the shared pc policies.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.backingStore.get("enabled");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountManagerPolicy", (n) -> { this.setAccountManagerPolicy(n.getObjectValue(SharedPCAccountManagerPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("allowedAccounts", (n) -> { this.setAllowedAccounts(n.getEnumSetValue(SharedPCAllowedAccountType::forValue)); });
        deserializerMap.put("allowLocalStorage", (n) -> { this.setAllowLocalStorage(n.getBooleanValue()); });
        deserializerMap.put("disableAccountManager", (n) -> { this.setDisableAccountManager(n.getBooleanValue()); });
        deserializerMap.put("disableEduPolicies", (n) -> { this.setDisableEduPolicies(n.getBooleanValue()); });
        deserializerMap.put("disablePowerPolicies", (n) -> { this.setDisablePowerPolicies(n.getBooleanValue()); });
        deserializerMap.put("disableSignInOnResume", (n) -> { this.setDisableSignInOnResume(n.getBooleanValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("idleTimeBeforeSleepInSeconds", (n) -> { this.setIdleTimeBeforeSleepInSeconds(n.getIntegerValue()); });
        deserializerMap.put("kioskAppDisplayName", (n) -> { this.setKioskAppDisplayName(n.getStringValue()); });
        deserializerMap.put("kioskAppUserModelId", (n) -> { this.setKioskAppUserModelId(n.getStringValue()); });
        deserializerMap.put("maintenanceStartTime", (n) -> { this.setMaintenanceStartTime(n.getLocalTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the idleTimeBeforeSleepInSeconds property value. Specifies the time in seconds that a device must sit idle before the PC goes to sleep. Setting this value to 0 prevents the sleep timeout from occurring.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIdleTimeBeforeSleepInSeconds() {
        return this.backingStore.get("idleTimeBeforeSleepInSeconds");
    }
    /**
     * Gets the kioskAppDisplayName property value. Specifies the display text for the account shown on the sign-in screen which launches the app specified by SetKioskAppUserModelId. Only applies when KioskAppUserModelId is set.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKioskAppDisplayName() {
        return this.backingStore.get("kioskAppDisplayName");
    }
    /**
     * Gets the kioskAppUserModelId property value. Specifies the application user model ID of the app to use with assigned access.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKioskAppUserModelId() {
        return this.backingStore.get("kioskAppUserModelId");
    }
    /**
     * Gets the maintenanceStartTime property value. Specifies the daily start time of maintenance hour.
     * @return a {@link LocalTime}
     */
    @jakarta.annotation.Nullable
    public LocalTime getMaintenanceStartTime() {
        return this.backingStore.get("maintenanceStartTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("accountManagerPolicy", this.getAccountManagerPolicy());
        writer.writeEnumSetValue("allowedAccounts", this.getAllowedAccounts());
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
     */
    public void setAccountManagerPolicy(@jakarta.annotation.Nullable final SharedPCAccountManagerPolicy value) {
        this.backingStore.set("accountManagerPolicy", value);
    }
    /**
     * Sets the allowedAccounts property value. Type of accounts that are allowed to share the PC.
     * @param value Value to set for the allowedAccounts property.
     */
    public void setAllowedAccounts(@jakarta.annotation.Nullable final EnumSet<SharedPCAllowedAccountType> value) {
        this.backingStore.set("allowedAccounts", value);
    }
    /**
     * Sets the allowLocalStorage property value. Specifies whether local storage is allowed on a shared PC.
     * @param value Value to set for the allowLocalStorage property.
     */
    public void setAllowLocalStorage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowLocalStorage", value);
    }
    /**
     * Sets the disableAccountManager property value. Disables the account manager for shared PC mode.
     * @param value Value to set for the disableAccountManager property.
     */
    public void setDisableAccountManager(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("disableAccountManager", value);
    }
    /**
     * Sets the disableEduPolicies property value. Specifies whether the default shared PC education environment policies should be disabled. For Windows 10 RS2 and later, this policy will be applied without setting Enabled to true.
     * @param value Value to set for the disableEduPolicies property.
     */
    public void setDisableEduPolicies(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("disableEduPolicies", value);
    }
    /**
     * Sets the disablePowerPolicies property value. Specifies whether the default shared PC power policies should be disabled.
     * @param value Value to set for the disablePowerPolicies property.
     */
    public void setDisablePowerPolicies(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("disablePowerPolicies", value);
    }
    /**
     * Sets the disableSignInOnResume property value. Disables the requirement to sign in whenever the device wakes up from sleep mode.
     * @param value Value to set for the disableSignInOnResume property.
     */
    public void setDisableSignInOnResume(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("disableSignInOnResume", value);
    }
    /**
     * Sets the enabled property value. Enables shared PC mode and applies the shared pc policies.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enabled", value);
    }
    /**
     * Sets the idleTimeBeforeSleepInSeconds property value. Specifies the time in seconds that a device must sit idle before the PC goes to sleep. Setting this value to 0 prevents the sleep timeout from occurring.
     * @param value Value to set for the idleTimeBeforeSleepInSeconds property.
     */
    public void setIdleTimeBeforeSleepInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("idleTimeBeforeSleepInSeconds", value);
    }
    /**
     * Sets the kioskAppDisplayName property value. Specifies the display text for the account shown on the sign-in screen which launches the app specified by SetKioskAppUserModelId. Only applies when KioskAppUserModelId is set.
     * @param value Value to set for the kioskAppDisplayName property.
     */
    public void setKioskAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("kioskAppDisplayName", value);
    }
    /**
     * Sets the kioskAppUserModelId property value. Specifies the application user model ID of the app to use with assigned access.
     * @param value Value to set for the kioskAppUserModelId property.
     */
    public void setKioskAppUserModelId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("kioskAppUserModelId", value);
    }
    /**
     * Sets the maintenanceStartTime property value. Specifies the daily start time of maintenance hour.
     * @param value Value to set for the maintenanceStartTime property.
     */
    public void setMaintenanceStartTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("maintenanceStartTime", value);
    }
}
