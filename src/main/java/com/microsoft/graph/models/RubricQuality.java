package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RubricQuality implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The collection of criteria for this rubric quality.
     */
    private java.util.List<RubricCriterion> criteria;
    /**
     * The description of this rubric quality.
     */
    private EducationItemBody description;
    /**
     * The name of this rubric quality.
     */
    private String displayName;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The ID of this resource.
     */
    private String qualityId;
    /**
     * If present, a numerical weight for this quality.  Weights must add up to 100.
     */
    private Float weight;
    /**
     * Instantiates a new rubricQuality and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public RubricQuality() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a rubricQuality
     */
    @jakarta.annotation.Nonnull
    public static RubricQuality createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RubricQuality();
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
     * Gets the criteria property value. The collection of criteria for this rubric quality.
     * @return a rubricCriterion
     */
    @jakarta.annotation.Nullable
    public java.util.List<RubricCriterion> getCriteria() {
        return this.criteria;
    }
    /**
     * Gets the description property value. The description of this rubric quality.
     * @return a educationItemBody
     */
    @jakarta.annotation.Nullable
    public EducationItemBody getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The name of this rubric quality.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("criteria", (n) -> { this.setCriteria(n.getCollectionOfObjectValues(RubricCriterion::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getObjectValue(EducationItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("qualityId", (n) -> { this.setQualityId(n.getStringValue()); });
        deserializerMap.put("weight", (n) -> { this.setWeight(n.getFloatValue()); });
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
     * Gets the qualityId property value. The ID of this resource.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getQualityId() {
        return this.qualityId;
    }
    /**
     * Gets the weight property value. If present, a numerical weight for this quality.  Weights must add up to 100.
     * @return a float
     */
    @jakarta.annotation.Nullable
    public Float getWeight() {
        return this.weight;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("criteria", this.getCriteria());
        writer.writeObjectValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("qualityId", this.getQualityId());
        writer.writeFloatValue("weight", this.getWeight());
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
     * Sets the criteria property value. The collection of criteria for this rubric quality.
     * @param value Value to set for the criteria property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCriteria(@jakarta.annotation.Nullable final java.util.List<RubricCriterion> value) {
        this.criteria = value;
    }
    /**
     * Sets the description property value. The description of this rubric quality.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final EducationItemBody value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The name of this rubric quality.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
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
     * Sets the qualityId property value. The ID of this resource.
     * @param value Value to set for the qualityId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setQualityId(@jakarta.annotation.Nullable final String value) {
        this.qualityId = value;
    }
    /**
     * Sets the weight property value. If present, a numerical weight for this quality.  Weights must add up to 100.
     * @param value Value to set for the weight property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWeight(@jakarta.annotation.Nullable final Float value) {
        this.weight = value;
    }
}
