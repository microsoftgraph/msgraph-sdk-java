package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationTeacher implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Id of the Teacher in external source system.  */
    private String _externalId;
    /** Teacher number.  */
    private String _teacherNumber;
    /**
     * Instantiates a new educationTeacher and sets the default values.
     * @return a void
     */
    public EducationTeacher() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationTeacher
     */
    @javax.annotation.Nonnull
    public static EducationTeacher createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationTeacher();
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
     * Gets the externalId property value. Id of the Teacher in external source system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this._externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationTeacher currentObject = this;
        return new HashMap<>(2) {{
            this.put("externalId", (n) -> { currentObject.setExternalId(n.getStringValue()); });
            this.put("teacherNumber", (n) -> { currentObject.setTeacherNumber(n.getStringValue()); });
        }};
    }
    /**
     * Gets the teacherNumber property value. Teacher number.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeacherNumber() {
        return this._teacherNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeStringValue("teacherNumber", this.getTeacherNumber());
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
     * Sets the externalId property value. Id of the Teacher in external source system.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this._externalId = value;
    }
    /**
     * Sets the teacherNumber property value. Teacher number.
     * @param value Value to set for the teacherNumber property.
     * @return a void
     */
    public void setTeacherNumber(@javax.annotation.Nullable final String value) {
        this._teacherNumber = value;
    }
}
