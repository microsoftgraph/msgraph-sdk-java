package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerTask extends Entity implements Parsable {
    /** Number of checklist items with value set to false, representing incomplete items.  */
    private Integer _activeChecklistItemCount;
    /** The categories to which the task has been applied. See applied Categories for possible values.  */
    private PlannerAppliedCategories _appliedCategories;
    /** Read-only. Nullable. Used to render the task correctly in the task board view when grouped by assignedTo.  */
    private PlannerAssignedToTaskBoardTaskFormat _assignedToTaskBoardFormat;
    /** Hint used to order items of this type in a list view. The format is defined as outlined here.  */
    private String _assigneePriority;
    /** The set of assignees the task is assigned to.  */
    private PlannerAssignments _assignments;
    /** Bucket ID to which the task belongs. The bucket needs to be in the plan that the task is in. It is 28 characters long and case-sensitive. Format validation is done on the service.  */
    private String _bucketId;
    /** Read-only. Nullable. Used to render the task correctly in the task board view when grouped by bucket.  */
    private PlannerBucketTaskBoardTaskFormat _bucketTaskBoardFormat;
    /** Number of checklist items that are present on the task.  */
    private Integer _checklistItemCount;
    /** Identity of the user that completed the task.  */
    private IdentitySet _completedBy;
    /** Read-only. Date and time at which the 'percentComplete' of the task is set to '100'. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z  */
    private OffsetDateTime _completedDateTime;
    /** Thread ID of the conversation on the task. This is the ID of the conversation thread object created in the group.  */
    private String _conversationThreadId;
    /** Identity of the user that created the task.  */
    private IdentitySet _createdBy;
    /** Read-only. Date and time at which the task is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z  */
    private OffsetDateTime _createdDateTime;
    /** Read-only. Nullable. Additional details about the task.  */
    private PlannerTaskDetails _details;
    /** Date and time at which the task is due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z  */
    private OffsetDateTime _dueDateTime;
    /** Read-only. Value is true if the details object of the task has a non-empty description and false otherwise.  */
    private Boolean _hasDescription;
    /** Hint used to order items of this type in a list view. The format is defined as outlined here.  */
    private String _orderHint;
    /** Percentage of task completion. When set to 100, the task is considered completed.  */
    private Integer _percentComplete;
    /** Plan ID to which the task belongs.  */
    private String _planId;
    /** This sets the type of preview that shows up on the task. Possible values are: automatic, noPreview, checklist, description, reference.  */
    private PlannerPreviewType _previewType;
    /** Priority of the task. Valid range of values is between 0 and 10 (inclusive), with increasing value being lower priority (0 has the highest priority and 10 has the lowest priority).  Currently, Planner interprets values 0 and 1 as 'urgent', 2 and 3 and 4 as 'important', 5, 6, and 7 as 'medium', and 8, 9, and 10 as 'low'.  Currently, Planner sets the value 1 for 'urgent', 3 for 'important', 5 for 'medium', and 9 for 'low'.  */
    private Integer _priority;
    /** Read-only. Nullable. Used to render the task correctly in the task board view when grouped by progress.  */
    private PlannerProgressTaskBoardTaskFormat _progressTaskBoardFormat;
    /** Number of external references that exist on the task.  */
    private Integer _referenceCount;
    /** Date and time at which the task starts. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z  */
    private OffsetDateTime _startDateTime;
    /** Title of the task.  */
    private String _title;
    /**
     * Instantiates a new plannerTask and sets the default values.
     * @return a void
     */
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
        return this._activeChecklistItemCount;
    }
    /**
     * Gets the appliedCategories property value. The categories to which the task has been applied. See applied Categories for possible values.
     * @return a plannerAppliedCategories
     */
    @javax.annotation.Nullable
    public PlannerAppliedCategories getAppliedCategories() {
        return this._appliedCategories;
    }
    /**
     * Gets the assignedToTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by assignedTo.
     * @return a plannerAssignedToTaskBoardTaskFormat
     */
    @javax.annotation.Nullable
    public PlannerAssignedToTaskBoardTaskFormat getAssignedToTaskBoardFormat() {
        return this._assignedToTaskBoardFormat;
    }
    /**
     * Gets the assigneePriority property value. Hint used to order items of this type in a list view. The format is defined as outlined here.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssigneePriority() {
        return this._assigneePriority;
    }
    /**
     * Gets the assignments property value. The set of assignees the task is assigned to.
     * @return a plannerAssignments
     */
    @javax.annotation.Nullable
    public PlannerAssignments getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the bucketId property value. Bucket ID to which the task belongs. The bucket needs to be in the plan that the task is in. It is 28 characters long and case-sensitive. Format validation is done on the service.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBucketId() {
        return this._bucketId;
    }
    /**
     * Gets the bucketTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by bucket.
     * @return a plannerBucketTaskBoardTaskFormat
     */
    @javax.annotation.Nullable
    public PlannerBucketTaskBoardTaskFormat getBucketTaskBoardFormat() {
        return this._bucketTaskBoardFormat;
    }
    /**
     * Gets the checklistItemCount property value. Number of checklist items that are present on the task.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getChecklistItemCount() {
        return this._checklistItemCount;
    }
    /**
     * Gets the completedBy property value. Identity of the user that completed the task.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCompletedBy() {
        return this._completedBy;
    }
    /**
     * Gets the completedDateTime property value. Read-only. Date and time at which the 'percentComplete' of the task is set to '100'. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this._completedDateTime;
    }
    /**
     * Gets the conversationThreadId property value. Thread ID of the conversation on the task. This is the ID of the conversation thread object created in the group.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConversationThreadId() {
        return this._conversationThreadId;
    }
    /**
     * Gets the createdBy property value. Identity of the user that created the task.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. Read-only. Date and time at which the task is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the details property value. Read-only. Nullable. Additional details about the task.
     * @return a plannerTaskDetails
     */
    @javax.annotation.Nullable
    public PlannerTaskDetails getDetails() {
        return this._details;
    }
    /**
     * Gets the dueDateTime property value. Date and time at which the task is due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDueDateTime() {
        return this._dueDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PlannerTask currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activeChecklistItemCount", (n) -> { currentObject.setActiveChecklistItemCount(n.getIntegerValue()); });
            this.put("appliedCategories", (n) -> { currentObject.setAppliedCategories(n.getObjectValue(PlannerAppliedCategories::createFromDiscriminatorValue)); });
            this.put("assignedToTaskBoardFormat", (n) -> { currentObject.setAssignedToTaskBoardFormat(n.getObjectValue(PlannerAssignedToTaskBoardTaskFormat::createFromDiscriminatorValue)); });
            this.put("assigneePriority", (n) -> { currentObject.setAssigneePriority(n.getStringValue()); });
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getObjectValue(PlannerAssignments::createFromDiscriminatorValue)); });
            this.put("bucketId", (n) -> { currentObject.setBucketId(n.getStringValue()); });
            this.put("bucketTaskBoardFormat", (n) -> { currentObject.setBucketTaskBoardFormat(n.getObjectValue(PlannerBucketTaskBoardTaskFormat::createFromDiscriminatorValue)); });
            this.put("checklistItemCount", (n) -> { currentObject.setChecklistItemCount(n.getIntegerValue()); });
            this.put("completedBy", (n) -> { currentObject.setCompletedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("completedDateTime", (n) -> { currentObject.setCompletedDateTime(n.getOffsetDateTimeValue()); });
            this.put("conversationThreadId", (n) -> { currentObject.setConversationThreadId(n.getStringValue()); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("details", (n) -> { currentObject.setDetails(n.getObjectValue(PlannerTaskDetails::createFromDiscriminatorValue)); });
            this.put("dueDateTime", (n) -> { currentObject.setDueDateTime(n.getOffsetDateTimeValue()); });
            this.put("hasDescription", (n) -> { currentObject.setHasDescription(n.getBooleanValue()); });
            this.put("orderHint", (n) -> { currentObject.setOrderHint(n.getStringValue()); });
            this.put("percentComplete", (n) -> { currentObject.setPercentComplete(n.getIntegerValue()); });
            this.put("planId", (n) -> { currentObject.setPlanId(n.getStringValue()); });
            this.put("previewType", (n) -> { currentObject.setPreviewType(n.getEnumValue(PlannerPreviewType.class)); });
            this.put("priority", (n) -> { currentObject.setPriority(n.getIntegerValue()); });
            this.put("progressTaskBoardFormat", (n) -> { currentObject.setProgressTaskBoardFormat(n.getObjectValue(PlannerProgressTaskBoardTaskFormat::createFromDiscriminatorValue)); });
            this.put("referenceCount", (n) -> { currentObject.setReferenceCount(n.getIntegerValue()); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("title", (n) -> { currentObject.setTitle(n.getStringValue()); });
        }};
    }
    /**
     * Gets the hasDescription property value. Read-only. Value is true if the details object of the task has a non-empty description and false otherwise.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasDescription() {
        return this._hasDescription;
    }
    /**
     * Gets the orderHint property value. Hint used to order items of this type in a list view. The format is defined as outlined here.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrderHint() {
        return this._orderHint;
    }
    /**
     * Gets the percentComplete property value. Percentage of task completion. When set to 100, the task is considered completed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPercentComplete() {
        return this._percentComplete;
    }
    /**
     * Gets the planId property value. Plan ID to which the task belongs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPlanId() {
        return this._planId;
    }
    /**
     * Gets the previewType property value. This sets the type of preview that shows up on the task. Possible values are: automatic, noPreview, checklist, description, reference.
     * @return a plannerPreviewType
     */
    @javax.annotation.Nullable
    public PlannerPreviewType getPreviewType() {
        return this._previewType;
    }
    /**
     * Gets the priority property value. Priority of the task. Valid range of values is between 0 and 10 (inclusive), with increasing value being lower priority (0 has the highest priority and 10 has the lowest priority).  Currently, Planner interprets values 0 and 1 as 'urgent', 2 and 3 and 4 as 'important', 5, 6, and 7 as 'medium', and 8, 9, and 10 as 'low'.  Currently, Planner sets the value 1 for 'urgent', 3 for 'important', 5 for 'medium', and 9 for 'low'.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this._priority;
    }
    /**
     * Gets the progressTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by progress.
     * @return a plannerProgressTaskBoardTaskFormat
     */
    @javax.annotation.Nullable
    public PlannerProgressTaskBoardTaskFormat getProgressTaskBoardFormat() {
        return this._progressTaskBoardFormat;
    }
    /**
     * Gets the referenceCount property value. Number of external references that exist on the task.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getReferenceCount() {
        return this._referenceCount;
    }
    /**
     * Gets the startDateTime property value. Date and time at which the task starts. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the title property value. Title of the task.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this._title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setActiveChecklistItemCount(@javax.annotation.Nullable final Integer value) {
        this._activeChecklistItemCount = value;
    }
    /**
     * Sets the appliedCategories property value. The categories to which the task has been applied. See applied Categories for possible values.
     * @param value Value to set for the appliedCategories property.
     * @return a void
     */
    public void setAppliedCategories(@javax.annotation.Nullable final PlannerAppliedCategories value) {
        this._appliedCategories = value;
    }
    /**
     * Sets the assignedToTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by assignedTo.
     * @param value Value to set for the assignedToTaskBoardFormat property.
     * @return a void
     */
    public void setAssignedToTaskBoardFormat(@javax.annotation.Nullable final PlannerAssignedToTaskBoardTaskFormat value) {
        this._assignedToTaskBoardFormat = value;
    }
    /**
     * Sets the assigneePriority property value. Hint used to order items of this type in a list view. The format is defined as outlined here.
     * @param value Value to set for the assigneePriority property.
     * @return a void
     */
    public void setAssigneePriority(@javax.annotation.Nullable final String value) {
        this._assigneePriority = value;
    }
    /**
     * Sets the assignments property value. The set of assignees the task is assigned to.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final PlannerAssignments value) {
        this._assignments = value;
    }
    /**
     * Sets the bucketId property value. Bucket ID to which the task belongs. The bucket needs to be in the plan that the task is in. It is 28 characters long and case-sensitive. Format validation is done on the service.
     * @param value Value to set for the bucketId property.
     * @return a void
     */
    public void setBucketId(@javax.annotation.Nullable final String value) {
        this._bucketId = value;
    }
    /**
     * Sets the bucketTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by bucket.
     * @param value Value to set for the bucketTaskBoardFormat property.
     * @return a void
     */
    public void setBucketTaskBoardFormat(@javax.annotation.Nullable final PlannerBucketTaskBoardTaskFormat value) {
        this._bucketTaskBoardFormat = value;
    }
    /**
     * Sets the checklistItemCount property value. Number of checklist items that are present on the task.
     * @param value Value to set for the checklistItemCount property.
     * @return a void
     */
    public void setChecklistItemCount(@javax.annotation.Nullable final Integer value) {
        this._checklistItemCount = value;
    }
    /**
     * Sets the completedBy property value. Identity of the user that completed the task.
     * @param value Value to set for the completedBy property.
     * @return a void
     */
    public void setCompletedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._completedBy = value;
    }
    /**
     * Sets the completedDateTime property value. Read-only. Date and time at which the 'percentComplete' of the task is set to '100'. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    public void setCompletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._completedDateTime = value;
    }
    /**
     * Sets the conversationThreadId property value. Thread ID of the conversation on the task. This is the ID of the conversation thread object created in the group.
     * @param value Value to set for the conversationThreadId property.
     * @return a void
     */
    public void setConversationThreadId(@javax.annotation.Nullable final String value) {
        this._conversationThreadId = value;
    }
    /**
     * Sets the createdBy property value. Identity of the user that created the task.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Read-only. Date and time at which the task is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the details property value. Read-only. Nullable. Additional details about the task.
     * @param value Value to set for the details property.
     * @return a void
     */
    public void setDetails(@javax.annotation.Nullable final PlannerTaskDetails value) {
        this._details = value;
    }
    /**
     * Sets the dueDateTime property value. Date and time at which the task is due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the dueDateTime property.
     * @return a void
     */
    public void setDueDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._dueDateTime = value;
    }
    /**
     * Sets the hasDescription property value. Read-only. Value is true if the details object of the task has a non-empty description and false otherwise.
     * @param value Value to set for the hasDescription property.
     * @return a void
     */
    public void setHasDescription(@javax.annotation.Nullable final Boolean value) {
        this._hasDescription = value;
    }
    /**
     * Sets the orderHint property value. Hint used to order items of this type in a list view. The format is defined as outlined here.
     * @param value Value to set for the orderHint property.
     * @return a void
     */
    public void setOrderHint(@javax.annotation.Nullable final String value) {
        this._orderHint = value;
    }
    /**
     * Sets the percentComplete property value. Percentage of task completion. When set to 100, the task is considered completed.
     * @param value Value to set for the percentComplete property.
     * @return a void
     */
    public void setPercentComplete(@javax.annotation.Nullable final Integer value) {
        this._percentComplete = value;
    }
    /**
     * Sets the planId property value. Plan ID to which the task belongs.
     * @param value Value to set for the planId property.
     * @return a void
     */
    public void setPlanId(@javax.annotation.Nullable final String value) {
        this._planId = value;
    }
    /**
     * Sets the previewType property value. This sets the type of preview that shows up on the task. Possible values are: automatic, noPreview, checklist, description, reference.
     * @param value Value to set for the previewType property.
     * @return a void
     */
    public void setPreviewType(@javax.annotation.Nullable final PlannerPreviewType value) {
        this._previewType = value;
    }
    /**
     * Sets the priority property value. Priority of the task. Valid range of values is between 0 and 10 (inclusive), with increasing value being lower priority (0 has the highest priority and 10 has the lowest priority).  Currently, Planner interprets values 0 and 1 as 'urgent', 2 and 3 and 4 as 'important', 5, 6, and 7 as 'medium', and 8, 9, and 10 as 'low'.  Currently, Planner sets the value 1 for 'urgent', 3 for 'important', 5 for 'medium', and 9 for 'low'.
     * @param value Value to set for the priority property.
     * @return a void
     */
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this._priority = value;
    }
    /**
     * Sets the progressTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by progress.
     * @param value Value to set for the progressTaskBoardFormat property.
     * @return a void
     */
    public void setProgressTaskBoardFormat(@javax.annotation.Nullable final PlannerProgressTaskBoardTaskFormat value) {
        this._progressTaskBoardFormat = value;
    }
    /**
     * Sets the referenceCount property value. Number of external references that exist on the task.
     * @param value Value to set for the referenceCount property.
     * @return a void
     */
    public void setReferenceCount(@javax.annotation.Nullable final Integer value) {
        this._referenceCount = value;
    }
    /**
     * Sets the startDateTime property value. Date and time at which the task starts. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the title property value. Title of the task.
     * @param value Value to set for the title property.
     * @return a void
     */
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
}
