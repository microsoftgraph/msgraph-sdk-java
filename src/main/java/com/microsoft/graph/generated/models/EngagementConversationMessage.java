package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A Viva Engage conversation message.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EngagementConversationMessage extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EngagementConversationMessage} and sets the default values.
     */
    public EngagementConversationMessage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EngagementConversationMessage}
     */
    @jakarta.annotation.Nonnull
    public static EngagementConversationMessage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.engagementConversationDiscussionMessage": return new EngagementConversationDiscussionMessage();
                case "#microsoft.graph.engagementConversationQuestionMessage": return new EngagementConversationQuestionMessage();
                case "#microsoft.graph.engagementConversationSystemMessage": return new EngagementConversationSystemMessage();
            }
        }
        return new EngagementConversationMessage();
    }
    /**
     * Gets the body property value. The body property
     * @return a {@link ItemBody}
     */
    @jakarta.annotation.Nullable
    public ItemBody getBody() {
        return this.backingStore.get("body");
    }
    /**
     * Gets the conversation property value. The conversation property
     * @return a {@link EngagementConversation}
     */
    @jakarta.annotation.Nullable
    public EngagementConversation getConversation() {
        return this.backingStore.get("conversation");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the message was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the creationMode property value. Indicates that the resource is in migration state and is currently being used for migration purposes.
     * @return a {@link EngagementCreationMode}
     */
    @jakarta.annotation.Nullable
    public EngagementCreationMode getCreationMode() {
        return this.backingStore.get("creationMode");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("body", (n) -> { this.setBody(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("conversation", (n) -> { this.setConversation(n.getObjectValue(EngagementConversation::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("creationMode", (n) -> { this.setCreationMode(n.getEnumValue(EngagementCreationMode::forValue)); });
        deserializerMap.put("from", (n) -> { this.setFrom(n.getObjectValue(EngagementIdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reactions", (n) -> { this.setReactions(n.getCollectionOfObjectValues(EngagementConversationMessageReaction::createFromDiscriminatorValue)); });
        deserializerMap.put("replies", (n) -> { this.setReplies(n.getCollectionOfObjectValues(EngagementConversationMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("replyTo", (n) -> { this.setReplyTo(n.getObjectValue(EngagementConversationMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("replyToId", (n) -> { this.setReplyToId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the from property value. Identity of the sender of the message.
     * @return a {@link EngagementIdentitySet}
     */
    @jakarta.annotation.Nullable
    public EngagementIdentitySet getFrom() {
        return this.backingStore.get("from");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when message was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the reactions property value. A collection of reactions (such as like and smile) that users have applied to this message.
     * @return a {@link java.util.List<EngagementConversationMessageReaction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EngagementConversationMessageReaction> getReactions() {
        return this.backingStore.get("reactions");
    }
    /**
     * Gets the replies property value. A collection of messages that are replies to this message and form a threaded discussion.
     * @return a {@link java.util.List<EngagementConversationMessage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EngagementConversationMessage> getReplies() {
        return this.backingStore.get("replies");
    }
    /**
     * Gets the replyTo property value. The parent message to which this message is a reply, if it is part of a reply chain.
     * @return a {@link EngagementConversationMessage}
     */
    @jakarta.annotation.Nullable
    public EngagementConversationMessage getReplyTo() {
        return this.backingStore.get("replyTo");
    }
    /**
     * Gets the replyToId property value. The ID of the parent message to which this message is a reply, if applicable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReplyToId() {
        return this.backingStore.get("replyToId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("body", this.getBody());
        writer.writeObjectValue("conversation", this.getConversation());
        writer.writeEnumValue("creationMode", this.getCreationMode());
        writer.writeObjectValue("from", this.getFrom());
        writer.writeCollectionOfObjectValues("reactions", this.getReactions());
        writer.writeCollectionOfObjectValues("replies", this.getReplies());
        writer.writeObjectValue("replyTo", this.getReplyTo());
        writer.writeStringValue("replyToId", this.getReplyToId());
    }
    /**
     * Sets the body property value. The body property
     * @param value Value to set for the body property.
     */
    public void setBody(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("body", value);
    }
    /**
     * Sets the conversation property value. The conversation property
     * @param value Value to set for the conversation property.
     */
    public void setConversation(@jakarta.annotation.Nullable final EngagementConversation value) {
        this.backingStore.set("conversation", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the message was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the creationMode property value. Indicates that the resource is in migration state and is currently being used for migration purposes.
     * @param value Value to set for the creationMode property.
     */
    public void setCreationMode(@jakarta.annotation.Nullable final EngagementCreationMode value) {
        this.backingStore.set("creationMode", value);
    }
    /**
     * Sets the from property value. Identity of the sender of the message.
     * @param value Value to set for the from property.
     */
    public void setFrom(@jakarta.annotation.Nullable final EngagementIdentitySet value) {
        this.backingStore.set("from", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when message was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the reactions property value. A collection of reactions (such as like and smile) that users have applied to this message.
     * @param value Value to set for the reactions property.
     */
    public void setReactions(@jakarta.annotation.Nullable final java.util.List<EngagementConversationMessageReaction> value) {
        this.backingStore.set("reactions", value);
    }
    /**
     * Sets the replies property value. A collection of messages that are replies to this message and form a threaded discussion.
     * @param value Value to set for the replies property.
     */
    public void setReplies(@jakarta.annotation.Nullable final java.util.List<EngagementConversationMessage> value) {
        this.backingStore.set("replies", value);
    }
    /**
     * Sets the replyTo property value. The parent message to which this message is a reply, if it is part of a reply chain.
     * @param value Value to set for the replyTo property.
     */
    public void setReplyTo(@jakarta.annotation.Nullable final EngagementConversationMessage value) {
        this.backingStore.set("replyTo", value);
    }
    /**
     * Sets the replyToId property value. The ID of the parent message to which this message is a reply, if applicable.
     * @param value Value to set for the replyToId property.
     */
    public void setReplyToId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("replyToId", value);
    }
}
