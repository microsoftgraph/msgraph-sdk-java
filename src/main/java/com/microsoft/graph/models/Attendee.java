package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Attendee extends AttendeeBase implements Parsable {
    /**
     * Instantiates a new Attendee and sets the default values.
     */
    public Attendee() {
        super();
        this.setOdataType("#microsoft.graph.attendee");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Attendee
     */
    @jakarta.annotation.Nonnull
    public static Attendee createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Attendee();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("proposedNewTime", (n) -> { this.setProposedNewTime(n.getObjectValue(TimeSlot::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getObjectValue(ResponseStatus::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the proposedNewTime property value. An alternate date/time proposed by the attendee for a meeting request to start and end. If the attendee hasn't proposed another time, then this property isn't included in a response of a GET event.
     * @return a TimeSlot
     */
    @jakarta.annotation.Nullable
    public TimeSlot getProposedNewTime() {
        return this.BackingStore.get("proposedNewTime");
    }
    /**
     * Gets the status property value. The attendee's response (none, accepted, declined, etc.) for the event and date-time that the response was sent.
     * @return a ResponseStatus
     */
    @jakarta.annotation.Nullable
    public ResponseStatus getStatus() {
        return this.BackingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("proposedNewTime", this.getProposedNewTime());
        writer.writeObjectValue("status", this.getStatus());
    }
    /**
     * Sets the proposedNewTime property value. An alternate date/time proposed by the attendee for a meeting request to start and end. If the attendee hasn't proposed another time, then this property isn't included in a response of a GET event.
     * @param value Value to set for the proposedNewTime property.
     */
    public void setProposedNewTime(@jakarta.annotation.Nullable final TimeSlot value) {
        this.BackingStore.set("proposedNewTime", value);
    }
    /**
     * Sets the status property value. The attendee's response (none, accepted, declined, etc.) for the event and date-time that the response was sent.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ResponseStatus value) {
        this.BackingStore.set("status", value);
    }
}
