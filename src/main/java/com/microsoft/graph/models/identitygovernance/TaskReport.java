package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TaskReport extends Entity implements Parsable {
    /**
     * The date time that the associated run completed. Value is null if the run has not completed.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    private OffsetDateTime completedDateTime;
    /**
     * The number of users in the run execution for which the associated task failed.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    private Integer failedUsersCount;
    /**
     * The date and time that the task report was last updated.
     */
    private OffsetDateTime lastUpdatedDateTime;
    /**
     * The processingStatus property
     */
    private LifecycleWorkflowProcessingStatus processingStatus;
    /**
     * The unique identifier of the associated run.
     */
    private String runId;
    /**
     * The date time that the associated run started. Value is null if the run has not started.
     */
    private OffsetDateTime startedDateTime;
    /**
     * The number of users in the run execution for which the associated task succeeded.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    private Integer successfulUsersCount;
    /**
     * The task property
     */
    private Task task;
    /**
     * The taskDefinition property
     */
    private TaskDefinition taskDefinition;
    /**
     * The related lifecycle workflow taskProcessingResults.
     */
    private java.util.List<TaskProcessingResult> taskProcessingResults;
    /**
     * The total number of users in the run execution for which the associated task was scheduled to execute.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    private Integer totalUsersCount;
    /**
     * The number of users in the run execution for which the associated task is queued, in progress, or canceled.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    private Integer unprocessedUsersCount;
    /**
     * Instantiates a new taskReport and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TaskReport() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a taskReport
     */
    @javax.annotation.Nonnull
    public static TaskReport createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TaskReport();
    }
    /**
     * Gets the completedDateTime property value. The date time that the associated run completed. Value is null if the run has not completed.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.completedDateTime;
    }
    /**
     * Gets the failedUsersCount property value. The number of users in the run execution for which the associated task failed.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
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
        deserializerMap.put("failedUsersCount", (n) -> { this.setFailedUsersCount(n.getIntegerValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("processingStatus", (n) -> { this.setProcessingStatus(n.getEnumValue(LifecycleWorkflowProcessingStatus.class)); });
        deserializerMap.put("runId", (n) -> { this.setRunId(n.getStringValue()); });
        deserializerMap.put("startedDateTime", (n) -> { this.setStartedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("successfulUsersCount", (n) -> { this.setSuccessfulUsersCount(n.getIntegerValue()); });
        deserializerMap.put("task", (n) -> { this.setTask(n.getObjectValue(Task::createFromDiscriminatorValue)); });
        deserializerMap.put("taskDefinition", (n) -> { this.setTaskDefinition(n.getObjectValue(TaskDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("taskProcessingResults", (n) -> { this.setTaskProcessingResults(n.getCollectionOfObjectValues(TaskProcessingResult::createFromDiscriminatorValue)); });
        deserializerMap.put("totalUsersCount", (n) -> { this.setTotalUsersCount(n.getIntegerValue()); });
        deserializerMap.put("unprocessedUsersCount", (n) -> { this.setUnprocessedUsersCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastUpdatedDateTime property value. The date and time that the task report was last updated.
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
     * Gets the runId property value. The unique identifier of the associated run.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRunId() {
        return this.runId;
    }
    /**
     * Gets the startedDateTime property value. The date time that the associated run started. Value is null if the run has not started.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this.startedDateTime;
    }
    /**
     * Gets the successfulUsersCount property value. The number of users in the run execution for which the associated task succeeded.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSuccessfulUsersCount() {
        return this.successfulUsersCount;
    }
    /**
     * Gets the task property value. The task property
     * @return a task
     */
    @javax.annotation.Nullable
    public Task getTask() {
        return this.task;
    }
    /**
     * Gets the taskDefinition property value. The taskDefinition property
     * @return a taskDefinition
     */
    @javax.annotation.Nullable
    public TaskDefinition getTaskDefinition() {
        return this.taskDefinition;
    }
    /**
     * Gets the taskProcessingResults property value. The related lifecycle workflow taskProcessingResults.
     * @return a taskProcessingResult
     */
    @javax.annotation.Nullable
    public java.util.List<TaskProcessingResult> getTaskProcessingResults() {
        return this.taskProcessingResults;
    }
    /**
     * Gets the totalUsersCount property value. The total number of users in the run execution for which the associated task was scheduled to execute.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalUsersCount() {
        return this.totalUsersCount;
    }
    /**
     * Gets the unprocessedUsersCount property value. The number of users in the run execution for which the associated task is queued, in progress, or canceled.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnprocessedUsersCount() {
        return this.unprocessedUsersCount;
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
        writer.writeIntegerValue("failedUsersCount", this.getFailedUsersCount());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeEnumValue("processingStatus", this.getProcessingStatus());
        writer.writeStringValue("runId", this.getRunId());
        writer.writeOffsetDateTimeValue("startedDateTime", this.getStartedDateTime());
        writer.writeIntegerValue("successfulUsersCount", this.getSuccessfulUsersCount());
        writer.writeObjectValue("task", this.getTask());
        writer.writeObjectValue("taskDefinition", this.getTaskDefinition());
        writer.writeCollectionOfObjectValues("taskProcessingResults", this.getTaskProcessingResults());
        writer.writeIntegerValue("totalUsersCount", this.getTotalUsersCount());
        writer.writeIntegerValue("unprocessedUsersCount", this.getUnprocessedUsersCount());
    }
    /**
     * Sets the completedDateTime property value. The date time that the associated run completed. Value is null if the run has not completed.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.completedDateTime = value;
    }
    /**
     * Sets the failedUsersCount property value. The number of users in the run execution for which the associated task failed.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the failedUsersCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedUsersCount(@javax.annotation.Nullable final Integer value) {
        this.failedUsersCount = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. The date and time that the task report was last updated.
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
     * Sets the runId property value. The unique identifier of the associated run.
     * @param value Value to set for the runId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRunId(@javax.annotation.Nullable final String value) {
        this.runId = value;
    }
    /**
     * Sets the startedDateTime property value. The date time that the associated run started. Value is null if the run has not started.
     * @param value Value to set for the startedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startedDateTime = value;
    }
    /**
     * Sets the successfulUsersCount property value. The number of users in the run execution for which the associated task succeeded.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the successfulUsersCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSuccessfulUsersCount(@javax.annotation.Nullable final Integer value) {
        this.successfulUsersCount = value;
    }
    /**
     * Sets the task property value. The task property
     * @param value Value to set for the task property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTask(@javax.annotation.Nullable final Task value) {
        this.task = value;
    }
    /**
     * Sets the taskDefinition property value. The taskDefinition property
     * @param value Value to set for the taskDefinition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaskDefinition(@javax.annotation.Nullable final TaskDefinition value) {
        this.taskDefinition = value;
    }
    /**
     * Sets the taskProcessingResults property value. The related lifecycle workflow taskProcessingResults.
     * @param value Value to set for the taskProcessingResults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaskProcessingResults(@javax.annotation.Nullable final java.util.List<TaskProcessingResult> value) {
        this.taskProcessingResults = value;
    }
    /**
     * Sets the totalUsersCount property value. The total number of users in the run execution for which the associated task was scheduled to execute.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the totalUsersCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalUsersCount(@javax.annotation.Nullable final Integer value) {
        this.totalUsersCount = value;
    }
    /**
     * Sets the unprocessedUsersCount property value. The number of users in the run execution for which the associated task is queued, in progress, or canceled.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the unprocessedUsersCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnprocessedUsersCount(@javax.annotation.Nullable final Integer value) {
        this.unprocessedUsersCount = value;
    }
}
