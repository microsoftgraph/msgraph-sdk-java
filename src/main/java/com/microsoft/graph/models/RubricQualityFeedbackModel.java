package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RubricQualityFeedbackModel implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Specific feedback for one quality of this rubric.
     */
    private EducationItemBody feedback;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The ID of the rubricQuality that this feedback is related to.
     */
    private String qualityId;
    /**
     * Instantiates a new rubricQualityFeedbackModel and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public RubricQualityFeedbackModel() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a rubricQualityFeedbackModel
     */
    @jakarta.annotation.Nonnull
    public static RubricQualityFeedbackModel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RubricQualityFeedbackModel();
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
     * Gets the feedback property value. Specific feedback for one quality of this rubric.
     * @return a educationItemBody
     */
    @jakarta.annotation.Nullable
    public EducationItemBody getFeedback() {
        return this.feedback;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("feedback", (n) -> { this.setFeedback(n.getObjectValue(EducationItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("qualityId", (n) -> { this.setQualityId(n.getStringValue()); });
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
     * Gets the qualityId property value. The ID of the rubricQuality that this feedback is related to.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getQualityId() {
        return this.qualityId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("feedback", this.getFeedback());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("qualityId", this.getQualityId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the feedback property value. Specific feedback for one quality of this rubric.
     * @param value Value to set for the feedback property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFeedback(@jakarta.annotation.Nullable final EducationItemBody value) {
        this.feedback = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the qualityId property value. The ID of the rubricQuality that this feedback is related to.
     * @param value Value to set for the qualityId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setQualityId(@jakarta.annotation.Nullable final String value) {
        this.qualityId = value;
    }
}
