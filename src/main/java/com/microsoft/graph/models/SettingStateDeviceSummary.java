package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Device Compilance Policy and Configuration for a Setting State summary */
public class SettingStateDeviceSummary extends Entity implements Parsable {
    /** Device Compliant count for the setting */
    private Integer _compliantDeviceCount;
    /** Device conflict error count for the setting */
    private Integer _conflictDeviceCount;
    /** Device error count for the setting */
    private Integer _errorDeviceCount;
    /** Name of the InstancePath for the setting */
    private String _instancePath;
    /** Device NonCompliant count for the setting */
    private Integer _nonCompliantDeviceCount;
    /** Device Not Applicable count for the setting */
    private Integer _notApplicableDeviceCount;
    /** Device Compliant count for the setting */
    private Integer _remediatedDeviceCount;
    /** Name of the setting */
    private String _settingName;
    /** Device Unkown count for the setting */
    private Integer _unknownDeviceCount;
    /**
     * Instantiates a new settingStateDeviceSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SettingStateDeviceSummary() {
        super();
        this.setOdataType("#microsoft.graph.settingStateDeviceSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a settingStateDeviceSummary
     */
    @javax.annotation.Nonnull
    public static SettingStateDeviceSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SettingStateDeviceSummary();
    }
    /**
     * Gets the compliantDeviceCount property value. Device Compliant count for the setting
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCompliantDeviceCount() {
        return this._compliantDeviceCount;
    }
    /**
     * Gets the conflictDeviceCount property value. Device conflict error count for the setting
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConflictDeviceCount() {
        return this._conflictDeviceCount;
    }
    /**
     * Gets the errorDeviceCount property value. Device error count for the setting
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorDeviceCount() {
        return this._errorDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SettingStateDeviceSummary currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("compliantDeviceCount", (n) -> { currentObject.setCompliantDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("conflictDeviceCount", (n) -> { currentObject.setConflictDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("errorDeviceCount", (n) -> { currentObject.setErrorDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("instancePath", (n) -> { currentObject.setInstancePath(n.getStringValue()); });
        deserializerMap.put("nonCompliantDeviceCount", (n) -> { currentObject.setNonCompliantDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("notApplicableDeviceCount", (n) -> { currentObject.setNotApplicableDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("remediatedDeviceCount", (n) -> { currentObject.setRemediatedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("settingName", (n) -> { currentObject.setSettingName(n.getStringValue()); });
        deserializerMap.put("unknownDeviceCount", (n) -> { currentObject.setUnknownDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the instancePath property value. Name of the InstancePath for the setting
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInstancePath() {
        return this._instancePath;
    }
    /**
     * Gets the nonCompliantDeviceCount property value. Device NonCompliant count for the setting
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNonCompliantDeviceCount() {
        return this._nonCompliantDeviceCount;
    }
    /**
     * Gets the notApplicableDeviceCount property value. Device Not Applicable count for the setting
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotApplicableDeviceCount() {
        return this._notApplicableDeviceCount;
    }
    /**
     * Gets the remediatedDeviceCount property value. Device Compliant count for the setting
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemediatedDeviceCount() {
        return this._remediatedDeviceCount;
    }
    /**
     * Gets the settingName property value. Name of the setting
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingName() {
        return this._settingName;
    }
    /**
     * Gets the unknownDeviceCount property value. Device Unkown count for the setting
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnknownDeviceCount() {
        return this._unknownDeviceCount;
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
    @javax.annotation.Nonnull
    public void setCompliantDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._compliantDeviceCount = value;
    }
    /**
     * Sets the conflictDeviceCount property value. Device conflict error count for the setting
     * @param value Value to set for the conflictDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConflictDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._conflictDeviceCount = value;
    }
    /**
     * Sets the errorDeviceCount property value. Device error count for the setting
     * @param value Value to set for the errorDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._errorDeviceCount = value;
    }
    /**
     * Sets the instancePath property value. Name of the InstancePath for the setting
     * @param value Value to set for the instancePath property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstancePath(@javax.annotation.Nullable final String value) {
        this._instancePath = value;
    }
    /**
     * Sets the nonCompliantDeviceCount property value. Device NonCompliant count for the setting
     * @param value Value to set for the nonCompliantDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNonCompliantDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._nonCompliantDeviceCount = value;
    }
    /**
     * Sets the notApplicableDeviceCount property value. Device Not Applicable count for the setting
     * @param value Value to set for the notApplicableDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotApplicableDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._notApplicableDeviceCount = value;
    }
    /**
     * Sets the remediatedDeviceCount property value. Device Compliant count for the setting
     * @param value Value to set for the remediatedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemediatedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._remediatedDeviceCount = value;
    }
    /**
     * Sets the settingName property value. Name of the setting
     * @param value Value to set for the settingName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingName(@javax.annotation.Nullable final String value) {
        this._settingName = value;
    }
    /**
     * Sets the unknownDeviceCount property value. Device Unkown count for the setting
     * @param value Value to set for the unknownDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnknownDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._unknownDeviceCount = value;
    }
}
