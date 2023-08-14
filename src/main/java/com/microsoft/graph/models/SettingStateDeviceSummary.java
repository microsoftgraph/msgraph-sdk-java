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
public class SettingStateDeviceSummary extends Entity implements Parsable {
    /**
     * Device Compliant count for the setting
     */
    private Integer compliantDeviceCount;
    /**
     * Device conflict error count for the setting
     */
    private Integer conflictDeviceCount;
    /**
     * Device error count for the setting
     */
    private Integer errorDeviceCount;
    /**
     * Name of the InstancePath for the setting
     */
    private String instancePath;
    /**
     * Device NonCompliant count for the setting
     */
    private Integer nonCompliantDeviceCount;
    /**
     * Device Not Applicable count for the setting
     */
    private Integer notApplicableDeviceCount;
    /**
     * Device Compliant count for the setting
     */
    private Integer remediatedDeviceCount;
    /**
     * Name of the setting
     */
    private String settingName;
    /**
     * Device Unkown count for the setting
     */
    private Integer unknownDeviceCount;
    /**
     * Instantiates a new settingStateDeviceSummary and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public SettingStateDeviceSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a settingStateDeviceSummary
     */
    @jakarta.annotation.Nonnull
    public static SettingStateDeviceSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SettingStateDeviceSummary();
    }
    /**
     * Gets the compliantDeviceCount property value. Device Compliant count for the setting
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getCompliantDeviceCount() {
        return this.compliantDeviceCount;
    }
    /**
     * Gets the conflictDeviceCount property value. Device conflict error count for the setting
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getConflictDeviceCount() {
        return this.conflictDeviceCount;
    }
    /**
     * Gets the errorDeviceCount property value. Device error count for the setting
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorDeviceCount() {
        return this.errorDeviceCount;
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
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getInstancePath() {
        return this.instancePath;
    }
    /**
     * Gets the nonCompliantDeviceCount property value. Device NonCompliant count for the setting
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNonCompliantDeviceCount() {
        return this.nonCompliantDeviceCount;
    }
    /**
     * Gets the notApplicableDeviceCount property value. Device Not Applicable count for the setting
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableDeviceCount() {
        return this.notApplicableDeviceCount;
    }
    /**
     * Gets the remediatedDeviceCount property value. Device Compliant count for the setting
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getRemediatedDeviceCount() {
        return this.remediatedDeviceCount;
    }
    /**
     * Gets the settingName property value. Name of the setting
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSettingName() {
        return this.settingName;
    }
    /**
     * Gets the unknownDeviceCount property value. Device Unkown count for the setting
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getUnknownDeviceCount() {
        return this.unknownDeviceCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCompliantDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.compliantDeviceCount = value;
    }
    /**
     * Sets the conflictDeviceCount property value. Device conflict error count for the setting
     * @param value Value to set for the conflictDeviceCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setConflictDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.conflictDeviceCount = value;
    }
    /**
     * Sets the errorDeviceCount property value. Device error count for the setting
     * @param value Value to set for the errorDeviceCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setErrorDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.errorDeviceCount = value;
    }
    /**
     * Sets the instancePath property value. Name of the InstancePath for the setting
     * @param value Value to set for the instancePath property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInstancePath(@jakarta.annotation.Nullable final String value) {
        this.instancePath = value;
    }
    /**
     * Sets the nonCompliantDeviceCount property value. Device NonCompliant count for the setting
     * @param value Value to set for the nonCompliantDeviceCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNonCompliantDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.nonCompliantDeviceCount = value;
    }
    /**
     * Sets the notApplicableDeviceCount property value. Device Not Applicable count for the setting
     * @param value Value to set for the notApplicableDeviceCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNotApplicableDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.notApplicableDeviceCount = value;
    }
    /**
     * Sets the remediatedDeviceCount property value. Device Compliant count for the setting
     * @param value Value to set for the remediatedDeviceCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRemediatedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.remediatedDeviceCount = value;
    }
    /**
     * Sets the settingName property value. Name of the setting
     * @param value Value to set for the settingName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSettingName(@jakarta.annotation.Nullable final String value) {
        this.settingName = value;
    }
    /**
     * Sets the unknownDeviceCount property value. Device Unkown count for the setting
     * @param value Value to set for the unknownDeviceCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUnknownDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.unknownDeviceCount = value;
    }
}
