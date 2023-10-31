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
     * Represents an end user's notification for an attack simulation training.
     */
    private java.util.List<EndUserNotification> endUserNotifications;
    /**
     * Represents an attack simulation training landing page.
     */
    private java.util.List<LandingPage> landingPages;
    /**
     * Represents an attack simulation training login page.
     */
    private java.util.List<LoginPage> loginPages;
    /**
     * Represents an attack simulation training operation.
     */
    private java.util.List<AttackSimulationOperation> operations;
    /**
     * Represents an attack simulation training campaign payload in a tenant.
     */
    private java.util.List<Payload> payloads;
    /**
     * Represents simulation automation created to run on a tenant.
     */
    private java.util.List<SimulationAutomation> simulationAutomations;
    /**
     * Represents an attack simulation training campaign in a tenant.
     */
    private java.util.List<Simulation> simulations;
    /**
     * Represents details about attack simulation trainings.
     */
    private java.util.List<Training> trainings;
    /**
     * Instantiates a new AttackSimulationRoot and sets the default values.
     */
    public AttackSimulationRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AttackSimulationRoot
     */
    @jakarta.annotation.Nonnull
    public static AttackSimulationRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttackSimulationRoot();
    }
    /**
     * Gets the endUserNotifications property value. Represents an end user's notification for an attack simulation training.
     * @return a java.util.List<EndUserNotification>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EndUserNotification> getEndUserNotifications() {
        return this.endUserNotifications;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a java.util.List<LandingPage>
     */
    @jakarta.annotation.Nullable
    public java.util.List<LandingPage> getLandingPages() {
        return this.landingPages;
    }
    /**
     * Gets the loginPages property value. Represents an attack simulation training login page.
     * @return a java.util.List<LoginPage>
     */
    @jakarta.annotation.Nullable
    public java.util.List<LoginPage> getLoginPages() {
        return this.loginPages;
    }
    /**
     * Gets the operations property value. Represents an attack simulation training operation.
     * @return a java.util.List<AttackSimulationOperation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttackSimulationOperation> getOperations() {
        return this.operations;
    }
    /**
     * Gets the payloads property value. Represents an attack simulation training campaign payload in a tenant.
     * @return a java.util.List<Payload>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Payload> getPayloads() {
        return this.payloads;
    }
    /**
     * Gets the simulationAutomations property value. Represents simulation automation created to run on a tenant.
     * @return a java.util.List<SimulationAutomation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SimulationAutomation> getSimulationAutomations() {
        return this.simulationAutomations;
    }
    /**
     * Gets the simulations property value. Represents an attack simulation training campaign in a tenant.
     * @return a java.util.List<Simulation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Simulation> getSimulations() {
        return this.simulations;
    }
    /**
     * Gets the trainings property value. Represents details about attack simulation trainings.
     * @return a java.util.List<Training>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Training> getTrainings() {
        return this.trainings;
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
        this.endUserNotifications = value;
    }
    /**
     * Sets the landingPages property value. Represents an attack simulation training landing page.
     * @param value Value to set for the landingPages property.
     */
    public void setLandingPages(@jakarta.annotation.Nullable final java.util.List<LandingPage> value) {
        this.landingPages = value;
    }
    /**
     * Sets the loginPages property value. Represents an attack simulation training login page.
     * @param value Value to set for the loginPages property.
     */
    public void setLoginPages(@jakarta.annotation.Nullable final java.util.List<LoginPage> value) {
        this.loginPages = value;
    }
    /**
     * Sets the operations property value. Represents an attack simulation training operation.
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<AttackSimulationOperation> value) {
        this.operations = value;
    }
    /**
     * Sets the payloads property value. Represents an attack simulation training campaign payload in a tenant.
     * @param value Value to set for the payloads property.
     */
    public void setPayloads(@jakarta.annotation.Nullable final java.util.List<Payload> value) {
        this.payloads = value;
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
    /**
     * Sets the trainings property value. Represents details about attack simulation trainings.
     * @param value Value to set for the trainings property.
     */
    public void setTrainings(@jakarta.annotation.Nullable final java.util.List<Training> value) {
        this.trainings = value;
    }
}
