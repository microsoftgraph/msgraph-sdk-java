package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MembershipChangeTrigger extends WorkflowExecutionTrigger implements Parsable {
    /**
     * Instantiates a new {@link MembershipChangeTrigger} and sets the default values.
     */
    public MembershipChangeTrigger() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.membershipChangeTrigger");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MembershipChangeTrigger}
     */
    @jakarta.annotation.Nonnull
    public static MembershipChangeTrigger createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MembershipChangeTrigger();
    }
    /**
     * Gets the changeType property value. The changeType property
     * @return a {@link MembershipChangeType}
     */
    @jakarta.annotation.Nullable
    public MembershipChangeType getChangeType() {
        return this.backingStore.get("changeType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("changeType", (n) -> { this.setChangeType(n.getEnumValue(MembershipChangeType::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("changeType", this.getChangeType());
    }
    /**
     * Sets the changeType property value. The changeType property
     * @param value Value to set for the changeType property.
     */
    public void setChangeType(@jakarta.annotation.Nullable final MembershipChangeType value) {
        this.backingStore.set("changeType", value);
    }
}
