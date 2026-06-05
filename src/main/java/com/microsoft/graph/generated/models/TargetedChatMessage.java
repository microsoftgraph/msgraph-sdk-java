package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TargetedChatMessage extends ChatMessage implements Parsable {
    /**
     * Instantiates a new {@link TargetedChatMessage} and sets the default values.
     */
    public TargetedChatMessage() {
        super();
        this.setOdataType("#microsoft.graph.targetedChatMessage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TargetedChatMessage}
     */
    @jakarta.annotation.Nonnull
    public static TargetedChatMessage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TargetedChatMessage();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("recipient", (n) -> { this.setRecipient(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the recipient property value. The recipient property
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getRecipient() {
        return this.backingStore.get("recipient");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("recipient", this.getRecipient());
    }
    /**
     * Sets the recipient property value. The recipient property
     * @param value Value to set for the recipient property.
     */
    public void setRecipient(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("recipient", value);
    }
}
