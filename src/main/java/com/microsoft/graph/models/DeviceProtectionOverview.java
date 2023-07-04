package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Hardware information of a given device.
 */
public class DeviceProtectionOverview implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Clean device count.
     */
    private Integer cleanDeviceCount;
    /**
     * Critical failures device count.
     */
    private Integer criticalFailuresDeviceCount;
    /**
     * Device with inactive threat agent count
     */
    private Integer inactiveThreatAgentDeviceCount;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Pending full scan device count.
     */
    private Integer pendingFullScanDeviceCount;
    /**
     * Pending manual steps device count.
     */
    private Integer pendingManualStepsDeviceCount;
    /**
     * Pending offline scan device count.
     */
    private Integer pendingOfflineScanDeviceCount;
    /**
     * Pending quick scan device count. Valid values -2147483648 to 2147483647
     */
    private Integer pendingQuickScanDeviceCount;
    /**
     * Pending restart device count.
     */
    private Integer pendingRestartDeviceCount;
    /**
     * Device with old signature count.
     */
    private Integer pendingSignatureUpdateDeviceCount;
    /**
     * Total device count.
     */
    private Integer totalReportedDeviceCount;
    /**
     * Device with threat agent state as unknown count.
     */
    private Integer unknownStateThreatAgentDeviceCount;
    /**
     * Instantiates a new deviceProtectionOverview and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceProtectionOverview() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceProtectionOverview
     */
    @javax.annotation.Nonnull
    public static DeviceProtectionOverview createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceProtectionOverview();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the cleanDeviceCount property value. Clean device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCleanDeviceCount() {
        return this.cleanDeviceCount;
    }
    /**
     * Gets the criticalFailuresDeviceCount property value. Critical failures device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCriticalFailuresDeviceCount() {
        return this.criticalFailuresDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * Gets the inactiveThreatAgentDeviceCount property value. Device with inactive threat agent count
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInactiveThreatAgentDeviceCount() {
        return this.inactiveThreatAgentDeviceCount;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the pendingFullScanDeviceCount property value. Pending full scan device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPendingFullScanDeviceCount() {
        return this.pendingFullScanDeviceCount;
    }
    /**
     * Gets the pendingManualStepsDeviceCount property value. Pending manual steps device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPendingManualStepsDeviceCount() {
        return this.pendingManualStepsDeviceCount;
    }
    /**
     * Gets the pendingOfflineScanDeviceCount property value. Pending offline scan device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPendingOfflineScanDeviceCount() {
        return this.pendingOfflineScanDeviceCount;
    }
    /**
     * Gets the pendingQuickScanDeviceCount property value. Pending quick scan device count. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPendingQuickScanDeviceCount() {
        return this.pendingQuickScanDeviceCount;
    }
    /**
     * Gets the pendingRestartDeviceCount property value. Pending restart device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPendingRestartDeviceCount() {
        return this.pendingRestartDeviceCount;
    }
    /**
     * Gets the pendingSignatureUpdateDeviceCount property value. Device with old signature count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPendingSignatureUpdateDeviceCount() {
        return this.pendingSignatureUpdateDeviceCount;
    }
    /**
     * Gets the totalReportedDeviceCount property value. Total device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalReportedDeviceCount() {
        return this.totalReportedDeviceCount;
    }
    /**
     * Gets the unknownStateThreatAgentDeviceCount property value. Device with threat agent state as unknown count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnknownStateThreatAgentDeviceCount() {
        return this.unknownStateThreatAgentDeviceCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the cleanDeviceCount property value. Clean device count.
     * @param value Value to set for the cleanDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCleanDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.cleanDeviceCount = value;
    }
    /**
     * Sets the criticalFailuresDeviceCount property value. Critical failures device count.
     * @param value Value to set for the criticalFailuresDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCriticalFailuresDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.criticalFailuresDeviceCount = value;
    }
    /**
     * Sets the inactiveThreatAgentDeviceCount property value. Device with inactive threat agent count
     * @param value Value to set for the inactiveThreatAgentDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInactiveThreatAgentDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.inactiveThreatAgentDeviceCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the pendingFullScanDeviceCount property value. Pending full scan device count.
     * @param value Value to set for the pendingFullScanDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPendingFullScanDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.pendingFullScanDeviceCount = value;
    }
    /**
     * Sets the pendingManualStepsDeviceCount property value. Pending manual steps device count.
     * @param value Value to set for the pendingManualStepsDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPendingManualStepsDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.pendingManualStepsDeviceCount = value;
    }
    /**
     * Sets the pendingOfflineScanDeviceCount property value. Pending offline scan device count.
     * @param value Value to set for the pendingOfflineScanDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPendingOfflineScanDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.pendingOfflineScanDeviceCount = value;
    }
    /**
     * Sets the pendingQuickScanDeviceCount property value. Pending quick scan device count. Valid values -2147483648 to 2147483647
     * @param value Value to set for the pendingQuickScanDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPendingQuickScanDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.pendingQuickScanDeviceCount = value;
    }
    /**
     * Sets the pendingRestartDeviceCount property value. Pending restart device count.
     * @param value Value to set for the pendingRestartDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPendingRestartDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.pendingRestartDeviceCount = value;
    }
    /**
     * Sets the pendingSignatureUpdateDeviceCount property value. Device with old signature count.
     * @param value Value to set for the pendingSignatureUpdateDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPendingSignatureUpdateDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.pendingSignatureUpdateDeviceCount = value;
    }
    /**
     * Sets the totalReportedDeviceCount property value. Total device count.
     * @param value Value to set for the totalReportedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalReportedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.totalReportedDeviceCount = value;
    }
    /**
     * Sets the unknownStateThreatAgentDeviceCount property value. Device with threat agent state as unknown count.
     * @param value Value to set for the unknownStateThreatAgentDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnknownStateThreatAgentDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.unknownStateThreatAgentDeviceCount = value;
    }
}
