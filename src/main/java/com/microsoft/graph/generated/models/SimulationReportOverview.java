package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SimulationReportOverview implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new SimulationReportOverview and sets the default values.
     */
    public SimulationReportOverview() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
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
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
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
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the recommendedActions property value. List of recommended actions for a tenant to improve its security posture based on the attack simulation and training campaign attack type.
     * @return a java.util.List<RecommendedAction>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RecommendedAction> getRecommendedActions() {
        return this.backingStore.get("recommendedActions");
    }
    /**
     * Gets the resolvedTargetsCount property value. Number of valid users in the attack simulation and training campaign.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getResolvedTargetsCount() {
        return this.backingStore.get("resolvedTargetsCount");
    }
    /**
     * Gets the simulationEventsContent property value. Summary of simulation events in the attack simulation and training campaign.
     * @return a SimulationEventsContent
     */
    @jakarta.annotation.Nullable
    public SimulationEventsContent getSimulationEventsContent() {
        return this.backingStore.get("simulationEventsContent");
    }
    /**
     * Gets the trainingEventsContent property value. Summary of assigned trainings in the attack simulation and training campaign.
     * @return a TrainingEventsContent
     */
    @jakarta.annotation.Nullable
    public TrainingEventsContent getTrainingEventsContent() {
        return this.backingStore.get("trainingEventsContent");
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
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the recommendedActions property value. List of recommended actions for a tenant to improve its security posture based on the attack simulation and training campaign attack type.
     * @param value Value to set for the recommendedActions property.
     */
    public void setRecommendedActions(@jakarta.annotation.Nullable final java.util.List<RecommendedAction> value) {
        this.backingStore.set("recommendedActions", value);
    }
    /**
     * Sets the resolvedTargetsCount property value. Number of valid users in the attack simulation and training campaign.
     * @param value Value to set for the resolvedTargetsCount property.
     */
    public void setResolvedTargetsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("resolvedTargetsCount", value);
    }
    /**
     * Sets the simulationEventsContent property value. Summary of simulation events in the attack simulation and training campaign.
     * @param value Value to set for the simulationEventsContent property.
     */
    public void setSimulationEventsContent(@jakarta.annotation.Nullable final SimulationEventsContent value) {
        this.backingStore.set("simulationEventsContent", value);
    }
    /**
     * Sets the trainingEventsContent property value. Summary of assigned trainings in the attack simulation and training campaign.
     * @param value Value to set for the trainingEventsContent property.
     */
    public void setTrainingEventsContent(@jakarta.annotation.Nullable final TrainingEventsContent value) {
        this.backingStore.set("trainingEventsContent", value);
    }
}
