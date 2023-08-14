package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EventMessageResponse extends EventMessage implements Parsable {
    /**
     * The proposedNewTime property
     */
    private TimeSlot proposedNewTime;
    /**
     * The responseType property
     */
    private ResponseType responseType;
    /**
     * Instantiates a new eventMessageResponse and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public EventMessageResponse() {
        super();
        this.setOdataType("#microsoft.graph.eventMessageResponse");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a eventMessageResponse
     */
    @jakarta.annotation.Nonnull
    public static EventMessageResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EventMessageResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("proposedNewTime", (n) -> { this.setProposedNewTime(n.getObjectValue(TimeSlot::createFromDiscriminatorValue)); });
        deserializerMap.put("responseType", (n) -> { this.setResponseType(n.getEnumValue(ResponseType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the proposedNewTime property value. The proposedNewTime property
     * @return a timeSlot
     */
    @jakarta.annotation.Nullable
    public TimeSlot getProposedNewTime() {
        return this.proposedNewTime;
    }
    /**
     * Gets the responseType property value. The responseType property
     * @return a responseType
     */
    @jakarta.annotation.Nullable
    public ResponseType getResponseType() {
        return this.responseType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("proposedNewTime", this.getProposedNewTime());
        writer.writeEnumValue("responseType", this.getResponseType());
    }
    /**
     * Sets the proposedNewTime property value. The proposedNewTime property
     * @param value Value to set for the proposedNewTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProposedNewTime(@jakarta.annotation.Nullable final TimeSlot value) {
        this.proposedNewTime = value;
    }
    /**
     * Sets the responseType property value. The responseType property
     * @param value Value to set for the responseType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResponseType(@jakarta.annotation.Nullable final ResponseType value) {
        this.responseType = value;
    }
}
