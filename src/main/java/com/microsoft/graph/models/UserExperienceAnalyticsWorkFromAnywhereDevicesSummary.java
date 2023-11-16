package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics Work From Anywhere metrics devices summary.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsWorkFromAnywhereDevicesSummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new UserExperienceAnalyticsWorkFromAnywhereDevicesSummary and sets the default values.
     */
    public UserExperienceAnalyticsWorkFromAnywhereDevicesSummary() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsWorkFromAnywhereDevicesSummary
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsWorkFromAnywhereDevicesSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsWorkFromAnywhereDevicesSummary();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the autopilotDevicesSummary property value. The user experience analytics work from anywhere Autopilot devices summary. Read-only.
     * @return a UserExperienceAnalyticsAutopilotDevicesSummary
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsAutopilotDevicesSummary getAutopilotDevicesSummary() {
        return this.BackingStore.get("autopilotDevicesSummary");
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the cloudIdentityDevicesSummary property value. The user experience analytics work from anywhere Cloud Identity devices summary. Read-only.
     * @return a UserExperienceAnalyticsCloudIdentityDevicesSummary
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsCloudIdentityDevicesSummary getCloudIdentityDevicesSummary() {
        return this.BackingStore.get("cloudIdentityDevicesSummary");
    }
    /**
     * Gets the cloudManagementDevicesSummary property value. The user experience analytics work from anywhere Cloud management devices summary. Read-only.
     * @return a UserExperienceAnalyticsCloudManagementDevicesSummary
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsCloudManagementDevicesSummary getCloudManagementDevicesSummary() {
        return this.BackingStore.get("cloudManagementDevicesSummary");
    }
    /**
     * Gets the coManagedDevices property value. Total number of co-managed devices. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCoManagedDevices() {
        return this.BackingStore.get("coManagedDevices");
    }
    /**
     * Gets the devicesNotAutopilotRegistered property value. The count of intune devices that are not autopilot registerd. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDevicesNotAutopilotRegistered() {
        return this.BackingStore.get("devicesNotAutopilotRegistered");
    }
    /**
     * Gets the devicesWithoutAutopilotProfileAssigned property value. The count of intune devices not autopilot profile assigned. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDevicesWithoutAutopilotProfileAssigned() {
        return this.BackingStore.get("devicesWithoutAutopilotProfileAssigned");
    }
    /**
     * Gets the devicesWithoutCloudIdentity property value. The count of devices that are not cloud identity. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDevicesWithoutCloudIdentity() {
        return this.BackingStore.get("devicesWithoutCloudIdentity");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("autopilotDevicesSummary", (n) -> { this.setAutopilotDevicesSummary(n.getObjectValue(UserExperienceAnalyticsAutopilotDevicesSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudIdentityDevicesSummary", (n) -> { this.setCloudIdentityDevicesSummary(n.getObjectValue(UserExperienceAnalyticsCloudIdentityDevicesSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudManagementDevicesSummary", (n) -> { this.setCloudManagementDevicesSummary(n.getObjectValue(UserExperienceAnalyticsCloudManagementDevicesSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("coManagedDevices", (n) -> { this.setCoManagedDevices(n.getIntegerValue()); });
        deserializerMap.put("devicesNotAutopilotRegistered", (n) -> { this.setDevicesNotAutopilotRegistered(n.getIntegerValue()); });
        deserializerMap.put("devicesWithoutAutopilotProfileAssigned", (n) -> { this.setDevicesWithoutAutopilotProfileAssigned(n.getIntegerValue()); });
        deserializerMap.put("devicesWithoutCloudIdentity", (n) -> { this.setDevicesWithoutCloudIdentity(n.getIntegerValue()); });
        deserializerMap.put("intuneDevices", (n) -> { this.setIntuneDevices(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("tenantAttachDevices", (n) -> { this.setTenantAttachDevices(n.getIntegerValue()); });
        deserializerMap.put("totalDevices", (n) -> { this.setTotalDevices(n.getIntegerValue()); });
        deserializerMap.put("unsupportedOSversionDevices", (n) -> { this.setUnsupportedOSversionDevices(n.getIntegerValue()); });
        deserializerMap.put("windows10Devices", (n) -> { this.setWindows10Devices(n.getIntegerValue()); });
        deserializerMap.put("windows10DevicesSummary", (n) -> { this.setWindows10DevicesSummary(n.getObjectValue(UserExperienceAnalyticsWindows10DevicesSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("windows10DevicesWithoutTenantAttach", (n) -> { this.setWindows10DevicesWithoutTenantAttach(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the intuneDevices property value. The count of intune devices that are not autopilot registerd. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIntuneDevices() {
        return this.BackingStore.get("intuneDevices");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the tenantAttachDevices property value. Total count of tenant attach devices. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTenantAttachDevices() {
        return this.BackingStore.get("tenantAttachDevices");
    }
    /**
     * Gets the totalDevices property value. The total count of devices. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalDevices() {
        return this.BackingStore.get("totalDevices");
    }
    /**
     * Gets the unsupportedOSversionDevices property value. The count of Windows 10 devices that have unsupported OS versions. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUnsupportedOSversionDevices() {
        return this.BackingStore.get("unsupportedOSversionDevices");
    }
    /**
     * Gets the windows10Devices property value. The count of windows 10 devices. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getWindows10Devices() {
        return this.BackingStore.get("windows10Devices");
    }
    /**
     * Gets the windows10DevicesSummary property value. The user experience analytics work from anywhere Windows 10 devices summary. Read-only.
     * @return a UserExperienceAnalyticsWindows10DevicesSummary
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsWindows10DevicesSummary getWindows10DevicesSummary() {
        return this.BackingStore.get("windows10DevicesSummary");
    }
    /**
     * Gets the windows10DevicesWithoutTenantAttach property value. The count of windows 10 devices that are Intune and co-managed. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getWindows10DevicesWithoutTenantAttach() {
        return this.BackingStore.get("windows10DevicesWithoutTenantAttach");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("autopilotDevicesSummary", this.getAutopilotDevicesSummary());
        writer.writeObjectValue("cloudIdentityDevicesSummary", this.getCloudIdentityDevicesSummary());
        writer.writeObjectValue("cloudManagementDevicesSummary", this.getCloudManagementDevicesSummary());
        writer.writeIntegerValue("coManagedDevices", this.getCoManagedDevices());
        writer.writeIntegerValue("devicesNotAutopilotRegistered", this.getDevicesNotAutopilotRegistered());
        writer.writeIntegerValue("devicesWithoutAutopilotProfileAssigned", this.getDevicesWithoutAutopilotProfileAssigned());
        writer.writeIntegerValue("devicesWithoutCloudIdentity", this.getDevicesWithoutCloudIdentity());
        writer.writeIntegerValue("intuneDevices", this.getIntuneDevices());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("tenantAttachDevices", this.getTenantAttachDevices());
        writer.writeIntegerValue("totalDevices", this.getTotalDevices());
        writer.writeIntegerValue("unsupportedOSversionDevices", this.getUnsupportedOSversionDevices());
        writer.writeIntegerValue("windows10Devices", this.getWindows10Devices());
        writer.writeObjectValue("windows10DevicesSummary", this.getWindows10DevicesSummary());
        writer.writeIntegerValue("windows10DevicesWithoutTenantAttach", this.getWindows10DevicesWithoutTenantAttach());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the autopilotDevicesSummary property value. The user experience analytics work from anywhere Autopilot devices summary. Read-only.
     * @param value Value to set for the autopilotDevicesSummary property.
     */
    public void setAutopilotDevicesSummary(@jakarta.annotation.Nullable final UserExperienceAnalyticsAutopilotDevicesSummary value) {
        this.BackingStore.set("autopilotDevicesSummary", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the cloudIdentityDevicesSummary property value. The user experience analytics work from anywhere Cloud Identity devices summary. Read-only.
     * @param value Value to set for the cloudIdentityDevicesSummary property.
     */
    public void setCloudIdentityDevicesSummary(@jakarta.annotation.Nullable final UserExperienceAnalyticsCloudIdentityDevicesSummary value) {
        this.BackingStore.set("cloudIdentityDevicesSummary", value);
    }
    /**
     * Sets the cloudManagementDevicesSummary property value. The user experience analytics work from anywhere Cloud management devices summary. Read-only.
     * @param value Value to set for the cloudManagementDevicesSummary property.
     */
    public void setCloudManagementDevicesSummary(@jakarta.annotation.Nullable final UserExperienceAnalyticsCloudManagementDevicesSummary value) {
        this.BackingStore.set("cloudManagementDevicesSummary", value);
    }
    /**
     * Sets the coManagedDevices property value. Total number of co-managed devices. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the coManagedDevices property.
     */
    public void setCoManagedDevices(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("coManagedDevices", value);
    }
    /**
     * Sets the devicesNotAutopilotRegistered property value. The count of intune devices that are not autopilot registerd. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the devicesNotAutopilotRegistered property.
     */
    public void setDevicesNotAutopilotRegistered(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("devicesNotAutopilotRegistered", value);
    }
    /**
     * Sets the devicesWithoutAutopilotProfileAssigned property value. The count of intune devices not autopilot profile assigned. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the devicesWithoutAutopilotProfileAssigned property.
     */
    public void setDevicesWithoutAutopilotProfileAssigned(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("devicesWithoutAutopilotProfileAssigned", value);
    }
    /**
     * Sets the devicesWithoutCloudIdentity property value. The count of devices that are not cloud identity. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the devicesWithoutCloudIdentity property.
     */
    public void setDevicesWithoutCloudIdentity(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("devicesWithoutCloudIdentity", value);
    }
    /**
     * Sets the intuneDevices property value. The count of intune devices that are not autopilot registerd. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the intuneDevices property.
     */
    public void setIntuneDevices(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("intuneDevices", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the tenantAttachDevices property value. Total count of tenant attach devices. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the tenantAttachDevices property.
     */
    public void setTenantAttachDevices(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("tenantAttachDevices", value);
    }
    /**
     * Sets the totalDevices property value. The total count of devices. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the totalDevices property.
     */
    public void setTotalDevices(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("totalDevices", value);
    }
    /**
     * Sets the unsupportedOSversionDevices property value. The count of Windows 10 devices that have unsupported OS versions. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the unsupportedOSversionDevices property.
     */
    public void setUnsupportedOSversionDevices(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("unsupportedOSversionDevices", value);
    }
    /**
     * Sets the windows10Devices property value. The count of windows 10 devices. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the windows10Devices property.
     */
    public void setWindows10Devices(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("windows10Devices", value);
    }
    /**
     * Sets the windows10DevicesSummary property value. The user experience analytics work from anywhere Windows 10 devices summary. Read-only.
     * @param value Value to set for the windows10DevicesSummary property.
     */
    public void setWindows10DevicesSummary(@jakarta.annotation.Nullable final UserExperienceAnalyticsWindows10DevicesSummary value) {
        this.BackingStore.set("windows10DevicesSummary", value);
    }
    /**
     * Sets the windows10DevicesWithoutTenantAttach property value. The count of windows 10 devices that are Intune and co-managed. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the windows10DevicesWithoutTenantAttach property.
     */
    public void setWindows10DevicesWithoutTenantAttach(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("windows10DevicesWithoutTenantAttach", value);
    }
}
