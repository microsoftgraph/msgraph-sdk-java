package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserTrainingEventInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The displayName property */
    private String _displayName;
    /** The latestTrainingStatus property */
    private TrainingStatus _latestTrainingStatus;
    /** The OdataType property */
    private String _odataType;
    /** The trainingAssignedProperties property */
    private UserTrainingContentEventInfo _trainingAssignedProperties;
    /** The trainingCompletedProperties property */
    private UserTrainingContentEventInfo _trainingCompletedProperties;
    /** The trainingUpdatedProperties property */
    private UserTrainingContentEventInfo _trainingUpdatedProperties;
    /**
     * Instantiates a new userTrainingEventInfo and sets the default values.
     * @return a void
     */
    public UserTrainingEventInfo() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.userTrainingEventInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userTrainingEventInfo
     */
    @javax.annotation.Nonnull
    public static UserTrainingEventInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserTrainingEventInfo();
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
        final UserTrainingEventInfo currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("latestTrainingStatus", (n) -> { currentObject.setLatestTrainingStatus(n.getEnumValue(TrainingStatus.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("trainingAssignedProperties", (n) -> { currentObject.setTrainingAssignedProperties(n.getObjectValue(UserTrainingContentEventInfo::createFromDiscriminatorValue)); });
            this.put("trainingCompletedProperties", (n) -> { currentObject.setTrainingCompletedProperties(n.getObjectValue(UserTrainingContentEventInfo::createFromDiscriminatorValue)); });
            this.put("trainingUpdatedProperties", (n) -> { currentObject.setTrainingUpdatedProperties(n.getObjectValue(UserTrainingContentEventInfo::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the latestTrainingStatus property value. The latestTrainingStatus property
     * @return a trainingStatus
     */
    @javax.annotation.Nullable
    public TrainingStatus getLatestTrainingStatus() {
        return this._latestTrainingStatus;
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
     * Gets the trainingAssignedProperties property value. The trainingAssignedProperties property
     * @return a userTrainingContentEventInfo
     */
    @javax.annotation.Nullable
    public UserTrainingContentEventInfo getTrainingAssignedProperties() {
        return this._trainingAssignedProperties;
    }
    /**
     * Gets the trainingCompletedProperties property value. The trainingCompletedProperties property
     * @return a userTrainingContentEventInfo
     */
    @javax.annotation.Nullable
    public UserTrainingContentEventInfo getTrainingCompletedProperties() {
        return this._trainingCompletedProperties;
    }
    /**
     * Gets the trainingUpdatedProperties property value. The trainingUpdatedProperties property
     * @return a userTrainingContentEventInfo
     */
    @javax.annotation.Nullable
    public UserTrainingContentEventInfo getTrainingUpdatedProperties() {
        return this._trainingUpdatedProperties;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("latestTrainingStatus", this.getLatestTrainingStatus());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("trainingAssignedProperties", this.getTrainingAssignedProperties());
        writer.writeObjectValue("trainingCompletedProperties", this.getTrainingCompletedProperties());
        writer.writeObjectValue("trainingUpdatedProperties", this.getTrainingUpdatedProperties());
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
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the latestTrainingStatus property value. The latestTrainingStatus property
     * @param value Value to set for the latestTrainingStatus property.
     * @return a void
     */
    public void setLatestTrainingStatus(@javax.annotation.Nullable final TrainingStatus value) {
        this._latestTrainingStatus = value;
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
     * Sets the trainingAssignedProperties property value. The trainingAssignedProperties property
     * @param value Value to set for the trainingAssignedProperties property.
     * @return a void
     */
    public void setTrainingAssignedProperties(@javax.annotation.Nullable final UserTrainingContentEventInfo value) {
        this._trainingAssignedProperties = value;
    }
    /**
     * Sets the trainingCompletedProperties property value. The trainingCompletedProperties property
     * @param value Value to set for the trainingCompletedProperties property.
     * @return a void
     */
    public void setTrainingCompletedProperties(@javax.annotation.Nullable final UserTrainingContentEventInfo value) {
        this._trainingCompletedProperties = value;
    }
    /**
     * Sets the trainingUpdatedProperties property value. The trainingUpdatedProperties property
     * @param value Value to set for the trainingUpdatedProperties property.
     * @return a void
     */
    public void setTrainingUpdatedProperties(@javax.annotation.Nullable final UserTrainingContentEventInfo value) {
        this._trainingUpdatedProperties = value;
    }
}
