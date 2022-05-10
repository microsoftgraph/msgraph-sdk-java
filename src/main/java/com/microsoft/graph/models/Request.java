package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Request extends Entity implements Parsable {
    /** The identifier of the approval of the request. */
    private String _approvalId;
    /** The request completion date time. */
    private OffsetDateTime _completedDateTime;
    /** The user who created this request. */
    private IdentitySet _createdBy;
    /** The request creation date time. */
    private OffsetDateTime _createdDateTime;
    /** Free text field to define any custom data for the request. Not used. */
    private String _customData;
    /** The status of the request. Not nullable. The possible values are: Canceled, Denied, Failed, Granted, PendingAdminDecision, PendingApproval, PendingProvisioning, PendingScheduleCreation, Provisioned, Revoked, and ScheduleCreated. Not nullable. */
    private String _status;
    /**
     * Instantiates a new request and sets the default values.
     * @return a void
     */
    public Request() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a request
     */
    @javax.annotation.Nonnull
    public static Request createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Request();
    }
    /**
     * Gets the approvalId property value. The identifier of the approval of the request.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApprovalId() {
        return this._approvalId;
    }
    /**
     * Gets the completedDateTime property value. The request completion date time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this._completedDateTime;
    }
    /**
     * Gets the createdBy property value. The user who created this request.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The request creation date time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the customData property value. Free text field to define any custom data for the request. Not used.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomData() {
        return this._customData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Request currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("approvalId", (n) -> { currentObject.setApprovalId(n.getStringValue()); });
            this.put("completedDateTime", (n) -> { currentObject.setCompletedDateTime(n.getOffsetDateTimeValue()); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("customData", (n) -> { currentObject.setCustomData(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
        }};
    }
    /**
     * Gets the status property value. The status of the request. Not nullable. The possible values are: Canceled, Denied, Failed, Granted, PendingAdminDecision, PendingApproval, PendingProvisioning, PendingScheduleCreation, Provisioned, Revoked, and ScheduleCreated. Not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("approvalId", this.getApprovalId());
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("customData", this.getCustomData());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the approvalId property value. The identifier of the approval of the request.
     * @param value Value to set for the approvalId property.
     * @return a void
     */
    public void setApprovalId(@javax.annotation.Nullable final String value) {
        this._approvalId = value;
    }
    /**
     * Sets the completedDateTime property value. The request completion date time.
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    public void setCompletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._completedDateTime = value;
    }
    /**
     * Sets the createdBy property value. The user who created this request.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The request creation date time.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the customData property value. Free text field to define any custom data for the request. Not used.
     * @param value Value to set for the customData property.
     * @return a void
     */
    public void setCustomData(@javax.annotation.Nullable final String value) {
        this._customData = value;
    }
    /**
     * Sets the status property value. The status of the request. Not nullable. The possible values are: Canceled, Denied, Failed, Granted, PendingAdminDecision, PendingApproval, PendingProvisioning, PendingScheduleCreation, Provisioned, Revoked, and ScheduleCreated. Not nullable.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
}
