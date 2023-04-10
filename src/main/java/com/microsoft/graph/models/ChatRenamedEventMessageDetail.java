package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChatRenamedEventMessageDetail extends EventMessageDetail implements Parsable {
    /** The updated name of the chat. */
    private String chatDisplayName;
    /** Unique identifier of the chat. */
    private String chatId;
    /** Initiator of the event. */
    private IdentitySet initiator;
    /**
     * Instantiates a new ChatRenamedEventMessageDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChatRenamedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.chatRenamedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChatRenamedEventMessageDetail
     */
    @javax.annotation.Nonnull
    public static ChatRenamedEventMessageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatRenamedEventMessageDetail();
    }
    /**
     * Gets the chatDisplayName property value. The updated name of the chat.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChatDisplayName() {
        return this.chatDisplayName;
    }
    /**
     * Gets the chatId property value. Unique identifier of the chat.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChatId() {
        return this.chatId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("chatDisplayName", (n) -> { this.setChatDisplayName(n.getStringValue()); });
        deserializerMap.put("chatId", (n) -> { this.setChatId(n.getStringValue()); });
        deserializerMap.put("initiator", (n) -> { this.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the initiator property value. Initiator of the event.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getInitiator() {
        return this.initiator;
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
        writer.writeStringValue("chatDisplayName", this.getChatDisplayName());
        writer.writeStringValue("chatId", this.getChatId());
        writer.writeObjectValue("initiator", this.getInitiator());
    }
    /**
     * Sets the chatDisplayName property value. The updated name of the chat.
     * @param value Value to set for the chatDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChatDisplayName(@javax.annotation.Nullable final String value) {
        this.chatDisplayName = value;
    }
    /**
     * Sets the chatId property value. Unique identifier of the chat.
     * @param value Value to set for the chatId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChatId(@javax.annotation.Nullable final String value) {
        this.chatId = value;
    }
    /**
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInitiator(@javax.annotation.Nullable final IdentitySet value) {
        this.initiator = value;
    }
}
