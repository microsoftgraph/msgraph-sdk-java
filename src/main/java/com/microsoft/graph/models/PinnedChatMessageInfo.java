package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreement entities. */
public class PinnedChatMessageInfo extends Entity implements Parsable {
    /** Represents details about the chat message that is pinned. */
    private ChatMessage _message;
    /**
     * Instantiates a new pinnedChatMessageInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PinnedChatMessageInfo() {
        super();
        this.setOdataType("#microsoft.graph.pinnedChatMessageInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a pinnedChatMessageInfo
     */
    @javax.annotation.Nonnull
    public static PinnedChatMessageInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PinnedChatMessageInfo();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PinnedChatMessageInfo currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("message", (n) -> { currentObject.setMessage(n.getObjectValue(ChatMessage::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the message property value. Represents details about the chat message that is pinned.
     * @return a chatMessage
     */
    @javax.annotation.Nullable
    public ChatMessage getMessage() {
        return this._message;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("message", this.getMessage());
    }
    /**
     * Sets the message property value. Represents details about the chat message that is pinned.
     * @param value Value to set for the message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final ChatMessage value) {
        this._message = value;
    }
}
