package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OperatorBetween extends WorkflowTriggerTimeBasedOperator implements Parsable {
    /**
     * Instantiates a new {@link OperatorBetween} and sets the default values.
     */
    public OperatorBetween() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.operatorBetween");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OperatorBetween}
     */
    @jakarta.annotation.Nonnull
    public static OperatorBetween createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OperatorBetween();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("greaterThanOffsetInDays", (n) -> { this.setGreaterThanOffsetInDays(n.getIntegerValue()); });
        deserializerMap.put("lessThanOffsetInDays", (n) -> { this.setLessThanOffsetInDays(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the greaterThanOffsetInDays property value. The exclusive lower bound of the date range, in days. The value must be a nonnegative integer and less than lessThanOffsetInDays.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getGreaterThanOffsetInDays() {
        return this.backingStore.get("greaterThanOffsetInDays");
    }
    /**
     * Gets the lessThanOffsetInDays property value. The exclusive upper bound of the date range, in days. The value must be a nonnegative integer and greater than greaterThanOffsetInDays. The difference between the upper and lower bounds can&apos;t exceed 180 days.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLessThanOffsetInDays() {
        return this.backingStore.get("lessThanOffsetInDays");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("greaterThanOffsetInDays", this.getGreaterThanOffsetInDays());
        writer.writeIntegerValue("lessThanOffsetInDays", this.getLessThanOffsetInDays());
    }
    /**
     * Sets the greaterThanOffsetInDays property value. The exclusive lower bound of the date range, in days. The value must be a nonnegative integer and less than lessThanOffsetInDays.
     * @param value Value to set for the greaterThanOffsetInDays property.
     */
    public void setGreaterThanOffsetInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("greaterThanOffsetInDays", value);
    }
    /**
     * Sets the lessThanOffsetInDays property value. The exclusive upper bound of the date range, in days. The value must be a nonnegative integer and greater than greaterThanOffsetInDays. The difference between the upper and lower bounds can&apos;t exceed 180 days.
     * @param value Value to set for the lessThanOffsetInDays property.
     */
    public void setLessThanOffsetInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("lessThanOffsetInDays", value);
    }
}
