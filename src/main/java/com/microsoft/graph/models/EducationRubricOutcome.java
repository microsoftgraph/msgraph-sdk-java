package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationRubricOutcome extends EducationOutcome implements Parsable {
    /** A copy of the rubricQualityFeedback property that is made when the grade is released to the student. */
    private java.util.List<RubricQualityFeedbackModel> _publishedRubricQualityFeedback;
    /** A copy of the rubricQualitySelectedLevels property that is made when the grade is released to the student. */
    private java.util.List<RubricQualitySelectedColumnModel> _publishedRubricQualitySelectedLevels;
    /** A collection of specific feedback for each quality of this rubric. */
    private java.util.List<RubricQualityFeedbackModel> _rubricQualityFeedback;
    /** The level that the teacher has selected for each quality while grading this assignment. */
    private java.util.List<RubricQualitySelectedColumnModel> _rubricQualitySelectedLevels;
    /**
     * Instantiates a new EducationRubricOutcome and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationRubricOutcome() {
        super();
        this.setOdataType("#microsoft.graph.educationRubricOutcome");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationRubricOutcome
     */
    @javax.annotation.Nonnull
    public static EducationRubricOutcome createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationRubricOutcome();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("publishedRubricQualityFeedback", (n) -> { this.setPublishedRubricQualityFeedback(n.getCollectionOfObjectValues(RubricQualityFeedbackModel::createFromDiscriminatorValue)); });
        deserializerMap.put("publishedRubricQualitySelectedLevels", (n) -> { this.setPublishedRubricQualitySelectedLevels(n.getCollectionOfObjectValues(RubricQualitySelectedColumnModel::createFromDiscriminatorValue)); });
        deserializerMap.put("rubricQualityFeedback", (n) -> { this.setRubricQualityFeedback(n.getCollectionOfObjectValues(RubricQualityFeedbackModel::createFromDiscriminatorValue)); });
        deserializerMap.put("rubricQualitySelectedLevels", (n) -> { this.setRubricQualitySelectedLevels(n.getCollectionOfObjectValues(RubricQualitySelectedColumnModel::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the publishedRubricQualityFeedback property value. A copy of the rubricQualityFeedback property that is made when the grade is released to the student.
     * @return a rubricQualityFeedbackModel
     */
    @javax.annotation.Nullable
    public java.util.List<RubricQualityFeedbackModel> getPublishedRubricQualityFeedback() {
        return this._publishedRubricQualityFeedback;
    }
    /**
     * Gets the publishedRubricQualitySelectedLevels property value. A copy of the rubricQualitySelectedLevels property that is made when the grade is released to the student.
     * @return a rubricQualitySelectedColumnModel
     */
    @javax.annotation.Nullable
    public java.util.List<RubricQualitySelectedColumnModel> getPublishedRubricQualitySelectedLevels() {
        return this._publishedRubricQualitySelectedLevels;
    }
    /**
     * Gets the rubricQualityFeedback property value. A collection of specific feedback for each quality of this rubric.
     * @return a rubricQualityFeedbackModel
     */
    @javax.annotation.Nullable
    public java.util.List<RubricQualityFeedbackModel> getRubricQualityFeedback() {
        return this._rubricQualityFeedback;
    }
    /**
     * Gets the rubricQualitySelectedLevels property value. The level that the teacher has selected for each quality while grading this assignment.
     * @return a rubricQualitySelectedColumnModel
     */
    @javax.annotation.Nullable
    public java.util.List<RubricQualitySelectedColumnModel> getRubricQualitySelectedLevels() {
        return this._rubricQualitySelectedLevels;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublishedRubricQualityFeedback(@javax.annotation.Nullable final java.util.List<RubricQualityFeedbackModel> value) {
        this._publishedRubricQualityFeedback = value;
    }
    /**
     * Sets the publishedRubricQualitySelectedLevels property value. A copy of the rubricQualitySelectedLevels property that is made when the grade is released to the student.
     * @param value Value to set for the publishedRubricQualitySelectedLevels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublishedRubricQualitySelectedLevels(@javax.annotation.Nullable final java.util.List<RubricQualitySelectedColumnModel> value) {
        this._publishedRubricQualitySelectedLevels = value;
    }
    /**
     * Sets the rubricQualityFeedback property value. A collection of specific feedback for each quality of this rubric.
     * @param value Value to set for the rubricQualityFeedback property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRubricQualityFeedback(@javax.annotation.Nullable final java.util.List<RubricQualityFeedbackModel> value) {
        this._rubricQualityFeedback = value;
    }
    /**
     * Sets the rubricQualitySelectedLevels property value. The level that the teacher has selected for each quality while grading this assignment.
     * @param value Value to set for the rubricQualitySelectedLevels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRubricQualitySelectedLevels(@javax.annotation.Nullable final java.util.List<RubricQualitySelectedColumnModel> value) {
        this._rubricQualitySelectedLevels = value;
    }
}
