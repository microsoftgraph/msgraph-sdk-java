package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkflowTemplate extends Entity implements Parsable {
    /**
     * The category property
     */
    private LifecycleWorkflowCategory category;
    /**
     * The description of the workflowTemplate.
     */
    private String description;
    /**
     * The display name of the workflowTemplate.Supports $filter(eq, ne) and $orderby.
     */
    private String displayName;
    /**
     * Conditions describing when to execute the workflow and the criteria to identify in-scope subject set.
     */
    private WorkflowExecutionConditions executionConditions;
    /**
     * Represents the configured tasks to execute and their execution sequence within a workflow. This relationship is expanded by default.
     */
    private java.util.List<Task> tasks;
    /**
     * Instantiates a new WorkflowTemplate and sets the default values.
     */
    public WorkflowTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkflowTemplate
     */
    @jakarta.annotation.Nonnull
    public static WorkflowTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkflowTemplate();
    }
    /**
     * Gets the category property value. The category property
     * @return a LifecycleWorkflowCategory
     */
    @jakarta.annotation.Nullable
    public LifecycleWorkflowCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the description property value. The description of the workflowTemplate.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name of the workflowTemplate.Supports $filter(eq, ne) and $orderby.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the executionConditions property value. Conditions describing when to execute the workflow and the criteria to identify in-scope subject set.
     * @return a WorkflowExecutionConditions
     */
    @jakarta.annotation.Nullable
    public WorkflowExecutionConditions getExecutionConditions() {
        return this.executionConditions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(LifecycleWorkflowCategory.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("executionConditions", (n) -> { this.setExecutionConditions(n.getObjectValue(WorkflowExecutionConditions::createFromDiscriminatorValue)); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(Task::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the tasks property value. Represents the configured tasks to execute and their execution sequence within a workflow. This relationship is expanded by default.
     * @return a java.util.List<Task>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Task> getTasks() {
        return this.tasks;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("executionConditions", this.getExecutionConditions());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final LifecycleWorkflowCategory value) {
        this.category = value;
    }
    /**
     * Sets the description property value. The description of the workflowTemplate.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name of the workflowTemplate.Supports $filter(eq, ne) and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the executionConditions property value. Conditions describing when to execute the workflow and the criteria to identify in-scope subject set.
     * @param value Value to set for the executionConditions property.
     */
    public void setExecutionConditions(@jakarta.annotation.Nullable final WorkflowExecutionConditions value) {
        this.executionConditions = value;
    }
    /**
     * Sets the tasks property value. Represents the configured tasks to execute and their execution sequence within a workflow. This relationship is expanded by default.
     * @param value Value to set for the tasks property.
     */
    public void setTasks(@jakarta.annotation.Nullable final java.util.List<Task> value) {
        this.tasks = value;
    }
}
