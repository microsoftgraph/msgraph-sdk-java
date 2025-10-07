package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A reaction to a conversation message.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EngagementConversationMessageReaction extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EngagementConversationMessageReaction} and sets the default values.
     */
    public EngagementConversationMessageReaction() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EngagementConversationMessageReaction}
     */
    @jakarta.annotation.Nonnull
    public static EngagementConversationMessageReaction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EngagementConversationMessageReaction();
    }
    /**
     * Gets the createdDateTime property value. Date and time when the reaction was added. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reactionBy", (n) -> { this.setReactionBy(n.getObjectValue(EngagementIdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("reactionType", (n) -> { this.setReactionType(n.getEnumValue(EngagementConversationMessageReactionType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the reactionBy property value. The reactionBy property
     * @return a {@link EngagementIdentitySet}
     */
    @jakarta.annotation.Nullable
    public EngagementIdentitySet getReactionBy() {
        return this.backingStore.get("reactionBy");
    }
    /**
     * Gets the reactionType property value. Types of reactions to conversation messages.
     * @return a {@link EngagementConversationMessageReactionType}
     */
    @jakarta.annotation.Nullable
    public EngagementConversationMessageReactionType getReactionType() {
        return this.backingStore.get("reactionType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("reactionBy", this.getReactionBy());
        writer.writeEnumValue("reactionType", this.getReactionType());
    }
    /**
     * Sets the createdDateTime property value. Date and time when the reaction was added. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the reactionBy property value. The reactionBy property
     * @param value Value to set for the reactionBy property.
     */
    public void setReactionBy(@jakarta.annotation.Nullable final EngagementIdentitySet value) {
        this.backingStore.set("reactionBy", value);
    }
    /**
     * Sets the reactionType property value. Types of reactions to conversation messages.
     * @param value Value to set for the reactionType property.
     */
    public void setReactionType(@jakarta.annotation.Nullable final EngagementConversationMessageReactionType value) {
        this.backingStore.set("reactionType", value);
    }
}
