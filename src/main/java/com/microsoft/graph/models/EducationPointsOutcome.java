package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationPointsOutcome extends EducationOutcome implements Parsable {
    /** The numeric grade the teacher has given the student for this assignment. */
    private EducationAssignmentPointsGrade _points;
    /** A copy of the points property that is made when the grade is released to the student. */
    private EducationAssignmentPointsGrade _publishedPoints;
    /**
     * Instantiates a new EducationPointsOutcome and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationPointsOutcome() {
        super();
        this.setOdataType("#microsoft.graph.educationPointsOutcome");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationPointsOutcome
     */
    @javax.annotation.Nonnull
    public static EducationPointsOutcome createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationPointsOutcome();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationPointsOutcome currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("points", (n) -> { currentObject.setPoints(n.getObjectValue(EducationAssignmentPointsGrade::createFromDiscriminatorValue)); });
        deserializerMap.put("publishedPoints", (n) -> { currentObject.setPublishedPoints(n.getObjectValue(EducationAssignmentPointsGrade::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the points property value. The numeric grade the teacher has given the student for this assignment.
     * @return a educationAssignmentPointsGrade
     */
    @javax.annotation.Nullable
    public EducationAssignmentPointsGrade getPoints() {
        return this._points;
    }
    /**
     * Gets the publishedPoints property value. A copy of the points property that is made when the grade is released to the student.
     * @return a educationAssignmentPointsGrade
     */
    @javax.annotation.Nullable
    public EducationAssignmentPointsGrade getPublishedPoints() {
        return this._publishedPoints;
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
        writer.writeObjectValue("points", this.getPoints());
        writer.writeObjectValue("publishedPoints", this.getPublishedPoints());
    }
    /**
     * Sets the points property value. The numeric grade the teacher has given the student for this assignment.
     * @param value Value to set for the points property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPoints(@javax.annotation.Nullable final EducationAssignmentPointsGrade value) {
        this._points = value;
    }
    /**
     * Sets the publishedPoints property value. A copy of the points property that is made when the grade is released to the student.
     * @param value Value to set for the publishedPoints property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublishedPoints(@javax.annotation.Nullable final EducationAssignmentPointsGrade value) {
        this._publishedPoints = value;
    }
}
