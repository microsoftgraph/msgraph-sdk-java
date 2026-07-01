package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PercentageBasedQuarantineCondition extends QuarantineCondition implements Parsable {
    /**
     * Instantiates a new {@link PercentageBasedQuarantineCondition} and sets the default values.
     */
    public PercentageBasedQuarantineCondition() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.percentageBasedQuarantineCondition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PercentageBasedQuarantineCondition}
     */
    @jakarta.annotation.Nonnull
    public static PercentageBasedQuarantineCondition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PercentageBasedQuarantineCondition();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("percentage", (n) -> { this.setPercentage(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the percentage property value. The percentage property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPercentage() {
        return this.backingStore.get("percentage");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("percentage", this.getPercentage());
    }
    /**
     * Sets the percentage property value. The percentage property
     * @param value Value to set for the percentage property.
     */
    public void setPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("percentage", value);
    }
}
