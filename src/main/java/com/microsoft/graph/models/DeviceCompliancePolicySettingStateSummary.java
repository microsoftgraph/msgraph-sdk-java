package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Compilance Policy Setting State summary across the account.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceCompliancePolicySettingStateSummary extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceCompliancePolicySettingStateSummary and sets the default values.
     */
    public DeviceCompliancePolicySettingStateSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceCompliancePolicySettingStateSummary
     */
    @jakarta.annotation.Nonnull
    public static DeviceCompliancePolicySettingStateSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceCompliancePolicySettingStateSummary();
    }
    /**
     * Gets the compliantDeviceCount property value. Number of compliant devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCompliantDeviceCount() {
        return this.getBackingStore().get("compliantDeviceCount");
    }
    /**
     * Gets the conflictDeviceCount property value. Number of conflict devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConflictDeviceCount() {
        return this.getBackingStore().get("conflictDeviceCount");
    }
    /**
     * Gets the deviceComplianceSettingStates property value. Not yet documented
     * @return a java.util.List<DeviceComplianceSettingState>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceComplianceSettingState> getDeviceComplianceSettingStates() {
        return this.getBackingStore().get("deviceComplianceSettingStates");
    }
    /**
     * Gets the errorDeviceCount property value. Number of error devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorDeviceCount() {
        return this.getBackingStore().get("errorDeviceCount");
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
        deserializerMap.put("deviceComplianceSettingStates", (n) -> { this.setDeviceComplianceSettingStates(n.getCollectionOfObjectValues(DeviceComplianceSettingState::createFromDiscriminatorValue)); });
        deserializerMap.put("errorDeviceCount", (n) -> { this.setErrorDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("nonCompliantDeviceCount", (n) -> { this.setNonCompliantDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("notApplicableDeviceCount", (n) -> { this.setNotApplicableDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("platformType", (n) -> { this.setPlatformType(n.getEnumValue(PolicyPlatformType.class)); });
        deserializerMap.put("remediatedDeviceCount", (n) -> { this.setRemediatedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("setting", (n) -> { this.setSetting(n.getStringValue()); });
        deserializerMap.put("settingName", (n) -> { this.setSettingName(n.getStringValue()); });
        deserializerMap.put("unknownDeviceCount", (n) -> { this.setUnknownDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nonCompliantDeviceCount property value. Number of NonCompliant devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNonCompliantDeviceCount() {
        return this.getBackingStore().get("nonCompliantDeviceCount");
    }
    /**
     * Gets the notApplicableDeviceCount property value. Number of not applicable devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableDeviceCount() {
        return this.getBackingStore().get("notApplicableDeviceCount");
    }
    /**
     * Gets the platformType property value. Supported platform types for policies.
     * @return a PolicyPlatformType
     */
    @jakarta.annotation.Nullable
    public PolicyPlatformType getPlatformType() {
        return this.getBackingStore().get("platformType");
    }
    /**
     * Gets the remediatedDeviceCount property value. Number of remediated devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRemediatedDeviceCount() {
        return this.getBackingStore().get("remediatedDeviceCount");
    }
    /**
     * Gets the setting property value. The setting class name and property name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSetting() {
        return this.getBackingStore().get("setting");
    }
    /**
     * Gets the settingName property value. Name of the setting.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSettingName() {
        return this.getBackingStore().get("settingName");
    }
    /**
     * Gets the unknownDeviceCount property value. Number of unknown devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUnknownDeviceCount() {
        return this.getBackingStore().get("unknownDeviceCount");
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
        writer.writeCollectionOfObjectValues("deviceComplianceSettingStates", this.getDeviceComplianceSettingStates());
        writer.writeIntegerValue("errorDeviceCount", this.getErrorDeviceCount());
        writer.writeIntegerValue("nonCompliantDeviceCount", this.getNonCompliantDeviceCount());
        writer.writeIntegerValue("notApplicableDeviceCount", this.getNotApplicableDeviceCount());
        writer.writeEnumValue("platformType", this.getPlatformType());
        writer.writeIntegerValue("remediatedDeviceCount", this.getRemediatedDeviceCount());
        writer.writeStringValue("setting", this.getSetting());
        writer.writeStringValue("settingName", this.getSettingName());
        writer.writeIntegerValue("unknownDeviceCount", this.getUnknownDeviceCount());
    }
    /**
     * Sets the compliantDeviceCount property value. Number of compliant devices
     * @param value Value to set for the compliantDeviceCount property.
     */
    public void setCompliantDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("compliantDeviceCount", value);
    }
    /**
     * Sets the conflictDeviceCount property value. Number of conflict devices
     * @param value Value to set for the conflictDeviceCount property.
     */
    public void setConflictDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("conflictDeviceCount", value);
    }
    /**
     * Sets the deviceComplianceSettingStates property value. Not yet documented
     * @param value Value to set for the deviceComplianceSettingStates property.
     */
    public void setDeviceComplianceSettingStates(@jakarta.annotation.Nullable final java.util.List<DeviceComplianceSettingState> value) {
        this.getBackingStore().set("deviceComplianceSettingStates", value);
    }
    /**
     * Sets the errorDeviceCount property value. Number of error devices
     * @param value Value to set for the errorDeviceCount property.
     */
    public void setErrorDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("errorDeviceCount", value);
    }
    /**
     * Sets the nonCompliantDeviceCount property value. Number of NonCompliant devices
     * @param value Value to set for the nonCompliantDeviceCount property.
     */
    public void setNonCompliantDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("nonCompliantDeviceCount", value);
    }
    /**
     * Sets the notApplicableDeviceCount property value. Number of not applicable devices
     * @param value Value to set for the notApplicableDeviceCount property.
     */
    public void setNotApplicableDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("notApplicableDeviceCount", value);
    }
    /**
     * Sets the platformType property value. Supported platform types for policies.
     * @param value Value to set for the platformType property.
     */
    public void setPlatformType(@jakarta.annotation.Nullable final PolicyPlatformType value) {
        this.getBackingStore().set("platformType", value);
    }
    /**
     * Sets the remediatedDeviceCount property value. Number of remediated devices
     * @param value Value to set for the remediatedDeviceCount property.
     */
    public void setRemediatedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("remediatedDeviceCount", value);
    }
    /**
     * Sets the setting property value. The setting class name and property name.
     * @param value Value to set for the setting property.
     */
    public void setSetting(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("setting", value);
    }
    /**
     * Sets the settingName property value. Name of the setting.
     * @param value Value to set for the settingName property.
     */
    public void setSettingName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("settingName", value);
    }
    /**
     * Sets the unknownDeviceCount property value. Number of unknown devices
     * @param value Value to set for the unknownDeviceCount property.
     */
    public void setUnknownDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("unknownDeviceCount", value);
    }
}
