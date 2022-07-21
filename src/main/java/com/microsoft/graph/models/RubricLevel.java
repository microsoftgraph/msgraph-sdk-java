package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RubricLevel implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The description of this rubric level. */
    private EducationItemBody _description;
    /** The name of this rubric level. */
    private String _displayName;
    /** Null if this is a no-points rubric; educationAssignmentPointsGradeType if it is a points rubric. */
    private EducationAssignmentGradeType _grading;
    /** The ID of this resource. */
    private String _levelId;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new rubricLevel and sets the default values.
     * @return a void
     */
    public RubricLevel() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.rubricLevel");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a rubricLevel
     */
    @javax.annotation.Nonnull
    public static RubricLevel createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RubricLevel();
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
     * Gets the description property value. The description of this rubric level.
     * @return a educationItemBody
     */
    @javax.annotation.Nullable
    public EducationItemBody getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The name of this rubric level.
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
        final RubricLevel currentObject = this;
        return new HashMap<>(5) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getObjectValue(EducationItemBody::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("grading", (n) -> { currentObject.setGrading(n.getObjectValue(EducationAssignmentGradeType::createFromDiscriminatorValue)); });
            this.put("levelId", (n) -> { currentObject.setLevelId(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the grading property value. Null if this is a no-points rubric; educationAssignmentPointsGradeType if it is a points rubric.
     * @return a educationAssignmentGradeType
     */
    @javax.annotation.Nullable
    public EducationAssignmentGradeType getGrading() {
        return this._grading;
    }
    /**
     * Gets the levelId property value. The ID of this resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLevelId() {
        return this._levelId;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the description property value. The description of this rubric level.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final EducationItemBody value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The name of this rubric level.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the grading property value. Null if this is a no-points rubric; educationAssignmentPointsGradeType if it is a points rubric.
     * @param value Value to set for the grading property.
     * @return a void
     */
    public void setGrading(@javax.annotation.Nullable final EducationAssignmentGradeType value) {
        this._grading = value;
    }
    /**
     * Sets the levelId property value. The ID of this resource.
     * @param value Value to set for the levelId property.
     * @return a void
     */
    public void setLevelId(@javax.annotation.Nullable final String value) {
        this._levelId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
