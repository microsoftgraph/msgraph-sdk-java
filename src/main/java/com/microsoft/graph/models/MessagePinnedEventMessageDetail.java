package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessagePinnedEventMessageDetail extends EventMessageDetail implements Parsable {
    /**
     * Date and time when the event occurred.
     */
    private OffsetDateTime eventDateTime;
    /**
     * Initiator of the event.
     */
    private IdentitySet initiator;
    /**
     * Instantiates a new MessagePinnedEventMessageDetail and sets the default values.
     */
    public MessagePinnedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.messagePinnedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MessagePinnedEventMessageDetail
     */
    @jakarta.annotation.Nonnull
    public static MessagePinnedEventMessageDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessagePinnedEventMessageDetail();
    }
    /**
     * Gets the eventDateTime property value. Date and time when the event occurred.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this.eventDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("eventDateTime", (n) -> { this.setEventDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("initiator", (n) -> { this.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the initiator property value. Initiator of the event.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getInitiator() {
        return this.initiator;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeObjectValue("initiator", this.getInitiator());
    }
    /**
     * Sets the eventDateTime property value. Date and time when the event occurred.
     * @param value Value to set for the eventDateTime property.
     */
    public void setEventDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.eventDateTime = value;
    }
    /**
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     */
    public void setInitiator(@jakarta.annotation.Nullable final IdentitySet value) {
        this.initiator = value;
    }
}
