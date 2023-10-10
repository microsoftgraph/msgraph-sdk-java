package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SimulationReportOverview implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * List of recommended actions for a tenant to improve its security posture based on the attack simulation and training campaign attack type.
     */
    private java.util.List<RecommendedAction> recommendedActions;
    /**
     * Number of valid users in the attack simulation and training campaign.
     */
    private Integer resolvedTargetsCount;
    /**
     * Summary of simulation events in the attack simulation and training campaign.
     */
    private SimulationEventsContent simulationEventsContent;
    /**
     * Summary of assigned trainings in the attack simulation and training campaign.
     */
    private TrainingEventsContent trainingEventsContent;
    /**
     * Instantiates a new SimulationReportOverview and sets the default values.
     */
    public SimulationReportOverview() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SimulationReportOverview
     */
    @jakarta.annotation.Nonnull
    public static SimulationReportOverview createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SimulationReportOverview();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recommendedActions", (n) -> { this.setRecommendedActions(n.getCollectionOfObjectValues(RecommendedAction::createFromDiscriminatorValue)); });
        deserializerMap.put("resolvedTargetsCount", (n) -> { this.setResolvedTargetsCount(n.getIntegerValue()); });
        deserializerMap.put("simulationEventsContent", (n) -> { this.setSimulationEventsContent(n.getObjectValue(SimulationEventsContent::createFromDiscriminatorValue)); });
        deserializerMap.put("trainingEventsContent", (n) -> { this.setTrainingEventsContent(n.getObjectValue(TrainingEventsContent::createFromDiscriminatorValue)); });
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
     * Gets the recommendedActions property value. List of recommended actions for a tenant to improve its security posture based on the attack simulation and training campaign attack type.
     * @return a java.util.List<RecommendedAction>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RecommendedAction> getRecommendedActions() {
        return this.recommendedActions;
    }
    /**
     * Gets the resolvedTargetsCount property value. Number of valid users in the attack simulation and training campaign.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getResolvedTargetsCount() {
        return this.resolvedTargetsCount;
    }
    /**
     * Gets the simulationEventsContent property value. Summary of simulation events in the attack simulation and training campaign.
     * @return a SimulationEventsContent
     */
    @jakarta.annotation.Nullable
    public SimulationEventsContent getSimulationEventsContent() {
        return this.simulationEventsContent;
    }
    /**
     * Gets the trainingEventsContent property value. Summary of assigned trainings in the attack simulation and training campaign.
     * @return a TrainingEventsContent
     */
    @jakarta.annotation.Nullable
    public TrainingEventsContent getTrainingEventsContent() {
        return this.trainingEventsContent;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("recommendedActions", this.getRecommendedActions());
        writer.writeIntegerValue("resolvedTargetsCount", this.getResolvedTargetsCount());
        writer.writeObjectValue("simulationEventsContent", this.getSimulationEventsContent());
        writer.writeObjectValue("trainingEventsContent", this.getTrainingEventsContent());
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
     * Sets the recommendedActions property value. List of recommended actions for a tenant to improve its security posture based on the attack simulation and training campaign attack type.
     * @param value Value to set for the recommendedActions property.
     */
    public void setRecommendedActions(@jakarta.annotation.Nullable final java.util.List<RecommendedAction> value) {
        this.recommendedActions = value;
    }
    /**
     * Sets the resolvedTargetsCount property value. Number of valid users in the attack simulation and training campaign.
     * @param value Value to set for the resolvedTargetsCount property.
     */
    public void setResolvedTargetsCount(@jakarta.annotation.Nullable final Integer value) {
        this.resolvedTargetsCount = value;
    }
    /**
     * Sets the simulationEventsContent property value. Summary of simulation events in the attack simulation and training campaign.
     * @param value Value to set for the simulationEventsContent property.
     */
    public void setSimulationEventsContent(@jakarta.annotation.Nullable final SimulationEventsContent value) {
        this.simulationEventsContent = value;
    }
    /**
     * Sets the trainingEventsContent property value. Summary of assigned trainings in the attack simulation and training campaign.
     * @param value Value to set for the trainingEventsContent property.
     */
    public void setTrainingEventsContent(@jakarta.annotation.Nullable final TrainingEventsContent value) {
        this.trainingEventsContent = value;
    }
}
