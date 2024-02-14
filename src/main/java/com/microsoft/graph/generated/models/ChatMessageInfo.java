package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatMessageInfo extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ChatMessageInfo} and sets the default values.
     */
    public ChatMessageInfo() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ChatMessageInfo}
     */
    @jakarta.annotation.Nonnull
    public static ChatMessageInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatMessageInfo();
    }
    /**
     * Gets the body property value. Body of the chatMessage. This will still contain markers for @mentions and attachments even though the object doesn't return @mentions and attachments.
     * @return a {@link ItemBody}
     */
    @jakarta.annotation.Nullable
    public ItemBody getBody() {
        return this.backingStore.get("body");
    }
    /**
     * Gets the createdDateTime property value. Date time object representing the time at which message was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the eventDetail property value. Read-only.  If present, represents details of an event that happened in a chat, a channel, or a team, for example, members were added, and so on. For event messages, the messageType property is set to systemEventMessage.
     * @return a {@link EventMessageDetail}
     */
    @jakarta.annotation.Nullable
    public EventMessageDetail getEventDetail() {
        return this.backingStore.get("eventDetail");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("body", (n) -> { this.setBody(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("eventDetail", (n) -> { this.setEventDetail(n.getObjectValue(EventMessageDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("from", (n) -> { this.setFrom(n.getObjectValue(ChatMessageFromIdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("isDeleted", (n) -> { this.setIsDeleted(n.getBooleanValue()); });
        deserializerMap.put("messageType", (n) -> { this.setMessageType(n.getEnumValue(ChatMessageType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the from property value. Information about the sender of the message.
     * @return a {@link ChatMessageFromIdentitySet}
     */
    @jakarta.annotation.Nullable
    public ChatMessageFromIdentitySet getFrom() {
        return this.backingStore.get("from");
    }
    /**
     * Gets the isDeleted property value. If set to true, the original message has been deleted.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDeleted() {
        return this.backingStore.get("isDeleted");
    }
    /**
     * Gets the messageType property value. The messageType property
     * @return a {@link ChatMessageType}
     */
    @jakarta.annotation.Nullable
    public ChatMessageType getMessageType() {
        return this.backingStore.get("messageType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("body", this.getBody());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("eventDetail", this.getEventDetail());
        writer.writeObjectValue("from", this.getFrom());
        writer.writeBooleanValue("isDeleted", this.getIsDeleted());
        writer.writeEnumValue("messageType", this.getMessageType());
    }
    /**
     * Sets the body property value. Body of the chatMessage. This will still contain markers for @mentions and attachments even though the object doesn't return @mentions and attachments.
     * @param value Value to set for the body property.
     */
    public void setBody(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("body", value);
    }
    /**
     * Sets the createdDateTime property value. Date time object representing the time at which message was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the eventDetail property value. Read-only.  If present, represents details of an event that happened in a chat, a channel, or a team, for example, members were added, and so on. For event messages, the messageType property is set to systemEventMessage.
     * @param value Value to set for the eventDetail property.
     */
    public void setEventDetail(@jakarta.annotation.Nullable final EventMessageDetail value) {
        this.backingStore.set("eventDetail", value);
    }
    /**
     * Sets the from property value. Information about the sender of the message.
     * @param value Value to set for the from property.
     */
    public void setFrom(@jakarta.annotation.Nullable final ChatMessageFromIdentitySet value) {
        this.backingStore.set("from", value);
    }
    /**
     * Sets the isDeleted property value. If set to true, the original message has been deleted.
     * @param value Value to set for the isDeleted property.
     */
    public void setIsDeleted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDeleted", value);
    }
    /**
     * Sets the messageType property value. The messageType property
     * @param value Value to set for the messageType property.
     */
    public void setMessageType(@jakarta.annotation.Nullable final ChatMessageType value) {
        this.backingStore.set("messageType", value);
    }
}
