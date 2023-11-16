package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics hardware readiness entity contains account level information about hardware blockers for windows upgrade.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric extends Entity implements Parsable {
    /**
     * Instantiates a new UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric and sets the default values.
     */
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("osCheckFailedPercentage", (n) -> { this.setOsCheckFailedPercentage(n.getDoubleValue()); });
        deserializerMap.put("processor64BitCheckFailedPercentage", (n) -> { this.setProcessor64BitCheckFailedPercentage(n.getDoubleValue()); });
        deserializerMap.put("processorCoreCountCheckFailedPercentage", (n) -> { this.setProcessorCoreCountCheckFailedPercentage(n.getDoubleValue()); });
        deserializerMap.put("processorFamilyCheckFailedPercentage", (n) -> { this.setProcessorFamilyCheckFailedPercentage(n.getDoubleValue()); });
        deserializerMap.put("processorSpeedCheckFailedPercentage", (n) -> { this.setProcessorSpeedCheckFailedPercentage(n.getDoubleValue()); });
        deserializerMap.put("ramCheckFailedPercentage", (n) -> { this.setRamCheckFailedPercentage(n.getDoubleValue()); });
        deserializerMap.put("secureBootCheckFailedPercentage", (n) -> { this.setSecureBootCheckFailedPercentage(n.getDoubleValue()); });
        deserializerMap.put("storageCheckFailedPercentage", (n) -> { this.setStorageCheckFailedPercentage(n.getDoubleValue()); });
        deserializerMap.put("totalDeviceCount", (n) -> { this.setTotalDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("tpmCheckFailedPercentage", (n) -> { this.setTpmCheckFailedPercentage(n.getDoubleValue()); });
        deserializerMap.put("upgradeEligibleDeviceCount", (n) -> { this.setUpgradeEligibleDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the osCheckFailedPercentage property value. The percentage of devices for which OS check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getOsCheckFailedPercentage() {
        return this.BackingStore.get("osCheckFailedPercentage");
    }
    /**
     * Gets the processor64BitCheckFailedPercentage property value. The percentage of devices for which processor hardware 64-bit architecture check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getProcessor64BitCheckFailedPercentage() {
        return this.BackingStore.get("processor64BitCheckFailedPercentage");
    }
    /**
     * Gets the processorCoreCountCheckFailedPercentage property value. The percentage of devices for which processor hardware core count check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getProcessorCoreCountCheckFailedPercentage() {
        return this.BackingStore.get("processorCoreCountCheckFailedPercentage");
    }
    /**
     * Gets the processorFamilyCheckFailedPercentage property value. The percentage of devices for which processor hardware family check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getProcessorFamilyCheckFailedPercentage() {
        return this.BackingStore.get("processorFamilyCheckFailedPercentage");
    }
    /**
     * Gets the processorSpeedCheckFailedPercentage property value. The percentage of devices for which processor hardware speed check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getProcessorSpeedCheckFailedPercentage() {
        return this.BackingStore.get("processorSpeedCheckFailedPercentage");
    }
    /**
     * Gets the ramCheckFailedPercentage property value. The percentage of devices for which RAM hardware check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getRamCheckFailedPercentage() {
        return this.BackingStore.get("ramCheckFailedPercentage");
    }
    /**
     * Gets the secureBootCheckFailedPercentage property value. The percentage of devices for which secure boot hardware check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSecureBootCheckFailedPercentage() {
        return this.BackingStore.get("secureBootCheckFailedPercentage");
    }
    /**
     * Gets the storageCheckFailedPercentage property value. The percentage of devices for which storage hardware check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getStorageCheckFailedPercentage() {
        return this.BackingStore.get("storageCheckFailedPercentage");
    }
    /**
     * Gets the totalDeviceCount property value. The count of total devices in an organization. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalDeviceCount() {
        return this.BackingStore.get("totalDeviceCount");
    }
    /**
     * Gets the tpmCheckFailedPercentage property value. The percentage of devices for which Trusted Platform Module (TPM) hardware check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getTpmCheckFailedPercentage() {
        return this.BackingStore.get("tpmCheckFailedPercentage");
    }
    /**
     * Gets the upgradeEligibleDeviceCount property value. The count of devices in an organization eligible for windows upgrade. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUpgradeEligibleDeviceCount() {
        return this.BackingStore.get("upgradeEligibleDeviceCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeDoubleValue("osCheckFailedPercentage", this.getOsCheckFailedPercentage());
        writer.writeDoubleValue("processor64BitCheckFailedPercentage", this.getProcessor64BitCheckFailedPercentage());
        writer.writeDoubleValue("processorCoreCountCheckFailedPercentage", this.getProcessorCoreCountCheckFailedPercentage());
        writer.writeDoubleValue("processorFamilyCheckFailedPercentage", this.getProcessorFamilyCheckFailedPercentage());
        writer.writeDoubleValue("processorSpeedCheckFailedPercentage", this.getProcessorSpeedCheckFailedPercentage());
        writer.writeDoubleValue("ramCheckFailedPercentage", this.getRamCheckFailedPercentage());
        writer.writeDoubleValue("secureBootCheckFailedPercentage", this.getSecureBootCheckFailedPercentage());
        writer.writeDoubleValue("storageCheckFailedPercentage", this.getStorageCheckFailedPercentage());
        writer.writeIntegerValue("totalDeviceCount", this.getTotalDeviceCount());
        writer.writeDoubleValue("tpmCheckFailedPercentage", this.getTpmCheckFailedPercentage());
        writer.writeIntegerValue("upgradeEligibleDeviceCount", this.getUpgradeEligibleDeviceCount());
    }
    /**
     * Sets the osCheckFailedPercentage property value. The percentage of devices for which OS check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the osCheckFailedPercentage property.
     */
    public void setOsCheckFailedPercentage(@jakarta.annotation.Nullable final Double value) {
        this.BackingStore.set("osCheckFailedPercentage", value);
    }
    /**
     * Sets the processor64BitCheckFailedPercentage property value. The percentage of devices for which processor hardware 64-bit architecture check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the processor64BitCheckFailedPercentage property.
     */
    public void setProcessor64BitCheckFailedPercentage(@jakarta.annotation.Nullable final Double value) {
        this.BackingStore.set("processor64BitCheckFailedPercentage", value);
    }
    /**
     * Sets the processorCoreCountCheckFailedPercentage property value. The percentage of devices for which processor hardware core count check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the processorCoreCountCheckFailedPercentage property.
     */
    public void setProcessorCoreCountCheckFailedPercentage(@jakarta.annotation.Nullable final Double value) {
        this.BackingStore.set("processorCoreCountCheckFailedPercentage", value);
    }
    /**
     * Sets the processorFamilyCheckFailedPercentage property value. The percentage of devices for which processor hardware family check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the processorFamilyCheckFailedPercentage property.
     */
    public void setProcessorFamilyCheckFailedPercentage(@jakarta.annotation.Nullable final Double value) {
        this.BackingStore.set("processorFamilyCheckFailedPercentage", value);
    }
    /**
     * Sets the processorSpeedCheckFailedPercentage property value. The percentage of devices for which processor hardware speed check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the processorSpeedCheckFailedPercentage property.
     */
    public void setProcessorSpeedCheckFailedPercentage(@jakarta.annotation.Nullable final Double value) {
        this.BackingStore.set("processorSpeedCheckFailedPercentage", value);
    }
    /**
     * Sets the ramCheckFailedPercentage property value. The percentage of devices for which RAM hardware check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the ramCheckFailedPercentage property.
     */
    public void setRamCheckFailedPercentage(@jakarta.annotation.Nullable final Double value) {
        this.BackingStore.set("ramCheckFailedPercentage", value);
    }
    /**
     * Sets the secureBootCheckFailedPercentage property value. The percentage of devices for which secure boot hardware check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the secureBootCheckFailedPercentage property.
     */
    public void setSecureBootCheckFailedPercentage(@jakarta.annotation.Nullable final Double value) {
        this.BackingStore.set("secureBootCheckFailedPercentage", value);
    }
    /**
     * Sets the storageCheckFailedPercentage property value. The percentage of devices for which storage hardware check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the storageCheckFailedPercentage property.
     */
    public void setStorageCheckFailedPercentage(@jakarta.annotation.Nullable final Double value) {
        this.BackingStore.set("storageCheckFailedPercentage", value);
    }
    /**
     * Sets the totalDeviceCount property value. The count of total devices in an organization. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the totalDeviceCount property.
     */
    public void setTotalDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("totalDeviceCount", value);
    }
    /**
     * Sets the tpmCheckFailedPercentage property value. The percentage of devices for which Trusted Platform Module (TPM) hardware check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the tpmCheckFailedPercentage property.
     */
    public void setTpmCheckFailedPercentage(@jakarta.annotation.Nullable final Double value) {
        this.BackingStore.set("tpmCheckFailedPercentage", value);
    }
    /**
     * Sets the upgradeEligibleDeviceCount property value. The count of devices in an organization eligible for windows upgrade. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the upgradeEligibleDeviceCount property.
     */
    public void setUpgradeEligibleDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("upgradeEligibleDeviceCount", value);
    }
}
