package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the admin singleton. */
public class SimulationAutomationRun extends Entity implements Parsable {
    /** Date and time when the run ends in an attack simulation automation. */
    private OffsetDateTime _endDateTime;
    /** Unique identifier for the attack simulation campaign initiated in the attack simulation automation run. */
    private String _simulationId;
    /** Date and time when the run starts in an attack simulation automation. */
    private OffsetDateTime _startDateTime;
    /** Status of the attack simulation automation run. The possible values are: unknown, running, succeeded, failed, skipped, unknownFutureValue. */
    private SimulationAutomationRunStatus _status;
    /**
     * Instantiates a new simulationAutomationRun and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SimulationAutomationRun() {
        super();
        this.setOdataType("#microsoft.graph.simulationAutomationRun");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a simulationAutomationRun
     */
    @javax.annotation.Nonnull
    public static SimulationAutomationRun createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SimulationAutomationRun();
    }
    /**
     * Gets the endDateTime property value. Date and time when the run ends in an attack simulation automation.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SimulationAutomationRun currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("simulationId", (n) -> { currentObject.setSimulationId(n.getStringValue()); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(SimulationAutomationRunStatus.class)); });
        }};
    }
    /**
     * Gets the simulationId property value. Unique identifier for the attack simulation campaign initiated in the attack simulation automation run.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSimulationId() {
        return this._simulationId;
    }
    /**
     * Gets the startDateTime property value. Date and time when the run starts in an attack simulation automation.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the status property value. Status of the attack simulation automation run. The possible values are: unknown, running, succeeded, failed, skipped, unknownFutureValue.
     * @return a simulationAutomationRunStatus
     */
    @javax.annotation.Nullable
    public SimulationAutomationRunStatus getStatus() {
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
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("simulationId", this.getSimulationId());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the endDateTime property value. Date and time when the run ends in an attack simulation automation.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the simulationId property value. Unique identifier for the attack simulation campaign initiated in the attack simulation automation run.
     * @param value Value to set for the simulationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSimulationId(@javax.annotation.Nullable final String value) {
        this._simulationId = value;
    }
    /**
     * Sets the startDateTime property value. Date and time when the run starts in an attack simulation automation.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the status property value. Status of the attack simulation automation run. The possible values are: unknown, running, succeeded, failed, skipped, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final SimulationAutomationRunStatus value) {
        this._status = value;
    }
}
