package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApprovalStage extends Entity implements Parsable {
    /**
     * Indicates whether the stage is assigned to the calling user to review. Read-only.
     */
    private Boolean assignedToMe;
    /**
     * The label provided by the policy creator to identify an approval stage. Read-only.
     */
    private String displayName;
    /**
     * The justification associated with the approval stage decision.
     */
    private String justification;
    /**
     * The identifier of the reviewer. 00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't reviewed. Read-only.
     */
    private Identity reviewedBy;
    /**
     * The date and time when a decision was recorded. The date and time information uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    private OffsetDateTime reviewedDateTime;
    /**
     * The result of this approval record. Possible values include: NotReviewed, Approved, Denied.
     */
    private String reviewResult;
    /**
     * The stage status. Possible values: InProgress, Initializing, Completed, Expired. Read-only.
     */
    private String status;
    /**
     * Instantiates a new approvalStage and sets the default values.
     */
    public ApprovalStage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a approvalStage
     */
    @jakarta.annotation.Nonnull
    public static ApprovalStage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApprovalStage();
    }
    /**
     * Gets the assignedToMe property value. Indicates whether the stage is assigned to the calling user to review. Read-only.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAssignedToMe() {
        return this.assignedToMe;
    }
    /**
     * Gets the displayName property value. The label provided by the policy creator to identify an approval stage. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
    @jakarta.annotation.Nullable
    public String getJustification() {
        return this.justification;
    }
    /**
     * Gets the reviewedBy property value. The identifier of the reviewer. 00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't reviewed. Read-only.
     * @return a identity
     */
    @jakarta.annotation.Nullable
    public Identity getReviewedBy() {
        return this.reviewedBy;
    }
    /**
     * Gets the reviewedDateTime property value. The date and time when a decision was recorded. The date and time information uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReviewedDateTime() {
        return this.reviewedDateTime;
    }
    /**
     * Gets the reviewResult property value. The result of this approval record. Possible values include: NotReviewed, Approved, Denied.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getReviewResult() {
        return this.reviewResult;
    }
    /**
     * Gets the status property value. The stage status. Possible values: InProgress, Initializing, Completed, Expired. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAssignedToMe(@jakarta.annotation.Nullable final Boolean value) {
        this.assignedToMe = value;
    }
    /**
     * Sets the displayName property value. The label provided by the policy creator to identify an approval stage. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the justification property value. The justification associated with the approval stage decision.
     * @param value Value to set for the justification property.
     */
    public void setJustification(@jakarta.annotation.Nullable final String value) {
        this.justification = value;
    }
    /**
     * Sets the reviewedBy property value. The identifier of the reviewer. 00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't reviewed. Read-only.
     * @param value Value to set for the reviewedBy property.
     */
    public void setReviewedBy(@jakarta.annotation.Nullable final Identity value) {
        this.reviewedBy = value;
    }
    /**
     * Sets the reviewedDateTime property value. The date and time when a decision was recorded. The date and time information uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the reviewedDateTime property.
     */
    public void setReviewedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.reviewedDateTime = value;
    }
    /**
     * Sets the reviewResult property value. The result of this approval record. Possible values include: NotReviewed, Approved, Denied.
     * @param value Value to set for the reviewResult property.
     */
    public void setReviewResult(@jakarta.annotation.Nullable final String value) {
        this.reviewResult = value;
    }
    /**
     * Sets the status property value. The stage status. Possible values: InProgress, Initializing, Completed, Expired. Read-only.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
}
