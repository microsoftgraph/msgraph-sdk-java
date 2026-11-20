package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OperatorEqualTo extends WorkflowTriggerTimeBasedOperator implements Parsable {
    /**
     * Instantiates a new {@link OperatorEqualTo} and sets the default values.
     */
    public OperatorEqualTo() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.operatorEqualTo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OperatorEqualTo}
     */
    @jakarta.annotation.Nonnull
    public static OperatorEqualTo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OperatorEqualTo();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("offsetInDays", (n) -> { this.setOffsetInDays(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the offsetInDays property value. The exact number of days between the current date and the date in the user attribute. The value must be a nonnegative integer.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOffsetInDays() {
        return this.backingStore.get("offsetInDays");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("offsetInDays", this.getOffsetInDays());
    }
    /**
     * Sets the offsetInDays property value. The exact number of days between the current date and the date in the user attribute. The value must be a nonnegative integer.
     * @param value Value to set for the offsetInDays property.
     */
    public void setOffsetInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("offsetInDays", value);
    }
}
