package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttackSimulationRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AttackSimulationRoot} and sets the default values.
     */
    public AttackSimulationRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AttackSimulationRoot}
     */
    @jakarta.annotation.Nonnull
    public static AttackSimulationRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttackSimulationRoot();
    }
    /**
     * Gets the endUserNotifications property value. Represents an end user's notification for an attack simulation training.
     * @return a {@link java.util.List<EndUserNotification>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EndUserNotification> getEndUserNotifications() {
        return this.backingStore.get("endUserNotifications");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("endUserNotifications", (n) -> { this.setEndUserNotifications(n.getCollectionOfObjectValues(EndUserNotification::createFromDiscriminatorValue)); });
        deserializerMap.put("landingPages", (n) -> { this.setLandingPages(n.getCollectionOfObjectValues(LandingPage::createFromDiscriminatorValue)); });
        deserializerMap.put("loginPages", (n) -> { this.setLoginPages(n.getCollectionOfObjectValues(LoginPage::createFromDiscriminatorValue)); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(AttackSimulationOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("payloads", (n) -> { this.setPayloads(n.getCollectionOfObjectValues(Payload::createFromDiscriminatorValue)); });
        deserializerMap.put("simulationAutomations", (n) -> { this.setSimulationAutomations(n.getCollectionOfObjectValues(SimulationAutomation::createFromDiscriminatorValue)); });
        deserializerMap.put("simulations", (n) -> { this.setSimulations(n.getCollectionOfObjectValues(Simulation::createFromDiscriminatorValue)); });
        deserializerMap.put("trainings", (n) -> { this.setTrainings(n.getCollectionOfObjectValues(Training::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the landingPages property value. Represents an attack simulation training landing page.
     * @return a {@link java.util.List<LandingPage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LandingPage> getLandingPages() {
        return this.backingStore.get("landingPages");
    }
    /**
     * Gets the loginPages property value. Represents an attack simulation training login page.
     * @return a {@link java.util.List<LoginPage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LoginPage> getLoginPages() {
        return this.backingStore.get("loginPages");
    }
    /**
     * Gets the operations property value. Represents an attack simulation training operation.
     * @return a {@link java.util.List<AttackSimulationOperation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttackSimulationOperation> getOperations() {
        return this.backingStore.get("operations");
    }
    /**
     * Gets the payloads property value. Represents an attack simulation training campaign payload in a tenant.
     * @return a {@link java.util.List<Payload>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Payload> getPayloads() {
        return this.backingStore.get("payloads");
    }
    /**
     * Gets the simulationAutomations property value. Represents simulation automation created to run on a tenant.
     * @return a {@link java.util.List<SimulationAutomation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SimulationAutomation> getSimulationAutomations() {
        return this.backingStore.get("simulationAutomations");
    }
    /**
     * Gets the simulations property value. Represents an attack simulation training campaign in a tenant.
     * @return a {@link java.util.List<Simulation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Simulation> getSimulations() {
        return this.backingStore.get("simulations");
    }
    /**
     * Gets the trainings property value. Represents details about attack simulation trainings.
     * @return a {@link java.util.List<Training>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Training> getTrainings() {
        return this.backingStore.get("trainings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("endUserNotifications", this.getEndUserNotifications());
        writer.writeCollectionOfObjectValues("landingPages", this.getLandingPages());
        writer.writeCollectionOfObjectValues("loginPages", this.getLoginPages());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("payloads", this.getPayloads());
        writer.writeCollectionOfObjectValues("simulationAutomations", this.getSimulationAutomations());
        writer.writeCollectionOfObjectValues("simulations", this.getSimulations());
        writer.writeCollectionOfObjectValues("trainings", this.getTrainings());
    }
    /**
     * Sets the endUserNotifications property value. Represents an end user's notification for an attack simulation training.
     * @param value Value to set for the endUserNotifications property.
     */
    public void setEndUserNotifications(@jakarta.annotation.Nullable final java.util.List<EndUserNotification> value) {
        this.backingStore.set("endUserNotifications", value);
    }
    /**
     * Sets the landingPages property value. Represents an attack simulation training landing page.
     * @param value Value to set for the landingPages property.
     */
    public void setLandingPages(@jakarta.annotation.Nullable final java.util.List<LandingPage> value) {
        this.backingStore.set("landingPages", value);
    }
    /**
     * Sets the loginPages property value. Represents an attack simulation training login page.
     * @param value Value to set for the loginPages property.
     */
    public void setLoginPages(@jakarta.annotation.Nullable final java.util.List<LoginPage> value) {
        this.backingStore.set("loginPages", value);
    }
    /**
     * Sets the operations property value. Represents an attack simulation training operation.
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<AttackSimulationOperation> value) {
        this.backingStore.set("operations", value);
    }
    /**
     * Sets the payloads property value. Represents an attack simulation training campaign payload in a tenant.
     * @param value Value to set for the payloads property.
     */
    public void setPayloads(@jakarta.annotation.Nullable final java.util.List<Payload> value) {
        this.backingStore.set("payloads", value);
    }
    /**
     * Sets the simulationAutomations property value. Represents simulation automation created to run on a tenant.
     * @param value Value to set for the simulationAutomations property.
     */
    public void setSimulationAutomations(@jakarta.annotation.Nullable final java.util.List<SimulationAutomation> value) {
        this.backingStore.set("simulationAutomations", value);
    }
    /**
     * Sets the simulations property value. Represents an attack simulation training campaign in a tenant.
     * @param value Value to set for the simulations property.
     */
    public void setSimulations(@jakarta.annotation.Nullable final java.util.List<Simulation> value) {
        this.backingStore.set("simulations", value);
    }
    /**
     * Sets the trainings property value. Represents details about attack simulation trainings.
     * @param value Value to set for the trainings property.
     */
    public void setTrainings(@jakarta.annotation.Nullable final java.util.List<Training> value) {
        this.backingStore.set("trainings", value);
    }
}
