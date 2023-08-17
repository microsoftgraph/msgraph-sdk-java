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
public class TaskProcessingResult extends Entity implements Parsable {
    /**
     * The date time when taskProcessingResult execution ended. Value is null if task execution is still in progress.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    private OffsetDateTime completedDateTime;
    /**
     * The date time when the taskProcessingResult was created.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Describes why the taskProcessingResult has failed.
     */
    private String failureReason;
    /**
     * The processingStatus property
     */
    private LifecycleWorkflowProcessingStatus processingStatus;
    /**
     * The date time when taskProcessingResult execution started. Value is null if task execution has not yet started.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    private OffsetDateTime startedDateTime;
    /**
     * The subject property
     */
    private User subject;
    /**
     * The task property
     */
    private Task task;
    /**
     * Instantiates a new taskProcessingResult and sets the default values.
     */
    public TaskProcessingResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a taskProcessingResult
     */
    @jakarta.annotation.Nonnull
    public static TaskProcessingResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TaskProcessingResult();
    }
    /**
     * Gets the completedDateTime property value. The date time when taskProcessingResult execution ended. Value is null if task execution is still in progress.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.completedDateTime;
    }
    /**
     * Gets the createdDateTime property value. The date time when the taskProcessingResult was created.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the failureReason property value. Describes why the taskProcessingResult has failed.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFailureReason() {
        return this.failureReason;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("failureReason", (n) -> { this.setFailureReason(n.getStringValue()); });
        deserializerMap.put("processingStatus", (n) -> { this.setProcessingStatus(n.getEnumValue(LifecycleWorkflowProcessingStatus.class)); });
        deserializerMap.put("startedDateTime", (n) -> { this.setStartedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getObjectValue(User::createFromDiscriminatorValue)); });
        deserializerMap.put("task", (n) -> { this.setTask(n.getObjectValue(Task::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the processingStatus property value. The processingStatus property
     * @return a lifecycleWorkflowProcessingStatus
     */
    @jakarta.annotation.Nullable
    public LifecycleWorkflowProcessingStatus getProcessingStatus() {
        return this.processingStatus;
    }
    /**
     * Gets the startedDateTime property value. The date time when taskProcessingResult execution started. Value is null if task execution has not yet started.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this.startedDateTime;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a user
     */
    @jakarta.annotation.Nullable
    public User getSubject() {
        return this.subject;
    }
    /**
     * Gets the task property value. The task property
     * @return a task
     */
    @jakarta.annotation.Nullable
    public Task getTask() {
        return this.task;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("failureReason", this.getFailureReason());
        writer.writeEnumValue("processingStatus", this.getProcessingStatus());
        writer.writeOffsetDateTimeValue("startedDateTime", this.getStartedDateTime());
        writer.writeObjectValue("subject", this.getSubject());
        writer.writeObjectValue("task", this.getTask());
    }
    /**
     * Sets the completedDateTime property value. The date time when taskProcessingResult execution ended. Value is null if task execution is still in progress.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.completedDateTime = value;
    }
    /**
     * Sets the createdDateTime property value. The date time when the taskProcessingResult was created.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the failureReason property value. Describes why the taskProcessingResult has failed.
     * @param value Value to set for the failureReason property.
     */
    public void setFailureReason(@jakarta.annotation.Nullable final String value) {
        this.failureReason = value;
    }
    /**
     * Sets the processingStatus property value. The processingStatus property
     * @param value Value to set for the processingStatus property.
     */
    public void setProcessingStatus(@jakarta.annotation.Nullable final LifecycleWorkflowProcessingStatus value) {
        this.processingStatus = value;
    }
    /**
     * Sets the startedDateTime property value. The date time when taskProcessingResult execution started. Value is null if task execution has not yet started.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
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
     * Sets the task property value. The task property
     * @param value Value to set for the task property.
     */
    public void setTask(@jakarta.annotation.Nullable final Task value) {
        this.task = value;
    }
}
