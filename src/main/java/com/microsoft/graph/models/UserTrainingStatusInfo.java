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
public class UserTrainingStatusInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The assignedDateTime property */
    private OffsetDateTime _assignedDateTime;
    /** The completionDateTime property */
    private OffsetDateTime _completionDateTime;
    /** The displayName property */
    private String _displayName;
    /** The OdataType property */
    private String _odataType;
    /** The trainingStatus property */
    private TrainingStatus _trainingStatus;
    /**
     * Instantiates a new userTrainingStatusInfo and sets the default values.
     * @return a void
     */
    public UserTrainingStatusInfo() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.userTrainingStatusInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userTrainingStatusInfo
     */
    @javax.annotation.Nonnull
    public static UserTrainingStatusInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserTrainingStatusInfo();
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
     * Gets the assignedDateTime property value. The assignedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAssignedDateTime() {
        return this._assignedDateTime;
    }
    /**
     * Gets the completionDateTime property value. The completionDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletionDateTime() {
        return this._completionDateTime;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserTrainingStatusInfo currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("assignedDateTime", (n) -> { currentObject.setAssignedDateTime(n.getOffsetDateTimeValue()); });
            this.put("completionDateTime", (n) -> { currentObject.setCompletionDateTime(n.getOffsetDateTimeValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("trainingStatus", (n) -> { currentObject.setTrainingStatus(n.getEnumValue(TrainingStatus.class)); });
        }};
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
     * Gets the trainingStatus property value. The trainingStatus property
     * @return a trainingStatus
     */
    @javax.annotation.Nullable
    public TrainingStatus getTrainingStatus() {
        return this._trainingStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the assignedDateTime property value. The assignedDateTime property
     * @param value Value to set for the assignedDateTime property.
     * @return a void
     */
    public void setAssignedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._assignedDateTime = value;
    }
    /**
     * Sets the completionDateTime property value. The completionDateTime property
     * @param value Value to set for the completionDateTime property.
     * @return a void
     */
    public void setCompletionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._completionDateTime = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
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
     * Sets the trainingStatus property value. The trainingStatus property
     * @param value Value to set for the trainingStatus property.
     * @return a void
     */
    public void setTrainingStatus(@javax.annotation.Nullable final TrainingStatus value) {
        this._trainingStatus = value;
    }
}
