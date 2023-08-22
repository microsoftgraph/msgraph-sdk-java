package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RubricLevel implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The description of this rubric level.
     */
    private EducationItemBody description;
    /**
     * The name of this rubric level.
     */
    private String displayName;
    /**
     * Null if this is a no-points rubric; educationAssignmentPointsGradeType if it is a points rubric.
     */
    private EducationAssignmentGradeType grading;
    /**
     * The ID of this resource.
     */
    private String levelId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new rubricLevel and sets the default values.
     */
    public RubricLevel() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a rubricLevel
     */
    @jakarta.annotation.Nonnull
    public static RubricLevel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RubricLevel();
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
     * Gets the description property value. The description of this rubric level.
     * @return a educationItemBody
     */
    @jakarta.annotation.Nullable
    public EducationItemBody getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The name of this rubric level.
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
        deserializerMap.put("description", (n) -> { this.setDescription(n.getObjectValue(EducationItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("grading", (n) -> { this.setGrading(n.getObjectValue(EducationAssignmentGradeType::createFromDiscriminatorValue)); });
        deserializerMap.put("levelId", (n) -> { this.setLevelId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the grading property value. Null if this is a no-points rubric; educationAssignmentPointsGradeType if it is a points rubric.
     * @return a educationAssignmentGradeType
     */
    @jakarta.annotation.Nullable
    public EducationAssignmentGradeType getGrading() {
        return this.grading;
    }
    /**
     * Gets the levelId property value. The ID of this resource.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLevelId() {
        return this.levelId;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("grading", this.getGrading());
        writer.writeStringValue("levelId", this.getLevelId());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the description property value. The description of this rubric level.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final EducationItemBody value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The name of this rubric level.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the grading property value. Null if this is a no-points rubric; educationAssignmentPointsGradeType if it is a points rubric.
     * @param value Value to set for the grading property.
     */
    public void setGrading(@jakarta.annotation.Nullable final EducationAssignmentGradeType value) {
        this.grading = value;
    }
    /**
     * Sets the levelId property value. The ID of this resource.
     * @param value Value to set for the levelId property.
     */
    public void setLevelId(@jakarta.annotation.Nullable final String value) {
        this.levelId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
