package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExchangeMessageTraceDetail extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ExchangeMessageTraceDetail} and sets the default values.
     */
    public ExchangeMessageTraceDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExchangeMessageTraceDetail}
     */
    @jakarta.annotation.Nonnull
    public static ExchangeMessageTraceDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExchangeMessageTraceDetail();
    }
    /**
     * Gets the action property value. The action taken on the message during the event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAction() {
        return this.backingStore.get("action");
    }
    /**
     * Gets the data property value. Additional data associated with the event, containing supplementary information specific to the event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getData() {
        return this.backingStore.get("data");
    }
    /**
     * Gets the dateTime property value. The date and time when the event occurred. The timestamp is in UTC format.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDateTime() {
        return this.backingStore.get("dateTime");
    }
    /**
     * Gets the description property value. A detailed description that provides context about what happened during message processing.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the event property value. The event that occurred during message processing.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEvent() {
        return this.backingStore.get("event");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("action", (n) -> { this.setAction(n.getStringValue()); });
        deserializerMap.put("data", (n) -> { this.setData(n.getStringValue()); });
        deserializerMap.put("dateTime", (n) -> { this.setDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("event", (n) -> { this.setEvent(n.getStringValue()); });
        deserializerMap.put("messageId", (n) -> { this.setMessageId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the messageId property value. The Message-ID header field of the message. The format depends on the messaging server that sent the message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessageId() {
        return this.backingStore.get("messageId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("action", this.getAction());
        writer.writeStringValue("data", this.getData());
        writer.writeOffsetDateTimeValue("dateTime", this.getDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("event", this.getEvent());
        writer.writeStringValue("messageId", this.getMessageId());
    }
    /**
     * Sets the action property value. The action taken on the message during the event.
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("action", value);
    }
    /**
     * Sets the data property value. Additional data associated with the event, containing supplementary information specific to the event.
     * @param value Value to set for the data property.
     */
    public void setData(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("data", value);
    }
    /**
     * Sets the dateTime property value. The date and time when the event occurred. The timestamp is in UTC format.
     * @param value Value to set for the dateTime property.
     */
    public void setDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("dateTime", value);
    }
    /**
     * Sets the description property value. A detailed description that provides context about what happened during message processing.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the event property value. The event that occurred during message processing.
     * @param value Value to set for the event property.
     */
    public void setEvent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("event", value);
    }
    /**
     * Sets the messageId property value. The Message-ID header field of the message. The format depends on the messaging server that sent the message.
     * @param value Value to set for the messageId property.
     */
    public void setMessageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("messageId", value);
    }
}
