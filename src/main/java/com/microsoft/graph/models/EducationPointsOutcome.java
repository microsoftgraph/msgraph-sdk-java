package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationPointsOutcome extends EducationOutcome implements Parsable {
    /**
     * The numeric grade the teacher has given the student for this assignment.
     */
    private EducationAssignmentPointsGrade points;
    /**
     * A copy of the points property that is made when the grade is released to the student.
     */
    private EducationAssignmentPointsGrade publishedPoints;
    /**
     * Instantiates a new educationPointsOutcome and sets the default values.
     */
    public EducationPointsOutcome() {
        super();
        this.setOdataType("#microsoft.graph.educationPointsOutcome");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationPointsOutcome
     */
    @jakarta.annotation.Nonnull
    public static EducationPointsOutcome createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationPointsOutcome();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("points", (n) -> { this.setPoints(n.getObjectValue(EducationAssignmentPointsGrade::createFromDiscriminatorValue)); });
        deserializerMap.put("publishedPoints", (n) -> { this.setPublishedPoints(n.getObjectValue(EducationAssignmentPointsGrade::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the points property value. The numeric grade the teacher has given the student for this assignment.
     * @return a educationAssignmentPointsGrade
     */
    @jakarta.annotation.Nullable
    public EducationAssignmentPointsGrade getPoints() {
        return this.points;
    }
    /**
     * Gets the publishedPoints property value. A copy of the points property that is made when the grade is released to the student.
     * @return a educationAssignmentPointsGrade
     */
    @jakarta.annotation.Nullable
    public EducationAssignmentPointsGrade getPublishedPoints() {
        return this.publishedPoints;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("points", this.getPoints());
        writer.writeObjectValue("publishedPoints", this.getPublishedPoints());
    }
    /**
     * Sets the points property value. The numeric grade the teacher has given the student for this assignment.
     * @param value Value to set for the points property.
     */
    public void setPoints(@jakarta.annotation.Nullable final EducationAssignmentPointsGrade value) {
        this.points = value;
    }
    /**
     * Sets the publishedPoints property value. A copy of the points property that is made when the grade is released to the student.
     * @param value Value to set for the publishedPoints property.
     */
    public void setPublishedPoints(@jakarta.annotation.Nullable final EducationAssignmentPointsGrade value) {
        this.publishedPoints = value;
    }
}
