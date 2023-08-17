package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserTrainingStatusInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Date and time of assignment of the training to the user.
     */
    private OffsetDateTime assignedDateTime;
    /**
     * Date and time of completion of the training by the user.
     */
    private OffsetDateTime completionDateTime;
    /**
     * Display name of the assigned training.
     */
    private String displayName;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The status of the training assigned to the user. Possible values are: unknown, assigned, inProgress, completed, overdue, unknownFutureValue.
     */
    private TrainingStatus trainingStatus;
    /**
     * Instantiates a new userTrainingStatusInfo and sets the default values.
     */
    public UserTrainingStatusInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userTrainingStatusInfo
     */
    @jakarta.annotation.Nonnull
    public static UserTrainingStatusInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserTrainingStatusInfo();
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
     * Gets the assignedDateTime property value. Date and time of assignment of the training to the user.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAssignedDateTime() {
        return this.assignedDateTime;
    }
    /**
     * Gets the completionDateTime property value. Date and time of completion of the training by the user.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletionDateTime() {
        return this.completionDateTime;
    }
    /**
     * Gets the displayName property value. Display name of the assigned training.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("assignedDateTime", (n) -> { this.setAssignedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("completionDateTime", (n) -> { this.setCompletionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("trainingStatus", (n) -> { this.setTrainingStatus(n.getEnumValue(TrainingStatus.class)); });
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
     * Gets the trainingStatus property value. The status of the training assigned to the user. Possible values are: unknown, assigned, inProgress, completed, overdue, unknownFutureValue.
     * @return a trainingStatus
     */
    @jakarta.annotation.Nullable
    public TrainingStatus getTrainingStatus() {
        return this.trainingStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("assignedDateTime", this.getAssignedDateTime());
        writer.writeOffsetDateTimeValue("completionDateTime", this.getCompletionDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("trainingStatus", this.getTrainingStatus());
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
     * Sets the assignedDateTime property value. Date and time of assignment of the training to the user.
     * @param value Value to set for the assignedDateTime property.
     */
    public void setAssignedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.assignedDateTime = value;
    }
    /**
     * Sets the completionDateTime property value. Date and time of completion of the training by the user.
     * @param value Value to set for the completionDateTime property.
     */
    public void setCompletionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.completionDateTime = value;
    }
    /**
     * Sets the displayName property value. Display name of the assigned training.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the trainingStatus property value. The status of the training assigned to the user. Possible values are: unknown, assigned, inProgress, completed, overdue, unknownFutureValue.
     * @param value Value to set for the trainingStatus property.
     */
    public void setTrainingStatus(@jakarta.annotation.Nullable final TrainingStatus value) {
        this.trainingStatus = value;
    }
}
