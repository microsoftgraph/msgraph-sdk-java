package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.User;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserProcessingResult extends Entity implements Parsable {
    /**
     * The date time that the workflow execution for a user completed. Value is null if the workflow hasn't completed.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    private OffsetDateTime completedDateTime;
    /**
     * The number of tasks that failed in the workflow execution.
     */
    private Integer failedTasksCount;
    /**
     * The processingStatus property
     */
    private LifecycleWorkflowProcessingStatus processingStatus;
    /**
     * The date time that the workflow is scheduled to be executed for a user.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    private OffsetDateTime scheduledDateTime;
    /**
     * The date time that the workflow execution started. Value is null if the workflow execution has not started.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    private OffsetDateTime startedDateTime;
    /**
     * The subject property
     */
    private User subject;
    /**
     * The associated individual task execution.
     */
    private java.util.List<TaskProcessingResult> taskProcessingResults;
    /**
     * The total number of tasks that in the workflow execution.
     */
    private Integer totalTasksCount;
    /**
     * The total number of unprocessed tasks for the workflow.
     */
    private Integer totalUnprocessedTasksCount;
    /**
     * The workflowExecutionType property
     */
    private WorkflowExecutionType workflowExecutionType;
    /**
     * The version of the workflow that was executed.
     */
    private Integer workflowVersion;
    /**
     * Instantiates a new UserProcessingResult and sets the default values.
     */
    public UserProcessingResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserProcessingResult
     */
    @jakarta.annotation.Nonnull
    public static UserProcessingResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserProcessingResult();
    }
    /**
     * Gets the completedDateTime property value. The date time that the workflow execution for a user completed. Value is null if the workflow hasn't completed.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.completedDateTime;
    }
    /**
     * Gets the failedTasksCount property value. The number of tasks that failed in the workflow execution.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFailedTasksCount() {
        return this.failedTasksCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("failedTasksCount", (n) -> { this.setFailedTasksCount(n.getIntegerValue()); });
        deserializerMap.put("processingStatus", (n) -> { this.setProcessingStatus(n.getEnumValue(LifecycleWorkflowProcessingStatus.class)); });
        deserializerMap.put("scheduledDateTime", (n) -> { this.setScheduledDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("startedDateTime", (n) -> { this.setStartedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getObjectValue(User::createFromDiscriminatorValue)); });
        deserializerMap.put("taskProcessingResults", (n) -> { this.setTaskProcessingResults(n.getCollectionOfObjectValues(TaskProcessingResult::createFromDiscriminatorValue)); });
        deserializerMap.put("totalTasksCount", (n) -> { this.setTotalTasksCount(n.getIntegerValue()); });
        deserializerMap.put("totalUnprocessedTasksCount", (n) -> { this.setTotalUnprocessedTasksCount(n.getIntegerValue()); });
        deserializerMap.put("workflowExecutionType", (n) -> { this.setWorkflowExecutionType(n.getEnumValue(WorkflowExecutionType.class)); });
        deserializerMap.put("workflowVersion", (n) -> { this.setWorkflowVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the processingStatus property value. The processingStatus property
     * @return a LifecycleWorkflowProcessingStatus
     */
    @jakarta.annotation.Nullable
    public LifecycleWorkflowProcessingStatus getProcessingStatus() {
        return this.processingStatus;
    }
    /**
     * Gets the scheduledDateTime property value. The date time that the workflow is scheduled to be executed for a user.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getScheduledDateTime() {
        return this.scheduledDateTime;
    }
    /**
     * Gets the startedDateTime property value. The date time that the workflow execution started. Value is null if the workflow execution has not started.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this.startedDateTime;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a User
     */
    @jakarta.annotation.Nullable
    public User getSubject() {
        return this.subject;
    }
    /**
     * Gets the taskProcessingResults property value. The associated individual task execution.
     * @return a java.util.List<TaskProcessingResult>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TaskProcessingResult> getTaskProcessingResults() {
        return this.taskProcessingResults;
    }
    /**
     * Gets the totalTasksCount property value. The total number of tasks that in the workflow execution.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalTasksCount() {
        return this.totalTasksCount;
    }
    /**
     * Gets the totalUnprocessedTasksCount property value. The total number of unprocessed tasks for the workflow.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalUnprocessedTasksCount() {
        return this.totalUnprocessedTasksCount;
    }
    /**
     * Gets the workflowExecutionType property value. The workflowExecutionType property
     * @return a WorkflowExecutionType
     */
    @jakarta.annotation.Nullable
    public WorkflowExecutionType getWorkflowExecutionType() {
        return this.workflowExecutionType;
    }
    /**
     * Gets the workflowVersion property value. The version of the workflow that was executed.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getWorkflowVersion() {
        return this.workflowVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeIntegerValue("failedTasksCount", this.getFailedTasksCount());
        writer.writeEnumValue("processingStatus", this.getProcessingStatus());
        writer.writeOffsetDateTimeValue("scheduledDateTime", this.getScheduledDateTime());
        writer.writeOffsetDateTimeValue("startedDateTime", this.getStartedDateTime());
        writer.writeObjectValue("subject", this.getSubject());
        writer.writeCollectionOfObjectValues("taskProcessingResults", this.getTaskProcessingResults());
        writer.writeIntegerValue("totalTasksCount", this.getTotalTasksCount());
        writer.writeIntegerValue("totalUnprocessedTasksCount", this.getTotalUnprocessedTasksCount());
        writer.writeEnumValue("workflowExecutionType", this.getWorkflowExecutionType());
        writer.writeIntegerValue("workflowVersion", this.getWorkflowVersion());
    }
    /**
     * Sets the completedDateTime property value. The date time that the workflow execution for a user completed. Value is null if the workflow hasn't completed.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.completedDateTime = value;
    }
    /**
     * Sets the failedTasksCount property value. The number of tasks that failed in the workflow execution.
     * @param value Value to set for the failedTasksCount property.
     */
    public void setFailedTasksCount(@jakarta.annotation.Nullable final Integer value) {
        this.failedTasksCount = value;
    }
    /**
     * Sets the processingStatus property value. The processingStatus property
     * @param value Value to set for the processingStatus property.
     */
    public void setProcessingStatus(@jakarta.annotation.Nullable final LifecycleWorkflowProcessingStatus value) {
        this.processingStatus = value;
    }
    /**
     * Sets the scheduledDateTime property value. The date time that the workflow is scheduled to be executed for a user.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the scheduledDateTime property.
     */
    public void setScheduledDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.scheduledDateTime = value;
    }
    /**
     * Sets the startedDateTime property value. The date time that the workflow execution started. Value is null if the workflow execution has not started.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the startedDateTime property.
     */
    public void setStartedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startedDateTime = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final User value) {
        this.subject = value;
    }
    /**
     * Sets the taskProcessingResults property value. The associated individual task execution.
     * @param value Value to set for the taskProcessingResults property.
     */
    public void setTaskProcessingResults(@jakarta.annotation.Nullable final java.util.List<TaskProcessingResult> value) {
        this.taskProcessingResults = value;
    }
    /**
     * Sets the totalTasksCount property value. The total number of tasks that in the workflow execution.
     * @param value Value to set for the totalTasksCount property.
     */
    public void setTotalTasksCount(@jakarta.annotation.Nullable final Integer value) {
        this.totalTasksCount = value;
    }
    /**
     * Sets the totalUnprocessedTasksCount property value. The total number of unprocessed tasks for the workflow.
     * @param value Value to set for the totalUnprocessedTasksCount property.
     */
    public void setTotalUnprocessedTasksCount(@jakarta.annotation.Nullable final Integer value) {
        this.totalUnprocessedTasksCount = value;
    }
    /**
     * Sets the workflowExecutionType property value. The workflowExecutionType property
     * @param value Value to set for the workflowExecutionType property.
     */
    public void setWorkflowExecutionType(@jakarta.annotation.Nullable final WorkflowExecutionType value) {
        this.workflowExecutionType = value;
    }
    /**
     * Sets the workflowVersion property value. The version of the workflow that was executed.
     * @param value Value to set for the workflowVersion property.
     */
    public void setWorkflowVersion(@jakarta.annotation.Nullable final Integer value) {
        this.workflowVersion = value;
    }
}
