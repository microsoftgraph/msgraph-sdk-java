package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationStudent implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new EducationStudent and sets the default values.
     */
    public EducationStudent() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationStudent
     */
    @jakarta.annotation.Nonnull
    public static EducationStudent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationStudent();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the birthDate property value. Birth date of the student.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getBirthDate() {
        return this.getBackingStore().get("birthDate");
    }
    /**
     * Gets the externalId property value. ID of the student in the source system.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.getBackingStore().get("externalId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a EducationGender
     */
    @jakarta.annotation.Nullable
    public EducationGender getGender() {
        return this.getBackingStore().get("gender");
    }
    /**
     * Gets the grade property value. Current grade level of the student.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGrade() {
        return this.getBackingStore().get("grade");
    }
    /**
     * Gets the graduationYear property value. Year the student is graduating from the school.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGraduationYear() {
        return this.getBackingStore().get("graduationYear");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the studentNumber property value. Student Number.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStudentNumber() {
        return this.getBackingStore().get("studentNumber");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLocalDateValue("birthDate", this.getBirthDate());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeEnumValue("gender", this.getGender());
        writer.writeStringValue("grade", this.getGrade());
        writer.writeStringValue("graduationYear", this.getGraduationYear());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("studentNumber", this.getStudentNumber());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the birthDate property value. Birth date of the student.
     * @param value Value to set for the birthDate property.
     */
    public void setBirthDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.getBackingStore().set("birthDate", value);
    }
    /**
     * Sets the externalId property value. ID of the student in the source system.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("externalId", value);
    }
    /**
     * Sets the gender property value. The possible values are: female, male, other, unknownFutureValue.
     * @param value Value to set for the gender property.
     */
    public void setGender(@jakarta.annotation.Nullable final EducationGender value) {
        this.getBackingStore().set("gender", value);
    }
    /**
     * Sets the grade property value. Current grade level of the student.
     * @param value Value to set for the grade property.
     */
    public void setGrade(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("grade", value);
    }
    /**
     * Sets the graduationYear property value. Year the student is graduating from the school.
     * @param value Value to set for the graduationYear property.
     */
    public void setGraduationYear(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("graduationYear", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the studentNumber property value. Student Number.
     * @param value Value to set for the studentNumber property.
     */
    public void setStudentNumber(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("studentNumber", value);
    }
}
