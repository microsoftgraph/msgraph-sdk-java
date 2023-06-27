package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChatMembersNotificationRecipient extends TeamworkNotificationRecipient implements Parsable {
    /**
     * The unique identifier for the chat whose members should receive the notifications.
     */
    private String chatId;
    /**
     * Instantiates a new ChatMembersNotificationRecipient and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChatMembersNotificationRecipient() {
        super();
        this.setOdataType("#microsoft.graph.chatMembersNotificationRecipient");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChatMembersNotificationRecipient
     */
    @javax.annotation.Nonnull
    public static ChatMembersNotificationRecipient createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatMembersNotificationRecipient();
    }
    /**
     * Gets the chatId property value. The unique identifier for the chat whose members should receive the notifications.
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
        deserializerMap.put("chatId", (n) -> { this.setChatId(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeStringValue("chatId", this.getChatId());
    }
    /**
     * Sets the chatId property value. The unique identifier for the chat whose members should receive the notifications.
     * @param value Value to set for the chatId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChatId(@javax.annotation.Nullable final String value) {
        this.chatId = value;
    }
}
