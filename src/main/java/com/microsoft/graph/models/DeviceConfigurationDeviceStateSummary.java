package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceConfigurationDeviceStateSummary extends Entity implements Parsable {
    /** Number of compliant devices */
    private Integer _compliantDeviceCount;
    /** Number of conflict devices */
    private Integer _conflictDeviceCount;
    /** Number of error devices */
    private Integer _errorDeviceCount;
    /** Number of NonCompliant devices */
    private Integer _nonCompliantDeviceCount;
    /** Number of not applicable devices */
    private Integer _notApplicableDeviceCount;
    /** Number of remediated devices */
    private Integer _remediatedDeviceCount;
    /** Number of unknown devices */
    private Integer _unknownDeviceCount;
    /**
     * Instantiates a new deviceConfigurationDeviceStateSummary and sets the default values.
     * @return a void
     */
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
        return this._compliantDeviceCount;
    }
    /**
     * Gets the conflictDeviceCount property value. Number of conflict devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConflictDeviceCount() {
        return this._conflictDeviceCount;
    }
    /**
     * Gets the errorDeviceCount property value. Number of error devices
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
        final DeviceConfigurationDeviceStateSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("compliantDeviceCount", (n) -> { currentObject.setCompliantDeviceCount(n.getIntegerValue()); });
            this.put("conflictDeviceCount", (n) -> { currentObject.setConflictDeviceCount(n.getIntegerValue()); });
            this.put("errorDeviceCount", (n) -> { currentObject.setErrorDeviceCount(n.getIntegerValue()); });
            this.put("nonCompliantDeviceCount", (n) -> { currentObject.setNonCompliantDeviceCount(n.getIntegerValue()); });
            this.put("notApplicableDeviceCount", (n) -> { currentObject.setNotApplicableDeviceCount(n.getIntegerValue()); });
            this.put("remediatedDeviceCount", (n) -> { currentObject.setRemediatedDeviceCount(n.getIntegerValue()); });
            this.put("unknownDeviceCount", (n) -> { currentObject.setUnknownDeviceCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the nonCompliantDeviceCount property value. Number of NonCompliant devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNonCompliantDeviceCount() {
        return this._nonCompliantDeviceCount;
    }
    /**
     * Gets the notApplicableDeviceCount property value. Number of not applicable devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotApplicableDeviceCount() {
        return this._notApplicableDeviceCount;
    }
    /**
     * Gets the remediatedDeviceCount property value. Number of remediated devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemediatedDeviceCount() {
        return this._remediatedDeviceCount;
    }
    /**
     * Gets the unknownDeviceCount property value. Number of unknown devices
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
    public void setCompliantDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._compliantDeviceCount = value;
    }
    /**
     * Sets the conflictDeviceCount property value. Number of conflict devices
     * @param value Value to set for the conflictDeviceCount property.
     * @return a void
     */
    public void setConflictDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._conflictDeviceCount = value;
    }
    /**
     * Sets the errorDeviceCount property value. Number of error devices
     * @param value Value to set for the errorDeviceCount property.
     * @return a void
     */
    public void setErrorDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._errorDeviceCount = value;
    }
    /**
     * Sets the nonCompliantDeviceCount property value. Number of NonCompliant devices
     * @param value Value to set for the nonCompliantDeviceCount property.
     * @return a void
     */
    public void setNonCompliantDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._nonCompliantDeviceCount = value;
    }
    /**
     * Sets the notApplicableDeviceCount property value. Number of not applicable devices
     * @param value Value to set for the notApplicableDeviceCount property.
     * @return a void
     */
    public void setNotApplicableDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._notApplicableDeviceCount = value;
    }
    /**
     * Sets the remediatedDeviceCount property value. Number of remediated devices
     * @param value Value to set for the remediatedDeviceCount property.
     * @return a void
     */
    public void setRemediatedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._remediatedDeviceCount = value;
    }
    /**
     * Sets the unknownDeviceCount property value. Number of unknown devices
     * @param value Value to set for the unknownDeviceCount property.
     * @return a void
     */
    public void setUnknownDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._unknownDeviceCount = value;
    }
}
