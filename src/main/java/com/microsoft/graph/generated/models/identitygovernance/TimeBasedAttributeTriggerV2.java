package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TimeBasedAttributeTriggerV2 extends WorkflowExecutionTrigger implements Parsable {
    /**
     * Instantiates a new {@link TimeBasedAttributeTriggerV2} and sets the default values.
     */
    public TimeBasedAttributeTriggerV2() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.timeBasedAttributeTriggerV2");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TimeBasedAttributeTriggerV2}
     */
    @jakarta.annotation.Nonnull
    public static TimeBasedAttributeTriggerV2 createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeBasedAttributeTriggerV2();
    }
    /**
     * Gets the attribute property value. The name of the date-type user attribute to evaluate, such as employeeHireDate or employeeLeaveDateTime.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAttribute() {
        return this.backingStore.get("attribute");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("attribute", (n) -> { this.setAttribute(n.getStringValue()); });
        deserializerMap.put("operator", (n) -> { this.setOperator(n.getObjectValue(WorkflowExecutionTriggerOperator::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the operator property value. The operator property
     * @return a {@link WorkflowExecutionTriggerOperator}
     */
    @jakarta.annotation.Nullable
    public WorkflowExecutionTriggerOperator getOperator() {
        return this.backingStore.get("operator");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("attribute", this.getAttribute());
        writer.writeObjectValue("operator", this.getOperator());
    }
    /**
     * Sets the attribute property value. The name of the date-type user attribute to evaluate, such as employeeHireDate or employeeLeaveDateTime.
     * @param value Value to set for the attribute property.
     */
    public void setAttribute(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("attribute", value);
    }
    /**
     * Sets the operator property value. The operator property
     * @param value Value to set for the operator property.
     */
    public void setOperator(@jakarta.annotation.Nullable final WorkflowExecutionTriggerOperator value) {
        this.backingStore.set("operator", value);
    }
}
