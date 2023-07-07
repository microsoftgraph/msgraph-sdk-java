package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.SubjectSet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TriggerAndScopeBasedConditions extends WorkflowExecutionConditions implements Parsable {
    /**
     * Defines who the workflow runs for.
     */
    private SubjectSet scope;
    /**
     * What triggers a workflow to run.
     */
    private WorkflowExecutionTrigger trigger;
    /**
     * Instantiates a new TriggerAndScopeBasedConditions and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TriggerAndScopeBasedConditions() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.triggerAndScopeBasedConditions");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TriggerAndScopeBasedConditions
     */
    @javax.annotation.Nonnull
    public static TriggerAndScopeBasedConditions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TriggerAndScopeBasedConditions();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("scope", (n) -> { this.setScope(n.getObjectValue(SubjectSet::createFromDiscriminatorValue)); });
        deserializerMap.put("trigger", (n) -> { this.setTrigger(n.getObjectValue(WorkflowExecutionTrigger::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the scope property value. Defines who the workflow runs for.
     * @return a subjectSet
     */
    @javax.annotation.Nullable
    public SubjectSet getScope() {
        return this.scope;
    }
    /**
     * Gets the trigger property value. What triggers a workflow to run.
     * @return a workflowExecutionTrigger
     */
    @javax.annotation.Nullable
    public WorkflowExecutionTrigger getTrigger() {
        return this.trigger;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("scope", this.getScope());
        writer.writeObjectValue("trigger", this.getTrigger());
    }
    /**
     * Sets the scope property value. Defines who the workflow runs for.
     * @param value Value to set for the scope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScope(@javax.annotation.Nullable final SubjectSet value) {
        this.scope = value;
    }
    /**
     * Sets the trigger property value. What triggers a workflow to run.
     * @param value Value to set for the trigger property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrigger(@javax.annotation.Nullable final WorkflowExecutionTrigger value) {
        this.trigger = value;
    }
}
