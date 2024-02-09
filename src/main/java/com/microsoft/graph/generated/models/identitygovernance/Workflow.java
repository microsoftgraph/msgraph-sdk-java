package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Workflow extends WorkflowBase implements Parsable {
    /**
     * Instantiates a new {@link Workflow} and sets the default values.
     */
    public Workflow() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.workflow");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Workflow}
     */
    @jakarta.annotation.Nonnull
    public static Workflow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Workflow();
    }
    /**
     * Gets the deletedDateTime property value. When the workflow was deleted.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeletedDateTime() {
        return this.backingStore.get("deletedDateTime");
    }
    /**
     * Gets the executionScope property value. The unique identifier of the Microsoft Entra identity that last modified the workflow object.
     * @return a {@link java.util.List<UserProcessingResult>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserProcessingResult> getExecutionScope() {
        return this.backingStore.get("executionScope");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deletedDateTime", (n) -> { this.setDeletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("executionScope", (n) -> { this.setExecutionScope(n.getCollectionOfObjectValues(UserProcessingResult::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("nextScheduleRunDateTime", (n) -> { this.setNextScheduleRunDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("runs", (n) -> { this.setRuns(n.getCollectionOfObjectValues(Run::createFromDiscriminatorValue)); });
        deserializerMap.put("taskReports", (n) -> { this.setTaskReports(n.getCollectionOfObjectValues(TaskReport::createFromDiscriminatorValue)); });
        deserializerMap.put("userProcessingResults", (n) -> { this.setUserProcessingResults(n.getCollectionOfObjectValues(UserProcessingResult::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        deserializerMap.put("versions", (n) -> { this.setVersions(n.getCollectionOfObjectValues(WorkflowVersion::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Identifier used for individually addressing a specific workflow.Supports $filter(eq, ne) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the nextScheduleRunDateTime property value. The date time when the workflow is expected to run next based on the schedule interval, if there are any users matching the execution conditions. Supports $filter(lt,gt) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getNextScheduleRunDateTime() {
        return this.backingStore.get("nextScheduleRunDateTime");
    }
    /**
     * Gets the runs property value. Workflow runs.
     * @return a {@link java.util.List<Run>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Run> getRuns() {
        return this.backingStore.get("runs");
    }
    /**
     * Gets the taskReports property value. Represents the aggregation of task execution data for tasks within a workflow object.
     * @return a {@link java.util.List<TaskReport>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TaskReport> getTaskReports() {
        return this.backingStore.get("taskReports");
    }
    /**
     * Gets the userProcessingResults property value. Per-user workflow execution results.
     * @return a {@link java.util.List<UserProcessingResult>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserProcessingResult> getUserProcessingResults() {
        return this.backingStore.get("userProcessingResults");
    }
    /**
     * Gets the version property value. The current version number of the workflow. Value is 1 when the workflow is first created.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Gets the versions property value. The workflow versions that are available.
     * @return a {@link java.util.List<WorkflowVersion>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkflowVersion> getVersions() {
        return this.backingStore.get("versions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("deletedDateTime", this.getDeletedDateTime());
        writer.writeCollectionOfObjectValues("executionScope", this.getExecutionScope());
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("nextScheduleRunDateTime", this.getNextScheduleRunDateTime());
        writer.writeCollectionOfObjectValues("runs", this.getRuns());
        writer.writeCollectionOfObjectValues("taskReports", this.getTaskReports());
        writer.writeCollectionOfObjectValues("userProcessingResults", this.getUserProcessingResults());
        writer.writeIntegerValue("version", this.getVersion());
        writer.writeCollectionOfObjectValues("versions", this.getVersions());
    }
    /**
     * Sets the deletedDateTime property value. When the workflow was deleted.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the deletedDateTime property.
     */
    public void setDeletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("deletedDateTime", value);
    }
    /**
     * Sets the executionScope property value. The unique identifier of the Microsoft Entra identity that last modified the workflow object.
     * @param value Value to set for the executionScope property.
     */
    public void setExecutionScope(@jakarta.annotation.Nullable final java.util.List<UserProcessingResult> value) {
        this.backingStore.set("executionScope", value);
    }
    /**
     * Sets the id property value. Identifier used for individually addressing a specific workflow.Supports $filter(eq, ne) and $orderby.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the nextScheduleRunDateTime property value. The date time when the workflow is expected to run next based on the schedule interval, if there are any users matching the execution conditions. Supports $filter(lt,gt) and $orderby.
     * @param value Value to set for the nextScheduleRunDateTime property.
     */
    public void setNextScheduleRunDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("nextScheduleRunDateTime", value);
    }
    /**
     * Sets the runs property value. Workflow runs.
     * @param value Value to set for the runs property.
     */
    public void setRuns(@jakarta.annotation.Nullable final java.util.List<Run> value) {
        this.backingStore.set("runs", value);
    }
    /**
     * Sets the taskReports property value. Represents the aggregation of task execution data for tasks within a workflow object.
     * @param value Value to set for the taskReports property.
     */
    public void setTaskReports(@jakarta.annotation.Nullable final java.util.List<TaskReport> value) {
        this.backingStore.set("taskReports", value);
    }
    /**
     * Sets the userProcessingResults property value. Per-user workflow execution results.
     * @param value Value to set for the userProcessingResults property.
     */
    public void setUserProcessingResults(@jakarta.annotation.Nullable final java.util.List<UserProcessingResult> value) {
        this.backingStore.set("userProcessingResults", value);
    }
    /**
     * Sets the version property value. The current version number of the workflow. Value is 1 when the workflow is first created.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("version", value);
    }
    /**
     * Sets the versions property value. The workflow versions that are available.
     * @param value Value to set for the versions property.
     */
    public void setVersions(@jakarta.annotation.Nullable final java.util.List<WorkflowVersion> value) {
        this.backingStore.set("versions", value);
    }
}
