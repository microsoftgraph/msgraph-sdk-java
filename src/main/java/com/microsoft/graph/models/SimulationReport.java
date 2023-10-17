package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SimulationReport implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Overview of an attack simulation and training campaign.
     */
    private SimulationReportOverview overview;
    /**
     * The tenant users and their online actions in an attack simulation and training campaign.
     */
    private java.util.List<UserSimulationDetails> simulationUsers;
    /**
     * Instantiates a new SimulationReport and sets the default values.
     */
    public SimulationReport() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SimulationReport
     */
    @jakarta.annotation.Nonnull
    public static SimulationReport createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SimulationReport();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("overview", (n) -> { this.setOverview(n.getObjectValue(SimulationReportOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("simulationUsers", (n) -> { this.setSimulationUsers(n.getCollectionOfObjectValues(UserSimulationDetails::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the overview property value. Overview of an attack simulation and training campaign.
     * @return a SimulationReportOverview
     */
    @jakarta.annotation.Nullable
    public SimulationReportOverview getOverview() {
        return this.overview;
    }
    /**
     * Gets the simulationUsers property value. The tenant users and their online actions in an attack simulation and training campaign.
     * @return a java.util.List<UserSimulationDetails>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserSimulationDetails> getSimulationUsers() {
        return this.simulationUsers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("overview", this.getOverview());
        writer.writeCollectionOfObjectValues("simulationUsers", this.getSimulationUsers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the overview property value. Overview of an attack simulation and training campaign.
     * @param value Value to set for the overview property.
     */
    public void setOverview(@jakarta.annotation.Nullable final SimulationReportOverview value) {
        this.overview = value;
    }
    /**
     * Sets the simulationUsers property value. The tenant users and their online actions in an attack simulation and training campaign.
     * @param value Value to set for the simulationUsers property.
     */
    public void setSimulationUsers(@jakarta.annotation.Nullable final java.util.List<UserSimulationDetails> value) {
        this.simulationUsers = value;
    }
}
