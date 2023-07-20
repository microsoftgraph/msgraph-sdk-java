package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationStudent implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Birth date of the student.
     */
    private LocalDate birthDate;
    /**
     * ID of the student in the source system.
     */
    private String externalId;
    /**
     * The possible values are: female, male, other, unknownFutureValue.
     */
    private EducationGender gender;
    /**
     * Current grade level of the student.
     */
    private String grade;
    /**
     * Year the student is graduating from the school.
     */
    private String graduationYear;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Student Number.
     */
    private String studentNumber;
    /**
     * Instantiates a new educationStudent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.additionalData;
    }
    /**
     * Gets the birthDate property value. Birth date of the student.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getBirthDate() {
        return this.birthDate;
    }
    /**
     * Gets the externalId property value. ID of the student in the source system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("birthDate", (n) -> { this.setBirthDate(n.getLocalDateValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("gender", (n) -> { this.setGender(n.getEnumValue(EducationGender.class)); });
        deserializerMap.put("grade", (n) -> { this.setGrade(n.getStringValue()); });
        deserializerMap.put("graduationYear", (n) -> { this.setGraduationYear(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("studentNumber", (n) -> { this.setStudentNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gender property value. The possible values are: female, male, other, unknownFutureValue.
     * @return a educationGender
     */
    @javax.annotation.Nullable
    public EducationGender getGender() {
        return this.gender;
    }
    /**
     * Gets the grade property value. Current grade level of the student.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGrade() {
        return this.grade;
    }
    /**
     * Gets the graduationYear property value. Year the student is graduating from the school.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGraduationYear() {
        return this.graduationYear;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the studentNumber property value. Student Number.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStudentNumber() {
        return this.studentNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLocalDateValue("birthDate", this.getBirthDate());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeEnumValue("gender", this.getGender());
        writer.writeStringValue("grade", this.getGrade());
        writer.writeStringValue("graduationYear", this.getGraduationYear());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("studentNumber", this.getStudentNumber());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the birthDate property value. Birth date of the student.
     * @param value Value to set for the birthDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBirthDate(@javax.annotation.Nullable final LocalDate value) {
        this.birthDate = value;
    }
    /**
     * Sets the externalId property value. ID of the student in the source system.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the gender property value. The possible values are: female, male, other, unknownFutureValue.
     * @param value Value to set for the gender property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGender(@javax.annotation.Nullable final EducationGender value) {
        this.gender = value;
    }
    /**
     * Sets the grade property value. Current grade level of the student.
     * @param value Value to set for the grade property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGrade(@javax.annotation.Nullable final String value) {
        this.grade = value;
    }
    /**
     * Sets the graduationYear property value. Year the student is graduating from the school.
     * @param value Value to set for the graduationYear property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGraduationYear(@javax.annotation.Nullable final String value) {
        this.graduationYear = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the studentNumber property value. Student Number.
     * @param value Value to set for the studentNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStudentNumber(@javax.annotation.Nullable final String value) {
        this.studentNumber = value;
    }
}
