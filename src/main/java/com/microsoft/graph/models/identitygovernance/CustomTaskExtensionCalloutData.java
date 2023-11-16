package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.CustomExtensionData;
import com.microsoft.graph.models.User;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomTaskExtensionCalloutData extends CustomExtensionData implements Parsable {
    /**
     * Instantiates a new CustomTaskExtensionCalloutData and sets the default values.
     */
    public CustomTaskExtensionCalloutData() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.customTaskExtensionCalloutData");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CustomTaskExtensionCalloutData
     */
    @jakarta.annotation.Nonnull
    public static CustomTaskExtensionCalloutData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomTaskExtensionCalloutData();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getObjectValue(User::createFromDiscriminatorValue)); });
        deserializerMap.put("task", (n) -> { this.setTask(n.getObjectValue(Task::createFromDiscriminatorValue)); });
        deserializerMap.put("taskProcessingresult", (n) -> { this.setTaskProcessingresult(n.getObjectValue(TaskProcessingResult::createFromDiscriminatorValue)); });
        deserializerMap.put("workflow", (n) -> { this.setWorkflow(n.getObjectValue(Workflow::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a User
     */
    @jakarta.annotation.Nullable
    public User getSubject() {
        return this.BackingStore.get("subject");
    }
    /**
     * Gets the task property value. The task property
     * @return a Task
     */
    @jakarta.annotation.Nullable
    public Task getTask() {
        return this.BackingStore.get("task");
    }
    /**
     * Gets the taskProcessingresult property value. The taskProcessingresult property
     * @return a TaskProcessingResult
     */
    @jakarta.annotation.Nullable
    public TaskProcessingResult getTaskProcessingresult() {
        return this.BackingStore.get("taskProcessingresult");
    }
    /**
     * Gets the workflow property value. The workflow property
     * @return a Workflow
     */
    @jakarta.annotation.Nullable
    public Workflow getWorkflow() {
        return this.BackingStore.get("workflow");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("subject", this.getSubject());
        writer.writeObjectValue("task", this.getTask());
        writer.writeObjectValue("taskProcessingresult", this.getTaskProcessingresult());
        writer.writeObjectValue("workflow", this.getWorkflow());
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final User value) {
        this.BackingStore.set("subject", value);
    }
    /**
     * Sets the task property value. The task property
     * @param value Value to set for the task property.
     */
    public void setTask(@jakarta.annotation.Nullable final Task value) {
        this.BackingStore.set("task", value);
    }
    /**
     * Sets the taskProcessingresult property value. The taskProcessingresult property
     * @param value Value to set for the taskProcessingresult property.
     */
    public void setTaskProcessingresult(@jakarta.annotation.Nullable final TaskProcessingResult value) {
        this.BackingStore.set("taskProcessingresult", value);
    }
    /**
     * Sets the workflow property value. The workflow property
     * @param value Value to set for the workflow property.
     */
    public void setWorkflow(@jakarta.annotation.Nullable final Workflow value) {
        this.BackingStore.set("workflow", value);
    }
}
