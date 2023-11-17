package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TimeBasedAttributeTrigger extends WorkflowExecutionTrigger implements Parsable {
    /**
     * Instantiates a new TimeBasedAttributeTrigger and sets the default values.
     */
    public TimeBasedAttributeTrigger() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.timeBasedAttributeTrigger");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TimeBasedAttributeTrigger
     */
    @jakarta.annotation.Nonnull
    public static TimeBasedAttributeTrigger createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeBasedAttributeTrigger();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("offsetInDays", (n) -> { this.setOffsetInDays(n.getIntegerValue()); });
        deserializerMap.put("timeBasedAttribute", (n) -> { this.setTimeBasedAttribute(n.getEnumValue(WorkflowTriggerTimeBasedAttribute.class)); });
        return deserializerMap;
    }
    /**
     * Gets the offsetInDays property value. How many days before or after the time-based attribute specified the workflow should trigger. For example, if the attribute is employeeHireDate and offsetInDays is -1, then the workflow should trigger one day before the employee hire date. The value can range between -180 and 180 days.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getOffsetInDays() {
        return this.backingStore.get("offsetInDays");
    }
    /**
     * Gets the timeBasedAttribute property value. The timeBasedAttribute property
     * @return a WorkflowTriggerTimeBasedAttribute
     */
    @jakarta.annotation.Nullable
    public WorkflowTriggerTimeBasedAttribute getTimeBasedAttribute() {
        return this.backingStore.get("timeBasedAttribute");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("offsetInDays", this.getOffsetInDays());
        writer.writeEnumValue("timeBasedAttribute", this.getTimeBasedAttribute());
    }
    /**
     * Sets the offsetInDays property value. How many days before or after the time-based attribute specified the workflow should trigger. For example, if the attribute is employeeHireDate and offsetInDays is -1, then the workflow should trigger one day before the employee hire date. The value can range between -180 and 180 days.
     * @param value Value to set for the offsetInDays property.
     */
    public void setOffsetInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("offsetInDays", value);
    }
    /**
     * Sets the timeBasedAttribute property value. The timeBasedAttribute property
     * @param value Value to set for the timeBasedAttribute property.
     */
    public void setTimeBasedAttribute(@jakarta.annotation.Nullable final WorkflowTriggerTimeBasedAttribute value) {
        this.backingStore.set("timeBasedAttribute", value);
    }
}
