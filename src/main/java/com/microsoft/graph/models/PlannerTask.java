package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerTask extends Entity implements Parsable {
    /**
     * Number of checklist items with value set to false, representing incomplete items.
     */
    private Integer activeChecklistItemCount;
    /**
     * The categories to which the task has been applied. See applied Categories for possible values.
     */
    private PlannerAppliedCategories appliedCategories;
    /**
     * Read-only. Nullable. Used to render the task correctly in the task board view when grouped by assignedTo.
     */
    private PlannerAssignedToTaskBoardTaskFormat assignedToTaskBoardFormat;
    /**
     * Hint used to order items of this type in a list view. The format is defined as outlined here.
     */
    private String assigneePriority;
    /**
     * The set of assignees the task is assigned to.
     */
    private PlannerAssignments assignments;
    /**
     * Bucket ID to which the task belongs. The bucket needs to be in the plan that the task is in. It is 28 characters long and case-sensitive. Format validation is done on the service.
     */
    private String bucketId;
    /**
     * Read-only. Nullable. Used to render the task correctly in the task board view when grouped by bucket.
     */
    private PlannerBucketTaskBoardTaskFormat bucketTaskBoardFormat;
    /**
     * Number of checklist items that are present on the task.
     */
    private Integer checklistItemCount;
    /**
     * Identity of the user that completed the task.
     */
    private IdentitySet completedBy;
    /**
     * Read-only. Date and time at which the 'percentComplete' of the task is set to '100'. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime completedDateTime;
    /**
     * Thread ID of the conversation on the task. This is the ID of the conversation thread object created in the group.
     */
    private String conversationThreadId;
    /**
     * Identity of the user that created the task.
     */
    private IdentitySet createdBy;
    /**
     * Read-only. Date and time at which the task is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime createdDateTime;
    /**
     * Read-only. Nullable. Additional details about the task.
     */
    private PlannerTaskDetails details;
    /**
     * Date and time at which the task is due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime dueDateTime;
    /**
     * Read-only. Value is true if the details object of the task has a non-empty description and false otherwise.
     */
    private Boolean hasDescription;
    /**
     * Hint used to order items of this type in a list view. The format is defined as outlined here.
     */
    private String orderHint;
    /**
     * Percentage of task completion. When set to 100, the task is considered completed.
     */
    private Integer percentComplete;
    /**
     * Plan ID to which the task belongs.
     */
    private String planId;
    /**
     * This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist, description, reference.
     */
    private PlannerPreviewType previewType;
    /**
     * Priority of the task. The valid range of values is between 0 and 10, with the increasing value being lower priority (0 has the highest priority and 10 has the lowest priority).  Currently, Planner interprets values 0 and 1 as 'urgent', 2, 3 and 4 as 'important', 5, 6, and 7 as 'medium', and 8, 9, and 10 as 'low'.  Additionally, Planner sets the value 1 for 'urgent', 3 for 'important', 5 for 'medium', and 9 for 'low'.
     */
    private Integer priority;
    /**
     * Read-only. Nullable. Used to render the task correctly in the task board view when grouped by progress.
     */
    private PlannerProgressTaskBoardTaskFormat progressTaskBoardFormat;
    /**
     * Number of external references that exist on the task.
     */
    private Integer referenceCount;
    /**
     * Date and time at which the task starts. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime startDateTime;
    /**
     * Title of the task.
     */
    private String title;
    /**
     * Instantiates a new plannerTask and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlannerTask() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerTask
     */
    @javax.annotation.Nonnull
    public static PlannerTask createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTask();
    }
    /**
     * Gets the activeChecklistItemCount property value. Number of checklist items with value set to false, representing incomplete items.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActiveChecklistItemCount() {
        return this.activeChecklistItemCount;
    }
    /**
     * Gets the appliedCategories property value. The categories to which the task has been applied. See applied Categories for possible values.
     * @return a plannerAppliedCategories
     */
    @javax.annotation.Nullable
    public PlannerAppliedCategories getAppliedCategories() {
        return this.appliedCategories;
    }
    /**
     * Gets the assignedToTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by assignedTo.
     * @return a plannerAssignedToTaskBoardTaskFormat
     */
    @javax.annotation.Nullable
    public PlannerAssignedToTaskBoardTaskFormat getAssignedToTaskBoardFormat() {
        return this.assignedToTaskBoardFormat;
    }
    /**
     * Gets the assigneePriority property value. Hint used to order items of this type in a list view. The format is defined as outlined here.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssigneePriority() {
        return this.assigneePriority;
    }
    /**
     * Gets the assignments property value. The set of assignees the task is assigned to.
     * @return a plannerAssignments
     */
    @javax.annotation.Nullable
    public PlannerAssignments getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the bucketId property value. Bucket ID to which the task belongs. The bucket needs to be in the plan that the task is in. It is 28 characters long and case-sensitive. Format validation is done on the service.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBucketId() {
        return this.bucketId;
    }
    /**
     * Gets the bucketTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by bucket.
     * @return a plannerBucketTaskBoardTaskFormat
     */
    @javax.annotation.Nullable
    public PlannerBucketTaskBoardTaskFormat getBucketTaskBoardFormat() {
        return this.bucketTaskBoardFormat;
    }
    /**
     * Gets the checklistItemCount property value. Number of checklist items that are present on the task.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getChecklistItemCount() {
        return this.checklistItemCount;
    }
    /**
     * Gets the completedBy property value. Identity of the user that completed the task.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCompletedBy() {
        return this.completedBy;
    }
    /**
     * Gets the completedDateTime property value. Read-only. Date and time at which the 'percentComplete' of the task is set to '100'. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.completedDateTime;
    }
    /**
     * Gets the conversationThreadId property value. Thread ID of the conversation on the task. This is the ID of the conversation thread object created in the group.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConversationThreadId() {
        return this.conversationThreadId;
    }
    /**
     * Gets the createdBy property value. Identity of the user that created the task.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. Read-only. Date and time at which the task is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the details property value. Read-only. Nullable. Additional details about the task.
     * @return a plannerTaskDetails
     */
    @javax.annotation.Nullable
    public PlannerTaskDetails getDetails() {
        return this.details;
    }
    /**
     * Gets the dueDateTime property value. Date and time at which the task is due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDueDateTime() {
        return this.dueDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * Gets the hasDescription property value. Read-only. Value is true if the details object of the task has a non-empty description and false otherwise.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasDescription() {
        return this.hasDescription;
    }
    /**
     * Gets the orderHint property value. Hint used to order items of this type in a list view. The format is defined as outlined here.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrderHint() {
        return this.orderHint;
    }
    /**
     * Gets the percentComplete property value. Percentage of task completion. When set to 100, the task is considered completed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPercentComplete() {
        return this.percentComplete;
    }
    /**
     * Gets the planId property value. Plan ID to which the task belongs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPlanId() {
        return this.planId;
    }
    /**
     * Gets the previewType property value. This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist, description, reference.
     * @return a plannerPreviewType
     */
    @javax.annotation.Nullable
    public PlannerPreviewType getPreviewType() {
        return this.previewType;
    }
    /**
     * Gets the priority property value. Priority of the task. The valid range of values is between 0 and 10, with the increasing value being lower priority (0 has the highest priority and 10 has the lowest priority).  Currently, Planner interprets values 0 and 1 as 'urgent', 2, 3 and 4 as 'important', 5, 6, and 7 as 'medium', and 8, 9, and 10 as 'low'.  Additionally, Planner sets the value 1 for 'urgent', 3 for 'important', 5 for 'medium', and 9 for 'low'.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Gets the progressTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by progress.
     * @return a plannerProgressTaskBoardTaskFormat
     */
    @javax.annotation.Nullable
    public PlannerProgressTaskBoardTaskFormat getProgressTaskBoardFormat() {
        return this.progressTaskBoardFormat;
    }
    /**
     * Gets the referenceCount property value. Number of external references that exist on the task.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getReferenceCount() {
        return this.referenceCount;
    }
    /**
     * Gets the startDateTime property value. Date and time at which the task starts. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the title property value. Title of the task.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this.title;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActiveChecklistItemCount(@javax.annotation.Nullable final Integer value) {
        this.activeChecklistItemCount = value;
    }
    /**
     * Sets the appliedCategories property value. The categories to which the task has been applied. See applied Categories for possible values.
     * @param value Value to set for the appliedCategories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppliedCategories(@javax.annotation.Nullable final PlannerAppliedCategories value) {
        this.appliedCategories = value;
    }
    /**
     * Sets the assignedToTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by assignedTo.
     * @param value Value to set for the assignedToTaskBoardFormat property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedToTaskBoardFormat(@javax.annotation.Nullable final PlannerAssignedToTaskBoardTaskFormat value) {
        this.assignedToTaskBoardFormat = value;
    }
    /**
     * Sets the assigneePriority property value. Hint used to order items of this type in a list view. The format is defined as outlined here.
     * @param value Value to set for the assigneePriority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssigneePriority(@javax.annotation.Nullable final String value) {
        this.assigneePriority = value;
    }
    /**
     * Sets the assignments property value. The set of assignees the task is assigned to.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final PlannerAssignments value) {
        this.assignments = value;
    }
    /**
     * Sets the bucketId property value. Bucket ID to which the task belongs. The bucket needs to be in the plan that the task is in. It is 28 characters long and case-sensitive. Format validation is done on the service.
     * @param value Value to set for the bucketId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBucketId(@javax.annotation.Nullable final String value) {
        this.bucketId = value;
    }
    /**
     * Sets the bucketTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by bucket.
     * @param value Value to set for the bucketTaskBoardFormat property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBucketTaskBoardFormat(@javax.annotation.Nullable final PlannerBucketTaskBoardTaskFormat value) {
        this.bucketTaskBoardFormat = value;
    }
    /**
     * Sets the checklistItemCount property value. Number of checklist items that are present on the task.
     * @param value Value to set for the checklistItemCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChecklistItemCount(@javax.annotation.Nullable final Integer value) {
        this.checklistItemCount = value;
    }
    /**
     * Sets the completedBy property value. Identity of the user that completed the task.
     * @param value Value to set for the completedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.completedBy = value;
    }
    /**
     * Sets the completedDateTime property value. Read-only. Date and time at which the 'percentComplete' of the task is set to '100'. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.completedDateTime = value;
    }
    /**
     * Sets the conversationThreadId property value. Thread ID of the conversation on the task. This is the ID of the conversation thread object created in the group.
     * @param value Value to set for the conversationThreadId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConversationThreadId(@javax.annotation.Nullable final String value) {
        this.conversationThreadId = value;
    }
    /**
     * Sets the createdBy property value. Identity of the user that created the task.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Read-only. Date and time at which the task is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the details property value. Read-only. Nullable. Additional details about the task.
     * @param value Value to set for the details property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetails(@javax.annotation.Nullable final PlannerTaskDetails value) {
        this.details = value;
    }
    /**
     * Sets the dueDateTime property value. Date and time at which the task is due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the dueDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDueDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.dueDateTime = value;
    }
    /**
     * Sets the hasDescription property value. Read-only. Value is true if the details object of the task has a non-empty description and false otherwise.
     * @param value Value to set for the hasDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasDescription(@javax.annotation.Nullable final Boolean value) {
        this.hasDescription = value;
    }
    /**
     * Sets the orderHint property value. Hint used to order items of this type in a list view. The format is defined as outlined here.
     * @param value Value to set for the orderHint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrderHint(@javax.annotation.Nullable final String value) {
        this.orderHint = value;
    }
    /**
     * Sets the percentComplete property value. Percentage of task completion. When set to 100, the task is considered completed.
     * @param value Value to set for the percentComplete property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPercentComplete(@javax.annotation.Nullable final Integer value) {
        this.percentComplete = value;
    }
    /**
     * Sets the planId property value. Plan ID to which the task belongs.
     * @param value Value to set for the planId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlanId(@javax.annotation.Nullable final String value) {
        this.planId = value;
    }
    /**
     * Sets the previewType property value. This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist, description, reference.
     * @param value Value to set for the previewType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreviewType(@javax.annotation.Nullable final PlannerPreviewType value) {
        this.previewType = value;
    }
    /**
     * Sets the priority property value. Priority of the task. The valid range of values is between 0 and 10, with the increasing value being lower priority (0 has the highest priority and 10 has the lowest priority).  Currently, Planner interprets values 0 and 1 as 'urgent', 2, 3 and 4 as 'important', 5, 6, and 7 as 'medium', and 8, 9, and 10 as 'low'.  Additionally, Planner sets the value 1 for 'urgent', 3 for 'important', 5 for 'medium', and 9 for 'low'.
     * @param value Value to set for the priority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this.priority = value;
    }
    /**
     * Sets the progressTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by progress.
     * @param value Value to set for the progressTaskBoardFormat property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProgressTaskBoardFormat(@javax.annotation.Nullable final PlannerProgressTaskBoardTaskFormat value) {
        this.progressTaskBoardFormat = value;
    }
    /**
     * Sets the referenceCount property value. Number of external references that exist on the task.
     * @param value Value to set for the referenceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReferenceCount(@javax.annotation.Nullable final Integer value) {
        this.referenceCount = value;
    }
    /**
     * Sets the startDateTime property value. Date and time at which the task starts. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the title property value. Title of the task.
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final String value) {
        this.title = value;
    }
}
