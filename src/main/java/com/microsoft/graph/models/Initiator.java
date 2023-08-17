package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Initiator extends Identity implements Parsable {
    /**
     * Type of initiator. Possible values are: user, application, system, unknownFutureValue.
     */
    private InitiatorType initiatorType;
    /**
     * Instantiates a new initiator and sets the default values.
     */
    public Initiator() {
        super();
        this.setOdataType("#microsoft.graph.initiator");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a initiator
     */
    @jakarta.annotation.Nonnull
    public static Initiator createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Initiator();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("initiatorType", (n) -> { this.setInitiatorType(n.getEnumValue(InitiatorType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the initiatorType property value. Type of initiator. Possible values are: user, application, system, unknownFutureValue.
     * @return a initiatorType
     */
    @jakarta.annotation.Nullable
    public InitiatorType getInitiatorType() {
        return this.initiatorType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("initiatorType", this.getInitiatorType());
    }
    /**
     * Sets the initiatorType property value. Type of initiator. Possible values are: user, application, system, unknownFutureValue.
     * @param value Value to set for the initiatorType property.
     */
    public void setInitiatorType(@jakarta.annotation.Nullable final InitiatorType value) {
        this.initiatorType = value;
    }
}
