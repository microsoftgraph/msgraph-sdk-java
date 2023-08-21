package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserSimulationDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Number of trainings assigned to a user in an attack simulation and training campaign.
     */
    private Integer assignedTrainingsCount;
    /**
     * Number of trainings completed by a user in an attack simulation and training campaign.
     */
    private Integer completedTrainingsCount;
    /**
     * Date and time of the compromising online action by a user in an attack simulation and training campaign.
     */
    private OffsetDateTime compromisedDateTime;
    /**
     * Number of trainings in progress by a user in an attack simulation and training campaign.
     */
    private Integer inProgressTrainingsCount;
    /**
     * Indicates whether a user was compromised in an attack simulation and training campaign.
     */
    private Boolean isCompromised;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Date and time when a user reported the delivered payload as phishing in the attack simulation and training campaign.
     */
    private OffsetDateTime reportedPhishDateTime;
    /**
     * List of simulation events of a user in the attack simulation and training campaign.
     */
    private java.util.List<UserSimulationEventInfo> simulationEvents;
    /**
     * User in an attack simulation and training campaign.
     */
    private AttackSimulationUser simulationUser;
    /**
     * List of training events of a user in the attack simulation and training campaign.
     */
    private java.util.List<UserTrainingEventInfo> trainingEvents;
    /**
     * Instantiates a new userSimulationDetails and sets the default values.
     */
    public UserSimulationDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userSimulationDetails
     */
    @jakarta.annotation.Nonnull
    public static UserSimulationDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSimulationDetails();
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
     * Gets the assignedTrainingsCount property value. Number of trainings assigned to a user in an attack simulation and training campaign.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getAssignedTrainingsCount() {
        return this.assignedTrainingsCount;
    }
    /**
     * Gets the completedTrainingsCount property value. Number of trainings completed by a user in an attack simulation and training campaign.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getCompletedTrainingsCount() {
        return this.completedTrainingsCount;
    }
    /**
     * Gets the compromisedDateTime property value. Date and time of the compromising online action by a user in an attack simulation and training campaign.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompromisedDateTime() {
        return this.compromisedDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("assignedTrainingsCount", (n) -> { this.setAssignedTrainingsCount(n.getIntegerValue()); });
        deserializerMap.put("completedTrainingsCount", (n) -> { this.setCompletedTrainingsCount(n.getIntegerValue()); });
        deserializerMap.put("compromisedDateTime", (n) -> { this.setCompromisedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("inProgressTrainingsCount", (n) -> { this.setInProgressTrainingsCount(n.getIntegerValue()); });
        deserializerMap.put("isCompromised", (n) -> { this.setIsCompromised(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("reportedPhishDateTime", (n) -> { this.setReportedPhishDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("simulationEvents", (n) -> { this.setSimulationEvents(n.getCollectionOfObjectValues(UserSimulationEventInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("simulationUser", (n) -> { this.setSimulationUser(n.getObjectValue(AttackSimulationUser::createFromDiscriminatorValue)); });
        deserializerMap.put("trainingEvents", (n) -> { this.setTrainingEvents(n.getCollectionOfObjectValues(UserTrainingEventInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inProgressTrainingsCount property value. Number of trainings in progress by a user in an attack simulation and training campaign.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getInProgressTrainingsCount() {
        return this.inProgressTrainingsCount;
    }
    /**
     * Gets the isCompromised property value. Indicates whether a user was compromised in an attack simulation and training campaign.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCompromised() {
        return this.isCompromised;
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
     * Gets the reportedPhishDateTime property value. Date and time when a user reported the delivered payload as phishing in the attack simulation and training campaign.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReportedPhishDateTime() {
        return this.reportedPhishDateTime;
    }
    /**
     * Gets the simulationEvents property value. List of simulation events of a user in the attack simulation and training campaign.
     * @return a userSimulationEventInfo
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserSimulationEventInfo> getSimulationEvents() {
        return this.simulationEvents;
    }
    /**
     * Gets the simulationUser property value. User in an attack simulation and training campaign.
     * @return a attackSimulationUser
     */
    @jakarta.annotation.Nullable
    public AttackSimulationUser getSimulationUser() {
        return this.simulationUser;
    }
    /**
     * Gets the trainingEvents property value. List of training events of a user in the attack simulation and training campaign.
     * @return a userTrainingEventInfo
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserTrainingEventInfo> getTrainingEvents() {
        return this.trainingEvents;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("assignedTrainingsCount", this.getAssignedTrainingsCount());
        writer.writeIntegerValue("completedTrainingsCount", this.getCompletedTrainingsCount());
        writer.writeOffsetDateTimeValue("compromisedDateTime", this.getCompromisedDateTime());
        writer.writeIntegerValue("inProgressTrainingsCount", this.getInProgressTrainingsCount());
        writer.writeBooleanValue("isCompromised", this.getIsCompromised());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("reportedPhishDateTime", this.getReportedPhishDateTime());
        writer.writeCollectionOfObjectValues("simulationEvents", this.getSimulationEvents());
        writer.writeObjectValue("simulationUser", this.getSimulationUser());
        writer.writeCollectionOfObjectValues("trainingEvents", this.getTrainingEvents());
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
     * Sets the assignedTrainingsCount property value. Number of trainings assigned to a user in an attack simulation and training campaign.
     * @param value Value to set for the assignedTrainingsCount property.
     */
    public void setAssignedTrainingsCount(@jakarta.annotation.Nullable final Integer value) {
        this.assignedTrainingsCount = value;
    }
    /**
     * Sets the completedTrainingsCount property value. Number of trainings completed by a user in an attack simulation and training campaign.
     * @param value Value to set for the completedTrainingsCount property.
     */
    public void setCompletedTrainingsCount(@jakarta.annotation.Nullable final Integer value) {
        this.completedTrainingsCount = value;
    }
    /**
     * Sets the compromisedDateTime property value. Date and time of the compromising online action by a user in an attack simulation and training campaign.
     * @param value Value to set for the compromisedDateTime property.
     */
    public void setCompromisedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.compromisedDateTime = value;
    }
    /**
     * Sets the inProgressTrainingsCount property value. Number of trainings in progress by a user in an attack simulation and training campaign.
     * @param value Value to set for the inProgressTrainingsCount property.
     */
    public void setInProgressTrainingsCount(@jakarta.annotation.Nullable final Integer value) {
        this.inProgressTrainingsCount = value;
    }
    /**
     * Sets the isCompromised property value. Indicates whether a user was compromised in an attack simulation and training campaign.
     * @param value Value to set for the isCompromised property.
     */
    public void setIsCompromised(@jakarta.annotation.Nullable final Boolean value) {
        this.isCompromised = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the reportedPhishDateTime property value. Date and time when a user reported the delivered payload as phishing in the attack simulation and training campaign.
     * @param value Value to set for the reportedPhishDateTime property.
     */
    public void setReportedPhishDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.reportedPhishDateTime = value;
    }
    /**
     * Sets the simulationEvents property value. List of simulation events of a user in the attack simulation and training campaign.
     * @param value Value to set for the simulationEvents property.
     */
    public void setSimulationEvents(@jakarta.annotation.Nullable final java.util.List<UserSimulationEventInfo> value) {
        this.simulationEvents = value;
    }
    /**
     * Sets the simulationUser property value. User in an attack simulation and training campaign.
     * @param value Value to set for the simulationUser property.
     */
    public void setSimulationUser(@jakarta.annotation.Nullable final AttackSimulationUser value) {
        this.simulationUser = value;
    }
    /**
     * Sets the trainingEvents property value. List of training events of a user in the attack simulation and training campaign.
     * @param value Value to set for the trainingEvents property.
     */
    public void setTrainingEvents(@jakarta.annotation.Nullable final java.util.List<UserTrainingEventInfo> value) {
        this.trainingEvents = value;
    }
}
