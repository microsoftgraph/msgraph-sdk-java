package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeltaParticipants extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeltaParticipants} and sets the default values.
     */
    public DeltaParticipants() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeltaParticipants}
     */
    @jakarta.annotation.Nonnull
    public static DeltaParticipants createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeltaParticipants();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("participants", (n) -> { this.setParticipants(n.getCollectionOfObjectValues(Participant::createFromDiscriminatorValue)); });
        deserializerMap.put("sequenceNumber", (n) -> { this.setSequenceNumber(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the participants property value. The collection of participants that were updated since the last roster update.
     * @return a {@link java.util.List<Participant>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Participant> getParticipants() {
        return this.backingStore.get("participants");
    }
    /**
     * Gets the sequenceNumber property value. The sequence number for the roster update that is used to identify the notification order.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSequenceNumber() {
        return this.backingStore.get("sequenceNumber");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("participants", this.getParticipants());
        writer.writeLongValue("sequenceNumber", this.getSequenceNumber());
    }
    /**
     * Sets the participants property value. The collection of participants that were updated since the last roster update.
     * @param value Value to set for the participants property.
     */
    public void setParticipants(@jakarta.annotation.Nullable final java.util.List<Participant> value) {
        this.backingStore.set("participants", value);
    }
    /**
     * Sets the sequenceNumber property value. The sequence number for the roster update that is used to identify the notification order.
     * @param value Value to set for the sequenceNumber property.
     */
    public void setSequenceNumber(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("sequenceNumber", value);
    }
}
