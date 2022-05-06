package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AssignedPlan implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The date and time at which the plan was assigned; for example: 2013-01-02T19:32:30Z. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z  */
    private OffsetDateTime _assignedDateTime;
    /** Condition of the capability assignment. The possible values are Enabled, Warning, Suspended, Deleted, LockedOut.  */
    private String _capabilityStatus;
    /** The name of the service; for example, exchange.  */
    private String _service;
    /** A GUID that identifies the service plan. For a complete list of GUIDs and their equivalent friendly service names, see Product names and service plan identifiers for licensing.  */
    private String _servicePlanId;
    /**
     * Instantiates a new assignedPlan and sets the default values.
     * @return a void
     */
    public AssignedPlan() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignedPlan
     */
    @javax.annotation.Nonnull
    public static AssignedPlan createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignedPlan();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the assignedDateTime property value. The date and time at which the plan was assigned; for example: 2013-01-02T19:32:30Z. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAssignedDateTime() {
        return this._assignedDateTime;
    }
    /**
     * Gets the capabilityStatus property value. Condition of the capability assignment. The possible values are Enabled, Warning, Suspended, Deleted, LockedOut.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCapabilityStatus() {
        return this._capabilityStatus;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AssignedPlan currentObject = this;
        return new HashMap<>(4) {{
            this.put("assignedDateTime", (n) -> { currentObject.setAssignedDateTime(n.getOffsetDateTimeValue()); });
            this.put("capabilityStatus", (n) -> { currentObject.setCapabilityStatus(n.getStringValue()); });
            this.put("service", (n) -> { currentObject.setService(n.getStringValue()); });
            this.put("servicePlanId", (n) -> { currentObject.setServicePlanId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the service property value. The name of the service; for example, exchange.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getService() {
        return this._service;
    }
    /**
     * Gets the servicePlanId property value. A GUID that identifies the service plan. For a complete list of GUIDs and their equivalent friendly service names, see Product names and service plan identifiers for licensing.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePlanId() {
        return this._servicePlanId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("assignedDateTime", this.getAssignedDateTime());
        writer.writeStringValue("capabilityStatus", this.getCapabilityStatus());
        writer.writeStringValue("service", this.getService());
        writer.writeStringValue("servicePlanId", this.getServicePlanId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the assignedDateTime property value. The date and time at which the plan was assigned; for example: 2013-01-02T19:32:30Z. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the assignedDateTime property.
     * @return a void
     */
    public void setAssignedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._assignedDateTime = value;
    }
    /**
     * Sets the capabilityStatus property value. Condition of the capability assignment. The possible values are Enabled, Warning, Suspended, Deleted, LockedOut.
     * @param value Value to set for the capabilityStatus property.
     * @return a void
     */
    public void setCapabilityStatus(@javax.annotation.Nullable final String value) {
        this._capabilityStatus = value;
    }
    /**
     * Sets the service property value. The name of the service; for example, exchange.
     * @param value Value to set for the service property.
     * @return a void
     */
    public void setService(@javax.annotation.Nullable final String value) {
        this._service = value;
    }
    /**
     * Sets the servicePlanId property value. A GUID that identifies the service plan. For a complete list of GUIDs and their equivalent friendly service names, see Product names and service plan identifiers for licensing.
     * @param value Value to set for the servicePlanId property.
     * @return a void
     */
    public void setServicePlanId(@javax.annotation.Nullable final String value) {
        this._servicePlanId = value;
    }
}
