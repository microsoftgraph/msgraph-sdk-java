package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TrainingEventsContent implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of assigned trainings and their information in an attack simulation and training campaign.
     */
    private java.util.List<AssignedTrainingInfo> assignedTrainingsInfos;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Number of users who were assigned trainings in an attack simulation and training campaign.
     */
    private Integer trainingsAssignedUserCount;
    /**
     * Instantiates a new TrainingEventsContent and sets the default values.
     */
    public TrainingEventsContent() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TrainingEventsContent
     */
    @jakarta.annotation.Nonnull
    public static TrainingEventsContent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrainingEventsContent();
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
     * Gets the assignedTrainingsInfos property value. List of assigned trainings and their information in an attack simulation and training campaign.
     * @return a java.util.List<AssignedTrainingInfo>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssignedTrainingInfo> getAssignedTrainingsInfos() {
        return this.assignedTrainingsInfos;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("assignedTrainingsInfos", (n) -> { this.setAssignedTrainingsInfos(n.getCollectionOfObjectValues(AssignedTrainingInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("trainingsAssignedUserCount", (n) -> { this.setTrainingsAssignedUserCount(n.getIntegerValue()); });
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
     * Gets the trainingsAssignedUserCount property value. Number of users who were assigned trainings in an attack simulation and training campaign.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTrainingsAssignedUserCount() {
        return this.trainingsAssignedUserCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("assignedTrainingsInfos", this.getAssignedTrainingsInfos());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("trainingsAssignedUserCount", this.getTrainingsAssignedUserCount());
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
     * Sets the assignedTrainingsInfos property value. List of assigned trainings and their information in an attack simulation and training campaign.
     * @param value Value to set for the assignedTrainingsInfos property.
     */
    public void setAssignedTrainingsInfos(@jakarta.annotation.Nullable final java.util.List<AssignedTrainingInfo> value) {
        this.assignedTrainingsInfos = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the trainingsAssignedUserCount property value. Number of users who were assigned trainings in an attack simulation and training campaign.
     * @param value Value to set for the trainingsAssignedUserCount property.
     */
    public void setTrainingsAssignedUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.trainingsAssignedUserCount = value;
    }
}
