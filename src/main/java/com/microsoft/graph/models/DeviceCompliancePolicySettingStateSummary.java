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
public class DeviceCompliancePolicySettingStateSummary extends Entity implements Parsable {
    /** Number of compliant devices */
    private Integer compliantDeviceCount;
    /** Number of conflict devices */
    private Integer conflictDeviceCount;
    /** Not yet documented */
    private java.util.List<DeviceComplianceSettingState> deviceComplianceSettingStates;
    /** Number of error devices */
    private Integer errorDeviceCount;
    /** Number of NonCompliant devices */
    private Integer nonCompliantDeviceCount;
    /** Number of not applicable devices */
    private Integer notApplicableDeviceCount;
    /** Supported platform types for policies. */
    private PolicyPlatformType platformType;
    /** Number of remediated devices */
    private Integer remediatedDeviceCount;
    /** The setting class name and property name. */
    private String setting;
    /** Name of the setting. */
    private String settingName;
    /** Number of unknown devices */
    private Integer unknownDeviceCount;
    /**
     * Instantiates a new deviceCompliancePolicySettingStateSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceCompliancePolicySettingStateSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceCompliancePolicySettingStateSummary
     */
    @javax.annotation.Nonnull
    public static DeviceCompliancePolicySettingStateSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceCompliancePolicySettingStateSummary();
    }
    /**
     * Gets the compliantDeviceCount property value. Number of compliant devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCompliantDeviceCount() {
        return this.compliantDeviceCount;
    }
    /**
     * Gets the conflictDeviceCount property value. Number of conflict devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConflictDeviceCount() {
        return this.conflictDeviceCount;
    }
    /**
     * Gets the deviceComplianceSettingStates property value. Not yet documented
     * @return a deviceComplianceSettingState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceComplianceSettingState> getDeviceComplianceSettingStates() {
        return this.deviceComplianceSettingStates;
    }
    /**
     * Gets the errorDeviceCount property value. Number of error devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorDeviceCount() {
        return this.errorDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNonCompliantDeviceCount() {
        return this.nonCompliantDeviceCount;
    }
    /**
     * Gets the notApplicableDeviceCount property value. Number of not applicable devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotApplicableDeviceCount() {
        return this.notApplicableDeviceCount;
    }
    /**
     * Gets the platformType property value. Supported platform types for policies.
     * @return a policyPlatformType
     */
    @javax.annotation.Nullable
    public PolicyPlatformType getPlatformType() {
        return this.platformType;
    }
    /**
     * Gets the remediatedDeviceCount property value. Number of remediated devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemediatedDeviceCount() {
        return this.remediatedDeviceCount;
    }
    /**
     * Gets the setting property value. The setting class name and property name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSetting() {
        return this.setting;
    }
    /**
     * Gets the settingName property value. Name of the setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingName() {
        return this.settingName;
    }
    /**
     * Gets the unknownDeviceCount property value. Number of unknown devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnknownDeviceCount() {
        return this.unknownDeviceCount;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompliantDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.compliantDeviceCount = value;
    }
    /**
     * Sets the conflictDeviceCount property value. Number of conflict devices
     * @param value Value to set for the conflictDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConflictDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.conflictDeviceCount = value;
    }
    /**
     * Sets the deviceComplianceSettingStates property value. Not yet documented
     * @param value Value to set for the deviceComplianceSettingStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceComplianceSettingStates(@javax.annotation.Nullable final java.util.List<DeviceComplianceSettingState> value) {
        this.deviceComplianceSettingStates = value;
    }
    /**
     * Sets the errorDeviceCount property value. Number of error devices
     * @param value Value to set for the errorDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.errorDeviceCount = value;
    }
    /**
     * Sets the nonCompliantDeviceCount property value. Number of NonCompliant devices
     * @param value Value to set for the nonCompliantDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNonCompliantDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.nonCompliantDeviceCount = value;
    }
    /**
     * Sets the notApplicableDeviceCount property value. Number of not applicable devices
     * @param value Value to set for the notApplicableDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotApplicableDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.notApplicableDeviceCount = value;
    }
    /**
     * Sets the platformType property value. Supported platform types for policies.
     * @param value Value to set for the platformType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatformType(@javax.annotation.Nullable final PolicyPlatformType value) {
        this.platformType = value;
    }
    /**
     * Sets the remediatedDeviceCount property value. Number of remediated devices
     * @param value Value to set for the remediatedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemediatedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.remediatedDeviceCount = value;
    }
    /**
     * Sets the setting property value. The setting class name and property name.
     * @param value Value to set for the setting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSetting(@javax.annotation.Nullable final String value) {
        this.setting = value;
    }
    /**
     * Sets the settingName property value. Name of the setting.
     * @param value Value to set for the settingName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingName(@javax.annotation.Nullable final String value) {
        this.settingName = value;
    }
    /**
     * Sets the unknownDeviceCount property value. Number of unknown devices
     * @param value Value to set for the unknownDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnknownDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.unknownDeviceCount = value;
    }
}
