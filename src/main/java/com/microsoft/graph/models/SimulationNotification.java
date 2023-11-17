package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SimulationNotification extends BaseEndUserNotification implements Parsable {
    /**
     * Instantiates a new SimulationNotification and sets the default values.
     */
    public SimulationNotification() {
        super();
        this.setOdataType("#microsoft.graph.simulationNotification");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SimulationNotification
     */
    @jakarta.annotation.Nonnull
    public static SimulationNotification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SimulationNotification();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("targettedUserType", (n) -> { this.setTargettedUserType(n.getEnumValue(TargettedUserType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the targettedUserType property value. Target user type. Possible values are: unknown, clicked, compromised, allUsers, unknownFutureValue.
     * @return a TargettedUserType
     */
    @jakarta.annotation.Nullable
    public TargettedUserType getTargettedUserType() {
        return this.backingStore.get("targettedUserType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("targettedUserType", this.getTargettedUserType());
    }
    /**
     * Sets the targettedUserType property value. Target user type. Possible values are: unknown, clicked, compromised, allUsers, unknownFutureValue.
     * @param value Value to set for the targettedUserType property.
     */
    public void setTargettedUserType(@jakarta.annotation.Nullable final TargettedUserType value) {
        this.backingStore.set("targettedUserType", value);
    }
}
