package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Conversation extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Conversation} and sets the default values.
     */
    public Conversation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Conversation}
     */
    @jakarta.annotation.Nonnull
    public static Conversation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Conversation();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("hasAttachments", (n) -> { this.setHasAttachments(n.getBooleanValue()); });
        deserializerMap.put("lastDeliveredDateTime", (n) -> { this.setLastDeliveredDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("preview", (n) -> { this.setPreview(n.getStringValue()); });
        deserializerMap.put("threads", (n) -> { this.setThreads(n.getCollectionOfObjectValues(ConversationThread::createFromDiscriminatorValue)); });
        deserializerMap.put("topic", (n) -> { this.setTopic(n.getStringValue()); });
        deserializerMap.put("uniqueSenders", (n) -> { this.setUniqueSenders(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the hasAttachments property value. Indicates whether any of the posts within this Conversation has at least one attachment. Supports $filter (eq, ne) and $search.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasAttachments() {
        return this.backingStore.get("hasAttachments");
    }
    /**
     * Gets the lastDeliveredDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastDeliveredDateTime() {
        return this.backingStore.get("lastDeliveredDateTime");
    }
    /**
     * Gets the preview property value. A short summary from the body of the latest post in this conversation. Supports $filter (eq, ne, le, ge).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreview() {
        return this.backingStore.get("preview");
    }
    /**
     * Gets the threads property value. A collection of all the conversation threads in the conversation. A navigation property. Read-only. Nullable.
     * @return a {@link java.util.List<ConversationThread>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConversationThread> getThreads() {
        return this.backingStore.get("threads");
    }
    /**
     * Gets the topic property value. The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTopic() {
        return this.backingStore.get("topic");
    }
    /**
     * Gets the uniqueSenders property value. All the users that sent a message to this Conversation.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUniqueSenders() {
        return this.backingStore.get("uniqueSenders");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("hasAttachments", this.getHasAttachments());
        writer.writeOffsetDateTimeValue("lastDeliveredDateTime", this.getLastDeliveredDateTime());
        writer.writeStringValue("preview", this.getPreview());
        writer.writeCollectionOfObjectValues("threads", this.getThreads());
        writer.writeStringValue("topic", this.getTopic());
        writer.writeCollectionOfPrimitiveValues("uniqueSenders", this.getUniqueSenders());
    }
    /**
     * Sets the hasAttachments property value. Indicates whether any of the posts within this Conversation has at least one attachment. Supports $filter (eq, ne) and $search.
     * @param value Value to set for the hasAttachments property.
     */
    public void setHasAttachments(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasAttachments", value);
    }
    /**
     * Sets the lastDeliveredDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the lastDeliveredDateTime property.
     */
    public void setLastDeliveredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastDeliveredDateTime", value);
    }
    /**
     * Sets the preview property value. A short summary from the body of the latest post in this conversation. Supports $filter (eq, ne, le, ge).
     * @param value Value to set for the preview property.
     */
    public void setPreview(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preview", value);
    }
    /**
     * Sets the threads property value. A collection of all the conversation threads in the conversation. A navigation property. Read-only. Nullable.
     * @param value Value to set for the threads property.
     */
    public void setThreads(@jakarta.annotation.Nullable final java.util.List<ConversationThread> value) {
        this.backingStore.set("threads", value);
    }
    /**
     * Sets the topic property value. The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated.
     * @param value Value to set for the topic property.
     */
    public void setTopic(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("topic", value);
    }
    /**
     * Sets the uniqueSenders property value. All the users that sent a message to this Conversation.
     * @param value Value to set for the uniqueSenders property.
     */
    public void setUniqueSenders(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("uniqueSenders", value);
    }
}
