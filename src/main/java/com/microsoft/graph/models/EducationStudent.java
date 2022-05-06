package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationStudent implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Birth date of the student.  */
    private LocalDate _birthDate;
    /** ID of the student in the source system.  */
    private String _externalId;
    /** Possible values are: female, male, other.  */
    private EducationGender _gender;
    /** Current grade level of the student.  */
    private String _grade;
    /** Year the student is graduating from the school.  */
    private String _graduationYear;
    /** Student Number.  */
    private String _studentNumber;
    /**
     * Instantiates a new educationStudent and sets the default values.
     * @return a void
     */
    public EducationStudent() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationStudent
     */
    @javax.annotation.Nonnull
    public static EducationStudent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationStudent();
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
     * Gets the birthDate property value. Birth date of the student.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getBirthDate() {
        return this._birthDate;
    }
    /**
     * Gets the externalId property value. ID of the student in the source system.
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
        final EducationStudent currentObject = this;
        return new HashMap<>(6) {{
            this.put("birthDate", (n) -> { currentObject.setBirthDate(n.getLocalDateValue()); });
            this.put("externalId", (n) -> { currentObject.setExternalId(n.getStringValue()); });
            this.put("gender", (n) -> { currentObject.setGender(n.getEnumValue(EducationGender.class)); });
            this.put("grade", (n) -> { currentObject.setGrade(n.getStringValue()); });
            this.put("graduationYear", (n) -> { currentObject.setGraduationYear(n.getStringValue()); });
            this.put("studentNumber", (n) -> { currentObject.setStudentNumber(n.getStringValue()); });
        }};
    }
    /**
     * Gets the gender property value. Possible values are: female, male, other.
     * @return a educationGender
     */
    @javax.annotation.Nullable
    public EducationGender getGender() {
        return this._gender;
    }
    /**
     * Gets the grade property value. Current grade level of the student.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGrade() {
        return this._grade;
    }
    /**
     * Gets the graduationYear property value. Year the student is graduating from the school.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGraduationYear() {
        return this._graduationYear;
    }
    /**
     * Gets the studentNumber property value. Student Number.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStudentNumber() {
        return this._studentNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLocalDateValue("birthDate", this.getBirthDate());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeEnumValue("gender", this.getGender());
        writer.writeStringValue("grade", this.getGrade());
        writer.writeStringValue("graduationYear", this.getGraduationYear());
        writer.writeStringValue("studentNumber", this.getStudentNumber());
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
     * Sets the birthDate property value. Birth date of the student.
     * @param value Value to set for the birthDate property.
     * @return a void
     */
    public void setBirthDate(@javax.annotation.Nullable final LocalDate value) {
        this._birthDate = value;
    }
    /**
     * Sets the externalId property value. ID of the student in the source system.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this._externalId = value;
    }
    /**
     * Sets the gender property value. Possible values are: female, male, other.
     * @param value Value to set for the gender property.
     * @return a void
     */
    public void setGender(@javax.annotation.Nullable final EducationGender value) {
        this._gender = value;
    }
    /**
     * Sets the grade property value. Current grade level of the student.
     * @param value Value to set for the grade property.
     * @return a void
     */
    public void setGrade(@javax.annotation.Nullable final String value) {
        this._grade = value;
    }
    /**
     * Sets the graduationYear property value. Year the student is graduating from the school.
     * @param value Value to set for the graduationYear property.
     * @return a void
     */
    public void setGraduationYear(@javax.annotation.Nullable final String value) {
        this._graduationYear = value;
    }
    /**
     * Sets the studentNumber property value. Student Number.
     * @param value Value to set for the studentNumber property.
     * @return a void
     */
    public void setStudentNumber(@javax.annotation.Nullable final String value) {
        this._studentNumber = value;
    }
}
