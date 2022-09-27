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
    /** The assignedTrainingsCount property */
    private Integer _assignedTrainingsCount;
    /** The completedTrainingsCount property */
    private Integer _completedTrainingsCount;
    /** The compromisedDateTime property */
    private OffsetDateTime _compromisedDateTime;
    /** The inProgressTrainingsCount property */
    private Integer _inProgressTrainingsCount;
    /** The isCompromised property */
    private Boolean _isCompromised;
    /** The OdataType property */
    private String _odataType;
    /** The reportedPhishDateTime property */
    private OffsetDateTime _reportedPhishDateTime;
    /** The simulationEvents property */
    private java.util.List<UserSimulationEventInfo> _simulationEvents;
    /** The simulationUser property */
    private AttackSimulationUser _simulationUser;
    /** The trainingEvents property */
    private java.util.List<UserTrainingEventInfo> _trainingEvents;
    /**
     * Instantiates a new userSimulationDetails and sets the default values.
     * @return a void
     */
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
     * Gets the assignedTrainingsCount property value. The assignedTrainingsCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAssignedTrainingsCount() {
        return this._assignedTrainingsCount;
    }
    /**
     * Gets the completedTrainingsCount property value. The completedTrainingsCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCompletedTrainingsCount() {
        return this._completedTrainingsCount;
    }
    /**
     * Gets the compromisedDateTime property value. The compromisedDateTime property
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
     * Gets the inProgressTrainingsCount property value. The inProgressTrainingsCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInProgressTrainingsCount() {
        return this._inProgressTrainingsCount;
    }
    /**
     * Gets the isCompromised property value. The isCompromised property
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
     * Gets the reportedPhishDateTime property value. The reportedPhishDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReportedPhishDateTime() {
        return this._reportedPhishDateTime;
    }
    /**
     * Gets the simulationEvents property value. The simulationEvents property
     * @return a userSimulationEventInfo
     */
    @javax.annotation.Nullable
    public java.util.List<UserSimulationEventInfo> getSimulationEvents() {
        return this._simulationEvents;
    }
    /**
     * Gets the simulationUser property value. The simulationUser property
     * @return a attackSimulationUser
     */
    @javax.annotation.Nullable
    public AttackSimulationUser getSimulationUser() {
        return this._simulationUser;
    }
    /**
     * Gets the trainingEvents property value. The trainingEvents property
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the assignedTrainingsCount property value. The assignedTrainingsCount property
     * @param value Value to set for the assignedTrainingsCount property.
     * @return a void
     */
    public void setAssignedTrainingsCount(@javax.annotation.Nullable final Integer value) {
        this._assignedTrainingsCount = value;
    }
    /**
     * Sets the completedTrainingsCount property value. The completedTrainingsCount property
     * @param value Value to set for the completedTrainingsCount property.
     * @return a void
     */
    public void setCompletedTrainingsCount(@javax.annotation.Nullable final Integer value) {
        this._completedTrainingsCount = value;
    }
    /**
     * Sets the compromisedDateTime property value. The compromisedDateTime property
     * @param value Value to set for the compromisedDateTime property.
     * @return a void
     */
    public void setCompromisedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._compromisedDateTime = value;
    }
    /**
     * Sets the inProgressTrainingsCount property value. The inProgressTrainingsCount property
     * @param value Value to set for the inProgressTrainingsCount property.
     * @return a void
     */
    public void setInProgressTrainingsCount(@javax.annotation.Nullable final Integer value) {
        this._inProgressTrainingsCount = value;
    }
    /**
     * Sets the isCompromised property value. The isCompromised property
     * @param value Value to set for the isCompromised property.
     * @return a void
     */
    public void setIsCompromised(@javax.annotation.Nullable final Boolean value) {
        this._isCompromised = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the reportedPhishDateTime property value. The reportedPhishDateTime property
     * @param value Value to set for the reportedPhishDateTime property.
     * @return a void
     */
    public void setReportedPhishDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._reportedPhishDateTime = value;
    }
    /**
     * Sets the simulationEvents property value. The simulationEvents property
     * @param value Value to set for the simulationEvents property.
     * @return a void
     */
    public void setSimulationEvents(@javax.annotation.Nullable final java.util.List<UserSimulationEventInfo> value) {
        this._simulationEvents = value;
    }
    /**
     * Sets the simulationUser property value. The simulationUser property
     * @param value Value to set for the simulationUser property.
     * @return a void
     */
    public void setSimulationUser(@javax.annotation.Nullable final AttackSimulationUser value) {
        this._simulationUser = value;
    }
    /**
     * Sets the trainingEvents property value. The trainingEvents property
     * @param value Value to set for the trainingEvents property.
     * @return a void
     */
    public void setTrainingEvents(@javax.annotation.Nullable final java.util.List<UserTrainingEventInfo> value) {
        this._trainingEvents = value;
    }
}
