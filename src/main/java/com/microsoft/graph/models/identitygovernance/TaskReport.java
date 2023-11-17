package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TaskReport extends Entity implements Parsable {
    /**
     * Instantiates a new TaskReport and sets the default values.
     */
    public TaskReport() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TaskReport
     */
    @jakarta.annotation.Nonnull
    public static TaskReport createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TaskReport();
    }
    /**
     * Gets the completedDateTime property value. The date time that the associated run completed. Value is null if the run has not completed.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.backingStore.get("completedDateTime");
    }
    /**
     * Gets the failedUsersCount property value. The number of users in the run execution for which the associated task failed.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFailedUsersCount() {
        return this.backingStore.get("failedUsersCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.backingStore.get("lastUpdatedDateTime");
    }
    /**
     * Gets the processingStatus property value. The processingStatus property
     * @return a LifecycleWorkflowProcessingStatus
     */
    @jakarta.annotation.Nullable
    public LifecycleWorkflowProcessingStatus getProcessingStatus() {
        return this.backingStore.get("processingStatus");
    }
    /**
     * Gets the runId property value. The unique identifier of the associated run.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRunId() {
        return this.backingStore.get("runId");
    }
    /**
     * Gets the startedDateTime property value. The date time that the associated run started. Value is null if the run has not started.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this.backingStore.get("startedDateTime");
    }
    /**
     * Gets the successfulUsersCount property value. The number of users in the run execution for which the associated task succeeded.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulUsersCount() {
        return this.backingStore.get("successfulUsersCount");
    }
    /**
     * Gets the task property value. The task property
     * @return a Task
     */
    @jakarta.annotation.Nullable
    public Task getTask() {
        return this.backingStore.get("task");
    }
    /**
     * Gets the taskDefinition property value. The taskDefinition property
     * @return a TaskDefinition
     */
    @jakarta.annotation.Nullable
    public TaskDefinition getTaskDefinition() {
        return this.backingStore.get("taskDefinition");
    }
    /**
     * Gets the taskProcessingResults property value. The related lifecycle workflow taskProcessingResults.
     * @return a java.util.List<TaskProcessingResult>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TaskProcessingResult> getTaskProcessingResults() {
        return this.backingStore.get("taskProcessingResults");
    }
    /**
     * Gets the totalUsersCount property value. The total number of users in the run execution for which the associated task was scheduled to execute.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalUsersCount() {
        return this.backingStore.get("totalUsersCount");
    }
    /**
     * Gets the unprocessedUsersCount property value. The number of users in the run execution for which the associated task is queued, in progress, or canceled.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUnprocessedUsersCount() {
        return this.backingStore.get("unprocessedUsersCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("completedDateTime", value);
    }
    /**
     * Sets the failedUsersCount property value. The number of users in the run execution for which the associated task failed.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the failedUsersCount property.
     */
    public void setFailedUsersCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedUsersCount", value);
    }
    /**
     * Sets the lastUpdatedDateTime property value. The date and time that the task report was last updated.
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdatedDateTime", value);
    }
    /**
     * Sets the processingStatus property value. The processingStatus property
     * @param value Value to set for the processingStatus property.
     */
    public void setProcessingStatus(@jakarta.annotation.Nullable final LifecycleWorkflowProcessingStatus value) {
        this.backingStore.set("processingStatus", value);
    }
    /**
     * Sets the runId property value. The unique identifier of the associated run.
     * @param value Value to set for the runId property.
     */
    public void setRunId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("runId", value);
    }
    /**
     * Sets the startedDateTime property value. The date time that the associated run started. Value is null if the run has not started.
     * @param value Value to set for the startedDateTime property.
     */
    public void setStartedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startedDateTime", value);
    }
    /**
     * Sets the successfulUsersCount property value. The number of users in the run execution for which the associated task succeeded.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the successfulUsersCount property.
     */
    public void setSuccessfulUsersCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("successfulUsersCount", value);
    }
    /**
     * Sets the task property value. The task property
     * @param value Value to set for the task property.
     */
    public void setTask(@jakarta.annotation.Nullable final Task value) {
        this.backingStore.set("task", value);
    }
    /**
     * Sets the taskDefinition property value. The taskDefinition property
     * @param value Value to set for the taskDefinition property.
     */
    public void setTaskDefinition(@jakarta.annotation.Nullable final TaskDefinition value) {
        this.backingStore.set("taskDefinition", value);
    }
    /**
     * Sets the taskProcessingResults property value. The related lifecycle workflow taskProcessingResults.
     * @param value Value to set for the taskProcessingResults property.
     */
    public void setTaskProcessingResults(@jakarta.annotation.Nullable final java.util.List<TaskProcessingResult> value) {
        this.backingStore.set("taskProcessingResults", value);
    }
    /**
     * Sets the totalUsersCount property value. The total number of users in the run execution for which the associated task was scheduled to execute.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the totalUsersCount property.
     */
    public void setTotalUsersCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalUsersCount", value);
    }
    /**
     * Sets the unprocessedUsersCount property value. The number of users in the run execution for which the associated task is queued, in progress, or canceled.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the unprocessedUsersCount property.
     */
    public void setUnprocessedUsersCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("unprocessedUsersCount", value);
    }
}
