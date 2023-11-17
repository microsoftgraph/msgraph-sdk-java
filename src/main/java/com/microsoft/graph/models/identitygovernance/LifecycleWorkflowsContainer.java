package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.DeletedItemContainer;
import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LifecycleWorkflowsContainer extends Entity implements Parsable {
    /**
     * Instantiates a new LifecycleWorkflowsContainer and sets the default values.
     */
    public LifecycleWorkflowsContainer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LifecycleWorkflowsContainer
     */
    @jakarta.annotation.Nonnull
    public static LifecycleWorkflowsContainer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LifecycleWorkflowsContainer();
    }
    /**
     * Gets the customTaskExtensions property value. The customTaskExtension instance.
     * @return a java.util.List<CustomTaskExtension>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomTaskExtension> getCustomTaskExtensions() {
        return this.backingStore.get("customTaskExtensions");
    }
    /**
     * Gets the deletedItems property value. Deleted workflows in your lifecycle workflows instance.
     * @return a DeletedItemContainer
     */
    @jakarta.annotation.Nullable
    public DeletedItemContainer getDeletedItems() {
        return this.backingStore.get("deletedItems");
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
     * @return a LifecycleManagementSettings
     */
    @jakarta.annotation.Nullable
    public LifecycleManagementSettings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Gets the taskDefinitions property value. The definition of tasks within the lifecycle workflows instance.
     * @return a java.util.List<TaskDefinition>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TaskDefinition> getTaskDefinitions() {
        return this.backingStore.get("taskDefinitions");
    }
    /**
     * Gets the workflows property value. The workflows in the lifecycle workflows instance.
     * @return a java.util.List<Workflow>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Workflow> getWorkflows() {
        return this.backingStore.get("workflows");
    }
    /**
     * Gets the workflowTemplates property value. The workflow templates in the lifecycle workflow instance.
     * @return a java.util.List<WorkflowTemplate>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkflowTemplate> getWorkflowTemplates() {
        return this.backingStore.get("workflowTemplates");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     */
    public void setCustomTaskExtensions(@jakarta.annotation.Nullable final java.util.List<CustomTaskExtension> value) {
        this.backingStore.set("customTaskExtensions", value);
    }
    /**
     * Sets the deletedItems property value. Deleted workflows in your lifecycle workflows instance.
     * @param value Value to set for the deletedItems property.
     */
    public void setDeletedItems(@jakarta.annotation.Nullable final DeletedItemContainer value) {
        this.backingStore.set("deletedItems", value);
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final LifecycleManagementSettings value) {
        this.backingStore.set("settings", value);
    }
    /**
     * Sets the taskDefinitions property value. The definition of tasks within the lifecycle workflows instance.
     * @param value Value to set for the taskDefinitions property.
     */
    public void setTaskDefinitions(@jakarta.annotation.Nullable final java.util.List<TaskDefinition> value) {
        this.backingStore.set("taskDefinitions", value);
    }
    /**
     * Sets the workflows property value. The workflows in the lifecycle workflows instance.
     * @param value Value to set for the workflows property.
     */
    public void setWorkflows(@jakarta.annotation.Nullable final java.util.List<Workflow> value) {
        this.backingStore.set("workflows", value);
    }
    /**
     * Sets the workflowTemplates property value. The workflow templates in the lifecycle workflow instance.
     * @param value Value to set for the workflowTemplates property.
     */
    public void setWorkflowTemplates(@jakarta.annotation.Nullable final java.util.List<WorkflowTemplate> value) {
        this.backingStore.set("workflowTemplates", value);
    }
}
