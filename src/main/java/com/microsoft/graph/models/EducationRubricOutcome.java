package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationRubricOutcome extends EducationOutcome implements Parsable {
    /**
     * Instantiates a new EducationRubricOutcome and sets the default values.
     */
    public EducationRubricOutcome() {
        super();
        this.setOdataType("#microsoft.graph.educationRubricOutcome");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationRubricOutcome
     */
    @jakarta.annotation.Nonnull
    public static EducationRubricOutcome createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationRubricOutcome();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("publishedRubricQualityFeedback", (n) -> { this.setPublishedRubricQualityFeedback(n.getCollectionOfObjectValues(RubricQualityFeedbackModel::createFromDiscriminatorValue)); });
        deserializerMap.put("publishedRubricQualitySelectedLevels", (n) -> { this.setPublishedRubricQualitySelectedLevels(n.getCollectionOfObjectValues(RubricQualitySelectedColumnModel::createFromDiscriminatorValue)); });
        deserializerMap.put("rubricQualityFeedback", (n) -> { this.setRubricQualityFeedback(n.getCollectionOfObjectValues(RubricQualityFeedbackModel::createFromDiscriminatorValue)); });
        deserializerMap.put("rubricQualitySelectedLevels", (n) -> { this.setRubricQualitySelectedLevels(n.getCollectionOfObjectValues(RubricQualitySelectedColumnModel::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the publishedRubricQualityFeedback property value. A copy of the rubricQualityFeedback property that is made when the grade is released to the student.
     * @return a java.util.List<RubricQualityFeedbackModel>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RubricQualityFeedbackModel> getPublishedRubricQualityFeedback() {
        return this.BackingStore.get("publishedRubricQualityFeedback");
    }
    /**
     * Gets the publishedRubricQualitySelectedLevels property value. A copy of the rubricQualitySelectedLevels property that is made when the grade is released to the student.
     * @return a java.util.List<RubricQualitySelectedColumnModel>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RubricQualitySelectedColumnModel> getPublishedRubricQualitySelectedLevels() {
        return this.BackingStore.get("publishedRubricQualitySelectedLevels");
    }
    /**
     * Gets the rubricQualityFeedback property value. A collection of specific feedback for each quality of this rubric.
     * @return a java.util.List<RubricQualityFeedbackModel>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RubricQualityFeedbackModel> getRubricQualityFeedback() {
        return this.BackingStore.get("rubricQualityFeedback");
    }
    /**
     * Gets the rubricQualitySelectedLevels property value. The level that the teacher has selected for each quality while grading this assignment.
     * @return a java.util.List<RubricQualitySelectedColumnModel>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RubricQualitySelectedColumnModel> getRubricQualitySelectedLevels() {
        return this.BackingStore.get("rubricQualitySelectedLevels");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("publishedRubricQualityFeedback", this.getPublishedRubricQualityFeedback());
        writer.writeCollectionOfObjectValues("publishedRubricQualitySelectedLevels", this.getPublishedRubricQualitySelectedLevels());
        writer.writeCollectionOfObjectValues("rubricQualityFeedback", this.getRubricQualityFeedback());
        writer.writeCollectionOfObjectValues("rubricQualitySelectedLevels", this.getRubricQualitySelectedLevels());
    }
    /**
     * Sets the publishedRubricQualityFeedback property value. A copy of the rubricQualityFeedback property that is made when the grade is released to the student.
     * @param value Value to set for the publishedRubricQualityFeedback property.
     */
    public void setPublishedRubricQualityFeedback(@jakarta.annotation.Nullable final java.util.List<RubricQualityFeedbackModel> value) {
        this.BackingStore.set("publishedRubricQualityFeedback", value);
    }
    /**
     * Sets the publishedRubricQualitySelectedLevels property value. A copy of the rubricQualitySelectedLevels property that is made when the grade is released to the student.
     * @param value Value to set for the publishedRubricQualitySelectedLevels property.
     */
    public void setPublishedRubricQualitySelectedLevels(@jakarta.annotation.Nullable final java.util.List<RubricQualitySelectedColumnModel> value) {
        this.BackingStore.set("publishedRubricQualitySelectedLevels", value);
    }
    /**
     * Sets the rubricQualityFeedback property value. A collection of specific feedback for each quality of this rubric.
     * @param value Value to set for the rubricQualityFeedback property.
     */
    public void setRubricQualityFeedback(@jakarta.annotation.Nullable final java.util.List<RubricQualityFeedbackModel> value) {
        this.BackingStore.set("rubricQualityFeedback", value);
    }
    /**
     * Sets the rubricQualitySelectedLevels property value. The level that the teacher has selected for each quality while grading this assignment.
     * @param value Value to set for the rubricQualitySelectedLevels property.
     */
    public void setRubricQualitySelectedLevels(@jakarta.annotation.Nullable final java.util.List<RubricQualitySelectedColumnModel> value) {
        this.BackingStore.set("rubricQualitySelectedLevels", value);
    }
}
