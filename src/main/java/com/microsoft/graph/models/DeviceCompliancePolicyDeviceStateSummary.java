package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceCompliancePolicyDeviceStateSummary extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceCompliancePolicyDeviceStateSummary and sets the default values.
     */
    public DeviceCompliancePolicyDeviceStateSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceCompliancePolicyDeviceStateSummary
     */
    @jakarta.annotation.Nonnull
    public static DeviceCompliancePolicyDeviceStateSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceCompliancePolicyDeviceStateSummary();
    }
    /**
     * Gets the compliantDeviceCount property value. Number of compliant devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCompliantDeviceCount() {
        return this.backingStore.get("compliantDeviceCount");
    }
    /**
     * Gets the configManagerCount property value. Number of devices that have compliance managed by System Center Configuration Manager
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConfigManagerCount() {
        return this.backingStore.get("configManagerCount");
    }
    /**
     * Gets the conflictDeviceCount property value. Number of conflict devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConflictDeviceCount() {
        return this.backingStore.get("conflictDeviceCount");
    }
    /**
     * Gets the errorDeviceCount property value. Number of error devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorDeviceCount() {
        return this.backingStore.get("errorDeviceCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("compliantDeviceCount", (n) -> { this.setCompliantDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("configManagerCount", (n) -> { this.setConfigManagerCount(n.getIntegerValue()); });
        deserializerMap.put("conflictDeviceCount", (n) -> { this.setConflictDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("errorDeviceCount", (n) -> { this.setErrorDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("inGracePeriodCount", (n) -> { this.setInGracePeriodCount(n.getIntegerValue()); });
        deserializerMap.put("nonCompliantDeviceCount", (n) -> { this.setNonCompliantDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("notApplicableDeviceCount", (n) -> { this.setNotApplicableDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("remediatedDeviceCount", (n) -> { this.setRemediatedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("unknownDeviceCount", (n) -> { this.setUnknownDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inGracePeriodCount property value. Number of devices that are in grace period
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInGracePeriodCount() {
        return this.backingStore.get("inGracePeriodCount");
    }
    /**
     * Gets the nonCompliantDeviceCount property value. Number of NonCompliant devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNonCompliantDeviceCount() {
        return this.backingStore.get("nonCompliantDeviceCount");
    }
    /**
     * Gets the notApplicableDeviceCount property value. Number of not applicable devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableDeviceCount() {
        return this.backingStore.get("notApplicableDeviceCount");
    }
    /**
     * Gets the remediatedDeviceCount property value. Number of remediated devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRemediatedDeviceCount() {
        return this.backingStore.get("remediatedDeviceCount");
    }
    /**
     * Gets the unknownDeviceCount property value. Number of unknown devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUnknownDeviceCount() {
        return this.backingStore.get("unknownDeviceCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("compliantDeviceCount", this.getCompliantDeviceCount());
        writer.writeIntegerValue("configManagerCount", this.getConfigManagerCount());
        writer.writeIntegerValue("conflictDeviceCount", this.getConflictDeviceCount());
        writer.writeIntegerValue("errorDeviceCount", this.getErrorDeviceCount());
        writer.writeIntegerValue("inGracePeriodCount", this.getInGracePeriodCount());
        writer.writeIntegerValue("nonCompliantDeviceCount", this.getNonCompliantDeviceCount());
        writer.writeIntegerValue("notApplicableDeviceCount", this.getNotApplicableDeviceCount());
        writer.writeIntegerValue("remediatedDeviceCount", this.getRemediatedDeviceCount());
        writer.writeIntegerValue("unknownDeviceCount", this.getUnknownDeviceCount());
    }
    /**
     * Sets the compliantDeviceCount property value. Number of compliant devices
     * @param value Value to set for the compliantDeviceCount property.
     */
    public void setCompliantDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("compliantDeviceCount", value);
    }
    /**
     * Sets the configManagerCount property value. Number of devices that have compliance managed by System Center Configuration Manager
     * @param value Value to set for the configManagerCount property.
     */
    public void setConfigManagerCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("configManagerCount", value);
    }
    /**
     * Sets the conflictDeviceCount property value. Number of conflict devices
     * @param value Value to set for the conflictDeviceCount property.
     */
    public void setConflictDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("conflictDeviceCount", value);
    }
    /**
     * Sets the errorDeviceCount property value. Number of error devices
     * @param value Value to set for the errorDeviceCount property.
     */
    public void setErrorDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("errorDeviceCount", value);
    }
    /**
     * Sets the inGracePeriodCount property value. Number of devices that are in grace period
     * @param value Value to set for the inGracePeriodCount property.
     */
    public void setInGracePeriodCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("inGracePeriodCount", value);
    }
    /**
     * Sets the nonCompliantDeviceCount property value. Number of NonCompliant devices
     * @param value Value to set for the nonCompliantDeviceCount property.
     */
    public void setNonCompliantDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("nonCompliantDeviceCount", value);
    }
    /**
     * Sets the notApplicableDeviceCount property value. Number of not applicable devices
     * @param value Value to set for the notApplicableDeviceCount property.
     */
    public void setNotApplicableDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("notApplicableDeviceCount", value);
    }
    /**
     * Sets the remediatedDeviceCount property value. Number of remediated devices
     * @param value Value to set for the remediatedDeviceCount property.
     */
    public void setRemediatedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("remediatedDeviceCount", value);
    }
    /**
     * Sets the unknownDeviceCount property value. Number of unknown devices
     * @param value Value to set for the unknownDeviceCount property.
     */
    public void setUnknownDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("unknownDeviceCount", value);
    }
}
