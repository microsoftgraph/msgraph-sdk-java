package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.SubjectSet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TriggerAndScopeBasedConditions extends WorkflowExecutionConditions implements Parsable {
    /**
     * Instantiates a new TriggerAndScopeBasedConditions and sets the default values.
     */
    public TriggerAndScopeBasedConditions() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.triggerAndScopeBasedConditions");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TriggerAndScopeBasedConditions
     */
    @jakarta.annotation.Nonnull
    public static TriggerAndScopeBasedConditions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TriggerAndScopeBasedConditions();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("scope", (n) -> { this.setScope(n.getObjectValue(SubjectSet::createFromDiscriminatorValue)); });
        deserializerMap.put("trigger", (n) -> { this.setTrigger(n.getObjectValue(WorkflowExecutionTrigger::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the scope property value. Defines who the workflow runs for.
     * @return a SubjectSet
     */
    @jakarta.annotation.Nullable
    public SubjectSet getScope() {
        return this.BackingStore.get("scope");
    }
    /**
     * Gets the trigger property value. What triggers a workflow to run.
     * @return a WorkflowExecutionTrigger
     */
    @jakarta.annotation.Nullable
    public WorkflowExecutionTrigger getTrigger() {
        return this.BackingStore.get("trigger");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("scope", this.getScope());
        writer.writeObjectValue("trigger", this.getTrigger());
    }
    /**
     * Sets the scope property value. Defines who the workflow runs for.
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final SubjectSet value) {
        this.BackingStore.set("scope", value);
    }
    /**
     * Sets the trigger property value. What triggers a workflow to run.
     * @param value Value to set for the trigger property.
     */
    public void setTrigger(@jakarta.annotation.Nullable final WorkflowExecutionTrigger value) {
        this.BackingStore.set("trigger", value);
    }
}
