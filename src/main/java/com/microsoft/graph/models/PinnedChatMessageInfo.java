package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PinnedChatMessageInfo extends Entity implements Parsable {
    /**
     * Represents details about the chat message that is pinned.
     */
    private ChatMessage message;
    /**
     * Instantiates a new pinnedChatMessageInfo and sets the default values.
     */
    public PinnedChatMessageInfo() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a pinnedChatMessageInfo
     */
    @jakarta.annotation.Nonnull
    public static PinnedChatMessageInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PinnedChatMessageInfo();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("message", (n) -> { this.setMessage(n.getObjectValue(ChatMessage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. Represents details about the chat message that is pinned.
     * @return a chatMessage
     */
    @jakarta.annotation.Nullable
    public ChatMessage getMessage() {
        return this.message;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("message", this.getMessage());
    }
    /**
     * Sets the message property value. Represents details about the chat message that is pinned.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final ChatMessage value) {
        this.message = value;
    }
}
