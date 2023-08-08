package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.DeletedItemContainer;
import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LifecycleWorkflowsContainer extends Entity implements Parsable {
    /**
     * The customTaskExtension instance.
     */
    private java.util.List<CustomTaskExtension> customTaskExtensions;
    /**
     * Deleted workflows in your lifecycle workflows instance.
     */
    private DeletedItemContainer deletedItems;
    /**
     * The settings property
     */
    private LifecycleManagementSettings settings;
    /**
     * The definition of tasks within the lifecycle workflows instance.
     */
    private java.util.List<TaskDefinition> taskDefinitions;
    /**
     * The workflows in the lifecycle workflows instance.
     */
    private java.util.List<Workflow> workflows;
    /**
     * The workflow templates in the lifecycle workflow instance.
     */
    private java.util.List<WorkflowTemplate> workflowTemplates;
    /**
     * Instantiates a new lifecycleWorkflowsContainer and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public LifecycleWorkflowsContainer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a lifecycleWorkflowsContainer
     */
    @jakarta.annotation.Nonnull
    public static LifecycleWorkflowsContainer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LifecycleWorkflowsContainer();
    }
    /**
     * Gets the customTaskExtensions property value. The customTaskExtension instance.
     * @return a customTaskExtension
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomTaskExtension> getCustomTaskExtensions() {
        return this.customTaskExtensions;
    }
    /**
     * Gets the deletedItems property value. Deleted workflows in your lifecycle workflows instance.
     * @return a deletedItemContainer
     */
    @jakarta.annotation.Nullable
    public DeletedItemContainer getDeletedItems() {
        return this.deletedItems;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customTaskExtensions", (n) -> { this.setCustomTaskExtensions(n.getCollectionOfObjectValues(CustomTaskExtension::createFromDiscriminatorValue)); });
        deserializerMap.put("deletedItems", (n) -> { this.setDeletedItems(n.getObjectValue(DeletedItemContainer::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(LifecycleManagementSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("taskDefinitions", (n) -> { this.setTaskDefinitions(n.getCollectionOfObjectValues(TaskDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("workflows", (n) -> { this.setWorkflows(n.getCollectionOfObjectValues(Workflow::createFromDiscriminatorValue)); });
        deserializerMap.put("workflowTemplates", (n) -> { this.setWorkflowTemplates(n.getCollectionOfObjectValues(WorkflowTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the settings property value. The settings property
     * @return a lifecycleManagementSettings
     */
    @jakarta.annotation.Nullable
    public LifecycleManagementSettings getSettings() {
        return this.settings;
    }
    /**
     * Gets the taskDefinitions property value. The definition of tasks within the lifecycle workflows instance.
     * @return a taskDefinition
     */
    @jakarta.annotation.Nullable
    public java.util.List<TaskDefinition> getTaskDefinitions() {
        return this.taskDefinitions;
    }
    /**
     * Gets the workflows property value. The workflows in the lifecycle workflows instance.
     * @return a workflow
     */
    @jakarta.annotation.Nullable
    public java.util.List<Workflow> getWorkflows() {
        return this.workflows;
    }
    /**
     * Gets the workflowTemplates property value. The workflow templates in the lifecycle workflow instance.
     * @return a workflowTemplate
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkflowTemplate> getWorkflowTemplates() {
        return this.workflowTemplates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("customTaskExtensions", this.getCustomTaskExtensions());
        writer.writeObjectValue("deletedItems", this.getDeletedItems());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeCollectionOfObjectValues("taskDefinitions", this.getTaskDefinitions());
        writer.writeCollectionOfObjectValues("workflows", this.getWorkflows());
        writer.writeCollectionOfObjectValues("workflowTemplates", this.getWorkflowTemplates());
    }
    /**
     * Sets the customTaskExtensions property value. The customTaskExtension instance.
     * @param value Value to set for the customTaskExtensions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCustomTaskExtensions(@jakarta.annotation.Nullable final java.util.List<CustomTaskExtension> value) {
        this.customTaskExtensions = value;
    }
    /**
     * Sets the deletedItems property value. Deleted workflows in your lifecycle workflows instance.
     * @param value Value to set for the deletedItems property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeletedItems(@jakarta.annotation.Nullable final DeletedItemContainer value) {
        this.deletedItems = value;
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSettings(@jakarta.annotation.Nullable final LifecycleManagementSettings value) {
        this.settings = value;
    }
    /**
     * Sets the taskDefinitions property value. The definition of tasks within the lifecycle workflows instance.
     * @param value Value to set for the taskDefinitions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTaskDefinitions(@jakarta.annotation.Nullable final java.util.List<TaskDefinition> value) {
        this.taskDefinitions = value;
    }
    /**
     * Sets the workflows property value. The workflows in the lifecycle workflows instance.
     * @param value Value to set for the workflows property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWorkflows(@jakarta.annotation.Nullable final java.util.List<Workflow> value) {
        this.workflows = value;
    }
    /**
     * Sets the workflowTemplates property value. The workflow templates in the lifecycle workflow instance.
     * @param value Value to set for the workflowTemplates property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWorkflowTemplates(@jakarta.annotation.Nullable final java.util.List<WorkflowTemplate> value) {
        this.workflowTemplates = value;
    }
}
