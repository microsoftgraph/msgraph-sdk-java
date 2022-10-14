package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Attendee extends AttendeeBase implements Parsable {
    /** An alternate date/time proposed by the attendee for a meeting request to start and end. If the attendee hasn't proposed another time, then this property is not included in a response of a GET event. */
    private TimeSlot _proposedNewTime;
    /** The attendee's response (none, accepted, declined, etc.) for the event and date-time that the response was sent. */
    private ResponseStatus _status;
    /**
     * Instantiates a new Attendee and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Attendee() {
        super();
        this.setOdataType("#microsoft.graph.attendee");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Attendee
     */
    @javax.annotation.Nonnull
    public static Attendee createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Attendee();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Attendee currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("proposedNewTime", (n) -> { currentObject.setProposedNewTime(n.getObjectValue(TimeSlot::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getObjectValue(ResponseStatus::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the proposedNewTime property value. An alternate date/time proposed by the attendee for a meeting request to start and end. If the attendee hasn't proposed another time, then this property is not included in a response of a GET event.
     * @return a timeSlot
     */
    @javax.annotation.Nullable
    public TimeSlot getProposedNewTime() {
        return this._proposedNewTime;
    }
    /**
     * Gets the status property value. The attendee's response (none, accepted, declined, etc.) for the event and date-time that the response was sent.
     * @return a responseStatus
     */
    @javax.annotation.Nullable
    public ResponseStatus getStatus() {
        return this._status;
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
        writer.writeObjectValue("proposedNewTime", this.getProposedNewTime());
        writer.writeObjectValue("status", this.getStatus());
    }
    /**
     * Sets the proposedNewTime property value. An alternate date/time proposed by the attendee for a meeting request to start and end. If the attendee hasn't proposed another time, then this property is not included in a response of a GET event.
     * @param value Value to set for the proposedNewTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProposedNewTime(@javax.annotation.Nullable final TimeSlot value) {
        this._proposedNewTime = value;
    }
    /**
     * Sets the status property value. The attendee's response (none, accepted, declined, etc.) for the event and date-time that the response was sent.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final ResponseStatus value) {
        this._status = value;
    }
}
