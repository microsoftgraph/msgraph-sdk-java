package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceConfigurationDeviceStateSummary extends Entity implements Parsable {
    /**
     * Number of compliant devices
     */
    private Integer compliantDeviceCount;
    /**
     * Number of conflict devices
     */
    private Integer conflictDeviceCount;
    /**
     * Number of error devices
     */
    private Integer errorDeviceCount;
    /**
     * Number of NonCompliant devices
     */
    private Integer nonCompliantDeviceCount;
    /**
     * Number of not applicable devices
     */
    private Integer notApplicableDeviceCount;
    /**
     * Number of remediated devices
     */
    private Integer remediatedDeviceCount;
    /**
     * Number of unknown devices
     */
    private Integer unknownDeviceCount;
    /**
     * Instantiates a new deviceConfigurationDeviceStateSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceConfigurationDeviceStateSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceConfigurationDeviceStateSummary
     */
    @javax.annotation.Nonnull
    public static DeviceConfigurationDeviceStateSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceConfigurationDeviceStateSummary();
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
        deserializerMap.put("errorDeviceCount", (n) -> { this.setErrorDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("nonCompliantDeviceCount", (n) -> { this.setNonCompliantDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("notApplicableDeviceCount", (n) -> { this.setNotApplicableDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("remediatedDeviceCount", (n) -> { this.setRemediatedDeviceCount(n.getIntegerValue()); });
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
     * Gets the remediatedDeviceCount property value. Number of remediated devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemediatedDeviceCount() {
        return this.remediatedDeviceCount;
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
        writer.writeIntegerValue("errorDeviceCount", this.getErrorDeviceCount());
        writer.writeIntegerValue("nonCompliantDeviceCount", this.getNonCompliantDeviceCount());
        writer.writeIntegerValue("notApplicableDeviceCount", this.getNotApplicableDeviceCount());
        writer.writeIntegerValue("remediatedDeviceCount", this.getRemediatedDeviceCount());
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
     * Sets the remediatedDeviceCount property value. Number of remediated devices
     * @param value Value to set for the remediatedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemediatedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.remediatedDeviceCount = value;
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
