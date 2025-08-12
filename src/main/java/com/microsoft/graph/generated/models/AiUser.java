package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AiUser extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AiUser} and sets the default values.
     */
    public AiUser() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AiUser}
     */
    @jakarta.annotation.Nonnull
    public static AiUser createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AiUser();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("interactionHistory", (n) -> { this.setInteractionHistory(n.getObjectValue(AiInteractionHistory::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the interactionHistory property value. The interactionHistory property
     * @return a {@link AiInteractionHistory}
     */
    @jakarta.annotation.Nullable
    public AiInteractionHistory getInteractionHistory() {
        return this.backingStore.get("interactionHistory");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("interactionHistory", this.getInteractionHistory());
    }
    /**
     * Sets the interactionHistory property value. The interactionHistory property
     * @param value Value to set for the interactionHistory property.
     */
    public void setInteractionHistory(@jakarta.annotation.Nullable final AiInteractionHistory value) {
        this.backingStore.set("interactionHistory", value);
    }
}
