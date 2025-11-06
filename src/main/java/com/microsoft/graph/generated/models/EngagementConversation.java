package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a conversation in Viva Engage.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EngagementConversation extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EngagementConversation} and sets the default values.
     */
    public EngagementConversation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EngagementConversation}
     */
    @jakarta.annotation.Nonnull
    public static EngagementConversation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.onlineMeetingEngagementConversation": return new OnlineMeetingEngagementConversation();
            }
        }
        return new EngagementConversation();
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
        deserializerMap.put("creationMode", (n) -> { this.setCreationMode(n.getEnumValue(EngagementCreationMode::forValue)); });
        deserializerMap.put("messages", (n) -> { this.setMessages(n.getCollectionOfObjectValues(EngagementConversationMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("starter", (n) -> { this.setStarter(n.getObjectValue(EngagementConversationMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("starterId", (n) -> { this.setStarterId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the messages property value. The messages in a Viva Engage conversation.
     * @return a {@link java.util.List<EngagementConversationMessage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EngagementConversationMessage> getMessages() {
        return this.backingStore.get("messages");
    }
    /**
     * Gets the starter property value. The starter property
     * @return a {@link EngagementConversationMessage}
     */
    @jakarta.annotation.Nullable
    public EngagementConversationMessage getStarter() {
        return this.backingStore.get("starter");
    }
    /**
     * Gets the starterId property value. The unique ID of the first message in a Viva Engage conversation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStarterId() {
        return this.backingStore.get("starterId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("creationMode", this.getCreationMode());
        writer.writeCollectionOfObjectValues("messages", this.getMessages());
        writer.writeObjectValue("starter", this.getStarter());
        writer.writeStringValue("starterId", this.getStarterId());
    }
    /**
     * Sets the creationMode property value. Indicates that the resource is in migration state and is currently being used for migration purposes.
     * @param value Value to set for the creationMode property.
     */
    public void setCreationMode(@jakarta.annotation.Nullable final EngagementCreationMode value) {
        this.backingStore.set("creationMode", value);
    }
    /**
     * Sets the messages property value. The messages in a Viva Engage conversation.
     * @param value Value to set for the messages property.
     */
    public void setMessages(@jakarta.annotation.Nullable final java.util.List<EngagementConversationMessage> value) {
        this.backingStore.set("messages", value);
    }
    /**
     * Sets the starter property value. The starter property
     * @param value Value to set for the starter property.
     */
    public void setStarter(@jakarta.annotation.Nullable final EngagementConversationMessage value) {
        this.backingStore.set("starter", value);
    }
    /**
     * Sets the starterId property value. The unique ID of the first message in a Viva Engage conversation.
     * @param value Value to set for the starterId property.
     */
    public void setStarterId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("starterId", value);
    }
}
