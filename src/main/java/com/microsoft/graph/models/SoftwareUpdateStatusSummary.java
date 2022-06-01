package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the deviceManagement singleton. */
public class SoftwareUpdateStatusSummary extends Entity implements Parsable {
    /** Number of compliant devices. */
    private Integer _compliantDeviceCount;
    /** Number of compliant users. */
    private Integer _compliantUserCount;
    /** Number of conflict devices. */
    private Integer _conflictDeviceCount;
    /** Number of conflict users. */
    private Integer _conflictUserCount;
    /** The name of the policy. */
    private String _displayName;
    /** Number of devices had error. */
    private Integer _errorDeviceCount;
    /** Number of users had error. */
    private Integer _errorUserCount;
    /** Number of non compliant devices. */
    private Integer _nonCompliantDeviceCount;
    /** Number of non compliant users. */
    private Integer _nonCompliantUserCount;
    /** Number of not applicable devices. */
    private Integer _notApplicableDeviceCount;
    /** Number of not applicable users. */
    private Integer _notApplicableUserCount;
    /** Number of remediated devices. */
    private Integer _remediatedDeviceCount;
    /** Number of remediated users. */
    private Integer _remediatedUserCount;
    /** Number of unknown devices. */
    private Integer _unknownDeviceCount;
    /** Number of unknown users. */
    private Integer _unknownUserCount;
    /**
     * Instantiates a new softwareUpdateStatusSummary and sets the default values.
     * @return a void
     */
    public SoftwareUpdateStatusSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a softwareUpdateStatusSummary
     */
    @javax.annotation.Nonnull
    public static SoftwareUpdateStatusSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SoftwareUpdateStatusSummary();
    }
    /**
     * Gets the compliantDeviceCount property value. Number of compliant devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCompliantDeviceCount() {
        return this._compliantDeviceCount;
    }
    /**
     * Gets the compliantUserCount property value. Number of compliant users.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCompliantUserCount() {
        return this._compliantUserCount;
    }
    /**
     * Gets the conflictDeviceCount property value. Number of conflict devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConflictDeviceCount() {
        return this._conflictDeviceCount;
    }
    /**
     * Gets the conflictUserCount property value. Number of conflict users.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConflictUserCount() {
        return this._conflictUserCount;
    }
    /**
     * Gets the displayName property value. The name of the policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the errorDeviceCount property value. Number of devices had error.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorDeviceCount() {
        return this._errorDeviceCount;
    }
    /**
     * Gets the errorUserCount property value. Number of users had error.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorUserCount() {
        return this._errorUserCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SoftwareUpdateStatusSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("compliantDeviceCount", (n) -> { currentObject.setCompliantDeviceCount(n.getIntegerValue()); });
            this.put("compliantUserCount", (n) -> { currentObject.setCompliantUserCount(n.getIntegerValue()); });
            this.put("conflictDeviceCount", (n) -> { currentObject.setConflictDeviceCount(n.getIntegerValue()); });
            this.put("conflictUserCount", (n) -> { currentObject.setConflictUserCount(n.getIntegerValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("errorDeviceCount", (n) -> { currentObject.setErrorDeviceCount(n.getIntegerValue()); });
            this.put("errorUserCount", (n) -> { currentObject.setErrorUserCount(n.getIntegerValue()); });
            this.put("nonCompliantDeviceCount", (n) -> { currentObject.setNonCompliantDeviceCount(n.getIntegerValue()); });
            this.put("nonCompliantUserCount", (n) -> { currentObject.setNonCompliantUserCount(n.getIntegerValue()); });
            this.put("notApplicableDeviceCount", (n) -> { currentObject.setNotApplicableDeviceCount(n.getIntegerValue()); });
            this.put("notApplicableUserCount", (n) -> { currentObject.setNotApplicableUserCount(n.getIntegerValue()); });
            this.put("remediatedDeviceCount", (n) -> { currentObject.setRemediatedDeviceCount(n.getIntegerValue()); });
            this.put("remediatedUserCount", (n) -> { currentObject.setRemediatedUserCount(n.getIntegerValue()); });
            this.put("unknownDeviceCount", (n) -> { currentObject.setUnknownDeviceCount(n.getIntegerValue()); });
            this.put("unknownUserCount", (n) -> { currentObject.setUnknownUserCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the nonCompliantDeviceCount property value. Number of non compliant devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNonCompliantDeviceCount() {
        return this._nonCompliantDeviceCount;
    }
    /**
     * Gets the nonCompliantUserCount property value. Number of non compliant users.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNonCompliantUserCount() {
        return this._nonCompliantUserCount;
    }
    /**
     * Gets the notApplicableDeviceCount property value. Number of not applicable devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotApplicableDeviceCount() {
        return this._notApplicableDeviceCount;
    }
    /**
     * Gets the notApplicableUserCount property value. Number of not applicable users.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotApplicableUserCount() {
        return this._notApplicableUserCount;
    }
    /**
     * Gets the remediatedDeviceCount property value. Number of remediated devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemediatedDeviceCount() {
        return this._remediatedDeviceCount;
    }
    /**
     * Gets the remediatedUserCount property value. Number of remediated users.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemediatedUserCount() {
        return this._remediatedUserCount;
    }
    /**
     * Gets the unknownDeviceCount property value. Number of unknown devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnknownDeviceCount() {
        return this._unknownDeviceCount;
    }
    /**
     * Gets the unknownUserCount property value. Number of unknown users.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnknownUserCount() {
        return this._unknownUserCount;
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
        writer.writeIntegerValue("compliantUserCount", this.getCompliantUserCount());
        writer.writeIntegerValue("conflictDeviceCount", this.getConflictDeviceCount());
        writer.writeIntegerValue("conflictUserCount", this.getConflictUserCount());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("errorDeviceCount", this.getErrorDeviceCount());
        writer.writeIntegerValue("errorUserCount", this.getErrorUserCount());
        writer.writeIntegerValue("nonCompliantDeviceCount", this.getNonCompliantDeviceCount());
        writer.writeIntegerValue("nonCompliantUserCount", this.getNonCompliantUserCount());
        writer.writeIntegerValue("notApplicableDeviceCount", this.getNotApplicableDeviceCount());
        writer.writeIntegerValue("notApplicableUserCount", this.getNotApplicableUserCount());
        writer.writeIntegerValue("remediatedDeviceCount", this.getRemediatedDeviceCount());
        writer.writeIntegerValue("remediatedUserCount", this.getRemediatedUserCount());
        writer.writeIntegerValue("unknownDeviceCount", this.getUnknownDeviceCount());
        writer.writeIntegerValue("unknownUserCount", this.getUnknownUserCount());
    }
    /**
     * Sets the compliantDeviceCount property value. Number of compliant devices.
     * @param value Value to set for the compliantDeviceCount property.
     * @return a void
     */
    public void setCompliantDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._compliantDeviceCount = value;
    }
    /**
     * Sets the compliantUserCount property value. Number of compliant users.
     * @param value Value to set for the compliantUserCount property.
     * @return a void
     */
    public void setCompliantUserCount(@javax.annotation.Nullable final Integer value) {
        this._compliantUserCount = value;
    }
    /**
     * Sets the conflictDeviceCount property value. Number of conflict devices.
     * @param value Value to set for the conflictDeviceCount property.
     * @return a void
     */
    public void setConflictDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._conflictDeviceCount = value;
    }
    /**
     * Sets the conflictUserCount property value. Number of conflict users.
     * @param value Value to set for the conflictUserCount property.
     * @return a void
     */
    public void setConflictUserCount(@javax.annotation.Nullable final Integer value) {
        this._conflictUserCount = value;
    }
    /**
     * Sets the displayName property value. The name of the policy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the errorDeviceCount property value. Number of devices had error.
     * @param value Value to set for the errorDeviceCount property.
     * @return a void
     */
    public void setErrorDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._errorDeviceCount = value;
    }
    /**
     * Sets the errorUserCount property value. Number of users had error.
     * @param value Value to set for the errorUserCount property.
     * @return a void
     */
    public void setErrorUserCount(@javax.annotation.Nullable final Integer value) {
        this._errorUserCount = value;
    }
    /**
     * Sets the nonCompliantDeviceCount property value. Number of non compliant devices.
     * @param value Value to set for the nonCompliantDeviceCount property.
     * @return a void
     */
    public void setNonCompliantDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._nonCompliantDeviceCount = value;
    }
    /**
     * Sets the nonCompliantUserCount property value. Number of non compliant users.
     * @param value Value to set for the nonCompliantUserCount property.
     * @return a void
     */
    public void setNonCompliantUserCount(@javax.annotation.Nullable final Integer value) {
        this._nonCompliantUserCount = value;
    }
    /**
     * Sets the notApplicableDeviceCount property value. Number of not applicable devices.
     * @param value Value to set for the notApplicableDeviceCount property.
     * @return a void
     */
    public void setNotApplicableDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._notApplicableDeviceCount = value;
    }
    /**
     * Sets the notApplicableUserCount property value. Number of not applicable users.
     * @param value Value to set for the notApplicableUserCount property.
     * @return a void
     */
    public void setNotApplicableUserCount(@javax.annotation.Nullable final Integer value) {
        this._notApplicableUserCount = value;
    }
    /**
     * Sets the remediatedDeviceCount property value. Number of remediated devices.
     * @param value Value to set for the remediatedDeviceCount property.
     * @return a void
     */
    public void setRemediatedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._remediatedDeviceCount = value;
    }
    /**
     * Sets the remediatedUserCount property value. Number of remediated users.
     * @param value Value to set for the remediatedUserCount property.
     * @return a void
     */
    public void setRemediatedUserCount(@javax.annotation.Nullable final Integer value) {
        this._remediatedUserCount = value;
    }
    /**
     * Sets the unknownDeviceCount property value. Number of unknown devices.
     * @param value Value to set for the unknownDeviceCount property.
     * @return a void
     */
    public void setUnknownDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._unknownDeviceCount = value;
    }
    /**
     * Sets the unknownUserCount property value. Number of unknown users.
     * @param value Value to set for the unknownUserCount property.
     * @return a void
     */
    public void setUnknownUserCount(@javax.annotation.Nullable final Integer value) {
        this._unknownUserCount = value;
    }
}
