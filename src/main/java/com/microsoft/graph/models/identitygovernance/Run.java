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
public class Run extends Entity implements Parsable {
    /**
     * Instantiates a new Run and sets the default values.
     */
    public Run() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Run
     */
    @jakarta.annotation.Nonnull
    public static Run createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Run();
    }
    /**
     * Gets the completedDateTime property value. The date time that the run completed. Value is null if the workflow hasn't completed.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.getBackingStore().get("completedDateTime");
    }
    /**
     * Gets the failedTasksCount property value. The number of tasks that failed in the run execution.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFailedTasksCount() {
        return this.getBackingStore().get("failedTasksCount");
    }
    /**
     * Gets the failedUsersCount property value. The number of users that failed in the run execution.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFailedUsersCount() {
        return this.getBackingStore().get("failedUsersCount");
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
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.getBackingStore().get("lastUpdatedDateTime");
    }
    /**
     * Gets the processingStatus property value. The processingStatus property
     * @return a LifecycleWorkflowProcessingStatus
     */
    @jakarta.annotation.Nullable
    public LifecycleWorkflowProcessingStatus getProcessingStatus() {
        return this.getBackingStore().get("processingStatus");
    }
    /**
     * Gets the scheduledDateTime property value. The date time that the run is scheduled to be executed for a workflow.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getScheduledDateTime() {
        return this.getBackingStore().get("scheduledDateTime");
    }
    /**
     * Gets the startedDateTime property value. The date time that the run execution started.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this.getBackingStore().get("startedDateTime");
    }
    /**
     * Gets the successfulUsersCount property value. The number of successfully completed users in the run.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulUsersCount() {
        return this.getBackingStore().get("successfulUsersCount");
    }
    /**
     * Gets the taskProcessingResults property value. The related taskProcessingResults.
     * @return a java.util.List<TaskProcessingResult>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TaskProcessingResult> getTaskProcessingResults() {
        return this.getBackingStore().get("taskProcessingResults");
    }
    /**
     * Gets the totalTasksCount property value. The totalTasksCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalTasksCount() {
        return this.getBackingStore().get("totalTasksCount");
    }
    /**
     * Gets the totalUnprocessedTasksCount property value. The total number of unprocessed tasks in the run execution.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalUnprocessedTasksCount() {
        return this.getBackingStore().get("totalUnprocessedTasksCount");
    }
    /**
     * Gets the totalUsersCount property value. The total number of users in the workflow execution.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalUsersCount() {
        return this.getBackingStore().get("totalUsersCount");
    }
    /**
     * Gets the userProcessingResults property value. The associated individual user execution.
     * @return a java.util.List<UserProcessingResult>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserProcessingResult> getUserProcessingResults() {
        return this.getBackingStore().get("userProcessingResults");
    }
    /**
     * Gets the workflowExecutionType property value. The workflowExecutionType property
     * @return a WorkflowExecutionType
     */
    @jakarta.annotation.Nullable
    public WorkflowExecutionType getWorkflowExecutionType() {
        return this.getBackingStore().get("workflowExecutionType");
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
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("completedDateTime", value);
    }
    /**
     * Sets the failedTasksCount property value. The number of tasks that failed in the run execution.
     * @param value Value to set for the failedTasksCount property.
     */
    public void setFailedTasksCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("failedTasksCount", value);
    }
    /**
     * Sets the failedUsersCount property value. The number of users that failed in the run execution.
     * @param value Value to set for the failedUsersCount property.
     */
    public void setFailedUsersCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("failedUsersCount", value);
    }
    /**
     * Sets the lastUpdatedDateTime property value. The datetime that the run was last updated.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("lastUpdatedDateTime", value);
    }
    /**
     * Sets the processingStatus property value. The processingStatus property
     * @param value Value to set for the processingStatus property.
     */
    public void setProcessingStatus(@jakarta.annotation.Nullable final LifecycleWorkflowProcessingStatus value) {
        this.getBackingStore().set("processingStatus", value);
    }
    /**
     * Sets the scheduledDateTime property value. The date time that the run is scheduled to be executed for a workflow.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the scheduledDateTime property.
     */
    public void setScheduledDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("scheduledDateTime", value);
    }
    /**
     * Sets the startedDateTime property value. The date time that the run execution started.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the startedDateTime property.
     */
    public void setStartedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("startedDateTime", value);
    }
    /**
     * Sets the successfulUsersCount property value. The number of successfully completed users in the run.
     * @param value Value to set for the successfulUsersCount property.
     */
    public void setSuccessfulUsersCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("successfulUsersCount", value);
    }
    /**
     * Sets the taskProcessingResults property value. The related taskProcessingResults.
     * @param value Value to set for the taskProcessingResults property.
     */
    public void setTaskProcessingResults(@jakarta.annotation.Nullable final java.util.List<TaskProcessingResult> value) {
        this.getBackingStore().set("taskProcessingResults", value);
    }
    /**
     * Sets the totalTasksCount property value. The totalTasksCount property
     * @param value Value to set for the totalTasksCount property.
     */
    public void setTotalTasksCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("totalTasksCount", value);
    }
    /**
     * Sets the totalUnprocessedTasksCount property value. The total number of unprocessed tasks in the run execution.
     * @param value Value to set for the totalUnprocessedTasksCount property.
     */
    public void setTotalUnprocessedTasksCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("totalUnprocessedTasksCount", value);
    }
    /**
     * Sets the totalUsersCount property value. The total number of users in the workflow execution.
     * @param value Value to set for the totalUsersCount property.
     */
    public void setTotalUsersCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("totalUsersCount", value);
    }
    /**
     * Sets the userProcessingResults property value. The associated individual user execution.
     * @param value Value to set for the userProcessingResults property.
     */
    public void setUserProcessingResults(@jakarta.annotation.Nullable final java.util.List<UserProcessingResult> value) {
        this.getBackingStore().set("userProcessingResults", value);
    }
    /**
     * Sets the workflowExecutionType property value. The workflowExecutionType property
     * @param value Value to set for the workflowExecutionType property.
     */
    public void setWorkflowExecutionType(@jakarta.annotation.Nullable final WorkflowExecutionType value) {
        this.getBackingStore().set("workflowExecutionType", value);
    }
}
