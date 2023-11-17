package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SimulationAutomationRun extends Entity implements Parsable {
    /**
     * Instantiates a new SimulationAutomationRun and sets the default values.
     */
    public SimulationAutomationRun() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SimulationAutomationRun
     */
    @jakarta.annotation.Nonnull
    public static SimulationAutomationRun createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SimulationAutomationRun();
    }
    /**
     * Gets the endDateTime property value. Date and time when the run ends in an attack simulation automation.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("simulationId", (n) -> { this.setSimulationId(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SimulationAutomationRunStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the simulationId property value. Unique identifier for the attack simulation campaign initiated in the attack simulation automation run.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSimulationId() {
        return this.backingStore.get("simulationId");
    }
    /**
     * Gets the startDateTime property value. Date and time when the run starts in an attack simulation automation.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the status property value. Status of the attack simulation automation run. The possible values are: unknown, running, succeeded, failed, skipped, unknownFutureValue.
     * @return a SimulationAutomationRunStatus
     */
    @jakarta.annotation.Nullable
    public SimulationAutomationRunStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("simulationId", this.getSimulationId());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the endDateTime property value. Date and time when the run ends in an attack simulation automation.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the simulationId property value. Unique identifier for the attack simulation campaign initiated in the attack simulation automation run.
     * @param value Value to set for the simulationId property.
     */
    public void setSimulationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("simulationId", value);
    }
    /**
     * Sets the startDateTime property value. Date and time when the run starts in an attack simulation automation.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the status property value. Status of the attack simulation automation run. The possible values are: unknown, running, succeeded, failed, skipped, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SimulationAutomationRunStatus value) {
        this.backingStore.set("status", value);
    }
}
