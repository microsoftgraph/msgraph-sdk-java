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
public class SubjectRightsRequestHistory implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Identity of the user who changed the  subject rights request. */
    private IdentitySet _changedBy;
    /** Data and time when the entity was changed. */
    private OffsetDateTime _eventDateTime;
    /** The OdataType property */
    private String _odataType;
    /** The stage when the entity was changed. Possible values are: contentRetrieval, contentReview, generateReport, contentDeletion, caseResolved, unknownFutureValue. */
    private SubjectRightsRequestStage _stage;
    /** The status of the stage when the entity was changed. Possible values are: notStarted, current, completed, failed, unknownFutureValue. */
    private SubjectRightsRequestStageStatus _stageStatus;
    /** Type of history. */
    private String _type;
    /**
     * Instantiates a new subjectRightsRequestHistory and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SubjectRightsRequestHistory() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a subjectRightsRequestHistory
     */
    @javax.annotation.Nonnull
    public static SubjectRightsRequestHistory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubjectRightsRequestHistory();
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
     * Gets the changedBy property value. Identity of the user who changed the  subject rights request.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getChangedBy() {
        return this._changedBy;
    }
    /**
     * Gets the eventDateTime property value. Data and time when the entity was changed.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this._eventDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(6);
        deserializerMap.put("changedBy", (n) -> { this.setChangedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("eventDateTime", (n) -> { this.setEventDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("stage", (n) -> { this.setStage(n.getEnumValue(SubjectRightsRequestStage.class)); });
        deserializerMap.put("stageStatus", (n) -> { this.setStageStatus(n.getEnumValue(SubjectRightsRequestStageStatus.class)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the stage property value. The stage when the entity was changed. Possible values are: contentRetrieval, contentReview, generateReport, contentDeletion, caseResolved, unknownFutureValue.
     * @return a subjectRightsRequestStage
     */
    @javax.annotation.Nullable
    public SubjectRightsRequestStage getStage() {
        return this._stage;
    }
    /**
     * Gets the stageStatus property value. The status of the stage when the entity was changed. Possible values are: notStarted, current, completed, failed, unknownFutureValue.
     * @return a subjectRightsRequestStageStatus
     */
    @javax.annotation.Nullable
    public SubjectRightsRequestStageStatus getStageStatus() {
        return this._stageStatus;
    }
    /**
     * Gets the type property value. Type of history.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("changedBy", this.getChangedBy());
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("stage", this.getStage());
        writer.writeEnumValue("stageStatus", this.getStageStatus());
        writer.writeStringValue("type", this.getType());
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
     * Sets the changedBy property value. Identity of the user who changed the  subject rights request.
     * @param value Value to set for the changedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChangedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._changedBy = value;
    }
    /**
     * Sets the eventDateTime property value. Data and time when the entity was changed.
     * @param value Value to set for the eventDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._eventDateTime = value;
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
     * Sets the stage property value. The stage when the entity was changed. Possible values are: contentRetrieval, contentReview, generateReport, contentDeletion, caseResolved, unknownFutureValue.
     * @param value Value to set for the stage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStage(@javax.annotation.Nullable final SubjectRightsRequestStage value) {
        this._stage = value;
    }
    /**
     * Sets the stageStatus property value. The status of the stage when the entity was changed. Possible values are: notStarted, current, completed, failed, unknownFutureValue.
     * @param value Value to set for the stageStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStageStatus(@javax.annotation.Nullable final SubjectRightsRequestStageStatus value) {
        this._stageStatus = value;
    }
    /**
     * Sets the type property value. Type of history.
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
