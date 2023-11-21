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
 * Hardware information of a given device.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceProtectionOverview implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new DeviceProtectionOverview and sets the default values.
     */
    public DeviceProtectionOverview() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceProtectionOverview
     */
    @jakarta.annotation.Nonnull
    public static DeviceProtectionOverview createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceProtectionOverview();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the cleanDeviceCount property value. Indicates number of devices reporting as clean
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCleanDeviceCount() {
        return this.backingStore.get("cleanDeviceCount");
    }
    /**
     * Gets the criticalFailuresDeviceCount property value. Indicates number of devices with critical failures
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCriticalFailuresDeviceCount() {
        return this.backingStore.get("criticalFailuresDeviceCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("cleanDeviceCount", (n) -> { this.setCleanDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("criticalFailuresDeviceCount", (n) -> { this.setCriticalFailuresDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("inactiveThreatAgentDeviceCount", (n) -> { this.setInactiveThreatAgentDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("pendingFullScanDeviceCount", (n) -> { this.setPendingFullScanDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("pendingManualStepsDeviceCount", (n) -> { this.setPendingManualStepsDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("pendingOfflineScanDeviceCount", (n) -> { this.setPendingOfflineScanDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("pendingQuickScanDeviceCount", (n) -> { this.setPendingQuickScanDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("pendingRestartDeviceCount", (n) -> { this.setPendingRestartDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("pendingSignatureUpdateDeviceCount", (n) -> { this.setPendingSignatureUpdateDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("totalReportedDeviceCount", (n) -> { this.setTotalReportedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("unknownStateThreatAgentDeviceCount", (n) -> { this.setUnknownStateThreatAgentDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inactiveThreatAgentDeviceCount property value. Indicates number of devices with inactive threat agent
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInactiveThreatAgentDeviceCount() {
        return this.backingStore.get("inactiveThreatAgentDeviceCount");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the pendingFullScanDeviceCount property value. Indicates number of devices pending full scan
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPendingFullScanDeviceCount() {
        return this.backingStore.get("pendingFullScanDeviceCount");
    }
    /**
     * Gets the pendingManualStepsDeviceCount property value. Indicates number of devices with pending manual steps
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPendingManualStepsDeviceCount() {
        return this.backingStore.get("pendingManualStepsDeviceCount");
    }
    /**
     * Gets the pendingOfflineScanDeviceCount property value. Indicates number of pending offline scan devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPendingOfflineScanDeviceCount() {
        return this.backingStore.get("pendingOfflineScanDeviceCount");
    }
    /**
     * Gets the pendingQuickScanDeviceCount property value. Indicates the number of devices that have a pending full scan. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPendingQuickScanDeviceCount() {
        return this.backingStore.get("pendingQuickScanDeviceCount");
    }
    /**
     * Gets the pendingRestartDeviceCount property value. Indicates number of devices pending restart
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPendingRestartDeviceCount() {
        return this.backingStore.get("pendingRestartDeviceCount");
    }
    /**
     * Gets the pendingSignatureUpdateDeviceCount property value. Indicates number of devices with an old signature
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPendingSignatureUpdateDeviceCount() {
        return this.backingStore.get("pendingSignatureUpdateDeviceCount");
    }
    /**
     * Gets the totalReportedDeviceCount property value. Total device count.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalReportedDeviceCount() {
        return this.backingStore.get("totalReportedDeviceCount");
    }
    /**
     * Gets the unknownStateThreatAgentDeviceCount property value. Indicates number of devices with threat agent state as unknown
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUnknownStateThreatAgentDeviceCount() {
        return this.backingStore.get("unknownStateThreatAgentDeviceCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("cleanDeviceCount", this.getCleanDeviceCount());
        writer.writeIntegerValue("criticalFailuresDeviceCount", this.getCriticalFailuresDeviceCount());
        writer.writeIntegerValue("inactiveThreatAgentDeviceCount", this.getInactiveThreatAgentDeviceCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("pendingFullScanDeviceCount", this.getPendingFullScanDeviceCount());
        writer.writeIntegerValue("pendingManualStepsDeviceCount", this.getPendingManualStepsDeviceCount());
        writer.writeIntegerValue("pendingOfflineScanDeviceCount", this.getPendingOfflineScanDeviceCount());
        writer.writeIntegerValue("pendingQuickScanDeviceCount", this.getPendingQuickScanDeviceCount());
        writer.writeIntegerValue("pendingRestartDeviceCount", this.getPendingRestartDeviceCount());
        writer.writeIntegerValue("pendingSignatureUpdateDeviceCount", this.getPendingSignatureUpdateDeviceCount());
        writer.writeIntegerValue("totalReportedDeviceCount", this.getTotalReportedDeviceCount());
        writer.writeIntegerValue("unknownStateThreatAgentDeviceCount", this.getUnknownStateThreatAgentDeviceCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the cleanDeviceCount property value. Indicates number of devices reporting as clean
     * @param value Value to set for the cleanDeviceCount property.
     */
    public void setCleanDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("cleanDeviceCount", value);
    }
    /**
     * Sets the criticalFailuresDeviceCount property value. Indicates number of devices with critical failures
     * @param value Value to set for the criticalFailuresDeviceCount property.
     */
    public void setCriticalFailuresDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("criticalFailuresDeviceCount", value);
    }
    /**
     * Sets the inactiveThreatAgentDeviceCount property value. Indicates number of devices with inactive threat agent
     * @param value Value to set for the inactiveThreatAgentDeviceCount property.
     */
    public void setInactiveThreatAgentDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("inactiveThreatAgentDeviceCount", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the pendingFullScanDeviceCount property value. Indicates number of devices pending full scan
     * @param value Value to set for the pendingFullScanDeviceCount property.
     */
    public void setPendingFullScanDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pendingFullScanDeviceCount", value);
    }
    /**
     * Sets the pendingManualStepsDeviceCount property value. Indicates number of devices with pending manual steps
     * @param value Value to set for the pendingManualStepsDeviceCount property.
     */
    public void setPendingManualStepsDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pendingManualStepsDeviceCount", value);
    }
    /**
     * Sets the pendingOfflineScanDeviceCount property value. Indicates number of pending offline scan devices
     * @param value Value to set for the pendingOfflineScanDeviceCount property.
     */
    public void setPendingOfflineScanDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pendingOfflineScanDeviceCount", value);
    }
    /**
     * Sets the pendingQuickScanDeviceCount property value. Indicates the number of devices that have a pending full scan. Valid values -2147483648 to 2147483647
     * @param value Value to set for the pendingQuickScanDeviceCount property.
     */
    public void setPendingQuickScanDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pendingQuickScanDeviceCount", value);
    }
    /**
     * Sets the pendingRestartDeviceCount property value. Indicates number of devices pending restart
     * @param value Value to set for the pendingRestartDeviceCount property.
     */
    public void setPendingRestartDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pendingRestartDeviceCount", value);
    }
    /**
     * Sets the pendingSignatureUpdateDeviceCount property value. Indicates number of devices with an old signature
     * @param value Value to set for the pendingSignatureUpdateDeviceCount property.
     */
    public void setPendingSignatureUpdateDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pendingSignatureUpdateDeviceCount", value);
    }
    /**
     * Sets the totalReportedDeviceCount property value. Total device count.
     * @param value Value to set for the totalReportedDeviceCount property.
     */
    public void setTotalReportedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalReportedDeviceCount", value);
    }
    /**
     * Sets the unknownStateThreatAgentDeviceCount property value. Indicates number of devices with threat agent state as unknown
     * @param value Value to set for the unknownStateThreatAgentDeviceCount property.
     */
    public void setUnknownStateThreatAgentDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("unknownStateThreatAgentDeviceCount", value);
    }
}
