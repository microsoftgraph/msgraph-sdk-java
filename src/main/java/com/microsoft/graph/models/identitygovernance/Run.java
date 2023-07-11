package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Run extends Entity implements Parsable {
    /**
     * The date time that the run completed. Value is null if the workflow hasn't completed.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    private OffsetDateTime completedDateTime;
    /**
     * The number of tasks that failed in the run execution.
     */
    private Integer failedTasksCount;
    /**
     * The number of users that failed in the run execution.
     */
    private Integer failedUsersCount;
    /**
     * The datetime that the run was last updated.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    private OffsetDateTime lastUpdatedDateTime;
    /**
     * The processingStatus property
     */
    private LifecycleWorkflowProcessingStatus processingStatus;
    /**
     * The date time that the run is scheduled to be executed for a workflow.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    private OffsetDateTime scheduledDateTime;
    /**
     * The date time that the run execution started.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    private OffsetDateTime startedDateTime;
    /**
     * The number of successfully completed users in the run.
     */
    private Integer successfulUsersCount;
    /**
     * The related taskProcessingResults.
     */
    private java.util.List<TaskProcessingResult> taskProcessingResults;
    /**
     * The totalTasksCount property
     */
    private Integer totalTasksCount;
    /**
     * The total number of unprocessed tasks in the run execution.
     */
    private Integer totalUnprocessedTasksCount;
    /**
     * The total number of users in the workflow execution.
     */
    private Integer totalUsersCount;
    /**
     * The associated individual user execution.
     */
    private java.util.List<UserProcessingResult> userProcessingResults;
    /**
     * The workflowExecutionType property
     */
    private WorkflowExecutionType workflowExecutionType;
    /**
     * Instantiates a new run and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Run() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a run
     */
    @javax.annotation.Nonnull
    public static Run createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Run();
    }
    /**
     * Gets the completedDateTime property value. The date time that the run completed. Value is null if the workflow hasn't completed.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.completedDateTime;
    }
    /**
     * Gets the failedTasksCount property value. The number of tasks that failed in the run execution.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedTasksCount() {
        return this.failedTasksCount;
    }
    /**
     * Gets the failedUsersCount property value. The number of users that failed in the run execution.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedUsersCount() {
        return this.failedUsersCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("failedTasksCount", (n) -> { this.setFailedTasksCount(n.getIntegerValue()); });
        deserializerMap.put("failedUsersCount", (n) -> { this.setFailedUsersCount(n.getIntegerValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("processingStatus", (n) -> { this.setProcessingStatus(n.getEnumValue(LifecycleWorkflowProcessingStatus.class)); });
        deserializerMap.put("scheduledDateTime", (n) -> { this.setScheduledDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("startedDateTime", (n) -> { this.setStartedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("successfulUsersCount", (n) -> { this.setSuccessfulUsersCount(n.getIntegerValue()); });
        deserializerMap.put("taskProcessingResults", (n) -> { this.setTaskProcessingResults(n.getCollectionOfObjectValues(TaskProcessingResult::createFromDiscriminatorValue)); });
        deserializerMap.put("totalTasksCount", (n) -> { this.setTotalTasksCount(n.getIntegerValue()); });
        deserializerMap.put("totalUnprocessedTasksCount", (n) -> { this.setTotalUnprocessedTasksCount(n.getIntegerValue()); });
        deserializerMap.put("totalUsersCount", (n) -> { this.setTotalUsersCount(n.getIntegerValue()); });
        deserializerMap.put("userProcessingResults", (n) -> { this.setUserProcessingResults(n.getCollectionOfObjectValues(UserProcessingResult::createFromDiscriminatorValue)); });
        deserializerMap.put("workflowExecutionType", (n) -> { this.setWorkflowExecutionType(n.getEnumValue(WorkflowExecutionType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastUpdatedDateTime property value. The datetime that the run was last updated.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }
    /**
     * Gets the processingStatus property value. The processingStatus property
     * @return a lifecycleWorkflowProcessingStatus
     */
    @javax.annotation.Nullable
    public LifecycleWorkflowProcessingStatus getProcessingStatus() {
        return this.processingStatus;
    }
    /**
     * Gets the scheduledDateTime property value. The date time that the run is scheduled to be executed for a workflow.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getScheduledDateTime() {
        return this.scheduledDateTime;
    }
    /**
     * Gets the startedDateTime property value. The date time that the run execution started.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this.startedDateTime;
    }
    /**
     * Gets the successfulUsersCount property value. The number of successfully completed users in the run.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSuccessfulUsersCount() {
        return this.successfulUsersCount;
    }
    /**
     * Gets the taskProcessingResults property value. The related taskProcessingResults.
     * @return a taskProcessingResult
     */
    @javax.annotation.Nullable
    public java.util.List<TaskProcessingResult> getTaskProcessingResults() {
        return this.taskProcessingResults;
    }
    /**
     * Gets the totalTasksCount property value. The totalTasksCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalTasksCount() {
        return this.totalTasksCount;
    }
    /**
     * Gets the totalUnprocessedTasksCount property value. The total number of unprocessed tasks in the run execution.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalUnprocessedTasksCount() {
        return this.totalUnprocessedTasksCount;
    }
    /**
     * Gets the totalUsersCount property value. The total number of users in the workflow execution.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalUsersCount() {
        return this.totalUsersCount;
    }
    /**
     * Gets the userProcessingResults property value. The associated individual user execution.
     * @return a userProcessingResult
     */
    @javax.annotation.Nullable
    public java.util.List<UserProcessingResult> getUserProcessingResults() {
        return this.userProcessingResults;
    }
    /**
     * Gets the workflowExecutionType property value. The workflowExecutionType property
     * @return a workflowExecutionType
     */
    @javax.annotation.Nullable
    public WorkflowExecutionType getWorkflowExecutionType() {
        return this.workflowExecutionType;
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
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeIntegerValue("failedTasksCount", this.getFailedTasksCount());
        writer.writeIntegerValue("failedUsersCount", this.getFailedUsersCount());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeEnumValue("processingStatus", this.getProcessingStatus());
        writer.writeOffsetDateTimeValue("scheduledDateTime", this.getScheduledDateTime());
        writer.writeOffsetDateTimeValue("startedDateTime", this.getStartedDateTime());
        writer.writeIntegerValue("successfulUsersCount", this.getSuccessfulUsersCount());
        writer.writeCollectionOfObjectValues("taskProcessingResults", this.getTaskProcessingResults());
        writer.writeIntegerValue("totalTasksCount", this.getTotalTasksCount());
        writer.writeIntegerValue("totalUnprocessedTasksCount", this.getTotalUnprocessedTasksCount());
        writer.writeIntegerValue("totalUsersCount", this.getTotalUsersCount());
        writer.writeCollectionOfObjectValues("userProcessingResults", this.getUserProcessingResults());
        writer.writeEnumValue("workflowExecutionType", this.getWorkflowExecutionType());
    }
    /**
     * Sets the completedDateTime property value. The date time that the run completed. Value is null if the workflow hasn't completed.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.completedDateTime = value;
    }
    /**
     * Sets the failedTasksCount property value. The number of tasks that failed in the run execution.
     * @param value Value to set for the failedTasksCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedTasksCount(@javax.annotation.Nullable final Integer value) {
        this.failedTasksCount = value;
    }
    /**
     * Sets the failedUsersCount property value. The number of users that failed in the run execution.
     * @param value Value to set for the failedUsersCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedUsersCount(@javax.annotation.Nullable final Integer value) {
        this.failedUsersCount = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. The datetime that the run was last updated.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdatedDateTime = value;
    }
    /**
     * Sets the processingStatus property value. The processingStatus property
     * @param value Value to set for the processingStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessingStatus(@javax.annotation.Nullable final LifecycleWorkflowProcessingStatus value) {
        this.processingStatus = value;
    }
    /**
     * Sets the scheduledDateTime property value. The date time that the run is scheduled to be executed for a workflow.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the scheduledDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScheduledDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.scheduledDateTime = value;
    }
    /**
     * Sets the startedDateTime property value. The date time that the run execution started.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the startedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startedDateTime = value;
    }
    /**
     * Sets the successfulUsersCount property value. The number of successfully completed users in the run.
     * @param value Value to set for the successfulUsersCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSuccessfulUsersCount(@javax.annotation.Nullable final Integer value) {
        this.successfulUsersCount = value;
    }
    /**
     * Sets the taskProcessingResults property value. The related taskProcessingResults.
     * @param value Value to set for the taskProcessingResults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaskProcessingResults(@javax.annotation.Nullable final java.util.List<TaskProcessingResult> value) {
        this.taskProcessingResults = value;
    }
    /**
     * Sets the totalTasksCount property value. The totalTasksCount property
     * @param value Value to set for the totalTasksCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalTasksCount(@javax.annotation.Nullable final Integer value) {
        this.totalTasksCount = value;
    }
    /**
     * Sets the totalUnprocessedTasksCount property value. The total number of unprocessed tasks in the run execution.
     * @param value Value to set for the totalUnprocessedTasksCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalUnprocessedTasksCount(@javax.annotation.Nullable final Integer value) {
        this.totalUnprocessedTasksCount = value;
    }
    /**
     * Sets the totalUsersCount property value. The total number of users in the workflow execution.
     * @param value Value to set for the totalUsersCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalUsersCount(@javax.annotation.Nullable final Integer value) {
        this.totalUsersCount = value;
    }
    /**
     * Sets the userProcessingResults property value. The associated individual user execution.
     * @param value Value to set for the userProcessingResults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserProcessingResults(@javax.annotation.Nullable final java.util.List<UserProcessingResult> value) {
        this.userProcessingResults = value;
    }
    /**
     * Sets the workflowExecutionType property value. The workflowExecutionType property
     * @param value Value to set for the workflowExecutionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkflowExecutionType(@javax.annotation.Nullable final WorkflowExecutionType value) {
        this.workflowExecutionType = value;
    }
}
