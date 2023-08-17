package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttackSimulationRoot extends Entity implements Parsable {
    /**
     * Represents simulation automation created to run on a tenant.
     */
    private java.util.List<SimulationAutomation> simulationAutomations;
    /**
     * Represents an attack simulation training campaign in a tenant.
     */
    private java.util.List<Simulation> simulations;
    /**
     * Instantiates a new attackSimulationRoot and sets the default values.
     */
    public AttackSimulationRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attackSimulationRoot
     */
    @jakarta.annotation.Nonnull
    public static AttackSimulationRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttackSimulationRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("simulationAutomations", (n) -> { this.setSimulationAutomations(n.getCollectionOfObjectValues(SimulationAutomation::createFromDiscriminatorValue)); });
        deserializerMap.put("simulations", (n) -> { this.setSimulations(n.getCollectionOfObjectValues(Simulation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the simulationAutomations property value. Represents simulation automation created to run on a tenant.
     * @return a simulationAutomation
     */
    @jakarta.annotation.Nullable
    public java.util.List<SimulationAutomation> getSimulationAutomations() {
        return this.simulationAutomations;
    }
    /**
     * Gets the simulations property value. Represents an attack simulation training campaign in a tenant.
     * @return a simulation
     */
    @jakarta.annotation.Nullable
    public java.util.List<Simulation> getSimulations() {
        return this.simulations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("simulationAutomations", this.getSimulationAutomations());
        writer.writeCollectionOfObjectValues("simulations", this.getSimulations());
    }
    /**
     * Sets the simulationAutomations property value. Represents simulation automation created to run on a tenant.
     * @param value Value to set for the simulationAutomations property.
     */
    public void setSimulationAutomations(@jakarta.annotation.Nullable final java.util.List<SimulationAutomation> value) {
        this.simulationAutomations = value;
    }
    /**
     * Sets the simulations property value. Represents an attack simulation training campaign in a tenant.
     * @param value Value to set for the simulations property.
     */
    public void setSimulations(@jakarta.annotation.Nullable final java.util.List<Simulation> value) {
        this.simulations = value;
    }
}
