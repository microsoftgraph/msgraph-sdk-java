package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NoTrainingNotificationSetting extends EndUserNotificationSetting implements Parsable {
    /**
     * Instantiates a new NoTrainingNotificationSetting and sets the default values.
     */
    public NoTrainingNotificationSetting() {
        super();
        this.setOdataType("#microsoft.graph.noTrainingNotificationSetting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a NoTrainingNotificationSetting
     */
    @jakarta.annotation.Nonnull
    public static NoTrainingNotificationSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NoTrainingNotificationSetting();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("simulationNotification", (n) -> { this.setSimulationNotification(n.getObjectValue(SimulationNotification::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the simulationNotification property value. The notification for the user who is part of the simulation.
     * @return a SimulationNotification
     */
    @jakarta.annotation.Nullable
    public SimulationNotification getSimulationNotification() {
        return this.backingStore.get("simulationNotification");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("simulationNotification", this.getSimulationNotification());
    }
    /**
     * Sets the simulationNotification property value. The notification for the user who is part of the simulation.
     * @param value Value to set for the simulationNotification property.
     */
    public void setSimulationNotification(@jakarta.annotation.Nullable final SimulationNotification value) {
        this.backingStore.set("simulationNotification", value);
    }
}
