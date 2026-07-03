package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CountBasedQuarantineCondition extends QuarantineCondition implements Parsable {
    /**
     * Instantiates a new {@link CountBasedQuarantineCondition} and sets the default values.
     */
    public CountBasedQuarantineCondition() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.countBasedQuarantineCondition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CountBasedQuarantineCondition}
     */
    @jakarta.annotation.Nonnull
    public static CountBasedQuarantineCondition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CountBasedQuarantineCondition();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("threshold", (n) -> { this.setThreshold(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the threshold property value. The maximum number of users a workflow run can process before the workflow is quarantined.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getThreshold() {
        return this.backingStore.get("threshold");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("threshold", this.getThreshold());
    }
    /**
     * Sets the threshold property value. The maximum number of users a workflow run can process before the workflow is quarantined.
     * @param value Value to set for the threshold property.
     */
    public void setThreshold(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("threshold", value);
    }
}
