package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RubricQualityFeedbackModel implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Specific feedback for one quality of this rubric. */
    private EducationItemBody _feedback;
    /** The OdataType property */
    private String _odataType;
    /** The ID of the rubricQuality that this feedback is related to. */
    private String _qualityId;
    /**
     * Instantiates a new rubricQualityFeedbackModel and sets the default values.
     * @return a void
     */
    public RubricQualityFeedbackModel() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.rubricQualityFeedbackModel");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a rubricQualityFeedbackModel
     */
    @javax.annotation.Nonnull
    public static RubricQualityFeedbackModel createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RubricQualityFeedbackModel();
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
     * Gets the feedback property value. Specific feedback for one quality of this rubric.
     * @return a educationItemBody
     */
    @javax.annotation.Nullable
    public EducationItemBody getFeedback() {
        return this._feedback;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RubricQualityFeedbackModel currentObject = this;
        return new HashMap<>(3) {{
            this.put("feedback", (n) -> { currentObject.setFeedback(n.getObjectValue(EducationItemBody::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("qualityId", (n) -> { currentObject.setQualityId(n.getStringValue()); });
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
     * Gets the qualityId property value. The ID of the rubricQuality that this feedback is related to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQualityId() {
        return this._qualityId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("feedback", this.getFeedback());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("qualityId", this.getQualityId());
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
     * Sets the feedback property value. Specific feedback for one quality of this rubric.
     * @param value Value to set for the feedback property.
     * @return a void
     */
    public void setFeedback(@javax.annotation.Nullable final EducationItemBody value) {
        this._feedback = value;
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
     * Sets the qualityId property value. The ID of the rubricQuality that this feedback is related to.
     * @param value Value to set for the qualityId property.
     * @return a void
     */
    public void setQualityId(@javax.annotation.Nullable final String value) {
        this._qualityId = value;
    }
}
