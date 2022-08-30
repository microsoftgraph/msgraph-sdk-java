package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RubricQuality implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The collection of criteria for this rubric quality. */
    private java.util.List<RubricCriterion> _criteria;
    /** The description of this rubric quality. */
    private EducationItemBody _description;
    /** The name of this rubric quality. */
    private String _displayName;
    /** The OdataType property */
    private String _odataType;
    /** The ID of this resource. */
    private String _qualityId;
    /** If present, a numerical weight for this quality.  Weights must add up to 100. */
    private Float _weight;
    /**
     * Instantiates a new rubricQuality and sets the default values.
     * @return a void
     */
    public RubricQuality() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.rubricQuality");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a rubricQuality
     */
    @javax.annotation.Nonnull
    public static RubricQuality createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RubricQuality();
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
     * Gets the criteria property value. The collection of criteria for this rubric quality.
     * @return a rubricCriterion
     */
    @javax.annotation.Nullable
    public java.util.List<RubricCriterion> getCriteria() {
        return this._criteria;
    }
    /**
     * Gets the description property value. The description of this rubric quality.
     * @return a educationItemBody
     */
    @javax.annotation.Nullable
    public EducationItemBody getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The name of this rubric quality.
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
        final RubricQuality currentObject = this;
        return new HashMap<>(6) {{
            this.put("criteria", (n) -> { currentObject.setCriteria(n.getCollectionOfObjectValues(RubricCriterion::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getObjectValue(EducationItemBody::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("qualityId", (n) -> { currentObject.setQualityId(n.getStringValue()); });
            this.put("weight", (n) -> { currentObject.setWeight(n.getFloatValue()); });
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
     * Gets the qualityId property value. The ID of this resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQualityId() {
        return this._qualityId;
    }
    /**
     * Gets the weight property value. If present, a numerical weight for this quality.  Weights must add up to 100.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getWeight() {
        return this._weight;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the criteria property value. The collection of criteria for this rubric quality.
     * @param value Value to set for the criteria property.
     * @return a void
     */
    public void setCriteria(@javax.annotation.Nullable final java.util.List<RubricCriterion> value) {
        this._criteria = value;
    }
    /**
     * Sets the description property value. The description of this rubric quality.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final EducationItemBody value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The name of this rubric quality.
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
     * Sets the qualityId property value. The ID of this resource.
     * @param value Value to set for the qualityId property.
     * @return a void
     */
    public void setQualityId(@javax.annotation.Nullable final String value) {
        this._qualityId = value;
    }
    /**
     * Sets the weight property value. If present, a numerical weight for this quality.  Weights must add up to 100.
     * @param value Value to set for the weight property.
     * @return a void
     */
    public void setWeight(@javax.annotation.Nullable final Float value) {
        this._weight = value;
    }
}
