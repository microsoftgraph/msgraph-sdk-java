package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MessageUnpinnedEventMessageDetail extends EventMessageDetail implements Parsable {
    /** The eventDateTime property */
    private OffsetDateTime _eventDateTime;
    /** The initiator property */
    private IdentitySet _initiator;
    /**
     * Instantiates a new MessageUnpinnedEventMessageDetail and sets the default values.
     * @return a void
     */
    public MessageUnpinnedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.messageUnpinnedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MessageUnpinnedEventMessageDetail
     */
    @javax.annotation.Nonnull
    public static MessageUnpinnedEventMessageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageUnpinnedEventMessageDetail();
    }
    /**
     * Gets the eventDateTime property value. The eventDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this._eventDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MessageUnpinnedEventMessageDetail currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("eventDateTime", (n) -> { currentObject.setEventDateTime(n.getOffsetDateTimeValue()); });
            this.put("initiator", (n) -> { currentObject.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the initiator property value. The initiator property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getInitiator() {
        return this._initiator;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeObjectValue("initiator", this.getInitiator());
    }
    /**
     * Sets the eventDateTime property value. The eventDateTime property
     * @param value Value to set for the eventDateTime property.
     * @return a void
     */
    public void setEventDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._eventDateTime = value;
    }
    /**
     * Sets the initiator property value. The initiator property
     * @param value Value to set for the initiator property.
     * @return a void
     */
    public void setInitiator(@javax.annotation.Nullable final IdentitySet value) {
        this._initiator = value;
    }
}
