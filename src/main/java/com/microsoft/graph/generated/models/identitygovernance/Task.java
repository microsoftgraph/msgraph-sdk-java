package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Task extends Entity implements Parsable {
    /**
     * Instantiates a new Task and sets the default values.
     */
    public Task() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Task
     */
    @jakarta.annotation.Nonnull
    public static Task createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Task();
    }
    /**
     * Gets the arguments property value. Arguments included within the task.  For guidance to configure this property, see Configure the arguments for built-in Lifecycle Workflow tasks. Required.
     * @return a java.util.List<KeyValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getArguments() {
        return this.backingStore.get("arguments");
    }
    /**
     * Gets the category property value. The category property
     * @return a EnumSet<LifecycleTaskCategory>
     */
    @jakarta.annotation.Nullable
    public EnumSet<LifecycleTaskCategory> getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * Gets the continueOnError property value. A boolean value that specifies whether, if this task fails, the workflow will stop, and subsequent tasks will not run. Optional.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getContinueOnError() {
        return this.backingStore.get("continueOnError");
    }
    /**
     * Gets the description property value. A string that describes the purpose of the task for administrative use. Optional.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. A unique string that identifies the task. Required.Supports $filter(eq, ne) and orderBy.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the executionSequence property value. An integer that states in what order the task will run in a workflow.Supports $orderby.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getExecutionSequence() {
        return this.backingStore.get("executionSequence");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("arguments", (n) -> { this.setArguments(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumSetValue(LifecycleTaskCategory::forValue)); });
        deserializerMap.put("continueOnError", (n) -> { this.setContinueOnError(n.getBooleanValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("executionSequence", (n) -> { this.setExecutionSequence(n.getIntegerValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("taskDefinitionId", (n) -> { this.setTaskDefinitionId(n.getStringValue()); });
        deserializerMap.put("taskProcessingResults", (n) -> { this.setTaskProcessingResults(n.getCollectionOfObjectValues(TaskProcessingResult::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. A boolean value that denotes whether the task is set to run or not. Optional.Supports $filter(eq, ne) and orderBy.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the taskDefinitionId property value. A unique template identifier for the task. For more information about the tasks that Lifecycle Workflows currently supports and their unique identifiers, see supported tasks. Required.Supports $filter(eq, ne).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTaskDefinitionId() {
        return this.backingStore.get("taskDefinitionId");
    }
    /**
     * Gets the taskProcessingResults property value. The result of processing the task.
     * @return a java.util.List<TaskProcessingResult>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TaskProcessingResult> getTaskProcessingResults() {
        return this.backingStore.get("taskProcessingResults");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("arguments", this.getArguments());
        writer.writeEnumSetValue("category", this.getCategory());
        writer.writeBooleanValue("continueOnError", this.getContinueOnError());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("executionSequence", this.getExecutionSequence());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeStringValue("taskDefinitionId", this.getTaskDefinitionId());
        writer.writeCollectionOfObjectValues("taskProcessingResults", this.getTaskProcessingResults());
    }
    /**
     * Sets the arguments property value. Arguments included within the task.  For guidance to configure this property, see Configure the arguments for built-in Lifecycle Workflow tasks. Required.
     * @param value Value to set for the arguments property.
     */
    public void setArguments(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.backingStore.set("arguments", value);
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final EnumSet<LifecycleTaskCategory> value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the continueOnError property value. A boolean value that specifies whether, if this task fails, the workflow will stop, and subsequent tasks will not run. Optional.
     * @param value Value to set for the continueOnError property.
     */
    public void setContinueOnError(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("continueOnError", value);
    }
    /**
     * Sets the description property value. A string that describes the purpose of the task for administrative use. Optional.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. A unique string that identifies the task. Required.Supports $filter(eq, ne) and orderBy.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the executionSequence property value. An integer that states in what order the task will run in a workflow.Supports $orderby.
     * @param value Value to set for the executionSequence property.
     */
    public void setExecutionSequence(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("executionSequence", value);
    }
    /**
     * Sets the isEnabled property value. A boolean value that denotes whether the task is set to run or not. Optional.Supports $filter(eq, ne) and orderBy.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the taskDefinitionId property value. A unique template identifier for the task. For more information about the tasks that Lifecycle Workflows currently supports and their unique identifiers, see supported tasks. Required.Supports $filter(eq, ne).
     * @param value Value to set for the taskDefinitionId property.
     */
    public void setTaskDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("taskDefinitionId", value);
    }
    /**
     * Sets the taskProcessingResults property value. The result of processing the task.
     * @param value Value to set for the taskProcessingResults property.
     */
    public void setTaskProcessingResults(@jakarta.annotation.Nullable final java.util.List<TaskProcessingResult> value) {
        this.backingStore.set("taskProcessingResults", value);
    }
}
