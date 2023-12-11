package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Compilance Policy and Configuration for a Setting State summary
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SettingStateDeviceSummary extends Entity implements Parsable {
    /**
     * Instantiates a new SettingStateDeviceSummary and sets the default values.
     */
    public SettingStateDeviceSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SettingStateDeviceSummary
     */
    @jakarta.annotation.Nonnull
    public static SettingStateDeviceSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SettingStateDeviceSummary();
    }
    /**
     * Gets the compliantDeviceCount property value. Device Compliant count for the setting
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCompliantDeviceCount() {
        return this.backingStore.get("compliantDeviceCount");
    }
    /**
     * Gets the conflictDeviceCount property value. Device conflict error count for the setting
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConflictDeviceCount() {
        return this.backingStore.get("conflictDeviceCount");
    }
    /**
     * Gets the errorDeviceCount property value. Device error count for the setting
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
        deserializerMap.put("conflictDeviceCount", (n) -> { this.setConflictDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("errorDeviceCount", (n) -> { this.setErrorDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("instancePath", (n) -> { this.setInstancePath(n.getStringValue()); });
        deserializerMap.put("nonCompliantDeviceCount", (n) -> { this.setNonCompliantDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("notApplicableDeviceCount", (n) -> { this.setNotApplicableDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("remediatedDeviceCount", (n) -> { this.setRemediatedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("settingName", (n) -> { this.setSettingName(n.getStringValue()); });
        deserializerMap.put("unknownDeviceCount", (n) -> { this.setUnknownDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the instancePath property value. Name of the InstancePath for the setting
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInstancePath() {
        return this.backingStore.get("instancePath");
    }
    /**
     * Gets the nonCompliantDeviceCount property value. Device NonCompliant count for the setting
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNonCompliantDeviceCount() {
        return this.backingStore.get("nonCompliantDeviceCount");
    }
    /**
     * Gets the notApplicableDeviceCount property value. Device Not Applicable count for the setting
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableDeviceCount() {
        return this.backingStore.get("notApplicableDeviceCount");
    }
    /**
     * Gets the remediatedDeviceCount property value. Device Compliant count for the setting
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRemediatedDeviceCount() {
        return this.backingStore.get("remediatedDeviceCount");
    }
    /**
     * Gets the settingName property value. Name of the setting
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSettingName() {
        return this.backingStore.get("settingName");
    }
    /**
     * Gets the unknownDeviceCount property value. Device Unkown count for the setting
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
        writer.writeIntegerValue("conflictDeviceCount", this.getConflictDeviceCount());
        writer.writeIntegerValue("errorDeviceCount", this.getErrorDeviceCount());
        writer.writeStringValue("instancePath", this.getInstancePath());
        writer.writeIntegerValue("nonCompliantDeviceCount", this.getNonCompliantDeviceCount());
        writer.writeIntegerValue("notApplicableDeviceCount", this.getNotApplicableDeviceCount());
        writer.writeIntegerValue("remediatedDeviceCount", this.getRemediatedDeviceCount());
        writer.writeStringValue("settingName", this.getSettingName());
        writer.writeIntegerValue("unknownDeviceCount", this.getUnknownDeviceCount());
    }
    /**
     * Sets the compliantDeviceCount property value. Device Compliant count for the setting
     * @param value Value to set for the compliantDeviceCount property.
     */
    public void setCompliantDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("compliantDeviceCount", value);
    }
    /**
     * Sets the conflictDeviceCount property value. Device conflict error count for the setting
     * @param value Value to set for the conflictDeviceCount property.
     */
    public void setConflictDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("conflictDeviceCount", value);
    }
    /**
     * Sets the errorDeviceCount property value. Device error count for the setting
     * @param value Value to set for the errorDeviceCount property.
     */
    public void setErrorDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("errorDeviceCount", value);
    }
    /**
     * Sets the instancePath property value. Name of the InstancePath for the setting
     * @param value Value to set for the instancePath property.
     */
    public void setInstancePath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("instancePath", value);
    }
    /**
     * Sets the nonCompliantDeviceCount property value. Device NonCompliant count for the setting
     * @param value Value to set for the nonCompliantDeviceCount property.
     */
    public void setNonCompliantDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("nonCompliantDeviceCount", value);
    }
    /**
     * Sets the notApplicableDeviceCount property value. Device Not Applicable count for the setting
     * @param value Value to set for the notApplicableDeviceCount property.
     */
    public void setNotApplicableDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("notApplicableDeviceCount", value);
    }
    /**
     * Sets the remediatedDeviceCount property value. Device Compliant count for the setting
     * @param value Value to set for the remediatedDeviceCount property.
     */
    public void setRemediatedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("remediatedDeviceCount", value);
    }
    /**
     * Sets the settingName property value. Name of the setting
     * @param value Value to set for the settingName property.
     */
    public void setSettingName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingName", value);
    }
    /**
     * Sets the unknownDeviceCount property value. Device Unkown count for the setting
     * @param value Value to set for the unknownDeviceCount property.
     */
    public void setUnknownDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("unknownDeviceCount", value);
    }
}
