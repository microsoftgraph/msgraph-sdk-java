package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerTask extends Entity implements Parsable {
    /**
     * Instantiates a new PlannerTask and sets the default values.
     */
    public PlannerTask() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerTask
     */
    @jakarta.annotation.Nonnull
    public static PlannerTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTask();
    }
    /**
     * Gets the activeChecklistItemCount property value. Number of checklist items with value set to false, representing incomplete items.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getActiveChecklistItemCount() {
        return this.BackingStore.get("activeChecklistItemCount");
    }
    /**
     * Gets the appliedCategories property value. The categories to which the task has been applied. See applied Categories for possible values.
     * @return a PlannerAppliedCategories
     */
    @jakarta.annotation.Nullable
    public PlannerAppliedCategories getAppliedCategories() {
        return this.BackingStore.get("appliedCategories");
    }
    /**
     * Gets the assignedToTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by assignedTo.
     * @return a PlannerAssignedToTaskBoardTaskFormat
     */
    @jakarta.annotation.Nullable
    public PlannerAssignedToTaskBoardTaskFormat getAssignedToTaskBoardFormat() {
        return this.BackingStore.get("assignedToTaskBoardFormat");
    }
    /**
     * Gets the assigneePriority property value. Hint used to order items of this type in a list view. The format is defined as outlined here.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssigneePriority() {
        return this.BackingStore.get("assigneePriority");
    }
    /**
     * Gets the assignments property value. The set of assignees the task is assigned to.
     * @return a PlannerAssignments
     */
    @jakarta.annotation.Nullable
    public PlannerAssignments getAssignments() {
        return this.BackingStore.get("assignments");
    }
    /**
     * Gets the bucketId property value. Bucket ID to which the task belongs. The bucket needs to be in the plan that the task is in. It's 28 characters long and case-sensitive. Format validation is done on the service.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBucketId() {
        return this.BackingStore.get("bucketId");
    }
    /**
     * Gets the bucketTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by bucket.
     * @return a PlannerBucketTaskBoardTaskFormat
     */
    @jakarta.annotation.Nullable
    public PlannerBucketTaskBoardTaskFormat getBucketTaskBoardFormat() {
        return this.BackingStore.get("bucketTaskBoardFormat");
    }
    /**
     * Gets the checklistItemCount property value. Number of checklist items that are present on the task.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getChecklistItemCount() {
        return this.BackingStore.get("checklistItemCount");
    }
    /**
     * Gets the completedBy property value. Identity of the user that completed the task.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCompletedBy() {
        return this.BackingStore.get("completedBy");
    }
    /**
     * Gets the completedDateTime property value. Read-only. Date and time at which the 'percentComplete' of the task is set to '100'. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.BackingStore.get("completedDateTime");
    }
    /**
     * Gets the conversationThreadId property value. Thread ID of the conversation on the task. This is the ID of the conversation thread object created in the group.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConversationThreadId() {
        return this.BackingStore.get("conversationThreadId");
    }
    /**
     * Gets the createdBy property value. Identity of the user that created the task.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.BackingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Read-only. Date and time at which the task is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.BackingStore.get("createdDateTime");
    }
    /**
     * Gets the details property value. Read-only. Nullable. More details about the task.
     * @return a PlannerTaskDetails
     */
    @jakarta.annotation.Nullable
    public PlannerTaskDetails getDetails() {
        return this.BackingStore.get("details");
    }
    /**
     * Gets the dueDateTime property value. Date and time at which the task is due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDueDateTime() {
        return this.BackingStore.get("dueDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeChecklistItemCount", (n) -> { this.setActiveChecklistItemCount(n.getIntegerValue()); });
        deserializerMap.put("appliedCategories", (n) -> { this.setAppliedCategories(n.getObjectValue(PlannerAppliedCategories::createFromDiscriminatorValue)); });
        deserializerMap.put("assignedToTaskBoardFormat", (n) -> { this.setAssignedToTaskBoardFormat(n.getObjectValue(PlannerAssignedToTaskBoardTaskFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("assigneePriority", (n) -> { this.setAssigneePriority(n.getStringValue()); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getObjectValue(PlannerAssignments::createFromDiscriminatorValue)); });
        deserializerMap.put("bucketId", (n) -> { this.setBucketId(n.getStringValue()); });
        deserializerMap.put("bucketTaskBoardFormat", (n) -> { this.setBucketTaskBoardFormat(n.getObjectValue(PlannerBucketTaskBoardTaskFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("checklistItemCount", (n) -> { this.setChecklistItemCount(n.getIntegerValue()); });
        deserializerMap.put("completedBy", (n) -> { this.setCompletedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("conversationThreadId", (n) -> { this.setConversationThreadId(n.getStringValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getObjectValue(PlannerTaskDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("dueDateTime", (n) -> { this.setDueDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("hasDescription", (n) -> { this.setHasDescription(n.getBooleanValue()); });
        deserializerMap.put("orderHint", (n) -> { this.setOrderHint(n.getStringValue()); });
        deserializerMap.put("percentComplete", (n) -> { this.setPercentComplete(n.getIntegerValue()); });
        deserializerMap.put("planId", (n) -> { this.setPlanId(n.getStringValue()); });
        deserializerMap.put("previewType", (n) -> { this.setPreviewType(n.getEnumValue(PlannerPreviewType.class)); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("progressTaskBoardFormat", (n) -> { this.setProgressTaskBoardFormat(n.getObjectValue(PlannerProgressTaskBoardTaskFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("referenceCount", (n) -> { this.setReferenceCount(n.getIntegerValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasDescription property value. Read-only. Value is true if the details object of the task has a nonempty description and false otherwise.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasDescription() {
        return this.BackingStore.get("hasDescription");
    }
    /**
     * Gets the orderHint property value. Hint used to order items of this type in a list view. The format is defined as outlined here.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrderHint() {
        return this.BackingStore.get("orderHint");
    }
    /**
     * Gets the percentComplete property value. Percentage of task completion. When set to 100, the task is considered completed.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPercentComplete() {
        return this.BackingStore.get("percentComplete");
    }
    /**
     * Gets the planId property value. Plan ID to which the task belongs.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPlanId() {
        return this.BackingStore.get("planId");
    }
    /**
     * Gets the previewType property value. This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist, description, reference.
     * @return a PlannerPreviewType
     */
    @jakarta.annotation.Nullable
    public PlannerPreviewType getPreviewType() {
        return this.BackingStore.get("previewType");
    }
    /**
     * Gets the priority property value. Priority of the task. The valid range of values is between 0 and 10, with the increasing value being lower priority (0 has the highest priority and 10 has the lowest priority).  Currently, Planner interprets values 0 and 1 as 'urgent', 2, 3 and 4 as 'important', 5, 6, and 7 as 'medium', and 8, 9, and 10 as 'low'.  Additionally, Planner sets the value 1 for 'urgent', 3 for 'important', 5 for 'medium', and 9 for 'low'.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.BackingStore.get("priority");
    }
    /**
     * Gets the progressTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by progress.
     * @return a PlannerProgressTaskBoardTaskFormat
     */
    @jakarta.annotation.Nullable
    public PlannerProgressTaskBoardTaskFormat getProgressTaskBoardFormat() {
        return this.BackingStore.get("progressTaskBoardFormat");
    }
    /**
     * Gets the referenceCount property value. Number of external references that exist on the task.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getReferenceCount() {
        return this.BackingStore.get("referenceCount");
    }
    /**
     * Gets the startDateTime property value. Date and time at which the task starts. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.BackingStore.get("startDateTime");
    }
    /**
     * Gets the title property value. Title of the task.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.BackingStore.get("title");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("activeChecklistItemCount", this.getActiveChecklistItemCount());
        writer.writeObjectValue("appliedCategories", this.getAppliedCategories());
        writer.writeObjectValue("assignedToTaskBoardFormat", this.getAssignedToTaskBoardFormat());
        writer.writeStringValue("assigneePriority", this.getAssigneePriority());
        writer.writeObjectValue("assignments", this.getAssignments());
        writer.writeStringValue("bucketId", this.getBucketId());
        writer.writeObjectValue("bucketTaskBoardFormat", this.getBucketTaskBoardFormat());
        writer.writeIntegerValue("checklistItemCount", this.getChecklistItemCount());
        writer.writeObjectValue("completedBy", this.getCompletedBy());
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeStringValue("conversationThreadId", this.getConversationThreadId());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("details", this.getDetails());
        writer.writeOffsetDateTimeValue("dueDateTime", this.getDueDateTime());
        writer.writeBooleanValue("hasDescription", this.getHasDescription());
        writer.writeStringValue("orderHint", this.getOrderHint());
        writer.writeIntegerValue("percentComplete", this.getPercentComplete());
        writer.writeStringValue("planId", this.getPlanId());
        writer.writeEnumValue("previewType", this.getPreviewType());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeObjectValue("progressTaskBoardFormat", this.getProgressTaskBoardFormat());
        writer.writeIntegerValue("referenceCount", this.getReferenceCount());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("title", this.getTitle());
    }
    /**
     * Sets the activeChecklistItemCount property value. Number of checklist items with value set to false, representing incomplete items.
     * @param value Value to set for the activeChecklistItemCount property.
     */
    public void setActiveChecklistItemCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("activeChecklistItemCount", value);
    }
    /**
     * Sets the appliedCategories property value. The categories to which the task has been applied. See applied Categories for possible values.
     * @param value Value to set for the appliedCategories property.
     */
    public void setAppliedCategories(@jakarta.annotation.Nullable final PlannerAppliedCategories value) {
        this.BackingStore.set("appliedCategories", value);
    }
    /**
     * Sets the assignedToTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by assignedTo.
     * @param value Value to set for the assignedToTaskBoardFormat property.
     */
    public void setAssignedToTaskBoardFormat(@jakarta.annotation.Nullable final PlannerAssignedToTaskBoardTaskFormat value) {
        this.BackingStore.set("assignedToTaskBoardFormat", value);
    }
    /**
     * Sets the assigneePriority property value. Hint used to order items of this type in a list view. The format is defined as outlined here.
     * @param value Value to set for the assigneePriority property.
     */
    public void setAssigneePriority(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("assigneePriority", value);
    }
    /**
     * Sets the assignments property value. The set of assignees the task is assigned to.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final PlannerAssignments value) {
        this.BackingStore.set("assignments", value);
    }
    /**
     * Sets the bucketId property value. Bucket ID to which the task belongs. The bucket needs to be in the plan that the task is in. It's 28 characters long and case-sensitive. Format validation is done on the service.
     * @param value Value to set for the bucketId property.
     */
    public void setBucketId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("bucketId", value);
    }
    /**
     * Sets the bucketTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by bucket.
     * @param value Value to set for the bucketTaskBoardFormat property.
     */
    public void setBucketTaskBoardFormat(@jakarta.annotation.Nullable final PlannerBucketTaskBoardTaskFormat value) {
        this.BackingStore.set("bucketTaskBoardFormat", value);
    }
    /**
     * Sets the checklistItemCount property value. Number of checklist items that are present on the task.
     * @param value Value to set for the checklistItemCount property.
     */
    public void setChecklistItemCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("checklistItemCount", value);
    }
    /**
     * Sets the completedBy property value. Identity of the user that completed the task.
     * @param value Value to set for the completedBy property.
     */
    public void setCompletedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.BackingStore.set("completedBy", value);
    }
    /**
     * Sets the completedDateTime property value. Read-only. Date and time at which the 'percentComplete' of the task is set to '100'. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("completedDateTime", value);
    }
    /**
     * Sets the conversationThreadId property value. Thread ID of the conversation on the task. This is the ID of the conversation thread object created in the group.
     * @param value Value to set for the conversationThreadId property.
     */
    public void setConversationThreadId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("conversationThreadId", value);
    }
    /**
     * Sets the createdBy property value. Identity of the user that created the task.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.BackingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Read-only. Date and time at which the task is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("createdDateTime", value);
    }
    /**
     * Sets the details property value. Read-only. Nullable. More details about the task.
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final PlannerTaskDetails value) {
        this.BackingStore.set("details", value);
    }
    /**
     * Sets the dueDateTime property value. Date and time at which the task is due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the dueDateTime property.
     */
    public void setDueDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("dueDateTime", value);
    }
    /**
     * Sets the hasDescription property value. Read-only. Value is true if the details object of the task has a nonempty description and false otherwise.
     * @param value Value to set for the hasDescription property.
     */
    public void setHasDescription(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("hasDescription", value);
    }
    /**
     * Sets the orderHint property value. Hint used to order items of this type in a list view. The format is defined as outlined here.
     * @param value Value to set for the orderHint property.
     */
    public void setOrderHint(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("orderHint", value);
    }
    /**
     * Sets the percentComplete property value. Percentage of task completion. When set to 100, the task is considered completed.
     * @param value Value to set for the percentComplete property.
     */
    public void setPercentComplete(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("percentComplete", value);
    }
    /**
     * Sets the planId property value. Plan ID to which the task belongs.
     * @param value Value to set for the planId property.
     */
    public void setPlanId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("planId", value);
    }
    /**
     * Sets the previewType property value. This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist, description, reference.
     * @param value Value to set for the previewType property.
     */
    public void setPreviewType(@jakarta.annotation.Nullable final PlannerPreviewType value) {
        this.BackingStore.set("previewType", value);
    }
    /**
     * Sets the priority property value. Priority of the task. The valid range of values is between 0 and 10, with the increasing value being lower priority (0 has the highest priority and 10 has the lowest priority).  Currently, Planner interprets values 0 and 1 as 'urgent', 2, 3 and 4 as 'important', 5, 6, and 7 as 'medium', and 8, 9, and 10 as 'low'.  Additionally, Planner sets the value 1 for 'urgent', 3 for 'important', 5 for 'medium', and 9 for 'low'.
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("priority", value);
    }
    /**
     * Sets the progressTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by progress.
     * @param value Value to set for the progressTaskBoardFormat property.
     */
    public void setProgressTaskBoardFormat(@jakarta.annotation.Nullable final PlannerProgressTaskBoardTaskFormat value) {
        this.BackingStore.set("progressTaskBoardFormat", value);
    }
    /**
     * Sets the referenceCount property value. Number of external references that exist on the task.
     * @param value Value to set for the referenceCount property.
     */
    public void setReferenceCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("referenceCount", value);
    }
    /**
     * Sets the startDateTime property value. Date and time at which the task starts. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("startDateTime", value);
    }
    /**
     * Sets the title property value. Title of the task.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("title", value);
    }
}
