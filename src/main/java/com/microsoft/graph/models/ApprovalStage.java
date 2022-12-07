package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the admin singleton. */
public class ApprovalStage extends Entity implements Parsable {
    /** Indicates whether the stage is assigned to the calling user to review. Read-only. */
    private Boolean _assignedToMe;
    /** The label provided by the policy creator to identify an approval stage. Read-only. */
    private String _displayName;
    /** The justification associated with the approval stage decision. */
    private String _justification;
    /** The identifier of the reviewer. 00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't reviewed. Read-only. */
    private Identity _reviewedBy;
    /** The date and time when a decision was recorded. The date and time information uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime _reviewedDateTime;
    /** The result of this approval record. Possible values include: NotReviewed, Approved, Denied. */
    private String _reviewResult;
    /** The stage status. Possible values: InProgress, Initializing, Completed, Expired. Read-only. */
    private String _status;
    /**
     * Instantiates a new approvalStage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ApprovalStage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a approvalStage
     */
    @javax.annotation.Nonnull
    public static ApprovalStage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApprovalStage();
    }
    /**
     * Gets the assignedToMe property value. Indicates whether the stage is assigned to the calling user to review. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAssignedToMe() {
        return this._assignedToMe;
    }
    /**
     * Gets the displayName property value. The label provided by the policy creator to identify an approval stage. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedToMe", (n) -> { this.setAssignedToMe(n.getBooleanValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("justification", (n) -> { this.setJustification(n.getStringValue()); });
        deserializerMap.put("reviewedBy", (n) -> { this.setReviewedBy(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewedDateTime", (n) -> { this.setReviewedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reviewResult", (n) -> { this.setReviewResult(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the justification property value. The justification associated with the approval stage decision.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJustification() {
        return this._justification;
    }
    /**
     * Gets the reviewedBy property value. The identifier of the reviewer. 00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't reviewed. Read-only.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getReviewedBy() {
        return this._reviewedBy;
    }
    /**
     * Gets the reviewedDateTime property value. The date and time when a decision was recorded. The date and time information uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReviewedDateTime() {
        return this._reviewedDateTime;
    }
    /**
     * Gets the reviewResult property value. The result of this approval record. Possible values include: NotReviewed, Approved, Denied.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReviewResult() {
        return this._reviewResult;
    }
    /**
     * Gets the status property value. The stage status. Possible values: InProgress, Initializing, Completed, Expired. Read-only.
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("assignedToMe", this.getAssignedToMe());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("justification", this.getJustification());
        writer.writeObjectValue("reviewedBy", this.getReviewedBy());
        writer.writeOffsetDateTimeValue("reviewedDateTime", this.getReviewedDateTime());
        writer.writeStringValue("reviewResult", this.getReviewResult());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the assignedToMe property value. Indicates whether the stage is assigned to the calling user to review. Read-only.
     * @param value Value to set for the assignedToMe property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedToMe(@javax.annotation.Nullable final Boolean value) {
        this._assignedToMe = value;
    }
    /**
     * Sets the displayName property value. The label provided by the policy creator to identify an approval stage. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the justification property value. The justification associated with the approval stage decision.
     * @param value Value to set for the justification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJustification(@javax.annotation.Nullable final String value) {
        this._justification = value;
    }
    /**
     * Sets the reviewedBy property value. The identifier of the reviewer. 00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't reviewed. Read-only.
     * @param value Value to set for the reviewedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewedBy(@javax.annotation.Nullable final Identity value) {
        this._reviewedBy = value;
    }
    /**
     * Sets the reviewedDateTime property value. The date and time when a decision was recorded. The date and time information uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the reviewedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._reviewedDateTime = value;
    }
    /**
     * Sets the reviewResult property value. The result of this approval record. Possible values include: NotReviewed, Approved, Denied.
     * @param value Value to set for the reviewResult property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewResult(@javax.annotation.Nullable final String value) {
        this._reviewResult = value;
    }
    /**
     * Sets the status property value. The stage status. Possible values: InProgress, Initializing, Completed, Expired. Read-only.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
}
