package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserSimulationDetails implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Number of trainings assigned to a user in an attack simulation and training campaign. */
    private Integer _assignedTrainingsCount;
    /** Number of trainings completed by a user in an attack simulation and training campaign. */
    private Integer _completedTrainingsCount;
    /** Date and time of the compromising online action by a user in an attack simulation and training campaign. */
    private OffsetDateTime _compromisedDateTime;
    /** Number of trainings in progress by a user in an attack simulation and training campaign. */
    private Integer _inProgressTrainingsCount;
    /** Indicates whether a user was compromised in an attack simulation and training campaign. */
    private Boolean _isCompromised;
    /** The OdataType property */
    private String _odataType;
    /** Date and time when a user reported the delivered payload as phishing in the attack simulation and training campaign. */
    private OffsetDateTime _reportedPhishDateTime;
    /** List of simulation events of a user in the attack simulation and training campaign. */
    private java.util.List<UserSimulationEventInfo> _simulationEvents;
    /** User in an attack simulation and training campaign. */
    private AttackSimulationUser _simulationUser;
    /** List of training events of a user in the attack simulation and training campaign. */
    private java.util.List<UserTrainingEventInfo> _trainingEvents;
    /**
     * Instantiates a new userSimulationDetails and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserSimulationDetails() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.userSimulationDetails");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userSimulationDetails
     */
    @javax.annotation.Nonnull
    public static UserSimulationDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSimulationDetails();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the assignedTrainingsCount property value. Number of trainings assigned to a user in an attack simulation and training campaign.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAssignedTrainingsCount() {
        return this._assignedTrainingsCount;
    }
    /**
     * Gets the completedTrainingsCount property value. Number of trainings completed by a user in an attack simulation and training campaign.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCompletedTrainingsCount() {
        return this._completedTrainingsCount;
    }
    /**
     * Gets the compromisedDateTime property value. Date and time of the compromising online action by a user in an attack simulation and training campaign.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompromisedDateTime() {
        return this._compromisedDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserSimulationDetails currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(10) {{
            this.put("assignedTrainingsCount", (n) -> { currentObject.setAssignedTrainingsCount(n.getIntegerValue()); });
            this.put("completedTrainingsCount", (n) -> { currentObject.setCompletedTrainingsCount(n.getIntegerValue()); });
            this.put("compromisedDateTime", (n) -> { currentObject.setCompromisedDateTime(n.getOffsetDateTimeValue()); });
            this.put("inProgressTrainingsCount", (n) -> { currentObject.setInProgressTrainingsCount(n.getIntegerValue()); });
            this.put("isCompromised", (n) -> { currentObject.setIsCompromised(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("reportedPhishDateTime", (n) -> { currentObject.setReportedPhishDateTime(n.getOffsetDateTimeValue()); });
            this.put("simulationEvents", (n) -> { currentObject.setSimulationEvents(n.getCollectionOfObjectValues(UserSimulationEventInfo::createFromDiscriminatorValue)); });
            this.put("simulationUser", (n) -> { currentObject.setSimulationUser(n.getObjectValue(AttackSimulationUser::createFromDiscriminatorValue)); });
            this.put("trainingEvents", (n) -> { currentObject.setTrainingEvents(n.getCollectionOfObjectValues(UserTrainingEventInfo::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the inProgressTrainingsCount property value. Number of trainings in progress by a user in an attack simulation and training campaign.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInProgressTrainingsCount() {
        return this._inProgressTrainingsCount;
    }
    /**
     * Gets the isCompromised property value. Indicates whether a user was compromised in an attack simulation and training campaign.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCompromised() {
        return this._isCompromised;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the reportedPhishDateTime property value. Date and time when a user reported the delivered payload as phishing in the attack simulation and training campaign.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReportedPhishDateTime() {
        return this._reportedPhishDateTime;
    }
    /**
     * Gets the simulationEvents property value. List of simulation events of a user in the attack simulation and training campaign.
     * @return a userSimulationEventInfo
     */
    @javax.annotation.Nullable
    public java.util.List<UserSimulationEventInfo> getSimulationEvents() {
        return this._simulationEvents;
    }
    /**
     * Gets the simulationUser property value. User in an attack simulation and training campaign.
     * @return a attackSimulationUser
     */
    @javax.annotation.Nullable
    public AttackSimulationUser getSimulationUser() {
        return this._simulationUser;
    }
    /**
     * Gets the trainingEvents property value. List of training events of a user in the attack simulation and training campaign.
     * @return a userTrainingEventInfo
     */
    @javax.annotation.Nullable
    public java.util.List<UserTrainingEventInfo> getTrainingEvents() {
        return this._trainingEvents;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the assignedTrainingsCount property value. Number of trainings assigned to a user in an attack simulation and training campaign.
     * @param value Value to set for the assignedTrainingsCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedTrainingsCount(@javax.annotation.Nullable final Integer value) {
        this._assignedTrainingsCount = value;
    }
    /**
     * Sets the completedTrainingsCount property value. Number of trainings completed by a user in an attack simulation and training campaign.
     * @param value Value to set for the completedTrainingsCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedTrainingsCount(@javax.annotation.Nullable final Integer value) {
        this._completedTrainingsCount = value;
    }
    /**
     * Sets the compromisedDateTime property value. Date and time of the compromising online action by a user in an attack simulation and training campaign.
     * @param value Value to set for the compromisedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompromisedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._compromisedDateTime = value;
    }
    /**
     * Sets the inProgressTrainingsCount property value. Number of trainings in progress by a user in an attack simulation and training campaign.
     * @param value Value to set for the inProgressTrainingsCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInProgressTrainingsCount(@javax.annotation.Nullable final Integer value) {
        this._inProgressTrainingsCount = value;
    }
    /**
     * Sets the isCompromised property value. Indicates whether a user was compromised in an attack simulation and training campaign.
     * @param value Value to set for the isCompromised property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsCompromised(@javax.annotation.Nullable final Boolean value) {
        this._isCompromised = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the reportedPhishDateTime property value. Date and time when a user reported the delivered payload as phishing in the attack simulation and training campaign.
     * @param value Value to set for the reportedPhishDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReportedPhishDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._reportedPhishDateTime = value;
    }
    /**
     * Sets the simulationEvents property value. List of simulation events of a user in the attack simulation and training campaign.
     * @param value Value to set for the simulationEvents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSimulationEvents(@javax.annotation.Nullable final java.util.List<UserSimulationEventInfo> value) {
        this._simulationEvents = value;
    }
    /**
     * Sets the simulationUser property value. User in an attack simulation and training campaign.
     * @param value Value to set for the simulationUser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSimulationUser(@javax.annotation.Nullable final AttackSimulationUser value) {
        this._simulationUser = value;
    }
    /**
     * Sets the trainingEvents property value. List of training events of a user in the attack simulation and training campaign.
     * @param value Value to set for the trainingEvents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrainingEvents(@javax.annotation.Nullable final java.util.List<UserTrainingEventInfo> value) {
        this._trainingEvents = value;
    }
}
