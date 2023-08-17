package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SimulationEventsContent implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Actual percentage of users who fell for the simulated attack in an attack simulation and training campaign.
     */
    private Double compromisedRate;
    /**
     * List of simulation events in an attack simulation and training campaign.
     */
    private java.util.List<SimulationEvent> events;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new simulationEventsContent and sets the default values.
     */
    public SimulationEventsContent() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a simulationEventsContent
     */
    @jakarta.annotation.Nonnull
    public static SimulationEventsContent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SimulationEventsContent();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the compromisedRate property value. Actual percentage of users who fell for the simulated attack in an attack simulation and training campaign.
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getCompromisedRate() {
        return this.compromisedRate;
    }
    /**
     * Gets the events property value. List of simulation events in an attack simulation and training campaign.
     * @return a simulationEvent
     */
    @jakarta.annotation.Nullable
    public java.util.List<SimulationEvent> getEvents() {
        return this.events;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("compromisedRate", (n) -> { this.setCompromisedRate(n.getDoubleValue()); });
        deserializerMap.put("events", (n) -> { this.setEvents(n.getCollectionOfObjectValues(SimulationEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("compromisedRate", this.getCompromisedRate());
        writer.writeCollectionOfObjectValues("events", this.getEvents());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the compromisedRate property value. Actual percentage of users who fell for the simulated attack in an attack simulation and training campaign.
     * @param value Value to set for the compromisedRate property.
     */
    public void setCompromisedRate(@jakarta.annotation.Nullable final Double value) {
        this.compromisedRate = value;
    }
    /**
     * Sets the events property value. List of simulation events in an attack simulation and training campaign.
     * @param value Value to set for the events property.
     */
    public void setEvents(@jakarta.annotation.Nullable final java.util.List<SimulationEvent> value) {
        this.events = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
