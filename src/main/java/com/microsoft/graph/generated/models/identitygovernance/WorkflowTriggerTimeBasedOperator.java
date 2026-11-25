package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkflowTriggerTimeBasedOperator extends WorkflowExecutionTriggerOperator implements Parsable {
    /**
     * Instantiates a new {@link WorkflowTriggerTimeBasedOperator} and sets the default values.
     */
    public WorkflowTriggerTimeBasedOperator() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.workflowTriggerTimeBasedOperator");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkflowTriggerTimeBasedOperator}
     */
    @jakarta.annotation.Nonnull
    public static WorkflowTriggerTimeBasedOperator createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.identityGovernance.operatorBetween": return new OperatorBetween();
                case "#microsoft.graph.identityGovernance.operatorEqualTo": return new OperatorEqualTo();
                case "#microsoft.graph.identityGovernance.operatorLessThanEqualTo": return new OperatorLessThanEqualTo();
            }
        }
        return new WorkflowTriggerTimeBasedOperator();
    }
    /**
     * Gets the eventTiming property value. The eventTiming property
     * @return a {@link WorkflowTriggerOperatorEventTiming}
     */
    @jakarta.annotation.Nullable
    public WorkflowTriggerOperatorEventTiming getEventTiming() {
        return this.backingStore.get("eventTiming");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("eventTiming", (n) -> { this.setEventTiming(n.getEnumValue(WorkflowTriggerOperatorEventTiming::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("eventTiming", this.getEventTiming());
    }
    /**
     * Sets the eventTiming property value. The eventTiming property
     * @param value Value to set for the eventTiming property.
     */
    public void setEventTiming(@jakarta.annotation.Nullable final WorkflowTriggerOperatorEventTiming value) {
        this.backingStore.set("eventTiming", value);
    }
}
